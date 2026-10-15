/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortArray = function(nums) {
    if(nums.length<=1)
    return nums;
    let mid=Math.floor(nums.length/2);
    let left=sortArray(nums.slice(0,mid));
    let right=sortArray(nums.slice(mid));
    let result=[];
    let i=0,j=0;
    while(i<left.length && j<right.length){
        if(left[i]<=right[j]){
        result.push(left[i++]);
    }   else{
        result.push(right[j++]);
    }
    }
    while(i<left.length){
        result.push(left[i++]);
    }
    while(j<right.length){
        result.push(right[j++]);
    }
    return result;
    
    
};