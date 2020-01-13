package www.sanju.coilimageloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.api.load
import coil.transform.BlurTransformation
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import coil.transform.RoundedCornersTransformation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Image Url
        val imageUrl = "https://images.unsplash.com/photo-1517849845537-4d257902454a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80"


        // Simple Loader
        image1.load(imageUrl)

        // Circle Crop Animation
        image1.load("https://images.unsplash.com/photo-1571233954463-3aafee3889d6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=652&q=80"){
            crossfade(true) // crossfade animation
            crossfade(3000) // animation in seconds ex- 3 seconds
            transformations(CircleCropTransformation()) // circle crop animation
        }

        //Blur Animation
        image1.load("https://images.unsplash.com/photo-1571233954463-3aafee3889d6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=652&q=80"){
            crossfade(true) // crossFade animation
            crossfade(3000) // animation in seconds ex- 3 seconds
            transformations(BlurTransformation(this@MainActivity,3f, 0.3f)) // Blur  animation
        }


        //Circle Crop Animation with Blur Reveal
        image1.load(imageUrl){
            crossfade(true) // crossFade animation
            crossfade(3000) // animation in seconds ex- 3 seconds
            transformations(CircleCropTransformation(),BlurTransformation(this@MainActivity,3f,0.3f)) // Circle Crop animation with blur reveal
        }

        // Customer Rounded Corners
        image1.load("https://images.unsplash.com/photo-1571233954463-3aafee3889d6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=652&q=80"){
            crossfade(true) // crossFade animation
            crossfade(3000) // animation in seconds ex- 3 seconds
            transformations(RoundedCornersTransformation(12f,12f,12f,12f)) // Custom corner radius setter
        }

        //Gray Scale Image
        image1.load("https://images.unsplash.com/photo-1571233954463-3aafee3889d6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=652&q=80") {
            crossfade(true) // crossFade animation
            crossfade(3000) // animation in seconds ex- 3 seconds
            transformations(GrayscaleTransformation()) // Gray Scale Image
        }


        // Load from Drawable
        image1.load(R.drawable.image6)


    }
}


