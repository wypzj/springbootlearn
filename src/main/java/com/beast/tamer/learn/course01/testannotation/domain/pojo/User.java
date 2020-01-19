package com.beast.tamer.learn.course01.testannotation.domain.pojo;

import com.beast.tamer.learn.course01.annotation.FieldName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author a small asshole
 * @version 1.0
 * @description 用户类
 * @date in 15:26 2020/1/19
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class User {
    @FieldName(value = "用户名")
    private String name;
}
