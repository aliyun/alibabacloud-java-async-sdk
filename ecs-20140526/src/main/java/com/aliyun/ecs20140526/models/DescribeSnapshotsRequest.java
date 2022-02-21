// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("Filter")
    private java.util.List < Filter> filter;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("SnapshotLinkId")
    private String snapshotLinkId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DiskId")
    private String diskId;

    @Query
    @NameInMap("SnapshotName")
    private String snapshotName;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Usage")
    private String usage;

    @Query
    @NameInMap("Encrypted")
    private Boolean encrypted;

    @Query
    @NameInMap("KMSKeyId")
    private String KMSKeyId;

    @Query
    @NameInMap("SnapshotType")
    private String snapshotType;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("SnapshotIds")
    private String snapshotIds;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("SourceDiskType")
    private String sourceDiskType;

    private DescribeSnapshotsRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.pageSize = builder.pageSize;
        this.nextToken = builder.nextToken;
        this.maxResults = builder.maxResults;
        this.tag = builder.tag;
        this.snapshotLinkId = builder.snapshotLinkId;
        this.resourceGroupId = builder.resourceGroupId;
        this.pageNumber = builder.pageNumber;
        this.regionId = builder.regionId;
        this.diskId = builder.diskId;
        this.snapshotName = builder.snapshotName;
        this.status = builder.status;
        this.instanceId = builder.instanceId;
        this.usage = builder.usage;
        this.encrypted = builder.encrypted;
        this.KMSKeyId = builder.KMSKeyId;
        this.snapshotType = builder.snapshotType;
        this.category = builder.category;
        this.snapshotIds = builder.snapshotIds;
        this.dryRun = builder.dryRun;
        this.sourceDiskType = builder.sourceDiskType;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return snapshotLinkId
     */
    public String getSnapshotLinkId() {
        return this.snapshotLinkId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return snapshotType
     */
    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return snapshotIds
     */
    public String getSnapshotIds() {
        return this.snapshotIds;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return sourceDiskType
     */
    public String getSourceDiskType() {
        return this.sourceDiskType;
    }

    public static final class Builder extends Request.Builder<DescribeSnapshotsRequest, Builder> {
        private java.util.List < Filter> filter; 
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private Integer pageSize; 
        private String nextToken; 
        private Integer maxResults; 
        private java.util.List < Tag> tag; 
        private String snapshotLinkId; 
        private String resourceGroupId; 
        private Integer pageNumber; 
        private String regionId; 
        private String diskId; 
        private String snapshotName; 
        private String status; 
        private String instanceId; 
        private String usage; 
        private Boolean encrypted; 
        private String KMSKeyId; 
        private String snapshotType; 
        private String category; 
        private String snapshotIds; 
        private Boolean dryRun; 
        private String sourceDiskType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSnapshotsRequest response) {
            super(response);
            this.filter = response.filter;
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.pageSize = response.pageSize;
            this.nextToken = response.nextToken;
            this.maxResults = response.maxResults;
            this.tag = response.tag;
            this.snapshotLinkId = response.snapshotLinkId;
            this.resourceGroupId = response.resourceGroupId;
            this.pageNumber = response.pageNumber;
            this.regionId = response.regionId;
            this.diskId = response.diskId;
            this.snapshotName = response.snapshotName;
            this.status = response.status;
            this.instanceId = response.instanceId;
            this.usage = response.usage;
            this.encrypted = response.encrypted;
            this.KMSKeyId = response.KMSKeyId;
            this.snapshotType = response.snapshotType;
            this.category = response.category;
            this.snapshotIds = response.snapshotIds;
            this.dryRun = response.dryRun;
            this.sourceDiskType = response.sourceDiskType;
        } 

        /**
         * Filter.
         */
        public Builder filter(java.util.List < Filter> filter) {
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
         * Tag list
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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
         * The ID of the resource group. When you use this parameter to filter resources, the number of resources cannot exceed 1,000.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The ID of the region to which the cloud disk belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * Snapshot name.
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
         * -accomplished: create a successful snapshot.
         * -failed: Create failed snapshot.
         * -all: the status of all snapshots.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The specified instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The snapshot is used as create mirror or cloud. Valid values:
         * <p>
         * 
         * -image: use snapshot created a custom image.
         * -disk: use snapshot created cloud.
         * -image_disk: use snapshot created the data plate and self-define the mirror.
         * -none: Not yet.
         */
        public Builder usage(String usage) {
            this.putQueryParameter("Usage", usage);
            this.usage = usage;
            return this;
        }

        /**
         * Whether filter encrypted snapshot. Default value: false
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * Data disk corresponding KMS key ID.
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * Snapshot creation type. Valid values:
         * <p>
         * 
         * -auto: automatic create a snapshot.
         * -user: manually create snapshot.
         * -all (default): all the snapshots create a type.
         */
        public Builder snapshotType(String snapshotType) {
            this.putQueryParameter("SnapshotType", snapshotType);
            this.snapshotType = snapshotType;
            return this;
        }

        /**
         * The type of the snapshot. Valid values:
         * <p>
         * -Standard: normal snapshot
         * -Flash: local snapshot
         * 
         * Originally floor snapshot turnover for snapshot zoom features available. The parameter description as follows:
         * -If you 2020 nian 12 yue 14 ri before used local snapshot. You can use the parameter.
         * -If you 2020 nian 12 yue 14 ri has not been used previously local snapshot. You can"t use the parameter.
         * 
         * <props = "china"> more information, please see [12 yue 14 ri Alibaba Cloud Snapshot service upgrade and add billing item notification](https://help.aliyun.com/noticelist/articleid/1060755542.html). </props>
         * 
         * > This parameter will be deprecated soon. We recommend that you use other parameters to improve compatibility.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * Snapshot identifies the encoding. Values can be by multiple snapshot ID composition a JSON Array, support a maximum of 100 ID,ID between separate them with commas (,).
         */
        public Builder snapshotIds(String snapshotIds) {
            this.putQueryParameter("SnapshotIds", snapshotIds);
            this.snapshotIds = snapshotIds;
            return this;
        }

        /**
         * Specifies whether to PreCheck only this request.
         * <p>
         * 
         * -true: sends a check request without querying the resource status. Check whether the AccessKey is valid, whether the RAM user is authorized, and whether required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, an error code DryRunOperation is returned.
         * -false (default): send normal request, pass inspection rear returns 2XX HTTP status code and directly query the resource situation.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Snapshot source cloud the cloud type. Valid values:
         * <p>
         * 
         * -System: System disk
         * -Data: Data disk
         * 
         * > value not case-sensitive.
         */
        public Builder sourceDiskType(String sourceDiskType) {
            this.putQueryParameter("SourceDiskType", sourceDiskType);
            this.sourceDiskType = sourceDiskType;
            return this;
        }

        @Override
        public DescribeSnapshotsRequest build() {
            return new DescribeSnapshotsRequest(this);
        } 

    } 

    public static class Filter extends TeaModel {
        @NameInMap("Value")
        private String value;

        @NameInMap("Key")
        private String key;

        private Filter(Builder builder) {
            this.value = builder.value;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String value; 
            private String key; 

            /**
             * The filter value when you query resources. When you specify this parameter, you must specify the "Filter.1.Key" parameter in the format of "yyyy-MM-ddTHH:mmZ", in UTC +0 time zone.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The filter key used to query resources. The value must be "CreationStartTime ". Set "Filter.1.Key" and "Filter.1.Value" to query resource information created after a specified time point.
             */
            public Builder key(String key) {
                this.key = key;
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
