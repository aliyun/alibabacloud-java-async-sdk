// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunInstancesRequest} extends {@link RequestModel}
 *
 * <p>RunInstancesRequest</p>
 */
public class RunInstancesRequest extends Request {
    @NameInMap("HibernationOptions")
    private HibernationOptions hibernationOptions;

    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @NameInMap("CpuOptions")
    private CpuOptions cpuOptions;

    @NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @NameInMap("SchedulerOptions")
    private SchedulerOptions schedulerOptions;

    @NameInMap("SecurityOptions")
    private SecurityOptions securityOptions;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("HttpPutResponseHopLimit")
    private Integer httpPutResponseHopLimit;

    @Query
    @NameInMap("Isp")
    private String isp;

    @Query
    @NameInMap("HostNames")
    private java.util.List < String > hostNames;

    @Query
    @NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @Query
    @NameInMap("Arn")
    private java.util.List < Arn> arn;

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
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("SpotDuration")
    private Integer spotDuration;

    @Query
    @NameInMap("SpotInterruptionBehavior")
    private String spotInterruptionBehavior;

    @Query
    @NameInMap("SecurityEnhancementStrategy")
    private String securityEnhancementStrategy;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @Query
    @NameInMap("CreditSpecification")
    private String creditSpecification;

    @Query
    @NameInMap("StorageSetId")
    private String storageSetId;

    @Query
    @NameInMap("Ipv6Address")
    private java.util.List < String > ipv6Address;

    @Query
    @NameInMap("Tenancy")
    private String tenancy;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("InternetMaxBandwidthIn")
    private Integer internetMaxBandwidthIn;

    @Query
    @NameInMap("StorageSetPartitionNumber")
    private Integer storageSetPartitionNumber;

    @Query
    @NameInMap("PasswordInherit")
    private Boolean passwordInherit;

    @Query
    @NameInMap("Amount")
    private Integer amount;

    @Query
    @NameInMap("HpcClusterId")
    private String hpcClusterId;

    @Query
    @NameInMap("DeploymentSetGroupNo")
    private Integer deploymentSetGroupNo;

    @Query
    @NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @Query
    @NameInMap("AutoReleaseTime")
    private String autoReleaseTime;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("UniqueSuffix")
    private Boolean uniqueSuffix;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("HttpTokens")
    private String httpTokens;

    @Query
    @NameInMap("HttpEndpoint")
    private String httpEndpoint;

    @Query
    @NameInMap("ImageFamily")
    private String imageFamily;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("MinAmount")
    private Integer minAmount;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("LaunchTemplateVersion")
    private Long launchTemplateVersion;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @Query
    @NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("NetworkInterfaceQueueNumber")
    private Integer networkInterfaceQueueNumber;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("Affinity")
    private String affinity;

