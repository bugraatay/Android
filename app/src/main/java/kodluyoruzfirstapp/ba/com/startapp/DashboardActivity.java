package kodluyoruzfirstapp.ba.com.startapp;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class DashboardActivity extends AppCompatActivity {
    private final String MAIN_TAG = "Selam Buğra";
    private  String name = "";


    @Override
    public void onContentChanged() {
        super.onContentChanged();
        setString();
        Log.e(MAIN_TAG, "1_onContentChanged");
    }
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.e(MAIN_TAG, "4_onPostCreate");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Log.e(MAIN_TAG, "onRestoreInstanceState");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e(MAIN_TAG, "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MAIN_TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MAIN_TAG, "onStop");
    }

    @Override
    public void onAttachFragment(android.app.Fragment fragment) {
        super.onAttachFragment(fragment);

        Log.e(MAIN_TAG, "onAttachFragment");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.e(MAIN_TAG, "onSaveInstanceState");
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.e(MAIN_TAG, "9_onPrepareOptionsMenu");
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.e(MAIN_TAG, "7_onCreateOptionsMenu");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        Log.e(MAIN_TAG, "6_onPostResume");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e(MAIN_TAG, "5_onResume");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.e(MAIN_TAG, "onBackPressed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        name = "Buğra";
        Log.e(MAIN_TAG, "3_onStart");
    }


    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);

        Log.e(MAIN_TAG, "onAttachFragment");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dashboard);
        //TODO Todo da böyle kullanıloyor. Çoklu satırı yorum satırı haline getirmek için satırları seçtikten sonra cmd+.'yı kullan.

        /*

        Uygulamayı yataya çevirdiğinde nolur?
        activity kill olur tekrar ayağa kalkar ama onCreate çağırılmaz.

        yataya çevirdiğinde activity kill olacak, e veriler de silinecek. o verileri onRestoreInstanceState metodu içinde dolduracaksın işte.
        kod cmd+shift+alt+l
         */

        Log.e(MAIN_TAG, "2_onCreate");
    }

    public void setString() {
        name = "\n>>>>>>>>>>>>>>>>";
        Log.e(MAIN_TAG, name);
    }
}
