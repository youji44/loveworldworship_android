package crc64f66943f4aa4682ee;


public class RowSoundLiteAdapterViewHolder
	extends androidx.recyclerview.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("DeepSound.Activities.Songs.Adapters.RowSoundLiteAdapterViewHolder, DeepSound", RowSoundLiteAdapterViewHolder.class, __md_methods);
	}


	public RowSoundLiteAdapterViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == RowSoundLiteAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("DeepSound.Activities.Songs.Adapters.RowSoundLiteAdapterViewHolder, DeepSound", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}

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
