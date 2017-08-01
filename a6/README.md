# Assignment 6
(Due Thursday August 10 at 5:30pm on cuLearn)
---

---
Create a cheat sheet for the midterm. You will __not__ be using this cheat sheet during the exam but writing it will help you prepare for it.

Submit one sheet of paper. You can use both sides if you wish but one is sufficient.  Your cheat sheet can contain anything that you feel would help you in the test. This might be definitions, summaries of concepts, example and explanations of code, etc.   

If you do not know what to put on your cheat sheet, some ideas might be

- summarize the lecture notes  
- answer the midterm practice problems  
- summarize every Java keyword we have seen so far


You will receive full marks if you put in a reasonable effort. Filling one page with a summary of course material will be considered a reasonable effort.

Your cheat sheet can be handwritten or computer generated. I strongly suggest to hand write it if you are able.

Note: Hand in your assignment at the start of class on Thursday. The test will start 1-2 minutes after the start of class, so be sure to arrive on time (or 5 minutes early).

Note: If you have another arrangement for writing the midterm with PMC, you should drop off the assignment at the main office of SCS (School of Computer Science) on the afternoon of the midterm some time before you write the test. `()`, `()()`
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
 


