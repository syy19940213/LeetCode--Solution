# NO.3 Longest Substring Without Repeating Characters

## Description
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.


Given "bbbbb", the answer is "b", with the length of 1.


Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

## 描述
- 给定一个字符串，找出该串中最长的不重复子串。
- 例子：
- 给出"abcabcbb"，找出的子串为"abc"，它的长度为3
- 给出"bbbbb"，找出的子串为"b"，它的长度为1
- 给出 "pwwkew", 找出的子串为"wke", 它的长度为3。注意它的结果必须是子串，"pwde"并不是一个子串

## solution1
> 1、在字符串开始的位置设定两个游标  
> 2、将第一个游标顺势向后移  
> 3、如果第一个游标指向的字符串与第一个游标与第二个游标之间的某个字符相同，记录此时两个游标之间的距离。  
> 4、然后将第二个游标移动到最后一个该字符处，重复上述步骤。  



