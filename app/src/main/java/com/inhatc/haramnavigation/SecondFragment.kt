package com.inhatc.haramnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.inhatc.haramnavigation.databinding.FragmentMainBinding
import com.inhatc.haramnavigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    // DataBinding 사용
    private var _binding: FragmentSecondBinding? = null
    private val binding: FragmentSecondBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(
            layoutInflater, R.layout.fragment_second, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

        }
    }
}