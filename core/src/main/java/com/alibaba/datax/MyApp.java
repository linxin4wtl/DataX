package com.alibaba.datax;

import com.alibaba.datax.core.Engine;

public class MyApp {
    public static void main(String[] args) throws Throwable {
        System.setProperty("datax.home","F:\\workspace-1-high-alibaba-dts-datax-dubbo-sentinel\\datax-total\\DataX\\target\\datax\\datax");

        String[] argsx={"-job","F:\\workspace-1-high-alibaba-dts-datax-dubbo-sentinel\\datax-total\\DataX\\core\\src\\main\\job\\test.json"
                ,"-mode","standalone","-jobid","-1"};
        Engine.entry(argsx);
    }
}
