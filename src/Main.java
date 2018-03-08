
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main
{
    static String numbersInputFile = "Numbers.csv";
    static String numbersOutputFile = "Numbers.java";

//    static String stringsInputFile = "Strings.csv";
//    static String stringsOutputFile = "C:\\Workspace\\FunctionsGenerator\\src\\main\\Strings.java";
//
//    static String arraysInputFile = "Arrays.csv";
//    static String arraysOutputFile = "C:\\Workspace\\FunctionsGenerator\\src\\main\\Arrays.java";
//
//    static String listsInputFile = "Lists.csv";
//    static String listsOutputFile = "C:\\Workspace\\FunctionsGenerator\\src\\main\\ListsFuncs.java";

    public static void main(String[] args) throws IOException
    {

        List<String> lines = Files.readAllLines(Paths.get(numbersInputFile));

        createFunctions(lines);
    }

    private static void createFunctions(List<String> lines)
    {
        try(PrintWriter pw = new PrintWriter(new File(numbersOutputFile)))
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
