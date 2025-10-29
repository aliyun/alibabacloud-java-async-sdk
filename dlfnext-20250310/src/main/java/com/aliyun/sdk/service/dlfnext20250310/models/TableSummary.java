// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link TableSummary} extends {@link TeaModel}
 *
 * <p>TableSummary</p>
 */
public class TableSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("databaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("generatedDate")
    private String generatedDate;

    @com.aliyun.core.annotation.NameInMap("lastAccessTime")
    private Long lastAccessTime;

    @com.aliyun.core.annotation.NameInMap("objTypeArchiveSize")
    private Long objTypeArchiveSize;

    @com.aliyun.core.annotation.NameInMap("objTypeColdArchiveSize")
    private Long objTypeColdArchiveSize;

    @com.aliyun.core.annotation.NameInMap("objTypeIaSize")
    private Long objTypeIaSize;

    @com.aliyun.core.annotation.NameInMap("objTypeStandardSize")
    private Long objTypeStandardSize;

    @com.aliyun.core.annotation.NameInMap("partitionCount")
    private Long partitionCount;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("storageActionParams")
    private java.util.Map<String, String> storageActionParams;

    @com.aliyun.core.annotation.NameInMap("storageActionTimestamp")
    private Long storageActionTimestamp;

    @com.aliyun.core.annotation.NameInMap("storageClass")
    private String storageClass;

    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("totalFileCount")
    private Long totalFileCount;

    @com.aliyun.core.annotation.NameInMap("totalFileSizeInBytes")
    private Long totalFileSizeInBytes;

    @com.aliyun.core.annotation.NameInMap("totalMetaSizeInBytes")
    private Long totalMetaSizeInBytes;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    private TableSummary(Builder builder) {
        this.createdAt = builder.createdAt;
        this.databaseName = builder.databaseName;
        this.generatedDate = builder.generatedDate;
        this.lastAccessTime = builder.lastAccessTime;
        this.objTypeArchiveSize = builder.objTypeArchiveSize;
        this.objTypeColdArchiveSize = builder.objTypeColdArchiveSize;
        this.objTypeIaSize = builder.objTypeIaSize;
        this.objTypeStandardSize = builder.objTypeStandardSize;
        this.partitionCount = builder.partitionCount;
        this.path = builder.path;
        this.storageActionParams = builder.storageActionParams;
        this.storageActionTimestamp = builder.storageActionTimestamp;
        this.storageClass = builder.storageClass;
        this.tableName = builder.tableName;
        this.totalFileCount = builder.totalFileCount;
        this.totalFileSizeInBytes = builder.totalFileSizeInBytes;
        this.totalMetaSizeInBytes = builder.totalMetaSizeInBytes;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableSummary create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return generatedDate
     */
    public String getGeneratedDate() {
        return this.generatedDate;
    }

    /**
     * @return lastAccessTime
     */
    public Long getLastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * @return objTypeArchiveSize
     */
    public Long getObjTypeArchiveSize() {
        return this.objTypeArchiveSize;
    }

    /**
     * @return objTypeColdArchiveSize
     */
    public Long getObjTypeColdArchiveSize() {
        return this.objTypeColdArchiveSize;
    }

    /**
     * @return objTypeIaSize
     */
    public Long getObjTypeIaSize() {
        return this.objTypeIaSize;
    }

    /**
     * @return objTypeStandardSize
     */
    public Long getObjTypeStandardSize() {
        return this.objTypeStandardSize;
    }

    /**
     * @return partitionCount
     */
    public Long getPartitionCount() {
        return this.partitionCount;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return storageActionParams
     */
    public java.util.Map<String, String> getStorageActionParams() {
        return this.storageActionParams;
    }

    /**
     * @return storageActionTimestamp
     */
    public Long getStorageActionTimestamp() {
        return this.storageActionTimestamp;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return totalFileCount
     */
    public Long getTotalFileCount() {
        return this.totalFileCount;
    }

    /**
     * @return totalFileSizeInBytes
     */
    public Long getTotalFileSizeInBytes() {
        return this.totalFileSizeInBytes;
    }

    /**
     * @return totalMetaSizeInBytes
     */
    public Long getTotalMetaSizeInBytes() {
        return this.totalMetaSizeInBytes;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private Long createdAt; 
        private String databaseName; 
        private String generatedDate; 
        private Long lastAccessTime; 
        private Long objTypeArchiveSize; 
        private Long objTypeColdArchiveSize; 
        private Long objTypeIaSize; 
        private Long objTypeStandardSize; 
        private Long partitionCount; 
        private String path; 
        private java.util.Map<String, String> storageActionParams; 
        private Long storageActionTimestamp; 
        private String storageClass; 
        private String tableName; 
        private Long totalFileCount; 
        private Long totalFileSizeInBytes; 
        private Long totalMetaSizeInBytes; 
        private Long updatedAt; 

        private Builder() {
        } 

        private Builder(TableSummary model) {
            this.createdAt = model.createdAt;
            this.databaseName = model.databaseName;
            this.generatedDate = model.generatedDate;
            this.lastAccessTime = model.lastAccessTime;
            this.objTypeArchiveSize = model.objTypeArchiveSize;
            this.objTypeColdArchiveSize = model.objTypeColdArchiveSize;
            this.objTypeIaSize = model.objTypeIaSize;
            this.objTypeStandardSize = model.objTypeStandardSize;
            this.partitionCount = model.partitionCount;
            this.path = model.path;
            this.storageActionParams = model.storageActionParams;
            this.storageActionTimestamp = model.storageActionTimestamp;
            this.storageClass = model.storageClass;
            this.tableName = model.tableName;
            this.totalFileCount = model.totalFileCount;
            this.totalFileSizeInBytes = model.totalFileSizeInBytes;
            this.totalMetaSizeInBytes = model.totalMetaSizeInBytes;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>Latest snapshot storage size</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>Database name</p>
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * generatedDate.
         */
        public Builder generatedDate(String generatedDate) {
            this.generatedDate = generatedDate;
            return this;
        }

        /**
         * lastAccessTime.
         */
        public Builder lastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }

        /**
         * objTypeArchiveSize.
         */
        public Builder objTypeArchiveSize(Long objTypeArchiveSize) {
            this.objTypeArchiveSize = objTypeArchiveSize;
            return this;
        }

        /**
         * objTypeColdArchiveSize.
         */
        public Builder objTypeColdArchiveSize(Long objTypeColdArchiveSize) {
            this.objTypeColdArchiveSize = objTypeColdArchiveSize;
            return this;
        }

        /**
         * objTypeIaSize.
         */
        public Builder objTypeIaSize(Long objTypeIaSize) {
            this.objTypeIaSize = objTypeIaSize;
            return this;
        }

        /**
         * objTypeStandardSize.
         */
        public Builder objTypeStandardSize(Long objTypeStandardSize) {
            this.objTypeStandardSize = objTypeStandardSize;
            return this;
        }

        /**
         * <p>Creation timestamp in milliseconds</p>
         */
        public Builder partitionCount(Long partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }

        /**
         * path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * storageActionParams.
         */
        public Builder storageActionParams(java.util.Map<String, String> storageActionParams) {
            this.storageActionParams = storageActionParams;
            return this;
        }

        /**
         * storageActionTimestamp.
         */
        public Builder storageActionTimestamp(Long storageActionTimestamp) {
            this.storageActionTimestamp = storageActionTimestamp;
            return this;
        }

        /**
         * storageClass.
         */
        public Builder storageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * <p>Table name</p>
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>30-day access count</p>
         */
        public Builder totalFileCount(Long totalFileCount) {
            this.totalFileCount = totalFileCount;
            return this;
        }

        /**
         * totalFileSizeInBytes.
         */
        public Builder totalFileSizeInBytes(Long totalFileSizeInBytes) {
            this.totalFileSizeInBytes = totalFileSizeInBytes;
            return this;
        }

        /**
         * totalMetaSizeInBytes.
         */
        public Builder totalMetaSizeInBytes(Long totalMetaSizeInBytes) {
            this.totalMetaSizeInBytes = totalMetaSizeInBytes;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public TableSummary build() {
            return new TableSummary(this);
        } 

    } 

}
