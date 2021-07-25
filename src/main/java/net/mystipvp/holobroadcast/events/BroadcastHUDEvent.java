/*
 * Copyright (c) 2021.
 *
 * This project (Holobroadcast) and this file is part of Romain Storaï (_Rolyn) and Nathan Djian-Martin (DevKrazy)
 *
 * Holobroadcast cannot be copied and/or distributed without the express permission of Romain Storaï (_Rolyn) and Nathan Djian-Martin (DevKrazy)
 */

package net.mystipvp.holobroadcast.events;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BroadcastHUDEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();
    private final CommandSender sender;
    private String message;
    private long duration;
    private boolean cancellable = false;

    public BroadcastHUDEvent(CommandSender sender, String message, long duration) {
        this.sender = sender;
        this.message = message;
        this.duration = duration;
    }

    public String getMessage() {
        return message;
    }

    public CommandSender getSender() {
        return sender;
    }

    public long getDuration() {
        return duration;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public boolean isCancelled() {
        return cancellable;
    }

    @Override
    public void setCancelled(boolean b) {
        cancellable = b;
    }
}
