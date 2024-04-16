package com.example.r20_gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.AdapterView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    TextView subject[]=new TextView[100];
    TextView grade[]=new TextView[100];
    TextView credit[]=new TextView[100];
    String selectedGrade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







//---bottom sheet dialog------------------------------------------------------------------------------------------------------------------------------------------------------


//---  initializing the textview subject  -----------------------------------------------------------------------------------------------------------------------------------



//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Button change1, change2,change3, change4,change5,change6,change7,change8;
        ImageButton add,delete;
        FrameLayout information;
        Spinner grades;
        information = findViewById(R.id.information);
        change1 = findViewById(R.id.change1);
        change2 = findViewById(R.id.change2);
        change3 = findViewById(R.id.change3);
        change4 = findViewById(R.id.change4);
        change5 = findViewById(R.id.change5);
        change6 = findViewById(R.id.change6);
        change7 = findViewById(R.id.change7);
        change8 = findViewById(R.id.change8);
        add =findViewById(R.id.add);
        delete=findViewById(R.id.delete);
//-----------------------------------------------------------------------------------------------------


//---one_one------------------------------------------------------------------------------------------------------------------

        int oneOneLayoutId = getResources().getIdentifier("one_one", "layout", getPackageName());
        View oneone = LayoutInflater.from(this).inflate(oneOneLayoutId, null);

        subject[1]=oneone.findViewById(R.id.sub1);
        subject[2]=oneone.findViewById(R.id.sub2);
        subject[3]=oneone.findViewById(R.id.sub3);
        subject[4]=oneone.findViewById(R.id.sub4);
        subject[5]=oneone.findViewById(R.id.sub5);
        subject[6]=oneone.findViewById(R.id.sub6);
        subject[7]=oneone.findViewById(R.id.sub7);
        subject[8]=oneone.findViewById(R.id.sub8);


        grade[1]=oneone.findViewById(R.id.gra1);
        grade[2]=oneone.findViewById(R.id.gra2);
        grade[3]=oneone.findViewById(R.id.gra3);
        grade[4]=oneone.findViewById(R.id.gra4);
        grade[5]=oneone.findViewById(R.id.gra5);
        grade[6]=oneone.findViewById(R.id.gra6);
        grade[7]=oneone.findViewById(R.id.gra7);
        grade[8]=oneone.findViewById(R.id.gra8);


        credit[1]=oneone.findViewById(R.id.cre1);
        credit[2]=oneone.findViewById(R.id.cre2);
        credit[3]=oneone.findViewById(R.id.cre3);
        credit[4]=oneone.findViewById(R.id.cre4);
        credit[5]=oneone.findViewById(R.id.cre5);
        credit[6]=oneone.findViewById(R.id.cre6);
        credit[7]=oneone.findViewById(R.id.cre7);
        credit[8]=oneone.findViewById(R.id.cre8);








//--------------------------------------------------------------------------------------------------------------------------
        change1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View newLayoutView = LayoutInflater.from(MainActivity.this).inflate(R.layout.one_one, null);

                information.removeAllViews();
                information.addView(newLayoutView);


            }
        });
        change2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View newLayoutView = LayoutInflater.from(MainActivity.this).inflate(R.layout.one_two, null);

                information.removeAllViews();
                information.addView(newLayoutView);


            }
        });
//--- bottom dialog -----------------------------------------------------------------------------------------------




//--- adding button-----------------------------------------------------------------------------------------------------------
        final int[] a = {2};
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a[0] == 2 ){
                    ViewGroup.LayoutParams params = change2.getLayoutParams();
                    params.width = (int) getResources().getDimension(R.dimen.button_width);
                    change2.setLayoutParams(params);
                }
                else if (a[0] == 3 ){
                    ViewGroup.LayoutParams params = change3.getLayoutParams();
                    params.width = (int) getResources().getDimension(R.dimen.button_width);
                    change3.setLayoutParams(params);
                }
                else if (a[0] == 4 ){
                    ViewGroup.LayoutParams params = change4.getLayoutParams();
                    params.width = (int) getResources().getDimension(R.dimen.button_width);
                    change4.setLayoutParams(params);
                }
                else if (a[0] == 5 ){
                    ViewGroup.LayoutParams params = change5.getLayoutParams();
                    params.width = (int) getResources().getDimension(R.dimen.button_width);
                    change5.setLayoutParams(params);
                }
                else if (a[0] == 6 ){
                    ViewGroup.LayoutParams params = change6.getLayoutParams();
                    params.width = (int) getResources().getDimension(R.dimen.button_width);
                    change6.setLayoutParams(params);
                }
                else if (a[0] == 7 ){
                    ViewGroup.LayoutParams params = change7.getLayoutParams();
                    params.width = (int) getResources().getDimension(R.dimen.button_width);
                    change7.setLayoutParams(params);
                }
                else if (a[0] == 8 ){
                    ViewGroup.LayoutParams params = change8.getLayoutParams();

                    params.width = (int) getResources().getDimension(R.dimen.button_width);

                    change8.setLayoutParams(params);
                }
                else{
                    return;
                }

                a[0]=a[0]+1;




            }
        });

