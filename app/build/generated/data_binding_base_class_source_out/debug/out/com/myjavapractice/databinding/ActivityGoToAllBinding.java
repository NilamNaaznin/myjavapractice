// Generated by data binding compiler. Do not edit!
package com.myjavapractice.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.myjavapractice.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityGoToAllBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btn1;

  @NonNull
  public final MaterialButton btn2;

  @NonNull
  public final MaterialButton btn3;

  protected ActivityGoToAllBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btn1, MaterialButton btn2, MaterialButton btn3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btn1 = btn1;
    this.btn2 = btn2;
    this.btn3 = btn3;
  }

  @NonNull
  public static ActivityGoToAllBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_go_to_all, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityGoToAllBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityGoToAllBinding>inflateInternal(inflater, R.layout.activity_go_to_all, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityGoToAllBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_go_to_all, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityGoToAllBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityGoToAllBinding>inflateInternal(inflater, R.layout.activity_go_to_all, null, false, component);
  }

  public static ActivityGoToAllBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityGoToAllBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityGoToAllBinding)bind(component, view, R.layout.activity_go_to_all);
  }
}