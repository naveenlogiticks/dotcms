/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2019-11-28 18:39:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.html.portlet.ext.categories;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dotmarketing.util.UtilMethods;
import com.dotmarketing.business.Layout;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.auth.PrincipalException;
import com.liferay.portal.ejb.AddressManagerUtil;
import com.liferay.portal.ejb.CompanyLocalManagerUtil;
import com.liferay.portal.ejb.PortletManagerUtil;
import com.liferay.portal.ejb.PortletPreferencesManagerUtil;
import com.liferay.portal.ejb.UserLocalManagerUtil;
import com.liferay.portal.model.*;
import com.liferay.portal.util.Constants;
import com.liferay.portal.util.CookieKeys;
import com.liferay.portal.util.ImageKey;
import com.liferay.portal.util.OmniadminUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.util.PortletKeys;
import com.liferay.portal.util.Recipient;
import com.liferay.portal.util.RecipientComparator;
import com.liferay.portal.util.ReleaseInfo;
import com.liferay.portal.util.Resolution;
import com.liferay.portal.util.ShutdownUtil;
import com.liferay.portal.util.WebAppPool;
import com.liferay.portlet.ConcretePortletWrapper;
import com.liferay.portlet.LiferayWindowState;
import com.liferay.portlet.PortletURLImpl;
import com.liferay.portlet.RenderParametersPool;
import com.liferay.portlet.RenderRequestImpl;
import com.liferay.portlet.RenderResponseImpl;
import com.liferay.portlet.admin.ejb.AdminConfigManagerUtil;
import com.liferay.portlet.admin.model.EmailConfig;
import com.liferay.portlet.admin.model.JournalConfig;
import com.liferay.portlet.admin.model.ShoppingConfig;
import com.liferay.portlet.admin.model.UserConfig;
import com.liferay.util.BrowserSniffer;
import com.liferay.util.CollectionFactory;
import com.liferay.util.CookieUtil;
import com.liferay.util.CreditCard;
import com.liferay.util.FileUtil;
import com.liferay.util.Html;
import com.liferay.util.Http;
import com.liferay.util.JS;
import com.liferay.util.KeyValuePair;
import com.liferay.util.KeyValuePairComparator;
import com.liferay.util.MathUtil;
import com.liferay.util.ObjectValuePair;
import com.liferay.util.OrderedProperties;
import com.liferay.util.ParamUtil;
import com.liferay.util.PhoneNumber;
import com.liferay.util.PropertiesUtil;
import com.liferay.util.ServerDetector;
import com.liferay.util.SimpleCachePool;
import com.liferay.util.SortedProperties;
import com.liferay.util.State;
import com.liferay.util.StateUtil;
import com.liferay.util.StringComparator;
import com.liferay.util.StringPool;
import com.liferay.util.TextFormatter;
import com.liferay.util.Time;
import com.liferay.util.UnicodeFormatter;
import com.liferay.util.Validator;
import com.liferay.util.Xss;
import com.liferay.util.cal.CalendarUtil;
import com.liferay.util.cal.Recurrence;
import com.liferay.util.lang.BooleanWrapper;
import com.liferay.util.lang.IntegerWrapper;
import com.liferay.util.log4j.Levels;
import com.liferay.util.servlet.DynamicServletRequest;
import com.liferay.util.servlet.SessionParameters;
import com.liferay.util.servlet.StringServletResponse;
import com.liferay.util.servlet.UploadException;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import com.dotcms.repackage.javax.portlet.PortletConfig;
import com.dotcms.repackage.javax.portlet.PortletContext;
import com.dotcms.repackage.javax.portlet.PortletException;
import com.dotcms.repackage.javax.portlet.PortletMode;
import com.dotcms.repackage.javax.portlet.PortletPreferences;
import com.dotcms.repackage.javax.portlet.PortletURL;
import com.dotcms.repackage.javax.portlet.UnavailableException;
import com.dotcms.repackage.javax.portlet.ValidatorException;
import com.dotcms.repackage.javax.portlet.WindowState;
import com.dotmarketing.portlets.common.bean.CrumbTrailEntry;
import java.util.HashMap;
import com.liferay.portal.language.LanguageUtil;
import com.liferay.portal.language.LanguageWrapper;
import com.liferay.portal.language.UnicodeLanguageUtil;
import com.liferay.portal.util.PropsUtil;
import com.liferay.portal.util.WebKeys;
import com.liferay.util.GetterUtil;
import com.liferay.util.StringUtil;
import com.liferay.util.servlet.SessionErrors;
import com.liferay.util.servlet.SessionMessages;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.dotcms.publisher.environment.bean.Environment;
import com.dotcms.publisher.bundle.bean.Bundle;
import com.dotmarketing.util.Config;
import com.dotmarketing.util.CompanyUtils;

