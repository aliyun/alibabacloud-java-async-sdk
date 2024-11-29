// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateLaunchTemplateVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateLaunchTemplateVersionRequest</p>
 */
public class CreateLaunchTemplateVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoReleaseTime")
    private String autoReleaseTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreditSpecification")
    private String creditSpecification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableVmOsConfig")
    private Boolean enableVmOsConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpEndpoint")
    private String httpEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpPutResponseHopLimit")
    private Integer httpPutResponseHopLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpTokens")
    private String httpTokens;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthIn")
    private Integer internetMaxBandwidthIn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoOptimized")
    private String ioOptimized;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateName")
    private String launchTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterface")
    private java.util.List < NetworkInterface> networkInterface;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordInherit")
    private Boolean passwordInherit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamRoleName")
    private String ramRoleName;

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
    @com.aliyun.core.annotation.NameInMap("SecurityEnhancementStrategy")
    private String securityEnhancementStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotDuration")
    private Integer spotDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
    @com.aliyun.core.annotation.Validation(maximum = 999999)
    private Float spotPriceLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionDescription")
    private String versionDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateLaunchTemplateVersionRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.autoReleaseTime = builder.autoReleaseTime;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.creditSpecification = builder.creditSpecification;
        this.dataDisk = builder.dataDisk;
        this.deletionProtection = builder.deletionProtection;
        this.deploymentSetId = builder.deploymentSetId;
        this.description = builder.description;
        this.enableVmOsConfig = builder.enableVmOsConfig;
        this.hostName = builder.hostName;
        this.httpEndpoint = builder.httpEndpoint;
        this.httpPutResponseHopLimit = builder.httpPutResponseHopLimit;
        this.httpTokens = builder.httpTokens;
        this.imageId = builder.imageId;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.ioOptimized = builder.ioOptimized;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.keyPairName = builder.keyPairName;
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateName = builder.launchTemplateName;
        this.networkInterface = builder.networkInterface;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.passwordInherit = builder.passwordInherit;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.privateIpAddress = builder.privateIpAddress;
        this.ramRoleName = builder.ramRoleName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupIds = builder.securityGroupIds;
        this.spotDuration = builder.spotDuration;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.spotStrategy = builder.spotStrategy;
        this.tag = builder.tag;
        this.userData = builder.userData;
        this.vSwitchId = builder.vSwitchId;
        this.versionDescription = builder.versionDescription;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
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
     * @return autoReleaseTime
     */
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return creditSpecification
     */
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    /**
     * @return dataDisk
     */
    public java.util.List < DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableVmOsConfig
     */
    public Boolean getEnableVmOsConfig() {
        return this.enableVmOsConfig;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return httpEndpoint
     */
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * @return httpPutResponseHopLimit
     */
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    /**
     * @return httpTokens
     */
    public String getHttpTokens() {
        return this.httpTokens;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return internetMaxBandwidthIn
     */
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return ipv6AddressCount
     */
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return launchTemplateName
     */
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * @return networkInterface
     */
    public java.util.List < NetworkInterface> getNetworkInterface() {
        return this.networkInterface;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
     * @return passwordInherit
     */
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
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
     * @return securityEnhancementStrategy
     */
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List < String > getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return spotDuration
     */
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    /**
     * @return spotPriceLimit
     */
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateLaunchTemplateVersionRequest, Builder> {
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private String autoReleaseTime; 
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private String creditSpecification; 
        private java.util.List < DataDisk> dataDisk; 
        private Boolean deletionProtection; 
        private String deploymentSetId; 
        private String description; 
        private Boolean enableVmOsConfig; 
        private String hostName; 
        private String httpEndpoint; 
        private Integer httpPutResponseHopLimit; 
        private String httpTokens; 
        private String imageId; 
        private String imageOwnerAlias; 
        private String instanceChargeType; 
        private String instanceName; 
        private String instanceType; 
        private String internetChargeType; 
        private Integer internetMaxBandwidthIn; 
        private Integer internetMaxBandwidthOut; 
        private String ioOptimized; 
        private Integer ipv6AddressCount; 
        private String keyPairName; 
        private String launchTemplateId; 
        private String launchTemplateName; 
        private java.util.List < NetworkInterface> networkInterface; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Boolean passwordInherit; 
        private Integer period; 
        private String periodUnit; 
        private String privateIpAddress; 
        private String ramRoleName; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityEnhancementStrategy; 
        private String securityGroupId; 
        private java.util.List < String > securityGroupIds; 
        private Integer spotDuration; 
        private Float spotPriceLimit; 
        private String spotStrategy; 
        private java.util.List < Tag> tag; 
        private String userData; 
        private String vSwitchId; 
        private String versionDescription; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLaunchTemplateVersionRequest request) {
            super(request);
            this.systemDisk = request.systemDisk;
            this.sourceRegionId = request.sourceRegionId;
            this.autoReleaseTime = request.autoReleaseTime;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.creditSpecification = request.creditSpecification;
            this.dataDisk = request.dataDisk;
            this.deletionProtection = request.deletionProtection;
            this.deploymentSetId = request.deploymentSetId;
            this.description = request.description;
            this.enableVmOsConfig = request.enableVmOsConfig;
            this.hostName = request.hostName;
            this.httpEndpoint = request.httpEndpoint;
            this.httpPutResponseHopLimit = request.httpPutResponseHopLimit;
            this.httpTokens = request.httpTokens;
            this.imageId = request.imageId;
            this.imageOwnerAlias = request.imageOwnerAlias;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.internetChargeType = request.internetChargeType;
            this.internetMaxBandwidthIn = request.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.ioOptimized = request.ioOptimized;
            this.ipv6AddressCount = request.ipv6AddressCount;
            this.keyPairName = request.keyPairName;
            this.launchTemplateId = request.launchTemplateId;
            this.launchTemplateName = request.launchTemplateName;
            this.networkInterface = request.networkInterface;
            this.networkType = request.networkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.passwordInherit = request.passwordInherit;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.privateIpAddress = request.privateIpAddress;
            this.ramRoleName = request.ramRoleName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityEnhancementStrategy = request.securityEnhancementStrategy;
            this.securityGroupId = request.securityGroupId;
            this.securityGroupIds = request.securityGroupIds;
            this.spotDuration = request.spotDuration;
            this.spotPriceLimit = request.spotPriceLimit;
            this.spotStrategy = request.spotStrategy;
            this.tag = request.tag;
            this.userData = request.userData;
            this.vSwitchId = request.vSwitchId;
            this.versionDescription = request.versionDescription;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
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
         * <p>The automatic release time of the instance. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <ul>
         * <li>If the value of <code>ss</code> is not <code>00</code>, the time is automatically rounded down to the nearest minute based on the value of <code>mm</code>.</li>
         * <li>The specified time must be at least 30 minutes later than the current time.</li>
         * <li>The specified time can be at most three years later than the current time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2018-01-01T12:05:00Z</p>
         */
        public Builder autoReleaseTime(String autoReleaseTime) {
            this.putQueryParameter("AutoReleaseTime", autoReleaseTime);
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal for the instance. This parameter is valid only if <code>InstanceChargeType</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The auto-renewal period of the instance. Valid values:</p>
         * <p>Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>The performance mode of the burstable instance. Valid values:</p>
         * <ul>
         * <li>Standard: the standard mode. For more information, see the &quot;Standard mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * <li>Unlimited: the unlimited mode. For more information, see the &quot;Unlimited mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder creditSpecification(String creditSpecification) {
            this.putQueryParameter("CreditSpecification", creditSpecification);
            this.creditSpecification = creditSpecification;
            return this;
        }

        /**
         * <p>The data disks.</p>
         */
        public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * <p>Specifies whether to enable release protection for the instance. This parameter specifies whether you can use the ECS console or call the <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a> operation to release the instance. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p> This parameter is applicable only to pay-as-you-go instances. The release protection feature can protect instances against manual releases, but not against automatic releases.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>The ID of the deployment set to which to deploy the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1brhwhoqinyjd6****</p>
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * <p>The description of the instance. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable the operating system configuration of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableVmOsConfig(Boolean enableVmOsConfig) {
            this.putQueryParameter("EnableVmOsConfig", enableVmOsConfig);
            this.enableVmOsConfig = enableVmOsConfig;
            return this;
        }

        /**
         * <p>The hostname of the instance.</p>
         * <ul>
         * <li>The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).</li>
         * <li>For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. It can contain letters, digits, and hyphens (-).</li>
         * <li>For instances that run other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testHostName</p>
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the access channel for instance metadata. Valid values:</p>
         * <ul>
         * <li>enabled</li>
         * <li>disabled</li>
         * </ul>
         * <p>Default value: enabled.</p>
         * <blockquote>
         * <p> For information about instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Obtain information about an ECS instance, such as instance attributes inside ECS instances from instance metadata service</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder httpEndpoint(String httpEndpoint) {
            this.putQueryParameter("HttpEndpoint", httpEndpoint);
            this.httpEndpoint = httpEndpoint;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.putQueryParameter("HttpPutResponseHopLimit", httpPutResponseHopLimit);
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully use the security hardening mode (IMDSv2) to access instance metadata. Valid values:</p>
         * <ul>
         * <li>optional: does not forcefully use the security hardening mode (IMDSv2).</li>
         * <li>required: forcefully uses the security hardening mode (IMDSv2). After you set this parameter to required, you cannot access instance metadata in normal mode.</li>
         * </ul>
         * <p>Default value: optional.</p>
         * <blockquote>
         * <p> For information about the modes of accessing instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Obtain information about an ECS instance, such as instance attributes inside ECS instances from instance metadata service</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>optional</p>
         */
        public Builder httpTokens(String httpTokens) {
            this.putQueryParameter("HttpTokens", httpTokens);
            this.httpTokens = httpTokens;
            return this;
        }

        /**
         * <p>The ID of the image to use to create the Elastic Compute Service (ECS) instance. You can call the <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> operation to query available images.</p>
         * 
         * <strong>example:</strong>
         * <p>win2008r2_64_ent_sp1_en-us_40G_alibase_20170915.vhd</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The source of the image.</p>
         * <blockquote>
         * <p>This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription. If you set this parameter to PrePaid, make sure that your account has sufficient credits. Otherwise, an <code>InvalidPayMethod</code> error is returned.</li>
         * <li>PostPaid: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The instance name. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-). The default value of this parameter is the <code>InstanceId</code> value.</p>
         * <p>When you create multiple ECS instances at a time, you can batch configure sequential names for the instances. The instance names can contain square brackets ([]) and commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential names or hostnames for multiple instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-node-[1,4]-alibabacloud</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>. You can also call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the most recent list of instance types.</p>
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
         * <p>The billing method for network usage. Default value: PayByTraffic. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth</li>
         * <li>PayByTraffic: pay-by-traffic</li>
         * </ul>
         * <blockquote>
         * <p>When the <strong>pay-by-traffic</strong> billing method for network usage is used, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the <strong>pay-by-bandwidth</strong> billing method for network usage.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
         * <ul>
         * <li>When the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of this parameter are 1 to 10 and the default value is 10.</li>
         * <li>If the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter range from 1 to the <code>InternetMaxBandwidthOut</code> value and the default value is the <code>InternetMaxBandwidthOut</code> value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * <p>Specifies whether to create an I/O optimized instance. Valid values:</p>
         * <ul>
         * <li>none: The instance is not I/O optimized.</li>
         * <li>optimized: creates an I/O optimized instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>optimized</p>
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * <p>The number of IPv6 addresses to randomly generate for the primary elastic network interface (ENI). Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * <p>The name of the key pair to bind to the instance.</p>
         * <ul>
         * <li>For Windows instances, this parameter is ignored The <code>Password</code> parameter is valid even if the KeyPairName parameter is specified.</li>
         * <li>For Linux instances, the password-based logon method is disabled by default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testKeyPairName</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The ID of the launch template. For more information, call the <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a> operation. You must specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to specify a launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-m5eiaupmvm2op9d****</p>
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * <p>The name of the launch template. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testLaunchTemplateName</p>
         */
        public Builder launchTemplateName(String launchTemplateName) {
            this.putQueryParameter("LaunchTemplateName", launchTemplateName);
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        /**
         * <p>The information of the elastic network interfaces (ENIs).</p>
         */
        public Builder networkInterface(java.util.List < NetworkInterface> networkInterface) {
            this.putQueryParameter("NetworkInterface", networkInterface);
            this.networkInterface = networkInterface;
            return this;
        }

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li>classic: classic network</li>
         * <li>vpc: VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
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
         * <p>Specifies whether to use the password that is preconfigured in the image. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p> If you specify PasswordInherit, you must leave Password empty and make sure that a password is preconfigured for the image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder passwordInherit(Boolean passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
            return this;
        }

        /**
         * <p>The subscription period of the instance. Unit: months. This parameter is valid and required only when <code>InstanceChargeType</code> is set to <code>PrePaid</code>. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription period. Valid values:</p>
         * <p>Month (default)</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The private IP address to assign to the instance.</p>
         * <p>To assign a private IP address to an instance of the VPC type, make sure that the IP address is an idle IP address within the CIDR block of the vSwitch specified by the <code>VSwitchId</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p><code>10.1.**.**</code></p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The name of the instance Resource Access Management (RAM) role. You can call the <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> operation provided by RAM to query the instance RAM roles that you created.</p>
         * 
         * <strong>example:</strong>
         * <p>testRamRoleName</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>The region ID of the command. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
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
         * <p>The ID of the resource group to which to assign the instance.</p>
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
         * <p>Specifies whether to enable security hardening for the operating system. Valid values:</p>
         * <ul>
         * <li>Active: Security hardening is enabled. This value is applicable only to public images.</li>
         * <li>Deactive: Security hardening is disabled. This value is available to all types of images.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
            this.putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }

        /**
         * <p>The ID of the security group to which to assign the ECS instance created based on the launch template version. Instances in the same security group can access each other.</p>
         * <blockquote>
         * <p> You cannot specify <code>SecurityGroupId</code> and <code>SecurityGroupIds.N</code> in the same request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sg-bp15ed6xe1yxeycg****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The ID of security group N to which to assign the instance. The valid values of N depend on the maximum number of security groups to which the instance can belong. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Quantity limits</a>.</p>
         * <blockquote>
         * <p>The <code>SecurityGroupId</code> parameter and the <code>SecurityGroupIds.N</code> parameter are mutually exclusive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sg-bp15ed6xe1yxeycg7****</p>
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * <p>The protection period of the preemptible instance. Unit: hours. Default value: 1. Valid values:</p>
         * <ul>
         * <li>1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
         * <li>0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
         * </ul>
         * <p>Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released. Preemptible instances are billed by second. We recommend that you specify a protection period based on your business requirements.</p>
         * <blockquote>
         * <p> This parameter takes effect only if SpotStrategy is set to SpotWithPriceLimit or SpotAsPriceGo.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * <p>The maximum hourly price of the preemptible instance. A maximum of three decimal places are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>0.97</p>
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * <p>The preemption policy for the pay-as-you-go instance. This parameter is valid only when the <code>InstanceChargeType</code> parameter is set to <code>PostPaid</code>. Default value: NoSpot. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instance is created as a pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instances of the compute node are preemptible instances. These types of instances have a specified maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * <p>The tags to add to the ECS instance, disks, and primary elastic network interface (ENI) created based on the launch template version.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The user data of the instance. The user data must be encoded in Base64. The maximum size of raw data is 32 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBl****</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which to connect the instance. This parameter is required if you specify the VpcId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1s5fnvk4gn2tws0****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The description of the launch template version. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testVersionDescription</p>
         */
        public Builder versionDescription(String versionDescription) {
            this.putQueryParameter("VersionDescription", versionDescription);
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) in which to create the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp12433upq1y5scen****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the zone to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateLaunchTemplateVersionRequest build() {
            return new CreateLaunchTemplateVersionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLaunchTemplateVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateLaunchTemplateVersionRequest</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private String encrypted;

        @com.aliyun.core.annotation.NameInMap("Iops")
        private Integer iops;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private SystemDisk(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.burstingEnabled = builder.burstingEnabled;
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.description = builder.description;
            this.diskName = builder.diskName;
            this.encrypted = builder.encrypted;
            this.iops = builder.iops;
            this.performanceLevel = builder.performanceLevel;
            this.provisionedIops = builder.provisionedIops;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        /**
         * @return burstingEnabled
         */
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return encrypted
         */
        public String getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return iops
         */
        public Integer getIops() {
            return this.iops;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return provisionedIops
         */
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String autoSnapshotPolicyId; 
            private Boolean burstingEnabled; 
            private String category; 
            private Boolean deleteWithInstance; 
            private String description; 
            private String diskName; 
            private String encrypted; 
            private Integer iops; 
            private String performanceLevel; 
            private Long provisionedIops; 
            private Integer size; 

            /**
             * <p>The ID of the automatic snapshot policy to apply to the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-bp1dgzpaxwc4load****</p>
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
             * <ul>
             * <li>true: encrypts the disk.</li>
             * <li>false: does not enable the performance burst feature.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * <p>The category of the system disk. Valid values:</p>
             * <ul>
             * <li>cloud: basic disk.</li>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_auto: Enterprise SSD (ESSD) AutoPL disk.</li>
             * <li>cloud_essd: ESSD. You can use <code>SystemDisk.PerformanceLevel</code> to set the performance level of the ESSD to use as the system disk.</li>
             * <li>cloud_essd_entry: ESSD Entry disk.</li>
             * </ul>
             * <p>For non-I/O optimized instances of retired instance types, the default value is cloud. For other types of instances, the default value is cloud_efficiency.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Specifies whether to release the system disk when the instance is released. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * <p>The description of the system disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testSystemDiskDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the system disk. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssdSystem</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the system disk. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false</p>
             * <blockquote>
             * <p>You cannot encrypt system disks when you create instances in Hong Kong Zone D or Singapore Zone A.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30000</p>
             */
            public Builder iops(Integer iops) {
                this.iops = iops;
                return this;
            }

            /**
             * <p>The performance level of the ESSD to be used as the system disk. Default value: PL0. Valid values:</p>
             * <ul>
             * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
             * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
             * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
             * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * <p>For more information about ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk to use as data disk N. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}</p>
             * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}</p>
             * <blockquote>
             * <p>This parameter is available only if you set the Category parameter to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a> and <a href="https://help.aliyun.com/document_detail/413275.html">Modify the performance configurations of an ESSD AutoPL disk</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GiB. Valid values:</p>
             * <ul>
             * <li>Valid values if you set SystemDisk.Category to cloud: 20 to 500.</li>
             * <li>Valid values if you set SystemDisk.Category to other disk categories: 20 to 2048.</li>
             * </ul>
             * <p>The value of this parameter must be at least 20 and greater than or equal to the size of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
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
    /**
     * 
     * {@link CreateLaunchTemplateVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateLaunchTemplateVersionRequest</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private String encrypted;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        private DataDisk(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.burstingEnabled = builder.burstingEnabled;
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.description = builder.description;
            this.device = builder.device;
            this.diskName = builder.diskName;
            this.encrypted = builder.encrypted;
            this.performanceLevel = builder.performanceLevel;
            this.provisionedIops = builder.provisionedIops;
            this.size = builder.size;
            this.snapshotId = builder.snapshotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        /**
         * @return burstingEnabled
         */
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return encrypted
         */
        public String getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return provisionedIops
         */
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public static final class Builder {
            private String autoSnapshotPolicyId; 
            private Boolean burstingEnabled; 
            private String category; 
            private Boolean deleteWithInstance; 
            private String description; 
            private String device; 
            private String diskName; 
            private String encrypted; 
            private String performanceLevel; 
            private Long provisionedIops; 
            private Integer size; 
            private String snapshotId; 

            /**
             * <p>The ID of the automatic snapshot policy to apply to data disk N.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-bp67acfmxazb4p****</p>
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the performance burst feature for data disk N. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * <p>The category of data disk N. Valid values:</p>
             * <ul>
             * <li>cloud: basic disk.</li>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_auto: ESSD AutoPL disk.</li>
             * <li>cloud_essd: ESSD.</li>
             * <li>cloud_essd_entry: ESSD Entry disk.</li>
             * </ul>
             * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Specifies whether to release data disk N when the instance is released. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * <p>The description of data disk N. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testDataDiskDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The mount point of data disk N. The mount points are named based on the number of data disks:</p>
             * <ul>
             * <li>1st to 25th data disks: /dev/xvd<code>[b-z]</code>.</li>
             * <li>From the 26th data disk on: /dev/xvd<code>[aa-zz]</code>. For example, the 26th data disk is named /dev/xvdaa, the 27th data disk is named /dev/xvdab, and so on.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is applicable to scenarios in which a full image is used to create instances. A full image is an image that contains an operating system, application software, and business data. For these scenarios, you can set the parameter to the mount point of data disk N contained in the full image and modify <code>DataDisk.N.Size</code> and <code>DataDisk.N.Category</code> to change the category and size of data disk N created based on the image.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The name of data disk N. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, letters, colons (:), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>testDataDiskName</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt data disk N.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The performance level of the ESSD to use as data disk N. The value of N must be the same as that in <code>DataDisk.N.Category</code> when DataDisk.N.Category is set to cloud_essd. Valid values:</p>
             * <ul>
             * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
             * <li>PL1 (default): A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
             * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
             * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * <p>For information about ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
             * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
             * <blockquote>
             * <p> This parameter is available only if you set DiskCategory to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a> and <a href="https://help.aliyun.com/document_detail/413275.html">Modify the performance configurations of an ESSD AutoPL disk</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * <p>The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:</p>
             * <ul>
             * <li><p>Valid values if you set DataDisk.N.Category to cloud: 5 to 2000.</p>
             * </li>
             * <li><p>Valid values if you set DataDisk.N.Category to cloud_efficiency: 20 to 32768.</p>
             * </li>
             * <li><p>Valid values if you set DataDisk.N.Category to cloud_ssd: 20 to 32768.</p>
             * </li>
             * <li><p>Valid values if you set DataDisk.N.Category to cloud_essd: vary based on the <code>DataDisk.N.PerformanceLevel</code> value.</p>
             * <ul>
             * <li>Valid values if you set DataDisk.N.PerformanceLevel to PL0: 1 to 32768.</li>
             * <li>Valid values if you set DataDisk.N.PerformanceLevel to PL1: 20 to 32768.</li>
             * <li>Valid values if you set DataDisk.N.PerformanceLevel to PL2: 461 to 32768.</li>
             * <li>Valid values if you set DataDisk.N.PerformanceLevel to PL3: 1261 to 32768.</li>
             * </ul>
             * </li>
             * <li><p>Valid values if you set DataDisk.N.Category to cloud_auto: 1 to 32768.</p>
             * </li>
             * <li><p>Valid values if you set DataDisk.N.Category to cloud_essd_entry: 10 to 32768.</p>
             * </li>
             * </ul>
             * <p>The value of this parameter must be greater than or equal to the size of the snapshot specified by <code>SnapshotId</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The ID of the snapshot to use to create data disk N. Valid values of N: 1 to 16. When <code>DataDisk.N.SnapshotId</code> is specified, <code>DataDisk.N.Size</code> is ignored. The data disk is created with the size of the specified snapshot.</p>
             * <p>Use snapshots created after July 15, 2013. Otherwise, an error is returned and your request is rejected.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp17441ohwka0yuh****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateLaunchTemplateVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateLaunchTemplateVersionRequest</p>
     */
    public static class NetworkInterface extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceName")
        private String networkInterfaceName;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @com.aliyun.core.annotation.NameInMap("PrimaryIpAddress")
        private String primaryIpAddress;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List < String > securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private NetworkInterface(Builder builder) {
            this.description = builder.description;
            this.instanceType = builder.instanceType;
            this.networkInterfaceName = builder.networkInterfaceName;
            this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
            this.primaryIpAddress = builder.primaryIpAddress;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterface create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return networkInterfaceName
         */
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        /**
         * @return networkInterfaceTrafficMode
         */
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        /**
         * @return primaryIpAddress
         */
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
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

        public static final class Builder {
            private String description; 
            private String instanceType; 
            private String networkInterfaceName; 
            private String networkInterfaceTrafficMode; 
            private String primaryIpAddress; 
            private String securityGroupId; 
            private java.util.List < String > securityGroupIds; 
            private String vSwitchId; 

            /**
             * <p>The description of the secondary ENI. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>. The value of N in <code>NetworkInterface.N</code> cannot be greater than 1.</p>
             * 
             * <strong>example:</strong>
             * <p>testNetworkInterfaceDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The type of ENI N. Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Primary</li>
             * <li>Secondary</li>
             * </ul>
             * <p>Default value: Secondary.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g5.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The name of the secondary ENI. The value of N in <code>NetworkInterface.N</code> cannot be greater than 1.</p>
             * 
             * <strong>example:</strong>
             * <p>testNetworkInterfaceName</p>
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * <p>The communication mode of the primary ENI. Valid values:</p>
             * <ul>
             * <li>Standard: uses the TCP communication mode.</li>
             * <li>HighPerformance: uses the remote direct memory access (RDMA) communication mode with Elastic RDMA Interface (ERI) enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * <p>The primary private IP address of the secondary ENI. The value of N in <code>NetworkInterface.N</code> cannot be greater than 1.</p>
             * 
             * <strong>example:</strong>
             * <p><code>192.168.**.**</code></p>
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
                return this;
            }

            /**
             * <p>The ID of the security group to which to assign the secondary ENI. The security groups of the secondary ENI and of the instance must belong to the same VPC. The value of N in <code>NetworkInterface.N</code> cannot be greater than 1.</p>
             * <blockquote>
             * <p> You cannot specify both <code>NetworkInterface.N.SecurityGroupId</code> and <code>NetworkInterface.N.SecurityGroupIds.N</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>sg-bp15ed6xe1yxeycg****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The IDs of the security groups to which to assign the secondary ENI. The security group and the secondary ENI must belong to the same VPC. The valid values of N in <code>SecurityGroupIds.N</code> vary based on the maximum number of security groups to which a secondary ENI can belong. For more information, see the &quot;Security group limits&quot; section in <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>. The value of N in <code>NetworkInterface.N</code> cannot be greater than 1.</p>
             * <blockquote>
             * <p> You cannot specify both <code>NetworkInterface.N.SecurityGroupId</code> and <code>NetworkInterface.N.SecurityGroupIds.N</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>sg-bp67acfmxazb4p****</p>
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which to connect the secondary ENI. The instance and the secondary ENI must reside in the same zone of the same VPC, but they can be connected to different vSwitches. The value of N in <code>NetworkInterface.N</code> cannot be greater than 1.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1s5fnvk4gn2tws0****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public NetworkInterface build() {
                return new NetworkInterface(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateLaunchTemplateVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateLaunchTemplateVersionRequest</p>
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
             * <p>The key of tag N to add to the ECS instance, disks, and primary ENI created based on the launch template version. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N to add to the ECS instance, disks, and primary ENI created based on the launch template version. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
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
