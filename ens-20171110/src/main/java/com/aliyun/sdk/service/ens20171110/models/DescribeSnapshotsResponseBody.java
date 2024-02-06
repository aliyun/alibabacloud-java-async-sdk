// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotsResponseBody</p>
 */
public class DescribeSnapshotsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Snapshots")
    private java.util.List < Snapshots> snapshots;

    @NameInMap("TotalCount")
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
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("Size")
        private String size;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("SnapshotName")
        private String snapshotName;

        @NameInMap("SourceDiskCategory")
        private String sourceDiskCategory;

        @NameInMap("SourceDiskId")
        private String sourceDiskId;

        @NameInMap("SourceDiskType")
        private String sourceDiskType;

        @NameInMap("SourceEnsRegionId")
        private String sourceEnsRegionId;

        @NameInMap("SourceSnapshotId")
        private String sourceSnapshotId;

        @NameInMap("Status")
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
