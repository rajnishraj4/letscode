package com.practice.letscode.algorithm.logical;


public class MaxAreaHistogram {
    public static void main(String ...args)
    {
        int [] bar = {2,4,6,1,3,6,7,4,2,6,9};
        int maxArea = getMaxHistogramArea(bar);
        System.out.println("Max area possible area is "+maxArea+" SqUnit");

    }

    private static int getMaxHistogramArea(int [] bar)
    {
        int width=1;
        int right=0;
        int left=0;
        int area=0;

        for(int i=0;i<bar.length;i++)
        {
            left = i-1;
            right = i+1;
            while(left>=0&&bar[i]<=bar[left])
            {
                left--;
                width++;
            }
            while(right<bar.length&&bar[i]<=bar[right])
            {
                right++;
                width++;
            }

            int temp = width*bar[i];
            width = 1;
            area  = area<temp?temp:area;
        }
        return  area;
    }
}
