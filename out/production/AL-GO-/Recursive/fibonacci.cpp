#include<iostream>
using namespace std;

int fibo(int n)
{
if( n==0 || n==1 )
        return n ;

        else
        {
            return fibo(n-1)+fibo(n-2);

        }
}



int main()
{
    int n ;
       cout<<"Enter the range :"<<endl;
    cin>>n;
    for(int i=0;i<n;i++)
    {
      cout<<""<<fibo(i)<<endl;
    }

    return 0;
}
