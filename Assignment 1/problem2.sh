#!/bin/sh

echo "Enter a number: "
read num

a=1
b=1

while [ $a -lt $num ]
do
	echo -n "$a "
	temp=$(($a + $b))
	a=$b
	b=$temp
done