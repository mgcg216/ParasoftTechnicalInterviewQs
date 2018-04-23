import com.parasoft.api
import java.io

def isAlphabitized(x, context):
    reader = BufferedReader(x.getReader())
    line = reader.readLine()
    while line != None:
        Application.showMessage(reader.readLine())

"""
1) context is never used
2) the while loop would run forever since there is nothing to iterate line does not change value
3) It would read the same line over and over again
4)
"""
#corrected version
def isAlphabitized(x, context):
    reader = BufferedReader(x.getReader())
    line = reader.readLine()
    i = 1;
    while line != None:
        Application.showMessage(reader.readLine(i))
        i= i+1;
