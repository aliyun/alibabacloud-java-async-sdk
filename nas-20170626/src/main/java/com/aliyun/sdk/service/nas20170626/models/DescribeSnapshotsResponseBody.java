// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details about snapshots.
         */
        public Builder snapshots(Snapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        /**
         * The total number of snapshots returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSnapshotsResponseBody build() {
            return new DescribeSnapshotsResponseBody(this);
        } 

    } 

    public static class Snapshot extends TeaModel {
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
             * The time when the snapshot was created.
             * <p>
             * 
             * The time follows the [ISO 8601](https://www.iso.org/iso-8601-date-and-time-format.html) standard in UTC. The time is displayed in the `yyyy-MM-ddThh:mmZ` format.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the snapshot.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether the snapshot is encrypted.
             * <p>
             * 
             * Valid values:
             * 
             * *   0: The snapshot is not encrypted.
             * *   1: The snapshot is encrypted.
             */
            public Builder encryptType(Integer encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * The type of the file system.
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * The progress of the snapshot creation. The value of this parameter is expressed as a percentage.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The remaining time that is required to create the snapshot.
             * <p>
             * 
             * Unit: seconds.
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * The retention period of the auto snapshot.
             * <p>
             * 
             * Unit: days.
             * 
             * Valid values:
             * 
             * *   \-1: Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
             * *   1 to 65536: Auto snapshots are retained for the specified days. After the retention period of auto snapshots expires, the auto snapshots are automatically deleted.
             */
            public Builder retentionDays(Integer retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * The snapshot ID.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The snapshot name.
             * <p>
             * 
             * If you specify a name to create a snapshot, the name of the snapshot is returned. Otherwise, no value is returned for this parameter.
             */
            public Builder snapshotName(String snapshotName) {
                this.snapshotName = snapshotName;
                return this;
            }

            /**
             * The snapshot type. Valid values:
             * <p>
             * 
             * *   auto: automatically created snapshots
             * *   user: manually created snapshots
             */
            public Builder snapshotType(String snapshotType) {
                this.snapshotType = snapshotType;
                return this;
            }

            /**
             * The ID of the source file system.
             * <p>
             * 
             * This parameter is retained even if the source file system of the snapshot is deleted.
             */
            public Builder sourceFileSystemId(String sourceFileSystemId) {
                this.sourceFileSystemId = sourceFileSystemId;
                return this;
            }

            /**
             * The capacity of the source file system.
             * <p>
             * 
             * Unit: GiB.
             */
            public Builder sourceFileSystemSize(Long sourceFileSystemSize) {
                this.sourceFileSystemSize = sourceFileSystemSize;
                return this;
            }

            /**
             * The version of the source file system.
             */
            public Builder sourceFileSystemVersion(String sourceFileSystemVersion) {
                this.sourceFileSystemVersion = sourceFileSystemVersion;
                return this;
            }

            /**
             * The status of the snapshot.
             * <p>
             * 
             * Valid values:
             * 
             * *   progressing: The snapshot is being created.
             * *   accomplished: The snapshot is created.
             * *   failed: The snapshot fails to be created.
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
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Snapshot")
        private java.util.List < Snapshot> snapshot;

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
        public java.util.List < Snapshot> getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private java.util.List < Snapshot> snapshot; 

            /**
             * Snapshot.
             */
            public Builder snapshot(java.util.List < Snapshot> snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
}
