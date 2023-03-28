// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Snapshots")
    private Snapshots snapshots;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSnapshotsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Snapshots snapshots; 
        private Integer totalCount; 

        /**
         * The token used to start the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Details about the snapshots.
         */
        public Builder snapshots(Snapshots snapshots) {
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

    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The tag key of the snapshot.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value of the snapshot.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Snapshot extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Encrypted")
        private Boolean encrypted;

        @NameInMap("InstantAccess")
        private Boolean instantAccess;

        @NameInMap("InstantAccessRetentionDays")
        private Integer instantAccessRetentionDays;

        @NameInMap("KMSKeyId")
        private String KMSKeyId;

        @NameInMap("LastModifiedTime")
        private String lastModifiedTime;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("RemainTime")
        private Integer remainTime;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("RetentionDays")
        private Integer retentionDays;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("SnapshotName")
        private String snapshotName;

        @NameInMap("SnapshotSN")
        private String snapshotSN;

        @NameInMap("SnapshotType")
        private String snapshotType;

        @NameInMap("SourceDiskId")
        private String sourceDiskId;

        @NameInMap("SourceDiskSize")
        private String sourceDiskSize;

        @NameInMap("SourceDiskType")
        private String sourceDiskType;

        @NameInMap("SourceRegionId")
        private String sourceRegionId;

        @NameInMap("SourceSnapshotId")
        private String sourceSnapshotId;

        @NameInMap("SourceStorageType")
        private String sourceStorageType;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Usage")
        private String usage;

        private Snapshot(Builder builder) {
            this.category = builder.category;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.encrypted = builder.encrypted;
            this.instantAccess = builder.instantAccess;
            this.instantAccessRetentionDays = builder.instantAccessRetentionDays;
            this.KMSKeyId = builder.KMSKeyId;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.productCode = builder.productCode;
            this.progress = builder.progress;
            this.remainTime = builder.remainTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.retentionDays = builder.retentionDays;
            this.snapshotId = builder.snapshotId;
            this.snapshotName = builder.snapshotName;
            this.snapshotSN = builder.snapshotSN;
            this.snapshotType = builder.snapshotType;
            this.sourceDiskId = builder.sourceDiskId;
            this.sourceDiskSize = builder.sourceDiskSize;
            this.sourceDiskType = builder.sourceDiskType;
            this.sourceRegionId = builder.sourceRegionId;
            this.sourceSnapshotId = builder.sourceSnapshotId;
            this.sourceStorageType = builder.sourceStorageType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshot create() {
            return builder().build();
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
         * @return instantAccessRetentionDays
         */
        public Integer getInstantAccessRetentionDays() {
            return this.instantAccessRetentionDays;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        /**
         * @return lastModifiedTime
         */
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
         * @return snapshotSN
         */
        public String getSnapshotSN() {
            return this.snapshotSN;
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
        public String getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        /**
         * @return sourceDiskType
         */
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        /**
         * @return sourceRegionId
         */
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        /**
         * @return sourceSnapshotId
         */
        public String getSourceSnapshotId() {
            return this.sourceSnapshotId;
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
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String category; 
            private String creationTime; 
            private String description; 
            private Boolean encrypted; 
            private Boolean instantAccess; 
            private Integer instantAccessRetentionDays; 
            private String KMSKeyId; 
            private String lastModifiedTime; 
            private String productCode; 
            private String progress; 
            private Integer remainTime; 
            private String resourceGroupId; 
            private Integer retentionDays; 
            private String snapshotId; 
            private String snapshotName; 
            private String snapshotSN; 
            private String snapshotType; 
            private String sourceDiskId; 
            private String sourceDiskSize; 
            private String sourceDiskType; 
            private String sourceRegionId; 
            private String sourceSnapshotId; 
            private String sourceStorageType; 
            private String status; 
            private Tags tags; 
            private String usage; 

            /**
             * The category of the snapshot.
             * <p>
             * 
             * >  This parameter will be removed in the future. We recommend that you use the `InstantAccess` parameter to ensure future compatibility.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The time when the snapshot was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
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
             * Indicates whether the snapshot was encrypted.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * Indicates whether the instant access feature was enabled. Valid values:
             * <p>
             * 
             * *   true: The instant access feature was enabled. This feature can be enabled only for enhanced SSDs (ESSDs).
             * *   false: The instant access feature was disabled. The snapshot is a normal snapshot for which the instant access feature was disabled.
             */
            public Builder instantAccess(Boolean instantAccess) {
                this.instantAccess = instantAccess;
                return this;
            }

            /**
             * The validity period of the instant access feature. The instant access feature is automatically disabled when the specified period expires.
             * <p>
             * 
             * By default, the value of this parameter is the same as that of `RetentionDays`.
             */
            public Builder instantAccessRetentionDays(Integer instantAccessRetentionDays) {
                this.instantAccessRetentionDays = instantAccessRetentionDays;
                return this;
            }

            /**
             * The ID of the KMS key used for the data disk.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * The time when the snapshot was last changed. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * The product number inherited from Alibaba Cloud Marketplace.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The progress of the snapshot creation task. Unit: percent (%).
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The remaining time required to create the snapshot. Unit: seconds.
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The retention period of the automatic snapshot. Unit: days.
             */
            public Builder retentionDays(Integer retentionDays) {
                this.retentionDays = retentionDays;
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
             * The serial number of the snapshot.
             */
            public Builder snapshotSN(String snapshotSN) {
                this.snapshotSN = snapshotSN;
                return this;
            }

            /**
             * The type of snapshot. Valid values:
             * <p>
             * 
             * *   auto or timer: automatic snapshot
             * *   user: manual snapshot
             * *   all: all snapshot types
             */
            public Builder snapshotType(String snapshotType) {
                this.snapshotType = snapshotType;
                return this;
            }

            /**
             * The ID of the source disk. This parameter is retained even after the source disk is released.
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * The capacity of the source disk for which the snapshot was created. Unit: GiB.
             */
            public Builder sourceDiskSize(String sourceDiskSize) {
                this.sourceDiskSize = sourceDiskSize;
                return this;
            }

            /**
             * The type of the source disk. Valid values:
             * <p>
             * 
             * *   system
             * *   data
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * The region ID of the source snapshot.
             */
            public Builder sourceRegionId(String sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
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
             * The type of the source disk.
             * <p>
             * 
             * > This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
             */
            public Builder sourceStorageType(String sourceStorageType) {
                this.sourceStorageType = sourceStorageType;
                return this;
            }

            /**
             * The state of the snapshot. Valid values:
             * <p>
             * 
             * *   progressing
             * *   accomplished
             * *   failed
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags of the snapshot.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Indicates whether the snapshot has been used to create custom images or disks. Valid values:
             * <p>
             * 
             * *   image
             * *   disk
             * *   image_disk
             * *   none
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public Snapshot build() {
                return new Snapshot(this);
            } 

        } 

    }
    public static class Snapshots extends TeaModel {
        @NameInMap("Snapshot")
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
