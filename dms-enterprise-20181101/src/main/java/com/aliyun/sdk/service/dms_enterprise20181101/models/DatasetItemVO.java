// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DatasetItemVO} extends {@link TeaModel}
 *
 * <p>DatasetItemVO</p>
 */
public class DatasetItemVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AsyncTaskList")
    private java.util.List<AsyncTaskVO> asyncTaskList;

    @com.aliyun.core.annotation.NameInMap("DatasetStatus")
    private Integer datasetStatus;

    @com.aliyun.core.annotation.NameInMap("DatasetType")
    private Integer datasetType;

    @com.aliyun.core.annotation.NameInMap("Digest")
    private String digest;

    @com.aliyun.core.annotation.NameInMap("FileSystem")
    private String fileSystem;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("KeyName")
    private String keyName;

    @com.aliyun.core.annotation.NameInMap("MoreInfo")
    private String moreInfo;

    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("ProjectsLinked")
    private java.util.List<ProjectDetailsLiteVO> projectsLinked;

    @com.aliyun.core.annotation.NameInMap("RecentTaskStatus")
    private Integer recentTaskStatus;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private DatasetItemVO(Builder builder) {
        this.asyncTaskList = builder.asyncTaskList;
        this.datasetStatus = builder.datasetStatus;
        this.datasetType = builder.datasetType;
        this.digest = builder.digest;
        this.fileSystem = builder.fileSystem;
        this.id = builder.id;
        this.keyName = builder.keyName;
        this.moreInfo = builder.moreInfo;
        this.path = builder.path;
        this.projectsLinked = builder.projectsLinked;
        this.recentTaskStatus = builder.recentTaskStatus;
        this.remark = builder.remark;
        this.schema = builder.schema;
        this.tableName = builder.tableName;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetItemVO create() {
        return builder().build();
    }

    /**
     * @return asyncTaskList
     */
    public java.util.List<AsyncTaskVO> getAsyncTaskList() {
        return this.asyncTaskList;
    }

    /**
     * @return datasetStatus
     */
    public Integer getDatasetStatus() {
        return this.datasetStatus;
    }

    /**
     * @return datasetType
     */
    public Integer getDatasetType() {
        return this.datasetType;
    }

    /**
     * @return digest
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * @return fileSystem
     */
    public String getFileSystem() {
        return this.fileSystem;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return keyName
     */
    public String getKeyName() {
        return this.keyName;
    }

    /**
     * @return moreInfo
     */
    public String getMoreInfo() {
        return this.moreInfo;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return projectsLinked
     */
    public java.util.List<ProjectDetailsLiteVO> getProjectsLinked() {
        return this.projectsLinked;
    }

    /**
     * @return recentTaskStatus
     */
    public Integer getRecentTaskStatus() {
        return this.recentTaskStatus;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private java.util.List<AsyncTaskVO> asyncTaskList; 
        private Integer datasetStatus; 
        private Integer datasetType; 
        private String digest; 
        private String fileSystem; 
        private String id; 
        private String keyName; 
        private String moreInfo; 
        private String path; 
        private java.util.List<ProjectDetailsLiteVO> projectsLinked; 
        private Integer recentTaskStatus; 
        private String remark; 
        private String schema; 
        private String tableName; 
        private String url; 

        /**
         * AsyncTaskList.
         */
        public Builder asyncTaskList(java.util.List<AsyncTaskVO> asyncTaskList) {
            this.asyncTaskList = asyncTaskList;
            return this;
        }

        /**
         * DatasetStatus.
         */
        public Builder datasetStatus(Integer datasetStatus) {
            this.datasetStatus = datasetStatus;
            return this;
        }

        /**
         * DatasetType.
         */
        public Builder datasetType(Integer datasetType) {
            this.datasetType = datasetType;
            return this;
        }

        /**
         * Digest.
         */
        public Builder digest(String digest) {
            this.digest = digest;
            return this;
        }

        /**
         * FileSystem.
         */
        public Builder fileSystem(String fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * KeyName.
         */
        public Builder keyName(String keyName) {
            this.keyName = keyName;
            return this;
        }

        /**
         * MoreInfo.
         */
        public Builder moreInfo(String moreInfo) {
            this.moreInfo = moreInfo;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * ProjectsLinked.
         */
        public Builder projectsLinked(java.util.List<ProjectDetailsLiteVO> projectsLinked) {
            this.projectsLinked = projectsLinked;
            return this;
        }

        /**
         * RecentTaskStatus.
         */
        public Builder recentTaskStatus(Integer recentTaskStatus) {
            this.recentTaskStatus = recentTaskStatus;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * Schema.
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public DatasetItemVO build() {
            return new DatasetItemVO(this);
        } 

    } 

}
