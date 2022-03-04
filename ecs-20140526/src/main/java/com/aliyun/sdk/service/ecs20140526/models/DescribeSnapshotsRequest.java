// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSnapshotsRequest</p>
 */
public class DescribeSnapshotsRequest extends Request {
    @Query
    @NameInMap("Filter")
    private java.util.List < Filter> filter;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("SnapshotLinkId")
    private String snapshotLinkId;

    @Query
    @NameInMap("DiskId")
    private String diskId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SnapshotIds")
    private String snapshotIds;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("SnapshotName")
    private String snapshotName;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("SnapshotType")
    private String snapshotType;

    @Query
    @NameInMap("Usage")
    private String usage;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Encrypted")
    private Boolean encrypted;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("SourceDiskType")
    private String sourceDiskType;

    @Query
    @NameInMap("KMSKeyId")
    private String KMSKeyId;

    private DescribeSnapshotsRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.instanceId = builder.instanceId;
        this.snapshotLinkId = builder.snapshotLinkId;
        this.diskId = builder.diskId;
        this.regionId = builder.regionId;
        this.snapshotIds = builder.snapshotIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.nextToken = builder.nextToken;
        this.maxResults = builder.maxResults;
        this.snapshotName = builder.snapshotName;
        this.status = builder.status;
        this.snapshotType = builder.snapshotType;
        this.usage = builder.usage;
        this.resourceGroupId = builder.resourceGroupId;
        this.encrypted = builder.encrypted;
        this.dryRun = builder.dryRun;
        this.tag = builder.tag;
        this.category = builder.category;
        this.sourceDiskType = builder.sourceDiskType;
        this.KMSKeyId = builder.KMSKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public java.util.List < Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return snapshotLinkId
     */
    public String getSnapshotLinkId() {
        return this.snapshotLinkId;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return snapshotIds
     */
    public String getSnapshotIds() {
        return this.snapshotIds;
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return snapshotType
     */
    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return sourceDiskType
     */
    public String getSourceDiskType() {
        return this.sourceDiskType;
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public static final class Builder extends Request.Builder<DescribeSnapshotsRequest, Builder> {
        private java.util.List < Filter> filter; 
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String instanceId; 
        private String snapshotLinkId; 
        private String diskId; 
        private String regionId; 
        private String snapshotIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String nextToken; 
        private Integer maxResults; 
        private String snapshotName; 
        private String status; 
        private String snapshotType; 
        private String usage; 
        private String resourceGroupId; 
        private Boolean encrypted; 
        private Boolean dryRun; 
        private java.util.List < Tag> tag; 
        private String category; 
        private String sourceDiskType; 
        private String KMSKeyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSnapshotsRequest request) {
            super(request);
            this.filter = request.filter;
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.instanceId = request.instanceId;
            this.snapshotLinkId = request.snapshotLinkId;
            this.diskId = request.diskId;
            this.regionId = request.regionId;
            this.snapshotIds = request.snapshotIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.nextToken = request.nextToken;
            this.maxResults = request.maxResults;
            this.snapshotName = request.snapshotName;
            this.status = request.status;
            this.snapshotType = request.snapshotType;
            this.usage = request.usage;
            this.resourceGroupId = request.resourceGroupId;
            this.encrypted = request.encrypted;
            this.dryRun = request.dryRun;
            this.tag = request.tag;
            this.category = request.category;
            this.sourceDiskType = request.sourceDiskType;
            this.KMSKeyId = request.KMSKeyId;
        } 

        /**
         * Filter.
         */
        public Builder filter(java.util.List < Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the snapshot chain.
         */
        public Builder snapshotLinkId(String snapshotLinkId) {
            this.putQueryParameter("SnapshotLinkId", snapshotLinkId);
            this.snapshotLinkId = snapshotLinkId;
            return this;
        }

        /**
         * The ID of the cloud disk device.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The ID of the region to which the cloud disk belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the snapshot. The value can be a JSON Array consisting of multiple snapshot IDs. A maximum of 100 IDs can be entered. Separate IDs with commas (,).
         */
        public Builder snapshotIds(String snapshotIds) {
            this.putQueryParameter("SnapshotIds", snapshotIds);
            this.snapshotIds = snapshotIds;
            return this;
        }

        /**
         * The page number of the snapshot list. Start value: 1
         * <p>
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum Value: 100
         * <p>
         * 
         * Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The start flag of the query. This parameter is obtained from the last request.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum Value: 100
         * <p>
         * 
         * Default value: 10
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The name of the snapshot.
         */
        public Builder snapshotName(String snapshotName) {
            this.putQueryParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * The status of the snapshot. Valid values:
         * <p>
         * 
         * -progressing: the snapshot is being created.
         * -accomplished: the snapshot is created.
         * -failed: the snapshot failed to be created.
         * -all: the status of all snapshots.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The type of the snapshot. Valid values:
         * <p>
         * 
         * -auto: automatically creates snapshots.
         * -user: manually create a snapshot.
         * -all (default): all snapshot creation types.
         */
        public Builder snapshotType(String snapshotType) {
            this.putQueryParameter("SnapshotType", snapshotType);
            this.snapshotType = snapshotType;
            return this;
        }

        /**
         * Specifies whether a snapshot is used to create an image or cloud disk. Valid values:
         * <p>
         * 
         * -image: a custom image is created using a snapshot.
         * -disk: Creates a disk from a snapshot.
         * -image_disk: creates a data disk and a custom image from a snapshot.
         * -none.
         */
        public Builder usage(String usage) {
            this.putQueryParameter("Usage", usage);
            this.usage = usage;
            return this;
        }

        /**
         * The ID of the resource group. When you use this parameter to filter resources, the number of resources cannot exceed 1,000.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Specifies whether to filter encrypted snapshots. Default value: false
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * Specifies whether to PreCheck only this request.
         * <p>
         * 
         * -true: sends a check request without querying the resource status. Check whether the AccessKey is valid, whether the RAM user is authorized, and whether required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, an error code DryRunOperation is returned.
         * -false (default): a normal request is sent. After the request passes the check, the status code 2XX is returned and the resource status is directly queried.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Tag list
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The type of the snapshot. Valid values:
         * <p>
         * -Standard: normal snapshot
         * -Flash: local snapshot
         * 
         * The original snapshot is replaced with the snapshot extreme available feature. This parameter is described as follows:
         * -If you have used a local snapshot before December 14, 2020. You can use this parameter normally.
         * -If you have not used a local snapshot before December 14, 2020. You cannot use this parameter.
         * 
         * <props = "china"> for more information, see [Alibaba Cloud Snapshot service upgrade and new billing items notice on December 14](https://help.aliyun.com/noticelist/articleid/1060755542.html). </props>
         * 
         * > This parameter will be deprecated soon. We recommend that you use other parameters to improve compatibility.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The disk type of the snapshot source disk. Valid values:
         * <p>
         * 
         * -System: System disk
         * -Data: Data disk
         * 
         * > the value is case insensitive.
         */
        public Builder sourceDiskType(String sourceDiskType) {
            this.putQueryParameter("SourceDiskType", sourceDiskType);
            this.sourceDiskType = sourceDiskType;
            return this;
        }

        /**
         * The KMS key ID of the data disk.
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        @Override
        public DescribeSnapshotsRequest build() {
            return new DescribeSnapshotsRequest(this);
        } 

    } 

    public static class Filter extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Filter(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The filter key used to query resources. The value must be "CreationStartTime ". Set "Filter.1.Key" and "Filter.1.Value" to query resource information created after a specified time point.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The filter value when you query resources. When you specify this parameter, you must specify the "Filter.1.Key" parameter in the format of "yyyy-MM-ddTHH:mmZ", in UTC +0 time zone.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 资源的标签键。
             * <p>
             * 
             * >为提高兼容性，建议您尽量使用Tag.N.Key参数。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 快照的标签值。N的取值范围：1~20
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
