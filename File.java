public class File {
    public static void main(String[] args) {

        File f1 = new File("file.txt");
        File f2 = new File("/Users/sk/vscode/java_projects/file.txt");

        import java.io.File;
        class fileSystemDemo {
            public static void main(String[] args) {
                String pathProject = System.getProperty("user.dir");
                String pathFile = pathProject.concat("/file.txt");
                File f3 = new File(pathFile);
                System.out.println(f3.getAbsolutePath ());
                // /Users/sk/vscode/java_projects/file.txt
                // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt

//                try {
//                    Код, в котором может появиться ошибка
//                } catch (Exception e) {
//                    Обработка, если ошибка случилась
//                }
//                finally {
//                    Код, который выполнится в любом случае
//                }

                import java.io.File;
                class tryDemo {
                    public static void main(String[] args) {
                        try {
                            String pathProject = System.getProperty("user.dir");
                            String pathFile = pathProject.concat("/file.txt");
                            File f3 = new File(pathFile);
                            System.out.println("try");
                        } catch (Exception e) {
                            System.out.println("catch");
                        }
                        finally
                        { System.out.println("finally"); }

                        import java.io.File;
                        public class tryDemo {
                            public static void main(String[] args) {
                                try {
                                    String pathProject = System.getProperty("user.dir");
                                    String pathFile = pathProject.concat("/file.txt");
                                    File file = new File(pathFile);
                                    if (file.createNewFile()) {
                                        System.out.println("file.created");
                                    }
                                    else {
                                        System.out.println("file.existed");
                                    }
                                } catch (Exception e) {
                                    System.out.println("catch");
                                } finally {
                                    System.out.println("finally");
                                }
                                String line = "empty";
                                try {
                                    File file = new File(pathFile);
                                    if (file.createNewFile()) {
                                        System.out.println("file.created"); }
                                    else {
                                        BufferedReader bufReader =
                                                new BufferedReader(new FileReader(file));
                                        System.out.println("file.existed");
                                        line = bufReader.readLine();
                                        bufReader.close(); }
                                } catch (Exception e) {
                                    //e.printStackTrace();
                                } finally {
                                    System.out.println(line);

//                                    isHidden(): возвращает истину, если каталог или файл является скрытым
//                                    length(): возвращает размер файла в байтах
//                                    lastModified(): возвращает время последнего изменения файла или каталога
//                                    list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
//                                    listFiles(): возвращает массив файлов и подкаталогов, которые находятся
//                                    в определенном каталоге
//                                    mkdir(): создает новый каталог
//                                    renameTo(File dest): переименовывает файл или каталог
//length(): возвращает размер файла в байтах
//lastModified(): возвращает время последнего изменения
//файла или каталога
//list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
//listFiles(): возвращает массив файлов и подкаталогов, которые
//находятся в определенном каталоге
//mkdir(): создает новый каталог
//renameTo(File dest): переименовывает файл или каталог
                                    


                                }
}

    private void getAbsolutePath() {
    }