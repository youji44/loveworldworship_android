package crc64c5359ab32e5b9429;


public class SecurionPayView_MyWebViewClient
	extends android.webkit.WebViewClient
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_shouldOverrideUrlLoading:(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z:GetShouldOverrideUrlLoading_Landroid_webkit_WebView_Landroid_webkit_WebResourceRequest_Handler\n" +
			"";
		mono.android.Runtime.register ("SecurionPay.SecurionPayView+MyWebViewClient, SecurionPay", SecurionPayView_MyWebViewClient.class, __md_methods);
	}


	public SecurionPayView_MyWebViewClient ()
	{
		super ();
		if (getClass () == SecurionPayView_MyWebViewClient.class) {
			mono.android.TypeManager.Activate ("SecurionPay.SecurionPayView+MyWebViewClient, SecurionPay", "", this, new java.lang.Object[] {  });
		}
	}


	public boolean shouldOverrideUrlLoading (android.webkit.WebView p0, android.webkit.WebResourceRequest p1)
	{
		return n_shouldOverrideUrlLoading (p0, p1);
	}

	private native boolean n_shouldOverrideUrlLoading (android.webkit.WebView p0, android.webkit.WebResourceRequest p1);

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
