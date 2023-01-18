﻿using System;
using System.Linq;
using Android.App;
using Android.Content;
using Android.Content.PM;
using Android.Gms.Ads.DoubleClick;
using Android.Graphics;
using Android.OS;
using Android.Views;
using Android.Widget;
using AndroidHUD;
using AndroidX.AppCompat.Content.Res;
using AndroidX.AppCompat.Widget;
using DeepSound.Activities.Base;
using DeepSound.Helpers.Ads;
using DeepSound.Helpers.Fonts;
using DeepSound.Helpers.Utils;
using DeepSoundClient.Classes.Address;
using DeepSoundClient.Requests;
using MaterialDialogsCore;
using Toolbar = AndroidX.AppCompat.Widget.Toolbar;

namespace DeepSound.Activities.Address
{
    [Activity(Icon = "@mipmap/icon", Theme = "@style/MyTheme", ConfigurationChanges = ConfigChanges.Locale | ConfigChanges.UiMode | ConfigChanges.ScreenSize | ConfigChanges.Orientation)]
    public class CreateAddressActivity : BaseActivity, MaterialDialog.IListCallback
    {
        #region Variables Basic

        private LinearLayout LayoutName, LayoutPhone, LayoutCountry, LayoutCity, LayoutZip, LayoutAddress;
        private TextView IconName, IconPhone, IconCountry, IconCity, IconZip, IconAddress;
        private EditText TxtName, TxtPhone, TxtCountry, TxtCity, TxtZip, TxtAddress;
        private AppCompatButton BtnApply;

        private PublisherAdView PublisherAdView;

        #endregion

        #region General

        protected override void OnCreate(Bundle savedInstanceState)
        {
            try
            {
                base.OnCreate(savedInstanceState);

                Methods.App.FullScreenApp(this);
                SetTheme(DeepSoundTools.IsTabDark() ? Resource.Style.MyTheme_Dark : Resource.Style.MyTheme);

                // Create your application here
                SetContentView(Resource.Layout.CreateAddressLayout);

                //Get Value And Set Toolbar
                InitComponent();
                InitToolbar();

                PublisherAdView = FindViewById<PublisherAdView>(Resource.Id.multiple_ad_sizes_view);
                AdsGoogle.InitPublisherAdView(PublisherAdView);

                AdsGoogle.Ad_RewardedVideo(this);
            }
            catch (Exception e)
            {
                Methods.DisplayReportResultTrack(e);
            }
        }

        protected override void OnResume()
        {
            try
            {
                base.OnResume();
                AddOrRemoveEvent(true);

                PublisherAdView?.Resume();
            }
            catch (Exception e)
            {
                Methods.DisplayReportResultTrack(e);
            }
        }

        protected override void OnPause()
        {
            try
            {
                base.OnPause();
                AddOrRemoveEvent(false);

                PublisherAdView?.Pause();
            }
            catch (Exception e)
            {
                Methods.DisplayReportResultTrack(e);
            }
        }

        public override void OnTrimMemory(TrimMemory level)
        {
            try
            {
                GC.Collect(GC.MaxGeneration, GCCollectionMode.Forced);
                base.OnTrimMemory(level);
            }
            catch (Exception e)
            {
                Methods.DisplayReportResultTrack(e);
            }
        }

        public override void OnLowMemory()
        {
            try
            {
                GC.Collect(GC.MaxGeneration);
                base.OnLowMemory();
            }
            catch (Exception e)
            {
                Methods.DisplayReportResultTrack(e);
            }
        }

        protected override void OnDestroy()
        {
            try
            { 
                PublisherAdView?.Destroy();
                base.OnDestroy();
            }
            catch (Exception exception)
            {
                Methods.DisplayReportResultTrack(exception);
            }
        }

        #endregion

        #region Menu

        public override bool OnOptionsItemSelected(IMenuItem item)
        {
            switch (item.ItemId)
            {
                case Android.Resource.Id.Home:
                    Finish();
                    return true;
            }
            return base.OnOptionsItemSelected(item);
        }

        #endregion

        #region Functions

