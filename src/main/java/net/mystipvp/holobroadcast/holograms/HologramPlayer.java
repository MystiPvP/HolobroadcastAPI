/*
 * Copyright (c) 2021.
 *
 * This project (Holobroadcast) and this file is part of Romain Storaï (_Rolyn) and Nathan Djian-Martin (DevKrazy)
 *
 * Holobroadcast cannot be copied and/or distributed without the express permission of Romain Storaï (_Rolyn) and Nathan Djian-Martin (DevKrazy)
 */

package net.mystipvp.holobroadcast.holograms;

import org.bukkit.command.CommandSender;

public class HologramPlayer {

    /**
     * Sets the HologramPlayer's HologramHUD and show it for a specific duration.
     * Also removes the HologramPlayer's current HologramHUD.
     *
     * @param creator  the Sender whose permissions will be checked in order to apply placeholders
     * @param rawData  the raw String data
     * @param lifeTime the time in ticks during which the HUD will be show to the player
     */
    public void showHUD(CommandSender creator, String rawData, long lifeTime) {}

    /**
     * Sets the HologramPlayer's HologramHUD and show it for a specific duration.
     * Also removes the HologramPlayer's current HologramHUD.
     *
     * @param rawData     the raw String data
     * @param lifeTime the time in ticks during which the HUD will be show to the player
     */
    public void showHUD(String rawData, long lifeTime) {}

    /**
     * Sets the HologramPlayer's HologramHUD after a delay and shows it for a specific duration
     * Also removes the HologramPlayer's current HologramHUD.
     *
     * @param creator  the Sender whose permissions will be checked in order to apply placeholders
     * @param rawData  the raw String data
     * @param lifeTime the time in ticks during which the HUD will be show to the player
     * @param delay    the delay in ticks after which the HUD will be shown to the player
     */
    public void showDelayedHUD(CommandSender creator, String rawData, long lifeTime, long delay) {}

    /**
     * Sets the HologramPlayer's HologramHUD after a delay and shows it for a specific duration
     * Also removes the HologramPlayer's current HologramHUD.
     *
     * @param rawData  the raw String data
     * @param lifeTime the time in ticks during which the HUD will be show to the player
     * @param delay    the delay in ticks after which the HUD will be shown to the player
     */
    public void showDelayedHUD(String rawData, long lifeTime, long delay) {}

    /**
     * Deletes the HologramPlayer's current HologramHUD if he has one.
     */
    public void deleteHUD() {}

    /**
     * Checks if a HologramPlayer currently has a HologramHUD.
     *
     * @return true if the HologramPlayer has a HologramHUD; false otherwise.
     */
    public boolean hasHUD() {return true;}
}
