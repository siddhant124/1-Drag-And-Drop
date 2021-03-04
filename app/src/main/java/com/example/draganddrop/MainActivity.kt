package com.example.draganddrop

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.draganddrop.databinding.ActivityMainBinding
import com.jmedeisis.draglinearlayout.DragLinearLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view  = binding.root
        setContentView(view)


        val dragLayout: DragLinearLayout =  binding.container

        // we are creating for loop for dragging
        // and dropping of child items.
        for (i in 0 until dragLayout.childCount) {

            // below is the child inside dragger layout
            val child: View = dragLayout.getChildAt(i)

            // below line will set all children draggable
            // except the header layout.
            // the child is its own drag handle.
            dragLayout.setViewDraggable(child, child)
        }

    }
}