// Generated by view binder compiler. Do not edit!
package com.example.digitalrestaurant.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.digitalrestaurant.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContactsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView adaC;

  @NonNull
  public final TextView approkoC;

  @NonNull
  public final TextView obandeC;

  @NonNull
  public final TextView obandeC2;

  @NonNull
  public final TextView stainlessC;

  private ContactsBinding(@NonNull ConstraintLayout rootView, @NonNull TextView adaC,
      @NonNull TextView approkoC, @NonNull TextView obandeC, @NonNull TextView obandeC2,
      @NonNull TextView stainlessC) {
    this.rootView = rootView;
    this.adaC = adaC;
    this.approkoC = approkoC;
    this.obandeC = obandeC;
    this.obandeC2 = obandeC2;
    this.stainlessC = stainlessC;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContactsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContactsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.contacts, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContactsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adaC;
      TextView adaC = ViewBindings.findChildViewById(rootView, id);
      if (adaC == null) {
        break missingId;
      }

      id = R.id.approkoC;
      TextView approkoC = ViewBindings.findChildViewById(rootView, id);
      if (approkoC == null) {
        break missingId;
      }

      id = R.id.obandeC;
      TextView obandeC = ViewBindings.findChildViewById(rootView, id);
      if (obandeC == null) {
        break missingId;
      }

      id = R.id.obandeC2;
      TextView obandeC2 = ViewBindings.findChildViewById(rootView, id);
      if (obandeC2 == null) {
        break missingId;
      }

      id = R.id.stainlessC;
      TextView stainlessC = ViewBindings.findChildViewById(rootView, id);
      if (stainlessC == null) {
        break missingId;
      }

      return new ContactsBinding((ConstraintLayout) rootView, adaC, approkoC, obandeC, obandeC2,
          stainlessC);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
