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
 * {@link TableSnapshot} extends {@link TeaModel}
 *
 * <p>TableSnapshot</p>
 */
public class TableSnapshot extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fileCount")
    private Long fileCount;

    @com.aliyun.core.annotation.NameInMap("fileSizeInBytes")
    private Long fileSizeInBytes;

    @com.aliyun.core.annotation.NameInMap("lastFileCreationTime")
    private Long lastFileCreationTime;

    @com.aliyun.core.annotation.NameInMap("partitionCount")
    private Long partitionCount;

    @com.aliyun.core.annotation.NameInMap("recordCount")
    private Long recordCount;

    @com.aliyun.core.annotation.NameInMap("snapshot")
    private Snapshot snapshot;

    @com.aliyun.core.annotation.NameInMap("totalBuckets")
    private Integer totalBuckets;

    private TableSnapshot(Builder builder) {
        this.fileCount = builder.fileCount;
        this.fileSizeInBytes = builder.fileSizeInBytes;
        this.lastFileCreationTime = builder.lastFileCreationTime;
        this.partitionCount = builder.partitionCount;
        this.recordCount = builder.recordCount;
        this.snapshot = builder.snapshot;
        this.totalBuckets = builder.totalBuckets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableSnapshot create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileCount
     */
    public Long getFileCount() {
        return this.fileCount;
    }

    /**
     * @return fileSizeInBytes
     */
    public Long getFileSizeInBytes() {
        return this.fileSizeInBytes;
    }

    /**
     * @return lastFileCreationTime
     */
    public Long getLastFileCreationTime() {
        return this.lastFileCreationTime;
    }

    /**
     * @return partitionCount
     */
    public Long getPartitionCount() {
        return this.partitionCount;
    }

    /**
     * @return recordCount
     */
    public Long getRecordCount() {
        return this.recordCount;
    }

    /**
     * @return snapshot
     */
    public Snapshot getSnapshot() {
        return this.snapshot;
    }

    /**
     * @return totalBuckets
     */
    public Integer getTotalBuckets() {
        return this.totalBuckets;
    }

    public static final class Builder {
        private Long fileCount; 
        private Long fileSizeInBytes; 
        private Long lastFileCreationTime; 
        private Long partitionCount; 
        private Long recordCount; 
        private Snapshot snapshot; 
        private Integer totalBuckets; 

        private Builder() {
        } 

        private Builder(TableSnapshot model) {
            this.fileCount = model.fileCount;
            this.fileSizeInBytes = model.fileSizeInBytes;
            this.lastFileCreationTime = model.lastFileCreationTime;
            this.partitionCount = model.partitionCount;
            this.recordCount = model.recordCount;
            this.snapshot = model.snapshot;
            this.totalBuckets = model.totalBuckets;
        } 

        /**
         * <p>The total number of files in the snapshot.</p>
         */
        public Builder fileCount(Long fileCount) {
            this.fileCount = fileCount;
            return this;
        }

        /**
         * <p>The total size of all files in the snapshot, in bytes.</p>
         */
        public Builder fileSizeInBytes(Long fileSizeInBytes) {
            this.fileSizeInBytes = fileSizeInBytes;
            return this;
        }

        /**
         * <p>The creation time of the most recent file in the snapshot, as a Unix timestamp in milliseconds.</p>
         */
        public Builder lastFileCreationTime(Long lastFileCreationTime) {
            this.lastFileCreationTime = lastFileCreationTime;
            return this;
        }

        /**
         * <p>The total number of partitions in the table.</p>
         */
        public Builder partitionCount(Long partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }

        /**
         * <p>The total number of records in the snapshot.</p>
         */
        public Builder recordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }

        /**
         * <p>Contains detailed information about the snapshot.</p>
         */
        public Builder snapshot(Snapshot snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        /**
         * <p>The total number of buckets in the table.</p>
         */
        public Builder totalBuckets(Integer totalBuckets) {
            this.totalBuckets = totalBuckets;
            return this;
        }

        public TableSnapshot build() {
            return new TableSnapshot(this);
        } 

    } 

}
