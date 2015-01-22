/*
 * test.java
 *
 * Copyright (c) 2015 Chengdu Lanjing Data&Information Co., Ltd
 */

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;


import org.apache.solr.client.solrj.beans.Field;

import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

class Item {
        @Field
        String id;

        @Field("cat")
        String[] categories;

        @Field
        List<String> features;

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String[] getCat() {
                return categories;
        }

        public void setCat(String[] Cat) {
                this.categories = Cat;
        }

        public List<String> getFeature() {
                return features;
        }

        public void setId(List<String> f) {
                this.features = f;
        }
}

public class test {
        public static  void main(String[] args) throws IOException, SolrServerException {
                SolrServer server = new HttpSolrServer("http://localhost:8983/solr");
                Item item = new Item();
                item.id = "one";
                item.categories = new String[]{"2","b","y"};
                List<String> temp = new LinkedList<>();
                temp.add("feature1");
                temp.add("feature2");
                item.features=temp;
                server.addBean(item);
                List<String[]> beans=new LinkedList<>();
                beans.add(new String[]{"2","b","y"});
                beans.add(new String[]{"3","c","z"});
                //add Item objects to the list
                server.addBeans(beans);
                SolrQuery query = new SolrQuery();
        }
}
