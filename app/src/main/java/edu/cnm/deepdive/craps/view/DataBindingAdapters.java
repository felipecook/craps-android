package edu.cnm.deepdive.craps.view;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

public class DataBindingAdapters {

  @BindingAdapter("android:src")
  public static void setImageResources(ImageView imageView, int resource) {
    imageView.setImageResource(resource);
  }

}
