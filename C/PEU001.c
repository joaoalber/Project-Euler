// Solution to P.E Exercise 1
#include <stdio.h>

int main() {
    int last;
    for (int i=0; i<1000; i++) {
        if ((i%3==0) || (i%5==0))
            last = last+i;
    }
    printf ("The sum of multiples of 3 and 5 below 1000 is:%d",last);
}