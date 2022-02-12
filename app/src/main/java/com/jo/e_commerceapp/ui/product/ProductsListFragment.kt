package com.jo.e_commerceapp.ui.product

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jo.e_commerceapp.R
import com.jo.e_commerceapp.databinding.FragmentProductsListBinding


class ProductsListFragment : Fragment() {

    private lateinit var binding : FragmentProductsListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProductsListBinding.inflate(layoutInflater)
        return binding.root
    }


}