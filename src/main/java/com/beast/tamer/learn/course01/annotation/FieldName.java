package com.beast.tamer.learn.course01.annotation;

import java.lang.annotation.*;

/**
 * @author a small asshole
 * @version 1.0
 * @description 标注在类属性上，可以给被标注的属性赋予别名，属性作为参数返回时，使用别名返回
 * <example>
 *  ---------------------------
 *  @FieldName(value = "姓名")
 *  private String name;
 *  ---------------------------
 *  不添加注解返回时：
 *  "name":"a small asshole"
 *  ---------------------------
 *  添加注解返回时：
 *  "姓名":"a small asshole"
 * </example>
 * @date in 14:51 2020/1/19
 * @since 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FieldName {
    /**
     * 被标注字段的别名，必须填写
     */
    String value();
}
