// Generated by data binding compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.myapplication.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final TextView Follow;

  @NonNull
  public final TextView Follower;

  @NonNull
  public final TextView Photo;

  @NonNull
  public final ImageView anh4;

  @NonNull
  public final ImageView anh5;

  @NonNull
  public final Button buttonCheck;

  @NonNull
  public final TextView codeFollow;

  @NonNull
  public final TextView codeFollower;

  @NonNull
  public final TextView codePhoto;

  @NonNull
  public final Group group;

  @NonNull
  public final ImageView image4;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView username;

  @Bindable
  protected String mName;

  @Bindable
  protected String mAdd;

  @Bindable
  protected String mPhoto;

  @Bindable
  protected String mFollower;

  @Bindable
  protected String mFollow;

  @Bindable
  protected String mCodeCheck;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView Follow, TextView Follower, TextView Photo, ImageView anh4, ImageView anh5,
      Button buttonCheck, TextView codeFollow, TextView codeFollower, TextView codePhoto,
      Group group, ImageView image4, TextView textView, TextView textView2, TextView username) {
    super(_bindingComponent, _root, _localFieldCount);
    this.Follow = Follow;
    this.Follower = Follower;
    this.Photo = Photo;
    this.anh4 = anh4;
    this.anh5 = anh5;
    this.buttonCheck = buttonCheck;
    this.codeFollow = codeFollow;
    this.codeFollower = codeFollower;
    this.codePhoto = codePhoto;
    this.group = group;
    this.image4 = image4;
    this.textView = textView;
    this.textView2 = textView2;
    this.username = username;
  }

  public abstract void setName(@Nullable String name);

  @Nullable
  public String getName() {
    return mName;
  }

  public abstract void setAdd(@Nullable String add);

  @Nullable
  public String getAdd() {
    return mAdd;
  }

  public abstract void setPhoto(@Nullable String photo);

  @Nullable
  public String getPhoto() {
    return mPhoto;
  }

  public abstract void setFollower(@Nullable String follower);

  @Nullable
  public String getFollower() {
    return mFollower;
  }

  public abstract void setFollow(@Nullable String follow);

  @Nullable
  public String getFollow() {
    return mFollow;
  }

  public abstract void setCodeCheck(@Nullable String codeCheck);

  @Nullable
  public String getCodeCheck() {
    return mCodeCheck;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
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
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
