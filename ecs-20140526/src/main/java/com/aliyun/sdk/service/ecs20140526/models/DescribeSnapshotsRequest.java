// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSnapshotsRequest</p>
 */
public class DescribeSnapshotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List < Filter> filter;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KMSKeyId")
    private String KMSKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotIds")
    private String snapshotIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotLinkId")
    private String snapshotLinkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotName")
    private String snapshotName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotType")
    private String snapshotType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDiskType")
    private String sourceDiskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Usage")
    private String usage;

    private DescribeSnapshotsRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.sourceRegionId = builder.sourceRegionId;
        this.category = builder.category;
        this.diskId = builder.diskId;
        this.dryRun = builder.dryRun;
        this.encrypted = builder.encrypted;
        this.instanceId = builder.instanceId;
        this.KMSKeyId = builder.KMSKeyId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.snapshotIds = builder.snapshotIds;
        this.snapshotLinkId = builder.snapshotLinkId;
        this.snapshotName = builder.snapshotName;
        this.snapshotType = builder.snapshotType;
        this.sourceDiskType = builder.sourceDiskType;
        this.status = builder.status;
        this.tag = builder.tag;
        this.usage = builder.usage;
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
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return snapshotIds
     */
    public String getSnapshotIds() {
        return this.snapshotIds;
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
     * @return snapshotType
     */
    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * @return sourceDiskType
     */
    public String getSourceDiskType() {
        return this.sourceDiskType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    public static final class Builder extends Request.Builder<DescribeSnapshotsRequest, Builder> {
        private java.util.List < Filter> filter; 
        private String sourceRegionId; 
        private String category; 
        private String diskId; 
        private Boolean dryRun; 
        private Boolean encrypted; 
        private String instanceId; 
        private String KMSKeyId; 
        private Integer maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String snapshotIds; 
        private String snapshotLinkId; 
        private String snapshotName; 
        private String snapshotType; 
        private String sourceDiskType; 
        private String status; 
        private java.util.List < Tag> tag; 
        private String usage; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSnapshotsRequest request) {
            super(request);
            this.filter = request.filter;
            this.sourceRegionId = request.sourceRegionId;
            this.category = request.category;
            this.diskId = request.diskId;
            this.dryRun = request.dryRun;
            this.encrypted = request.encrypted;
            this.instanceId = request.instanceId;
            this.KMSKeyId = request.KMSKeyId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.snapshotIds = request.snapshotIds;
            this.snapshotLinkId = request.snapshotLinkId;
            this.snapshotName = request.snapshotName;
            this.snapshotType = request.snapshotType;
            this.sourceDiskType = request.sourceDiskType;
            this.status = request.status;
            this.tag = request.tag;
            this.usage = request.usage;
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
         * <p>The category of the snapshot. Valid values:</p>
         * <ul>
         * <li>Standard: standard snapshot</li>
         * <li>Flash: local snapshot</li>
         * </ul>
         * <p>The local snapshot feature is replaced by the instant access feature. When you specify this parameter, take note of the following items:</p>
         * <ul>
         * <li>If you have used local snapshots before December 14, 2020, you can use this parameter.</li>
         * <li>If you have not used local snapshots before December 14, 2020, you cannot use this parameter.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp67acfmxazb4p****</p>
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li>true: performs only a dry run. The system checks your AccessKey pair, the permissions of the RAM user, and the required parameters. If the request passes the dry run, the DryRunOperation error code is returned. Otherwise, an error message is returned.</li>
         * <li>false (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether the snapshot is encrypted. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used for the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Valid values: 1 to 100.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the disk. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID. If you configure this parameter to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.</p>
         * <blockquote>
         * <p>Resources in the default resource group are displayed in the response regardless of whether you configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The IDs of snapshots. You can specify a JSON array that consists of up to 100 snapshot IDs. Separate the snapshot IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;s-bp67acfmxazb4p****&quot;, &quot;s-bp67acfmxazb5p****&quot;, … &quot;s-bp67acfmxazb6p****&quot;]</p>
         */
        public Builder snapshotIds(String snapshotIds) {
            this.putQueryParameter("SnapshotIds", snapshotIds);
            this.snapshotIds = snapshotIds;
            return this;
        }

        /**
         * <p>The snapshot chain ID. You can specify a JSON array that contains up to 100 snapshot chain IDs. Separate the snapshot chain IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sl-bp1grgphbcc9brb5****&quot;, &quot;sl-bp1c4izumvq0i5bs****&quot;, … &quot;sl-bp1akk7isz866dds****&quot;]</p>
         */
        public Builder snapshotLinkId(String snapshotLinkId) {
            this.putQueryParameter("SnapshotLinkId", snapshotLinkId);
            this.snapshotLinkId = snapshotLinkId;
            return this;
        }

        /**
         * <p>The name of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>testSnapshotName</p>
         */
        public Builder snapshotName(String snapshotName) {
            this.putQueryParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * <p>The type of the snapshot. Valid values:</p>
         * <ul>
         * <li>auto: automatic snapshot</li>
         * <li>user: manual snapshot</li>
         * <li>all (default): all snapshot types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder snapshotType(String snapshotType) {
            this.putQueryParameter("SnapshotType", snapshotType);
            this.snapshotType = snapshotType;
            return this;
        }

        /**
         * <p>The source disk type of the snapshot. Valid values:</p>
         * <ul>
         * <li>system: system disk.</li>
         * <li>data: data disk.</li>
         * </ul>
         * <blockquote>
         * <p> The value of this parameter is case-insensitive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Data</p>
         */
        public Builder sourceDiskType(String sourceDiskType) {
            this.putQueryParameter("SourceDiskType", sourceDiskType);
            this.sourceDiskType = sourceDiskType;
            return this;
        }

        /**
         * <p>The status of the snapshot. Valid values:</p>
         * <ul>
         * <li>progressing: The snapshot is being created.</li>
         * <li>accomplished: The snapshot is created.</li>
         * <li>failed: The snapshot fails to be created.</li>
         * <li>all (default): This value indicates all snapshot states.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags of the snapshot.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Specifies whether the snapshot has been used to create custom images or disks. Valid values:</p>
         * <ul>
         * <li>image: The snapshot has been used to create custom images.</li>
         * <li>disk: The snapshot has been used to create disks.</li>
         * <li>image_disk: The snapshot has been used to create both custom images and data disks.</li>
         * <li>none: The snapshot has not been used to create custom images or disks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder usage(String usage) {
            this.putQueryParameter("Usage", usage);
            this.usage = usage;
            return this;
        }

        @Override
        public DescribeSnapshotsRequest build() {
            return new DescribeSnapshotsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSnapshotsRequest} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotsRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of filter 1 that is used to query resources. Set the value to <code>CreationStartTime</code>. You can specify a time by configuring both <code>Filter.1.Key</code> and <code>Filter.1.Value</code> to query resources that were created after the time.</p>
             * 
             * <strong>example:</strong>
             * <p>CreationStartTime</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of filter 1 that is used to query resources. Set the value to a time. If you configure this parameter, you must also configure <code>Filter.1.Key</code>. Specify the time in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-13T17:00Z</p>
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
    /**
     * 
     * {@link DescribeSnapshotsRequest} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of tag N of the snapshot. Valid values of N: 1 to 20</p>
             * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added are returned. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added are returned. To query more than 1,000 resources with the specified tags, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N of the snapshot. Valid values of N: 1 to 20.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
