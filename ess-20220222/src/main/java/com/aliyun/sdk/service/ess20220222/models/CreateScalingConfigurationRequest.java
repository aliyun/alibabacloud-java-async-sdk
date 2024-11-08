// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateScalingConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateScalingConfigurationRequest</p>
 */
public class CreateScalingConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageOptions")
    private ImageOptions imageOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Affinity")
    private String affinity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Integer cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreditSpecification")
    private String creditSpecification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPriorities")
    private java.util.List < CustomPriorities> customPriorities;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDisks")
    private java.util.List < DataDisks> dataDisks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostClusterId")
    private String dedicatedHostClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HpcClusterId")
    private String hpcClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpEndpoint")
    private String httpEndpoint;

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
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceDescription")
    private String instanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstancePatternInfos")
    private java.util.List < InstancePatternInfos> instancePatternInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeOverrides")
    private java.util.List < InstanceTypeOverrides> instanceTypeOverrides;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

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
    @com.aliyun.core.annotation.NameInMap("LoadBalancerWeight")
    private Integer loadBalancerWeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    private Integer memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaces")
    private java.util.List < NetworkInterfaces> networkInterfaces;

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
    @com.aliyun.core.annotation.NameInMap("RamRoleName")
    private String ramRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingConfigurationName")
    private String scalingConfigurationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchedulerOptions")
    private java.util.Map < String, ? > schedulerOptions;

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
    @com.aliyun.core.annotation.NameInMap("SecurityOptions")
    private SecurityOptions securityOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotDuration")
    private Integer spotDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotInterruptionBehavior")
    private String spotInterruptionBehavior;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotPriceLimits")
    private java.util.List < SpotPriceLimits> spotPriceLimits;

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
    @com.aliyun.core.annotation.NameInMap("SystemDiskCategories")
    private java.util.List < String > systemDiskCategories;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tenancy")
    private String tenancy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateScalingConfigurationRequest(Builder builder) {
        super(builder);
        this.imageOptions = builder.imageOptions;
        this.privatePoolOptions = builder.privatePoolOptions;
        this.systemDisk = builder.systemDisk;
        this.affinity = builder.affinity;
        this.clientToken = builder.clientToken;
        this.cpu = builder.cpu;
        this.creditSpecification = builder.creditSpecification;
        this.customPriorities = builder.customPriorities;
        this.dataDisks = builder.dataDisks;
        this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.deletionProtection = builder.deletionProtection;
        this.deploymentSetId = builder.deploymentSetId;
        this.hostName = builder.hostName;
        this.hpcClusterId = builder.hpcClusterId;
        this.httpEndpoint = builder.httpEndpoint;
        this.httpTokens = builder.httpTokens;
        this.imageFamily = builder.imageFamily;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.instanceDescription = builder.instanceDescription;
        this.instanceName = builder.instanceName;
        this.instancePatternInfos = builder.instancePatternInfos;
        this.instanceType = builder.instanceType;
        this.instanceTypeOverrides = builder.instanceTypeOverrides;
        this.instanceTypes = builder.instanceTypes;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.ioOptimized = builder.ioOptimized;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.keyPairName = builder.keyPairName;
        this.loadBalancerWeight = builder.loadBalancerWeight;
        this.memory = builder.memory;
        this.networkInterfaces = builder.networkInterfaces;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.passwordInherit = builder.passwordInherit;
        this.ramRoleName = builder.ramRoleName;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingConfigurationName = builder.scalingConfigurationName;
        this.scalingGroupId = builder.scalingGroupId;
        this.schedulerOptions = builder.schedulerOptions;
        this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupIds = builder.securityGroupIds;
        this.securityOptions = builder.securityOptions;
        this.spotDuration = builder.spotDuration;
        this.spotInterruptionBehavior = builder.spotInterruptionBehavior;
        this.spotPriceLimits = builder.spotPriceLimits;
        this.spotStrategy = builder.spotStrategy;
        this.storageSetId = builder.storageSetId;
        this.storageSetPartitionNumber = builder.storageSetPartitionNumber;
        this.systemDiskCategories = builder.systemDiskCategories;
        this.tags = builder.tags;
        this.tenancy = builder.tenancy;
        this.userData = builder.userData;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScalingConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageOptions
     */
    public ImageOptions getImageOptions() {
        return this.imageOptions;
    }

    /**
     * @return privatePoolOptions
     */
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return affinity
     */
    public String getAffinity() {
        return this.affinity;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return creditSpecification
     */
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    /**
     * @return customPriorities
     */
    public java.util.List < CustomPriorities> getCustomPriorities() {
        return this.customPriorities;
    }

    /**
     * @return dataDisks
     */
    public java.util.List < DataDisks> getDataDisks() {
        return this.dataDisks;
    }

    /**
     * @return dedicatedHostClusterId
     */
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
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
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
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
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return instanceDescription
     */
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instancePatternInfos
     */
    public java.util.List < InstancePatternInfos> getInstancePatternInfos() {
        return this.instancePatternInfos;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceTypeOverrides
     */
    public java.util.List < InstanceTypeOverrides> getInstanceTypeOverrides() {
        return this.instanceTypeOverrides;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List < String > getInstanceTypes() {
        return this.instanceTypes;
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
     * @return loadBalancerWeight
     */
    public Integer getLoadBalancerWeight() {
        return this.loadBalancerWeight;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return networkInterfaces
     */
    public java.util.List < NetworkInterfaces> getNetworkInterfaces() {
        return this.networkInterfaces;
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
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
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
     * @return scalingConfigurationName
     */
    public String getScalingConfigurationName() {
        return this.scalingConfigurationName;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return schedulerOptions
     */
    public java.util.Map < String, ? > getSchedulerOptions() {
        return this.schedulerOptions;
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
     * @return spotInterruptionBehavior
     */
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    /**
     * @return spotPriceLimits
     */
    public java.util.List < SpotPriceLimits> getSpotPriceLimits() {
        return this.spotPriceLimits;
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
     * @return systemDiskCategories
     */
    public java.util.List < String > getSystemDiskCategories() {
        return this.systemDiskCategories;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return tenancy
     */
    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateScalingConfigurationRequest, Builder> {
        private ImageOptions imageOptions; 
        private PrivatePoolOptions privatePoolOptions; 
        private SystemDisk systemDisk; 
        private String affinity; 
        private String clientToken; 
        private Integer cpu; 
        private String creditSpecification; 
        private java.util.List < CustomPriorities> customPriorities; 
        private java.util.List < DataDisks> dataDisks; 
        private String dedicatedHostClusterId; 
        private String dedicatedHostId; 
        private Boolean deletionProtection; 
        private String deploymentSetId; 
        private String hostName; 
        private String hpcClusterId; 
        private String httpEndpoint; 
        private String httpTokens; 
        private String imageFamily; 
        private String imageId; 
        private String imageName; 
        private String instanceDescription; 
        private String instanceName; 
        private java.util.List < InstancePatternInfos> instancePatternInfos; 
        private String instanceType; 
        private java.util.List < InstanceTypeOverrides> instanceTypeOverrides; 
        private java.util.List < String > instanceTypes; 
        private String internetChargeType; 
        private Integer internetMaxBandwidthIn; 
        private Integer internetMaxBandwidthOut; 
        private String ioOptimized; 
        private Integer ipv6AddressCount; 
        private String keyPairName; 
        private Integer loadBalancerWeight; 
        private Integer memory; 
        private java.util.List < NetworkInterfaces> networkInterfaces; 
        private String ownerAccount; 
        private Long ownerId; 
        private String password; 
        private Boolean passwordInherit; 
        private String ramRoleName; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private String scalingConfigurationName; 
        private String scalingGroupId; 
        private java.util.Map < String, ? > schedulerOptions; 
        private String securityEnhancementStrategy; 
        private String securityGroupId; 
        private java.util.List < String > securityGroupIds; 
        private SecurityOptions securityOptions; 
        private Integer spotDuration; 
        private String spotInterruptionBehavior; 
        private java.util.List < SpotPriceLimits> spotPriceLimits; 
        private String spotStrategy; 
        private String storageSetId; 
        private Integer storageSetPartitionNumber; 
        private java.util.List < String > systemDiskCategories; 
        private String tags; 
        private String tenancy; 
        private String userData; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateScalingConfigurationRequest request) {
            super(request);
            this.imageOptions = request.imageOptions;
            this.privatePoolOptions = request.privatePoolOptions;
            this.systemDisk = request.systemDisk;
            this.affinity = request.affinity;
            this.clientToken = request.clientToken;
            this.cpu = request.cpu;
            this.creditSpecification = request.creditSpecification;
            this.customPriorities = request.customPriorities;
            this.dataDisks = request.dataDisks;
            this.dedicatedHostClusterId = request.dedicatedHostClusterId;
            this.dedicatedHostId = request.dedicatedHostId;
            this.deletionProtection = request.deletionProtection;
            this.deploymentSetId = request.deploymentSetId;
            this.hostName = request.hostName;
            this.hpcClusterId = request.hpcClusterId;
            this.httpEndpoint = request.httpEndpoint;
            this.httpTokens = request.httpTokens;
            this.imageFamily = request.imageFamily;
            this.imageId = request.imageId;
            this.imageName = request.imageName;
            this.instanceDescription = request.instanceDescription;
            this.instanceName = request.instanceName;
            this.instancePatternInfos = request.instancePatternInfos;
            this.instanceType = request.instanceType;
            this.instanceTypeOverrides = request.instanceTypeOverrides;
            this.instanceTypes = request.instanceTypes;
            this.internetChargeType = request.internetChargeType;
            this.internetMaxBandwidthIn = request.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.ioOptimized = request.ioOptimized;
            this.ipv6AddressCount = request.ipv6AddressCount;
            this.keyPairName = request.keyPairName;
            this.loadBalancerWeight = request.loadBalancerWeight;
            this.memory = request.memory;
            this.networkInterfaces = request.networkInterfaces;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.passwordInherit = request.passwordInherit;
            this.ramRoleName = request.ramRoleName;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingConfigurationName = request.scalingConfigurationName;
            this.scalingGroupId = request.scalingGroupId;
            this.schedulerOptions = request.schedulerOptions;
            this.securityEnhancementStrategy = request.securityEnhancementStrategy;
            this.securityGroupId = request.securityGroupId;
            this.securityGroupIds = request.securityGroupIds;
            this.securityOptions = request.securityOptions;
            this.spotDuration = request.spotDuration;
            this.spotInterruptionBehavior = request.spotInterruptionBehavior;
            this.spotPriceLimits = request.spotPriceLimits;
            this.spotStrategy = request.spotStrategy;
            this.storageSetId = request.storageSetId;
            this.storageSetPartitionNumber = request.storageSetPartitionNumber;
            this.systemDiskCategories = request.systemDiskCategories;
            this.tags = request.tags;
            this.tenancy = request.tenancy;
            this.userData = request.userData;
            this.zoneId = request.zoneId;
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
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
            this.putQueryParameter("PrivatePoolOptions", privatePoolOptions);
            this.privatePoolOptions = privatePoolOptions;
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
         * <p>Specifies whether to associate an ECS instance on a dedicated host with the dedicated host. Valid values:</p>
         * <ul>
         * <li>default: does not associate the ECS instance with the dedicated host. If you start an ECS instance that was stopped in economical mode and the original dedicated host has insufficient resources, the ECS instance is automatically deployed to another dedicated host in the automatic deployment resource pool.</li>
         * <li>host: associates the ECS instance with the dedicated host. If you start an ECS instance that was stopped in economical mode, the instance remains on the original dedicated host. If the original dedicated host has insufficient resources, the ECS instance fails to start.</li>
         * </ul>
         * <p>Default value: default</p>
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see the &quot;<a href="https://help.aliyun.com/document_detail/25693.html">How to ensure the idempotence of a request</a>&quot; topic.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The number of vCPUs.</p>
         * <p>You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set CPU to 2 and Memory to 16 to specify instance types that have 2 vCPUs and 16 GiB of memory. If you specify Cpu and Memory, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances by using the lowest-priced instance type.</p>
         * <blockquote>
         * <p>You can specify Cpu and Memory to determine the range of instance types only if you set Scaling Policy to Cost Optimization Policy and you do not specify instance types in the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The performance mode of the burstable instance. Valid values:</p>
         * <ul>
         * <li>Standard: standard mode</li>
         * <li>Unlimited: unlimited mode</li>
         * </ul>
         * <p>For more information, see the &quot;Performance modes&quot; section in the &quot;<a href="https://help.aliyun.com/document_detail/59977.html">Overview</a>&quot; topic.</p>
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
         * <p>The priority of the custom ECS instance type + vSwitch combination.</p>
         * <blockquote>
         * <p> This parameter takes effect only when Scaling Policy of the scaling group is set to Priority Policy.</p>
         * </blockquote>
         * <p>If Auto Scaling cannot create ECS instances by using the custom ECS instance type + vSwitch combination of the highest priority, Auto Scaling creates ECS instances by using the custom ECS instance type + vSwitch combination of the next highest priority.</p>
         * <blockquote>
         * <p> If you specify the priorities of only partial custom ECS instance type + vSwitch combinations, Auto Scaling preferentially creates ECS instances by using the custom combinations that have specified priorities. If the custom combinations that have specified priorities do not provide sufficient resources, Auto Scaling creates ECS instances by using the custom combinations that do not have specified priorities based on the specified orders of vSwitches and instance types.</p>
         * </blockquote>
         * <ul>
         * <li>Example: the specified order of vSwitches for your scaling group is vsw1 and vsw2 and the specified order of instance types in your scaling configuration is type1 and type 2. In addition, you use CustomPriorities to specify [&quot;vsw2+type2&quot;, &quot;vsw1+type2&quot;]. In this example, the vsw2+type2 combination has the highest priority and the vsw2+type1 combination has the lowest priority. The vsw1+type2 combination has a higher priority than the vsw1+type1 combination.</li>
         * </ul>
         */
        public Builder customPriorities(java.util.List < CustomPriorities> customPriorities) {
            this.putQueryParameter("CustomPriorities", customPriorities);
            this.customPriorities = customPriorities;
            return this;
        }

        /**
         * <p>The data disks.</p>
         */
        public Builder dataDisks(java.util.List < DataDisks> dataDisks) {
            this.putQueryParameter("DataDisks", dataDisks);
            this.dataDisks = dataDisks;
            return this;
        }

        /**
         * <p>The ID of the dedicated host cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dc-2zedxc67zqzt7lb4****</p>
         */
        public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
            this.putQueryParameter("DedicatedHostClusterId", dedicatedHostClusterId);
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }

        /**
         * <p>The ID of the dedicated host on which you want to create an ECS instance. You cannot create preemptible instances on dedicated hosts. If you specify DedicatedHostId, SpotStrategy and SpotPriceLimit are ignored.</p>
         * <p>You can call the DescribeDedicatedHosts operation to query dedicated host IDs.</p>
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
         * DeletionProtection.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>The ID of the deployment set of the ECS instances that are created by using the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1frxuzdg87zh4pz****</p>
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * <p>The hostname of the ECS instance. The hostname cannot start or end with a period (.) or a hyphen (-). The hostname cannot contain consecutive periods (.) or hyphens (-). Naming conventions for different types of instances:</p>
         * <ul>
         * <li>Windows instances: The hostname must be 2 to 15 characters in length and can contain letters, digits, and hyphens (-). The hostname cannot contain periods (.) or contain only digits.</li>
         * <li>Other instances, such as Linux instances: The hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>host****</p>
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The ID of the Elastic High Performance Computing (E-HPC) cluster to which the ECS instances that are created by using the scaling configuration belong.</p>
         * 
         * <strong>example:</strong>
         * <p>hpc-clusterid</p>
         */
        public Builder hpcClusterId(String hpcClusterId) {
            this.putQueryParameter("HpcClusterId", hpcClusterId);
            this.hpcClusterId = hpcClusterId;
            return this;
        }

        /**
         * HttpEndpoint.
         */
        public Builder httpEndpoint(String httpEndpoint) {
            this.putQueryParameter("HttpEndpoint", httpEndpoint);
            this.httpEndpoint = httpEndpoint;
            return this;
        }

        /**
         * HttpTokens.
         */
        public Builder httpTokens(String httpTokens) {
            this.putQueryParameter("HttpTokens", httpTokens);
            this.httpTokens = httpTokens;
            return this;
        }

        /**
         * <p>The name of the image family. If you specify this parameter, the most recent custom images that are available in the specified image family are returned. You can use the images to create instances. If you specify ImageId, you cannot specify ImageFamily.</p>
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
         * <p>The ID of the image that Auto Scaling uses to automatically create ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>centos6u5_64_20G_aliaegis****.vhd</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The name of the image. Each image name must be unique in a region. If you specify ImageId, ImageName is ignored.</p>
         * <p>You cannot use ImageName to specify images that are purchased from Alibaba Cloud Marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>image****</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The description of the ECS instance. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test instance.</p>
         */
        public Builder instanceDescription(String instanceDescription) {
            this.putQueryParameter("InstanceDescription", instanceDescription);
            this.instanceDescription = instanceDescription;
            return this;
        }

        /**
         * <p>The name of the ECS instance that Auto Scaling creates based on the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>instance****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The information about the intelligent configuration settings, which determine the available instance types.</p>
         */
        public Builder instancePatternInfos(java.util.List < InstancePatternInfos> instancePatternInfos) {
            this.putQueryParameter("InstancePatternInfos", instancePatternInfos);
            this.instancePatternInfos = instancePatternInfos;
            return this;
        }

        /**
         * <p>The instance type of the ECS instance. For more information, see the <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> topic.</p>
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
         * <p>The instance types.</p>
         */
        public Builder instanceTypeOverrides(java.util.List < InstanceTypeOverrides> instanceTypeOverrides) {
            this.putQueryParameter("InstanceTypeOverrides", instanceTypeOverrides);
            this.instanceTypeOverrides = instanceTypeOverrides;
            return this;
        }

        /**
         * <p>The instance types. If you specify InstanceTypes, InstanceType is ignored.</p>
         * <p>Auto Scaling creates instances based on the priorities of the instance types. If Auto Scaling cannot create instances by using the instance type that has the highest priority, Auto Scaling creates instances by using the instance type that has the next highest priority.</p>
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>The metering method for network usage. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: You are charged for the maximum available bandwidth that is specified by InternetMaxBandwidthOut.</li>
         * <li>PayByTraffic: You are charged based on the amount of transferred data. InternetMaxBandwidthOut specifies only the maximum available bandwidth.</li>
         * </ul>
         * <p>For the classic network, the default value is PayByBandwidth. For VPCs, the default value is PayByTraffic.</p>
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
         * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values: 1 to 200.</p>
         * <p>Default value: 200 This parameter is not used for billing because inbound traffic to instances is free of charge.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values:</p>
         * <ul>
         * <li>Valid values if you set InternetChargeType to PayByBandwidth: 0 to 100. If you leave this parameter empty, this parameter is automatically set to 0.</li>
         * <li>Valid values if you set InternetChargeType to PayByTraffic: 0 to 100. If you leave this parameter empty, an error is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * <p>Specifies whether to create an I/O optimized instance. Valid values:</p>
         * <p>none: does not create an I/O optimized instance. optimized: creates an I/O optimized instance.</p>
         * <p>For instances of retired instance types, the default value is none. For instances of other instance types, the default value is optimized.</p>
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
         * <p>The number of randomly generated IPv6 addresses that you want to allocate to the elastic network interface (ENI).</p>
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
         * <p>The name of the key pair that you want to use to log on to an ECS instance.</p>
         * <ul>
         * <li>Windows instances do not support this parameter.</li>
         * <li>By default, the username and password authentication method is disabled for Linux instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KeyPairTest</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The weight of an ECS instance as a backend server. Valid values: 1 to 100.</p>
         * <p>Default value: 50</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder loadBalancerWeight(Integer loadBalancerWeight) {
            this.putQueryParameter("LoadBalancerWeight", loadBalancerWeight);
            this.loadBalancerWeight = loadBalancerWeight;
            return this;
        }

        /**
         * <p>The memory size. Unit: GiB.</p>
         * <p>You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set Cpu to 2 and Memory to 16 to specify instance types that have 2 vCPUs and 16 GiB of memory. If you specify Cpu and Memory, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances by using the lowest-priced instance type.</p>
         * <blockquote>
         * <p>You can specify Cpu and Memory to determine the range of instance types only if you set Scaling Policy to Cost Optimization Policy and you do not specify instance types in the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder memory(Integer memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * NetworkInterfaces.
         */
        public Builder networkInterfaces(java.util.List < NetworkInterfaces> networkInterfaces) {
            this.putQueryParameter("NetworkInterfaces", networkInterfaces);
            this.networkInterfaces = networkInterfaces;
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
         * <p>The password that you want to use to log on to an ECS instance. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
         * <p><code>`() ~!@#$%^&amp;*-_+=\|{}[]:;\&quot;&lt;&gt;,.?/</code></p>
         * <p>The password of a Windows instance cannot start with a forward slash (/).</p>
         * <blockquote>
         * <p>For security reasons, we recommend that you use HTTPS to send requests if you specify Password.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123abc****</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>Specifies whether to use the password that is preconfigured in the image. Before you use this parameter, make sure that a password is configured in the image. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
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
         * <p>The name of the RAM role that you attach to the ECS instance. The name is provided and maintained by Resource Access Management (RAM). You can call the ListRoles operation to query the available RAM roles.</p>
         * 
         * <strong>example:</strong>
         * <p>ramrole****</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the ECS instances that are created by using the scaling configuration belong.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-resource****</p>
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
         * <p>The name of the scaling configuration. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). The name must start with a letter or a digit.</p>
         * <p>The name of the scaling configuration must be unique in a region. If you do not specify this parameter, the scaling configuration ID is used.</p>
         * 
         * <strong>example:</strong>
         * <p>scalingconfig****</p>
         */
        public Builder scalingConfigurationName(String scalingConfigurationName) {
            this.putQueryParameter("ScalingConfigurationName", scalingConfigurationName);
            this.scalingConfigurationName = scalingConfigurationName;
            return this;
        }

        /**
         * <p>The ID of the scaling group in which you want to create a scaling configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp14wlu85wrpchm0****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>The scheduler options.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;testManagedPrivateSpaceId****&quot;]</p>
         */
        public Builder schedulerOptions(java.util.Map < String, ? > schedulerOptions) {
            String schedulerOptionsShrink = shrink(schedulerOptions, "SchedulerOptions", "json");
            this.putQueryParameter("SchedulerOptions", schedulerOptionsShrink);
            this.schedulerOptions = schedulerOptions;
            return this;
        }

        /**
         * <p>Specifies whether to enable security hardening. Valid values:</p>
         * <ul>
         * <li>Active: enables security hardening. This value is applicable only to public images.</li>
         * <li>Deactive: disables security hardening. This value is applicable to all image types.</li>
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
         * <p>The ID of the security group with which ECS instances are associated. ECS instances that are associated with the same security group can access each other.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-280ih****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The IDs of the security groups with which you want to associate the ECS instances that are created by using the scaling configuration. For more information, see the &quot;Security group limits&quot; section of the &quot;<a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>&quot; topic.</p>
         * <blockquote>
         * <p>If you specify SecurityGroupId, you cannot specify SecurityGroupIds.</p>
         * </blockquote>
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
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
         * <p>The retention period of the preemptible instance. Unit: hours. Valid values: 0, 1, 2, 3, 4, 5, and 6.</p>
         * <ul>
         * <li>The following retention periods are available in invitational preview: 2, 3, 4, 5, and 6 hours. If you want to set this parameter to one of these values, submit a ticket.</li>
         * <li>If you set this parameter to 0, no protection period is specified for the preemptible instance.</li>
         * </ul>
         * <p>Default value: 1</p>
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
         * <p>The interruption mode of the preemptible instance. Set the value to Terminate. The value specifies that the preemptible instance is to be released.</p>
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
         * <p>The billing information of the preemptible instances.</p>
         */
        public Builder spotPriceLimits(java.util.List < SpotPriceLimits> spotPriceLimits) {
            this.putQueryParameter("SpotPriceLimits", spotPriceLimits);
            this.spotPriceLimits = spotPriceLimits;
            return this;
        }

        /**
         * <p>The preemption policy that you want to apply to pay-as-you-go and preemptible instances. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instance is created as a pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instance is a preemptible instance that has a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
         * </ul>
         * <p>Default value: NoSpot</p>
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
         * StorageSetId.
         */
        public Builder storageSetId(String storageSetId) {
            this.putQueryParameter("StorageSetId", storageSetId);
            this.storageSetId = storageSetId;
            return this;
        }

        /**
         * StorageSetPartitionNumber.
         */
        public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.putQueryParameter("StorageSetPartitionNumber", storageSetPartitionNumber);
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }

        /**
         * <p>The categories of the system disks. If Auto Scaling cannot create instances by using the disk category that has the highest priority, Auto Scaling creates instances by using the disk category that has the next highest priority. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk</li>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_essd: ESSD</li>
         * </ul>
         * <blockquote>
         * <p>If you specify SystemDiskCategories, you cannot specify <code>SystemDisk.Category</code>.</p>
         * </blockquote>
         */
        public Builder systemDiskCategories(java.util.List < String > systemDiskCategories) {
            this.putQueryParameter("SystemDiskCategories", systemDiskCategories);
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }

        /**
         * <p>The tags of the ECS instance. Tags must be specified as key-value pairs. You can specify up to 20 tags. When you specify tag keys and tag values, take note of the following items:</p>
         * <ul>
         * <li>A tag key can be up to 64 characters in length. The key cannot start with acs: or aliyun and cannot contain <code>http://</code> or <code>https://</code>. You cannot specify an empty string as a tag key.</li>
         * <li>A tag value can be up to 128 characters in length. The value cannot start with acs: or aliyun and cannot contain <code>http://</code> or <code>https://</code>. You can specify an empty string as a tag value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;, ... &quot;key5&quot;:&quot;value5&quot;}</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>Specifies whether to create an ECS instance on a dedicated host. Valid values:</p>
         * <ul>
         * <li>default: does not create an ECS instance on a dedicated host.</li>
         * <li>host: creates an ECS instance on a dedicated host. If you do not specify DedicatedHostId, Alibaba Cloud selects a dedicated host for the ECS instance.</li>
         * </ul>
         * <p>Default value: default</p>
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
         * <p>The user data of the Elastic Compute Service (ECS) instance. The user data must be encoded in Base64 format. The size of raw data before Base64 encoding cannot exceed 32 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>echo hello ecs!</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The zone ID of the ECS instance.</p>
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
        public CreateScalingConfigurationRequest build() {
            return new CreateScalingConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingConfigurationRequest</p>
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

            /**
             * <p>For more information about whether an ECS instance uses the ecs-user user user to log on to an ECS instance, see <a href="https://help.aliyun.com/document_detail/388447.html">Manage the login name of an ECS instance</a>. Value range:</p>
             * <ul>
             * <li>true: Yes.</li>
             * <li>false: No.</li>
             * </ul>
             * <p>Default value: false.</p>
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
     * {@link CreateScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingConfigurationRequest</p>
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

            /**
             * <p>The ID of the private pool. The ID of a private pool is the same as the ID of the elasticity assurance or capacity reservation for which the private pool is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>eap-bp67acfmxazb4****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of the private pool that you want to use to start ECS instances. A private pool is generated when an elasticity assurance or a capacity reservation takes effect. You can select a private pool to create ECS instances. Valid values:</p>
             * <ul>
             * <li>Open: open private pool. Auto Scaling selects a matching open private pool to start instances. If no matching open private pools are found, Auto Scaling uses the resources in the public pool to start instances. In this case, you do not need to specify PrivatePoolOptions.Id.</li>
             * <li>Target: specified private pool. Auto Scaling uses the resources in the specified private pool to start ECS instances. If the specified private pool is unavailable, Auto Scaling cannot start ECS instances. If you set this parameter to Target, you must specify PrivatePoolOptions.Id.</li>
             * <li>None: no private pool. Auto Scaling does not use the resources in private pools to start ECS instances.</li>
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
     * {@link CreateScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingConfigurationRequest</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("EncryptAlgorithm")
        private String encryptAlgorithm;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

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
            this.description = builder.description;
            this.diskName = builder.diskName;
            this.encryptAlgorithm = builder.encryptAlgorithm;
            this.encrypted = builder.encrypted;
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
         * @return encryptAlgorithm
         */
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
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

        public static final class Builder {
            private String autoSnapshotPolicyId; 
            private Boolean burstingEnabled; 
            private String category; 
            private String description; 
            private String diskName; 
            private String encryptAlgorithm; 
            private Boolean encrypted; 
            private String KMSKeyId; 
            private String performanceLevel; 
            private Long provisionedIops; 
            private Integer size; 

            /**
             * <p>The ID of the automatic snapshot policy that you want to apply to the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-bp12m37ccmxvbmi5****</p>
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the burst feature for the system disk. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is available only if you set <code>SystemDisk.Category</code> to <code>cloud_auto</code>.</p>
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
             * <p>The category of the system disk. Valid values:</p>
             * <ul>
             * <li>cloud: basic disk</li>
             * <li>cloud_efficiency: ultra disk</li>
             * <li>cloud_ssd: standard SSD</li>
             * <li>ephemeral_ssd: local SSD</li>
             * <li>cloud_essd: enhanced SSD (ESSD)</li>
             * <li>cloud_auto: ESSD AutoPL disk</li>
             * </ul>
             * <p>If you specify SystemDisk.Category, you cannot specify <code>SystemDiskCategories</code>. If you do not specify SystemDisk.Category or <code>SystemDiskCategories</code>, the default value of SystemDisk.Category is used.</p>
             * <ul>
             * <li>For I/O optimized instances, the default value is cloud_efficiency.</li>
             * <li>For non-I/O optimized instances, the default value is cloud.</li>
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
             * <p>The description of the system disk. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Test system disk.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the system disk. The name must be 2 to 128 characters in length. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssdSystem</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <p>The encryption algorithm that you want to use to encrypt the system disk. Valid values:</p>
             * <ul>
             * <li>AES-256</li>
             * <li>SM4-128</li>
             * </ul>
             * <p>Default value: AES-256</p>
             * 
             * <strong>example:</strong>
             * <p>AES-256</p>
             */
            public Builder encryptAlgorithm(String encryptAlgorithm) {
                this.encryptAlgorithm = encryptAlgorithm;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the system disk. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The ID of the KMS key that you want to use to encrypt the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * <p>The performance level (PL) of the system disk that is an enhanced SSD (ESSD). Valid values:</p>
             * <ul>
             * <li>PL0: An ESSD can provide up to 10,000 random read/write IOPS.</li>
             * <li>PL1: An ESSD can provide up to 50,000 random read/write IOPS.</li>
             * <li>PL2: An ESSD can provide up to 100,000 random read/write IOPS.</li>
             * <li>PL3: An ESSD can provide up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * <p>Default value: PL1.</p>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The IOPS metric that is preconfigured for the system disk.</p>
             * <blockquote>
             * <p>IOPS measures the number of read and write operations that an EBS device can process per second.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GiB.</p>
             * <ul>
             * <li>If you set SystemDisk.Category cloud: 20 to 500.</li>
             * <li>If you set SystemDisk.Category to cloud_efficiency: 20 to 500.</li>
             * <li>If you set SystemDisk.Category to cloud_ssd: 20 to 500.</li>
             * <li>If you set SystemDisk.Category to cloud_essd: 20 to 500.</li>
             * <li>If you set SystemDisk.Category to cloud_essd: 20 to 500.</li>
             * </ul>
             * <p>The value of SystemDisk.Size must be greater than or equal to the value of max{20, ImageSize}.</p>
             * <p>Default value: 40 or the size of the image, whichever is greater.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
     * {@link CreateScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingConfigurationRequest</p>
     */
    public static class CustomPriorities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private CustomPriorities(Builder builder) {
            this.instanceType = builder.instanceType;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPriorities create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String instanceType; 
            private String vswitchId; 

            /**
             * <p>The ECS instance type.</p>
             * <blockquote>
             * <p> The ECS instance type must be included in the instance types specified in the scaling configuration.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * <blockquote>
             * <p> The vSwitch must be included in the vSwitch list of the scaling group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp14zolna43z266bq****</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public CustomPriorities build() {
                return new CustomPriorities(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingConfigurationRequest</p>
     */
    public static class DataDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List < String > categories;

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

        private DataDisks(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.burstingEnabled = builder.burstingEnabled;
            this.categories = builder.categories;
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

        public static DataDisks create() {
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
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
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
            private java.util.List < String > categories; 
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

            /**
             * <p>The ID of the automatic snapshot policy that you want to apply to the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-bp19nq9enxqkomib****</p>
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the burst feature for the system disk. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is available only if you set <code>SystemDisk.Category</code> to <code>cloud_auto</code>.</p>
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
             * <p>The categories of the data disks. If Auto Scaling cannot create instances by using the disk category that has the highest priority, Auto Scaling creates instances by using the disk category that has the next highest priority. Valid values:</p>
             * <ul>
             * <li>cloud: basic disk. For a basic disk that is created together with the instance, DeleteWithInstance is set to true.</li>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_essd: ESSD.</li>
             * </ul>
             * <blockquote>
             * <p>If you specify Categories, you cannot specify <code>DataDisks.Category</code>.</p>
             * </blockquote>
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>The category of the data disk. Valid values:</p>
             * <ul>
             * <li>cloud: basic disk</li>
             * <li>cloud_efficiency: ultra disk</li>
             * <li>cloud_ssd: standard SSD</li>
             * <li>cloud_essd: ESSD</li>
             * <li>ephemeral_ssd: local SSD</li>
             * <li>cloud_auto: ESSD AutoPL disk</li>
             * </ul>
             * <p>If you specify this parameter, you cannot specify Categories. If you do not specify Category or Categories, the default value of Category is used.</p>
             * <ul>
             * <li>For I/O optimized instances, the default value is cloud_efficiency.</li>
             * <li>For non-I/O optimized instances, the default value is cloud.</li>
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
             * <p>Specifies whether to release the data disk when the instance to which the data disk is attached is released. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>This parameter is available only for independent disks whose value of Category is set to cloud, cloud_efficiency, cloud_ssd, or cloud_essd. If you specify this parameter for other disks, an error is reported.</p>
             * <p>Default value: true</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * <p>The description of the data disk. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Test data disk.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The mount target of the data disk. If you do not specify Device, a mount target is automatically assigned when Auto Scaling creates ECS instances. The names of mount targets range from /dev/xvdb to /dev/xvdz.</p>
             * 
             * <strong>example:</strong>
             * <p>/dev/xvdb</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The name of the system disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssdData</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the data disk. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The ID of the KMS key that you want to use to encrypt the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * <p>The PL of the data disk that is an ESSD. Valid values:</p>
             * <ul>
             * <li>PL0: An ESSD can provide up to 10,000 random read/write IOPS.</li>
             * <li>PL1: An ESSD can provide up to 50,000 random read/write IOPS.</li>
             * <li>PL2: An ESSD can provide up to 100,000 random read/write IOPS.</li>
             * <li>PL3: An ESSD can provide up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * <blockquote>
             * <p>For more information about how to select ESSD PLs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The IOPS metric that is preconfigured for the data disk.</p>
             * <blockquote>
             * <p>IOPS measures the number of read and write operations that an EBS device can process per second.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * <p>The size of the data disk. Unit: GiB. Valid values:</p>
             * <ul>
             * <li>If you set Categories to cloud: 5 to 2000.</li>
             * <li>If you set Categories to cloud_efficiency: 20 to 32768.</li>
             * <li>If you set Categories to cloud_essd: 20 to 32768.</li>
             * <li>If you set Categories to ephemeral_ssd: 5 to 800.</li>
             * </ul>
             * <p>The size of the data disk must be greater than or equal to the size of the snapshot that is specified by SnapshotId.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The ID of the snapshot that you want to use to create data disks. If you specify this parameter, DataDisks.Size is ignored. The size of the data disk is the same as the size of the specified snapshot.</p>
             * <p>If you specify a snapshot that is created on or before July 15, 2013, the operation fails and the system returns InvalidSnapshot.TooOld.</p>
             * 
             * <strong>example:</strong>
             * <p>s-280s7****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingConfigurationRequest</p>
     */
    public static class InstancePatternInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architectures")
        private java.util.List < String > architectures;

        @com.aliyun.core.annotation.NameInMap("BurstablePerformance")
        private String burstablePerformance;

        @com.aliyun.core.annotation.NameInMap("Cores")
        private Integer cores;

        @com.aliyun.core.annotation.NameInMap("CpuArchitectures")
        private java.util.List < String > cpuArchitectures;

        @com.aliyun.core.annotation.NameInMap("ExcludedInstanceTypes")
        private java.util.List < String > excludedInstanceTypes;

        @com.aliyun.core.annotation.NameInMap("GpuSpecs")
        private java.util.List < String > gpuSpecs;

        @com.aliyun.core.annotation.NameInMap("InstanceCategories")
        private java.util.List < String > instanceCategories;

        @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilies")
        private java.util.List < String > instanceTypeFamilies;

        @com.aliyun.core.annotation.NameInMap("MaxPrice")
        private Float maxPrice;

        @com.aliyun.core.annotation.NameInMap("MaximumCpuCoreCount")
        private Integer maximumCpuCoreCount;

        @com.aliyun.core.annotation.NameInMap("MaximumGpuAmount")
        private Integer maximumGpuAmount;

        @com.aliyun.core.annotation.NameInMap("MaximumMemorySize")
        private Float maximumMemorySize;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("MinimumBaselineCredit")
        private Integer minimumBaselineCredit;

        @com.aliyun.core.annotation.NameInMap("MinimumCpuCoreCount")
        private Integer minimumCpuCoreCount;

        @com.aliyun.core.annotation.NameInMap("MinimumEniIpv6AddressQuantity")
        private Integer minimumEniIpv6AddressQuantity;

        @com.aliyun.core.annotation.NameInMap("MinimumEniPrivateIpAddressQuantity")
        private Integer minimumEniPrivateIpAddressQuantity;

        @com.aliyun.core.annotation.NameInMap("MinimumEniQuantity")
        private Integer minimumEniQuantity;

        @com.aliyun.core.annotation.NameInMap("MinimumGpuAmount")
        private Integer minimumGpuAmount;

        @com.aliyun.core.annotation.NameInMap("MinimumInitialCredit")
        private Integer minimumInitialCredit;

        @com.aliyun.core.annotation.NameInMap("MinimumMemorySize")
        private Float minimumMemorySize;

        @com.aliyun.core.annotation.NameInMap("PhysicalProcessorModels")
        private java.util.List < String > physicalProcessorModels;

        private InstancePatternInfos(Builder builder) {
            this.architectures = builder.architectures;
            this.burstablePerformance = builder.burstablePerformance;
            this.cores = builder.cores;
            this.cpuArchitectures = builder.cpuArchitectures;
            this.excludedInstanceTypes = builder.excludedInstanceTypes;
            this.gpuSpecs = builder.gpuSpecs;
            this.instanceCategories = builder.instanceCategories;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.instanceTypeFamilies = builder.instanceTypeFamilies;
            this.maxPrice = builder.maxPrice;
            this.maximumCpuCoreCount = builder.maximumCpuCoreCount;
            this.maximumGpuAmount = builder.maximumGpuAmount;
            this.maximumMemorySize = builder.maximumMemorySize;
            this.memory = builder.memory;
            this.minimumBaselineCredit = builder.minimumBaselineCredit;
            this.minimumCpuCoreCount = builder.minimumCpuCoreCount;
            this.minimumEniIpv6AddressQuantity = builder.minimumEniIpv6AddressQuantity;
            this.minimumEniPrivateIpAddressQuantity = builder.minimumEniPrivateIpAddressQuantity;
            this.minimumEniQuantity = builder.minimumEniQuantity;
            this.minimumGpuAmount = builder.minimumGpuAmount;
            this.minimumInitialCredit = builder.minimumInitialCredit;
            this.minimumMemorySize = builder.minimumMemorySize;
            this.physicalProcessorModels = builder.physicalProcessorModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancePatternInfos create() {
            return builder().build();
        }

        /**
         * @return architectures
         */
        public java.util.List < String > getArchitectures() {
            return this.architectures;
        }

        /**
         * @return burstablePerformance
         */
        public String getBurstablePerformance() {
            return this.burstablePerformance;
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return cpuArchitectures
         */
        public java.util.List < String > getCpuArchitectures() {
            return this.cpuArchitectures;
        }

        /**
         * @return excludedInstanceTypes
         */
        public java.util.List < String > getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        /**
         * @return gpuSpecs
         */
        public java.util.List < String > getGpuSpecs() {
            return this.gpuSpecs;
        }

        /**
         * @return instanceCategories
         */
        public java.util.List < String > getInstanceCategories() {
            return this.instanceCategories;
        }

        /**
         * @return instanceFamilyLevel
         */
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        /**
         * @return instanceTypeFamilies
         */
        public java.util.List < String > getInstanceTypeFamilies() {
            return this.instanceTypeFamilies;
        }

        /**
         * @return maxPrice
         */
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        /**
         * @return maximumCpuCoreCount
         */
        public Integer getMaximumCpuCoreCount() {
            return this.maximumCpuCoreCount;
        }

        /**
         * @return maximumGpuAmount
         */
        public Integer getMaximumGpuAmount() {
            return this.maximumGpuAmount;
        }

        /**
         * @return maximumMemorySize
         */
        public Float getMaximumMemorySize() {
            return this.maximumMemorySize;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        /**
         * @return minimumBaselineCredit
         */
        public Integer getMinimumBaselineCredit() {
            return this.minimumBaselineCredit;
        }

        /**
         * @return minimumCpuCoreCount
         */
        public Integer getMinimumCpuCoreCount() {
            return this.minimumCpuCoreCount;
        }

        /**
         * @return minimumEniIpv6AddressQuantity
         */
        public Integer getMinimumEniIpv6AddressQuantity() {
            return this.minimumEniIpv6AddressQuantity;
        }

        /**
         * @return minimumEniPrivateIpAddressQuantity
         */
        public Integer getMinimumEniPrivateIpAddressQuantity() {
            return this.minimumEniPrivateIpAddressQuantity;
        }

        /**
         * @return minimumEniQuantity
         */
        public Integer getMinimumEniQuantity() {
            return this.minimumEniQuantity;
        }

        /**
         * @return minimumGpuAmount
         */
        public Integer getMinimumGpuAmount() {
            return this.minimumGpuAmount;
        }

        /**
         * @return minimumInitialCredit
         */
        public Integer getMinimumInitialCredit() {
            return this.minimumInitialCredit;
        }

        /**
         * @return minimumMemorySize
         */
        public Float getMinimumMemorySize() {
            return this.minimumMemorySize;
        }

        /**
         * @return physicalProcessorModels
         */
        public java.util.List < String > getPhysicalProcessorModels() {
            return this.physicalProcessorModels;
        }

        public static final class Builder {
            private java.util.List < String > architectures; 
            private String burstablePerformance; 
            private Integer cores; 
            private java.util.List < String > cpuArchitectures; 
            private java.util.List < String > excludedInstanceTypes; 
            private java.util.List < String > gpuSpecs; 
            private java.util.List < String > instanceCategories; 
            private String instanceFamilyLevel; 
            private java.util.List < String > instanceTypeFamilies; 
            private Float maxPrice; 
            private Integer maximumCpuCoreCount; 
            private Integer maximumGpuAmount; 
            private Float maximumMemorySize; 
            private Float memory; 
            private Integer minimumBaselineCredit; 
            private Integer minimumCpuCoreCount; 
            private Integer minimumEniIpv6AddressQuantity; 
            private Integer minimumEniPrivateIpAddressQuantity; 
            private Integer minimumEniQuantity; 
            private Integer minimumGpuAmount; 
            private Integer minimumInitialCredit; 
            private Float minimumMemorySize; 
            private java.util.List < String > physicalProcessorModels; 

            /**
             * <p>The architecture types of instance types. Valid values:</p>
             * <ul>
             * <li>X86: x86.</li>
             * <li>Heterogeneous: heterogeneous computing, such as GPU-accelerated or FPGA-accelerated.</li>
             * <li>BareMetal: ECS Bare Metal Instance.</li>
             * <li>Arm: Arm.</li>
             * <li>SuperComputeCluster: Super Computing Cluster.</li>
             * </ul>
             * <p>By default, all values are included.</p>
             */
            public Builder architectures(java.util.List < String > architectures) {
                this.architectures = architectures;
                return this;
            }

            /**
             * <p>Specifies whether to include burstable instance types. Valid values:</p>
             * <ul>
             * <li>Exclude: does not include burstable instance types.</li>
             * <li>Include: includes burstable instance types.</li>
             * <li>Required: includes only burstable instance types.</li>
             * </ul>
             * <p>Default value: Include.</p>
             * 
             * <strong>example:</strong>
             * <p>Include</p>
             */
            public Builder burstablePerformance(String burstablePerformance) {
                this.burstablePerformance = burstablePerformance;
                return this;
            }

            /**
             * <p>The number of vCPUs per instance type in intelligent configuration mode. You can use this parameter to match the available instance types. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
             * <p>Take note of the following items:</p>
             * <ul>
             * <li>InstancePatternInfos applies only to the scaling groups that reside in virtual private clouds (VPCs).</li>
             * <li>If you specify InstancePatternInfos, you must also specify InstancePatternInfos.Cores and InstancePatternInfos.Memory.</li>
             * <li>If you specify InstanceType or InstanceTypes, Auto Scaling preferentially uses the instance type specified by InstanceType or InstanceTypes to create instances during scale-out events. If the specified instance type has insufficient inventory, Auto Scaling uses the lowest-priced instance type specified by InstancePatternInfos to create instances during scale-out events.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The CPU architectures of instance types. Valid values:</p>
             * <blockquote>
             * <p> You can specify 1 to 2 CPU architectures.</p>
             * </blockquote>
             * <ul>
             * <li>x86</li>
             * <li>Arm</li>
             * </ul>
             */
            public Builder cpuArchitectures(java.util.List < String > cpuArchitectures) {
                this.cpuArchitectures = cpuArchitectures;
                return this;
            }

            /**
             * <p>The instance types that you want to exclude. You can use wildcard characters, such as an asterisk (*), to exclude an instance type or an instance family. Examples:</p>
             * <ul>
             * <li>ecs.c6.large: excludes the ecs.c6.large instance type.</li>
             * <li>ecs.c6.*: excludes the c6 instance family.</li>
             * </ul>
             */
            public Builder excludedInstanceTypes(java.util.List < String > excludedInstanceTypes) {
                this.excludedInstanceTypes = excludedInstanceTypes;
                return this;
            }

            /**
             * <p>The GPU models.</p>
             */
            public Builder gpuSpecs(java.util.List < String > gpuSpecs) {
                this.gpuSpecs = gpuSpecs;
                return this;
            }

            /**
             * <p>The categories of instance types. Valid values:</p>
             * <blockquote>
             * <p> You can specify up to 10 categories.</p>
             * </blockquote>
             * <ul>
             * <li>General-purpose</li>
             * <li>Compute-optimized</li>
             * <li>Memory-optimized</li>
             * <li>Big data</li>
             * <li>Local SSDs</li>
             * <li>High Clock Speed</li>
             * <li>Enhanced</li>
             * <li>Shared</li>
             * <li>Compute-optimized with GPU</li>
             * <li>Visual Compute-optimized</li>
             * <li>Heterogeneous Service</li>
             * <li>Compute-optimized with FPGA</li>
             * <li>Compute-optimized with NPU</li>
             * <li>ECS Bare Metal</li>
             * <li>Super Computing Cluster</li>
             * <li>High Performance Compute</li>
             * </ul>
             */
            public Builder instanceCategories(java.util.List < String > instanceCategories) {
                this.instanceCategories = instanceCategories;
                return this;
            }

            /**
             * <p>The level of the instance family. You can use this parameter to match the available instance types. This parameter takes effect only if you set <code>CostOptimization</code> to true. Valid values:</p>
             * <ul>
             * <li>EntryLevel: entry level (shared instance type). Instance types of this level are the most cost-effective but may not provide stable computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
             * <li>EnterpriseLevel: enterprise level. Instance types of this level provide stable performance and dedicated resources, and are suitable for business scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</li>
             * <li>CreditEntryLevel: credit-based entry level (burstable instance types). CPU credits are used to ensure computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EnterpriseLevel</p>
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * <p>The instance families that you want to specify. You can specify up to 10 instance families in each call.</p>
             */
            public Builder instanceTypeFamilies(java.util.List < String > instanceTypeFamilies) {
                this.instanceTypeFamilies = instanceTypeFamilies;
                return this;
            }

            /**
             * <p>The maximum hourly price of pay-as-you-go or preemptible instances in intelligent configuration mode. You can specify this parameter to filter the available instance types.</p>
             * <blockquote>
             * <p> If you set SpotStrategy to SpotWithPriceLimit, you must specify this parameter. In other cases, this parameter is optional.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * <p>The maximum number of vCPUs per instance type.</p>
             * <blockquote>
             * <p> The value of MaximumCpuCoreCount cannot exceed four times the value of MinimumCpuCoreCount.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder maximumCpuCoreCount(Integer maximumCpuCoreCount) {
                this.maximumCpuCoreCount = maximumCpuCoreCount;
                return this;
            }

            /**
             * <p>The maximum number of GPUs per instance. The value must be a positive integer.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maximumGpuAmount(Integer maximumGpuAmount) {
                this.maximumGpuAmount = maximumGpuAmount;
                return this;
            }

            /**
             * <p>The maximum memory size per instance. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder maximumMemorySize(Float maximumMemorySize) {
                this.maximumMemorySize = maximumMemorySize;
                return this;
            }

            /**
             * <p>The memory size per instance type in intelligent configuration mode. Unit: GiB. You can use this parameter to match the available instance types.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The baseline vCPU computing performance (overall baseline performance of all vCPUs) per t5 or t6 burstable instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder minimumBaselineCredit(Integer minimumBaselineCredit) {
                this.minimumBaselineCredit = minimumBaselineCredit;
                return this;
            }

            /**
             * <p>The minimum number of vCPUs per instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minimumCpuCoreCount(Integer minimumCpuCoreCount) {
                this.minimumCpuCoreCount = minimumCpuCoreCount;
                return this;
            }

            /**
             * <p>The minimum number of IPv6 addresses per ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minimumEniIpv6AddressQuantity(Integer minimumEniIpv6AddressQuantity) {
                this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
                return this;
            }

            /**
             * <p>The minimum number of IPv4 addresses per ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minimumEniPrivateIpAddressQuantity(Integer minimumEniPrivateIpAddressQuantity) {
                this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
                return this;
            }

            /**
             * <p>The minimum number of elastic network interfaces (ENIs) per instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minimumEniQuantity(Integer minimumEniQuantity) {
                this.minimumEniQuantity = minimumEniQuantity;
                return this;
            }

            /**
             * <p>The minimum number of GPUs per instance. The value must be a positive integer.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minimumGpuAmount(Integer minimumGpuAmount) {
                this.minimumGpuAmount = minimumGpuAmount;
                return this;
            }

            /**
             * <p>The initial vCPU credits per t5 or t6 burstable instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder minimumInitialCredit(Integer minimumInitialCredit) {
                this.minimumInitialCredit = minimumInitialCredit;
                return this;
            }

            /**
             * <p>The minimum memory size per instance. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder minimumMemorySize(Float minimumMemorySize) {
                this.minimumMemorySize = minimumMemorySize;
                return this;
            }

            /**
             * <p>The processor models of instance types. You can specify up to 10 processor models.</p>
             */
            public Builder physicalProcessorModels(java.util.List < String > physicalProcessorModels) {
                this.physicalProcessorModels = physicalProcessorModels;
                return this;
            }

            public InstancePatternInfos build() {
                return new InstancePatternInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingConfigurationRequest</p>
     */
    public static class InstanceTypeOverrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("WeightedCapacity")
        private Integer weightedCapacity;

        private InstanceTypeOverrides(Builder builder) {
            this.instanceType = builder.instanceType;
            this.weightedCapacity = builder.weightedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeOverrides create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return weightedCapacity
         */
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public static final class Builder {
            private String instanceType; 
            private Integer weightedCapacity; 

            /**
             * <p>Instance type N that you want to use to override the instance type that is specified in the launch template.</p>
             * <p>If you want to trigger scale-outs based on the weighted capacities of instances, specify InstanceType and WeightedCapacity at the same time. You can specify N instance types by using the Extended Configurations feature. Valid values of N: 1 to 10.</p>
             * <blockquote>
             * <p>This parameter takes effect only if you specify LaunchTemplateId.</p>
             * </blockquote>
             * <p>You can specify an instance type that is available for purchase as the value of InstanceType.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c5.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The weight of instance type N. If you want to trigger scale-outs based on the weighted capacities of instances, you must specify WeightedCapacity after you specify InstanceType.</p>
             * <p>The weight of an instance type specifies the capacity of an instance of the instance type in the scaling group. A higher weight specifies that a smaller number of instances of the specified instance type is required to meet the expected capacity requirement.</p>
             * <p>Performance metrics, such as the number of vCPUs and the memory size of each instance type, may vary. You can specify different weights for different instance types based on your business requirements.</p>
             * <p>Example:</p>
             * <ul>
             * <li>Current capacity: 0</li>
             * <li>Expected capacity: 6</li>
             * <li>Capacity of ecs.c5.xlarge: 4</li>
             * </ul>
             * <p>To meet the expected capacity requirement, Auto Scaling must create and add two ecs.c5.xlarge instances.</p>
             * <blockquote>
             * <p>The capacity of the scaling group cannot exceed the sum of the maximum number of instances that is specified by MaxSize and the maximum weight of the instance types.</p>
             * </blockquote>
             * <p>Valid values of WeightedCapacity: 1 to 500.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder weightedCapacity(Integer weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            public InstanceTypeOverrides build() {
                return new InstanceTypeOverrides(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingConfigurationRequest</p>
     */
    public static class NetworkInterfaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ipv6AddressCount")
        private Integer ipv6AddressCount;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List < String > securityGroupIds;

        private NetworkInterfaces(Builder builder) {
            this.instanceType = builder.instanceType;
            this.ipv6AddressCount = builder.ipv6AddressCount;
            this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
            this.securityGroupIds = builder.securityGroupIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaces create() {
            return builder().build();
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
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        /**
         * @return networkInterfaceTrafficMode
         */
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List < String > getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public static final class Builder {
            private String instanceType; 
            private Integer ipv6AddressCount; 
            private String networkInterfaceTrafficMode; 
            private java.util.List < String > securityGroupIds; 

            /**
             * <p>Instance type N that you want to use to override the instance type that is specified in the launch template.</p>
             * <p>If you want to trigger scale-outs based on the weighted capacities of instances, specify InstanceType and WeightedCapacity at the same time. You can specify N instance types by using the Extended Configurations feature. Valid values of N: 1 to 10.</p>
             * <blockquote>
             * <p>This parameter takes effect only if you specify LaunchTemplateId.</p>
             * </blockquote>
             * <p>You can specify an instance type that is available for purchase as the value of InstanceType.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c5.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The number of randomly generated IPv6 addresses that you want to allocate to the elastic network interface (ENI).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ipv6AddressCount(Integer ipv6AddressCount) {
                this.ipv6AddressCount = ipv6AddressCount;
                return this;
            }

            /**
             * NetworkInterfaceTrafficMode.
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * <p>The IDs of the security groups with which you want to associate the ECS instances that are created by using the scaling configuration. For more information, see the &quot;Security group limits&quot; section of the &quot;<a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>&quot; topic.</p>
             * <blockquote>
             * <p>If you specify SecurityGroupId, you cannot specify SecurityGroupIds.</p>
             * </blockquote>
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            public NetworkInterfaces build() {
                return new NetworkInterfaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingConfigurationRequest</p>
     */
    public static class SecurityOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfidentialComputingMode")
        private String confidentialComputingMode;

        private SecurityOptions(Builder builder) {
            this.confidentialComputingMode = builder.confidentialComputingMode;
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

        public static final class Builder {
            private String confidentialComputingMode; 

            /**
             * <p>The confidential computing mode. Valid values:</p>
             * <ul>
             * <li>Enclave: An enclave-based confidential computing environment is built on the instance. For more information, see <a href="https://help.aliyun.com/document_detail/203433.html">Build a confidential computing environment by using Enclave</a>.</li>
             * <li>TDX: A Trust Domain Extensions (TDX) confidential computing environment is built on the instance. For more information, see <a href="https://help.aliyun.com/document_detail/479090.html">Build a TDX confidential computing environment</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TDX</p>
             */
            public Builder confidentialComputingMode(String confidentialComputingMode) {
                this.confidentialComputingMode = confidentialComputingMode;
                return this;
            }

            public SecurityOptions build() {
                return new SecurityOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingConfigurationRequest</p>
     */
    public static class SpotPriceLimits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("PriceLimit")
        private Float priceLimit;

        private SpotPriceLimits(Builder builder) {
            this.instanceType = builder.instanceType;
            this.priceLimit = builder.priceLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotPriceLimits create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return priceLimit
         */
        public Float getPriceLimit() {
            return this.priceLimit;
        }

        public static final class Builder {
            private String instanceType; 
            private Float priceLimit; 

            /**
             * <p>The instance type of the preemptible instance. This parameter takes effect only if you set SpotStrategy to SpotWithPriceLimit.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The price limit of the preemptible instance. This parameter takes effect only if you set SpotStrategy to SpotWithPriceLimit.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder priceLimit(Float priceLimit) {
                this.priceLimit = priceLimit;
                return this;
            }

            public SpotPriceLimits build() {
                return new SpotPriceLimits(this);
            } 

        } 

    }
}
