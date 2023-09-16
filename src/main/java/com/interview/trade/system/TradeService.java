package com.interview.trade.system;

/**
 * Service responsible for managing trade sessions and player interactions within those sessions.
 */
public interface TradeService {
    /**
     * Initiates a new trade session between two players.
     * 
     * @param initiatingPlayer The player initiating the trade.
     * @param receivingPlayer The player receiving the trade request.
     * @return A new TradeSession.
     */
    TradeSession initiateTrade(Player initiatingPlayer, Player receivingPlayer);

    // ... [Rest of the methods with their respective Javadoc comments] ...
}
