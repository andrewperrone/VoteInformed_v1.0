package com.example.voteinformed.ui.previously_made;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.voteinformed.R;
import com.example.voteinformed.ui.concerns.ConcernsActivity;
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

        // Highlight current item and make it non-clickable
        navView.setCheckedItem(R.id.nav_home);
        navView.getMenu().findItem(R.id.nav_home).setEnabled(false);

        // Setup header view with user info
        setupNavHeader(navView);

        // Top-left hamburger menu button
        ImageButton btnLeft = findViewById(R.id.btnLeftMenu);
        btnLeft.setOnClickListener(v -> drawerLayout.openDrawer(GravityCompat.START));

        // Top-right profile button
        ImageButton btnRight = findViewById(R.id.btnRightMenu);
        btnRight.setOnClickListener(v ->
                startActivity(new Intent(HomeActivity.this, ProfileActivity.class)));

        // "Voice Concerns" button
        Button voiceConcerns = findViewById(R.id.btnVoiceConcerns);
        voiceConcerns.setOnClickListener(v ->
                startActivity(new Intent(HomeActivity.this, ConcernsActivity.class)));

        // Navigation menu item clicks
        setupNavMenu(navView);
    }

    private void setupNavHeader(NavigationView navView) {
        if (navView.getHeaderCount() > 0) {
            android.view.View headerView = navView.getHeaderView(0);
            ImageView profileImage = headerView.findViewById(R.id.profile_image);
            TextView userName = headerView.findViewById(R.id.user_name);
            TextView userEmail = headerView.findViewById(R.id.user_email);

            userName.setText("John Doe");
            userEmail.setText("john.doe@example.com");
        }
    }

    private void setupNavMenu(NavigationView navView) {
        navView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_home) {
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            } else if (id == R.id.nav_search) {
                startActivity(new Intent(HomeActivity.this, SearchActivity.class));
            } else if (id == R.id.nav_saved) {
                startActivity(new Intent(HomeActivity.this, SavedActivity.class));
            } else if (id == R.id.nav_comparison) {
                startActivity(new Intent(HomeActivity.this, PoliticianComparisonActivity.class));
            } else if (id == R.id.nav_profile) {
                startActivity(new Intent(HomeActivity.this, ProfileActivity.class));
            } else if (id == R.id.nav_sign_out) {
                startActivity(new Intent(HomeActivity.this, HomescreenActivity.class));
                finish();
            } else {
                return false;
            }

            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
