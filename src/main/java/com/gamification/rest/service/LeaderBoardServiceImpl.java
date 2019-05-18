package com.gamification.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gamification.rest.domain.LeaderBoardRow;
import com.gamification.rest.repository.ScoreCardRepository;

@Service
class LeaderBoardServiceImpl implements LeaderBoardService {

    private ScoreCardRepository scoreCardRepository;

    LeaderBoardServiceImpl(ScoreCardRepository scoreCardRepository) {
        this.scoreCardRepository = scoreCardRepository;
    }

    @Override
    public List<LeaderBoardRow> getCurrentLeaderBoard() {
        return scoreCardRepository.findFirst10();
    }
}