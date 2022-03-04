// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLaunchTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateLaunchTemplateRequest</p>
 */
public class CreateLaunchTemplateRequest extends Request {
    @Query
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TemplateTag")
    private java.util.List < TemplateTag> templateTag;

    @Query
    @NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @Query
    @NameInMap("NetworkInterface")
    private java.util.List < NetworkInterface> networkInterface;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("LaunchTemplateName")
    @Validation(required = true)
    private String launchTemplateName;

    @Query
    @NameInMap("VersionDescription")
    private String versionDescription;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("PasswordInherit")
    private Boolean passwordInherit;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

    @Query
    @NameInMap("EnableVmOsConfig")
    private Boolean enableVmOsConfig;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @Query
    @NameInMap("AutoReleaseTime")
    private String autoReleaseTime;

    @Query
    @NameInMap("SpotPriceLimit")
    @Validation(maximum = 999999)
    private Float spotPriceLimit;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("TemplateResourceGroupId")
    private String templateResourceGroupId;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @Query
    @NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @Query
    @NameInMap("SecurityEnhancementStrategy")
    private String securityEnhancementStrategy;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("SpotDuration")
    private Integer spotDuration;

    @Query
    @NameInMap("InternetMaxBandwidthIn")
    private Integer internetMaxBandwidthIn;

    @Query
    @NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    private CreateLaunchTemplateRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateTag = builder.templateTag;
        this.dataDisk = builder.dataDisk;
        this.networkInterface = builder.networkInterface;
        this.tag = builder.tag;
        this.regionId = builder.regionId;
        this.launchTemplateName = builder.launchTemplateName;
        this.versionDescription = builder.versionDescription;
        this.imageId = builder.imageId;
        this.passwordInherit = builder.passwordInherit;
        this.instanceType = builder.instanceType;
        this.securityGroupId = builder.securityGroupId;
        this.vpcId = builder.vpcId;
        this.vSwitchId = builder.vSwitchId;
        this.instanceName = builder.instanceName;
        this.description = builder.description;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.zoneId = builder.zoneId;
        this.ioOptimized = builder.ioOptimized;
        this.networkType = builder.networkType;
        this.enableVmOsConfig = builder.enableVmOsConfig;
        this.userData = builder.userData;
        this.keyPairName = builder.keyPairName;
        this.ramRoleName = builder.ramRoleName;
        this.autoReleaseTime = builder.autoReleaseTime;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.resourceGroupId = builder.resourceGroupId;
        this.templateResourceGroupId = builder.templateResourceGroupId;
        this.privateIpAddress = builder.privateIpAddress;
        this.deploymentSetId = builder.deploymentSetId;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
        this.spotStrategy = builder.spotStrategy;
        this.instanceChargeType = builder.instanceChargeType;
        this.spotDuration = builder.spotDuration;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.securityGroupIds = builder.securityGroupIds;
        this.internetChargeType = builder.internetChargeType;
        this.period = builder.period;
        this.hostName = builder.hostName;
        this.imageOwnerAlias = builder.imageOwnerAlias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLaunchTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
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
     * @return templateTag
     */
    public java.util.List < TemplateTag> getTemplateTag() {
        return this.templateTag;
    }

