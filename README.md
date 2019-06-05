# java-fundamentals

## basics
contains-
[Main](./basics/Main.java) (class)
- pluralize(String, int)
	- takes a string and an int and returns a string that pluralizes the input string based on whether the int is 1 or something else.
- flipNHeads(int)
	- flips "coin" until "heads" comes up a number of times equal to the input
- clock()
	- prints clock to the console each second.  Must exit by CTR + C. 


## basiclibrary
contains -
[Library](./basiclibrary/src/main/java/basiclibrary/Library.java) (class)
	
- roll(int num)
	 - rolls a d6 num times and returns an array of the results.
- containsDuplicates(int[] arr)
	 - takes in an array of integers and returns boolean value of whether or not it contains duplicates.
- arrayAverage(int[] arrIn)
	- takes in an int array and returns the average of the values in the array.
- arrayLowestAverage(int[][] arrs)
	- takes in an array of int arrays and returns the array with the lowest average.

[Weather](./basiclibrary/src/main/java/basiclibrary/Weather.java) (class)
	
- analyzeWeather(int[][] data)
	 - takes an array of arrays and calculates high and low vals and then prints out list of which values between high and low weren't represented.

[Tally](./basiclibrary/src/main/java/basiclibrary/Tally.java) (class)
	
- tally(ArrayList<String> votes)
	 - takes an array list of strings as votes and counts occurrence of each string and outputs the one that was "voted for" the most.

## Linter App
contains -
[Linter](./basiclibrary/src/main/java/linter/Linter.java) (class)
- lint(String filepath)
  - Uses string to grab a file and prints list of lines that do not end in semicolon.

## Inheritance
contains - 
Restaurant (class)
- toString()
- addReview()
- setStars()
- updateCost()
- getReviews()

Review (class) 
- toString()

Theater (class)
- toString()

Shop (class)
- toString()