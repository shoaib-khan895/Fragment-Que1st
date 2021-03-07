package com.example.fragment_question1

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
class FragDemo : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("FragmentActivity---->","onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("FragmentActivity---->","onViewCreated")

    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.i("FragmentActivity---->","onViewStateRestored")

    }

    override fun onStart() {
        super.onStart()
        Log.i("FragmentActivity---->","onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("FragmentActivity---->","onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("FragmentActivity---->","onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i("FragmentActivity---->","onStop")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("FragmentActivity---->","onSaveInstanceState")


    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("FragmentActivity---->","onDestroyView")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("FragmentActivity---->","onDestroy")

    }}
