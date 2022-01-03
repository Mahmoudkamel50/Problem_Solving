#include <bits/stdc++.h>

using namespace std;

int rev(int n){
    int res = 0;
    while(n > 0){
        res *= 10;
        res += n % 10;
        n = n/10;
    }
    return res;
}

int main()
{
    int T;
    scanf("%d",&T);
    while(T--){
        int a , b;
        scanf("%d %d",&a,&b);
        printf("%d\n",rev(rev(a)+rev(b)));
    }

}

