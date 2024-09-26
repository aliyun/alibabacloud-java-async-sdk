// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateContainerGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateContainerGroupRequest</p>
 */
public class CreateContainerGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsConfig")
    private DnsConfig dnsConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostSecurityContext")
    private HostSecurityContext hostSecurityContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityContext")
    private SecurityContext securityContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcrRegistryInfo")
    private java.util.List < AcrRegistryInfo> acrRegistryInfo;

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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeCategory")
    private java.util.List < String > computeCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Container")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Container> container;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String containerGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerResourceView")
    private Boolean containerResourceView;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CorePattern")
    private String corePattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Float cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuArchitecture")
    private String cpuArchitecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuOptionsCore")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer cpuOptionsCore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuOptionsNuma")
    private String cpuOptionsNuma;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuOptionsThreadsPerCore")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
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
    private Long dataCacheProvisionedIops;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsPolicy")
    private String dnsPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EgressBandwidth")
    @com.aliyun.core.annotation.Validation()
    private Long egressBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipBandwidth")
    @com.aliyun.core.annotation.Validation(maximum = 1000000)
    private Integer eipBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipCommonBandwidthPackage")
    private String eipCommonBandwidthPackage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipISP")
    private String eipISP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipInstanceId")
    private String eipInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EphemeralStorage")
    @com.aliyun.core.annotation.Validation(maximum = 5000)
    private Integer ephemeralStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FixedIp")
    private String fixedIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FixedIpRetainHour")
    private Integer fixedIpRetainHour;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuDriverVersion")
    private String gpuDriverVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostAliase")
    private java.util.List < HostAliase> hostAliase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageAccelerateMode")
    private String imageAccelerateMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageRegistryCredential")
    private java.util.List < ImageRegistryCredential> imageRegistryCredential;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageSnapshotId")
    private String imageSnapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IngressBandwidth")
    @com.aliyun.core.annotation.Validation()
    private Long ingressBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitContainer")
    private java.util.List < InitContainer> initContainer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InsecureRegistry")
    private String insecureRegistry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6GatewayBandwidth")
    private String ipv6GatewayBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6GatewayBandwidthEnable")
    private Boolean ipv6GatewayBandwidthEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    private Float memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NtpServer")
    private java.util.List < String > ntpServer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverheadReservationOption")
    private OverheadReservationOption overheadReservationOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlainHttpRegistry")
    private String plainHttpRegistry;

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
    @com.aliyun.core.annotation.NameInMap("RestartPolicy")
    private String restartPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleStrategy")
    private String scheduleStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareProcessNamespace")
    private Boolean shareProcessNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotDuration")
    private Long spotDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrictSpot")
    private Boolean strictSpot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminationGracePeriodSeconds")
    private Long terminationGracePeriodSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Volume")
    private java.util.List < Volume> volume;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateContainerGroupRequest(Builder builder) {
        super(builder);
        this.dnsConfig = builder.dnsConfig;
        this.hostSecurityContext = builder.hostSecurityContext;
        this.securityContext = builder.securityContext;
        this.acrRegistryInfo = builder.acrRegistryInfo;
        this.activeDeadlineSeconds = builder.activeDeadlineSeconds;
        this.autoCreateEip = builder.autoCreateEip;
        this.autoMatchImageCache = builder.autoMatchImageCache;
        this.clientToken = builder.clientToken;
        this.computeCategory = builder.computeCategory;
        this.container = builder.container;
        this.containerGroupName = builder.containerGroupName;
        this.containerResourceView = builder.containerResourceView;
        this.corePattern = builder.corePattern;
        this.cpu = builder.cpu;
        this.cpuArchitecture = builder.cpuArchitecture;
        this.cpuOptionsCore = builder.cpuOptionsCore;
        this.cpuOptionsNuma = builder.cpuOptionsNuma;
        this.cpuOptionsThreadsPerCore = builder.cpuOptionsThreadsPerCore;
        this.dataCacheBucket = builder.dataCacheBucket;
        this.dataCacheBurstingEnabled = builder.dataCacheBurstingEnabled;
        this.dataCachePL = builder.dataCachePL;
        this.dataCacheProvisionedIops = builder.dataCacheProvisionedIops;
        this.dnsPolicy = builder.dnsPolicy;
        this.dryRun = builder.dryRun;
        this.egressBandwidth = builder.egressBandwidth;
        this.eipBandwidth = builder.eipBandwidth;
        this.eipCommonBandwidthPackage = builder.eipCommonBandwidthPackage;
        this.eipISP = builder.eipISP;
        this.eipInstanceId = builder.eipInstanceId;
        this.ephemeralStorage = builder.ephemeralStorage;
        this.fixedIp = builder.fixedIp;
        this.fixedIpRetainHour = builder.fixedIpRetainHour;
        this.gpuDriverVersion = builder.gpuDriverVersion;
        this.hostAliase = builder.hostAliase;
        this.hostName = builder.hostName;
        this.imageAccelerateMode = builder.imageAccelerateMode;
        this.imageRegistryCredential = builder.imageRegistryCredential;
        this.imageSnapshotId = builder.imageSnapshotId;
        this.ingressBandwidth = builder.ingressBandwidth;
        this.initContainer = builder.initContainer;
        this.insecureRegistry = builder.insecureRegistry;
        this.instanceType = builder.instanceType;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.ipv6GatewayBandwidth = builder.ipv6GatewayBandwidth;
        this.ipv6GatewayBandwidthEnable = builder.ipv6GatewayBandwidthEnable;
        this.memory = builder.memory;
        this.ntpServer = builder.ntpServer;
        this.osType = builder.osType;
        this.overheadReservationOption = builder.overheadReservationOption;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.plainHttpRegistry = builder.plainHttpRegistry;
        this.privateIpAddress = builder.privateIpAddress;
        this.ramRoleName = builder.ramRoleName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restartPolicy = builder.restartPolicy;
        this.scheduleStrategy = builder.scheduleStrategy;
        this.securityGroupId = builder.securityGroupId;
        this.shareProcessNamespace = builder.shareProcessNamespace;
        this.spotDuration = builder.spotDuration;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.spotStrategy = builder.spotStrategy;
        this.strictSpot = builder.strictSpot;
        this.tag = builder.tag;
        this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
        this.vSwitchId = builder.vSwitchId;
        this.volume = builder.volume;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContainerGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dnsConfig
     */
    public DnsConfig getDnsConfig() {
        return this.dnsConfig;
    }

    /**
     * @return hostSecurityContext
     */
    public HostSecurityContext getHostSecurityContext() {
        return this.hostSecurityContext;
    }

    /**
     * @return securityContext
     */
    public SecurityContext getSecurityContext() {
        return this.securityContext;
    }

    /**
     * @return acrRegistryInfo
     */
    public java.util.List < AcrRegistryInfo> getAcrRegistryInfo() {
        return this.acrRegistryInfo;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return computeCategory
     */
    public java.util.List < String > getComputeCategory() {
        return this.computeCategory;
    }

    /**
     * @return container
     */
    public java.util.List < Container> getContainer() {
        return this.container;
    }

    /**
     * @return containerGroupName
     */
    public String getContainerGroupName() {
        return this.containerGroupName;
    }

    /**
     * @return containerResourceView
     */
    public Boolean getContainerResourceView() {
        return this.containerResourceView;
    }

    /**
     * @return corePattern
     */
    public String getCorePattern() {
        return this.corePattern;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return cpuArchitecture
     */
    public String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    /**
     * @return cpuOptionsCore
     */
    public Integer getCpuOptionsCore() {
        return this.cpuOptionsCore;
    }

    /**
     * @return cpuOptionsNuma
     */
    public String getCpuOptionsNuma() {
        return this.cpuOptionsNuma;
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
    public Long getDataCacheProvisionedIops() {
        return this.dataCacheProvisionedIops;
    }

    /**
     * @return dnsPolicy
     */
    public String getDnsPolicy() {
        return this.dnsPolicy;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return eipCommonBandwidthPackage
     */
    public String getEipCommonBandwidthPackage() {
        return this.eipCommonBandwidthPackage;
    }

    /**
     * @return eipISP
     */
    public String getEipISP() {
        return this.eipISP;
    }

    /**
     * @return eipInstanceId
     */
    public String getEipInstanceId() {
        return this.eipInstanceId;
    }

    /**
     * @return ephemeralStorage
     */
    public Integer getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    /**
     * @return fixedIp
     */
    public String getFixedIp() {
        return this.fixedIp;
    }

    /**
     * @return fixedIpRetainHour
     */
    public Integer getFixedIpRetainHour() {
        return this.fixedIpRetainHour;
    }

    /**
     * @return gpuDriverVersion
     */
    public String getGpuDriverVersion() {
        return this.gpuDriverVersion;
    }

    /**
     * @return hostAliase
     */
    public java.util.List < HostAliase> getHostAliase() {
        return this.hostAliase;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return imageAccelerateMode
     */
    public String getImageAccelerateMode() {
        return this.imageAccelerateMode;
    }

    /**
     * @return imageRegistryCredential
     */
    public java.util.List < ImageRegistryCredential> getImageRegistryCredential() {
        return this.imageRegistryCredential;
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
     * @return initContainer
     */
    public java.util.List < InitContainer> getInitContainer() {
        return this.initContainer;
    }

    /**
     * @return insecureRegistry
     */
    public String getInsecureRegistry() {
        return this.insecureRegistry;
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
     * @return ipv6GatewayBandwidth
     */
    public String getIpv6GatewayBandwidth() {
        return this.ipv6GatewayBandwidth;
    }

    /**
     * @return ipv6GatewayBandwidthEnable
     */
    public Boolean getIpv6GatewayBandwidthEnable() {
        return this.ipv6GatewayBandwidthEnable;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
    }

    /**
     * @return ntpServer
     */
    public java.util.List < String > getNtpServer() {
        return this.ntpServer;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return overheadReservationOption
     */
    public OverheadReservationOption getOverheadReservationOption() {
        return this.overheadReservationOption;
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
     * @return plainHttpRegistry
     */
    public String getPlainHttpRegistry() {
        return this.plainHttpRegistry;
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
     * @return restartPolicy
     */
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    /**
     * @return scheduleStrategy
     */
    public String getScheduleStrategy() {
        return this.scheduleStrategy;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return shareProcessNamespace
     */
    public Boolean getShareProcessNamespace() {
        return this.shareProcessNamespace;
    }

    /**
     * @return spotDuration
     */
    public Long getSpotDuration() {
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
     * @return strictSpot
     */
    public Boolean getStrictSpot() {
        return this.strictSpot;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return terminationGracePeriodSeconds
     */
    public Long getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return volume
     */
    public java.util.List < Volume> getVolume() {
        return this.volume;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateContainerGroupRequest, Builder> {
        private DnsConfig dnsConfig; 
        private HostSecurityContext hostSecurityContext; 
        private SecurityContext securityContext; 
        private java.util.List < AcrRegistryInfo> acrRegistryInfo; 
        private Long activeDeadlineSeconds; 
        private Boolean autoCreateEip; 
        private Boolean autoMatchImageCache; 
        private String clientToken; 
        private java.util.List < String > computeCategory; 
        private java.util.List < Container> container; 
        private String containerGroupName; 
        private Boolean containerResourceView; 
        private String corePattern; 
        private Float cpu; 
        private String cpuArchitecture; 
        private Integer cpuOptionsCore; 
        private String cpuOptionsNuma; 
        private Integer cpuOptionsThreadsPerCore; 
        private String dataCacheBucket; 
        private Boolean dataCacheBurstingEnabled; 
        private String dataCachePL; 
        private Long dataCacheProvisionedIops; 
        private String dnsPolicy; 
        private Boolean dryRun; 
        private Long egressBandwidth; 
        private Integer eipBandwidth; 
        private String eipCommonBandwidthPackage; 
        private String eipISP; 
        private String eipInstanceId; 
        private Integer ephemeralStorage; 
        private String fixedIp; 
        private Integer fixedIpRetainHour; 
        private String gpuDriverVersion; 
        private java.util.List < HostAliase> hostAliase; 
        private String hostName; 
        private String imageAccelerateMode; 
        private java.util.List < ImageRegistryCredential> imageRegistryCredential; 
        private String imageSnapshotId; 
        private Long ingressBandwidth; 
        private java.util.List < InitContainer> initContainer; 
        private String insecureRegistry; 
        private String instanceType; 
        private Integer ipv6AddressCount; 
        private String ipv6GatewayBandwidth; 
        private Boolean ipv6GatewayBandwidthEnable; 
        private Float memory; 
        private java.util.List < String > ntpServer; 
        private String osType; 
        private OverheadReservationOption overheadReservationOption; 
        private String ownerAccount; 
        private Long ownerId; 
        private String plainHttpRegistry; 
        private String privateIpAddress; 
        private String ramRoleName; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restartPolicy; 
        private String scheduleStrategy; 
        private String securityGroupId; 
        private Boolean shareProcessNamespace; 
        private Long spotDuration; 
        private Float spotPriceLimit; 
        private String spotStrategy; 
        private Boolean strictSpot; 
        private java.util.List < Tag> tag; 
        private Long terminationGracePeriodSeconds; 
        private String vSwitchId; 
        private java.util.List < Volume> volume; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateContainerGroupRequest request) {
            super(request);
            this.dnsConfig = request.dnsConfig;
            this.hostSecurityContext = request.hostSecurityContext;
            this.securityContext = request.securityContext;
            this.acrRegistryInfo = request.acrRegistryInfo;
            this.activeDeadlineSeconds = request.activeDeadlineSeconds;
            this.autoCreateEip = request.autoCreateEip;
            this.autoMatchImageCache = request.autoMatchImageCache;
            this.clientToken = request.clientToken;
            this.computeCategory = request.computeCategory;
            this.container = request.container;
            this.containerGroupName = request.containerGroupName;
            this.containerResourceView = request.containerResourceView;
            this.corePattern = request.corePattern;
            this.cpu = request.cpu;
            this.cpuArchitecture = request.cpuArchitecture;
            this.cpuOptionsCore = request.cpuOptionsCore;
            this.cpuOptionsNuma = request.cpuOptionsNuma;
            this.cpuOptionsThreadsPerCore = request.cpuOptionsThreadsPerCore;
            this.dataCacheBucket = request.dataCacheBucket;
            this.dataCacheBurstingEnabled = request.dataCacheBurstingEnabled;
            this.dataCachePL = request.dataCachePL;
            this.dataCacheProvisionedIops = request.dataCacheProvisionedIops;
            this.dnsPolicy = request.dnsPolicy;
            this.dryRun = request.dryRun;
            this.egressBandwidth = request.egressBandwidth;
            this.eipBandwidth = request.eipBandwidth;
            this.eipCommonBandwidthPackage = request.eipCommonBandwidthPackage;
            this.eipISP = request.eipISP;
            this.eipInstanceId = request.eipInstanceId;
            this.ephemeralStorage = request.ephemeralStorage;
            this.fixedIp = request.fixedIp;
            this.fixedIpRetainHour = request.fixedIpRetainHour;
            this.gpuDriverVersion = request.gpuDriverVersion;
            this.hostAliase = request.hostAliase;
            this.hostName = request.hostName;
            this.imageAccelerateMode = request.imageAccelerateMode;
            this.imageRegistryCredential = request.imageRegistryCredential;
            this.imageSnapshotId = request.imageSnapshotId;
            this.ingressBandwidth = request.ingressBandwidth;
            this.initContainer = request.initContainer;
            this.insecureRegistry = request.insecureRegistry;
            this.instanceType = request.instanceType;
            this.ipv6AddressCount = request.ipv6AddressCount;
            this.ipv6GatewayBandwidth = request.ipv6GatewayBandwidth;
            this.ipv6GatewayBandwidthEnable = request.ipv6GatewayBandwidthEnable;
            this.memory = request.memory;
            this.ntpServer = request.ntpServer;
            this.osType = request.osType;
            this.overheadReservationOption = request.overheadReservationOption;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.plainHttpRegistry = request.plainHttpRegistry;
            this.privateIpAddress = request.privateIpAddress;
            this.ramRoleName = request.ramRoleName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restartPolicy = request.restartPolicy;
            this.scheduleStrategy = request.scheduleStrategy;
            this.securityGroupId = request.securityGroupId;
            this.shareProcessNamespace = request.shareProcessNamespace;
            this.spotDuration = request.spotDuration;
            this.spotPriceLimit = request.spotPriceLimit;
            this.spotStrategy = request.spotStrategy;
            this.strictSpot = request.strictSpot;
            this.tag = request.tag;
            this.terminationGracePeriodSeconds = request.terminationGracePeriodSeconds;
            this.vSwitchId = request.vSwitchId;
            this.volume = request.volume;
            this.zoneId = request.zoneId;
        } 

        /**
         * DnsConfig.
         */
        public Builder dnsConfig(DnsConfig dnsConfig) {
            this.putQueryParameter("DnsConfig", dnsConfig);
            this.dnsConfig = dnsConfig;
            return this;
        }

        /**
         * HostSecurityContext.
         */
        public Builder hostSecurityContext(HostSecurityContext hostSecurityContext) {
            this.putQueryParameter("HostSecurityContext", hostSecurityContext);
            this.hostSecurityContext = hostSecurityContext;
            return this;
        }

        /**
         * SecurityContext.
         */
        public Builder securityContext(SecurityContext securityContext) {
            this.putQueryParameter("SecurityContext", securityContext);
            this.securityContext = securityContext;
            return this;
        }

        /**
         * <p>The information about the Container Registry Enterprise Edition instance that provides the image for the creation of the elastic container instance. For more information, see <a href="~~194250~~">Pull images from a Container Registry Enterprise Edition instance without using a secret</a>.</p>
         */
        public Builder acrRegistryInfo(java.util.List < AcrRegistryInfo> acrRegistryInfo) {
            this.putQueryParameter("AcrRegistryInfo", acrRegistryInfo);
            this.acrRegistryInfo = acrRegistryInfo;
            return this;
        }

        /**
         * <p>The active period of the elastic container instance. After this period expires, the instance is forced to exit. Unit: seconds.</p>
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
         * <p>Specifies whether to automatically create an EIP and associate it with the elastic container instance.</p>
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
         * <p>Specifies whether to automatically match image caches. Default value: false.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="~~25693~~">How to ensure idempotency</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-xxxx-12d3-xxxx-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The compute category of the instance. For more information, see <a href="~~2638061~~">Specify a compute category to create an elastic container instance</a>.</p>
         */
        public Builder computeCategory(java.util.List < String > computeCategory) {
            this.putQueryParameter("ComputeCategory", computeCategory);
            this.computeCategory = computeCategory;
            return this;
        }

        /**
         * <p>The information about the container.</p>
         */
        public Builder container(java.util.List < Container> container) {
            this.putQueryParameter("Container", container);
            this.container = container;
            return this;
        }

        /**
         * <p>The name of the elastic container instance (container group). The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length.</li>
         * <li>The name can contain lowercase letters, digits, and hyphens (-). It cannot start or end with a hyphen (-).</li>
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
         * <p>Specifies whether to enable container resource view. Container resource view displays the actual container resource data instead of data of the host. If the specifications of the generated elastic container instance are larger than the specifications that you request for when you create the instance, you can enable the ContainerResourceView feature to ensure that the resources that you view in the container are the same as the resources that you request for.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder containerResourceView(Boolean containerResourceView) {
            this.putQueryParameter("ContainerResourceView", containerResourceView);
            this.containerResourceView = containerResourceView;
            return this;
        }

        /**
         * <p>The path to core dump files. For more information, see <a href="~~167801~~">Save core files to volumes</a>.</p>
         * <blockquote>
         * <p> The path cannot start with |. You cannot use core dump files to configure executable programs.``</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/xx/xx/core</p>
         */
        public Builder corePattern(String corePattern) {
            this.putQueryParameter("CorePattern", corePattern);
            this.corePattern = corePattern;
            return this;
        }

        /**
         * <p>The number of vCPUs that you want to allocate to the instance.</p>
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
         * <p>The CPU architecture of the instance. Default value: AMD64. Valid values:</p>
         * <ul>
         * <li>AMD64</li>
         * <li>ARM64</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ARM64</p>
         */
        public Builder cpuArchitecture(String cpuArchitecture) {
            this.putQueryParameter("CpuArchitecture", cpuArchitecture);
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }

        /**
         * <p>The number of physical CPU cores. You can specify this parameter for only specific ECS instance types.</p>
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
         * <p>This parameter is not available.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cpuOptionsNuma(String cpuOptionsNuma) {
            this.putQueryParameter("CpuOptionsNuma", cpuOptionsNuma);
            this.cpuOptionsNuma = cpuOptionsNuma;
            return this;
        }

        /**
         * <p>The number of threads per core. You can specify this parameter for only specific ECS instance types. A value of 1 specifies that Hyper-Threading is disabled.</p>
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
         * <p>The bucket that stores the data cache.</p>
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
         * <p>Specifies whether to enable the performance burst feature when ESSDs AutoPL are used to store data caches. For more information, see <a href="~~368372~~">ESSDs AutoPL</a>.</p>
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
         * <p>The performance level (PL) of the disk that you want to use to store data caches.<br>Enhanced SSDs (ESSDs) are preferentially used to store data caches. The default performance level is PL1.</p>
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
         * <p>The input/output operations per second (IOPS) provisioned for ESSDs AutoPL when ESSDs AutoPL are used to store data caches.<br>Valid values: 0 to min{50000, 1000 × Storage capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Storage capacity, 50,000}.<br>For more information, see <a href="~~368372~~">ESSDs AutoPL</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        public Builder dataCacheProvisionedIops(Long dataCacheProvisionedIops) {
            this.putQueryParameter("DataCacheProvisionedIops", dataCacheProvisionedIops);
            this.dataCacheProvisionedIops = dataCacheProvisionedIops;
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
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li>true: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and available resources. If the request passes the dry run, the DryRunOperation error code is returned. Otherwise, an error message is returned.</li>
         * <li>false (default): performs a dry run and performs the actual request. If the request passes the dry run, the elastic container instance is created.</li>
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
         * <p>The maximum bandwidth value for the EIP. Unit: Mbit/s. Default value: 5.<br>This parameter is valid only when AutoCreateEip is set to true.</p>
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
         * <p>The EIP bandwidth plan that you want to associate with the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp-2zeukbj916scmj51m****</p>
         */
        public Builder eipCommonBandwidthPackage(String eipCommonBandwidthPackage) {
            this.putQueryParameter("EipCommonBandwidthPackage", eipCommonBandwidthPackage);
            this.eipCommonBandwidthPackage = eipCommonBandwidthPackage;
            return this;
        }

        /**
         * <p>The line type of the EIP. Default value: BGP. Valid values:</p>
         * <ul>
         * <li>BGP: BGP (Multi-ISP) line</li>
         * <li>BGP_PRO: BGP (Multi-ISP) Pro line</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BPG</p>
         */
        public Builder eipISP(String eipISP) {
            this.putQueryParameter("EipISP", eipISP);
            this.eipISP = eipISP;
            return this;
        }

        /**
         * <p>The ID of the elastic IP address (EIP).</p>
         * 
         * <strong>example:</strong>
         * <p>eip-uf66jeqopgqa9hdn****</p>
         */
        public Builder eipInstanceId(String eipInstanceId) {
            this.putQueryParameter("EipInstanceId", eipInstanceId);
            this.eipInstanceId = eipInstanceId;
            return this;
        }

        /**
         * <p>The increased capacity of the temporary storage space. Unit: GiB.<br>For more information, see <a href="~~204066~~">Increase the size of the temporary storage space</a>.</p>
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
         * <p>Specifies whether to configure the instance to use a fixed IP address. For more information, see <a href="~~2381086~~">Configure an elastic container instance to use a fixed IP address</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder fixedIp(String fixedIp) {
            this.putQueryParameter("FixedIp", fixedIp);
            this.fixedIp = fixedIp;
            return this;
        }

        /**
         * <p>The retention period of the fixed IP address after the original instance is released and the fixed IP address becomes idle. Unit: hours. Default value: 48.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder fixedIpRetainHour(Integer fixedIpRetainHour) {
            this.putQueryParameter("FixedIpRetainHour", fixedIpRetainHour);
            this.fixedIpRetainHour = fixedIpRetainHour;
            return this;
        }

        /**
         * <p>The version of the GPU driver. Default value: tesla=470.82.01. Valid values:</p>
         * <ul>
         * <li>tesla=470.82.01</li>
         * <li>tesla=525.85.12</li>
         * </ul>
         * <blockquote>
         * <p> You can switch the GPU driver version only for a few Elastic Compute Service (ECS) instance types. For more information, see <a href="~~2579486~~">Specify GPU-accelerated ECS instance types to create an elastic container instance</a>.</p>
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
         * <p>The alias of the elastic container instance.</p>
         */
        public Builder hostAliase(java.util.List < HostAliase> hostAliase) {
            this.putQueryParameter("HostAliase", hostAliase);
            this.hostAliase = hostAliase;
            return this;
        }

        /**
         * <p>The hostname.</p>
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
         * <p>The image acceleration mode. Valid values:</p>
         * <ul>
         * <li>nydus: uses Nydus to accelerate image pulling. The images must support Nydus.</li>
         * <li>dadi: uses DADI to accelerate image pulling. The images must support DADI.</li>
         * <li>p2p: uses P2P to accelerate image pulling. The images must support p2p.</li>
         * <li>imc: uses image caches to accelerate image pulling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>imc</p>
         */
        public Builder imageAccelerateMode(String imageAccelerateMode) {
            this.putQueryParameter("ImageAccelerateMode", imageAccelerateMode);
            this.imageAccelerateMode = imageAccelerateMode;
            return this;
        }

        /**
         * <p>The information about the logon credentials.</p>
         */
        public Builder imageRegistryCredential(java.util.List < ImageRegistryCredential> imageRegistryCredential) {
            this.putQueryParameter("ImageRegistryCredential", imageRegistryCredential);
            this.imageRegistryCredential = imageRegistryCredential;
            return this;
        }

        /**
         * <p>The ID of the image cache. For more information, see <a href="~~141281~~">Use image caches to accelerate the creation of instances</a>.</p>
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
         * <p>The information about the init containers.</p>
         */
        public Builder initContainer(java.util.List < InitContainer> initContainer) {
            this.putQueryParameter("InitContainer", initContainer);
            this.initContainer = initContainer;
            return this;
        }

        /**
         * <p>The address of the self-managed image repository. When you create an elastic container instance by using an image in a self-managed image repository that uses a self-signed certificate, you must specify this parameter to skip the certificate authentication. This prevents image pull failures caused by certificate authentication failures.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;harbor***.pre.com,192.168.XX.XX:5000,reg***.test.com:80&quot;</p>
         */
        public Builder insecureRegistry(String insecureRegistry) {
            this.putQueryParameter("InsecureRegistry", insecureRegistry);
            this.insecureRegistry = insecureRegistry;
            return this;
        }

        /**
         * <p>The ECS instance types that you specify to create the elastic container instance. Multiple instance types are supported. For more information, see <a href="~~114664~~">Specify ECS instance types to create an elastic container instance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The number of IPv6 addresses that are assigned to the instance. Set the value to 1. You can assign only one IPv6 address to an elastic container instance.</p>
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
         * <p>The maximum IPv6 Internet bandwidth when you set Ipv6GatewayBandwidthEnable to true. Valid values:</p>
         * <ul>
         * <li><p>If the billing method for IPv6 network usage is pay-by-bandwidth, the maximum IPv6 Internet bandwidth ranges from 1 to 2,000 Mbit/s.</p>
         * </li>
         * <li><p>If the billing method for IPv6 network usage is pay-by-traffic, the maximum IPv6 Internet bandwidth varies based on the edition of the IPv6 gateway.</p>
         * <ul>
         * <li>If the IPv6 gateway is of Free Edition, the maximum IPv6 Internet bandwidth ranges from 1 to 200 Mbit/s.</li>
         * <li>If the IPv6 gateway is of Enterprise Edition, the maximum IPv6 Internet bandwidth ranges from 1 to 500 Mbit/s.</li>
         * <li>If the IPv6 gateway is of Enhanced Enterprise Edition, the maximum IPv6 Internet bandwidth ranges from 1 to 1000 Mbit/s.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>The default value is the maximum value in the Internet bandwidth range of the IPv6 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder ipv6GatewayBandwidth(String ipv6GatewayBandwidth) {
            this.putQueryParameter("Ipv6GatewayBandwidth", ipv6GatewayBandwidth);
            this.ipv6GatewayBandwidth = ipv6GatewayBandwidth;
            return this;
        }

        /**
         * <p>Specifies whether to enable Internet access to the elastic container instance over IPv6 addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ipv6GatewayBandwidthEnable(Boolean ipv6GatewayBandwidthEnable) {
            this.putQueryParameter("Ipv6GatewayBandwidthEnable", ipv6GatewayBandwidthEnable);
            this.ipv6GatewayBandwidthEnable = ipv6GatewayBandwidthEnable;
            return this;
        }

        /**
         * <p>The memory size that you want to allocate to the instance. Unit: GiB.</p>
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
         * 
         * <strong>example:</strong>
         * <p>ntp.cloud.aliyuncs.com</p>
         */
        public Builder ntpServer(java.util.List < String > ntpServer) {
            this.putQueryParameter("NtpServer", ntpServer);
            this.ntpServer = ntpServer;
            return this;
        }

        /**
         * <p>The operating system of the elastic container instance. Default value: Linux. Valid values:</p>
         * <ul>
         * <li>Linux</li>
         * <li>Windows</li>
         * </ul>
         * <blockquote>
         * <p> Windows instances are in invitational preview. To use the operating system, submit a ticket.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * <p>The options that you can configure when you enable the overhead reservation feature.</p>
         */
        public Builder overheadReservationOption(OverheadReservationOption overheadReservationOption) {
            this.putQueryParameter("OverheadReservationOption", overheadReservationOption);
            this.overheadReservationOption = overheadReservationOption;
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
         * <p>The address of the self-managed image repository. When you create an elastic container instance by using an image in a self-managed image repository that uses the HTTP protocol, you must specify this parameter. This way, Elastic Container Instance pulls the image over the HTTP protocol instead of the default HTTPS protocol. This prevents image pull failures caused by different protocols.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;harbor***.pre.com,192.168.XX.XX:5000,reg***.test.com:80&quot;</p>
         */
        public Builder plainHttpRegistry(String plainHttpRegistry) {
            this.putQueryParameter("PlainHttpRegistry", plainHttpRegistry);
            this.plainHttpRegistry = plainHttpRegistry;
            return this;
        }

        /**
         * <p>The private IP address of the elastic container instance. Only IPv4 addresses are supported. Make sure that the IP address is idle.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.1</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The name of the instance Resource Access Management (RAM) role. You can use the same RAM role to access elastic container instances and ECS instances. For more information, see <a href="~~61178~~">Use an instance RAM role by calling API operations</a>.</p>
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
         * <p>The region ID of the instance.</p>
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The restart policy of the instance. Valid values:</p>
         * <ul>
         * <li>Always: Always restarts the instance if a container in the instance exits upon termination.</li>
         * <li>Never: Never restarts the instance if a container in the instance exits upon termination.</li>
         * <li>OnFailure: Restarts the instance only if a container in the instance exists upon failure with a status code of non-zero.</li>
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
         * <p>The resource scheduling policy when you specify multiple zones to create an elastic container instance. To specify multiple zones, you can use the VSwitchId to specify multiple vSwitches. Valid values:</p>
         * <ul>
         * <li>VSwitchOrdered: The system schedules resources in the sequence of the vSwitches.</li>
         * <li>VSwitchRandom: The system schedules resources at random.</li>
         * </ul>
         * <p>For more information, see <a href="~~157290~~">Specify multiple zones to create an elastic container instance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>VSwitchOrdered</p>
         */
        public Builder scheduleStrategy(String scheduleStrategy) {
            this.putQueryParameter("ScheduleStrategy", scheduleStrategy);
            this.scheduleStrategy = scheduleStrategy;
            return this;
        }

        /**
         * <p>The ID of the security group to which the instance belongs. Instances in the same security group can access each other.</p>
         * <p>If you do not specify a security group, the system automatically uses the default security group in the region that you selected. Make sure that the inbound rules of the security group contain the container protocols and port numbers that you want to expose. If you do not have a default security group in the region, the system creates a default security group, and then adds the container protocols and port numbers that you specified to the inbound rules of the security group.</p>
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
         * <p>Specifies whether to use a shared namespace. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder shareProcessNamespace(Boolean shareProcessNamespace) {
            this.putQueryParameter("ShareProcessNamespace", shareProcessNamespace);
            this.shareProcessNamespace = shareProcessNamespace;
            return this;
        }

        /**
         * <p>The protection period of the preemptible elastic container instance. Unit: hours. Default value: 1. A value of 0 indicates no protection period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder spotDuration(Long spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * <p>The maximum hourly price of the preemptible elastic container instance. The value can be accurate to three decimal places.</p>
         * <p>If you set SpotStrategy to SpotWithPriceLimit, you must specify the SpotPriceLimit parameter.</p>
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
         * <p>The bid policy for the instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instance is created as a pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instance is created as a preemptible instance for which you specify the maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
         * </ul>
         * <p>Default value: NoSpot.</p>
         * 
         * <strong>example:</strong>
         * <p>SpotWithPriceLimit</p>
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * <p>Specifies whether to enable periodical execution.</p>
         * <ul>
         * <li>true: enables periodical execution.</li>
         * <li>false: disables periodical execution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder strictSpot(Boolean strictSpot) {
            this.putQueryParameter("StrictSpot", strictSpot);
            this.strictSpot = strictSpot;
            return this;
        }

        /**
         * <p>The tags that you want to add to the instance. You can bind a maximum of 20 tags. For more information, see <a href="~~146608~~">Use tags to manage elastic container instances</a>.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The buffer period of time during which the program handles operations before the program is stopped. Unit: seconds.</p>
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
         * <p>The IDs of the vSwitches that connect to the instance. You can specify up to 10 vSwitch IDs at a time. Separate multiple vSwitch IDs with commas (,). Example: <code>vsw-***,vsw-***</code>.</p>
         * <p>If you do not specify a vSwitch, the system automatically uses the default vSwitch in the default VPC in the region that you selected. If you do not have a default VPC or a default vSwitch in the region, the system automatically creates a default VPC and a default vSwitch.</p>
         * <blockquote>
         * <p> The number of IP addresses in the vSwitch CIDR block determines the maximum number of elastic container instances that you can create for the vSwitch. Before you create elastic container instances, you must plan the CIDR block of the vSwitch.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1xpiowfm5vo8o3c****,vsw-bp1rkyjgr1xwoho6k****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The information about the volume that you want to mount to the container.</p>
         */
        public Builder volume(java.util.List < Volume> volume) {
            this.putQueryParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        /**
         * <p>The zone ID of the instance. If you do not specify this parameter, the system selects a zone.</p>
         * <p>This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateContainerGroupRequest build() {
            return new CreateContainerGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class Option extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Option(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Option create() {
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
             * <p>The name of the option.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the option.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Option build() {
                return new Option(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class DnsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameServer")
        private java.util.List < String > nameServer;

        @com.aliyun.core.annotation.NameInMap("Option")
        private java.util.List < Option> option;

        @com.aliyun.core.annotation.NameInMap("Search")
        private java.util.List < String > search;

        private DnsConfig(Builder builder) {
            this.nameServer = builder.nameServer;
            this.option = builder.option;
            this.search = builder.search;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsConfig create() {
            return builder().build();
        }

        /**
         * @return nameServer
         */
        public java.util.List < String > getNameServer() {
            return this.nameServer;
        }

        /**
         * @return option
         */
        public java.util.List < Option> getOption() {
            return this.option;
        }

        /**
         * @return search
         */
        public java.util.List < String > getSearch() {
            return this.search;
        }

        public static final class Builder {
            private java.util.List < String > nameServer; 
            private java.util.List < Option> option; 
            private java.util.List < String > search; 

            /**
             * <p>The IP addresses of DNS servers.</p>
             * 
             * <strong>example:</strong>
             * <p>172.10.<em>.</em>*</p>
             */
            public Builder nameServer(java.util.List < String > nameServer) {
                this.nameServer = nameServer;
                return this;
            }

            /**
             * <p>Configuration options of the DNS server.</p>
             */
            public Builder option(java.util.List < Option> option) {
                this.option = option;
                return this;
            }

            /**
             * <p>The search domains of DNS servers.</p>
             * 
             * <strong>example:</strong>
             * <p>svc.local.kubenetes</p>
             */
            public Builder search(java.util.List < String > search) {
                this.search = search;
                return this;
            }

            public DnsConfig build() {
                return new DnsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class Sysctl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Sysctl(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sysctl create() {
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
             * <p>The name of the unsafe sysctl when you modify sysctls by configuring a security context. Valid values:</p>
             * <ul>
             * <li>kernel.shm * (except kernel.shm_rmid_forced)</li>
             * <li>kernel.msg*</li>
             * <li>kernel.sem</li>
             * <li>fs.mqueue.*</li>
             * <li>net.*(except net.ipv4.tcp_syncookies, net.ipv4.ping_group_range, and net.ipv4.ip_unprivileged_port_start)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>kernel.msgmax</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the unsafe sysctl when you modify sysctls by configuring a security context.</p>
             * 
             * <strong>example:</strong>
             * <p>65536</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Sysctl build() {
                return new Sysctl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class HostSecurityContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sysctl")
        private java.util.List < Sysctl> sysctl;

        private HostSecurityContext(Builder builder) {
            this.sysctl = builder.sysctl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostSecurityContext create() {
            return builder().build();
        }

        /**
         * @return sysctl
         */
        public java.util.List < Sysctl> getSysctl() {
            return this.sysctl;
        }

        public static final class Builder {
            private java.util.List < Sysctl> sysctl; 

            /**
             * <p>Configure a security context to modify unsafe sysctls. For more information, see <a href="~~462313~~">Configure a security context</a>.</p>
             */
            public Builder sysctl(java.util.List < Sysctl> sysctl) {
                this.sysctl = sysctl;
                return this;
            }

            public HostSecurityContext build() {
                return new HostSecurityContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class SecurityContextSysctl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SecurityContextSysctl(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityContextSysctl create() {
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
             * <p>The name of the safe sysctl when you modify sysctls by configuring a security context. Valid values:</p>
             * <ul>
             * <li>net.ipv4.ping_group_range</li>
             * <li>net.ipv4.ip_unprivileged_port_start</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>kernel.msgmax</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the safe sysctl when you modify sysctls by configuring a security context.</p>
             * 
             * <strong>example:</strong>
             * <p>65536</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SecurityContextSysctl build() {
                return new SecurityContextSysctl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class SecurityContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sysctl")
        private java.util.List < SecurityContextSysctl> sysctl;

        private SecurityContext(Builder builder) {
            this.sysctl = builder.sysctl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityContext create() {
            return builder().build();
        }

        /**
         * @return sysctl
         */
        public java.util.List < SecurityContextSysctl> getSysctl() {
            return this.sysctl;
        }

        public static final class Builder {
            private java.util.List < SecurityContextSysctl> sysctl; 

            /**
             * <p>Configure a security context to modify safe sysctls. For more information, see <a href="~~462313~~">Configure a security context</a>.</p>
             */
            public Builder sysctl(java.util.List < SecurityContextSysctl> sysctl) {
                this.sysctl = sysctl;
                return this;
            }

            public SecurityContext build() {
                return new SecurityContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class AcrRegistryInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArnService")
        private String arnService;

        @com.aliyun.core.annotation.NameInMap("ArnUser")
        private String arnUser;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private java.util.List < String > domain;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private AcrRegistryInfo(Builder builder) {
            this.arnService = builder.arnService;
            this.arnUser = builder.arnUser;
            this.domain = builder.domain;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AcrRegistryInfo create() {
            return builder().build();
        }

        /**
         * @return arnService
         */
        public String getArnService() {
            return this.arnService;
        }

        /**
         * @return arnUser
         */
        public String getArnUser() {
            return this.arnUser;
        }

        /**
         * @return domain
         */
        public java.util.List < String > getDomain() {
            return this.domain;
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
            private String arnService; 
            private String arnUser; 
            private java.util.List < String > domain; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role in the Alibaba Cloud account to which the elastic container instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1609982529******:role/role-assume</p>
             */
            public Builder arnService(String arnService) {
                this.arnService = arnService;
                return this;
            }

            /**
             * <p>The ARN of the RAM role in the Alibaba Cloud account to which the Container Registry Enterprise Edition instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1298452580******:role/role-acr</p>
             */
            public Builder arnUser(String arnUser) {
                this.arnUser = arnUser;
                return this;
            }

            /**
             * <p>The domain names of the Container Registry Enterprise Edition instance. By default, all domain names of the instance are displayed. You can specify multiple domain names. Separate multiple domain names with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>*****-****-registry.cn-beijing.cr.aliyuncs.com</p>
             */
            public Builder domain(java.util.List < String > domain) {
                this.domain = domain;
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

            public AcrRegistryInfo build() {
                return new AcrRegistryInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class Exec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private java.util.List < String > command;

        private Exec(Builder builder) {
            this.command = builder.command;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Exec create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public java.util.List < String > getCommand() {
            return this.command;
        }

        public static final class Builder {
            private java.util.List < String > command; 

            /**
             * Command.
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            public Exec build() {
                return new Exec(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
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
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
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
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
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
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class ReadinessProbeExec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private java.util.List < String > command;

        private ReadinessProbeExec(Builder builder) {
            this.command = builder.command;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadinessProbeExec create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public java.util.List < String > getCommand() {
            return this.command;
        }

        public static final class Builder {
            private java.util.List < String > command; 

            /**
             * Command.
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            public ReadinessProbeExec build() {
                return new ReadinessProbeExec(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
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
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
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
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
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
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
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
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class ContainerSecurityContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capability")
        @com.aliyun.core.annotation.Validation(required = true)
        private Capability capability;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyRootFilesystem")
        private Boolean readOnlyRootFilesystem;

        @com.aliyun.core.annotation.NameInMap("RunAsUser")
        private Long runAsUser;

        private ContainerSecurityContext(Builder builder) {
            this.capability = builder.capability;
            this.readOnlyRootFilesystem = builder.readOnlyRootFilesystem;
            this.runAsUser = builder.runAsUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerSecurityContext create() {
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

            public ContainerSecurityContext build() {
                return new ContainerSecurityContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
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

            /**
             * FieldPath.
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
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class EnvironmentVar extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldRef")
        @com.aliyun.core.annotation.Validation(required = true)
        private FieldRef fieldRef;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private EnvironmentVar(Builder builder) {
            this.fieldRef = builder.fieldRef;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentVar create() {
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

            /**
             * FieldRef.
             */
            public Builder fieldRef(FieldRef fieldRef) {
                this.fieldRef = fieldRef;
                return this;
            }

            /**
             * <p>The name of the environment variable. The name must be 1 to 128 characters in length and can contain letters, digits, and underscores (_). It cannot start with a digit.``</p>
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

            public EnvironmentVar build() {
                return new EnvironmentVar(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class LifecyclePostStartHandlerHttpGetHttpHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private LifecyclePostStartHandlerHttpGetHttpHeader(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecyclePostStartHandlerHttpGetHttpHeader create() {
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
             * <p>The name of the custom field in the HTTP GET request header when you use HTTP requests to specify a postStart hook.</p>
             * 
             * <strong>example:</strong>
             * <p>Xiao-Custom-Header</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the custom field in the HTTP GET request header when you use HTTP requests to specify a postStart hook.</p>
             * 
             * <strong>example:</strong>
             * <p>test-postStart</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LifecyclePostStartHandlerHttpGetHttpHeader build() {
                return new LifecyclePostStartHandlerHttpGetHttpHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class LifecyclePreStopHandlerHttpGetHttpHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private LifecyclePreStopHandlerHttpGetHttpHeader(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecyclePreStopHandlerHttpGetHttpHeader create() {
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
             * <p>The name of the custom field in the HTTP GET request header when you use HTTP requests to specify a presto hook.</p>
             * 
             * <strong>example:</strong>
             * <p>Xiao-Custom-Header</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the custom field in the HTTP GET request header when you use HTTP requests to specify a preStop hook.</p>
             * 
             * <strong>example:</strong>
             * <p>test-preStop</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LifecyclePreStopHandlerHttpGetHttpHeader build() {
                return new LifecyclePreStopHandlerHttpGetHttpHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class Port extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private Port(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Port create() {
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
             * <p>The type of the protocol. Valid values:</p>
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

            public Port build() {
                return new Port(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class VolumeMount extends TeaModel {
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

        private VolumeMount(Builder builder) {
            this.mountPath = builder.mountPath;
            this.mountPropagation = builder.mountPropagation;
            this.name = builder.name;
            this.readOnly = builder.readOnly;
            this.subPath = builder.subPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VolumeMount create() {
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
             * <p>The directory to which the volume is mounted.</p>
             * <blockquote>
             * <p> The data stored in this directory is overwritten by the data on the volume. Specify this parameter with caution.</p>
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
             * <p>The mount propagation settings of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
             * <ul>
             * <li>None: The volume mount does not receive subsequent mounts that are performed on this volume or subdirectories of this volume.</li>
             * <li>HostToCotainer: The volume mount receives subsequent mounts that are performed on this volume or the subdirectories of this volume.</li>
             * <li>Bidirectional: This value is similar to HostToContainer. The volume mount receives subsequent mounts that are performed on this volume or the subdirectories of this volume. In addition, all volume mounts that are mounted on the container are propagated back to the host and all containers of all pods that use the same volume.</li>
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
             * <p>The name of the volume. The value of this parameter is the same as the name of the volume that is mounted to containers.</p>
             * 
             * <strong>example:</strong>
             * <p>default-volume1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether the volume is read-only. Default value: false.</p>
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

            public VolumeMount build() {
                return new VolumeMount(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class Container extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LivenessProbe")
        @com.aliyun.core.annotation.Validation(required = true)
        private LivenessProbe livenessProbe;

        @com.aliyun.core.annotation.NameInMap("ReadinessProbe")
        @com.aliyun.core.annotation.Validation(required = true)
        private ReadinessProbe readinessProbe;

        @com.aliyun.core.annotation.NameInMap("SecurityContext")
        @com.aliyun.core.annotation.Validation(required = true)
        private ContainerSecurityContext securityContext;

        @com.aliyun.core.annotation.NameInMap("Arg")
        @com.aliyun.core.annotation.Validation(maximum = 65535)
        private java.util.List < String > arg;

        @com.aliyun.core.annotation.NameInMap("Command")
        private java.util.List < String > command;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVar")
        private java.util.List < EnvironmentVar> environmentVar;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVarHide")
        private Boolean environmentVarHide;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Image")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 255, minimum = 1)
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerExec")
        private java.util.List < String > lifecyclePostStartHandlerExec;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerHttpGetHost")
        private String lifecyclePostStartHandlerHttpGetHost;

        @com.aliyun.core.annotation.NameInMap("LifecyclePostStartHandlerHttpGetHttpHeader")
        private java.util.List < LifecyclePostStartHandlerHttpGetHttpHeader> lifecyclePostStartHandlerHttpGetHttpHeader;

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

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerExec")
        private java.util.List < String > lifecyclePreStopHandlerExec;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerHttpGetHost")
        private String lifecyclePreStopHandlerHttpGetHost;

        @com.aliyun.core.annotation.NameInMap("LifecyclePreStopHandlerHttpGetHttpHeader")
        private java.util.List < LifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader;

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
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Port")
        private java.util.List < Port> port;

        @com.aliyun.core.annotation.NameInMap("SecurityContextPrivileged")
        private Boolean securityContextPrivileged;

        @com.aliyun.core.annotation.NameInMap("SecurityContextRunAsGroup")
        private Long securityContextRunAsGroup;

        @com.aliyun.core.annotation.NameInMap("SecurityContextRunAsNonRoot")
        private Boolean securityContextRunAsNonRoot;

        @com.aliyun.core.annotation.NameInMap("Stdin")
        private Boolean stdin;

        @com.aliyun.core.annotation.NameInMap("StdinOnce")
        private Boolean stdinOnce;

        @com.aliyun.core.annotation.NameInMap("TerminationMessagePath")
        private String terminationMessagePath;

        @com.aliyun.core.annotation.NameInMap("TerminationMessagePolicy")
        private String terminationMessagePolicy;

        @com.aliyun.core.annotation.NameInMap("Tty")
        private Boolean tty;

        @com.aliyun.core.annotation.NameInMap("VolumeMount")
        private java.util.List < VolumeMount> volumeMount;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
        private String workingDir;

        private Container(Builder builder) {
            this.livenessProbe = builder.livenessProbe;
            this.readinessProbe = builder.readinessProbe;
            this.securityContext = builder.securityContext;
            this.arg = builder.arg;
            this.command = builder.command;
            this.cpu = builder.cpu;
            this.environmentVar = builder.environmentVar;
            this.environmentVarHide = builder.environmentVarHide;
            this.gpu = builder.gpu;
            this.image = builder.image;
            this.imagePullPolicy = builder.imagePullPolicy;
            this.lifecyclePostStartHandlerExec = builder.lifecyclePostStartHandlerExec;
            this.lifecyclePostStartHandlerHttpGetHost = builder.lifecyclePostStartHandlerHttpGetHost;
            this.lifecyclePostStartHandlerHttpGetHttpHeader = builder.lifecyclePostStartHandlerHttpGetHttpHeader;
            this.lifecyclePostStartHandlerHttpGetPath = builder.lifecyclePostStartHandlerHttpGetPath;
            this.lifecyclePostStartHandlerHttpGetPort = builder.lifecyclePostStartHandlerHttpGetPort;
            this.lifecyclePostStartHandlerHttpGetScheme = builder.lifecyclePostStartHandlerHttpGetScheme;
            this.lifecyclePostStartHandlerTcpSocketHost = builder.lifecyclePostStartHandlerTcpSocketHost;
            this.lifecyclePostStartHandlerTcpSocketPort = builder.lifecyclePostStartHandlerTcpSocketPort;
            this.lifecyclePreStopHandlerExec = builder.lifecyclePreStopHandlerExec;
            this.lifecyclePreStopHandlerHttpGetHost = builder.lifecyclePreStopHandlerHttpGetHost;
            this.lifecyclePreStopHandlerHttpGetHttpHeader = builder.lifecyclePreStopHandlerHttpGetHttpHeader;
            this.lifecyclePreStopHandlerHttpGetPath = builder.lifecyclePreStopHandlerHttpGetPath;
            this.lifecyclePreStopHandlerHttpGetPort = builder.lifecyclePreStopHandlerHttpGetPort;
            this.lifecyclePreStopHandlerHttpGetScheme = builder.lifecyclePreStopHandlerHttpGetScheme;
            this.lifecyclePreStopHandlerTcpSocketHost = builder.lifecyclePreStopHandlerTcpSocketHost;
            this.lifecyclePreStopHandlerTcpSocketPort = builder.lifecyclePreStopHandlerTcpSocketPort;
            this.memory = builder.memory;
            this.name = builder.name;
            this.port = builder.port;
            this.securityContextPrivileged = builder.securityContextPrivileged;
            this.securityContextRunAsGroup = builder.securityContextRunAsGroup;
            this.securityContextRunAsNonRoot = builder.securityContextRunAsNonRoot;
            this.stdin = builder.stdin;
            this.stdinOnce = builder.stdinOnce;
            this.terminationMessagePath = builder.terminationMessagePath;
            this.terminationMessagePolicy = builder.terminationMessagePolicy;
            this.tty = builder.tty;
            this.volumeMount = builder.volumeMount;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Container create() {
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
        public ContainerSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        /**
         * @return arg
         */
        public java.util.List < String > getArg() {
            return this.arg;
        }

        /**
         * @return command
         */
        public java.util.List < String > getCommand() {
            return this.command;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return environmentVar
         */
        public java.util.List < EnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        /**
         * @return environmentVarHide
         */
        public Boolean getEnvironmentVarHide() {
            return this.environmentVarHide;
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
         * @return lifecyclePostStartHandlerExec
         */
        public java.util.List < String > getLifecyclePostStartHandlerExec() {
            return this.lifecyclePostStartHandlerExec;
        }

        /**
         * @return lifecyclePostStartHandlerHttpGetHost
         */
        public String getLifecyclePostStartHandlerHttpGetHost() {
            return this.lifecyclePostStartHandlerHttpGetHost;
        }

        /**
         * @return lifecyclePostStartHandlerHttpGetHttpHeader
         */
        public java.util.List < LifecyclePostStartHandlerHttpGetHttpHeader> getLifecyclePostStartHandlerHttpGetHttpHeader() {
            return this.lifecyclePostStartHandlerHttpGetHttpHeader;
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
         * @return lifecyclePreStopHandlerExec
         */
        public java.util.List < String > getLifecyclePreStopHandlerExec() {
            return this.lifecyclePreStopHandlerExec;
        }

        /**
         * @return lifecyclePreStopHandlerHttpGetHost
         */
        public String getLifecyclePreStopHandlerHttpGetHost() {
            return this.lifecyclePreStopHandlerHttpGetHost;
        }

        /**
         * @return lifecyclePreStopHandlerHttpGetHttpHeader
         */
        public java.util.List < LifecyclePreStopHandlerHttpGetHttpHeader> getLifecyclePreStopHandlerHttpGetHttpHeader() {
            return this.lifecyclePreStopHandlerHttpGetHttpHeader;
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
         * @return port
         */
        public java.util.List < Port> getPort() {
            return this.port;
        }

        /**
         * @return securityContextPrivileged
         */
        public Boolean getSecurityContextPrivileged() {
            return this.securityContextPrivileged;
        }

        /**
         * @return securityContextRunAsGroup
         */
        public Long getSecurityContextRunAsGroup() {
            return this.securityContextRunAsGroup;
        }

        /**
         * @return securityContextRunAsNonRoot
         */
        public Boolean getSecurityContextRunAsNonRoot() {
            return this.securityContextRunAsNonRoot;
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
         * @return terminationMessagePath
         */
        public String getTerminationMessagePath() {
            return this.terminationMessagePath;
        }

        /**
         * @return terminationMessagePolicy
         */
        public String getTerminationMessagePolicy() {
            return this.terminationMessagePolicy;
        }

        /**
         * @return tty
         */
        public Boolean getTty() {
            return this.tty;
        }

        /**
         * @return volumeMount
         */
        public java.util.List < VolumeMount> getVolumeMount() {
            return this.volumeMount;
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
            private ContainerSecurityContext securityContext; 
            private java.util.List < String > arg; 
            private java.util.List < String > command; 
            private Float cpu; 
            private java.util.List < EnvironmentVar> environmentVar; 
            private Boolean environmentVarHide; 
            private Integer gpu; 
            private String image; 
            private String imagePullPolicy; 
            private java.util.List < String > lifecyclePostStartHandlerExec; 
            private String lifecyclePostStartHandlerHttpGetHost; 
            private java.util.List < LifecyclePostStartHandlerHttpGetHttpHeader> lifecyclePostStartHandlerHttpGetHttpHeader; 
            private String lifecyclePostStartHandlerHttpGetPath; 
            private Integer lifecyclePostStartHandlerHttpGetPort; 
            private String lifecyclePostStartHandlerHttpGetScheme; 
            private String lifecyclePostStartHandlerTcpSocketHost; 
            private Integer lifecyclePostStartHandlerTcpSocketPort; 
            private java.util.List < String > lifecyclePreStopHandlerExec; 
            private String lifecyclePreStopHandlerHttpGetHost; 
            private java.util.List < LifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader; 
            private String lifecyclePreStopHandlerHttpGetPath; 
            private Integer lifecyclePreStopHandlerHttpGetPort; 
            private String lifecyclePreStopHandlerHttpGetScheme; 
            private String lifecyclePreStopHandlerTcpSocketHost; 
            private Integer lifecyclePreStopHandlerTcpSocketPort; 
            private Float memory; 
            private String name; 
            private java.util.List < Port> port; 
            private Boolean securityContextPrivileged; 
            private Long securityContextRunAsGroup; 
            private Boolean securityContextRunAsNonRoot; 
            private Boolean stdin; 
            private Boolean stdinOnce; 
            private String terminationMessagePath; 
            private String terminationMessagePolicy; 
            private Boolean tty; 
            private java.util.List < VolumeMount> volumeMount; 
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
            public Builder securityContext(ContainerSecurityContext securityContext) {
                this.securityContext = securityContext;
                return this;
            }

            /**
             * <p>The arguments that are passed to the startup command of the container. You can specify up to 10 arguments.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder arg(java.util.List < String > arg) {
                this.arg = arg;
                return this;
            }

            /**
             * <p>The commands to be executed in the container when you use a CLI to perform health checks.</p>
             * <blockquote>
             * <p> When you configure ReadinessProbe-related parameters, you can select only one of the HttpGet, Exec, and TcpSocket check methods.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>sleep</p>
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The number of vCPUs that you want to allocate to the container.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The environment variables of the container.</p>
             */
            public Builder environmentVar(java.util.List < EnvironmentVar> environmentVar) {
                this.environmentVar = environmentVar;
                return this;
            }

            /**
             * <p>Specifies whether to hide the information about environment variables when you query the details of an elastic container instance. Default value: false. Valid values:</p>
             * <ul>
             * <li>false</li>
             * <li>true If environment variables contain sensitive information, you can set this parameter to true to improve security of the information.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder environmentVarHide(Boolean environmentVarHide) {
                this.environmentVarHide = environmentVarHide;
                return this;
            }

            /**
             * <p>The number of GPUs that you want to allocate to the container.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The image of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com/eci_open/nginx:latest</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The policy that you want to use to pull images. Valid values:</p>
             * <ul>
             * <li>Always: Each time instances are created, image pulling is performed.</li>
             * <li>IfNotPresent: On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</li>
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
             * <p>The commands to be executed in containers when you use a CLI to specify a postStart hook.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/bin/sh&quot;, &quot;-c&quot;, &quot;echo Hello from the postStart handler &gt; /usr/share/message&quot;]</p>
             */
            public Builder lifecyclePostStartHandlerExec(java.util.List < String > lifecyclePostStartHandlerExec) {
                this.lifecyclePostStartHandlerExec = lifecyclePostStartHandlerExec;
                return this;
            }

            /**
             * <p>The IP address of the host that receives the HTTP GET request when you use an HTTP request to specify a postStart hook.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
                this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
                return this;
            }

            /**
             * <p>The HTTP GET request header.</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetHttpHeader(java.util.List < LifecyclePostStartHandlerHttpGetHttpHeader> lifecyclePostStartHandlerHttpGetHttpHeader) {
                this.lifecyclePostStartHandlerHttpGetHttpHeader = lifecyclePostStartHandlerHttpGetHttpHeader;
                return this;
            }

            /**
             * <p>The path to which the system sends an HTTP GET request for a health check when you use an HTTP request to specify a postStart hook.</p>
             * 
             * <strong>example:</strong>
             * <p>/healthyz</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
                this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
                return this;
            }

            /**
             * <p>The port to which the system sends an HTTP GET request when you use an HTTP request to specify a postStart hook.</p>
             * 
             * <strong>example:</strong>
             * <p>5050</p>
             */
            public Builder lifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
                this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
                return this;
            }

            /**
             * <p>The protocol type of HTTP GET requests when you use HTTP requests to specify a postStart hook. Valid values:</p>
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
             * <p>The IP address of the host that receives the TCP socket request when you use a TCP socket request to specify a postStart hook.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
                this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
                return this;
            }

            /**
             * <p>The port to which the system sends a TCP socket request for a health check when you use TCP sockets to specify a postStart hook.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder lifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
                this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
                return this;
            }

            /**
             * <p>The commands to be executed in containers when you use a CLI to specify a preStop hook.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/bin/sh&quot;, &quot;-c&quot;,&quot;echo Hello from the preStop handler &gt; /usr/share/message&quot;]</p>
             */
            public Builder lifecyclePreStopHandlerExec(java.util.List < String > lifecyclePreStopHandlerExec) {
                this.lifecyclePreStopHandlerExec = lifecyclePreStopHandlerExec;
                return this;
            }

            /**
             * <p>The IP address of the host that receives the HTTP GET request when you use an HTTP request to specify a preStop hook.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
                this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
                return this;
            }

            /**
             * <p>The HTTP GET request header.</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetHttpHeader(java.util.List < LifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader) {
                this.lifecyclePreStopHandlerHttpGetHttpHeader = lifecyclePreStopHandlerHttpGetHttpHeader;
                return this;
            }

            /**
             * <p>The path to which the system sends an HTTP GET request for a health check when you use an HTTP request to specify a preSop hook.</p>
             * 
             * <strong>example:</strong>
             * <p>/healthyz</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
                this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
                return this;
            }

            /**
             * <p>The port to which the system sends an HTTP GET request for a health check when you use HTTP requests to specify a preStop hook.</p>
             * 
             * <strong>example:</strong>
             * <p>88</p>
             */
            public Builder lifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
                this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
                return this;
            }

            /**
             * <p>The protocol type of the HTTP GET request when you use an HTTP request to specify a preStop hook. Valid values:</p>
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
             * <p>The IP address of the host that receives the TCP socket request when you use a TCP socket request to specify a preStop hook.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder lifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
                this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
                return this;
            }

            /**
             * <p>The port to which the system sends a TCP socket request for a health check when you use TCP sockets to specify a preStop hook.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder lifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
                this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
                return this;
            }

            /**
             * <p>The memory size of the container. Unit: GiB</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The port to which the system sends an HTTP GET request for a health check when you use HTTP requests to perform health checks.</p>
             * <blockquote>
             * <p> When you configure LivenessProbe-related parameters, you can select only one of the HttpGet, Exec, and TcpSocket check methods.</p>
             * </blockquote>
             */
            public Builder port(java.util.List < Port> port) {
                this.port = port;
                return this;
            }

            /**
             * <p>Specifies whether to enable privileged mode for the container. That is, whether to run the container in privileged mode. Default value: false. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder securityContextPrivileged(Boolean securityContextPrivileged) {
                this.securityContextPrivileged = securityContextPrivileged;
                return this;
            }

            /**
             * <p>The user group that runs the container.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder securityContextRunAsGroup(Long securityContextRunAsGroup) {
                this.securityContextRunAsGroup = securityContextRunAsGroup;
                return this;
            }

            /**
             * <p>Specifies whether to run the container as a non-root user. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder securityContextRunAsNonRoot(Boolean securityContextRunAsNonRoot) {
                this.securityContextRunAsNonRoot = securityContextRunAsNonRoot;
                return this;
            }

            /**
             * <p>Specifies whether the container allocates buffer resources to standard input streams when the container is running. If you do not specify this parameter, an end-of-file (EOF) error may occur when standard input streams in the container are read. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder stdin(Boolean stdin) {
                this.stdin = stdin;
                return this;
            }

            /**
             * <p>Specifies whether standard input streams are disconnected from multiple sessions after a client is disconnected.<br>If StdinOnce is set to true, standard input streams are connected after the container is started, and remain idle until a client is connected to receive data. After the client is disconnected, standard input streams are also disconnected, and remain disconnected until the container restarts.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder stdinOnce(Boolean stdinOnce) {
                this.stdinOnce = stdinOnce;
                return this;
            }

            /**
             * <p>The path of the file from which the system retrieves termination messages of the container when the container exits.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/termination-log</p>
             */
            public Builder terminationMessagePath(String terminationMessagePath) {
                this.terminationMessagePath = terminationMessagePath;
                return this;
            }

            /**
             * <p>The message notification policy. This parameter is empty by default. Only Message Service (MNS) queue message notifications can be sent.</p>
             * 
             * <strong>example:</strong>
             * <p>FallbackToLogsOnError</p>
             */
            public Builder terminationMessagePolicy(String terminationMessagePolicy) {
                this.terminationMessagePolicy = terminationMessagePolicy;
                return this;
            }

            /**
             * <p>Specifies whether to enable interaction. Default value: false.</p>
             * <p>If the command is a /bin/bash command, set the value to true.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder tty(Boolean tty) {
                this.tty = tty;
                return this;
            }

            /**
             * <p>The information about the volume that you want to mount on the container.</p>
             */
            public Builder volumeMount(java.util.List < VolumeMount> volumeMount) {
                this.volumeMount = volumeMount;
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

            public Container build() {
                return new Container(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class HostAliase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hostname")
        private java.util.List < String > hostname;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        private HostAliase(Builder builder) {
            this.hostname = builder.hostname;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAliase create() {
            return builder().build();
        }

        /**
         * @return hostname
         */
        public java.util.List < String > getHostname() {
            return this.hostname;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List < String > hostname; 
            private String ip; 

            /**
             * <p>The hostnames of the elastic container instance.</p>
             * 
             * <strong>example:</strong>
             * <p>hehe.com</p>
             */
            public Builder hostname(java.util.List < String > hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The IP address of the elastic container instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public HostAliase build() {
                return new HostAliase(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class ImageRegistryCredential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private ImageRegistryCredential(Builder builder) {
            this.password = builder.password;
            this.server = builder.server;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRegistryCredential create() {
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
             * <p>The password that you use to access the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>yourpassword</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The address of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-shanghai.aliyuncs.com</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * <p>The username that you use to access the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>yourusername</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ImageRegistryCredential build() {
                return new ImageRegistryCredential(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class SecurityContextCapability extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Add")
        private java.util.List < String > add;

        private SecurityContextCapability(Builder builder) {
            this.add = builder.add;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityContextCapability create() {
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

            public SecurityContextCapability build() {
                return new SecurityContextCapability(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class InitContainerSecurityContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capability")
        @com.aliyun.core.annotation.Validation(required = true)
        private SecurityContextCapability capability;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyRootFilesystem")
        private Boolean readOnlyRootFilesystem;

        @com.aliyun.core.annotation.NameInMap("RunAsUser")
        private Long runAsUser;

        private InitContainerSecurityContext(Builder builder) {
            this.capability = builder.capability;
            this.readOnlyRootFilesystem = builder.readOnlyRootFilesystem;
            this.runAsUser = builder.runAsUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerSecurityContext create() {
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

            public InitContainerSecurityContext build() {
                return new InitContainerSecurityContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class EnvironmentVarFieldRef extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldPath")
        private String fieldPath;

        private EnvironmentVarFieldRef(Builder builder) {
            this.fieldPath = builder.fieldPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentVarFieldRef create() {
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

            /**
             * FieldPath.
             */
            public Builder fieldPath(String fieldPath) {
                this.fieldPath = fieldPath;
                return this;
            }

            public EnvironmentVarFieldRef build() {
                return new EnvironmentVarFieldRef(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class InitContainerEnvironmentVar extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldRef")
        @com.aliyun.core.annotation.Validation(required = true)
        private EnvironmentVarFieldRef fieldRef;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private InitContainerEnvironmentVar(Builder builder) {
            this.fieldRef = builder.fieldRef;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerEnvironmentVar create() {
            return builder().build();
        }

        /**
         * @return fieldRef
         */
        public EnvironmentVarFieldRef getFieldRef() {
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
            private EnvironmentVarFieldRef fieldRef; 
            private String key; 
            private String value; 

            /**
             * FieldRef.
             */
            public Builder fieldRef(EnvironmentVarFieldRef fieldRef) {
                this.fieldRef = fieldRef;
                return this;
            }

            /**
             * <p>The name of the environment variable. The name must be 1 to 128 bits in length and can contain letters, digits, and underscores (_). It cannot start with a digit.``</p>
             * 
             * <strong>example:</strong>
             * <p>Path</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the environment variable. The value must be 0 to 256 bits in length.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/bin/</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InitContainerEnvironmentVar build() {
                return new InitContainerEnvironmentVar(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class InitContainerPort extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private InitContainerPort(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerPort create() {
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
             * <p>8888</p>
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

            public InitContainerPort build() {
                return new InitContainerPort(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class InitContainerVolumeMount extends TeaModel {
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

        private InitContainerVolumeMount(Builder builder) {
            this.mountPath = builder.mountPath;
            this.mountPropagation = builder.mountPropagation;
            this.name = builder.name;
            this.readOnly = builder.readOnly;
            this.subPath = builder.subPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainerVolumeMount create() {
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
             * <p>The directory to which the volume is mounted. The data stored in this directory is overwritten by the data on the volume. Specify this parameter with caution.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/share/</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The mount propagation settings of the volume. Mount propagation allows volumes that are mounted on one init container to be shared with other init containers in the same pod, or even with other pods on the same node. Valid values:</p>
             * <ul>
             * <li>None: The volume mount does not receive subsequent mounts that are performed on this volume or subdirectories of this volume.</li>
             * <li>HostToCotainer: The volume mount receives subsequent mounts that are performed on this volume or the subdirectories of this volume.</li>
             * <li>Bidirectional: This value is similar to HostToContainer. The volume mount receives subsequent mounts that are performed on this volume or the subdirectories of this volume. In addition, all volume mounts that are mounted on the init container are propagated back to the host and all init containers of all pods that use the same volume.</li>
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
             * <p>Specifies whether the mount path is read-only. Default value: false.</p>
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

            public InitContainerVolumeMount build() {
                return new InitContainerVolumeMount(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class InitContainer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityContext")
        @com.aliyun.core.annotation.Validation(required = true)
        private InitContainerSecurityContext securityContext;

        @com.aliyun.core.annotation.NameInMap("Arg")
        @com.aliyun.core.annotation.Validation(maximum = 65535)
        private java.util.List < String > arg;

        @com.aliyun.core.annotation.NameInMap("Command")
        private java.util.List < String > command;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVar")
        private java.util.List < InitContainerEnvironmentVar> environmentVar;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Port")
        private java.util.List < InitContainerPort> port;

        @com.aliyun.core.annotation.NameInMap("TerminationMessagePath")
        private String terminationMessagePath;

        @com.aliyun.core.annotation.NameInMap("TerminationMessagePolicy")
        private String terminationMessagePolicy;

        @com.aliyun.core.annotation.NameInMap("VolumeMount")
        private java.util.List < InitContainerVolumeMount> volumeMount;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
        private String workingDir;

        private InitContainer(Builder builder) {
            this.securityContext = builder.securityContext;
            this.arg = builder.arg;
            this.command = builder.command;
            this.cpu = builder.cpu;
            this.environmentVar = builder.environmentVar;
            this.gpu = builder.gpu;
            this.image = builder.image;
            this.imagePullPolicy = builder.imagePullPolicy;
            this.memory = builder.memory;
            this.name = builder.name;
            this.port = builder.port;
            this.terminationMessagePath = builder.terminationMessagePath;
            this.terminationMessagePolicy = builder.terminationMessagePolicy;
            this.volumeMount = builder.volumeMount;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainer create() {
            return builder().build();
        }

        /**
         * @return securityContext
         */
        public InitContainerSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        /**
         * @return arg
         */
        public java.util.List < String > getArg() {
            return this.arg;
        }

        /**
         * @return command
         */
        public java.util.List < String > getCommand() {
            return this.command;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return environmentVar
         */
        public java.util.List < InitContainerEnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
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
         * @return port
         */
        public java.util.List < InitContainerPort> getPort() {
            return this.port;
        }

        /**
         * @return terminationMessagePath
         */
        public String getTerminationMessagePath() {
            return this.terminationMessagePath;
        }

        /**
         * @return terminationMessagePolicy
         */
        public String getTerminationMessagePolicy() {
            return this.terminationMessagePolicy;
        }

        /**
         * @return volumeMount
         */
        public java.util.List < InitContainerVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private InitContainerSecurityContext securityContext; 
            private java.util.List < String > arg; 
            private java.util.List < String > command; 
            private Float cpu; 
            private java.util.List < InitContainerEnvironmentVar> environmentVar; 
            private Integer gpu; 
            private String image; 
            private String imagePullPolicy; 
            private Float memory; 
            private String name; 
            private java.util.List < InitContainerPort> port; 
            private String terminationMessagePath; 
            private String terminationMessagePolicy; 
            private java.util.List < InitContainerVolumeMount> volumeMount; 
            private String workingDir; 

            /**
             * SecurityContext.
             */
            public Builder securityContext(InitContainerSecurityContext securityContext) {
                this.securityContext = securityContext;
                return this;
            }

            /**
             * <p>The arguments that are passed to the startup command of the init container.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder arg(java.util.List < String > arg) {
                this.arg = arg;
                return this;
            }

            /**
             * <p>The startup commands of the init container.</p>
             * 
             * <strong>example:</strong>
             * <p>sleep</p>
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The number of vCPUs that you want to allocate to the init container.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The environment variable of the init container.</p>
             */
            public Builder environmentVar(java.util.List < InitContainerEnvironmentVar> environmentVar) {
                this.environmentVar = environmentVar;
                return this;
            }

            /**
             * <p>The number of GPUs that you want to allocate to the init container.</p>
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
             * <p>The policy that you want to use to pull images. Valid values:</p>
             * <ul>
             * <li>Always: Each time instances are created, image pulling is performed.</li>
             * <li>IfNotPresent: On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</li>
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
             * <p>The memory size that you want to allocate to the init container. Unit: GiB.</p>
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
             * <p>The information about the port.</p>
             */
            public Builder port(java.util.List < InitContainerPort> port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The path of the file from which the system retrieves termination messages of the init container when the init container exits.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/termination-log</p>
             */
            public Builder terminationMessagePath(String terminationMessagePath) {
                this.terminationMessagePath = terminationMessagePath;
                return this;
            }

            /**
             * <p>The message notification policy. This parameter is empty by default.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder terminationMessagePolicy(String terminationMessagePolicy) {
                this.terminationMessagePolicy = terminationMessagePolicy;
                return this;
            }

            /**
             * <p>The information about the volumes that you want to mount to the init containers.</p>
             */
            public Builder volumeMount(java.util.List < InitContainerVolumeMount> volumeMount) {
                this.volumeMount = volumeMount;
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

            public InitContainer build() {
                return new InitContainer(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class OverheadReservationOption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableOverheadReservation")
        private Boolean enableOverheadReservation;

        private OverheadReservationOption(Builder builder) {
            this.enableOverheadReservation = builder.enableOverheadReservation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverheadReservationOption create() {
            return builder().build();
        }

        /**
         * @return enableOverheadReservation
         */
        public Boolean getEnableOverheadReservation() {
            return this.enableOverheadReservation;
        }

        public static final class Builder {
            private Boolean enableOverheadReservation; 

            /**
             * <p>Specify whether to enable the overhead reservation feature. Default: false. Valid values: true and false. After you enable the overhead reservation feature, the system automatically adds the overhead to the specification of the elastic container instance, and then adjusts the specification of the instance upward to the most approximate specification. You are charged based on the new specification after the adjustment.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableOverheadReservation(Boolean enableOverheadReservation) {
                this.enableOverheadReservation = enableOverheadReservation;
                return this;
            }

            public OverheadReservationOption build() {
                return new OverheadReservationOption(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
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
             * <p>The tag key. The tag key cannot be an empty string and must be unique. The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>version</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be an empty string. The tag value can be up to 128 characters in length. It cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class ConfigFileToPath extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private ConfigFileToPath(Builder builder) {
            this.content = builder.content;
            this.mode = builder.mode;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigFileToPath create() {
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public ConfigFileToPath build() {
                return new ConfigFileToPath(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class ConfigFileVolume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigFileToPath")
        private java.util.List < ConfigFileToPath> configFileToPath;

        @com.aliyun.core.annotation.NameInMap("DefaultMode")
        private Integer defaultMode;

        private ConfigFileVolume(Builder builder) {
            this.configFileToPath = builder.configFileToPath;
            this.defaultMode = builder.defaultMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigFileVolume create() {
            return builder().build();
        }

        /**
         * @return configFileToPath
         */
        public java.util.List < ConfigFileToPath> getConfigFileToPath() {
            return this.configFileToPath;
        }

        /**
         * @return defaultMode
         */
        public Integer getDefaultMode() {
            return this.defaultMode;
        }

        public static final class Builder {
            private java.util.List < ConfigFileToPath> configFileToPath; 
            private Integer defaultMode; 

            /**
             * ConfigFileToPath.
             */
            public Builder configFileToPath(java.util.List < ConfigFileToPath> configFileToPath) {
                this.configFileToPath = configFileToPath;
                return this;
            }

            /**
             * DefaultMode.
             */
            public Builder defaultMode(Integer defaultMode) {
                this.defaultMode = defaultMode;
                return this;
            }

            public ConfigFileVolume build() {
                return new ConfigFileVolume(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
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
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
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
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
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
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
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
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
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
             * <p>Specifies whether the mount path is read-only. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>The address of the image repository.</p>
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
     * {@link CreateContainerGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateContainerGroupRequest</p>
     */
    public static class Volume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigFileVolume")
        @com.aliyun.core.annotation.Validation(required = true)
        private ConfigFileVolume configFileVolume;

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

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Volume(Builder builder) {
            this.configFileVolume = builder.configFileVolume;
            this.diskVolume = builder.diskVolume;
            this.emptyDirVolume = builder.emptyDirVolume;
            this.flexVolume = builder.flexVolume;
            this.hostPathVolume = builder.hostPathVolume;
            this.NFSVolume = builder.NFSVolume;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Volume create() {
            return builder().build();
        }

        /**
         * @return configFileVolume
         */
        public ConfigFileVolume getConfigFileVolume() {
            return this.configFileVolume;
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
            private ConfigFileVolume configFileVolume; 
            private DiskVolume diskVolume; 
            private EmptyDirVolume emptyDirVolume; 
            private FlexVolume flexVolume; 
            private HostPathVolume hostPathVolume; 
            private NFSVolume NFSVolume; 
            private String name; 
            private String type; 

            /**
             * ConfigFileVolume.
             */
            public Builder configFileVolume(ConfigFileVolume configFileVolume) {
                this.configFileVolume = configFileVolume;
                return this;
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
             * <p>The type of the HostPath volume. Valid values:</p>
             * <ul>
             * <li>Directory</li>
             * <li>File</li>
             * </ul>
             * <blockquote>
             * <p> Only users in the whitelist can mount HostPath volumes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ConfigFileVolume</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Volume build() {
                return new Volume(this);
            } 

        } 

    }
}
