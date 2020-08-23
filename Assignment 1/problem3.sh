#!/bin/sh

echo "Which operation would you like to do?"
read op
echo -n "Operand 1: "
read n1
echo -n "Operand 2: "
read n2

case $op in
"+")result=$(($n1 + $n2)) 
echo "The result is $result";;

"-")result=$(($n1 - $n2)) 
echo "The result is $result";;

"*")result=$(($n1 * $n2)) 
echo "The result is $result";;

"/")result=$(($n1 / $n2)) 
echo "The result is $result";;

*)echo "Invalid operator"
esac