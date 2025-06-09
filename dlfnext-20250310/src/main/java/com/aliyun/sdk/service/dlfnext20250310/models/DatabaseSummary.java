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
 * {@link DatabaseSummary} extends {@link TeaModel}
 *
 * <p>DatabaseSummary</p>
 */
public class DatabaseSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("databaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("generatedDate")
    private String generatedDate;

    @com.aliyun.core.annotation.NameInMap("location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("partitionCount")
    private Long partitionCount;

    @com.aliyun.core.annotation.NameInMap("tableCount")
    private Long tableCount;

    @com.aliyun.core.annotation.NameInMap("totalFileCount")
    private Long totalFileCount;

    @com.aliyun.core.annotation.NameInMap("totalFileSizeInBytes")
    private Long totalFileSizeInBytes;

    private DatabaseSummary(Builder builder) {
        this.createdAt = builder.createdAt;
        this.databaseName = builder.databaseName;
        this.generatedDate = builder.generatedDate;
        this.location = builder.location;
        this.partitionCount = builder.partitionCount;
        this.tableCount = builder.tableCount;
        this.totalFileCount = builder.totalFileCount;
        this.totalFileSizeInBytes = builder.totalFileSizeInBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatabaseSummary create() {
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
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return partitionCount
     */
    public Long getPartitionCount() {
        return this.partitionCount;
    }

    /**
     * @return tableCount
     */
    public Long getTableCount() {
        return this.tableCount;
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
        private String location; 
        private Long partitionCount; 
        private Long tableCount; 
        private Long totalFileCount; 
        private Long totalFileSizeInBytes; 

        private Builder() {
        } 

        private Builder(DatabaseSummary model) {
            this.createdAt = model.createdAt;
            this.databaseName = model.databaseName;
            this.generatedDate = model.generatedDate;
            this.location = model.location;
            this.partitionCount = model.partitionCount;
            this.tableCount = model.tableCount;
            this.totalFileCount = model.totalFileCount;
            this.totalFileSizeInBytes = model.totalFileSizeInBytes;
        } 

        /**
         * <p>Creation timestamp in milliseconds</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>库名 - Database name</p>
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>Last profile update date in format yyyyMMdd</p>
         */
        public Builder generatedDate(String generatedDate) {
            this.generatedDate = generatedDate;
            return this;
        }

        /**
         * <p>Storage location URI</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * partitionCount.
         */
        public Builder partitionCount(Long partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }

        /**
         * <p>Total storage in bytes</p>
         */
        public Builder tableCount(Long tableCount) {
            this.tableCount = tableCount;
            return this;
        }

        /**
         * totalFileCount.
         */
        public Builder totalFileCount(Long totalFileCount) {
            this.totalFileCount = totalFileCount;
            return this;
        }

        /**
         * <p>Total file count</p>
         */
        public Builder totalFileSizeInBytes(Long totalFileSizeInBytes) {
            this.totalFileSizeInBytes = totalFileSizeInBytes;
            return this;
        }

        public DatabaseSummary build() {
            return new DatabaseSummary(this);
        } 

    } 

}
