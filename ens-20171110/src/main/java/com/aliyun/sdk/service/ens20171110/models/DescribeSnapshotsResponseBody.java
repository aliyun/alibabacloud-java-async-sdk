// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    private java.util.List < Snapshots> snapshots;

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
    public java.util.List < Snapshots> getSnapshots() {
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
        private java.util.List < Snapshots> snapshots; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
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
         * The information about the snapshots.
         */
        public Builder snapshots(java.util.List < Snapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        /**
         * The total number of snapshots.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSnapshotsResponseBody build() {
            return new DescribeSnapshotsResponseBody(this);
        } 

    } 

    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("SnapshotName")
        private String snapshotName;

        @com.aliyun.core.annotation.NameInMap("SourceDiskCategory")
        private String sourceDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SourceDiskId")
        private String sourceDiskId;

        @com.aliyun.core.annotation.NameInMap("SourceDiskType")
        private String sourceDiskType;

        @com.aliyun.core.annotation.NameInMap("SourceEnsRegionId")
        private String sourceEnsRegionId;

        @com.aliyun.core.annotation.NameInMap("SourceSnapshotId")
        private String sourceSnapshotId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Snapshots(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ensRegionId = builder.ensRegionId;
            this.size = builder.size;
            this.snapshotId = builder.snapshotId;
            this.snapshotName = builder.snapshotName;
            this.sourceDiskCategory = builder.sourceDiskCategory;
            this.sourceDiskId = builder.sourceDiskId;
            this.sourceDiskType = builder.sourceDiskType;
            this.sourceEnsRegionId = builder.sourceEnsRegionId;
            this.sourceSnapshotId = builder.sourceSnapshotId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
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
         * @return sourceDiskCategory
         */
        public String getSourceDiskCategory() {
            return this.sourceDiskCategory;
        }

        /**
         * @return sourceDiskId
         */
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        /**
         * @return sourceDiskType
         */
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        /**
         * @return sourceEnsRegionId
         */
        public String getSourceEnsRegionId() {
            return this.sourceEnsRegionId;
        }

        /**
         * @return sourceSnapshotId
         */
        public String getSourceSnapshotId() {
            return this.sourceSnapshotId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String ensRegionId; 
            private String size; 
            private String snapshotId; 
            private String snapshotName; 
            private String sourceDiskCategory; 
            private String sourceDiskId; 
            private String sourceDiskType; 
            private String sourceEnsRegionId; 
            private String sourceSnapshotId; 
            private String status; 

            /**
             * The creation time. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * The ID of the edge node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The capacity of the disk. Unit: MiB.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * The ID of the snapshot.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The name of the snapshot. This parameter is returned only if a snapshot name was specified when the snapshot was created.
             */
            public Builder snapshotName(String snapshotName) {
                this.snapshotName = snapshotName;
                return this;
            }

            /**
             * The type of the disk. Valid value:
             * <p>
             * 
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: all-flash disk
             * *   local_hdd: local HDD
             * *   local_ssd: local SSD
             */
            public Builder sourceDiskCategory(String sourceDiskCategory) {
                this.sourceDiskCategory = sourceDiskCategory;
                return this;
            }

            /**
             * The ID of the source disk. This parameter is retained even after the source disk for which the snapshot was created is released.
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * The type of the disk. Valid value:
             * <p>
             * 
             * *   1: system disk
             * *   2: data disk
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * The ID of the source edge node.
             */
            public Builder sourceEnsRegionId(String sourceEnsRegionId) {
                this.sourceEnsRegionId = sourceEnsRegionId;
                return this;
            }

            /**
             * The ID of the source snapshot.
             */
            public Builder sourceSnapshotId(String sourceSnapshotId) {
                this.sourceSnapshotId = sourceSnapshotId;
                return this;
            }

            /**
             * The status of the snapshot. Valid value:
             * <p>
             * 
             * *   creating: The snapshot is being created.
             * *   Available: The snapshot is available.
             * *   deleting: The snapshot is being deleted.
             * *   error: An error occurred on the snapshot.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
}
