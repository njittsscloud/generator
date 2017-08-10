import org.mybatis.generator.api.ShellRunner;
import org.mybatis.generator.plugins.MySqlPaginationPlugin;


public class MybatisGenerator {
	public static void generate() {
		String config = MySqlPaginationPlugin.class.getClassLoader()
				.getResource("mybatis-generator-cfg.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}

	public static void main(String[] args) {
		generate();
	}
}
