c= 0
def count_substring(string, sub_string):
    global c  
    if(string.find(sub_string) != -1):
        c = c +1
        count_substring(string[string.find(sub_string)+1:],sub_string)
    return c

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)
