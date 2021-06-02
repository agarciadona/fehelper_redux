package com.example.myapplication;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.myapplication.databinding.FragmentTitleBinding;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class TitleFragment extends Fragment {

    Executor executor = Executors.newSingleThreadExecutor();
    private FragmentTitleBinding binding;
    NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentTitleBinding.inflate(inflater, container, false)).getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        MutableLiveData<Boolean> finishedLoading = new MutableLiveData<>();

        finishedLoading.observe(getViewLifecycleOwner(), new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                navController.navigate(R.id.action_titleFragment_to_loginFragment);
            }
        });

        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    // simular la carga de recursos
                    Thread.sleep(3000);
                    finishedLoading.postValue(true);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

    }

}