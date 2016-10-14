=begin
******************************************************************************
*
* Created by: Sam Morency
* Created on: October 2nd, 2016
* This is a rock paper scissors program
*
******************************************************************************
=end
userPlay = 0
compPlay = "nil"
result = "nil"
compInteger = rand(1..3) #computer chooses rock paper or scissors
if compInteger == 1
	compPlay = "Rock"
elsif compInteger == 2
	compPlay = "Paper"
else
	compPlay = "Scissors"
end
puts 'Rock (1), Paper(2), or Scissors(3)?' #get user play (r p or s)
userPlay = gets.chomp
userPlayInt = userPlay.to_i
if compInteger == (userPlayInt - 1) || compInteger == (userPlayInt + 2)
	result = "win"
elsif userPlayInt = compInteger
	result = "tie"
else
	result = "lose"
end

puts "Computer played #{compPlay}, you #{result}"
