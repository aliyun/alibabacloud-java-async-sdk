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

    @com.aliyun.core.annotation.NameInMap("lastRequester")
    private String lastRequester;

    @com.aliyun.core.annotation.NameInMap("latestSnapshotDataSizeInBytes")
    private Long latestSnapshotDataSizeInBytes;

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

    @com.aliyun.core.annotation.NameInMap("totalMetaFileCount")
    private Long totalMetaFileCount;

    @com.aliyun.core.annotation.NameInMap("totalMetaSizeInBytes")
    private Long totalMetaSizeInBytes;

    @com.aliyun.core.annotation.NameInMap("unaccessedStdIaPartitionCount180d")
    private Long unaccessedStdIaPartitionCount180d;

    @com.aliyun.core.annotation.NameInMap("unaccessedStdPartitionCount30d")
    private Long unaccessedStdPartitionCount30d;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    private TableSummary(Builder builder) {
        this.createdAt = builder.createdAt;
        this.databaseName = builder.databaseName;
        this.generatedDate = builder.generatedDate;
        this.lastAccessTime = builder.lastAccessTime;
        this.lastRequester = builder.lastRequester;
        this.latestSnapshotDataSizeInBytes = builder.latestSnapshotDataSizeInBytes;
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
        this.topRequester = builder.topRequester;
        this.totalFileAccessNum = builder.totalFileAccessNum;
        this.totalFileAccessNum30d = builder.totalFileAccessNum30d;
        this.totalFileAccessNum7d = builder.totalFileAccessNum7d;
        this.totalFileCount = builder.totalFileCount;
        this.totalFileSizeInBytes = builder.totalFileSizeInBytes;
        this.totalMetaFileCount = builder.totalMetaFileCount;
        this.totalMetaSizeInBytes = builder.totalMetaSizeInBytes;
        this.unaccessedStdIaPartitionCount180d = builder.unaccessedStdIaPartitionCount180d;
        this.unaccessedStdPartitionCount30d = builder.unaccessedStdPartitionCount30d;
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
     * @return lastRequester
     */
    public String getLastRequester() {
        return this.lastRequester;
    }

    /**
     * @return latestSnapshotDataSizeInBytes
     */
    public Long getLatestSnapshotDataSizeInBytes() {
        return this.latestSnapshotDataSizeInBytes;
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
     * @return totalMetaFileCount
     */
    public Long getTotalMetaFileCount() {
        return this.totalMetaFileCount;
    }

    /**
     * @return totalMetaSizeInBytes
     */
    public Long getTotalMetaSizeInBytes() {
        return this.totalMetaSizeInBytes;
    }

    /**
     * @return unaccessedStdIaPartitionCount180d
     */
    public Long getUnaccessedStdIaPartitionCount180d() {
        return this.unaccessedStdIaPartitionCount180d;
    }

    /**
     * @return unaccessedStdPartitionCount30d
     */
    public Long getUnaccessedStdPartitionCount30d() {
        return this.unaccessedStdPartitionCount30d;
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
        private String lastRequester; 
        private Long latestSnapshotDataSizeInBytes; 
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
        private String topRequester; 
        private Long totalFileAccessNum; 
        private Long totalFileAccessNum30d; 
        private Long totalFileAccessNum7d; 
        private Long totalFileCount; 
        private Long totalFileSizeInBytes; 
        private Long totalMetaFileCount; 
        private Long totalMetaSizeInBytes; 
        private Long unaccessedStdIaPartitionCount180d; 
        private Long unaccessedStdPartitionCount30d; 
        private Long updatedAt; 

        private Builder() {
        } 

        private Builder(TableSummary model) {
            this.createdAt = model.createdAt;
            this.databaseName = model.databaseName;
            this.generatedDate = model.generatedDate;
            this.lastAccessTime = model.lastAccessTime;
            this.lastRequester = model.lastRequester;
            this.latestSnapshotDataSizeInBytes = model.latestSnapshotDataSizeInBytes;
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
            this.topRequester = model.topRequester;
            this.totalFileAccessNum = model.totalFileAccessNum;
            this.totalFileAccessNum30d = model.totalFileAccessNum30d;
            this.totalFileAccessNum7d = model.totalFileAccessNum7d;
            this.totalFileCount = model.totalFileCount;
            this.totalFileSizeInBytes = model.totalFileSizeInBytes;
            this.totalMetaFileCount = model.totalMetaFileCount;
            this.totalMetaSizeInBytes = model.totalMetaSizeInBytes;
            this.unaccessedStdIaPartitionCount180d = model.unaccessedStdIaPartitionCount180d;
            this.unaccessedStdPartitionCount30d = model.unaccessedStdPartitionCount30d;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The table creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1744970111419</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The update date of the storage overview data.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-01</p>
         */
        public Builder generatedDate(String generatedDate) {
            this.generatedDate = generatedDate;
            return this;
        }

        /**
         * <p>The last data access time of the table.</p>
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
         * 
         * <strong>example:</strong>
         * <p>acs:ram::[accountId]:root</p>
         */
        public Builder lastRequester(String lastRequester) {
            this.lastRequester = lastRequester;
            return this;
        }

        /**
         * <p>The storage size of the latest snapshot, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder latestSnapshotDataSizeInBytes(Long latestSnapshotDataSizeInBytes) {
            this.latestSnapshotDataSizeInBytes = latestSnapshotDataSizeInBytes;
            return this;
        }

        /**
         * <p>The storage size of archive data files.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder objTypeArchiveSize(Long objTypeArchiveSize) {
            this.objTypeArchiveSize = objTypeArchiveSize;
            return this;
        }

        /**
         * <p>The storage size of cold archive data files.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder objTypeColdArchiveSize(Long objTypeColdArchiveSize) {
            this.objTypeColdArchiveSize = objTypeColdArchiveSize;
            return this;
        }

        /**
         * <p>The storage size of infrequent access data files.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder objTypeIaSize(Long objTypeIaSize) {
            this.objTypeIaSize = objTypeIaSize;
            return this;
        }

        /**
         * <p>The storage size of standard data files.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder objTypeStandardSize(Long objTypeStandardSize) {
            this.objTypeStandardSize = objTypeStandardSize;
            return this;
        }

        /**
         * <p>The total number of partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder partitionCount(Long partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }

        /**
         * <p>The storage location.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://clg-xxxx/db-xxxx/tbl-xxxx</p>
         */
        public Builder path(String path) {
            this.path = path;
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
         * <p>The storage class transition time.</p>
         * 
         * <strong>example:</strong>
         * <p>1767491579459</p>
         */
        public Builder storageActionTimestamp(Long storageActionTimestamp) {
            this.storageActionTimestamp = storageActionTimestamp;
            return this;
        }

        /**
         * <p>The storage class.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        public Builder storageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The top requester of the day.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::[accountId]:root</p>
         */
        public Builder topRequester(String topRequester) {
            this.topRequester = topRequester;
            return this;
        }

        /**
         * <p>The total number of file accesses.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalFileAccessNum(Long totalFileAccessNum) {
            this.totalFileAccessNum = totalFileAccessNum;
            return this;
        }

        /**
         * <p>The total number of file accesses in the last 7 days.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalFileAccessNum30d(Long totalFileAccessNum30d) {
            this.totalFileAccessNum30d = totalFileAccessNum30d;
            return this;
        }

        /**
         * <p>The total number of file accesses in the last 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder totalFileAccessNum7d(Long totalFileAccessNum7d) {
            this.totalFileAccessNum7d = totalFileAccessNum7d;
            return this;
        }

        /**
         * <p>The total number of table files.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalFileCount(Long totalFileCount) {
            this.totalFileCount = totalFileCount;
            return this;
        }

        /**
         * <p>The table storage capacity, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder totalFileSizeInBytes(Long totalFileSizeInBytes) {
            this.totalFileSizeInBytes = totalFileSizeInBytes;
            return this;
        }

        /**
         * <p>The number of metadata files.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalMetaFileCount(Long totalMetaFileCount) {
            this.totalMetaFileCount = totalMetaFileCount;
            return this;
        }

        /**
         * <p>The storage size of metadata files.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder totalMetaSizeInBytes(Long totalMetaSizeInBytes) {
            this.totalMetaSizeInBytes = totalMetaSizeInBytes;
            return this;
        }

        /**
         * <p>The number of standard or infrequent access partitions that have not been accessed in the last 180 days.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder unaccessedStdIaPartitionCount180d(Long unaccessedStdIaPartitionCount180d) {
            this.unaccessedStdIaPartitionCount180d = unaccessedStdIaPartitionCount180d;
            return this;
        }

        /**
         * <p>The number of standard storage partitions that have not been accessed in the last 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder unaccessedStdPartitionCount30d(Long unaccessedStdPartitionCount30d) {
            this.unaccessedStdPartitionCount30d = unaccessedStdPartitionCount30d;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1764555981383</p>
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
