// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeImagesRequest</p>
 */
public class DescribeImagesRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ActionType")
    private String actionType;

    @Query
    @NameInMap("Architecture")
    private String architecture;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Filter")
    private java.util.List < Filter> filter;

    @Query
    @NameInMap("ImageFamily")
    private String imageFamily;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @Query
    @NameInMap("ImageOwnerId")
    private Long imageOwnerId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("IsPublic")
    private Boolean isPublic;

    @Query
    @NameInMap("IsSupportCloudinit")
    private Boolean isSupportCloudinit;

    @Query
    @NameInMap("IsSupportIoOptimized")
    private Boolean isSupportIoOptimized;

    @Query
    @NameInMap("OSType")
    private String OSType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ShowExpired")
    private Boolean showExpired;

    @Query
    @NameInMap("SnapshotId")
    private String snapshotId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Usage")
    private String usage;

    private DescribeImagesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.actionType = builder.actionType;
        this.architecture = builder.architecture;
        this.dryRun = builder.dryRun;
        this.filter = builder.filter;
        this.imageFamily = builder.imageFamily;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.imageOwnerId = builder.imageOwnerId;
        this.instanceType = builder.instanceType;
        this.isPublic = builder.isPublic;
        this.isSupportCloudinit = builder.isSupportCloudinit;
        this.isSupportIoOptimized = builder.isSupportIoOptimized;
        this.OSType = builder.OSType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.showExpired = builder.showExpired;
        this.snapshotId = builder.snapshotId;
        this.status = builder.status;
        this.tag = builder.tag;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return filter
     */
    public java.util.List < Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return imageFamily
     */
    public String getImageFamily() {
        return this.imageFamily;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return imageOwnerId
     */
    public Long getImageOwnerId() {
        return this.imageOwnerId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    /**
     * @return isSupportCloudinit
     */
    public Boolean getIsSupportCloudinit() {
        return this.isSupportCloudinit;
    }

    /**
     * @return isSupportIoOptimized
     */
    public Boolean getIsSupportIoOptimized() {
        return this.isSupportIoOptimized;
    }

    /**
     * @return OSType
     */
    public String getOSType() {
        return this.OSType;
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
     * @return showExpired
     */
    public Boolean getShowExpired() {
        return this.showExpired;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
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

    public static final class Builder extends Request.Builder<DescribeImagesRequest, Builder> {
        private String sourceRegionId; 
        private String actionType; 
        private String architecture; 
        private Boolean dryRun; 
        private java.util.List < Filter> filter; 
        private String imageFamily; 
        private String imageId; 
        private String imageName; 
        private String imageOwnerAlias; 
        private Long imageOwnerId; 
        private String instanceType; 
        private Boolean isPublic; 
        private Boolean isSupportCloudinit; 
        private Boolean isSupportIoOptimized; 
        private String OSType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean showExpired; 
        private String snapshotId; 
        private String status; 
        private java.util.List < Tag> tag; 
        private String usage; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImagesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.actionType = request.actionType;
            this.architecture = request.architecture;
            this.dryRun = request.dryRun;
            this.filter = request.filter;
            this.imageFamily = request.imageFamily;
            this.imageId = request.imageId;
            this.imageName = request.imageName;
            this.imageOwnerAlias = request.imageOwnerAlias;
            this.imageOwnerId = request.imageOwnerId;
            this.instanceType = request.instanceType;
            this.isPublic = request.isPublic;
            this.isSupportCloudinit = request.isSupportCloudinit;
            this.isSupportIoOptimized = request.isSupportIoOptimized;
            this.OSType = request.OSType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.showExpired = request.showExpired;
            this.snapshotId = request.snapshotId;
            this.status = request.status;
            this.tag = request.tag;
            this.usage = request.usage;
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
         * The scenario in which to use the image. Default value: CreateEcs. Valid values:
         * <p>
         * 
         * *   CreateEcs: creates an instance.
         * *   ChangeOS: replaces the system disk or operating system.
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * The architecture of the image. Valid values:
         * <p>
         * 
         * *   i386
         * *   x86\_64
         * *   arm64
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * Specifies whether to perform a dry run.
         * <p>
         * 
         * *   true: performs a dry run. The system checks your AccessKey pair, the permissions of the RAM user, and the required parameters. If the request fails the dry run, the corresponding error message is returned. If the check passes the dry run, the DryRunOperation error code is returned.
         * *   false: performs a dry run and sends the request. If the request passes the dry run, a 2XX HTTP status code is returned and the operation is performed.
         * 
         * Default value: false.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The list of filter conditions used to query resources.
         */
        public Builder filter(java.util.List < Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * The name of the image family. You can specify this parameter to query images of the specified image family.
         * <p>
         * 
         * This parameter is empty by default.
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * The IDs of the images.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The name of the image.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The source of the image. Valid values:
         * <p>
         * 
         * *   system: public images provided by Alibaba Cloud. These are not available in Alibaba Cloud Marketplace.
         * 
         * *   self: custom images that you create.
         * 
         * *   others: shared images from other Alibaba Cloud accounts and community images that image providers released on the image platform of Alibaba Cloud Community. When you call this operation, take note of the following items:
         * 
         *     *   To query community images, you must set the IsPublic parameter to true.
         *     *   To query shared images, you must set the IsPublic parameter to false or leave the IsPublic parameter empty.
         * 
         * *   marketplace: an image maintained by Alibaba Cloud or Independent Software Vendors (ISVs) in the Alibaba Cloud Marketplace. These images need to be purchased together with an Elastic Compute Service (ECS) instance. Before you use Alibaba Cloud Marketplace images, take note of the billing details of the images.
         * 
         * This parameter is empty by default.
         * 
         * > This parameter is empty by default, which indicates that public images provided by Alibaba Cloud, custom images in your repository, shared images from other Alibaba Cloud accounts, and community images published by other Alibaba Cloud accounts are queried.
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the image belongs. This parameter is valid only when you query shared images or community images.
         */
        public Builder imageOwnerId(Long imageOwnerId) {
            this.putQueryParameter("ImageOwnerId", imageOwnerId);
            this.imageOwnerId = imageOwnerId;
            return this;
        }

        /**
         * The instance type for which the image can be used.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Indicates whether to query published community images. Valid values:
         * <p>
         * 
         * *   true: queries published community images. When you set this parameter to true, you must set the ImageOwnerAlias parameter to others.
         * *   false: queries image types other than community images. The specific image types to be queried are determined by the ImageOwnerAlias parameter.
         * 
         * Default value: false.
         */
        public Builder isPublic(Boolean isPublic) {
            this.putQueryParameter("IsPublic", isPublic);
            this.isPublic = isPublic;
            return this;
        }

        /**
         * Specifies whether the image supports cloud-init.
         */
        public Builder isSupportCloudinit(Boolean isSupportCloudinit) {
            this.putQueryParameter("IsSupportCloudinit", isSupportCloudinit);
            this.isSupportCloudinit = isSupportCloudinit;
            return this;
        }

        /**
         * Specifies whether the image can be used on I/O optimized instances.
         */
        public Builder isSupportIoOptimized(Boolean isSupportIoOptimized) {
            this.putQueryParameter("IsSupportIoOptimized", isSupportIoOptimized);
            this.isSupportIoOptimized = isSupportIoOptimized;
            return this;
        }

        /**
         * The operating system type of the image. Valid values:
         * <p>
         * 
         * *   windows
         * *   linux
         */
        public Builder OSType(String OSType) {
            this.putQueryParameter("OSType", OSType);
            this.OSType = OSType;
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
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1.
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return per page.
         * <p>
         * 
         * Maximum value: 100.
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the image. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the custom image belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group are returned.
         * <p>
         * 
         * > Resources in the default resource group are displayed in the response regardless of how this parameter is set.
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
         * Specifies whether the subscription image has expired.
         * <p>
         * 
         * > This parameter will be removed in the future. To ensure future compatibility, we recommend that you use other parameters.
         */
        public Builder showExpired(Boolean showExpired) {
            this.putQueryParameter("ShowExpired", showExpired);
            this.showExpired = showExpired;
            return this;
        }

        /**
         * The ID of the snapshot used to create the custom image.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The state of the image. If you do not specify this parameter, only images in the Available state are returned. Valid values:
         * <p>
         * 
         * *   Creating: The image is being created.
         * *   Waiting: The image is waiting to be processed.
         * *   Available: The image is available. This is the default value.
         * *   UnAvailable: The image is unavailable.
         * *   CreateFailed: The image cannot be created.
         * *   Deprecated: The image is discontinued.
         * 
         * Default value: Available. You can specify multiple values for this parameter. Separate the values with commas (,).
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The list of tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Specifies whether the image is running on an ECS instance. Valid values:
         * <p>
         * 
         * *   instance: The image is in use and running on an ECS instance.
         * *   none: The image is not in use.
         */
        public Builder usage(String usage) {
            this.putQueryParameter("Usage", usage);
            this.usage = usage;
            return this;
        }

        @Override
        public DescribeImagesRequest build() {
            return new DescribeImagesRequest(this);
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
             * The key of the filter that is used to query resources. Valid values:
             * <p>
             * 
             * *   If you set this parameter to `CreationStartTime`, you can query the resources that were created after the point in time specified by the `Filter.N.Value` parameter.
             * *   If you set this parameter to `CreationEndTime`, you can query the resources that were created before the point in time specified by the `Filter.N.Value` parameter.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the filter that is used to query resources. When you specify this parameter, you must also specify the `Filter.N.Key` parameter. Specify the time in the `yyyy-MM-ddTHH:mmZ` format. The time must be in UTC.
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
        @NameInMap("Key")
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
             * The tag key of the image. Valid values of N: 1 to 20.
             * <p>
             * 
             * If a single tag is specified to query resources, up to 1,000 resources that have this tag added are returned. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added are returned. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the image. Valid values of N: 1 to 20.
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
