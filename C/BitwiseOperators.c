#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
  //Write your code here.
  int max_a=0, max_o=0, max_x=0;
  for(int i=1 ; i<=n; i++){
      for(int j =i+1; j<=n; j++){ 
      int x = i&j;
      int y = i|j;
      int z = i^j;
      
      if (x<k && x>max_a)
        max_a=x;
      if (y<k && y>max_o)
        max_o=y;
      if (z<k && z>max_x)
        max_x=z; 
      } 
  }
  printf("%d\n%d\n%d",max_a,max_o,max_x);
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
