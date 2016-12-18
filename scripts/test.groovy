import java.io.*


def file = new File('product.txt')

for(def i = 0; i<12; i++) {
    file.append("${i}|SNT|prod${i}\n")
}
