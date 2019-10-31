package com.util;/*
 *create by Sadie on
 */

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

//package org.apache.commons.math3.stat.descriptive.summary;

import java.io.Serializable;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic;
import org.apache.commons.math3.util.MathUtils;

public class MySumOfSquares extends AbstractStorelessUnivariateStatistic implements Serializable {
    private static final long serialVersionUID = 1460986908574398008L;
    private long n;
    private double value;

    public MySumOfSquares() {
        this.n = 0L;
        this.value = 0.0D;
    }

    public MySumOfSquares(MySumOfSquares original) throws NullArgumentException {
        copy(original, this);
    }

    public void increment(double d) {
        this.value += d * d;
        ++this.n;
    }

    public double getResult() {
        return this.value;
    }

    public long getN() {
        return this.n;
    }

    public void clear() {
        this.value = 0.0D;
        this.n = 0L;
    }

    public double evaluate(double[] values, int begin, int length) throws MathIllegalArgumentException {
        double sumSq = 0.0D / 0.0;
        if (this.test(values, begin, length, true)) {
            sumSq = 0.0D;

            for(int i = begin; i < begin + length; ++i) {
                sumSq += values[i] * values[i];
            }
        }

        return sumSq;
    }

    public MySumOfSquares copy() {
        MySumOfSquares result = new MySumOfSquares();
        copy(this, result);
        return result;
    }

    public static void copy(MySumOfSquares source, MySumOfSquares dest) throws NullArgumentException {
        MathUtils.checkNotNull(source);
        MathUtils.checkNotNull(dest);
        dest.setData(source.getDataRef());
        dest.n = source.n;
        dest.value = source.value;
    }
}
