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

    @com.aliyun.core.annotation.NameInMap("tableCount")
    private Long tableCount;

    @com.aliyun.core.annotation.NameInMap("totalFileCount")
    private Long totalFileCount;

    @com.aliyun.core.annotation.NameInMap("totalFileSizeInBytes")
    private Long totalFileSizeInBytes;

    @com.aliyun.core.annotation.NameInMap("totalMetaFileCount")
    private Long totalMetaFileCount;

    @com.aliyun.core.annotation.NameInMap("totalMetaSizeInBytes")
    private Long totalMetaSizeInBytes;

    private DatabaseSummary(Builder builder) {
        this.createdAt = builder.createdAt;
        this.databaseName = builder.databaseName;
        this.generatedDate = builder.generatedDate;
        this.location = builder.location;
        this.objTypeArchiveSize = builder.objTypeArchiveSize;
        this.objTypeColdArchiveSize = builder.objTypeColdArchiveSize;
        this.objTypeIaSize = builder.objTypeIaSize;
        this.objTypeStandardSize = builder.objTypeStandardSize;
        this.partitionCount = builder.partitionCount;
        this.tableCount = builder.tableCount;
        this.totalFileCount = builder.totalFileCount;
        this.totalFileSizeInBytes = builder.totalFileSizeInBytes;
        this.totalMetaFileCount = builder.totalMetaFileCount;
        this.totalMetaSizeInBytes = builder.totalMetaSizeInBytes;
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

    public static final class Builder {
        private Long createdAt; 
        private String databaseName; 
        private String generatedDate; 
        private String location; 
        private Long objTypeArchiveSize; 
        private Long objTypeColdArchiveSize; 
        private Long objTypeIaSize; 
        private Long objTypeStandardSize; 
        private Long partitionCount; 
        private Long tableCount; 
        private Long totalFileCount; 
        private Long totalFileSizeInBytes; 
        private Long totalMetaFileCount; 
        private Long totalMetaSizeInBytes; 

        private Builder() {
        } 

        private Builder(DatabaseSummary model) {
            this.createdAt = model.createdAt;
            this.databaseName = model.databaseName;
            this.generatedDate = model.generatedDate;
            this.location = model.location;
            this.objTypeArchiveSize = model.objTypeArchiveSize;
            this.objTypeColdArchiveSize = model.objTypeColdArchiveSize;
            this.objTypeIaSize = model.objTypeIaSize;
            this.objTypeStandardSize = model.objTypeStandardSize;
            this.partitionCount = model.partitionCount;
            this.tableCount = model.tableCount;
            this.totalFileCount = model.totalFileCount;
            this.totalFileSizeInBytes = model.totalFileSizeInBytes;
            this.totalMetaFileCount = model.totalMetaFileCount;
            this.totalMetaSizeInBytes = model.totalMetaSizeInBytes;
        } 

        /**
         * <p>The database creation time.</p>
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
         * <p>The date when the storage overview data was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-01</p>
         */
        public Builder generatedDate(String generatedDate) {
            this.generatedDate = generatedDate;
            return this;
        }

        /**
         * <p>The storage location.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://clg-paimon-xxx/db-xxx</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * <p>The storage size of Archive data files.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder objTypeArchiveSize(Long objTypeArchiveSize) {
            this.objTypeArchiveSize = objTypeArchiveSize;
            return this;
        }

        /**
         * <p>The storage size of Cold Archive data files.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder objTypeColdArchiveSize(Long objTypeColdArchiveSize) {
            this.objTypeColdArchiveSize = objTypeColdArchiveSize;
            return this;
        }

        /**
         * <p>The storage size of Infrequent Access data files.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder objTypeIaSize(Long objTypeIaSize) {
            this.objTypeIaSize = objTypeIaSize;
            return this;
        }

        /**
         * <p>The storage size of Standard data files.</p>
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
         * <p>1000</p>
         */
        public Builder partitionCount(Long partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }

        /**
         * <p>The total number of tables.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder tableCount(Long tableCount) {
            this.tableCount = tableCount;
            return this;
        }

        /**
         * <p>The total number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder totalFileCount(Long totalFileCount) {
            this.totalFileCount = totalFileCount;
            return this;
        }

        /**
         * <p>The storage capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        public Builder totalFileSizeInBytes(Long totalFileSizeInBytes) {
            this.totalFileSizeInBytes = totalFileSizeInBytes;
            return this;
        }

        /**
         * <p>The total number of metadata files.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        public Builder totalMetaFileCount(Long totalMetaFileCount) {
            this.totalMetaFileCount = totalMetaFileCount;
            return this;
        }

        /**
         * <p>The storage size of metadata files, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder totalMetaSizeInBytes(Long totalMetaSizeInBytes) {
            this.totalMetaSizeInBytes = totalMetaSizeInBytes;
            return this;
        }

        public DatabaseSummary build() {
            return new DatabaseSummary(this);
        } 

    } 

}
