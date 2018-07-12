package com.example.hoang.calcu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class calcuFragment extends Fragment implements View.OnClickListener {

    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;
    private Button mBtn4;
    private Button mBtn5;
    private Button mBtn6;
    private Button mBtn7;
    private Button mBtn8;
    private Button mBtn9;
    private Button mBtn0;
    private Button mBtnDog;
    private Button mBtnResult;
    private Button mBtnSum;
    private Button mBtnSubtraction;
    private Button mBtnDividion;
    private Button mBtnMult;
    private Button mBtnTypeNumber;
    private Button mBtnPercent;
    private Button mBtnAc;
    public static final String NUMBER0 = "0";
    public static final String NUMBER1 = "1";
    public static final String NUMBER2 = "2";
    public static final String NUMBER3 = "3";
    public static final String NUMBER4 = "4";
    public static final String NUMBER5 = "5";
    public static final String NUMBER6 = "6";
    public static final String NUMBER7 = "7";
    public static final String NUMBER8 = "8";
    public static final String NUMBER9 = "9";
    public static final String TYPENUMBER = "-";
    public static final String DOGS = ".";
    public static final String AC = "";
    private Float mnumber1, mnumber2;
    private Float mresut;
    private int mcasenumber = 0;
    private TextView mTextResutl;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_calcu, container, false);
        addControl(v);
        addevent();
        return v;
    }

    private void addevent() {
        mBtn0.setOnClickListener(this);
        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        mBtn3.setOnClickListener(this);
        mBtn4.setOnClickListener(this);
        mBtn5.setOnClickListener(this);
        mBtn6.setOnClickListener(this);
        mBtn7.setOnClickListener(this);
        mBtn8.setOnClickListener(this);
        mBtn9.setOnClickListener(this);
        mBtnAc.setOnClickListener(this);
        mBtnTypeNumber.setOnClickListener(this);
        mBtnPercent.setOnClickListener(this);
        mBtnDividion.setOnClickListener(this);
        mBtnSubtraction.setOnClickListener(this);
        mBtnSum.setOnClickListener(this);
        mBtnMult.setOnClickListener(this);
        mBtnResult.setOnClickListener(this);
        mBtnDog.setOnClickListener(this);


    }

    private void addControl(View v) {
        mBtn0 = v.findViewById(R.id.button_0);
        mBtn1 = v.findViewById(R.id.button_1);
        mBtn2 = v.findViewById(R.id.button_2);
        mBtn3 = v.findViewById(R.id.button_3);
        mBtn4 = v.findViewById(R.id.button_4);
        mBtn5 = v.findViewById(R.id.button_5);
        mBtn6 = v.findViewById(R.id.button_6);
        mBtn7 = v.findViewById(R.id.button_7);
        mBtn8 = v.findViewById(R.id.button_8);
        mBtn9 = v.findViewById(R.id.button_9);
        mBtnDog = v.findViewById(R.id.button_dog);
        mBtnResult = v.findViewById(R.id.button_resutl);
        mBtnSubtraction = v.findViewById(R.id.button_subtraction);
        mBtnSum = v.findViewById(R.id.button_sum);
        mBtnDividion = v.findViewById(R.id.button_dividion);
        mBtnMult = v.findViewById(R.id.button_multip);
        mBtnTypeNumber = v.findViewById(R.id.button_typenumber);
        mBtnPercent = v.findViewById(R.id.button_percent);
        mBtnAc = v.findViewById(R.id.button_ac);
        mTextResutl = v.findViewById(R.id.text_resutl);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_0:
                mTextResutl.append(NUMBER0);
                break;
            case R.id.button_1:
                mTextResutl.append(NUMBER1);
                break;
            case R.id.button_2:
                mTextResutl.append(NUMBER2);
                break;
            case R.id.button_3:
                mTextResutl.append(NUMBER3);
                break;
            case R.id.button_4:
                mTextResutl.append(NUMBER4);
                break;
            case R.id.button_5:
                mTextResutl.append(NUMBER5);
                break;
            case R.id.button_6:
                mTextResutl.append(NUMBER6);
                break;
            case R.id.button_7:
                mTextResutl.append(NUMBER7);
                break;
            case R.id.button_8:
                mTextResutl.append(NUMBER8);
                break;
            case R.id.button_9:
                mTextResutl.append(NUMBER9);
                break;
            case R.id.button_sum:
                if (mTextResutl.getText().toString().equals("")) {
                } else {
                    mnumber1 = Float.parseFloat(mTextResutl.getText().toString());
                    mTextResutl.setText(AC);
                    mcasenumber = 1;
                }

                break;
            case R.id.button_subtraction:
                if (mTextResutl.getText().toString().equals("")) {
                } else {
                    mnumber1 = Float.parseFloat(mTextResutl.getText().toString());
                    mTextResutl.setText(AC);
                    mcasenumber = 2;
                }
                break;
            case R.id.button_dividion:
                if (mTextResutl.getText().toString().equals("")) {
                } else {
                    mnumber1 = Float.parseFloat(mTextResutl.getText().toString());
                    mTextResutl.setText(AC);
                    mcasenumber = 3;
                }
                break;
            case R.id.button_multip:
                if (mTextResutl.getText().toString().equals("")) {
                } else {
                    mnumber1 = Float.parseFloat(mTextResutl.getText().toString());
                    mTextResutl.setText(AC);
                    mcasenumber = 4;
                }
                break;
            case R.id.button_ac:
                mTextResutl.setText(AC);
                break;
            case R.id.button_typenumber:
                mTextResutl.append(TYPENUMBER);
                break;
            case R.id.button_percent:
                Float x = Float.parseFloat(mTextResutl.getText().toString());
                x = x / 100;
                mTextResutl.setText(String.valueOf(x));
                break;
            case R.id.button_dog:
                mTextResutl.append(DOGS);
                break;
            case R.id.button_resutl:
                if (mTextResutl.getText().toString().equals("")) {

                } else {
                    mnumber2 = Float.parseFloat(mTextResutl.getText().toString());
                    switch (mcasenumber) {
                        case 1:
                            mresut = mnumber1 + mnumber2;
                            break;

                        case 2:
                            mresut = mnumber1 - mnumber2;
                            break;

                        case 3:
                            mresut = mnumber1 / mnumber2;
                            break;

                        case 4:
                            mresut = mnumber1 * mnumber2;
                            break;
                        default:
                            break;
                    }
                    mTextResutl.setText(String.valueOf(mresut));
                }
                break;
            default:
                break;
        }
    }
}
