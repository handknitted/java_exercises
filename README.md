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

1 - The LetterChangeTest methods cover several aspects of this process, but may
well not be exhaustive.  Can you think of any other tests that may help
verify the method's function?

2 - If the requirements changed so that any z wrapped around to the alternative
case z -> A, Z -> a, what changes would be necessary to the method?  And what
changes to the test?  

3 - Are there any questions you may want to ask the team making this change to
requirements?

4 - If your requirements team then decide that in certain circumstances the
letters should be rotated only, in others no rotation should be done but vowels
should be capitalised, and finally, in others the function should remain as is.
What changes would you make to the LetterChange and what changes to the
LetterChangeTest classes?

5 - How do the method(s) handle null or empty input strings?  If necessary make
changes to ensure that a null or empty input returns an empty string rather
than resulting in an exception.  Ensure that tests cover this scenario wherever
appropriate.