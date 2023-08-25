package com.facebook.fbreact.specs;

import androidx.annotation.Nullable;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculatorPackage extends TurboReactPackage {

  @Nullable
  @Override
  public NativeModule getModule(
    String name,
    ReactApplicationContext reactContext
  ) {
    if (name.equals(CalculatorModule.NAME)) {
      return new CalculatorModule(reactContext);
    } else if (name.equals(NativeSampleModule.NAME)) {
      return new NativeSampleModule(reactContext);
    } else {
      return null;
    }
  }

  @Override
  public ReactModuleInfoProvider getReactModuleInfoProvider() {
    return () -> {
      final Map<String, ReactModuleInfo> moduleInfos = new HashMap<>();
      moduleInfos.put(
        CalculatorModule.NAME,
        new ReactModuleInfo(
          CalculatorModule.NAME, 
                "RTNCalculator",
          false, // canOverrideExistingModule
          false, // needsEagerInit
          true, // hasConstants
          false, // isCxxModule
          true // isTurboModule
        )
      );
      moduleInfos.put(
        NativeSampleModule.NAME,
        new ReactModuleInfo(
          NativeSampleModule.NAME,
                "NativeSampleModule",
          false, // canOverrideExistingModule
          false, // needsEagerInit
          true, // hasConstants
          false, // isCxxModule
          true // isTurboModule
        )
      );
      return moduleInfos;
    };
  }
}
