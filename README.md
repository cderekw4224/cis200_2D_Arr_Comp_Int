# cis200prgfnd-wk3
Determine Compound Value using: 1D, 2D, Parallel arrays, Lookup tables, Strings &amp; StringBuilder Classes

Lab 3: 1D, 2D, Parallel arrays, Lookup tables, Strings & StringBuilder Classes (20 pts.)
Reminder: Save all of your work to your student network drive today (NOT the desktop or local C:
drive). At the completion of lab, put all files into a single folder, zip (i.e. compress) the folder, attach it
to an email and send it to yourself. All labs are a good point of reference for projects and exams. This
also serves as a possible verification of completing the lab if a discrepancy arises.
Include the following documentation heading on ALL Labs this semester:
/* Your Name
Lab #
1-2 lines describing the purpose of the lab / what does the program do?
(used for your later reference)
*/
Within Canvas, I suggest you open the class materials found in Wk3_W.zip and Wk3_F.zip for
reference (under FILES – Daily Class Materials).
Before you begin, DOWNLOAD the file Lab3.java from Canvas to your network drive (not the local
hard drive or desktop). Once you have the file saved, open the file.
Part 1:
Growth of $1 Using Compounded Interest
Period 5% 6% 7% 8% 9% 10%
1 1.0500000 1.0600000 1.0700000 1.0800000 1.0900000 1.1000000
2 1.1025000 1.1236000 1.1449000 1.1664000 1.1881000 1.2100000
3 1.1576250 1.1910160 1.2250430 1.2597120 1.2950290 1.3310000
4 1.2155063 1.2624770 1.3107960 1.3604890 1.4115816 1.4641000
5 1.2762816 1.3382256 1.4025517 1.4693281 1.5386240 1.6105100
6 1.3400956 1.4185191 1.5007304 1.5868743 1.6771001 1.7715610
7 1.4071004 1.5036303 1.6057815 1.7138243 1.8280391 1.9487171
8 1.4774554 1.5938481 1.7181862 1.8509302 1.9925626 2.1435888
9 1.5513282 1.6894790 1.8384592 1.9990046 2.1718933 2.3579477
10 1.6288946 1.7908477 1.9671514 2.1589250 2.3673637 2.5937425
- Within Lab3.java, the following has been done for you: Declare and initialize a 2D array of doubles to
hold the values listed in the lookup table above. Study the code and ask if you do not understand what
is being done.
- Using a loop, read in info for up to 10 (declare as a constant) separate clients. Loop until the user no
longer wants to enter clients (or max is reached). For each client, use parallel arrays to store the
following (entered by the user): client’s Last Name, Social Security Number (entered in the form ###-
##-####), amount to be invested (assume int $100-$10,000), the interest rate (assume int 5-10
percent) and the term (years) of the investment (assume int 1-10). You can store these last 3 values in
either 3 separate int arrays or a single 2D array.
- After all values have been entered in for the desired number of client, use another loop for your output.
Use the 2D lookup table to determine the Compound Value and Compound Interest earned by each
client and display with 2 decimals (along with their name) as shown below.
Compound Value is calculated by looking up the value for the given rate and years and multiplying by
the investment amount. For example: $100 at 7% for 3 years would be $100 * 1.2250430 = $122.50.
Test Input: Smith, 456-23-4567, 100, 7, 3
Jones, 968-45-5566, 1000, 6, 6
Callahan, 412-34-2938, 560, 9, 10
Carter, 500-34-5968, 999, 8, 8
Johnson, 657-45-5867, 10000, 10, 10
For the first column in your output, use the StringBuilder class to build and output the following string:
First 4 letters of the last name + Last 4 digits of the Social Security Number.
Hint: StringBuilder sb = new StringBuilder(); // create the object
sb.append (<use substring to pull off the first 4 chars of the current name>);
sb.append (<use substring to pull off the last 4 chars of the current SS#>);
Display (sb);
Test output (if you are off by +/- $0.01, that’s fine) Commas are NOT required
Smit4567 Compound Value: $122.50 Interest: $22.50
Jone5566 Compound Value: $1,418.52 Interest: $418.52
Call2938 Compound Value: $1,325.72 Interest: $765.72
Cart5968 Compound Value: $1,849.08 Interest: $850.08
John5867 Compound Value: $25,937.43 Interest: $15,937.43
Extra Credit (+10% / 2 pts)
Add data validation to your program to allow only the following valid values: name must be at least 4
letters, the amount to be invested ($100-$10,000, inclusive) the interest rate (5-10, inclusive) and the
term (years) of the investment (1-10, inclusive).
After all parts are working correctly, demonstrate your working program for a UTA or instructor.
Then, upload the single .java file to Canvas. Verify that the file has been properly submitted before
leaving! Again, it is recommended that you attach your file(s) to an email and send it to yourself. All
labs are a good point of reference for projects and exams. This also serves as a possible verification of
completing the lab if a discrepancy arises.
