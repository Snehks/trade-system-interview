package com.interview.trade.system;

/**
 * Represents an ongoing trade between two players.
 */
public interface TradeSession {
    /**
     * @return The player who initiated the trade.
     */
    Player getInitiatingPlayer();

    /**
     * @return The player who received the trade request.
     */
    Player getReceivingPlayer();

    /**
     * Allows a player to add an offer to the session.
     * 
     * @param player The player making the offer.
     * @param offer The offer being made.
     * @return True if the offer was added successfully, false otherwise.
     */
    boolean addOffer(Player player, TradeOffer offer);

    /**
     * Allows a player to remove an offer from the session.
     * 
     * @param player The player making the request.
     * @param item The item to remove from the current offers.
     * @return True if the offer was removed successfully, false otherwise.
     */
    boolean removeOffer(Player player, Tradable item);

    /**
     * Confirms the trade from the perspective of one of the players.
     * 
     * @param player The player confirming the trade.
     */
    void confirmTrade(Player player);

    /**
     * @return True if both players have confirmed the trade, false otherwise.
     */
    boolean isTradeConfirmed();

    /**
     * Executes the trade, updating each player's inventory accordingly.
     */
    void executeTrade();
}
