 /**
 *
 * This is a dijit that present a dialog to select a file/page/link within the dotCMS, it renders a mini browser that lets the user navigate
 * through dotCMS tree to search and pick files, pages or links within the system.
 *
 * To include the dijit into your page
 *
 * JS Side
 *
 * <script type="text/javascript">
 * 	dojo.require("dotcms.dijit.FileBrowserDialog");
 *
 * ...
 *
 * </script>
 *
 * HTML side
 *
 * <div id="myDijitId" jsId="myJSVariable" style="cssStyleOptions"
 * 	currentView="details" title="My title" onlyFiles="false"
 * 	mimeTypes="image" fileExtenstions="jpg" onFileSelected="alert(file.fileName)" dojoType="dotcms.dijit.FileBrowserDialog"></div>
 *
 * How to show the dialog
 *
 * <script type="text/javascript">
 * 	myJSVariable.show();
 * </script>
 *
 * To show the dialog
 *
 * Properties
 *
 * id: non-required - this is the id of the widget if not specified then it will be autogenerated.
 *
 * jsId: non-required - if specified then dijit will be registered in the JS global environment with this name.
 *
 * currentView: non-required - default details - The widget has three different views details, list, thumbnails.
 *
 * title: non-required - Title of the dialog.
 *
 * onlyFiles: non-required - default false - If true only shows files and filters out pages and links.
 *
 * mimeTypes: non-required - A comma separated list of mime types to filter for, mime types specified not need to match the whole name,
 * 		I.E. if "image" is specified as mime type it will match files with mime types like "image/jpeg" or "image/png".
 *
 * fileExtenstions: non-required - A comma separated list of file extensions to filter for. E.G. "jpg,png,gif".
 *
 * onFileSelected: non-required - JS script or JS function callback to be executed when the user selects a file within the browser, the file object is passed
 * 	to the function.
 *
 * allowFileUpload: non-required - true by default - if it is true then it will let the user upload a file while looking a folder.
 *
 *
 */

dojo.provide("dotcms.dijit.FileBrowserDialog");

dojo.require("dijit._Widget");
dojo.require("dijit._Templated");
dojo.require("dojo.data.ItemFileReadStore")
dojo.require("dijit.tree.TreeStoreModel")
dojo.require("dijit.Tree")
dojo.require("dijit.Dialog")
dojo.require("dotcms.dijit.tree.HostFolderTreeReadStoreModel")

