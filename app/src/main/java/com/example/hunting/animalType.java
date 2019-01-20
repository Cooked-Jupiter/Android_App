package com.example.hunting;

public class animalType {
    String type;
    int leftAntlerAmount, rightAntlerAmount;
    double totalSize, totalRightSize, totalLeftSize;
    animalType()
    {
        type = "unknown";
        leftAntlerAmount = 0;
        rightAntlerAmount = 0;
        totalSize = 0;
        totalRightSize = 0;
        totalLeftSize = 0;
    }

    public animalType(String type, int leftAntlerAmount, int rightAntlerAmount, double totalSize,
                      double totalRightSize, double totalLeftSize) {
        this.type = type;
        this.leftAntlerAmount = leftAntlerAmount;
        this.rightAntlerAmount = rightAntlerAmount;
        this.totalSize = totalSize;
        this.totalRightSize = totalRightSize;
        this.totalLeftSize = totalLeftSize;
    }

    public void setLeftAntlerAmount(int leftAmount)
    {
        this.leftAntlerAmount = leftAmount;
    }
    public void setRightAntlerAmount(int rightAmount)
    {
        this.rightAntlerAmount = rightAmount;
    }
    public void setTotalSize(int totalAmount)
    {
        this.totalSize = totalAmount;
    }
    public void setTotalLeftSize(int totalLeftSize)
    {
        this.totalLeftSize = totalLeftSize;
    }
    public void setTotalRightSize(int totalRightSize)
    {
        this.totalRightSize = totalRightSize;
    }

}
