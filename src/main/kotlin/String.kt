fun main() {
    val string = "This is string"
    val rawString = """This
        Is 
        Raw 
        String
    """
    val escapedString = "Example of example string \n"
    /*
    EscapedString Consist Of:
    \t Add tab to the text
    \n Create new line in the text
    \' Adding single quotes
    \" Adding double quotes
    \\ Adding backslash
    */
    val indexing = string[0]
    print("$string $rawString $indexing")
}