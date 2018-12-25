package com.haochen.consumer.auth.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author YangChao
 */
public class UserMenu implements Serializable {

    private String pid;

    private String father;

    private String icon;

    private String resources;

    private String title;

    private List<UserMenu> children;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<UserMenu> getChildren() {
        return children;
    }

    public void setChildren(List<UserMenu> children) {
        this.children = children;
    }
}
