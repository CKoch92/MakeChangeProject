# MakeChangeProject

### Overview

This program simulates a cash register and provides change to customers in the appropriate currency.

### Technologies Used

-Java
-If statements
-Data Type Conversion


### How to Run

User:
-Enter the cost of the item (in dollars and cents)
-Enter the amount paid


Program:
-If the amount paid > price, a double variable, called change is created.
-the change value is then divided by each currency value (20.0, 10.0, 5.0, 1.0,
  0.25, 0.10, 0.05, 0.01) from largest to smallest
-If change is divisible by a currency, the quotient is turned into an int value.
    (Ex: $16/10 = Double 1.6 = Int 1)
-The int value is then multiplied by the currency value and subtracted from the
  change. The result is assigned as a new change value and the process continues
  until the pennies are used.

### Lessons Learned

-Going into the homework I was expecting to use loops, multiple methods, and the
mod function. When planning the math on scratch paper, I kept hitting a wall trying
to fit the math within a predetermined outline or structure. After about 30 minutes,
I just started fresh and gradually pieced together the math as made sense to me and,
to my surprise, was able to write the code in 20 minutes, without the methods I
expected to use at the start of the homework. So, my takeaway would be to work off
what initially makes sense and use trial and error with that, versus having a predetermined set of requirements that are being forced on a solution (unless the homework requires it).
