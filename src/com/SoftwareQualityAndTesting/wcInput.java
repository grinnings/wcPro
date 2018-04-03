package com.SoftwareQualityAndTesting;

import java.io.*;
import java.util.Vector;

public class wcInput {
    private String inputFile;
    private Vector<String> fileContent;
    public String judgeInput(String[] args)
    {
        String inputFile="";
        System.out.println("请输入正确的文件名：");
        if(args.length==0)//没有文件
        {
            System.out.println("未输入文件名，请重新输入文件名");
        }
        else if(args.length>1)
        {
            System.out.println("多个文件无法同时处理，请输入一个文件名");
        }
        else if(!args[0].endsWith(".txt"))
        {
            System.out.println("输入的不是txt格式文件，请重新输入一个txt文件");
        }
        else
        {
            inputFile=args[0];
        }
        this.inputFile = inputFile;
        return inputFile;
    }

    public void readFileContent() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(inputFile));
        BufferedReader br = new BufferedReader(isr);
        fileContent = new Vector<String>();
        String s;
        while((s=br.readLine())!=null)
            fileContent.addElement(s);
        isr.close();
        br.close();
    }

    public Vector<String> getFileContent() {
        return fileContent;
    }
}
