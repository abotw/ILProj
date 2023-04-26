package com.ilproj.backend;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {
        String url = "Jdbc:mysql://localhost:3306/ILDB";
        String username = "root";
        String password = "root";
        String author = "IL";
        String outputDir = "D:\\maven-wrokspace\\ILProj\\backend\\backend\\src\\main\\java";//java源码包绝对地址
        String basePackage = "com.ilproj.backend";
        String moduleName = "sys";
        String mapperLocation = "D:\\maven-wrokspace\\ILProj\\backend\\backend\\src\\main\\resources\\mapper\\" + moduleName;
        //resource下mapper包绝对地址
        String tableName = "user";//需要生成的表名
        String tablePrefix = " "; //要取消的表前缀
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author(author) // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            //.fileOverride() // 覆盖已生成文件
                            .outputDir(outputDir); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent(basePackage) // 设置父包名
                            .moduleName(moduleName) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, mapperLocation)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tableName) // 设置需要生成的表名
                            .addTablePrefix(tablePrefix); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
