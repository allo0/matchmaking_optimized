package com.topas404.matchmaking.controllers;

import com.topas404.matchmaking.api.MatchmakingAlgorithmImplementation;
import com.topas404.matchmaking.dto.MatchmakingRequestBodyDTO;
import com.topas404.matchmaking.models.UserPairAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/matchmaking")
public class MatchmakingController {

    @Autowired
    private final MatchmakingAlgorithmImplementation matchmakingService;


    public MatchmakingController(MatchmakingAlgorithmImplementation matchmakingService) {
        this.matchmakingService = matchmakingService;
    }

    @PostMapping("/calculate_pairs")
    public ResponseEntity<List<UserPairAssignment>> matchmakingPost(@Valid @RequestBody MatchmakingRequestBodyDTO body) {

        //TODO Compute utilities
        //TODO Setup and solve the optimization model
        List<UserPairAssignment> result = matchmakingService.optimize(
                body.getUserGlobalScores(),
                body.getUserPairwiseScore(),
                body.getUserCollaborationIntentions()
        );


        return new ResponseEntity<>(result,HttpStatus.OK);
    }
}
