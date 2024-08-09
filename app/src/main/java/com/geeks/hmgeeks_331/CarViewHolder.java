package com.geeks.hmgeeks_331;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geeks.hmgeeks_331.databinding.CarItemBinding;

public class CarViewHolder extends RecyclerView.ViewHolder {

    CarItemBinding binding;

    public CarViewHolder(@NonNull CarItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(String name, String image) {
        binding.tvName.setText(name);
        Glide.with(binding.imgCar).load(image).into(binding.imgCar);
    }
}