package uz.dev.mysteppertu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.dev.mysteppertu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            statusViewController.statusView.run {
                currentCount = 2
                circleFillColorCurrent = Color.RED
            }
        }

    }
}