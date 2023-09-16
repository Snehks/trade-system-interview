package com.interview.trade.system;

/**
 * Represents an offer made by a player during a trade session.
 */
public interface TradeOffer {
    /**
     * @return The tradable item being offered.
     */
    Tradable getTradable();

    /**
     * @return The type of trade being made (e.g., ITEM, CASH, POKEMON).
     */
    TradeType getTradeType();
}
