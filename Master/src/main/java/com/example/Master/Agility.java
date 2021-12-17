package com.example.Master;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Agility {
    double CpuTemperature;
    double CpuVoltage;
    int[] FanSpeeds;
    public Agility(double cpuTemperature, double cpuVoltage, int[] fanSpeeds){
        CpuTemperature = cpuTemperature;
        CpuVoltage = cpuVoltage;
        FanSpeeds = fanSpeeds;
    }
    public double getCpuTemperature(){
        return CpuTemperature;
    }
    public double getCpuVoltage(){
        return CpuVoltage;
    }
    public int[] getFanSpeeds(){
        return FanSpeeds;
    }
    public void setCpuTemperature(double cpuTemperature){
        CpuTemperature = cpuTemperature;
    }
    public void setCpuVoltage(double cpuVoltage){
        CpuVoltage = cpuVoltage;
    }
    public void setFanSpeeds(int[] fanSpeeds){
        FanSpeeds = fanSpeeds;
    }
}
