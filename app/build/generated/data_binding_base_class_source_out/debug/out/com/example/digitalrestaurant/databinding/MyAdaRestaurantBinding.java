// Generated by view binder compiler. Do not edit!
package com.example.digitalrestaurant.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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

public final class MyAdaRestaurantBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView adaRecycler1;

  @NonNull
  public final TextView adalabel;

  @NonNull
  public final ConstraintLayout constraintLayout3;

  @NonNull
  public final TextView homeKey;

  @NonNull
  public final TextView menuKey;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextView welcometxt;

  private MyAdaRestaurantBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView adaRecycler1,
      @NonNull TextView adalabel, @NonNull ConstraintLayout constraintLayout3,
      @NonNull TextView homeKey, @NonNull TextView menuKey, @NonNull ScrollView scrollView2,
      @NonNull TextView welcometxt) {
    this.rootView = rootView;
    this.adaRecycler1 = adaRecycler1;
    this.adalabel = adalabel;
    this.constraintLayout3 = constraintLayout3;
    this.homeKey = homeKey;
    this.menuKey = menuKey;
    this.scrollView2 = scrollView2;
    this.welcometxt = welcometxt;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MyAdaRestaurantBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MyAdaRestaurantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.my_ada_restaurant, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MyAdaRestaurantBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adaRecycler1;
      RecyclerView adaRecycler1 = ViewBindings.findChildViewById(rootView, id);
      if (adaRecycler1 == null) {
        break missingId;
      }

      id = R.id.adalabel;
      TextView adalabel = ViewBindings.findChildViewById(rootView, id);
      if (adalabel == null) {
        break missingId;
      }

      id = R.id.constraintLayout3;
      ConstraintLayout constraintLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout3 == null) {
        break missingId;
      }

      id = R.id.homeKey;
      TextView homeKey = ViewBindings.findChildViewById(rootView, id);
      if (homeKey == null) {
        break missingId;
      }

      id = R.id.menuKey;
      TextView menuKey = ViewBindings.findChildViewById(rootView, id);
      if (menuKey == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.welcometxt;
      TextView welcometxt = ViewBindings.findChildViewById(rootView, id);
      if (welcometxt == null) {
        break missingId;
      }

      return new MyAdaRestaurantBinding((LinearLayout) rootView, adaRecycler1, adalabel,
          constraintLayout3, homeKey, menuKey, scrollView2, welcometxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
