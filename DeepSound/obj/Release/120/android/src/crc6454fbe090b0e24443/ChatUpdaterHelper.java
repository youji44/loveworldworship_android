package crc6454fbe090b0e24443;


public class ChatUpdaterHelper
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		java.lang.Runnable
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_run:()V:GetRunHandler:Java.Lang.IRunnableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("DeepSound.Service.ChatUpdaterHelper, DeepSound", ChatUpdaterHelper.class, __md_methods);
	}


	public ChatUpdaterHelper ()
	{
		super ();
		if (getClass () == ChatUpdaterHelper.class)
			mono.android.TypeManager.Activate ("DeepSound.Service.ChatUpdaterHelper, DeepSound", "", this, new java.lang.Object[] {  });
	}

	public ChatUpdaterHelper (android.os.Handler p0)
	{
		super ();
		if (getClass () == ChatUpdaterHelper.class)
			mono.android.TypeManager.Activate ("DeepSound.Service.ChatUpdaterHelper, DeepSound", "Android.OS.Handler, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void run ()
	{
		n_run ();
	}

	private native void n_run ();

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
