class Solution(object):
    def romanToInt(self, s):
        numeral_dict = {"I":1, "V":5, "X":10, "L":50, "C":100, "D":500, "M":1000}
        roman_list = list(s)
        value = 0
        prevalue = 0
        i = 0
        while (i <= len(roman_list) -1):
            if (numeral_dict[roman_list[i]] > numeral_dict[roman_list[prevalue]]):
                value -= 2 * numeral_dict[roman_list[prevalue]]
            value += numeral_dict[roman_list[i]]
            prevalue = i
            i+=1
        return value
