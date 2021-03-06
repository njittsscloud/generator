import org.junit.Test;
import org.mybatis.generator.api.ShellRunner;
import org.mybatis.generator.plugins.MySqlPaginationPlugin;


public class MybatisGenerator {
	
	@Test
	public void generateAccount() {
		String config = MySqlPaginationPlugin.class.getClassLoader()
				.getResource("mybatis-generator-cfg.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}

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
    
	/*data  start*/
	@Test
	public void generateDataCourse() {
		String config = MySqlPaginationPlugin.class.getClassLoader()
				.getResource("mybatis-generator-cfg-data-course.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}

	@Test
	public void generateDataCurriculum() {
		String config = MySqlPaginationPlugin.class.getClassLoader()
				.getResource("mybatis-generator-cfg-data-curriculum.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}

	@Test
	public void generateDataClass() {
		String config = MySqlPaginationPlugin.class.getClassLoader()
				.getResource("mybatis-generator-cfg-data-class.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}
	
	/*data  end*/
	
	
    @Test
    public void generateReport() {
        String config = MySqlPaginationPlugin.class.getClassLoader()
                .getResource("mybatis-generator-cfg-report-report.xml").getFile();
        String[] arg = {"-configfile", config, "-overwrite"};
        ShellRunner.main(arg);
    }

	@Test
	public void generateAccountStudent() {
		String config = MySqlPaginationPlugin.class.getClassLoader()
				.getResource("mybatis-generator-cfg-account-student.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}

	@Test
	public void generateAccountTeacher() {
		String config = MySqlPaginationPlugin.class.getClassLoader()
				.getResource("mybatis-generator-cfg-account-teacher.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}

	@Test
	public void generateAccountSyy() {
		String config = MySqlPaginationPlugin.class.getClassLoader()
				.getResource("mybatis-generator-cfg-account-syy.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}

	@Test
	public void generateAccountAdmin() {
		String config = MySqlPaginationPlugin.class.getClassLoader()
				.getResource("mybatis-generator-cfg-account-admin.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}

}
