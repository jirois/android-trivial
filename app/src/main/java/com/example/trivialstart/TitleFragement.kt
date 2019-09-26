package com.example.trivialstart


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.*
import android.view.ViewGroup
import android.widget.TextView
//import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.trivialstart.databinding.FragmentTitleBinding

private val FragmentTitleBinding.root: View?
    get() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

/**
 * A simple [Fragment] subclass.
 */
class TitleFragement : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title,container, false )

        binding.playButton.setOnClickListener{ view : View->
            view.findNavController().navigate(R.id.action_titleFragement3_to_gameFragment)
        }

        return binding.root
    }

}