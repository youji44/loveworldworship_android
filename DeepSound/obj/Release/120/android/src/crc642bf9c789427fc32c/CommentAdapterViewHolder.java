package crc642bf9c789427fc32c;


public class CommentAdapterViewHolder
	extends androidx.recyclerview.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("DeepSound.Activities.Comments.Adapters.CommentAdapterViewHolder, DeepSound", CommentAdapterViewHolder.class, __md_methods);
	}


	public CommentAdapterViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == CommentAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("DeepSound.Activities.Comments.Adapters.CommentAdapterViewHolder, DeepSound", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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