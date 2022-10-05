#include<iostream>
using namespace std;
void swap(int a[], int *x, int*y){
	int temp=*x;
	*x=*y;
	*y=temp;
	
}
int partition(int arr[],int l,int h){

		
int i=l;
	int pivot;
	int count=0;
	while(i<=h)
	{
		if(arr[i]<arr[l])
		count++;
		i++;
	}

	pivot=count+l;
	swap(arr[l],arr[pivot]);

	int si=l;
	int ei=h;
	while(si<pivot && ei>pivot)
	{
		if(arr[si]<arr[pivot])
		si++;
		else if(arr[ei]>arr[pivot])
		ei--;
		else
		{
			swap(arr[si],arr[ei]);
			si++;
			ei--;
		}
	}
	return pivot;
}

void quicksort(int arr[],int l, int h){
	if(l>=h){
		return ;
	}
		int pivot=partition(arr,l,h);
		quicksort(arr,l,pivot-1);
		quicksort(arr,pivot+1,h);
	
}
void display(int arr[], int n){
	for(int i=0;i<n-1;i++){
		cout<<arr[i]<<" ";
	}
}
int main(){
	int a[6]={6,2,7,5,1,8};
	quicksort(a,0,5);
	display(a,6);
}
