// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLaunchTemplateVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateLaunchTemplateVersionRequest</p>
 */
public class CreateLaunchTemplateVersionRequest extends Request {
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("PasswordInherit")
    private Boolean passwordInherit;

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
    private String regionId;

    @Query
    @NameInMap("LaunchTemplateName")
    private String launchTemplateName;

    @Query
    @NameInMap("VersionDescription")
    private String versionDescription;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("EnableVmOsConfig")
    private Boolean enableVmOsConfig;

    @Query
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @Query
    @NameInMap("SpotDuration")
    private Integer spotDuration;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @Query
    @NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

    @Query
    @NameInMap("AutoReleaseTime")
    private String autoReleaseTime;

    @Query
    @NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("SecurityEnhancementStrategy")
    private String securityEnhancementStrategy;

    @Query
    @NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("InternetMaxBandwidthIn")
    private Integer internetMaxBandwidthIn;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    private CreateLaunchTemplateVersionRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.passwordInherit = builder.passwordInherit;
        this.dataDisk = builder.dataDisk;
        this.networkInterface = builder.networkInterface;
        this.tag = builder.tag;
        this.regionId = builder.regionId;
        this.launchTemplateName = builder.launchTemplateName;
        this.versionDescription = builder.versionDescription;
        this.vpcId = builder.vpcId;
        this.instanceName = builder.instanceName;
        this.description = builder.description;
        this.hostName = builder.hostName;
        this.zoneId = builder.zoneId;
        this.ioOptimized = builder.ioOptimized;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.enableVmOsConfig = builder.enableVmOsConfig;
        this.ramRoleName = builder.ramRoleName;
        this.spotDuration = builder.spotDuration;
        this.resourceGroupId = builder.resourceGroupId;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.deploymentSetId = builder.deploymentSetId;
        this.instanceType = builder.instanceType;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.networkType = builder.networkType;
        this.autoReleaseTime = builder.autoReleaseTime;
        this.securityGroupIds = builder.securityGroupIds;
        this.vSwitchId = builder.vSwitchId;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.userData = builder.userData;
        this.keyPairName = builder.keyPairName;
        this.securityGroupId = builder.securityGroupId;
        this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
        this.launchTemplateId = builder.launchTemplateId;
        this.spotStrategy = builder.spotStrategy;
        this.imageId = builder.imageId;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.period = builder.period;
        this.privateIpAddress = builder.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLaunchTemplateVersionRequest create() {
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
     * @return passwordInherit
     */
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
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
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
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
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
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
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return enableVmOsConfig
     */
    public Boolean getEnableVmOsConfig() {
        return this.enableVmOsConfig;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return spotDuration
     */
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return ipv6AddressCount
     */
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return autoReleaseTime
     */
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List < String > getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return spotPriceLimit
     */
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityEnhancementStrategy
     */
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    /**
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return internetMaxBandwidthIn
     */
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static final class Builder extends Request.Builder<CreateLaunchTemplateVersionRequest, Builder> {
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private Boolean passwordInherit; 
        private java.util.List < DataDisk> dataDisk; 
        private java.util.List < NetworkInterface> networkInterface; 
        private java.util.List < Tag> tag; 
        private String regionId; 
        private String launchTemplateName; 
        private String versionDescription; 
        private String vpcId; 
        private String instanceName; 
        private String description; 
        private String hostName; 
        private String zoneId; 
        private String ioOptimized; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private Boolean enableVmOsConfig; 
        private String ramRoleName; 
        private Integer spotDuration; 
        private String resourceGroupId; 
        private Integer ipv6AddressCount; 
        private String deploymentSetId; 
        private String instanceType; 
        private String imageOwnerAlias; 
        private String networkType; 
        private String autoReleaseTime; 
        private java.util.List < String > securityGroupIds; 
        private String vSwitchId; 
        private Float spotPriceLimit; 
        private String userData; 
        private String keyPairName; 
        private String securityGroupId; 
        private String securityEnhancementStrategy; 
        private String launchTemplateId; 
        private String spotStrategy; 
        private String imageId; 
        private Integer internetMaxBandwidthOut; 
        private Integer internetMaxBandwidthIn; 
        private Integer period; 
        private String privateIpAddress; 

        private Builder() {
            super();
        } 

        private Builder(CreateLaunchTemplateVersionRequest response) {
            super(response);
            this.systemDisk = response.systemDisk;
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.passwordInherit = response.passwordInherit;
            this.dataDisk = response.dataDisk;
            this.networkInterface = response.networkInterface;
            this.tag = response.tag;
            this.regionId = response.regionId;
            this.launchTemplateName = response.launchTemplateName;
            this.versionDescription = response.versionDescription;
            this.vpcId = response.vpcId;
            this.instanceName = response.instanceName;
            this.description = response.description;
            this.hostName = response.hostName;
            this.zoneId = response.zoneId;
            this.ioOptimized = response.ioOptimized;
            this.instanceChargeType = response.instanceChargeType;
            this.internetChargeType = response.internetChargeType;
            this.enableVmOsConfig = response.enableVmOsConfig;
            this.ramRoleName = response.ramRoleName;
            this.spotDuration = response.spotDuration;
            this.resourceGroupId = response.resourceGroupId;
            this.ipv6AddressCount = response.ipv6AddressCount;
            this.deploymentSetId = response.deploymentSetId;
            this.instanceType = response.instanceType;
            this.imageOwnerAlias = response.imageOwnerAlias;
            this.networkType = response.networkType;
            this.autoReleaseTime = response.autoReleaseTime;
            this.securityGroupIds = response.securityGroupIds;
            this.vSwitchId = response.vSwitchId;
            this.spotPriceLimit = response.spotPriceLimit;
            this.userData = response.userData;
            this.keyPairName = response.keyPairName;
            this.securityGroupId = response.securityGroupId;
            this.securityEnhancementStrategy = response.securityEnhancementStrategy;
            this.launchTemplateId = response.launchTemplateId;
            this.spotStrategy = response.spotStrategy;
            this.imageId = response.imageId;
            this.internetMaxBandwidthOut = response.internetMaxBandwidthOut;
            this.internetMaxBandwidthIn = response.internetMaxBandwidthIn;
            this.period = response.period;
            this.privateIpAddress = response.privateIpAddress;
        } 

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
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
         * PasswordInherit.
         */
        public Builder passwordInherit(Boolean passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
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
         * The description of the instance launch template version. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         */
        public Builder versionDescription(String versionDescription) {
            this.putQueryParameter("VersionDescription", versionDescription);
            this.versionDescription = versionDescription;
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
         * The hostname of the ECS instance.
         * <p>
         * 
         * -Periods (.) and hyphens (-) cannot be used as start and end characters, and cannot be used consecutively.
         * -Windows instance: the name must be 2 to 15 characters in length and cannot contain periods (.). It can contain uppercase and lowercase letters, digits, and hyphens (-).
         * -Other types of instances (such as Linux): The name must be 2 to 64 characters in length and can contain multiple periods (.), A period between half periods can be a paragraph. Each period can contain uppercase and lowercase letters, digits, and hyphens (-).
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
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
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * <props="china">
         * -PrePaid: subscription. When you select this billing method, make sure that your account supports balance payment and credit payment. Otherwise, an error message "InvalidPayMethod" is returned.
         * -PostPaid: pay-as-you-go.
         * 
         * </props>
         * <props="intl">
         * -PrePaid: subscription. When you select this billing method, you must ensure that your account supports credit payment. Otherwise, the error message "InvalidPayMethod" is returned.
         * -PostPaid: pay-as-you-go.
         * 
         * </props>
         * <props="partner">
         * -PrePaid: subscription. When you select this billing method, you must ensure that your account supports credit payment. Otherwise, the error message "InvalidPayMethod" is returned.
         * -PostPaid: pay-as-you-go.
         * 
         * </props>
         * 
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The billing method of Outbound Internet bandwidth. Valid values:
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
         * Specifies whether to enable instance operating system configuration.
         */
        public Builder enableVmOsConfig(Boolean enableVmOsConfig) {
            this.putQueryParameter("EnableVmOsConfig", enableVmOsConfig);
            this.enableVmOsConfig = enableVmOsConfig;
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
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The ID of the deployment set.
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * The type of the instance. For more information, see [instance type family](~~ 25378 ~~). You can also call the [DescribeInstanceTypes](~~ 25620 ~~) API to obtain the latest specifications.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The source of the image.
         * <p>
         * > This parameter will be deprecated soon. To improve compatibility, try to use other parameters.
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
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
         * One or more security groups to which the instance belongs. The value range of N depends on the number of security groups that the instance can join. For more information, see [limits](~~ 25412 ~~).
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
         * You must specify the vSwitch ID when creating a VPC-type instance.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * Set the maximum hourly price for an instance. A maximum of three decimal places are supported.
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
            this.spotPriceLimit = spotPriceLimit;
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
         * The ID of the security group to which the new instance belongs. Instances in the same security group can access each other.
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
         * The ID of the launch template. For more information, call [DescribeLaunchTemplates](~~ 73759 ~~). You must specify "LaunchTemplateId" or "LaunchTemplateName" to determine the launch template.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * Quantity instance preemption strategy. This parameter takes effect only when the value of "InstanceChargeType" is "PostPaid. Valid values:
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
         * The ID of the image. You can use [DescribeImages](~~ 25534 ~~) to query the available image resources.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
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
         * The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
         * <p>
         * 
         * -When the purchased internet outbound bandwidth is less than or equal to 10Mbit/s: 1 to 10, the default value is 10.
         * -When purchased public outlet bandwidth greater than 10mbit/s: 1 ~ "internetmaxbandwidthout" value, default for "internetmaxbandwidthout" value.
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        /**
         * Buy resources length, unit for: month. When the parameter "instancechargetype" value for "prepaid" when the parameter came into force only and required value. Value range: {"1", "2", "3", "4", "5", "6", "7", "8", "9", "12", "24", "36", "48", "60"}.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * Instance private network IP ADDRESS.
         * <p>
         * 
         * Proprietary Network VPC type ECS instance settings private network IP ADDRESS, must from virtual switch ("vswitchid") of free segment in Selector.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        @Override
        public CreateLaunchTemplateVersionRequest build() {
            return new CreateLaunchTemplateVersionRequest(this);
        } 

    } 

    public static class SystemDisk extends TeaModel {
        @NameInMap("Iops")
        private Integer iops;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Category")
        private String category;

        @NameInMap("Description")
        private String description;

        @NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @NameInMap("Size")
        private Integer size;

        private SystemDisk(Builder builder) {
            this.iops = builder.iops;
            this.diskName = builder.diskName;
            this.performanceLevel = builder.performanceLevel;
            this.category = builder.category;
            this.description = builder.description;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.size = builder.size;
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
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deleteWithInstance
         */
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private Integer iops; 
            private String diskName; 
            private String performanceLevel; 
            private String category; 
            private String description; 
            private Boolean deleteWithInstance; 
            private Integer size; 

            /**
             * Iops.
             */
            public Builder iops(Integer iops) {
                this.iops = iops;
                return this;
            }

            /**
             * System disk name. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
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
             * System disk description. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
             */
            public Builder description(String description) {
                this.description = description;
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

            public SystemDisk build() {
                return new SystemDisk(this);
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
             * 实例描述。长度为2~256个英文或中文字符，不能以`http://`或`https://`开头。
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
             * -   cloud：5~2000。
             * -   cloud_efficiency：20~32768。
             * -   cloud_ssd：20~32768。
             * -   cloud_essd：20~32768。
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
             * 数据盘N的云盘种类。取值范围：
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
             * 辅助弹性网卡所属的虚拟交换机ID。实例与辅助弹性网卡必须在同一VPC的同一可用区中，可以分属于不同交换机。`NetworkInterface.N`的N取值不能大于1。
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
             * 实例、块存储和主网卡的标签键。N的取值范围：1~5。一旦传入该值，则不允许为空字符串。最多支持64个字符，不能以`aliyun`或`acs:`开头，不能包含`http://`或`https://`。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 实例、块存储和主网卡的标签值。N的取值范围：1~5。一旦传入该值，可以为空字符串。最多支持128个字符，不能以`aliyun`或`acs:`开头，不能包含`http://`或`https://`。
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
