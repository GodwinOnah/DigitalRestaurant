// Generated by view binder compiler. Do not edit!
package com.example.digitalrestaurant.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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

public final class RestaurantPageContainerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ConstraintLayout restaurantImage;

  @NonNull
  public final TextView restaurantLocation;

  @NonNull
  public final TextView restaurantName;

  @NonNull
  public final TextView restaurantNationality;

  @NonNull
  public final TextView textView4;

  private RestaurantPageContainerBinding(@NonNull LinearLayout rootView,
      @NonNull ConstraintLayout restaurantImage, @NonNull TextView restaurantLocation,
      @NonNull TextView restaurantName, @NonNull TextView restaurantNationality,
      @NonNull TextView textView4) {
    this.rootView = rootView;
    this.restaurantImage = restaurantImage;
    this.restaurantLocation = restaurantLocation;
    this.restaurantName = restaurantName;
    this.restaurantNationality = restaurantNationality;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RestaurantPageContainerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RestaurantPageContainerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.restaurant_page_container, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RestaurantPageContainerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.restaurantImage;
      ConstraintLayout restaurantImage = ViewBindings.findChildViewById(rootView, id);
      if (restaurantImage == null) {
        break missingId;
      }

      id = R.id.restaurantLocation;
      TextView restaurantLocation = ViewBindings.findChildViewById(rootView, id);
      if (restaurantLocation == null) {
        break missingId;
      }

      id = R.id.restaurantName;
      TextView restaurantName = ViewBindings.findChildViewById(rootView, id);
      if (restaurantName == null) {
        break missingId;
      }

      id = R.id.restaurantNationality;
      TextView restaurantNationality = ViewBindings.findChildViewById(rootView, id);
      if (restaurantNationality == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new RestaurantPageContainerBinding((LinearLayout) rootView, restaurantImage,
          restaurantLocation, restaurantName, restaurantNationality, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}