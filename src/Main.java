
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Main
{
    static String numbersInputFile = "/Users/yifatbiezuner/FinalProject/src/Numbers.csv";
    static String numbersOutputFile = "Numbers.java";

    static String stringsInputFile = "/Users/yifatbiezuner/FinalProject/src/String.csv";
    static String stringsOutputFile = "Strings.java";

    static String dateInputFile = "/Users/yifatbiezuner/FinalProject/src/Date.csv";
    static String dateOutputFile = "Date.java";
//
    static String arraysInputFile = "/Users/yifatbiezuner/FinalProject/src/Array.csv";
    static String arraysOutputFile = "Arrays.java";
//
//    static String listsInputFile = "Lists.csv";
//    static String listsOutputFile = "C:\\Workspace\\FunctionsGenerator\\src\\main\\ListsFuncs.java";
    static String listsInputFile = "/Users/yifatbiezuner/FinalProject/src/List.csv";
    static String listOutputFile = "List.java";

    private static final String CODE_OUTPUT_FILE_PATH = "parsingOutput.txt";

    public static void main(String[] args) throws IOException
    {
//		createFunctions();
        parseFunctions();
    }

    private static void parseFunctions() throws IOException
    {
        String javadocPath = System.getProperty("user.dir").toString() + "\\inputCode";

        try (Stream<Path> paths = Files.walk(Paths.get(javadocPath));
             PrintWriter pw = new PrintWriter(CODE_OUTPUT_FILE_PATH);)
        {
            paths.filter(Files::isRegularFile).forEach(path -> {
                try
                {
                    writeFuncsToFile(path, pw);
                }
                catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
        }
    }

    private static void writeFuncsToFile(Path path, PrintWriter pw) throws IOException
    {
        List<String> fileContent = Files.readAllLines(path);
        StringBuilder sb = new StringBuilder();
        fileContent.forEach(line -> sb.append(line + "\n"));
        String content = sb.toString();

        String[] funcs = content.split("\\/\\*");

        String func = "";
        String comment = "";
        String code = "";

        for (int i = 1; i < funcs.length; i++)
        {
            String[] funcParts = funcs[i].split("\\*\\/");
            comment = funcParts[0];
            code = funcParts[1];

            comment = cleanComment(comment);
            code = cleanCode(code);

            writeToFile(comment, code, pw);
        }
    }

    private static String cleanCode(String code)
    {
        code = generalizeMethodsName(code);
        code = code.replace("\n", "").replace("\r", "");
        code = code.replace(".", " . ").replace("(", " ( ").replace(")", " ) ").replace("{", " { ")
                .replace("}", " } ").replace(",", " , ").replace("[", " [ ").replace("]", " ] ").replace("=", " = ")
                .replace(";", " ; ").replace(">", " > ").replace("<", " < ").replace("-", " - ").replace("_", " _ ")
                .replace("+", " + ").replace(":", " : ").replace("\"", " \" ").replace("'", " ' ").replace("!", " ! ");
        code = code.trim();
        code = code.replaceAll("\\s+", " ");
        return code;
    }

    private static String generalizeMethodsName(String code)
    {
        String[] methodCallWords = code.split("\\(")[0].split(" ");
        String methodName = methodCallWords[methodCallWords.length - 1];
        return code.replaceFirst(methodName, "func");
    }

    private static String cleanComment(String comment)
    {
        comment = comment.replace("\n", "").replace("\r", "").replaceAll("\\s+", " ")
                .replaceAll("\\*", "");
        comment = comment.replaceAll("\\s+", " ");
        comment = comment.trim();
        return comment;
    }

    private static void writeToFile(String commentPart, String codePart, PrintWriter pw)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(commentPart);
        sb.append("\t");
        sb.append(codePart);
        sb.append('\n');

        pw.write(sb.toString());
    }

    private static void createFunctions() throws IOException
    {
        List<String> lines = Files.readAllLines(Paths.get(listsInputFile));

        try(PrintWriter pw = new PrintWriter(new File(listsOutputFile)))
        {
            lines.forEach(line -> addFuncToFile(line, pw));
        }
        catch (FileNotFoundException e)
        {
        }
    }

    public static void addFuncToFile(String line, PrintWriter pw)
    {
        String[] funcValues = line.split(",");
        String desc = funcValues[0].trim();
        String name = funcValues[1].trim();
        String returnType = funcValues[2].trim();
        int varsNum = Integer.parseInt(funcValues[3].trim());
        String parametersType = funcValues[4].trim();

        StringBuilder funcCode = new StringBuilder("");

        funcCode.append("/*\n* " + desc + "\n*/\n");
        funcCode.append("public " + returnType + " " + name + "(");

        if (varsNum > 0)
        {
            int parameterIndex = 1;
            funcCode.append(parametersType + " " + "Var" + parameterIndex);

            while (parameterIndex < varsNum)
            {
                parameterIndex++;
                funcCode.append(", ");
                funcCode.append(parametersType + " " + "Var" + parameterIndex);
            }
        }

        funcCode.append(")\n");
        funcCode.append("{\n\treturn \n}\n\n");

        pw.write(funcCode.toString());
    }
}
