package com.example.voteinformed.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.voteinformed.R;
import com.example.voteinformed.ui.concerns.ConcernsActivity;
import com.example.voteinformed.ui.user.ProfileActivity;
import com.example.voteinformed.ui.saved.SavedActivity;
import com.example.voteinformed.ui.search.SearchActivity;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialize drawer layout and navigation view
        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navView = findViewById(R.id.nav_view);

        // Setup header view with user info
        setupNavHeader(navView);

        // Setup top-left hamburger menu button
        ImageButton btnLeft = findViewById(R.id.btnLeftMenu);
        btnLeft.setOnClickListener(v -> drawerLayout.openDrawer(GravityCompat.START));

        // Setup top-right profile button
        ImageButton btnRight = findViewById(R.id.btnRightMenu);
        btnRight.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, ProfileActivity.class)));

        // Setup "Voice Concerns" button
        Button voiceConcerns = findViewById(R.id.btnVoiceConcerns);
        voiceConcerns.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, ConcernsActivity.class)));

        // Setup navigation menu item clicks
        setupNavMenu(navView);
    }

    /**
     * Populate the navigation header with user info
     */
    private void setupNavHeader(NavigationView navView) {
        if (navView.getHeaderCount() > 0) {
            View headerView = navView.getHeaderView(0);
            ImageView profileImage = headerView.findViewById(R.id.profile_image);
            TextView userName = headerView.findViewById(R.id.user_name);
            TextView userEmail = headerView.findViewById(R.id.user_email);

            // Hardcoded user info for now
            userName.setText("John Doe");
            userEmail.setText("john.doe@example.com");

            // TODO: Load real user image if available
        }
    }

    /**
     * Handle navigation menu item clicks
     */
    private void setupNavMenu(NavigationView navView) {
        navView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_home) {
                // Already on home page, just close drawer
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            } else if (id == R.id.nav_search) {
                startActivity(new Intent(HomeActivity.this, SearchActivity.class));
            } else if (id == R.id.nav_saved) {
                startActivity(new Intent(HomeActivity.this, SavedActivity.class));
            } else if (id == R.id.nav_profile) {
                startActivity(new Intent(HomeActivity.this, ProfileActivity.class));
            } else if (id == R.id.nav_settings) {
                // TODO: Implement SettingsActivity if needed
            } else if (id == R.id.nav_sign_out) {
                startActivity(new Intent(HomeActivity.this, HomescreenActivity.class));
                finish();
            } else {
                return false;
            }

            // Close drawer after selection
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });
    }

    @Override
    public void onBackPressed() {
        // Close drawer first if open, else back normally
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
