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
 * {@link TableCompactionHistory} extends {@link TeaModel}
 *
 * <p>TableCompactionHistory</p>
 */
public class TableCompactionHistory extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("afterFilesCount")
    private Long afterFilesCount;

    @com.aliyun.core.annotation.NameInMap("afterFilesSize")
    private Long afterFilesSize;

    @com.aliyun.core.annotation.NameInMap("beforeFilesCount")
    private Long beforeFilesCount;

    @com.aliyun.core.annotation.NameInMap("beforeFilesLastCreationTime")
    private Long beforeFilesLastCreationTime;

    @com.aliyun.core.annotation.NameInMap("beforeFilesSize")
    private Long beforeFilesSize;

    @com.aliyun.core.annotation.NameInMap("catalogId")
    private String catalogId;

    @com.aliyun.core.annotation.NameInMap("commitTime")
    private Long commitTime;

    @com.aliyun.core.annotation.NameInMap("snapshotId")
    private Long snapshotId;

    @com.aliyun.core.annotation.NameInMap("tableId")
    private String tableId;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("updatedBy")
    private String updatedBy;

    private TableCompactionHistory(Builder builder) {
        this.afterFilesCount = builder.afterFilesCount;
        this.afterFilesSize = builder.afterFilesSize;
        this.beforeFilesCount = builder.beforeFilesCount;
        this.beforeFilesLastCreationTime = builder.beforeFilesLastCreationTime;
        this.beforeFilesSize = builder.beforeFilesSize;
        this.catalogId = builder.catalogId;
        this.commitTime = builder.commitTime;
        this.snapshotId = builder.snapshotId;
        this.tableId = builder.tableId;
        this.updatedAt = builder.updatedAt;
        this.updatedBy = builder.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableCompactionHistory create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return afterFilesCount
     */
    public Long getAfterFilesCount() {
        return this.afterFilesCount;
    }

    /**
     * @return afterFilesSize
     */
    public Long getAfterFilesSize() {
        return this.afterFilesSize;
    }

    /**
     * @return beforeFilesCount
     */
    public Long getBeforeFilesCount() {
        return this.beforeFilesCount;
    }

    /**
     * @return beforeFilesLastCreationTime
     */
    public Long getBeforeFilesLastCreationTime() {
        return this.beforeFilesLastCreationTime;
    }

    /**
     * @return beforeFilesSize
     */
    public Long getBeforeFilesSize() {
        return this.beforeFilesSize;
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return commitTime
     */
    public Long getCommitTime() {
        return this.commitTime;
    }

    /**
     * @return snapshotId
     */
    public Long getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return tableId
     */
    public String getTableId() {
        return this.tableId;
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
        private Long afterFilesCount; 
        private Long afterFilesSize; 
        private Long beforeFilesCount; 
        private Long beforeFilesLastCreationTime; 
        private Long beforeFilesSize; 
        private String catalogId; 
        private Long commitTime; 
        private Long snapshotId; 
        private String tableId; 
        private Long updatedAt; 
        private String updatedBy; 

        private Builder() {
        } 

        private Builder(TableCompactionHistory model) {
            this.afterFilesCount = model.afterFilesCount;
            this.afterFilesSize = model.afterFilesSize;
            this.beforeFilesCount = model.beforeFilesCount;
            this.beforeFilesLastCreationTime = model.beforeFilesLastCreationTime;
            this.beforeFilesSize = model.beforeFilesSize;
            this.catalogId = model.catalogId;
            this.commitTime = model.commitTime;
            this.snapshotId = model.snapshotId;
            this.tableId = model.tableId;
            this.updatedAt = model.updatedAt;
            this.updatedBy = model.updatedBy;
        } 

        /**
         * <p>The number of files after compaction.</p>
         */
        public Builder afterFilesCount(Long afterFilesCount) {
            this.afterFilesCount = afterFilesCount;
            return this;
        }

        /**
         * <p>The total size of files after compaction.</p>
         */
        public Builder afterFilesSize(Long afterFilesSize) {
            this.afterFilesSize = afterFilesSize;
            return this;
        }

        /**
         * <p>The number of files before compaction.</p>
         */
        public Builder beforeFilesCount(Long beforeFilesCount) {
            this.beforeFilesCount = beforeFilesCount;
            return this;
        }

        /**
         * <p>The creation time of the last file before compaction.</p>
         */
        public Builder beforeFilesLastCreationTime(Long beforeFilesLastCreationTime) {
            this.beforeFilesLastCreationTime = beforeFilesLastCreationTime;
            return this;
        }

        /**
         * <p>The total size of files before compaction.</p>
         */
        public Builder beforeFilesSize(Long beforeFilesSize) {
            this.beforeFilesSize = beforeFilesSize;
            return this;
        }

        /**
         * <p>The catalog ID.</p>
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * <p>The compaction commit time.</p>
         */
        public Builder commitTime(Long commitTime) {
            this.commitTime = commitTime;
            return this;
        }

        /**
         * <p>The snapshot ID.</p>
         */
        public Builder snapshotId(Long snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>The table ID.</p>
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            return this;
        }

        /**
         * <p>The time when the record was last updated.</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The user who updated the record.</p>
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public TableCompactionHistory build() {
            return new TableCompactionHistory(this);
        } 

    } 

}
