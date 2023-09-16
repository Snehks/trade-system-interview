package com.interview.trade.system;

/**
 * Represents a player in the game with capabilities to manage their inventory.
 */
public interface Player {
    /**
     * @return The player's unique identifier.
     */
    int getPlayerId();

    /**
     * @return The player's name.
     */
    String getPlayerName();

    /**
     * Adds a tradable item to the player's inventory.
     * 
     * @param item The item to add.
     */
    void addToInventory(Tradable item);

    /**
     * Removes a tradable item from the player's inventory.
     * 
     * @param item The item to remove.
     * @return True if the item was removed successfully, false otherwise.
     */
    boolean removeFromInventory(Tradable item);
}
