package autocompletetextviewdb.actionbarwithtabs;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("audio").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("video").setTabListener(this));
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
int nTabSelected =tab.getPosition();
        switch (nTabSelected){
            case 0:
                setContentView(R.layout.actionbar_tab_1);
                break;
            case 1:
                setContentView(R.layout.actionbar_tab_2);
                break;

        }
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }
public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.menu,menu);
return true;
}
public boolean onOptionsItemSelected(MenuItem item){
    int id=item.getItemId();
    if(id==R.id.action_tab_1){
        return true;
    }
    return super.onOptionsItemSelected(item)
}

}


