// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScalingConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateScalingConfigurationRequest</p>
 */
public class CreateScalingConfigurationRequest extends Request {
    @Query
    @NameInMap("ImageOptions")
    private ImageOptions imageOptions;

    @Query
    @NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @Query
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Query
    @NameInMap("Affinity")
    private String affinity;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Cpu")
    private Integer cpu;

    @Query
    @NameInMap("CreditSpecification")
    private String creditSpecification;

    @Query
    @NameInMap("CustomPriorities")
    private java.util.List < CustomPriorities> customPriorities;

    @Query
    @NameInMap("DataDisks")
    private java.util.List < DataDisks> dataDisks;

    @Query
    @NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @Query
    @NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @Query
    @NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("HpcClusterId")
    private String hpcClusterId;

    @Query
    @NameInMap("ImageFamily")
    private String imageFamily;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("InstanceDescription")
    private String instanceDescription;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("InstancePatternInfos")
    private java.util.List < InstancePatternInfos> instancePatternInfos;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InstanceTypeOverrides")
    private java.util.List < InstanceTypeOverrides> instanceTypeOverrides;

    @Query
    @NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

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
    @NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("LoadBalancerWeight")
    private Integer loadBalancerWeight;

    @Query
    @NameInMap("Memory")
    private Integer memory;

    @Query
    @NameInMap("NetworkInterfaces")
    private java.util.List < NetworkInterfaces> networkInterfaces;

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
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingConfigurationName")
    private String scalingConfigurationName;

    @Query
    @NameInMap("ScalingGroupId")
    @Validation(required = true)
    private String scalingGroupId;

    @Query
    @NameInMap("SchedulerOptions")
    private java.util.Map < String, ? > schedulerOptions;

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
    private Integer spotDuration;

    @Query
    @NameInMap("SpotInterruptionBehavior")
    private String spotInterruptionBehavior;

