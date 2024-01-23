### Waste

Recap: There's only two things you can do if you want to improve the performance of a program. Redice the total number
of instructions, or change the instructions so that they move more efficiently through the cpu.

The number one multiplier why programs get slow? Waste.

A huge number of instructions going into the cpu are literally doing nothing. They have nothing to do with the execution
of the program itself.

An actual instruction going into a x64 cpu is ADD. It adds two integers together, say A and B, and puts the result in
the place of the first integer.

It the same as writing A += B in a higher level language.

Another way of adding two integers together in x64 assembly is LEA (load effective address).

This means that whenever you add two ints together in a program, eventually somewhere down the line, you need to tell
the cpu one of these instructions.

Now. How many instructions do we have to feed the cpu in order to add two integers together? We sort of know the
baseline, which is either ADD A,B or LEA C, [A,B] ...
