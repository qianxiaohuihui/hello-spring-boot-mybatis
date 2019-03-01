package tk.mybatis;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/*
* 该接口不能被扫描到，否则出错，所以不和SpringApplication放一个包下
* */

public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {}