        private void InitComponent()
        {
            try
            { 
                LayoutName = FindViewById<LinearLayout>(Resource.Id.LayoutName);
                IconName = FindViewById<TextView>(Resource.Id.IconName);
                TxtName = FindViewById<EditText>(Resource.Id.NameEditText);
                  
                LayoutPhone = FindViewById<LinearLayout>(Resource.Id.LayoutPhone);
                IconPhone = FindViewById<TextView>(Resource.Id.IconPhone);
                TxtPhone = FindViewById<EditText>(Resource.Id.PhoneEditText);
                 
                LayoutCountry = FindViewById<LinearLayout>(Resource.Id.LayoutCountry);
                IconCountry = FindViewById<TextView>(Resource.Id.IconCountry);
                TxtCountry = FindViewById<EditText>(Resource.Id.CountryEditText);

                LayoutCity = FindViewById<LinearLayout>(Resource.Id.LayoutCity);
                IconCity = FindViewById<TextView>(Resource.Id.IconCity);
                TxtCity = FindViewById<EditText>(Resource.Id.CityEditText);

                LayoutZip = FindViewById<LinearLayout>(Resource.Id.LayoutZip);
                IconZip = FindViewById<TextView>(Resource.Id.IconZip);
                TxtZip = FindViewById<EditText>(Resource.Id.ZipEditText);

                LayoutAddress = FindViewById<LinearLayout>(Resource.Id.LayoutAddress);
                IconAddress = FindViewById<TextView>(Resource.Id.IconAddress);
                TxtAddress = FindViewById<EditText>(Resource.Id.AddressEditText);
               
                BtnApply = FindViewById<AppCompatButton>(Resource.Id.ApplyButton);
                 
                FontUtils.SetTextViewIcon(FontsIconFrameWork.FontAwesomeRegular, IconName, FontAwesomeIcon.AddressCard);
                FontUtils.SetTextViewIcon(FontsIconFrameWork.FontAwesomeRegular, IconPhone, FontAwesomeIcon.MobileAlt);
                FontUtils.SetTextViewIcon(FontsIconFrameWork.FontAwesomeRegular, IconCountry, FontAwesomeIcon.Flag);
                FontUtils.SetTextViewIcon(FontsIconFrameWork.FontAwesomeRegular, IconCity, FontAwesomeIcon.GlobeAmericas);
                FontUtils.SetTextViewIcon(FontsIconFrameWork.FontAwesomeRegular, IconZip, FontAwesomeIcon.SortNumericDown);
                FontUtils.SetTextViewIcon(FontsIconFrameWork.FontAwesomeRegular, IconAddress, FontAwesomeIcon.MapMarkedAlt);
                 
                Methods.SetColorEditText(TxtName, DeepSoundTools.IsTabDark() ? Color.White : Color.Black);
                Methods.SetColorEditText(TxtPhone, DeepSoundTools.IsTabDark() ? Color.White : Color.Black);
                Methods.SetColorEditText(TxtCountry, DeepSoundTools.IsTabDark() ? Color.White : Color.Black);
                Methods.SetColorEditText(TxtCity, DeepSoundTools.IsTabDark() ? Color.White : Color.Black);
                Methods.SetColorEditText(TxtZip, DeepSoundTools.IsTabDark() ? Color.White : Color.Black);
                Methods.SetColorEditText(TxtAddress, DeepSoundTools.IsTabDark() ? Color.White : Color.Black);
                 
                Methods.SetFocusable(TxtCountry);
            }
            catch (Exception e)
            {
                Methods.DisplayReportResultTrack(e);
            }
        }

        private void InitToolbar()
        {
            try
            {
                var toolbar = FindViewById<Toolbar>(Resource.Id.toolbar);
                if (toolbar != null)
                {
                    toolbar.Title = GetText(Resource.String.Lbl_CreateAddress);
                    toolbar.SetTitleTextColor(DeepSoundTools.IsTabDark() ? Color.White : Color.Black);
                    SetSupportActionBar(toolbar);
                    SupportActionBar.SetDisplayShowCustomEnabled(true);
                    SupportActionBar.SetDisplayHomeAsUpEnabled(true);
                    SupportActionBar.SetHomeButtonEnabled(true);
                    SupportActionBar.SetDisplayShowHomeEnabled(true);

                    var icon = AppCompatResources.GetDrawable(this, AppSettings.FlowDirectionRightToLeft ? Resource.Drawable.icon_back_arrow_right : Resource.Drawable.icon_back_arrow_left);
                    icon?.SetTint(DeepSoundTools.IsTabDark() ? Color.White : Color.Black);
                    SupportActionBar.SetHomeAsUpIndicator(icon);

                }
            }
            catch (Exception e)
            {
                Methods.DisplayReportResultTrack(e);
            }
        }

