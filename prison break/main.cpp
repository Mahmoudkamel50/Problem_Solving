#include<bits/stdc++.h>
using namespace std;
int main()
{
    long long  t,n,m,r,c;
    cin>>t;
    while(t--){
        cin>>n>>m>>r>>c;
        long long ans = 0;
        ans = max(ans,(r-1) + (c-1));
        ans = max(ans,((n-r) + (c-1)));
        ans = max(ans,((r-1) + (m-c)));
        ans = max(ans,(n-r) + (m-c));

        cout<<ans<<endl;
    }
    return 0;
}