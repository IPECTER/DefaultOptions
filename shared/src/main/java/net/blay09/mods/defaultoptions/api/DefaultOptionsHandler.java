package net.blay09.mods.defaultoptions.api;

import net.blay09.mods.defaultoptions.DefaultOptionsHandlerException;

public interface DefaultOptionsHandler {
    String getId();
    DefaultOptionsCategory getCategory();
    void saveCurrentOptions();
    void saveCurrentOptionsAsDefault() throws DefaultOptionsHandlerException;
    boolean hasDefaults();
}
