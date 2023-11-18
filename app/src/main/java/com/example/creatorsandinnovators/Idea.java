package com.example.creatorsandinnovators;

import java.util.List;

public class Idea {
    private String description;
    private int ideaScore;
    private List<Skill> preferredSkillSet;
    private void upvote(){
        ideaScore=ideaScore+1;
    }
    private void downvote(){
        ideaScore=ideaScore-1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdeaScore() {
        return ideaScore;
    }

    public void setIdeaScore(int ideaScore) {
        this.ideaScore = ideaScore;
    }

    public List<Skill> getPreferredSkillSet() {
        return preferredSkillSet;
    }

    public void setPreferredSkillSet(List<Skill> preferredSkillSet) {
        this.preferredSkillSet = preferredSkillSet;
    }
}
