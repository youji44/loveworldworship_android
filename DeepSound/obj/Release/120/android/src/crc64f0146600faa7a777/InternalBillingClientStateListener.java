package crc64f0146600faa7a777;


public class InternalBillingClientStateListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.android.billingclient.api.BillingClientStateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBillingServiceDisconnected:()V:GetOnBillingServiceDisconnectedHandler:Android.BillingClient.Api.IBillingClientStateListenerInvoker, Xamarin.Android.Google.BillingClient\n" +
			"n_onBillingSetupFinished:(Lcom/android/billingclient/api/BillingResult;)V:GetOnBillingSetupFinished_Lcom_android_billingclient_api_BillingResult_Handler:Android.BillingClient.Api.IBillingClientStateListenerInvoker, Xamarin.Android.Google.BillingClient\n" +
			"";
		mono.android.Runtime.register ("Android.BillingClient.Api.InternalBillingClientStateListener, Xamarin.Android.Google.BillingClient", InternalBillingClientStateListener.class, __md_methods);
	}


	public InternalBillingClientStateListener ()
	{
		super ();
		if (getClass () == InternalBillingClientStateListener.class)
			mono.android.TypeManager.Activate ("Android.BillingClient.Api.InternalBillingClientStateListener, Xamarin.Android.Google.BillingClient", "", this, new java.lang.Object[] {  });
	}


	public void onBillingServiceDisconnected ()
	{
		n_onBillingServiceDisconnected ();
	}

	private native void n_onBillingServiceDisconnected ();


	public void onBillingSetupFinished (com.android.billingclient.api.BillingResult p0)
	{
		n_onBillingSetupFinished (p0);
	}

	private native void n_onBillingSetupFinished (com.android.billingclient.api.BillingResult p0);

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
