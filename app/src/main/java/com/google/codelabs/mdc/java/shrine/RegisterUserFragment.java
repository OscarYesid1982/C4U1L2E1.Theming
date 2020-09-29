package com.google.codelabs.mdc.java.shrine;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class RegisterUserFragment extends Fragment {

    EditText _nameText = null;
    EditText _addressText = null;
    EditText _emailText = null;
    EditText _mobileText = null;
    EditText _passwordText = null;
    EditText _reEnterPasswordText = null;
    Button _signupButton = null;


    /*
    public static RegisterUserFragment newInstance(String param1, String param2) {
        RegisterUserFragment fragment = new RegisterUserFragment();
        Bundle args = new Bundle();

    }*/

    public RegisterUserFragment() {
        // Required empty public constructor
    }

/*    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_register_user);

        //Inputs

        _nameText = findViewById(R.id.input_name);
        _addressText = findViewById(R.id.input_address);
        _emailText = findViewById(R.id.input_email);
        _mobileText = findViewById(R.id.input_mobile);
        _passwordText = findViewById(R.id.input_password);
        _reEnterPasswordText = findViewById(R.id.input_reEnterPassword);
        _signupButton = findViewById(R.id.btn_signup);

        _signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });

    }*/

    private void setContentView(int fragment_register_user) {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =    inflater.inflate(R.layout.fragment_register_user, container, false);


        //Inputs
        _nameText = view.findViewById(R.id.input_name);
        _addressText = view.findViewById(R.id.input_address);
        _emailText = view.findViewById(R.id.input_email);
        _mobileText = view.findViewById(R.id.input_mobile);
        _passwordText = view.findViewById(R.id.input_password);
        _reEnterPasswordText = view.findViewById(R.id.input_reEnterPassword);
        _signupButton = view.findViewById(R.id.btn_signup);

        _signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // signup();
            }
        });

        return view;
    }
}