    @Query
    @NameInMap("LaunchTemplateName")
    private String launchTemplateName;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    private RunInstancesRequest(Builder builder) {
        super(builder);
        this.hibernationOptions = builder.hibernationOptions;
        this.systemDisk = builder.systemDisk;
        this.cpuOptions = builder.cpuOptions;
        this.privatePoolOptions = builder.privatePoolOptions;
        this.schedulerOptions = builder.schedulerOptions;
        this.securityOptions = builder.securityOptions;
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.httpPutResponseHopLimit = builder.httpPutResponseHopLimit;
        this.isp = builder.isp;
        this.hostNames = builder.hostNames;
        this.dataDisk = builder.dataDisk;
        this.arn = builder.arn;
        this.networkInterface = builder.networkInterface;
        this.tag = builder.tag;
        this.regionId = builder.regionId;
        this.instanceName = builder.instanceName;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.ramRoleName = builder.ramRoleName;
        this.keyPairName = builder.keyPairName;
        this.spotDuration = builder.spotDuration;
        this.spotInterruptionBehavior = builder.spotInterruptionBehavior;
        this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.resourceGroupId = builder.resourceGroupId;
        this.instanceChargeType = builder.instanceChargeType;
        this.deploymentSetId = builder.deploymentSetId;
        this.creditSpecification = builder.creditSpecification;
        this.storageSetId = builder.storageSetId;
        this.ipv6Address = builder.ipv6Address;
        this.tenancy = builder.tenancy;
        this.periodUnit = builder.periodUnit;
        this.password = builder.password;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.storageSetPartitionNumber = builder.storageSetPartitionNumber;
        this.passwordInherit = builder.passwordInherit;
        this.amount = builder.amount;
        this.hpcClusterId = builder.hpcClusterId;
        this.deploymentSetGroupNo = builder.deploymentSetGroupNo;
        this.launchTemplateId = builder.launchTemplateId;
        this.autoReleaseTime = builder.autoReleaseTime;
        this.ioOptimized = builder.ioOptimized;
        this.uniqueSuffix = builder.uniqueSuffix;
        this.userData = builder.userData;
        this.httpTokens = builder.httpTokens;
        this.httpEndpoint = builder.httpEndpoint;
        this.imageFamily = builder.imageFamily;
        this.zoneId = builder.zoneId;
        this.minAmount = builder.minAmount;
        this.autoRenew = builder.autoRenew;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.privateIpAddress = builder.privateIpAddress;
        this.instanceType = builder.instanceType;
        this.period = builder.period;
        this.internetChargeType = builder.internetChargeType;
        this.spotStrategy = builder.spotStrategy;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.imageId = builder.imageId;
        this.networkInterfaceQueueNumber = builder.networkInterfaceQueueNumber;
        this.securityGroupId = builder.securityGroupId;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.securityGroupIds = builder.securityGroupIds;
        this.hostName = builder.hostName;
        this.affinity = builder.affinity;
        this.launchTemplateName = builder.launchTemplateName;
        this.vSwitchId = builder.vSwitchId;
        this.description = builder.description;
        this.deletionProtection = builder.deletionProtection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hibernationOptions
     */
    public HibernationOptions getHibernationOptions() {
        return this.hibernationOptions;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return cpuOptions
     */
    public CpuOptions getCpuOptions() {
        return this.cpuOptions;
    }

    /**
     * @return privatePoolOptions
     */
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    /**
     * @return schedulerOptions
     */
    public SchedulerOptions getSchedulerOptions() {
        return this.schedulerOptions;
    }

    /**
     * @return securityOptions
     */
    public SecurityOptions getSecurityOptions() {
        return this.securityOptions;
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
     * @return httpPutResponseHopLimit
     */
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return hostNames
     */
    public java.util.List < String > getHostNames() {
        return this.hostNames;
    }

    /**
     * @return dataDisk
     */
    public java.util.List < DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return arn
     */
    public java.util.List < Arn> getArn() {
        return this.arn;
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
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return spotDuration
     */
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    /**
     * @return spotInterruptionBehavior
     */
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    /**
     * @return securityEnhancementStrategy
     */
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return creditSpecification
     */
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    /**
     * @return storageSetId
     */
    public String getStorageSetId() {
        return this.storageSetId;
    }

    /**
     * @return ipv6Address
     */
    public java.util.List < String > getIpv6Address() {
        return this.ipv6Address;
    }

    /**
     * @return tenancy
     */
    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return internetMaxBandwidthIn
     */
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    /**
     * @return storageSetPartitionNumber
     */
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    /**
     * @return passwordInherit
     */
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return hpcClusterId
     */
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    /**
     * @return deploymentSetGroupNo
     */
    public Integer getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
    }

    /**
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return autoReleaseTime
     */
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return uniqueSuffix
     */
    public Boolean getUniqueSuffix() {
        return this.uniqueSuffix;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return httpTokens
     */
    public String getHttpTokens() {
        return this.httpTokens;
    }

    /**
     * @return httpEndpoint
     */
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * @return imageFamily
     */
    public String getImageFamily() {
        return this.imageFamily;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return minAmount
     */
    public Integer getMinAmount() {
        return this.minAmount;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return launchTemplateVersion
     */
    public Long getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return spotPriceLimit
     */
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    /**
     * @return ipv6AddressCount
     */
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return networkInterfaceQueueNumber
     */
    public Integer getNetworkInterfaceQueueNumber() {
        return this.networkInterfaceQueueNumber;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List < String > getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return affinity
     */
    public String getAffinity() {
        return this.affinity;
    }

    /**
     * @return launchTemplateName
     */
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public static final class Builder extends Request.Builder<RunInstancesRequest, Builder> {
        private HibernationOptions hibernationOptions; 
        private SystemDisk systemDisk; 
        private CpuOptions cpuOptions; 
        private PrivatePoolOptions privatePoolOptions; 
        private SchedulerOptions schedulerOptions; 
        private SecurityOptions securityOptions; 
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private Integer httpPutResponseHopLimit; 
        private String isp; 
        private java.util.List < String > hostNames; 
        private java.util.List < DataDisk> dataDisk; 
        private java.util.List < Arn> arn; 
        private java.util.List < NetworkInterface> networkInterface; 
        private java.util.List < Tag> tag; 
        private String regionId; 
        private String instanceName; 
        private Integer internetMaxBandwidthOut; 
        private String ramRoleName; 
        private String keyPairName; 
        private Integer spotDuration; 
        private String spotInterruptionBehavior; 
        private String securityEnhancementStrategy; 
        private String clientToken; 
        private Boolean dryRun; 
        private String dedicatedHostId; 
        private String resourceGroupId; 
        private String instanceChargeType; 
        private String deploymentSetId; 
        private String creditSpecification; 
        private String storageSetId; 
        private java.util.List < String > ipv6Address; 
        private String tenancy; 
        private String periodUnit; 
        private String password; 
        private Integer internetMaxBandwidthIn; 
        private Integer storageSetPartitionNumber; 
        private Boolean passwordInherit; 
        private Integer amount; 
        private String hpcClusterId; 
        private Integer deploymentSetGroupNo; 
        private String launchTemplateId; 
        private String autoReleaseTime; 
        private String ioOptimized; 
        private Boolean uniqueSuffix; 
        private String userData; 
        private String httpTokens; 
        private String httpEndpoint; 
        private String imageFamily; 
        private String zoneId; 
        private Integer minAmount; 
        private Boolean autoRenew; 
        private Long launchTemplateVersion; 
        private String privateIpAddress; 
        private String instanceType; 
        private Integer period; 
        private String internetChargeType; 
        private String spotStrategy; 
        private Float spotPriceLimit; 
        private Integer ipv6AddressCount; 
        private String imageId; 
        private Integer networkInterfaceQueueNumber; 
        private String securityGroupId; 
        private Integer autoRenewPeriod; 
        private java.util.List < String > securityGroupIds; 
        private String hostName; 
        private String affinity; 
        private String launchTemplateName; 
        private String vSwitchId; 
        private String description; 
        private Boolean deletionProtection; 

        private Builder() {
            super();
        } 

        private Builder(RunInstancesRequest response) {
            super(response);
            this.hibernationOptions = response.hibernationOptions;
            this.systemDisk = response.systemDisk;
            this.cpuOptions = response.cpuOptions;
            this.privatePoolOptions = response.privatePoolOptions;
            this.schedulerOptions = response.schedulerOptions;
            this.securityOptions = response.securityOptions;
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.httpPutResponseHopLimit = response.httpPutResponseHopLimit;
            this.isp = response.isp;
            this.hostNames = response.hostNames;
            this.dataDisk = response.dataDisk;
            this.arn = response.arn;
            this.networkInterface = response.networkInterface;
            this.tag = response.tag;
            this.regionId = response.regionId;
            this.instanceName = response.instanceName;
            this.internetMaxBandwidthOut = response.internetMaxBandwidthOut;
            this.ramRoleName = response.ramRoleName;
            this.keyPairName = response.keyPairName;
            this.spotDuration = response.spotDuration;
            this.spotInterruptionBehavior = response.spotInterruptionBehavior;
            this.securityEnhancementStrategy = response.securityEnhancementStrategy;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.dedicatedHostId = response.dedicatedHostId;
            this.resourceGroupId = response.resourceGroupId;
            this.instanceChargeType = response.instanceChargeType;
            this.deploymentSetId = response.deploymentSetId;
            this.creditSpecification = response.creditSpecification;
            this.storageSetId = response.storageSetId;
            this.ipv6Address = response.ipv6Address;
            this.tenancy = response.tenancy;
            this.periodUnit = response.periodUnit;
            this.password = response.password;
            this.internetMaxBandwidthIn = response.internetMaxBandwidthIn;
            this.storageSetPartitionNumber = response.storageSetPartitionNumber;
            this.passwordInherit = response.passwordInherit;
            this.amount = response.amount;
            this.hpcClusterId = response.hpcClusterId;
            this.deploymentSetGroupNo = response.deploymentSetGroupNo;
            this.launchTemplateId = response.launchTemplateId;
            this.autoReleaseTime = response.autoReleaseTime;
            this.ioOptimized = response.ioOptimized;
            this.uniqueSuffix = response.uniqueSuffix;
            this.userData = response.userData;
            this.httpTokens = response.httpTokens;
            this.httpEndpoint = response.httpEndpoint;
            this.imageFamily = response.imageFamily;
            this.zoneId = response.zoneId;
            this.minAmount = response.minAmount;
            this.autoRenew = response.autoRenew;
            this.launchTemplateVersion = response.launchTemplateVersion;
            this.privateIpAddress = response.privateIpAddress;
            this.instanceType = response.instanceType;
            this.period = response.period;
            this.internetChargeType = response.internetChargeType;
            this.spotStrategy = response.spotStrategy;
            this.spotPriceLimit = response.spotPriceLimit;
            this.ipv6AddressCount = response.ipv6AddressCount;
            this.imageId = response.imageId;
            this.networkInterfaceQueueNumber = response.networkInterfaceQueueNumber;
            this.securityGroupId = response.securityGroupId;
            this.autoRenewPeriod = response.autoRenewPeriod;
            this.securityGroupIds = response.securityGroupIds;
            this.hostName = response.hostName;
            this.affinity = response.affinity;
            this.launchTemplateName = response.launchTemplateName;
            this.vSwitchId = response.vSwitchId;
            this.description = response.description;
            this.deletionProtection = response.deletionProtection;
        } 

        /**
         * HibernationOptions.
         */
        public Builder hibernationOptions(HibernationOptions hibernationOptions) {
            this.hibernationOptions = hibernationOptions;
            return this;
        }

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * CpuOptions.
         */
        public Builder cpuOptions(CpuOptions cpuOptions) {
            this.cpuOptions = cpuOptions;
            return this;
        }

        /**
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }

        /**
         * SchedulerOptions.
         */
        public Builder schedulerOptions(SchedulerOptions schedulerOptions) {
            this.schedulerOptions = schedulerOptions;
            return this;
        }

        /**
         * SecurityOptions.
         */
        public Builder securityOptions(SecurityOptions securityOptions) {
            this.securityOptions = securityOptions;
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
         * HttpPutResponseHopLimit.
         */
        public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.putQueryParameter("HttpPutResponseHopLimit", httpPutResponseHopLimit);
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        /**
         * Isp.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * HostNames.
         */
        public Builder hostNames(java.util.List < String > hostNames) {
            this.putQueryParameter("HostNames", hostNames);
            this.hostNames = hostNames;
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
         * Arn.
         */
        public Builder arn(java.util.List < Arn> arn) {
            this.putQueryParameter("Arn", arn);
            this.arn = arn;
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
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the instance. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http://" or "https. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-). The default value is the instanceid" of the instance ".
         * <p>
         * 
         * When you create multiple ECS instances, you can set multiple instance names in batches. For more information, see [batch set ordered instance names or host names](~~ 196048 ~~).
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
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
         * The name of the instance RAM role. You can use the RAM API [ListRoles](~~ 28713 ~~) to query the created instance RAM role.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * The name of the key pair.
         * <p>
         * 
         * -Windows the instance. Ignore this parameter. The default value is null. Even if this parameter is specified, only the "Password" content is executed.
         * -The password logon method for Linux instances is initialized to disable.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
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
         * The interrupt mode of the preemptible instance. You can only release instances Terminate by default.
         */
        public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
            this.putQueryParameter("SpotInterruptionBehavior", spotInterruptionBehavior);
            this.spotInterruptionBehavior = spotInterruptionBehavior;
            return this;
        }

        /**
         * Specifies whether to enable security hardening. Valid values:
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
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to PreCheck only this request. Valid values:
         * <p>
         * 
         * -true: sends a check request and does not create an instance. Check items include required parameters, request format, business restrictions, and ECS inventory. If the check fails, the corresponding error is returned. If the check succeeds, the error code "DryRunOperation" is returned ".
         * -false (default): Sends a normal request and directly creates an instance after passing the check.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Specifies whether to create an ECS instance on a dedicated host. Preemptible instances cannot be created on dedicated hosts. When the "DedicatedHostId" parameter is specified, the "spotstratege" and "spotpricelime" settings in the request are automatically ignored.
         * <p>
         * 
         * <props = "china"> You can use [DescribeDedicatedHosts](~~ 134242 ~~) to query the ID List of dedicated hosts. </props>
         * 
         * <props = "intl"> You can use [DescribeDedicatedHosts](~~ 134242 ~~) to query the ID List of dedicated hosts. </props>
         * 
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * -PrePaid: Subscription
         * -PostPaid (default): Pay-as-you-go
         * 
         * <props = "china"> when you select subscription, make sure that your account supports balance payment or credit payment. Otherwise, the error message "InvalidPayMethod" is returned. </props>
         * 
         * <props = "intl"> when you select subscription, make sure that your account supports credit payment. Otherwise, the error message "InvalidPayMethod" is returned. </props>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
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
         * Modify the running mode of a burstable instance. Valid values:
         * <p>
         * 
         * -Standard: Standard mode. For more information about instance performance, see performance constraint mode in [What is burstable instance](~~ 59977 ~~).
         * -Unlimited: Unlimited Mode. For more information about instance performance, see Unlimited mode in [What is burstable instance](~~ 59977 ~~).
         * 
         * Default value: None
         */
        public Builder creditSpecification(String creditSpecification) {
            this.putQueryParameter("CreditSpecification", creditSpecification);
            this.creditSpecification = creditSpecification;
            return this;
        }

        /**
         * The ID of the storage set.
         */
        public Builder storageSetId(String storageSetId) {
            this.putQueryParameter("StorageSetId", storageSetId);
            this.storageSetId = storageSetId;
            return this;
        }

        /**
         * Specify one or more IPv6 addresses for the primary Eni. You can set up to 10 IPv6 addresses. Valid values of N: 1 to 10.
         * <p>
         * 
         * Valid values: "Ipv6Address.1=2001:db8:1234:1 a00::* * * ".
         * 
         * Note:
         * 
         * -When "Ipv6Address. **is set, the value of the "$t" parameter can only be 1, and "Ipv6AddressCount" cannot be set at the same time ".
         * 
         * -If the value of "NetworkInterface.N.InstanceType" is "primar", you cannot set "Ipv6Addresses. **or "Ipv6AddressCount". Instead, you must set "NetworkInterface.N.Ipv6Addresses.** or "NetworkInterface.N.Ipv6AddressCount ".
         */
        public Builder ipv6Address(java.util.List < String > ipv6Address) {
            this.putQueryParameter("Ipv6Address", ipv6Address);
            this.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * Specifies whether to create an instance on a dedicated host. Valid values:
         * <p>
         * 
         * -default: creates a non-dedicated host instance.
         * 
         * -host: creates a dedicated host instance. If you do not specify "DedicatedHostId", Alibaba Cloud automatically selects a dedicated host to place the instance.
         * 
         * default value: default
         */
        public Builder tenancy(String tenancy) {
            this.putQueryParameter("Tenancy", tenancy);
            this.tenancy = tenancy;
            return this;
        }

        /**
         * The unit of the subscription billing method. Valid values:
         * <p>
         * 
         * <props="china">
         * -Week
         * -Month (default)
         * 
         * </props>
         * 
         * <props = "intl">Month (default)</props>
         * 
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The password of the instance. The description must be 8 to 30 characters in length and must contain letters, digits, and special characters. Special symbols can be:
         * <p>
         * 
         * """
         * ()"~! @%& *-_+ =} [],.?/
         * """
         * 
         * The Windows instance cannot start with a forward slash (/).
         * 
         * > If the "Password" parameter is specified, we recommend that you send requests over HTTPS to avoid password leakage.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
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
         * The maximum number of partitions in a bucket. Valid values: 2 or more.
         */
        public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.putQueryParameter("StorageSetPartitionNumber", storageSetPartitionNumber);
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }

        /**
         * Specifies whether to use the default password of the image. Valid values:
         * <p>
         * 
         * -true: use
         * -false: Do not use
         * 
         * > When you use this parameter, the Password parameter must be empty, and you must ensure that the Password has been set for the image you are using.
         */
        public Builder passwordInherit(Boolean passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
            return this;
        }

        /**
         * The number of ECS instances to be created. Valid values: 1 to 100.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * The ID of the EHPC cluster to which the instance belongs.
         */
        public Builder hpcClusterId(String hpcClusterId) {
            this.putQueryParameter("HpcClusterId", hpcClusterId);
            this.hpcClusterId = hpcClusterId;
            return this;
        }

        /**
         * If you set the high availability policy (AvailabilityGroup) for a deployment set, you can use this parameter to specify the group number of the instance in the deployment set. Valid values: 1 to 7.
         */
        public Builder deploymentSetGroupNo(Integer deploymentSetGroupNo) {
            this.putQueryParameter("DeploymentSetGroupNo", deploymentSetGroupNo);
            this.deploymentSetGroupNo = deploymentSetGroupNo;
            return this;
        }

        /**
         * The ID of the launch template. For more information, call [DescribeLaunchTemplates](~~ 73759 ~~).
         * <p>
         * 
         * When creating an instance using a launch template, you must specify "LaunchTemplateId" or "LaunchTemplateName" to confirm the launch template.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * The automatic release time of the pay-as-you-go instance. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
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
         * Indicates whether the instance is I/O optimized. The default value of [phased-out instance types](~~ 55263 ~~) is none. The default value of other instance types is optimized. Valid values:
         * <p>
         * 
         * -none: Non-I/O optimized
         * -optimized:I/O optimized
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * Specifies whether to automatically add ordered suffixes for "HostName" and "InstanceName" when multiple instances are created. The number of ordered suffixes increases from 001 to 999. Valid values:
         * <p>
         * -true: add
         * -false: Do not add
         * 
         * Default value: false
         * 
         * When "HostName" or "InstanceName" is set according to the specified sorting format and the suffix "name_suffix "is not set, that is, the naming format is "name_prefix[begin_number,bits]", "UniqueSuffix" does not take effect, names are sorted only in the specified order.
         * 
         * For more information, see [batch set ordered instance names or host names](~~ 196048 ~~).
         */
        public Builder uniqueSuffix(Boolean uniqueSuffix) {
            this.putQueryParameter("UniqueSuffix", uniqueSuffix);
            this.uniqueSuffix = uniqueSuffix;
            return this;
        }

        /**
         * The user data of the instance. It must be encoded in Base64. the maximum size of raw data is 16KB.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * Specifies whether to use the enhanced mode (IMDSv2) when accessing instance metadata. Valid values:
         * <p>
         * -optional: not mandatory.
         * -required: force use. If this parameter is set, the instance metadata cannot be accessed in normal mode.
         * 
         * Default value: optional.
         * > For more information about how to access instance metadata, see [instance metadata access mode](~~ 150575 ~~).
         */
        public Builder httpTokens(String httpTokens) {
            this.putQueryParameter("HttpTokens", httpTokens);
            this.httpTokens = httpTokens;
            return this;
        }

        /**
         * Specifies whether to enable the access channel for instance metadata. Valid values:
         * <p>
         * -enabled: enabled
         * -disabled: disabled
         * 
         * Default value: enabled
         * > For more information about instance metadata, see [instance metadata Overview](~~ 49122 ~~).
         */
        public Builder httpEndpoint(String httpEndpoint) {
            this.putQueryParameter("HttpEndpoint", httpEndpoint);
            this.httpEndpoint = httpEndpoint;
            return this;
        }

        /**
         * The name of the Image family. You can set this parameter to obtain the latest available custom images in the current image family to create an instance.
         * <p>
         * -This parameter cannot be set if "ImageId" is set.
         * -The "ImageId" parameter is not set, but the specified "LaunchTemplateId" or "LaunchTemplateName" startup template is set to "ImageId.
         * -If "ImageId" is not set and "ImageId" is not set for the startup template corresponding to "LaunchTemplateId" or "LaunchTemplateName", you can set this parameter.
         * -If "ImageId" is not set, and "LaunchTemplateId" and "LaunchTemplateName" parameters are not set, this parameter can be set.
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * The ID of the zone to which the instance belongs. You can call [DescribeZones](~~ 25610 ~~) to obtain the list of zones.
         * <p>
         * 
         * > If you specify the "VSwitchId" parameter, the specified "ZoneId" parameter must be consistent with the zone where the vSwitch is located. If you do not specify the "ZoneId" parameter, the system automatically selects the zone where the specified vSwitch is located.
         * 
         * Default value: automatically selected.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The minimum number of ECS instances to purchase. Valid values: 1 to 100.
         * <p>
         * 
         * -When the number of ECS instances is less than the minimum number, the creation fails.
         * -When ECS inventory quantities greater than equal to the minimum buy number, according to inventory quantity created.
         */
        public Builder minAmount(Integer minAmount) {
            this.putQueryParameter("MinAmount", minAmount);
            this.minAmount = minAmount;
            return this;
        }

        /**
         * Specifies whether to enable automatic renewal. This parameter takes effect only when the value of "InstanceChargeType" is "PrePaid. Valid values:
         * <p>
         * 
         * -true: auto renewal
         * -false (default): auto renewal is not performed.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The version of the launch template. If you specify "LaunchTemplateId" or "LaunchTemplateName" without specifying the launch template version number, the default version is used.
         */
        public Builder launchTemplateVersion(Long launchTemplateVersion) {
            this.putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * The private IP address of the instance. When you configure a private IP address for a VPC-type ECS instance, you must select an idle CIDR block from the vSwitch ("VSwitchId").
         * <p>
         * 
         * Note:
         * 
         * -After "PrivateIpAddress" is set:
         * -If the value of "adjustt" is 1, a private IP address is assigned to the created ECS instance.
         * -If the value of "renewt" is greater than 1, the specified private IP addresses are used as the starting addresses to assign consecutive private IP addresses to multiple ECS instances, however, you cannot bind an Eni to an instance. N.* "This type of parameter).
         * 
         * -If the value of "NetworkInterface.N.InstanceType" is "primare", you cannot set "PrivateIpAddress". You can only set "NetworkInterface.N.PrimaryIpAddress ".
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The type of the instance. If you do not specify "LaunchTemplateId" or "LaunchTemplateName" to determine the launch template, "InstanceType" is required.
         * <p>
         * 
         * -Product selection: see [instance type family](~~ 25378 ~~) or call [DescribeInstanceTypes](~~ 25620 ~~) to view the performance data of the target instance type, for more information about how to select an instance type, see [select configuration](~~ 58291 ~~).
         * -Query inventory: call [DescribeAvailableResource](~~ 66186 ~~) to view the resource supply in a specified region or zone.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The duration of the resource to be purchased. Unit: "__Dune. This parameter is required only when the value of "InstanceChargeType" is set to "PrePaid. If "DedicatedHostId" is specified, the value range cannot exceed the subscription duration of the dedicated host. Valid values:
         * <p>
         * 
         * <props="china">
         * When-PeriodUnit = Week, the value of Period is {"1", "2", "3", and "4"}.
         * When-PeriodUnit = Month, the value of Period is {"1", "2", "3", "4", "5", "6", "7", "8", "9", "12", "24", "36", "48", "60"}.
         * 
         * </props>
         * 
         * <props = "intl">PeriodUnit = Month, valid values of Period: {"1", "2", "3", "4", "5", "6", "7", "8", "9", "12", "24", "36", "48", "60"}. </props>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The billing method of the network. Valid values:
         * <p>
         * 
         * -PayByBandwidth: pay-by-bandwidth
         * -PayByTraffic (default): Pay by traffic
         * 
         * > **pay-by-traffic** mode: The peak inbound and outbound bandwidth is the upper limit of the bandwidth and is not used as a service commitment indicator. When a resource scramble occurs, the peak bandwidth may be limited. If your business needs to be guaranteed by bandwidth, use the **pay-by-bandwidth** mode.
         * 
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * Quantity instance preemption strategy. This parameter takes effect only when the value of "InstanceChargeType" is "PostPaid. Valid values:
         * <p>
         * 
         * -NoSpot (default): a pay-as-you-go instance
         * -SpotWithPriceLimit: sets the maximum price for preemptible instances.
         * -SpotAsPriceGo: The system automatically bids, following the actual market price
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
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
         * Specify the number of randomly generated IPv6 addresses for the primary Eni. Valid values: 1 to 10.
         * <p>
         * 
         * Note:
         * 
         * -You cannot set "Ipv6Address. **and "Ipv6AddressCount" at the same time ".
         * 
         * -If the value of "NetworkInterface.N.InstanceType" is "primare", you cannot set "Ipv6Address. **or "Ipv6AddressCount". You can only set "NetworkInterface.N.Ipv6Address.** or "NetworkInterface.N.Ipv6AddressCount ".
         */
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * The ID of the image. You can use [DescribeImages](~~ 25534 ~~) to query the available image resources. If you do not specify "LaunchTemplateId" or "LaunchTemplateName" to determine the launch template, or you do not specify "imagefamile" to select the latest available custom image from the Image family, "ImageId" is required.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The number of queues for the primary Eni. Note:
         * <p>
         * 
         * -The maximum number of queues per Nic allowed by the instance type.
         * 
         * -The number of accumulated queues for all NICs of an instance cannot exceed the total number of queues allowed by the instance type. You can call the [DescribeInstanceTypes](~~ 25620 ~~) operation to query the maximum number of queues and total quotas of an Eni.
         * 
         * -If "NetworkInterface.N.InstanceType" is set to "primare", you cannot set "networkinterfacequeuenumerber". You can only set "NetworkInterface.N. Queuenumerber ".
         */
        public Builder networkInterfaceQueueNumber(Integer networkInterfaceQueueNumber) {
            this.putQueryParameter("NetworkInterfaceQueueNumber", networkInterfaceQueueNumber);
            this.networkInterfaceQueueNumber = networkInterfaceQueueNumber;
            return this;
        }

        /**
         * The ID of the security group to which the new instance belongs. Instances in the same security group can access each other. The number of instances in a security group depends on the security group type. For more information, see [limits](~~ 25412 ~~). Security groups.
         * <p>
         * 
         * & Gt; "SecurityGroupId" determines the network type of the instance. For example, if the network type of the security group is VPC, the instance is VPC. You must specify the "VSwitchId" parameter ".
         * 
         * If you do not set "LaunchTemplateId" or "LaunchTemplateName" to determine the instance launch template, the security group ID is required. Note:
         * 
         * -You can use "SecurityGroupId" to set a security group. You can also use "SecurityGroupIds. **to set one or more security groups. However, you cannot set both "SecurityGroupId" and "SecurityGroupIds ".
         * 
         * -If the value of "NetworkInterface.N.InstanceType" is "primare", you cannot set "SecurityGroupId" or "SecurityGroupIds. **. You can only set "NetworkInterface.N.SecurityGroupId" or "NetworkInterface.N.SecurityGroupIds ".
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The duration of an automatic renewal. Valid values:
         * <p>
         * 
         * <props="china">
         * -PeriodUnit = Week: {"1", "2", "3"}.
         * -PeriodUnit = Month: {"1", "2", "3", "6", "12", "24", "36", "48", "60"}.
         * 
         * </props>
         * 
         * <props = "intl">PeriodUnit = Month: {"1", "2", "3", "6", "12", "24", "36", "48", "60"}. </props>
         * 
         * Default value: 1.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * Add an instance to multiple security groups at the same time. The value range of N depends on the number of instances that can be added to security groups. For more information, see [security group limits](~~ 101348 ~~).
         * <p>
         * 
         * Note:
         * 
         * -You cannot set "SecurityGroupId" and "SecurityGroupIds.... At the same time ".
         * -If the value of "NetworkInterface.N.InstanceType" is "primare", you cannot set "SecurityGroupId" or "SecurityGroupIds. **. You can only set "NetworkInterface.N.SecurityGroupId" or "NetworkInterface.N.SecurityGroupIds ".
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * The name of the instance. Limits:
         * <p>
         * 
         * -Periods (.) and hyphens (-) cannot be used as start and end characters, and cannot be used consecutively.
         * -Windows instance: the name must be 2 to 15 characters in length and cannot contain periods (.). It can contain uppercase and lowercase letters, digits, and hyphens (-).
         * -Other types of instances (such as Linux):
         * -The name must be 2 to 64 characters in length and can contain multiple periods (.). The periods must be separated by periods. Each paragraph can contain uppercase and lowercase letters, digits, and hyphens (-).
         * -You can use the placeholder "${instance_id}" to write the instance ID to the "HostName" parameter. For example, if "HostName = k8s-${instance_id}"and the ID of the created ECS instance is "i-123abc ****, the hostname of the instance is "k8s-i-123abc * * * *".
         * 
         * When you create multiple ECS instances, you can:
         * 
         * -Set multiple hostnames. For more information, see [batch set ordered instance names or host names](~~ 196048 ~~).
         * -Use the "HostNames.... parameter to set hostnames for multiple instances. Note that the "HostName" parameter and the "HostNames. "parameter cannot be set at the same time.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * Indicates whether the DDH instance is associated with the DDH. Valid values:
         * <p>
         * 
         * -default: the instance is not associated with a dedicated host. If you have enabled the shutdown saving mode for an instance and restart the instance after the instance is stopped, if the original DDH has insufficient available resources, the instance is placed on another DDH of the automatic deployment resource pool.
         * 
         * -host: the instance is associated with a dedicated host. Instances that have enabled the shutdown mode are still placed on the original dedicated host when they are restarted after the instance is stopped. If the original dedicated host does not have sufficient resources, the instance fails to be restarted.
         * 
         * default value: default
         */
        public Builder affinity(String affinity) {
            this.putQueryParameter("Affinity", affinity);
            this.affinity = affinity;
            return this;
        }

        /**
         * The name of the launch template.
         * <p>
         * 
         * When creating an instance using a launch template, you must specify "LaunchTemplateId" or "LaunchTemplateName" to confirm the launch template.
         */
        public Builder launchTemplateName(String launchTemplateName) {
            this.putQueryParameter("LaunchTemplateName", launchTemplateName);
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        /**
         * The ID of the vSwitch. If you are creating a VPC-type ECS instance, you must specify the vSwitch ID and the security group and vSwitch are in the same VPC. You can call [DescribeVSwitches](~~ 35748 ~~) to query the information about the created vSwitch.
         * <p>
         * 
         * Note:
         * 
         * -If you set the "VSwitchId" parameter, the "ZoneId" parameter must be the same as the zone where the vSwitch is located. You can also select the zone where the specified vSwitch is located without setting the zoneid" parameter.
         * 
         * -If the value of "NetworkInterface.N.InstanceType" is "primare", you cannot set "VSwitchId". You can only set "NetworkInterface.N.VSwitchId ".
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * Instance description. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Instance release protection attribute, specifies whether support pass console or API([DeleteInstance](~~ 25507 ~~)) release instance. Valid values:
         * <p>
         * 
         * -true: open instance release protection
         * -false (default): shut down the instance release protection
         * 
         * > This property only applies to quantity pay instance, and only limit manual release operation, the system release operation no effect.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        @Override
        public RunInstancesRequest build() {
            return new RunInstancesRequest(this);
        } 

    } 

    public static class HibernationOptions extends TeaModel {
        @NameInMap("Configured")
        private Boolean configured;

        private HibernationOptions(Builder builder) {
            this.configured = builder.configured;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HibernationOptions create() {
            return builder().build();
        }

        /**
         * @return configured
         */
        public Boolean getConfigured() {
            return this.configured;
        }

        public static final class Builder {
            private Boolean configured; 

            /**
             * Configured.
             */
            public Builder configured(Boolean configured) {
                this.configured = configured;
                return this;
            }

            public HibernationOptions build() {
                return new HibernationOptions(this);
            } 

        } 

    }
    public static class SystemDisk extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Description")
        private String description;

        @NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("Size")
        private String size;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
            this.description = builder.description;
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.diskName = builder.diskName;
            this.size = builder.size;
            this.performanceLevel = builder.performanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
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
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public static final class Builder {
            private String category; 
            private String description; 
            private String autoSnapshotPolicyId; 
            private String diskName; 
            private String size; 
            private String performanceLevel; 

            /**
             * The type of the system disk. Valid values:
             * <p>
             * 
             * -cloud_efficiency: Ultra disk
             * -cloud_ssd:SSD cloud disk
             * -cloud_essd:ESSD
             * -cloud: basic cloud disk
             * 
             * For phased-out instance types and non-I/O optimized instances, the default value is cloud. Otherwise, the default value is cloud_efficiency.
             */
            public Builder category(String category) {
                this.category = category;
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
             * The ID of the automatic snapshot policy used by the system disk.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * System disk name. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. It can contain numbers, periods (.), colons (:), underscores (_), and hyphens (-).
             * <p>
             * 
             * Default value: Null.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * The size of the system disk. Unit: GiB. Valid values: 20 to 500.
             * <p>
             * 
             * The value of this parameter must be greater than or equal to max{20, ImageSize}.
             * 
             * Default value: max{40. The size of the image corresponding to the parameter ImageId}.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * When you create an ESSD as a system disk, set the performance level of the disk. Valid values:
             * <p>
             * 
             * -PL0: The maximum random read/write IOPS per disk is 10,000
             * -PL1 (default): The maximum random read/write IOPS per disk is 50,000.
             * -PL2: The maximum random read/write IOPS per disk is 100,000
             * -PL3: The maximum random read/write IOPS per disk is 1 million
             * 
             * For more information about how to select an ESSD performance level, see [ESSD cloud disk](~~ 122389 ~~).
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    public static class CpuOptions extends TeaModel {
        @NameInMap("ThreadsPerCore")
        private Integer threadsPerCore;

        @NameInMap("Core")
        private Integer core;

        @NameInMap("Numa")
        private String numa;

        private CpuOptions(Builder builder) {
            this.threadsPerCore = builder.threadsPerCore;
            this.core = builder.core;
            this.numa = builder.numa;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CpuOptions create() {
            return builder().build();
        }

        /**
         * @return threadsPerCore
         */
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

        /**
         * @return core
         */
        public Integer getCore() {
            return this.core;
        }

        /**
         * @return numa
         */
        public String getNuma() {
            return this.numa;
        }

        public static final class Builder {
            private Integer threadsPerCore; 
            private Integer core; 
            private String numa; 

            /**
             * The number of CPU threads. The number of VCPUs of the ECS instance = "CpuOptions.Core" value "CpuOptions.ThreadPerCore" value.
             * <p>
             * 
             * -"CpuOptions.ThreadPerCore = **indicates that CPU hyper-threading is disabled.
             * 
             * -Only some instance types support setting the number of CPU threads.
             * 
             * <props = "china"> valid values and default values: see [customize CPU options](~~ 145895 ~~). </props>
             * 
             */
            public Builder threadsPerCore(Integer threadsPerCore) {
                this.threadsPerCore = threadsPerCore;
                return this;
            }

            /**
             * The number of CPU cores. This parameter does not support custom settings. You can only use the default value.
             * <p>
             * 
             * <props = "china"> Default value: see [custom CPU options](~~ 145895 ~~). </props>
             * 
             */
            public Builder core(Integer core) {
                this.core = core;
                return this;
            }

            /**
             * The number of CPU Numa nodes.
             */
            public Builder numa(String numa) {
                this.numa = numa;
                return this;
            }

            public CpuOptions build() {
                return new CpuOptions(this);
            } 

        } 

    }
    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("MatchCriteria")
        private String matchCriteria;

        @NameInMap("Id")
        private String id;

        private PrivatePoolOptions(Builder builder) {
            this.matchCriteria = builder.matchCriteria;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return matchCriteria
         */
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String matchCriteria; 
            private String id; 

            /**
             * The capacity of the private pool that the instance starts. After the elastic protection service or the capacity reservation service takes effect, the private pool capacity is generated for you to select when the instance is started. Valid values:
             * <p>
             * 
             * -Open: Open mode. The capacity of the open private pool is automatically matched. If the capacity of the private pool does not meet the conditions, use the public pool resources to start. In this mode, you do not need to set the "PrivatePoolOptions.Id" parameter.
             * -Target: specifies the mode. Start an instance with the specified private pool capacity. If the private pool capacity is unavailable, the instance fails to start. The private pool ID must be specified in this mode, that is, the "PrivatePoolOptions.Id" parameter is required.
             * -None: the mode is not used. No private pool capacity is used when the instance is started.
             * 
             * Default value: None
             * 
             * In any of the following scenarios, the private pool capacity option can only be set to "None" or no value.
             * -Create a preemptible instance.
             * -Create an ECS instance of the classic network type.
             * -Create an ECS instance on a DDH.
             */
            public Builder matchCriteria(String matchCriteria) {
                this.matchCriteria = matchCriteria;
                return this;
            }

            /**
             * The ID of the private pool. The ID of the elastic protection service or the capacity reservation service.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public PrivatePoolOptions build() {
                return new PrivatePoolOptions(this);
            } 

        } 

    }
    public static class SchedulerOptions extends TeaModel {
        @NameInMap("DedicatedHostClusterId")
        private String dedicatedHostClusterId;

        private SchedulerOptions(Builder builder) {
            this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulerOptions create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostClusterId
         */
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public static final class Builder {
            private String dedicatedHostClusterId; 

            /**
             * The dedicated host cluster to which the ECS instance belongs. The system automatically selects a dedicated host in the dedicated host cluster to deploy the ECS instance.
             * <p>
             * 
             * > This parameter takes effect only when "tenance" is set to "host.
             * 
             * When you specify both the dedicated host ("DedicatedHostId") and the dedicated host cluster ("SchedulerOptions.DedicatedHostClusterId"):
             * -If the DDH belongs to a DDH cluster, the ECS instance is preferentially deployed on the specified DDH.
             * -If the DDH does not belong to the DDH cluster, the ECS instance fails to be created.
             * 
             * <props = "china"> You can use [DescribeDedicatedHostClusters](~~ 184145 ~~) to query the ID List of dedicated host clusters. </props>
             * 
             * <props = "intl"> You can use [DescribeDedicatedHostClusters](~~ 184145 ~~) to query the ID List of dedicated host clusters. </props>
             * 
             * <props = "partner"> You can use [DescribeDedicatedHostClusters](~~ 184145 ~~) to query the ID List of dedicated host clusters. </props>
             */
            public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
                this.dedicatedHostClusterId = dedicatedHostClusterId;
                return this;
            }

            public SchedulerOptions build() {
                return new SchedulerOptions(this);
            } 

        } 

    }
    public static class SecurityOptions extends TeaModel {
        @NameInMap("ConfidentialComputingMode")
        private String confidentialComputingMode;

        @NameInMap("TrustedSystemMode")
        private String trustedSystemMode;

        private SecurityOptions(Builder builder) {
            this.confidentialComputingMode = builder.confidentialComputingMode;
            this.trustedSystemMode = builder.trustedSystemMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityOptions create() {
            return builder().build();
        }

        /**
         * @return confidentialComputingMode
         */
        public String getConfidentialComputingMode() {
            return this.confidentialComputingMode;
        }

        /**
         * @return trustedSystemMode
         */
        public String getTrustedSystemMode() {
            return this.trustedSystemMode;
        }

        public static final class Builder {
            private String confidentialComputingMode; 
            private String trustedSystemMode; 

            /**
             * The confidential computing mode. Value: Enclave
             * <p>
             * 
             * If this parameter is set to Enclave, the ECS instance uses Enclave to build a confidential computing environment. Currently, only instance type families c7, g7, and R7. you can specify this parameter to use Enclave confidential computing when calling "RunInstances. Note:
             * 
             * -The confidential computing feature is being invited for testing. To use it, open a ticket.
             * 
             * -You can only call the "RunInstances" implementation when creating an ECS instance OpenAPI confidential computing through Enclave. The "CreateInstance" parameter cannot be set to "SecurityOptions. Renewentialcomputingmode.
             * 
             * -Enclave confidential computing is implemented by a trusted system (vTPM). When you specify an ECS instance to use Enclave to build a confidential computing environment, the trusted system is also enabled for the instance. Therefore, call the interface, if you set the "securityoptions. ConfidentialComputingMode = enclavespec, regardless of whether you have set "SecurityOptions.TrustedSystemMode = vTPM", all the created ECS instances use Enclave confidential computing mode and trusted system.
             * 
             * For more information about confidential computing, see [use Enclave to build a confidential Computing Environment](~~ 203433 ~~).
             * 
             * Default value: Null.
             * 
             */
            public Builder confidentialComputingMode(String confidentialComputingMode) {
                this.confidentialComputingMode = confidentialComputingMode;
                return this;
            }

            /**
             * Trusted system mode. Value: vtpm
             * <p>
             * 
             * Currently, trusted system mode supported instance dimension families:
             * -g7, c7, r7
             * -Security-Enhanced (g7t, c7t, r7t)
             * 
             * When you create a example above dimension family ECS instance, need to set the parameters. Specific description as follows:
             * 
             * -If you use Alibaba Cloud trusted system, please the parameter value is set to vtpm, at instance startup through Alibaba Cloud trusted system complete trusted calibration.
             * -If you don"t use Alibaba Cloud trusted system, can not set the parameter value, but you need to note that if you create ECS instance use Enclave confidential calculation mode ("securityoptions. ConfidentialComputingMode = enclave"), the ECS instances are also enable trusted system.
             * -Pass OpenAPI create trusted system ECS instance can only be called "runinstances" implementation, "createinstance" currently does not support setting "securityoptions. trustedsystemmode" parameters.
             * 
             * About trusted system more information, please see [security enhanced instance credible function Overview](~~ 201394 ~~).
             * 
             * Default value: Null.
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
    public static class DataDisk extends TeaModel {
        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @NameInMap("Encrypted")
        private String encrypted;

        @NameInMap("Description")
        private String description;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("Device")
        private String device;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("Category")
        private String category;

        @NameInMap("EncryptAlgorithm")
        private String encryptAlgorithm;

        @NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @NameInMap("KMSKeyId")
        private String KMSKeyId;

        @NameInMap("StorageClusterId")
        private String storageClusterId;

        @NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        private DataDisk(Builder builder) {
            this.performanceLevel = builder.performanceLevel;
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.encrypted = builder.encrypted;
            this.description = builder.description;
            this.snapshotId = builder.snapshotId;
            this.device = builder.device;
            this.size = builder.size;
            this.diskName = builder.diskName;
            this.category = builder.category;
            this.encryptAlgorithm = builder.encryptAlgorithm;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.KMSKeyId = builder.KMSKeyId;
            this.storageClusterId = builder.storageClusterId;
            this.provisionedIops = builder.provisionedIops;
            this.burstingEnabled = builder.burstingEnabled;
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
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        /**
         * @return encrypted
         */
        public String getEncrypted() {
            return this.encrypted;
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
         * @return device
         */
        public String getDevice() {
            return this.device;
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
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return encryptAlgorithm
         */
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        /**
         * @return deleteWithInstance
         */
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        /**
         * @return storageClusterId
         */
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

        /**
         * @return provisionedIops
         */
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        /**
         * @return burstingEnabled
         */
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public static final class Builder {
            private String performanceLevel; 
            private String autoSnapshotPolicyId; 
            private String encrypted; 
            private String description; 
            private String snapshotId; 
            private String device; 
            private Integer size; 
            private String diskName; 
            private String category; 
            private String encryptAlgorithm; 
            private Boolean deleteWithInstance; 
            private String KMSKeyId; 
            private String storageClusterId; 
            private Long provisionedIops; 
            private Boolean burstingEnabled; 

            /**
             * 创建ESSD云盘作为数据盘使用时，设置云盘的性能等级。N的取值必须和`DataDisk.N.Category=cloud_essd`中的N保持一致。取值范围：
             * <p>
             * 
             * - PL0：单盘最高随机读写IOPS 1万
             * - PL1（默认）：单盘最高随机读写IOPS 5万
             * - PL2：单盘最高随机读写IOPS 10万
             * - PL3：单盘最高随机读写IOPS 100万
             * 
             * 有关如何选择ESSD性能等级，请参见[ESSD云盘](~~122389~~)。
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * 数据盘采用的自动快照策略ID。
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * 数据盘N是否加密。取值范围：
             * <p>
             * - true：加密
             * - false：不加密
             * 
             * 默认值：false
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * 数据盘的描述。长度为2~256个英文或中文字符，不能以`http://`和`https://`开头。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 创建数据盘N使用的快照。N的取值范围为1~16。
             * <p>
             * 
             * 指定参数`DataDisk.N.SnapshotId`后，参数`DataDisk.N.Size`会被忽略，实际创建的云盘大小为指定的快照的大小。不能使用早于2013年7月15日（含）创建的快照，请求会报错被拒绝。
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * 数据盘的挂载点。
             * <p>
             * 
             * >该参数即将被弃用，为提高兼容性，请尽量使用其他参数。
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * 第n个数据盘的容量大小，N的取值范围为1~16，内存单位为GiB。取值范围：
             * <p>
             * 
             * -   cloud_efficiency：20~32768
             * -   cloud_ssd：20~32768
             * -   cloud_essd：20~32768
             * -   cloud：5~2000
             * 
             * 该参数的取值必须大于等于参数`SnapshotId`指定的快照的大小。
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * 数据盘名称。长度为2~128个英文或中文字符。必须以大小字母或中文开头，不能以`http://`和`https://`开头。可以包含数字、半角句号（.）、半角冒号（:）、下划线（_）或者短划线（-）。
             * <p>
             * 
             * 默认值：空
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * 数据盘N的云盘种类。取值范围：
             * <p>
             * 
             * -   cloud_efficiency：高效云盘
             * -   cloud_ssd：SSD云盘
             * -   cloud_essd：ESSD云盘
             * -   cloud：普通云盘。
             * 
             * 对于I/O优化实例，默认值为cloud_efficiency。对于非I/O优化实例，默认值为cloud。
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * EncryptAlgorithm.
             */
            public Builder encryptAlgorithm(String encryptAlgorithm) {
                this.encryptAlgorithm = encryptAlgorithm;
                return this;
            }

            /**
             * 表示数据盘是否随实例释放。取值范围：
             * <p>
             * - true：数据盘随实例释放。
             * - false：数据盘不随实例释放。
             * 
             * 默认值：true
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * 数据盘对应的KMS密钥ID。
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * 专属块存储集群ID。如果您在创建ECS实例时，需要使用专属块存储集群中的云盘资源作为数据盘，请设置该参数。
             */
            public Builder storageClusterId(String storageClusterId) {
                this.storageClusterId = storageClusterId;
                return this;
            }

            /**
             * ProvisionedIops.
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * BurstingEnabled.
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    public static class Arn extends TeaModel {
        @NameInMap("RoleType")
        private String roleType;

        @NameInMap("Rolearn")
        private String rolearn;

        @NameInMap("AssumeRoleFor")
        private Long assumeRoleFor;

        private Arn(Builder builder) {
            this.roleType = builder.roleType;
            this.rolearn = builder.rolearn;
            this.assumeRoleFor = builder.assumeRoleFor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Arn create() {
            return builder().build();
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        /**
         * @return rolearn
         */
        public String getRolearn() {
            return this.rolearn;
        }

        /**
         * @return assumeRoleFor
         */
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public static final class Builder {
            private String roleType; 
            private String rolearn; 
            private Long assumeRoleFor; 

            /**
             * RoleType.
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * Rolearn.
             */
            public Builder rolearn(String rolearn) {
                this.rolearn = rolearn;
                return this;
            }

            /**
             * AssumeRoleFor.
             */
            public Builder assumeRoleFor(Long assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            public Arn build() {
                return new Arn(this);
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

        @NameInMap("QueueNumber")
        private Integer queueNumber;

        @NameInMap("SecurityGroupIds")
        private java.util.List < String > securityGroupIds;

        @NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @NameInMap("QueuePairNumber")
        private Long queuePairNumber;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ipv6AddressCount")
        private Long ipv6AddressCount;

        @NameInMap("Ipv6Address")
        private java.util.List < String > ipv6Address;

        private NetworkInterface(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.networkInterfaceName = builder.networkInterfaceName;
            this.description = builder.description;
            this.securityGroupId = builder.securityGroupId;
            this.primaryIpAddress = builder.primaryIpAddress;
            this.queueNumber = builder.queueNumber;
            this.securityGroupIds = builder.securityGroupIds;
            this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
            this.queuePairNumber = builder.queuePairNumber;
            this.instanceType = builder.instanceType;
            this.ipv6AddressCount = builder.ipv6AddressCount;
            this.ipv6Address = builder.ipv6Address;
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
         * @return queueNumber
         */
        public Integer getQueueNumber() {
            return this.queueNumber;
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List < String > getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return networkInterfaceTrafficMode
         */
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        /**
         * @return queuePairNumber
         */
        public Long getQueuePairNumber() {
            return this.queuePairNumber;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ipv6AddressCount
         */
        public Long getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        /**
         * @return ipv6Address
         */
        public java.util.List < String > getIpv6Address() {
            return this.ipv6Address;
        }

        public static final class Builder {
            private String vSwitchId; 
            private String networkInterfaceName; 
            private String description; 
            private String securityGroupId; 
            private String primaryIpAddress; 
            private Integer queueNumber; 
            private java.util.List < String > securityGroupIds; 
            private String networkInterfaceTrafficMode; 
            private Long queuePairNumber; 
            private String instanceType; 
            private Long ipv6AddressCount; 
            private java.util.List < String > ipv6Address; 

            /**
             * 弹性网卡所属的虚拟交换机ID。
             * <p>
             * 
             * 您需要注意：
             * 
             * - N的取值范围为1~2，设置1个弹性网卡时，支持设置1个主网卡或1个辅助网卡；设置2个弹性网卡时，仅支持同时设置1个主网卡和1个辅助网卡。
             * 
             * - 如果`NetworkInterface.N.InstanceType`取值为`Primary`，则必须设置该参数。此时该参数的作用等同于`VSwitchId`，但需要注意不能同时设置`VSwitchId`参数。
             * 
             * - 如果`NetworkInterface.N.InstanceType`取值为`Secondary`或空值，则该参数为非必填参数。默认值为ECS实例所属的虚拟交换机。
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * 弹性网卡名称。
             * <p>
             * 
             * 您需要注意：
             * 
             * - N的取值范围为1~2，设置1个弹性网卡时，支持设置1个主网卡或1个辅助网卡；设置2个弹性网卡时，仅支持同时设置1个主网卡和1个辅助网卡。
             * 
             * - 如果`NetworkInterface.N.InstanceType`取值为`Primary`，则无需设置该参数。
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * 弹性网卡的描述。
             * <p>
             * 
             * 您需要注意：
             * 
             * - N的取值范围为1~2，设置1个弹性网卡时，支持设置1个主网卡或1个辅助网卡；设置2个弹性网卡时，仅支持同时设置1个主网卡和1个辅助网卡。
             * - 长度为2~256个英文或中文字符，不能以`http://`或`https://`开头。
             * - 如果`NetworkInterface.N.InstanceType`取值为`Primary`，则无需设置该参数。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 弹性网卡所属的安全组ID。
             * <p>
             * 
             * 您需要注意：
             * 
             * - N的取值范围为1~2，设置1个弹性网卡时，支持设置1个主网卡或1个辅助网卡；设置2个弹性网卡时，仅支持同时设置1个主网卡和1个辅助网卡。
             * 
             * - 如果`NetworkInterface.N.InstanceType`取值为`Primary`，则必须设置该参数。此时该参数的作用等同于`SecurityGroupId`，但需要注意不能再设置`SecurityGroupId`、`SecurityGroupIds.N`或`NetworkInterface.N.SecurityGroupIds.N`。
             * 
             * - 如果`NetworkInterface.N.InstanceType`取值为`Secondary`或空值，则该参数为非必填参数。默认值为ECS实例所属的安全组。
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * 添加一张弹性网卡并设置主IP地址。
             * <p>
             * 
             * 您需要注意：
             * 
             * - N的取值范围为1~2：
             *     - 设置1个弹性网卡时，支持设置1个主网卡或1个辅助网卡。如果`Amount`参数取值大于1，且设置了主网卡并设置了该参数，则表示在批量创建ECS实例时，以指定的主IP地址为起始地址，依次为多台ECS实例分配连续的主IP地址，但需要注意，此时不支持再为实例绑定辅助网卡。
             *     - 设置2个弹性网卡时，仅支持同时设置1个主网卡和1个辅助网卡，但需要注意，如果`Amount`参数取值大于1且已为主网卡设置了该参数，则不支持再设置辅助网卡（即不支持再设置`NetworkInterface.2.InstanceType=Secondary`）。
             * 
             * - 如果`NetworkInterface.N.InstanceType`取值为`Primary`，则该参数的作用等同于`PrivateIpAddress`，但需要注意不能同时设置`PrivateIpAddress`参数。
             * 
             * - 如果`NetworkInterface.N.InstanceType`取值为`Secondary`或空值，表示为辅助网卡设置主IP地址。默认从网卡所属的交换机网段中随机选择一个IP地址。
             * 
             * > 创建ECS实例时，您最多能添加一张辅助网卡。实例创建成功后，您可以调用[CreateNetworkInterface](~~58504~~)和[AttachNetworkInterface](~~58515~~)添加更多的辅助网卡。
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
                return this;
            }

            /**
             * 弹性网卡队列数。
             * <p>
             * 
             * 您需要注意：
             * 
             * - N的取值范围为1~2，设置1个弹性网卡时，支持设置1个主网卡或1个辅助网卡；设置2个弹性网卡时，仅支持同时设置1个主网卡和1个辅助网卡。
             * 
             * - 不能超过实例规格允许的单块网卡最大队列数。
             * 
             * - 实例的所有网卡累加队列数不能超过实例规格允许的队列数总配额。实例规格的单块网卡最大队列数和总配额可以通过[DescribeInstanceTypes](~~25620~~)接口查询`MaximumQueueNumberPerEni`、`TotalEniQueueQuantity`字段。
             * 
             * - 如果`NetworkInterface.N.InstanceType`取值为`Primary`，且设置了该参数取值，则不能再设置`NetworkInterfaceQueueNumber`参数。
             */
            public Builder queueNumber(Integer queueNumber) {
                this.queueNumber = queueNumber;
                return this;
            }

            /**
             * 弹性网卡所属的一个或多个安全组ID。
             * <p>
             * 
             * - 第一个N的取值范围为1~2，设置1个弹性网卡时，支持设置1个主网卡或1个辅助网卡；设置2个弹性网卡时，仅支持同时设置1个主网卡和1个辅助网卡。
             * - 第二个N表示可以指定一个或多个安全组ID。N的取值范围与实例能够加入安全组配额有关，更多信息，请参见[安全组限制](~~25412#SecurityGroupQuota1~~)。
             * 
             * 您需要注意：
             * 
             * - 如果`NetworkInterface.N.InstanceType`取值为`Primary`，则必须设置该参数或`NetworkInterface.N.SecurityGroupId`。此时该参数的作用等同于`SecurityGroupIds.N`，但需要注意不能再设置`SecurityGroupId`、`SecurityGroupIds.N`或`NetworkInterface.N.SecurityGroupId`。
             * 
             * - 如果`NetworkInterface.N.InstanceType`取值为`Secondary`或空值，则该参数为非必填参数。默认值为ECS实例所属的安全组。
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * 主网卡的通讯模式。参数取值范围：
             * <p>
             * 
             * - Standard：使用TCP通讯模式。
             * - HighPerformance：开启ERI（Elastic RDMA Interface）接口，使用RDMA通讯模式。
             * 
             * 您需要注意：
             * 
             * - `NetworkInterface.N.InstanceType`取值为`Primary`时，设置该参数才会生效。如果`NetworkInterface.N.InstanceType`取值为`Secondary`或空值，则不能设置该参数。
             * 
             * - HighPerformance参数值只支持RDMA增强型实例规格族c7re，且RDMA模式的弹性网卡数量不能超过该实例规格族的限制。c7re正在华北2（北京）可用区K进行邀测。更多信息，请参见[实例规格族](~~25378~~)。
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * QueuePairNumber.
             */
            public Builder queuePairNumber(Long queuePairNumber) {
                this.queuePairNumber = queuePairNumber;
                return this;
            }

            /**
             * 弹性网卡类型。N的取值范围为1~2，设置1个弹性网卡时，支持设置1个主网卡或1个辅助网卡；设置2个弹性网卡时，仅支持同时设置1个主网卡和1个辅助网卡。
             * <p>
             * 
             * 参数取值范围：
             * 
             * - Primary：主网卡。
             * - Secondary：辅助网卡。
             * 
             * 默认值：Secondary
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * 为主网卡指定随机生成的IPv6地址数量。取值范围：1~10
             * <p>
             * 
             * 您需要注意：
             * 
             * - `NetworkInterface.N.InstanceType`取值为`Primary`时，设置该参数才会生效。如果`NetworkInterface.N.InstanceType`取值为`Secondary`或空值，则不能设置该参数。
             * 
             * - 设置该参数后，您不能再设置`Ipv6AddressCount`、`Ipv6Address.N`或`NetworkInterface.N.Ipv6Address.N`。
             */
            public Builder ipv6AddressCount(Long ipv6AddressCount) {
                this.ipv6AddressCount = ipv6AddressCount;
                return this;
            }

            /**
             * 为主网卡指定一个或多个IPv6地址。支持设置最多10个IPv6地址，即第二个N的取值范围：1~10
             * <p>
             * 
             * 取值示例：`Ipv6Address.1=2001:db8:1234:1a00::***`
             * 
             * 您需要注意：
             * 
             * - `NetworkInterface.N.InstanceType`取值为`Primary`时，设置该参数才会生效。如果`NetworkInterface.N.InstanceType`取值为`Secondary`或空值，则不能设置该参数。
             * 
             * - 设置该参数后，`Amount`取值只能为1，且不能再设置`Ipv6AddressCount`、`Ipv6Address.N`或`NetworkInterface.N.Ipv6AddressCount`。
             */
            public Builder ipv6Address(java.util.List < String > ipv6Address) {
                this.ipv6Address = ipv6Address;
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
             * 实例、云盘和主网卡的标签键。N的取值范围：1~20。一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以aliyun和acs:开头，不能包含http://或 https://。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 实例、云盘和主网卡的标签值。N的取值范围：1~20。一旦传入该值，可以为空字符串。最多支持128个字符，不能以acs:开头，不能包含http://或者https://。
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
