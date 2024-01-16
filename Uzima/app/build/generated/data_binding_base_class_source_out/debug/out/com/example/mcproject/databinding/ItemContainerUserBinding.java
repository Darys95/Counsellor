// Generated by view binder compiler. Do not edit!
package com.example.mcproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mcproject.R;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemContainerUserBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RoundedImageView imageProfile;

  @NonNull
  public final TextView title;

  @NonNull
  public final TextView txtName;

  @NonNull
  public final TextView txtRecentMsg;

  @NonNull
  public final View viewSupporter;

  private ItemContainerUserBinding(@NonNull ConstraintLayout rootView,
      @NonNull RoundedImageView imageProfile, @NonNull TextView title, @NonNull TextView txtName,
      @NonNull TextView txtRecentMsg, @NonNull View viewSupporter) {
    this.rootView = rootView;
    this.imageProfile = imageProfile;
    this.title = title;
    this.txtName = txtName;
    this.txtRecentMsg = txtRecentMsg;
    this.viewSupporter = viewSupporter;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemContainerUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemContainerUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_container_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemContainerUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageProfile;
      RoundedImageView imageProfile = ViewBindings.findChildViewById(rootView, id);
      if (imageProfile == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.txtName;
      TextView txtName = ViewBindings.findChildViewById(rootView, id);
      if (txtName == null) {
        break missingId;
      }

      id = R.id.txtRecentMsg;
      TextView txtRecentMsg = ViewBindings.findChildViewById(rootView, id);
      if (txtRecentMsg == null) {
        break missingId;
      }

      id = R.id.viewSupporter;
      View viewSupporter = ViewBindings.findChildViewById(rootView, id);
      if (viewSupporter == null) {
        break missingId;
      }

      return new ItemContainerUserBinding((ConstraintLayout) rootView, imageProfile, title, txtName,
          txtRecentMsg, viewSupporter);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}