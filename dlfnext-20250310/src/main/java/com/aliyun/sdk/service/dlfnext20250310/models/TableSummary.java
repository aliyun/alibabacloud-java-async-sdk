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

    @com.aliyun.core.annotation.NameInMap("partitionCount")
    private Long partitionCount;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("totalFileCount")
    private Long totalFileCount;

    @com.aliyun.core.annotation.NameInMap("totalFileSizeInBytes")
    private Long totalFileSizeInBytes;

    private TableSummary(Builder builder) {
        this.createdAt = builder.createdAt;
        this.databaseName = builder.databaseName;
        this.generatedDate = builder.generatedDate;
        this.lastAccessTime = builder.lastAccessTime;
        this.partitionCount = builder.partitionCount;
        this.path = builder.path;
        this.tableName = builder.tableName;
        this.totalFileCount = builder.totalFileCount;
        this.totalFileSizeInBytes = builder.totalFileSizeInBytes;
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

    public static final class Builder {
        private Long createdAt; 
        private String databaseName; 
        private String generatedDate; 
        private Long lastAccessTime; 
        private Long partitionCount; 
        private String path; 
        private String tableName; 
        private Long totalFileCount; 
        private Long totalFileSizeInBytes; 

        private Builder() {
        } 

        private Builder(TableSummary model) {
            this.createdAt = model.createdAt;
            this.databaseName = model.databaseName;
            this.generatedDate = model.generatedDate;
            this.lastAccessTime = model.lastAccessTime;
            this.partitionCount = model.partitionCount;
            this.path = model.path;
            this.tableName = model.tableName;
            this.totalFileCount = model.totalFileCount;
            this.totalFileSizeInBytes = model.totalFileSizeInBytes;
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

        public TableSummary build() {
            return new TableSummary(this);
        } 

    } 

}