    @Query
    @NameInMap("SpotPriceLimits")
    private java.util.List < SpotPriceLimits> spotPriceLimits;

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
    @NameInMap("SystemDiskCategories")
    private java.util.List < String > systemDiskCategories;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("Tenancy")
    private String tenancy;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("ZoneId")
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
        this.dedicatedHostId = builder.dedicatedHostId;
        this.deletionProtection = builder.deletionProtection;
        this.deploymentSetId = builder.deploymentSetId;
        this.hostName = builder.hostName;
        this.hpcClusterId = builder.hpcClusterId;
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
        private String dedicatedHostId; 
        private Boolean deletionProtection; 
        private String deploymentSetId; 
        private String hostName; 
        private String hpcClusterId; 
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
            this.dedicatedHostId = request.dedicatedHostId;
            this.deletionProtection = request.deletionProtection;
            this.deploymentSetId = request.deploymentSetId;
            this.hostName = request.hostName;
            this.hpcClusterId = request.hpcClusterId;
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
         * Specifies whether to associate an ECS instance on a dedicated host with the dedicated host. Valid values:
         * <p>
         * 
         * *   default: does not associate the ECS instance with the dedicated host. If you start an ECS instance that was stopped in economical mode and the original dedicated host has insufficient resources, the ECS instance is automatically deployed to another dedicated host in the automatic deployment resource pool.
         * *   host: associates the ECS instance with the dedicated host. If you start an ECS instance that was stopped in economical mode, the instance remains on the original dedicated host. If the original dedicated host has insufficient resources, the ECS instance fails to start.
         * 
         * Default value: default
         */
        public Builder affinity(String affinity) {
            this.putQueryParameter("Affinity", affinity);
            this.affinity = affinity;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see the "[How to ensure the idempotence of a request](~~25693~~)" topic.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The number of vCPUs.
         * <p>
         * 
         * You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set CPU to 2 and Memory to 16 to specify instance types that have 2 vCPUs and 16 GiB of memory. If you specify Cpu and Memory, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances by using the lowest-priced instance type.
         * 
         * > You can specify Cpu and Memory to determine the range of instance types only if you set Scaling Policy to Cost Optimization Policy and you do not specify instance types in the scaling configuration.
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * The performance mode of the burstable instance. Valid values:
         * <p>
         * 
         * *   Standard: standard mode
         * *   Unlimited: unlimited mode
         * 
         * For more information, see the "Performance modes" section in the "[Overview](~~59977~~)" topic.
         */
        public Builder creditSpecification(String creditSpecification) {
            this.putQueryParameter("CreditSpecification", creditSpecification);
            this.creditSpecification = creditSpecification;
            return this;
        }

        /**
         * The priority of the custom ECS instance type + vSwitch combination.
         * <p>
         * 
         * >  This parameter takes effect only when Scaling Policy of the scaling group is set to Priority Policy.
         * 
         * If Auto Scaling cannot create ECS instances by using the custom ECS instance type + vSwitch combination of the highest priority, Auto Scaling creates ECS instances by using the custom ECS instance type + vSwitch combination of the next highest priority.
         * 
         * >  If you specify the priorities of only partial custom ECS instance type + vSwitch combinations, Auto Scaling preferentially creates ECS instances by using the custom combinations that have specified priorities. If the custom combinations that have specified priorities do not provide sufficient resources, Auto Scaling creates ECS instances by using the custom combinations that do not have specified priorities based on the specified orders of vSwitches and instance types.
         * 
         * *   Example: the specified order of vSwitches for your scaling group is vsw1 and vsw2 and the specified order of instance types in your scaling configuration is type1 and type 2. In addition, you use CustomPriorities to specify \["vsw2+type2", "vsw1+type2"]. In this example, the vsw2+type2 combination has the highest priority and the vsw2+type1 combination has the lowest priority. The vsw1+type2 combination has a higher priority than the vsw1+type1 combination.
         */
        public Builder customPriorities(java.util.List < CustomPriorities> customPriorities) {
            this.putQueryParameter("CustomPriorities", customPriorities);
            this.customPriorities = customPriorities;
            return this;
        }

        /**
         * The data disks.
         */
        public Builder dataDisks(java.util.List < DataDisks> dataDisks) {
            this.putQueryParameter("DataDisks", dataDisks);
            this.dataDisks = dataDisks;
            return this;
        }

        /**
         * The ID of the dedicated host on which you want to create an ECS instance. You cannot create preemptible instances on dedicated hosts. If you specify DedicatedHostId, SpotStrategy and SpotPriceLimit are ignored.
         * <p>
         * 
         * You can call the DescribeDedicatedHosts operation to query dedicated host IDs.
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
         * The ID of the deployment set of the ECS instances that are created by using the scaling configuration.
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * The hostname of the ECS instance. The hostname cannot start or end with a period (.) or a hyphen (-). The hostname cannot contain consecutive periods (.) or hyphens (-). Naming conventions for different types of instances:
         * <p>
         * 
         * *   Windows instances: The hostname must be 2 to 15 characters in length and can contain letters, digits, and hyphens (-). The hostname cannot contain periods (.) or contain only digits.
         * *   Other instances, such as Linux instances: The hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * The ID of the Elastic High Performance Computing (E-HPC) cluster to which the ECS instances that are created by using the scaling configuration belong.
         */
        public Builder hpcClusterId(String hpcClusterId) {
            this.putQueryParameter("HpcClusterId", hpcClusterId);
            this.hpcClusterId = hpcClusterId;
            return this;
        }

        /**
         * The name of the image family. If you specify this parameter, the most recent custom images that are available in the specified image family are returned. You can use the images to create instances. If you specify ImageId, you cannot specify ImageFamily.
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * The ID of the image that Auto Scaling uses to automatically create ECS instances.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The name of the image. Each image name must be unique in a region. If you specify ImageId, ImageName is ignored.
         * <p>
         * 
         * You cannot use ImageName to specify images that are purchased from Alibaba Cloud Marketplace.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The description of the ECS instance. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with `http://` or `https://`.
         */
        public Builder instanceDescription(String instanceDescription) {
            this.putQueryParameter("InstanceDescription", instanceDescription);
            this.instanceDescription = instanceDescription;
            return this;
        }

        /**
         * The name of the ECS instance that Auto Scaling creates based on the scaling configuration.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Details of the intelligent configuration settings that determine the range of instance types that meet the specified criteria.
         */
        public Builder instancePatternInfos(java.util.List < InstancePatternInfos> instancePatternInfos) {
            this.putQueryParameter("InstancePatternInfos", instancePatternInfos);
            this.instancePatternInfos = instancePatternInfos;
            return this;
        }

        /**
         * The instance type of the ECS instance. For more information, see the [Instance families](~~25378~~) topic.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The instance types.
         */
        public Builder instanceTypeOverrides(java.util.List < InstanceTypeOverrides> instanceTypeOverrides) {
            this.putQueryParameter("InstanceTypeOverrides", instanceTypeOverrides);
            this.instanceTypeOverrides = instanceTypeOverrides;
            return this;
        }

        /**
         * The instance types. If you specify InstanceTypes, InstanceType is ignored.
         * <p>
         * 
         * Auto Scaling creates instances based on the priorities of the instance types. If Auto Scaling cannot create instances by using the instance type that has the highest priority, Auto Scaling creates instances by using the instance type that has the next highest priority.
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * The metering method for network usage. Valid values:
         * <p>
         * 
         * *   PayByBandwidth: You are charged for the maximum available bandwidth that is specified by InternetMaxBandwidthOut.
         * *   PayByTraffic: You are charged based on the amount of transferred data. InternetMaxBandwidthOut specifies only the maximum available bandwidth.
         * 
         * For the classic network, the default value is PayByBandwidth. For VPCs, the default value is PayByTraffic.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The maximum inbound public bandwidth. Unit: Mbit/s. Valid values: 1 to 200.
         * <p>
         * 
         * Default value: 200 This parameter is not used for billing because inbound traffic to instances is free of charge.
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        /**
         * The maximum outbound public bandwidth. Unit: Mbit/s. Valid values:
         * <p>
         * 
         * *   Valid values if you set InternetChargeType to PayByBandwidth: 0 to 100. If you leave this parameter empty, this parameter is automatically set to 0.
         * *   Valid values if you set InternetChargeType to PayByTraffic: 0 to 100. If you leave this parameter empty, an error is returned.
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * Specifies whether to create an I/O optimized instance. Valid values:
         * <p>
         * 
         * none: does not create an I/O optimized instance. optimized: creates an I/O optimized instance.
         * 
         * For instances of retired instance types, the default value is none. For instances of other instance types, the default value is optimized.
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * The number of randomly generated IPv6 addresses that you want to allocate to the elastic network interface (ENI).
         */
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * The name of the key pair that you want to use to log on to an ECS instance.
         * <p>
         * 
         * *   Windows instances do not support this parameter.
         * *   By default, the username and password authentication method is disabled for Linux instances.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The weight of an ECS instance as a backend server. Valid values: 1 to 100.
         * <p>
         * 
         * Default value: 50
         */
        public Builder loadBalancerWeight(Integer loadBalancerWeight) {
            this.putQueryParameter("LoadBalancerWeight", loadBalancerWeight);
            this.loadBalancerWeight = loadBalancerWeight;
            return this;
        }

        /**
         * The memory size. Unit: GiB.
         * <p>
         * 
         * You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set Cpu to 2 and Memory to 16 to specify instance types that have 2 vCPUs and 16 GiB of memory. If you specify Cpu and Memory, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances by using the lowest-priced instance type.
         * 
         * > You can specify Cpu and Memory to determine the range of instance types only if you set Scaling Policy to Cost Optimization Policy and you do not specify instance types in the scaling configuration.
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
         * The password that you want to use to log on to an ECS instance. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:
         * <p>
         * 
         * `` `() ~!@#$%^&*-_+=\|{}[]:;\"<>,.?/ ``
         * 
         * The password of a Windows instance cannot start with a forward slash (/).
         * 
         * > For security reasons, we recommend that you use HTTPS to send requests if you specify Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Specifies whether to use the password that is preconfigured in the image. Before you use this parameter, make sure that a password is configured in the image. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder passwordInherit(Boolean passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
            return this;
        }

        /**
         * The name of the RAM role that you attach to the ECS instance. The name is provided and maintained by Resource Access Management (RAM). You can call the ListRoles operation to query the available RAM roles.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * The ID of the resource group to which the ECS instances that are created by using the scaling configuration belong.
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
         * The name of the scaling configuration. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (\_), hyphens (-), and periods (.). The name must start with a letter or a digit.
         * <p>
         * 
         * The name of the scaling configuration must be unique in a region. If you do not specify this parameter, the scaling configuration ID is used.
         */
        public Builder scalingConfigurationName(String scalingConfigurationName) {
            this.putQueryParameter("ScalingConfigurationName", scalingConfigurationName);
            this.scalingConfigurationName = scalingConfigurationName;
            return this;
        }

        /**
         * The ID of the scaling group in which you want to create a scaling configuration.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * The scheduler options.
         */
        public Builder schedulerOptions(java.util.Map < String, ? > schedulerOptions) {
            String schedulerOptionsShrink = shrink(schedulerOptions, "SchedulerOptions", "json");
            this.putQueryParameter("SchedulerOptions", schedulerOptionsShrink);
            this.schedulerOptions = schedulerOptions;
            return this;
        }

        /**
         * Specifies whether to enable security hardening. Valid values:
         * <p>
         * 
         * *   Active: enables security hardening. This value is applicable only to public images.
         * *   Deactive: disables security hardening. This value is applicable to all image types.
         */
        public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
            this.putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }

