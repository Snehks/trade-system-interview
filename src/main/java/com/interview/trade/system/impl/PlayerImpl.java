package com.interview.trade.system.impl;

import com.interview.trade.system.Player;
import com.interview.trade.system.Tradable;

//TODO: Implement this class and implement all the other interfaces
public class PlayerImpl implements Player {
    @Override
    public int getPlayerId() {
        return 0;
    }

    @Override
    public String getPlayerName() {
        return null;
    }

    @Override
    public void addToInventory(Tradable item) {

    }

    @Override
    public boolean removeFromInventory(Tradable item) {
        return false;
    }
}
