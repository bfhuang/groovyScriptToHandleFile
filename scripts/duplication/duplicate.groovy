File customerFile = new File('customer1.txt')
File duplicate = new File('customerDuplicate.txt')

lineList = customerFile.readLines();

def customerIds = new ArrayList()

lineList.each {it->
    def split = it.tokenize('|')

    if (customerIds.contains(split[0])) {
        duplicate.append "${it}\n"
    } else {
        customerIds.add(split[0])
    }

}

