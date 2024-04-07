package com.example.mesdeputes;

import java.util.ArrayList;

public interface DeputyObserverVote {

    void onReceiveVote(ArrayList<Vote> votes);
}