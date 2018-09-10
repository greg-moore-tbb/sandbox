Adopt=a-Pet exercise.

CLI usage: <required input csv file> <required search param> <additional optioal search param> <additional optional search param>


Assumptions:
Input will always be via csv file of the given format and configuration.

Thought process:
The obvious route of creating POJOs etc was explored (couple created, but not yet utilized), but simple functionality was accomplished via Java Streams.  
I am new to Java streams and Lambda expressions and thought this would result in a more interesting conversation should that point be reached.

Testing:
Minimal JUnit testing would be all that is required at this point.  Keeping the program as simple as possible and while meeting functional requirements was the goal.

Enhancements:
Data persistence...simple file at this point.
Adoption priority:  Timestamp could be used to control search priorities.  The longer a pet lingers in the system, the higher their priority.  (Appear first in search results, apoption incentives...etc)


Version Control:
Pros:  History, Accountability, collaboration, security
Cons:  Bad merges and conflicts.  Code dependencies.