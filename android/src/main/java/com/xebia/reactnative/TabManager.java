package com.xebia.reactnative;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import java.util.Map;

public class TabManager extends SimpleViewManager<ReactTabStub> {
  public static final String REACT_CLASS = "Tab";

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  protected ReactTabStub createViewInstance(ThemedReactContext themedReactContext) {
    return new ReactTabStub(themedReactContext);
  }

  @ReactProp(name = "name")
  public void setName(ReactTabStub view, String name) {
    view.setName(name);
  }

  @ReactProp(name = "iconResId")
  public void setIconResId(ReactTabStub view, String iconResId) {
    view.setIconResId(iconResId);
  }

  @ReactProp(name = "iconPackage")
  public void setIconPackage(ReactTabStub view, String iconPackage) {
    view.setIconPackage(iconPackage);
  }

  @ReactProp(name = "iconUri")
  public void setIconUri(ReactTabStub view, String iconUri) {
    view.setIconUri(iconUri);
  }

  @ReactProp(name = "iconSize")
  public void setIconSize(ReactTabStub view, int iconSize) {
    view.setIconSize(iconSize);
  }

  @ReactProp(name = "textColor")
  public void setTextColor(ReactTabStub view, int textColor) {
    view.setTextColor(textColor);
  }

  @Override
  public void setAccessibilityLabel(ReactTabStub view, String accessibilityLabel) {
    view.setAccessibilityLabel(accessibilityLabel);
  }

  @Override
  public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
    return MapBuilder.of(
        TabSelectedEvent.EVENT_NAME, (Object) MapBuilder.of("registrationName", "onTabSelected")
    );
  }
}
