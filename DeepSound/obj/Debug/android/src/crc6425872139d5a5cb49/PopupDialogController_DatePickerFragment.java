package crc6425872139d5a5cb49;


public class PopupDialogController_DatePickerFragment
	extends androidx.fragment.app.DialogFragment
	implements
		mono.android.IGCUserPeer,
		android.app.DatePickerDialog.OnDateSetListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateDialog:(Landroid/os/Bundle;)Landroid/app/Dialog;:GetOnCreateDialog_Landroid_os_Bundle_Handler\n" +
			"n_onDateSet:(Landroid/widget/DatePicker;III)V:GetOnDateSet_Landroid_widget_DatePicker_IIIHandler:Android.App.DatePickerDialog/IOnDateSetListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("DeepSound.Helpers.Controller.PopupDialogController+DatePickerFragment, DeepSound", PopupDialogController_DatePickerFragment.class, __md_methods);
	}


	public PopupDialogController_DatePickerFragment ()
	{
		super ();
		if (getClass () == PopupDialogController_DatePickerFragment.class) {
			mono.android.TypeManager.Activate ("DeepSound.Helpers.Controller.PopupDialogController+DatePickerFragment, DeepSound", "", this, new java.lang.Object[] {  });
		}
	}


	public PopupDialogController_DatePickerFragment (int p0)
	{
		super (p0);
		if (getClass () == PopupDialogController_DatePickerFragment.class) {
			mono.android.TypeManager.Activate ("DeepSound.Helpers.Controller.PopupDialogController+DatePickerFragment, DeepSound", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
		}
	}


	public android.app.Dialog onCreateDialog (android.os.Bundle p0)
	{
		return n_onCreateDialog (p0);
	}

	private native android.app.Dialog n_onCreateDialog (android.os.Bundle p0);


	public void onDateSet (android.widget.DatePicker p0, int p1, int p2, int p3)
	{
		n_onDateSet (p0, p1, p2, p3);
	}

	private native void n_onDateSet (android.widget.DatePicker p0, int p1, int p2, int p3);

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
