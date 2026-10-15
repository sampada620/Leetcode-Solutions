/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let n=nums.length;
    let totalSum=(n*(n+1))/2;
    let arrSum=0;
    for(let num of nums){
        arrSum+=num;
    }
    return totalSum-arrSum;
};

    
