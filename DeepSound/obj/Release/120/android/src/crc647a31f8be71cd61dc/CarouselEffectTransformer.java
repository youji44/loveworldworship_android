package crc647a31f8be71cd61dc;


public class CarouselEffectTransformer
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.viewpager.widget.ViewPager.PageTransformer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_transformPage:(Landroid/view/View;F)V:GetTransformPage_Landroid_view_View_FHandler:AndroidX.ViewPager.Widget.ViewPager/IPageTransformerInvoker, Xamarin.AndroidX.ViewPager\n" +
			"";
		mono.android.Runtime.register ("DeepSound.Helpers.CacheLoaders.CarouselEffectTransformer, DeepSound", CarouselEffectTransformer.class, __md_methods);
	}


	public CarouselEffectTransformer ()
	{
		super ();
		if (getClass () == CarouselEffectTransformer.class)
			mono.android.TypeManager.Activate ("DeepSound.Helpers.CacheLoaders.CarouselEffectTransformer, DeepSound", "", this, new java.lang.Object[] {  });
	}


	public void transformPage (android.view.View p0, float p1)
	{
		n_transformPage (p0, p1);
	}

	private native void n_transformPage (android.view.View p0, float p1);

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
