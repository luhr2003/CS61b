#include<bits/stdc++.h>
#include<stdexcept>
using namespace std;
class IntList
{
public:
	int first;
	IntList* rest;
	IntList(int first_, IntList* rest_) :first(first_), rest(rest_) {};
	int size()
	{
		return rest == NULL ? 1 : 1 + rest->size();
	}
	int iterativeSize()
	{
		int total = 0;
		IntList* p = rest;
		while (p != NULL)
		{
			total++;
			p = rest->rest;
		}
		return total;
	}
	int iterativeGet(int x)
	{
		IntList* p = rest;
		int ans = first;
		int initx = x;
		while (x != 0)
		{
			if (p == NULL)
				break;
			ans = p->first;
			p = p->rest;
			x--;
		}
		if (x != 0)
			throw out_of_range("out of range error "+to_string(this->size())+" " + to_string(initx));
		return ans;
	}
	int get(int x)
	{
		if (rest == NULL && x != 0)
			throw out_of_range("out_of_range error");
		return x == 0 ? first : rest->get(x - 1);
	}
};
int main()
{
	IntList* a = new IntList(1, new IntList(3, new IntList(5, NULL)));
	IntList* b = new IntList(8, NULL);
	b = new IntList(6, b);
	b = new IntList(4, b);
	b = new IntList(2, b);

	cout << a->size() << endl;
	cout << b->size() << endl;
	for (int i = 0; i < a->size(); i++)
		cout << a->get(i)<<" ";
	cout << endl;
	for (int i = 0; i < b->size(); i++)
		cout << b->iterativeGet(i)<<" ";
	cout << endl;
	try
	{
		cout << a->get(3);
	}
	catch (out_of_range& s)
	{
		cout << s.what() << endl;
	}
	try
	{
		cout << b->iterativeGet(4);
	}
	catch (out_of_range& s)
	{
		cout << s.what();
	}
}