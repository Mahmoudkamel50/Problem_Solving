#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main() {
    int n;
    cin >> n;
    ll x[n] = {};
    for(int i = 0; i < n; i++) {
        cin >> x[i];
    }
    ll ans = 1e18;
    for(int i = 0; i < (1 << n); i++) {
        ll a = 0, b = 0;
        for(int bit = 0; bit < n; bit++) {
            if(i & (1 << bit)) {
                a += x[bit];
            } else {
                b += x[bit];
            }
        }
        ans = min(ans, llabs(a - b));
    }
    cout << ans << endl;
}
