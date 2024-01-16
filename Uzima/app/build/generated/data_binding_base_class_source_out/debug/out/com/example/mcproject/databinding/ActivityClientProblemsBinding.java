// Generated by view binder compiler. Do not edit!
package com.example.mcproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mcproject.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityClientProblemsBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final MaterialButton btnRegClientProblems;

  @NonNull
  public final MaterialCardView cardAddiction;

  @NonNull
  public final MaterialCardView cardAnger;

  @NonNull
  public final MaterialCardView cardAnxiety;

  @NonNull
  public final MaterialCardView cardCareer;

  @NonNull
  public final MaterialCardView cardDepression;

  @NonNull
  public final MaterialCardView cardEating;

  @NonNull
  public final MaterialCardView cardFamily;

  @NonNull
  public final MaterialCardView cardGrief;

  @NonNull
  public final MaterialCardView cardLGBTQ;

  @NonNull
  public final MaterialCardView cardMental;

  @NonNull
  public final MaterialCardView cardParenting;

  @NonNull
  public final MaterialCardView cardRelationship;

  @NonNull
  public final MaterialCardView cardSelf;

  @NonNull
  public final MaterialCardView cardSleep;

  @NonNull
  public final MaterialCardView cardStress;

  @NonNull
  public final MaterialCardView cardTrauma;

  private ActivityClientProblemsBinding(@NonNull ScrollView rootView,
      @NonNull MaterialButton btnRegClientProblems, @NonNull MaterialCardView cardAddiction,
      @NonNull MaterialCardView cardAnger, @NonNull MaterialCardView cardAnxiety,
      @NonNull MaterialCardView cardCareer, @NonNull MaterialCardView cardDepression,
      @NonNull MaterialCardView cardEating, @NonNull MaterialCardView cardFamily,
      @NonNull MaterialCardView cardGrief, @NonNull MaterialCardView cardLGBTQ,
      @NonNull MaterialCardView cardMental, @NonNull MaterialCardView cardParenting,
      @NonNull MaterialCardView cardRelationship, @NonNull MaterialCardView cardSelf,
      @NonNull MaterialCardView cardSleep, @NonNull MaterialCardView cardStress,
      @NonNull MaterialCardView cardTrauma) {
    this.rootView = rootView;
    this.btnRegClientProblems = btnRegClientProblems;
    this.cardAddiction = cardAddiction;
    this.cardAnger = cardAnger;
    this.cardAnxiety = cardAnxiety;
    this.cardCareer = cardCareer;
    this.cardDepression = cardDepression;
    this.cardEating = cardEating;
    this.cardFamily = cardFamily;
    this.cardGrief = cardGrief;
    this.cardLGBTQ = cardLGBTQ;
    this.cardMental = cardMental;
    this.cardParenting = cardParenting;
    this.cardRelationship = cardRelationship;
    this.cardSelf = cardSelf;
    this.cardSleep = cardSleep;
    this.cardStress = cardStress;
    this.cardTrauma = cardTrauma;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityClientProblemsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityClientProblemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_client_problems, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityClientProblemsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnRegClientProblems;
      MaterialButton btnRegClientProblems = ViewBindings.findChildViewById(rootView, id);
      if (btnRegClientProblems == null) {
        break missingId;
      }

      id = R.id.cardAddiction;
      MaterialCardView cardAddiction = ViewBindings.findChildViewById(rootView, id);
      if (cardAddiction == null) {
        break missingId;
      }

      id = R.id.cardAnger;
      MaterialCardView cardAnger = ViewBindings.findChildViewById(rootView, id);
      if (cardAnger == null) {
        break missingId;
      }

      id = R.id.cardAnxiety;
      MaterialCardView cardAnxiety = ViewBindings.findChildViewById(rootView, id);
      if (cardAnxiety == null) {
        break missingId;
      }

      id = R.id.cardCareer;
      MaterialCardView cardCareer = ViewBindings.findChildViewById(rootView, id);
      if (cardCareer == null) {
        break missingId;
      }

      id = R.id.cardDepression;
      MaterialCardView cardDepression = ViewBindings.findChildViewById(rootView, id);
      if (cardDepression == null) {
        break missingId;
      }

      id = R.id.cardEating;
      MaterialCardView cardEating = ViewBindings.findChildViewById(rootView, id);
      if (cardEating == null) {
        break missingId;
      }

      id = R.id.cardFamily;
      MaterialCardView cardFamily = ViewBindings.findChildViewById(rootView, id);
      if (cardFamily == null) {
        break missingId;
      }

      id = R.id.cardGrief;
      MaterialCardView cardGrief = ViewBindings.findChildViewById(rootView, id);
      if (cardGrief == null) {
        break missingId;
      }

      id = R.id.cardLGBTQ;
      MaterialCardView cardLGBTQ = ViewBindings.findChildViewById(rootView, id);
      if (cardLGBTQ == null) {
        break missingId;
      }

      id = R.id.cardMental;
      MaterialCardView cardMental = ViewBindings.findChildViewById(rootView, id);
      if (cardMental == null) {
        break missingId;
      }

      id = R.id.cardParenting;
      MaterialCardView cardParenting = ViewBindings.findChildViewById(rootView, id);
      if (cardParenting == null) {
        break missingId;
      }

      id = R.id.cardRelationship;
      MaterialCardView cardRelationship = ViewBindings.findChildViewById(rootView, id);
      if (cardRelationship == null) {
        break missingId;
      }

      id = R.id.cardSelf;
      MaterialCardView cardSelf = ViewBindings.findChildViewById(rootView, id);
      if (cardSelf == null) {
        break missingId;
      }

      id = R.id.cardSleep;
      MaterialCardView cardSleep = ViewBindings.findChildViewById(rootView, id);
      if (cardSleep == null) {
        break missingId;
      }

      id = R.id.cardStress;
      MaterialCardView cardStress = ViewBindings.findChildViewById(rootView, id);
      if (cardStress == null) {
        break missingId;
      }

      id = R.id.cardTrauma;
      MaterialCardView cardTrauma = ViewBindings.findChildViewById(rootView, id);
      if (cardTrauma == null) {
        break missingId;
      }

      return new ActivityClientProblemsBinding((ScrollView) rootView, btnRegClientProblems,
          cardAddiction, cardAnger, cardAnxiety, cardCareer, cardDepression, cardEating, cardFamily,
          cardGrief, cardLGBTQ, cardMental, cardParenting, cardRelationship, cardSelf, cardSleep,
          cardStress, cardTrauma);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
