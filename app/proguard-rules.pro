-keep class com.sevtinge.cemiuiler.XposedInit
-keep class com.sevtinge.cemiuiler.module.SystemFrameworkForCorePatch
-keep class moralnorm.**{*;}
-keep class com.sevtinge.cemiuiler.utils.Helpers{boolean isModuleActive;}
-keep class com.sevtinge.cemiuiler.utils.Helpers{int XposedVersion;}
-keep class * extends com.sevtinge.cemiuiler.module.base.BaseHook
-keep class com.sevtinge.cemiuiler.ui.HideAppActivity
-keep class * extends com.sevtinge.cemiuiler.ui.fragment.base.*
-keep class miui.drm.**{*;}
-dontwarn android.app.ActivityTaskManager$RootTaskInfo
-dontwarn miui.app.MiuiFreeFormManager$MiuiFreeFormStackInfo
-allowaccessmodification
-overloadaggressively
