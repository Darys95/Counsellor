// Generated by view binder compiler. Do not edit!
package com.example.mcproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mcproject.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterCounsellorBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final MaterialButton btnCounProblem;

  @NonNull
  public final EditText inputAge;

  @NonNull
  public final EditText inputConfirmPassword;

  @NonNull
  public final EditText inputEmail;

  @NonNull
  public final EditText inputFirstNames;

  @NonNull
  public final TextView inputGender;

  @NonNull
  public final TextView inputLanguage;

  @NonNull
  public final EditText inputPassword;

  @NonNull
  public final TextView inputReligion;

  @NonNull
  public final Spinner inputSpinnerGender;

  @NonNull
  public final Spinner inputSpinnerLanguage;

  @NonNull
  public final Spinner inputSpinnerReligion;

  @NonNull
  public final EditText inputSurname;

  @NonNull
  public final TextView txtAge;

  private ActivityRegisterCounsellorBinding(@NonNull ScrollView rootView,
      @NonNull MaterialButton btnCounProblem, @NonNull EditText inputAge,
      @NonNull EditText inputConfirmPassword, @NonNull EditText inputEmail,
      @NonNull EditText inputFirstNames, @NonNull TextView inputGender,
      @NonNull TextView inputLanguage, @NonNull EditText inputPassword,
      @NonNull TextView inputReligion, @NonNull Spinner inputSpinnerGender,
      @NonNull Spinner inputSpinnerLanguage, @NonNull Spinner inputSpinnerReligion,
      @NonNull EditText inputSurname, @NonNull TextView txtAge) {
    this.rootView = rootView;
    this.btnCounProblem = btnCounProblem;
    this.inputAge = inputAge;
    this.inputConfirmPassword = inputConfirmPassword;
    this.inputEmail = inputEmail;
    this.inputFirstNames = inputFirstNames;
    this.inputGender = inputGender;
    this.inputLanguage = inputLanguage;
    this.inputPassword = inputPassword;
    this.inputReligion = inputReligion;
    this.inputSpinnerGender = inputSpinnerGender;
    this.inputSpinnerLanguage = inputSpinnerLanguage;
    this.inputSpinnerReligion = inputSpinnerReligion;
    this.inputSurname = inputSurname;
    this.txtAge = txtAge;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterCounsellorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterCounsellorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register_counsellor, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterCounsellorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCounProblem;
      MaterialButton btnCounProblem = ViewBindings.findChildViewById(rootView, id);
      if (btnCounProblem == null) {
        break missingId;
      }

      id = R.id.inputAge;
      EditText inputAge = ViewBindings.findChildViewById(rootView, id);
      if (inputAge == null) {
        break missingId;
      }

      id = R.id.inputConfirmPassword;
      EditText inputConfirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (inputConfirmPassword == null) {
        break missingId;
      }

      id = R.id.inputEmail;
      EditText inputEmail = ViewBindings.findChildViewById(rootView, id);
      if (inputEmail == null) {
        break missingId;
      }

      id = R.id.inputFirstNames;
      EditText inputFirstNames = ViewBindings.findChildViewById(rootView, id);
      if (inputFirstNames == null) {
        break missingId;
      }

      id = R.id.inputGender;
      TextView inputGender = ViewBindings.findChildViewById(rootView, id);
      if (inputGender == null) {
        break missingId;
      }

      id = R.id.inputLanguage;
      TextView inputLanguage = ViewBindings.findChildViewById(rootView, id);
      if (inputLanguage == null) {
        break missingId;
      }

      id = R.id.inputPassword;
      EditText inputPassword = ViewBindings.findChildViewById(rootView, id);
      if (inputPassword == null) {
        break missingId;
      }

      id = R.id.inputReligion;
      TextView inputReligion = ViewBindings.findChildViewById(rootView, id);
      if (inputReligion == null) {
        break missingId;
      }

      id = R.id.inputSpinnerGender;
      Spinner inputSpinnerGender = ViewBindings.findChildViewById(rootView, id);
      if (inputSpinnerGender == null) {
        break missingId;
      }

      id = R.id.inputSpinnerLanguage;
      Spinner inputSpinnerLanguage = ViewBindings.findChildViewById(rootView, id);
      if (inputSpinnerLanguage == null) {
        break missingId;
      }

      id = R.id.inputSpinnerReligion;
      Spinner inputSpinnerReligion = ViewBindings.findChildViewById(rootView, id);
      if (inputSpinnerReligion == null) {
        break missingId;
      }

      id = R.id.inputSurname;
      EditText inputSurname = ViewBindings.findChildViewById(rootView, id);
      if (inputSurname == null) {
        break missingId;
      }

      id = R.id.txtAge;
      TextView txtAge = ViewBindings.findChildViewById(rootView, id);
      if (txtAge == null) {
        break missingId;
      }

      return new ActivityRegisterCounsellorBinding((ScrollView) rootView, btnCounProblem, inputAge,
          inputConfirmPassword, inputEmail, inputFirstNames, inputGender, inputLanguage,
          inputPassword, inputReligion, inputSpinnerGender, inputSpinnerLanguage,
          inputSpinnerReligion, inputSurname, txtAge);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
