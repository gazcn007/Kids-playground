f=inline('exp(-(x)^2)');
prompt = 'What is the value to t? ';
t = input(prompt);

%processing module
c=2/(sqrt(pi));
[result,count_RT,m]=Rec_Trapezoid(f,0,t,(10^(-5)));
result=result*c;
[result2,count_AS]=adapt_simpson(f,0,t,(10^(-5)),1,30);
result2=result2*c;
[result3,count_TWG]=two_pt_Gaussian(f,0,t,m);
result3=result3*c;
result4=erf(t);

%display module
disp 'This is erf(t) evaluated by recursive trape zoid rule:'
disp (['erf(',num2str(t),')=',num2str(result),'   feval number is ',num2str(count_RT)]);
disp 'This is erf(t) evaluated by simpsons rule:'
disp (['erf(',num2str(t),')=',num2str(result2),'   feval number is ',num2str(count_AS)]);
disp 'This is erf(t) evaluated by composite two point gaussian rule:'
disp (['erf(',num2str(t),')=',num2str(result3),'   feval number is ',num2str(count_TWG)]);
disp 'The current result given by Matlab erf is:'
disp(['erf(',num2str(t),')=',num2str(result4)]);