// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateEciScalingConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateEciScalingConfigurationRequest</p>
 */
public class CreateEciScalingConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcrRegistryInfos")
    private java.util.List < AcrRegistryInfos> acrRegistryInfos;

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
    private java.util.List < Containers> containers;

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
    private java.util.List < String > dnsConfigNameServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsConfigOptions")
    private java.util.List < DnsConfigOptions> dnsConfigOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsConfigSearchs")
    private java.util.List < String > dnsConfigSearchs;

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
    @com.aliyun.core.annotation.NameInMap("HostAliases")
    private java.util.List < HostAliases> hostAliases;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageRegistryCredentials")
    private java.util.List < ImageRegistryCredentials> imageRegistryCredentials;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageSnapshotId")
    private String imageSnapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IngressBandwidth")
    @com.aliyun.core.annotation.Validation()
    private Long ingressBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitContainers")
    private java.util.List < InitContainers> initContainers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

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
    private java.util.List < String > ntpServers;

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
    @com.aliyun.core.annotation.NameInMap("ScalingConfigurationName")
    private String scalingConfigurationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityContextSysctls")
    private java.util.List < SecurityContextSysctls> securityContextSysctls;

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
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminationGracePeriodSeconds")
    private Long terminationGracePeriodSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Volumes")
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
         * <p>The Container Registry Enterprise Edition instances.</p>
         */
        public Builder acrRegistryInfos(java.util.List < AcrRegistryInfos> acrRegistryInfos) {
            this.putQueryParameter("AcrRegistryInfos", acrRegistryInfos);
            this.acrRegistryInfos = acrRegistryInfos;
            return this;
        }

        /**
         * <p>The validity period of the scaling configuration. Unit: seconds.</p>
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
         * <p>Specifies whether to automatically create elastic IP addresses (EIPs) and bind the EIPs to elastic container instances.</p>
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
         * <p>Specifies whether to automatically match the image cache. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
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
         * <p>The name series of elastic container instances.</p>
         * <p>If you want to use an ordered instance name, specify the value for this parameter in the following format: name_prefix[begin_number,bits]name_suffix.</p>
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
         * <p>The containers on the elastic container instance.</p>
         */
        public Builder containers(java.util.List < Containers> containers) {
            this.putQueryParameter("Containers", containers);
            this.containers = containers;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Cost Optimization feature. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
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
         * <p>The number of vCPUs per elastic container instance.</p>
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
         * <p>The number of physical CPU cores. You can specify this parameter for specific instance types. For more information, see <a href="https://help.aliyun.com/document_detail/197781.html">Specify CPU options</a>.</p>
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
         * <p>The number of threads per core. You can specify this parameter for specific instance types. A value of 1 specifies that Hyper-Threading is disabled. For more information, see <a href="https://help.aliyun.com/document_detail/197781.html">Specify CPU options</a>.</p>
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
         * <p>The bucket that you want to use to store data caches.</p>
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
         * <p>Specifies whether to enable the performance burst feature when ESSD AutoPL disks are used to store data caches. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p> For more information about ESSD AutoPL disks, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
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
         * <p>The PL of the cloud disk that you want to use to store data caches. We recommend that you use ESSDs. Valid values:</p>
         * <ul>
         * <li>PL0: An ESSD can provide up to 10,000 random read/write IOPS.</li>
         * <li>PL1: An ESSD can provide up to 50,000 random read/write IOPS.</li>
         * <li>PL2: An ESSD can provide up to 100,000 random read/write IOPS.</li>
         * <li>PL3: An ESSD can provide up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>Default value: PL1.</p>
         * <blockquote>
         * <p> For more information about ESSDs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
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
         * <p>The provisioned IOPS of the ESSD AutoPL disk that you want to use to store data caches. Valid values: 0 to min{50,000, 1,000 × *Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × *Capacity, 50,000}.</p>
         * <blockquote>
         * <p> For more information about ESSD AutoPL disks, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
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
         * <p> This parameter is unavailable for use.</p>
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
         * <p>The IP addresses of the DNS servers.</p>
         */
        public Builder dnsConfigNameServers(java.util.List < String > dnsConfigNameServers) {
            this.putQueryParameter("DnsConfigNameServers", dnsConfigNameServers);
            this.dnsConfigNameServers = dnsConfigNameServers;
            return this;
        }

        /**
         * <p>The options. Each option is a name-value pair. The value in the name-value pair is optional.</p>
         */
        public Builder dnsConfigOptions(java.util.List < DnsConfigOptions> dnsConfigOptions) {
            this.putQueryParameter("DnsConfigOptions", dnsConfigOptions);
            this.dnsConfigOptions = dnsConfigOptions;
            return this;
        }

        /**
         * <p>The search domains of the DNS servers.</p>
         */
        public Builder dnsConfigSearchs(java.util.List < String > dnsConfigSearchs) {
            this.putQueryParameter("DnsConfigSearchs", dnsConfigSearchs);
            this.dnsConfigSearchs = dnsConfigSearchs;
            return this;
        }

        /**
         * <p>The Domain Name System (DNS) policy. Valid values:</p>
         * <ul>
         * <li>None: uses the DNS that is specified by DnsConfig.</li>
         * <li>Default: uses the DNS that is specified for the runtime environment.</li>
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
         * <p>The maximum outbound bandwidth. Unit: bit/s.</p>
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
         * <p>The EIP bandwidth. Default value: 5. Unit: Mbit/s.</p>
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
         * <p> This parameter is unavailable for use.</p>
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
         * <p>The size of the temporary storage space. By default, an Enterprise SSD (ESSD) of performance level 1 (PL1) is used. Unit: GiB.</p>
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
         * <p>The custom hostnames of the containers.</p>
         */
        public Builder hostAliases(java.util.List < HostAliases> hostAliases) {
            this.putQueryParameter("HostAliases", hostAliases);
            this.hostAliases = hostAliases;
            return this;
        }

        /**
         * <p>The hostname series of elastic container instances.</p>
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
         * <p>The image repositories.</p>
         */
        public Builder imageRegistryCredentials(java.util.List < ImageRegistryCredentials> imageRegistryCredentials) {
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
         * <p>The maximum inbound bandwidth. Unit: bit/s.</p>
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
         * <p>The init containers.</p>
         */
        public Builder initContainers(java.util.List < InitContainers> initContainers) {
            this.putQueryParameter("InitContainers", initContainers);
            this.initContainers = initContainers;
            return this;
        }

        /**
         * <p>The level of the instance family. You can specify this parameter to match the available instance types. This parameter takes effect only if you set <code>CostOptimization</code> to true. Valid values:</p>
         * <ul>
         * <li>EntryLevel: entry level (shared instance types). Instance types of this level are the most cost-effective, but may not ensure stable computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
         * <li>EnterpriseLevel: enterprise level. Instance types of this level provide stable performance and dedicated resources, and are suitable for business scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</li>
         * <li>CreditEntryLevel: credit-based entry level (burstable instance types). CPU credits are used to ensure computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview</a> of burstable instances.</li>
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
         * <p>The ECS instance types that you want to use to create elastic container instances. You can specify up to five ECS instance types.</p>
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
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
         * <p>The load balancing weight of each elastic container instance. Valid values: 1 to 100.</p>
         * <p>Default value: 50.</p>
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
         * <p>The memory size per elastic container instance. Unit: GiB.</p>
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
         * <p>The endpoints of the Network Time Protocol (NTP) servers.</p>
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
         * <p>The name of the instance Resource Access Management (RAM) role. Elastic container instances and Elastic Compute Service (ECS) instances can share the same RAM role. For more information, see <a href="https://help.aliyun.com/document_detail/61178.html">Use an instance RAM role by calling API operations</a>.</p>
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
         * <p>The restart policy of elastic container instances. Valid values:</p>
         * <ul>
         * <li>Always: always restarts elastic container instances.</li>
         * <li>Never: never restarts elastic container instances.</li>
         * <li>OnFailure: restarts elastic container instances upon failures.</li>
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
         * <p>The name of the scaling configuration. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter or a digit.</p>
         * <p>The name of the scaling configuration must be unique in a scaling group within a region. If you do not specify this parameter, the value of ScalingConfigurationId is used.</p>
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
         * <p>The ID of the scaling group to which the scaling configuration belongs.</p>
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
         * <p>The system information of the security context in which the elastic container instance runs.</p>
         */
        public Builder securityContextSysctls(java.util.List < SecurityContextSysctls> securityContextSysctls) {
            this.putQueryParameter("SecurityContextSysctls", securityContextSysctls);
            this.securityContextSysctls = securityContextSysctls;
            return this;
        }

        /**
         * <p>The ID of the security group to which elastic container instances belong. Elastic container instances that belong to the same security group can communicate with each other.</p>
         * <p>If you do not specify a security group, the system uses the default security group in the region that you selected. Make sure that the inbound rules of the security group contain the protocols and port numbers of the containers that you want to expose. If you do not have a default security group in the region, the system creates a default security group, and then adds the container protocols and port numbers that you specified to the inbound rules of the security group.</p>
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
         * <p>The maximum hourly price of preemptible elastic container instances. The value can be accurate to three decimal places.</p>
         * <p>If you set SpotStrategy to SpotWithPriceLimit, you must specify SpotPriceLimit.</p>
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
         * <p>The instance bidding policy. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instances are created as pay-as-you-go instances.</li>
         * <li>SpotWithPriceLimit: The instances are preemptible instances for which you can specify the maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instances are created as preemptible instances for which the market price at the time of purchase is used as the bid price.</li>
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
         * <p>The tags of elastic container instances. Tags must be specified as key-value pairs. You can specify up to 20 tags for each elastic container instance. When you specify Key and Value, take note of the following items:</p>
         * <ul>
         * <li>A tag key can be up to 64 characters in length. The key cannot start with acs: or aliyun or contain <code>http://</code> or <code>https://</code>. You cannot specify an empty string as a tag key.</li>
         * <li>A tag value can be up to 128 characters in length. The value cannot start with acs: or aliyun or contain <code>http://</code> or <code>https://</code>. You can specify an empty string as a tag value.</li>
         * </ul>
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The buffer time during which a program handles operations before the program stops. Unit: seconds.</p>
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
         * <p>The volumes.</p>
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

    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
     */
    public static class AcrRegistryInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domains")
        private java.util.List < String > domains;

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
             * <p>The domain names of the Container Registry Enterprise Edition instances. By default, all domain names are displayed. Separate multiple domain names with commas (,).</p>
             */
            public Builder domains(java.util.List < String > domains) {
                this.domains = domains;
                return this;
            }

            /**
             * <p>The ID of the Container Registry Enterprise Edition instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-nwj395hgf6f3****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the Container Registry Enterprise Edition instance.</p>
             * 
             * <strong>example:</strong>
             * <p>acr-test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The region ID of the Container Registry Enterprise Edition instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
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
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
     */
    public static class Exec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Commands")
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
     */
    public static class ReadinessProbeExec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Commands")
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
     */
    public static class Capability extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Add")
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
     */
    public static class EnvironmentVars extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldRefFieldPath")
        private String fieldRefFieldPath;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <blockquote>
             * <p> This parameter is unavailable for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>fieldPath</p>
             */
            public Builder fieldRefFieldPath(String fieldRefFieldPath) {
                this.fieldRefFieldPath = fieldRefFieldPath;
                return this;
            }

            /**
             * <p>The name of the environment variable. The name can be 1 to 128 characters in length and can contain letters, underscores (_), and digits. The name cannot start with a digit. Specify the value in the [0-9a-zA-Z] format.</p>
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
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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

            /**
             * <p>The directory to which the container mounts the volume.</p>
             * <blockquote>
             * <p> Data in this directory is overwritten by data on the volume. Specify this parameter with caution.</p>
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
             * <p>The mount propagation settings of the volume. Mount propagation enables volume sharing from one container to other containers within the same pod or to containers across separate pods on the same node. Valid values:</p>
             * <ul>
             * <li>None: Subsequent mounts executed on the volume or its subdirectories do not propagate to the volume.</li>
             * <li>HostToCotainer: Subsequent mounts executed on the volume or its subdirectories propagate to the volume.</li>
             * <li>Bidirectional: This value is similar to HostToCotainer. Subsequent mounts executed on the volume or its subdirectories propagate to the volume. All volume mounts executed on the container not only propagate back to the underlying host but also to all containers across every pod that uses the same volume.</li>
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
             * <p>The name of the volume. The value of this parameter is the same as the value of Volumes.Name.</p>
             * 
             * <strong>example:</strong>
             * <p>default-volume1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether the volume is read-only. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
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
             * <p>The subdirectory of the volume.</p>
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
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
     */
    public static class Containers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LivenessProbe")
        @com.aliyun.core.annotation.Validation(required = true)
        private LivenessProbe livenessProbe;

        @com.aliyun.core.annotation.NameInMap("ReadinessProbe")
        @com.aliyun.core.annotation.Validation(required = true)
        private ReadinessProbe readinessProbe;

        @com.aliyun.core.annotation.NameInMap("SecurityContext")
        @com.aliyun.core.annotation.Validation(required = true)
        private SecurityContext securityContext;

        @com.aliyun.core.annotation.NameInMap("Args")
        private java.util.List < String > args;

        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List < String > commands;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVars")
        private java.util.List < EnvironmentVars> environmentVars;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerExecs")
        private java.util.List < String > lifecyclePostStartHandlerExecs;

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
        private java.util.List < String > lifecyclePreStopHandlerExecs;

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
        private java.util.List < Ports> ports;

        @com.aliyun.core.annotation.NameInMap("Stdin")
        private Boolean stdin;

        @com.aliyun.core.annotation.NameInMap("StdinOnce")
        private Boolean stdinOnce;

        @com.aliyun.core.annotation.NameInMap("Tty")
        private Boolean tty;

        @com.aliyun.core.annotation.NameInMap("VolumeMounts")
        private java.util.List < VolumeMounts> volumeMounts;

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
         * @return lifecyclePostStartHandlerExecs
         */
        public java.util.List < String > getLifecyclePostStartHandlerExecs() {
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
        public java.util.List < String > getLifecyclePreStopHandlerExecs() {
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
            private java.util.List < String > lifecyclePostStartHandlerExecs; 
            private String lifecyclePostStartHandlerHttpGetHost; 
            private String lifecyclePostStartHandlerHttpGetPath; 
            private Integer lifecyclePostStartHandlerHttpGetPort; 
            private String lifecyclePostStartHandlerHttpGetScheme; 
            private String lifecyclePostStartHandlerTcpSocketHost; 
            private Integer lifecyclePostStartHandlerTcpSocketPort; 
            private java.util.List < String > lifecyclePreStopHandlerExecs; 
            private String lifecyclePreStopHandlerHttpGetHost; 
            private String lifecyclePreStopHandlerHttpGetPath; 
            private Integer lifecyclePreStopHandlerHttpGetPort; 
            private String lifecyclePreStopHandlerHttpGetScheme; 
            private String lifecyclePreStopHandlerTcpSocketHost; 
            private Integer lifecyclePreStopHandlerTcpSocketPort; 
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
             * <p>The startup arguments of the containers. You can specify up to 10 arguments.</p>
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The commands that you can run by using a CLI to perform liveness probes within the container.</p>
             */
            public Builder commands(java.util.List < String > commands) {
                this.commands = commands;
                return this;
            }

            /**
             * <p>The number of vCPUs per container.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The environment variables.</p>
             */
            public Builder environmentVars(java.util.List < EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * <p>The number of GPUs per container.</p>
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
             * <p>The image pulling policy. Valid values:</p>
             * <ul>
             * <li>Always: Each time instances are created, image pulling is performed.</li>
             * <li>IfNotPresent: Image pulling is performed as needed. On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</li>
             * <li>Never: On-premises images are always used. Image pulling is not performed.</li>
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
             * <p>The commands that you can run by using a CLI to configure the postStart callback function within the container.</p>
             */
            public Builder lifecyclePostStartHandlerExecs(java.util.List < String > lifecyclePostStartHandlerExecs) {
                this.lifecyclePostStartHandlerExecs = lifecyclePostStartHandlerExecs;
                return this;
            }

            /**
             * <p>The IP address of the host to which you send an HTTP GET request to configure the postStart callback function.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
                this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
                return this;
            }

            /**
             * <p>The path to which you send an HTTP GET request to configure the postStart callback function.</p>
             * 
             * <strong>example:</strong>
             * <p>/healthyz</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
                this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
                return this;
            }

            /**
             * <p>The port over which you send an HTTP GET request to configure the postStart callback function.</p>
             * 
             * <strong>example:</strong>
             * <p>5050</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
                this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
                return this;
            }

            /**
             * <p>The protocol type of the HTTP GET request that you send to configure the postStart callback function. Valid values:</p>
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
             * <p>The IP address of the host detected by the TCP socket that you use to configure the postStart callback function.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
                this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
                return this;
            }

            /**
             * <p>The port detected by the TCP socket that you use to configure the postStart callback function.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder lifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
                this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
                return this;
            }

            /**
             * <p>The commands that you can run by using a CLI to configure the preStop callback function within the container.</p>
             */
            public Builder lifecyclePreStopHandlerExecs(java.util.List < String > lifecyclePreStopHandlerExecs) {
                this.lifecyclePreStopHandlerExecs = lifecyclePreStopHandlerExecs;
                return this;
            }

            /**
             * <p>The IP address of the host to which you send an HTTP GET request to configure the preStop callback function.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
                this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
                return this;
            }

            /**
             * <p>The path to which you send an HTTP GET request to configure the preStop callback function.</p>
             * 
             * <strong>example:</strong>
             * <p>/healthyz</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
                this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
                return this;
            }

            /**
             * <p>The port over which you send an HTTP GET request to configure the preStop callback function.</p>
             * 
             * <strong>example:</strong>
             * <p>88</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
                this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
                return this;
            }

            /**
             * <p>The protocol type of the HTTP GET request that you send to configure the preStop callback function. Valid values:</p>
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
             * <p>The IP address of the host detected by the TCP socket that you use to configure the preStop callback function.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
                this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
                return this;
            }

            /**
             * <p>The port detected by the TCP socket that you use to configure the preStop callback function.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder lifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
                this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
                return this;
            }

            /**
             * <p>The memory size per container. Unit: GiB.</p>
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
             * <p>The ports.</p>
             */
            public Builder ports(java.util.List < Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>Specifies whether the container allocates buffer resources to standard input streams during its active runtime. If you do not specify this parameter, an end-of-file (EOF) error occurs when standard input streams in the container are read.</p>
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
             * <p>Specifies whether standard input streams remain connected during multiple sessions if Stdin is set to true.</p>
             * <p>If you set StdinOnce to true, standard input streams are connected after the container is started, and remain idle until a client is connected to receive data. After the client is disconnected, streams are also disconnected and remain disconnected until the container is restarted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder stdinOnce(Boolean stdinOnce) {
                this.stdinOnce = stdinOnce;
                return this;
            }

            /**
             * <p>Specifies whether to enable the Interaction feature. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>If the command is a /bin/bash command, set the value to true.</p>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder tty(Boolean tty) {
                this.tty = tty;
                return this;
            }

            /**
             * <p>The volume mounts of the container.</p>
             */
            public Builder volumeMounts(java.util.List < VolumeMounts> volumeMounts) {
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
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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

            /**
             * <p>The variable name of the option.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The variable value of the option.</p>
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
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
     */
    public static class HostAliases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hostnames")
        private java.util.List < String > hostnames;

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
             * <p>The hostnames of the containers that you want to add.</p>
             */
            public Builder hostnames(java.util.List < String > hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * <p>The IP address of the container that you want to add.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
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
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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

            /**
             * <p>The password of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>yourpaasword</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The endpoint of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-shanghai.aliyuncs.com</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * <p>The username of the image repository.</p>
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
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
     */
    public static class SecurityContextCapability extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Adds")
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
     */
    public static class InitContainerEnvironmentVars extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldRefFieldPath")
        private String fieldRefFieldPath;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <blockquote>
             * <p> This parameter is unavailable for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>path</p>
             */
            public Builder fieldRefFieldPath(String fieldRefFieldPath) {
                this.fieldRefFieldPath = fieldRefFieldPath;
                return this;
            }

            /**
             * <p>The name of the environment variable. The name can be 1 to 128 characters in length and can contain letters, underscores (_), and digits. It cannot start with a digit. Specify the value in the <code>[0-9a-zA-Z]</code> format.</p>
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
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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

            /**
             * <p>The directory to which the init container mounts the volume. The data stored in this directory is overwritten by the data on the volume. Specify this parameter with caution.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/share/</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The mount propagation settings of the volume. Mount propagation enables volume sharing from one container to other containers within the same pod or to containers across separate pods on the same node. Valid values:</p>
             * <ul>
             * <li>None: Subsequent mounts executed on the volume or its subdirectories do not propagate to the volume.</li>
             * <li>HostToCotainer: Subsequent mounts executed on the volume or its subdirectories propagate to the volume.</li>
             * <li>Bidirectional: This value is similar to HostToCotainer. Subsequent mounts executed on the volume or its subdirectories propagate to the volume. All volume mounts executed on the container not only propagate back to the underlying host but also to all containers across every pod that uses the same volume.</li>
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
             * <p>The name of the volume.</p>
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
             * <p>The subdirectory of the volume. The pod can mount different directories of the same volume to different subdirectories of init containers.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/sub/</p>
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
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
     */
    public static class InitContainers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityContext")
        @com.aliyun.core.annotation.Validation(required = true)
        private InitContainersSecurityContext securityContext;

        @com.aliyun.core.annotation.NameInMap("Args")
        private java.util.List < String > args;

        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List < String > commands;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @com.aliyun.core.annotation.NameInMap("InitContainerEnvironmentVars")
        private java.util.List < InitContainerEnvironmentVars> initContainerEnvironmentVars;

        @com.aliyun.core.annotation.NameInMap("InitContainerPorts")
        private java.util.List < InitContainerPorts> initContainerPorts;

        @com.aliyun.core.annotation.NameInMap("InitContainerVolumeMounts")
        private java.util.List < InitContainerVolumeMounts> initContainerVolumeMounts;

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
             * <p>The startup arguments of the init container. You can specify up to 10 arguments.</p>
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The startup commands of the init container.</p>
             */
            public Builder commands(java.util.List < String > commands) {
                this.commands = commands;
                return this;
            }

            /**
             * <p>The number of vCPUs per init container.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The number of GPUs per init container.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The image of the init container.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The image pulling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Always</p>
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * <p>The environment variables of the init container.</p>
             */
            public Builder initContainerEnvironmentVars(java.util.List < InitContainerEnvironmentVars> initContainerEnvironmentVars) {
                this.initContainerEnvironmentVars = initContainerEnvironmentVars;
                return this;
            }

            /**
             * <p>The ports of init containers.</p>
             */
            public Builder initContainerPorts(java.util.List < InitContainerPorts> initContainerPorts) {
                this.initContainerPorts = initContainerPorts;
                return this;
            }

            /**
             * <p>The volume mounts of the init container.</p>
             */
            public Builder initContainerVolumeMounts(java.util.List < InitContainerVolumeMounts> initContainerVolumeMounts) {
                this.initContainerVolumeMounts = initContainerVolumeMounts;
                return this;
            }

            /**
             * <p>The memory size per init container. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The name of the init container.</p>
             * 
             * <strong>example:</strong>
             * <p>test-init</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The working directory of the init container.</p>
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
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
     */
    public static class SecurityContextSysctls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The variable name of the security context in which the container group runs.</p>
             * 
             * <strong>example:</strong>
             * <p>kernel.msgmax</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The variable value of the security context in which the elastic container instance runs.</p>
             * 
             * <strong>example:</strong>
             * <p>65536</p>
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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

            /**
             * <p>The tag key of the elastic container instance.</p>
             * <p>The tag key cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with <code>acs:</code> or <code>aliyun</code> or contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>version</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the elastic container instance.</p>
             * <p>The tag value can be an empty string. The tag value can be up to 128 characters in length. It cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
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

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
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
             * <p>The endpoint of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-shanghai.aliyuncs.com</p>
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
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
     */
    public static class ConfigFileVolumeConfigFileToPaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("Path")
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
             * <p>The permissions on the configuration file.</p>
             * 
             * <strong>example:</strong>
             * <p>0644</p>
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The name of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>PATH</p>
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
    /**
     * 
     * {@link CreateEciScalingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEciScalingConfigurationRequest</p>
     */
    public static class Volumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskVolume")
        @com.aliyun.core.annotation.Validation(required = true)
        private DiskVolume diskVolume;

        @com.aliyun.core.annotation.NameInMap("EmptyDirVolume")
        @com.aliyun.core.annotation.Validation(required = true)
        private EmptyDirVolume emptyDirVolume;

        @com.aliyun.core.annotation.NameInMap("FlexVolume")
        @com.aliyun.core.annotation.Validation(required = true)
        private FlexVolume flexVolume;

        @com.aliyun.core.annotation.NameInMap("HostPathVolume")
        @com.aliyun.core.annotation.Validation(required = true)
        private HostPathVolume hostPathVolume;

        @com.aliyun.core.annotation.NameInMap("NFSVolume")
        @com.aliyun.core.annotation.Validation(required = true)
        private NFSVolume NFSVolume;

        @com.aliyun.core.annotation.NameInMap("ConfigFileVolumeConfigFileToPaths")
        private java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

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
             * <p>The paths to the configuration files.</p>
             */
            public Builder configFileVolumeConfigFileToPaths(java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
                this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
                return this;
            }

            /**
             * <p>The default permissions on the ConfigFile volume.</p>
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
             * <p>The type of the Host directory. Examples: File, Directory, and Socket.</p>
             * 
             * <strong>example:</strong>
             * <p>ConfigFileVolume</p>
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
