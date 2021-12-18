package utilities;

import org.openqa.selenium.By;

public class Locators {
    //email and pass
    public static By leftSidebar = By.id("com.global.foodpanda.android:id/startIconImageView");
    public static By loginBtn = By.id("com.global.foodpanda.android:id/userNameTextView");
    public static By loginBtnWithEmail = By.id("com.global.foodpanda.android:id/coreButtonTitleTextView");
    public static By emailField = By.id("com.global.foodpanda.android:id/inputFieldEditText");
    public static By emailFieldConfirm = By.id("com.global.foodpanda.android:id/coreButtonTitleTextView");
    public static By passwordField = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
    // public static By passwordField = By.id("com.global.foodpanda.android:id/inputFieldEditText");
    public static By loginConfirm = By.id("com.global.foodpanda.android:id/coreButtonTitleTextView");
    public static String emailText = "af.qups@gmail.com";
    public static String passwordText = "asdfgh123";

    // location
    public static By enterMyLocation = By.className("android.widget.TextView");
    public static By confirmLoc = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");


    //bottom nav bar
    public static By postBtn = By.id("com.bikroy:id/btn_post");
    public static By homeBtn = By.id("com.bikroy:id/main_bottom_panel_home");
    public static By searchBtn = By.id("com.bikroy:id/main_bottom_panel_search");
    public static By chatBtn = By.id("com.bikroy:id/main_bottom_panel_chat");
    public static By profileBtn = By.id("com.bikroy:id/main_bottom_panel_my_account");

    //register activity
    public static By activityClose = By.id("com.bikroy:id/register_activity_close");
    public static By signUp_email_btn = By.id("com.bikroy:id/sign_in_sign_up_email_button");


    public static By noAccountBtn = By.id("com.bikroy:id/register_have_account_text");
    public static By signUpBtn = By.id("com.bikroy:id/register_signup_button");
    public static By forgotPassBtn = By.id("com.bikroy:id/register_forgot_password");

    //profile screen
    public static By logoutBtn = By.id("com.global.foodpanda.android:id/coreButtonTitleTextView");


    //Account Page
    public static By myAds = By.id("com.bikroy:id/my_account_my_ads");
    public static By myMembership = By.id("com.bikroy:id/my_account_my_membership");

    public static By allSidebarMenu = By.id("com.global.foodpanda.android:id/itemTitle");
    // fav sec
    public static By deliveryOrPickup = By.className("android.widget.RadioButton");
    public static By resOrShops = By.className("android.widget.TextView");
    // order sec
    public static By browseResturent = By.id("com.global.foodpanda.android:id/coreButtonTitleTextView");
    // address sec
    public static By addAddress = By.id("com.global.foodpanda.android:id/coreButtonTitleTextView");
    // challengesAndRewards
    public static By badges = By.xpath("//android.widget.LinearLayout[@content-desc=\"Badges\"]/android.widget.TextView");
    public static By rewards = By.xpath("//android.widget.LinearLayout[@content-desc=\"Rewards shop\"]/android.widget.TextView");
    // vouchers
    public static By past = By.xpath("//android.widget.LinearLayout[@content-desc=\"Past\"]/android.widget.TextView");
    //setting sec
    public static By languageEdit = By.id("com.global.foodpanda.android:id/editLang");
    public static By languageSelect = By.id("android:id/text1");
    public static By languageSelectConfirm = By.id("android:id/button1");
    public static By tick_untick = By.id("com.global.foodpanda.android:id/marketing_push_notifications");

    public static By TAndCAndData = By.id("com.global.foodpanda.android:id/page_text");

    public static By myProfile = By.id("com.bikroy:id/my_account_my_resume");
    public static By backButton = By.className("android.widget.ImageButton");

    //Search
    public static By clickSearchFiled = By.id("com.bikroy:id/my_account_my_resume");
    public static By sendDataToSearchFiled = By.id("com.global.foodpanda.android:id/searchEditText");
    public static By clickShop = By.xpath("//android.widget.LinearLayout[@content-desc=\"Shops\"]/android.widget.TextView");

    //order food
    public static By clickFoodDelivery = By.className("android.widget.ImageView");
    public static By clickFoodItem = By.className("android.view.ViewGroup");
    public static By clickAddToCart = By.id("com.global.foodpanda.android:id/coreButtonTitleTextView");
    public static By clickViewCart = By.id("com.global.foodpanda.android:id/coreButtonTitleTextView");
    public static By reviewPaymentAndAddress = By.id("com.global.foodpanda.android:id/coreButtonTitleTextView");
    //assert elements class names
    public static String headingElements = "android.widget.TextView";
    public static String adSliderItems = "android.widget.FrameLayout";

    //search item
    public static By editSearchField = By.id("com.bikroy:id/edit_search");
    public static By searchBox = By.id("com.bikroy:id/search_verticals");
}
