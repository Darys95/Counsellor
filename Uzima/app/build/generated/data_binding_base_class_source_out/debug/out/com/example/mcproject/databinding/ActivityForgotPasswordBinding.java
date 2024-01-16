// Generated by view binder compiler. Do not edit!
package com.example.mcproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mcproject.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityForgotPasswordBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final MaterialButton buttonNext;

  @NonNull
  public final EditText inputConfirmNewPass;

  @NonNull
  public final EditText inputUsername;

  private ActivityForgotPasswordBinding(@NonNull ScrollView rootView,
      @NonNull MaterialButton buttonNext, @NonNull EditText inputConfirmNewPass,
      @NonNull EditText inputUsername) {
    this.rootView = rootView;
    this.buttonNext = buttonNext;
    this.inputConfirmNewPass = inputConfirmNewPass;
    this.inputUsername = inputUsername;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_forgot_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityForgotPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonNext;
      MaterialButton buttonNext = ViewBindings.findChildViewById(rootView, id);
      if (buttonNext == null) {
        break missingId;
      }

      id = R.id.inputConfirmNewPass;
      EditText inputConfirmNewPass = ViewBindings.findChildViewById(rootView, id);
      if (inputConfirmNewPass == null) {
        break missingId;
      }

      id = R.id.inputUsername;
      EditText inputUsername = ViewBindings.findChildViewById(rootView, id);
      if (inputUsername == null) {
        break missingId;
      }

      return new ActivityForgotPasswordBinding((ScrollView) rootView, buttonNext,
          inputConfirmNewPass, inputUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
