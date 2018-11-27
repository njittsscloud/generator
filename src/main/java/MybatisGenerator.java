import org.junit.Test;
import org.mybatis.generator.api.ShellRunner;
import org.mybatis.generator.plugins.MySqlPaginationPlugin;


public class MybatisGenerator {

    @Test
    public void generate() {
        String config = MySqlPaginationPlugin.class.getClassLoader()
                .getResource("mybatis-generator-cfg.xml").getFile();
        String[] arg = {"-configfile", config, "-overwrite"};
        ShellRunner.main(arg);
    }


    @Test
    public void generateReportTask() {
        String config = MySqlPaginationPlugin.class.getClassLoader()
                .getResource("mybatis-generator-cfg-report-task.xml").getFile();
        String[] arg = {"-configfile", config, "-overwrite"};
        ShellRunner.main(arg);
    }

}
