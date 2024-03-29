// Generated by view binder compiler. Do not edit!
package com.example.mcproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mcproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWelcomeCounsellorBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView backUpPin;

  @NonNull
  public final Button btnLoad;

  @NonNull
  public final TextView counsellorName;

  private ActivityWelcomeCounsellorBinding(@NonNull ScrollView rootView,
      @NonNull TextView backUpPin, @NonNull Button btnLoad, @NonNull TextView counsellorName) {
    this.rootView = rootView;
    this.backUpPin = backUpPin;
    this.btnLoad = btnLoad;
    this.counsellorName = counsellorName;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWelcomeCounsellorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWelcomeCounsellorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_welcome_counsellor, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWelcomeCounsellorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backUpPin;
      TextView backUpPin = ViewBindings.findChildViewById(rootView, id);
      if (backUpPin == null) {
        break missingId;
      }

      id = R.id.btnLoad;
      Button btnLoad = ViewBindings.findChildViewById(rootView, id);
      if (btnLoad == null) {
        break missingId;
      }

      id = R.id.counsellorName;
      TextView counsellorName = ViewBindings.findChildViewById(rootView, id);
      if (counsellorName == null) {
        break missingId;
      }

      return new ActivityWelcomeCounsellorBinding((ScrollView) rootView, backUpPin, btnLoad,
          counsellorName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
