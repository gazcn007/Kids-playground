function [y,count,m]=Rec_Trapezoid(f,a,b,diff)
% f is the f(x) we want to integrate
% a is lower bounnd, b is upper bound
% 2^n is the amount of intervals we divide into
% difference is difference between two consecutive computed integrals
% rec_result is the result of last integral
% y is our return value
if a==b
    y=0;
    disp 'a = b, it is wrong'
    return
end
n=1;
h=(b-a)/(2^n);
sum=0;
count=0;
for i=1:((2^n)-1)
    sum=sum+f(a+i*h);
    count=count+1;
end
newIntegral=(1/2)*h*(f(a)+f(b))+h*sum;
oldIntegral=-99999;
count=count+2;
while abs(newIntegral-oldIntegral)>(diff)
    sum=0;
    n=n+1;
    h=(b-a)/(2^n);
    for i=1:2^(n-1)
        sum=sum+(f(a+(2*i-1)*h));
        count=count+1;
    end
    oldIntegral=newIntegral;
    newIntegral=(1/2)*oldIntegral+h*sum;
end
y=newIntegral;
m=2^(n-1);
return;