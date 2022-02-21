// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Filter")
    private java.util.List < Filter> filter;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("SnapshotId")
    private String snapshotId;

    @Query
    @NameInMap("ImageFamily")
    private String imageFamily;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("IsSupportIoOptimized")
    private Boolean isSupportIoOptimized;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ActionType")
    private String actionType;

    @Query
    @NameInMap("ShowExpired")
    private Boolean showExpired;

    @Query
    @NameInMap("OSType")
    private String OSType;

    @Query
    @NameInMap("IsSupportCloudinit")
    private Boolean isSupportCloudinit;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Architecture")
    private String architecture;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("IsPublic")
    private Boolean isPublic;

    @Query
    @NameInMap("ImageOwnerId")
    private Long imageOwnerId;

    @Query
    @NameInMap("Usage")
    private String usage;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    private DescribeImagesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.filter = builder.filter;
        this.imageId = builder.imageId;
        this.snapshotId = builder.snapshotId;
        this.imageFamily = builder.imageFamily;
        this.instanceType = builder.instanceType;
        this.isSupportIoOptimized = builder.isSupportIoOptimized;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.actionType = builder.actionType;
        this.showExpired = builder.showExpired;
        this.OSType = builder.OSType;
        this.isSupportCloudinit = builder.isSupportCloudinit;
        this.regionId = builder.regionId;
        this.architecture = builder.architecture;
        this.dryRun = builder.dryRun;
        this.imageName = builder.imageName;
        this.isPublic = builder.isPublic;
        this.imageOwnerId = builder.imageOwnerId;
        this.usage = builder.usage;
        this.pageNumber = builder.pageNumber;
        this.status = builder.status;
        this.imageOwnerAlias = builder.imageOwnerAlias;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return filter
     */
    public java.util.List < Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return imageFamily
     */
    public String getImageFamily() {
        return this.imageFamily;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return isSupportIoOptimized
     */
    public Boolean getIsSupportIoOptimized() {
        return this.isSupportIoOptimized;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return showExpired
     */
    public Boolean getShowExpired() {
        return this.showExpired;
    }

    /**
     * @return OSType
     */
    public String getOSType() {
        return this.OSType;
    }

    /**
     * @return isSupportCloudinit
     */
    public Boolean getIsSupportCloudinit() {
        return this.isSupportCloudinit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    /**
     * @return imageOwnerId
     */
    public Long getImageOwnerId() {
        return this.imageOwnerId;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public static final class Builder extends Request.Builder<DescribeImagesRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private java.util.List < Filter> filter; 
        private String imageId; 
        private String snapshotId; 
        private String imageFamily; 
        private String instanceType; 
        private Boolean isSupportIoOptimized; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String actionType; 
        private Boolean showExpired; 
        private String OSType; 
        private Boolean isSupportCloudinit; 
        private String regionId; 
        private String architecture; 
        private Boolean dryRun; 
        private String imageName; 
        private Boolean isPublic; 
        private Long imageOwnerId; 
        private String usage; 
        private Integer pageNumber; 
        private String status; 
        private String imageOwnerAlias; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImagesRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.tag = response.tag;
            this.filter = response.filter;
            this.imageId = response.imageId;
            this.snapshotId = response.snapshotId;
            this.imageFamily = response.imageFamily;
            this.instanceType = response.instanceType;
            this.isSupportIoOptimized = response.isSupportIoOptimized;
            this.pageSize = response.pageSize;
            this.resourceGroupId = response.resourceGroupId;
            this.actionType = response.actionType;
            this.showExpired = response.showExpired;
            this.OSType = response.OSType;
            this.isSupportCloudinit = response.isSupportCloudinit;
            this.regionId = response.regionId;
            this.architecture = response.architecture;
            this.dryRun = response.dryRun;
            this.imageName = response.imageName;
            this.isPublic = response.isPublic;
            this.imageOwnerId = response.imageOwnerId;
            this.usage = response.usage;
            this.pageNumber = response.pageNumber;
            this.status = response.status;
            this.imageOwnerAlias = response.imageOwnerAlias;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
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
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * A custom image created based on a snapshot ID.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The name of the Image family. You can set this parameter to filter images of the current family when querying images.
         * <p>
         * 
         * Default value: Null.
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * Specifies the images that can be used by the instance type.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Indicates whether the image can run on an I/O optimized instance.
         */
        public Builder isSupportIoOptimized(Boolean isSupportIoOptimized) {
            this.putQueryParameter("IsSupportIoOptimized", isSupportIoOptimized);
            this.isSupportIoOptimized = isSupportIoOptimized;
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
         * The ID of the resource group to which the custom image belongs. When you use this parameter to filter resources, the number of resources cannot exceed 1,000.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The scenario where the image needs to be used. Valid values:
         * <p>
         * 
         * -CreateEcs (default): creates an instance.
         * -ChangeOS: replace the system disk or operating system.
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * Indicates whether the subscription image has expired.
         * <p>
         * 
         * > This parameter will be deprecated soon. To improve compatibility, try to use other parameters.
         */
        public Builder showExpired(Boolean showExpired) {
            this.putQueryParameter("ShowExpired", showExpired);
            this.showExpired = showExpired;
            return this;
        }

        /**
         * The operating system type of the image. Valid values:
         * <p>
         * 
         * -Windows
         * -Linux
         */
        public Builder OSType(String OSType) {
            this.putQueryParameter("OSType", OSType);
            this.OSType = OSType;
            return this;
        }

        /**
         * Indicates whether the image supports cloud-init.
         */
        public Builder isSupportCloudinit(Boolean isSupportCloudinit) {
            this.putQueryParameter("IsSupportCloudinit", isSupportCloudinit);
            this.isSupportCloudinit = isSupportCloudinit;
            return this;
        }

        /**
         * The ID of the region to which the image belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The architecture of the image. Valid values:
         * <p>
         * 
         * -i386
         * -x86_64
         * -arm64
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * Specifies whether to PreCheck only this request.
         * <p>
         * 
         * -true: sends a check request without querying the resource status. Check whether the AccessKey is valid, whether the RAM user is authorized, and whether required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, an error code DryRunOperation is returned.
         * -false: a normal request is sent. After the request passes the check, the 2XX HTTP status code is returned and the resource status is directly queried.
         * 
         * Default value: false
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
         * <props = "intl"> Whether to query published community images. Valid values:</props>
         * <p>
         * <props="intl">
         * -true: queries published community images. If you set this parameter to true, the ImageOwnerAlias must be others.
         * -false: you can call this operation to query images of other types except the Community Image. The value of the ImageOwnerAlias parameter shall prevail.
         * 
         * </props>
         * 
         * <props = "intl"> Default value: false</props>
         */
        public Builder isPublic(Boolean isPublic) {
            this.putQueryParameter("IsPublic", isPublic);
            this.isPublic = isPublic;
            return this;
        }

        /**
         * <props = "china"> The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only when you query a shared image. </props>
         * <p>
         * 
         * <props = "intl"> The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only when you query shared images and Community images. </props>
         * 
         * <props = "partner"> The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only when you query a shared image. </props>
         */
        public Builder imageOwnerId(Long imageOwnerId) {
            this.putQueryParameter("ImageOwnerId", imageOwnerId);
            this.imageOwnerId = imageOwnerId;
            return this;
        }

        /**
         * Indicates whether the image is already running on the ECS instance. Valid values:
         * <p>
         * 
         * -instance: the image is running and is used by ECS instances.
         * -none: the image is idle and no ECS instance is available.
         */
        public Builder usage(String usage) {
            this.putQueryParameter("Usage", usage);
            this.usage = usage;
            return this;
        }

        /**
         * The page number of the image resource list. Start value: 1
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
         * You can call this operation to query images in a certain state. Valid values:
         * <p>
         * 
         * -Creating: The image is being created.
         * -Waiting: multiple tasks are being queued.
         * -Available (default): The image that you can use.
         * -UnAvailable: images that you cannot use.
         * -CreateFailed: the image fails to be created.
         * -Deprecated: Deprecated images.
         * 
         * Support simultaneous image multiple values, value between the comma (,).
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The source of the image. Valid values:
         * <p>
         * 
         * <props="china">
         * -system: a public image provided by Alibaba Cloud.
         * -self: The custom image you created.
         * -others: other Alibaba cloud user shared to you the mirror or published community mirror.
         * -marketplace: The image provided by the marketplace. You can directly use the cloud marketplace images that you query without subscribing to them in advance. You must pay attention to the billing details of Alibaba Cloud marketplace images.
         * 
         * </props>
         * 
         * <props="intl">
         * -system: a public image provided by Alibaba Cloud.
         * -self: The custom image you created.
         * -others: other Alibaba cloud user shared to you the mirror or published community mirror. Note:
         * -Find community mirror, IsPublic must be true.
         * -Find shared when mirroring IsPublic need set to false or not value.
         * -marketplace: The image provided by the marketplace. You can directly use the cloud marketplace images that you query without subscribing to them in advance. You must pay attention to the billing details of Alibaba Cloud marketplace images.
         * 
         * </props>
         * 
         * <props="partner">
         * -system: a public image provided by Alibaba Cloud.
         * -self: The custom image you created.
         * -others: other Alibaba cloud user shared to you the mirror or published community mirror.
         * -marketplace: The image provided by the marketplace. You can directly use the cloud marketplace images that you query without subscribing to them in advance. You must pay attention to the billing details of Alibaba Cloud marketplace images.
         * 
         * </props>
         * 
         * Default: empty, empty means return value for system, self, and others results.
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        @Override
        public DescribeImagesRequest build() {
            return new DescribeImagesRequest(this);
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
             * 镜像的标签键。
             * <p>
             * 
             * >该参数即将被弃用，为提高兼容性，建议您使用另一个`Tag.N.Key`参数。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 镜像的标签值。N的取值范围：1~20
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
             * 查询资源时的筛选键。取值范围：
             * <p>
             * 
             * - 当该参数取值为`CreationStartTime`时，可以查询在指定时间点（`Filter.N.Value`）后创建的资源信息。
             * - 当该参数取值为`CreationEndTime`时，可以查询在指定时间点（`Filter.N.Value`）前创建的资源信息。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 查询资源时的筛选值。指定该参数时必须同时指定`Filter.N.Key`参数，格式为：`yyyy-MM-ddTHH:mmZ`，采用UTC +0时区。
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
}
