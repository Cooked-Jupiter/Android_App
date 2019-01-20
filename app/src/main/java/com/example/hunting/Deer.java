package com.example.hunting;

public class Deer extends animalType {
    String deerType;
    Deer()
    {
        super();
        deerType = "unknown";
    }

    Deer(String type, int leftAntlerAmount, int rightAntlerAmount, double totalSize,
         double totalRightSize, double totalLeftSize, String deerType)
    {
        super(type, leftAntlerAmount,  rightAntlerAmount,  totalSize,
         totalRightSize, totalLeftSize);
        this.deerType = deerType;
    }

    public void setDeerType(String type)
    {
        this.deerType = type;
    }
}
