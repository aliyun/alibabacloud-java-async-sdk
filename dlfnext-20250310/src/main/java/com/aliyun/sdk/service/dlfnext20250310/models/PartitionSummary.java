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

    @com.aliyun.core.annotation.NameInMap("lastRequester")
    private String lastRequester;

    @com.aliyun.core.annotation.NameInMap("partitionName")
    private String partitionName;

    @com.aliyun.core.annotation.NameInMap("storageActionParams")
    private java.util.Map<String, String> storageActionParams;

    @com.aliyun.core.annotation.NameInMap("storageActionTimestamp")
    private Long storageActionTimestamp;

    @com.aliyun.core.annotation.NameInMap("storageClass")
    private String storageClass;

    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("topRequester")
    private String topRequester;

    @com.aliyun.core.annotation.NameInMap("totalFileAccessNum")
    private Long totalFileAccessNum;

    @com.aliyun.core.annotation.NameInMap("totalFileAccessNum30d")
    private Long totalFileAccessNum30d;

    @com.aliyun.core.annotation.NameInMap("totalFileAccessNum7d")
    private Long totalFileAccessNum7d;

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
        this.lastRequester = builder.lastRequester;
        this.partitionName = builder.partitionName;
        this.storageActionParams = builder.storageActionParams;
        this.storageActionTimestamp = builder.storageActionTimestamp;
        this.storageClass = builder.storageClass;
        this.tableName = builder.tableName;
        this.topRequester = builder.topRequester;
        this.totalFileAccessNum = builder.totalFileAccessNum;
        this.totalFileAccessNum30d = builder.totalFileAccessNum30d;
        this.totalFileAccessNum7d = builder.totalFileAccessNum7d;
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
     * @return lastRequester
     */
    public String getLastRequester() {
        return this.lastRequester;
    }

    /**
     * @return partitionName
     */
    public String getPartitionName() {
        return this.partitionName;
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
     * @return topRequester
     */
    public String getTopRequester() {
        return this.topRequester;
    }

    /**
     * @return totalFileAccessNum
     */
    public Long getTotalFileAccessNum() {
        return this.totalFileAccessNum;
    }

    /**
     * @return totalFileAccessNum30d
     */
    public Long getTotalFileAccessNum30d() {
        return this.totalFileAccessNum30d;
    }

    /**
     * @return totalFileAccessNum7d
     */
    public Long getTotalFileAccessNum7d() {
        return this.totalFileAccessNum7d;
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
        private String lastRequester; 
        private String partitionName; 
        private java.util.Map<String, String> storageActionParams; 
        private Long storageActionTimestamp; 
        private String storageClass; 
        private String tableName; 
        private String topRequester; 
        private Long totalFileAccessNum; 
        private Long totalFileAccessNum30d; 
        private Long totalFileAccessNum7d; 
        private Long totalFileCount; 
        private Long totalFileSizeInBytes; 
        private Long updatedAt; 

        private Builder() {
        } 

        private Builder(PartitionSummary model) {
            this.createdAt = model.createdAt;
            this.databaseName = model.databaseName;
            this.lastAccessTime = model.lastAccessTime;
            this.lastRequester = model.lastRequester;
            this.partitionName = model.partitionName;
            this.storageActionParams = model.storageActionParams;
            this.storageActionTimestamp = model.storageActionTimestamp;
            this.storageClass = model.storageClass;
            this.tableName = model.tableName;
            this.topRequester = model.topRequester;
            this.totalFileAccessNum = model.totalFileAccessNum;
            this.totalFileAccessNum30d = model.totalFileAccessNum30d;
            this.totalFileAccessNum7d = model.totalFileAccessNum7d;
            this.totalFileCount = model.totalFileCount;
            this.totalFileSizeInBytes = model.totalFileSizeInBytes;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The creation timestamp for the partition.</p>
         * 
         * <strong>example:</strong>
         * <p>1744970111419</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The last access timestamp for the partition\&quot;s data.</p>
         * 
         * <strong>example:</strong>
         * <p>1744970111419</p>
         */
        public Builder lastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }

        /**
         * <p>The last requester.</p>
         */
        public Builder lastRequester(String lastRequester) {
            this.lastRequester = lastRequester;
            return this;
        }

        /**
         * <p>The name of the partition.</p>
         * 
         * <strong>example:</strong>
         * <p>hh=18</p>
         */
        public Builder partitionName(String partitionName) {
            this.partitionName = partitionName;
            return this;
        }

        /**
         * <p>The storage action parameters.</p>
         */
        public Builder storageActionParams(java.util.Map<String, String> storageActionParams) {
            this.storageActionParams = storageActionParams;
            return this;
        }

        /**
         * <p>The storage action timestamp.</p>
         */
        public Builder storageActionTimestamp(Long storageActionTimestamp) {
            this.storageActionTimestamp = storageActionTimestamp;
            return this;
        }

        /**
         * <p>The storage class.</p>
         */
        public Builder storageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The top requester.</p>
         */
        public Builder topRequester(String topRequester) {
            this.topRequester = topRequester;
            return this;
        }

        /**
         * <p>Total file access count.</p>
         */
        public Builder totalFileAccessNum(Long totalFileAccessNum) {
            this.totalFileAccessNum = totalFileAccessNum;
            return this;
        }

        /**
         * <p>Total file access count over the last 30 days.</p>
         */
        public Builder totalFileAccessNum30d(Long totalFileAccessNum30d) {
            this.totalFileAccessNum30d = totalFileAccessNum30d;
            return this;
        }

        /**
         * <p>Total file access count over the last 7 days.</p>
         */
        public Builder totalFileAccessNum7d(Long totalFileAccessNum7d) {
            this.totalFileAccessNum7d = totalFileAccessNum7d;
            return this;
        }

        /**
         * <p>The total number of files in the partition.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalFileCount(Long totalFileCount) {
            this.totalFileCount = totalFileCount;
            return this;
        }

        /**
         * <p>The total size, in bytes, of all files in the partition.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder totalFileSizeInBytes(Long totalFileSizeInBytes) {
            this.totalFileSizeInBytes = totalFileSizeInBytes;
            return this;
        }

        /**
         * <p>The last update timestamp for the partition.</p>
         * 
         * <strong>example:</strong>
         * <p>1744970111419</p>
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
