package com.sevtinge.cemiuiler.module;

import com.sevtinge.cemiuiler.module.base.BaseModule;
import com.sevtinge.cemiuiler.module.contentextension.DoublePress;
import com.sevtinge.cemiuiler.module.contentextension.LinkOpenMode;
import com.sevtinge.cemiuiler.module.contentextension.SuperImage;
import com.sevtinge.cemiuiler.module.contentextension.UseThirdPartyBrowser;

public class ContentExtension extends BaseModule {

    @Override
    public void handleLoadPackage() {
        initHook(new UseThirdPartyBrowser(), mPrefsMap.getBoolean("content_extension_browser"));
        initHook(new DoublePress(), mPrefsMap.getBoolean("content_extension_double_press"));
        initHook(new SuperImage(), mPrefsMap.getBoolean("content_extension_super_image"));
        initHook(new LinkOpenMode());
    }
}

