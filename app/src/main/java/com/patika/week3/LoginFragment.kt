package com.patika.week3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.patika.week3.databinding.FragmentDayBinding
import com.patika.week3.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    private lateinit var username : EditText
    private lateinit var password: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        username = binding.editTextUsername
        password = binding.editTextPassword

        binding.button.setOnClickListener {
            loginAuth(username, password)
        }
    }

    private fun loginAuth(username: EditText, password: EditText) {
        if (username.text.toString() == "admin" && password.text.toString() == "admin") {
            //Login Successful
            Toast.makeText(requireContext(), "Login Successful", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_loginFragment_to_nav_graph)
        } else {
            //Login Failed
            Toast.makeText(requireContext(), "Login Failed", Toast.LENGTH_SHORT).show()
        }
    }

}