// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotsResponseBody</p>
 */
public class DescribeSnapshotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Snapshots")
    private Snapshots snapshots;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSnapshotsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.snapshots = builder.snapshots;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshots
     */
    public Snapshots getSnapshots() {
        return this.snapshots;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Snapshots snapshots; 
        private Integer totalCount; 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details about snapshots.</p>
         */
        public Builder snapshots(Snapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        /**
         * <p>The total number of snapshots returned.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSnapshotsResponseBody build() {
            return new DescribeSnapshotsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotsResponseBody</p>
     */
    public static class Snapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletedTime")
        private String completedTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private Integer encryptType;

        @com.aliyun.core.annotation.NameInMap("FileSystemType")
        private String fileSystemType;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RemainTime")
        private Integer remainTime;

        @com.aliyun.core.annotation.NameInMap("RetentionDays")
        private Integer retentionDays;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("SnapshotName")
        private String snapshotName;

        @com.aliyun.core.annotation.NameInMap("SnapshotType")
        private String snapshotType;

        @com.aliyun.core.annotation.NameInMap("SourceFileSystemId")
        private String sourceFileSystemId;

        @com.aliyun.core.annotation.NameInMap("SourceFileSystemSize")
        private Long sourceFileSystemSize;

        @com.aliyun.core.annotation.NameInMap("SourceFileSystemVersion")
        private String sourceFileSystemVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Snapshot(Builder builder) {
            this.completedTime = builder.completedTime;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.encryptType = builder.encryptType;
            this.fileSystemType = builder.fileSystemType;
            this.progress = builder.progress;
            this.remainTime = builder.remainTime;
            this.retentionDays = builder.retentionDays;
            this.snapshotId = builder.snapshotId;
            this.snapshotName = builder.snapshotName;
            this.snapshotType = builder.snapshotType;
            this.sourceFileSystemId = builder.sourceFileSystemId;
            this.sourceFileSystemSize = builder.sourceFileSystemSize;
            this.sourceFileSystemVersion = builder.sourceFileSystemVersion;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshot create() {
            return builder().build();
        }

        /**
         * @return completedTime
         */
        public String getCompletedTime() {
            return this.completedTime;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encryptType
         */
        public Integer getEncryptType() {
            return this.encryptType;
        }

        /**
         * @return fileSystemType
         */
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return remainTime
         */
        public Integer getRemainTime() {
            return this.remainTime;
        }

        /**
         * @return retentionDays
         */
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return snapshotName
         */
        public String getSnapshotName() {
            return this.snapshotName;
        }

        /**
         * @return snapshotType
         */
        public String getSnapshotType() {
            return this.snapshotType;
        }

        /**
         * @return sourceFileSystemId
         */
        public String getSourceFileSystemId() {
            return this.sourceFileSystemId;
        }

        /**
         * @return sourceFileSystemSize
         */
        public Long getSourceFileSystemSize() {
            return this.sourceFileSystemSize;
        }

        /**
         * @return sourceFileSystemVersion
         */
        public String getSourceFileSystemVersion() {
            return this.sourceFileSystemVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String completedTime; 
            private String createTime; 
            private String description; 
            private Integer encryptType; 
            private String fileSystemType; 
            private String progress; 
            private Integer remainTime; 
            private Integer retentionDays; 
            private String snapshotId; 
            private String snapshotName; 
            private String snapshotType; 
            private String sourceFileSystemId; 
            private Long sourceFileSystemSize; 
            private String sourceFileSystemVersion; 
            private String status; 

            /**
             * CompletedTime.
             */
            public Builder completedTime(String completedTime) {
                this.completedTime = completedTime;
                return this;
            }

            /**
             * <p>The time when the snapshot was created.</p>
             * <p>The time follows the <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> standard in UTC. The time is displayed in the <code>yyyy-MM-ddThh:mmZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-07-24T13:00:52Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the snapshot is encrypted.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0: The snapshot is not encrypted.</li>
             * <li>1: The snapshot is encrypted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder encryptType(Integer encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * <p>The type of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>extreme</p>
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * <p>The progress of the snapshot creation. The value of this parameter is expressed as a percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The remaining time that is required to create the snapshot.</p>
             * <p>Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>38</p>
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * <p>The retention period of the auto snapshot.</p>
             * <p>Unit: days.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>-1: Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.</li>
             * <li>1 to 65536: Auto snapshots are retained for the specified days. After the retention period of auto snapshots expires, the auto snapshots are automatically deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder retentionDays(Integer retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * <p>The snapshot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>s-extreme-snapsho****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The snapshot name.</p>
             * <p>If you specify a name to create a snapshot, the name of the snapshot is returned. Otherwise, no value is returned for this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder snapshotName(String snapshotName) {
                this.snapshotName = snapshotName;
                return this;
            }

            /**
             * <p>The snapshot type. Valid values:</p>
             * <ul>
             * <li>auto: automatically created snapshots</li>
             * <li>user: manually created snapshots</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder snapshotType(String snapshotType) {
                this.snapshotType = snapshotType;
                return this;
            }

            /**
             * <p>The ID of the source file system.</p>
             * <p>This parameter is retained even if the source file system of the snapshot is deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>extreme-012****</p>
             */
            public Builder sourceFileSystemId(String sourceFileSystemId) {
                this.sourceFileSystemId = sourceFileSystemId;
                return this;
            }

            /**
             * <p>The capacity of the source file system.</p>
             * <p>Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder sourceFileSystemSize(Long sourceFileSystemSize) {
                this.sourceFileSystemSize = sourceFileSystemSize;
                return this;
            }

            /**
             * <p>The version of the source file system.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceFileSystemVersion(String sourceFileSystemVersion) {
                this.sourceFileSystemVersion = sourceFileSystemVersion;
                return this;
            }

            /**
             * <p>The status of the snapshot.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>progressing: The snapshot is being created.</li>
             * <li>accomplished: The snapshot is created.</li>
             * <li>failed: The snapshot fails to be created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accomplished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Snapshot build() {
                return new Snapshot(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotsResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Snapshot")
        private java.util.List<Snapshot> snapshot;

        private Snapshots(Builder builder) {
            this.snapshot = builder.snapshot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return snapshot
         */
        public java.util.List<Snapshot> getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private java.util.List<Snapshot> snapshot; 

            /**
             * Snapshot.
             */
            public Builder snapshot(java.util.List<Snapshot> snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
}
