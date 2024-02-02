// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @Query
    @NameInMap("CpuOptions")
    private CpuOptions cpuOptions;

    @Query
    @NameInMap("HibernationOptions")
    private HibernationOptions hibernationOptions;

    @Query
    @NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @Query
    @NameInMap("SchedulerOptions")
    private SchedulerOptions schedulerOptions;

    @Query
    @NameInMap("SecurityOptions")
    private SecurityOptions securityOptions;

    @Query
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("Affinity")
    private String affinity;

    @Query
    @NameInMap("Amount")
    @Validation(maximum = 1000, minimum = 1)
    private Integer amount;

    @Query
    @NameInMap("Arn")
    private java.util.List < Arn> arn;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoReleaseTime")
    private String autoReleaseTime;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CreditSpecification")
    private String creditSpecification;

    @Query
    @NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @Query
    @NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @Query
    @NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @Query
    @NameInMap("DeploymentSetGroupNo")
    private Integer deploymentSetGroupNo;

    @Query
    @NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("HostNames")
    private java.util.List < String > hostNames;

    @Query
    @NameInMap("HpcClusterId")
    private String hpcClusterId;

    @Query
    @NameInMap("HttpEndpoint")
    private String httpEndpoint;

    @Query
    @NameInMap("HttpPutResponseHopLimit")
    private Integer httpPutResponseHopLimit;

    @Query
    @NameInMap("HttpTokens")
    private String httpTokens;

    @Query
    @NameInMap("ImageFamily")
    private String imageFamily;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageOptions")
    private ImageOptions imageOptions;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("InternetMaxBandwidthIn")
    private Integer internetMaxBandwidthIn;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("Ipv6Address")
    private java.util.List < String > ipv6Address;

    @Query
    @NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @Query
    @NameInMap("Isp")
    private String isp;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @Query
    @NameInMap("LaunchTemplateName")
    private String launchTemplateName;

    @Query
    @NameInMap("LaunchTemplateVersion")
    private Long launchTemplateVersion;

    @Query
    @NameInMap("MinAmount")
    @Validation(maximum = 100, minimum = 1)
    private Integer minAmount;

    @Query
    @NameInMap("NetworkInterface")
    private java.util.List < NetworkInterface> networkInterface;

    @Query
    @NameInMap("NetworkInterfaceQueueNumber")
    private Integer networkInterfaceQueueNumber;

    @Query
    @NameInMap("NetworkOptions")
    private NetworkOptions networkOptions;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("PasswordInherit")
    private Boolean passwordInherit;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityEnhancementStrategy")
    private String securityEnhancementStrategy;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    @Query
    @NameInMap("SpotDuration")
    @Validation(maximum = 6)
    private Integer spotDuration;

    @Query
    @NameInMap("SpotInterruptionBehavior")
    private String spotInterruptionBehavior;

    @Query
    @NameInMap("SpotPriceLimit")
    @Validation(maximum = 999999)
    private Float spotPriceLimit;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("StorageSetId")
    private String storageSetId;

    @Query
    @NameInMap("StorageSetPartitionNumber")
    private Integer storageSetPartitionNumber;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Tenancy")
    private String tenancy;

    @Query
    @NameInMap("UniqueSuffix")
    private Boolean uniqueSuffix;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private RunInstancesRequest(Builder builder) {
        super(builder);
        this.cpuOptions = builder.cpuOptions;
        this.hibernationOptions = builder.hibernationOptions;
        this.privatePoolOptions = builder.privatePoolOptions;
        this.schedulerOptions = builder.schedulerOptions;
        this.securityOptions = builder.securityOptions;
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.affinity = builder.affinity;
        this.amount = builder.amount;
        this.arn = builder.arn;
        this.autoPay = builder.autoPay;
        this.autoReleaseTime = builder.autoReleaseTime;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.clientToken = builder.clientToken;
        this.creditSpecification = builder.creditSpecification;
        this.dataDisk = builder.dataDisk;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.deletionProtection = builder.deletionProtection;
        this.deploymentSetGroupNo = builder.deploymentSetGroupNo;
        this.deploymentSetId = builder.deploymentSetId;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.hostName = builder.hostName;
        this.hostNames = builder.hostNames;
        this.hpcClusterId = builder.hpcClusterId;
        this.httpEndpoint = builder.httpEndpoint;
        this.httpPutResponseHopLimit = builder.httpPutResponseHopLimit;
        this.httpTokens = builder.httpTokens;
        this.imageFamily = builder.imageFamily;
        this.imageId = builder.imageId;
        this.imageOptions = builder.imageOptions;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.ioOptimized = builder.ioOptimized;
        this.ipv6Address = builder.ipv6Address;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.isp = builder.isp;
        this.keyPairName = builder.keyPairName;
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateName = builder.launchTemplateName;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.minAmount = builder.minAmount;
        this.networkInterface = builder.networkInterface;
        this.networkInterfaceQueueNumber = builder.networkInterfaceQueueNumber;
        this.networkOptions = builder.networkOptions;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
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
        this.spotInterruptionBehavior = builder.spotInterruptionBehavior;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.spotStrategy = builder.spotStrategy;
        this.storageSetId = builder.storageSetId;
        this.storageSetPartitionNumber = builder.storageSetPartitionNumber;
        this.tag = builder.tag;
        this.tenancy = builder.tenancy;
        this.uniqueSuffix = builder.uniqueSuffix;
        this.userData = builder.userData;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
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
     * @return cpuOptions
     */
    public CpuOptions getCpuOptions() {
        return this.cpuOptions;
    }

    /**
     * @return hibernationOptions
     */
    public HibernationOptions getHibernationOptions() {
        return this.hibernationOptions;
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
     * @return affinity
     */
    public String getAffinity() {
        return this.affinity;
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return arn
     */
    public java.util.List < Arn> getArn() {
        return this.arn;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return deploymentSetGroupNo
     */
    public Integer getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return hostNames
     */
    public java.util.List < String > getHostNames() {
        return this.hostNames;
    }

    /**
     * @return hpcClusterId
     */
    public String getHpcClusterId() {
        return this.hpcClusterId;
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
     * @return imageOptions
     */
    public ImageOptions getImageOptions() {
        return this.imageOptions;
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
     * @return ipv6Address
     */
    public java.util.List < String > getIpv6Address() {
        return this.ipv6Address;
    }

    /**
     * @return ipv6AddressCount
     */
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
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
     * @return launchTemplateVersion
     */
    public Long getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    /**
     * @return minAmount
     */
    public Integer getMinAmount() {
        return this.minAmount;
    }

    /**
     * @return networkInterface
     */
    public java.util.List < NetworkInterface> getNetworkInterface() {
        return this.networkInterface;
    }

    /**
     * @return networkInterfaceQueueNumber
     */
    public Integer getNetworkInterfaceQueueNumber() {
        return this.networkInterfaceQueueNumber;
    }

    /**
     * @return networkOptions
     */
    public NetworkOptions getNetworkOptions() {
        return this.networkOptions;
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
     * @return password
     */
    public String getPassword() {
        return this.password;
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
     * @return spotInterruptionBehavior
     */
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
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
     * @return storageSetId
     */
    public String getStorageSetId() {
        return this.storageSetId;
    }

    /**
     * @return storageSetPartitionNumber
     */
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return tenancy
     */
    public String getTenancy() {
        return this.tenancy;
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
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<RunInstancesRequest, Builder> {
        private CpuOptions cpuOptions; 
        private HibernationOptions hibernationOptions; 
        private PrivatePoolOptions privatePoolOptions; 
        private SchedulerOptions schedulerOptions; 
        private SecurityOptions securityOptions; 
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private String affinity; 
        private Integer amount; 
        private java.util.List < Arn> arn; 
        private Boolean autoPay; 
        private String autoReleaseTime; 
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private String clientToken; 
        private String creditSpecification; 
        private java.util.List < DataDisk> dataDisk; 
        private String dedicatedHostId; 
        private Boolean deletionProtection; 
        private Integer deploymentSetGroupNo; 
        private String deploymentSetId; 
        private String description; 
        private Boolean dryRun; 
        private String hostName; 
        private java.util.List < String > hostNames; 
        private String hpcClusterId; 
        private String httpEndpoint; 
        private Integer httpPutResponseHopLimit; 
        private String httpTokens; 
        private String imageFamily; 
        private String imageId; 
        private ImageOptions imageOptions; 
        private String instanceChargeType; 
        private String instanceName; 
        private String instanceType; 
        private String internetChargeType; 
        private Integer internetMaxBandwidthIn; 
        private Integer internetMaxBandwidthOut; 
        private String ioOptimized; 
        private java.util.List < String > ipv6Address; 
        private Integer ipv6AddressCount; 
        private String isp; 
        private String keyPairName; 
        private String launchTemplateId; 
        private String launchTemplateName; 
        private Long launchTemplateVersion; 
        private Integer minAmount; 
        private java.util.List < NetworkInterface> networkInterface; 
        private Integer networkInterfaceQueueNumber; 
        private NetworkOptions networkOptions; 
        private String ownerAccount; 
        private Long ownerId; 
        private String password; 
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
        private String spotInterruptionBehavior; 
        private Float spotPriceLimit; 
        private String spotStrategy; 
        private String storageSetId; 
        private Integer storageSetPartitionNumber; 
        private java.util.List < Tag> tag; 
        private String tenancy; 
        private Boolean uniqueSuffix; 
        private String userData; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(RunInstancesRequest request) {
            super(request);
            this.cpuOptions = request.cpuOptions;
            this.hibernationOptions = request.hibernationOptions;
            this.privatePoolOptions = request.privatePoolOptions;
            this.schedulerOptions = request.schedulerOptions;
            this.securityOptions = request.securityOptions;
            this.systemDisk = request.systemDisk;
            this.sourceRegionId = request.sourceRegionId;
            this.affinity = request.affinity;
            this.amount = request.amount;
            this.arn = request.arn;
            this.autoPay = request.autoPay;
            this.autoReleaseTime = request.autoReleaseTime;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.clientToken = request.clientToken;
            this.creditSpecification = request.creditSpecification;
            this.dataDisk = request.dataDisk;
            this.dedicatedHostId = request.dedicatedHostId;
            this.deletionProtection = request.deletionProtection;
            this.deploymentSetGroupNo = request.deploymentSetGroupNo;
            this.deploymentSetId = request.deploymentSetId;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.hostName = request.hostName;
            this.hostNames = request.hostNames;
            this.hpcClusterId = request.hpcClusterId;
            this.httpEndpoint = request.httpEndpoint;
            this.httpPutResponseHopLimit = request.httpPutResponseHopLimit;
            this.httpTokens = request.httpTokens;
            this.imageFamily = request.imageFamily;
            this.imageId = request.imageId;
            this.imageOptions = request.imageOptions;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.internetChargeType = request.internetChargeType;
            this.internetMaxBandwidthIn = request.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.ioOptimized = request.ioOptimized;
            this.ipv6Address = request.ipv6Address;
            this.ipv6AddressCount = request.ipv6AddressCount;
            this.isp = request.isp;
            this.keyPairName = request.keyPairName;
            this.launchTemplateId = request.launchTemplateId;
            this.launchTemplateName = request.launchTemplateName;
            this.launchTemplateVersion = request.launchTemplateVersion;
            this.minAmount = request.minAmount;
            this.networkInterface = request.networkInterface;
            this.networkInterfaceQueueNumber = request.networkInterfaceQueueNumber;
            this.networkOptions = request.networkOptions;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.password = request.password;
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
            this.spotInterruptionBehavior = request.spotInterruptionBehavior;
            this.spotPriceLimit = request.spotPriceLimit;
            this.spotStrategy = request.spotStrategy;
            this.storageSetId = request.storageSetId;
            this.storageSetPartitionNumber = request.storageSetPartitionNumber;
            this.tag = request.tag;
            this.tenancy = request.tenancy;
            this.uniqueSuffix = request.uniqueSuffix;
            this.userData = request.userData;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * CpuOptions.
         */
        public Builder cpuOptions(CpuOptions cpuOptions) {
            this.putQueryParameter("CpuOptions", cpuOptions);
            this.cpuOptions = cpuOptions;
            return this;
        }

        /**
         * HibernationOptions.
         */
        public Builder hibernationOptions(HibernationOptions hibernationOptions) {
            this.putQueryParameter("HibernationOptions", hibernationOptions);
            this.hibernationOptions = hibernationOptions;
            return this;
        }

        /**
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
            this.putQueryParameter("PrivatePoolOptions", privatePoolOptions);
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }

        /**
         * SchedulerOptions.
         */
        public Builder schedulerOptions(SchedulerOptions schedulerOptions) {
            this.putQueryParameter("SchedulerOptions", schedulerOptions);
            this.schedulerOptions = schedulerOptions;
            return this;
        }

        /**
         * SecurityOptions.
         */
        public Builder securityOptions(SecurityOptions securityOptions) {
            this.putQueryParameter("SecurityOptions", securityOptions);
            this.securityOptions = securityOptions;
            return this;
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
         * Specifies whether to associate an instance on a dedicated host with the dedicated host. Valid values:
         * <p>
         * 
         * *   default: does not associate the instance with the dedicated host. When you start an instance that was stopped in economical mode, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool if the available resources of the original dedicated host are insufficient.
         * *   host: associates the instance with the dedicated host. When you start an instance that was stopped in economical mode, the instance remains on the original dedicated host. If the available resources of the original dedicated host are insufficient, the instance cannot be started.
         * 
         * Default value: default.
         */
        public Builder affinity(String affinity) {
            this.putQueryParameter("Affinity", affinity);
            this.affinity = affinity;
            return this;
        }

        /**
         * The number of instances that you want to create. Valid values: 1 to 100.
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
         * > This parameter is in invitational preview and is unavailable.
         */
        public Builder arn(java.util.List < Arn> arn) {
            this.putQueryParameter("Arn", arn);
            this.arn = arn;
            return this;
        }

        /**
         * Specifies whether to automatically complete the payment for instance creation. Valid values:
         * <p>
         * 
         * - true: The payment is automatically completed.true: The payment is automatically completed.
         *   >Make sure that your account balance is sufficient. Otherwise, your order becomes invalid and is canceled. If your account balance is insufficient, you can set `AutoPay` to `false` to generate an unpaid order. Then, you can log on to the ECS console to pay for the order.
         * 
         * - false: An order is generated but no payment is made.
         *   >When `InstanceChargeType` is set to `PostPaid`, `AutoPay` cannot be set to `false`.
         * 
         * Default value: true.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The time when to automatically release the pay-as-you-go instance. Specify the time in the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.
         * <p>
         * 
         * *   If the value of seconds (`ss`) is not `00`, the time is automatically rounded to the nearest minute based on the value of minutes (`mm`).
         * *   The specified time must be at least 30 minutes later than the current time.
         * *   The specified time can be at most three years from the current time.
         */
        public Builder autoReleaseTime(String autoReleaseTime) {
            this.putQueryParameter("AutoReleaseTime", autoReleaseTime);
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for the instance. This parameter is valid only when the `InstanceChargeType` parameter is set to `PrePaid`. Valid values:
         * <p>
         * 
         * *   true: enables auto-renewal.
         * *   false: does not enable auto-renewal.
         * 
         * Default value: false.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal period of the instance. Valid values:
         * <p>
         * 
         * *   Valid values when PeriodUnit is set to Week: 1, 2, and 3.
         * *   Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.
         * 
         * Default value: 1.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The performance mode of the burstable instance. Valid values:
         * <p>
         * 
         * *   Standard: the standard mode. For more information, see the "Standard mode" section in [Burstable instances](~~59977~~).
         * *   Unlimited: the unlimited mode. For more information, see the "Unlimited mode" section in [Burstable instances](~~59977~~).
         */
        public Builder creditSpecification(String creditSpecification) {
            this.putQueryParameter("CreditSpecification", creditSpecification);
            this.creditSpecification = creditSpecification;
            return this;
        }

        /**
         * Details about the data disks.
         */
        public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * The ID of the dedicated host on which to create the instance. If you set the `DedicatedHostId` parameter, the `SpotStrategy` and `SpotPriceLimit` parameters are ignored. This is because preemptible instances cannot be created on dedicated hosts.
         * <p>
         * 
         * You can call the [DescribeDedicatedHosts](~~134242~~) operation to query the list of dedicated host IDs.
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * Specifies whether to enable release protection for the instance. This parameter determines whether you can use the ECS console or call the [DeleteInstance](~~25507~~) operation to release the instance. Valid values:
         * <p>
         * 
         * *   true: enables release protection for the instance.
         * *   false: disables release protection for the instance.
         * 
         * Default value: false.
         * 
         * > This parameter is applicable to only pay-as-you-go instances. It can protect instances against manual releases, but not against automatic releases.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * The number of the deployment set group to which to deploy the instance. If the deployment set specified by the DeploymentSetId parameter uses the high availability group strategy (AvailabilityGroup), you can use the DeploymentSetGroupNo parameter to specify a deployment set group in the deployment set. Valid values: 1 to 7.
         */
        public Builder deploymentSetGroupNo(Integer deploymentSetGroupNo) {
            this.putQueryParameter("DeploymentSetGroupNo", deploymentSetGroupNo);
            this.deploymentSetGroupNo = deploymentSetGroupNo;
            return this;
        }

        /**
         * The ID of the deployment set to which to deploy the instance.
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * The description of the instance. The description must be 2 to 256 characters in length, and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to check the validity of the request without actually making the request. Default value: false. Valid values:
         * <p>
         * 
         * *   true: The validity of the request is checked but the request is not made. Check items include whether required parameters are specified, the request format, service limits, and available ECS resources. If the check fails, the corresponding error code is returned. If the check succeeds, the `DryRunOperation` error code is returned.
         * *   false: The validity of the request is checked, and the request is made if the check succeeds.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The hostname of the instance. Take note of the following items:
         * <p>
         * 
         * *   The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).
         * 
         * *   For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. It can contain letters, digits, and hyphens (-).
         * 
         * *   For instances that run other operating systems such as Linux, take note of the following items:
         * 
         *     *   The hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).
         *     *   You can use the `${instance_id}` placeholder to pass instance IDs into the hostname specified by `HostName`. For example, if you set `HostName` to k8s-${instance_id} and the instance is assigned an ID of `i-123abc****`, the hostname of the instance is `k8s-i-123abc****`.
         * 
         * When you create multiple instances, you can perform the following operations:
         * 
         * *   Batch configure sequential hostnames for the instances. For more information, see [Batch configure sequential names or hostnames for multiple instances](~~196048~~).
         * *   Use the `HostNames.N` parameter to configure different hostnames for instances. You cannot specify both the `HostName` and `HostNames.N` parameters.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * The hostname of instance N. You can use this parameter to specify different hostnames for multiple instances.
         */
        public Builder hostNames(java.util.List < String > hostNames) {
            this.putQueryParameter("HostNames", hostNames);
            this.hostNames = hostNames;
            return this;
        }

        /**
         * The ID of the Elastic High Performance Computing (E-HPC) cluster to which to assign the instance.
         */
        public Builder hpcClusterId(String hpcClusterId) {
            this.putQueryParameter("HpcClusterId", hpcClusterId);
            this.hpcClusterId = hpcClusterId;
            return this;
        }

        /**
         * Specifies whether to enable the access channel for instance metadata. Valid values:
         * <p>
         * 
         * *   enabled
         * *   disabled
         * 
         * Default value: enabled.
         * 
         * > For more information about instance metadata, see [Overview of ECS instance metadata](~~49122~~).
         */
        public Builder httpEndpoint(String httpEndpoint) {
            this.putQueryParameter("HttpEndpoint", httpEndpoint);
            this.httpEndpoint = httpEndpoint;
            return this;
        }

        /**
         * The HTTP PUT response hop limit for accessing instance metadata. Valid values: 1 to 64.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.putQueryParameter("HttpPutResponseHopLimit", httpPutResponseHopLimit);
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        /**
         * Specifies whether to forcefully use the security-enhanced mode (IMDSv2) to access instance metadata. Valid values:
         * <p>
         * 
         * *   optional: does not forcefully use the security-enhanced mode (IMDSv2).
         * *   required: forcefully uses the security-enhanced mode (IMDSv2). After you set this parameter to required, you cannot access instance metadata in normal mode.
         * 
         * Default value: optional.
         * 
         * > For more information about the modes of accessing instance metadata, see [Access mode of instance metadata](~~150575~~).
         */
        public Builder httpTokens(String httpTokens) {
            this.putQueryParameter("HttpTokens", httpTokens);
            this.httpTokens = httpTokens;
            return this;
        }

        /**
         * The name of the image family. You can set this parameter to obtain the latest available custom image from the specified image family to create instances.
         * <p>
         * 
         * *   If you set the `ImageId` parameter, you cannot set the ImageFamily parameter.
         * *   If you do not set the `ImageId` parameter but use the `LaunchTemplateId` or `LaunchTemplateName` parameter to specify a launch template that has the `ImageId` parameter set, you cannot set the ImageFamily parameter.
         * *   If you do not set the `ImageId` parameter but use the `LaunchTemplateId` or `LaunchTemplateName` parameter to specify a launch template that does not have the `ImageId` parameter set, you can set the ImageFamily parameter.
         * *   If you do not set the `ImageId`, `LaunchTemplateId`, or `LaunchTemplateName` parameter, you can set the ImageFamily parameter.
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * The ID of the image to use to create the instance. You can call the [DescribeImages](~~25534~~) operation to query available images. If you do not use the `LaunchTemplateId` or `LaunchTemplateName` parameter to specify a launch template and do not set the `ImageFamily` parameter to obtain the latest available custom image from the specified image family, you must specify the `ImageId` parameter.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The image-related attribute parameters.
         */
        public Builder imageOptions(ImageOptions imageOptions) {
            this.putQueryParameter("ImageOptions", imageOptions);
            this.imageOptions = imageOptions;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   PrePaid: subscription
         * *   PostPaid: pay-as-you-go
         * 
         * Default value: PostPaid.
         * 
         * If you set this parameter to PrePaid, make sure that your account has sufficient balance or credit. Otherwise, an `InvalidPayMethod` error is returned.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). The default value of this parameter is the `InstanceId` value.
         * <p>
         * 
         * When you batch create instances, you can batch configure sequential names for the instances. For more information, see [Batch configure sequential names or hostnames for multiple instances](~~196048~~).
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The instance type. If you do not use `LaunchTemplateId` or `LaunchTemplateName` to specify a launch template, you must set the `InstanceType` parameter.
         * <p>
         * 
         * *   Select an instance type. See [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the performance data of an instance type, or see [Best practices for instance type selection](~~58291~~) to learn about how to select instance types.
         * *   Query available resources. Call the [DescribeAvailableResource](~~66186~~) operation to query available resources in a specific region or zone.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The billing method for network usage. Valid values:
         * <p>
         * 
         * *   PayByBandwidth: pay-by-bandwidth
         * *   PayByTraffic: pay-by-traffic
         * 
         * Default value: PayByTraffic.
         * 
         * > When the **pay-by-traffic** billing method for network usage is used, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** billing method for network usage.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
         * <p>
         * 
         * *   When the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of InternetMaxBandwidthIn are 1 to 10, and the default value is 10.
         * *   When the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the `InternetMaxBandwidthOut` value and the default value is the `InternetMaxBandwidthOut` value.
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
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
         * Specifies whether the instance is I/O optimized. For instances of [retired instance types](~~55263~~), the default value is none. For instances of other instance types, the default value is optimized. Valid values:
         * <p>
         * 
         * *   none: The instance is not I/O optimized.
         * *   optimized: The instance is I/O optimized.
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * IPv6 address N to be assigned to the primary ENI. Valid values of N: 1 to 10.
         * <p>
         * 
         * Example: `Ipv6Address.1=2001:db8:1234:1a00::***`.
         * 
         * Take note of the following items:
         * 
         * *   If the `Ipv6Address.N` parameter is specified, you must set the `Amount` parameter to 1 and leave the `Ipv6AddressCount` parameter empty.
         * *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot set `Ipv6Addresses.N` or `Ipv6AddressCount` and must set `NetworkInterface.N.Ipv6Addresses.N` or `NetworkInterface.N.Ipv6AddressCount`.
         */
        public Builder ipv6Address(java.util.List < String > ipv6Address) {
            this.putQueryParameter("Ipv6Address", ipv6Address);
            this.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * The number of IPv6 addresses to randomly generate for the primary ENI. Valid values: 1 to 10.
         * <p>
         * 
         * Take note of the following items:
         * 
         * *   You cannot specify both the `Ipv6Addresses.N` and `Ipv6AddressCount` parameters.
         * *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot specify `Ipv6Address.N` or `Ipv6AddressCount` but can specify `NetworkInterface.N.Ipv6Address.N` or `NetworkInterface.N.Ipv6AddressCount`.
         */
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * > This parameter is in invitational preview and is unavailable.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * The name of the key pair.
         * <p>
         * 
         * > For Windows instances, this parameter is ignored. This parameter is empty by default. The `Password` parameter takes effect even if the KeyPairName parameter is specified.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The ID of the launch template. For more information, see [DescribeLaunchTemplates](~~73759~~).
         * <p>
         * 
         * To use a launch template to create an instance, you must use the `LaunchTemplateId` or `LaunchTemplateName` parameter to specify the launch template.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * The name of the launch template.
         * <p>
         * 
         * To use a launch template to create an instance, you must use the `LaunchTemplateId` or `LaunchTemplateName` parameter to specify the launch template.
         */
        public Builder launchTemplateName(String launchTemplateName) {
            this.putQueryParameter("LaunchTemplateName", launchTemplateName);
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        /**
         * The version of the launch template. If you set the `LaunchTemplateId` or `LaunchTemplateName` parameter but do not set the version number of the launch template, the default template version is used.
         */
        public Builder launchTemplateVersion(Long launchTemplateVersion) {
            this.putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * The minimum number of instances that can be created. Valid values: 1 to 100.
         * <p>
         * 
         * *   If the number of instances that available resources are sufficient to create is smaller than the MinAmount value, instances cannot be created.
         * *   If the number of ECS instances that available resources are sufficient to create is greater than or equal to the MinAmount value, instances are created based on the number of available resources.
         */
        public Builder minAmount(Integer minAmount) {
            this.putQueryParameter("MinAmount", minAmount);
            this.minAmount = minAmount;
            return this;
        }

        /**
         * The information of the ENI.
         */
        public Builder networkInterface(java.util.List < NetworkInterface> networkInterface) {
            this.putQueryParameter("NetworkInterface", networkInterface);
            this.networkInterface = networkInterface;
            return this;
        }

        /**
         * The number of queues supported by the primary ENI. Take note of the following items:
         * <p>
         * 
         * *   The value of this parameter cannot exceed the maximum number of queues per ENI allowed for the instance type.
         * *   The total number of queues for all ENIs on the instance cannot exceed the queue quota for the instance type. To query the maximum number of queues per ENI and the queue quota for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation to query the `MaximumQueueNumberPerEni` and `TotalEniQueueQuantity` values.
         * *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot specify `NetworkInterfaceQueueNumber` but can specify `NetworkInterface.N.QueueNumber`.
         */
        public Builder networkInterfaceQueueNumber(Integer networkInterfaceQueueNumber) {
            this.putQueryParameter("NetworkInterfaceQueueNumber", networkInterfaceQueueNumber);
            this.networkInterfaceQueueNumber = networkInterfaceQueueNumber;
            return this;
        }

        /**
         * The network-related attribute parameters.
         */
        public Builder networkOptions(NetworkOptions networkOptions) {
            this.putQueryParameter("NetworkOptions", networkOptions);
            this.networkOptions = networkOptions;
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
         * The password of the instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include:
         * <p>
         * 
         *     ()`~!@#$%^&*-_+=|{}[]:;\"<>,.?/
         * 
         * For Windows instances, the password cannot start with a forward slash (/).
         * 
         * > If the `Password` parameter is specified, we recommend that you send requests over HTTPS to prevent password leaks.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Specifies whether to use the password preset in the image. Valid values:
         * <p>
         * 
         * *   true: uses the preset password.
         * *   false: does not use the preset password.
         * 
         * Default value: false.
         * 
         * > If you set this parameter to true, make sure that you leave the Password parameter empty and the selected image has a preset password.
         */
        public Builder passwordInherit(Boolean passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
            return this;
        }

        /**
         * The subscription period of the instance. The unit is specified by the `PeriodUnit` parameter. This parameter is valid and required only when `InstanceChargeType` is set to `PrePaid`. If the `DedicatedHostId` parameter is specified, the value of Period must not exceed the subscription period of the specified dedicated host. Valid values:
         * <p>
         * 
         * *   Valid values when PeriodUnit is set to Week: 1, 2, 3, and 4.
         * *   Valid values when PeriodUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the subscription period. Default value: Month. Valid values:
         * <p>
         * 
         * *   Week
         * *   Month
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The private IP address to assign to the instance. To assign a private IP address to an instance of the VPC type, make sure that the IP address is an idle IP address within the CIDR block of the vSwitch specified by the `VSwitchId` parameter.
         * <p>
         * 
         * Take note of the following items:
         * 
         * *   If the `PrivateIpAddress` parameter is specified, take note of the following items:
         * 
         *     *   If `Amount` is set to 1, a single instance is created and the specified private IP address is assigned to the instance.
         *     *   If `Amount` is set to a numeric value greater than 1, the specified number of instances are created and consecutive private IP addresses starting from the specified one are assigned to the instances. In this case, you cannot specify parameters that start with `NetworkInterface.N` to bind secondary ENIs to the instances.
         * 
         * *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot specify `PrivateIpAddress` but can specify `NetworkInterface.N.PrimaryIpAddress`.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The name of the Resource Access Management (RAM) role. You can call the [ListRoles](~~28713~~) operation provided by RAM to query the instance RAM roles that you created.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * The ID of the region in which to create the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which to assign the instance.
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
         * Specifies whether to enable security hardening. Valid values:
         * <p>
         * 
         * *   Active: enables security hardening. This value is applicable only to public images.
         * *   Deactive: does not enable security hardening. This value is applicable to all images.
         */
        public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
            this.putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }

        /**
         * The ID of the security group to which to assign the instance. Instances in the same security group can communicate with each other. The maximum number of instances that a security group can contain depends on the type of the security group. For more information, see the "Security group limits" section in [Limits](~~25412~~).
         * <p>
         * 
         * > The network type of the new instance must be the same as that of the security group specified by the `SecurityGroupId` parameter. For example, if the specified security group is of the VPC type, the new instance is also of the VPC type and you must specify the `VSwitchId` parameter.
         * 
         * If you do not use `LaunchTemplateId` or `LaunchTemplateName` to specify a launch template, you must set the SecurityGroupId parameter. Take note of the following items:
         * 
         * *   You can set `SecurityGroupId` to specify a single security group or set `SecurityGroupIds.N` to specify one or more security groups. However, you cannot specify both `SecurityGroupId` and `SecurityGroupIds.N`.
         * *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot specify `SecurityGroupId` or `SecurityGroupIds.N` but can specify only `NetworkInterface.N.SecurityGroupId` or `NetworkInterface.N.SecurityGroupIds.N`.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The ID of security group N to which to assign the instance. The valid values of N vary based on the maximum number of security groups to which an instance can belong. For more information, see the "Security group limits" section in [Limits](~~101348~~).
         * <p>
         * 
         * Take note of the following items:
         * 
         * *   You cannot specify both the `SecurityGroupId` and `SecurityGroupIds.N` parameters.
         * *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot specify `SecurityGroupId` or `SecurityGroupIds.N` but can specify `NetworkInterface.N.SecurityGroupId` or `NetworkInterface.N.SecurityGroupIds.N`.
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * The protection period of the preemptible instance. Unit: hours. Valid values: 0, 1, 2, 3, 4, 5, and 6.
         * <p>
         * 
         * *   Protection periods of 2, 3, 4, 5, and 6 hours are in invitational preview. If you want to set this parameter to one of these values, submit a ticket.
         * *   If this parameter is set to 0, no protection period is configured for the preemptible instance.
         * 
         * Default value: 1.
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * The interruption mode of the preemptible instance. Default value: Terminate. Set the value to Terminate, which specifies to release the instance.
         */
        public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
            this.putQueryParameter("SpotInterruptionBehavior", spotInterruptionBehavior);
            this.spotInterruptionBehavior = spotInterruptionBehavior;
            return this;
        }

        /**
         * The maximum hourly price of the instance. The value is accurate to three decimal places. This parameter is valid only when the `SpotStrategy` parameter is set to `SpotWithPriceLimit`.
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * The bidding policy for the pay-as-you-go instance. This parameter is valid only when the `InstanceChargeType` parameter is set to `PostPaid`. Valid values:
         * <p>
         * 
         * *   NoSpot: The instance is created as a pay-as-you-go instance.
         * *   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.
         * *   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.
         * 
         * Default value: NoSpot.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
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
         * The maximum number of partitions in the storage set. Valid values: greater than or equal to 2.
         */
        public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.putQueryParameter("StorageSetPartitionNumber", storageSetPartitionNumber);
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }

        /**
         * The tags to add to the instance, disks, and primary ENI. You can specify up to 20 tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Specifies whether to create the instance on a dedicated host. Valid values:
         * <p>
         * 
         * *   default: creates the instance on a non-dedicated host.
         * *   host: creates the instance on a dedicated host. If you do not set the `DedicatedHostId` parameter, Alibaba Cloud selects a dedicated host for the instance.
         * 
         * Default value: default.
         */
        public Builder tenancy(String tenancy) {
            this.putQueryParameter("Tenancy", tenancy);
            this.tenancy = tenancy;
            return this;
        }

        /**
         * Specifies whether to automatically append incremental suffixes to the hostname specified by the `HostName` parameter and to the instance name specified by the `InstanceName` parameter when you batch create instances. The incremental suffixes can range from 001 to 999. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         * 
         * When the `HostName` or `InstanceName` value is set in the `name_prefix[begin_number,bits]` format without `name_suffix`, the `UniqueSuffix` parameter does not take effect. The names are sorted in the specified sequence.
         * 
         * For more information, see [Batch configure sequential names or hostnames for multiple instances](~~196048~~).
         */
        public Builder uniqueSuffix(Boolean uniqueSuffix) {
            this.putQueryParameter("UniqueSuffix", uniqueSuffix);
            this.uniqueSuffix = uniqueSuffix;
            return this;
        }

        /**
         * The user data of the instance. The user data must be encoded in Base64. The raw data can be up to 16 KB in size.
         * <p>
         * 
         * > If the instance type supports [user data](~~~49121~), you can use the UserData parameter to pass in user data. We recommend that you do not pass in confidential information (such as passwords or private keys) in plaintext as user data. This is because the system does not encrypt UserData values when API requests are transmitted. If you must pass in confidential information, we recommend that you encrypt and encode the information in Base64, and then decode and decrypt the information in the same way within the instance.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The ID of the vSwitch to which to connect to the instance. You must set this parameter when you create an instance of the VPC type. The specified vSwitch and security group must belong to the same VPC. You can call the [DescribeVSwitches](~~35748~~) operation to query available vSwitches.
         * <p>
         * 
         * Take note of the following items:
         * 
         * *   If you specify the `VSwitchId` parameter, the zone specified by the `ZoneId` parameter must be the zone where the specified vSwitch is located. You can also leave the `ZoneId` parameter empty. Then, the system selects the zone where the specified vSwitch resides.
         * *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot specify `VSwitchId` but can specify `NetworkInterface.N.VSwitchId`.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the zone in which to create the instance. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.
         * <p>
         * 
         * > If you specify the `VSwitchId` parameter, the zone specified by the `ZoneId` parameter must be the zone where the vSwitch is located. You can also leave the `ZoneId` parameter empty. Then, the system selects the zone where the specified vSwitch is located.
         * 
         * This parameter is empty by default.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public RunInstancesRequest build() {
            return new RunInstancesRequest(this);
        } 

    } 

    public static class CpuOptions extends TeaModel {
        @NameInMap("Core")
        private Integer core;

        @NameInMap("Numa")
        private String numa;

        @NameInMap("ThreadsPerCore")
        private Integer threadsPerCore;

        @NameInMap("TopologyType")
        private String topologyType;

        private CpuOptions(Builder builder) {
            this.core = builder.core;
            this.numa = builder.numa;
            this.threadsPerCore = builder.threadsPerCore;
            this.topologyType = builder.topologyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CpuOptions create() {
            return builder().build();
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

        /**
         * @return threadsPerCore
         */
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

        /**
         * @return topologyType
         */
        public String getTopologyType() {
            return this.topologyType;
        }

        public static final class Builder {
            private Integer core; 
            private String numa; 
            private Integer threadsPerCore; 
            private String topologyType; 

            /**
             * The number of CPU cores. This parameter cannot be specified but only uses its default value.
             * <p>
             * 
             * For information about the default value, see [Customize CPU options](~~145895~~).
             */
            public Builder core(Integer core) {
                this.core = core;
                return this;
            }

            /**
             * This parameter is no longer used.
             */
            public Builder numa(String numa) {
                this.numa = numa;
                return this;
            }

            /**
             * The number of threads per CPU core. The following formula is used to calculate the number of vCPUs of the instance: `CpuOptions.Core` value × `CpuOptions.ThreadPerCore` value.
             * <p>
             * 
             * *   The following formula is used to calculate the number of vCPUs of the instance: `CpuOptions.Core` value × CpuOptions.ThreadPerCore value.
             * *   This parameter is applicable only to specific instance types.
             * 
             * For information about valid values and the default value, see [Customize CPU options](~~145895~~).
             */
            public Builder threadsPerCore(Integer threadsPerCore) {
                this.threadsPerCore = threadsPerCore;
                return this;
            }

            /**
             * The CPU topology type of the instance. Valid values:
             * <p>
             * 
             * - ContinuousCoreToHTMapping: The Hyper-Threading (HT) technology allows continuous threads to run on the same core in the CPU topology of the instance.
             * 
             * - DiscreteCoreToHTMapping: The HT technology allows discrete threads to run on the same core in the CPU topology of the instance.
             * 
             * This parameter is empty by default.
             * 
             * >This parameter is supported only for specific instance families. For more information about the supported instance families, see [View and modify the CPU topology](~~2636059~~).
             */
            public Builder topologyType(String topologyType) {
                this.topologyType = topologyType;
                return this;
            }

            public CpuOptions build() {
                return new CpuOptions(this);
            } 

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
             * > This parameter is in invitational preview and is unavailable.
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
    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("MatchCriteria")
        private String matchCriteria;

        private PrivatePoolOptions(Builder builder) {
            this.id = builder.id;
            this.matchCriteria = builder.matchCriteria;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return matchCriteria
         */
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public static final class Builder {
            private String id; 
            private String matchCriteria; 

            /**
             * The ID of the private pool. The ID of a private pool is the same as that of the elasticity assurance or capacity reservation for which the private pool is generated.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The type of the private pool to use to create the instance. A private pool is generated after an elasticity assurance or a capacity reservation takes effect. You can select the private pool when you start an instance. Valid values:
             * <p>
             * 
             * *   Open: open private pool. The system selects a matching open private pool to create the instance. If no matching open private pools are found, resources in the public pool are used. When you set this parameter to Open, you can leave the `PrivatePoolOptions.Id` parameter empty.
             * *   Target: specified private pool. The system uses the capacity in a specified private pool to create the instance. If the specified private pool is unavailable, the instance cannot be created. If you set this parameter to Target, you must specify the `PrivatePoolOptions.Id` parameter.
             * *   None: no private pool. The capacity in private pools is not used.
             * 
             * Default value: None.
             * 
             * In the following scenarios, the PrivatePoolOptions.MatchCriteria parameter can be set only to `None` or left empty:
             * 
             * *   A preemptible instance is created.
             * *   The instance is created in the classic network.
             * *   The instance is created on a dedicated host.
             */
            public Builder matchCriteria(String matchCriteria) {
                this.matchCriteria = matchCriteria;
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
             * The ID of the dedicated host cluster in which to create the instance. After this parameter is specified, the system selects one dedicated host from the specified cluster to create the instance.
             * <p>
             * 
             * > This parameter is valid only when the `Tenancy` parameter is set to `host`.
             * 
             * When you specify both the `DedicatedHostId` and `SchedulerOptions.DedicatedHostClusterId` parameters, take note of the following items:
             * 
             * *   If the specified dedicated host belongs to the specified dedicated host cluster, the instance is preferentially deployed on the specified dedicated host.
             * *   If the specified dedicated host does not belong to the specified dedicated host cluster, the instance cannot be created.
             * 
             * You can call the [DescribeDedicatedHostClusters](~~184145~~) operation to query the list of dedicated host cluster IDs.
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
             * The confidential computing mode. Set the value to Enclave.
             * <p>
             * 
             * A value of Enclave indicates that an enclave-based confidential computing environment is built on the instance. When you call the `RunInstances` operation, you can set this parameter only for c7, g7, or r7 instances to use enclave-based confidential computing. Take note of the following items:
             * 
             * *   The confidential computing feature is in invitational preview. To use this feature, submit a ticket.
             * *   When you use the ECS API to create instances that support enclave-based confidential computing, you can call only the `RunInstances` operation. The `CreateInstance` operation does not support the `SecurityOptions.ConfidentialComputingMode` parameter.
             * *   Enclave-based confidential computing is implemented based on the Alibaba Cloud trusted system (vTPM). When you build a confidential computing environment on an instance by using Enclave, the Alibaba Cloud trusted system is enabled for the instance. Therefore, if you set `SecurityOptions.ConfidentialComputingMode` to Enclave when you call this operation, the created instances use enclave-based confidential computing and the Alibaba Cloud trusted system regardless of whether `SecurityOptions.TrustedSystemMode` is set to vTPM.
             * 
             * For more information about confidential computing, see [Build a confidential computing environment by using Enclave](~~203433~~).
             */
            public Builder confidentialComputingMode(String confidentialComputingMode) {
                this.confidentialComputingMode = confidentialComputingMode;
                return this;
            }

            /**
             * The trusted system mode. Set the value to vTPM.
             * <p>
             * 
             * The trusted system mode supports the following instance families:
             * 
             * *   g7, c7, and r7
             * *   Security-enhanced instance families: g7t, c7t, and r7t
             * 
             * When you create instances of the preceding instance families, you must set this parameter. Take note of the following items:
             * 
             * *   To use the Alibaba Cloud trusted system, set this parameter to vTPM. Then, the Alibaba Cloud trusted system performs trust verifications when the instances start.
             * *   If you do not want to use the Alibaba Cloud trusted system, leave this parameter empty. Note that if your created instances use an enclave-based confidential computing environment (with `SecurityOptions.ConfidentialComputingMode` set to Enclave), the Alibaba Cloud trusted system is enabled for the instances.
             * *   When you use the ECS API to create instances that use the trusted system, you can call only the `RunInstances` operation. The `CreateInstance` operation does not support the `SecurityOptions.TrustedSystemMode` parameter.
             * 
             * > If you have configured an instance as a trusted one when you created the instance, you can use only an image that support the trusted system to replace the system disk of the instance.
             * 
             * For more information about the trusted system, see [Overview](~~201394~~).
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
    public static class SystemDisk extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @NameInMap("Category")
        private String category;

        @NameInMap("Description")
        private String description;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Size")
        private String size;

        @NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @NameInMap("EncryptAlgorithm")
        private String encryptAlgorithm;

        @NameInMap("Encrypted")
        private String encrypted;

        @NameInMap("KMSKeyId")
        private String KMSKeyId;

        @NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @NameInMap("StorageClusterId")
        private String storageClusterId;

        private SystemDisk(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.category = builder.category;
            this.description = builder.description;
            this.diskName = builder.diskName;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
            this.burstingEnabled = builder.burstingEnabled;
            this.encryptAlgorithm = builder.encryptAlgorithm;
            this.encrypted = builder.encrypted;
            this.KMSKeyId = builder.KMSKeyId;
            this.provisionedIops = builder.provisionedIops;
            this.storageClusterId = builder.storageClusterId;
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
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return burstingEnabled
         */
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        /**
         * @return encryptAlgorithm
         */
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
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
         * @return provisionedIops
         */
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        /**
         * @return storageClusterId
         */
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

        public static final class Builder {
            private String autoSnapshotPolicyId; 
            private String category; 
            private String description; 
            private String diskName; 
            private String performanceLevel; 
            private String size; 
            private Boolean burstingEnabled; 
            private String encryptAlgorithm; 
            private String encrypted; 
            private String KMSKeyId; 
            private Long provisionedIops; 
            private String storageClusterId; 

            /**
             * The ID of the automatic snapshot policy to apply to the system disk.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * The category of the system disk. Valid values:
             * <p>
             * 
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             * *   cloud_essd: enhanced SSD (ESSD)
             * *   cloud: basic disk
             * *   cloud_auto: ESSD AutoPL disk
             * 
             * For non-I/O optimized instances of retired instance types, the default value is cloud. For other instances, the default value is cloud_efficiency.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The description of the system disk. The description must be 2 to 256 characters in length. The description can contain letters but cannot start with `http://` or `https://`.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the system disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-).
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * The performance level of the ESSD to use as the system disk. Default value: PL1. Valid values:
             * <p>
             * 
             * *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
             * *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
             * *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
             * *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
             * 
             * For more information about ESSD performance levels, see [ESSDs](~~122389~~).
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The size of the system disk. Unit: GiB. Valid values: 20 to 500.
             * <p>
             * 
             * The value of this parameter must be at least 20 and greater than or equal to the image size.
             * 
             * Default value: 40 or the image size, whichever is greater.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Specifies whether to enable the burst feature for the system disk. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * > This parameter is available only if you set `SystemDisk.Category` to `cloud_auto`.
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * The algorithm to use to encrypt the system disk. Valid values:
             * <p>
             * 
             * *   ase-256
             * *   sm4-128
             * 
             * Default value: ase-256.
             */
            public Builder encryptAlgorithm(String encryptAlgorithm) {
                this.encryptAlgorithm = encryptAlgorithm;
                return this;
            }

            /**
             * Specifies whether to encrypt the system disk. Valid values:
             * <p>
             * 
             * *   true: encrypts the data disk.
             * *   false: does not encrypt the data disk.
             * 
             * Default value: false.
             * 
             * > The system disks of instances cannot be encrypted during instance creation in Hong Kong Zone D or Singapore Zone A.
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The ID of the KMS key to use for the system disk.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * The provisioned read/write IOPS of the ESSD AutoPL disk to use as the system disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}
             * <p>
             * 
             * Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}
             * 
             * > This parameter is available only if you set the SystemDisk.Category parameter to cloud_auto. For more information, see [ESSD AutoPL disks](~~368372~~) and [Modify the performance configurations of an ESSD AutoPL disk](~~413275~~).
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * The ID of the dedicated block storage cluster. If you want to use disks in a dedicated block storage cluster as system disks when you create instances, you must specify this parameter.
             */
            public Builder storageClusterId(String storageClusterId) {
                this.storageClusterId = storageClusterId;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    public static class Arn extends TeaModel {
        @NameInMap("AssumeRoleFor")
        private Long assumeRoleFor;

        @NameInMap("RoleType")
        private String roleType;

        @NameInMap("Rolearn")
        private String rolearn;

        private Arn(Builder builder) {
            this.assumeRoleFor = builder.assumeRoleFor;
            this.roleType = builder.roleType;
            this.rolearn = builder.rolearn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Arn create() {
            return builder().build();
        }

        /**
         * @return assumeRoleFor
         */
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
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

        public static final class Builder {
            private Long assumeRoleFor; 
            private String roleType; 
            private String rolearn; 

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder assumeRoleFor(Long assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder rolearn(String rolearn) {
                this.rolearn = rolearn;
                return this;
            }

            public Arn build() {
                return new Arn(this);
            } 

        } 

    }
    public static class DataDisk extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @NameInMap("Category")
        private String category;

        @NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @NameInMap("Description")
        private String description;

        @NameInMap("Device")
        private String device;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("EncryptAlgorithm")
        private String encryptAlgorithm;

        @NameInMap("Encrypted")
        private String encrypted;

        @NameInMap("KMSKeyId")
        private String KMSKeyId;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("StorageClusterId")
        private String storageClusterId;

        private DataDisk(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.burstingEnabled = builder.burstingEnabled;
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.description = builder.description;
            this.device = builder.device;
            this.diskName = builder.diskName;
            this.encryptAlgorithm = builder.encryptAlgorithm;
            this.encrypted = builder.encrypted;
            this.KMSKeyId = builder.KMSKeyId;
            this.performanceLevel = builder.performanceLevel;
            this.provisionedIops = builder.provisionedIops;
            this.size = builder.size;
            this.snapshotId = builder.snapshotId;
            this.storageClusterId = builder.storageClusterId;
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
         * @return encryptAlgorithm
         */
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
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

        /**
         * @return storageClusterId
         */
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

        public static final class Builder {
            private String autoSnapshotPolicyId; 
            private Boolean burstingEnabled; 
            private String category; 
            private Boolean deleteWithInstance; 
            private String description; 
            private String device; 
            private String diskName; 
            private String encryptAlgorithm; 
            private String encrypted; 
            private String KMSKeyId; 
            private String performanceLevel; 
            private Long provisionedIops; 
            private Integer size; 
            private String snapshotId; 
            private String storageClusterId; 

            /**
             * The ID of the automatic snapshot policy to apply to data disk N.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * The category of data disk N. Valid values:
             * <p>
             * 
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             * *   cloud_essd: ESSD
             * *   cloud: basic disk
             * *   cloud_auto: ESSD AutoPL disk
             * 
             * For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Specifies whether to release data disk N when the instance is released. Valid values:
             * <p>
             * 
             * *   true: releases data disk N when the instance is released.
             * *   false: does not release data disk N when the instance is released.
             * 
             * Default value: true.
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * The description of data disk N. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The mount point of data disk N.
             * <p>
             * 
             * > This parameter is applicable to scenarios in which a full image is used to create instances. A full image is an image that contains an operating system, application software, and business data. For these scenarios, you can set this parameter to the mount point of data disk N contained in the full image and modify the `DataDisk.N.Size` and `DataDisk.N.Category` parameters to change the category and size of data disk N created based on the image.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The name of data disk N. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-).
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * The algorithm to use to encrypt data disk N. Valid values:
             * <p>
             * 
             * *   aes-256
             * *   sm4-128
             * 
             * Default value: aes-256.
             */
            public Builder encryptAlgorithm(String encryptAlgorithm) {
                this.encryptAlgorithm = encryptAlgorithm;
                return this;
            }

            /**
             * Specifies whether to encrypt data disk N. Valid values:
             * <p>
             * 
             * *   true: encrypts the data disk.
             * *   false: does not encrypt the data disk.
             * 
             * Default value: false.
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The ID of the Key Management Service (KMS) key that is used for the data disk.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * The performance level of the ESSD to use as data disk N. The value of N must be the same as that in `DataDisk.N.Category` when DataDisk.N.Category is set to cloud_essd. Default value: PL1. Valid values:
             * <p>
             * 
             * *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
             * *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
             * *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
             * *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
             * 
             * For more information about ESSD performance levels, see [ESSDs](~~122389~~).
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values of this parameter:
             * <p>
             * 
             * *   Valid values when DataDisk.N.Category is set to cloud_efficiency: 20 to 32768.
             * 
             * *   Valid values when DataDisk.N.Category is set to cloud_ssd: 20 to 32768.
             * 
             * *   Valid values when DataDisk.N.Category is set to cloud_essd: depend on the `DataDisk.N.PerformanceLevel` value.
             * 
             *     *   Valid values when DataDisk.N.PerformanceLevel is set to PL0: 40 to 32768.
             *     *   Valid values when DataDisk.N.PerformanceLevel is set to PL1: 20 to 32768.
             *     *   Valid values when DataDisk.N.PerformanceLevel is set to PL2: 461 to 32768.
             *     *   Valid values when DataDisk.N.PerformanceLevel is set to PL3: 1261 to 32768.
             * 
             * *   Valid values when DataDisk.N.Category is set to cloud: 5 to 2000.
             * 
             * *   Valid values when DataDisk.N.Category is set to cloud_auto: 40 to 32768.
             * 
             * The value of this parameter must be greater than or equal to the size of the snapshot specified by the `SnapshotId` parameter.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The ID of the snapshot to use to create data disk N. Valid values of N: 1 to 16.
             * <p>
             * 
             * If the `DataDisk.N.SnapshotId` parameter is specified, the `DataDisk.N.Size` parameter is ignored. The data disk is created with the size of the specified snapshot. Use snapshots created after July 15, 2013. Otherwise, an error is returned and your request is rejected.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The ID of the dedicated block storage cluster. If you want to use a disk in a dedicated block storage cluster as data disk N when you create instances, you must specify this parameter.
             */
            public Builder storageClusterId(String storageClusterId) {
                this.storageClusterId = storageClusterId;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    public static class ImageOptions extends TeaModel {
        @NameInMap("LoginAsNonRoot")
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

            /**
             * Specifies whether the instance that uses the image support logons from the ecs-user user. Valid values:
             * <p>
             * 
             * - true
             * 
             * - false
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
    public static class NetworkInterface extends TeaModel {
        @NameInMap("DeleteOnRelease")
        private Boolean deleteOnRelease;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ipv6Address")
        private java.util.List < String > ipv6Address;

        @NameInMap("Ipv6AddressCount")
        private Long ipv6AddressCount;

        @NameInMap("NetworkCardIndex")
        private Integer networkCardIndex;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("NetworkInterfaceName")
        private String networkInterfaceName;

        @NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @NameInMap("PrimaryIpAddress")
        private String primaryIpAddress;

        @NameInMap("QueueNumber")
        private Integer queueNumber;

        @NameInMap("QueuePairNumber")
        private Long queuePairNumber;

        @NameInMap("RxQueueSize")
        private Integer rxQueueSize;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SecurityGroupIds")
        private java.util.List < String > securityGroupIds;

        @NameInMap("TxQueueSize")
        private Integer txQueueSize;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private NetworkInterface(Builder builder) {
            this.deleteOnRelease = builder.deleteOnRelease;
            this.description = builder.description;
            this.instanceType = builder.instanceType;
            this.ipv6Address = builder.ipv6Address;
            this.ipv6AddressCount = builder.ipv6AddressCount;
            this.networkCardIndex = builder.networkCardIndex;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.networkInterfaceName = builder.networkInterfaceName;
            this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
            this.primaryIpAddress = builder.primaryIpAddress;
            this.queueNumber = builder.queueNumber;
            this.queuePairNumber = builder.queuePairNumber;
            this.rxQueueSize = builder.rxQueueSize;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.txQueueSize = builder.txQueueSize;
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
         * @return ipv6Address
         */
        public java.util.List < String > getIpv6Address() {
            return this.ipv6Address;
        }

        /**
         * @return ipv6AddressCount
         */
        public Long getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        /**
         * @return networkCardIndex
         */
        public Integer getNetworkCardIndex() {
            return this.networkCardIndex;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
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
         * @return queueNumber
         */
        public Integer getQueueNumber() {
            return this.queueNumber;
        }

        /**
         * @return queuePairNumber
         */
        public Long getQueuePairNumber() {
            return this.queuePairNumber;
        }

        /**
         * @return rxQueueSize
         */
        public Integer getRxQueueSize() {
            return this.rxQueueSize;
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
         * @return txQueueSize
         */
        public Integer getTxQueueSize() {
            return this.txQueueSize;
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
            private java.util.List < String > ipv6Address; 
            private Long ipv6AddressCount; 
            private Integer networkCardIndex; 
            private String networkInterfaceId; 
            private String networkInterfaceName; 
            private String networkInterfaceTrafficMode; 
            private String primaryIpAddress; 
            private Integer queueNumber; 
            private Long queuePairNumber; 
            private Integer rxQueueSize; 
            private String securityGroupId; 
            private java.util.List < String > securityGroupIds; 
            private Integer txQueueSize; 
            private String vSwitchId; 

            /**
             * Specifies whether to release ENI N when the instance is released. Valid values:
             * <p>
             * 
             * - true
             * 
             * - false
             * 
             * Default value: true.
             * 
             * > Note This parameter takes effect only for secondary ENIs.
             * Example: true.
             */
            public Builder deleteOnRelease(Boolean deleteOnRelease) {
                this.deleteOnRelease = deleteOnRelease;
                return this;
            }

            /**
             * The description of ENI N.
             * <p>
             * 
             * Take note of the following items:
             * 
             * *   Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.
             * *   The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
             * *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you do not need to set this parameter.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The type of ENI N. Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.
             * <p>
             * 
             * Valid values:
             * 
             * *   Primary
             * *   Secondary
             * 
             * Default value: Secondary.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * IPv6 address N to assign to the primary ENI. Up to 10 IPv6 addresses can be assigned to the primary ENI. Valid values of the second N: 1 to 10.
             * <p>
             * 
             * Example: `Ipv6Address.1=2001:db8:1234:1a00::***`.
             * 
             * Take note of the following items:
             * 
             * *   This parameter is valid only when `NetworkInterface.N.InstanceType` is set to `Primary`. If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, you cannot set this parameter.
             * *   If you specify this parameter, you must set `Amount` to 1. You cannot specify `Ipv6AddressCount`, `Ipv6Address.N`, or `NetworkInterface.N.Ipv6AddressCount`.
             */
            public Builder ipv6Address(java.util.List < String > ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * The number of IPv6 addresses that the system randomly generates for the primary ENI. Valid values: 1 to 10.
             * <p>
             * 
             * Take note of the following items:
             * 
             * *   This parameter is valid only when `NetworkInterface.N.InstanceType` is set to `Primary`. If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, you cannot set this parameter.
             * *   If you specify this parameter, you cannot specify `Ipv6AddressCount`, `Ipv6Address.N`, or `NetworkInterface.N.Ipv6Address.N`.
             */
            public Builder ipv6AddressCount(Long ipv6AddressCount) {
                this.ipv6AddressCount = ipv6AddressCount;
                return this;
            }

            /**
             * The network interface controller (NIC) index specified for an ENI. 
             * <p>
             * 
             * Take note of the following items:
             * - You can specify NIC indexes only for instances of specific instance types. 
             * - If NetworkInterface.N.InstanceType is set to Primary, set this parameter to 0 for the instance that supports NICs. 
             * - If NetworkInterface.N.InstanceType is set to Secondary or left empty, specify this parameter based on the instance type of the instance that supports NICs. For more information, see [Overview of instance families](~~25378~~).
             */
            public Builder networkCardIndex(Integer networkCardIndex) {
                this.networkCardIndex = networkCardIndex;
                return this;
            }

            /**
             * The ID of ENI N.
             * <p>
             * 
             * > Note This parameter takes effect only for secondary ENIs.
             * Example: eni-bp1gn106np8jhxhj****.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * The name of ENI N.
             * <p>
             * 
             * Take note of the following items:
             * 
             * *   Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.
             * *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you do not need to set this parameter.
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * The communication mode of primary ENI N. Valid values:
             * <p>
             * 
             * *   Standard: uses the TCP communication mode.
             * *   HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the remote direct memory access (RDMA) communication mode.
             * 
             * Take note of the following items:
             * 
             * *   This parameter is valid only when `NetworkInterface.N.InstanceType` is set to `Primary`. If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, you cannot set this parameter.
             * *   If you set this parameter to HighPerformance, you can create instances only of the c7re RDMA-enhanced instance family. The maximum number of ENIs in RDMA mode that can be bound to a c7re instance is determined based on the instance type. The c7re instance family is in invitational preview in Beijing Zone K. For more information, see [Instance family](~~25378~~).
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * The primary IP address to assign to ENI N.
             * <p>
             * 
             * Take note of the following items:
             * 
             * *   Valid values of N: 1 and 2.
             * 
             *     *   If the value of N is 1, you can configure a primary or secondary ENI. If this parameter is specified, `Amount` is set to a numeric value greater than 1, and NetworkInterface.N.InstanceType is set to Primary, the specified number of instances are created and consecutive primary IP addresses starting from the specified one are assigned to the instances. In this case, you cannot bind secondary ENIs to the instances.
             *     *   If the value of N is 2, you can configure a primary ENI and a secondary ENI. If this parameter is specified, `Amount` is set to a numeric value greater than 1, and NetworkInterface.N.InstanceType is set to Primary, you cannot specify `NetworkInterface.2.InstanceType` to Secondary to bind a secondary ENI.
             * 
             * *   If `NetworkInterface.N.InstanceType` is set to `Primary`, this parameter is equivalent to `PrivateIpAddress` and you cannot specify both NetworkInterface.N.PrimaryIpAddress and `PrivateIpAddress`.
             * 
             * *   If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, the specified primary IP address is assigned to the secondary ENI. The default value is an IP address that is randomly selected from within the CIDR block of the vSwitch to which to connect the secondary ENI.
             * 
             * > You can bind only a single secondary ENI when you create an instance. After the instance is created, you can call the [CreateNetworkInterface](~~58504~~) and [AttachNetworkInterface](~~58515~~) operations to bind more secondary ENIs.
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
                return this;
            }

            /**
             * The number of queues supported by ENI N.
             * <p>
             * 
             * Take note of the following items:
             * 
             * *   Valid values of N: 1 and 2. If the value of N is 1, you can set a primary or secondary ENI. If the value of N is 2, you can set a primary ENI and a secondary ENI.
             * *   The value of this parameter cannot exceed the maximum number of queues per ENI allowed for the specified instance type.
             * *   The total number of queues for all ENIs on the instance cannot exceed the queue quota for the instance type. To query the maximum number of queues per ENI and the queue quota for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation to query the `MaximumQueueNumberPerEni` and `TotalEniQueueQuantity` values.
             * *   If this parameter is set and `NetworkInterface.N.InstanceType` is set to `Primary`, you cannot set the `NetworkInterfaceQueueNumber` parameter.
             */
            public Builder queueNumber(Integer queueNumber) {
                this.queueNumber = queueNumber;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder queuePairNumber(Long queuePairNumber) {
                this.queuePairNumber = queuePairNumber;
                return this;
            }

            /**
             * RxQueueSize.
             */
            public Builder rxQueueSize(Integer rxQueueSize) {
                this.rxQueueSize = rxQueueSize;
                return this;
            }

            /**
             * The ID of the security group to which to assign secondary ENI N.
             * <p>
             * 
             * Take note of the following items:
             * 
             * *   Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.
             * *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you must set this parameter. In this case, this parameter is equivalent to `SecurityGroupId` and you cannot specify `SecurityGroupId`, `SecurityGroupIds.N`, or `NetworkInterface.N.SecurityGroupIds.N`.
             * *   If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, this parameter is optional. The default value is the ID of the security group to which to assign the ECS instance.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The ID of security group N to which to assign ENI N.
             * <p>
             * 
             * *   Valid values of the first N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.
             * *   The second N indicates that one or more security group IDs can be specified. The valid values of N vary based on the maximum number of security groups to which an instance can belong. For more information, see the "Security group limits" section in [Limits](~~25412#SecurityGroupQuota1~~).
             * 
             * Take note of the following items:
             * 
             * *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you must set this parameter or `NetworkInterface.N.SecurityGroupId`. In this case, this parameter is equivalent to `SecurityGroupIds.N` and you cannot specify `SecurityGroupId`, `SecurityGroupIds.N`, or `NetworkInterface.N.SecurityGroupId`.
             * *   If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, this parameter is optional. The default value is the ID of the security group to which to assign the ECS instance.
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * TxQueueSize.
             */
            public Builder txQueueSize(Integer txQueueSize) {
                this.txQueueSize = txQueueSize;
                return this;
            }

            /**
             * The ID of the vSwitch to which to connect to ENI N.
             * <p>
             * 
             * Take note of the following items:
             * 
             * *   Valid values of N: 1 and 2. If the value of N is 1, you can configure a primary or secondary ENI. If the value of N is 2, you must configure a primary ENI and a secondary ENI.
             * *   If `NetworkInterface.N.InstanceType` is set to `Primary`, you must set this parameter. In this case, this parameter is equivalent to `VSwitchId` and you cannot specify `VSwitchId`.
             * *   If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, this parameter is optional. The default value is the ID of the vSwitch to which to connect to the instance.
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
    public static class NetworkOptions extends TeaModel {
        @NameInMap("EnableJumboFrame")
        private Boolean enableJumboFrame;

        private NetworkOptions(Builder builder) {
            this.enableJumboFrame = builder.enableJumboFrame;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkOptions create() {
            return builder().build();
        }

        /**
         * @return enableJumboFrame
         */
        public Boolean getEnableJumboFrame() {
            return this.enableJumboFrame;
        }

        public static final class Builder {
            private Boolean enableJumboFrame; 

            /**
             * Specifies whether to enable the Jumbo Frame feature for the instance. Valid values:
             * <p>
             * 
             * - false: does not enable the Jumbo Frame feature for the instance. The maximum transmission unit (MTU) values of all primary and secondary elastic network interfaces (ENIs) on the instance are set to 1500. 
             * 
             * - true: enables the Jumbo Frame feature for the instance. The MTU values of all primary and secondary ENIs on the instance are set to 8500. 
             * 
             * Default value: true. 
             * 
             * > Only instances of some 8th-generation or later instance types support the Jumbo Frame feature. For more information, see [MTUs](~~200512~~).
             */
            public Builder enableJumboFrame(Boolean enableJumboFrame) {
                this.enableJumboFrame = enableJumboFrame;
                return this;
            }

            public NetworkOptions build() {
                return new NetworkOptions(this);
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
             * The key of tag of the instance, disks, and primary ENI.
             * <p>
             * 
             * The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag of the instance, disks, and primary ENI.
             * <p>
             * 
             * The tag value can be an empty string. It can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
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
