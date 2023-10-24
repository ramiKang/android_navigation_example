package com.inhatc.haramnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.inhatc.haramnavigation.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    // DataBinding 사용
    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(
            layoutInflater, R.layout.fragment_main, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState);

        binding.apply {
            // 버튼 클릭하면 페이지 이동
            binding.btnMove.setOnClickListener {
                val navController = findNavController()
                navController.navigate(R.id.action_mainFragment_to_secondFragment)
            }
        }
    }
}