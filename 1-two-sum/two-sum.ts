function twoSum(nums: number[], target: number): number[] {
    for (let i = 0; i<nums.length; i++){

        for (let j = i+1; j<nums.length; j++){

            if (nums[i] + nums[j] == target){

                let operands: number[] = [ i,  j];
                return operands;               
                break;

            }
            
        }
    }
};
