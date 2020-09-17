// Generated by view binder compiler. Do not edit!
package br.com.pibsantalucia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import br.com.pibsantalucia.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import mk.webfactory.dz.maskededittext.MaskedEditText;

public final class ActivityAddanuncioBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextInputEditText textInputEditTextAddAnuncio;

  @NonNull
  public final MaskedEditText textInputEditTextAddAnuncioDateLimit;

  @NonNull
  public final TextInputLayout textInputLayoutAddAnuncio;

  @NonNull
  public final TextInputLayout textInputLayoutAddAnuncioDateLimit;

  private ActivityAddanuncioBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextInputEditText textInputEditTextAddAnuncio,
      @NonNull MaskedEditText textInputEditTextAddAnuncioDateLimit,
      @NonNull TextInputLayout textInputLayoutAddAnuncio,
      @NonNull TextInputLayout textInputLayoutAddAnuncioDateLimit) {
    this.rootView = rootView;
    this.textInputEditTextAddAnuncio = textInputEditTextAddAnuncio;
    this.textInputEditTextAddAnuncioDateLimit = textInputEditTextAddAnuncioDateLimit;
    this.textInputLayoutAddAnuncio = textInputLayoutAddAnuncio;
    this.textInputLayoutAddAnuncioDateLimit = textInputLayoutAddAnuncioDateLimit;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddanuncioBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddanuncioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_addanuncio, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddanuncioBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.textInputEditTextAddAnuncio;
      TextInputEditText textInputEditTextAddAnuncio = rootView.findViewById(id);
      if (textInputEditTextAddAnuncio == null) {
        break missingId;
      }

      id = R.id.textInputEditTextAddAnuncioDateLimit;
      MaskedEditText textInputEditTextAddAnuncioDateLimit = rootView.findViewById(id);
      if (textInputEditTextAddAnuncioDateLimit == null) {
        break missingId;
      }

      id = R.id.textInputLayoutAddAnuncio;
      TextInputLayout textInputLayoutAddAnuncio = rootView.findViewById(id);
      if (textInputLayoutAddAnuncio == null) {
        break missingId;
      }

      id = R.id.textInputLayoutAddAnuncioDateLimit;
      TextInputLayout textInputLayoutAddAnuncioDateLimit = rootView.findViewById(id);
      if (textInputLayoutAddAnuncioDateLimit == null) {
        break missingId;
      }

      return new ActivityAddanuncioBinding((ConstraintLayout) rootView, textInputEditTextAddAnuncio,
          textInputEditTextAddAnuncioDateLimit, textInputLayoutAddAnuncio,
          textInputLayoutAddAnuncioDateLimit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
