package com.app.sqlitebottomnav.fragments;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.app.sqlitebottomnav.R;
import com.app.sqlitebottomnav.helpers.ConnectionSQLiteHelper;
import com.app.sqlitebottomnav.utility.Utility;

public class RegisterFragment extends Fragment implements View.OnClickListener {

    private EditText txt_id_cli, txt_name_cli,
            txt_last_n_cli, txt_email_cli, txt_phone_cli;
    private Button btn_register_cli;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.register_fragment, container, false);
        setSettings(v);
        return v;
    }

    private void setSettings(View v) {
        txt_id_cli = v.findViewById(R.id.txt_id_cli);
        txt_name_cli = v.findViewById(R.id.txt_name_cli);
        txt_last_n_cli = v.findViewById(R.id.txt_last_n_cli);
        txt_email_cli = v.findViewById(R.id.txt_email_cli);
        txt_phone_cli = v.findViewById(R.id.txt_phone_cli);
        btn_register_cli = v.findViewById(R.id.btn_register_cli);
        btn_register_cli.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_register_cli) {
            Log.d("ANDROID REGISTER", "Register event");
            ConnectionSQLiteHelper conn = new ConnectionSQLiteHelper(getActivity(), Utility.DB_NAME, null, 1);

            SQLiteDatabase db = conn.getWritableDatabase();

            ContentValues cv = new ContentValues();
            cv.put(Utility.FIELD_ID, Integer.parseInt(txt_id_cli.getText().toString()));
            cv.put(Utility.FIELD_NAME, txt_name_cli.getText().toString());
            cv.put(Utility.FIELD_LAST_NAME, txt_last_n_cli.getText().toString());
            cv.put(Utility.FIELD_EMAIL, txt_email_cli.getText().toString());
            cv.put(Utility.FIELD_PHONE, txt_phone_cli.getText().toString());

            Long idResult = db.insert(Utility.TABLE_NAME, Utility.FIELD_ID, cv);
            Toast.makeText(getActivity(), Utility.INSERT_MESSAGE, Toast.LENGTH_SHORT).show();
        }
    }
}
