(window.webpackJsonp=window.webpackJsonp||[]).push([[26],{ZKPm:function(e,n,t){"use strict";t.r(n);var o=t("CcnG"),l=function(){return function(){}}(),r=t("pMnS"),i=function(){return function(e,n){this.relativePath=e,this.fileEntry=n}}(),u=function(){function e(e,n){this.zone=e,this.el=n,this.files=[],this.itemDropped=new o.EventEmitter}return e.prototype.onDragOver=function(e){e.preventDefault(),e.stopPropagation(),this.addOverClass()},e.prototype.onDragLeave=function(e){e.preventDefault(),e.stopPropagation(),this.removeOverClass()},e.prototype.onDrop=function(e){e.preventDefault(),e.stopPropagation(),this.removeOverClass();for(var n=e.dataTransfer.items,t=0;t<n.length;t++){var o=n[t].webkitGetAsEntry();if(o.isDirectory)this.traverseFileTree(o,o.name);else{var l=new i(o.name,o);this.files.push(l)}}this.itemDropped.emit(this.files)},e.prototype.addOverClass=function(){this.el.nativeElement.classList.contains("over")||this.el.nativeElement.classList.add("over")},e.prototype.removeOverClass=function(){this.el.nativeElement.classList.contains("over")&&this.el.nativeElement.classList.remove("over")},e.prototype.traverseFileTree=function(e,n){var t=this;if(e.isFile){var o=new i(n,e);this.files.push(o)}else{n+="/";var l=e.createReader(),r=[],u=function(){l.readEntries(function(o){if(o.length)r=r.concat(o),u();else if(0===r.length){var l=new i(n,e);t.zone.run(function(){t.files.push(l)})}else for(var a=function(e){t.zone.run(function(){t.traverseFileTree(r[e],n+r[e].name)})},s=0;s<r.length;s++)a(s)})};u()}},e}(),a=t("Ip0R"),s=function(){function e(){}return e.prototype.ngOnInit=function(){},e.prototype.getFiles=function(e){this.files=e},e}(),p=o["\u0275crt"]({encapsulation:0,styles:[[".drop-zone[_ngcontent-%COMP%]{width:400px;height:400px;border:2px dotted}.drop-zone.over[_ngcontent-%COMP%]{background-color:#ff0}"]],data:{}});function c(e){return o["\u0275vid"](0,[(e()(),o["\u0275eld"](0,0,null,null,1,"li",[],null,null,null,null,null)),(e()(),o["\u0275ted"](1,null,[" "," "]))],null,function(e,n){e(n,1,0,n.context.$implicit.relativePath)})}function d(e){return o["\u0275vid"](0,[(e()(),o["\u0275eld"](0,0,null,null,4,"div",[["class","drop-zone"],["dotDotDndFilesFolders",""]],null,[[null,"itemDropped"],[null,"dragover"],[null,"dragleave"],[null,"drop"]],function(e,n,t){var l=!0,r=e.component;return"dragover"===n&&(l=!1!==o["\u0275nov"](e,1).onDragOver(t)&&l),"dragleave"===n&&(l=!1!==o["\u0275nov"](e,1).onDragLeave(t)&&l),"drop"===n&&(l=!1!==o["\u0275nov"](e,1).onDrop(t)&&l),"itemDropped"===n&&(l=!1!==r.getFiles(t)&&l),l},null,null)),o["\u0275did"](1,16384,null,0,u,[o.NgZone,o.ElementRef],null,{itemDropped:"itemDropped"}),(e()(),o["\u0275eld"](2,0,null,null,2,"ul",[],null,null,null,null,null)),(e()(),o["\u0275and"](16777216,null,null,1,null,c)),o["\u0275did"](4,278528,null,0,a.NgForOf,[o.ViewContainerRef,o.TemplateRef,o.IterableDiffers],{ngForOf:[0,"ngForOf"]},null)],function(e,n){e(n,4,0,n.component.files)},null)}function f(e){return o["\u0275vid"](0,[(e()(),o["\u0275eld"](0,0,null,null,1,"dot-site-browser",[],null,null,null,d,p)),o["\u0275did"](1,114688,null,0,s,[],null,null)],function(e,n){e(n,1,0)},null)}var v=o["\u0275ccf"]("dot-site-browser",s,f,{},{},[]),m=t("ZYCi"),g=function(){return function(){}}();t.d(n,"DotSiteBrowserModuleNgFactory",function(){return h});var h=o["\u0275cmf"](l,[],function(e){return o["\u0275mod"]([o["\u0275mpd"](512,o.ComponentFactoryResolver,o["\u0275CodegenComponentFactoryResolver"],[[8,[r.a,v]],[3,o.ComponentFactoryResolver],o.NgModuleRef]),o["\u0275mpd"](4608,a.NgLocalization,a.NgLocaleLocalization,[o.LOCALE_ID,[2,a["\u0275angular_packages_common_common_a"]]]),o["\u0275mpd"](1073742336,a.CommonModule,a.CommonModule,[]),o["\u0275mpd"](1073742336,m.RouterModule,m.RouterModule,[[2,m["\u0275angular_packages_router_router_a"]],[2,m.Router]]),o["\u0275mpd"](1073742336,g,g,[]),o["\u0275mpd"](1073742336,l,l,[]),o["\u0275mpd"](1024,m.ROUTES,function(){return[[{path:"",component:s}]]},[])])})}}]);