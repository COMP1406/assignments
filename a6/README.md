# Assignment 6
(Due Thursday August 10 at 5:30pm on cuLearn)
---

---
## 1. Balanced Parentheses [10 marks]

A stack is a data structure where data is accessed using the LIFO (last in first out) principle.  In this problem, you will use a stack to check whether a string has balanced 
parentheses `(`, `)` and brackets `{`, `}`, `[`, `]`, or not. 

A string that has balanced parentheses and brackets will be said to be __balanced__. Any character that is __not__ one of `(`, `)`, `[`, `]`, `{`, or `}` is not important when deciding if
a string is balanced and can be ignored. 

We will define balanced as follows. A string `str` is balanced

- if `str` does not contain a parenthesis or bracket symbol, or
- `str` consists of a balanced string surrounded by opening and closing parentheses or matching brackets. That is, `str` is `(b)`, `{b}` or `[b]`, where `b` is any balanced string, or
- if `str` is the concatenation of any two balanced strings. That is, 
`str` is `bc`, where `b` and `c` are any balanced strings.


You will complete the provided `Balanced` class that has two 
static methods `isBalanced(String)` and `numberOfBalancedStrings(String[])`.  


Your `isBalanced` method must use the `java.util.Stack` class (in a way that solves the problem) to receive any grades
for this problem.  


[http://docs.oracle.com/javase/8/docs/api/java/util/Stack.html](http://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)


#### Examples

The following strings have balanced parentheses
- `()`, `()()`
- `cat`, `c(at)`, `(hello)(kitty)`
- `if( ((x-y) < 4) || (x > 12))`
- `()(((s)))()()()()(x()((y))(x))()(ccccc(w))ssss()`

The following strings do __not__ have balances parentheses

- `)`, `)(a)`, `)a(`


The following strings have balanced parentheses and brackets

- `a`, `[]`, `{}`, `[()]`, `[]{}({[{}]})`, 
- `for(int i=0; i<12; i+=1){x[i]+=f(1);}`


The following strings do __not__ have balanced parentheses and brackets
- `(]`, `{)`, `[}`, `[}`, `(]`, `({)}`h, `[(]())`
- `for(int i=0; i<12; i+=1){`

Note: You will receive partial marks if you code only works for parentheses (and not brackets).

## 2. Linked Lists [10 marks]

Create a concrete `LinkedList` class that extends the provided `ALinkedList` class. You will need to override the `extract` method in your class. You can use your `main` method for testing your method (although you do not need to provide a main method).

Recall that a list is an ordered collection of data
```
X_0, X_1, X_2, ..., X_n
```

The `extract(int start, int end)` method removes all elements
``` 
X_start, X_start_1, ..., X_end-1
```
from the list. It also returns all removed elements as a new list (`LinkedList`) that retains the same ordering.

For example, if the initial list called `animals` was
```
cat, dog, eel, cow, owl, pig, pip
```
then `animals.extract(1,5)` would return the new list
```
dog, eel, cow, owl
```
and `animals` would now be the list
```
cat, pig, pip
```



## 3. Draw a Picture [10 marks]

Draw a picture.

Think about your experience so far in COMP1006/1406. 
Your task in this problem is to draw a picture that expresses this reflection.

My hope	in asking you to draw a picture is that you will critically reflect on the learning	
objectives you have achieved in this course so far. It should also make this assignment a bit lighter than the others. The intention is that this problem should not cause you stress. Do not worry about your
_artistic ability_. You will not be graded on that at all. Have fun.

Your submission should be in PDF format (if you prefer to hand in a physical copy then contact me and we will make arrangements for this). Ideally, the size of your drawing should be a standard letter size in horizontal orientation. If you submit your picture in a file called `Public.pdf` then you agree to have your picture 
shown to the class. If you prefer that your picture not be shown then submit it in a file called `Private.pdf`.

Note: Offensive/rude/insensitive 
submissions will receive zero marks and may be forwarded to the Dean's office depending on the severity.
(This has never happened before and I trust it will not now.)

# Summary

Submit a single zip file called `a6-IDNUMBER.zip` to cuLearn (in the a6 submission link). IDNUMBER is your Carleton ID number. A complete assignment will consist of

- Balanced.java
- LinkedList.java
- Public.pdf or Private.pdf
 


