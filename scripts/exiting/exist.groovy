File customerFile = new File('customer1.txt')
File productFile = new File('product1.txt')
File productNotExitFile = new File('productNotExist.txt')


def lines = customerFile.readLines()
def customerIds = new HashSet()
lines.each { it ->
    def split = it.tokenize('|')
    customerIds.add(split[0])
}

def productLines = productFile.readLines()
productLines.each {
    def splits = it.tokenize('|')
    if(!customerIds.contains(splits[0])){
        productNotExitFile.append "${it}\n"
    }
}