public final class sub_005fnav_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/tld/struts-html.tld", Long.valueOf(1570476689000L));
    _jspx_dependants.put("/html/common/init.jsp", Long.valueOf(1570476689000L));
    _jspx_dependants.put("/html/portlet/ext/categories/init.jsp", Long.valueOf(1570476693000L));
    _jspx_dependants.put("/WEB-INF/tld/liferay-portlet.tld", Long.valueOf(1570476689000L));
    _jspx_dependants.put("/WEB-INF/tld/liferay-util.tld", Long.valueOf(1570476689000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.liferay.portal.model");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.liferay.portal.util.ImageKey");
    _jspx_imports_classes.add("com.liferay.util.cal.Recurrence");
    _jspx_imports_classes.add("java.util.Arrays");
    _jspx_imports_classes.add("com.liferay.util.KeyValuePair");
    _jspx_imports_classes.add("java.util.Enumeration");
    _jspx_imports_classes.add("com.liferay.portal.ejb.AddressManagerUtil");
    _jspx_imports_classes.add("com.dotcms.repackage.javax.portlet.ValidatorException");
    _jspx_imports_classes.add("com.dotmarketing.util.Config");
    _jspx_imports_classes.add("com.liferay.portlet.admin.model.EmailConfig");
    _jspx_imports_classes.add("com.dotcms.repackage.javax.portlet.PortletURL");
    _jspx_imports_classes.add("com.liferay.portal.ejb.CompanyLocalManagerUtil");
    _jspx_imports_classes.add("com.dotmarketing.portlets.common.bean.CrumbTrailEntry");
    _jspx_imports_classes.add("com.dotmarketing.business.Layout");
    _jspx_imports_classes.add("com.dotcms.repackage.javax.portlet.UnavailableException");
    _jspx_imports_classes.add("com.liferay.portal.ejb.PortletManagerUtil");
    _jspx_imports_classes.add("com.liferay.portal.util.Resolution");
    _jspx_imports_classes.add("com.liferay.portal.util.PropsUtil");
    _jspx_imports_classes.add("com.liferay.util.State");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("com.dotcms.repackage.javax.portlet.PortletConfig");
    _jspx_imports_classes.add("com.liferay.util.Validator");
    _jspx_imports_classes.add("java.util.GregorianCalendar");
    _jspx_imports_classes.add("com.liferay.util.PhoneNumber");
    _jspx_imports_classes.add("com.liferay.util.BrowserSniffer");
    _jspx_imports_classes.add("com.liferay.util.JS");
    _jspx_imports_classes.add("java.util.Set");
    _jspx_imports_classes.add("com.liferay.util.servlet.UploadException");
    _jspx_imports_classes.add("com.liferay.portal.language.UnicodeLanguageUtil");
    _jspx_imports_classes.add("com.liferay.util.Xss");
    _jspx_imports_classes.add("com.liferay.util.cal.CalendarUtil");
    _jspx_imports_classes.add("com.liferay.portlet.PortletURLImpl");
    _jspx_imports_classes.add("com.liferay.util.SortedProperties");
    _jspx_imports_classes.add("com.liferay.util.GetterUtil");
    _jspx_imports_classes.add("org.apache.commons.logging.LogFactory");
    _jspx_imports_classes.add("com.liferay.util.ParamUtil");
    _jspx_imports_classes.add("com.liferay.portal.util.PortletKeys");
    _jspx_imports_classes.add("com.liferay.portal.NoSuchUserException");
    _jspx_imports_classes.add("com.liferay.util.log4j.Levels");
    _jspx_imports_classes.add("com.liferay.portlet.admin.model.JournalConfig");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("com.dotcms.repackage.javax.portlet.PortletException");
    _jspx_imports_classes.add("com.liferay.portal.auth.PrincipalException");
    _jspx_imports_classes.add("java.util.Currency");
    _jspx_imports_classes.add("java.text.NumberFormat");
    _jspx_imports_classes.add("java.util.TreeSet");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("java.util.LinkedHashMap");
    _jspx_imports_classes.add("com.liferay.portlet.RenderRequestImpl");
    _jspx_imports_classes.add("java.util.Calendar");
    _jspx_imports_classes.add("com.liferay.util.servlet.SessionErrors");
    _jspx_imports_classes.add("com.liferay.util.MathUtil");
    _jspx_imports_classes.add("com.liferay.portal.util.OmniadminUtil");
    _jspx_imports_classes.add("com.liferay.portlet.admin.model.ShoppingConfig");
    _jspx_imports_classes.add("com.liferay.portlet.RenderParametersPool");
    _jspx_imports_classes.add("java.util.Properties");
    _jspx_imports_classes.add("com.dotcms.publisher.bundle.bean.Bundle");
    _jspx_imports_classes.add("com.liferay.portal.util.Constants");
    _jspx_imports_classes.add("com.liferay.portal.util.Recipient");
    _jspx_imports_classes.add("com.liferay.util.OrderedProperties");
    _jspx_imports_classes.add("com.liferay.portal.ejb.UserLocalManagerUtil");
    _jspx_imports_classes.add("java.io.StringReader");
    _jspx_imports_classes.add("java.util.TreeMap");
    _jspx_imports_classes.add("com.liferay.util.servlet.DynamicServletRequest");
    _jspx_imports_classes.add("com.dotmarketing.util.UtilMethods");
    _jspx_imports_classes.add("com.liferay.util.Http");
    _jspx_imports_classes.add("com.liferay.portlet.admin.model.UserConfig");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.util.Random");
    _jspx_imports_classes.add("com.liferay.portal.util.WebKeys");
    _jspx_imports_classes.add("com.liferay.util.CollectionFactory");
    _jspx_imports_classes.add("com.liferay.portal.util.ShutdownUtil");
    _jspx_imports_classes.add("com.liferay.portal.ejb.PortletPreferencesManagerUtil");
    _jspx_imports_classes.add("com.liferay.portal.util.PortalUtil");
    _jspx_imports_classes.add("com.dotmarketing.util.CompanyUtils");
    _jspx_imports_classes.add("com.liferay.util.StringPool");
    _jspx_imports_classes.add("java.io.ByteArrayInputStream");
    _jspx_imports_classes.add("java.util.Locale");
    _jspx_imports_classes.add("com.liferay.util.servlet.SessionParameters");
    _jspx_imports_classes.add("com.liferay.portlet.RenderResponseImpl");
    _jspx_imports_classes.add("java.text.DateFormat");
    _jspx_imports_classes.add("com.dotcms.repackage.javax.portlet.PortletPreferences");
    _jspx_imports_classes.add("com.liferay.util.StringComparator");
    _jspx_imports_classes.add("com.liferay.portlet.ConcretePortletWrapper");
    _jspx_imports_classes.add("java.util.TimeZone");
    _jspx_imports_classes.add("java.util.Collection");
    _jspx_imports_classes.add("com.dotcms.repackage.javax.portlet.WindowState");
    _jspx_imports_classes.add("com.liferay.util.servlet.SessionMessages");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.liferay.util.SimpleCachePool");
    _jspx_imports_classes.add("com.liferay.portlet.LiferayWindowState");
    _jspx_imports_classes.add("com.dotcms.repackage.javax.portlet.PortletContext");
    _jspx_imports_classes.add("com.liferay.util.CookieUtil");
    _jspx_imports_classes.add("com.liferay.portal.util.ReleaseInfo");
    _jspx_imports_classes.add("com.liferay.util.Time");
    _jspx_imports_classes.add("com.liferay.portal.language.LanguageUtil");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("com.liferay.util.servlet.StringServletResponse");
    _jspx_imports_classes.add("com.dotcms.publisher.environment.bean.Environment");
    _jspx_imports_classes.add("java.util.Stack");
    _jspx_imports_classes.add("java.text.MessageFormat");
    _jspx_imports_classes.add("java.util.HashSet");
    _jspx_imports_classes.add("com.liferay.util.StringUtil");
    _jspx_imports_classes.add("com.liferay.util.PropertiesUtil");
    _jspx_imports_classes.add("com.liferay.util.CreditCard");
    _jspx_imports_classes.add("com.liferay.util.UnicodeFormatter");
    _jspx_imports_classes.add("com.liferay.util.lang.IntegerWrapper");
    _jspx_imports_classes.add("com.liferay.util.ServerDetector");
    _jspx_imports_classes.add("com.liferay.portlet.admin.ejb.AdminConfigManagerUtil");
    _jspx_imports_classes.add("com.liferay.portal.util.RecipientComparator");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("java.text.DecimalFormat");
    _jspx_imports_classes.add("com.liferay.portal.util.WebAppPool");
    _jspx_imports_classes.add("com.liferay.util.Html");
    _jspx_imports_classes.add("com.liferay.util.FileUtil");
    _jspx_imports_classes.add("com.dotcms.repackage.javax.portlet.PortletMode");
    _jspx_imports_classes.add("com.liferay.portal.util.CookieKeys");
    _jspx_imports_classes.add("com.liferay.portal.language.LanguageWrapper");
    _jspx_imports_classes.add("com.liferay.util.TextFormatter");
    _jspx_imports_classes.add("com.liferay.util.StateUtil");
    _jspx_imports_classes.add("com.liferay.util.lang.BooleanWrapper");
    _jspx_imports_classes.add("com.liferay.util.KeyValuePairComparator");
    _jspx_imports_classes.add("org.apache.commons.logging.Log");
    _jspx_imports_classes.add("java.util.Collections");
    _jspx_imports_classes.add("com.liferay.util.ObjectValuePair");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody;

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
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
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

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/html/common/auth_backend_check.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

	String CTX_PATH = (String) application
			.getAttribute(WebKeys.CTX_PATH);
	String CAPTCHA_PATH = (String) application
			.getAttribute(WebKeys.CAPTCHA_PATH);
	String IMAGE_PATH = (String) application
			.getAttribute(WebKeys.IMAGE_PATH);

	String contextPath = PropsUtil.get(PropsUtil.PORTAL_CTX);
	if (contextPath.equals("/")) {
		contextPath = "";
	}

	String COMMON_IMG = null;

	Company company = PortalUtil.getCompany(request);

	User user = PortalUtil.getUser(request);

	boolean signedIn = false;

	if (user == null) {
		user = company.getDefaultUser();
	} else {
		signedIn = true;
	}

	Locale locale = (Locale) session
			.getAttribute(com.dotcms.repackage.org.apache.struts.Globals.LOCALE_KEY);
	if (locale == null) {

		// Locale should never be null except when the TCK tests invalidate the session

		locale = user.getLocale();
	}
	if(UtilMethods.isSet(request.getParameter("switchLocale"))){
		Locale[] locales = LanguageUtil.getAvailableLocales();
		for (int i = 0; i < locales.length; i++) { 
			String test = locales[i].getLanguage() + "_" + locales[i].getCountry();
			if(test.equals(request.getParameter("switchLocale"))){
				locale = locales[i];
				session.setAttribute(com.dotcms.repackage.org.apache.struts.Globals.LOCALE_KEY, locale);
				break;
			}
		}
		
	}else{//DOTCMS-5013
		session.setAttribute(com.dotcms.repackage.org.apache.struts.Globals.LOCALE_KEY, locale);
	}

	TimeZone timeZone = user.getTimeZone();
	if (timeZone == null) {
		timeZone = company.getTimeZone();
	}

	Layout layout = (Layout) request.getAttribute(WebKeys.LAYOUT);
	Layout[] layouts = (Layout[]) request.getAttribute(WebKeys.LAYOUTS);

	String layoutId = null;
	if (layout != null) {
		layoutId = layout.getId();
	}

	//String portletGroupId = PortalUtil.getPortletGroupId(layoutId);

	int RES_NARROW = 0;
	int RES_TOTAL = 0;
	int RES_WIDE = 0;


//	Skin skin = user.getSkin();

	String SKIN_CSS_IMG = null;


	String SKIN_COMMON_IMG =null;
	String SKIN_IMG =null;

      out.write('\n');
      out.write('\n');

	try {
		String hostId = (String) session.getAttribute(com.dotmarketing.util.WebKeys.CMS_SELECTED_HOST_ID);

		com.dotmarketing.business.web.HostWebAPI hostApi = com.dotmarketing.business.web.WebAPILocator.getHostWebAPI();
		com.dotmarketing.beans.Host currentHost = hostApi.find(hostId, user, false);
		if (currentHost.isArchived()) {
			List<com.dotmarketing.beans.Host> hosts = hostApi.findAll(user, false);
			for (com.dotmarketing.beans.Host host : hosts) {
				if (!host.isSystemHost() && !host.isArchived()) {
					session.setAttribute(com.dotmarketing.util.WebKeys.CMS_SELECTED_HOST_ID, host
							.getIdentifier());
					break;
				}
			}
		}
	} catch (Exception e) {

	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Company c = CompanyUtils.getDefaultCompany();
	boolean authByEmail = false;
	if(c.getAuthType().equals(Company.AUTH_TYPE_EA)) {
		authByEmail = true;
	}

      out.write('\n');
      //  portlet:defineObjects
      com.dotcms.repackage.com.liferay.portlet.taglib.DefineObjectsTag _jspx_th_portlet_005fdefineObjects_005f0 = (com.dotcms.repackage.com.liferay.portlet.taglib.DefineObjectsTag) _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.get(com.dotcms.repackage.com.liferay.portlet.taglib.DefineObjectsTag.class);
      boolean _jspx_th_portlet_005fdefineObjects_005f0_reused = false;
      try {
        _jspx_th_portlet_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
        _jspx_th_portlet_005fdefineObjects_005f0.setParent(null);
        int _jspx_eval_portlet_005fdefineObjects_005f0 = _jspx_th_portlet_005fdefineObjects_005f0.doStartTag();
        if (_jspx_th_portlet_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.reuse(_jspx_th_portlet_005fdefineObjects_005f0);
        _jspx_th_portlet_005fdefineObjects_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_portlet_005fdefineObjects_005f0, _jsp_getInstanceManager(), _jspx_th_portlet_005fdefineObjects_005f0_reused);
      }
      com.dotcms.repackage.javax.portlet.PortletConfig portletConfig = null;
      com.dotcms.repackage.javax.portlet.RenderRequest renderRequest = null;
      com.dotcms.repackage.javax.portlet.RenderResponse renderResponse = null;
      portletConfig = (com.dotcms.repackage.javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      renderRequest = (com.dotcms.repackage.javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (com.dotcms.repackage.javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      out.write("\r\n");
      out.write("\r\n");

	RenderRequestImpl rreq = (RenderRequestImpl) pageContext.getAttribute("renderRequest");
	String portletId1 = rreq.getPortletName();
	
	if (!UtilMethods.isSet(portletId1))
		portletId1 = layouts[0].getPortletIds().get(0);
	
	Portlet portlet1 = PortletManagerUtil.getPortletById(company.getCompanyId(), portletId1);
	String strutsAction = ParamUtil.get(request, "struts_action", null);
	
	if (!UtilMethods.isSet(strutsAction) || strutsAction.equals(portlet1.getInitParams().get("view-action")) || strutsAction.equals("/ext/categories/view_category")) {
		List<CrumbTrailEntry> crumbTrailEntries = new ArrayList<CrumbTrailEntry>();
		
		boolean isSelectedTab = (layout != null && layouts !=null && layout.getId().equals(layouts[0].getId()));
		PortletURLImpl portletURLImpl = new PortletURLImpl(request, portletId1, layouts[0].getId(), false);
		String tabHREF = portletURLImpl.toString() + "&dm_rlout=1&_r=" + System.currentTimeMillis();
		
		crumbTrailEntries.add(new CrumbTrailEntry(LanguageUtil.get(pageContext, "com.dotcms.repackage.javax.portlet.title." + portletId1), tabHREF));
		
		request.setAttribute(com.dotmarketing.util.WebKeys.CMS_CRUMBTRAIL_OPTIONS, crumbTrailEntries);
	}  else	{
		List<CrumbTrailEntry> crumbTrailEntries = new ArrayList<CrumbTrailEntry>();
		
		crumbTrailEntries.add(new CrumbTrailEntry(LanguageUtil.get(pageContext, "com.dotcms.repackage.javax.portlet.title." + portletId1), "javascript: cancel();"));
		
		crumbTrailEntries.add(new CrumbTrailEntry(LanguageUtil.get(pageContext, "edit-category"), null));
		
		request.setAttribute(com.dotmarketing.util.WebKeys.CMS_CRUMBTRAIL_OPTIONS, crumbTrailEntries);
	}
	
	request.setAttribute(com.dotmarketing.util.WebKeys.DONT_DISPLAY_SUBNAV_ALL_HOSTS, false);


      out.write("\r\n");
      out.write("\r\n");
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
