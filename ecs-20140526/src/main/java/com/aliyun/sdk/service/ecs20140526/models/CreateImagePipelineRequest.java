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
 * {@link CreateImagePipelineRequest} extends {@link RequestModel}
 *
 * <p>CreateImagePipelineRequest</p>
 */
public class CreateImagePipelineRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddAccount")
    private java.util.List<Long> addAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvancedOptions")
    private AdvancedOptions advancedOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseImage")
    private String baseImage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseImageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baseImageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuildContent")
    private String buildContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteInstanceOnFailure")
    private Boolean deleteInstanceOnFailure;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageFamily")
    @Deprecated
    private String imageFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    @Deprecated
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageOptions")
    private ImageOptions imageOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImportImageOptions")
    private ImportImageOptions importImageOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NvmeSupport")
    @Deprecated
    private String nvmeSupport;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepairMode")
    private String repairMode;

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
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestContent")
    private String testContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToRegionId")
    private java.util.List<String> toRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateImagePipelineRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.addAccount = builder.addAccount;
        this.advancedOptions = builder.advancedOptions;
        this.baseImage = builder.baseImage;
        this.baseImageType = builder.baseImageType;
        this.buildContent = builder.buildContent;
        this.clientToken = builder.clientToken;
        this.deleteInstanceOnFailure = builder.deleteInstanceOnFailure;
        this.description = builder.description;
        this.imageFamily = builder.imageFamily;
        this.imageName = builder.imageName;
        this.imageOptions = builder.imageOptions;
        this.importImageOptions = builder.importImageOptions;
        this.instanceType = builder.instanceType;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.name = builder.name;
        this.nvmeSupport = builder.nvmeSupport;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.repairMode = builder.repairMode;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.systemDiskSize = builder.systemDiskSize;
        this.tag = builder.tag;
        this.testContent = builder.testContent;
        this.toRegionId = builder.toRegionId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImagePipelineRequest create() {
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
     * @return addAccount
     */
    public java.util.List<Long> getAddAccount() {
        return this.addAccount;
    }

    /**
     * @return advancedOptions
     */
    public AdvancedOptions getAdvancedOptions() {
        return this.advancedOptions;
    }

    /**
     * @return baseImage
     */
    public String getBaseImage() {
        return this.baseImage;
    }

    /**
     * @return baseImageType
     */
    public String getBaseImageType() {
        return this.baseImageType;
    }

    /**
     * @return buildContent
     */
    public String getBuildContent() {
        return this.buildContent;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deleteInstanceOnFailure
     */
    public Boolean getDeleteInstanceOnFailure() {
        return this.deleteInstanceOnFailure;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageFamily
     */
    public String getImageFamily() {
        return this.imageFamily;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return imageOptions
     */
    public ImageOptions getImageOptions() {
        return this.imageOptions;
    }

    /**
     * @return importImageOptions
     */
    public ImportImageOptions getImportImageOptions() {
        return this.importImageOptions;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nvmeSupport
     */
    public String getNvmeSupport() {
        return this.nvmeSupport;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repairMode
     */
    public String getRepairMode() {
        return this.repairMode;
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
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return testContent
     */
    public String getTestContent() {
        return this.testContent;
    }

    /**
     * @return toRegionId
     */
    public java.util.List<String> getToRegionId() {
        return this.toRegionId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateImagePipelineRequest, Builder> {
        private String sourceRegionId; 
        private java.util.List<Long> addAccount; 
        private AdvancedOptions advancedOptions; 
        private String baseImage; 
        private String baseImageType; 
        private String buildContent; 
        private String clientToken; 
        private Boolean deleteInstanceOnFailure; 
        private String description; 
        private String imageFamily; 
        private String imageName; 
        private ImageOptions imageOptions; 
        private ImportImageOptions importImageOptions; 
        private String instanceType; 
        private Integer internetMaxBandwidthOut; 
        private String name; 
        private String nvmeSupport; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String repairMode; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer systemDiskSize; 
        private java.util.List<Tag> tag; 
        private String testContent; 
        private java.util.List<String> toRegionId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateImagePipelineRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.addAccount = request.addAccount;
            this.advancedOptions = request.advancedOptions;
            this.baseImage = request.baseImage;
            this.baseImageType = request.baseImageType;
            this.buildContent = request.buildContent;
            this.clientToken = request.clientToken;
            this.deleteInstanceOnFailure = request.deleteInstanceOnFailure;
            this.description = request.description;
            this.imageFamily = request.imageFamily;
            this.imageName = request.imageName;
            this.imageOptions = request.imageOptions;
            this.importImageOptions = request.importImageOptions;
            this.instanceType = request.instanceType;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.name = request.name;
            this.nvmeSupport = request.nvmeSupport;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.repairMode = request.repairMode;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.systemDiskSize = request.systemDiskSize;
            this.tag = request.tag;
            this.testContent = request.testContent;
            this.toRegionId = request.toRegionId;
            this.vSwitchId = request.vSwitchId;
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
         * <p>The IDs of Alibaba Cloud accounts to which to share the image that will be created based on the image template. You can specify up to 20 account IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder addAccount(java.util.List<Long> addAccount) {
            this.putQueryParameter("AddAccount", addAccount);
            this.addAccount = addAccount;
            return this;
        }

        /**
         * <p>The advanced settings.</p>
         */
        public Builder advancedOptions(AdvancedOptions advancedOptions) {
            this.putQueryParameter("AdvancedOptions", advancedOptions);
            this.advancedOptions = advancedOptions;
            return this;
        }

        /**
         * <p>The source image.</p>
         * <ul>
         * <li>If you set <code>BaseImageType</code> to IMAGE, set BaseImage to the ID of a custom image.</li>
         * <li>If you set <code>BaseImageType</code> to IMAGE_FAMILY, set BaseImage to the name of an image family.</li>
         * <li>If you set <code>BaseImageType</code> to OSS, you do not need to specify BaseImage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m-bp67acfmxazb4p****</p>
         */
        public Builder baseImage(String baseImage) {
            this.putQueryParameter("BaseImage", baseImage);
            this.baseImage = baseImage;
            return this;
        }

        /**
         * <p>The type of the source image. Valid values:</p>
         * <ul>
         * <li>IMAGE: image</li>
         * <li>IMAGE_FAMILY: image family</li>
         * <li>OSS: Object Storage Service (OSS) object</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        public Builder baseImageType(String baseImageType) {
            this.putQueryParameter("BaseImageType", baseImageType);
            this.baseImageType = baseImageType;
            return this;
        }

        /**
         * <p>The build content in the image template. The content cannot exceed 16 KB in size. For information about the commands supported by Image Builder, see <a href="https://help.aliyun.com/document_detail/200206.html">Commands supported by Image Builder</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>FROM IMAGE:m-bp67acfmxazb4p****</p>
         */
        public Builder buildContent(String buildContent) {
            this.putQueryParameter("BuildContent", buildContent);
            this.buildContent = buildContent;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.**** For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to release the intermediate instance when the image cannot be created. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: true.</p>
         * <blockquote>
         * <p>If the intermediate instance cannot be started, the instance is released by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
            this.putQueryParameter("DeleteInstanceOnFailure", deleteInstanceOnFailure);
            this.deleteInstanceOnFailure = deleteInstanceOnFailure;
            return this;
        }

        /**
         * <p>The description of the image template. The description must be 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The image family. The image family name must be 2 to 128 characters in length. The name must start with a letter and cannot start with acs: or aliyun. The name cannot contain http:// or https:// and can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * <p>The prefix of the image name. The prefix must be 2 to 64 characters in length. The prefix must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The prefix can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>The system generates the final complete image name that consists of the specified prefix and the ID of the build task (<code>ExecutionId</code>) in the format of <code>{ImageName}_{ExecutionId}</code>.</p>
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
         * ImageOptions.
         */
        public Builder imageOptions(ImageOptions imageOptions) {
            this.putQueryParameter("ImageOptions", imageOptions);
            this.imageOptions = imageOptions;
            return this;
        }

        /**
         * <p>The attributes and settings of the image that you want to import. If you set <code>BaseImageType</code> to OSS, you must specify this parameter.</p>
         */
        public Builder importImageOptions(ImportImageOptions importImageOptions) {
            this.putQueryParameter("ImportImageOptions", importImageOptions);
            this.importImageOptions = importImageOptions;
            return this;
        }

        /**
         * <p>The instance type. You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query instance types.</p>
         * <p>If you do not configure this parameter, an instance type that provides the fewest vCPUs and memory resources is automatically selected. This configuration is subject to resource availability of instance types. For example, the ecs.g6.large instance type is automatically selected. If available ecs.g6.large resources are insufficient, the ecs.g6.xlarge instance type is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The size of the outbound public bandwidth for the intermediate instance. Unit: Mbit/s. Valid values: 0 to 100.</p>
         * <p>Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * <p>The name of the launch template. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <blockquote>
         * <p> If you do not specify <code>Name</code>, the return value of <code>ImagePipelineId</code> is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testImagePipeline</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Specifies whether the image created based on the image template supports the NVMe protocol. Valid values:</p>
         * <ul>
         * <li>supported: The image supports the NVMe protocol. Instances created from the image also support the NVMe protocol.</li>
         * <li>unsupported: The image does not support the NVMe protocol. Instances created from the image do not support the NVMe protocol.</li>
         * <li>auto: The system automatically detects whether the image supports the NVMe protocol. The system automatically detects whether the NVMe driver is installed on your image before the new image is built. If you install or uninstall the NVMe driver during the image building process, the detection result may be incorrect. We recommend that you set the value to supported or unsupported based on the image building content.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        public Builder nvmeSupport(String nvmeSupport) {
            this.putQueryParameter("NvmeSupport", nvmeSupport);
            this.nvmeSupport = nvmeSupport;
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
         * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The repair mode of the image template.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Standard: the standard mode.</p>
         * <p>Supported check items in Linux operating systems:</p>
         * <ul>
         * <li>GUESTOS.CloudInit</li>
         * <li>GUESTOS.Dhcp</li>
         * <li>GUESTOS.Virtio</li>
         * <li>GUESTOS.OnlineResizeFS</li>
         * <li>GUESTOS.Grub</li>
         * <li>GUESTOS.Fstab</li>
         * </ul>
         * <p>Supported check items in Windows operating systems:</p>
         * <ul>
         * <li>GUESTOS.Virtio</li>
         * <li>GUESTOS.Update</li>
         * <li>GUESTOS.Hotfix</li>
         * <li>GUESTOS.Server</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> As the check and repair capabilities continue to improve, the number of check items may increase. For more information about check items, see <a href="https://help.aliyun.com/document_detail/439819.html">Overview of image check</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder repairMode(String repairMode) {
            this.putQueryParameter("RepairMode", repairMode);
            this.repairMode = repairMode;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
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
         * <p>The system disk size of the intermediate instance. Unit: GiB. Valid values: 20 to 500.</p>
         * <p>Default value: 40.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * <p>The tags to add to the template.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The test content in the image template. The content cannot exceed 16 KB in size. For information about the commands supported by Image Builder, see <a href="https://help.aliyun.com/document_detail/200206.html">Commands supported by Image Builder</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder testContent(String testContent) {
            this.putQueryParameter("TestContent", testContent);
            this.testContent = testContent;
            return this;
        }

        /**
         * <p>The IDs of regions to which you want to distribute the image that is created based on the image template. You can specify up to 20 region IDs.</p>
         * <p>If you do not specify this parameter, the image is created only in the current region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder toRegionId(java.util.List<String> toRegionId) {
            this.putQueryParameter("ToRegionId", toRegionId);
            this.toRegionId = toRegionId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         * <p>If you do not specify this parameter, a new VPC and vSwitch are created. Make sure that the VPC quota in your account is sufficient. For more information, see <a href="https://help.aliyun.com/document_detail/27750.html">Limits and quotas</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp67acfmxazb4p****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateImagePipelineRequest build() {
            return new CreateImagePipelineRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateImagePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateImagePipelineRequest</p>
     */
    public static class AdvancedOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageNameSuffix")
        private String imageNameSuffix;

        @com.aliyun.core.annotation.NameInMap("RetainCloudAssistant")
        private Boolean retainCloudAssistant;

        private AdvancedOptions(Builder builder) {
            this.imageNameSuffix = builder.imageNameSuffix;
            this.retainCloudAssistant = builder.retainCloudAssistant;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedOptions create() {
            return builder().build();
        }

        /**
         * @return imageNameSuffix
         */
        public String getImageNameSuffix() {
            return this.imageNameSuffix;
        }

        /**
         * @return retainCloudAssistant
         */
        public Boolean getRetainCloudAssistant() {
            return this.retainCloudAssistant;
        }

        public static final class Builder {
            private String imageNameSuffix; 
            private Boolean retainCloudAssistant; 

            /**
             * ImageNameSuffix.
             */
            public Builder imageNameSuffix(String imageNameSuffix) {
                this.imageNameSuffix = imageNameSuffix;
                return this;
            }

            /**
             * <p>Specifies whether to retain Cloud Assistant Agent that is installed during the image building process. During the image building process, the system automatically installs Cloud Assistant Agent on the intermediate instance to run commands. You can choose whether to retain Cloud Assistant Agent that is installed during the image building process in the new image. Valid values:</p>
             * <ul>
             * <li>true: retains Cloud Assistant Agent that is installed during the image building process in the new image.</li>
             * <li>false: does not retain Cloud Assistant Agent that is installed during the image building process in the new image.</li>
             * </ul>
             * <p>Default value: false.</p>
             * <blockquote>
             * <p> The setting of this parameter does not affect Cloud Assistant Agent that comes with your image.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder retainCloudAssistant(Boolean retainCloudAssistant) {
                this.retainCloudAssistant = retainCloudAssistant;
                return this;
            }

            public AdvancedOptions build() {
                return new AdvancedOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImagePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateImagePipelineRequest</p>
     */
    public static class ImageFeatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NvmeSupport")
        private String nvmeSupport;

        private ImageFeatures(Builder builder) {
            this.nvmeSupport = builder.nvmeSupport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageFeatures create() {
            return builder().build();
        }

        /**
         * @return nvmeSupport
         */
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

        public static final class Builder {
            private String nvmeSupport; 

            /**
             * <p>Specifies whether the image created based on the image template supports the NVMe protocol. Valid values:</p>
             * <ul>
             * <li>supported: The image supports the NVMe protocol. Instances created from the image also support the NVMe protocol.</li>
             * <li>unsupported: The image does not support the NVMe protocol. Instances created from the image do not support the NVMe protocol.</li>
             * <li>auto: The system automatically detects whether the image supports the NVMe protocol. The system automatically detects whether the NVMe driver is installed on your image before the new image is built. If you install or uninstall the NVMe driver during the image building process, the detection result may be incorrect. We recommend that you set the value to supported or unsupported based on the image building content.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder nvmeSupport(String nvmeSupport) {
                this.nvmeSupport = nvmeSupport;
                return this;
            }

            public ImageFeatures build() {
                return new ImageFeatures(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImagePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateImagePipelineRequest</p>
     */
    public static class ImageTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ImageTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageTags create() {
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ImageTags build() {
                return new ImageTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImagePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateImagePipelineRequest</p>
     */
    public static class ImageOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImageFamily")
        private String imageFamily;

        @com.aliyun.core.annotation.NameInMap("ImageFeatures")
        private ImageFeatures imageFeatures;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageTags")
        private java.util.List<ImageTags> imageTags;

        private ImageOptions(Builder builder) {
            this.description = builder.description;
            this.imageFamily = builder.imageFamily;
            this.imageFeatures = builder.imageFeatures;
            this.imageName = builder.imageName;
            this.imageTags = builder.imageTags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageOptions create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return imageFamily
         */
        public String getImageFamily() {
            return this.imageFamily;
        }

        /**
         * @return imageFeatures
         */
        public ImageFeatures getImageFeatures() {
            return this.imageFeatures;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageTags
         */
        public java.util.List<ImageTags> getImageTags() {
            return this.imageTags;
        }

        public static final class Builder {
            private String description; 
            private String imageFamily; 
            private ImageFeatures imageFeatures; 
            private String imageName; 
            private java.util.List<ImageTags> imageTags; 

            /**
             * <p>The description of the image template. The description must be 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The image family. The image family name must be 2 to 128 characters in length. The name must start with a letter and cannot start with acs: or aliyun. The name cannot contain http:// or https:// and can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * ImageFeatures.
             */
            public Builder imageFeatures(ImageFeatures imageFeatures) {
                this.imageFeatures = imageFeatures;
                return this;
            }

            /**
             * <p>The prefix of the image name. The prefix must be 2 to 64 characters in length. The prefix must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The prefix can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
             * <p>The system generates the final complete image name that consists of the specified prefix and the ID of the build task (<code>ExecutionId</code>) in the format of <code>{ImageName}_{ExecutionId}</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testImageName</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ImageTags.
             */
            public Builder imageTags(java.util.List<ImageTags> imageTags) {
                this.imageTags = imageTags;
                return this;
            }

            public ImageOptions build() {
                return new ImageOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImagePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateImagePipelineRequest</p>
     */
    public static class DiskDeviceMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskImageSize")
        private Integer diskImageSize;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("OSSBucket")
        private String OSSBucket;

        @com.aliyun.core.annotation.NameInMap("OSSObject")
        private String OSSObject;

        private DiskDeviceMappings(Builder builder) {
            this.diskImageSize = builder.diskImageSize;
            this.format = builder.format;
            this.OSSBucket = builder.OSSBucket;
            this.OSSObject = builder.OSSObject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskDeviceMappings create() {
            return builder().build();
        }

        /**
         * @return diskImageSize
         */
        public Integer getDiskImageSize() {
            return this.diskImageSize;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return OSSBucket
         */
        public String getOSSBucket() {
            return this.OSSBucket;
        }

        /**
         * @return OSSObject
         */
        public String getOSSObject() {
            return this.OSSObject;
        }

        public static final class Builder {
            private Integer diskImageSize; 
            private String format; 
            private String OSSBucket; 
            private String OSSObject; 

            /**
             * <p>The size of disk N in the custom image after the source image is imported.</p>
             * <p>You can use this parameter to specify the sizes of the system disk and data disks in the custom image. When you specify the size of the system disk, make sure that the specified size is greater than or equal to the size of the source image file. Unit: GiB. Valid values:</p>
             * <ul>
             * <li>When the N value is 1, this parameter specifies the size of the system disk in the custom image. Valid values: 1 to 2048.</li>
             * <li>When the N value is an integer in the range of 2 to 17, this parameter specifies the size of a data disk in the custom image. Valid values: 1 to 2048.</li>
             * </ul>
             * <p>After the image file is uploaded to an OSS bucket, you can view the size of the image file in the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder diskImageSize(Integer diskImageSize) {
                this.diskImageSize = diskImageSize;
                return this;
            }

            /**
             * <p>The format of the image. Valid values:</p>
             * <ul>
             * <li>RAW</li>
             * <li>VHD</li>
             * <li>QCOW2</li>
             * </ul>
             * <p>This parameter is empty by default, which indicates that the system checks the format of the image and uses the check result as the value of this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>RAW</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The OSS bucket where the image file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>ecsimageos</p>
             */
            public Builder OSSBucket(String OSSBucket) {
                this.OSSBucket = OSSBucket;
                return this;
            }

            /**
             * <p>The name (key) of the object that the uploaded image is stored as in the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_5.4_32.raw</p>
             */
            public Builder OSSObject(String OSSObject) {
                this.OSSObject = OSSObject;
                return this;
            }

            public DiskDeviceMappings build() {
                return new DiskDeviceMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImagePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateImagePipelineRequest</p>
     */
    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NvmeSupport")
        private String nvmeSupport;

        private Features(Builder builder) {
            this.nvmeSupport = builder.nvmeSupport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return nvmeSupport
         */
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

        public static final class Builder {
            private String nvmeSupport; 

            /**
             * <p>Specifies whether the imported original image supports the Non-Volatile Memory Express (NVMe) protocol. Valid values:</p>
             * <ul>
             * <li>supported: The image supports the NVMe protocol. Instances created from the image also support the NVMe protocol.</li>
             * <li>unsupported: The image does not support the NVMe protocol. Instances created from the image do not support the NVMe protocol.</li>
             * </ul>
             * <p>Default value: unsupported.</p>
             * 
             * <strong>example:</strong>
             * <p>supported</p>
             */
            public Builder nvmeSupport(String nvmeSupport) {
                this.nvmeSupport = nvmeSupport;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImagePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateImagePipelineRequest</p>
     */
    public static class ImportImageOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("BootMode")
        private String bootMode;

        @com.aliyun.core.annotation.NameInMap("DiskDeviceMappings")
        private java.util.List<DiskDeviceMappings> diskDeviceMappings;

        @com.aliyun.core.annotation.NameInMap("Features")
        private Features features;

        @com.aliyun.core.annotation.NameInMap("LicenseType")
        private String licenseType;

        @com.aliyun.core.annotation.NameInMap("OSType")
        private String OSType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("RetainImportedImage")
        private Boolean retainImportedImage;

        private ImportImageOptions(Builder builder) {
            this.architecture = builder.architecture;
            this.bootMode = builder.bootMode;
            this.diskDeviceMappings = builder.diskDeviceMappings;
            this.features = builder.features;
            this.licenseType = builder.licenseType;
            this.OSType = builder.OSType;
            this.platform = builder.platform;
            this.retainImportedImage = builder.retainImportedImage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImportImageOptions create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return bootMode
         */
        public String getBootMode() {
            return this.bootMode;
        }

        /**
         * @return diskDeviceMappings
         */
        public java.util.List<DiskDeviceMappings> getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        /**
         * @return features
         */
        public Features getFeatures() {
            return this.features;
        }

        /**
         * @return licenseType
         */
        public String getLicenseType() {
            return this.licenseType;
        }

        /**
         * @return OSType
         */
        public String getOSType() {
            return this.OSType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return retainImportedImage
         */
        public Boolean getRetainImportedImage() {
            return this.retainImportedImage;
        }

        public static final class Builder {
            private String architecture; 
            private String bootMode; 
            private java.util.List<DiskDeviceMappings> diskDeviceMappings; 
            private Features features; 
            private String licenseType; 
            private String OSType; 
            private String platform; 
            private Boolean retainImportedImage; 

            /**
             * <p>The system architecture of the system disk. If you specify a data disk snapshot to create the system disk of the image, use Architecture to specify the system architecture of the system disk. Valid values:</p>
             * <ul>
             * <li>x86_64</li>
             * <li>arm64</li>
             * </ul>
             * <p>Default value: x86_64.</p>
             * 
             * <strong>example:</strong>
             * <p>x86_64</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>The new boot mode of the image. Valid values:</p>
             * <ul>
             * <li>BIOS: BIOS mode</li>
             * <li>UEFI: Unified Extensible Firmware Interface (UEFI) mode</li>
             * </ul>
             * <p>Default value: BIOS. If you set Architecture to <code>arm64</code>, set the value to UEFI.</p>
             * <blockquote>
             * <p> Before you specify this parameter, make sure that you are familiar with the boot modes supported by the image. If you specify a boot mode that is not supported by the image, ECS instances created from the image cannot start as expected. For information about the boot modes of images, see the <a href="~~2244655#b9caa9b8bb1wf~~">Boot modes of images</a> section of the &quot;Best practices for ECS instance boot modes&quot; topic.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>BIOS</p>
             */
            public Builder bootMode(String bootMode) {
                this.bootMode = bootMode;
                return this;
            }

            /**
             * <p>The information of disks from which the custom images are created.</p>
             * <ul>
             * <li>When the N value is 1, this parameter creates a custom image from the system disk.</li>
             * <li>When the N value is an integer in the range of 2 to 17, this parameter creates a custom image from a data disk.</li>
             * </ul>
             */
            public Builder diskDeviceMappings(java.util.List<DiskDeviceMappings> diskDeviceMappings) {
                this.diskDeviceMappings = diskDeviceMappings;
                return this;
            }

            /**
             * <p>The attributes of the image.</p>
             */
            public Builder features(Features features) {
                this.features = features;
                return this;
            }

            /**
             * <p>The type of the license to use to activate the operating system after the image is imported. Valid values:</p>
             * <ul>
             * <li>Auto: ECS detects the operating system of the image and allocates a license to the operating system. In this mode, the system first checks whether a license allocated by an official Alibaba Cloud channel is available for the operating system version specified by <code>Platform</code>. If a license allocated by an official Alibaba Cloud channel is available for the operating system version, the system allocates the license to the imported image. If no such license is available, the Bring Your Own License (BYOL) mode is used.</li>
             * <li>Aliyun: The license allocated by an official Alibaba Cloud channel for the operating system version specified by <code>Platform</code> is used.</li>
             * <li>BYOL: The license that comes with the source operating system is used. When you use the BYOL license, make sure that your license key is supported by Alibaba Cloud.</li>
             * </ul>
             * <p>Default value: Auto.</p>
             * 
             * <strong>example:</strong>
             * <p>Auto</p>
             */
            public Builder licenseType(String licenseType) {
                this.licenseType = licenseType;
                return this;
            }

            /**
             * <p>The operating system type. Valid values:</p>
             * <ul>
             * <li>windows: Windows operating systems</li>
             * <li>linux: Linux operating systems</li>
             * </ul>
             * <p>Default value: linux.</p>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * <p>The version of the operating system. Valid values:</p>
             * <ul>
             * <li>Aliyun</li>
             * <li>Anolis</li>
             * <li>CentOS</li>
             * <li>Ubuntu</li>
             * <li>CoreOS</li>
             * <li>SUSE</li>
             * <li>Debian</li>
             * <li>OpenSUSE</li>
             * <li>FreeBSD</li>
             * <li>RedHat</li>
             * <li>Kylin</li>
             * <li>UOS</li>
             * <li>Fedora</li>
             * <li>Fedora CoreOS</li>
             * <li>CentOS Stream</li>
             * <li>AlmaLinux</li>
             * <li>Rocky Linux</li>
             * <li>Gentoo</li>
             * <li>Customized Linux</li>
             * <li>Others Linux</li>
             * <li>Windows Server 2022</li>
             * <li>Windows Server 2019</li>
             * <li>Windows Server 2016</li>
             * <li>Windows Server 2012</li>
             * <li>Windows Server 2008</li>
             * <li>Windows Server 2003</li>
             * <li>Other Windows</li>
             * </ul>
             * <p>Default value: Others Linux when the operating system type is linux, and Other Windows when the operating system type is windows.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>Specifies whether to retain the imported original image. After the import is complete, the system automatically deletes the imported original image to prevent unnecessary storage fees. You can also choose to retain the imported original image. Valid values:</p>
             * <ul>
             * <li>true: retains the imported original image. After the import is complete, the imported original image is not deleted even if the image building task is canceled or fails.</li>
             * <li>false: does not retain the imported original image.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder retainImportedImage(Boolean retainImportedImage) {
                this.retainImportedImage = retainImportedImage;
                return this;
            }

            public ImportImageOptions build() {
                return new ImportImageOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateImagePipelineRequest} extends {@link TeaModel}
     *
     * <p>CreateImagePipelineRequest</p>
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
             * <p>The key of tag N. Valid values of N: 1 to 20. You cannot specify empty strings as tag keys. The tag key must be 1 to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value must be 0 to 128 characters in length. It cannot start with <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
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
