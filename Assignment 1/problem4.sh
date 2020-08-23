#!/bin/sh

echo "Enter a number: "
read num
sum=0

while [ $num -gt 0 ]
do
	digit=$(( $num % 10 ))
	num=$(( $num / 10 ))
	sum=$(( $sum + $digit ))
done

echo "The sum of the digits is $sum"