# NO.2 Add Two Numbers

## Description
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)

Output: 7 -> 0 -> 8

## 描述
- 给出两个不为空的链表，代表两个正整数，数字在链表中是倒序存储，且每一个节点只包含一个数字。将两个数相加，结果以链表形式返回。
- 假定两个数的开头都不为零。除了0本身以外。

## solution1
> 链表是倒序存储的，所以第一位就是最低位。直接每位相加，
> 
> 特殊情况：
> 
> - 进位，高位进位 （5 + 5  =10） 小心遗漏一位进位。
> - 两个链表不对其的情况。
> 



