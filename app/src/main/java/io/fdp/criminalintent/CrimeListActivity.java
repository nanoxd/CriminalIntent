package io.fdp.criminalintent;

import android.app.Fragment;

/**
 * Created by nano on 10/9/14.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
