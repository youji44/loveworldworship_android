package crc64d79e922a6410784b;


public class PdfConverter_WebViewClientAnonymousInnerClass
	extends android.webkit.WebViewClient
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_shouldOverrideUrlLoading:(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z:GetShouldOverrideUrlLoading_Landroid_webkit_WebView_Landroid_webkit_WebResourceRequest_Handler\n" +
			"n_onLoadResource:(Landroid/webkit/WebView;Ljava/lang/String;)V:GetOnLoadResource_Landroid_webkit_WebView_Ljava_lang_String_Handler\n" +
			"n_onPageFinished:(Landroid/webkit/WebView;Ljava/lang/String;)V:GetOnPageFinished_Landroid_webkit_WebView_Ljava_lang_String_Handler\n" +
			"";
		mono.android.Runtime.register ("DeepSound.Helpers.Utils.PdfConverter+WebViewClientAnonymousInnerClass, DeepSound", PdfConverter_WebViewClientAnonymousInnerClass.class, __md_methods);
	}


	public PdfConverter_WebViewClientAnonymousInnerClass ()
	{
		super ();
		if (getClass () == PdfConverter_WebViewClientAnonymousInnerClass.class)
			mono.android.TypeManager.Activate ("DeepSound.Helpers.Utils.PdfConverter+WebViewClientAnonymousInnerClass, DeepSound", "", this, new java.lang.Object[] {  });
	}

	public PdfConverter_WebViewClientAnonymousInnerClass (crc64d79e922a6410784b.PdfConverter p0)
	{
		super ();
		if (getClass () == PdfConverter_WebViewClientAnonymousInnerClass.class)
			mono.android.TypeManager.Activate ("DeepSound.Helpers.Utils.PdfConverter+WebViewClientAnonymousInnerClass, DeepSound", "DeepSound.Helpers.Utils.PdfConverter, DeepSound", this, new java.lang.Object[] { p0 });
	}


	public boolean shouldOverrideUrlLoading (android.webkit.WebView p0, android.webkit.WebResourceRequest p1)
	{
		return n_shouldOverrideUrlLoading (p0, p1);
	}

	private native boolean n_shouldOverrideUrlLoading (android.webkit.WebView p0, android.webkit.WebResourceRequest p1);


	public void onLoadResource (android.webkit.WebView p0, java.lang.String p1)
	{
		n_onLoadResource (p0, p1);
	}

	private native void n_onLoadResource (android.webkit.WebView p0, java.lang.String p1);


	public void onPageFinished (android.webkit.WebView p0, java.lang.String p1)
	{
		n_onPageFinished (p0, p1);
	}

	private native void n_onPageFinished (android.webkit.WebView p0, java.lang.String p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