        private void AddOrRemoveEvent(bool addEvent)
        {
            try
            {
                // true +=  // false -=
                if (addEvent)
                {
                    TxtCountry.Touch += TxtCountryOnTouch;
                    BtnApply.Click += BtnApplyOnClick;
                }
                else
                {
                    TxtCountry.Touch -= TxtCountryOnTouch;
                    BtnApply.Click -= BtnApplyOnClick;
                }
            }
            catch (Exception e)
            {
                Methods.DisplayReportResultTrack(e);
            }
        }

        #endregion

        #region Events

        private void TxtCountryOnTouch(object sender, View.TouchEventArgs e)
        {
            try
            {
                if (e.Event?.Action != MotionEventActions.Down) return;

                var countriesArray = DeepSoundTools.GetCountryList(this);
                var arrayAdapter = countriesArray.Select(item => item.Value).ToList();
                
                var dialogList = new MaterialDialog.Builder(this).Theme(DeepSoundTools.IsTabDark() ? MaterialDialogsTheme.Dark : MaterialDialogsTheme.Light);
                
                dialogList.Title(GetText(Resource.String.Lbl_Country));
                dialogList.Items(arrayAdapter);
                dialogList.NegativeText(GetText(Resource.String.Lbl_Close)).OnNegative(new MyMaterialDialog());
                dialogList.AlwaysCallSingleChoiceCallback();
                dialogList.ItemsCallback(this).Build().Show();
            }
            catch (Exception exception)
            {
                Methods.DisplayReportResultTrack(exception);
            }
        }
         
        //Click Save data Address 
        private async void BtnApplyOnClick(object sender, EventArgs e)
        {
            try
            {
                if (!Methods.CheckConnectivity())
                {
                    Toast.MakeText(this, GetString(Resource.String.Lbl_CheckYourInternetConnection), ToastLength.Short)?.Show();
                }
                else
                {
                    if (string.IsNullOrEmpty(TxtName.Text))
                    {
                        Toast.MakeText(this, GetText(Resource.String.Lbl_PleaseEnterName), ToastLength.Short)?.Show();
                        return;
                    }
                   
                    if (string.IsNullOrEmpty(TxtPhone.Text) || string.IsNullOrEmpty(TxtCountry.Text) || string.IsNullOrEmpty(TxtCity.Text) || string.IsNullOrEmpty(TxtZip.Text)|| string.IsNullOrEmpty(TxtAddress.Text))
                    {
                        Toast.MakeText(this, GetText(Resource.String.Lbl_Please_enter_your_data), ToastLength.Short)?.Show();
                        return;
                    }
                       
                    //Show a progress
                    AndHUD.Shared.Show(this, GetText(Resource.String.Lbl_Loading));
                    var (apiStatus, respond) = await RequestsAsync.Address.CreateAddressAsync(TxtName.Text, TxtPhone.Text, TxtCountry.Text , TxtCity.Text , TxtZip.Text , TxtAddress.Text); //Sent api 
                    if (apiStatus.Equals(200))
                    {
                        if (respond is CreateAddressObject result)
                        {
                            Toast.MakeText(this, GetText(Resource.String.Lbl_CreatedSuccessfully), ToastLength.Short)?.Show();
                            AndHUD.Shared.Dismiss(this);

                            Finish();
                        }
                    }
                    else
                    {
                        Methods.DisplayAndHudErrorResult(this, respond);
                    }
                }
            }
            catch (Exception exception)
            {
                Methods.DisplayReportResultTrack(exception);
                AndHUD.Shared.Dismiss(this);
            }
        }

        #endregion

        #region MaterialDialog
         
        public void OnSelection(MaterialDialog dialog, View itemView, int position, string itemString)
        {
            try
            {  
                TxtCountry.Text = itemString;
            }
            catch (Exception e)
            {
                Methods.DisplayReportResultTrack(e);
            }
        }

        #endregion

    }
}