        /**
         * The ID of the security group with which ECS instances are associated. ECS instances that are associated with the same security group can access each other.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The IDs of the security groups with which you want to associate the ECS instances that are created by using the scaling configuration. For more information, see the "Security group limits" section of the "[Limits](~~25412~~)" topic.
         * <p>
         * 
         * > If you specify SecurityGroupId, you cannot specify SecurityGroupIds.
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * The retention period of the preemptible instance. Unit: hours. Valid values: 0, 1, 2, 3, 4, 5, and 6.
         * <p>
         * 
         * *   The following retention periods are available in invitational preview: 2, 3, 4, 5, and 6 hours. If you want to set this parameter to one of these values, submit a ticket.
         * *   If you set this parameter to 0, no protection period is specified for the preemptible instance.
         * 
         * Default value: 1
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * The interruption mode of the preemptible instance. Set the value to Terminate. The value specifies that the preemptible instance is to be released.
         */
        public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
            this.putQueryParameter("SpotInterruptionBehavior", spotInterruptionBehavior);
            this.spotInterruptionBehavior = spotInterruptionBehavior;
            return this;
        }

        /**
         * The billing information of the preemptible instances.
         */
        public Builder spotPriceLimits(java.util.List < SpotPriceLimits> spotPriceLimits) {
            this.putQueryParameter("SpotPriceLimits", spotPriceLimits);
            this.spotPriceLimits = spotPriceLimits;
            return this;
        }

        /**
         * The preemption policy that you want to apply to pay-as-you-go and preemptible instances. Valid values:
         * <p>
         * 
         * *   NoSpot: The instance is created as a pay-as-you-go instance.
         * *   SpotWithPriceLimit: The instance is a preemptible instance that has a user-defined maximum hourly price.
         * *   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.
         * 
         * Default value: NoSpot
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
         * The categories of the system disks. If Auto Scaling cannot create instances by using the disk category that has the highest priority, Auto Scaling creates instances by using the disk category that has the next highest priority. Valid values:
         * <p>
         * 
         * *   cloud: basic disk
         * *   cloud_efficiency: ultra disk
         * *   cloud_ssd: standard SSD
         * *   cloud_essd: ESSD
         * 
         * > If you specify SystemDiskCategories, you cannot specify `SystemDisk.Category`.
         */
        public Builder systemDiskCategories(java.util.List < String > systemDiskCategories) {
            this.putQueryParameter("SystemDiskCategories", systemDiskCategories);
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }

        /**
         * The tags of the ECS instance. Tags must be specified as key-value pairs. You can specify up to 20 tags. When you specify tag keys and tag values, take note of the following items:
         * <p>
         * 
         * *   A tag key can be up to 64 characters in length. The key cannot start with acs: or aliyun and cannot contain `http://` or `https://`. You cannot specify an empty string as a tag key.
         * *   A tag value can be up to 128 characters in length. The value cannot start with acs: or aliyun and cannot contain `http://` or `https://`. You can specify an empty string as a tag value.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * Specifies whether to create an ECS instance on a dedicated host. Valid values:
         * <p>
         * 
         * *   default: does not create an ECS instance on a dedicated host.
         * *   host: creates an ECS instance on a dedicated host. If you do not specify DedicatedHostId, Alibaba Cloud selects a dedicated host for the ECS instance.
         * 
         * Default value: default
         */
        public Builder tenancy(String tenancy) {
            this.putQueryParameter("Tenancy", tenancy);
            this.tenancy = tenancy;
            return this;
        }

        /**
         * The user data of the ECS instance. The data must be encoded in Base64. The maximum size of the data before encoding is 16 KB.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The zone ID of the ECS instance.
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
             * For more information about whether an ECS instance uses the ecs-user user user to log on to an ECS instance, see [Manage the login name of an ECS instance](~~388447~~). Value range:
             * <p>
             * 
             * - true: Yes.
             * - false: No.
             * 
             * Default value: false.
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
             * The ID of the private pool. The ID of a private pool is the same as the ID of the elasticity assurance or capacity reservation for which the private pool is generated.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The type of the private pool that you want to use to start ECS instances. A private pool is generated when an elasticity assurance or a capacity reservation takes effect. You can select a private pool to create ECS instances. Valid values:
             * <p>
             * 
             * *   Open: open private pool. Auto Scaling selects a matching open private pool to start instances. If no matching open private pools are found, Auto Scaling uses the resources in the public pool to start instances. In this case, you do not need to specify PrivatePoolOptions.Id.
             * *   Target: specified private pool. Auto Scaling uses the resources in the specified private pool to start ECS instances. If the specified private pool is unavailable, Auto Scaling cannot start ECS instances. If you set this parameter to Target, you must specify PrivatePoolOptions.Id.
             * *   None: no private pool. Auto Scaling does not use the resources in private pools to start ECS instances.
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
    public static class SystemDisk extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @NameInMap("Category")
        private String category;

        @NameInMap("Description")
        private String description;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("EncryptAlgorithm")
        private String encryptAlgorithm;

        @NameInMap("Encrypted")
        private Boolean encrypted;

        @NameInMap("KMSKeyId")
        private String KMSKeyId;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @NameInMap("Size")
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
             * The ID of the automatic snapshot policy that you want to apply to the system disk.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
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
             * The category of the system disk. Valid values:
             * <p>
             * 
             * *   cloud: basic disk
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             * *   ephemeral_ssd: local SSD
             * *   cloud_essd: enhanced SSD (ESSD)
             * *   cloud_auto: ESSD AutoPL disk
             * 
             * If you specify SystemDisk.Category, you cannot specify `SystemDiskCategories`. If you do not specify SystemDisk.Category or `SystemDiskCategories`, the default value of SystemDisk.Category is used.
             * 
             * *   For I/O optimized instances, the default value is cloud_efficiency.
             * *   For non-I/O optimized instances, the default value is cloud.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The description of the system disk. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with `http://` or `https://`.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the system disk. The name must be 2 to 128 characters in length. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * The encryption algorithm that you want to use to encrypt the system disk. Valid values:
             * <p>
             * 
             * *   AES-256
             * *   SM4-128
             * 
             * Default value: AES-256
             */
            public Builder encryptAlgorithm(String encryptAlgorithm) {
                this.encryptAlgorithm = encryptAlgorithm;
                return this;
            }

            /**
             * Specifies whether to encrypt the system disk. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: false
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The ID of the KMS key that you want to use to encrypt the system disk.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * The performance level (PL) of the system disk that is an enhanced SSD (ESSD). Valid values:
             * <p>
             * 
             * *   PL0: An ESSD can provide up to 10,000 random read/write IOPS.
             * *   PL1: An ESSD can provide up to 50,000 random read/write IOPS.
             * *   PL2: An ESSD can provide up to 100,000 random read/write IOPS.
             * *   PL3: An ESSD can provide up to 1,000,000 random read/write IOPS.
             * 
             * Default value: PL1.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The IOPS metric that is preconfigured for the system disk.
             * <p>
             * 
             * > IOPS measures the number of read and write operations that an EBS device can process per second.
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * The size of the system disk. Unit: GiB.
             * <p>
             * 
             * *   If you set SystemDisk.Category cloud: 20 to 500.
             * *   If you set SystemDisk.Category to cloud_efficiency: 20 to 500.
             * *   If you set SystemDisk.Category to cloud_ssd: 20 to 500.
             * *   If you set SystemDisk.Category to cloud_essd: 20 to 500.
             * *   If you set SystemDisk.Category to cloud_essd: 20 to 500.
             * 
             * The value of SystemDisk.Size must be greater than or equal to the value of max{20, ImageSize}.
             * 
             * Default value: 40 or the size of the image, whichever is greater.
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
    public static class CustomPriorities extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("VswitchId")
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
             * The ECS instance type.
             * <p>
             * 
             * >  The ECS instance type must be included in the instance types specified in the scaling configuration.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The vSwitch ID.
             * <p>
             * 
             * >  The vSwitch must be included in the vSwitch list of the scaling group.
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
    public static class DataDisks extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @NameInMap("Categories")
        private java.util.List < String > categories;

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
             * The ID of the automatic snapshot policy that you want to apply to the data disk.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
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
             * The categories of the data disks. If Auto Scaling cannot create instances by using the disk category that has the highest priority, Auto Scaling creates instances by using the disk category that has the next highest priority. Valid values:
             * <p>
             * 
             * *   cloud: basic disk. For a basic disk that is created together with the instance, DeleteWithInstance is set to true.
             * *   cloud_efficiency: ultra disk.
             * *   cloud_ssd: standard SSD.
             * *   cloud_essd: ESSD.
             * 
             * > If you specify Categories, you cannot specify `DataDisks.Category`.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            /**
             * The category of the data disk. Valid values:
             * <p>
             * 
             * *   cloud: basic disk
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             * *   cloud_essd: ESSD
             * *   ephemeral_ssd: local SSD
             * *   cloud_auto: ESSD AutoPL disk
             * 
             * If you specify this parameter, you cannot specify Categories. If you do not specify Category or Categories, the default value of Category is used.
             * 
             * *   For I/O optimized instances, the default value is cloud_efficiency.
             * *   For non-I/O optimized instances, the default value is cloud.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Specifies whether to release the data disk when the instance to which the data disk is attached is released. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * This parameter is available only for independent disks whose value of Category is set to cloud, cloud_efficiency, cloud_ssd, or cloud_essd. If you specify this parameter for other disks, an error is reported.
             * 
             * Default value: true
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * The description of the data disk. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with `http://` or `https://`.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The mount target of the data disk. If you do not specify Device, a mount target is automatically assigned when Auto Scaling creates ECS instances. The names of mount targets range from /dev/xvdb to /dev/xvdz.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The name of the system disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * Specifies whether to encrypt the data disk. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: false
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The ID of the KMS key that you want to use to encrypt the data disk.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * The PL of the data disk that is an ESSD. Valid values:
             * <p>
             * 
             * *   PL0: An ESSD can provide up to 10,000 random read/write IOPS.
             * *   PL1: An ESSD can provide up to 50,000 random read/write IOPS.
             * *   PL2: An ESSD can provide up to 100,000 random read/write IOPS.
             * *   PL3: An ESSD can provide up to 1,000,000 random read/write IOPS.
             * 
             * > For more information about how to select ESSD PLs, see [ESSD](~~122389~~).
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The IOPS metric that is preconfigured for the data disk.
             * <p>
             * 
             * > IOPS measures the number of read and write operations that an EBS device can process per second.
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * The size of the data disk. Unit: GiB. Valid values:
             * <p>
             * 
             * *   If you set Categories to cloud: 5 to 2000.
             * *   If you set Categories to cloud_efficiency: 20 to 32768.
             * *   If you set Categories to cloud_essd: 20 to 32768.
             * *   If you set Categories to ephemeral_ssd: 5 to 800.
             * 
             * The size of the data disk must be greater than or equal to the size of the snapshot that is specified by SnapshotId.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The ID of the snapshot that you want to use to create data disks. If you specify this parameter, DataDisks.Size is ignored. The size of the data disk is the same as the size of the specified snapshot.
             * <p>
             * 
             * If you specify a snapshot that is created on or before July 15, 2013, the operation fails and the system returns InvalidSnapshot.TooOld.
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
    public static class InstancePatternInfos extends TeaModel {
        @NameInMap("Architectures")
        private java.util.List < String > architectures;

        @NameInMap("BurstablePerformance")
        private String burstablePerformance;

        @NameInMap("Cores")
        private Integer cores;

        @NameInMap("ExcludedInstanceTypes")
        private java.util.List < String > excludedInstanceTypes;

        @NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @NameInMap("MaxPrice")
        private Float maxPrice;

        @NameInMap("Memory")
        private Float memory;

        private InstancePatternInfos(Builder builder) {
            this.architectures = builder.architectures;
            this.burstablePerformance = builder.burstablePerformance;
            this.cores = builder.cores;
            this.excludedInstanceTypes = builder.excludedInstanceTypes;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.maxPrice = builder.maxPrice;
            this.memory = builder.memory;
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
         * @return excludedInstanceTypes
         */
        public java.util.List < String > getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        /**
         * @return instanceFamilyLevel
         */
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        /**
         * @return maxPrice
         */
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private java.util.List < String > architectures; 
            private String burstablePerformance; 
            private Integer cores; 
            private java.util.List < String > excludedInstanceTypes; 
            private String instanceFamilyLevel; 
            private Float maxPrice; 
            private Float memory; 

            /**
             * The architectures of the instance types. Valid values:
             * <p>
             * 
             * *   X86: x86 architecture.
             * *   Heterogeneous: heterogeneous architecture, such as GPUs and FPGAs.
             * *   BareMetal: ECS Bare Metal Instance architecture.
             * *   Arm: ARM architecture.
             * *   SuperComputeCluster: Super Computing Cluster architecture.
             * 
             * By default, all values are included.
             */
            public Builder architectures(java.util.List < String > architectures) {
                this.architectures = architectures;
                return this;
            }

            /**
             * Specifies whether to include burstable instance types. Valid values:
             * <p>
             * 
             * *   Exclude: does not include burstable instance types.
             * *   Include: includes burstable instance types.
             * *   Required: includes only burstable instance types.
             * 
             * Default value: Include
             */
            public Builder burstablePerformance(String burstablePerformance) {
                this.burstablePerformance = burstablePerformance;
                return this;
            }

            /**
             * The number of vCPUs that you want to allocate to an instance type in intelligent configuration mode. This parameter is used to filter the available instance types that meet the specified criteria. For more information, see the "[Instance families](~~25378~~)" topic.
             * <p>
             * 
             * Take note of the following items when you specify Cores:
             * 
             * *   InstancePatternInfos is available only for scaling groups that reside in VPCs.
             * *   If you specify InstancePatternInfos, you must specify Cores and Memory.
             * *   If you specify an instance type by using InstanceType or InstanceTypes, Auto Scaling preferentially uses the instance type that is specified by InstanceType or InstanceTypes for scale-outs. If the specified instance type does not have sufficient inventory, Auto Scaling creates instances by using the lowest-priced instance type that is specified by InstancePatternInfos.
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * The instance types that you want to exclude. You can use wildcard characters, such as asterisks (\*), to exclude an instance type or an instance family. Examples:
             * <p>
             * 
             * *   ecs.c6.large: excludes the ecs.c6.large instance type.
             * *   ecs.c6.\*: excludes the c6 instance family.
             */
            public Builder excludedInstanceTypes(java.util.List < String > excludedInstanceTypes) {
                this.excludedInstanceTypes = excludedInstanceTypes;
                return this;
            }

            /**
             * The level of the instance type, which is used to filter instance types that meet the specified criteria. This parameter takes effect only if you set `CostOptimization` to true. Valid values:
             * <p>
             * 
             * *   EntryLevel: entry level (shared instance type). Instance types of this level are the most cost-effective but may not provide stable computing performance in a consistent manner. Instance types of this level are suitable for business scenarios in which the CPU utilization is low. For more information, see the "[Shared instance families](~~108489~~)" topic.
             * *   EnterpriseLevel: enterprise level. Instance types of this level provide stable performance and dedicated resources and are suitable for business scenarios that require high stability. For more information, see the "[Instance families](~~25378~~)" topic.
             * *   CreditEntryLevel: credit entry level. This value is valid only for burstable instances. CPU credits are used to ensure computing performance. Instance types of this level are suitable for business scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see the "[Overview](~~59977~~)" topic of burstable instances.
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * The maximum hourly price of a pay-as-you-go or preemptible instance in intelligent configuration mode. This parameter is used to filter the available instance types that meet the specified criteria.
             * <p>
             * 
             * > If you set SpotStrategy to SpotWithPriceLimit, you must specify MaxPrice. In other cases, MaxPrice is optional.
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * The memory size that you want to allocate to an instance type in intelligent configuration mode. Unit: GiB. This parameter is used to filter the available instance types that meet the specified criteria.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            public InstancePatternInfos build() {
                return new InstancePatternInfos(this);
            } 

        } 

    }
    public static class InstanceTypeOverrides extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("WeightedCapacity")
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
             * Instance type N that you want to use to override the instance type that is specified in the launch template.
             * <p>
             * 
             * If you want to trigger scale-outs based on the weighted capacities of instances, specify InstanceType and WeightedCapacity at the same time. You can specify N instance types by using the Extended Configurations feature. Valid values of N: 1 to 10.
             * 
             * > This parameter takes effect only if you specify LaunchTemplateId.
             * 
             * You can specify an instance type that is available for purchase as the value of InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The weight of instance type N. If you want to trigger scale-outs based on the weighted capacities of instances, you must specify WeightedCapacity after you specify InstanceType.
             * <p>
             * 
             * The weight of an instance type specifies the capacity of an instance of the instance type in the scaling group. A higher weight specifies that a smaller number of instances of the specified instance type is required to meet the expected capacity requirement.
             * 
             * Performance metrics, such as the number of vCPUs and the memory size of each instance type, may vary. You can specify different weights for different instance types based on your business requirements.
             * 
             * Example:
             * 
             * *   Current capacity: 0
             * *   Expected capacity: 6
             * *   Capacity of ecs.c5.xlarge: 4
             * 
             * To meet the expected capacity requirement, Auto Scaling must create and add two ecs.c5.xlarge instances.
             * 
             * > The capacity of the scaling group cannot exceed the sum of the maximum number of instances that is specified by MaxSize and the maximum weight of the instance types.
             * 
             * Valid values of WeightedCapacity: 1 to 500.
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
    public static class NetworkInterfaces extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ipv6AddressCount")
        private Integer ipv6AddressCount;

        @NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @NameInMap("SecurityGroupIds")
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
             * Instance type N that you want to use to override the instance type that is specified in the launch template.
             * <p>
             * 
             * If you want to trigger scale-outs based on the weighted capacities of instances, specify InstanceType and WeightedCapacity at the same time. You can specify N instance types by using the Extended Configurations feature. Valid values of N: 1 to 10.
             * 
             * > This parameter takes effect only if you specify LaunchTemplateId.
             * 
             * You can specify an instance type that is available for purchase as the value of InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The number of randomly generated IPv6 addresses that you want to allocate to the elastic network interface (ENI).
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
             * The IDs of the security groups with which you want to associate the ECS instances that are created by using the scaling configuration. For more information, see the "Security group limits" section of the "[Limits](~~25412~~)" topic.
             * <p>
             * 
             * > If you specify SecurityGroupId, you cannot specify SecurityGroupIds.
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
    public static class SpotPriceLimits extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("PriceLimit")
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
             * The instance type of the preemptible instance. This parameter takes effect only if you set SpotStrategy to SpotWithPriceLimit.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The price limit of the preemptible instance. This parameter takes effect only if you set SpotStrategy to SpotWithPriceLimit.
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
