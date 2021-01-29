package com.example.myapplication;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.example.myapplication.databinding.FragmentUnitDisplayBinding;
import com.example.myapplication.databinding.PopupBinding;
import com.thekhaeng.pushdownanim.PushDownAnim;

import static com.thekhaeng.pushdownanim.PushDownAnim.MODE_SCALE;

public class UnitDisplayFragment extends Fragment {

    private Dialog dialog;
    private FragmentUnitDisplayBinding binding;
    private PopupBinding popupBinding;
    NavController navController;
    private Button button,button2;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentUnitDisplayBinding.inflate(inflater, container, false)).getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        binding.imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.popBackStack();
            }
        });


        dialog = new Dialog(getActivity());
        PushDownAnim.setPushDownAnimTo( binding.button)
                .setScale( MODE_SCALE, 0.89f  )
                .setDurationPush( PushDownAnim.DEFAULT_PUSH_DURATION )
                .setDurationRelease( PushDownAnim.DEFAULT_RELEASE_DURATION )
                .setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        dialog.setContentView(R.layout.popup);
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        dialog.show();

                        button = dialog.findViewById(R.id.button);
                        button.setOnClickListener(v1 -> {
                            dialog.dismiss();
                            navController.navigate(R.id.action_unitDisplayFragment_to_createTeamFragment);
                        });

                        button2 = dialog.findViewById(R.id.button2);
                        button2.setOnClickListener(v1 -> {
                            dialog.dismiss();
                            navController.navigate(R.id.action_unitDisplayFragment_to_createTeamFragment);
                        });
                    }
                });


    }
}