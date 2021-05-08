# 🍬Word Counter

## 「简介」

`Word Counter` 是一个统计文本文件（纯英文）的字符数或单词数程序。

规则：

- 「空格" "」「水平制表符"\t"」「换行符"\n"/"\r\n"」算为字符。
- 「空格」「逗号」隔开来的单词都算作单词，不做有效性检验。
  - 如：`thi#,that` 算作两个单词。

`WordCount.jar` 为运行文件。

📌运行格式为：`[parameter] [input_file_name]`

以 **Windows 10** OS环境为例：

> java -jar .\WordCount.jar -c .\test.txt
- 结果：
> Number of characters:「 18 」

📌注：test文件完美测试程序，但是实际clone下来，跑程序的时候显示的字符数是 17。

test样例为：` word# word#, word ` 

> 空word#空word#,空word空\r\n

而git推上gihub时，test.txt测试文档直接从 `Windows(CRLF)` 编码变成 `Unix(LF)`，测试了一个晚上才发现这个问题，当时真的要吐血了。。。可以用记事本打开右下角的编码。 Unix 模式下 \r\n 转变成 \n。转换编码测出来还是18，或者自行更换测试样例。



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



