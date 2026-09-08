// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link SmartCache} extends {@link TeaModel}
 *
 * <p>SmartCache</p>
 */
public class SmartCache extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CacheWorkerNum")
    private Long cacheWorkerNum;

    @com.aliyun.core.annotation.NameInMap("CacheWorkerSize")
    private Long cacheWorkerSize;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private String duration;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @com.aliyun.core.annotation.NameInMap("MountPath")
    private String mountPath;

    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("SmartCacheId")
    private String smartCacheId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UserId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SmartCache model) {
            this.cacheWorkerNum = model.cacheWorkerNum;
            this.cacheWorkerSize = model.cacheWorkerSize;
            this.description = model.description;
            this.displayName = model.displayName;
            this.duration = model.duration;
            this.endpoint = model.endpoint;
            this.fileSystemId = model.fileSystemId;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifyTime = model.gmtModifyTime;
            this.mountPath = model.mountPath;
            this.options = model.options;
            this.path = model.path;
            this.smartCacheId = model.smartCacheId;
            this.status = model.status;
            this.type = model.type;
            this.userId = model.userId;
        } 

        /**
         * <p>The number of cache workers.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder cacheWorkerNum(Long cacheWorkerNum) {
            this.cacheWorkerNum = cacheWorkerNum;
            return this;
        }

        /**
         * <p>The cache size per cache worker. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder cacheWorkerSize(Long cacheWorkerSize) {
            this.cacheWorkerSize = cacheWorkerSize;
            return this;
        }

        /**
         * <p>The SmartCache description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The SmartCache name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The running duration.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>OSS Endpoint</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-beijing-internal.aliyuncs.com</p>
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The Alibaba Cloud NAS file system ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The creation time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The modification time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T23:36:01Z</p>
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        /**
         * <p>The local mount directory of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/data/</p>
         */
        public Builder mountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        /**
         * <p>The optional hyperparameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;num_threads&quot;: 32}</p>
         */
        public Builder options(String options) {
            this.options = options;
            return this;
        }

        /**
         * <p>The OSS data source path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://buc/path/to/dir</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>SmartCacheId</p>
         * 
         * <strong>example:</strong>
         * <p>smartcache-20210114104214-vf9lowjt3pso</p>
         */
        public Builder smartCacheId(String smartCacheId) {
            this.smartCacheId = smartCacheId;
            return this;
        }

        /**
         * <p>The running status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The mounted data type.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>189xxx</p>
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
