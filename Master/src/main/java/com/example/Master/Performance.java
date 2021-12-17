package com.example.Master;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Performance {
    Double ProcessCpuLoad;
    int LogicalProcessorCount;
    int PhysicalProcessorCount;
    Double SystemLoadAverage;
    long[][] SystemCpuLoadTicks;
    long UsedMemory;
    long TotalMemory;
    long AvailableMemory;
    String IpAddress;
    String IpAddressCount;

    public Performance(double processCpuLoad, double systemLoadAverage, int logicalProcessorCount,int physicalProcessorCount,
                       long[][] systemCpuLoadTicks,long usedMemory, long totalMemory,long availableMemory,String ipAddressCount, String ipAddress) {
        ProcessCpuLoad = processCpuLoad;
        SystemLoadAverage = systemLoadAverage;
        LogicalProcessorCount = logicalProcessorCount;
        PhysicalProcessorCount = physicalProcessorCount;
        SystemCpuLoadTicks = systemCpuLoadTicks;
        UsedMemory = usedMemory;
        TotalMemory = totalMemory;
        AvailableMemory = availableMemory;
        IpAddress = ipAddress;
        IpAddressCount = ipAddressCount;
    }
    public  double getProcessCpuLoad(){
        return ProcessCpuLoad;
    }
    public  double getSystemLoadAverage(){
        return SystemLoadAverage;
    }
    public  int getLogicalProcessorCount(){
        return LogicalProcessorCount;
    }
    public  int getPhysicalProcessorCount(){
        return PhysicalProcessorCount;
    }
    public  long[][] getSystemCpuLoadTicks(){
        return SystemCpuLoadTicks;
    }
    public  double getUsedMemory(){
        return UsedMemory;
    }
    public  double getAvailableMemory(){
        return AvailableMemory;
    }
    public  double getTotalMemory(){
        return TotalMemory;
    }
    public String getIpAddress(){
        return IpAddress;
    }
    public String getIpAddressCount(){
        return IpAddressCount;
    }


    public  void setProcessCpuLoad(double processCpuLoad){
         ProcessCpuLoad = processCpuLoad;
    }
    public void setSystemLoadAverage(double systemLoadAverage){
        SystemLoadAverage = systemLoadAverage;
    }
    public void setLogicalProcessorCount(int logicalProcessorCount){
        LogicalProcessorCount = logicalProcessorCount;
    }
    public void setPhysicalProcessorCount(int physicalProcessorCount){
        PhysicalProcessorCount = physicalProcessorCount;
    }
    public void setSystemCpuLoadTicks(long[][] systemCpuLoadTicks){
        SystemCpuLoadTicks = systemCpuLoadTicks;
    }
    public void setUsedMemory(long usedMemory){
        UsedMemory = usedMemory;
    }
    public void setAvailableMemory(long availableMemory){
        AvailableMemory = availableMemory;
    }
    public void setTotalMemory(long totalMemory){
        TotalMemory = totalMemory;
    }
    public void setIpAddress(String ipAddress){
        IpAddress = ipAddress;
    }
    public void setIpAddressCount(String ipAddressCount){
        IpAddressCount = ipAddressCount;
    }

}
