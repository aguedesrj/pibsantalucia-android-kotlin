// Generated by view binder compiler. Do not edit!
package br.com.pibsantalucia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import br.com.pibsantalucia.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AdapterContactCongregadoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageButton imageButtonContactEdit;

  @NonNull
  public final AppCompatImageButton imageButtonContactRemove;

  @NonNull
  public final AppCompatTextView textViewContactDescription;

  @NonNull
  public final AppCompatTextView textViewContactType;

  private AdapterContactCongregadoBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageButton imageButtonContactEdit,
      @NonNull AppCompatImageButton imageButtonContactRemove,
      @NonNull AppCompatTextView textViewContactDescription,
      @NonNull AppCompatTextView textViewContactType) {
    this.rootView = rootView;
    this.imageButtonContactEdit = imageButtonContactEdit;
    this.imageButtonContactRemove = imageButtonContactRemove;
    this.textViewContactDescription = textViewContactDescription;
    this.textViewContactType = textViewContactType;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AdapterContactCongregadoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdapterContactCongregadoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.adapter_contact_congregado, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdapterContactCongregadoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageButtonContactEdit;
      AppCompatImageButton imageButtonContactEdit = rootView.findViewById(id);
      if (imageButtonContactEdit == null) {
        break missingId;
      }

      id = R.id.imageButtonContactRemove;
      AppCompatImageButton imageButtonContactRemove = rootView.findViewById(id);
      if (imageButtonContactRemove == null) {
        break missingId;
      }

      id = R.id.textViewContactDescription;
      AppCompatTextView textViewContactDescription = rootView.findViewById(id);
      if (textViewContactDescription == null) {
        break missingId;
      }

      id = R.id.textViewContactType;
      AppCompatTextView textViewContactType = rootView.findViewById(id);
      if (textViewContactType == null) {
        break missingId;
      }

      return new AdapterContactCongregadoBinding((ConstraintLayout) rootView,
          imageButtonContactEdit, imageButtonContactRemove, textViewContactDescription,
          textViewContactType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
