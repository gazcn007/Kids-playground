function [y,count]=two_pt_Gaussian(f,a,b,m)
count=0;
n=(m+1)/2;
h=(b-a)/n;
a_i=a;
a_i_next=a+h;
%constant c will be (b-a)/2n, c=c1=c2, and it will be used for xi in each
%f(xi)
c=(b-a)/(2*n);
sum=0;
for i=1:n-1
    sum=sum+f(c*(-1/(sqrt(3)))+(a_i+a_i_next)/2)+f(c*(1/(sqrt(3)))+(a_i+a_i_next)/2);
    count=count+2;
    a_i=a_i_next;
    a_i_next=a_i+h;
end
(a_i_next)
(b)
y=c*sum;
return;