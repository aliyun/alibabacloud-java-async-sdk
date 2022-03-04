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

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Snapshots")
    private Snapshots snapshots;

    private DescribeSnapshotsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.snapshots = builder.snapshots;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return snapshots
     */
    public Snapshots getSnapshots() {
        return this.snapshots;
    }

    public static final class Builder {
        private String nextToken; 
        private Integer pageSize; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalCount; 
        private Snapshots snapshots; 

        /**
         * The start flag of the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The page number of the snapshot list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * The total number of snapshots.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A collection of snapshot details.
         */
        public Builder snapshots(Snapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        public DescribeSnapshotsResponseBody build() {
            return new DescribeSnapshotsResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TagKey")
        private String tagKey;

        private Tag(Builder builder) {
            this.tagValue = builder.tagValue;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private String tagValue; 
            private String tagKey; 

            /**
             * The tag value of the snapshot.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The tag key of the snapshot.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
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
        @NameInMap("Status")
        private String status;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("InstantAccess")
        private Boolean instantAccess;

        @NameInMap("RemainTime")
        private Integer remainTime;

        @NameInMap("SourceDiskSize")
        private String sourceDiskSize;

        @NameInMap("RetentionDays")
        private Integer retentionDays;

        @NameInMap("SourceDiskType")
        private String sourceDiskType;

        @NameInMap("SourceStorageType")
        private String sourceStorageType;

        @NameInMap("Usage")
        private String usage;

        @NameInMap("LastModifiedTime")
        private String lastModifiedTime;

        @NameInMap("Encrypted")
        private Boolean encrypted;

        @NameInMap("SnapshotType")
        private String snapshotType;

        @NameInMap("SourceDiskId")
        private String sourceDiskId;

        @NameInMap("SnapshotName")
        private String snapshotName;

        @NameInMap("InstantAccessRetentionDays")
        private Integer instantAccessRetentionDays;

        @NameInMap("Description")
        private String description;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Category")
        private String category;

        @NameInMap("KMSKeyId")
        private String KMSKeyId;

        @NameInMap("SnapshotSN")
        private String snapshotSN;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("SourceSnapshotId")
        private String sourceSnapshotId;

        @NameInMap("SourceRegionId")
        private String sourceRegionId;

        @NameInMap("Tags")
        private Tags tags;

        private Snapshot(Builder builder) {
            this.status = builder.status;
            this.creationTime = builder.creationTime;
            this.progress = builder.progress;
            this.instantAccess = builder.instantAccess;
            this.remainTime = builder.remainTime;
            this.sourceDiskSize = builder.sourceDiskSize;
            this.retentionDays = builder.retentionDays;
            this.sourceDiskType = builder.sourceDiskType;
            this.sourceStorageType = builder.sourceStorageType;
            this.usage = builder.usage;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.encrypted = builder.encrypted;
            this.snapshotType = builder.snapshotType;
            this.sourceDiskId = builder.sourceDiskId;
            this.snapshotName = builder.snapshotName;
            this.instantAccessRetentionDays = builder.instantAccessRetentionDays;
            this.description = builder.description;
            this.snapshotId = builder.snapshotId;
            this.resourceGroupId = builder.resourceGroupId;
            this.category = builder.category;
            this.KMSKeyId = builder.KMSKeyId;
            this.snapshotSN = builder.snapshotSN;
            this.productCode = builder.productCode;
            this.sourceSnapshotId = builder.sourceSnapshotId;
            this.sourceRegionId = builder.sourceRegionId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshot create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return instantAccess
         */
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        /**
         * @return remainTime
         */
        public Integer getRemainTime() {
            return this.remainTime;
        }

        /**
         * @return sourceDiskSize
         */
        public String getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        /**
         * @return retentionDays
         */
        public Integer getRetentionDays() {
            return this.retentionDays;
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
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        /**
         * @return lastModifiedTime
         */
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
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
         * @return snapshotName
         */
        public String getSnapshotName() {
            return this.snapshotName;
        }

        /**
         * @return instantAccessRetentionDays
         */
        public Integer getInstantAccessRetentionDays() {
            return this.instantAccessRetentionDays;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        /**
         * @return snapshotSN
         */
        public String getSnapshotSN() {
            return this.snapshotSN;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return sourceSnapshotId
         */
        public String getSourceSnapshotId() {
            return this.sourceSnapshotId;
        }

        /**
         * @return sourceRegionId
         */
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String status; 
            private String creationTime; 
            private String progress; 
            private Boolean instantAccess; 
            private Integer remainTime; 
            private String sourceDiskSize; 
            private Integer retentionDays; 
            private String sourceDiskType; 
            private String sourceStorageType; 
            private String usage; 
            private String lastModifiedTime; 
            private Boolean encrypted; 
            private String snapshotType; 
            private String sourceDiskId; 
            private String snapshotName; 
            private Integer instantAccessRetentionDays; 
            private String description; 
            private String snapshotId; 
            private String resourceGroupId; 
            private String category; 
            private String KMSKeyId; 
            private String snapshotSN; 
            private String productCode; 
            private String sourceSnapshotId; 
            private String sourceRegionId; 
            private Tags tags; 

            /**
             * The status of the snapshot. Possible values:
             * <p>
             * 
             * -progressing
             * -accomplished
             * -failed
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The creation time. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The progress of snapshot creation. Unit: percentage.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Indicates whether the snapshot extreme availability feature is enabled. Possible values:
             * <p>
             * 
             * -true: enabled. Only ESSDS support this feature.
             * -false: disabled. That is, a snapshot is a normal snapshot that is not enabled.
             */
            public Builder instantAccess(Boolean instantAccess) {
                this.instantAccess = instantAccess;
                return this;
            }

            /**
             * The remaining completion time of the snapshot being created. Unit: seconds.
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * The capacity of the source disk. Unit: GiB.
             */
            public Builder sourceDiskSize(String sourceDiskSize) {
                this.sourceDiskSize = sourceDiskSize;
                return this;
            }

            /**
             * The number of days that automatic snapshots are retained.
             */
            public Builder retentionDays(Integer retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * The attributes of the source disk. Possible values:
             * <p>
             * 
             * -system
             * -data
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * The type of the disk.
             * <p>
             * 
             * > This parameter will be deprecated soon. We recommend that you use other parameters to improve compatibility.
             */
            public Builder sourceStorageType(String sourceStorageType) {
                this.sourceStorageType = sourceStorageType;
                return this;
            }

            /**
             * Specifies whether a snapshot is used to create an image or cloud disk. Possible values:
             * <p>
             * 
             * -image
             * -disk
             * -image_disk
             * -none
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            /**
             * The last time when the snapshot was changed. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * Specifies whether the snapshot is encrypted.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The type of the snapshot. Possible values:
             * <p>
             * 
             * -auto or timer: automatically creates snapshots.
             * -user: manually create a snapshot.
             * -all: all snapshot creation types.
             */
            public Builder snapshotType(String snapshotType) {
                this.snapshotType = snapshotType;
                return this;
            }

            /**
             * The ID of the source disk. This field is retained if the source disk of the snapshot is released.
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * The name of the snapshot. If the snapshot display name is specified during creation, the system returns.
             */
            public Builder snapshotName(String snapshotName) {
                this.snapshotName = snapshotName;
                return this;
            }

            /**
             * Specifies the retention period of the snapshot extreme availability feature. After the retention period expires, the snapshot extreme availability feature is automatically disabled.
             * <p>
             * 
             * The default value is the same as the value of the "RetentionDays" parameter.
             */
            public Builder instantAccessRetentionDays(Integer instantAccessRetentionDays) {
                this.instantAccessRetentionDays = instantAccessRetentionDays;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The type of the snapshot.
             * <p>
             * 
             * > This parameter will be deprecated soon. We recommend that you use the "InstantAccess" parameter to improve compatibility ".
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The KMS key ID of the data disk.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * The sequence number of the snapshot.
             */
            public Builder snapshotSN(String snapshotSN) {
                this.snapshotSN = snapshotSN;
                return this;
            }

            /**
             * The product ID inherited from the marketplace.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * SOURCE snapshot
             */
            public Builder sourceSnapshotId(String sourceSnapshotId) {
                this.sourceSnapshotId = sourceSnapshotId;
                return this;
            }

            /**
             * SOURCE snapshot region
             */
            public Builder sourceRegionId(String sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
                return this;
            }

            /**
             * The tag.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
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
