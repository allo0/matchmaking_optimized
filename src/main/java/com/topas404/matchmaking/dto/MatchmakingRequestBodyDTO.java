package com.topas404.matchmaking.dto;

import com.topas404.matchmaking.models.UserCollaborationIntentions;
import com.topas404.matchmaking.models.UserPairwiseScore;
import com.topas404.matchmaking.models.UserScore;
import java.util.List;

public class MatchmakingRequestBodyDTO {

    private List<UserScore> userGlobalScores;
    private List<UserPairwiseScore> userPairwiseScore;
    private List<UserCollaborationIntentions> userCollaborationIntentions;

    // Getters and setters

    public List<UserScore> getUserGlobalScores() {
        return userGlobalScores;
    }

    public void setUserGlobalScores(List<UserScore> userGlobalScores) {
        this.userGlobalScores = userGlobalScores;
    }

    public List<UserPairwiseScore> getUserPairwiseScore() {
        return userPairwiseScore;
    }

    public void setUserPairwiseScore(List<UserPairwiseScore> userPairwiseScore) {
        this.userPairwiseScore = userPairwiseScore;
    }

    public List<UserCollaborationIntentions> getUserCollaborationIntentions() {
        return userCollaborationIntentions;
    }

    public void setUserCollaborationIntentions(List<UserCollaborationIntentions> userCollaborationIntentions) {
        this.userCollaborationIntentions = userCollaborationIntentions;
    }
}
