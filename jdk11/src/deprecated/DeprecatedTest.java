package deprecated;

/**
 * 增强启用添加版本号
 * 
 * @author SquRab 使用@Deprecated注释
 * 
 *         要表明已弃用，请在模块，类，方法或成员声明之前加上@Deprecated。批注包含以下元素：
 * 
 * @Deprecated（since =“ <version>”）
 * 
 *                   <version>是不推荐使用的API的版本。这仅供参考。默认值为空字符串（""）。
 * 
 * @Deprecated（forRemoval = <boolean>）
 * 
 *                        forRemoval = true表示该API将在将来的版本中删除。
 * 
 *                        forRemoval =
 *                        false建议代码不应再使用此API。但是，目前没有删除该API的意图。这是默认值。
 * 
 *                        例如：@Deprecated（since =“ 9”，forRemoval = true）
 * 
 *                        所述@Deprecated注释使Javadoc生成文档，以与下文中，只要该程序元素出现的一个被标记为：
 *                        不推荐使用。
 * 
 *                        不推荐使用，以便删除：此API元素可能会在将来的版本中删除。
 */
@Deprecated(since = "13", forRemoval = true)
public class DeprecatedTest {

}
