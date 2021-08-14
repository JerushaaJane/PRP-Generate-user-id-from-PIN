# PRP-Generate-user-id-from-PIN

Generate user id based on user name and PIN using the following steps.

Step 1-Compare the length of First name with Last name of the participant. The one that is 
shorter will be called "Smaller Name" and the one that is longer will be called the Longer Name. 
If both First name and Last name are of equal Length, then the name that appears earlier in
alphabetical order will be called "Smaller Name" and the name that appears later in alphabetical 
order will be called the "Longer Name".

Step2- the User-id should be generated as below
First Letter of the Longer Name + Entire words of the smaller Name + Digit at position N in the 
PIN when travelling the PIN from left to right + Digit at position N in the PIN when travelling 
the PIN from right to left

Step3- Toggle the alphabets of the user-id generated in step-2 i.e. upper-case alphabets should 
become lower-case alphabets and lower-case alphabets should become upper-case alphabets


Example1
if the participant’s details are:
First_Name=Rajiv
Last _Name = Roy
PIN=560037
N=6
output: user-id=rrOY75

Example 2
First_Name=Manoj
Last_Name = Kumar
PIN=561327
N=2
output: user-id=mkUMAR62
