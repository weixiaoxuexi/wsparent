package com.weixiao.wxpersistent.tools;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ResourceBundle;

public class CodeGenerator {
    public static void main(String[] args) {
        final ResourceBundle rb = ResourceBundle.getBundle("mybatis-plus");
        AutoGenerator ag =  new AutoGenerator();
        GlobalConfig gc = new GlobalConfig();

        gc.setOutputDir(rb.getString("OutputDir"));
        gc.setAuthor("lixu");
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        gc.setBaseResultMap(true);
        gc.setEnableCache(true);
        gc.setBaseColumnList(true);

        // 自定义文件名
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sImplService");
        gc.setControllerName("%sController");
        ag.setGlobalConfig(gc);

        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://localhost:3306/wxdb?useUnicode=true&characterEncoding=utf8&useSSL=false");
        dsc.setUsername("root");
        dsc.setPassword("lixu198511");
        ag.setDataSource(dsc);


        // 策略配置
        StrategyConfig strategyConfig =  new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setInclude(new String[] {}); // 表名称,不写则选择全部
        strategyConfig.setSuperServiceClass(null);
        strategyConfig.setSuperServiceImplClass(null);
        strategyConfig.setSuperMapperClass(null);

        ag.setStrategy(strategyConfig);


        // 包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.weixiao.wxpersistent");
        packageConfig.setController("action");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("serviceImpl");
        packageConfig.setMapper("mapper");
        packageConfig.setEntity("entity");
        packageConfig.setXml("xml");
        ag.setPackageInfo(packageConfig);

        // 执行生成
        ag.execute();
    }
}
