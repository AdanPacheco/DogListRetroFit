package com.portfolio.doglistretrofit

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.portfolio.doglistretrofit.databinding.ActivityMainBinding
import com.portfolio.doglistretrofit.databinding.DogItemViewholderBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = DogItemViewholderBinding.bind(view)

    fun bind(image: String) {
        Picasso.get().load(image).into(binding.ivDog)
    }
}