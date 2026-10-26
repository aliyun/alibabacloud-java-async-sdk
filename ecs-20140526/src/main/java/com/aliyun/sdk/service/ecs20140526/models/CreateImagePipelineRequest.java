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
    @com.aliyun.core.annotation.NameInMap("ImageSecurityOptions")
    private ImageSecurityOptions imageSecurityOptions;

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
    @com.aliyun.core.annotation.NameInMap("RepairItem")
    private java.util.List<String> repairItem;

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
        this.imageSecurityOptions = builder.imageSecurityOptions;
        this.importImageOptions = builder.importImageOptions;
        this.instanceType = builder.instanceType;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.name = builder.name;
        this.nvmeSupport = builder.nvmeSupport;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.repairItem = builder.repairItem;
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
     * @return imageSecurityOptions
     */
    public ImageSecurityOptions getImageSecurityOptions() {
        return this.imageSecurityOptions;
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
     * @return repairItem
     */
    public java.util.List<String> getRepairItem() {
        return this.repairItem;
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
        private ImageSecurityOptions imageSecurityOptions; 
        private ImportImageOptions importImageOptions; 
        private String instanceType; 
        private Integer internetMaxBandwidthOut; 
        private String name; 
        private String nvmeSupport; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List<String> repairItem; 
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
            this.imageSecurityOptions = request.imageSecurityOptions;
            this.importImageOptions = request.importImageOptions;
            this.instanceType = request.instanceType;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.name = request.name;
            this.nvmeSupport = request.nvmeSupport;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.repairItem = request.repairItem;
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
         * <p>The Alibaba Cloud account ID for image sharing of the destination image. Valid values of N: 1 to 20.</p>
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
         * <li>If BaseImageType is set to IMAGE, set this parameter to the image ID.</li>
         * <li>If BaseImageType is set to IMAGE_FAMILY, set this parameter to the image family name.</li>
         * <li>If BaseImageType is set to OSS, you do not need to specify this parameter.</li>
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
         * <p>The source image type. Valid values:</p>
         * <ul>
         * <li>IMAGE: image</li>
         * <li>IMAGE_FAMILY: image family</li>
         * <li>OSS: OSS object</li>
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
         * <p>The content of the image build template. The content size cannot exceed 16 KB. For more information about supported commands, see <a href="https://help.aliyun.com/document_detail/200206.html">Commands supported by the image building service</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPONENT ic-bp12dvdzvr9k9*****
         * COMPONENT acs:ecs:cn-hangzhou:18689161186*****:imagecomponent/ComponentName/1.<em>.</em></p>
         */
        public Builder buildContent(String buildContent) {
            this.putQueryParameter("BuildContent", buildContent);
            this.buildContent = buildContent;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a>.</p>
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
         * <p>Specifies whether to release the intermediate instance if the image building fails. Valid values:</p>
         * <ul>
         * <li>true: Releases the instance.</li>
         * <li>false: Does not release the instance.</li>
         * </ul>
         * <p>Default value: true.</p>
         * <blockquote>
         * <p>If the intermediate instance fails to start, the instance is not retained by default.</p>
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
         * <p>The description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * <p>The destination image family.
         * <notice>
         * <strong>[Deprecated]</strong> Use ImageOptions.ImageFamily instead.
         * </notice></p>
         * 
         * <strong>example:</strong>
         * <p>family</p>
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * <p>The prefix of the destination image name.
         * <notice>
         * <strong>[Deprecated]</strong> Use ImageOptions.ImageName instead.
         * </notice></p>
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
         * <p>The properties of the destination image.</p>
         */
        public Builder imageOptions(ImageOptions imageOptions) {
            this.putQueryParameter("ImageOptions", imageOptions);
            this.imageOptions = imageOptions;
            return this;
        }

        /**
         * ImageSecurityOptions.
         */
        public Builder imageSecurityOptions(ImageSecurityOptions imageSecurityOptions) {
            this.putQueryParameter("ImageSecurityOptions", imageSecurityOptions);
            this.imageSecurityOptions = imageSecurityOptions;
            return this;
        }

        /**
         * <p>The properties and settings of the imported image. This parameter is required when BaseImageType is set to OSS.</p>
         */
        public Builder importImageOptions(ImportImageOptions importImageOptions) {
            this.putQueryParameter("ImportImageOptions", importImageOptions);
            this.importImageOptions = importImageOptions;
            return this;
        }

        /**
         * <p>The instance type. You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query available instance types.</p>
         * <p>If you do not specify this parameter, the system automatically selects an instance type with the minimum number of vCPUs and memory size based on resource availability. For example, the system selects the ecs.g6.large instance type by default. If the inventory is insufficient, the ecs.g6.xlarge instance type is selected.</p>
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
         * <p>The outbound public bandwidth of the intermediate instance. Unit: Mbit/s. Valid values: 0 to 100.</p>
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
         * <p>The template name. The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>. It can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <blockquote>
         * <p>If you do not specify <code>Name</code>, the value of <code>ImagePipelineId</code> is used by default.</p>
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
         * <p>Specifies whether the built destination image supports NVMe.
         * <notice>
         * <strong>[Deprecated]</strong> Use ImageOptions.ImageFeatures.NvmeSupport instead.
         * </notice></p>
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The image repair items.</p>
         * <ul>
         * <li>Repair items supported by Linux:<ul>
         * <li>fstab: fixes disk attach configuration issues.</li>
         * <li>grub: fixes GRUB boot configuration issues.</li>
         * <li>dhcp: fixes network DHCP issues.</li>
         * <li>selinux: fixes Security-Enhanced Linux (SELinux) issues.</li>
         * <li>growpart: fixes online automatic scale-out issues of the root partition.</li>
         * <li>cloudinit: installs the cloud-init initialization service.</li>
         * <li>aegis: installs the Security Center agent.</li>
         * <li>nvme: fixes NVMe driver issues.</li>
         * <li>virtio: fixes virtio driver issues.</li>
         * <li>standardizedtimezone: fixes standard time zone issues.</li>
         * </ul>
         * </li>
         * <li>Repair items supported by Windows:<ul>
         * <li>bcd: fixes boot configuration data file issues.</li>
         * <li>hotfix: fixes Windows patch issues.</li>
         * <li>disk: fixes disk Settings issues.</li>
         * <li>update: fixes Windows Update process issues.</li>
         * <li>server: fixes service configuration issues.</li>
         * <li>bootmgr: fixes Windows Boot Manager issues.</li>
         * <li>vminit: fixes Windows initialization agent issues.</li>
         * <li>osloader: fixes Windows OS Loader issues.</li>
         * <li>virtio: fixes virtio driver issues.</li>
         * <li>standardizedtimezone: fixes standard time zone issues.</li>
         * </ul>
         * </li>
         * </ul>
         */
        public Builder repairItem(java.util.List<String> repairItem) {
            this.putQueryParameter("RepairItem", repairItem);
            this.repairItem = repairItem;
            return this;
        }

        /**
         * <p>The repair option in the image template.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Standard: Standard repair mode.</p>
         * <p>The standard repair package for Linux includes:</p>
         * <ul>
         * <li>GUESTOS.CloudInit</li>
         * <li>GUESTOS.Dhcp</li>
         * <li>GUESTOS.Virtio</li>
         * <li>GUESTOS.OnlineResizeFS</li>
         * <li>GUESTOS.Grub</li>
         * <li>GUESTOS.Fstab</li>
         * <li>GUESTOS.Nvme</li>
         * </ul>
         * <p>The standard repair package for Windows includes:</p>
         * <ul>
         * <li>GUESTOS.Virtio</li>
         * <li>GUESTOS.Update</li>
         * <li>GUESTOS.Hotfix</li>
         * <li>GUESTOS.Server</li>
         * <li>GUESTOS.Bcd</li>
         * <li>GUESTOS.Disk</li>
         * <li>GUESTOS.Bootmgr</li>
         * <li>GUESTOS.OSLoader</li>
         * <li>GUESTOS.Vminit</li>
         * </ul>
         * </li>
         * <li><p>All: Full repair mode.</p>
         * <p>The full repair package for Linux includes the following items in addition to those in the standard repair package:</p>
         * <ul>
         * <li>GUESTOS.Selinux</li>
         * <li>GUESTOS.SecurityCenterAgent</li>
         * </ul>
         * <p>The full repair package for Windows includes the following items in addition to those in the standard repair package:</p>
         * <ul>
         * <li>GUESTOS.Server</li>
         * </ul>
         * </li>
         * <li><p>Customized: Custom repair mode. In this mode, the repair items in the repair package are specified by the RepairItem parameter.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>As the detection and repair capabilities continue to improve, the included repair items may increase. For more information about the specific meanings of repair items, see <a href="https://help.aliyun.com/document_detail/439819.html">Image detection overview</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
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
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The content of the image test template. The content size cannot exceed 16 KB. For more information about supported commands, see <a href="https://help.aliyun.com/document_detail/200206.html">Commands supported by the image building service</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPONENT ic-bp12dvdzvr9k9*****
         * COMPONENT acs:ecs:cn-hangzhou:18689161186*****:imagecomponent/ComponentName/1.<em>.</em></p>
         */
        public Builder testContent(String testContent) {
            this.putQueryParameter("TestContent", testContent);
            this.testContent = testContent;
            return this;
        }

        /**
         * <p>The list of regions to which the destination image is to be distributed. Valid values of N: 1 to 20.</p>
         * <p>If you do not specify this parameter, the image is created only in the current region by default.</p>
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
         * <p>The vSwitch ID of the VPC.</p>
         * <p>If you do not specify this parameter, a new VPC and vSwitch are created by default. Make sure that your account has sufficient VPC resource quotas. For more information, see <a href="https://help.aliyun.com/document_detail/27750.html">Limits</a>.</p>
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

            private Builder() {
            } 

            private Builder(AdvancedOptions model) {
                this.imageNameSuffix = model.imageNameSuffix;
                this.retainCloudAssistant = model.retainCloudAssistant;
            } 

            /**
             * <p>Specifies whether to disable the automatic addition of a suffix to the destination image name. Valid values:</p>
             * <ul>
             * <li>disable: Disables the automatic addition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disable</p>
             */
            public Builder imageNameSuffix(String imageNameSuffix) {
                this.imageNameSuffix = imageNameSuffix;
                return this;
            }

            /**
             * <p>Specifies whether to retain Cloud Assistant. During the building process, the system automatically installs Cloud Assistant on the intermediate instance to execute commands. You can choose whether to retain it in the built destination image. Valid values:</p>
             * <ul>
             * <li>true: Retains Cloud Assistant.</li>
             * <li>false: Does not retain Cloud Assistant.</li>
             * </ul>
             * <p>Default value: false.</p>
             * <blockquote>
             * <p>This setting does not affect the Cloud Assistant that is pre-installed in your image.</p>
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

            private Builder() {
            } 

            private Builder(ImageFeatures model) {
                this.nvmeSupport = model.nvmeSupport;
            } 

            /**
             * <p>Specifies whether the built destination image supports NVMe. Valid values:</p>
             * <ul>
             * <li>supported: Supported. Instances created from this image support the NVMe protocol.</li>
             * <li>unsupported: Not supported. Instances created from this image do not support the NVMe protocol.</li>
             * <li>auto: Automatic detection. The system automatically detects whether the NVMe driver is installed in your image. This detection occurs before the building phase. If you install or uninstall the NVMe driver during building, the result may be inaccurate. We recommend that you set this parameter to supported or unsupported based on the build content.</li>
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

            private Builder() {
            } 

            private Builder(ImageTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. Valid values of N: 1 to 20. If this parameter is specified, it cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. Valid values of N: 1 to 20. If this parameter is specified, it can be an empty string. The tag value can be up to 128 characters in length. It cannot start with <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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

            private Builder() {
            } 

            private Builder(ImageOptions model) {
                this.description = model.description;
                this.imageFamily = model.imageFamily;
                this.imageFeatures = model.imageFeatures;
                this.imageName = model.imageName;
                this.imageTags = model.imageTags;
            } 

            /**
             * <p>The description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The target image family. The value must be 2 to 128 characters in length. It must start with a letter or a Chinese character, and cannot start with aliyun or acs:. It cannot contain http:// or https://. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>family</p>
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * <p>The properties related to destination image features.</p>
             */
            public Builder imageFeatures(ImageFeatures imageFeatures) {
                this.imageFeatures = imageFeatures;
                return this;
            }

            /**
             * <p>The prefix of the target image name. It must be 2 to 64 characters in length, start with a letter or a Chinese character, and cannot start with <code>http://</code> or <code>https://</code>. It can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
             * <p>The system automatically generates the final image name by concatenating the prefix and the build task ID (<code>ExecutionId</code>) in the <code>{ImageName}_{ExecutionId}</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>testImageName</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The tags of the destination image.</p>
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
    public static class ImageSecurityOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityScanMode")
        private String securityScanMode;

        private ImageSecurityOptions(Builder builder) {
            this.securityScanMode = builder.securityScanMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageSecurityOptions create() {
            return builder().build();
        }

        /**
         * @return securityScanMode
         */
        public String getSecurityScanMode() {
            return this.securityScanMode;
        }

        public static final class Builder {
            private String securityScanMode; 

            private Builder() {
            } 

            private Builder(ImageSecurityOptions model) {
                this.securityScanMode = model.securityScanMode;
            } 

            /**
             * SecurityScanMode.
             */
            public Builder securityScanMode(String securityScanMode) {
                this.securityScanMode = securityScanMode;
                return this;
            }

            public ImageSecurityOptions build() {
                return new ImageSecurityOptions(this);
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

            private Builder() {
            } 

            private Builder(DiskDeviceMappings model) {
                this.diskImageSize = model.diskImageSize;
                this.format = model.format;
                this.OSSBucket = model.OSSBucket;
                this.OSSObject = model.OSSObject;
            } 

            /**
             * <p>The size of the custom image after the image is imported.</p>
             * <p>The space consists of the system disk and data disks. You must ensure that the size of the system disk is greater than or equal to the size of the imported image file. Valid values:</p>
             * <ul>
             * <li>If N is set to 1, it indicates the system disk. Valid values: 1 to 2048. Unit: GiB.</li>
             * <li>If N is set to 2 to 17, it indicates data disks. Valid values: 1 to 2048. Unit: GiB.</li>
             * </ul>
             * <p>After you upload the source image file to OSS, you can view the size of the image file in the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder diskImageSize(Integer diskImageSize) {
                this.diskImageSize = diskImageSize;
                return this;
            }

            /**
             * <p>The image format. Valid values:</p>
             * <ul>
             * <li>RAW</li>
             * <li>VHD</li>
             * <li>QCOW2</li>
             * </ul>
             * <p>Default value: none. This indicates that Alibaba Cloud automatically detects the image format and uses the detected format.</p>
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
             * <p>The name (key) of the image file saved in the OSS bucket after the image is uploaded.</p>
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
        @com.aliyun.core.annotation.NameInMap("ImdsSupport")
        private String imdsSupport;

        @com.aliyun.core.annotation.NameInMap("NvmeSupport")
        private String nvmeSupport;

        private Features(Builder builder) {
            this.imdsSupport = builder.imdsSupport;
            this.nvmeSupport = builder.nvmeSupport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return imdsSupport
         */
        public String getImdsSupport() {
            return this.imdsSupport;
        }

        /**
         * @return nvmeSupport
         */
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

        public static final class Builder {
            private String imdsSupport; 
            private String nvmeSupport; 

            private Builder() {
            } 

            private Builder(Features model) {
                this.imdsSupport = model.imdsSupport;
                this.nvmeSupport = model.nvmeSupport;
            } 

            /**
             * <p>The metadata access mode of the image. Valid values:</p>
             * <ul>
             * <li><p>v1: When you create an ECS instance from this image, you cannot set the metadata access mode to enforced mode.</p>
             * </li>
             * <li><p>v2: When you create an ECS instance from this image, you can set the metadata access mode to enforced mode.</p>
             * </li>
             * </ul>
             * <p>Default value: v1.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
             */
            public Builder imdsSupport(String imdsSupport) {
                this.imdsSupport = imdsSupport;
                return this;
            }

            /**
             * <p>Specifies whether the imported original image supports NVMe. Valid values:</p>
             * <ul>
             * <li>supported: Supported. Instances created from this image support the NVMe protocol.</li>
             * <li>unsupported: Not supported. Instances created from this image do not support the NVMe protocol.</li>
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
    public static class ImportImageTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ImportImageTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImportImageTags create() {
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

            private Builder(ImportImageTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ImportImageTags build() {
                return new ImportImageTags(this);
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

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DiskDeviceMappings")
        private java.util.List<DiskDeviceMappings> diskDeviceMappings;

        @com.aliyun.core.annotation.NameInMap("Features")
        private Features features;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImportImageTags")
        private java.util.List<ImportImageTags> importImageTags;

        @com.aliyun.core.annotation.NameInMap("LicenseType")
        private String licenseType;

        @com.aliyun.core.annotation.NameInMap("OSType")
        private String OSType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("RetainImportedImage")
        private Boolean retainImportedImage;

        @com.aliyun.core.annotation.NameInMap("RetentionStrategy")
        private String retentionStrategy;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private ImportImageOptions(Builder builder) {
            this.architecture = builder.architecture;
            this.bootMode = builder.bootMode;
            this.description = builder.description;
            this.diskDeviceMappings = builder.diskDeviceMappings;
            this.features = builder.features;
            this.imageName = builder.imageName;
            this.importImageTags = builder.importImageTags;
            this.licenseType = builder.licenseType;
            this.OSType = builder.OSType;
            this.platform = builder.platform;
            this.retainImportedImage = builder.retainImportedImage;
            this.retentionStrategy = builder.retentionStrategy;
            this.roleName = builder.roleName;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return importImageTags
         */
        public java.util.List<ImportImageTags> getImportImageTags() {
            return this.importImageTags;
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

        /**
         * @return retentionStrategy
         */
        public String getRetentionStrategy() {
            return this.retentionStrategy;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private String architecture; 
            private String bootMode; 
            private String description; 
            private java.util.List<DiskDeviceMappings> diskDeviceMappings; 
            private Features features; 
            private String imageName; 
            private java.util.List<ImportImageTags> importImageTags; 
            private String licenseType; 
            private String OSType; 
            private String platform; 
            private Boolean retainImportedImage; 
            private String retentionStrategy; 
            private String roleName; 

            private Builder() {
            } 

            private Builder(ImportImageOptions model) {
                this.architecture = model.architecture;
                this.bootMode = model.bootMode;
                this.description = model.description;
                this.diskDeviceMappings = model.diskDeviceMappings;
                this.features = model.features;
                this.imageName = model.imageName;
                this.importImageTags = model.importImageTags;
                this.licenseType = model.licenseType;
                this.OSType = model.OSType;
                this.platform = model.platform;
                this.retainImportedImage = model.retainImportedImage;
                this.retentionStrategy = model.retentionStrategy;
                this.roleName = model.roleName;
            } 

            /**
             * <p>The system architecture of the system disk. After you specify a data disk snapshot as the system disk of an image, you must use Architecture to determine the system architecture of the system disk. Valid values:</p>
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
             * <p>The boot mode of the image. Valid values:</p>
             * <ul>
             * <li>BIOS: BIOS boot mode.</li>
             * <li>UEFI: UEFI boot mode.</li>
             * </ul>
             * <p>Default value: BIOS. If Architecture is set to arm64, the default value is UEFI, and only UEFI can be set.</p>
             * <notice>
             * 
             * <p>To prevent instances from failing to start due to unsupported boot modes, make sure that you understand the boot modes supported by the destination image before you specify this parameter. For more information about image boot modes, see <a href="~~2244655#b9caa9b8bb1wf~~">Image boot modes</a>.</p>
             * </notice>
             * 
             * <strong>example:</strong>
             * <p>BIOS</p>
             */
            public Builder bootMode(String bootMode) {
                this.bootMode = bootMode;
                return this;
            }

            /**
             * <p>The description of the imported image.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of custom image information to be created.</p>
             * <ul>
             * <li>If N is set to 1, it indicates the system disk.</li>
             * <li>If N is set to 2 to 17, it indicates data disks.</li>
             * </ul>
             */
            public Builder diskDeviceMappings(java.util.List<DiskDeviceMappings> diskDeviceMappings) {
                this.diskDeviceMappings = diskDeviceMappings;
                return this;
            }

            /**
             * <p>The properties related to image features.</p>
             */
            public Builder features(Features features) {
                this.features = features;
                return this;
            }

            /**
             * <p>The name of the imported image.</p>
             * 
             * <strong>example:</strong>
             * <p>testImageName</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The list of tags for the image.</p>
             */
            public Builder importImageTags(java.util.List<ImportImageTags> importImageTags) {
                this.importImageTags = importImageTags;
                return this;
            }

            /**
             * <p>The license type used to activate the operating system after the image is imported. Valid values:</p>
             * <ul>
             * <li>Auto: Alibaba Cloud detects the source operating system and assigns a license. In auto mode, the system first checks whether the Platform you specified has a license from an official Alibaba Cloud channel and assigns it to the imported image. If no such license is available, the system switches to the Bring Your Own License (BYOL) method.</li>
             * <li>Aliyun: Uses a license from an official Alibaba Cloud channel based on the Platform you specified.</li>
             * <li>BYOL: Uses the license provided by the source operating system. If you use BYOL, you must ensure that your license key is supported in Alibaba Cloud.</li>
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
             * <li>windows</li>
             * <li>linux</li>
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
             * <p>The operating system version. Valid values:</p>
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
             * <p>Default value: Others Linux if the operating system type is Linux, or Other Windows if the operating system type is not Linux.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <notice>
             * **[Deprecated]** Use ImportImageOptions.RetentionStrategy instead.
             * </notice>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder retainImportedImage(Boolean retainImportedImage) {
                this.retainImportedImage = retainImportedImage;
                return this;
            }

            /**
             * <p>The data retention policy for the imported image. Valid values:</p>
             * <ul>
             * <li>RetainOnlySuccessful: Retains the image only if the building succeeds.</li>
             * <li>RetainOnlyFailed: Retains the image only if the building fails.</li>
             * <li>RetainAlways: Always retains the image regardless of the building result.</li>
             * <li>RetainNever: Never retains the image regardless of the building result.</li>
             * </ul>
             * <p>Default value: RetainNever.</p>
             * 
             * <strong>example:</strong>
             * <p>RetainAlways</p>
             */
            public Builder retentionStrategy(String retentionStrategy) {
                this.retentionStrategy = retentionStrategy;
                return this;
            }

            /**
             * <p>The name of the RAM role used when importing the image.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunECSImageImportDefaultRole</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. Valid values of N: 1 to 20. If this parameter is specified, it cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. Valid values of N: 1 to 20. If this parameter is specified, it can be an empty string. The tag value can be up to 128 characters in length. It cannot start with <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
