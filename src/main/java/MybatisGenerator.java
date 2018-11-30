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
	public void generateAccountStudent() {
		String config = MySqlPaginationPlugin.class.getClassLoader()
				.getResource("mybatis-generator-cfg-account-student.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}
}
