# 🍬Word Counter

## 「简介」

`Word Counter` 是一个统计文本文件（纯英文）的字符数或单词数程序。

规则：

- 「空格" "」「水平制表符"\t"」「换行符"\n"/"\r\n"」算为字符。
- 「空格」「逗号」隔开来的单词都算作单词，不做有效性检验。
  - 如：`thi#,that` 算作两个单词。

└─ experiment
    └─ `WordCount.jar` 为运行文件。

📌运行格式为：`[parameter] [input_file_name]`

以 **Windows 10** OS环境为例：

> java -jar .\WordCount.jar -c .\test.txt
- 结果：
> Number of characters:「 18 」



程序有**两个**功能：

- `-c` ：统计文本文件字符数「按上述规则统计」
- `-w`：统计文本文件单词数「按上述规则统计」

## 项目结构

```
└─WordCounter-master
    ├─experiment
    │    └─WordCount.jar   运行jar包
    │    └─test.txt        测试文本文件
    └─src
        └─WordCount
            └─src
                ├─main
                │  ├─java
                │  │  └─com
                │  │      └─hypocrite30
                │  │		  └─Application.java             主程序入口
                │  │          └─utils
                │  │		    └─TextStatisticsUtils.java   工具类
                │  └─resources
                │      └─META-INF jar包配置
                └─test
                    └─java
                        └─RegexTest.java  正则表达式测试
```



> 鸣谢：
>
> https://www.cnblogs.com/niudaxianren/p/11727649.html
>
> https://blog.csdn.net/u013868665/article/details/79971419



