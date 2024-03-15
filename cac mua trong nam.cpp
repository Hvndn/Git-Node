#include <bits\stdc++.h>
using namespace std;
int main (){
    int thang;
    cin>>thang;
    
  	if (thang >= 2 && thang <= 4) {
    cout<<"Xuân";
  	} else if (thang >= 5 && thang <= 7) {
    cout<<"Hạ";
  	} else if (thang >= 8 && thang <= 10) {
    cout<<"Thu";
  	} else if (thang >= 11 || thang <= 1) {
    cout<<"Đông";
 	} else {
    cout << "Tháng không hợp lệ!";
	}
    return 0;
}