dojo.declare("dotcms.dijit.FileBrowserDialog", [dijit._Widget, dijit._Templated], {

	templatePath: dojo.moduleUrl("dotcms", "dijit/FileBrowserDialog.jsp"),
	detailsRowTemplate: '<td id="file-{id}"><a class="selectableFile"><img src="{icon}">{name}</a></td><td>{description}</td><td>{modUser}</td><td>{modDate}</td>',
	listRowTemplate: '<td id="file-{id}"><a class="selectableFile"><img src="{icon}">{name}</a></td>',
	thumbRowTemplate: '<td id="file-{id}"><a class="selectableFile"><img width="100" height="100" src="{thumbnail}"><br/>{name}</a></td>',
	widgetsInTemplate: true,
	style: "width: 1000px; height: 500px;",
	currentView: 'details',
	title: '<%= LanguageUtil.get(pageContext, "Select-a-file")%>',
	onlyFiles: false,
	mimeTypes: new Array(),
	fileExtensions: new Array(),
	_initialized: false,
	addFileTitle: 'Upload a file',
	allowFileUpload: true,
	sortBy: "modDate",
	sortByDesc: true,
	_browserFolderTree: null,

	postCreate: function () {

		dojo.connect(this.listViewIcon, 'click', dojo.hitch(this, this._changeView, 'list'));
		dojo.connect(this.detailViewIcon, 'click', dojo.hitch(this, this._changeView, 'details'));
		dojo.connect(this.thumbnailViewIcon, 'click', dojo.hitch(this, this._changeView, 'thumbnails'));

	},

	initializeTree: function() {



	    var treeStore = new dotcms.dijit.tree.HostFolderTreeReadStoreModel();

	   	this.tree = new dijit.Tree({

			id: this.id + "-tree",

	        model: treeStore,

	        persist: false,

	        showRoot: false,

			getIconClass: (function (item, opened) {
				if(item.type == 'host') {
					dojo.connect(item, 'onClick', this, this._getRootFiles);
					if(opened) return "dijitHostOpened";
					else return "dijitHostClosed";
				} else {
					if(opened) return "dijitFolderOpened";
					else return "dijitFolderClosed";
				}
			}).bind(this),

			_createTreeNode: function (args) {
				args.id = this.id + "-treeNode-" + args.item.id;
				return new dijit._TreeNode(args);
			}

	    }, this.foldersTree);
		dojo.connect(this.tree, 'onClick', this, this._selectFolder);


		this._initialized = true;
		this._browserFolderTree = this.tree;
		BrowserAjax.getSelectedBrowserPath(dojo.hitch(this, this._getSelectedBrowserPathCallback));
		
	},
	
	_getSelectedBrowserPathCallback: function (data) {
		if(data["path"].length > 1){
			this._browserFolderTree.set("path",data["path"]);
			if(data["currentFolder"] != null)
				this._selectFolder(data["currentFolder"]);
			
			setTimeout(this._highlightNode, 2000, this._browserFolderTree, data["path"][(data["path"].length-1)]);
		}
	},
	
	_highlightNode: function (browserTree,folderNodeId){
		browserTree.set("selectedItem",folderNodeId);
		var nodes = browserTree.getNodesByItem(folderNodeId);
		if(!nodes[0].isExpanded){
			browserTree._expandNode(nodes[0]);
			var tempId = browserTree.id + '-treeNode-' + folderNodeId;
			document.getElementById(tempId).style.backgroundColor="#E5EDF0";
		}
	},

	show: function () {
		if(!dojo.isArray(this.mimeTypes)) {
			this.mimeTypes = (this.mimeTypes + "").split(',');
		}

		if(!dojo.isArray(this.fileExtensions)) {
			this.fileExtensions = (this.fileExtensions + "").split(',');
		}

		if(!this._initialized) {

			this.initializeTree();
		}

		this.dialog.show();
	},

	uninitialize : function (event) {
	},

	/**
	 * Stub method that you can use dojo.connect to catch every time a user selects a file
	 * @param {Object} file
	 */
	onFileSelected: function (file) {

	},


	_norm: function (value) {
		return dojo.isArray(value)?value[0]:value;
	},

	_changeView: function(newView) {
		this.currentView = newView;
		if(this.currentFolder)
			this._selectFolder (this.currentFolder);
	},

	_currentFolder: '',
	_currentOffset: 0,
	_maxNumberOfAssets: 24,
	_totalResults: 0,
	_currentFilter: '',

	_getRootFiles: function(hostId){
		this.currentFolder= hostId;
		this._loadFolder();
    },

	_selectFolder: function(item) {

		this.currentFolder = item;
		this._currentOffset = 0;

		if(item.type == 'folder' && this.allowFileUpload)
			dojo.style(this.uploadFileButton, { display: '' });
		else
			dojo.style(this.uploadFileButton, { display: 'none' });

		this._loadFolder();
	},

	_filterHandle: null,

	_filter: function () {
		this._currentFilter = this.filterTextBox.attr('value');
		clearTimeout(this._filterHandle);
		this._filterHandle = setTimeout(dojo.hitch(this, this._filterDelayed), 100);
	},

	_filterDelayed: function () {
		this._loadFolder();
	},

	_clearFilter: function () {
		this.filterTextBox.attr('value', '')
		this._currentFilter = '';
		this._loadFolder();
	},

	_loadFolder: function() {

		this._hide(this.noContent);
		this._hide(this.noResults);
		this._show(this.loadingContentWrapper);
		this._hide(this.tablesWrapper);
		this._hide(this.detailsTable);
		this._hide(this.tablesSummary);
		this._hide(this.listTable);
		this._hide(this.thumbnailsTable);
		this._removeRows(this.detailsTableBody);
		this._removeRows(this.listTableBody);
		this._removeRows(this.thumbnailsTableBody);

		BrowserAjax.getFolderContent(this._norm(this.currentFolder.id), this._currentOffset, this._maxNumberOfAssets, this._currentFilter, this.mimeTypes,
			this.fileExtensions, false, true, this.onlyFiles, this.sortBy, this.sortByDesc, true, dojo.hitch(this, this._selectFolderCallback));

	},

	_selectFolderCallback: function(assetsInfo) {

		var assets = assetsInfo.list;
		this._totalResults = assetsInfo.total;

		switch (this.currentView) {
			case 'details':
				var table = this.detailsTable;
				var tableBody = this.detailsTableBody;
				break;
			case 'list':
				var table = this.listTable;
				var tableBody = this.listTableBody;
				break;
			case 'thumbnails':
				var table = this.thumbnailsTable;
				var tableBody = this.thumbnailsTableBody;
				break;
		}

		var className = 'alternate_1';
		var template = this.currentView == 'details'?this.detailsRowTemplate:this.currentView == 'list'?this.listRowTemplate:this.thumbRowTemplate;

		var columnNumber = 0;
		var tableHTML = '';
		for (var i = 0; i < assets.length; i++){
			var asset = assets[i];
			this._normalizeAssetData(asset);

			var rowHTML = dojo.replace(template, { id: asset.identifier, name: asset.name, description: asset.friendlyName,
					modUser: asset.modUserName, modDate: asset.modDateFormatted, className: className, icon: asset.icon, thumbnail: asset.thumbnail, title: asset.title });

			if(columnNumber == 0) {
				if(this.currentView == 'details')
					rowHTML = 	'<tr class="' + className + '">' + rowHTML;
				else
					rowHTML = 	'<tr>' + rowHTML;
			}

			switch (this.currentView) {
				case 'details':
					break;
				case 'list':
					columnNumber++;
					columnNumber = columnNumber == 3 ? 0 : columnNumber;
					break;
				case 'thumbnails':
					columnNumber++;
					columnNumber = columnNumber == 3 ? 0 : columnNumber;
					break;
			}
			if(columnNumber == 0)
				rowHTML += 	"</tr>";
			className = className == 'alternate_1'?'alternate_2':'alternate_1';
			tableHTML += rowHTML;

		};
		var selected =  function(scope,asset) {
			scope._assetSelected(asset);

		};
		if(tableHTML != '')
			dojo.place(tableHTML, tableBody, 'last');
		for (var i = 0; i < assets.length; i++) {
			var asset = assets[i];
			var file = dojo.byId('file-' + asset.identifier);
			file.id+=i;
			var elements = file.getElementsByTagName("a");
			var anchor = elements[0];
			if(anchor.onclick==undefined){
			   anchor.onclick = dojo.hitch(this, selected, this, asset);
			}
		}

		this._hide(this.loadingContentWrapper);

		var dimensions = dojo.coords(this.tablesContentPane.domNode);
		// resultsSummary


		var startFileIndex = this._totalResults == 0?0:this._currentOffset + 1;
		var ceil = this._currentOffset + this._maxNumberOfAssets > this._totalResults?this._totalResults:this._currentOffset + this._maxNumberOfAssets;
		this.resultsSummary.innerHTML = 'Viewing ' + startFileIndex + '-' + ceil + ' of ' + this._totalResults;

		if(ceil < this._totalResults)
			this.nextButton.attr('disabled', false);
		else
			this.nextButton.attr('disabled', true);

		if(this._currentOffset > 0)
			this.previousButton.attr('disabled', false);
		else
			this.previousButton.attr('disabled', true);

		if(this._totalResults > 0) {
			this._show(this.tablesWrapper);
			this._show(table);
			this._show(this.tablesSummary);
		} else {
			this._show(this.noResults);
		}


	},

	_previousButtonClick: function () {
		this._currentOffset -= this._maxNumberOfAssets;
		if(this.offset < 0) offset = 0;
		this._loadFolder();
	},

	_nextButtonClick: function () {
		this._currentOffset += this._maxNumberOfAssets;
		if(this._currentOffset >= this._totalResults)
			this._currentOffset = this._totalResults - 1;
		this._loadFolder();
	},

	_assetSelected: function (asset) {
		this.onFileSelected(asset);
		this.dialog.hide();
	},

	_within: function (event, elem) {
		var x = event.clientX;
		var y = event.clientY;
		var coords = dojo.coords(elem);

		if(x < coords.x || x > coords.x + coords.w || y < coords.y || y > coords.y + coords.h) {
			return false;
		}
		return true;
	},

	_normalizeAssetData: function(asset) {

        var name = asset.title;

        name = shortenString(name, 30);

   		var assetIcon = '/icon?i=' + asset.extension;
   		var assetThumbnail = '/icon?i=' + asset.extension;

   		if (asset.type == 'file_asset') {
   			name = asset.fileName;

            name = shortenString(name, 30);

            assetIcon = '/html/images/icons/' + asset.extension + '.png';

   			if(asset.mimeType != null && asset.mimeType.indexOf('image/') == 0 ){

				if(asset.mimeType.indexOf('image/svg') <0 && asset.mimeType.indexOf('image/x-icon')<0){
					assetThumbnail = '/contentAsset/image/' + asset.identifier + '/fileAsset/filter/Thumbnail/thumbnail_w/100/thumbnail_h/100/r/'+asset.inode+'?language_id='+asset.languageId;
				}
				else{
					assetThumbnail= '/contentAsset/image/' + asset.identifier + '/fileAsset/'+asset.inode+'?language_id='+asset.languageId;
				}
   			}
   		}
   		if (asset.type == 'htmlpage') {
   			name = asset.pageUrl;
   			assetIcon = '/html/images/icons/blog-blue.png';
   			assetThumbnail = assetIcon;
   		}
   		if (asset.type == 'links') {
   			assetIcon = '/icon?i=entry16';
   			assetThumbnail = assetIcon;
		}

		if(asset.modDate) {
			var hours = asset.modDate.getHours() < 10?"0" + asset.modDate.getHours():asset.modDate.getHours();
			var AMPM = asset.modDate.getHours() >= 12?"PM":"AM";
			hours = hours > 12?hours - 12:hours;
			var minutes = asset.modDate.getMinutes() < 10?"0" + asset.modDate.getMinutes():asset.modDate.getMinutes();
			var seconds = asset.modDate.getSeconds() < 10?"0" + asset.modDate.getSeconds():asset.modDate.getSeconds();
			var modDate = (asset.modDate.getMonth() + 1) + "/" + asset.modDate.getDate() + "/" + asset.modDate.getFullYear() + " " +
				hours + ":" + minutes +	":" + seconds + AMPM;

		}
		else
			var modDate = "";

		asset.name = name;
		asset.icon = assetIcon;
		asset.thumbnail = assetThumbnail;
		asset.modDateFormatted = modDate;

	},

	_show: function(elem) {
		dojo.style(elem, { display: "" });
	},

	_hide: function(elem) {
		dojo.style(elem, { display: "none" });
	},

	_removeRows: function(table) {
		if(dojo.isIE) {
			try {
				while(table.hasChildNodes()) {
					table.deleteRow(0);
				}
			} catch(e) {
				// not supported by broswer
			}
		} else {
			table.innerHTML = '';
		}
	},

	_addNewFile: function () {
		this.addingAFile = true;
		this.firstLoad = true;
		var addFilePorletURL = "/c/portal/layout?p_l_id=" + this._getRequestParameter('p_l_id') +
			"&p_p_id=" + this._getRequestParameter('p_p_id') +
			"&referer=/html/blank.jsp" +
			"&p_p_action=1&p_p_state=maximized&p_p_mode=view&struts_action=/ext/files/upload_multiple&cmd=edit&in_frame=true&parent=" + this.currentFolder.id;
		this.addAFileIFrame.src = addFilePorletURL;
		this.addFileDialog.show();
		dojo.global.closeAddFileDialog = dojo.hitch(this, this._closeAddFileDialog);
		/* hack for IE only - iframe onload doesn't work */
		if(dojo.isIE)
			dojo.global.fileSubmitted = dojo.hitch(this, this._fileSubmitted);
	},

	_getRequestParameter: function (name, url)
	{
		if(!url) {
			url = window.location.href;
		}
		name = name.replace(/[\[]/,"\\\[").replace(/[\]]/,"\\\]");
		var regexS = "[\\?&]"+name+"=([^&#]*)";
		var regex = new RegExp( regexS );
		var results = regex.exec( url );
		if( results == null )
			return "";
		else
			return results[1];
	},

	_addFileIFrameLoaded: function () {

		if(!this.addingAFile)
			return;

		if(this.firstLoad) {
			this.firstLoad = false;
			return;
		}

		var url = this.addAFileIFrame.contentWindow.location.href;
		if(url.indexOf('blank.jsp') >= 0) {
			this.addFileDialog.hide();
			this.addingAFile = false;
			this._loadFolder();
		}
	},

	/* hack for IE only */
	_fileSubmitted: function(numOfFiles,waitMsg) {
		dojo.global.fileSubmittedWaitToSave = dojo.hitch(this, this._fileSubmittedWaitToSave);

		this.addFileDialog.hide();
		this._hide(this.noContent);
		this._hide(this.noResults);
		this._show(this.loadingContentWrapper);
		this._hide(this.tablesWrapper);
		this._hide(this.detailsTable);
		this._hide(this.tablesSummary);
		this._hide(this.listTable);
		this._hide(this.thumbnailsTable);
		this._removeRows(this.detailsTableBody);
		this._removeRows(this.listTableBody);
		this._removeRows(this.thumbnailsTableBody);

		showDotCMSSystemMessage(waitMsg,true);
		if(numOfFiles < 5)
			setTimeout('fileSubmittedWaitToSave()', numOfFiles*2000);
		else
			setTimeout('fileSubmittedWaitToSave()', numOfFiles*1000);
	},

	_fileSubmittedWaitToSave: function() {
		this.addingAFile = false;
		this._loadFolder();
	},

	_closeAddFileDialog: function(){
		this.addFileDialog.hide();
	}

});