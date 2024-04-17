package com.topas404.matchmaking.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import com.topas404.matchmaking.models.Score;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserScore
 */
@Validated
public class UserScore {
    @JsonProperty("userId")
    private String userId = null;

    @JsonProperty("score")
    private Score score = null;

    public UserScore userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     *
     * @return userId
     **/
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserScore score(Score score) {
        this.score = score;
        return this;
    }

    /**
     * Get score
     *
     * @return score
     **/
    @Valid
    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserScore userScore = (UserScore) o;
        return Objects.equals(this.userId, userScore.userId) && Objects.equals(this.score, userScore.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserScore {\n");

        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
