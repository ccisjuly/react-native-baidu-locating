package com.alanwyf.baidulocation;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;
import com.alanwyf.baidulocation.BaiduLocationModule;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Created by alan on 2017/8/23.
 */

public class BaiduLocationPackage implements ReactPackage{

    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new BaiduLocationModule((reactContext)));
        return modules;
    }


    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return new ArrayList<>();
    }
}
