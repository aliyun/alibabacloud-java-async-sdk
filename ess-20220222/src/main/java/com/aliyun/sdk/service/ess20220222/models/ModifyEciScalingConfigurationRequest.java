// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link ModifyEciScalingConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ModifyEciScalingConfigurationRequest</p>
 */
public class ModifyEciScalingConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcrRegistryInfos")
    private java.util.List<AcrRegistryInfos> acrRegistryInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActiveDeadlineSeconds")
    private Long activeDeadlineSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoCreateEip")
    private Boolean autoCreateEip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoMatchImageCache")
    private Boolean autoMatchImageCache;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerGroupName")
    private String containerGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Containers")
    private java.util.List<Containers> containers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainersUpdateType")
    private String containersUpdateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CostOptimization")
    private Boolean costOptimization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Float cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuOptionsCore")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer cpuOptionsCore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuOptionsThreadsPerCore")
    private Integer cpuOptionsThreadsPerCore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCacheBucket")
    private String dataCacheBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCacheBurstingEnabled")
    private Boolean dataCacheBurstingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCachePL")
    private String dataCachePL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCacheProvisionedIops")
    private Integer dataCacheProvisionedIops;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsConfigNameServers")
    private java.util.List<String> dnsConfigNameServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsConfigOptions")
    private java.util.List<DnsConfigOptions> dnsConfigOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsConfigSearchs")
    private java.util.List<String> dnsConfigSearchs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsPolicy")
    private String dnsPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EgressBandwidth")
    @com.aliyun.core.annotation.Validation()
    private Long egressBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipBandwidth")
    @com.aliyun.core.annotation.Validation(maximum = 1000000)
    private Integer eipBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSls")
    private Boolean enableSls;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EphemeralStorage")
    @com.aliyun.core.annotation.Validation(maximum = 5000)
    private Integer ephemeralStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuDriverVersion")
    private String gpuDriverVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostAliases")
    private java.util.List<HostAliases> hostAliases;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageRegistryCredentials")
    private java.util.List<ImageRegistryCredentials> imageRegistryCredentials;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageSnapshotId")
    private String imageSnapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IngressBandwidth")
    @com.aliyun.core.annotation.Validation()
    private Long ingressBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitContainers")
    private java.util.List<InitContainers> initContainers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private java.util.List<String> instanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerWeight")
    private Integer loadBalancerWeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    private Float memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NtpServers")
    private java.util.List<String> ntpServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Override")
    private Boolean override;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

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
    @com.aliyun.core.annotation.NameInMap("RestartPolicy")
    private String restartPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingConfigurationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingConfigurationName")
    private String scalingConfigurationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityContextSysCtls")
    private java.util.List<SecurityContextSysCtls> securityContextSysCtls;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminationGracePeriodSeconds")
    private Long terminationGracePeriodSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Volumes")
    private java.util.List<Volumes> volumes;

    private ModifyEciScalingConfigurationRequest(Builder builder) {
        super(builder);
        this.acrRegistryInfos = builder.acrRegistryInfos;
        this.activeDeadlineSeconds = builder.activeDeadlineSeconds;
        this.autoCreateEip = builder.autoCreateEip;
        this.autoMatchImageCache = builder.autoMatchImageCache;
        this.containerGroupName = builder.containerGroupName;
        this.containers = builder.containers;
        this.containersUpdateType = builder.containersUpdateType;
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
        this.gpuDriverVersion = builder.gpuDriverVersion;
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
        this.override = builder.override;
        this.ownerId = builder.ownerId;
        this.ramRoleName = builder.ramRoleName;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.restartPolicy = builder.restartPolicy;
        this.scalingConfigurationId = builder.scalingConfigurationId;
        this.scalingConfigurationName = builder.scalingConfigurationName;
        this.securityContextSysCtls = builder.securityContextSysCtls;
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

    public static ModifyEciScalingConfigurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acrRegistryInfos
     */
    public java.util.List<AcrRegistryInfos> getAcrRegistryInfos() {
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
    public java.util.List<Containers> getContainers() {
        return this.containers;
    }

    /**
     * @return containersUpdateType
     */
    public String getContainersUpdateType() {
        return this.containersUpdateType;
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
    public java.util.List<String> getDnsConfigNameServers() {
        return this.dnsConfigNameServers;
    }

    /**
     * @return dnsConfigOptions
     */
    public java.util.List<DnsConfigOptions> getDnsConfigOptions() {
        return this.dnsConfigOptions;
    }

    /**
     * @return dnsConfigSearchs
     */
    public java.util.List<String> getDnsConfigSearchs() {
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
     * @return gpuDriverVersion
     */
    public String getGpuDriverVersion() {
        return this.gpuDriverVersion;
    }

    /**
     * @return hostAliases
     */
    public java.util.List<HostAliases> getHostAliases() {
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
    public java.util.List<ImageRegistryCredentials> getImageRegistryCredentials() {
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
    public java.util.List<InitContainers> getInitContainers() {
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
    public java.util.List<String> getInstanceTypes() {
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
    public java.util.List<String> getNtpServers() {
        return this.ntpServers;
    }

    /**
     * @return override
     */
    public Boolean getOverride() {
        return this.override;
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
     * @return scalingConfigurationId
     */
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    /**
     * @return scalingConfigurationName
     */
    public String getScalingConfigurationName() {
        return this.scalingConfigurationName;
    }

    /**
     * @return securityContextSysCtls
     */
    public java.util.List<SecurityContextSysCtls> getSecurityContextSysCtls() {
        return this.securityContextSysCtls;
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
    public java.util.List<Tags> getTags() {
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
    public java.util.List<Volumes> getVolumes() {
        return this.volumes;
    }

    public static final class Builder extends Request.Builder<ModifyEciScalingConfigurationRequest, Builder> {
        private java.util.List<AcrRegistryInfos> acrRegistryInfos; 
        private Long activeDeadlineSeconds; 
        private Boolean autoCreateEip; 
        private Boolean autoMatchImageCache; 
        private String containerGroupName; 
        private java.util.List<Containers> containers; 
        private String containersUpdateType; 
        private Boolean costOptimization; 
        private Float cpu; 
        private Integer cpuOptionsCore; 
        private Integer cpuOptionsThreadsPerCore; 
        private String dataCacheBucket; 
        private Boolean dataCacheBurstingEnabled; 
        private String dataCachePL; 
        private Integer dataCacheProvisionedIops; 
        private String description; 
        private java.util.List<String> dnsConfigNameServers; 
        private java.util.List<DnsConfigOptions> dnsConfigOptions; 
        private java.util.List<String> dnsConfigSearchs; 
        private String dnsPolicy; 
        private Long egressBandwidth; 
        private Integer eipBandwidth; 
        private Boolean enableSls; 
        private Integer ephemeralStorage; 
        private String gpuDriverVersion; 
        private java.util.List<HostAliases> hostAliases; 
        private String hostName; 
        private java.util.List<ImageRegistryCredentials> imageRegistryCredentials; 
        private String imageSnapshotId; 
        private Long ingressBandwidth; 
        private java.util.List<InitContainers> initContainers; 
        private String instanceFamilyLevel; 
        private java.util.List<String> instanceTypes; 
        private Integer ipv6AddressCount; 
        private Integer loadBalancerWeight; 
        private Float memory; 
        private java.util.List<String> ntpServers; 
        private Boolean override; 
        private Long ownerId; 
        private String ramRoleName; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private String restartPolicy; 
        private String scalingConfigurationId; 
        private String scalingConfigurationName; 
        private java.util.List<SecurityContextSysCtls> securityContextSysCtls; 
        private String securityGroupId; 
        private Float spotPriceLimit; 
        private String spotStrategy; 
        private java.util.List<Tags> tags; 
        private Long terminationGracePeriodSeconds; 
        private java.util.List<Volumes> volumes; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEciScalingConfigurationRequest request) {
            super(request);
            this.acrRegistryInfos = request.acrRegistryInfos;
            this.activeDeadlineSeconds = request.activeDeadlineSeconds;
            this.autoCreateEip = request.autoCreateEip;
            this.autoMatchImageCache = request.autoMatchImageCache;
            this.containerGroupName = request.containerGroupName;
            this.containers = request.containers;
            this.containersUpdateType = request.containersUpdateType;
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
            this.gpuDriverVersion = request.gpuDriverVersion;
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
            this.override = request.override;
            this.ownerId = request.ownerId;
            this.ramRoleName = request.ramRoleName;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.restartPolicy = request.restartPolicy;
            this.scalingConfigurationId = request.scalingConfigurationId;
            this.scalingConfigurationName = request.scalingConfigurationName;
            this.securityContextSysCtls = request.securityContextSysCtls;
            this.securityGroupId = request.securityGroupId;
            this.spotPriceLimit = request.spotPriceLimit;
            this.spotStrategy = request.spotStrategy;
            this.tags = request.tags;
            this.terminationGracePeriodSeconds = request.terminationGracePeriodSeconds;
            this.volumes = request.volumes;
        } 

        /**
         * <p>The information about ACR Enterprise Edition instances.</p>
         */
        public Builder acrRegistryInfos(java.util.List<AcrRegistryInfos> acrRegistryInfos) {
            this.putQueryParameter("AcrRegistryInfos", acrRegistryInfos);
            this.acrRegistryInfos = acrRegistryInfos;
            return this;
        }

        /**
         * <p>The validity period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder activeDeadlineSeconds(Long activeDeadlineSeconds) {
            this.putQueryParameter("ActiveDeadlineSeconds", activeDeadlineSeconds);
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        /**
         * <p>Specifies whether automatic creation of an elastic IP address (EIP) is enabled and the EIP is attached to the ECI instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoCreateEip(Boolean autoCreateEip) {
            this.putQueryParameter("AutoCreateEip", autoCreateEip);
            this.autoCreateEip = autoCreateEip;
            return this;
        }

        /**
         * <p>Specifies whether to automatically match an image cache.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoMatchImageCache(Boolean autoMatchImageCache) {
            this.putQueryParameter("AutoMatchImageCache", autoMatchImageCache);
            this.autoMatchImageCache = autoMatchImageCache;
            return this;
        }

        /**
         * <p>The name of the ECI, which is the name of the container group. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length.</li>
         * <li>The name can contain lowercase letters, digits, and hyphens (-), and cannot start or end with a hyphen (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nginx-test</p>
         */
        public Builder containerGroupName(String containerGroupName) {
            this.putQueryParameter("ContainerGroupName", containerGroupName);
            this.containerGroupName = containerGroupName;
            return this;
        }

        /**
         * <p>The list of containers.</p>
         */
        public Builder containers(java.util.List<Containers> containers) {
            this.putQueryParameter("Containers", containers);
            this.containers = containers;
            return this;
        }

        /**
         * <p>The control parameter for the update method of the Containers parameter. Valid values:</p>
         * <ul>
         * <li>RenewUpdate: full update. The Containers parameter in the update request prevails and overwrites the original Containers parameter configuration.</li>
         * <li>IncrementalUpdate: incremental update. Containers are matched based on Container.name, and only the parameters specified in the request are updated.</li>
         * </ul>
         * <p>Default value: RenewUpdate.</p>
         * 
         * <strong>example:</strong>
         * <p>RenewUpdate</p>
         */
        public Builder containersUpdateType(String containersUpdateType) {
            this.putQueryParameter("ContainersUpdateType", containersUpdateType);
            this.containersUpdateType = containersUpdateType;
            return this;
        }

        /**
         * <p>Specifies whether to enable cost optimization. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder costOptimization(Boolean costOptimization) {
            this.putQueryParameter("CostOptimization", costOptimization);
            this.costOptimization = costOptimization;
            return this;
        }

        /**
         * <p>The number of vCPUs for the instance. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder cpu(Float cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The number of physical CPU cores. Only specific instance types support custom settings. For more information, see <a href="https://help.aliyun.com/document_detail/197781.html">Customize CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpuOptionsCore(Integer cpuOptionsCore) {
            this.putQueryParameter("CpuOptionsCore", cpuOptionsCore);
            this.cpuOptionsCore = cpuOptionsCore;
            return this;
        }

        /**
         * <p>The number of threads per core. Only specific instance types support custom settings. A value of 1 indicates that hyper-threading is disabled. For more information, see <a href="https://help.aliyun.com/document_detail/197781.html">Customize CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
            this.putQueryParameter("CpuOptionsThreadsPerCore", cpuOptionsThreadsPerCore);
            this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
            return this;
        }

        /**
         * <p>The data cache bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder dataCacheBucket(String dataCacheBucket) {
            this.putQueryParameter("DataCacheBucket", dataCacheBucket);
            this.dataCacheBucket = dataCacheBucket;
            return this;
        }

        /**
         * <p>Specifies whether to enable the burst feature for the ESSD AutoPL cloud disk used for data caching. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>For more information about ESSD AutoPL cloud disks, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dataCacheBurstingEnabled(Boolean dataCacheBurstingEnabled) {
            this.putQueryParameter("DataCacheBurstingEnabled", dataCacheBurstingEnabled);
            this.dataCacheBurstingEnabled = dataCacheBurstingEnabled;
            return this;
        }

        /**
         * <p>The performance level of the cloud disk used for data caching. Use ESSDs. Valid values for the performance level of an ESSD:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>Default value: PL1.</p>
         * <blockquote>
         * <p>For more information about ESSDs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder dataCachePL(String dataCachePL) {
            this.putQueryParameter("DataCachePL", dataCachePL);
            this.dataCachePL = dataCachePL;
            return this;
        }

        /**
         * <p>The provisioned read and write IOPS of the ESSD AutoPL cloud disk used for data caching. Valid values: 0 to min{50000, 1000 × capacity - baseline performance}, where baseline performance = min{1800 + 50 × capacity, 50000}.</p>
         * <blockquote>
         * <p>For more information about ESSD AutoPL cloud disks, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        public Builder dataCacheProvisionedIops(Integer dataCacheProvisionedIops) {
            this.putQueryParameter("DataCacheProvisionedIops", dataCacheProvisionedIops);
            this.dataCacheProvisionedIops = dataCacheProvisionedIops;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The list of IP addresses of DNS servers.</p>
         */
        public Builder dnsConfigNameServers(java.util.List<String> dnsConfigNameServers) {
            this.putQueryParameter("DnsConfigNameServers", dnsConfigNameServers);
            this.dnsConfigNameServers = dnsConfigNameServers;
            return this;
        }

        /**
         * <p>The list of object options. Each object consists of a Name and an optional Value.</p>
         */
        public Builder dnsConfigOptions(java.util.List<DnsConfigOptions> dnsConfigOptions) {
            this.putQueryParameter("DnsConfigOptions", dnsConfigOptions);
            this.dnsConfigOptions = dnsConfigOptions;
            return this;
        }

        /**
         * <p>The list of DNS search domains.</p>
         */
        public Builder dnsConfigSearchs(java.util.List<String> dnsConfigSearchs) {
            this.putQueryParameter("DnsConfigSearchs", dnsConfigSearchs);
            this.dnsConfigSearchs = dnsConfigSearchs;
            return this;
        }

        /**
         * <p>The DNS policy. Valid values:</p>
         * <ul>
         * <li><p>None: uses the DNS settings specified in the DnsConfig field.</p>
         * </li>
         * <li><p>Default: inherits the DNS settings from the runtime environment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder dnsPolicy(String dnsPolicy) {
            this.putQueryParameter("DnsPolicy", dnsPolicy);
            this.dnsPolicy = dnsPolicy;
            return this;
        }

        /**
         * <p>The outbound bandwidth limit. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000</p>
         */
        public Builder egressBandwidth(Long egressBandwidth) {
            this.putQueryParameter("EgressBandwidth", egressBandwidth);
            this.egressBandwidth = egressBandwidth;
            return this;
        }

        /**
         * <p>The bandwidth of the EIP.</p>
         * <p>Default value: 5 Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder eipBandwidth(Integer eipBandwidth) {
            this.putQueryParameter("EipBandwidth", eipBandwidth);
            this.eipBandwidth = eipBandwidth;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableSls(Boolean enableSls) {
            this.putQueryParameter("EnableSls", enableSls);
            this.enableSls = enableSls;
            return this;
        }

        /**
         * <p>The size of the temporary storage space. By default, PL1 ESSDs are used. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder ephemeralStorage(Integer ephemeralStorage) {
            this.putQueryParameter("EphemeralStorage", ephemeralStorage);
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }

        /**
         * <p>The specified GPU driver version. Valid values:</p>
         * <ul>
         * <li>tesla=470.82.01 (default)</li>
         * <li>tesla=525.85.12</li>
         * </ul>
         * <blockquote>
         * <p>Only specific instance types support switching the GPU driver version. For more information, see <a href="https://help.aliyun.com/document_detail/2579486.html">Create an instance by specifying a GPU instance type</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tesla=525.85.12</p>
         */
        public Builder gpuDriverVersion(String gpuDriverVersion) {
            this.putQueryParameter("GpuDriverVersion", gpuDriverVersion);
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }

        /**
         * <p>The host-related information.</p>
         */
        public Builder hostAliases(java.util.List<HostAliases> hostAliases) {
            this.putQueryParameter("HostAliases", hostAliases);
            this.hostAliases = hostAliases;
            return this;
        }

        /**
         * <p>The hostname, which is the name of the container group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The details of the image registry.</p>
         */
        public Builder imageRegistryCredentials(java.util.List<ImageRegistryCredentials> imageRegistryCredentials) {
            this.putQueryParameter("ImageRegistryCredentials", imageRegistryCredentials);
            this.imageRegistryCredentials = imageRegistryCredentials;
            return this;
        }

        /**
         * <p>The ID of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>imc-2zebxkiifuyzzlhl****</p>
         */
        public Builder imageSnapshotId(String imageSnapshotId) {
            this.putQueryParameter("ImageSnapshotId", imageSnapshotId);
            this.imageSnapshotId = imageSnapshotId;
            return this;
        }

        /**
         * <p>The inbound bandwidth limit. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000</p>
         */
        public Builder ingressBandwidth(Long ingressBandwidth) {
            this.putQueryParameter("IngressBandwidth", ingressBandwidth);
            this.ingressBandwidth = ingressBandwidth;
            return this;
        }

        /**
         * <p>The list of init containers.</p>
         */
        public Builder initContainers(java.util.List<InitContainers> initContainers) {
            this.putQueryParameter("InitContainers", initContainers);
            this.initContainers = initContainers;
            return this;
        }

        /**
         * <p>The level of the instance family. This parameter is used to filter instance types that meet your requirements and takes effect only when CostOptimization is set to true. Valid values:</p>
         * <ul>
         * <li>EntryLevel: shared instance types. Shared instance types are more cost-effective but cannot guarantee stable computing performance. They are suitable for business scenarios with low CPU utilization. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
         * <li>EnterpriseLevel: enterprise-level instance types. Enterprise-level instance types provide stable performance and dedicated resources. They are suitable for business scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
         * <li>CreditEntryLevel: burstable instance types. Burstable instance types use CPU credits to ensure computing performance. They are suitable for business scenarios with low CPU utilization but occasional CPU usage spikes. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * <p>The specified ECS instance types. You can specify up to five instance types.</p>
         */
        public Builder instanceTypes(java.util.List<String> instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>The number of IPv6 addresses.</p>
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
         * <p>The weight of the backend server. Valid values: 1 to 100.</p>
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
         * <p>The memory size for the instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * <p>The NTP server.</p>
         */
        public Builder ntpServers(java.util.List<String> ntpServers) {
            this.putQueryParameter("NtpServers", ntpServers);
            this.ntpServers = ntpServers;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite. Valid values:</p>
         * <ul>
         * <li>true: Overwrite.</li>
         * <li>false: Do not overwrite.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder override(Boolean override) {
            this.putQueryParameter("Override", override);
            this.override = override;
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
         * <p>The name of the RAM role for the instance. ECIs and ECS instances share the same instance RAM roles. For more information, see <a href="https://help.aliyun.com/document_detail/61178.html">Use an instance RAM role by calling API operations</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>RamTestRole</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-uf66jeqopgqa9hdn****</p>
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
         * <p>The restart policy of the instance. Valid values:</p>
         * <ul>
         * <li>Always: always restarts the instance.</li>
         * <li>Never: never restarts the instance.</li>
         * <li>OnFailure: restarts the instance when it fails.</li>
         * </ul>
         * <p>Default value: Always.</p>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        public Builder restartPolicy(String restartPolicy) {
            this.putQueryParameter("RestartPolicy", restartPolicy);
            this.restartPolicy = restartPolicy;
            return this;
        }

        /**
         * <p>The ID of the scaling configuration to be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asc-bp16har3jpj6fjbx****</p>
         */
        public Builder scalingConfigurationId(String scalingConfigurationId) {
            this.putQueryParameter("ScalingConfigurationId", scalingConfigurationId);
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }

        /**
         * <p>The name of the scaling configuration. The name must be 2 to 64 characters in length, and can contain digits, letters, and Chinese characters. It must start with a digit, a letter, or a Chinese character, and can contain digits, underscores (_), hyphens (-), and periods (.).</p>
         * <p>The name of a scaling configuration must be unique within a scaling group in a region. If you do not specify this parameter, the ID of the scaling configuration is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>test-modify</p>
         */
        public Builder scalingConfigurationName(String scalingConfigurationName) {
            this.putQueryParameter("ScalingConfigurationName", scalingConfigurationName);
            this.scalingConfigurationName = scalingConfigurationName;
            return this;
        }

        /**
         * <p>The system information of the contextual security context in which the instance runs.</p>
         */
        public Builder securityContextSysCtls(java.util.List<SecurityContextSysCtls> securityContextSysCtls) {
            this.putQueryParameter("SecurityContextSysCtls", securityContextSysCtls);
            this.securityContextSysCtls = securityContextSysCtls;
            return this;
        }

        /**
         * <p>The ID of the security group to which the ECI instance belongs. ECI instances in the same security group can access each other.</p>
         * <p>If you do not specify a security group, the system automatically uses the default security group in the selected region. You must ensure that the inbound rules of the security group include the protocols and ports that the containers need to expose. If no default security group exists in the region, the system performs automatic creation of a default security group and adds the declared container protocols and ports to the inbound rules of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-uf66jeqopgqa9hdn****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The maximum hourly price for the spot instance. The value can be accurate to three decimal places.</p>
         * <p>This parameter is required when SpotStrategy is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.025</p>
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * <p>The preemption policy for the instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: applies to regular pay-as-you-go instances.</li>
         * <li>SpotWithPriceLimit: applies to spot instances that have maximum hourly prices.</li>
         * <li>SpotAsPriceGo: applies to spot instances whose prices are automatically set by the system based on the current market price.</li>
         * </ul>
         * <p>Default value: NoSpot.</p>
         * 
         * <strong>example:</strong>
         * <p>SpotPriceLimit</p>
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The buffer time for the program to handle operations before shutdown. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder terminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
            this.putQueryParameter("TerminationGracePeriodSeconds", terminationGracePeriodSeconds);
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        /**
         * <p>The volume information.</p>
         */
        public Builder volumes(java.util.List<Volumes> volumes) {
            this.putQueryParameter("Volumes", volumes);
            this.volumes = volumes;
            return this;
        }

        @Override
        public ModifyEciScalingConfigurationRequest build() {
            return new ModifyEciScalingConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class AcrRegistryInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domains")
        private java.util.List<String> domains;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
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
        public java.util.List<String> getDomains() {
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
            private java.util.List<String> domains; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(AcrRegistryInfos model) {
                this.domains = model.domains;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The domain names of the ACR Enterprise Edition instance. By default, all domain names of the instance are used. You can specify individual domain names and separate multiple domain names with commas (,).</p>
             */
            public Builder domains(java.util.List<String> domains) {
                this.domains = domains;
                return this;
            }

            /**
             * <p>The ID of the ACR Enterprise Edition instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-nwj395hgf6f3****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the ACR Enterprise Edition instance.</p>
             * 
             * <strong>example:</strong>
             * <p>acr-test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The region ID of the ACR Enterprise Edition instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class Exec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List<String> commands;

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
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public static final class Builder {
            private java.util.List<String> commands; 

            private Builder() {
            } 

            private Builder(Exec model) {
                this.commands = model.commands;
            } 

            /**
             * <p>The command executed in the container when the exec action is used for health checks.</p>
             */
            public Builder commands(java.util.List<String> commands) {
                this.commands = commands;
                return this;
            }

            public Exec build() {
                return new Exec(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class HttpGet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Scheme")
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

            private Builder() {
            } 

            private Builder(HttpGet model) {
                this.path = model.path;
                this.port = model.port;
                this.scheme = model.scheme;
            } 

            /**
             * <p>The path to which the HTTP GET request is sent when HTTP GET is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>/healthyz</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The port number to which the HTTP GET request is sent when HTTP GET is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>8888</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type of the HTTP GET request when HTTP GET is used for health checks. Valid values:</p>
             * <ul>
             * <li>HTTP</li>
             * <li>HTTPS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class TcpSocket extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
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

            private Builder() {
            } 

            private Builder(TcpSocket model) {
                this.port = model.port;
            } 

            /**
             * <p>The port number on which the TCP socket check is performed when TCP socket is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class LivenessProbe extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Exec")
        @com.aliyun.core.annotation.Validation(required = true)
        private Exec exec;

        @com.aliyun.core.annotation.NameInMap("FailureThreshold")
        private Integer failureThreshold;

        @com.aliyun.core.annotation.NameInMap("HttpGet")
        @com.aliyun.core.annotation.Validation(required = true)
        private HttpGet httpGet;

        @com.aliyun.core.annotation.NameInMap("InitialDelaySeconds")
        private Integer initialDelaySeconds;

        @com.aliyun.core.annotation.NameInMap("PeriodSeconds")
        private Integer periodSeconds;

        @com.aliyun.core.annotation.NameInMap("SuccessThreshold")
        private Integer successThreshold;

        @com.aliyun.core.annotation.NameInMap("TcpSocket")
        @com.aliyun.core.annotation.Validation(required = true)
        private TcpSocket tcpSocket;

        @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
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

            private Builder() {
            } 

            private Builder(LivenessProbe model) {
                this.exec = model.exec;
                this.failureThreshold = model.failureThreshold;
                this.httpGet = model.httpGet;
                this.initialDelaySeconds = model.initialDelaySeconds;
                this.periodSeconds = model.periodSeconds;
                this.successThreshold = model.successThreshold;
                this.tcpSocket = model.tcpSocket;
                this.timeoutSeconds = model.timeoutSeconds;
            } 

            /**
             * Exec.
             */
            public Builder exec(Exec exec) {
                this.exec = exec;
                return this;
            }

            /**
             * <p>The minimum consecutive failures for the liveness check to be considered failed after having succeeded.</p>
             * <p>Default value: 3.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
             * <p>The number of seconds after the container has started before the readiness check is initiated.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder initialDelaySeconds(Integer initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * <p>The period for executing the liveness check, in seconds. Default value: 10. Minimum value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * <p>The minimum consecutive successes for the liveness check to be considered successful after having failed. Default value: 1. The value must be 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The timeout period for the readiness check, in seconds. Default value: 1. Minimum value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class ReadinessProbeExec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List<String> commands;

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
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public static final class Builder {
            private java.util.List<String> commands; 

            private Builder() {
            } 

            private Builder(ReadinessProbeExec model) {
                this.commands = model.commands;
            } 

            /**
             * <p>The command executed in the container when the exec action is used for health checks.</p>
             */
            public Builder commands(java.util.List<String> commands) {
                this.commands = commands;
                return this;
            }

            public ReadinessProbeExec build() {
                return new ReadinessProbeExec(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class ReadinessProbeHttpGet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Scheme")
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

            private Builder() {
            } 

            private Builder(ReadinessProbeHttpGet model) {
                this.path = model.path;
                this.port = model.port;
                this.scheme = model.scheme;
            } 

            /**
             * <p>The path to which the HTTP GET request is sent when HTTP GET is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>/healthz</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The port number to which the HTTP GET request is sent when HTTP GET is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type of the HTTP GET request when HTTP GET is used for health checks. Valid values:</p>
             * <ul>
             * <li>HTTP</li>
             * <li>HTTPS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class ReadinessProbeTcpSocket extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
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

            private Builder() {
            } 

            private Builder(ReadinessProbeTcpSocket model) {
                this.port = model.port;
            } 

            /**
             * <p>The port number on which the TCP socket check is performed when TCP socket is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>8000</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class ReadinessProbe extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Exec")
        @com.aliyun.core.annotation.Validation(required = true)
        private ReadinessProbeExec exec;

        @com.aliyun.core.annotation.NameInMap("FailureThreshold")
        private Integer failureThreshold;

        @com.aliyun.core.annotation.NameInMap("HttpGet")
        @com.aliyun.core.annotation.Validation(required = true)
        private ReadinessProbeHttpGet httpGet;

        @com.aliyun.core.annotation.NameInMap("InitialDelaySeconds")
        private Integer initialDelaySeconds;

        @com.aliyun.core.annotation.NameInMap("PeriodSeconds")
        private Integer periodSeconds;

        @com.aliyun.core.annotation.NameInMap("SuccessThreshold")
        private Integer successThreshold;

        @com.aliyun.core.annotation.NameInMap("TcpSocket")
        @com.aliyun.core.annotation.Validation(required = true)
        private ReadinessProbeTcpSocket tcpSocket;

        @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
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

            private Builder() {
            } 

            private Builder(ReadinessProbe model) {
                this.exec = model.exec;
                this.failureThreshold = model.failureThreshold;
                this.httpGet = model.httpGet;
                this.initialDelaySeconds = model.initialDelaySeconds;
                this.periodSeconds = model.periodSeconds;
                this.successThreshold = model.successThreshold;
                this.tcpSocket = model.tcpSocket;
                this.timeoutSeconds = model.timeoutSeconds;
            } 

            /**
             * Exec.
             */
            public Builder exec(ReadinessProbeExec exec) {
                this.exec = exec;
                return this;
            }

            /**
             * <p>The minimum consecutive failures for the liveness check to be considered failed after having succeeded.</p>
             * <p>Default value: 3.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
             * <p>The number of seconds after the container has started before the readiness check is initiated.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder initialDelaySeconds(Integer initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * <p>The period for executing the liveness check, in seconds. Default value: 10. Minimum value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * <p>The minimum consecutive successes for the readiness check to be considered successful after having failed. Default value: 1. The value must be 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The timeout period for the readiness check, in seconds. Default value: 1. Minimum value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class Capability extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Adds")
        private java.util.List<String> adds;

        private Capability(Builder builder) {
            this.adds = builder.adds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capability create() {
            return builder().build();
        }

        /**
         * @return adds
         */
        public java.util.List<String> getAdds() {
            return this.adds;
        }

        public static final class Builder {
            private java.util.List<String> adds; 

            private Builder() {
            } 

            private Builder(Capability model) {
                this.adds = model.adds;
            } 

            /**
             * <p>Grants specific privileges to processes in the container. Valid values: NET_ADMIN and NET_RAW.</p>
             * <blockquote>
             * <p>NET_RAW is not supported by default. To use NET_RAW, submit a ticket.</p>
             * </blockquote>
             */
            public Builder adds(java.util.List<String> adds) {
                this.adds = adds;
                return this;
            }

            public Capability build() {
                return new Capability(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class SecurityContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capability")
        @com.aliyun.core.annotation.Validation(required = true)
        private Capability capability;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyRootFilesystem")
        private Boolean readOnlyRootFilesystem;

        @com.aliyun.core.annotation.NameInMap("RunAsUser")
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

            private Builder() {
            } 

            private Builder(SecurityContext model) {
                this.capability = model.capability;
                this.readOnlyRootFilesystem = model.readOnlyRootFilesystem;
                this.runAsUser = model.runAsUser;
            } 

            /**
             * Capability.
             */
            public Builder capability(Capability capability) {
                this.capability = capability;
                return this;
            }

            /**
             * <p>Specifies whether the root file system of the container is read-only. Only true is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
                this.readOnlyRootFilesystem = readOnlyRootFilesystem;
                return this;
            }

            /**
             * <p>The user ID to run the container.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class FieldRef extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldPath")
        private String fieldPath;

        private FieldRef(Builder builder) {
            this.fieldPath = builder.fieldPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldRef create() {
            return builder().build();
        }

        /**
         * @return fieldPath
         */
        public String getFieldPath() {
            return this.fieldPath;
        }

        public static final class Builder {
            private String fieldPath; 

            private Builder() {
            } 

            private Builder(FieldRef model) {
                this.fieldPath = model.fieldPath;
            } 

            /**
             * <blockquote>
             * <p>This parameter is not available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>path</p>
             */
            public Builder fieldPath(String fieldPath) {
                this.fieldPath = fieldPath;
                return this;
            }

            public FieldRef build() {
                return new FieldRef(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class EnvironmentVars extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldRef")
        private FieldRef fieldRef;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private EnvironmentVars(Builder builder) {
            this.fieldRef = builder.fieldRef;
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
         * @return fieldRef
         */
        public FieldRef getFieldRef() {
            return this.fieldRef;
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
            private FieldRef fieldRef; 
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(EnvironmentVars model) {
                this.fieldRef = model.fieldRef;
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * FieldRef.
             */
            public Builder fieldRef(FieldRef fieldRef) {
                this.fieldRef = fieldRef;
                return this;
            }

            /**
             * <p>The name of the environment variable. The name must be 1 to 128 characters in length, match the <code>[0-9a-zA-Z]</code> format, and can contain underscores (_). It cannot start with a digit.</p>
             * 
             * <strong>example:</strong>
             * <p>PATH</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the environment variable. The value can be up to 256 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/bin</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
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

            private Builder() {
            } 

            private Builder(Ports model) {
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The port number. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type. Valid values:</p>
             * <ul>
             * <li>TCP</li>
             * <li>UDP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class VolumeMounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("MountPropagation")
        private String mountPropagation;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("SubPath")
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

            private Builder() {
            } 

            private Builder(VolumeMounts model) {
                this.mountPath = model.mountPath;
                this.mountPropagation = model.mountPropagation;
                this.name = model.name;
                this.readOnly = model.readOnly;
                this.subPath = model.subPath;
            } 

            /**
             * <p>The directory where the volume is mounted in the container.</p>
             * <blockquote>
             * <p>The contents of the mount path in the container are directly overwritten by the contents of the volume. Use this parameter with caution.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/pod/data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The mount propagation settings for the volume. Mount propagation allows volumes mounted by a container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
             * <ul>
             * <li>None: The volume does not receive any subsequent mounts that are performed on the volume or its subdirectories.</li>
             * <li>HostToCotainer: The volume receives all subsequent mounts that are performed on the volume or its subdirectories.</li>
             * <li>Bidirectional: Similar to HostToContainer, the volume receives all subsequent mounts. In addition, all mounts created by the container are propagated back to the host and to all containers of all pods that use the same volume.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * <p>The name of the volume. The value must be the same as the Name parameter in Volume.</p>
             * 
             * <strong>example:</strong>
             * <p>default-volume1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether the volume is read-only.</p>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>The subpath of the volume.</p>
             * 
             * <strong>example:</strong>
             * <p>data2/</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class Containers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LivenessProbe")
        private LivenessProbe livenessProbe;

        @com.aliyun.core.annotation.NameInMap("ReadinessProbe")
        private ReadinessProbe readinessProbe;

        @com.aliyun.core.annotation.NameInMap("SecurityContext")
        private SecurityContext securityContext;

        @com.aliyun.core.annotation.NameInMap("Args")
        private java.util.List<String> args;

        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List<String> commands;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVars")
        private java.util.List<EnvironmentVars> environmentVars;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerExecs")
        private java.util.List<String> lifecyclePostStartHandlerExecs;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerHttpGetHost")
        private String lifecyclePostStartHandlerHttpGetHost;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerHttpGetPath")
        private String lifecyclePostStartHandlerHttpGetPath;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerHttpGetPort")
        private Integer lifecyclePostStartHandlerHttpGetPort;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerHttpGetScheme")
        private String lifecyclePostStartHandlerHttpGetScheme;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        private String lifecyclePostStartHandlerTcpSocketHost;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        private Integer lifecyclePostStartHandlerTcpSocketPort;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerExecs")
        private java.util.List<String> lifecyclePreStopHandlerExecs;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerHttpGetHost")
        private String lifecyclePreStopHandlerHttpGetHost;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerHttpGetPath")
        private String lifecyclePreStopHandlerHttpGetPath;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerHttpGetPort")
        private Integer lifecyclePreStopHandlerHttpGetPort;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerHttpGetScheme")
        private String lifecyclePreStopHandlerHttpGetScheme;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        private String lifecyclePreStopHandlerTcpSocketHost;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        private Integer lifecyclePreStopHandlerTcpSocketPort;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private java.util.List<Ports> ports;

        @com.aliyun.core.annotation.NameInMap("Stdin")
        private Boolean stdin;

        @com.aliyun.core.annotation.NameInMap("StdinOnce")
        private Boolean stdinOnce;

        @com.aliyun.core.annotation.NameInMap("Tty")
        private Boolean tty;

        @com.aliyun.core.annotation.NameInMap("VolumeMounts")
        private java.util.List<VolumeMounts> volumeMounts;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
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
            this.lifecyclePostStartHandlerExecs = builder.lifecyclePostStartHandlerExecs;
            this.lifecyclePostStartHandlerHttpGetHost = builder.lifecyclePostStartHandlerHttpGetHost;
            this.lifecyclePostStartHandlerHttpGetPath = builder.lifecyclePostStartHandlerHttpGetPath;
            this.lifecyclePostStartHandlerHttpGetPort = builder.lifecyclePostStartHandlerHttpGetPort;
            this.lifecyclePostStartHandlerHttpGetScheme = builder.lifecyclePostStartHandlerHttpGetScheme;
            this.lifecyclePostStartHandlerTcpSocketHost = builder.lifecyclePostStartHandlerTcpSocketHost;
            this.lifecyclePostStartHandlerTcpSocketPort = builder.lifecyclePostStartHandlerTcpSocketPort;
            this.lifecyclePreStopHandlerExecs = builder.lifecyclePreStopHandlerExecs;
            this.lifecyclePreStopHandlerHttpGetHost = builder.lifecyclePreStopHandlerHttpGetHost;
            this.lifecyclePreStopHandlerHttpGetPath = builder.lifecyclePreStopHandlerHttpGetPath;
            this.lifecyclePreStopHandlerHttpGetPort = builder.lifecyclePreStopHandlerHttpGetPort;
            this.lifecyclePreStopHandlerHttpGetScheme = builder.lifecyclePreStopHandlerHttpGetScheme;
            this.lifecyclePreStopHandlerTcpSocketHost = builder.lifecyclePreStopHandlerTcpSocketHost;
            this.lifecyclePreStopHandlerTcpSocketPort = builder.lifecyclePreStopHandlerTcpSocketPort;
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
        public java.util.List<String> getArgs() {
            return this.args;
        }

        /**
         * @return commands
         */
        public java.util.List<String> getCommands() {
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
        public java.util.List<EnvironmentVars> getEnvironmentVars() {
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
         * @return lifecyclePostStartHandlerExecs
         */
        public java.util.List<String> getLifecyclePostStartHandlerExecs() {
            return this.lifecyclePostStartHandlerExecs;
        }

        /**
         * @return lifecyclePostStartHandlerHttpGetHost
         */
        public String getLifecyclePostStartHandlerHttpGetHost() {
            return this.lifecyclePostStartHandlerHttpGetHost;
        }

        /**
         * @return lifecyclePostStartHandlerHttpGetPath
         */
        public String getLifecyclePostStartHandlerHttpGetPath() {
            return this.lifecyclePostStartHandlerHttpGetPath;
        }

        /**
         * @return lifecyclePostStartHandlerHttpGetPort
         */
        public Integer getLifecyclePostStartHandlerHttpGetPort() {
            return this.lifecyclePostStartHandlerHttpGetPort;
        }

        /**
         * @return lifecyclePostStartHandlerHttpGetScheme
         */
        public String getLifecyclePostStartHandlerHttpGetScheme() {
            return this.lifecyclePostStartHandlerHttpGetScheme;
        }

        /**
         * @return lifecyclePostStartHandlerTcpSocketHost
         */
        public String getLifecyclePostStartHandlerTcpSocketHost() {
            return this.lifecyclePostStartHandlerTcpSocketHost;
        }

        /**
         * @return lifecyclePostStartHandlerTcpSocketPort
         */
        public Integer getLifecyclePostStartHandlerTcpSocketPort() {
            return this.lifecyclePostStartHandlerTcpSocketPort;
        }

        /**
         * @return lifecyclePreStopHandlerExecs
         */
        public java.util.List<String> getLifecyclePreStopHandlerExecs() {
            return this.lifecyclePreStopHandlerExecs;
        }

        /**
         * @return lifecyclePreStopHandlerHttpGetHost
         */
        public String getLifecyclePreStopHandlerHttpGetHost() {
            return this.lifecyclePreStopHandlerHttpGetHost;
        }

        /**
         * @return lifecyclePreStopHandlerHttpGetPath
         */
        public String getLifecyclePreStopHandlerHttpGetPath() {
            return this.lifecyclePreStopHandlerHttpGetPath;
        }

        /**
         * @return lifecyclePreStopHandlerHttpGetPort
         */
        public Integer getLifecyclePreStopHandlerHttpGetPort() {
            return this.lifecyclePreStopHandlerHttpGetPort;
        }

        /**
         * @return lifecyclePreStopHandlerHttpGetScheme
         */
        public String getLifecyclePreStopHandlerHttpGetScheme() {
            return this.lifecyclePreStopHandlerHttpGetScheme;
        }

        /**
         * @return lifecyclePreStopHandlerTcpSocketHost
         */
        public String getLifecyclePreStopHandlerTcpSocketHost() {
            return this.lifecyclePreStopHandlerTcpSocketHost;
        }

        /**
         * @return lifecyclePreStopHandlerTcpSocketPort
         */
        public Integer getLifecyclePreStopHandlerTcpSocketPort() {
            return this.lifecyclePreStopHandlerTcpSocketPort;
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
        public java.util.List<Ports> getPorts() {
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
        public java.util.List<VolumeMounts> getVolumeMounts() {
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
            private java.util.List<String> args; 
            private java.util.List<String> commands; 
            private Float cpu; 
            private java.util.List<EnvironmentVars> environmentVars; 
            private Integer gpu; 
            private String image; 
            private String imagePullPolicy; 
            private java.util.List<String> lifecyclePostStartHandlerExecs; 
            private String lifecyclePostStartHandlerHttpGetHost; 
            private String lifecyclePostStartHandlerHttpGetPath; 
            private Integer lifecyclePostStartHandlerHttpGetPort; 
            private String lifecyclePostStartHandlerHttpGetScheme; 
            private String lifecyclePostStartHandlerTcpSocketHost; 
            private Integer lifecyclePostStartHandlerTcpSocketPort; 
            private java.util.List<String> lifecyclePreStopHandlerExecs; 
            private String lifecyclePreStopHandlerHttpGetHost; 
            private String lifecyclePreStopHandlerHttpGetPath; 
            private Integer lifecyclePreStopHandlerHttpGetPort; 
            private String lifecyclePreStopHandlerHttpGetScheme; 
            private String lifecyclePreStopHandlerTcpSocketHost; 
            private Integer lifecyclePreStopHandlerTcpSocketPort; 
            private Float memory; 
            private String name; 
            private java.util.List<Ports> ports; 
            private Boolean stdin; 
            private Boolean stdinOnce; 
            private Boolean tty; 
            private java.util.List<VolumeMounts> volumeMounts; 
            private String workingDir; 

            private Builder() {
            } 

            private Builder(Containers model) {
                this.livenessProbe = model.livenessProbe;
                this.readinessProbe = model.readinessProbe;
                this.securityContext = model.securityContext;
                this.args = model.args;
                this.commands = model.commands;
                this.cpu = model.cpu;
                this.environmentVars = model.environmentVars;
                this.gpu = model.gpu;
                this.image = model.image;
                this.imagePullPolicy = model.imagePullPolicy;
                this.lifecyclePostStartHandlerExecs = model.lifecyclePostStartHandlerExecs;
                this.lifecyclePostStartHandlerHttpGetHost = model.lifecyclePostStartHandlerHttpGetHost;
                this.lifecyclePostStartHandlerHttpGetPath = model.lifecyclePostStartHandlerHttpGetPath;
                this.lifecyclePostStartHandlerHttpGetPort = model.lifecyclePostStartHandlerHttpGetPort;
                this.lifecyclePostStartHandlerHttpGetScheme = model.lifecyclePostStartHandlerHttpGetScheme;
                this.lifecyclePostStartHandlerTcpSocketHost = model.lifecyclePostStartHandlerTcpSocketHost;
                this.lifecyclePostStartHandlerTcpSocketPort = model.lifecyclePostStartHandlerTcpSocketPort;
                this.lifecyclePreStopHandlerExecs = model.lifecyclePreStopHandlerExecs;
                this.lifecyclePreStopHandlerHttpGetHost = model.lifecyclePreStopHandlerHttpGetHost;
                this.lifecyclePreStopHandlerHttpGetPath = model.lifecyclePreStopHandlerHttpGetPath;
                this.lifecyclePreStopHandlerHttpGetPort = model.lifecyclePreStopHandlerHttpGetPort;
                this.lifecyclePreStopHandlerHttpGetScheme = model.lifecyclePreStopHandlerHttpGetScheme;
                this.lifecyclePreStopHandlerTcpSocketHost = model.lifecyclePreStopHandlerTcpSocketHost;
                this.lifecyclePreStopHandlerTcpSocketPort = model.lifecyclePreStopHandlerTcpSocketPort;
                this.memory = model.memory;
                this.name = model.name;
                this.ports = model.ports;
                this.stdin = model.stdin;
                this.stdinOnce = model.stdinOnce;
                this.tty = model.tty;
                this.volumeMounts = model.volumeMounts;
                this.workingDir = model.workingDir;
            } 

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
             * <p>The arguments for the container startup command. A maximum of 10 arguments are supported.</p>
             */
            public Builder args(java.util.List<String> args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The startup commands for the container. A maximum of 20 commands are supported. Each command can contain up to 256 characters.</p>
             */
            public Builder commands(java.util.List<String> commands) {
                this.commands = commands;
                return this;
            }

            /**
             * <p>The number of vCPUs allocated to the container.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The environment variable information.</p>
             */
            public Builder environmentVars(java.util.List<EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * <p>The number of GPUs allocated to the container.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The container image.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com/eci_open/nginx:latest</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The image pull policy for the container. Valid values:</p>
             * <ul>
             * <li>Always: Always pulls the image.</li>
             * <li>IfNotPresent: Pulls the image only if it is not present locally.</li>
             * <li>Never: Never pulls the image. Only local images are used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Always</p>
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * <p>The command executed in the container when the command line is used for the postStart callback function Settings.</p>
             */
            public Builder lifecyclePostStartHandlerExecs(java.util.List<String> lifecyclePostStartHandlerExecs) {
                this.lifecyclePostStartHandlerExecs = lifecyclePostStartHandlerExecs;
                return this;
            }

            /**
             * <p>The host address that accepts the HTTP GET request when the HTTP request method is used for the postStart callback function Settings.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
                this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
                return this;
            }

            /**
             * <p>The path to which the HTTP GET request is sent when the HTTP request method is used for the postStart callback function Settings.</p>
             * 
             * <strong>example:</strong>
             * <p>/healthyz</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
                this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
                return this;
            }

            /**
             * <p>The port number to which the HTTP GET request is sent when the HTTP request method is used for the postStart callback function Settings.</p>
             * 
             * <strong>example:</strong>
             * <p>5050</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
                this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
                return this;
            }

            /**
             * <p>The protocol type of the HTTP GET request when the HTTP request method is used for the postStart callback function Settings. Valid values:</p>
             * <ul>
             * <li>HTTP</li>
             * <li>HTTPS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTPS</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
                this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
                return this;
            }

            /**
             * <p>The host address on which the TCP socket check is performed when the TCP socket method is used for the postStart callback function Settings.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
                this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
                return this;
            }

            /**
             * <p>The port number on which the TCP socket check is performed when the TCP socket method is used for the postStart callback function Settings.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder lifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
                this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
                return this;
            }

            /**
             * <p>The command executed in the container when the command line is used for the preStop callback function Settings.</p>
             */
            public Builder lifecyclePreStopHandlerExecs(java.util.List<String> lifecyclePreStopHandlerExecs) {
                this.lifecyclePreStopHandlerExecs = lifecyclePreStopHandlerExecs;
                return this;
            }

            /**
             * <p>The host address that accepts the HTTP GET request when the HTTP request method is used for the preStop callback function Settings.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
                this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
                return this;
            }

            /**
             * <p>The path to which the HTTP GET request is sent when the HTTP request method is used for the preStop callback function Settings.</p>
             * 
             * <strong>example:</strong>
             * <p>/healthyz</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
                this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
                return this;
            }

            /**
             * <p>The port number to which the HTTP GET request is sent when the HTTP request method is used for the preStop callback function Settings.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
                this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
                return this;
            }

            /**
             * <p>The protocol type of the HTTP GET request when the HTTP request method is used for the preStop callback function Settings. Valid values:</p>
             * <ul>
             * <li>HTTP</li>
             * <li>HTTPS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
                this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
                return this;
            }

            /**
             * <p>The host address on which the TCP socket check is performed when the TCP socket method is used for the preStop callback function Settings.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
                this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
                return this;
            }

            /**
             * <p>The port number on which the TCP socket check is performed when the TCP socket method is used for the preStop callback function Settings.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder lifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
                this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
                return this;
            }

            /**
             * <p>The memory size of the container, in GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The name of the container image.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The port information.</p>
             */
            public Builder ports(java.util.List<Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>Specifies whether to allocate a buffer for standard input while the container is running. If this parameter is not set, a read from standard input results in an EOF.</p>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder stdin(Boolean stdin) {
                this.stdin = stdin;
                return this;
            }

            /**
             * <p>Specifies whether the standard input stream maintains the enabling status across multiple attached sessions when standard input is true.</p>
             * <p>If StdinOnce is set to true, standard input is opened when the container starts, remains empty until the first client attaches to it, and then maintains the enabling status to accept data until the client disconnects. After the client disconnects, standard input enters shutdown and remains in shutdown until the container is restarted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder stdinOnce(Boolean stdinOnce) {
                this.stdinOnce = stdinOnce;
                return this;
            }

            /**
             * <p>Specifies whether to allocate a TTY for the container. Default value: false.</p>
             * <p>Set this parameter to true when the Command parameter is set to /bin/bash.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder tty(Boolean tty) {
                this.tty = tty;
                return this;
            }

            /**
             * <p>The volume mount information for the container.</p>
             */
            public Builder volumeMounts(java.util.List<VolumeMounts> volumeMounts) {
                this.volumeMounts = volumeMounts;
                return this;
            }

            /**
             * <p>The working directory of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class DnsConfigOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(DnsConfigOptions model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the object variable.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the object variable.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class HostAliases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hostnames")
        private java.util.List<String> hostnames;

        @com.aliyun.core.annotation.NameInMap("Ip")
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
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List<String> hostnames; 
            private String ip; 

            private Builder() {
            } 

            private Builder(HostAliases model) {
                this.hostnames = model.hostnames;
                this.ip = model.ip;
            } 

            /**
             * <p>The hostname to be added.</p>
             */
            public Builder hostnames(java.util.List<String> hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * <p>The IP address to be added.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class ImageRegistryCredentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(ImageRegistryCredentials model) {
                this.password = model.password;
                this.server = model.server;
                this.userName = model.userName;
            } 

            /**
             * <p>The password for the image registry.</p>
             * 
             * <strong>example:</strong>
             * <p>yourpaasword</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The address of the image registry.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-shanghai.aliyuncs.com</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * <p>The username for the image registry.</p>
             * 
             * <strong>example:</strong>
             * <p>yourusername</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class SecurityContextCapability extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Adds")
        private java.util.List<String> adds;

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
        public java.util.List<String> getAdds() {
            return this.adds;
        }

        public static final class Builder {
            private java.util.List<String> adds; 

            private Builder() {
            } 

            private Builder(SecurityContextCapability model) {
                this.adds = model.adds;
            } 

            /**
             * <p>Grants specific privileges to processes in the container. Valid values: NET_ADMIN and NET_RAW.</p>
             * <blockquote>
             * <p>NET_RAW is not supported by default. To use NET_RAW, submit a ticket.</p>
             * </blockquote>
             */
            public Builder adds(java.util.List<String> adds) {
                this.adds = adds;
                return this;
            }

            public SecurityContextCapability build() {
                return new SecurityContextCapability(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class InitContainersSecurityContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capability")
        @com.aliyun.core.annotation.Validation(required = true)
        private SecurityContextCapability capability;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyRootFilesystem")
        private Boolean readOnlyRootFilesystem;

        @com.aliyun.core.annotation.NameInMap("RunAsUser")
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

            private Builder() {
            } 

            private Builder(InitContainersSecurityContext model) {
                this.capability = model.capability;
                this.readOnlyRootFilesystem = model.readOnlyRootFilesystem;
                this.runAsUser = model.runAsUser;
            } 

            /**
             * Capability.
             */
            public Builder capability(SecurityContextCapability capability) {
                this.capability = capability;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
                this.readOnlyRootFilesystem = readOnlyRootFilesystem;
                return this;
            }

            /**
             * <p>The user ID to run the container.</p>
             * 
             * <strong>example:</strong>
             * <p>587</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class InitContainerEnvironmentVarsFieldRef extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldPath")
        private String fieldPath;

        private InitContainerEnvironmentVarsFieldRef(Builder builder) {
            this.fieldPath = builder.fieldPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerEnvironmentVarsFieldRef create() {
            return builder().build();
        }

        /**
         * @return fieldPath
         */
        public String getFieldPath() {
            return this.fieldPath;
        }

        public static final class Builder {
            private String fieldPath; 

            private Builder() {
            } 

            private Builder(InitContainerEnvironmentVarsFieldRef model) {
                this.fieldPath = model.fieldPath;
            } 

            /**
             * <blockquote>
             * <p>This parameter is not available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>path</p>
             */
            public Builder fieldPath(String fieldPath) {
                this.fieldPath = fieldPath;
                return this;
            }

            public InitContainerEnvironmentVarsFieldRef build() {
                return new InitContainerEnvironmentVarsFieldRef(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class InitContainerEnvironmentVars extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldRef")
        private InitContainerEnvironmentVarsFieldRef fieldRef;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private InitContainerEnvironmentVars(Builder builder) {
            this.fieldRef = builder.fieldRef;
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
         * @return fieldRef
         */
        public InitContainerEnvironmentVarsFieldRef getFieldRef() {
            return this.fieldRef;
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
            private InitContainerEnvironmentVarsFieldRef fieldRef; 
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(InitContainerEnvironmentVars model) {
                this.fieldRef = model.fieldRef;
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * FieldRef.
             */
            public Builder fieldRef(InitContainerEnvironmentVarsFieldRef fieldRef) {
                this.fieldRef = fieldRef;
                return this;
            }

            /**
             * <p>The name of the environment variable. The name must be 1 to 128 characters in length. It can contain letters, digits, and underscores (_), and cannot start with a digit.</p>
             * 
             * <strong>example:</strong>
             * <p>Path</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the environment variable. The value can be up to 256 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/bin/</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class InitContainerPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
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

            private Builder() {
            } 

            private Builder(InitContainerPorts model) {
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The port number. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type. Valid values:</p>
             * <ul>
             * <li>TCP</li>
             * <li>UDP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class InitContainerVolumeMounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("MountPropagation")
        private String mountPropagation;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("SubPath")
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

            private Builder() {
            } 

            private Builder(InitContainerVolumeMounts model) {
                this.mountPath = model.mountPath;
                this.mountPropagation = model.mountPropagation;
                this.name = model.name;
                this.readOnly = model.readOnly;
                this.subPath = model.subPath;
            } 

            /**
             * <p>The directory where the volume is mounted in the container.</p>
             * <blockquote>
             * <p>The contents of the mount path in the container are directly overwritten by the contents of the volume. Use this parameter with caution.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/usr/share/</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The mount propagation settings for the volume. Mount propagation allows a volume mounted to a container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
             * <ul>
             * <li>None: The volume is not aware of any subsequent mount operations performed on the volume or its subdirectories.</li>
             * <li>HostToCotainer: The volume is aware of subsequent mount operations performed on the volume or its subdirectories.</li>
             * <li>Bidirectional: Similar to HostToCotainer, the volume is aware of mount operations. In addition, the volume is propagated back to the host and to all containers of all pods that use the same volume.</li>
             * </ul>
             * <p>Default value: None.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * <p>The name of the mounted volume.</p>
             * 
             * <strong>example:</strong>
             * <p>test-empty</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether the mount path is read-only.</p>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>The subdirectory under the volume. This allows a pod to mount different directories under the same volume to different directories in the container.</p>
             * 
             * <strong>example:</strong>
             * <p>Always</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class InitContainers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityContext")
        private InitContainersSecurityContext securityContext;

        @com.aliyun.core.annotation.NameInMap("Args")
        private java.util.List<String> args;

        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List<String> commands;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @com.aliyun.core.annotation.NameInMap("InitContainerEnvironmentVars")
        private java.util.List<InitContainerEnvironmentVars> initContainerEnvironmentVars;

        @com.aliyun.core.annotation.NameInMap("InitContainerPorts")
        private java.util.List<InitContainerPorts> initContainerPorts;

        @com.aliyun.core.annotation.NameInMap("InitContainerVolumeMounts")
        private java.util.List<InitContainerVolumeMounts> initContainerVolumeMounts;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
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
        public java.util.List<String> getArgs() {
            return this.args;
        }

        /**
         * @return commands
         */
        public java.util.List<String> getCommands() {
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
        public java.util.List<InitContainerEnvironmentVars> getInitContainerEnvironmentVars() {
            return this.initContainerEnvironmentVars;
        }

        /**
         * @return initContainerPorts
         */
        public java.util.List<InitContainerPorts> getInitContainerPorts() {
            return this.initContainerPorts;
        }

        /**
         * @return initContainerVolumeMounts
         */
        public java.util.List<InitContainerVolumeMounts> getInitContainerVolumeMounts() {
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
            private java.util.List<String> args; 
            private java.util.List<String> commands; 
            private Float cpu; 
            private Integer gpu; 
            private String image; 
            private String imagePullPolicy; 
            private java.util.List<InitContainerEnvironmentVars> initContainerEnvironmentVars; 
            private java.util.List<InitContainerPorts> initContainerPorts; 
            private java.util.List<InitContainerVolumeMounts> initContainerVolumeMounts; 
            private Float memory; 
            private String name; 
            private String workingDir; 

            private Builder() {
            } 

            private Builder(InitContainers model) {
                this.securityContext = model.securityContext;
                this.args = model.args;
                this.commands = model.commands;
                this.cpu = model.cpu;
                this.gpu = model.gpu;
                this.image = model.image;
                this.imagePullPolicy = model.imagePullPolicy;
                this.initContainerEnvironmentVars = model.initContainerEnvironmentVars;
                this.initContainerPorts = model.initContainerPorts;
                this.initContainerVolumeMounts = model.initContainerVolumeMounts;
                this.memory = model.memory;
                this.name = model.name;
                this.workingDir = model.workingDir;
            } 

            /**
             * SecurityContext.
             */
            public Builder securityContext(InitContainersSecurityContext securityContext) {
                this.securityContext = securityContext;
                return this;
            }

            /**
             * <p>The startup arguments for the container.</p>
             */
            public Builder args(java.util.List<String> args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The startup commands for the container.</p>
             */
            public Builder commands(java.util.List<String> commands) {
                this.commands = commands;
                return this;
            }

            /**
             * <p>The number of vCPUs allocated to the container.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The number of GPUs allocated to the container.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The image used by the container.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The image pull policy for the container. Valid values:</p>
             * <ul>
             * <li>Always: Always pulls the image.</li>
             * <li>IfNotPresent: Pulls the image only if it is not present locally.</li>
             * <li>Never: Never pulls the image. Only local images are used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Always</p>
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * <p>The environment variable information of the init container.</p>
             */
            public Builder initContainerEnvironmentVars(java.util.List<InitContainerEnvironmentVars> initContainerEnvironmentVars) {
                this.initContainerEnvironmentVars = initContainerEnvironmentVars;
                return this;
            }

            /**
             * <p>The port information of the init container.</p>
             */
            public Builder initContainerPorts(java.util.List<InitContainerPorts> initContainerPorts) {
                this.initContainerPorts = initContainerPorts;
                return this;
            }

            /**
             * <p>The array of mount point information for the init container.</p>
             */
            public Builder initContainerVolumeMounts(java.util.List<InitContainerVolumeMounts> initContainerVolumeMounts) {
                this.initContainerVolumeMounts = initContainerVolumeMounts;
                return this;
            }

            /**
             * <p>The memory size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>test-init</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The working directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class SecurityContextSysCtls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SecurityContextSysCtls(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityContextSysCtls create() {
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

            private Builder() {
            } 

            private Builder(SecurityContextSysCtls model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The system name of the security context in which the instance runs.</p>
             * 
             * <strong>example:</strong>
             * <p>kernel.msgmax</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The variable value of the contextual security context in which the instance runs.</p>
             * 
             * <strong>example:</strong>
             * <p>65536</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SecurityContextSysCtls build() {
                return new SecurityContextSysCtls(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>version</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class DiskVolume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("FsType")
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

            private Builder() {
            } 

            private Builder(DiskVolume model) {
                this.diskId = model.diskId;
                this.diskSize = model.diskSize;
                this.fsType = model.fsType;
            } 

            /**
             * <p>The ID of the disk volume.</p>
             * 
             * <strong>example:</strong>
             * <p>d-xx</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The size of the disk volume. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>This file system type is deprecated. Use the FlexVolume.FsType parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>xfs</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class EmptyDirVolume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Medium")
        private String medium;

        @com.aliyun.core.annotation.NameInMap("SizeLimit")
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

            private Builder() {
            } 

            private Builder(EmptyDirVolume model) {
                this.medium = model.medium;
                this.sizeLimit = model.sizeLimit;
            } 

            /**
             * <p>The storage medium of the EmptyDirVolume. The default value is empty, which indicates that the node file system is used. If this parameter is set to memory, the memory is used.</p>
             * 
             * <strong>example:</strong>
             * <p>memory</p>
             */
            public Builder medium(String medium) {
                this.medium = medium;
                return this;
            }

            /**
             * <p>The size of the EmptyDir volume. Specify a unit for the value, such as Gi or Mi.</p>
             * 
             * <strong>example:</strong>
             * <p>256Mi</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class FlexVolume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Driver")
        private String driver;

        @com.aliyun.core.annotation.NameInMap("FsType")
        private String fsType;

        @com.aliyun.core.annotation.NameInMap("Options")
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

            private Builder() {
            } 

            private Builder(FlexVolume model) {
                this.driver = model.driver;
                this.fsType = model.fsType;
                this.options = model.options;
            } 

            /**
             * <p>The name of the driver used for the FlexVolume.</p>
             * 
             * <strong>example:</strong>
             * <p>flexvolume</p>
             */
            public Builder driver(String driver) {
                this.driver = driver;
                return this;
            }

            /**
             * <p>The type of the file system to be mounted. The default value depends on the script of the FlexVolume.</p>
             * 
             * <strong>example:</strong>
             * <p>ext4</p>
             */
            public Builder fsType(String fsType) {
                this.fsType = fsType;
                return this;
            }

            /**
             * <p>The list of options for the FlexVolume object. The options are passed as key-value pairs in JSON format.</p>
             * <p>Example: When you mount a cloud disk by using FlexVolume, the format of Options is <code>{&quot;volumeId&quot;:&quot;d-2zehdahrwoa7srg****&quot;,&quot;performanceLevel&quot;: &quot;PL2&quot;}</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;volumeId&quot;:&quot;d-2zehdahrwoa7srg****&quot;,&quot;performanceLevel&quot;: &quot;PL2&quot;}</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class HostPathVolume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(HostPathVolume model) {
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * <p>The absolute path on the host.</p>
             * 
             * <strong>example:</strong>
             * <p>/xx/xx/name</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The type of the host directory, such as File, Directory, or Socket.</p>
             * 
             * <strong>example:</strong>
             * <p>Directory</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class NFSVolume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("Server")
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

            private Builder() {
            } 

            private Builder(NFSVolume model) {
                this.path = model.path;
                this.readOnly = model.readOnly;
                this.server = model.server;
            } 

            /**
             * <p>The path of the NFS volume.</p>
             * 
             * <strong>example:</strong>
             * <p>/share</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>Specifies whether the NFS volume is read-only.</p>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>The address of the NFS server.</p>
             * 
             * <strong>example:</strong>
             * <p>3f9cd4a596-n****.cn-shanghai.nas.aliyuncs.com</p>
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
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class ConfigFileVolumeConfigFileToPath extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private ConfigFileVolumeConfigFileToPath(Builder builder) {
            this.content = builder.content;
            this.mode = builder.mode;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigFileVolumeConfigFileToPath create() {
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

            private Builder() {
            } 

            private Builder(ConfigFileVolumeConfigFileToPath model) {
                this.content = model.content;
                this.mode = model.mode;
                this.path = model.path;
            } 

            /**
             * <p>The content of the configuration file (32 KB).</p>
             * 
             * <strong>example:</strong>
             * <p>bGl1bWk=</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The directory permissions for the ConfigFileVolume.</p>
             * 
             * <strong>example:</strong>
             * <p>0644</p>
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The relative file path.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/bin/</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public ConfigFileVolumeConfigFileToPath build() {
                return new ConfigFileVolumeConfigFileToPath(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>ModifyEciScalingConfigurationRequest</p>
     */
    public static class Volumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskVolume")
        private DiskVolume diskVolume;

        @com.aliyun.core.annotation.NameInMap("EmptyDirVolume")
        private EmptyDirVolume emptyDirVolume;

        @com.aliyun.core.annotation.NameInMap("FlexVolume")
        private FlexVolume flexVolume;

        @com.aliyun.core.annotation.NameInMap("HostPathVolume")
        private HostPathVolume hostPathVolume;

        @com.aliyun.core.annotation.NameInMap("NFSVolume")
        private NFSVolume NFSVolume;

        @com.aliyun.core.annotation.NameInMap("ConfigFileVolumeConfigFileToPath")
        private java.util.List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPath;

        @com.aliyun.core.annotation.NameInMap("ConfigFileVolumeDefaultMode")
        private Integer configFileVolumeDefaultMode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Volumes(Builder builder) {
            this.diskVolume = builder.diskVolume;
            this.emptyDirVolume = builder.emptyDirVolume;
            this.flexVolume = builder.flexVolume;
            this.hostPathVolume = builder.hostPathVolume;
            this.NFSVolume = builder.NFSVolume;
            this.configFileVolumeConfigFileToPath = builder.configFileVolumeConfigFileToPath;
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
         * @return configFileVolumeConfigFileToPath
         */
        public java.util.List<ConfigFileVolumeConfigFileToPath> getConfigFileVolumeConfigFileToPath() {
            return this.configFileVolumeConfigFileToPath;
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
            private java.util.List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPath; 
            private Integer configFileVolumeDefaultMode; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Volumes model) {
                this.diskVolume = model.diskVolume;
                this.emptyDirVolume = model.emptyDirVolume;
                this.flexVolume = model.flexVolume;
                this.hostPathVolume = model.hostPathVolume;
                this.NFSVolume = model.NFSVolume;
                this.configFileVolumeConfigFileToPath = model.configFileVolumeConfigFileToPath;
                this.configFileVolumeDefaultMode = model.configFileVolumeDefaultMode;
                this.name = model.name;
                this.type = model.type;
            } 

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
             * <p>The list of configuration file paths.</p>
             */
            public Builder configFileVolumeConfigFileToPath(java.util.List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPath) {
                this.configFileVolumeConfigFileToPath = configFileVolumeConfigFileToPath;
                return this;
            }

            /**
             * <p>The default permissions for the ConfigFileVolume.</p>
             * 
             * <strong>example:</strong>
             * <p>0644</p>
             */
            public Builder configFileVolumeDefaultMode(Integer configFileVolumeDefaultMode) {
                this.configFileVolumeDefaultMode = configFileVolumeDefaultMode;
                return this;
            }

            /**
             * <p>The name of the volume.</p>
             * 
             * <strong>example:</strong>
             * <p>default-volume1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The volume type. Valid values:</p>
             * <ul>
             * <li>EmptyDirVolume</li>
             * <li>NFSVolume</li>
             * <li>ConfigFileVolume</li>
             * <li>FlexVolume</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EmptyDirVolume</p>
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
