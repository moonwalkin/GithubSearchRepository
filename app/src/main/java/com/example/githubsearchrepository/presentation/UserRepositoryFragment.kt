package com.example.githubsearchrepository.presentation

import android.os.Bundle
import android.view.View
import com.example.githubsearchrepository.databinding.FragmentUserRepositoryBinding

class UserRepositoryFragment : BaseFragment<FragmentUserRepositoryBinding>() {

    override fun getViewBinding() = FragmentUserRepositoryBinding.inflate(layoutInflater)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}