// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataSourceItem} extends {@link TeaModel}
 *
 * <p>DataSourceItem</p>
 */
public class DataSourceItem extends TeaModel {
    @NameInMap("DataSourceId")
    private String dataSourceId;

    @NameInMap("DataSourceType")
    private String dataSourceType;

    @NameInMap("Description")
    private String description;

    @NameInMap("DisplayName")
    private String displayName;

    @NameInMap("Endpoint")
    private String endpoint;

    @NameInMap("FileSystemId")
    private String fileSystemId;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @NameInMap("MountPath")
    private String mountPath;

    @NameInMap("Options")
    private String options;

    @NameInMap("Path")
    private String path;

    @NameInMap("UserId")
    private String userId;

    private DataSourceItem(Builder builder) {
        this.dataSourceId = builder.dataSourceId;
        this.dataSourceType = builder.dataSourceType;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.endpoint = builder.endpoint;
        this.fileSystemId = builder.fileSystemId;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifyTime = builder.gmtModifyTime;
        this.mountPath = builder.mountPath;
        this.options = builder.options;
        this.path = builder.path;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataSourceItem create() {
        return builder().build();
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifyTime
     */
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    /**
     * @return mountPath
     */
    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String dataSourceId; 
        private String dataSourceType; 
        private String description; 
        private String displayName; 
        private String endpoint; 
        private String fileSystemId; 
        private String gmtCreateTime; 
        private String gmtModifyTime; 
        private String mountPath; 
        private String options; 
        private String path; 
        private String userId; 

        /**
         * 数据源Id
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * 数据源类型
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * 数据源描述
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 数据源显示名称
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * 阿里云OSS文件系统服务端点
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * 阿里云NAS文件系统Id
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * 创建时间（UTC）
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * 修改时间（UTC）
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        /**
         * 本地挂载目录
         */
        public Builder mountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        /**
         * 阿里云OSS文件系统配置选项
         */
        public Builder options(String options) {
            this.options = options;
            return this;
        }

        /**
         * 阿里云OSS文件系统路径
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * 创建人Id
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public DataSourceItem build() {
            return new DataSourceItem(this);
        } 

    } 

}
