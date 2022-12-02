// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DatasetItemVO} extends {@link TeaModel}
 *
 * <p>DatasetItemVO</p>
 */
public class DatasetItemVO extends TeaModel {
    @NameInMap("AsyncTaskList")
    private java.util.List < AsyncTaskVO > asyncTaskList;

    @NameInMap("DatasetStatus")
    private Integer datasetStatus;

    @NameInMap("DatasetType")
    private Integer datasetType;

    @NameInMap("Digest")
    private String digest;

    @NameInMap("FileSystem")
    private String fileSystem;

    @NameInMap("Id")
    private String id;

    @NameInMap("KeyName")
    private String keyName;

    @NameInMap("MoreInfo")
    private String moreInfo;

    @NameInMap("Path")
    private String path;

    @NameInMap("ProjectsLinked")
    private java.util.List < ProjectDetailsLiteVO > projectsLinked;

    @NameInMap("RecentTaskStatus")
    private Integer recentTaskStatus;

    @NameInMap("Remark")
    private String remark;

    @NameInMap("Schema")
    private String schema;

    @NameInMap("TableName")
    private String tableName;

    @NameInMap("Url")
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
    public java.util.List < AsyncTaskVO > getAsyncTaskList() {
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
    public java.util.List < ProjectDetailsLiteVO > getProjectsLinked() {
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
        private java.util.List < AsyncTaskVO > asyncTaskList; 
        private Integer datasetStatus; 
        private Integer datasetType; 
        private String digest; 
        private String fileSystem; 
        private String id; 
        private String keyName; 
        private String moreInfo; 
        private String path; 
        private java.util.List < ProjectDetailsLiteVO > projectsLinked; 
        private Integer recentTaskStatus; 
        private String remark; 
        private String schema; 
        private String tableName; 
        private String url; 

        /**
         * 关联etl任务
         */
        public Builder asyncTaskList(java.util.List < AsyncTaskVO > asyncTaskList) {
            this.asyncTaskList = asyncTaskList;
            return this;
        }

        /**
         * 是否完成上传/融合计算（0否 1是）
         */
        public Builder datasetStatus(Integer datasetStatus) {
            this.datasetStatus = datasetStatus;
            return this;
        }

        /**
         * 类型（0上传 1融合计算）
         */
        public Builder datasetType(Integer datasetType) {
            this.datasetType = datasetType;
            return this;
        }

        /**
         * 摘要信息
         */
        public Builder digest(String digest) {
            this.digest = digest;
            return this;
        }

        /**
         * 存储系统类型
         */
        public Builder fileSystem(String fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        /**
         * id值
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * encdb.encdb_internal_scm_table.keyname
         */
        public Builder keyName(String keyName) {
            this.keyName = keyName;
            return this;
        }

        /**
         * 其他数据集信息Json格式
         */
        public Builder moreInfo(String moreInfo) {
            this.moreInfo = moreInfo;
            return this;
        }

        /**
         * 路径
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * 关联项目
         */
        public Builder projectsLinked(java.util.List < ProjectDetailsLiteVO > projectsLinked) {
            this.projectsLinked = projectsLinked;
            return this;
        }

        /**
         * 最近任务状态(0开始 1连接oos成功 2任务完成 -1失败 -2无任务)
         */
        public Builder recentTaskStatus(Integer recentTaskStatus) {
            this.recentTaskStatus = recentTaskStatus;
            return this;
        }

        /**
         * 描述
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * 元数据信息
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * 表名
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * 存储系统地址
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
