// Generated by view binder compiler. Do not edit!
package br.com.pibsantalucia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.viewbinding.ViewBinding;
import br.com.pibsantalucia.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySplashBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView imageViewSplashLogo;

  @NonNull
  public final ContentLoadingProgressBar progressBarSplash;

  private ActivitySplashBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView imageViewSplashLogo,
      @NonNull ContentLoadingProgressBar progressBarSplash) {
    this.rootView = rootView;
    this.imageViewSplashLogo = imageViewSplashLogo;
    this.progressBarSplash = progressBarSplash;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_splash, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySplashBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewSplashLogo;
      AppCompatImageView imageViewSplashLogo = rootView.findViewById(id);
      if (imageViewSplashLogo == null) {
        break missingId;
      }

      id = R.id.progressBarSplash;
      ContentLoadingProgressBar progressBarSplash = rootView.findViewById(id);
      if (progressBarSplash == null) {
        break missingId;
      }

      return new ActivitySplashBinding((ConstraintLayout) rootView, imageViewSplashLogo,
          progressBarSplash);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}