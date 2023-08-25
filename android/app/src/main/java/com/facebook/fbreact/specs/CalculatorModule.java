package com.facebook.fbreact.specs;

import androidx.annotation.NonNull;
import com.facebook.fbreact.specs.NativeCalculatorSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.HashMap;
import java.util.Map;

public class CalculatorModule extends NativeCalculatorSpec {

  CalculatorModule(ReactApplicationContext context) {
    super(context);
  }
  
  @Override
  public void add(double a, double b, Promise promise) {
    promise.resolve(a + b);
  }
}
