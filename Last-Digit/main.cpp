#include <iostream>
using namespace std;

int main() {

    int t;
    scanf("%d", &t);
    while (t--){
        int n;
        scanf("%d" , &n);

        n = n%10;
        printf("%d", n);
    }

}
