package com.example.myapplication;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.myapplication.databinding.FragmentBarracksBinding;

import com.thekhaeng.pushdownanim.PushDownAnim;

import static com.thekhaeng.pushdownanim.PushDownAnim.MODE_SCALE;

public class BarracksFragment extends Fragment {


    private FragmentBarracksBinding binding;
    NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentBarracksBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        binding.ConstraintLayoutteam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.ConstraintLayoutteam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.ConstraintLayoutteam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.ConstraintLayoutteam4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.ConstraintLayoutteam5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.ConstraintLayoutteam6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.ConstraintLayoutteam7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });
        binding.ConstraintLayoutteam8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });

        binding.imageButton59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });
        PushDownAnim.setPushDownAnimTo( binding.button)
                .setScale( MODE_SCALE, 0.89f  )
                .setDurationPush( PushDownAnim.DEFAULT_PUSH_DURATION )
                .setDurationRelease( PushDownAnim.DEFAULT_RELEASE_DURATION )
                .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_barracksFragment_to_createTeamFragment);
            }
        });


        binding.imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.popBackStack();
            }
        });
        
    }
}