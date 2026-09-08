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
 * {@link CreateLaunchTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateLaunchTemplateRequest</p>
 */
public class CreateLaunchTemplateRequest extends Request {
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
    private java.util.List<DataDisk> dataDisk;

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
    @com.aliyun.core.annotation.NameInMap("ImageOptions")
    private ImageOptions imageOptions;

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
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String launchTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterface")
    private java.util.List<NetworkInterface> networkInterface;

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
    private java.util.List<String> securityGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityOptions")
    private SecurityOptions securityOptions;

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
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateResourceGroupId")
    private String templateResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateTag")
    private java.util.List<TemplateTag> templateTag;

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

    private CreateLaunchTemplateRequest(Builder builder) {
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
        this.imageOptions = builder.imageOptions;
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
        this.securityOptions = builder.securityOptions;
        this.spotDuration = builder.spotDuration;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.spotStrategy = builder.spotStrategy;
        this.tag = builder.tag;
        this.templateResourceGroupId = builder.templateResourceGroupId;
        this.templateTag = builder.templateTag;
        this.userData = builder.userData;
        this.vSwitchId = builder.vSwitchId;
        this.versionDescription = builder.versionDescription;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
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
    public java.util.List<DataDisk> getDataDisk() {
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
     * @return imageOptions
     */
    public ImageOptions getImageOptions() {
        return this.imageOptions;
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
     * @return launchTemplateName
     */
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * @return networkInterface
     */
    public java.util.List<NetworkInterface> getNetworkInterface() {
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
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return securityOptions
     */
    public SecurityOptions getSecurityOptions() {
        return this.securityOptions;
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
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return templateResourceGroupId
     */
    public String getTemplateResourceGroupId() {
        return this.templateResourceGroupId;
    }

    /**
     * @return templateTag
     */
    public java.util.List<TemplateTag> getTemplateTag() {
        return this.templateTag;
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

    public static final class Builder extends Request.Builder<CreateLaunchTemplateRequest, Builder> {
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private String autoReleaseTime; 
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private String creditSpecification; 
        private java.util.List<DataDisk> dataDisk; 
        private Boolean deletionProtection; 
        private String deploymentSetId; 
        private String description; 
        private Boolean enableVmOsConfig; 
        private String hostName; 
        private String httpEndpoint; 
        private Integer httpPutResponseHopLimit; 
        private String httpTokens; 
        private String imageId; 
        private ImageOptions imageOptions; 
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
        private String launchTemplateName; 
        private java.util.List<NetworkInterface> networkInterface; 
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
        private java.util.List<String> securityGroupIds; 
        private SecurityOptions securityOptions; 
        private Integer spotDuration; 
        private Float spotPriceLimit; 
        private String spotStrategy; 
        private java.util.List<Tag> tag; 
        private String templateResourceGroupId; 
        private java.util.List<TemplateTag> templateTag; 
        private String userData; 
        private String vSwitchId; 
        private String versionDescription; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLaunchTemplateRequest request) {
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
            this.imageOptions = request.imageOptions;
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
            this.securityOptions = request.securityOptions;
            this.spotDuration = request.spotDuration;
            this.spotPriceLimit = request.spotPriceLimit;
            this.spotStrategy = request.spotStrategy;
            this.tag = request.tag;
            this.templateResourceGroupId = request.templateResourceGroupId;
            this.templateTag = request.templateTag;
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
         * <p>The automatic release time. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <ul>
         * <li><p>If the value of seconds (<code>ss</code>) is not <code>00</code>, the time is automatically rounded down to the start of the current minute (<code>mm</code>).</p>
         * </li>
         * <li><p>The earliest release time is 30 minutes after the current time.</p>
         * </li>
         * <li><p>The latest release time cannot be more than three years from the current time.</p>
         * </li>
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
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li>true: Auto-renewal is enabled.</li>
         * <li>false: Auto-renewal is disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <code>InstanceChargeType</code> is set to <code>PrePaid</code>.</p>
         * </blockquote>
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
         * <p>The auto-renewal period. Valid values: </p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>If PeriodUnit is set to Week: 1, 2, and 3.</li>
         * <li>If PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;If PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
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
         * <p>The running mode of the burstable instance. Valid values:</p>
         * <ul>
         * <li>Standard: standard mode. For more information, see the performance constrained mode section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * <li>Unlimited: unlimited mode. For more information, see the unlimited mode section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
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
         * <p>The list of data disk configurations.</p>
         */
        public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * <p>The release protection property of the instance. Specifies whether the instance can be released from the console or by calling <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a>. Valid values:</p>
         * <ul>
         * <li><p>true: Release protection is enabled.</p>
         * </li>
         * <li><p>false: Release protection is disabled.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>This property applies only to pay-as-you-go instances and can only restrict manual release operations. System-initiated release operations are not affected.</p>
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
         * <p>The ID of the deployment set.</p>
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
         * <p>testECSDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable the operating system configuration of the instance.</p>
         * <blockquote>
         * <p>This parameter will be deprecated. Use other parameters for better compatibility.</p>
         * </blockquote>
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
         * <p>The hostname of the Elastic Compute Service server.</p>
         * <ul>
         * <li>The hostname cannot start or end with a period (.) or a hyphen (-), and cannot contain consecutive periods or hyphens.</li>
         * <li>Windows instances: The hostname must be 2 to 15 characters in length and cannot contain periods (.) or consist entirely of digits. The hostname can contain letters, digits, and hyphens (-).</li>
         * <li>Other instances (such as Linux): The hostname must be 2 to 64 characters in length and can contain multiple periods (.). Each segment separated by a period can contain letters, digits, and hyphens (-).</li>
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
         * <li>enabled: The access channel is enabled.</li>
         * <li>disabled: The access channel is disabled.</li>
         * </ul>
         * <p>Default value: enabled.</p>
         * <blockquote>
         * <p>For more information about instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Overview of ECS instance metadata</a>.</p>
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
         * <p>This parameter is not publicly available.</p>
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
         * <p>Specifies whether to forcefully use the security-hardened mode (IMDSv2) to access instance metadata. Valid values:</p>
         * <ul>
         * <li>optional: The security-hardened mode is not forcefully used.</li>
         * <li>required: The security-hardened mode is forcefully used. After you set this value, instance metadata cannot be accessed in normal mode.</li>
         * </ul>
         * <p>Default value: optional.</p>
         * <blockquote>
         * <p>For more information about the modes for accessing instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Overview of instance metadata</a>.</p>
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
         * <p>The image ID. You can call <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> to query available image resources.</p>
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
         * <p>The image-related property information.</p>
         */
        public Builder imageOptions(ImageOptions imageOptions) {
            this.putQueryParameter("ImageOptions", imageOptions);
            this.imageOptions = imageOptions;
            return this;
        }

        /**
         * <p>The source of the image. Valid values:</p>
         * <ul>
         * <li>system: public images provided by Alibaba Cloud.</li>
         * <li>self: custom images that you created.</li>
         * <li>others: shared images from other Alibaba Cloud accounts.</li>
         * <li>marketplace: images available from &lt;props=&quot;china&quot;&gt;<ph><a href="https://market.aliyun.com/">Alibaba Cloud Marketplace</a></ph>&lt;props=&quot;intl&quot;&gt;<ph><a href="https://marketplace.alibabacloud.com/">Alibaba Cloud Marketplace</a></ph>. You can use Alibaba Cloud Marketplace images directly without subscribing to them first. Check the billing details of the Alibaba Cloud Marketplace image on your own.</li>
         * </ul>
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
         * <li>PrePaid: subscription. If you set this parameter to PrePaid, &lt;props=&quot;china&quot;&gt;<ph>confirm that your account supports balance payments and credit payments</ph>&lt;props=&quot;intl&quot;&gt;<ph>confirm that your account supports credit payments</ph>. Otherwise, an <code>InvalidPayMethod</code> error is returned.</li>
         * <li>PostPaid: pay-as-you-go.</li>
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
         * <p>The name of the instance. The name must be 2 to 128 characters in length and can contain letters, digits, and other characters in the Unicode letter category. The name can contain colons (:), underscores (_), periods (.), and hyphens (-). The default value is the <code>InstanceId</code> of the instance.</p>
         * <p>When you create multiple ECS instances, you can specify sequential instance names. The names can contain brackets ([]) and commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Specify sequential instance names or hostnames</a>.</p>
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
         * <p>The instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>. You can also invoke <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the most recent instance type list.</p>
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
         * <p>The billing method for network usage. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth.</li>
         * <li>PayByTraffic: pay-by-traffic.</li>
         * </ul>
         * <blockquote>
         * <p>In <strong>pay-by-traffic</strong> mode, the peak inbound and outbound bandwidths are both upper limits and are not guaranteed. When resource contention occurs, the peak bandwidth may be throttled. If your workloads require guaranteed bandwidth, use the <strong>pay-by-bandwidth</strong> mode.</p>
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
         * <li>If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s: 1 to 10. Default value: 10.</li>
         * <li>If the purchased outbound public bandwidth is greater than 10 Mbit/s: 1 to the value of <code>InternetMaxBandwidthOut</code>. Default value: the value of <code>InternetMaxBandwidthOut</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>10</p>
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * <p>Specifies whether the instance is I/O optimized. Valid values:</p>
         * <ul>
         * <li>none: The instance is not I/O optimized.</li>
         * <li>optimized: The instance is I/O optimized.</li>
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
         * <p>The number of randomly generated IPv6 addresses to assign to the primary ENI. Valid values: 1 to 10.</p>
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
         * <p>The name of the SSH key pair.</p>
         * <ul>
         * <li>For Windows instances, this parameter is ignored. Even if you specify this parameter, only the <code>Password</code> content is used.</li>
         * <li>For Linux instances, password-based logon is disabled during initialization.</li>
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
         * <p>The name of the launch template. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
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
         * <p>The network interface controller (NIC) configurations.</p>
         */
        public Builder networkInterface(java.util.List<NetworkInterface> networkInterface) {
            this.putQueryParameter("NetworkInterface", networkInterface);
            this.networkInterface = networkInterface;
            return this;
        }

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li>classic: classic network. This feature has been retired. For more information, see <a href="https://help.aliyun.com/document_detail/2833134.html">Retirement notice</a>.</li>
         * <li>vpc: VPC.</li>
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
         * <p>Specifies whether to use the preset password of the image.</p>
         * <blockquote>
         * <p>When you use this parameter, the Password parameter must be empty. Make sure that the image you use has a password preset.</p>
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
         * <p>The subscription duration of the resource. Unit: months. This parameter takes effect and is required only when <code>InstanceChargeType</code> is set to <code>PrePaid</code>. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
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
         * <p>The unit of the subscription duration. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>Week.</li>
         * <li>Month (default).</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;Month (default).</p>
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
         * <p>The private IP address of the instance.</p>
         * <p>When you set a private IP address for a VPC-connected ECS instance, the address must be from the idle CIDR block of the vSwitch specified by <code>VSwitchId</code>.</p>
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
         * <p>The name of the instance RAM role. You can call the RAM API <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> to query the instance RAM roles that you have created.</p>
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
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the instance, block storage devices, and Elastic Network Interfaces (ENIs) belong.</p>
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
         * <li>Deactive: Security hardening is disabled. This value is applicable to all image types.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deactive</p>
         */
        public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
            this.putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }

        /**
         * <p>The ID of the security group to which the new instance belongs. Instances in the same security group can communicate with each other. A security group can contain up to 1,000 instances.</p>
         * <blockquote>
         * <p>You cannot specify both <code>SecurityGroupId</code> and <code>SecurityGroupIds.N</code>.</p>
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
         * <p>The IDs of one or more security groups to which the instance belongs. The valid value range of N depends on the maximum number of security groups to which an instance can belong. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
         * <blockquote>
         * <p>You cannot specify both <code>SecurityGroupId</code> and <code>SecurityGroupIds.N</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sg-bp15ed6xe1yxeycg7****</p>
         */
        public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * <p>The security options.</p>
         */
        public Builder securityOptions(SecurityOptions securityOptions) {
            this.putQueryParameter("SecurityOptions", securityOptions);
            this.securityOptions = securityOptions;
            return this;
        }

        /**
         * <p>The protection period of the spot instance. Unit: hours. Default value: 1. Valid values:</p>
         * <ul>
         * <li>1: After a spot instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period, the system compares the bid price with the market price and checks resource inventory to determine whether to retain automatic release the instance.</li>
         * <li>0: After a spot instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks resource inventory to determine whether to retain automatic release the instance.</li>
         * </ul>
         * <p>Alibaba Cloud sends an ECS system event notification 5 minutes before the instance is released. Spot instances are billed by second. Set the protection period based on the expected task execution duration.</p>
         * <blockquote>
         * <p>This parameter takes effect when SpotStrategy is set to SpotWithPriceLimit or SpotAsPriceGo.</p>
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
         * <p>The maximum hourly price of the instance. This parameter supports up to three decimal places and takes effect when <code>SpotStrategy</code> is set to <code>SpotWithPriceLimit</code>.</p>
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
         * <p>The preemption policy for the pay-as-you-go instance. This parameter takes effect when <code>InstanceChargeType</code> is set to <code>PostPaid</code>. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instance is a regular pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instance is a spot instance with a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is a spot instance for which the market price at the time of purchase is automatically used as the bid price.</li>
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
         * <p>The tags for instances, disks, and primary ENIs created from this template version.</p>
         * <details>
         * <summary>Scenarios</summary>
         * After you call CreateLaunchTemplate to create a template, the auto-generated default version uses these tags to tag instances, disks, and primary ENIs when instances are created.
         * </details>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the launch template belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder templateResourceGroupId(String templateResourceGroupId) {
            this.putQueryParameter("TemplateResourceGroupId", templateResourceGroupId);
            this.templateResourceGroupId = templateResourceGroupId;
            return this;
        }

        /**
         * <p>The tag key-value pairs of the launch template itself.</p>
         * <blockquote>
         * <p>Currently, you can create and query tags for launch templates only by using API operations. The console does not support creating or viewing these tags.</p>
         * </blockquote>
         */
        public Builder templateTag(java.util.List<TemplateTag> templateTag) {
            this.putQueryParameter("TemplateTag", templateTag);
            this.templateTag = templateTag;
            return this;
        }

        /**
         * <p>The instance user data. The data must be Base64-encoded. The maximum size of the raw data is 32 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The vSwitch ID. This parameter is required when you create a VPC-connected instance.</p>
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
         * <p>The ID of the virtual private cloud (VPC).</p>
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
         * <p>The zone ID of the instance.</p>
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
        public CreateLaunchTemplateRequest build() {
            return new CreateLaunchTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLaunchTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateLaunchTemplateRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

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
            this.KMSKeyId = builder.KMSKeyId;
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
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
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
            private String KMSKeyId; 
            private String performanceLevel; 
            private Long provisionedIops; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(SystemDisk model) {
                this.autoSnapshotPolicyId = model.autoSnapshotPolicyId;
                this.burstingEnabled = model.burstingEnabled;
                this.category = model.category;
                this.deleteWithInstance = model.deleteWithInstance;
                this.description = model.description;
                this.diskName = model.diskName;
                this.encrypted = model.encrypted;
                this.iops = model.iops;
                this.KMSKeyId = model.KMSKeyId;
                this.performanceLevel = model.performanceLevel;
                this.provisionedIops = model.provisionedIops;
                this.size = model.size;
            } 

            /**
             * <p>The ID of the automatic snapshot policy applied to the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-gc7c37d4ylw7mtnk****</p>
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
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
             * <li>cloud_essd: enterprise SSD. You can use the <code>SystemDisk.PerformanceLevel</code> parameter to set the performance level of the disk.</li>
             * <li>cloud_auto: ESSD AutoPL disk.</li>
             * <li>cloud_essd_entry: ESSD Entry disk.</li>
             * </ul>
             * <p>For retired instance types that are not I/O optimized, the default value is cloud. Otherwise, the default value is cloud_efficiency.</p>
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
             * <li>true: The system disk is released together with the instance.</li>
             * <li>false: The system disk is not released together with the instance.</li>
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
             * <p>The name of the system disk. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>testSystemDiskName</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the system disk. Valid values:</p>
             * <ul>
             * <li>true: The system disk is encrypted.</li>
             * <li>false: The system disk is not encrypted.</li>
             * </ul>
             * <p>Default value: false.</p>
             * <blockquote>
             * <p>Zone D in Hong Kong (China) and Zone A in Singapore do not support system disk encryption during instance creation.</p>
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
             * <p>This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder iops(Integer iops) {
                this.iops = iops;
                return this;
            }

            /**
             * <p>The KMS key ID of the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * <p>The performance level of the enterprise SSD used as the system disk. Valid values:</p>
             * <ul>
             * <li>PL0 (default): a single disk can deliver up to 10,000 random read/write IOPS.</li>
             * <li>PL1: a single disk can deliver up to 50,000 random read/write IOPS.</li>
             * <li>PL2: a single disk can deliver up to 100,000 random read/write IOPS.</li>
             * <li>PL3: a single disk can deliver up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * <p>For information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline Performance}.</p>
             * <p>Baseline Performance = min{1,800 + 50 × Capacity, 50,000}</p>
             * <blockquote>
             * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a> and <a href="https://help.aliyun.com/document_detail/413275.html">Modify the provisioned performance of an ESSD AutoPL disk</a>.</p>
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
             * <li>cloud: 20 to 500.</li>
             * <li>Other disk categories: 20 to 2048.</li>
             * </ul>
             * <p>The value of this parameter must be greater than or equal to max{20, ImageSize}.</p>
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
     * {@link CreateLaunchTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateLaunchTemplateRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

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
            this.KMSKeyId = builder.KMSKeyId;
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
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
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
            private String KMSKeyId; 
            private String performanceLevel; 
            private Long provisionedIops; 
            private Integer size; 
            private String snapshotId; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.autoSnapshotPolicyId = model.autoSnapshotPolicyId;
                this.burstingEnabled = model.burstingEnabled;
                this.category = model.category;
                this.deleteWithInstance = model.deleteWithInstance;
                this.description = model.description;
                this.device = model.device;
                this.diskName = model.diskName;
                this.encrypted = model.encrypted;
                this.KMSKeyId = model.KMSKeyId;
                this.performanceLevel = model.performanceLevel;
                this.provisionedIops = model.provisionedIops;
                this.size = model.size;
                this.snapshotId = model.snapshotId;
            } 

            /**
             * <p>The ID of the automatic snapshot policy applied to the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-m5e7fa9ute44ssa****</p>
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
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
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_essd: enterprise SSD.</li>
             * <li>cloud: basic disk.</li>
             * <li>cloud_auto: ESSD AutoPL disk.</li>
             * <li>cloud_regional_disk_auto: regional ESSD.</li>
             * <li>cloud_essd_entry: ESSD Entry disk.<blockquote>
             * <p>The <code>cloud_essd_entry</code> value is supported only when <code>InstanceType</code> is set to an instance type in the <code>ecs.u1</code> or <code>ecs.e</code> family.</p>
             * </blockquote>
             * </li>
             * <li>elastic_ephemeral_disk_standard: elastic ephemeral disk - Standard.</li>
             * <li>elastic_ephemeral_disk_premium: elastic ephemeral disk - Premium Edition.</li>
             * </ul>
             * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.
             * Default value details:</p>
             * <ul>
             * <li>If InstanceType is set to a retired instance type that is not I/O optimized, the default parameter value is <code>cloud</code>.</li>
             * <li>In other cases, the default value is <code>cloud_efficiency</code>.&lt;props=&quot;china&quot;&gt;After January 30, 2026, if the I/O optimized instance type does not support cloud_auto, the default value is cloud_efficiency. Otherwise, the default value is cloud_auto, and the performance burst feature is enabled by default (which incurs additional fees. For details, see <a href="~~368372#p_75k_2hp_7gp~~">Billing examples</a>). For more information, see <a href="https://www.aliyun.com/notice/117844">Change notice</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Specifies whether the data disk is released when the instance is released. Valid values:</p>
             * <ul>
             * <li>true: The data disk is released together with the instance.</li>
             * <li>false: The data disk is not released together with the instance.</li>
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
             * <p>The description of the data disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testDataDiskDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The mount point of the data disk. The naming convention varies based on the number of data disks attached:</p>
             * <ul>
             * <li><p>1 to 25 data disks: /dev/xvd<code>[b-z]</code></p>
             * </li>
             * <li><p>More than 25 data disks: /dev/xvd<code>[aa-zz]</code>. For example, the 26th data disk is named /dev/xvdaa, the 27th data disk is named /dev/xvdab, and so on.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter is intended only for full image (system image) scenarios. You can set this parameter to the mount point of a data disk in the full image and modify the corresponding <code>DataDisk.N.Size</code> and <code>DataDisk.N.Category</code> parameters to change the disk category and size of the data disk in the full image.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/dev/xvdb</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The name of the data disk. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>testDataDiskName</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <p>Specifies whether the data disk is encrypted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The KMS key ID for the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d****</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * <p>The performance level of the enterprise SSD used as a data disk. The value of N must be the same as that in <code>DataDisk.N.Category=cloud_essd</code>. Valid values:</p>
             * <ul>
             * <li>PL0: a single disk can deliver up to 10,000 random read/write IOPS.</li>
             * <li>PL1 (default): a single disk can deliver up to 50,000 random read/write IOPS.</li>
             * <li>PL2: a single disk can deliver up to 100,000 random read/write IOPS.</li>
             * <li>PL3: a single disk can deliver up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * <p>For information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline Performance}.</p>
             * <p>Baseline Performance = min{1,800 + 50 × Capacity, 50,000}</p>
             * <blockquote>
             * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a> and <a href="https://help.aliyun.com/document_detail/413275.html">Modify the provisioned performance of an ESSD AutoPL disk</a>.</p>
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
             * <li>cloud: 5 to 2000.</li>
             * <li>cloud_efficiency: 20 to 32768.</li>
             * <li>cloud_ssd: 20 to 32768.</li>
             * <li>cloud_essd: The valid value range depends on the value of <code>DataDisk.N.PerformanceLevel</code>.<ul>
             * <li>PL0: 1 to 32768.</li>
             * <li>PL1: 20 to 32768.</li>
             * <li>PL2: 461 to 32768.</li>
             * <li>PL3: 1261 to 32768.</li>
             * </ul>
             * </li>
             * <li>cloud_auto: 1 to 32,768.</li>
             * <li>cloud_essd_entry: 10 to 32,768.</li>
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
             * <p>The snapshot ID used to create data disk N. Valid values of N: 1 to 16. After you specify <code>DataDisk.N.SnapshotId</code>, the <code>DataDisk.N.Size</code> parameter is ignored. The actual size of the created disk is the size of the specified snapshot.</p>
             * <blockquote>
             * <p>Snapshots created on or before July 15, 2013 cannot be used. Requests that use such snapshots are rejected.</p>
             * </blockquote>
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
     * {@link CreateLaunchTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateLaunchTemplateRequest</p>
     */
    public static class ImageOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoginAsNonRoot")
        private Boolean loginAsNonRoot;

        private ImageOptions(Builder builder) {
            this.loginAsNonRoot = builder.loginAsNonRoot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageOptions create() {
            return builder().build();
        }

        /**
         * @return loginAsNonRoot
         */
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

        public static final class Builder {
            private Boolean loginAsNonRoot; 

            private Builder() {
            } 

            private Builder(ImageOptions model) {
                this.loginAsNonRoot = model.loginAsNonRoot;
            } 

            /**
             * <p>Specifies whether instances that use this image support logon with the ecs-user account. Valid values:</p>
             * <ul>
             * <li>true: Supported.</li>
             * <li>false: Not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder loginAsNonRoot(Boolean loginAsNonRoot) {
                this.loginAsNonRoot = loginAsNonRoot;
                return this;
            }

            public ImageOptions build() {
                return new ImageOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateLaunchTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateLaunchTemplateRequest</p>
     */
    public static class NetworkInterface extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeleteOnRelease")
        private Boolean deleteOnRelease;

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
        private java.util.List<String> securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private NetworkInterface(Builder builder) {
            this.deleteOnRelease = builder.deleteOnRelease;
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
         * @return deleteOnRelease
         */
        public Boolean getDeleteOnRelease() {
            return this.deleteOnRelease;
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
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private Boolean deleteOnRelease; 
            private String description; 
            private String instanceType; 
            private String networkInterfaceName; 
            private String networkInterfaceTrafficMode; 
            private String primaryIpAddress; 
            private String securityGroupId; 
            private java.util.List<String> securityGroupIds; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(NetworkInterface model) {
                this.deleteOnRelease = model.deleteOnRelease;
                this.description = model.description;
                this.instanceType = model.instanceType;
                this.networkInterfaceName = model.networkInterfaceName;
                this.networkInterfaceTrafficMode = model.networkInterfaceTrafficMode;
                this.primaryIpAddress = model.primaryIpAddress;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupIds = model.securityGroupIds;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>Specifies whether to retain the ENI when the instance is released. Valid values:</p>
             * <ul>
             * <li><p>true: The ENI is not retained.</p>
             * </li>
             * <li><p>false: The ENI is retained.</p>
             * </li>
             * </ul>
             * <p>Default value: true.</p>
             * <blockquote>
             * <p>This parameter takes effect only for secondary ENIs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deleteOnRelease(Boolean deleteOnRelease) {
                this.deleteOnRelease = deleteOnRelease;
                return this;
            }

            /**
             * <p>The description of the secondary network interface controller (NIC). The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>. The value of N in <code>NetworkInterface.N</code> cannot be greater than 1.</p>
             * 
             * <strong>example:</strong>
             * <p>testEniDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The type of the network interface controller (NIC). Valid values of N: 1 to 2. If you set 1 NIC, you can set either a primary or secondary NIC. If you set 2 NICs, you must set one primary NIC and one secondary NIC.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Primary: primary NIC.</li>
             * <li>Secondary: secondary NIC.</li>
             * </ul>
             * <p>Default value: Secondary.</p>
             * 
             * <strong>example:</strong>
             * <p>Secondary</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The name of the network interface controller (NIC).</p>
             * <p>Note the following items:</p>
             * <ul>
             * <li><p>Valid values of N: 1 to 2. If you set 1 NIC, you can set either a primary or secondary NIC. If you set 2 NICs, you must set one primary NIC and one secondary NIC.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you do not need to set this parameter.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>testEniName</p>
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * <p>The communication mode of the primary ENI. Valid values:</p>
             * <ul>
             * <li>Standard: uses the TCP communication mode.</li>
             * <li>HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the RDMA communication mode.</li>
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
             * <p>Adds a network interface controller (NIC) and sets the primary IP address.</p>
             * <p>Note the following items:</p>
             * <ul>
             * <li><p>Valid values of N: 1 to 2.</p>
             * <ul>
             * <li>If you set 1 NIC, you can set either a primary or secondary NIC. If <code>Amount</code> is greater than 1 and you set a primary NIC with this parameter specified, the specified primary IP address is used as the starting address to sequentially allocate consecutive primary IP addresses to multiple ECS instances in batch. In this case, you cannot attach a secondary NIC to the instance.</li>
             * <li>If you set 2 NICs, you must set one primary NIC and one secondary NIC. If <code>Amount</code> is greater than 1 and this parameter is set for the primary NIC, you cannot set a secondary NIC (that is, you cannot set <code>NetworkInterface.2.InstanceType=Secondary</code>).</li>
             * </ul>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, this parameter has the same effect as <code>PrivateIpAddress</code>, but you cannot specify both this parameter and <code>PrivateIpAddress</code>.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter sets the primary IP address for the secondary NIC. By default, an IP address is randomly selected from the vSwitch CIDR block to which the NIC belongs.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>When you invoke the CreateLaunchTemplate operation, you can attach up to one secondary NIC. After the instance is created, you can call <a href="https://help.aliyun.com/document_detail/58504.html">CreateNetworkInterface</a> and <a href="https://help.aliyun.com/document_detail/58515.html">AttachNetworkInterface</a> to attach more secondary NICs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><code>192.168.**.**</code></p>
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
                return this;
            }

            /**
             * <p>The security group ID of the network interface controller (NIC).</p>
             * <p>Note the following items:</p>
             * <ul>
             * <li><p>Valid values of N: 1 to 2. If you set 1 NIC, you can set either a primary or secondary NIC. If you set 2 NICs, you must set one primary NIC and one secondary NIC.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, this parameter is required. This parameter has the same effect as <code>SecurityGroupId</code>, but you cannot specify <code>SecurityGroupId</code>, <code>SecurityGroupIds.N</code>, or <code>NetworkInterface.N.SecurityGroupIds.N</code> at the same time.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter is optional. Default value: the security group of the ECS instance.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sg-bp15ed6xe1yxeycg****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The IDs of one or more security groups to which the network interface controller (NIC) belongs.</p>
             * <ul>
             * <li>The first N has a valid value range of 1 to 2. If you set 1 NIC, you can set either a primary or secondary NIC. If you set 2 NICs, you must set one primary NIC and one secondary NIC.</li>
             * <li>The second N indicates that you can specify one or more security group IDs. The valid value range of N depends on the maximum number of security groups to which an instance can belong. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</li>
             * </ul>
             * <p>Note the following items:</p>
             * <ul>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you must set this parameter or <code>NetworkInterface.N.SecurityGroupId</code>. This parameter has the same effect as <code>SecurityGroupIds.N</code>, but you cannot specify <code>SecurityGroupId</code>, <code>SecurityGroupIds.N</code>, or <code>NetworkInterface.N.SecurityGroupId</code> at the same time.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter is optional. Default value: the security group of the ECS instance.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sg-bp67acfmxazb4p****</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The vSwitch ID of the network interface controller (NIC).</p>
             * <p>Note the following items:</p>
             * <ul>
             * <li><p>Valid values of N: 1 to 2. If you set 1 NIC, you can set either a primary or secondary NIC. If you set 2 NICs, you must set one primary NIC and one secondary NIC.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, this parameter is required. This parameter has the same effect as <code>VSwitchId</code>, but you cannot specify both this parameter and <code>VSwitchId</code>.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter is optional. Default value: the vSwitch of the ECS instance.</p>
             * </li>
             * </ul>
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
     * {@link CreateLaunchTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateLaunchTemplateRequest</p>
     */
    public static class SecurityOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableSecureBoot")
        private Boolean enableSecureBoot;

        @com.aliyun.core.annotation.NameInMap("TrustedSystemMode")
        private String trustedSystemMode;

        private SecurityOptions(Builder builder) {
            this.enableSecureBoot = builder.enableSecureBoot;
            this.trustedSystemMode = builder.trustedSystemMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityOptions create() {
            return builder().build();
        }

        /**
         * @return enableSecureBoot
         */
        public Boolean getEnableSecureBoot() {
            return this.enableSecureBoot;
        }

        /**
         * @return trustedSystemMode
         */
        public String getTrustedSystemMode() {
            return this.trustedSystemMode;
        }

        public static final class Builder {
            private Boolean enableSecureBoot; 
            private String trustedSystemMode; 

            private Builder() {
            } 

            private Builder(SecurityOptions model) {
                this.enableSecureBoot = model.enableSecureBoot;
                this.trustedSystemMode = model.trustedSystemMode;
            } 

            /**
             * EnableSecureBoot.
             */
            public Builder enableSecureBoot(Boolean enableSecureBoot) {
                this.enableSecureBoot = enableSecureBoot;
                return this;
            }

            /**
             * <p>The trusted system mode. Set the value to vTPM.</p>
             * <p>The following instance families support trusted system mode:</p>
             * <ul>
             * <li>g7, c7, and r7.</li>
             * <li>Enhanced instance families (g7t, c7t, and r7t).</li>
             * </ul>
             * <p>When you create ECS instances of the preceding instance types, you must set this parameter. Take note of the following items:</p>
             * <ul>
             * <li>If you use the Alibaba Cloud Trusted System, set this parameter to vTPM. The Alibaba Cloud Trusted System performs trusted verification when the instance starts.</li>
             * <li>If you do not use the Alibaba Cloud Trusted System, you do not need to set this parameter. However, if the ECS instance that you create uses the Enclave-based confidential computing mode (<code>SecurityOptions.ConfidentialComputingMode=Enclave</code>), the trusted system is also enabled for the instance.</li>
             * <li>When you use an OpenAPI operation to create a trusted ECS instance, you can invoke only <code>RunInstances</code>. <code>CreateInstance</code> does not support the <code>SecurityOptions.TrustedSystemMode</code> parameter.<blockquote>
             * <p>If you specify the instance as a trusted instance during creation, you can replace the system disk only with an image that supports the trusted system.</p>
             * </blockquote>
             * </li>
             * </ul>
             * <p>For more information about the trusted system, see <a href="https://help.aliyun.com/document_detail/201394.html">Overview of trusted features for security-enhanced instances</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>vTPM</p>
             */
            public Builder trustedSystemMode(String trustedSystemMode) {
                this.trustedSystemMode = trustedSystemMode;
                return this;
            }

            public SecurityOptions build() {
                return new SecurityOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateLaunchTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateLaunchTemplateRequest</p>
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
             * <p>The tag key for instances, disks, and primary ENIs created from this template version. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. The tag key cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value for instances, disks, and primary ENIs created from this template version. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
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
    /**
     * 
     * {@link CreateLaunchTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateLaunchTemplateRequest</p>
     */
    public static class TemplateTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(TemplateTag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the launch template. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the launch template. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
}
