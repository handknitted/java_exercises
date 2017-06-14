# java_exercises
A java exercise for work experience

This is a java project using maven to build and manage dependencies.

Assuming maven is correctly installed, and the current working directory is the
project root directory the project can be built using

    mvn install

Tests can be run using

    mvn test

### Task

The static method letterChanges of the LetterChange class moves each alphabetic
character in an input string to the next one in the alphabet.  A 'z' is wrapped
around to an 'a' of the corresponding case.  That being done, each vowel in the
resulting string is capitalised.

The LetterChangeTest methods cover several aspects of this process, but may
well not be exhaustive.  Can you think of any other tests that may help
verify the method's function?

If the requirements changed so that any z wrapped around to the alternative case
z -> A, Z -> a, what changes would be necessary to the method?  And what changes
to the test?  Are there any questions you may want to ask the team making this
change to requirements?
