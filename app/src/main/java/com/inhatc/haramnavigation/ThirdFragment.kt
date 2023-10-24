package com.inhatc.haramnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.inhatc.haramnavigation.databinding.FragmentSecondBinding
import com.inhatc.haramnavigation.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    // DataBinding 사용
    private var _binding: FragmentThirdBinding? = null
    private val binding: FragmentThirdBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(
            layoutInflater, R.layout.fragment_third, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

        }
    }
}