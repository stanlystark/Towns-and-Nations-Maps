package org.leralix.towns_and_nations_dynmap.Style;

import org.bukkit.configuration.file.FileConfiguration;

public class ChunkStyle {
    String baseStrokeColor;
    double strokeOpacity;
    int baseStrokeWeight;
    String fillColor;
    double fillOpacity;

    public ChunkStyle(FileConfiguration cfg, String path) {
        baseStrokeColor = cfg.getString(path+".strokeColor", "#FF0000");
        strokeOpacity = cfg.getDouble(path+".strokeOpacity", 0.8);
        baseStrokeWeight = cfg.getInt(path+".strokeWeight", 3);
        fillColor = cfg.getString(path+".fillColor", "#FF0000");
        fillOpacity = cfg.getDouble(path+".fillOpacity", 0.35);
    }
    public String getBaseStrokeColor() {
        return baseStrokeColor;
    }

    public double getStrokeOpacity() {
        return strokeOpacity;
    }

    public int getBaseStrokeWeight() {
        return baseStrokeWeight;
    }

    public String getFillColor() {
        return fillColor;
    }

    public double getFillOpacity() {
        return fillOpacity;
    }
}