package com.topas404.matchmaking.api;

import com.google.ortools.graph.MaxFlow;
import com.google.ortools.graph.MinCostFlow;
import com.google.ortools.graph.MinCostFlowBase;

import java.util.*;
import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicInteger;

import com.topas404.matchmaking.dto.MatchmakingRequestBodyDTO;
import com.topas404.matchmaking.models.*;
import com.topas404.matchmaking.models.UserCollaborationSpec.IntentionEnum;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.linear.*;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;

import org.springframework.stereotype.Service;

@Service
public class MatchmakingAlgorithmImplementation {
    static {
        com.google.ortools.Loader.loadNativeLibraries();
    }

    public List<UserPairAssignment> optimize(List<UserScore> userScores, List<UserPairwiseScore> userPairwiseScores, List<UserCollaborationIntentions> userCollaborationIntentions) {
        return null;
    }
}
