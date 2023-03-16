package com.galactapp.taskplanner.ui.secondfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.galactapp.taskplanner.R;
import com.galactapp.taskplanner.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // bottão para navegar entre fragments usando o Navigation Component do Android Studio
        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // metodo para navegar entre fragments usando o Navigation Component do Android Studio
                // o método findNavController() é usado para encontrar o NavController associado ao fragmento
                // o método navigate() é usado para navegar para o destino especificado
                // o método action_SecondFragment_to_FirstFragment é gerado automaticamente pelo Android Studio atraves do Navigation Component xml
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}