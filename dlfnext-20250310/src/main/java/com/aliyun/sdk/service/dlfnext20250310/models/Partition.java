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
 * {@link Partition} extends {@link TeaModel}
 *
 * <p>Partition</p>
 */
public class Partition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("done")
    private Boolean done;

    @com.aliyun.core.annotation.NameInMap("fileCount")
    private Long fileCount;

    @com.aliyun.core.annotation.NameInMap("fileSizeInBytes")
    private Long fileSizeInBytes;

    @com.aliyun.core.annotation.NameInMap("lastFileCreationTime")
    private Long lastFileCreationTime;

    @com.aliyun.core.annotation.NameInMap("recordCount")
    private Long recordCount;

    @com.aliyun.core.annotation.NameInMap("spec")
    private java.util.Map<String, ?> spec;

    @com.aliyun.core.annotation.NameInMap("storageAction")
    private String storageAction;

    @com.aliyun.core.annotation.NameInMap("storageActionTimestamp")
    private Long storageActionTimestamp;

    @com.aliyun.core.annotation.NameInMap("storageClass")
    private String storageClass;

    @com.aliyun.core.annotation.NameInMap("totalBuckets")
    private Integer totalBuckets;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("updatedBy")
    private String updatedBy;

    private Partition(Builder builder) {
        this.createdAt = builder.createdAt;
        this.createdBy = builder.createdBy;
        this.done = builder.done;
        this.fileCount = builder.fileCount;
        this.fileSizeInBytes = builder.fileSizeInBytes;
        this.lastFileCreationTime = builder.lastFileCreationTime;
        this.recordCount = builder.recordCount;
        this.spec = builder.spec;
        this.storageAction = builder.storageAction;
        this.storageActionTimestamp = builder.storageActionTimestamp;
        this.storageClass = builder.storageClass;
        this.totalBuckets = builder.totalBuckets;
        this.updatedAt = builder.updatedAt;
        this.updatedBy = builder.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Partition create() {
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
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return done
     */
    public Boolean getDone() {
        return this.done;
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
     * @return recordCount
     */
    public Long getRecordCount() {
        return this.recordCount;
    }

    /**
     * @return spec
     */
    public java.util.Map<String, ?> getSpec() {
        return this.spec;
    }

    /**
     * @return storageAction
     */
    public String getStorageAction() {
        return this.storageAction;
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
     * @return totalBuckets
     */
    public Integer getTotalBuckets() {
        return this.totalBuckets;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public static final class Builder {
        private Long createdAt; 
        private String createdBy; 
        private Boolean done; 
        private Long fileCount; 
        private Long fileSizeInBytes; 
        private Long lastFileCreationTime; 
        private Long recordCount; 
        private java.util.Map<String, ?> spec; 
        private String storageAction; 
        private Long storageActionTimestamp; 
        private String storageClass; 
        private Integer totalBuckets; 
        private Long updatedAt; 
        private String updatedBy; 

        private Builder() {
        } 

        private Builder(Partition model) {
            this.createdAt = model.createdAt;
            this.createdBy = model.createdBy;
            this.done = model.done;
            this.fileCount = model.fileCount;
            this.fileSizeInBytes = model.fileSizeInBytes;
            this.lastFileCreationTime = model.lastFileCreationTime;
            this.recordCount = model.recordCount;
            this.spec = model.spec;
            this.storageAction = model.storageAction;
            this.storageActionTimestamp = model.storageActionTimestamp;
            this.storageClass = model.storageClass;
            this.totalBuckets = model.totalBuckets;
            this.updatedAt = model.updatedAt;
            this.updatedBy = model.updatedBy;
        } 

        /**
         * <p>The time when the partition was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1747120676378</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The creator of the partition.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::[accountId]:root</p>
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * <p>Indicates whether the process is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder done(Boolean done) {
            this.done = done;
            return this;
        }

        /**
         * <p>The number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder fileCount(Long fileCount) {
            this.fileCount = fileCount;
            return this;
        }

        /**
         * <p>The file size.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder fileSizeInBytes(Long fileSizeInBytes) {
            this.fileSizeInBytes = fileSizeInBytes;
            return this;
        }

        /**
         * <p>The time when the latest file was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1741701564261</p>
         */
        public Builder lastFileCreationTime(Long lastFileCreationTime) {
            this.lastFileCreationTime = lastFileCreationTime;
            return this;
        }

        /**
         * <p>The number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }

        /**
         * <p>The key-value pairs of the partition values.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;year&quot;:&quot;2025&quot;}</p>
         */
        public Builder spec(java.util.Map<String, ?> spec) {
            this.spec = spec;
            return this;
        }

        /**
         * <p>The status of the storage class conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        public Builder storageAction(String storageAction) {
            this.storageAction = storageAction;
            return this;
        }

        /**
         * <p>The storage class conversion time.</p>
         * 
         * <strong>example:</strong>
         * <p>1758189669915</p>
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
         * <p>The total number of buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalBuckets(Integer totalBuckets) {
            this.totalBuckets = totalBuckets;
            return this;
        }

        /**
         * <p>The time when the partition was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1744970111419</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The user who last updated the partition.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::[accountId]:root</p>
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public Partition build() {
            return new Partition(this);
        } 

    } 

}
