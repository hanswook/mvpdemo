# mvpdemo
记录mvp模式中的一些改进。实现多业务多mvp结构。

https://www.jianshu.com/p/d95d66bc65b0


针对同一个页面，每一套业务一个presenter去维护。

尽量将业务逻辑移动到presenter中。activity或fragment中只保留UI变化的代码。减少view的业务逻辑。
