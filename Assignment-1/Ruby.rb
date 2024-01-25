=begin
******************************************************************************
*
* Created by: Sam Morency
* Created on: September 18th, 2016
* This program finds the longest run of characters in a String
*
******************************************************************************
=end

puts 'What is your string?'
given_string = gets.chomp

def max_block(str)  
  max_run = 0
  current_run = 1
  
=begin
loop through each character in string, compare it to the next, and find
longest run
=end
  str.each_char.with_index do |st, idx|
    if st == str[idx + 1]
      current_run += 1
    else
      current_run = 1
    end

    max_run = current_run if current_run > max_run
  end
# return longest run
  max_run
end
# run method using the user's string
longest_run = max_block(given_string)
# return longest run to user
puts longest_run
