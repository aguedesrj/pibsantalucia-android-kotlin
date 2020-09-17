// Generated by view binder compiler. Do not edit!
package br.com.pibsantalucia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import br.com.pibsantalucia.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemDetalheMembroBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton imageButtonItemDetalheMembroPhone;

  @NonNull
  public final ImageButton imageButtonItemDetalheMembroWhatsApp;

  @NonNull
  public final TextView textViewItemDetalheMembroPhone;

  @NonNull
  public final View viewItemDetalheMembroLine;

  private ItemDetalheMembroBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton imageButtonItemDetalheMembroPhone,
      @NonNull ImageButton imageButtonItemDetalheMembroWhatsApp,
      @NonNull TextView textViewItemDetalheMembroPhone, @NonNull View viewItemDetalheMembroLine) {
    this.rootView = rootView;
    this.imageButtonItemDetalheMembroPhone = imageButtonItemDetalheMembroPhone;
    this.imageButtonItemDetalheMembroWhatsApp = imageButtonItemDetalheMembroWhatsApp;
    this.textViewItemDetalheMembroPhone = textViewItemDetalheMembroPhone;
    this.viewItemDetalheMembroLine = viewItemDetalheMembroLine;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemDetalheMembroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemDetalheMembroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_detalhe_membro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemDetalheMembroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageButtonItemDetalheMembroPhone;
      ImageButton imageButtonItemDetalheMembroPhone = rootView.findViewById(id);
      if (imageButtonItemDetalheMembroPhone == null) {
        break missingId;
      }

      id = R.id.imageButtonItemDetalheMembroWhatsApp;
      ImageButton imageButtonItemDetalheMembroWhatsApp = rootView.findViewById(id);
      if (imageButtonItemDetalheMembroWhatsApp == null) {
        break missingId;
      }

      id = R.id.textViewItemDetalheMembroPhone;
      TextView textViewItemDetalheMembroPhone = rootView.findViewById(id);
      if (textViewItemDetalheMembroPhone == null) {
        break missingId;
      }

      id = R.id.viewItemDetalheMembroLine;
      View viewItemDetalheMembroLine = rootView.findViewById(id);
      if (viewItemDetalheMembroLine == null) {
        break missingId;
      }

      return new ItemDetalheMembroBinding((ConstraintLayout) rootView,
          imageButtonItemDetalheMembroPhone, imageButtonItemDetalheMembroWhatsApp,
          textViewItemDetalheMembroPhone, viewItemDetalheMembroLine);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
