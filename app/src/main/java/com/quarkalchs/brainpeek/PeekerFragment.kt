package com.quarkalchs.brainpeek

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class PeekerFragment : Fragment() {

    companion object {
        fun newInstance() = PeekerFragment()
    }

    private lateinit var viewModel: PeekerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.peeker_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PeekerViewModel::class.java)
    }

    private fun startTextsForPlay() {


    }


}