/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2019-11-28 18:42:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.html.portlet.ext.osgi;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.language.LanguageUtil;
import com.liferay.util.FileUtil;
import com.dotmarketing.util.Config;
import java.util.ArrayList;
import java.io.File;
import java.util.List;
import org.apache.felix.framework.OSGIUtil;

public final class js_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


    /**
     * Return true if the name corresponds to a jar file
     *
     * @param name The file name
     * @return true if the name is a jar file, false otherwise.
     */
    private boolean isJarName ( String name ) {
        name = name.toLowerCase();
        return name.endsWith( ".jar" );
    }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/html/portlet/ext/osgi/available_bundles_json.jsp", Long.valueOf(1570476693000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.liferay.util.FileUtil");
    _jspx_imports_classes.add("org.apache.felix.framework.OSGIUtil");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.liferay.portal.language.LanguageUtil");
    _jspx_imports_classes.add("com.dotmarketing.util.Config");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
response.setContentType("text/JavaScript");
      out.write("\n");
      out.write("dojo.require(\"dojo.hash\");\n");
      out.write("dojo.require(\"dojox.layout.ContentPane\");\n");
      out.write("dojo.require(\"dojo.data.ItemFileReadStore\");\n");
      out.write("dojo.require(\"dijit.form.ComboBox\");\n");
      out.write("dojo.require(\"dijit.form.FilteringSelect\");\n");
      out.write("dojo.require(\"dijit.form.Button\");\n");
      out.write("dojo.require(\"dojox.form.Uploader\");\n");
      out.write("dojo.require(\"dojox.embed.Flash\");\n");
      out.write("dojo.require(\"dojo.io.iframe\");\n");
      out.write("dojo.subscribe(\"/dojo/hashchange\", this, function(hash) {\n");
      out.write("\tmainAdmin.refresh();\n");
      out.write("});\n");
      out.write("\n");
      out.write("dojo.declare(\"dotcms.dijit.osgi.MainAdmin\", null, {\n");
      out.write("\n");
      out.write("\tbaseDiv : \"osgiBundles\",\n");
      out.write("\turl: \"\",\n");
      out.write("\tconstructor : function() {\n");
      out.write("\t},\n");
      out.write("\tshow : function(href) {\n");
      out.write("\n");
      out.write("\t\tvar r = Math.floor(Math.random() * 1000000000);\n");
      out.write("\t\tif (href.indexOf(\"?\") > -1) {\n");
      out.write("\t\t\thref = href + \"&r=\" + r;\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\thref = href + \"?r=\" + r;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\thref = href + \"?donothing\";\n");
      out.write("\n");
      out.write("\t\tthis.url = href;\n");
      out.write("\t\tvar myCp = dijit.byId(\"osgiMainBundles\");\n");
      out.write("\n");
      out.write("        if (myCp) {\n");
      out.write("            myCp.destroyRecursive(false);\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("        myCp = new dojox.layout.ContentPane({\n");
      out.write("            id: \"osgiMainBundles\",\n");
      out.write("            preventCache: true\n");
      out.write("        }).placeAt(\"osgiMain\");\n");
      out.write("\n");
      out.write("        myCp.attr(\"href\", this.url);\n");
      out.write("\t},\n");
      out.write("\n");
      out.write("\trefresh : function() {\n");
      out.write("\t\tvar hanger = dojo.byId(\"osgiMain\");\n");
      out.write("\t\tif(!hanger){\n");
      out.write("            return;\n");
      out.write("\t\t}\n");
      out.write("        var myCp = dijit.byId(\"osgiMainBundles\");\n");
      out.write("        if (myCp) {\n");
      out.write("            myCp.destroyRecursive(false);\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("        myCp = new dojox.layout.ContentPane({\n");
      out.write("            id: \"osgiMainBundles\",\n");
      out.write("            preventCache: true\n");
      out.write("        }).placeAt(\"osgiMain\");\n");
      out.write("\n");
      out.write("        myCp.attr(\"href\", this.url);\n");
      out.write("\t}\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("dojo.declare(\"dotcms.dijit.osgi.Bundles\", null, {\n");
      out.write("\n");
      out.write("\tbaseJsp : \"/html/portlet/ext/osgi/bundles.jsp\",\n");
      out.write("\tconstructor : function() {\n");
      out.write("\n");
      out.write("\t},\n");
      out.write("\n");
      out.write("\tshow : function() {\n");
      out.write("\t\tvar href = this.baseJsp;\n");
      out.write("\t\tmainAdmin.show(href);\n");
      out.write("\t},\n");
      out.write("\n");
      out.write("\tundeploy : function (jarName, bundleId){\n");
      out.write("\t\tvar xhrArgs = {\n");
      out.write("\t\t\turl: \"/DotAjaxDirector/com.dotmarketing.portlets.osgi.AJAX.OSGIAJAX?cmd=undeploy&jar=\" + jarName + \"&bundleId=\" + bundleId,\n");
      out.write("\t\t\thandle : function(dataOrError, ioArgs) {\n");
      out.write("\t\t\t\tif (dojo.isString(dataOrError)) {\n");
      out.write("\t\t\t\t\tif (dataOrError.indexOf(\"FAILURE\") == 0) {\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t// needs logging\n");
      out.write("\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t// needs logging\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t//this.saveError(\"");
      out.print(LanguageUtil.get(pageContext, "unable-to-save-action"));
      out.write("\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t};\n");
      out.write("\t\tdijit.byId('savingOSGIDialog').show();\n");
      out.write("\t\tdojo.xhrPut(xhrArgs);\n");
      out.write("\t\tsetTimeout(function() {mainAdmin.refresh();},7000);\n");
      out.write("\t},\n");
      out.write("\n");
      out.write("\tdeploy : function(){\n");
      out.write("\t\tvar availBundles = dijit.byId('availBundlesCombo');\n");
      out.write("\t\tif(availBundles.getValue() == undefined || availBundles.getValue()==\"\"){\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tvar jarName = availBundles.value;\n");
      out.write("\t\tvar xhrArgs = {\n");
      out.write("\t\t\turl: \"/DotAjaxDirector/com.dotmarketing.portlets.osgi.AJAX.OSGIAJAX?cmd=deploy&jar=\" + jarName,\n");
      out.write("\t\t\thandle : function(dataOrError, ioArgs) {\n");
      out.write("\t\t\t\tif (dojo.isString(dataOrError)) {\n");
      out.write("\t\t\t\t\tif (dataOrError.indexOf(\"FAILURE\") == 0) {\n");
      out.write("\t\t\t\t\t\t// needs logging\n");
      out.write("\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t// needs logging\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t//this.saveError(\"");
      out.print(LanguageUtil.get(pageContext, "unable-to-save-action"));
      out.write("\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t};\n");
      out.write("\t\tdijit.byId('savingOSGIDialog').show();\n");
      out.write("\t\tdojo.xhrPut(xhrArgs);\n");
      out.write("\t\tsetTimeout(function() {mainAdmin.refresh();},7000);\n");
      out.write("\t},\n");
      out.write("\n");
      out.write("\tstart : function(jarName, bundleId){\n");
      out.write("\t\tvar xhrArgs = {\n");
      out.write("\t\t\turl: \"/DotAjaxDirector/com.dotmarketing.portlets.osgi.AJAX.OSGIAJAX?cmd=start&bundleId=\" + bundleId+\"&jar=\" + jarName,\n");
      out.write("\t\t\thandle : function(dataOrError, ioArgs) {\n");
      out.write("\t\t\t\tif (dojo.isString(dataOrError)) {\n");
      out.write("\t\t\t\t\tif (dataOrError.indexOf(\"FAILURE\") == 0) {\n");
      out.write("\t\t\t\t\t\t// needs logging\n");
      out.write("\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t// needs logging\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t//this.saveError(\"");
      out.print(LanguageUtil.get(pageContext, "unable-to-save-action"));
      out.write("\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t};\n");
      out.write("\t\tdijit.byId('savingOSGIDialog').show();\n");
      out.write("\t\tdojo.xhrPut(xhrArgs);\n");
      out.write("\t\tsetTimeout(function() {mainAdmin.refresh();},7000);\n");
      out.write("\t},\n");
      out.write("\n");
      out.write("\tstop : function(jarName, bundleId){\n");
      out.write("\t\tvar xhrArgs = {\n");
      out.write("\t\t\turl: \"/DotAjaxDirector/com.dotmarketing.portlets.osgi.AJAX.OSGIAJAX?cmd=stop&bundleId=\" + bundleId+\"&jar=\" + jarName,\n");
      out.write("\t\t\thandle : function(dataOrError, ioArgs) {\n");
      out.write("\t\t\t\tif (dojo.isString(dataOrError)) {\n");
      out.write("\t\t\t\t\tif (dataOrError.indexOf(\"FAILURE\") == 0) {\n");
      out.write("\t\t\t\t\t\t// needs logging\n");
      out.write("\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t// needs logging\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t//this.saveError(\"");
      out.print(LanguageUtil.get(pageContext, "unable-to-save-action"));
      out.write("\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t};\n");
      out.write("\t\tdijit.byId('savingOSGIDialog').show();\n");
      out.write("\t\tdojo.xhrPut(xhrArgs);\n");
      out.write("\t\tsetTimeout(function() {mainAdmin.refresh();},7000);\n");
      out.write("\t},\n");
      out.write("\n");
      out.write("\tadd : function(){\n");
      out.write("\t\tvar fm = dojo.byId(\"addBundle\");\n");
      out.write("\t\tvar bundleUpload = fm.elements[\"bundleUpload\"].value;\n");
      out.write("\t\tvar jarName = bundleUpload.split(/(\\\\|\\/)/g).pop();\n");
      out.write("\t\tif(bundleUpload){\n");
      out.write("        require([\"dojo/io/iframe\"], function(ioIframe){\n");
      out.write("            ioIframe.send({\n");
      out.write("                // The form node, which contains the\n");
      out.write("                // data. We also pull the URL and METHOD from it:\n");
      out.write("                form: fm,\n");
      out.write("                url : \"/DotAjaxDirector/com.dotmarketing.portlets.osgi.AJAX.OSGIAJAX?cmd=add&jar=\" + jarName,\n");
      out.write("                method : \"post\",\n");
      out.write("                // The used data format:\n");
      out.write("                handleAs: \"json\",\n");
      out.write("\n");
      out.write("                // Callback on successful call:\n");
      out.write("                load: function(response, ioArgs) {\n");
      out.write("                    // return the response for succeeding callbacks\n");
      out.write("                    setTimeout(function() {mainAdmin.refresh();},7000);\n");
      out.write("                    return response;\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\t\t});\n");
      out.write("\t\tdijit.byId('uploadOSGIDialog').hide();\n");
      out.write("\t\tdijit.byId('savingOSGIDialog').show();\n");
      out.write("\t\tsetTimeout(function() {mainAdmin.refresh();},7000);\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tshowDotCMSSystemMessage(\"Please select a bundle to upload\");\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\tfm.elements[\"bundleUpload\"].value='';\n");
      out.write("\t},\n");
      out.write("\n");
      out.write("    reboot : function(askForConfirmation){\n");
      out.write("\n");
      out.write("        var canContinue = true;\n");
      out.write("        if (askForConfirmation) {\n");
      out.write("            canContinue = confirm('");
      out.print(LanguageUtil.get(pageContext, "OSGI-restart-confirmation") );
      out.write("');\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        if(canContinue) {\n");
      out.write("            var xhrArgs = {\n");
      out.write("                url: \"/DotAjaxDirector/com.dotmarketing.portlets.osgi.AJAX.OSGIAJAX?cmd=restart\",\n");
      out.write("                handle : function(dataOrError, ioArgs) {\n");
      out.write("                    if (dojo.isString(dataOrError)) {\n");
      out.write("                        if (dataOrError.indexOf(\"FAILURE\") == 0) {\n");
      out.write("                            // needs logging\n");
      out.write("                            console.error(dataOrError);\n");
      out.write("                        } else {\n");
      out.write("                            // needs logging\n");
      out.write("                        }\n");
      out.write("                    } else {\n");
      out.write("                        // needs logging\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("            dijit.byId('savingOSGIDialog').show();\n");
      out.write("            dojo.xhrPut(xhrArgs);\n");
      out.write("            setTimeout(function() {mainAdmin.refresh();},7000);\n");
      out.write("        }\n");
      out.write("\t},\n");
      out.write("\n");
      out.write("    extraPackages : function (){\n");
      out.write("        var xhrArgs = {\n");
      out.write("            url: \"/DotAjaxDirector/com.dotmarketing.portlets.osgi.AJAX.OSGIAJAX?cmd=getExtraPackages\",\n");
      out.write("            handle : function(dataOrError, ioArgs) {\n");
      out.write("\n");
      out.write("                if (dojo.isString(dataOrError)) {\n");
      out.write("                    if (dataOrError.indexOf(\"FAILURE\") == 0) {\n");
      out.write("                        console.error(dataOrError);\n");
      out.write("                    } else {\n");
      out.write("                        var packages = dataOrError.replace(\"SUCCESS:\", \"\");\n");
      out.write("                        packages = packages.replace(/,/g, \",\\n\");\n");
      out.write("                        dijit.byId('packages').set(\"value\", packages);\n");
      out.write("                    }\n");
      out.write("                } else {\n");
      out.write("                    //this.saveError(\"");
      out.print(LanguageUtil.get(pageContext, "unable-to-save-action"));
      out.write("\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        };\n");
      out.write("        dijit.byId('packagesOSGIDialog').show();\n");
      out.write("        dojo.xhrGet(xhrArgs);\n");
      out.write("    },\n");
      out.write("\n");
      out.write("    modifyExtraPackages : function(){\n");
      out.write("\n");
      out.write("        var canContinue = confirm('");
      out.print(LanguageUtil.get(pageContext, "OSGI-modify-packages-confirmation") );
      out.write("');\n");
      out.write("        if(canContinue) {\n");
      out.write("\n");
      out.write("            var fm = dojo.byId(\"modifyPackagesForm\");\n");
      out.write("\n");
      out.write("            require([\"dojo/io/iframe\"], function(ioIframe){\n");
      out.write("                ioIframe.send({\n");
      out.write("                    // The form node, which contains the\n");
      out.write("                    // data. We also pull the URL and METHOD from it:\n");
      out.write("                    form: fm,\n");
      out.write("                    url : \"/DotAjaxDirector/com.dotmarketing.portlets.osgi.AJAX.OSGIAJAX?cmd=modifyExtraPackages\",\n");
      out.write("                    method : \"post\",\n");
      out.write("                    // The used data format:\n");
      out.write("                    handleAs: \"json\",\n");
      out.write("\n");
      out.write("                    // Callback on successful call:\n");
      out.write("                    load: function(response, ioArgs) {\n");
      out.write("                        // return the response for succeeding callbacks\n");
      out.write("                        //setTimeout(function() {mainAdmin.refresh();},7000);\n");
      out.write("                        return response;\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            dijit.byId('packagesOSGIDialog').hide();\n");
      out.write("            dijit.byId('savingOSGIDialog').show();\n");
      out.write("            setTimeout(function() {bundles.reboot(false);dijit.byId('savingOSGIDialog').hide();},4000);\n");
      out.write("        }\n");
      out.write("    },\n");
      out.write("\n");
      out.write("    remotePublishBundle : function(jarFile){\n");
      out.write("        pushHandler.showDialog(jarFile);\n");
      out.write("    },\n");
      out.write("\n");
      out.write("    addToBundlePlugin : function (jarFile) {\n");
      out.write("        pushHandler.showAddToBundleDialog(jarFile, '");
      out.print(LanguageUtil.get(pageContext, "Add-To-Bundle"));
      out.write("');\n");
      out.write("    }\n");
      out.write("\n");
      out.write("});\n");
      out.write("\n");
      out.write("dojo.require(\"dotcms.dojo.push.PushHandler\");\n");
      out.write("var pushHandler = new dotcms.dojo.push.PushHandler('");
      out.print(LanguageUtil.get(pageContext, "Remote-Publish"));
      out.write("');\n");
      out.write("\n");
      out.write("var mainAdmin = new dotcms.dijit.osgi.MainAdmin({});\n");
      out.write("var bundles = new dotcms.dijit.osgi.Bundles({});\n");
      out.write("\n");
      out.write("\n");
      out.write("var availBundles = new dojo.data.ItemFileReadStore({data:\n");
      out.write("\t");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

    String path = OSGIUtil.getInstance().getFelixUndeployPath();

    if ( path == null ) {
        return;
    }

    File d = new File( path );
    String[] a = d.list();
    if ( a == null ) {
        a = new String[0];
    }

      out.write("\n");
      out.write("{\n");
      out.write("\t\"identifier\":\"value\", \n");
      out.write("\t\"label\":\"label\",\n");
      out.write("\t\"items\":[\n");
      out.write("    ");
 for ( String b : a ) {
        if ( isJarName( b ) ) { 
      out.write("\n");
      out.write("            {\"value\":\"");
      out.print( b );
      out.write("\",\"label\":\"");
      out.print( b );
      out.write("\"},\n");
      out.write("    ");
  }
       }
      out.write("\n");
      out.write("\t]\n");
      out.write("}");
      out.write("\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("dojo.ready(function() {\n");
      out.write("\tbundles.show();\n");
      out.write("    if(dojox.embed.Flash.available){\n");
      out.write("      dojo.require(\"dojox.form.uploader.plugins.Flash\");\n");
      out.write("    }else{\n");
      out.write("      dojo.require(\"dojox.form.uploader.plugins.IFrame\");\n");
      out.write("    }\n");
      out.write("});\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
