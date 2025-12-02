package org.example;

import java.util.ArrayList;

public class Team {

    private String teamId;
    private ArrayList<Participant> members = new ArrayList<>();

    public Team(String teamId) {
        this.teamId = teamId;
    }

    public void addMember(Participant p) {
        members.add(p);
    }

    public ArrayList<Participant> getMembers() {
        return members;
    }

    public String getTeamId() {
        return teamId;
    }
}
{
}
