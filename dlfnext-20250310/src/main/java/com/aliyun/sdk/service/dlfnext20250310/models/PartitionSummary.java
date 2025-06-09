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
 * {@link PartitionSummary} extends {@link TeaModel}
 *
 * <p>PartitionSummary</p>
 */
public class PartitionSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("databaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("lastAccessTime")
    private Long lastAccessTime;

    @com.aliyun.core.annotation.NameInMap("partitionName")
    private String partitionName;

    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("totalFileCount")
    private Long totalFileCount;

    @com.aliyun.core.annotation.NameInMap("totalFileSizeInBytes")
    private Long totalFileSizeInBytes;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    private PartitionSummary(Builder builder) {
        this.createdAt = builder.createdAt;
        this.databaseName = builder.databaseName;
        this.lastAccessTime = builder.lastAccessTime;
        this.partitionName = builder.partitionName;
        this.tableName = builder.tableName;
        this.totalFileCount = builder.totalFileCount;
        this.totalFileSizeInBytes = builder.totalFileSizeInBytes;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PartitionSummary create() {
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
     * @return lastAccessTime
     */
    public Long getLastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * @return partitionName
     */
    public String getPartitionName() {
        return this.partitionName;
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
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private Long createdAt; 
        private String databaseName; 
        private Long lastAccessTime; 
        private String partitionName; 
        private String tableName; 
        private Long totalFileCount; 
        private Long totalFileSizeInBytes; 
        private Long updatedAt; 

        private Builder() {
        } 

        private Builder(PartitionSummary model) {
            this.createdAt = model.createdAt;
            this.databaseName = model.databaseName;
            this.lastAccessTime = model.lastAccessTime;
            this.partitionName = model.partitionName;
            this.tableName = model.tableName;
            this.totalFileCount = model.totalFileCount;
            this.totalFileSizeInBytes = model.totalFileSizeInBytes;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>Partition creation timestamp in milliseconds</p>
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
         * <p>Total files in partition</p>
         */
        public Builder lastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }

        /**
         * <p>Partition identifier</p>
         */
        public Builder partitionName(String partitionName) {
            this.partitionName = partitionName;
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
         * <p>24h access count</p>
         */
        public Builder totalFileCount(Long totalFileCount) {
            this.totalFileCount = totalFileCount;
            return this;
        }

        /**
         * <p>Last data access timestamp in milliseconds</p>
         */
        public Builder totalFileSizeInBytes(Long totalFileSizeInBytes) {
            this.totalFileSizeInBytes = totalFileSizeInBytes;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public PartitionSummary build() {
            return new PartitionSummary(this);
        } 

    } 

}
