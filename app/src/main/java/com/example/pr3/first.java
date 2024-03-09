package com.example.pr3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class first extends Fragment {

    public first() {
        super(R.layout.fragment_first);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("111", "onCreate");
        Log.d("111", "View now is in null state");
        Log.d("111", "Fragment now is in " +
                getLifecycle().getCurrentState().toString() + " state");
        Toast.makeText(getContext(), "onCreate", Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.d("111", "onCreateView");
        Log.d("111", "View now is in " +
                getViewLifecycleOwner().getLifecycle().getCurrentState().toString() + " state");
        Log.d("111", "Fragment now is in " +
                getLifecycle().getCurrentState().toString() + " state");
        Toast.makeText(getContext(), "onCreateView", Toast.LENGTH_SHORT).show();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d("111", "onViewCreated");
        Log.d("111", "View now is in " +
                getViewLifecycleOwner().getLifecycle().getCurrentState().toString() + " state");
        Log.d("111", "Fragment now is in " +
                getLifecycle().getCurrentState().toString() + " state");
        Toast.makeText(getContext(), "onViewCreated", Toast.LENGTH_LONG).show();
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Log.d("111", "onViewStateRestored");
        Log.d("111", "View now is in " +
                getViewLifecycleOwner().getLifecycle().getCurrentState().toString() + " state");
        Log.d("111", "Fragment now is in " +
                getLifecycle().getCurrentState().toString() + " state");
        Toast.makeText(getContext(), "onViewStateRestored", Toast.LENGTH_LONG).show();
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("111", "onStart");
        Log.d("111", "View now is in " +
                getViewLifecycleOwner().getLifecycle().getCurrentState().toString() + " state");
        Log.d("111", "Fragment now is in " +
                getLifecycle().getCurrentState().toString() + " state");
        Toast.makeText(getContext(), "onStart", Toast.LENGTH_LONG).show();
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("111", "onResume");
        Log.d("111", "View now is in " +
                getViewLifecycleOwner().getLifecycle().getCurrentState().toString() + " state");
        Log.d("111", "Fragment now is in " +
                getLifecycle().getCurrentState().toString() + " state");
        Toast.makeText(getContext(), "onResume", Toast.LENGTH_LONG).show();
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("111", "onPause");
        Log.d("111", "View now is in " +
                getViewLifecycleOwner().getLifecycle().getCurrentState().toString() + " state");
        Log.d("111", "Fragment now is in " +
                getLifecycle().getCurrentState().toString() + " state");
        Toast.makeText(getContext(), "onPause", Toast.LENGTH_LONG).show();
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("111", "onStop");
        Log.d("111", "View now is in " +
                getViewLifecycleOwner().getLifecycle().getCurrentState().toString() + " state");
        Log.d("111", "Fragment now is in " +
                getLifecycle().getCurrentState().toString() + " state");
        Toast.makeText(getContext(), "onStop", Toast.LENGTH_LONG).show();
        super.onStop();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d("111", "onSaveInstanceState");
        Log.d("111", "View now is in " +
                getViewLifecycleOwner().getLifecycle().getCurrentState().toString() + " state");
        Log.d("111", "Fragment now is in " +
                getLifecycle().getCurrentState().toString() + " state");
        Toast.makeText(getContext(), "onSaveInstanceState", Toast.LENGTH_LONG).show();
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onDestroyView() {
        Log.d("111", "onDestroyView");
        Log.d("111", "View now is in " +
                getViewLifecycleOwner().getLifecycle().getCurrentState().toString() + " state");
        Log.d("111", "Fragment now is in " +
                getLifecycle().getCurrentState().toString() + " state");
        Toast.makeText(getContext(), "onDestroyView", Toast.LENGTH_LONG).show();
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("111", "onDestroy");
        Log.d("111", "View now is in " +
                getViewLifecycleOwner().getLifecycle().getCurrentState().toString() + " state");
        Log.d("111", "Fragment now is in " +
                getLifecycle().getCurrentState().toString() + " state");
        Toast.makeText(getContext(), "onDestroy", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}