#include <iostream>
using namespace std;

void solve(){
    int n;
    cin>>n;
    int a[n];
    int count=0;
    for(int i=0;i<n;i++){
        cin>>a[i];
        if(a[i]==2){
            count++;
        }
    }
    if(count%2==1){
        cout<<-1<<endl;
    }
    else{
        long int ans=0;
        long int i;
        for(i=0;i<n and ans!=count/2;i++){
            if(a[i]==2){
                ans++;
            }
        }
        cout<<i<<endl;
    }
}
int main(){
    solve();
}