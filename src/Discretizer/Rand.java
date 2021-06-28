/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discretizer;



//package keel.Algorithms.Genetic_Rule_Learning.Globals;

import java.util.*;

/**
 * Rand.java
 *
 * Created on 29 de marzo de 2004, 23:31
 */
public class Rand {
    
    private static MTwister random;
    
    /** Generates a new instance of Random */
    public static void initRand() {
        random = new MTwister(Parameters.seed);
    }
    
    /**
     *  Returns a random real between [0,1)
     * @return a random real between [0,1)
     */
    public static double getReal() {
        return random.genrand_real2();
    }
    
    /**
     *  Returns a random int between [uLow,uHigh]
     * @param uLow lower number
     * @param uHigh higher number
     * @return  a random int between [uLow,uHigh]
     */
    public static int getInteger(int uLow, int uHigh) {
    	return (uLow + (int)(random.genrand_real2()*(uHigh + 1 - uLow)));
    }
    
}

