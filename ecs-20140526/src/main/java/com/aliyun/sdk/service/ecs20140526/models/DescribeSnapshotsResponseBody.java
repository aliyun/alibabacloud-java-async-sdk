// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

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
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

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
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details about the snapshots.</p>
         */
        public Builder snapshots(Snapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        /**
         * <p>The total number of snapshots returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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
             * <p>The tag key of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link DescribeSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotsResponseBody</p>
     */
    public static class Snapshot extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("InstantAccessRetentionDays")
        private Integer instantAccessRetentionDays;

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

        @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
        private String lastModifiedTime;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RemainTime")
        private Integer remainTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RetentionDays")
        private Integer retentionDays;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("SnapshotLinkId")
        private String snapshotLinkId;

        @com.aliyun.core.annotation.NameInMap("SnapshotName")
        private String snapshotName;

        @com.aliyun.core.annotation.NameInMap("SnapshotSN")
        private String snapshotSN;

        @com.aliyun.core.annotation.NameInMap("SnapshotType")
        private String snapshotType;

        @com.aliyun.core.annotation.NameInMap("SourceDiskId")
        private String sourceDiskId;

        @com.aliyun.core.annotation.NameInMap("SourceDiskSize")
        private String sourceDiskSize;

        @com.aliyun.core.annotation.NameInMap("SourceDiskType")
        private String sourceDiskType;

        @com.aliyun.core.annotation.NameInMap("SourceRegionId")
        private String sourceRegionId;

        @com.aliyun.core.annotation.NameInMap("SourceSnapshotId")
        private String sourceSnapshotId;

        @com.aliyun.core.annotation.NameInMap("SourceStorageType")
        private String sourceStorageType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        private Snapshot(Builder builder) {
            this.available = builder.available;
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
            this.regionId = builder.regionId;
            this.remainTime = builder.remainTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.retentionDays = builder.retentionDays;
            this.snapshotId = builder.snapshotId;
            this.snapshotLinkId = builder.snapshotLinkId;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return snapshotLinkId
         */
        public String getSnapshotLinkId() {
            return this.snapshotLinkId;
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
            private Boolean available; 
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
            private String regionId; 
            private Integer remainTime; 
            private String resourceGroupId; 
            private Integer retentionDays; 
            private String snapshotId; 
            private String snapshotLinkId; 
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
             * <p>Indicates whether the snapshot can be shared and be used to create or roll back a cloud disk. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * <p>The category of the snapshot. Valid values:</p>
             * <ul>
             * <li>Standard: standard snapshot.</li>
             * <li>Flash: local snapshot. This value will be deprecated. The local snapshot feature is replaced by the instant access feature.</li>
             * <li>archive: archive snapshot.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The time when the snapshot was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-08-20T14:52:28Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>testDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the snapshot is encrypted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>Indicates whether the instant access feature is enabled. Valid values:</p>
             * <ul>
             * <li>true: The instant access feature is enabled. By default, the instant access feature is enabled for Enterprise SSDs (ESSDs) and ESSD Entry disks.</li>
             * <li>false: The instant access feature is disabled. The snapshot is a standard snapshot for which the instant access feature is disabled.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is deprecated. By default, new standard snapshots of ESSDs are upgraded to instant access snapshots free of charge without the need for additional configurations. For more information, see <a href="https://help.aliyun.com/document_detail/193667.html">Use the instant access feature</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder instantAccess(Boolean instantAccess) {
                this.instantAccess = instantAccess;
                return this;
            }

            /**
             * <p>Indicates the validity period of the instant access feature. When the validity period ends, the instant access feature is automatically disabled.</p>
             * <p>By default, the value of this parameter is the same as the value of <code>RetentionDays</code>.</p>
             * <blockquote>
             * <p> This parameter is deprecated. By default, new standard snapshots of ESSDs are upgraded to instant access snapshots free of charge without the need for additional configurations. For more information, see <a href="https://help.aliyun.com/document_detail/193667.html">Use the instant access feature</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder instantAccessRetentionDays(Integer instantAccessRetentionDays) {
                this.instantAccessRetentionDays = instantAccessRetentionDays;
                return this;
            }

            /**
             * <p>The ID of the KMS key used for the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * <p>The time when the snapshot was last modified. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-08-25T14:18:09Z</p>
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * <p>The product code of the Alibaba Cloud Marketplace image.</p>
             * 
             * <strong>example:</strong>
             * <p>jxsc000****</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The progress of the snapshot creation task. Unit: percent (%).</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The region ID of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The amount of remaining time required to create the snapshot. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>38</p>
             */
            public Builder remainTime(Integer remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the snapshot belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4p****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The retention period of the automatic snapshot. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder retentionDays(Integer retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * <p>The ID of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp67acfmxazb4p****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The ID of the snapshot chain that is associated with the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>sl-bp1grgphbcc9brb5****</p>
             */
            public Builder snapshotLinkId(String snapshotLinkId) {
                this.snapshotLinkId = snapshotLinkId;
                return this;
            }

            /**
             * <p>The name of the snapshot. This parameter is returned only if a snapshot name was specified when the snapshot was created.</p>
             * 
             * <strong>example:</strong>
             * <p>testSnapshotName</p>
             */
            public Builder snapshotName(String snapshotName) {
                this.snapshotName = snapshotName;
                return this;
            }

            /**
             * <p>The serial number of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>64472-116742336-61976****</p>
             */
            public Builder snapshotSN(String snapshotSN) {
                this.snapshotSN = snapshotSN;
                return this;
            }

            /**
             * <p>The type of the snapshot. Valid values:</p>
             * <ul>
             * <li>auto or timer: automatic snapshot</li>
             * <li>user: manual snapshot</li>
             * <li>all: all snapshot types</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder snapshotType(String snapshotType) {
                this.snapshotType = snapshotType;
                return this;
            }

            /**
             * <p>The ID of the source disk. This parameter is retained even after the source disk is released.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp67acfmxazb4ph****</p>
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * <p>The capacity of the source disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder sourceDiskSize(String sourceDiskSize) {
                this.sourceDiskSize = sourceDiskSize;
                return this;
            }

            /**
             * <p>The type of the source disk. Valid values:</p>
             * <ul>
             * <li>system</li>
             * <li>data</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * <p>The region ID of the source snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder sourceRegionId(String sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
                return this;
            }

            /**
             * <p>The ID of the source snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp67acfmxazb4p****</p>
             */
            public Builder sourceSnapshotId(String sourceSnapshotId) {
                this.sourceSnapshotId = sourceSnapshotId;
                return this;
            }

            /**
             * <p>The category of the source disk.</p>
             * <blockquote>
             * <p> This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
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
             * <p>The status of the snapshot. Valid values:</p>
             * <ul>
             * <li>progressing</li>
             * <li>accomplished</li>
             * <li>failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accomplished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the snapshot.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Indicates whether the snapshot was used to create images or disks. Valid values:</p>
             * <ul>
             * <li>image</li>
             * <li>disk</li>
             * <li>image_disk</li>
             * <li>none</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>image</p>
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
