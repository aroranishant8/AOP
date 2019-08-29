AOP(using Java based Configuration)

1. Functional Programming: A single program call each other functions . Problem is that if design is complex, interlinks are messy.SO we use OOps. Not all things can be classified as Objects though. Like a logmessage to be used in all methods. we will have a logger class for that.
But it will cause too many relationships.
COde is still required to call logger.
Crosscutting concerns:- Logging, Transactions,security

SO we can have logging aspect, transaction aspect

How is it different?
After creating aspects, we do not refer aspects in our code.

Steps:-
1. Write Aspects
2. COnfigure where aspect applies