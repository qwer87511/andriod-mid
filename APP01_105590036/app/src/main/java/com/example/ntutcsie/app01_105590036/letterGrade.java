package com.example.ntutcsie.app01_105590036;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class letterGrade {

    public String getGrade(int iScore) {
        String strGrade = "";

        if(iScore > 100)
            strGrade += "X";
        else if(90 <= iScore && iScore <= 100)
            strGrade += "A";
        else if(80 <= iScore && iScore <= 89)
            strGrade += "B";
        else if(70 <= iScore && iScore <= 79)
            strGrade += "C";
        else if(60 <= iScore && iScore <= 69)
            strGrade += "D";
        else if(0 <= iScore && iScore <= 59)
            strGrade += "F";
        else
            strGrade += "X";

        return strGrade;
    }

}
