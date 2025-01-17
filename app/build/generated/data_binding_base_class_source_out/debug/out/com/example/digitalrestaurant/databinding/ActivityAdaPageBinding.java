// Generated by view binder compiler. Do not edit!
package com.example.digitalrestaurant.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.digitalrestaurant.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdaPageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView adaMainRecycler;

  @NonNull
  public final Button adaclearer;

  @NonNull
  public final ConstraintLayout constraintLayout5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  private ActivityAdaPageBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView adaMainRecycler, @NonNull Button adaclearer,
      @NonNull ConstraintLayout constraintLayout5, @NonNull TextView textView6,
      @NonNull TextView textView7) {
    this.rootView = rootView;
    this.adaMainRecycler = adaMainRecycler;
    this.adaclearer = adaclearer;
    this.constraintLayout5 = constraintLayout5;
    this.textView6 = textView6;
    this.textView7 = textView7;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdaPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdaPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_ada_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdaPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adaMainRecycler;
      RecyclerView adaMainRecycler = ViewBindings.findChildViewById(rootView, id);
      if (adaMainRecycler == null) {
        break missingId;
      }

      id = R.id.adaclearer;
      Button adaclearer = ViewBindings.findChildViewById(rootView, id);
      if (adaclearer == null) {
        break missingId;
      }

      id = R.id.constraintLayout5;
      ConstraintLayout constraintLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      return new ActivityAdaPageBinding((ConstraintLayout) rootView, adaMainRecycler, adaclearer,
          constraintLayout5, textView6, textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
