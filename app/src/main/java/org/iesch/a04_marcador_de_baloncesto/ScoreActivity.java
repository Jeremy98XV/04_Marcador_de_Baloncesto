package org.iesch.a04_marcador_de_baloncesto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.iesch.a04_marcador_de_baloncesto.databinding.ActivityScoreBinding;

public class ScoreActivity extends AppCompatActivity {

    private ActivityScoreBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //1.- Recojo las puntuiaciones que vienen del marcador

        Integer localScore = getIntent().getExtras().getInt("localScore");
        Integer visitorScore = getIntent().getExtras().getInt("visitorScore");
        //2.- Dibujo las puntuaciones obtenidas y escribo el texto
        binding.scoreText.setText(String.valueOf(localScore) + " - " + visitorScore.toString());


        if(localScore>visitorScore){
            binding.whoWonText.setText("Gano el equipo Local");
        }else if(localScore<visitorScore){
            binding.whoWonText.setText("Gano el equipo Visitante");
        }else{
            binding.whoWonText.setText("EMPATE!!");
        }
    }
}