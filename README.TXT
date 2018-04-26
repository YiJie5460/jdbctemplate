用spring的jdbctemplate编写简单的DAO。
DAO接口和实现分开。 数据库信息配置在applicationContext.xml中（反射，IOC/DI）
将jdbctemplate的对象创建交给spring框架，注入对象dataSource（数据库信息）。
后续要修改，只需修改dataSouce配置信息，或另外注入新的dataSource对象即可。
