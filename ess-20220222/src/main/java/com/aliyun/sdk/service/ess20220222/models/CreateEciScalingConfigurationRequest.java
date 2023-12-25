// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEciScalingConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateEciScalingConfigurationRequest</p>
 */
public class CreateEciScalingConfigurationRequest extends Request {
    @Query
    @NameInMap("AcrRegistryInfos")
    private java.util.List < AcrRegistryInfos> acrRegistryInfos;

    @Query
    @NameInMap("ActiveDeadlineSeconds")
    private Long activeDeadlineSeconds;

    @Query
    @NameInMap("AutoCreateEip")
    private Boolean autoCreateEip;

    @Query
    @NameInMap("AutoMatchImageCache")
    private Boolean autoMatchImageCache;

    @Query
    @NameInMap("ContainerGroupName")
    private String containerGroupName;

    @Query
    @NameInMap("Containers")
    private java.util.List < Containers> containers;

    @Query
    @NameInMap("CostOptimization")
    private Boolean costOptimization;

    @Query
    @NameInMap("Cpu")
    private Float cpu;

    @Query
    @NameInMap("CpuOptionsCore")
    @Validation(maximum = 1000)
    private Integer cpuOptionsCore;

    @Query
    @NameInMap("CpuOptionsThreadsPerCore")
    private Integer cpuOptionsThreadsPerCore;

    @Query
    @NameInMap("DataCacheBucket")
    private String dataCacheBucket;

    @Query
    @NameInMap("DataCacheBurstingEnabled")
    private Boolean dataCacheBurstingEnabled;

    @Query
    @NameInMap("DataCachePL")
    private String dataCachePL;

    @Query
    @NameInMap("DataCacheProvisionedIops")
    private Integer dataCacheProvisionedIops;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DnsConfigNameServers")
    private java.util.List < String > dnsConfigNameServers;

    @Query
    @NameInMap("DnsConfigOptions")
    private java.util.List < DnsConfigOptions> dnsConfigOptions;

    @Query
    @NameInMap("DnsConfigSearchs")
    private java.util.List < String > dnsConfigSearchs;

    @Query
    @NameInMap("DnsPolicy")
    private String dnsPolicy;

    @Query
    @NameInMap("EgressBandwidth")
    @Validation()
    private Long egressBandwidth;

    @Query
    @NameInMap("EipBandwidth")
    @Validation(maximum = 1000000)
    private Integer eipBandwidth;

    @Query
    @NameInMap("EnableSls")
    private Boolean enableSls;

    @Query
    @NameInMap("EphemeralStorage")
    @Validation(maximum = 5000)
    private Integer ephemeralStorage;

    @Query
    @NameInMap("HostAliases")
    private java.util.List < HostAliases> hostAliases;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("ImageRegistryCredentials")
    private java.util.List < ImageRegistryCredentials> imageRegistryCredentials;

    @Query
    @NameInMap("ImageSnapshotId")
    private String imageSnapshotId;

    @Query
    @NameInMap("IngressBandwidth")
    @Validation()
    private Long ingressBandwidth;

    @Query
    @NameInMap("InitContainers")
    private java.util.List < InitContainers> initContainers;

    @Query
    @NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @Query
    @NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @Query
    @NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @Query
    @NameInMap("LoadBalancerWeight")
    private Integer loadBalancerWeight;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("NtpServers")
    private java.util.List < String > ntpServers;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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
    @NameInMap("RestartPolicy")
    private String restartPolicy;

    @Query
    @NameInMap("ScalingConfigurationName")
    private String scalingConfigurationName;

    @Query
    @NameInMap("ScalingGroupId")
    @Validation(required = true)
    private String scalingGroupId;

    @Query
    @NameInMap("SecurityContextSysctls")
    private java.util.List < SecurityContextSysctls> securityContextSysctls;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @Query
    @NameInMap("TerminationGracePeriodSeconds")
    private Long terminationGracePeriodSeconds;

    @Query
    @NameInMap("Volumes")
    private java.util.List < Volumes> volumes;

