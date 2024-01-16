// Generated by view binder compiler. Do not edit!
package com.example.mcproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mcproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUsersListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView Chats;

  @NonNull
  public final TextView ErrorMessage;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final AppCompatImageView imageMoreOptions;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView usersRecyclerView;

  private ActivityUsersListBinding(@NonNull ConstraintLayout rootView, @NonNull TextView Chats,
      @NonNull TextView ErrorMessage, @NonNull FrameLayout frameLayout,
      @NonNull AppCompatImageView imageMoreOptions, @NonNull ProgressBar progressBar,
      @NonNull RecyclerView usersRecyclerView) {
    this.rootView = rootView;
    this.Chats = Chats;
    this.ErrorMessage = ErrorMessage;
    this.frameLayout = frameLayout;
    this.imageMoreOptions = imageMoreOptions;
    this.progressBar = progressBar;
    this.usersRecyclerView = usersRecyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUsersListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUsersListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_users_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUsersListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Chats;
      TextView Chats = ViewBindings.findChildViewById(rootView, id);
      if (Chats == null) {
        break missingId;
      }

      id = R.id.ErrorMessage;
      TextView ErrorMessage = ViewBindings.findChildViewById(rootView, id);
      if (ErrorMessage == null) {
        break missingId;
      }

      id = R.id.frameLayout;
      FrameLayout frameLayout = ViewBindings.findChildViewById(rootView, id);
      if (frameLayout == null) {
        break missingId;
      }

      id = R.id.imageMoreOptions;
      AppCompatImageView imageMoreOptions = ViewBindings.findChildViewById(rootView, id);
      if (imageMoreOptions == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.usersRecyclerView;
      RecyclerView usersRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (usersRecyclerView == null) {
        break missingId;
      }

      return new ActivityUsersListBinding((ConstraintLayout) rootView, Chats, ErrorMessage,
          frameLayout, imageMoreOptions, progressBar, usersRecyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
