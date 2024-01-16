// Generated by view binder compiler. Do not edit!
package com.example.mcproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mcproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityStartupAnimatedSplashBinding implements ViewBinding {
  @NonNull
  private final MotionLayout rootView;

  @NonNull
  public final ImageView logoSplash;

  @NonNull
  public final MotionLayout motionLayout;

  private ActivityStartupAnimatedSplashBinding(@NonNull MotionLayout rootView,
      @NonNull ImageView logoSplash, @NonNull MotionLayout motionLayout) {
    this.rootView = rootView;
    this.logoSplash = logoSplash;
    this.motionLayout = motionLayout;
  }

  @Override
  @NonNull
  public MotionLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStartupAnimatedSplashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStartupAnimatedSplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_startup_animated_splash, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStartupAnimatedSplashBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.logoSplash;
      ImageView logoSplash = ViewBindings.findChildViewById(rootView, id);
      if (logoSplash == null) {
        break missingId;
      }

      MotionLayout motionLayout = (MotionLayout) rootView;

      return new ActivityStartupAnimatedSplashBinding((MotionLayout) rootView, logoSplash,
          motionLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}