    private CreateEciScalingConfigurationRequest(Builder builder) {
        super(builder);
        this.acrRegistryInfos = builder.acrRegistryInfos;
        this.activeDeadlineSeconds = builder.activeDeadlineSeconds;
        this.autoCreateEip = builder.autoCreateEip;
        this.autoMatchImageCache = builder.autoMatchImageCache;
        this.containerGroupName = builder.containerGroupName;
        this.containers = builder.containers;
        this.costOptimization = builder.costOptimization;
        this.cpu = builder.cpu;
        this.cpuOptionsCore = builder.cpuOptionsCore;
        this.cpuOptionsThreadsPerCore = builder.cpuOptionsThreadsPerCore;
        this.dataCacheBucket = builder.dataCacheBucket;
        this.dataCacheBurstingEnabled = builder.dataCacheBurstingEnabled;
        this.dataCachePL = builder.dataCachePL;
        this.dataCacheProvisionedIops = builder.dataCacheProvisionedIops;
        this.description = builder.description;
        this.dnsConfigNameServers = builder.dnsConfigNameServers;
        this.dnsConfigOptions = builder.dnsConfigOptions;
        this.dnsConfigSearchs = builder.dnsConfigSearchs;
        this.dnsPolicy = builder.dnsPolicy;
        this.egressBandwidth = builder.egressBandwidth;
        this.eipBandwidth = builder.eipBandwidth;
        this.enableSls = builder.enableSls;
        this.ephemeralStorage = builder.ephemeralStorage;
        this.hostAliases = builder.hostAliases;
        this.hostName = builder.hostName;
        this.imageRegistryCredentials = builder.imageRegistryCredentials;
        this.imageSnapshotId = builder.imageSnapshotId;
        this.ingressBandwidth = builder.ingressBandwidth;
        this.initContainers = builder.initContainers;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.instanceTypes = builder.instanceTypes;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.loadBalancerWeight = builder.loadBalancerWeight;
        this.memory = builder.memory;
        this.ntpServers = builder.ntpServers;
        this.ownerId = builder.ownerId;
        this.ramRoleName = builder.ramRoleName;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.restartPolicy = builder.restartPolicy;
        this.scalingConfigurationName = builder.scalingConfigurationName;
        this.scalingGroupId = builder.scalingGroupId;
        this.securityContextSysctls = builder.securityContextSysctls;
        this.securityGroupId = builder.securityGroupId;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.spotStrategy = builder.spotStrategy;
        this.tags = builder.tags;
        this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
        this.volumes = builder.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEciScalingConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acrRegistryInfos
     */
    public java.util.List < AcrRegistryInfos> getAcrRegistryInfos() {
        return this.acrRegistryInfos;
    }

    /**
     * @return activeDeadlineSeconds
     */
    public Long getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    /**
     * @return autoCreateEip
     */
    public Boolean getAutoCreateEip() {
        return this.autoCreateEip;
    }

    /**
     * @return autoMatchImageCache
     */
    public Boolean getAutoMatchImageCache() {
        return this.autoMatchImageCache;
    }

    /**
     * @return containerGroupName
     */
    public String getContainerGroupName() {
        return this.containerGroupName;
    }

    /**
     * @return containers
     */
    public java.util.List < Containers> getContainers() {
        return this.containers;
    }

    /**
     * @return costOptimization
     */
    public Boolean getCostOptimization() {
        return this.costOptimization;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return cpuOptionsCore
     */
    public Integer getCpuOptionsCore() {
        return this.cpuOptionsCore;
    }

    /**
     * @return cpuOptionsThreadsPerCore
     */
    public Integer getCpuOptionsThreadsPerCore() {
        return this.cpuOptionsThreadsPerCore;
    }

    /**
     * @return dataCacheBucket
     */
    public String getDataCacheBucket() {
        return this.dataCacheBucket;
    }

    /**
     * @return dataCacheBurstingEnabled
     */
    public Boolean getDataCacheBurstingEnabled() {
        return this.dataCacheBurstingEnabled;
    }

    /**
     * @return dataCachePL
     */
    public String getDataCachePL() {
        return this.dataCachePL;
    }

    /**
     * @return dataCacheProvisionedIops
     */
    public Integer getDataCacheProvisionedIops() {
        return this.dataCacheProvisionedIops;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dnsConfigNameServers
     */
    public java.util.List < String > getDnsConfigNameServers() {
        return this.dnsConfigNameServers;
    }

    /**
     * @return dnsConfigOptions
     */
    public java.util.List < DnsConfigOptions> getDnsConfigOptions() {
        return this.dnsConfigOptions;
    }

    /**
     * @return dnsConfigSearchs
     */
    public java.util.List < String > getDnsConfigSearchs() {
        return this.dnsConfigSearchs;
    }

    /**
     * @return dnsPolicy
     */
    public String getDnsPolicy() {
        return this.dnsPolicy;
    }

    /**
     * @return egressBandwidth
     */
    public Long getEgressBandwidth() {
        return this.egressBandwidth;
    }

    /**
     * @return eipBandwidth
     */
    public Integer getEipBandwidth() {
        return this.eipBandwidth;
    }

    /**
     * @return enableSls
     */
    public Boolean getEnableSls() {
        return this.enableSls;
    }

    /**
     * @return ephemeralStorage
     */
    public Integer getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    /**
     * @return hostAliases
     */
    public java.util.List < HostAliases> getHostAliases() {
        return this.hostAliases;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return imageRegistryCredentials
     */
    public java.util.List < ImageRegistryCredentials> getImageRegistryCredentials() {
        return this.imageRegistryCredentials;
    }

    /**
     * @return imageSnapshotId
     */
    public String getImageSnapshotId() {
        return this.imageSnapshotId;
    }

    /**
     * @return ingressBandwidth
     */
    public Long getIngressBandwidth() {
        return this.ingressBandwidth;
    }

    /**
     * @return initContainers
     */
    public java.util.List < InitContainers> getInitContainers() {
        return this.initContainers;
    }

    /**
     * @return instanceFamilyLevel
     */
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List < String > getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return ipv6AddressCount
     */
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
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
    public Float getMemory() {
        return this.memory;
    }

    /**
     * @return ntpServers
     */
    public java.util.List < String > getNtpServers() {
        return this.ntpServers;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return restartPolicy
     */
    public String getRestartPolicy() {
        return this.restartPolicy;
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
     * @return securityContextSysctls
     */
    public java.util.List < SecurityContextSysctls> getSecurityContextSysctls() {
        return this.securityContextSysctls;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
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
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return terminationGracePeriodSeconds
     */
    public Long getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    /**
     * @return volumes
     */
    public java.util.List < Volumes> getVolumes() {
        return this.volumes;
    }

    public static final class Builder extends Request.Builder<CreateEciScalingConfigurationRequest, Builder> {
        private java.util.List < AcrRegistryInfos> acrRegistryInfos; 
        private Long activeDeadlineSeconds; 
        private Boolean autoCreateEip; 
        private Boolean autoMatchImageCache; 
        private String containerGroupName; 
        private java.util.List < Containers> containers; 
        private Boolean costOptimization; 
        private Float cpu; 
        private Integer cpuOptionsCore; 
        private Integer cpuOptionsThreadsPerCore; 
        private String dataCacheBucket; 
        private Boolean dataCacheBurstingEnabled; 
        private String dataCachePL; 
        private Integer dataCacheProvisionedIops; 
        private String description; 
        private java.util.List < String > dnsConfigNameServers; 
        private java.util.List < DnsConfigOptions> dnsConfigOptions; 
        private java.util.List < String > dnsConfigSearchs; 
        private String dnsPolicy; 
        private Long egressBandwidth; 
        private Integer eipBandwidth; 
        private Boolean enableSls; 
        private Integer ephemeralStorage; 
        private java.util.List < HostAliases> hostAliases; 
        private String hostName; 
        private java.util.List < ImageRegistryCredentials> imageRegistryCredentials; 
        private String imageSnapshotId; 
        private Long ingressBandwidth; 
        private java.util.List < InitContainers> initContainers; 
        private String instanceFamilyLevel; 
        private java.util.List < String > instanceTypes; 
        private Integer ipv6AddressCount; 
        private Integer loadBalancerWeight; 
        private Float memory; 
        private java.util.List < String > ntpServers; 
        private Long ownerId; 
        private String ramRoleName; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private String restartPolicy; 
        private String scalingConfigurationName; 
        private String scalingGroupId; 
        private java.util.List < SecurityContextSysctls> securityContextSysctls; 
        private String securityGroupId; 
        private Float spotPriceLimit; 
        private String spotStrategy; 
        private java.util.List < Tags> tags; 
        private Long terminationGracePeriodSeconds; 
        private java.util.List < Volumes> volumes; 

        private Builder() {
            super();
        } 

        private Builder(CreateEciScalingConfigurationRequest request) {
            super(request);
            this.acrRegistryInfos = request.acrRegistryInfos;
            this.activeDeadlineSeconds = request.activeDeadlineSeconds;
            this.autoCreateEip = request.autoCreateEip;
            this.autoMatchImageCache = request.autoMatchImageCache;
            this.containerGroupName = request.containerGroupName;
            this.containers = request.containers;
            this.costOptimization = request.costOptimization;
            this.cpu = request.cpu;
            this.cpuOptionsCore = request.cpuOptionsCore;
            this.cpuOptionsThreadsPerCore = request.cpuOptionsThreadsPerCore;
            this.dataCacheBucket = request.dataCacheBucket;
            this.dataCacheBurstingEnabled = request.dataCacheBurstingEnabled;
            this.dataCachePL = request.dataCachePL;
            this.dataCacheProvisionedIops = request.dataCacheProvisionedIops;
            this.description = request.description;
            this.dnsConfigNameServers = request.dnsConfigNameServers;
            this.dnsConfigOptions = request.dnsConfigOptions;
            this.dnsConfigSearchs = request.dnsConfigSearchs;
            this.dnsPolicy = request.dnsPolicy;
            this.egressBandwidth = request.egressBandwidth;
            this.eipBandwidth = request.eipBandwidth;
            this.enableSls = request.enableSls;
            this.ephemeralStorage = request.ephemeralStorage;
            this.hostAliases = request.hostAliases;
            this.hostName = request.hostName;
            this.imageRegistryCredentials = request.imageRegistryCredentials;
            this.imageSnapshotId = request.imageSnapshotId;
            this.ingressBandwidth = request.ingressBandwidth;
            this.initContainers = request.initContainers;
            this.instanceFamilyLevel = request.instanceFamilyLevel;
            this.instanceTypes = request.instanceTypes;
            this.ipv6AddressCount = request.ipv6AddressCount;
            this.loadBalancerWeight = request.loadBalancerWeight;
            this.memory = request.memory;
            this.ntpServers = request.ntpServers;
            this.ownerId = request.ownerId;
            this.ramRoleName = request.ramRoleName;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.restartPolicy = request.restartPolicy;
            this.scalingConfigurationName = request.scalingConfigurationName;
            this.scalingGroupId = request.scalingGroupId;
            this.securityContextSysctls = request.securityContextSysctls;
            this.securityGroupId = request.securityGroupId;
            this.spotPriceLimit = request.spotPriceLimit;
            this.spotStrategy = request.spotStrategy;
            this.tags = request.tags;
            this.terminationGracePeriodSeconds = request.terminationGracePeriodSeconds;
            this.volumes = request.volumes;
        } 

        /**
         * Information about the Container Registry Enterprise Edition instance.
         */
        public Builder acrRegistryInfos(java.util.List < AcrRegistryInfos> acrRegistryInfos) {
            this.putQueryParameter("AcrRegistryInfos", acrRegistryInfos);
            this.acrRegistryInfos = acrRegistryInfos;
            return this;
        }

        /**
         * The validity period. Unit: seconds.
         */
        public Builder activeDeadlineSeconds(Long activeDeadlineSeconds) {
            this.putQueryParameter("ActiveDeadlineSeconds", activeDeadlineSeconds);
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        /**
         * Specifies whether to automatically create an elastic IP address (EIP) and bind the EIP to the elastic container instance.
         */
        public Builder autoCreateEip(Boolean autoCreateEip) {
            this.putQueryParameter("AutoCreateEip", autoCreateEip);
            this.autoCreateEip = autoCreateEip;
            return this;
        }

        /**
         * Specifies whether to automatically match the image cache. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         */
        public Builder autoMatchImageCache(Boolean autoMatchImageCache) {
            this.putQueryParameter("AutoMatchImageCache", autoMatchImageCache);
            this.autoMatchImageCache = autoMatchImageCache;
            return this;
        }

        /**
         * The name of the elastic container instance.
         */
        public Builder containerGroupName(String containerGroupName) {
            this.putQueryParameter("ContainerGroupName", containerGroupName);
            this.containerGroupName = containerGroupName;
            return this;
        }

        /**
         * The containers in the elastic container instance.
         */
        public Builder containers(java.util.List < Containers> containers) {
            this.putQueryParameter("Containers", containers);
            this.containers = containers;
            return this;
        }

        /**
         * Specifies whether to enable the cost optimization feature. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder costOptimization(Boolean costOptimization) {
            this.putQueryParameter("CostOptimization", costOptimization);
            this.costOptimization = costOptimization;
            return this;
        }

        /**
         * The number of vCPUs of the elastic container instance.
         */
        public Builder cpu(Float cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * Number of physical CPU cores This parameter is not available for all instance types. For more information, see [Specify custom CPU options](~~197781~~).
         */
        public Builder cpuOptionsCore(Integer cpuOptionsCore) {
            this.putQueryParameter("CpuOptionsCore", cpuOptionsCore);
            this.cpuOptionsCore = cpuOptionsCore;
            return this;
        }

        /**
         * The number of threads per core. This parameter is not available for all instance types. A value of 1 indicates that Hyper-Threading is disabled. For more information, see [Specify custom CPU options](~~197781~~).
         */
        public Builder cpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
            this.putQueryParameter("CpuOptionsThreadsPerCore", cpuOptionsThreadsPerCore);
            this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
            return this;
        }

        /**
         * DataCacheBucket.
         */
        public Builder dataCacheBucket(String dataCacheBucket) {
            this.putQueryParameter("DataCacheBucket", dataCacheBucket);
            this.dataCacheBucket = dataCacheBucket;
            return this;
        }

        /**
         * DataCacheBurstingEnabled.
         */
        public Builder dataCacheBurstingEnabled(Boolean dataCacheBurstingEnabled) {
            this.putQueryParameter("DataCacheBurstingEnabled", dataCacheBurstingEnabled);
            this.dataCacheBurstingEnabled = dataCacheBurstingEnabled;
            return this;
        }

        /**
         * DataCachePL.
         */
        public Builder dataCachePL(String dataCachePL) {
            this.putQueryParameter("DataCachePL", dataCachePL);
            this.dataCachePL = dataCachePL;
            return this;
        }

        /**
         * DataCacheProvisionedIops.
         */
        public Builder dataCacheProvisionedIops(Integer dataCacheProvisionedIops) {
            this.putQueryParameter("DataCacheProvisionedIops", dataCacheProvisionedIops);
            this.dataCacheProvisionedIops = dataCacheProvisionedIops;
            return this;
        }

        /**
         * > This parameter is unavailable.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The IP addresses of the DNS servers.
         */
        public Builder dnsConfigNameServers(java.util.List < String > dnsConfigNameServers) {
            this.putQueryParameter("DnsConfigNameServers", dnsConfigNameServers);
            this.dnsConfigNameServers = dnsConfigNameServers;
            return this;
        }

        /**
         * The options. Each option is in the name-value pair format. The value in the name-value pair is optional.
         */
        public Builder dnsConfigOptions(java.util.List < DnsConfigOptions> dnsConfigOptions) {
            this.putQueryParameter("DnsConfigOptions", dnsConfigOptions);
            this.dnsConfigOptions = dnsConfigOptions;
            return this;
        }

        /**
         * The DNS lookup domains.
         */
        public Builder dnsConfigSearchs(java.util.List < String > dnsConfigSearchs) {
            this.putQueryParameter("DnsConfigSearchs", dnsConfigSearchs);
            this.dnsConfigSearchs = dnsConfigSearchs;
            return this;
        }

        /**
         * The Domain Name System (DNS) policy. Valid values:
         * <p>
         * 
         * *   None: uses the DNS that is set for the DnsConfig field.
         * *   Default: use the DNS that is set for the runtime environment.
         */
        public Builder dnsPolicy(String dnsPolicy) {
            this.putQueryParameter("DnsPolicy", dnsPolicy);
            this.dnsPolicy = dnsPolicy;
            return this;
        }

        /**
         * The maximum outbound bandwidth. Unit: bytes.
         */
        public Builder egressBandwidth(Long egressBandwidth) {
            this.putQueryParameter("EgressBandwidth", egressBandwidth);
            this.egressBandwidth = egressBandwidth;
            return this;
        }

        /**
         * The bandwidth of the EIP. Default value: 5 Mbit/s.
         */
        public Builder eipBandwidth(Integer eipBandwidth) {
            this.putQueryParameter("EipBandwidth", eipBandwidth);
            this.eipBandwidth = eipBandwidth;
            return this;
        }

        /**
         * > This parameter is unavailable.
         */
        public Builder enableSls(Boolean enableSls) {
            this.putQueryParameter("EnableSls", enableSls);
            this.enableSls = enableSls;
            return this;
        }

        /**
         * The size of the temporary storage space. By default, an ESSD of the PL1 type is used. Unit: GiB.
         */
        public Builder ephemeralStorage(Integer ephemeralStorage) {
            this.putQueryParameter("EphemeralStorage", ephemeralStorage);
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }

        /**
         * The hostnames and IP addresses of a container that you want to add to the hosts file of the elastic container instance.
         */
        public Builder hostAliases(java.util.List < HostAliases> hostAliases) {
            this.putQueryParameter("HostAliases", hostAliases);
            this.hostAliases = hostAliases;
            return this;
        }

        /**
         * The name of the elastic container instance.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * Information about the image repository.
         */
        public Builder imageRegistryCredentials(java.util.List < ImageRegistryCredentials> imageRegistryCredentials) {
            this.putQueryParameter("ImageRegistryCredentials", imageRegistryCredentials);
            this.imageRegistryCredentials = imageRegistryCredentials;
            return this;
        }

        /**
         * The ID of the image cache.
         */
        public Builder imageSnapshotId(String imageSnapshotId) {
            this.putQueryParameter("ImageSnapshotId", imageSnapshotId);
            this.imageSnapshotId = imageSnapshotId;
            return this;
        }

        /**
         * The maximum inbound bandwidth. Unit: bit/s.
         */
        public Builder ingressBandwidth(Long ingressBandwidth) {
            this.putQueryParameter("IngressBandwidth", ingressBandwidth);
            this.ingressBandwidth = ingressBandwidth;
            return this;
        }

        /**
         * The init containers.
         */
        public Builder initContainers(java.util.List < InitContainers> initContainers) {
            this.putQueryParameter("InitContainers", initContainers);
            this.initContainers = initContainers;
            return this;
        }

        /**
         * The level of the instance type, which is used to filter the instance types that meet the specified criteria. This parameter takes effect only if you set the `CostOptimization` parameter to true. Valid values:
         * <p>
         * 
         * *   EntryLevel: shared instance type. Instances of this level are the most cost-effective but may not provide stable computing performance in a consistent manner. Instances of this level are suitable for business scenarios in which the CPU utilization is low. For more information, see [Shared instance families](~~108489~~).
         * *   EnterpriseLevel: Instances of this level provide stable performance and dedicated resources, and are suitable for business scenarios that require high stability. For more information, see [Instance family](~~25378~~).
         * *   CreditEntryLevel: This value is valid only for burstable instances. CPU credits are used to ensure computing performance. Instances of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see the [Overview](~~59977~~) topic of burstable instances.
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * InstanceTypes.
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * The number of IPv6 addresses.
         */
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * The weight of the elastic container instance as a backend server. Valid values: 1 to 100.
         * <p>
         * 
         * Default value: 50.
         */
        public Builder loadBalancerWeight(Integer loadBalancerWeight) {
            this.putQueryParameter("LoadBalancerWeight", loadBalancerWeight);
            this.loadBalancerWeight = loadBalancerWeight;
            return this;
        }

        /**
         * The memory size of the elastic container instance. Unit: GiB.
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * The domain name of the Network Time Protocol (NTP) server.
         */
        public Builder ntpServers(java.util.List < String > ntpServers) {
            this.putQueryParameter("NtpServers", ntpServers);
            this.ntpServers = ntpServers;
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
         * The name of the RAM role for the elastic container instance. You can use an instance RAM role to access both elastic container instances and Elastic Compute Service (ECS) instances. For more information, see [Use an instance RAM role by calling API operations](~~61178~~).
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The restart policy of the elastic container instance. Valid values:
         * <p>
         * 
         * *   Always: always restarts the elastic container instance.
         * *   Never: never restarts the elastic container instance.
         * *   OnFailure: restarts the elastic container instance upon failures.
         * 
         * Default value: Always.
         */
        public Builder restartPolicy(String restartPolicy) {
            this.putQueryParameter("RestartPolicy", restartPolicy);
            this.restartPolicy = restartPolicy;
            return this;
        }

        /**
         * The name of the scaling configuration. The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (\_), hyphens (-), and periods (.). The name must start with a letter or a digit.
         * <p>
         * 
         * The name of the scaling configuration must be unique within a scaling group in a region. If you do not specify this parameter, the value of the ScalingConfigurationId parameter is used.
         */
        public Builder scalingConfigurationName(String scalingConfigurationName) {
            this.putQueryParameter("ScalingConfigurationName", scalingConfigurationName);
            this.scalingConfigurationName = scalingConfigurationName;
            return this;
        }

        /**
         * The ID of the scaling group in which you want to create the scaling configuration.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * The system information of the security context in which the elastic container instance runs.
         */
        public Builder securityContextSysctls(java.util.List < SecurityContextSysctls> securityContextSysctls) {
            this.putQueryParameter("SecurityContextSysctls", securityContextSysctls);
            this.securityContextSysctls = securityContextSysctls;
            return this;
        }

        /**
         * The ID of the security group with which you want to associate the elastic container instance. Elastic container instances that are associated with the same security group can access each other.
         * <p>
         * 
         * If you do not specify a security group, the system uses the default security group in the region that you selected. Make sure that the inbound rules of the security group contain the protocols and the port numbers of the containers that you want to expose. If you do not have a default security group in the region, the system creates a default security group, and then adds the declared container protocols and port numbers to the inbound rules of the security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The maximum hourly price of the preemptible elastic container instance. The value can be accurate to three decimal places.
         * <p>
         * 
         * If you set the SpotStrategy parameter to SpotWithPriceLimit, you must also specify the SpotPriceLimit parameter.
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * The bidding policy for the elastic container instance. Valid values:
         * <p>
         * 
         * *   NoSpot: The instance is a pay-as-you-go instance.
         * *   SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.
         * *   SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is used as the bid price.
         * 
         * Default value: NoSpot.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The tags of the elastic container instance. The tags must be specified in the key-value pair format. You can specify up to 20 tags. When you specify tag keys and tag values, take note of the following items:
         * <p>
         * 
         * *   A tag key can be up to 64 characters in length. The key cannot start with acs: or aliyun and cannot contain `http://` or `https://`. You cannot specify an empty string as a tag key.
         * *   A tag value can be up to 128 characters in length. The value cannot start with acs: or aliyun and cannot contain `http://` or `https://`. You can specify an empty string as a tag value.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The buffer time in which the program handles operations before the program is stopped. Unit: seconds.
         */
        public Builder terminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
            this.putQueryParameter("TerminationGracePeriodSeconds", terminationGracePeriodSeconds);
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        /**
         * Information about the volumes.
         */
        public Builder volumes(java.util.List < Volumes> volumes) {
            this.putQueryParameter("Volumes", volumes);
            this.volumes = volumes;
            return this;
        }

        @Override
        public CreateEciScalingConfigurationRequest build() {
            return new CreateEciScalingConfigurationRequest(this);
        } 

    } 

    public static class AcrRegistryInfos extends TeaModel {
        @NameInMap("Domains")
        private java.util.List < String > domains;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("RegionId")
        private String regionId;

        private AcrRegistryInfos(Builder builder) {
            this.domains = builder.domains;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AcrRegistryInfos create() {
            return builder().build();
        }

        /**
         * @return domains
         */
        public java.util.List < String > getDomains() {
            return this.domains;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.List < String > domains; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 

            /**
             * The domain names of the Container Registry Enterprise Edition instances. By default, all domain names of the Container Registry Enterprise Edition instances are displayed. You can specify one or more domain names. Separate multiple domain names with commas (,).
             */
            public Builder domains(java.util.List < String > domains) {
                this.domains = domains;
                return this;
            }

            /**
             * The ID of the Container Registry Enterprise Edition instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the Container Registry Enterprise Edition instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The region ID of the Container Registry Enterprise Edition instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public AcrRegistryInfos build() {
                return new AcrRegistryInfos(this);
            } 

        } 

    }
    public static class Exec extends TeaModel {
        @NameInMap("Commands")
        private java.util.List < String > commands;

        private Exec(Builder builder) {
            this.commands = builder.commands;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Exec create() {
            return builder().build();
        }

        /**
         * @return commands
         */
        public java.util.List < String > getCommands() {
            return this.commands;
        }

        public static final class Builder {
            private java.util.List < String > commands; 

            /**
             * Commands.
             */
            public Builder commands(java.util.List < String > commands) {
                this.commands = commands;
                return this;
            }

            public Exec build() {
                return new Exec(this);
            } 

        } 

    }
    public static class HttpGet extends TeaModel {
        @NameInMap("Path")
        private String path;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Scheme")
        private String scheme;

        private HttpGet(Builder builder) {
            this.path = builder.path;
            this.port = builder.port;
            this.scheme = builder.scheme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpGet create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return scheme
         */
        public String getScheme() {
            return this.scheme;
        }

        public static final class Builder {
            private String path; 
            private Integer port; 
            private String scheme; 

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Scheme.
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            public HttpGet build() {
                return new HttpGet(this);
            } 

        } 

    }
    public static class TcpSocket extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        private TcpSocket(Builder builder) {
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TcpSocket create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private Integer port; 

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public TcpSocket build() {
                return new TcpSocket(this);
            } 

        } 

    }
    public static class LivenessProbe extends TeaModel {
        @NameInMap("Exec")
        @Validation(required = true)
        private Exec exec;

        @NameInMap("FailureThreshold")
        private Integer failureThreshold;

        @NameInMap("HttpGet")
        @Validation(required = true)
        private HttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        private Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        private Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        private Integer successThreshold;

        @NameInMap("TcpSocket")
        @Validation(required = true)
        private TcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        private Integer timeoutSeconds;

        private LivenessProbe(Builder builder) {
            this.exec = builder.exec;
            this.failureThreshold = builder.failureThreshold;
            this.httpGet = builder.httpGet;
            this.initialDelaySeconds = builder.initialDelaySeconds;
            this.periodSeconds = builder.periodSeconds;
            this.successThreshold = builder.successThreshold;
            this.tcpSocket = builder.tcpSocket;
            this.timeoutSeconds = builder.timeoutSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LivenessProbe create() {
            return builder().build();
        }

        /**
         * @return exec
         */
        public Exec getExec() {
            return this.exec;
        }

        /**
         * @return failureThreshold
         */
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        /**
         * @return httpGet
         */
        public HttpGet getHttpGet() {
            return this.httpGet;
        }

        /**
         * @return initialDelaySeconds
         */
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        /**
         * @return periodSeconds
         */
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        /**
         * @return successThreshold
         */
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        /**
         * @return tcpSocket
         */
        public TcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        /**
         * @return timeoutSeconds
         */
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public static final class Builder {
            private Exec exec; 
            private Integer failureThreshold; 
            private HttpGet httpGet; 
            private Integer initialDelaySeconds; 
            private Integer periodSeconds; 
            private Integer successThreshold; 
            private TcpSocket tcpSocket; 
            private Integer timeoutSeconds; 

            /**
             * Exec.
             */
            public Builder exec(Exec exec) {
                this.exec = exec;
                return this;
            }

            /**
             * FailureThreshold.
             */
            public Builder failureThreshold(Integer failureThreshold) {
                this.failureThreshold = failureThreshold;
                return this;
            }

            /**
             * HttpGet.
             */
            public Builder httpGet(HttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * InitialDelaySeconds.
             */
            public Builder initialDelaySeconds(Integer initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * PeriodSeconds.
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * SuccessThreshold.
             */
            public Builder successThreshold(Integer successThreshold) {
                this.successThreshold = successThreshold;
                return this;
            }

            /**
             * TcpSocket.
             */
            public Builder tcpSocket(TcpSocket tcpSocket) {
                this.tcpSocket = tcpSocket;
                return this;
            }

            /**
             * TimeoutSeconds.
             */
            public Builder timeoutSeconds(Integer timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            public LivenessProbe build() {
                return new LivenessProbe(this);
            } 

        } 

    }
    public static class ReadinessProbeExec extends TeaModel {
        @NameInMap("Commands")
        private java.util.List < String > commands;

        private ReadinessProbeExec(Builder builder) {
            this.commands = builder.commands;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadinessProbeExec create() {
            return builder().build();
        }

        /**
         * @return commands
         */
        public java.util.List < String > getCommands() {
            return this.commands;
        }

        public static final class Builder {
            private java.util.List < String > commands; 

            /**
             * Commands.
             */
            public Builder commands(java.util.List < String > commands) {
                this.commands = commands;
                return this;
            }

            public ReadinessProbeExec build() {
                return new ReadinessProbeExec(this);
            } 

        } 

    }
    public static class ReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        private String path;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Scheme")
        private String scheme;

        private ReadinessProbeHttpGet(Builder builder) {
            this.path = builder.path;
            this.port = builder.port;
            this.scheme = builder.scheme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadinessProbeHttpGet create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return scheme
         */
        public String getScheme() {
            return this.scheme;
        }

        public static final class Builder {
            private String path; 
            private Integer port; 
            private String scheme; 

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Scheme.
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            public ReadinessProbeHttpGet build() {
                return new ReadinessProbeHttpGet(this);
            } 

        } 

    }
    public static class ReadinessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        private ReadinessProbeTcpSocket(Builder builder) {
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadinessProbeTcpSocket create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private Integer port; 

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public ReadinessProbeTcpSocket build() {
                return new ReadinessProbeTcpSocket(this);
            } 

        } 

    }
    public static class ReadinessProbe extends TeaModel {
        @NameInMap("Exec")
        @Validation(required = true)
        private ReadinessProbeExec exec;

        @NameInMap("FailureThreshold")
        private Integer failureThreshold;

        @NameInMap("HttpGet")
        @Validation(required = true)
        private ReadinessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        private Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        private Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        private Integer successThreshold;

        @NameInMap("TcpSocket")
        @Validation(required = true)
        private ReadinessProbeTcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        private Integer timeoutSeconds;

        private ReadinessProbe(Builder builder) {
            this.exec = builder.exec;
            this.failureThreshold = builder.failureThreshold;
            this.httpGet = builder.httpGet;
            this.initialDelaySeconds = builder.initialDelaySeconds;
            this.periodSeconds = builder.periodSeconds;
            this.successThreshold = builder.successThreshold;
            this.tcpSocket = builder.tcpSocket;
            this.timeoutSeconds = builder.timeoutSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadinessProbe create() {
            return builder().build();
        }

        /**
         * @return exec
         */
        public ReadinessProbeExec getExec() {
            return this.exec;
        }

        /**
         * @return failureThreshold
         */
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        /**
         * @return httpGet
         */
        public ReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        /**
         * @return initialDelaySeconds
         */
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        /**
         * @return periodSeconds
         */
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        /**
         * @return successThreshold
         */
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        /**
         * @return tcpSocket
         */
        public ReadinessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        /**
         * @return timeoutSeconds
         */
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public static final class Builder {
            private ReadinessProbeExec exec; 
            private Integer failureThreshold; 
            private ReadinessProbeHttpGet httpGet; 
            private Integer initialDelaySeconds; 
            private Integer periodSeconds; 
            private Integer successThreshold; 
            private ReadinessProbeTcpSocket tcpSocket; 
            private Integer timeoutSeconds; 

            /**
             * Exec.
             */
            public Builder exec(ReadinessProbeExec exec) {
                this.exec = exec;
                return this;
            }

            /**
             * FailureThreshold.
             */
            public Builder failureThreshold(Integer failureThreshold) {
                this.failureThreshold = failureThreshold;
                return this;
            }

            /**
             * HttpGet.
             */
            public Builder httpGet(ReadinessProbeHttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * InitialDelaySeconds.
             */
            public Builder initialDelaySeconds(Integer initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * PeriodSeconds.
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * SuccessThreshold.
             */
            public Builder successThreshold(Integer successThreshold) {
                this.successThreshold = successThreshold;
                return this;
            }

            /**
             * TcpSocket.
             */
            public Builder tcpSocket(ReadinessProbeTcpSocket tcpSocket) {
                this.tcpSocket = tcpSocket;
                return this;
            }

            /**
             * TimeoutSeconds.
             */
            public Builder timeoutSeconds(Integer timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            public ReadinessProbe build() {
                return new ReadinessProbe(this);
            } 

        } 

    }
    public static class Capability extends TeaModel {
        @NameInMap("Add")
        private java.util.List < String > add;

        private Capability(Builder builder) {
            this.add = builder.add;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capability create() {
            return builder().build();
        }

        /**
         * @return add
         */
        public java.util.List < String > getAdd() {
            return this.add;
        }

        public static final class Builder {
            private java.util.List < String > add; 

            /**
             * Add.
             */
            public Builder add(java.util.List < String > add) {
                this.add = add;
                return this;
            }

            public Capability build() {
                return new Capability(this);
            } 

        } 

    }
    public static class SecurityContext extends TeaModel {
        @NameInMap("Capability")
        @Validation(required = true)
        private Capability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        private Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        private Long runAsUser;

        private SecurityContext(Builder builder) {
            this.capability = builder.capability;
            this.readOnlyRootFilesystem = builder.readOnlyRootFilesystem;
            this.runAsUser = builder.runAsUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityContext create() {
            return builder().build();
        }

        /**
         * @return capability
         */
        public Capability getCapability() {
            return this.capability;
        }

        /**
         * @return readOnlyRootFilesystem
         */
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        /**
         * @return runAsUser
         */
        public Long getRunAsUser() {
            return this.runAsUser;
        }

        public static final class Builder {
            private Capability capability; 
            private Boolean readOnlyRootFilesystem; 
            private Long runAsUser; 

            /**
             * Capability.
             */
            public Builder capability(Capability capability) {
                this.capability = capability;
                return this;
            }

            /**
             * ReadOnlyRootFilesystem.
             */
            public Builder readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
                this.readOnlyRootFilesystem = readOnlyRootFilesystem;
                return this;
            }

            /**
             * RunAsUser.
             */
            public Builder runAsUser(Long runAsUser) {
                this.runAsUser = runAsUser;
                return this;
            }

            public SecurityContext build() {
                return new SecurityContext(this);
            } 

        } 

    }
    public static class EnvironmentVars extends TeaModel {
        @NameInMap("FieldRefFieldPath")
        private String fieldRefFieldPath;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private EnvironmentVars(Builder builder) {
            this.fieldRefFieldPath = builder.fieldRefFieldPath;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentVars create() {
            return builder().build();
        }

        /**
         * @return fieldRefFieldPath
         */
        public String getFieldRefFieldPath() {
            return this.fieldRefFieldPath;
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
            private String fieldRefFieldPath; 
            private String key; 
            private String value; 

            /**
             * > This parameter is unavailable.
             */
            public Builder fieldRefFieldPath(String fieldRefFieldPath) {
                this.fieldRefFieldPath = fieldRefFieldPath;
                return this;
            }

            /**
             * The name of the environment variable. The name must be 1 to 128 characters in length and can contain letters, digits, and underscores (\_). The name cannot start with a digit. Specify the name in the \[0-9a-zA-Z] format.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the environment variable. The value must be 0 to 256 characters in length.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public EnvironmentVars build() {
                return new EnvironmentVars(this);
            } 

        } 

    }
    public static class Ports extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        private Ports(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ports create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 

            /**
             * The port number. Valid values: 1 to 65535.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the protocol. Valid values:
             * <p>
             * 
             * *   TCP
             * *   UDP
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
    public static class VolumeMounts extends TeaModel {
        @NameInMap("MountPath")
        private String mountPath;

        @NameInMap("MountPropagation")
        private String mountPropagation;

        @NameInMap("Name")
        private String name;

        @NameInMap("ReadOnly")
        private Boolean readOnly;

        @NameInMap("SubPath")
        private String subPath;

        private VolumeMounts(Builder builder) {
            this.mountPath = builder.mountPath;
            this.mountPropagation = builder.mountPropagation;
            this.name = builder.name;
            this.readOnly = builder.readOnly;
            this.subPath = builder.subPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VolumeMounts create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return mountPropagation
         */
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return subPath
         */
        public String getSubPath() {
            return this.subPath;
        }

        public static final class Builder {
            private String mountPath; 
            private String mountPropagation; 
            private String name; 
            private Boolean readOnly; 
            private String subPath; 

            /**
             * The directory on which the container mounts the volume.
             * <p>
             * 
             * > Data in this directory is overwritten by the data on the volume.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * The mount propagation settings of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:
             * <p>
             * 
             * *   None: The volume mount does not receive subsequent mounts that are mounted to this volume or its subdirectories.
             * *   HostToCotainer: The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories.
             * *   Bidirectional: This value is similar to HostToCotainer. The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories. In addition, all volume mounts that are created by the container are propagated back to the instance and to all containers of all pods that use the same volume.
             * 
             * Default value: None.
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * The name of the volume. The value of this parameter is the same as the value of the VolumeName parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Specifies whether the volume is read-only. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: false.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * The subdirectory of the volume.
             */
            public Builder subPath(String subPath) {
                this.subPath = subPath;
                return this;
            }

            public VolumeMounts build() {
                return new VolumeMounts(this);
            } 

        } 

    }
    public static class Containers extends TeaModel {
        @NameInMap("LivenessProbe")
        @Validation(required = true)
        private LivenessProbe livenessProbe;

        @NameInMap("ReadinessProbe")
        @Validation(required = true)
        private ReadinessProbe readinessProbe;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        private SecurityContext securityContext;

        @NameInMap("Args")
        private java.util.List < String > args;

        @NameInMap("Commands")
        private java.util.List < String > commands;

        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("EnvironmentVars")
        private java.util.List < EnvironmentVars> environmentVars;

        @NameInMap("Gpu")
        private Integer gpu;

        @NameInMap("Image")
        private String image;

        @NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @NameInMap("Memory")
        private Float memory;

        @NameInMap("Name")
        private String name;

        @NameInMap("Ports")
        private java.util.List < Ports> ports;

        @NameInMap("Stdin")
        private Boolean stdin;

        @NameInMap("StdinOnce")
        private Boolean stdinOnce;

        @NameInMap("Tty")
        private Boolean tty;

        @NameInMap("VolumeMounts")
        private java.util.List < VolumeMounts> volumeMounts;

        @NameInMap("WorkingDir")
        private String workingDir;

        private Containers(Builder builder) {
            this.livenessProbe = builder.livenessProbe;
            this.readinessProbe = builder.readinessProbe;
            this.securityContext = builder.securityContext;
            this.args = builder.args;
            this.commands = builder.commands;
            this.cpu = builder.cpu;
            this.environmentVars = builder.environmentVars;
            this.gpu = builder.gpu;
            this.image = builder.image;
            this.imagePullPolicy = builder.imagePullPolicy;
            this.memory = builder.memory;
            this.name = builder.name;
            this.ports = builder.ports;
            this.stdin = builder.stdin;
            this.stdinOnce = builder.stdinOnce;
            this.tty = builder.tty;
            this.volumeMounts = builder.volumeMounts;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Containers create() {
            return builder().build();
        }

        /**
         * @return livenessProbe
         */
        public LivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        /**
         * @return readinessProbe
         */
        public ReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

        /**
         * @return securityContext
         */
        public SecurityContext getSecurityContext() {
            return this.securityContext;
        }

        /**
         * @return args
         */
        public java.util.List < String > getArgs() {
            return this.args;
        }

        /**
         * @return commands
         */
        public java.util.List < String > getCommands() {
            return this.commands;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return environmentVars
         */
        public java.util.List < EnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        /**
         * @return gpu
         */
        public Integer getGpu() {
            return this.gpu;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return imagePullPolicy
         */
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ports
         */
        public java.util.List < Ports> getPorts() {
            return this.ports;
        }

        /**
         * @return stdin
         */
        public Boolean getStdin() {
            return this.stdin;
        }

        /**
         * @return stdinOnce
         */
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        /**
         * @return tty
         */
        public Boolean getTty() {
            return this.tty;
        }

        /**
         * @return volumeMounts
         */
        public java.util.List < VolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private LivenessProbe livenessProbe; 
            private ReadinessProbe readinessProbe; 
            private SecurityContext securityContext; 
            private java.util.List < String > args; 
            private java.util.List < String > commands; 
            private Float cpu; 
            private java.util.List < EnvironmentVars> environmentVars; 
            private Integer gpu; 
            private String image; 
            private String imagePullPolicy; 
            private Float memory; 
            private String name; 
            private java.util.List < Ports> ports; 
            private Boolean stdin; 
            private Boolean stdinOnce; 
            private Boolean tty; 
            private java.util.List < VolumeMounts> volumeMounts; 
            private String workingDir; 

            /**
             * LivenessProbe.
             */
            public Builder livenessProbe(LivenessProbe livenessProbe) {
                this.livenessProbe = livenessProbe;
                return this;
            }

            /**
             * ReadinessProbe.
             */
            public Builder readinessProbe(ReadinessProbe readinessProbe) {
                this.readinessProbe = readinessProbe;
                return this;
            }

            /**
             * SecurityContext.
             */
            public Builder securityContext(SecurityContext securityContext) {
                this.securityContext = securityContext;
                return this;
            }

            /**
             * The arguments that correspond to the startup commands of the container. You can specify up to 10 arguments.
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * The commands that you want to run in the container when you use the CLI to perform probes.
             */
            public Builder commands(java.util.List < String > commands) {
                this.commands = commands;
                return this;
            }

            /**
             * The number of CPU cores in the container.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Information about environment variables.
             */
            public Builder environmentVars(java.util.List < EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * The number of GPUs that you want to allocate to the container.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * The image of the container.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The image pulling policy. Valid values:
             * <p>
             * 
             * *   Always: pulls images each time.
             * *   IfNotPresent: pulls images only if no on-premises images are available. On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.
             * *   Never: never pulls images. On-premises images are always used.
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * The memory size of the container. Unit: GiB.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The name of the container image.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ports.
             */
            public Builder ports(java.util.List < Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * Specifies whether the container allocates buffer resources to standard input streams when the container is running. If you do not specify this parameter, an end-of-file (EOF) error may occur.
             * <p>
             * 
             * Default value: false.
             */
            public Builder stdin(Boolean stdin) {
                this.stdin = stdin;
                return this;
            }

            /**
             * Specifies whether to disconnect standard input streams after a client is disconnected.
             * <p>
             * 
             * If you set the StdinOnce parameter to true, standard input streams are connected after the container is started, and remain idle until a client is connected to receive data. After the client is disconnected, streams are also disconnected, and remain disconnected until the container is started again.
             */
            public Builder stdinOnce(Boolean stdinOnce) {
                this.stdinOnce = stdinOnce;
                return this;
            }

            /**
             * Specifies whether to enable interaction. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * If the value of the Command parameter is /bin/bash, you must set this parameter to true.
             * 
             * Default value: false.
             */
            public Builder tty(Boolean tty) {
                this.tty = tty;
                return this;
            }

            /**
             * Information about the volume mount of the container.
             */
            public Builder volumeMounts(java.util.List < VolumeMounts> volumeMounts) {
                this.volumeMounts = volumeMounts;
                return this;
            }

            /**
             * The working directory of the container.
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
                return this;
            }

            public Containers build() {
                return new Containers(this);
            } 

        } 

    }
    public static class DnsConfigOptions extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private DnsConfigOptions(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsConfigOptions create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The variable name of the option.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The variable value of the option.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DnsConfigOptions build() {
                return new DnsConfigOptions(this);
            } 

        } 

    }
    public static class HostAliases extends TeaModel {
        @NameInMap("Hostnames")
        private java.util.List < String > hostnames;

        @NameInMap("Ip")
        private String ip;

        private HostAliases(Builder builder) {
            this.hostnames = builder.hostnames;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAliases create() {
            return builder().build();
        }

        /**
         * @return hostnames
         */
        public java.util.List < String > getHostnames() {
            return this.hostnames;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List < String > hostnames; 
            private String ip; 

            /**
             * The hostname that you want to add.
             */
            public Builder hostnames(java.util.List < String > hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * The IP address that you want to add.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public HostAliases build() {
                return new HostAliases(this);
            } 

        } 

    }
    public static class ImageRegistryCredentials extends TeaModel {
        @NameInMap("Password")
        private String password;

        @NameInMap("Server")
        private String server;

        @NameInMap("UserName")
        private String userName;

        private ImageRegistryCredentials(Builder builder) {
            this.password = builder.password;
            this.server = builder.server;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRegistryCredentials create() {
            return builder().build();
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String password; 
            private String server; 
            private String userName; 

            /**
             * The password that is used to access the image repository.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The domain name of the image repository.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * The username that is used to access the image repository.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ImageRegistryCredentials build() {
                return new ImageRegistryCredentials(this);
            } 

        } 

    }
    public static class SecurityContextCapability extends TeaModel {
        @NameInMap("Adds")
        private java.util.List < String > adds;

        private SecurityContextCapability(Builder builder) {
            this.adds = builder.adds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityContextCapability create() {
            return builder().build();
        }

        /**
         * @return adds
         */
        public java.util.List < String > getAdds() {
            return this.adds;
        }

        public static final class Builder {
            private java.util.List < String > adds; 

            /**
             * Adds.
             */
            public Builder adds(java.util.List < String > adds) {
                this.adds = adds;
                return this;
            }

            public SecurityContextCapability build() {
                return new SecurityContextCapability(this);
            } 

        } 

    }
    public static class InitContainersSecurityContext extends TeaModel {
        @NameInMap("Capability")
        @Validation(required = true)
        private SecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        private Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        private Long runAsUser;

        private InitContainersSecurityContext(Builder builder) {
            this.capability = builder.capability;
            this.readOnlyRootFilesystem = builder.readOnlyRootFilesystem;
            this.runAsUser = builder.runAsUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainersSecurityContext create() {
            return builder().build();
        }

        /**
         * @return capability
         */
        public SecurityContextCapability getCapability() {
            return this.capability;
        }

        /**
         * @return readOnlyRootFilesystem
         */
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        /**
         * @return runAsUser
         */
        public Long getRunAsUser() {
            return this.runAsUser;
        }

        public static final class Builder {
            private SecurityContextCapability capability; 
            private Boolean readOnlyRootFilesystem; 
            private Long runAsUser; 

            /**
             * Capability.
             */
            public Builder capability(SecurityContextCapability capability) {
                this.capability = capability;
                return this;
            }

            /**
             * ReadOnlyRootFilesystem.
             */
            public Builder readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
                this.readOnlyRootFilesystem = readOnlyRootFilesystem;
                return this;
            }

            /**
             * RunAsUser.
             */
            public Builder runAsUser(Long runAsUser) {
                this.runAsUser = runAsUser;
                return this;
            }

            public InitContainersSecurityContext build() {
                return new InitContainersSecurityContext(this);
            } 

        } 

    }
    public static class InitContainerEnvironmentVars extends TeaModel {
        @NameInMap("FieldRefFieldPath")
        private String fieldRefFieldPath;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private InitContainerEnvironmentVars(Builder builder) {
            this.fieldRefFieldPath = builder.fieldRefFieldPath;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerEnvironmentVars create() {
            return builder().build();
        }

        /**
         * @return fieldRefFieldPath
         */
        public String getFieldRefFieldPath() {
            return this.fieldRefFieldPath;
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
            private String fieldRefFieldPath; 
            private String key; 
            private String value; 

            /**
             * > This parameter is unavailable.
             */
            public Builder fieldRefFieldPath(String fieldRefFieldPath) {
                this.fieldRefFieldPath = fieldRefFieldPath;
                return this;
            }

            /**
             * The key of the environment variable. Specify the key in the `[0-9a-zA-Z]` format. The key must be 1 to 128 characters in length. The key can contain underscores (\_) and cannot start with a digit.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the environment variable. The value must be 0 to 256 characters in length.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InitContainerEnvironmentVars build() {
                return new InitContainerEnvironmentVars(this);
            } 

        } 

    }
    public static class InitContainerPorts extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        private InitContainerPorts(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerPorts create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 

            /**
             * The port number. Valid values: 1 to 65535.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the protocol. Valid values:
             * <p>
             * 
             * *   TCP
             * *   UDP
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public InitContainerPorts build() {
                return new InitContainerPorts(this);
            } 

        } 

    }
    public static class InitContainerVolumeMounts extends TeaModel {
        @NameInMap("MountPath")
        private String mountPath;

        @NameInMap("MountPropagation")
        private String mountPropagation;

        @NameInMap("Name")
        private String name;

        @NameInMap("ReadOnly")
        private Boolean readOnly;

        @NameInMap("SubPath")
        private String subPath;

        private InitContainerVolumeMounts(Builder builder) {
            this.mountPath = builder.mountPath;
            this.mountPropagation = builder.mountPropagation;
            this.name = builder.name;
            this.readOnly = builder.readOnly;
            this.subPath = builder.subPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerVolumeMounts create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return mountPropagation
         */
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return subPath
         */
        public String getSubPath() {
            return this.subPath;
        }

        public static final class Builder {
            private String mountPath; 
            private String mountPropagation; 
            private String name; 
            private Boolean readOnly; 
            private String subPath; 

            /**
             * The path to which the volume is mounted. Data under this path is overwritten by the data on the volume.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * The mount propagation settings of the volume . Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:
             * <p>
             * 
             * *   None: The volume mount does not receive subsequent mounts that are mounted to this volume or its subdirectories.
             * *   HostToCotainer: The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories.
             * *   Bidirectional: This value is similar to HostToCotainer. The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories. In addition, all volume mounts that are created by the container are propagated back to the instance and to all containers of all pods that use the same volume.
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * The name of the volume.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Specifies whether the mount path is read-only.
             * <p>
             * 
             * Default value: false.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * The subdirectory of the volume. The elastic container instance can mount different directories of the same volume to different subdirectories of containers.
             */
            public Builder subPath(String subPath) {
                this.subPath = subPath;
                return this;
            }

            public InitContainerVolumeMounts build() {
                return new InitContainerVolumeMounts(this);
            } 

        } 

    }
    public static class InitContainers extends TeaModel {
        @NameInMap("SecurityContext")
        @Validation(required = true)
        private InitContainersSecurityContext securityContext;

        @NameInMap("Args")
        private java.util.List < String > args;

        @NameInMap("Commands")
        private java.util.List < String > commands;

        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("Gpu")
        private Integer gpu;

        @NameInMap("Image")
        private String image;

        @NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @NameInMap("InitContainerEnvironmentVars")
        private java.util.List < InitContainerEnvironmentVars> initContainerEnvironmentVars;

        @NameInMap("InitContainerPorts")
        private java.util.List < InitContainerPorts> initContainerPorts;

        @NameInMap("InitContainerVolumeMounts")
        private java.util.List < InitContainerVolumeMounts> initContainerVolumeMounts;

        @NameInMap("Memory")
        private Float memory;

        @NameInMap("Name")
        private String name;

        @NameInMap("WorkingDir")
        private String workingDir;

        private InitContainers(Builder builder) {
            this.securityContext = builder.securityContext;
            this.args = builder.args;
            this.commands = builder.commands;
            this.cpu = builder.cpu;
            this.gpu = builder.gpu;
            this.image = builder.image;
            this.imagePullPolicy = builder.imagePullPolicy;
            this.initContainerEnvironmentVars = builder.initContainerEnvironmentVars;
            this.initContainerPorts = builder.initContainerPorts;
            this.initContainerVolumeMounts = builder.initContainerVolumeMounts;
            this.memory = builder.memory;
            this.name = builder.name;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainers create() {
            return builder().build();
        }

        /**
         * @return securityContext
         */
        public InitContainersSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        /**
         * @return args
         */
        public java.util.List < String > getArgs() {
            return this.args;
        }

        /**
         * @return commands
         */
        public java.util.List < String > getCommands() {
            return this.commands;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return gpu
         */
        public Integer getGpu() {
            return this.gpu;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return imagePullPolicy
         */
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        /**
         * @return initContainerEnvironmentVars
         */
        public java.util.List < InitContainerEnvironmentVars> getInitContainerEnvironmentVars() {
            return this.initContainerEnvironmentVars;
        }

        /**
         * @return initContainerPorts
         */
        public java.util.List < InitContainerPorts> getInitContainerPorts() {
            return this.initContainerPorts;
        }

        /**
         * @return initContainerVolumeMounts
         */
        public java.util.List < InitContainerVolumeMounts> getInitContainerVolumeMounts() {
            return this.initContainerVolumeMounts;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private InitContainersSecurityContext securityContext; 
            private java.util.List < String > args; 
            private java.util.List < String > commands; 
            private Float cpu; 
            private Integer gpu; 
            private String image; 
            private String imagePullPolicy; 
            private java.util.List < InitContainerEnvironmentVars> initContainerEnvironmentVars; 
            private java.util.List < InitContainerPorts> initContainerPorts; 
            private java.util.List < InitContainerVolumeMounts> initContainerVolumeMounts; 
            private Float memory; 
            private String name; 
            private String workingDir; 

            /**
             * SecurityContext.
             */
            public Builder securityContext(InitContainersSecurityContext securityContext) {
                this.securityContext = securityContext;
                return this;
            }

            /**
             * The arguments that correspond to the startup commands of the container. You can specify up to 10 arguments.
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * The list of commands that you want to run to start the container.
             */
            public Builder commands(java.util.List < String > commands) {
                this.commands = commands;
                return this;
            }

            /**
             * The number of vCPUs that you want to allocate to the container.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The number of GPUs that you want to allocate to the container.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * The container image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The image pulling policy.
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * The environment variables of the init container.
             */
            public Builder initContainerEnvironmentVars(java.util.List < InitContainerEnvironmentVars> initContainerEnvironmentVars) {
                this.initContainerEnvironmentVars = initContainerEnvironmentVars;
                return this;
            }

            /**
             * The ports of the init container.
             */
            public Builder initContainerPorts(java.util.List < InitContainerPorts> initContainerPorts) {
                this.initContainerPorts = initContainerPorts;
                return this;
            }

            /**
             * Information about the volume mounts of the init container.
             */
            public Builder initContainerVolumeMounts(java.util.List < InitContainerVolumeMounts> initContainerVolumeMounts) {
                this.initContainerVolumeMounts = initContainerVolumeMounts;
                return this;
            }

            /**
             * The size of the memory. Unit: GiB.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The name of the container.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The working directory.
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
                return this;
            }

            public InitContainers build() {
                return new InitContainers(this);
            } 

        } 

    }
    public static class SecurityContextSysctls extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private SecurityContextSysctls(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityContextSysctls create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The variable name of the security context in which the elastic container instance runs.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The variable value of the security context in which the elastic container instance runs.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SecurityContextSysctls build() {
                return new SecurityContextSysctls(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * The tag key of the elastic container instance. You can specify 1 to 20 tags.
             * <p>
             * 
             * You cannot specify an empty string as a tag key. The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the elastic container instance. You can specify 1 to 20 tags.
             * <p>
             * 
             * You can specify an empty string as a tag value. The tag value can be up to 128 characters in length and cannot start with `acs:`. It cannot contain `http://` or `https://`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class DiskVolume extends TeaModel {
        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("DiskSize")
        private Integer diskSize;

        @NameInMap("FsType")
        private String fsType;

        private DiskVolume(Builder builder) {
            this.diskId = builder.diskId;
            this.diskSize = builder.diskSize;
            this.fsType = builder.fsType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskVolume create() {
            return builder().build();
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return fsType
         */
        public String getFsType() {
            return this.fsType;
        }

        public static final class Builder {
            private String diskId; 
            private Integer diskSize; 
            private String fsType; 

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * DiskSize.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * FsType.
             */
            public Builder fsType(String fsType) {
                this.fsType = fsType;
                return this;
            }

            public DiskVolume build() {
                return new DiskVolume(this);
            } 

        } 

    }
    public static class EmptyDirVolume extends TeaModel {
        @NameInMap("Medium")
        private String medium;

        @NameInMap("SizeLimit")
        private String sizeLimit;

        private EmptyDirVolume(Builder builder) {
            this.medium = builder.medium;
            this.sizeLimit = builder.sizeLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmptyDirVolume create() {
            return builder().build();
        }

        /**
         * @return medium
         */
        public String getMedium() {
            return this.medium;
        }

        /**
         * @return sizeLimit
         */
        public String getSizeLimit() {
            return this.sizeLimit;
        }

        public static final class Builder {
            private String medium; 
            private String sizeLimit; 

            /**
             * Medium.
             */
            public Builder medium(String medium) {
                this.medium = medium;
                return this;
            }

            /**
             * SizeLimit.
             */
            public Builder sizeLimit(String sizeLimit) {
                this.sizeLimit = sizeLimit;
                return this;
            }

            public EmptyDirVolume build() {
                return new EmptyDirVolume(this);
            } 

        } 

    }
    public static class FlexVolume extends TeaModel {
        @NameInMap("Driver")
        private String driver;

        @NameInMap("FsType")
        private String fsType;

        @NameInMap("Options")
        private String options;

        private FlexVolume(Builder builder) {
            this.driver = builder.driver;
            this.fsType = builder.fsType;
            this.options = builder.options;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlexVolume create() {
            return builder().build();
        }

        /**
         * @return driver
         */
        public String getDriver() {
            return this.driver;
        }

        /**
         * @return fsType
         */
        public String getFsType() {
            return this.fsType;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        public static final class Builder {
            private String driver; 
            private String fsType; 
            private String options; 

            /**
             * Driver.
             */
            public Builder driver(String driver) {
                this.driver = driver;
                return this;
            }

            /**
             * FsType.
             */
            public Builder fsType(String fsType) {
                this.fsType = fsType;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            public FlexVolume build() {
                return new FlexVolume(this);
            } 

        } 

    }
    public static class HostPathVolume extends TeaModel {
        @NameInMap("Path")
        private String path;

        @NameInMap("Type")
        private String type;

        private HostPathVolume(Builder builder) {
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostPathVolume create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String path; 
            private String type; 

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public HostPathVolume build() {
                return new HostPathVolume(this);
            } 

        } 

    }
    public static class NFSVolume extends TeaModel {
        @NameInMap("Path")
        private String path;

        @NameInMap("ReadOnly")
        private Boolean readOnly;

        @NameInMap("Server")
        private String server;

        private NFSVolume(Builder builder) {
            this.path = builder.path;
            this.readOnly = builder.readOnly;
            this.server = builder.server;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NFSVolume create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        public static final class Builder {
            private String path; 
            private Boolean readOnly; 
            private String server; 

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Specifies whether the mount path is read-only.
             * <p>
             * 
             * Default value: false.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * The domain name of the image repository.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            public NFSVolume build() {
                return new NFSVolume(this);
            } 

        } 

    }
    public static class ConfigFileVolumeConfigFileToPaths extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Mode")
        private Integer mode;

        @NameInMap("Path")
        private String path;

        private ConfigFileVolumeConfigFileToPaths(Builder builder) {
            this.content = builder.content;
            this.mode = builder.mode;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigFileVolumeConfigFileToPaths create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String content; 
            private Integer mode; 
            private String path; 

            /**
             * The content of the configuration file, which can be up to 32 KB in size.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The permissions on ConfigFileVolume.
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The name of the environment variable. The name must be 1 to 128 characters in length. Specify the name in the `[0-9a-zA-Z]` format. The name can contain underscores and cannot start with a digit.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public ConfigFileVolumeConfigFileToPaths build() {
                return new ConfigFileVolumeConfigFileToPaths(this);
            } 

        } 

    }
    public static class Volumes extends TeaModel {
        @NameInMap("DiskVolume")
        @Validation(required = true)
        private DiskVolume diskVolume;

        @NameInMap("EmptyDirVolume")
        @Validation(required = true)
        private EmptyDirVolume emptyDirVolume;

        @NameInMap("FlexVolume")
        @Validation(required = true)
        private FlexVolume flexVolume;

        @NameInMap("HostPathVolume")
        @Validation(required = true)
        private HostPathVolume hostPathVolume;

        @NameInMap("NFSVolume")
        @Validation(required = true)
        private NFSVolume NFSVolume;

        @NameInMap("ConfigFileVolumeConfigFileToPaths")
        private java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        @NameInMap("ConfigFileVolumeDefaultMode")
        private Integer configFileVolumeDefaultMode;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        private Volumes(Builder builder) {
            this.diskVolume = builder.diskVolume;
            this.emptyDirVolume = builder.emptyDirVolume;
            this.flexVolume = builder.flexVolume;
            this.hostPathVolume = builder.hostPathVolume;
            this.NFSVolume = builder.NFSVolume;
            this.configFileVolumeConfigFileToPaths = builder.configFileVolumeConfigFileToPaths;
            this.configFileVolumeDefaultMode = builder.configFileVolumeDefaultMode;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Volumes create() {
            return builder().build();
        }

        /**
         * @return diskVolume
         */
        public DiskVolume getDiskVolume() {
            return this.diskVolume;
        }

        /**
         * @return emptyDirVolume
         */
        public EmptyDirVolume getEmptyDirVolume() {
            return this.emptyDirVolume;
        }

        /**
         * @return flexVolume
         */
        public FlexVolume getFlexVolume() {
            return this.flexVolume;
        }

        /**
         * @return hostPathVolume
         */
        public HostPathVolume getHostPathVolume() {
            return this.hostPathVolume;
        }

        /**
         * @return NFSVolume
         */
        public NFSVolume getNFSVolume() {
            return this.NFSVolume;
        }

        /**
         * @return configFileVolumeConfigFileToPaths
         */
        public java.util.List < ConfigFileVolumeConfigFileToPaths> getConfigFileVolumeConfigFileToPaths() {
            return this.configFileVolumeConfigFileToPaths;
        }

        /**
         * @return configFileVolumeDefaultMode
         */
        public Integer getConfigFileVolumeDefaultMode() {
            return this.configFileVolumeDefaultMode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private DiskVolume diskVolume; 
            private EmptyDirVolume emptyDirVolume; 
            private FlexVolume flexVolume; 
            private HostPathVolume hostPathVolume; 
            private NFSVolume NFSVolume; 
            private java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths; 
            private Integer configFileVolumeDefaultMode; 
            private String name; 
            private String type; 

            /**
             * DiskVolume.
             */
            public Builder diskVolume(DiskVolume diskVolume) {
                this.diskVolume = diskVolume;
                return this;
            }

            /**
             * EmptyDirVolume.
             */
            public Builder emptyDirVolume(EmptyDirVolume emptyDirVolume) {
                this.emptyDirVolume = emptyDirVolume;
                return this;
            }

            /**
             * FlexVolume.
             */
            public Builder flexVolume(FlexVolume flexVolume) {
                this.flexVolume = flexVolume;
                return this;
            }

            /**
             * HostPathVolume.
             */
            public Builder hostPathVolume(HostPathVolume hostPathVolume) {
                this.hostPathVolume = hostPathVolume;
                return this;
            }

            /**
             * NFSVolume.
             */
            public Builder NFSVolume(NFSVolume NFSVolume) {
                this.NFSVolume = NFSVolume;
                return this;
            }

            /**
             * The paths to the configuration files.
             */
            public Builder configFileVolumeConfigFileToPaths(java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
                this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
                return this;
            }

            /**
             * The default permissions on the ConfigFile volume.
             */
            public Builder configFileVolumeDefaultMode(Integer configFileVolumeDefaultMode) {
                this.configFileVolumeDefaultMode = configFileVolumeDefaultMode;
                return this;
            }

            /**
             * The name of the volume.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the Host file or path. Examples: File, Directory, and Socket.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Volumes build() {
                return new Volumes(this);
            } 

        } 

    }
}
