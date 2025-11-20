package com.main.pmt;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;


public class Browse extends AppCompatActivity {

    private ImageView imageView;

    private ActivityResultLauncher<Intent> imagePickerLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        imageView = findViewById(R.id.imageView);
        Button btnBrowse = findViewById(R.id.btnBrowse);

        imagePickerLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), this::onImagePicked);

        btnBrowse.setOnClickListener(view -> openImagePicker());
    }

    private void openImagePicker() {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("image/*");
        imagePickerLauncher.launch(intent);
    }

    private void onImagePicked(ActivityResult result) {
        if (result.getResultCode() == Activity.RESULT_OK) {
            Intent data = result.getData();
            if (data != null) {
                Uri selectedImage = data.getData();
                if (selectedImage != null) {
                    displaySelectedImage(selectedImage);
                }
            }
        }
    }

    private void displaySelectedImage(Uri uri) {
        // Use Glide to efficiently load and display the selected image
        Glide.with(this)
                .load(uri)
                .into(imageView);
    }
}