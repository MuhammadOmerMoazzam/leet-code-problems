class Solution(object):
    def countSeniors(self, details):
        
        passengers  = 0 

        for i in details:
            # slicing from index 11 to 12, provides concatenated a string
            # which is then type casting into an integer
            age = int(i[11: 13])
            if age > 60:
                passengers += 1

        return passengers   