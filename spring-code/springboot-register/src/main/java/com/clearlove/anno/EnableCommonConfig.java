package com.clearlove.anno;

import com.clearlove.config.CommonImportSelector;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

/**
 * @author promise
 * @date 2024/6/16 - 18:41
 */

@Target(ElementType.TYPE)  // 类上使用
@Retention(RetentionPolicy.RUNTIME)  // 保留在运行时阶段
@Import(CommonImportSelector.class)
public @interface EnableCommonConfig {}
