println "happy"

def proc = "git diff --name-only main release/rc".execute();
def outputStream = new StringBuffer();
proc.waitForProcessOutput(outputStream, System.err);
println(outputStream.toString());

//git diff -- '*.properties' -- working for the specific extension

//https://git-scm.com/docs/git-diff

//--word-diff[=<mode>]

//git diff --word-diff-regex="[IMPACTFUL=Y]"

