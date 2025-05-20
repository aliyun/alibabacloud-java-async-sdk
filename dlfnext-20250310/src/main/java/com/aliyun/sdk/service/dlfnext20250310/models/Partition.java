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
            this.updatedAt = model.updatedAt;
            this.updatedBy = model.updatedBy;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * createdBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * done.
         */
        public Builder done(Boolean done) {
            this.done = done;
            return this;
        }

        /**
         * fileCount.
         */
        public Builder fileCount(Long fileCount) {
            this.fileCount = fileCount;
            return this;
        }

        /**
         * fileSizeInBytes.
         */
        public Builder fileSizeInBytes(Long fileSizeInBytes) {
            this.fileSizeInBytes = fileSizeInBytes;
            return this;
        }

        /**
         * lastFileCreationTime.
         */
        public Builder lastFileCreationTime(Long lastFileCreationTime) {
            this.lastFileCreationTime = lastFileCreationTime;
            return this;
        }

        /**
         * recordCount.
         */
        public Builder recordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }

        /**
         * spec.
         */
        public Builder spec(java.util.Map<String, ?> spec) {
            this.spec = spec;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * updatedBy.
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
