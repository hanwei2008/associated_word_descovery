/*
 * associated_word_descovery.java
 *
 * Copyright (c) 2015 Chengdu Lanjing Data&Information Co., Ltd
 */

import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.impl.XMLResponseParser;

/**
 * Created by hanwei on 15-1-20.
 */

//TODO 继承solr

public class associated_word_descovery {
    public static void main(String[]args){
        //链接solr服务器
        String url = "http://localhost:8983/solr";
        HttpSolrServer server = new HttpSolrServer(url);
        server.setMaxRetries(1);
        server.setConnectionTimeout(5000);
        server.setParser(new XMLResponseParser());
        server.setSoTimeout(1000);
        server.setDefaultMaxConnectionsPerHost(100);
        server.setMaxTotalConnections(100);
        server.setFollowRedirects(false);
        server.setAllowCompression(true);
        //根据传入的参数进行搜索


        //根据输入参数查找关联词表

        //综合关联词与score（或默认排序结果）对结果重新排序
    }
}
