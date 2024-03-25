def build(Map build=[:]) {
    echo "Python Building"
    echo "Python build parameters: "
    build.each { entry ->
        println "key: $entry.key value: $entry.value"
    }
}
def test(Map test=[:]) {
    echo "Pythonn Testing"
    echo "Pythonn test parameters: "
    test.each { entry ->
        println "key: $entry.key value: $entry.value"
    }
}