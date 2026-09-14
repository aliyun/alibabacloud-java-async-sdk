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
 * {@link RunInstancesRequest} extends {@link RequestModel}
 *
 * <p>RunInstancesRequest</p>
 */
public class RunInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuOptions")
    private CpuOptions cpuOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HibernationOptions")
    private HibernationOptions hibernationOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchedulerOptions")
    private SchedulerOptions schedulerOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityOptions")
    private SecurityOptions securityOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Affinity")
    private String affinity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Arn")
    private java.util.List<Arn> arn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClockOptions")
    private ClockOptions clockOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreditSpecification")
    private String creditSpecification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDisk")
    private java.util.List<DataDisk> dataDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetGroupNo")
    private Integer deploymentSetGroupNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostNames")
    private java.util.List<String> hostNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HpcClusterId")
    private String hpcClusterId;

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
    @com.aliyun.core.annotation.NameInMap("ImageFamily")
    private String imageFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageOptions")
    private ImageOptions imageOptions;

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
    @com.aliyun.core.annotation.NameInMap("Ipv6Address")
    private java.util.List<String> ipv6Address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

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
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
    private Long launchTemplateVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagedHostId")
    private String managedHostId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinAmount")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer minAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterface")
    private java.util.List<NetworkInterface> networkInterface;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceQueueNumber")
    private Integer networkInterfaceQueueNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkOptions")
    private NetworkOptions networkOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

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
    @com.aliyun.core.annotation.NameInMap("PrivateDnsNameOptions")
    private PrivateDnsNameOptions privateDnsNameOptions;

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
    @com.aliyun.core.annotation.NameInMap("SpotDuration")
    @com.aliyun.core.annotation.Validation(maximum = 720)
    private Integer spotDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotInterruptionBehavior")
    private String spotInterruptionBehavior;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
    @com.aliyun.core.annotation.Validation(maximum = 999999)
    private Float spotPriceLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSetId")
    private String storageSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSetPartitionNumber")
    private Integer storageSetPartitionNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tenancy")
    private String tenancy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniqueSuffix")
    private Boolean uniqueSuffix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
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
        this.clockOptions = builder.clockOptions;
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
        this.managedHostId = builder.managedHostId;
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
        this.privateDnsNameOptions = builder.privateDnsNameOptions;
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
    public java.util.List<Arn> getArn() {
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
     * @return clockOptions
     */
    public ClockOptions getClockOptions() {
        return this.clockOptions;
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
    public java.util.List<String> getHostNames() {
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
    public java.util.List<String> getIpv6Address() {
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
     * @return managedHostId
     */
    public String getManagedHostId() {
        return this.managedHostId;
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
    public java.util.List<NetworkInterface> getNetworkInterface() {
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
     * @return privateDnsNameOptions
     */
    public PrivateDnsNameOptions getPrivateDnsNameOptions() {
        return this.privateDnsNameOptions;
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
    public java.util.List<Tag> getTag() {
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
        private java.util.List<Arn> arn; 
        private Boolean autoPay; 
        private String autoReleaseTime; 
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private String clientToken; 
        private ClockOptions clockOptions; 
        private String creditSpecification; 
        private java.util.List<DataDisk> dataDisk; 
        private String dedicatedHostId; 
        private Boolean deletionProtection; 
        private Integer deploymentSetGroupNo; 
        private String deploymentSetId; 
        private String description; 
        private Boolean dryRun; 
        private String hostName; 
        private java.util.List<String> hostNames; 
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
        private java.util.List<String> ipv6Address; 
        private Integer ipv6AddressCount; 
        private String isp; 
        private String keyPairName; 
        private String launchTemplateId; 
        private String launchTemplateName; 
        private Long launchTemplateVersion; 
        private String managedHostId; 
        private Integer minAmount; 
        private java.util.List<NetworkInterface> networkInterface; 
        private Integer networkInterfaceQueueNumber; 
        private NetworkOptions networkOptions; 
        private String ownerAccount; 
        private Long ownerId; 
        private String password; 
        private Boolean passwordInherit; 
        private Integer period; 
        private String periodUnit; 
        private PrivateDnsNameOptions privateDnsNameOptions; 
        private String privateIpAddress; 
        private String ramRoleName; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityEnhancementStrategy; 
        private String securityGroupId; 
        private java.util.List<String> securityGroupIds; 
        private Integer spotDuration; 
        private String spotInterruptionBehavior; 
        private Float spotPriceLimit; 
        private String spotStrategy; 
        private String storageSetId; 
        private Integer storageSetPartitionNumber; 
        private java.util.List<Tag> tag; 
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
            this.clockOptions = request.clockOptions;
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
            this.managedHostId = request.managedHostId;
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
            this.privateDnsNameOptions = request.privateDnsNameOptions;
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
         * <p>Specifies whether to associate the instance with a dedicated host. Valid values:</p>
         * <ul>
         * <li><p>default: The instance is not associated with a dedicated host. If the instance is stopped in economical mode and then restarted, and the original dedicated host has insufficient resources, the instance is placed on another dedicated host in the automatic deployment resource pool.</p>
         * </li>
         * <li><p>host: The instance is associated with a dedicated host. If the instance is stopped in economical mode and then restarted, it remains on the original dedicated host. If the original dedicated host has insufficient resources, the restart fails.</p>
         * </li>
         * </ul>
         * <p>Default value: default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder affinity(String affinity) {
            this.putQueryParameter("Affinity", affinity);
            this.affinity = affinity;
            return this;
        }

        /**
         * <p>The number of ECS instances to create. Valid values: 1 to 100.</p>
         * <p>The number of instances successfully created depends on the values of Amount and MinAmount:</p>
         * <ul>
         * <li><p>If MinAmount is not specified: instances are created according to the Amount value. If inventory is insufficient, the API returns a creation failure and no instances are created.</p>
         * </li>
         * <li><p>If MinAmount is specified:</p>
         * <ul>
         * <li>If the available ECS inventory &lt; MinAmount: no instances are created and the API returns a creation failure.</li>
         * <li>If MinAmount ≤ available ECS inventory &lt; Amount: instances are created based on the available inventory and the API returns a creation success.</li>
         * <li>If the available ECS inventory ≥ Amount: instances are created according to the specified Amount and the API returns a creation success.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not available for use.</p>
         * </blockquote>
         */
        public Builder arn(java.util.List<Arn> arn) {
            this.putQueryParameter("Arn", arn);
            this.arn = arn;
            return this;
        }

        /**
         * <p>Specifies whether to automatically complete the payment when creating an instance. Valid values:</p>
         * <ul>
         * <li><p>true: automatically completes the payment.</p>
         * <blockquote>
         * <p>If automatic payment is enabled, make sure that your payment method has sufficient balance. Otherwise, an abnormal order is generated and can only be voided. If your payment method has insufficient balance, set <code>AutoPay</code> to <code>false</code>. An unpaid order is then generated, which you can pay for in the ECS console.</p>
         * </blockquote>
         * </li>
         * <li><p>false: generates an order without charging.</p>
         * <blockquote>
         * <p>If <code>InstanceChargeType</code> is set to <code>PostPaid</code>, <code>AutoPay</code> cannot be set to <code>false</code>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The automatic release time for pay-as-you-go instances. Specify the time in <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> format in UTC+0. The format is <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
         * <ul>
         * <li><p>If the seconds (<code>ss</code>) value is not <code>00</code>, it is automatically set to the start of the current minute (<code>mm</code>).</p>
         * </li>
         * <li><p>The earliest release time is 30 minutes from the current time.</p>
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
         * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when <code>InstanceChargeType</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li>true: enables auto-renewal.</li>
         * <li>false: disables auto-renewal.</li>
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
         * <p>The auto-renewal period for a single renewal. Valid values: </p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>When PeriodUnit=Week: 1, 2, 3.</li>
         * <li>When PeriodUnit=Month: 1, 2, 3, 6, 12, 24, 36, 48, 60.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;When PeriodUnit=Month: 1, 2, 3, 6, 12, 24, 36, 48, 60.</p>
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
         * <p>The client token used to ensure the idempotency of the request. Generate a unique value for this parameter from your client to ensure that different requests use different values. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotency</a>.</p>
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
         * <p>The instance clock parameters.</p>
         */
        public Builder clockOptions(ClockOptions clockOptions) {
            this.putQueryParameter("ClockOptions", clockOptions);
            this.clockOptions = clockOptions;
            return this;
        }

        /**
         * <p>Sets the running mode of a burstable instance. Valid values:</p>
         * <ul>
         * <li>Standard: standard mode. For more information about the performance of instances in standard mode, see the performance constraint mode section in <a href="https://help.aliyun.com/document_detail/59977.html">What are burstable instances</a>.</li>
         * <li>Unlimited: unlimited mode. For more information about the performance of instances in unlimited mode, see the unlimited mode section in <a href="https://help.aliyun.com/document_detail/59977.html">What are burstable instances</a>.</li>
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
         * <p>The list of data disk information collections.</p>
         */
        public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * <p>The ID of the dedicated host.
         * &lt;props=&quot;china&quot;&gt;You can call <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query the list of dedicated host IDs.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;You can call <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query the list of dedicated host IDs.</p>
         * <blockquote>
         * <p>Notice: Dedicated hosts do not support spot instances. If <code>DedicatedHostId</code> is specified, the <code>SpotStrategy</code> and <code>SpotPriceLimit</code> settings in the request are automatically ignored.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dh-bp67acfmxazb4p****</p>
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection for the instance. This parameter controls whether the instance can be released through the console or by calling <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a>. Valid values: </p>
         * <ul>
         * <li>true: enables deletion protection.</li>
         * <li>false: disables deletion protection.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>This parameter applies only to pay-as-you-go instances. It prevents manual release only and does not apply to system-initiated release operations.</p>
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
         * <p>The group number of the instance within the deployment set. This parameter applies when the deployment set uses the AvailabilityGroup strategy. Valid values: 1 to 7.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder deploymentSetGroupNo(Integer deploymentSetGroupNo) {
            this.putQueryParameter("DeploymentSetGroupNo", deploymentSetGroupNo);
            this.deploymentSetGroupNo = deploymentSetGroupNo;
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
         * <p>Instance_Description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run for this request. Valid values:</p>
         * <ul>
         * <li>true: sends a check request without creating the instance. The check includes whether required parameters are specified, the request format, business limits, and ECS inventory. If the check fails, the corresponding error is returned. If the check passes, the error code <code>DryRunOperation</code> is returned.</li>
         * <li>false (default): sends a normal request. After passing the check, the instance is created immediately.</li>
         * </ul>
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
         * <p>The hostname of the instance. The following limits apply:</p>
         * <ul>
         * <li>Periods (.) and hyphens (-) cannot be used as the first or last character, and cannot be used consecutively.</li>
         * <li>Windows instances: The hostname must be 2 to 15 characters in length. Periods (.) are not supported. The hostname cannot consist of digits only. It can contain uppercase and lowercase letters, digits, and hyphens (-).</li>
         * <li>Other instance types (such as Linux):<ul>
         * <li>The hostname must be 2 to 64 characters in length. Multiple periods (.) are supported. Each segment between periods can contain uppercase and lowercase letters, digits, and hyphens (-).</li>
         * <li>You can use the placeholder <code>${instance_id}</code> to write the instance ID into the <code>HostName</code> parameter. For example, if <code>HostName=k8s-${instance_id}</code> and the ECS instance ID is <code>i-123abc****</code>, the hostname of the instance is <code>k8s-i-123abc****</code>.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>When creating multiple ECS instances, you can:</p>
         * <ul>
         * <li>Set sequential hostnames in batch. For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Set sequential instance names or hostnames in batch</a>.</li>
         * <li>Use the <code>HostNames.N</code> parameter to set a different hostname for each instance. Note that <code>HostName</code> and <code>HostNames.N</code> cannot be specified at the same time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>k8s-node-[1,4]-ecshost</p>
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The hostnames of instances when you create multiple instances at a time. Each instance is assigned a unique hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-host-01</p>
         */
        public Builder hostNames(java.util.List<String> hostNames) {
            this.putQueryParameter("HostNames", hostNames);
            this.hostNames = hostNames;
            return this;
        }

        /**
         * <p>The ID of the HPC cluster to which the instance belongs. </p>
         * <p>This parameter is required when creating an SCC instance. You can create an HPC cluster by referring to <a href="https://help.aliyun.com/document_detail/109138.html">CreateHpcCluster</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>hpc-bp67acfmxazb4p****</p>
         */
        public Builder hpcClusterId(String hpcClusterId) {
            this.putQueryParameter("HpcClusterId", hpcClusterId);
            this.hpcClusterId = hpcClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the access channel for instance metadata. Valid values:</p>
         * <ul>
         * <li>enabled: enables the access channel.</li>
         * <li>disabled: disables the access channel.</li>
         * </ul>
         * <p>Default value: enabled.</p>
         * <blockquote>
         * <p>For more information about instance metadata, see <a href="https://help.aliyun.com/document_detail/49122.html">Overview of instance metadata</a>.</p>
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
         * <p>This parameter is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.putQueryParameter("HttpPutResponseHopLimit", httpPutResponseHopLimit);
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        /**
         * <p>Specifies whether to enforce the use of the hardened mode (IMDSv2) to access instance metadata. Valid values:</p>
         * <ul>
         * <li>optional: does not enforce the use of the hardened mode.</li>
         * <li>required: enforces the use of the hardened mode. After you set this value, the normal mode cannot be used to access instance metadata.</li>
         * </ul>
         * <p>Default value: optional.</p>
         * <blockquote>
         * <p>For more information about the modes for accessing instance metadata, see <a href="https://help.aliyun.com/document_detail/150575.html">Access modes for instance metadata</a>.</p>
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
         * <p>The name of the image family. Set this parameter to use the latest available image from the specified image family to create the instance.</p>
         * <p>The name must be 2 to 128 characters in length. It cannot start with a special character, a digit, <code>http://</code>, or <code>https://</code>. It can contain only the following special characters: periods (.), underscores (_), hyphens (-), and colons (:).</p>
         * <p>Note the following:</p>
         * <ul>
         * <li>If <code>ImageId</code> is specified, do not set this parameter.</li>
         * <li>If <code>ImageId</code> is not specified but the launch template identified by <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> has <code>ImageId</code> configured, do not set this parameter.</li>
         * <li>If <code>ImageId</code> is not specified and the launch template identified by <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> does not have <code>ImageId</code> configured, you can set this parameter.</li>
         * <li>If <code>ImageId</code> is not specified and neither <code>LaunchTemplateId</code> nor <code>LaunchTemplateName</code> is specified, you can set this parameter.<blockquote>
         * <p>For image family information associated with Alibaba Cloud official images, see <a href="https://help.aliyun.com/document_detail/108393.html">Public image overview</a>.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The ID of the image used to create the instance. You can call <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> to query available images. If you do not specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to identify a launch template, and do not use <code>ImageFamily</code> to select the latest available image from an image family, ImageId is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_2_1903_x64_20G_alibase_20200324.vhd</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The image-related attributes.</p>
         */
        public Builder imageOptions(ImageOptions imageOptions) {
            this.putQueryParameter("ImageOptions", imageOptions);
            this.imageOptions = imageOptions;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription.</li>
         * <li>PostPaid: pay-as-you-go.</li>
         * </ul>
         * <p>Default value: PostPaid.</p>
         * <p>&lt;props=&quot;china&quot;&gt;If you select subscription, make sure your account supports balance payment or credit payment. Otherwise, the error <code>InvalidPayMethod</code> is returned.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;If you select subscription, make sure your account supports credit payment. Otherwise, the error <code>InvalidPayMethod</code> is returned.</p>
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
         * <p>The instance name. The name must be 2 to 128 characters in length and can contain Unicode letters (including English and Chinese characters) and digits. It can also contain colons (:), underscores (_), periods (.), and hyphens (-). The default value is the <code>InstanceId</code> of the instance.</p>
         * <p>When creating multiple ECS instances, you can set sequential instance names in batch. The name can contain brackets ([]) and commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Set sequential instance names or hostnames in batch</a>.</p>
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
         * <p>The instance type. If you do not specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to identify a launch template, InstanceType is required.</p>
         * <ul>
         * <li>To select an instance type: see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the performance data of a target instance type. You can also see <a href="https://help.aliyun.com/document_detail/58291.html">Select instance types</a> for guidance on how to choose an instance type.</li>
         * <li>To check inventory: invoke <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> to query resource availability in a specified region or zone.</li>
         * </ul>
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
         * <p>The billing method for network usage. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth.</li>
         * <li>PayByTraffic: pay-by-traffic.</li>
         * </ul>
         * <p>Default value: PayByTraffic.</p>
         * <blockquote>
         * <p>In <strong>pay-by-traffic</strong> mode, the peak inbound and outbound bandwidth values are upper limits and are not guaranteed. When resource contention occurs, the peak bandwidth may be limited. If your workloads require guaranteed bandwidth, use <strong>pay-by-bandwidth</strong> mode.</p>
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
         * <p>Default value: 0.</p>
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
         * <p>Specifies whether the instance is an I/O optimized instance. The default value for <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a> is none. The default value for all other instance types is optimized. Valid values:</p>
         * <ul>
         * <li>none: not I/O optimized.</li>
         * <li>optimized: I/O optimized.</li>
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
         * <p>One or more IPv6 addresses assigned to the primary ENI. You can specify up to 10 IPv6 addresses. The valid values of N range from 1 to 10.</p>
         * <p>Example: <code>Ipv6Address.1=2001:db8:1234:1a00::***</code>.</p>
         * <p>Note:</p>
         * <ul>
         * <li><p>If <code>Ipv6Address.N</code> is set, <code>Amount</code> can only be set to 1, and you cannot set <code>Ipv6AddressCount</code> at the same time.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot set <code>Ipv6Addresses.N</code> or <code>Ipv6AddressCount</code>. Set <code>NetworkInterface.N.Ipv6Addresses.N</code> or <code>NetworkInterface.N.Ipv6AddressCount</code> instead.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ipv6Address.1=2001:db8:1234:1a00::***</p>
         */
        public Builder ipv6Address(java.util.List<String> ipv6Address) {
            this.putQueryParameter("Ipv6Address", ipv6Address);
            this.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * <p>The number of randomly generated IPv6 addresses to assign to the primary ENI. Valid values: 1 to 10.</p>
         * <p>Note the following:</p>
         * <ul>
         * <li><p>You cannot specify both <code>Ipv6Address.N</code> and <code>Ipv6AddressCount</code>.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot set <code>Ipv6Address.N</code> or <code>Ipv6AddressCount</code>. Use <code>NetworkInterface.N.Ipv6Address.N</code> or <code>NetworkInterface.N.Ipv6AddressCount</code> instead.</p>
         * </li>
         * </ul>
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
         * <blockquote>
         * <p>This parameter is currently in invitational preview and is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * <p>The name of the SSH key pair.</p>
         * <blockquote>
         * <p>This parameter is ignored for Windows instances and is empty by default. Even if this parameter is specified, only the <code>Password</code> content is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>KeyPair_Name</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The ID of the launch template. For more information, call <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a>.</p>
         * <p>When creating an instance from a launch template, you must specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to identify the template.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-bp1apo0bbbkuy0rj****</p>
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * <p>The name of the launch template.</p>
         * <p>When creating an instance from a launch template, you must specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to identify the template.</p>
         * 
         * <strong>example:</strong>
         * <p>LaunchTemplate_Name</p>
         */
        public Builder launchTemplateName(String launchTemplateName) {
            this.putQueryParameter("LaunchTemplateName", launchTemplateName);
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        /**
         * <p>The version of the launch template. If you specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> without specifying a version number, the default version is used.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder launchTemplateVersion(Long launchTemplateVersion) {
            this.putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * <p>The unique identifier of the platform-managed host, such as mh-f2d3647ca21****.</p>
         * 
         * <strong>example:</strong>
         * <p>mh-f2d3647ca21****</p>
         */
        public Builder managedHostId(String managedHostId) {
            this.putQueryParameter("ManagedHostId", managedHostId);
            this.managedHostId = managedHostId;
            return this;
        }

        /**
         * <p>The minimum number of ECS instances to purchase. Valid values: 1 to 100.</p>
         * <p>The number of instances successfully created depends on the values of Amount and MinAmount:</p>
         * <ul>
         * <li><p>If MinAmount is not specified: instances are created according to the Amount value. If inventory is insufficient, the API returns a creation failure and no instances are created.</p>
         * </li>
         * <li><p>If MinAmount is specified:</p>
         * <ul>
         * <li>If the available ECS inventory &lt; MinAmount: no instances are created and the API returns a creation failure.</li>
         * <li>If MinAmount ≤ available ECS inventory &lt; Amount: instances are created based on the available inventory and the API returns a creation success.</li>
         * <li>If the available ECS inventory ≥ Amount: instances are created according to the specified Amount and the API returns a creation success.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder minAmount(Integer minAmount) {
            this.putQueryParameter("MinAmount", minAmount);
            this.minAmount = minAmount;
            return this;
        }

        /**
         * <p>The network interface controller (NIC) information.</p>
         */
        public Builder networkInterface(java.util.List<NetworkInterface> networkInterface) {
            this.putQueryParameter("NetworkInterface", networkInterface);
            this.networkInterface = networkInterface;
            return this;
        }

        /**
         * <p>The number of queues for the primary ENI. Note the following:</p>
         * <ul>
         * <li><p>The value cannot exceed the maximum number of queues per ENI allowed by the instance type.</p>
         * </li>
         * <li><p>The total number of queues across all ENIs on the instance cannot exceed the total queue quota for the instance type. To query the maximum number of queues per ENI and the total queue quota for an instance type, call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> and check the <code>MaximumQueueNumberPerEni</code> and <code>TotalEniQueueQuantity</code> fields.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot set <code>NetworkInterfaceQueueNumber</code>. Use <code>NetworkInterface.N.QueueNumber</code> instead.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder networkInterfaceQueueNumber(Integer networkInterfaceQueueNumber) {
            this.putQueryParameter("NetworkInterfaceQueueNumber", networkInterfaceQueueNumber);
            this.networkInterfaceQueueNumber = networkInterfaceQueueNumber;
            return this;
        }

        /**
         * <p>The network-related parameters.</p>
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
         * <p>The logon password of the instance. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
         * <pre><code>()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/
         * </code></pre>
         * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
         * <blockquote>
         * <p>If you specify <code>Password</code>, use HTTPS to send the request to prevent password leakage.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>EcsV587!</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>Specifies whether to use the password preset in the image. Valid values:</p>
         * <ul>
         * <li>true: uses the preset password.</li>
         * <li>false: does not use the preset password.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>When you use this parameter, the Password parameter must be empty, and the image you use must have a password configured.</p>
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
         * <p>The subscription period of the resource. The unit is specified by <code>PeriodUnit</code>. This parameter takes effect and is required only when <code>InstanceChargeType</code> is set to <code>PrePaid</code>. If <code>DedicatedHostId</code> is specified, the value cannot exceed the subscription period of the dedicated host. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>When PeriodUnit=Week: 1, 2, 3, 4.</li>
         * <li>When PeriodUnit=Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, 60.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;When PeriodUnit=Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, 60.</p>
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
         * <p>The unit of the subscription billing period. Valid values:</p>
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
         * <p>The private DNS name configuration for the instance.</p>
         * <p>For information about private Private domain resolution, see <a href="https://help.aliyun.com/document_detail/2844797.html">ECS private Private domain resolution</a>.</p>
         */
        public Builder privateDnsNameOptions(PrivateDnsNameOptions privateDnsNameOptions) {
            this.putQueryParameter("PrivateDnsNameOptions", privateDnsNameOptions);
            this.privateDnsNameOptions = privateDnsNameOptions;
            return this;
        }

        /**
         * <p>The private IP address of the instance. When setting a private IP address for a VPC-type ECS instance, you must select an available IP address from the CIDR block of the vSwitch (VSwitchId).</p>
         * <p>Note the following:</p>
         * <ul>
         * <li><p>After you set PrivateIpAddress:</p>
         * <ul>
         * <li>If Amount is set to 1, a private IP address is assigned to the created ECS instance.</li>
         * <li>If Amount is set to a value greater than 1, the specified private IP address is used as the starting address, and consecutive private IP addresses are assigned to multiple ECS instances in sequence. In this case, secondary ENIs cannot be attached to the instances (that is, NetworkInterface.N.* parameters are not supported).</li>
         * </ul>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you cannot set PrivateIpAddress. Set NetworkInterface.N.PrimaryIpAddress instead.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The first IP address and the last three IP addresses of each vSwitch are reserved by the system and cannot be specified.
         * For example, if the CIDR block of a vSwitch is 192.168.1.0/24, the addresses 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255 are reserved.</p>
         * </blockquote>
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
         * <p>The name of the instance RAM role. You can call the RAM API <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> to query the instance RAM roles you have created.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM_Name</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The ID of the enterprise resource group to which the instance belongs.</p>
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
         * <p>Specifies whether to enable security hardening. Valid values:</p>
         * <ul>
         * <li>Active: enables security hardening. This value applies only to public images.</li>
         * <li>Deactive: disables security hardening. This value applies to all image types.</li>
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
         * <p>The ID of the security group to which the new instance belongs. Instances in the same security group can communicate with each other. The maximum number of instances a security group can contain depends on the security group type. For more information, see the security group section in <a href="~~25412#SecurityGroupQuota~~">Limits</a>.</p>
         * <blockquote>
         * <p>The network type of the instance is determined by <code>SecurityGroupId</code>. For example, if the security group uses a VPC network, the instance is also VPC-type, and you must also specify <code>VSwitchId</code>.</p>
         * </blockquote>
         * <p>If you do not specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to identify a launch template, the security group ID is required. Note the following:</p>
         * <ul>
         * <li><p>You can specify one security group using <code>SecurityGroupId</code>, or one or more security groups using <code>SecurityGroupIds.N</code>. You cannot specify both <code>SecurityGroupId</code> and <code>SecurityGroupIds.N</code> at the same time.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, do not set <code>SecurityGroupId</code> or <code>SecurityGroupIds.N</code>. Use <code>NetworkInterface.N.SecurityGroupId</code> or <code>NetworkInterface.N.SecurityGroupIds.N</code> instead.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp15ed6xe1yxeycg7****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>Adds the instance to multiple security groups at the same time. The valid values of N depend on the maximum number of security groups to which an instance can belong. For more information, see <a href="https://help.aliyun.com/document_detail/101348.html">Security group limits</a>.</p>
         * <p>Note:</p>
         * <ul>
         * <li>You cannot specify both <code>SecurityGroupId</code> and <code>SecurityGroupIds.N</code> at the same time.</li>
         * <li>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot set <code>SecurityGroupId</code> or <code>SecurityGroupIds.N</code>. Set <code>NetworkInterface.N.SecurityGroupId</code> or <code>NetworkInterface.N.SecurityGroupIds.N</code> instead.</li>
         * </ul>
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
         * <p>The retention period of the spot instance. Unit: hours. Valid values:</p>
         * <ul>
         * <li>1: Alibaba Cloud guarantees that the instance runs for 1 hour after creation without being automatically released. After 1 hour, the system compares the bid price against the market price and checks resource inventory in real time to determine whether to retain or revoke the instance.</li>
         * <li>0: Alibaba Cloud does not guarantee the runtime of the instance after creation. The system compares the bid price against the market price and checks resource inventory in real time to determine whether to retain or revoke the instance.</li>
         * </ul>
         * <p>Default value: 1.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter currently supports only the values 0 and 1.</li>
         * <li>Spot instances are billed by the second. Choose a retention period based on the expected execution duration of your task.</li>
         * <li>Alibaba Cloud sends a notification through an ECS system event 5 minutes before the instance is reclaimed.</li>
         * </ul>
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
         * <p>The interruption mode for spot instances. Valid values:</p>
         * <ul>
         * <li><p>Terminate: releases the instance immediately.</p>
         * </li>
         * <li><p>Stop: puts the instance into economical mode.</p>
         * <p>For more information about economical mode, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode for pay-as-you-go instances</a>.</p>
         * </li>
         * </ul>
         * <p>Default value: Terminate.</p>
         * 
         * <strong>example:</strong>
         * <p>Terminate</p>
         */
        public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
            this.putQueryParameter("SpotInterruptionBehavior", spotInterruptionBehavior);
            this.spotInterruptionBehavior = spotInterruptionBehavior;
            return this;
        }

        /**
         * <p>The maximum hourly price for the instance. This parameter supports up to three decimal places and takes effect when <code>SpotStrategy</code> is set to <code>SpotWithPriceLimit</code>.</p>
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
         * <p>The bidding strategy for pay-as-you-go instances. This parameter takes effect when <code>InstanceChargeType</code> is set to <code>PostPaid</code>. Valid values:</p>
         * <ul>
         * <li>NoSpot: regular pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: spot instance with a maximum price.</li>
         * <li>SpotAsPriceGo: spot instance where the system automatically bids at the current market price.</li>
         * </ul>
         * <p>Default value: NoSpot.</p>
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
         * <p>The ID of the storage set.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-bp67acfmxazb4p****</p>
         */
        public Builder storageSetId(String storageSetId) {
            this.putQueryParameter("StorageSetId", storageSetId);
            this.storageSetId = storageSetId;
            return this;
        }

        /**
         * <p>The maximum number of partitions in the storage set. The value must be greater than or equal to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.putQueryParameter("StorageSetPartitionNumber", storageSetPartitionNumber);
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }

        /**
         * <p>The tags of the instance, disk, and primary ENI.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Specifies whether to create the instance on a dedicated host. Valid values:</p>
         * <ul>
         * <li><p>default: creates a non-dedicated-host instance.</p>
         * </li>
         * <li><p>host: creates a dedicated host instance. If you do not specify <code>DedicatedHostId</code>, Alibaba Cloud automatically selects a dedicated host for the instance.</p>
         * </li>
         * </ul>
         * <p>Default value: default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder tenancy(String tenancy) {
            this.putQueryParameter("Tenancy", tenancy);
            this.tenancy = tenancy;
            return this;
        }

        /**
         * <p>Specifies whether to automatically append a sequential suffix to <code>HostName</code> and <code>InstanceName</code> when creating multiple instances. The sequential suffix starts from 001 and cannot exceed 999. Valid values:</p>
         * <ul>
         * <li>true: appends the suffix.</li>
         * <li>false: does not append the suffix.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <p>If <code>HostName</code> or <code>InstanceName</code> is set in a specified sort format without a name suffix (<code>name_suffix</code>), that is, the naming format is <code>name_prefix[begin_number,bits]</code>, UniqueSuffix does not take effect and names are sorted only in the specified order.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Set sequential instance names or hostnames in batch</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder uniqueSuffix(Boolean uniqueSuffix) {
            this.putQueryParameter("UniqueSuffix", uniqueSuffix);
            this.uniqueSuffix = uniqueSuffix;
            return this;
        }

        /**
         * <p>The custom data of the instance. The data must be Base64-encoded, and the size of the data before Base64 encoding cannot exceed 32 KB.</p>
         * <p>For information about the limits, formats, and execution frequency of instance user data, see <a href="https://help.aliyun.com/document_detail/49121.html">Instance user data</a>.</p>
         * <blockquote>
         * <p>To protect the security of UserData during transmission, avoid passing sensitive data such as passwords and private keys in plaintext. If you need to pass such information, encrypt it first and then Base64-encode it. Decrypt the data inside the instance to ensure security.</p>
         * </blockquote>
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
         * <p>The ID of the vSwitch. If you are creating a VPC-type ECS instance, you must specify a vSwitch ID. The security group and vSwitch must belong to the same VPC. You can call <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> to query information about existing vSwitches.</p>
         * <p>Note the following:</p>
         * <ul>
         * <li><p>If you specify <code>VSwitchId</code>, the <code>ZoneId</code> you specify must match the zone where the vSwitch resides. You can also omit <code>ZoneId</code>, and the system automatically selects the zone where the specified vSwitch resides.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, do not set <code>VSwitchId</code>. Use <code>NetworkInterface.N.VSwitchId</code> instead.</p>
         * </li>
         * </ul>
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
         * <p>The ID of the zone where the instance resides. You can call <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> to query the list of zones.</p>
         * <blockquote>
         * <p>If you specify <code>VSwitchId</code>, the <code>ZoneId</code> you specify must match the zone where the vSwitch resides. You can also omit <code>ZoneId</code>, and the system automatically selects the zone where the specified vSwitch resides.</p>
         * </blockquote>
         * <p>Default value: automatically selected by the system.</p>
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
        public RunInstancesRequest build() {
            return new RunInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
     */
    public static class CpuOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Core")
        private Integer core;

        @com.aliyun.core.annotation.NameInMap("Numa")
        private String numa;

        @com.aliyun.core.annotation.NameInMap("ThreadsPerCore")
        private Integer threadsPerCore;

        @com.aliyun.core.annotation.NameInMap("TopologyType")
        private String topologyType;

        @com.aliyun.core.annotation.NameInMap("EnableVISST")
        private Boolean enableVISST;

        @com.aliyun.core.annotation.NameInMap("EnableVRDT")
        private Boolean enableVRDT;

        @com.aliyun.core.annotation.NameInMap("NestedVirtualization")
        private String nestedVirtualization;

        @com.aliyun.core.annotation.NameInMap("TurboMode")
        private String turboMode;

        private CpuOptions(Builder builder) {
            this.core = builder.core;
            this.numa = builder.numa;
            this.threadsPerCore = builder.threadsPerCore;
            this.topologyType = builder.topologyType;
            this.enableVISST = builder.enableVISST;
            this.enableVRDT = builder.enableVRDT;
            this.nestedVirtualization = builder.nestedVirtualization;
            this.turboMode = builder.turboMode;
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

        /**
         * @return enableVISST
         */
        public Boolean getEnableVISST() {
            return this.enableVISST;
        }

        /**
         * @return enableVRDT
         */
        public Boolean getEnableVRDT() {
            return this.enableVRDT;
        }

        /**
         * @return nestedVirtualization
         */
        public String getNestedVirtualization() {
            return this.nestedVirtualization;
        }

        /**
         * @return turboMode
         */
        public String getTurboMode() {
            return this.turboMode;
        }

        public static final class Builder {
            private Integer core; 
            private String numa; 
            private Integer threadsPerCore; 
            private String topologyType; 
            private Boolean enableVISST; 
            private Boolean enableVRDT; 
            private String nestedVirtualization; 
            private String turboMode; 

            private Builder() {
            } 

            private Builder(CpuOptions model) {
                this.core = model.core;
                this.numa = model.numa;
                this.threadsPerCore = model.threadsPerCore;
                this.topologyType = model.topologyType;
                this.enableVISST = model.enableVISST;
                this.enableVRDT = model.enableVRDT;
                this.nestedVirtualization = model.nestedVirtualization;
                this.turboMode = model.turboMode;
            } 

            /**
             * <p>The number of CPU cores.</p>
             * <p>&lt;props=&quot;china&quot;&gt;Default value: see <a href="https://help.aliyun.com/document_detail/145895.html">Customize CPU options</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder core(Integer core) {
                this.core = core;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder numa(String numa) {
                this.numa = numa;
                return this;
            }

            /**
             * <p>The number of threads per CPU core. The number of vCPUs for an ECS instance equals <code>CpuOptions.Core</code> × <code>CpuOptions.ThreadsPerCore</code>.</p>
             * <ul>
             * <li><p>Setting <code>CpuOptions.ThreadsPerCore=1</code> disables hyper-threading.</p>
             * </li>
             * <li><p>Only some instance types support configuring the number of threads per core.</p>
             * </li>
             * </ul>
             * <p>&lt;props=&quot;china&quot;&gt;For valid values and default values, see <a href="https://help.aliyun.com/document_detail/145895.html">Customize CPU options</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder threadsPerCore(Integer threadsPerCore) {
                this.threadsPerCore = threadsPerCore;
                return this;
            }

            /**
             * <p>The CPU topology type of the instance. Valid values:</p>
             * <ul>
             * <li>ContinuousCoreToHTMapping: In the CPU topology structure, the hyper-threads (HTs) of the same core are contiguous.</li>
             * <li>DiscreteCoreToHTMapping: In the CPU topology structure, the HTs of the same core are discrete.</li>
             * </ul>
             * <p>Default value: none.</p>
             * <blockquote>
             * <p>Only some instance families support this parameter. For the supported instance families, see <a href="https://help.aliyun.com/document_detail/2636059.html">View and modify the CPU topology structure</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>DiscreteCoreToHTMapping</p>
             */
            public Builder topologyType(String topologyType) {
                this.topologyType = topologyType;
                return this;
            }

            /**
             * EnableVISST.
             */
            public Builder enableVISST(Boolean enableVISST) {
                this.enableVISST = enableVISST;
                return this;
            }

            /**
             * EnableVRDT.
             */
            public Builder enableVRDT(Boolean enableVRDT) {
                this.enableVRDT = enableVRDT;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is in invitational preview and is not available for general use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder nestedVirtualization(String nestedVirtualization) {
                this.nestedVirtualization = nestedVirtualization;
                return this;
            }

            /**
             * TurboMode.
             */
            public Builder turboMode(String turboMode) {
                this.turboMode = turboMode;
                return this;
            }

            public CpuOptions build() {
                return new CpuOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
     */
    public static class HibernationOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configured")
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

            private Builder() {
            } 

            private Builder(HibernationOptions model) {
                this.configured = model.configured;
            } 

            /**
             * <blockquote>
             * <p>This parameter is currently in invitational preview and is not available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
     */
    public static class PrivatePoolOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MatchCriteria")
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

            private Builder() {
            } 

            private Builder(PrivatePoolOptions model) {
                this.id = model.id;
                this.matchCriteria = model.matchCriteria;
            } 

            /**
             * <p>The ID of the private pool, which is the ID of the elasticity assurance or capacity reservation.</p>
             * 
             * <strong>example:</strong>
             * <p>eap-bp67acfmxazb4****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The private pool capacity option for starting the instance. After an elasticity assurance or capacity reservation takes effect, a private pool is generated for launching instances. Valid values:</p>
             * <ul>
             * <li>Open: open mode. The system automatically matches an open private pool. If no matching private pool is available, the instance is launched from the public pool. In this mode, you do not need to set <code>PrivatePoolOptions.Id</code>.</li>
             * <li>Target: targeted mode. The instance is launched from the specified private pool. If the specified private pool is unavailable, the instance fails to start. In this mode, you must specify a private pool ID by setting <code>PrivatePoolOptions.Id</code>.</li>
             * <li>None: no private pool mode. The instance is launched without using a private pool.</li>
             * </ul>
             * <p>Default value: None.</p>
             * <p>In the following scenarios, the private pool capacity option can only be set to <code>None</code> or left unset:</p>
             * <ul>
             * <li>Creating a spot instance.</li>
             * <li>Creating an ECS instance on a dedicated host (DDH).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Open</p>
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
    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
     */
    public static class SchedulerOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostClusterId")
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

            private Builder() {
            } 

            private Builder(SchedulerOptions model) {
                this.dedicatedHostClusterId = model.dedicatedHostClusterId;
            } 

            /**
             * <p>The ID of the dedicated host cluster to which the ECS instance belongs. The system automatically selects a dedicated host from the specified cluster to deploy the ECS instance.</p>
             * <blockquote>
             * <p>This parameter takes effect only when <code>Tenancy</code> is set to <code>host</code>.</p>
             * </blockquote>
             * <p>If you specify both a dedicated host (<code>DedicatedHostId</code>) and a dedicated host cluster (<code>SchedulerOptions.DedicatedHostClusterId</code>):</p>
             * <ul>
             * <li>If the dedicated host belongs to the specified cluster, the ECS instance is preferentially deployed on the specified dedicated host.</li>
             * <li>If the dedicated host does not belong to the specified cluster, the ECS instance fails to be created.</li>
             * </ul>
             * <p>&lt;props=&quot;china&quot;&gt;To query the list of dedicated host cluster IDs, call <a href="https://help.aliyun.com/document_detail/184145.html">DescribeDedicatedHostClusters</a>.</p>
             * <p>&lt;props=&quot;intl&quot;&gt;To query the list of dedicated host cluster IDs, call <a href="https://help.aliyun.com/document_detail/184145.html">DescribeDedicatedHostClusters</a>.</p>
             * <p>&lt;props=&quot;partner&quot;&gt;To query the list of dedicated host cluster IDs, call <a href="https://help.aliyun.com/document_detail/184145.html">DescribeDedicatedHostClusters</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>dc-bp12wlf6am0vz9v2****</p>
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
    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
     */
    public static class SecurityOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfidentialComputingMode")
        private String confidentialComputingMode;

        @com.aliyun.core.annotation.NameInMap("TrustedSystemMode")
        private String trustedSystemMode;

        @com.aliyun.core.annotation.NameInMap("EnableSecureBoot")
        private Boolean enableSecureBoot;

        private SecurityOptions(Builder builder) {
            this.confidentialComputingMode = builder.confidentialComputingMode;
            this.trustedSystemMode = builder.trustedSystemMode;
            this.enableSecureBoot = builder.enableSecureBoot;
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

        /**
         * @return enableSecureBoot
         */
        public Boolean getEnableSecureBoot() {
            return this.enableSecureBoot;
        }

        public static final class Builder {
            private String confidentialComputingMode; 
            private String trustedSystemMode; 
            private Boolean enableSecureBoot; 

            private Builder() {
            } 

            private Builder(SecurityOptions model) {
                this.confidentialComputingMode = model.confidentialComputingMode;
                this.trustedSystemMode = model.trustedSystemMode;
                this.enableSecureBoot = model.enableSecureBoot;
            } 

            /**
             * <p>The confidential computing mode. Set the value to Enclave.</p>
             * <p>Setting this parameter to Enclave means the ECS instance uses Enclave to build a confidential computing environment. Currently, only instance types in instance families c7, g7, and r7 support setting this parameter when invoking <code>RunInstances</code>. Note the following:</p>
             * <ul>
             * <li><p>The confidential computing feature is in invitational preview.</p>
             * </li>
             * <li><p>To create an Enclave-based confidential computing instance by invoking an API operation, use <code>RunInstances</code>. <code>CreateInstance</code> does not support the <code>SecurityOptions.ConfidentialComputingMode</code> parameter.</p>
             * </li>
             * <li><p>Enclave-based confidential computing relies on the trusted system (vTPM). If you configure an instance to use Enclave, the trusted system is also enabled. Therefore, if you set <code>SecurityOptions.ConfidentialComputingMode=Enclave</code>, the instance will have both Enclave confidential computing pattern and the trusted system enabled, regardless of whether you set <code>SecurityOptions.TrustedSystemMode=vTPM</code>.</p>
             * </li>
             * </ul>
             * <p>For more information about confidential computing, see <a href="https://help.aliyun.com/document_detail/203433.html">Use Enclave to build a confidential computing environment</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Enclave</p>
             */
            public Builder confidentialComputingMode(String confidentialComputingMode) {
                this.confidentialComputingMode = confidentialComputingMode;
                return this;
            }

            /**
             * <p>The trusted system mode. Set the value to vTPM.</p>
             * <p>The trusted system mode supports the following instance families:</p>
             * <ul>
             * <li>g7, c7, r7.</li>
             * <li>Security-enhanced instance families (g7t, c7t, r7t).</li>
             * </ul>
             * <p>If you create an ECS instance that belongs to one of the above instance families, configure this parameter as follows:</p>
             * <ul>
             * <li>To use the Alibaba Cloud Trusted System, set this parameter to vTPM. The trusted system then performs a trusted verification when the instance starts.</li>
             * <li>If you do not use the Alibaba Cloud Trusted System, you can leave this parameter unset. However, if the instance uses Enclave-based confidential computing (<code>SecurityOptions.ConfidentialComputingMode=Enclave</code>), the trusted system is also enabled.</li>
             * <li>To create a trusted instance by invoking an API operation, use <code>RunInstances</code>. <code>CreateInstance</code> does not support the <code>SecurityOptions.TrustedSystemMode</code> parameter.<blockquote>
             * <p>If you configure an instance as a trusted instance at creation time, you can only use images that support the trusted system when replacing the system disk.</p>
             * </blockquote>
             * </li>
             * </ul>
             * <p>For more information about the trusted system, see <a href="https://help.aliyun.com/document_detail/201394.html">Overview of the trusted feature for security-enhanced instances</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>vTPM</p>
             */
            public Builder trustedSystemMode(String trustedSystemMode) {
                this.trustedSystemMode = trustedSystemMode;
                return this;
            }

            /**
             * <p>Specifies whether to enable UEFI Secure Boot.</p>
             */
            public Builder enableSecureBoot(Boolean enableSecureBoot) {
                this.enableSecureBoot = enableSecureBoot;
                return this;
            }

            public SecurityOptions build() {
                return new SecurityOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("EncryptAlgorithm")
        private String encryptAlgorithm;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private String encrypted;

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String KMSKeyId;

        @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @com.aliyun.core.annotation.NameInMap("StorageClusterId")
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

            private Builder() {
            } 

            private Builder(SystemDisk model) {
                this.autoSnapshotPolicyId = model.autoSnapshotPolicyId;
                this.category = model.category;
                this.description = model.description;
                this.diskName = model.diskName;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
                this.burstingEnabled = model.burstingEnabled;
                this.encryptAlgorithm = model.encryptAlgorithm;
                this.encrypted = model.encrypted;
                this.KMSKeyId = model.KMSKeyId;
                this.provisionedIops = model.provisionedIops;
                this.storageClusterId = model.storageClusterId;
            } 

            /**
             * <p>The ID of the automatic snapshot policy applied to the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-bp67acfmxazb4p****</p>
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>The disk type of the system disk. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_essd: enterprise SSD.</li>
             * <li>cloud: basic disk.</li>
             * <li>cloud_auto: ESSD AutoPL disk.</li>
             * <li>cloud_essd_entry: ESSD Entry disk.</li>
             * </ul>
             * <p>Default value description:</p>
             * <ul>
             * <li>If the instance type is a retired non-I/O optimized instance type, the default value is <code>cloud</code>.</li>
             * <li>In all other cases, the default value is <code>cloud_efficiency</code>.&lt;props=&quot;china&quot;&gt;After January 30, 2026, for instance types that support only cloud_essd, the default value changes from cloud_efficiency to cloud_essd PL0. For more information, see <a href="https://www.aliyun.com/notice/117844">Change notice</a>.</li>
             * </ul>
             * <blockquote>
             * <p><code>cloud_essd_entry</code> is supported only when <code>InstanceType</code> is set to <a href="https://help.aliyun.com/document_detail/457079.html">u1, universal instance family</a> (<code>ecs.u1</code>) or <a href="https://help.aliyun.com/document_detail/108489.html">e, economy instance family</a> (<code>ecs.e</code>).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The description of the system disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>SystemDisk_Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the system disk. The name must be 2 to 128 characters in length and can contain Unicode letters (including English, Chinese, and digits). It can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssdSystem</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <p>The performance level of the enterprise SSD used as the system disk. This parameter takes effect when you create an enterprise SSD as the system disk. Valid values:</p>
             * <ul>
             * <li>PL0: maximum random read/write IOPS of 10,000 per disk.</li>
             * <li>PL1 (default): maximum random read/write IOPS of 50,000 per disk.</li>
             * <li>PL2: maximum random read/write IOPS of 100,000 per disk.</li>
             * <li>PL3: maximum random read/write IOPS of 1,000,000 per disk.</li>
             * </ul>
             * <p>For information about how to choose an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GiB. Valid values:</p>
             * <ul>
             * <li>Basic disk: 20 to 500.</li>
             * <li>Enterprise SSD:<ul>
             * <li>PL0: 1 to 2048.</li>
             * <li>PL1: 20 to 2048.</li>
             * <li>PL2: 461 to 2048.</li>
             * <li>PL3: 1261 to 2048.</li>
             * </ul>
             * </li>
             * <li>ESSD AutoPL disk: 1 to 2048.</li>
             * <li>Other disk types: 20 to 2048.</li>
             * </ul>
             * <p>The value must be greater than or equal to max{1, ImageSize}.</p>
             * <p>Default value: max{40, the size of the image specified by the ImageId parameter}.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>Specifies whether to enable the burst feature (performance burst). Valid values:</p>
             * <ul>
             * <li>true: yes.</li>
             * <li>false: no.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is valid only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disk</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder encryptAlgorithm(String encryptAlgorithm) {
                this.encryptAlgorithm = encryptAlgorithm;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the system disk. Valid values:</p>
             * <ul>
             * <li><p>true: encrypts the system disk.</p>
             * </li>
             * <li><p>false: does not encrypt the system disk.</p>
             * </li>
             * </ul>
             * <p>Default value: false.</p>
             * <blockquote>
             * <p>Encrypting the system disk during instance creation is not supported in China (Hong Kong) Zone D or Singapore Zone A.</p>
             * </blockquote>
             * <blockquote>
             * <p>Notice: When you use a shared encrypted image to create a disk based on an encrypted snapshot, you must set the request parameter Encrypted=true for the disk to ensure that the disk uses the key of the account with which the image is shared.</p>
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
             * <p>The ID of the KMS key used for the system disk.</p>
             * <blockquote>
             * <p>If Encrypted is set to true and KMSKeyId is not specified, the default key is used for encryption. The KMSKeyId value is returned after the instance is created successfully.</p>
             * <ul>
             * <li><ul>
             * <li>Disk created from a non-shared encrypted snapshot: The encryption key used by the snapshot is used by default.</li>
             * </ul>
             * </li>
             * <li><ul>
             * <li>Disk created from a shared encrypted snapshot: The service key is used by default.</li>
             * </ul>
             * </li>
             * <li><ul>
             * <li>Disk created in a region where account-level default encryption for block storage is enabled: The specified account-level key is used by default.</li>
             * </ul>
             * </li>
             * <li><ul>
             * <li>All other cases: The service key is used by default.</li>
             * </ul>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × capacity − baseline performance}.</p>
             * <p>Baseline performance = min{1,800 + 50 × capacity, 50,000}.</p>
             * <blockquote>
             * <p>This parameter is valid only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disk</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>40000</p>
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * <p>The ID of the dedicated block storage cluster. If you want to use a disk from a dedicated block storage cluster as the system disk when creating an ECS instance, set this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>dbsc-j5e1sf2vaf5he8m2****</p>
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
    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
     */
    public static class Arn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssumeRoleFor")
        private Long assumeRoleFor;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        private String roleType;

        @com.aliyun.core.annotation.NameInMap("Rolearn")
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

            private Builder() {
            } 

            private Builder(Arn model) {
                this.assumeRoleFor = model.assumeRoleFor;
                this.roleType = model.roleType;
                this.rolearn = model.rolearn;
            } 

            /**
             * <blockquote>
             * <p>This parameter is not available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder assumeRoleFor(Long assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
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
    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
     */
    public static class ClockOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PtpStatus")
        private String ptpStatus;

        private ClockOptions(Builder builder) {
            this.ptpStatus = builder.ptpStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClockOptions create() {
            return builder().build();
        }

        /**
         * @return ptpStatus
         */
        public String getPtpStatus() {
            return this.ptpStatus;
        }

        public static final class Builder {
            private String ptpStatus; 

            private Builder() {
            } 

            private Builder(ClockOptions model) {
                this.ptpStatus = model.ptpStatus;
            } 

            /**
             * <p>The PTP status. Valid values:</p>
             * <ul>
             * <li><p>enabled: enables PTP.</p>
             * </li>
             * <li><p>disabled: disables PTP.</p>
             * </li>
             * </ul>
             * <p>Default value: disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder ptpStatus(String ptpStatus) {
                this.ptpStatus = ptpStatus;
                return this;
            }

            public ClockOptions build() {
                return new ClockOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("EncryptAlgorithm")
        private String encryptAlgorithm;

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

        @com.aliyun.core.annotation.NameInMap("StorageClusterId")
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
                this.encryptAlgorithm = model.encryptAlgorithm;
                this.encrypted = model.encrypted;
                this.KMSKeyId = model.KMSKeyId;
                this.performanceLevel = model.performanceLevel;
                this.provisionedIops = model.provisionedIops;
                this.size = model.size;
                this.snapshotId = model.snapshotId;
                this.storageClusterId = model.storageClusterId;
            } 

            /**
             * <p>The ID of the automatic snapshot policy applied to the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-bp67acfmxazb4p****</p>
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the burst feature (performance burst). Valid values:</p>
             * <ul>
             * <li>true: yes.</li>
             * <li>false: no.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is valid only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disk</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
             * <li>cloud_regional_disk_auto: regional Enterprise SSD (ESSD).</li>
             * <li>cloud_essd_entry: ESSD Entry disk.<blockquote>
             * <p>This value is supported only when <code>InstanceType</code> is set to an instance type in the <code>ecs.u1</code> or <code>ecs.e</code> instance family.</p>
             * </blockquote>
             * </li>
             * <li>elastic_ephemeral_disk_standard: elastic ephemeral disk - standard edition.</li>
             * <li>elastic_ephemeral_disk_premium: elastic ephemeral disk - premium edition.</li>
             * </ul>
             * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.
             * Default value description:</p>
             * <ul>
             * <li>If InstanceType is a retired non-I/O optimized instance type, the default value is <code>cloud</code>.</li>
             * <li>In all other cases, the default value is <code>cloud_efficiency</code>.&lt;props=&quot;china&quot;&gt; After January 30, 2026, if the I/O optimized instance type does not support cloud_auto, the default value is cloud_efficiency. Otherwise, the default value is cloud_auto, and performance burst is enabled by default (additional fees apply; for details, see <a href="~~368372#p_75k_2hp_7gp~~">Billing examples</a>). For more information, see the <a href="https://www.aliyun.com/notice/117844">change notice</a>.</li>
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
             * <p>Specifies whether to release the data disk when the instance is released. Valid values:</p>
             * <ul>
             * <li>true: The data disk is released when the instance is released.</li>
             * <li>false: The data disk is not released when the instance is released.</li>
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
             * <p>DataDisk_Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The mount point of the data disk. The naming convention for mount points varies based on the number of data disks attached:</p>
             * <ul>
             * <li><p>1 to 25 data disks: /dev/xvd<code>[b-z]</code></p>
             * </li>
             * <li><p>More than 25 data disks: /dev/xvd<code>[aa-zz]</code>. For example, the 26th data disk is named /dev/xvdaa, the 27th is /dev/xvdab, and so on.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>This parameter is used only for full images (system images). You can set this parameter to the mount point of a data disk in the full image, and modify the corresponding <code>DataDisk.N.Size</code> and <code>DataDisk.N.Category</code> parameters to change the category and size of that data disk.</li>
             * <li>When you create an instance from a full image, the data disks in the full image are created as the first 1 to n data disks of the ECS instance.</li>
             * </ul>
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
             * <p>The name of the data disk. The name must be 2 to 128 characters in length and can contain Unicode characters in the letter category, including letters in English, Chinese, and digits. It can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssdData</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder encryptAlgorithm(String encryptAlgorithm) {
                this.encryptAlgorithm = encryptAlgorithm;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt data disk N. Valid values:</p>
             * <ul>
             * <li>true: encrypts the data disk.</li>
             * <li>false: does not encrypt the data disk.</li>
             * </ul>
             * <p>Default value: false.</p>
             * <blockquote>
             * <p>Notice: When you use a shared encrypted image to create a disk based on an encrypted snapshot, you must set the request parameter Encrypted=true for the disk to ensure that the disk uses the key of the account with which the image is shared.</p>
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
             * <p>The ID of the KMS key used for the data disk.</p>
             * <blockquote>
             * <p>If Encrypted is set to true and KMSKeyId is not specified, the default key is used for encryption. The KMSKeyId value is returned after the instance is created successfully.</p>
             * <ul>
             * <li><ul>
             * <li>Disk created from a non-shared encrypted snapshot: The encryption key used by the snapshot is used by default.</li>
             * </ul>
             * </li>
             * <li><ul>
             * <li>Disk created from a shared encrypted snapshot: The service key is used by default.</li>
             * </ul>
             * </li>
             * <li><ul>
             * <li>Disk created in a region where account-level default encryption for block storage is enabled: The specified account-level key is used by default.</li>
             * </ul>
             * </li>
             * <li><ul>
             * <li>All other cases: The service key is used by default.</li>
             * </ul>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * <p>Settings for the performance level of the enterprise SSD (ESSD) used as the data disk. The value of N must match the N in <code>DataDisk.N.Category=cloud_essd</code>. Valid values:</p>
             * <ul>
             * <li>PL0: maximum random read/write IOPS of 10,000 per disk.</li>
             * <li>PL1 (default): maximum random read/write IOPS of 50,000 per disk.</li>
             * <li>PL2: maximum random read/write IOPS of 100,000 per disk.</li>
             * <li>PL3: maximum random read/write IOPS of 1,000,000 per disk.</li>
             * </ul>
             * <p>For information about how to choose an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × capacity − baseline performance}.</p>
             * <p>Baseline performance = min{1,800 + 50 × capacity, 50,000}.</p>
             * <blockquote>
             * <p>This parameter is valid only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disk</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>40000</p>
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * <p>The size of data disk N, in GiB. The valid values of N range from 1 to 16. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: 20 to 32768.</li>
             * <li>cloud_ssd: 20 to 32768.</li>
             * <li>cloud_essd: The valid range depends on the value of <code>DataDisk.N.PerformanceLevel</code>. <ul>
             * <li>PL0: 1 to 65,536.</li>
             * <li>PL1: 20 to 65,536.</li>
             * <li>PL2: 461 to 65,536.</li>
             * <li>PL3: 1,261 to 65,536.</li>
             * </ul>
             * </li>
             * <li>cloud: 5 to 2,000.</li>
             * <li>cloud_auto: 1 to 65,536.</li>
             * <li>cloud_essd_entry: 10 to 32,768.</li>
             * </ul>
             * <blockquote>
             * <p>The value of this parameter must be greater than or equal to the size of the snapshot specified by <code>SnapshotId</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The snapshot used to create data disk N. The valid values of N range from 1 to 16.</p>
             * <p>If <code>DataDisk.N.SnapshotId</code> is specified, <code>DataDisk.N.Size</code> is ignored. The size of the created disk equals the size of the specified snapshot. Snapshots created on or before July 15, 2013 are not supported. Requests that use such snapshots are rejected.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp17441ohwka0yuh****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The ID of the dedicated block storage cluster. If you want to use a disk from a dedicated block storage cluster as a data disk when creating an ECS instance, set this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>dbsc-j5e1sf2vaf5he8m2****</p>
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
    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
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
             * <p>Specifies whether the instance that uses this image supports logon as the ecs-user user. Valid values:</p>
             * <ul>
             * <li><p>true: yes.</p>
             * </li>
             * <li><p>false: no.</p>
             * </li>
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
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
     */
    public static class NetworkInterface extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeleteOnRelease")
        private Boolean deleteOnRelease;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private java.util.List<String> ipv6Address;

        @com.aliyun.core.annotation.NameInMap("Ipv6AddressCount")
        private Long ipv6AddressCount;

        @com.aliyun.core.annotation.NameInMap("NetworkCardIndex")
        private Integer networkCardIndex;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceName")
        private String networkInterfaceName;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @com.aliyun.core.annotation.NameInMap("PrimaryIpAddress")
        private String primaryIpAddress;

        @com.aliyun.core.annotation.NameInMap("QueueNumber")
        private Integer queueNumber;

        @com.aliyun.core.annotation.NameInMap("QueuePairNumber")
        private Long queuePairNumber;

        @com.aliyun.core.annotation.NameInMap("RxQueueSize")
        private Integer rxQueueSize;

        @com.aliyun.core.annotation.NameInMap("SecondaryPrivateIpAddressCount")
        private Integer secondaryPrivateIpAddressCount;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List<String> securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("SourceDestCheck")
        private Boolean sourceDestCheck;

        @com.aliyun.core.annotation.NameInMap("TxQueueSize")
        private Integer txQueueSize;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
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
            this.secondaryPrivateIpAddressCount = builder.secondaryPrivateIpAddressCount;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.sourceDestCheck = builder.sourceDestCheck;
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
        public java.util.List<String> getIpv6Address() {
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
         * @return secondaryPrivateIpAddressCount
         */
        public Integer getSecondaryPrivateIpAddressCount() {
            return this.secondaryPrivateIpAddressCount;
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
         * @return sourceDestCheck
         */
        public Boolean getSourceDestCheck() {
            return this.sourceDestCheck;
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
            private java.util.List<String> ipv6Address; 
            private Long ipv6AddressCount; 
            private Integer networkCardIndex; 
            private String networkInterfaceId; 
            private String networkInterfaceName; 
            private String networkInterfaceTrafficMode; 
            private String primaryIpAddress; 
            private Integer queueNumber; 
            private Long queuePairNumber; 
            private Integer rxQueueSize; 
            private Integer secondaryPrivateIpAddressCount; 
            private String securityGroupId; 
            private java.util.List<String> securityGroupIds; 
            private Boolean sourceDestCheck; 
            private Integer txQueueSize; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(NetworkInterface model) {
                this.deleteOnRelease = model.deleteOnRelease;
                this.description = model.description;
                this.instanceType = model.instanceType;
                this.ipv6Address = model.ipv6Address;
                this.ipv6AddressCount = model.ipv6AddressCount;
                this.networkCardIndex = model.networkCardIndex;
                this.networkInterfaceId = model.networkInterfaceId;
                this.networkInterfaceName = model.networkInterfaceName;
                this.networkInterfaceTrafficMode = model.networkInterfaceTrafficMode;
                this.primaryIpAddress = model.primaryIpAddress;
                this.queueNumber = model.queueNumber;
                this.queuePairNumber = model.queuePairNumber;
                this.rxQueueSize = model.rxQueueSize;
                this.secondaryPrivateIpAddressCount = model.secondaryPrivateIpAddressCount;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupIds = model.securityGroupIds;
                this.sourceDestCheck = model.sourceDestCheck;
                this.txQueueSize = model.txQueueSize;
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
             * <p>The description of the Elastic Network Interface (ENI).</p>
             * <p>Note:</p>
             * <ul>
             * <li>The valid values of N must not exceed the maximum number of ENIs supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the maximum number of ENIs supported by the target instance type.</li>
             * <li>The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</li>
             * <li>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you do not need to set this parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Network_Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The type of the Elastic Network Interface (ENI). The valid values of N must not exceed the maximum number of ENIs supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the maximum number of ENIs supported by the target instance type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Primary: primary ENI.</li>
             * <li>Secondary: secondary ENI.</li>
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
             * <p>One or more IPv6 addresses assigned to the primary ENI. You can specify up to 10 IPv6 addresses. The valid values of the second N range from 1 to 10.</p>
             * <p>Example: <code>Ipv6Address.1=2001:db8:1234:1a00::***</code></p>
             * <p>Note:</p>
             * <ul>
             * <li><p>This parameter takes effect only when <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>. If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, you cannot set this parameter.</p>
             * </li>
             * <li><p>If this parameter is set, <code>Amount</code> can only be set to 1, and you cannot set <code>Ipv6AddressCount</code>, <code>Ipv6Address.N</code>, or <code>NetworkInterface.N.Ipv6AddressCount</code> at the same time.</p>
             * </li>
             * </ul>
             */
            public Builder ipv6Address(java.util.List<String> ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * <p>The number of randomly generated IPv6 addresses assigned to the primary ENI. Valid values: 1 to 10.</p>
             * <p>Note:</p>
             * <ul>
             * <li><p>This parameter takes effect only when <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>. If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, you cannot set this parameter.</p>
             * </li>
             * <li><p>If this parameter is set, you cannot set <code>Ipv6AddressCount</code>, <code>Ipv6Address.N</code>, or <code>NetworkInterface.N.Ipv6Address.N</code> at the same time.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ipv6AddressCount(Long ipv6AddressCount) {
                this.ipv6AddressCount = ipv6AddressCount;
                return this;
            }

            /**
             * <p>The index of the physical network card assigned to the ENI.</p>
             * <p>Note:</p>
             * <ul>
             * <li>Only specific instance types support specifying a physical network card index.</li>
             * <li>If NetworkInterface.N.InstanceType is set to Primary, and the instance type supports physical network cards, you can only set this parameter to 0.</li>
             * <li>If NetworkInterface.N.InstanceType is set to Secondary or left empty, and the instance type supports physical network cards, you can set this parameter based on the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder networkCardIndex(Integer networkCardIndex) {
                this.networkCardIndex = networkCardIndex;
                return this;
            }

            /**
             * <p>The ID of the Elastic Network Interface (ENI) to attach to the instance.</p>
             * <p>If this parameter is set, <code>Amount</code> can only be set to 1.</p>
             * <blockquote>
             * <p>This parameter takes effect only for secondary ENIs. After you specify an existing secondary ENI, you cannot configure other network interface controller (NIC) creation parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>eni-bp1gn106np8jhxhj****</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The name of the Elastic Network Interface (ENI). The name must be 2 to 128 characters in length and can contain Unicode characters in the letter categorization, including letters in English, Chinese, and digits. It can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
             * <p>Note:</p>
             * <ul>
             * <li><p>The valid values of N must not exceed the maximum number of ENIs supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the maximum number of ENIs supported by the target instance type.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you do not need to set this parameter.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Network_Name</p>
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * <p>The communication pattern of the Elastic Network Interface (ENI). Valid values:</p>
             * <ul>
             * <li>Standard: uses the TCP communication mode.</li>
             * <li>HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the RDMA communication mode.</li>
             * </ul>
             * <p>Default value: Standard.</p>
             * <blockquote>
             * <p>The number of ENIs in RDMA mode cannot exceed the limit for the instance family. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * <p>The primary IP address of the Elastic Network Interface (ENI) to add.</p>
             * <p>Note:</p>
             * <ul>
             * <li><p>The valid values of N must not exceed the maximum number of ENIs supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the maximum number of ENIs supported by the target instance type.</p>
             * <ul>
             * <li>When you add one ENI, you can add one primary ENI or one secondary ENI. If <code>Amount</code> is greater than 1 and you configure a primary ENI with this parameter, the system assigns consecutive primary IP addresses to multiple ECS instances starting from the specified IP address in batch. In this case, you cannot attach a secondary ENI to the instances.</li>
             * <li>If <code>Amount</code> is greater than 1 and this parameter is set for the primary ENI, you cannot configure a secondary ENI (that is, you cannot set <code>NetworkInterface.2.InstanceType=Secondary</code>).</li>
             * </ul>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, this parameter has the same effect as <code>PrivateIpAddress</code>. However, you cannot set both <code>PrivateIpAddress</code> and this parameter at the same time.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter specifies the primary IP address of the secondary ENI. By default, a random IP address is allocated from the CIDR block of the vSwitch to which the ENI belongs.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>The first and last three IP addresses of each vSwitch CIDR block are system reserved IP addresses and cannot be specified. For example, if the vSwitch CIDR block is 192.168.1.0/24, the addresses 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255 are reserved.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><code>172.16.**.**</code></p>
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
                return this;
            }

            /**
             * <p>The number of queues for the Elastic Network Interface (ENI).</p>
             * <p>Note:</p>
             * <ul>
             * <li><p>The valid values of N must not exceed the maximum number of ENIs supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the maximum number of ENIs supported by the target instance type.</p>
             * </li>
             * <li><p>The value cannot exceed the maximum number of queues per ENI allowed by the instance type.</p>
             * </li>
             * <li><p>The total number of queues across all ENIs on the instance cannot exceed the total queue quota for the instance type. You can call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the <code>MaximumQueueNumberPerEni</code> and <code>TotalEniQueueQuantity</code> fields for the maximum number of queues per ENI and the total queue quota.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code> and this parameter is set, you cannot set <code>NetworkInterfaceQueueNumber</code> at the same time.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder queueNumber(Integer queueNumber) {
                this.queueNumber = queueNumber;
                return this;
            }

            /**
             * <p>The number of queue pairs for the RDMA ENI.</p>
             * <p>If you plan to attach multiple RDMA ENIs to the instance, set QueuePairNumber for each ENI based on the maximum QueuePairNumber supported by the instance type and the number of ENIs you plan to use. Make sure the total QueuePairNumber across all ENIs does not exceed the maximum allowed for the instance type. Call <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the limit for the instance type.</p>
             * <blockquote>
             * <p>Notice: If QueuePairNumber is not specified for an RDMA ENI, the maximum QueuePairNumber supported by the instance type is used by default. Therefore, once you attach an RDMA ENI without specifying QueuePairNumber, you cannot attach additional RDMA ENIs (this restriction does not apply to standard ENIs).</notice></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder queuePairNumber(Long queuePairNumber) {
                this.queuePairNumber = queuePairNumber;
                return this;
            }

            /**
             * <p>The inbound queue depth of the Elastic Network Interface (ENI).</p>
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <blockquote>
             * <p>This parameter is in invitational preview and is not available for general use. To use this parameter, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.</p>
             * </blockquote>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <blockquote>
             * <p>This parameter is in invitational preview and is not available for general use. To use this parameter, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
             * </blockquote>
             * <p>Note:</p>
             * <ul>
             * <li><p>This parameter applies only to seventh-generation and later ECS instance types.</p>
             * </li>
             * <li><p>This parameter currently applies only to Linux images.</p>
             * </li>
             * <li><p>A larger inbound queue depth improves inbound throughput and reduces packet loss, but consumes more memory.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder rxQueueSize(Integer rxQueueSize) {
                this.rxQueueSize = rxQueueSize;
                return this;
            }

            /**
             * <p>The number of secondary private IPv4 addresses to assign to the network interface controller (NIC). Valid values: 1 to 49.</p>
             * <ul>
             * <li>The value cannot exceed the IP address limit for the instance type. For more information, see <a href="~~~25378~~">Instance families</a>.</li>
             * <li><code>NetworkInterface.N.SecondaryPrivateIpAddressCount</code> specifies the number of secondary private IPv4 addresses to allocate to the ENI (excluding the primary private IP address of the ENI). The system randomly allocates the addresses from the available CIDR block of the vSwitch (<code>NetworkInterface.N.VSwitchId</code>) to which the ENI belongs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder secondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
                this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
                return this;
            }

            /**
             * <p>The ID of the security group to which the Elastic Network Interface (ENI) belongs.</p>
             * <p>Note:</p>
             * <ul>
             * <li><p>The valid values of N must not exceed the maximum number of ENIs supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the maximum number of ENIs supported by the target instance type.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, this parameter is required. It has the same effect as <code>SecurityGroupId</code>. However, you cannot set <code>SecurityGroupId</code>, <code>SecurityGroupIds.N</code>, or <code>NetworkInterface.N.SecurityGroupIds.N</code> at the same time.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter is optional. The default value is the security group of the ECS instance.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sg-bp67acfmxazb4p****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The IDs of one or more security groups to which the Elastic Network Interface (ENI) belongs.</p>
             * <ul>
             * <li>The valid values of N must not exceed the maximum number of ENIs supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the maximum number of ENIs supported by the target instance type.</li>
             * <li>The second N indicates that you can specify one or more security group IDs. The valid values of the second N depend on the maximum number of security groups to which an instance can belong. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</li>
             * </ul>
             * <p>Note:</p>
             * <ul>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you must set this parameter or <code>NetworkInterface.N.SecurityGroupId</code>. This parameter has the same effect as <code>SecurityGroupIds.N</code>. However, you cannot set <code>SecurityGroupId</code>, <code>SecurityGroupIds.N</code>, or <code>NetworkInterface.N.SecurityGroupId</code> at the same time.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter is optional. The default value is the security group of the ECS instance.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sg-bp15ed6xe1yxeycg7****</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>Specifies whether to enable source/destination checking. We recommend that you enable this feature to improve network security. Valid values:</p>
             * <ul>
             * <li><p>true: yes.</p>
             * </li>
             * <li><p>false: no.</p>
             * </li>
             * </ul>
             * <p>Default value: false.</p>
             * <blockquote>
             * <p>This feature is supported only in certain regions. Before using it, read <a href="https://help.aliyun.com/document_detail/2863210.html">Source/destination checking</a> carefully.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sourceDestCheck(Boolean sourceDestCheck) {
                this.sourceDestCheck = sourceDestCheck;
                return this;
            }

            /**
             * <p>The outbound queue depth of the Elastic Network Interface (ENI).</p>
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <blockquote>
             * <p>This parameter is in invitational preview and is not available for general use. To use this parameter, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.</p>
             * </blockquote>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <blockquote>
             * <p>This parameter is in invitational preview and is not available for general use. To use this parameter, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
             * </blockquote>
             * <p>Note:</p>
             * <ul>
             * <li><p>This parameter applies only to seventh-generation and later ECS instance types.</p>
             * </li>
             * <li><p>This parameter currently applies only to Linux images.</p>
             * </li>
             * <li><p>A larger outbound queue depth improves outbound throughput and reduces packet loss, but consumes more memory.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder txQueueSize(Integer txQueueSize) {
                this.txQueueSize = txQueueSize;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the Elastic Network Interface (ENI) belongs.</p>
             * <p>Note:</p>
             * <ul>
             * <li><p>The valid values of N must not exceed the maximum number of ENIs supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the maximum number of ENIs supported by the target instance type.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, this parameter is required. It has the same effect as <code>VSwitchId</code>. However, you cannot set <code>VSwitchId</code> at the same time.</p>
             * </li>
             * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter is optional. The default value is the vSwitch of the ECS instance.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp67acfmxazb4p****</p>
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
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
     */
    public static class NetworkOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthWeighting")
        private String bandwidthWeighting;

        @com.aliyun.core.annotation.NameInMap("EnableJumboFrame")
        private Boolean enableJumboFrame;

        @com.aliyun.core.annotation.NameInMap("EnableNetworkEncryption")
        private Boolean enableNetworkEncryption;

        private NetworkOptions(Builder builder) {
            this.bandwidthWeighting = builder.bandwidthWeighting;
            this.enableJumboFrame = builder.enableJumboFrame;
            this.enableNetworkEncryption = builder.enableNetworkEncryption;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkOptions create() {
            return builder().build();
        }

        /**
         * @return bandwidthWeighting
         */
        public String getBandwidthWeighting() {
            return this.bandwidthWeighting;
        }

        /**
         * @return enableJumboFrame
         */
        public Boolean getEnableJumboFrame() {
            return this.enableJumboFrame;
        }

        /**
         * @return enableNetworkEncryption
         */
        public Boolean getEnableNetworkEncryption() {
            return this.enableNetworkEncryption;
        }

        public static final class Builder {
            private String bandwidthWeighting; 
            private Boolean enableJumboFrame; 
            private Boolean enableNetworkEncryption; 

            private Builder() {
            } 

            private Builder(NetworkOptions model) {
                this.bandwidthWeighting = model.bandwidthWeighting;
                this.enableJumboFrame = model.enableJumboFrame;
                this.enableNetworkEncryption = model.enableNetworkEncryption;
            } 

            /**
             * <p>The bandwidth weight of the instance. The valid values vary by instance type. To query the bandwidth weight tiers supported by a specific instance type, call DescribeInstanceTypes. The BandwidthWeighting field in the response lists the supported tiers. You can use the name field values from the response, such as Vpc-L1 and Ebs-L1.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder bandwidthWeighting(String bandwidthWeighting) {
                this.bandwidthWeighting = bandwidthWeighting;
                return this;
            }

            /**
             * <p>Specifies whether to enable the Jumbo Frame feature for the instance. Valid values:</p>
             * <ul>
             * <li><p>false: disables Jumbo Frame. The MTU of all ENIs on the instance (including the primary ENI and secondary ENIs) is set to 1500.</p>
             * </li>
             * <li><p>true: enables Jumbo Frame. The MTU of all ENIs on the instance (including the primary ENI and secondary ENIs) is set to 8500.</p>
             * </li>
             * </ul>
             * <p>Default value: true.</p>
             * <blockquote>
             * <p>Only some eighth-generation and later instance types support the Jumbo Frame feature. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">ECS instance MTU</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableJumboFrame(Boolean enableJumboFrame) {
                this.enableJumboFrame = enableJumboFrame;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is in invitational preview and is not available for general use.</p>
             * </blockquote>
             */
            public Builder enableNetworkEncryption(Boolean enableNetworkEncryption) {
                this.enableNetworkEncryption = enableNetworkEncryption;
                return this;
            }

            public NetworkOptions build() {
                return new NetworkOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
     */
    public static class PrivateDnsNameOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableInstanceIdDnsAAAARecord")
        private Boolean enableInstanceIdDnsAAAARecord;

        @com.aliyun.core.annotation.NameInMap("EnableInstanceIdDnsARecord")
        private Boolean enableInstanceIdDnsARecord;

        @com.aliyun.core.annotation.NameInMap("EnableIpDnsARecord")
        private Boolean enableIpDnsARecord;

        @com.aliyun.core.annotation.NameInMap("EnableIpDnsPtrRecord")
        private Boolean enableIpDnsPtrRecord;

        @com.aliyun.core.annotation.NameInMap("HostnameType")
        private String hostnameType;

        private PrivateDnsNameOptions(Builder builder) {
            this.enableInstanceIdDnsAAAARecord = builder.enableInstanceIdDnsAAAARecord;
            this.enableInstanceIdDnsARecord = builder.enableInstanceIdDnsARecord;
            this.enableIpDnsARecord = builder.enableIpDnsARecord;
            this.enableIpDnsPtrRecord = builder.enableIpDnsPtrRecord;
            this.hostnameType = builder.hostnameType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateDnsNameOptions create() {
            return builder().build();
        }

        /**
         * @return enableInstanceIdDnsAAAARecord
         */
        public Boolean getEnableInstanceIdDnsAAAARecord() {
            return this.enableInstanceIdDnsAAAARecord;
        }

        /**
         * @return enableInstanceIdDnsARecord
         */
        public Boolean getEnableInstanceIdDnsARecord() {
            return this.enableInstanceIdDnsARecord;
        }

        /**
         * @return enableIpDnsARecord
         */
        public Boolean getEnableIpDnsARecord() {
            return this.enableIpDnsARecord;
        }

        /**
         * @return enableIpDnsPtrRecord
         */
        public Boolean getEnableIpDnsPtrRecord() {
            return this.enableIpDnsPtrRecord;
        }

        /**
         * @return hostnameType
         */
        public String getHostnameType() {
            return this.hostnameType;
        }

        public static final class Builder {
            private Boolean enableInstanceIdDnsAAAARecord; 
            private Boolean enableInstanceIdDnsARecord; 
            private Boolean enableIpDnsARecord; 
            private Boolean enableIpDnsPtrRecord; 
            private String hostnameType; 

            private Builder() {
            } 

            private Builder(PrivateDnsNameOptions model) {
                this.enableInstanceIdDnsAAAARecord = model.enableInstanceIdDnsAAAARecord;
                this.enableInstanceIdDnsARecord = model.enableInstanceIdDnsARecord;
                this.enableIpDnsARecord = model.enableIpDnsARecord;
                this.enableIpDnsPtrRecord = model.enableIpDnsPtrRecord;
                this.hostnameType = model.hostnameType;
            } 

            /**
             * <p>Specifies whether to enable DNS resolution from the instance ID-based domain name to an IPv6 address. Valid values:</p>
             * <ul>
             * <li><p>true: enabled.</p>
             * </li>
             * <li><p>false: disabled.</p>
             * </li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableInstanceIdDnsAAAARecord(Boolean enableInstanceIdDnsAAAARecord) {
                this.enableInstanceIdDnsAAAARecord = enableInstanceIdDnsAAAARecord;
                return this;
            }

            /**
             * <p>Specifies whether to enable DNS resolution from the instance ID-based domain name to an IPv4 address. Valid values:</p>
             * <ul>
             * <li><p>true: enabled.</p>
             * </li>
             * <li><p>false: disabled.</p>
             * </li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableInstanceIdDnsARecord(Boolean enableInstanceIdDnsARecord) {
                this.enableInstanceIdDnsARecord = enableInstanceIdDnsARecord;
                return this;
            }

            /**
             * <p>Specifies whether to enable DNS resolution from the IP-based domain name to an IPv4 address. Valid values:</p>
             * <ul>
             * <li>true: enabled.</li>
             * <li>false: disabled.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableIpDnsARecord(Boolean enableIpDnsARecord) {
                this.enableIpDnsARecord = enableIpDnsARecord;
                return this;
            }

            /**
             * <p>Specifies whether to enable reverse DNS resolution from an IPv4 address to the IP-based domain name. Valid values:</p>
             * <ul>
             * <li>true: enabled.</li>
             * <li>false: disabled.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableIpDnsPtrRecord(Boolean enableIpDnsPtrRecord) {
                this.enableIpDnsPtrRecord = enableIpDnsPtrRecord;
                return this;
            }

            /**
             * <p>The hostname type. Valid values:</p>
             * <ul>
             * <li>Custom: custom hostname.</li>
             * <li>IpBased: IP-based hostname.</li>
             * <li>InstanceIdBased: instance ID-based hostname.</li>
             * </ul>
             * <p>Default value: Custom.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder hostnameType(String hostnameType) {
                this.hostnameType = hostnameType;
                return this;
            }

            public PrivateDnsNameOptions build() {
                return new PrivateDnsNameOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
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
             * <p>The tag key of the instance, disk, and primary ENI. Valid values of N: 1 to 20. If this parameter is specified, it cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the instance, disk, and primary ENI. Valid values of N: 1 to 20. If this parameter is specified, it can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
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
