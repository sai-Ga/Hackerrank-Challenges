#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{   int a, b;
    int SumI = 0;
    int DiffI = 0;
    float c, d, SumF, DiffF;
    
    scanf("%d %d",&a, &b);
    scanf("%f %f",&c, &d);
    
    SumI = a+b;
    SumF = c+d; 
    DiffI = a-b;
    DiffF = c-d;
    
    printf("%d %d\n", SumI, DiffI);
    printf("%.1f %.1f", SumF, DiffF);
    
    return 0;
}