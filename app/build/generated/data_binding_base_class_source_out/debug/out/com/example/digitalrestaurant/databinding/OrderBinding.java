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

public final class OrderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView adaFoodName;

  @NonNull
  public final TextView adaFoodNationality;

  @NonNull
  public final TextView adaPrice;

  @NonNull
  public final ConstraintLayout adarestaurantcard;

  @NonNull
  public final TextView addToCart;

  @NonNull
  public final ConstraintLayout constraintLayout2;

  @NonNull
  public final TextView minus;

  @NonNull
  public final TextView orderbtn;

  @NonNull
  public final ConstraintLayout orderingContainer;

  @NonNull
  public final TextView plus;

  @NonNull
  public final TextView poundSign;

  private OrderBinding(@NonNull LinearLayout rootView, @NonNull TextView adaFoodName,
      @NonNull TextView adaFoodNationality, @NonNull TextView adaPrice,
      @NonNull ConstraintLayout adarestaurantcard, @NonNull TextView addToCart,
      @NonNull ConstraintLayout constraintLayout2, @NonNull TextView minus,
      @NonNull TextView orderbtn, @NonNull ConstraintLayout orderingContainer,
      @NonNull TextView plus, @NonNull TextView poundSign) {
    this.rootView = rootView;
    this.adaFoodName = adaFoodName;
    this.adaFoodNationality = adaFoodNationality;
    this.adaPrice = adaPrice;
    this.adarestaurantcard = adarestaurantcard;
    this.addToCart = addToCart;
    this.constraintLayout2 = constraintLayout2;
    this.minus = minus;
    this.orderbtn = orderbtn;
    this.orderingContainer = orderingContainer;
    this.plus = plus;
    this.poundSign = poundSign;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static OrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OrderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.order, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OrderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adaFoodName;
      TextView adaFoodName = ViewBindings.findChildViewById(rootView, id);
      if (adaFoodName == null) {
        break missingId;
      }

      id = R.id.adaFoodNationality;
      TextView adaFoodNationality = ViewBindings.findChildViewById(rootView, id);
      if (adaFoodNationality == null) {
        break missingId;
      }

      id = R.id.adaPrice;
      TextView adaPrice = ViewBindings.findChildViewById(rootView, id);
      if (adaPrice == null) {
        break missingId;
      }

      id = R.id.adarestaurantcard;
      ConstraintLayout adarestaurantcard = ViewBindings.findChildViewById(rootView, id);
      if (adarestaurantcard == null) {
        break missingId;
      }

      id = R.id.addToCart;
      TextView addToCart = ViewBindings.findChildViewById(rootView, id);
      if (addToCart == null) {
        break missingId;
      }

      id = R.id.constraintLayout2;
      ConstraintLayout constraintLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout2 == null) {
        break missingId;
      }

      id = R.id.minus;
      TextView minus = ViewBindings.findChildViewById(rootView, id);
      if (minus == null) {
        break missingId;
      }

      id = R.id.orderbtn;
      TextView orderbtn = ViewBindings.findChildViewById(rootView, id);
      if (orderbtn == null) {
        break missingId;
      }

      id = R.id.ordering_container;
      ConstraintLayout orderingContainer = ViewBindings.findChildViewById(rootView, id);
      if (orderingContainer == null) {
        break missingId;
      }

      id = R.id.plus;
      TextView plus = ViewBindings.findChildViewById(rootView, id);
      if (plus == null) {
        break missingId;
      }

      id = R.id.poundSign;
      TextView poundSign = ViewBindings.findChildViewById(rootView, id);
      if (poundSign == null) {
        break missingId;
      }

      return new OrderBinding((LinearLayout) rootView, adaFoodName, adaFoodNationality, adaPrice,
          adarestaurantcard, addToCart, constraintLayout2, minus, orderbtn, orderingContainer, plus,
          poundSign);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}