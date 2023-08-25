package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;

public class NativeSampleModule extends NativeSampleModuleSpec {

  NativeSampleModule(ReactApplicationContext context) {
    super(context);
  }

  @Override
  public String reverseString(String input) {
    return new StringBuilder(input).reverse().toString();
  }
}