    /**
     * @return dataDisk
     */
    public java.util.List < DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return networkInterface
     */
    public java.util.List < NetworkInterface> getNetworkInterface() {
        return this.networkInterface;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return launchTemplateName
     */
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * @return versionDescription
     */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return passwordInherit
     */
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return enableVmOsConfig
     */
    public Boolean getEnableVmOsConfig() {
        return this.enableVmOsConfig;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return autoReleaseTime
     */
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    /**
     * @return spotPriceLimit
     */
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return templateResourceGroupId
     */
    public String getTemplateResourceGroupId() {
        return this.templateResourceGroupId;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return ipv6AddressCount
     */
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    /**
     * @return securityEnhancementStrategy
     */
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return spotDuration
     */
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    /**
     * @return internetMaxBandwidthIn
     */
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List < String > getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public static final class Builder extends Request.Builder<CreateLaunchTemplateRequest, Builder> {
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private java.util.List < TemplateTag> templateTag; 
        private java.util.List < DataDisk> dataDisk; 
        private java.util.List < NetworkInterface> networkInterface; 
        private java.util.List < Tag> tag; 
        private String regionId; 
        private String launchTemplateName; 
        private String versionDescription; 
        private String imageId; 
        private Boolean passwordInherit; 
        private String instanceType; 
        private String securityGroupId; 
        private String vpcId; 
        private String vSwitchId; 
        private String instanceName; 
        private String description; 
        private Integer internetMaxBandwidthOut; 
        private String zoneId; 
        private String ioOptimized; 
        private String networkType; 
        private Boolean enableVmOsConfig; 
        private String userData; 
        private String keyPairName; 
        private String ramRoleName; 
        private String autoReleaseTime; 
        private Float spotPriceLimit; 
        private String resourceGroupId; 
        private String templateResourceGroupId; 
        private String privateIpAddress; 
        private String deploymentSetId; 
        private Integer ipv6AddressCount; 
        private String securityEnhancementStrategy; 
        private String spotStrategy; 
        private String instanceChargeType; 
        private Integer spotDuration; 
        private Integer internetMaxBandwidthIn; 
        private java.util.List < String > securityGroupIds; 
        private String internetChargeType; 
        private Integer period; 
        private String hostName; 
        private String imageOwnerAlias; 

        private Builder() {
            super();
        } 

        private Builder(CreateLaunchTemplateRequest request) {
            super(request);
            this.systemDisk = request.systemDisk;
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateTag = request.templateTag;
            this.dataDisk = request.dataDisk;
            this.networkInterface = request.networkInterface;
            this.tag = request.tag;
            this.regionId = request.regionId;
            this.launchTemplateName = request.launchTemplateName;
            this.versionDescription = request.versionDescription;
            this.imageId = request.imageId;
            this.passwordInherit = request.passwordInherit;
            this.instanceType = request.instanceType;
            this.securityGroupId = request.securityGroupId;
            this.vpcId = request.vpcId;
            this.vSwitchId = request.vSwitchId;
            this.instanceName = request.instanceName;
            this.description = request.description;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.zoneId = request.zoneId;
            this.ioOptimized = request.ioOptimized;
            this.networkType = request.networkType;
            this.enableVmOsConfig = request.enableVmOsConfig;
            this.userData = request.userData;
            this.keyPairName = request.keyPairName;
            this.ramRoleName = request.ramRoleName;
            this.autoReleaseTime = request.autoReleaseTime;
            this.spotPriceLimit = request.spotPriceLimit;
            this.resourceGroupId = request.resourceGroupId;
            this.templateResourceGroupId = request.templateResourceGroupId;
            this.privateIpAddress = request.privateIpAddress;
            this.deploymentSetId = request.deploymentSetId;
            this.ipv6AddressCount = request.ipv6AddressCount;
            this.securityEnhancementStrategy = request.securityEnhancementStrategy;
            this.spotStrategy = request.spotStrategy;
            this.instanceChargeType = request.instanceChargeType;
            this.spotDuration = request.spotDuration;
            this.internetMaxBandwidthIn = request.internetMaxBandwidthIn;
            this.securityGroupIds = request.securityGroupIds;
            this.internetChargeType = request.internetChargeType;
            this.period = request.period;
            this.hostName = request.hostName;
            this.imageOwnerAlias = request.imageOwnerAlias;
        } 

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.putQueryParameter("SystemDisk", systemDisk);
            this.systemDisk = systemDisk;
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
         * TemplateTag.
         */
        public Builder templateTag(java.util.List < TemplateTag> templateTag) {
            this.putQueryParameter("TemplateTag", templateTag);
            this.templateTag = templateTag;
            return this;
        }

        /**
         * DataDisk.
         */
        public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * NetworkInterface.
         */
        public Builder networkInterface(java.util.List < NetworkInterface> networkInterface) {
            this.putQueryParameter("NetworkInterface", networkInterface);
            this.networkInterface = networkInterface;
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
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the instance launch template. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         */
        public Builder launchTemplateName(String launchTemplateName) {
            this.putQueryParameter("LaunchTemplateName", launchTemplateName);
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        /**
         * The version description of the instance launch template. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         */
        public Builder versionDescription(String versionDescription) {
            this.putQueryParameter("VersionDescription", versionDescription);
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * The ID of the image. You can use [DescribeImages](~~ 25534 ~~) to query the available image resources.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * Specifies whether to use the default password of the image.
         * <p>
         * 
         * > When you use this parameter, the Password parameter must be empty, and you must ensure that the Password has been set for the image you are using.
         */
        public Builder passwordInherit(Boolean passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
            return this;
        }

        /**
         * The type of the instance. For more information, see [instance type family](~~ 25378 ~~), or call [DescribeInstanceTypes](~~ 25620 ~~) to obtain the latest specification.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The ID of the security group to which the new instance belongs. Instances in the same security group can access each other. A security group can manage up to 1,000 instances.
         * <p>
         * 
         * > you cannot specify both "SecurityGroupId" and "SecurityGroupIds ".
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * VPC VPC ID.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * You must specify the vSwitch ID when creating a VPC-type instance.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The name of the instance. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The description of the instance. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * The ID of the zone to which the instance belongs.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * Indicates whether the instance is I/O optimized. Valid values:
         * <p>
         * 
         * -none: Non-I/O optimized.
         * -optimized:I/O optimized.
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * The network type of the instance. Valid values:
         * <p>
         * 
         * -classic: classic network.
         * -vpc: VPC.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * Specifies whether to enable instance operating system configuration.
         * <p>
         * > This parameter will be deprecated soon. To improve compatibility, try to use other parameters.
         */
        public Builder enableVmOsConfig(Boolean enableVmOsConfig) {
            this.putQueryParameter("EnableVmOsConfig", enableVmOsConfig);
            this.enableVmOsConfig = enableVmOsConfig;
            return this;
        }

        /**
         * The user data of the instance must be encoded in Base64. the maximum size of the raw data is 16kB.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The name of the key pair.
         * <p>
         * 
         * -Windows the instance. Ignore this parameter. Even if this parameter is specified, only the "Password" content is executed.
         * -The password logon method for Linux instances is initialized to disable.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The name of the instance RAM role. You can use the RAM API [ListRoles](~~ 28713 ~~) to query the created instance RAM role.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * The automatic release time. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC time. The format is yyyy-MM-ddTHH:mm:ssZ.
         * <p>
         * 
         * -If the value of seconds is not "00", it is automatically set to the beginning of the current minute ("mm").
         * 
         * -The minimum release time is half an hour later than the current time.
         * 
         * -The maximum release time cannot exceed three years.
         */
        public Builder autoReleaseTime(String autoReleaseTime) {
            this.putQueryParameter("AutoReleaseTime", autoReleaseTime);
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }

        /**
         * Set the maximum hourly price for an instance. A maximum of three decimal places are supported. This parameter takes effect when the value of "spotstratege" is "spotwithpricelime.
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * The ID of the enterprise resource group to which the instance, block storage, and Eni belong.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the resource group to which the launch template belongs.
         */
        public Builder templateResourceGroupId(String templateResourceGroupId) {
            this.putQueryParameter("TemplateResourceGroupId", templateResourceGroupId);
            this.templateResourceGroupId = templateResourceGroupId;
            return this;
        }

        /**
         * The private IP address of the instance.
         * <p>
         * 
         * When you configure a private IP address for a VPC-type ECS instance, you must select an idle CIDR block from the vSwitch ("VSwitchId").
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The ID of the deployment set.
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * Specify the number of randomly generated IPv6 addresses for the primary Eni. Valid values: 1 to 10.
         */
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * Specifies whether to enable security hardening for the operating system. Valid values:
         * <p>
         * 
         * -Active: enables security hardening, which takes effect only for public images.
         * -Deactive: does not enable security hardening and takes effect for all image types.
         */
        public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
            this.putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }

        /**
         * The preemptible policy of the pay-as-you-go instance. This parameter takes effect only when the value of "InstanceChargeType" is "PostPaid. Valid values:
         * <p>
         * 
         * -NoSpot: a pay-as-you-go instance.
         * -SpotWithPriceLimit: sets the maximum price for preemptible instances.
         * -SpotAsPriceGo: The system automatically bids based on the actual market price.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * <props="china">
         * -PrePaid: subscription. If you select this type of payment method, make sure that your account supports balance payment and credit payment. Otherwise, the error message "InvalidPayMethod" is returned.
         * -PostPaid: pay-as-you-go.
         * 
         * </props>
         * 
         * <props="intl">
         * -PrePaid: subscription. When you select this billing method, you must ensure that your account supports credit payment. Otherwise, the error message "InvalidPayMethod" is returned.
         * -PostPaid: pay-as-you-go.
         * 
         * </props>
         * 
         * <props="partner">
         * -PrePaid: subscription. When you select this billing method, you must ensure that your account supports credit payment. Otherwise, the error message "InvalidPayMethod" is returned.
         * -PostPaid: pay-as-you-go.
         * 
         * </props>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The retention period of a preemptible instance. Unit: hours. Valid values: 0 to 6.
         * <p>
         * 
         * -The retention period is 2 to 6 and is being invited for testing. If you want to activate the service, submit a ticket.
         * -If the value is 0, the mode is not protected.
         * 
         * Default value: 1.
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
         * <p>
         * 
         * -When the purchased internet outbound bandwidth is less than or equal to 10Mbit/s: 1 to 10, the default value is 10.
         * -When the purchased internet outbound bandwidth is greater than 10Mbit/s: 1 to "InternetMaxBandwidthOut". The default value is "InternetMaxBandwidthOut.
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        /**
         * One or more security groups to which the instance belongs. The value range of N depends on the number of instances that can be added to the security group. For more information, see [limits](~~ 25412 ~~).
         * <p>
         * 
         * > you cannot specify both "SecurityGroupId" and "SecurityGroupIds ".
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * The network billing method. Valid values:
         * <p>
         * 
         * -PayByBandwidth: pay-by-bandwidth.
         * -PayByTraffic: pay by traffic.
         * 
         * > **pay-by-traffic** mode: The peak inbound and outbound bandwidth is the upper limit of the bandwidth and is not used as a service commitment indicator. When a resource scramble occurs, the peak bandwidth may be limited. If your business needs to be guaranteed by bandwidth, use the **pay-by-bandwidth** mode.
         * 
         * 
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The duration of the resource. Unit: month. This parameter takes effect only when the instancechargetype" parameter is set to prepaid" and is required. Valid values: {"1", "2", "3", "4", "5", "6", "7", "8", "9", "12", "24", "36", "48", "60"}.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The hostname of the ECS instance.
         * <p>
         * 
         * -Periods (.) and hyphens (-) cannot be used as start and end characters, and cannot be used consecutively.
         * -Windows instance: the name must be 2 to 15 characters in length and cannot contain periods (.). It can contain uppercase and lowercase letters, digits, and hyphens (-).
         * -For other types of instances (such as Linux), the name must be 2 to 64 characters in length and can contain multiple half-width periods (.). The half-width periods must be a segment. Each segment can contain uppercase and lowercase letters, digits, and hyphens (-).
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * The source of the image. Valid values:
         * <p>
         * 
         * <props="china">
         * -system: a public image provided by Alibaba Cloud.
         * -self: The custom image you created.
         * -others: images shared by other alibaba cloud users.
         * -marketplace: the image provided by [marketplace](https://market.aliyun.com/). You can directly use the cloud marketplace images that you query without subscribing to them in advance. You must pay attention to the billing details of Alibaba Cloud marketplace images.
         * 
         * </props>
         * 
         * <props="intl">
         * -system: a public image provided by Alibaba Cloud.
         * -self: The custom image you created.
         * -others: images shared by other alibaba cloud users.
         * -marketplace: The image provided by [Alibaba Cloud marketplace](https://marketplace.alibabacloud.com/). You can directly use the cloud marketplace images that you query without subscribing to them in advance. You must pay attention to the billing details of alibaba cloud marketplace images.
         * 
         * </props>
         * 
         * 
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        @Override
        public CreateLaunchTemplateRequest build() {
            return new CreateLaunchTemplateRequest(this);
        } 

    } 

    public static class SystemDisk extends TeaModel {
        @NameInMap("Iops")
        private Integer iops;

        @NameInMap("Category")
        private String category;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("Description")
        private String description;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        private SystemDisk(Builder builder) {
            this.iops = builder.iops;
            this.category = builder.category;
            this.size = builder.size;
            this.diskName = builder.diskName;
            this.description = builder.description;
            this.performanceLevel = builder.performanceLevel;
            this.deleteWithInstance = builder.deleteWithInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return iops
         */
        public Integer getIops() {
            return this.iops;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return deleteWithInstance
         */
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public static final class Builder {
            private Integer iops; 
            private String category; 
            private Integer size; 
            private String diskName; 
            private String description; 
            private String performanceLevel; 
            private Boolean deleteWithInstance; 

            /**
             * Iops.
             */
            public Builder iops(Integer iops) {
                this.iops = iops;
                return this;
            }

            /**
             * The type of the system disk. Valid values:
             * <p>
             * 
             * -cloud: basic cloud disk.
             * -cloud_efficiency: Ultra disk.
             * -cloud_ssd:SSD cloud disk.
             * -cloud_essd:ESSD. You can set the performance level of a cloud disk by using the "SystemDisk.PerformanceLevel" parameter.
             * 
             * For phased-out instance types and non-I/O optimized instances, the default value is cloud. Otherwise, the default value is cloud_efficiency.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The size of the system disk. Unit: GiB. Valid values: 20 to 500.
             * <p>
             * 
             * The value of this parameter must be greater than or equal to max{20, ImageSize}.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The name of the system disk. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * The description of the system disk. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * When you create an ESSD as a system disk, set the performance level of the disk. Valid values:
             * <p>
             * 
             * -PL0 (default): The maximum random read/write IOPS per disk is 10,000.
             * -PL1: The maximum random read/write IOPS per disk is 50,000.
             * -PL2: The maximum random read/write IOPS per disk is 100,000.
             * -PL3: The maximum random read/write IOPS per disk is 1 million.
             * 
             * For more information about how to select an ESSD performance level, see [ESSD cloud disk](~~ 122389 ~~).
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * Indicates whether the system disk is released with the instance. Valid values:
             * <p>
             * 
             * -true: the instance is released with the instance.
             * -false: the instance is not released.
             * 
             * Default value: true.
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    public static class TemplateTag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private TemplateTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateTag create() {
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
             * 启动模板的标签键。N的取值范围：1~20。一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以`aliyun`或`acs:`开头，不能包含`http://`或`https://`。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 启动模板的标签值。N的取值范围：1~20。一旦传入该值，可以为空字符串。最多支持128个字符，不能以`aliyun`或`acs:`开头，不能包含`http://`或`https://`。
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TemplateTag build() {
                return new TemplateTag(this);
            } 

        } 

    }
    public static class DataDisk extends TeaModel {
        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Description")
        private String description;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Device")
        private String device;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("Category")
        private String category;

        @NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @NameInMap("Encrypted")
        private String encrypted;

        private DataDisk(Builder builder) {
            this.performanceLevel = builder.performanceLevel;
            this.description = builder.description;
            this.snapshotId = builder.snapshotId;
            this.size = builder.size;
            this.device = builder.device;
            this.diskName = builder.diskName;
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.encrypted = builder.encrypted;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return deleteWithInstance
         */
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        /**
         * @return encrypted
         */
        public String getEncrypted() {
            return this.encrypted;
        }

        public static final class Builder {
            private String performanceLevel; 
            private String description; 
            private String snapshotId; 
            private Integer size; 
            private String device; 
            private String diskName; 
            private String category; 
            private Boolean deleteWithInstance; 
            private String encrypted; 

            /**
             * 创建ESSD云盘作为数据盘使用时，设置云盘的性能等级。N的取值必须和`DataDisk.N.Category=cloud_essd`中的N保持一致。取值范围：
             * <p>
             * 
             * - PL0：单盘最高随机读写IOPS 1万。
             * - PL1（默认）：单盘最高随机读写IOPS 5万。
             * - PL2：单盘最高随机读写IOPS 10万。
             * - PL3：单盘最高随机读写IOPS 100万。
             * 
             * 有关如何选择ESSD性能等级，请参见[ESSD云盘](~~122389~~)。
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * 数据盘描述。长度为2~256个英文或中文字符，不能以`http://`或`https://`开头。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 创建数据盘N使用的快照。N的取值范围为1~16。指定参数`DataDisk.N.SnapshotId`后，参数`DataDisk.N.Size`会被忽略，实际创建的云盘大小为指定的快照的大小。
             * <p>
             * 
             * 不能使用早于2013年7月15日（含）创建的快照，请求会报错被拒绝。
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * 第N个数据盘的容量大小，N的取值范围为1~16，内存单位为GiB。取值范围：
             * <p>
             * 
             * -   cloud：5~2000
             * -   cloud_efficiency：20~32768
             * -   cloud_ssd：20~32768
             * -   cloud_essd：20~32768
             * 
             * 该参数的取值必须大于等于参数`SnapshotId`指定的快照的大小。
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * 数据盘名称。长度为2~128个英文或中文字符。必须以大小字母或中文开头，不能以`http://`或`https://`开头。可以包含数字、半角冒号（:）、下划线（_）或者短划线（-）。
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * 数据盘n的云盘种类。取值范围：
             * <p>
             * 
             * -   cloud：普通云盘。
             * -   cloud_efficiency：高效云盘。
             * -   cloud_ssd：SSD云盘。
             * -   cloud_essd：ESSD云盘。
             * 
             * I/O优化实例的默认值为cloud_efficiency，非I/O优化实例的默认值为cloud。
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * 表示数据盘是否随实例释放。取值范围：
             * <p>
             * 
             * - true：随实例释放。
             * - false：不随实例释放。
             * 
             * 默认值为true。
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * 数据盘是否加密。
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    public static class NetworkInterface extends TeaModel {
        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("NetworkInterfaceName")
        private String networkInterfaceName;

        @NameInMap("Description")
        private String description;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("PrimaryIpAddress")
        private String primaryIpAddress;

        @NameInMap("SecurityGroupIds")
        private java.util.List < String > securityGroupIds;

        private NetworkInterface(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.networkInterfaceName = builder.networkInterfaceName;
            this.description = builder.description;
            this.securityGroupId = builder.securityGroupId;
            this.primaryIpAddress = builder.primaryIpAddress;
            this.securityGroupIds = builder.securityGroupIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterface create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return networkInterfaceName
         */
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return primaryIpAddress
         */
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List < String > getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public static final class Builder {
            private String vSwitchId; 
            private String networkInterfaceName; 
            private String description; 
            private String securityGroupId; 
            private String primaryIpAddress; 
            private java.util.List < String > securityGroupIds; 

            /**
             * 辅助弹性网卡所属的虚拟交换机ID。实例与弹性网卡必须在同一VPC的同一可用区中，可以分属于不同交换机。`NetworkInterface.N`的N取值不能大于1。
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * 辅助弹性网卡名称。`NetworkInterface.N`的N取值不能大于1。
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * 辅助弹性网卡描述信息。长度为2~256个英文或中文字符，不能以`http://`或`https://`开头。`NetworkInterface.N`的N取值不能大于1。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 辅助弹性网卡所属安全组的ID。辅助弹性网卡的安全组和实例的安全组必须在同一个VPC下。`NetworkInterface.N`的N取值不能大于1。
             * <p>
             * 
             * > 不支持同时指定`NetworkInterface.N.SecurityGroupId`和`NetworkInterface.N.SecurityGroupIds.N`。
             * 
             * 
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * 辅助弹性网卡的主私有IP地址。`NetworkInterface.N`的N取值不能大于1。
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
                return this;
            }

            /**
             * 辅助弹性网卡加入的一个或多个安全组。安全组和辅助弹性网卡必须在同一个专有网络VPC中。`SecurityGroupIds.N`的N取值范围与辅助弹性网卡能够加入安全组配额有关。更多信息，请参见[使用限制](~~25412~~)。`NetworkInterface.N`的N取值不能大于1。
             * <p>
             * 
             * > 不支持同时指定`NetworkInterface.N.SecurityGroupId`和`NetworkInterface.N.SecurityGroupIds.N`。
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            public NetworkInterface build() {
                return new NetworkInterface(this);
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
             * 实例、块存储和弹性网卡的标签键。N的取值范围：1~20。一旦传入该值，则不允许为空字符串。最多支持64个字符，不能以`aliyun`或`acs:`开头，不能包含`http://`或`https://`。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 实例、块存储和弹性网卡的标签值。N的取值范围：1~20。一旦传入该值，可以为空字符串。最多支持128个字符，不能以aliyun和acs:开头，不能包含http://或者https://。
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
