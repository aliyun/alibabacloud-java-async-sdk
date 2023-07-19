// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SmartCache} extends {@link TeaModel}
 *
 * <p>SmartCache</p>
 */
public class SmartCache extends TeaModel {
    @NameInMap("CacheWorkerNum")
    private Long cacheWorkerNum;

    @NameInMap("CacheWorkerSize")
    private Long cacheWorkerSize;

    @NameInMap("Description")
    private String description;

    @NameInMap("DisplayName")
    private String displayName;

    @NameInMap("Duration")
    private String duration;

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

    @NameInMap("SmartCacheId")
    private String smartCacheId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Type")
    private String type;

    @NameInMap("UserId")
    private String userId;

    private SmartCache(Builder builder) {
        this.cacheWorkerNum = builder.cacheWorkerNum;
        this.cacheWorkerSize = builder.cacheWorkerSize;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.duration = builder.duration;
        this.endpoint = builder.endpoint;
        this.fileSystemId = builder.fileSystemId;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifyTime = builder.gmtModifyTime;
        this.mountPath = builder.mountPath;
        this.options = builder.options;
        this.path = builder.path;
        this.smartCacheId = builder.smartCacheId;
        this.status = builder.status;
        this.type = builder.type;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmartCache create() {
        return builder().build();
    }

    /**
     * @return cacheWorkerNum
     */
    public Long getCacheWorkerNum() {
        return this.cacheWorkerNum;
    }

    /**
     * @return cacheWorkerSize
     */
    public Long getCacheWorkerSize() {
        return this.cacheWorkerSize;
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
     * @return duration
     */
    public String getDuration() {
        return this.duration;
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
     * @return smartCacheId
     */
    public String getSmartCacheId() {
        return this.smartCacheId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private Long cacheWorkerNum; 
        private Long cacheWorkerSize; 
        private String description; 
        private String displayName; 
        private String duration; 
        private String endpoint; 
        private String fileSystemId; 
        private String gmtCreateTime; 
        private String gmtModifyTime; 
        private String mountPath; 
        private String options; 
        private String path; 
        private String smartCacheId; 
        private String status; 
        private String type; 
        private String userId; 

        /**
         * CacheWorkerNum.
         */
        public Builder cacheWorkerNum(Long cacheWorkerNum) {
            this.cacheWorkerNum = cacheWorkerNum;
            return this;
        }

        /**
         * CacheWorkerSize.
         */
        public Builder cacheWorkerSize(Long cacheWorkerSize) {
            this.cacheWorkerSize = cacheWorkerSize;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifyTime.
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        /**
         * MountPath.
         */
        public Builder mountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.options = options;
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
         * SmartCacheId.
         */
        public Builder smartCacheId(String smartCacheId) {
            this.smartCacheId = smartCacheId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public SmartCache build() {
            return new SmartCache(this);
        } 

    } 

}
