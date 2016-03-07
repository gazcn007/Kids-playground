function [y,count]=adapt_simpson(f,a,b,epsilon,level,level_max)
% f is the f(x) we want to integrate
% a is lower bounnd, b is upper bound
% 2^n is the amount of intervals we divide into
% epsilon is difference between two consecutive computed integrals
% level_max is the stopping recursion number
% y is our return value
count=0;
h=b-a;
c=(a+b)/2;
I1=h*(f(a)+4*f(c)+f(b))/6;
count=count+3;
level=level+1;
d=(a+c)/2;
e=(c+b)/2;
I2=h*(f(a)+4*f(d)+2*f(c)+4*f(e)+f(b))/12;
count=count+5;
if level >= level_max
    y=I2;
    return;
else
    if abs(I2-I1)<=(15*epsilon)
        y=I2+(1/15)*(I2-I1);
        return;
    else
        [y1,count1]=adapt_simpson(f,a,c,(epsilon/2),level,level_max);
        [y2,count2]=adapt_simpson(f,c,b,(epsilon/2),level,level_max);
        y=y1+y2;
        count=count1+count2;
        return;
    end
end
        