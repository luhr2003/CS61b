#include<bits/stdc++.h>
using namespace std;
class test
{
	public:
		int num;
		test(int num_):num(num_){
		};
};
int main()
{
	test* a=new test[2]{1,2};
	cout<<a[0].num<<endl;
	cout<<a[1].num;
	delete a;
	
} 
