package com.example.Master;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Security {
    int NetworkIFaces;
    int ProcessCount;

    public Security(int size, int processCount) {
        NetworkIFaces = size;
        ProcessCount = processCount;
    }
    public int getNetworkIFaces(){
        return NetworkIFaces;
    }
    public int getProcessCount(){
        return ProcessCount;
    }
    public void setNetworkIFaces(int networkIFaces){
        NetworkIFaces = networkIFaces;
    }
    public void setProcessCount(int processCount){
        ProcessCount = processCount;
    }
}
