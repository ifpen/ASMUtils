package fr.ifpen.allotropeconverters.allotropeutils;

import java.util.List;


/**
 * Represents an Allotrope data cube
 * @param dimensions the X axis values
 * @param measures the Y axis values
 */
public record AllotropeData(List<List<Double>> dimensions, List<List<Double>> measures){}