//---  deleting button  ----------------------------------------------------------------------------------------------
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a[0]==3){
                    ViewGroup.LayoutParams params = change2.getLayoutParams();
                    params.width =0;
                    change2.setLayoutParams(params);
                }
                else if (a[0]==4){
                    ViewGroup.LayoutParams params = change3.getLayoutParams();
                    params.width =0;
                    change3.setLayoutParams(params);
                }
                else if (a[0]==5){
                    ViewGroup.LayoutParams params = change4.getLayoutParams();
                    params.width =0;
                    change4.setLayoutParams(params);
                }
                else if (a[0]==6){
                    ViewGroup.LayoutParams params = change5.getLayoutParams();
                    params.width =0;
                    change5.setLayoutParams(params);
                }
                else if (a[0]==7){
                    ViewGroup.LayoutParams params = change6.getLayoutParams();
                    params.width =0;
                    change6.setLayoutParams(params);
                }
                else if (a[0]==8){
                    ViewGroup.LayoutParams params = change7.getLayoutParams();
                    params.width =0;
                    change7.setLayoutParams(params);
                }
                else if (a[0]==9){
                    ViewGroup.LayoutParams params = change8.getLayoutParams();
                    params.width =0;
                    change8.setLayoutParams(params);
                }
                else {
                    return;
                }


                a[0]=a[0]-1;
            }
        });

    }


    public void layout1_1_1(View view){
        createDialog(1);
    }



    public void layout1_1_2(View view) {
        createDialog(2);
    }
    public void layout1_1_3(View view) {
        createDialog(3);
    }
    public void layout1_1_4(View view) {
        createDialog(4);
    }
    public void layout1_1_5(View view) {
        createDialog(5);
    }
    public void layout1_1_6(View view) {
        createDialog(6);
    }
    public void layout1_1_7(View view) {
        createDialog(7);
    }
    public void layout1_1_8(View view) {
        createDialog(8);
    }








    private void createDialog(int year){


        BottomSheetDialog dialog=new BottomSheetDialog(MainActivity.this);
        View view1 = LayoutInflater.from(MainActivity.this).inflate(R.layout.bottom_sheet_lyt, null);
        dialog.setContentView(view1);
        dialog.setCanceledOnTouchOutside(false);


        String gr=grade[year].getText().toString();

        Spinner spinner = view1.findViewById(R.id.grade);

        int optionsArrayId;
        switch (gr) {
            case "A+":
                optionsArrayId = R.array.grades_aplus;
                break;
            case "A":
                optionsArrayId = R.array.grades_a;
                break;
            case "B":
                optionsArrayId = R.array.grades_b;
                break;
            case "C":
                optionsArrayId = R.array.grades_c;
                break;
            case "D":
                optionsArrayId = R.array.grades_d;
                break;
            case "E":
                optionsArrayId = R.array.grades_e;
                break;
            case "F":
                optionsArrayId = R.array.grades_f;
                break;
            case "ABSENT":
                optionsArrayId = R.array.grades_absent;
                break;
            case "COMPLETED":
                optionsArrayId = R.array.grades_completed;
                break;
            default:
                optionsArrayId = R.array.grades;
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, optionsArrayId, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        String ab=subject[year].getText().toString();
        TextView subjectt=view1.findViewById(R.id.subjectt);
        subjectt.setText(ab);


        ab=credit[year].getText().toString();
        EditText credits=view1.findViewById(R.id.credits);
        credits.setText(ab);

        Button updatesubject = view1.findViewById(R.id.updatesubject);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedGrade = parent.getItemAtPosition(position).toString();
                Log.d("Selected Grade", selectedGrade);






            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        updatesubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        String abcd = grade[year].getText().toString();
                        Toast.makeText(MainActivity.this, abcd, Toast.LENGTH_SHORT).show(); // For verification

                        grade[year].setText(selectedGrade);
                        grade[year].invalidate(); // Invalidate after all changes

                        ((View) grade[year].getParent()).requestLayout(); // Or activity.requestLayout();

                        String abc = credits.getText().toString();
                        credit[year].setText(abc);

                        dialog.dismiss();
                    }
                });
            }
        });



        Button cancell=view1.findViewById(R.id.cancell);
        cancell.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }

        });

        dialog.show();
    }



}
