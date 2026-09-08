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
 * {@link DescribeImagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeImagesRequest</p>
 */
public class DescribeImagesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionType")
    private String actionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Architecture")
    private String architecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List<Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageFamily")
    private String imageFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageOwnerId")
    private Long imageOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsPublic")
    private Boolean isPublic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSupportCloudinit")
    private Boolean isSupportCloudinit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSupportIoOptimized")
    private Boolean isSupportIoOptimized;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSType")
    private String OSType;

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
    @com.aliyun.core.annotation.NameInMap("ShowExpired")
    private Boolean showExpired;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Usable")
    private Boolean usable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Usage")
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
        this.usable = builder.usable;
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
    public java.util.List<Filter> getFilter() {
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
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return usable
     */
    public Boolean getUsable() {
        return this.usable;
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
        private java.util.List<Filter> filter; 
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
        private java.util.List<Tag> tag; 
        private Boolean usable; 
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
            this.usable = request.usable;
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
         * <p>The scenario in which the image is used. Valid values:</p>
         * <ul>
         * <li>CreateEcs (default): instance creation.</li>
         * <li>ChangeOS: system disk replacement or operating system replacement.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateEcs</p>
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * <p>The architecture of the image. Valid values:</p>
         * <ul>
         * <li>i386.</li>
         * <li>x86_64.</li>
         * <li>arm64.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i386</p>
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request.</p>
         * <ul>
         * <li>true: Only a dry run is performed. The system checks whether your AccessKey pair is valid, whether Resource Access Management (RAM) user authorization is granted, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned. The request does not send the actual query.</li>
         * <li>false: A normal request is sent. If the check succeeds, a 2XX HTTP status code is returned and the resource status is directly queried.</li>
         * </ul>
         * <p>Default value: false.</p>
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
         * <p>The list of filter conditions used to query resources.</p>
         */
        public Builder filter(java.util.List<Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The name of the image family. You can set this parameter to filter images that belong to the specified image family.</p>
         * <p>Default value: empty.</p>
         * <blockquote>
         * <p>For information about image families associated with Alibaba Cloud public images, see <a href="https://help.aliyun.com/document_detail/108393.html">Overview of public images</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hangzhou-daily-update</p>
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * <p>The image ID.</p>
         * <details>
         * <summary>Naming rules for image IDs</summary>
         * 
         * <ul>
         * <li><p>Public images: Named by operating system version, architecture, language, and release date. For example, the image ID for Windows Server 2008 R2 Enterprise Edition, 64-bit English system is win2008r2_64_ent_sp1_en-us_40G_alibase_20190318.vhd.</p>
         * </li>
         * <li><p>Custom images, shared images, Alibaba Cloud Marketplace images, and community images: Start with m.</p>
         * </li>
         * </ul>
         * </details>
         * 
         * <strong>example:</strong>
         * <p>m-bp1g7004ksh0oeuc****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The name of the image. Fuzzy search is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>testImageName</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The source of the image. Valid values:</p>
         * <ul>
         * <li>system: Images provided by Alibaba Cloud that are not published through Alibaba Cloud Marketplace. This is different from the concept of &quot;public images&quot; in the console.</li>
         * <li>self: Custom images that you created.</li>
         * <li>others: Includes shared images (images directly shared with you by other Alibaba Cloud users) and community images (images that any Alibaba Cloud user has fully shared publicly). Note the following:<ul>
         * <li>To find community images, IsPublic must be set to true.</li>
         * <li>To find shared images, IsPublic must be set to false or left empty.</li>
         * </ul>
         * </li>
         * <li>marketplace: Images published by Alibaba Cloud or third-party independent software vendors (ISVs) in Alibaba Cloud Marketplace. These images must be purchased together with ECS. Check the billing details of Alibaba Cloud Marketplace images on your own.</li>
         * </ul>
         * <p>Default value: empty.</p>
         * <blockquote>
         * <p>An empty value indicates that images with the system, self, and others values are returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>self</p>
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID to which the image belongs. This parameter takes effect only when you query shared images or community images.</p>
         * 
         * <strong>example:</strong>
         * <p>20169351435666****</p>
         */
        public Builder imageOwnerId(Long imageOwnerId) {
            this.putQueryParameter("ImageOwnerId", imageOwnerId);
            this.imageOwnerId = imageOwnerId;
            return this;
        }

        /**
         * <p>The instance type for which you want to query available images.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>Specifies whether to query published community images. Valid values:</p>
         * <ul>
         * <li>true: Queries published community images. When you set this parameter to true, ImageOwnerAlias must be set to others.</li>
         * <li>false: Queries image types other than community images. The specific types depend on the value of ImageOwnerAlias.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isPublic(Boolean isPublic) {
            this.putQueryParameter("IsPublic", isPublic);
            this.isPublic = isPublic;
            return this;
        }

        /**
         * <p>Specifies whether the image supports cloud-init.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSupportCloudinit(Boolean isSupportCloudinit) {
            this.putQueryParameter("IsSupportCloudinit", isSupportCloudinit);
            this.isSupportCloudinit = isSupportCloudinit;
            return this;
        }

        /**
         * <p>Specifies whether the image can run on I/O optimized instances.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSupportIoOptimized(Boolean isSupportIoOptimized) {
            this.putQueryParameter("IsSupportIoOptimized", isSupportIoOptimized);
            this.isSupportIoOptimized = isSupportIoOptimized;
            return this;
        }

        /**
         * <p>The operating system type of the image. Valid values:</p>
         * <ul>
         * <li>windows.</li>
         * <li>linux.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
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
         * <p>The page number of the resources.</p>
         * <p>Minimum value: 1.</p>
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
         * <p>The number of entries per page for a paging query. Settings this parameter to specify the number of entries to return on each page.</p>
         * <p>Maximum value: 100.</p>
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
         * <p>The region ID of the image. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the custom image belongs. When you use this parameter to filter resources, the resource count cannot exceed 1000.</p>
         * <blockquote>
         * <p>Filtering by the default resource group is not supported.</p>
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
         * <p>Specifies whether the subscription image has exceeded its usage period.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder showExpired(Boolean showExpired) {
            this.putQueryParameter("ShowExpired", showExpired);
            this.showExpired = showExpired;
            return this;
        }

        /**
         * <p>The ID of the snapshot used to create the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp17ot2q7x72ggtw****</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>The status of the image. Valid values:</p>
         * <ul>
         * <li>Creating: The image is being created.</li>
         * <li>Waiting: The image is waiting in a multi-task queue.</li>
         * <li>Available: The image is available.</li>
         * <li>UnAvailable: The image is unavailable.</li>
         * <li>CreateFailed: The image failed to be created.</li>
         * <li>Deprecated: The image is deprecated.</li>
         * <li>ALL: All image statuses.</li>
         * </ul>
         * <p>Default value: Available. When Usable is used, Status is required and has no default value.</p>
         * <blockquote>
         * <p>This parameter supports multiple values at the same time, separated by commas (,). When the value is set to ALL, images in all statuses are queried. ALL cannot be used together with other status values.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Specifies whether the image is available.</p>
         * <blockquote>
         * <p>An available image indicates that the image can be immediately used to create instances. For more availability scenarios, see <a href="https://help.aliyun.com/document_detail/3044728.html">Image instant availability</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder usable(Boolean usable) {
            this.putQueryParameter("Usable", usable);
            this.usable = usable;
            return this;
        }

        /**
         * <p>Specifies whether the image is running on ECS instances. Valid values:</p>
         * <ul>
         * <li>instance: The image is in use and running on ECS instances.</li>
         * <li>none: The image is idle and not running on any ECS instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
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

    /**
     * 
     * {@link DescribeImagesRequest} extends {@link TeaModel}
     *
     * <p>DescribeImagesRequest</p>
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

            private Builder() {
            } 

            private Builder(Filter model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The filter key used to query resources. Valid values:</p>
             * <ul>
             * <li>When this parameter is set to <code>CreationStartTime</code>, you can query resources created after the specified time point (<code>Filter.N.Value</code>).</li>
             * <li>When this parameter is set to <code>CreationEndTime</code>, you can query resources created before the specified time point (<code>Filter.N.Value</code>).</li>
             * <li>When this parameter is set to <code>NetworkType</code>, you can query resources of the specified network type.</li>
             * <li>When this parameter is set to any of <code>CpuOnlineUpgrade</code>, <code>CpuOnlineDowngrade</code>, <code>MemoryOnlineUpgrade</code>, or <code>MemoryOnlineDowngrade</code>, you can query the CPU or memory hot-plugging support of the specified image.</li>
             * </ul>
             * <p>Default value: null.</p>
             * 
             * <strong>example:</strong>
             * <p>CreationStartTime</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The filter value used to query resources.</p>
             * <ul>
             * <li><p>When <code>Filter.N.Key</code> is set to <code>CreationStartTime</code> or <code>CreationEndTime</code>, the format is <code>yyyy-MM-ddTHH:mmZ</code>, in UTC+0 time zone.</p>
             * </li>
             * <li><p>When <code>Filter.N.Key</code> is set to <code>NetworkType</code>, valid network type values include <code>vpc</code> and <code>classic</code>.</p>
             * </li>
             * <li><p>When <code>Filter.N.Key</code> is set to <code>CpuOnlineUpgrade</code>, <code>CpuOnlineDowngrade</code>, <code>MemoryOnlineUpgrade</code>, or <code>MemoryOnlineDowngrade</code>, valid values are <code>supported</code> and <code>unsupported</code>.</p>
             * </li>
             * </ul>
             * <p>Default value: null.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-05T22:40Z</p>
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
     * {@link DescribeImagesRequest} extends {@link TeaModel}
     *
     * <p>DescribeImagesRequest</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the image. Valid values of N: 1 to 20.</p>
             * <p>If you use a single tag to filter resources, the resource count with this tag cannot exceed 1000. If you use multiple tags to filter resources, the resource count that has all specified tags attached cannot exceed 1000. If the resource count exceeds 1000, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query resources.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the image. Valid values of N: 1 to 20.</p>
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
