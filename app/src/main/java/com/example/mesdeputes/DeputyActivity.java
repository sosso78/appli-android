package com.example.mesdeputes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DeputyActivity extends AppCompatActivity implements DeputyObserverVote{

    private ImageView imageView;
    private TextView textViewName, textViewCirco, textViewEmail, textViewGroupe, textViewMandat, textViewpartifinancier;
    private ListView listViewCollabos;
    private ListView listViewVote;
    private ArrayList<Vote> votes;
    private VoteAdapter voteAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deputy);
        textViewName= findViewById(R.id.textViewDeputyName);
        textViewCirco= findViewById(R.id.textViewDeputyCirco);
        textViewGroupe= findViewById(R.id.textViewDeputyGroupe);
        textViewEmail= findViewById(R.id.textViewDeputyEmail);
        imageView= findViewById(R.id.imageViewDeputy);
        textViewMandat= findViewById(R.id.textViewDeputymandat);
        textViewpartifinancier= findViewById(R.id.textViewpartifinancier);
        listViewCollabos=findViewById(R.id.listViewCollaborator);
        listViewVote=findViewById(R.id.listViewVote);
        votes=new ArrayList<>();
        voteAdapter= new VoteAdapter(votes, this);
        listViewVote.setAdapter(voteAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Deputy deputy= (Deputy) getIntent().getSerializableExtra("deputy");
        textViewName.setText(deputy.getFirstname()+" "+deputy.getLastname());
        textViewCirco.setText(deputy.getDepartment()+", "+
                deputy.getNameCirco()+ " "+ deputy.getNumCirco()+
                (deputy.getNumCirco()==1? "er": "eme")+" circoncription");
        textViewGroupe.setText(deputy.getGroupe());
        textViewEmail.setText(deputy.getEmail());
        textViewMandat.setText("Début mandat : "+deputy.getMandat_debut());
        textViewpartifinancier.setText("parti financier : "+deputy.getParti_financier());

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, deputy.getCollaborator());
        listViewCollabos.setAdapter(adapter);
        ApiServices.loadDeputyAvatar(this, deputy.getNameForAvatar(), imageView);
        ApiServices.searchRequestVotes(this, deputy.getFirstname() + "-" + deputy.getLastname(), this);
    }

    @Override
    public void onReceiveVote(ArrayList<Vote> votes) {
        voteAdapter.setVote(votes);
        voteAdapter.notifyDataSetChanged();
    }
}
