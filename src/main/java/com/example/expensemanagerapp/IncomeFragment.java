package com.example.expensemanagerapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class IncomeFragment extends Fragment {


        class MyViewHolder extends RecyclerView.ViewHolder {

            View mView;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                mView = itemView;
            }

            void setType(String type) {
                TextView mType = mView.findViewById(R.id.type_txt_income);
                mType.setText(type);
            }

            void setNote(String note) {

                TextView mNote = mView.findViewById(R.id.note_txt_income);
                mNote.setText(note);
            }

            void setDate(String date) {
                TextView mDate = mView.findViewById(R.id.date_txt_income);
                mDate.setText(date);
            }

            void setAmmount(int ammount) {
                TextView mAmmount = mView.findViewById(R.id.ammount_txt_income);
                String stammount = String.valueOf(ammount);
                mAmmount.setText(stammount);
            }
        }
    }
