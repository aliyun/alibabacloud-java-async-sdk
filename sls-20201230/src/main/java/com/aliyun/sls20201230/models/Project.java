// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link Project} extends {@link TeaModel}
 *
 * <p>Project</p>
 */
public class Project extends TeaModel {
    @NameInMap("createTime")
    private String createTime;

    @NameInMap("description")
    private String description;

    @NameInMap("lastModifyTime")
    private String lastModifyTime;

    @NameInMap("owner")
    private String owner;

    @NameInMap("projectName")
    private String projectName;

    @NameInMap("region")
    private String region;

    @NameInMap("status")
    private String status;


    private Project(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.lastModifyTime = builder.lastModifyTime;
        this.owner = builder.owner;
        this.projectName = builder.projectName;
        this.region = builder.region;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Project create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return lastModifyTime
     */
    public String getLastModifyTime() {
        return this.lastModifyTime;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String createTime; 
        private String description; 
        private String lastModifyTime; 
        private String owner; 
        private String projectName; 
        private String region; 
        private String status; 

        /**
         * <p>创建时间</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>最后更新时间</p>
         */
        public Builder lastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * <p>owner</p>
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>Project名称</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>所在区域</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>状态</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Project build() {
            return new Project(this);
        } 

    } 

}
