package com.esmanureral.shareduygulamasi

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.esmanureral.shareduygulamasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var sharedPreferences = this.getSharedPreferences("ProfilBilgileri", MODE_PRIVATE)

        binding.btnKaydet.setOnClickListener {
            var adiSoyadi = binding.adSoyadText.text.toString()
            var yasi = binding.yasText.text.toString()
            if (adiSoyadi.isNotEmpty() && yasi.isNotEmpty()) {
                //veri kaydettik.
                sharedPreferences.edit().putString("adSoyad", adiSoyadi).apply()
                sharedPreferences.edit().putString("yas", yasi).apply()
                binding.adSoyadText.text.clear()
                binding.yasText.text.clear()
                Toast.makeText(applicationContext,"Kayıt başarılı",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(applicationContext,"İlgili alanları boş bırakmayınız.",Toast.LENGTH_LONG).show()
            }
        }
        binding.btnGoster.setOnClickListener {
            var gosterAdsoyad=sharedPreferences.getString("adSoyad","")
            var gosterYas=sharedPreferences.getString("yas","")
            binding.textView.text=gosterAdsoyad+"\n"+gosterYas
        }
        //silme ve kaydetme için editör kullanılır.
        binding.btnSil.setOnClickListener {
            sharedPreferences.edit().remove("yas").apply()
        }
    }
}
