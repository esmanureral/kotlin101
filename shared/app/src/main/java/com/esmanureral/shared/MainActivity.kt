package com.esmanureral.shared

import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.esmanureral.shared.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var sharedPreferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var sharedPreferences=this.getSharedPreferences("Kullanicibilgileri", MODE_PRIVATE)
        var editor=sharedPreferences.edit()

        //veri ekleme-kaydetme
        editor.putString("kullanici","kotlin",).apply()
        editor.putInt("sifre",2011).apply()

        //veri okuma
        var kayitlikullanici=sharedPreferences.getString("kullanici","")
        var kayitlisifre=sharedPreferences.getInt("sifre", 0)

        binding.textview.text="Kullanıcı: "+kayitlikullanici + "\n" + "Şifre: "+kayitlisifre

        //editör nesnesinin temel metotları
        /*
        apply():Eş zamanlı kaydeder.Kaydetme bilgisi vermez.
        commit():Eş zamanlı kaydeder.Kaydetme bilgisi verir.
        clear():tüm verileri siler.
        remove(key:String):Anahtar değerini siler.

*/
    }
}