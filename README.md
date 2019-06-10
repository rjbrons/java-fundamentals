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
	- returns a string representation of the object.
- addReview(Review newRev)
	- takes in a Review instance and adds it to the restaraunt instance.
- setStars(int total)
	- pass in the total stars for the restaurant and it calculates and sets the avg stars field.
- updateCost(String cost)
	- Takes in a string of "$" chars to represent how expensive the restaurant is, sets the field for that instance.
- getReviews()
	- returns the list of reviews for that instance.

Review (class) 
- toString()
	- prints out the review to console.

Theater (class)
- toString()
	- Prints a representation of the Theater - including available movies - to console.
- addMovie(String movie)
	- Takes in a string of the movie title and adds it to the movie list for that Theater instance.
- removeMovie(String movie)
	- Takes in a string of a movie title and removes that title from that theater instance's movie list.

Shop (class)
- toString()
	- Prints a string representation of the shop instance to console.
- addReview(Review newRev)
	- takes in an instance of a review and adds that to the Shop instance's review list.

