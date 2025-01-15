// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCSnapshotsResponseBody</p>
 */
public class DescribeRCSnapshotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Snapshots")
    private java.util.List<Snapshots> snapshots;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeRCSnapshotsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.snapshots = builder.snapshots;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCSnapshotsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public java.util.List<Snapshots> getSnapshots() {
        return this.snapshots;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<Snapshots> snapshots; 
        private Long totalCount; 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DAC759A-F4F0-5D02-8335-BC458C0CCB94</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of snapshots.</p>
         */
        public Builder snapshots(java.util.List<Snapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRCSnapshotsResponseBody build() {
            return new DescribeRCSnapshotsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCSnapshotsResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Available")
        private Boolean available;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("InstantAccess")
        private Boolean instantAccess;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("SnapshotName")
        private String snapshotName;

        @com.aliyun.core.annotation.NameInMap("SnapshotType")
        private String snapshotType;

        @com.aliyun.core.annotation.NameInMap("SourceDiskId")
        private String sourceDiskId;

        @com.aliyun.core.annotation.NameInMap("SourceDiskSize")
        private Long sourceDiskSize;

        @com.aliyun.core.annotation.NameInMap("SourceDiskType")
        private String sourceDiskType;

        @com.aliyun.core.annotation.NameInMap("SourceStorageType")
        private String sourceStorageType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        private Snapshots(Builder builder) {
            this.available = builder.available;
            this.category = builder.category;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.encrypted = builder.encrypted;
            this.instantAccess = builder.instantAccess;
            this.progress = builder.progress;
            this.regionId = builder.regionId;
            this.snapshotId = builder.snapshotId;
            this.snapshotName = builder.snapshotName;
            this.snapshotType = builder.snapshotType;
            this.sourceDiskId = builder.sourceDiskId;
            this.sourceDiskSize = builder.sourceDiskSize;
            this.sourceDiskType = builder.sourceDiskType;
            this.sourceStorageType = builder.sourceStorageType;
            this.status = builder.status;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public Boolean getAvailable() {
            return this.available;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
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
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return instantAccess
         */
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return sourceDiskId
         */
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        /**
         * @return sourceDiskSize
         */
        public Long getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        /**
         * @return sourceDiskType
         */
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        /**
         * @return sourceStorageType
         */
        public String getSourceStorageType() {
            return this.sourceStorageType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Boolean available; 
            private String category; 
            private String creationTime; 
            private String description; 
            private Boolean encrypted; 
            private Boolean instantAccess; 
            private String progress; 
            private String regionId; 
            private String snapshotId; 
            private String snapshotName; 
            private String snapshotType; 
            private String sourceDiskId; 
            private Long sourceDiskSize; 
            private String sourceDiskType; 
            private String sourceStorageType; 
            private String status; 
            private String usage; 

            /**
             * <p>Indicates whether the snapshot can be shared and used to create or roll back a cloud disk. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * <p>The snapshot type. Valid values:</p>
             * <ul>
             * <li>Standard: standard snapshot</li>
             * <li>Flash: local snapshot This value will be deprecated. The local snapshot feature is replaced with the instant access feature.</li>
             * <li>archive: archived snapshot</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The creation time. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-18T09:37:14Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The snapshot description.</p>
             * 
             * <strong>example:</strong>
             * <p>zd_test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the snapshot was encrypted. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder instantAccess(Boolean instantAccess) {
                this.instantAccess = instantAccess;
                return this;
            }

            /**
             * <p>The progress of the snapshot creation task in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The snapshot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rcds-hc1zg51xobdg4****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The snapshot name.</p>
             * 
             * <strong>example:</strong>
             * <p>s-2ze8klip00xcogcwer76</p>
             */
            public Builder snapshotName(String snapshotName) {
                this.snapshotName = snapshotName;
                return this;
            }

            /**
             * <p>The snapshot type. Valid values:</p>
             * <ul>
             * <li>auto or timer: automatically created snapshot</li>
             * <li>user: manually created snapshot</li>
             * <li>all: all snapshot types</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder snapshotType(String snapshotType) {
                this.snapshotType = snapshotType;
                return this;
            }

            /**
             * <p>The ID of the original disk. This parameter is retained even after the original disk for which the snapshot was created is released.</p>
             * 
             * <strong>example:</strong>
             * <p>rcd-bp67acfmxazb4ph****</p>
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * <p>The storage capacity of the original disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder sourceDiskSize(Long sourceDiskSize) {
                this.sourceDiskSize = sourceDiskSize;
                return this;
            }

            /**
             * <p>The type of the original disk. Valid values:</p>
             * <ul>
             * <li>SYSTEM: system disk</li>
             * <li>DATA: data disk</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>data</p>
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * <p>The type of the source disk.</p>
             * <blockquote>
             * <p> This parameter will be removed in the future. To ensure future compatibility, we recommend that you use other parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>disk</p>
             */
            public Builder sourceStorageType(String sourceStorageType) {
                this.sourceStorageType = sourceStorageType;
                return this;
            }

            /**
             * <p>The snapshot status. Valid values:</p>
             * <ul>
             * <li>progressing: The snapshot is being created.</li>
             * <li>accomplished: The snapshot is created.</li>
             * <li>failed: The snapshot fails to be created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>progressing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether the snapshot is used to create custom images or disks. Valid values:</p>
             * <ul>
             * <li>image: The snapshot is used to create custom images.</li>
             * <li>disk: The snapshot is used to create disks.</li>
             * <li>image_disk: The snapshot is used to create custom images and data disks.</li>
             * <li>none: The snapshot is not used to create custom images or disks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
}
