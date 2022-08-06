package com.shimmita.simpledialog;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class CreationDialogSimple extends AppCompatDialogFragment  {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
      AlertDialog.Builder alert_d_builder=new AlertDialog.Builder(getActivity());
              alert_d_builder.setTitle("Simple Dialog");
              alert_d_builder.setMessage("Information Dialog of Simple Dialog\nType");
              alert_d_builder.setPositiveButton("Ok",null);
              return alert_d_builder.create();

    }
}
