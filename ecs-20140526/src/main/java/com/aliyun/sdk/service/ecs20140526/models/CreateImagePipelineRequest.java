// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImagePipelineRequest} extends {@link RequestModel}
 *
 * <p>CreateImagePipelineRequest</p>
 */
public class CreateImagePipelineRequest extends Request {
    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("AddAccount")
    private java.util.List < Long > addAccount;

    @Query
    @NameInMap("ToRegionId")
    private java.util.List < String > toRegionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("BaseImageType")
    @Validation(required = true)
    private String baseImageType;

    @Query
    @NameInMap("BaseImage")
    @Validation(required = true)
    private String baseImage;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("BuildContent")
    private String buildContent;

    @Query
    @NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("DeleteInstanceOnFailure")
    private Boolean deleteInstanceOnFailure;

    private CreateImagePipelineRequest(Builder builder) {
        super(builder);
        this.tag = builder.tag;
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.addAccount = builder.addAccount;
        this.toRegionId = builder.toRegionId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.baseImageType = builder.baseImageType;
        this.baseImage = builder.baseImage;
        this.name = builder.name;
        this.description = builder.description;
        this.clientToken = builder.clientToken;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.buildContent = builder.buildContent;
        this.systemDiskSize = builder.systemDiskSize;
        this.vSwitchId = builder.vSwitchId;
        this.imageName = builder.imageName;
        this.instanceType = builder.instanceType;
        this.deleteInstanceOnFailure = builder.deleteInstanceOnFailure;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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
     * @return addAccount
     */
    public java.util.List < Long > getAddAccount() {
        return this.addAccount;
    }

    /**
     * @return toRegionId
     */
    public java.util.List < String > getToRegionId() {
        return this.toRegionId;
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
     * @return baseImageType
     */
    public String getBaseImageType() {
        return this.baseImageType;
    }

    /**
     * @return baseImage
     */
    public String getBaseImage() {
        return this.baseImage;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return buildContent
     */
    public String getBuildContent() {
        return this.buildContent;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return deleteInstanceOnFailure
     */
    public Boolean getDeleteInstanceOnFailure() {
        return this.deleteInstanceOnFailure;
    }

    public static final class Builder extends Request.Builder<CreateImagePipelineRequest, Builder> {
        private java.util.List < Tag> tag; 
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private java.util.List < Long > addAccount; 
        private java.util.List < String > toRegionId; 
        private String regionId; 
        private String resourceGroupId; 
        private String baseImageType; 
        private String baseImage; 
        private String name; 
        private String description; 
        private String clientToken; 
        private Integer internetMaxBandwidthOut; 
        private String buildContent; 
        private Integer systemDiskSize; 
        private String vSwitchId; 
        private String imageName; 
        private String instanceType; 
        private Boolean deleteInstanceOnFailure; 

        private Builder() {
            super();
        } 

        private Builder(CreateImagePipelineRequest request) {
            super(request);
            this.tag = request.tag;
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.addAccount = request.addAccount;
            this.toRegionId = request.toRegionId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.baseImageType = request.baseImageType;
            this.baseImage = request.baseImage;
            this.name = request.name;
            this.description = request.description;
            this.clientToken = request.clientToken;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.buildContent = request.buildContent;
            this.systemDiskSize = request.systemDiskSize;
            this.vSwitchId = request.vSwitchId;
            this.imageName = request.imageName;
            this.instanceType = request.instanceType;
            this.deleteInstanceOnFailure = request.deleteInstanceOnFailure;
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
         * AddAccount.
         */
        public Builder addAccount(java.util.List < Long > addAccount) {
            this.putQueryParameter("AddAccount", addAccount);
            this.addAccount = addAccount;
            return this;
        }

        /**
         * ToRegionId.
         */
        public Builder toRegionId(java.util.List < String > toRegionId) {
            this.putQueryParameter("ToRegionId", toRegionId);
            this.toRegionId = toRegionId;
            return this;
        }

        /**
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the enterprise resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The type of the source image. Valid values:
         * <p>
         * 
         * -IMAGE: IMAGE.
         * -IMAGE_FAMILY: The Image family is.
         */
        public Builder baseImageType(String baseImageType) {
            this.putQueryParameter("BaseImageType", baseImageType);
            this.baseImageType = baseImageType;
            return this;
        }

        /**
         * The source image.
         * <p>
         * -When "BaseImageType = IMAGE", this parameter is set to the image ID.
         * -When "BaseImageType = IMAGE_FAMILY ", this parameter is set to the name of the Image family.
         */
        public Builder baseImage(String baseImage) {
            this.putQueryParameter("BaseImage", baseImage);
            this.baseImage = baseImage;
            return this;
        }

        /**
         * The name of the template. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http://" or "https. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
         * <p>
         * 
         * > If "Name" is not set, "ImagePipelineId" is returned by default.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The description. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The Internet outbound bandwidth of the intermediate instance. Unit: Mbit/s. Valid values: 0 to 100.
         * <p>
         * 
         * Default value: 0.
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * The content of the image template. The content size cannot exceed 16KB. A maximum of 127 commands are supported. For more information about supported commands, see API description.
         */
        public Builder buildContent(String buildContent) {
            this.putQueryParameter("BuildContent", buildContent);
            this.buildContent = buildContent;
            return this;
        }

        /**
         * The system disk size of the intermediate instance. Unit: GiB. Valid values: 20 to 500.
         * <p>
         * 
         * Default value: 40
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * The vSwitch ID of the VPC.
         * <p>
         * 
         * If you do not set the parameter value, new VPCs and vswitches are created by default. Make sure that the VPC resource quota under your account is sufficient. For more information, see [limits](~~ 27750 ~~).
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The prefix of the target image name. The description must be 2 to 64 characters in length. It must start with a letter and cannot start with "http://" or "https. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
         * <p>
         * 
         * The complete image name is automatically concatenated with the prefix of the name and the ID of the build task ("ExecutionId"). The format is "{ ImageName }_{ ExecutionId}".
         * 
         * 
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The instance type. You can call [DescribeInstanceTypes](~~ 25620 ~~) to query different instance types.
         * <p>
         * 
         * If you do not set the parameter value, the instance type is automatically set based on the principle of minimum vCPU and memory, and is affected by the instance type inventory. For example, the ecs.g6.large instance type is selected by default. If the inventory is insufficient, the ecs.g6.xlarge instance type is selected.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Specifies whether to release the intermediate instance after the image fails to be built. Valid values:
         * <p>
         * 
         * -true: release
         * -false: do not release
         * 
         * Default value: true
         * 
         * > if the intermediate instance is not started, the instance is not retained by default.
         * 
         * 
         */
        public Builder deleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
            this.putQueryParameter("DeleteInstanceOnFailure", deleteInstanceOnFailure);
            this.deleteInstanceOnFailure = deleteInstanceOnFailure;
            return this;
        }

        @Override
        public CreateImagePipelineRequest build() {
            return new CreateImagePipelineRequest(this);
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
             * 标签键。N的取值范围：1~20。一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以`aliyun`和`acs:`开头，不能包含`http://`或者`https://`。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 标签值。N的取值范围：1~20。一旦传入该值，可以为空字符串。最多支持128个字符，不能以`acs:`开头，不能包含`http://`或者`https://`。
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
