# NO.1 Two Sum

## Description
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.


- Example:
> Given nums = [2, 7, 11, 15], target = 9
> 
Because nums[0] + nums[1] = 2 + 7 = 9,
>
>return [0, 1].

## 描述
- 给出一个int数组和一个标识数字，返回在这个数组中两个元素相加等于这个标识数的元素下标。
- 假定每次输入的数组只有一个正确的结果，同时相加的两个元素不能为同一个元素。

## solution1
> 比较容易想到的思路是，用双重循环一个一个去加。直到得到结果为止。

## solution2
> 由于第一种方式在数据比较多的情况下效率相对较慢，我们可以思考从减少循环次数来加快速度。
>  
> 知道两个加数的结果，我们可以反向的用减法来解决问题。
> 
> - 循环数组
> - 用一个map记录 当前值和该知所在的位置。 map（2，0）
> - 如果target减去当前的数值包含在map中，则找到第二个 位置值。 
> 
> 采用该方式，循环的次数明显减少。效率也就提高了。
  
 

