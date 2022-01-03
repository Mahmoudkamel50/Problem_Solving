#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n;
int val[250005];
vector<int>res;
map<int, int>ha;

int exc(int a, int b)
{
    if (a == 0)
    {
        return b;
    }
    return exc(b%a, a);
}

int main()
{
    int i, j, k;
    scanf("%d", &n);

    for (i = 1; i <= n*n; i++)
    {
        scanf("%d", &val[i]);
        ha[val[i]]++;
    }

    sort(val + 1, val + n*n + 1);
    for (i = n*n; i >= 1; i--)
    {
        if (ha[val[i]] == 0)continue;
        ha[val[i]]--;

        for (j = 0; j < res.size(); j++)
        {
            int t = exc(val[i], res[j]);
            ha[t] = ha[t] - 2;
        }
        res.push_back(val[i]);
    }
    for (i = 0; i < res.size(); i++)
    {
        printf("%d ", res[i]);
    }
    //system("pause");
    return 0;
}
