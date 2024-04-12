// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateContainerGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateContainerGroupRequest</p>
 */
public class CreateContainerGroupRequest extends Request {
    @Query
    @NameInMap("DnsConfig")
    private DnsConfig dnsConfig;

    @Query
    @NameInMap("HostSecurityContext")
    private HostSecurityContext hostSecurityContext;

    @Query
    @NameInMap("SecurityContext")
    private SecurityContext securityContext;

    @Query
    @NameInMap("AcrRegistryInfo")
    private java.util.List < AcrRegistryInfo> acrRegistryInfo;

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
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ComputeCategory")
    private java.util.List < String > computeCategory;

    @Query
    @NameInMap("Container")
    @Validation(required = true)
    private java.util.List < Container> container;

    @Query
    @NameInMap("ContainerGroupName")
    @Validation(required = true)
    private String containerGroupName;

    @Query
    @NameInMap("ContainerResourceView")
    private Boolean containerResourceView;

    @Query
    @NameInMap("CorePattern")
    private String corePattern;

    @Query
    @NameInMap("Cpu")
    private Float cpu;

    @Query
    @NameInMap("CpuArchitecture")
    private String cpuArchitecture;

    @Query
    @NameInMap("CpuOptionsCore")
    @Validation(maximum = 1000)
    private Integer cpuOptionsCore;

    @Query
    @NameInMap("CpuOptionsNuma")
    private String cpuOptionsNuma;

    @Query
    @NameInMap("CpuOptionsThreadsPerCore")
    @Validation(maximum = 1000)
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
    private Long dataCacheProvisionedIops;

    @Query
    @NameInMap("DnsPolicy")
    private String dnsPolicy;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("EgressBandwidth")
    @Validation()
    private Long egressBandwidth;

    @Query
    @NameInMap("EipBandwidth")
    @Validation(maximum = 1000000)
    private Integer eipBandwidth;

    @Query
    @NameInMap("EipCommonBandwidthPackage")
    private String eipCommonBandwidthPackage;

    @Query
    @NameInMap("EipISP")
    private String eipISP;

    @Query
    @NameInMap("EipInstanceId")
    private String eipInstanceId;

    @Query
    @NameInMap("EphemeralStorage")
    @Validation(maximum = 5000)
    private Integer ephemeralStorage;

    @Query
    @NameInMap("FixedIp")
    private String fixedIp;

    @Query
    @NameInMap("FixedIpRetainHour")
    private Integer fixedIpRetainHour;

    @Query
    @NameInMap("GpuDriverVersion")
    private String gpuDriverVersion;

    @Query
    @NameInMap("HostAliase")
    private java.util.List < HostAliase> hostAliase;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("ImageAccelerateMode")
    private String imageAccelerateMode;

    @Query
    @NameInMap("ImageRegistryCredential")
    private java.util.List < ImageRegistryCredential> imageRegistryCredential;

    @Query
    @NameInMap("ImageSnapshotId")
    private String imageSnapshotId;

    @Query
    @NameInMap("IngressBandwidth")
    @Validation()
    private Long ingressBandwidth;

    @Query
    @NameInMap("InitContainer")
    private java.util.List < InitContainer> initContainer;

    @Query
    @NameInMap("InsecureRegistry")
    private String insecureRegistry;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @Query
    @NameInMap("Ipv6GatewayBandwidth")
    private String ipv6GatewayBandwidth;

    @Query
    @NameInMap("Ipv6GatewayBandwidthEnable")
    private Boolean ipv6GatewayBandwidthEnable;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("NtpServer")
    private java.util.List < String > ntpServer;

    @Query
    @NameInMap("OsType")
    private String osType;

    @Query
    @NameInMap("OverheadReservationOption")
    private OverheadReservationOption overheadReservationOption;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PlainHttpRegistry")
    private String plainHttpRegistry;

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
    @NameInMap("RestartPolicy")
    private String restartPolicy;

    @Query
    @NameInMap("ScheduleStrategy")
    private String scheduleStrategy;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("ShareProcessNamespace")
    private Boolean shareProcessNamespace;

    @Query
    @NameInMap("SpotDuration")
    private Long spotDuration;

    @Query
    @NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("StrictSpot")
    private Boolean strictSpot;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TerminationGracePeriodSeconds")
    private Long terminationGracePeriodSeconds;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("Volume")
    private java.util.List < Volume> volume;

    @Query
    @NameInMap("ZoneId")
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
         * The information about the Container Registry Enterprise Edition instance. For more information, see [Pull images from a Container Registry Enterprise Edition instance without using secrets](~~194250~~).
         */
        public Builder acrRegistryInfo(java.util.List < AcrRegistryInfo> acrRegistryInfo) {
            this.putQueryParameter("AcrRegistryInfo", acrRegistryInfo);
            this.acrRegistryInfo = acrRegistryInfo;
            return this;
        }

        /**
         * The validity period of the elastic container instance. When this period expires, the instance is forced to exit. Unit: seconds.
         */
        public Builder activeDeadlineSeconds(Long activeDeadlineSeconds) {
            this.putQueryParameter("ActiveDeadlineSeconds", activeDeadlineSeconds);
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        /**
         * Specifies whether to automatically create an EIP and associate it with the elastic container instance.
         */
        public Builder autoCreateEip(Boolean autoCreateEip) {
            this.putQueryParameter("AutoCreateEip", autoCreateEip);
            this.autoCreateEip = autoCreateEip;
            return this;
        }

        /**
         * Specifies whether to automatically match image caches. Default value: false.
         */
        public Builder autoMatchImageCache(Boolean autoMatchImageCache) {
            this.putQueryParameter("AutoMatchImageCache", autoMatchImageCache);
            this.autoMatchImageCache = autoMatchImageCache;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotency of requests?](~~25693~~)
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The computing power type of the instance.
         */
        public Builder computeCategory(java.util.List < String > computeCategory) {
            this.putQueryParameter("ComputeCategory", computeCategory);
            this.computeCategory = computeCategory;
            return this;
        }

        /**
         * The information about the containers.
         */
        public Builder container(java.util.List < Container> container) {
            this.putQueryParameter("Container", container);
            this.container = container;
            return this;
        }

        /**
         * The name of the elastic container instance. Format requirements:
         * <p>
         * 
         * *   The name must be 2 to 128 characters in length
         * *   The name can contain lowercase letters, digits, and hyphens (-). It cannot start or end with a hyphen (-).
         */
        public Builder containerGroupName(String containerGroupName) {
            this.putQueryParameter("ContainerGroupName", containerGroupName);
            this.containerGroupName = containerGroupName;
            return this;
        }

        /**
         * Specifies whether to enable container resource view. Container resource view displays the actual container resource data instead of data of the host. If the specifications of the generated elastic container instance are larger than the specifications that you request for when you create the instance, you can enable the ContainerResourceView feature to ensure that the resources that you view in the container are the same as the resources that you request for.
         */
        public Builder containerResourceView(Boolean containerResourceView) {
            this.putQueryParameter("ContainerResourceView", containerResourceView);
            this.containerResourceView = containerResourceView;
            return this;
        }

        /**
         * The path to store core dump files. For more information, see [Save core files to volumes](~~167801~~).
         * <p>
         * 
         * > The path cannot start with a vertical bar (`|`). You cannot use core dump files to configure executable programs.
         */
        public Builder corePattern(String corePattern) {
            this.putQueryParameter("CorePattern", corePattern);
            this.corePattern = corePattern;
            return this;
        }

        /**
         * The number of vCPUs that you want to allocate to the elastic container instance.
         */
        public Builder cpu(Float cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * The CPU architecture of the instance. Default value: AMD64. Valid values:
         * <p>
         * 
         * *   AMD64
         * *   ARM64
         */
        public Builder cpuArchitecture(String cpuArchitecture) {
            this.putQueryParameter("CpuArchitecture", cpuArchitecture);
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }

        /**
         * The number of physical CPU cores. You can specify this parameter only for specific instance types. For more information, see [Specify custom CPU options](~~197781~~).
         */
        public Builder cpuOptionsCore(Integer cpuOptionsCore) {
            this.putQueryParameter("CpuOptionsCore", cpuOptionsCore);
            this.cpuOptionsCore = cpuOptionsCore;
            return this;
        }

        /**
         * This parameter is not available.
         */
        public Builder cpuOptionsNuma(String cpuOptionsNuma) {
            this.putQueryParameter("CpuOptionsNuma", cpuOptionsNuma);
            this.cpuOptionsNuma = cpuOptionsNuma;
            return this;
        }

        /**
         * The number of threads per core. You can specify this parameter only for specific instance types. If you set this parameter to 1, Hyper-Threading is disabled. For more information, see [Specify custom CPU options](~~197781~~).
         */
        public Builder cpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
            this.putQueryParameter("CpuOptionsThreadsPerCore", cpuOptionsThreadsPerCore);
            this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
            return this;
        }

        /**
         * The bucket to store data caches.
         */
        public Builder dataCacheBucket(String dataCacheBucket) {
            this.putQueryParameter("DataCacheBucket", dataCacheBucket);
            this.dataCacheBucket = dataCacheBucket;
            return this;
        }

        /**
         * Specifies whether to enable the performance burst feature when ESSDs AutoPL are used for data caching. For more information, see [ESSDs AutoPL](~~368372~~).
         */
        public Builder dataCacheBurstingEnabled(Boolean dataCacheBurstingEnabled) {
            this.putQueryParameter("DataCacheBurstingEnabled", dataCacheBurstingEnabled);
            this.dataCacheBurstingEnabled = dataCacheBurstingEnabled;
            return this;
        }

        /**
         * The performance level of the disk used by data caches.\
         * <p>
         * Enhanced SSDs (ESSDs) are preferentially used. The default performance level is PL1.
         */
        public Builder dataCachePL(String dataCachePL) {
            this.putQueryParameter("DataCachePL", dataCachePL);
            this.dataCachePL = dataCachePL;
            return this;
        }

        /**
         * The input/output operations per second (IOPS) provisioned for ESSDs AutoPL when ESSDs AutoPL are used for data caching.\
         * <p>
         * Valid values: 0 to min{50000, 1000 × Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.\
         * For more information, see [ESSDs AutoPL](~~368372~~).
         */
        public Builder dataCacheProvisionedIops(Long dataCacheProvisionedIops) {
            this.putQueryParameter("DataCacheProvisionedIops", dataCacheProvisionedIops);
            this.dataCacheProvisionedIops = dataCacheProvisionedIops;
            return this;
        }

        /**
         * The Domain Name System (DNS) policy. Valid values:
         * <p>
         * 
         * *   None: uses the DNS that is specified for DnsConfig-related parameters.
         * *   Default: uses the DNS that is specified for the runtime environment.
         */
        public Builder dnsPolicy(String dnsPolicy) {
            this.putQueryParameter("DnsPolicy", dnsPolicy);
            this.dnsPolicy = dnsPolicy;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run without performing the actual request. Valid values:
         * <p>
         * 
         * *   true: performs only a dry run without creating an elastic container instance. The check items include the request format, service limits, resource inventory, and whether the required parameters are specified. If the request fails the dry run, an error is returned. If the request passes the dry run, the DryRun.Success error code is returned.
         * *   false (default): performs a dry run, and creates an elastic container instance after the request passes the dry run.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
         * The bandwidth of the EIP. Unit: Mbit/s. Default value: 5.\
         * <p>
         * You can specify this parameter when you set AutoCreateEip to true.
         */
        public Builder eipBandwidth(Integer eipBandwidth) {
            this.putQueryParameter("EipBandwidth", eipBandwidth);
            this.eipBandwidth = eipBandwidth;
            return this;
        }

        /**
         * Specifies the EIP bandwidth plan that you want to use.
         */
        public Builder eipCommonBandwidthPackage(String eipCommonBandwidthPackage) {
            this.putQueryParameter("EipCommonBandwidthPackage", eipCommonBandwidthPackage);
            this.eipCommonBandwidthPackage = eipCommonBandwidthPackage;
            return this;
        }

        /**
         * The line type of the elastic IP address (EIP). Valid values:
         * <p>
         * 
         * *   BGP: BGP (Multi-ISP) lines
         * *   BGP_PRO: BGP (Multi-ISP) Pro lines
         */
        public Builder eipISP(String eipISP) {
            this.putQueryParameter("EipISP", eipISP);
            this.eipISP = eipISP;
            return this;
        }

        /**
         * The ID of the elastic IP address (EIP).
         */
        public Builder eipInstanceId(String eipInstanceId) {
            this.putQueryParameter("EipInstanceId", eipInstanceId);
            this.eipInstanceId = eipInstanceId;
            return this;
        }

        /**
         * The increased storage capacity of the temporary storage space. Unit: GiB.\
         * <p>
         * For more information, see [Increase the storage capacity of the temporary storage space](~~204066~~).
         */
        public Builder ephemeralStorage(Integer ephemeralStorage) {
            this.putQueryParameter("EphemeralStorage", ephemeralStorage);
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }

        /**
         * Specifies whether to configure the instance to use a fixed IP address. For more information, see [Configure an elastic container instance to use a fixed IP address](~~2381086~~).
         */
        public Builder fixedIp(String fixedIp) {
            this.putQueryParameter("FixedIp", fixedIp);
            this.fixedIp = fixedIp;
            return this;
        }

        /**
         * The retention period of the fixed IP address after the original instance is released and the fixed IP address becomes idle. Unit: hours. Default value: 48.
         */
        public Builder fixedIpRetainHour(Integer fixedIpRetainHour) {
            this.putQueryParameter("FixedIpRetainHour", fixedIpRetainHour);
            this.fixedIpRetainHour = fixedIpRetainHour;
            return this;
        }

        /**
         * GpuDriverVersion.
         */
        public Builder gpuDriverVersion(String gpuDriverVersion) {
            this.putQueryParameter("GpuDriverVersion", gpuDriverVersion);
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }

        /**
         * The alias of the elastic container instance.
         */
        public Builder hostAliase(java.util.List < HostAliase> hostAliase) {
            this.putQueryParameter("HostAliase", hostAliase);
            this.hostAliase = hostAliase;
            return this;
        }

        /**
         * The hostname of the instance.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * The image acceleration mode. Valid values:
         * <p>
         * 
         * *   nydus: Nydus is used to accelerate image pulling. The images must support Nydus.
         * *   dadi: DADI is used to accelerate image pulling. The images must support DADI.
         * *   p2p: P2P is used to accelerate image pulling. The images must support P2P.
         * *   imc: Image caches are used to accelerate image pulling.
         */
        public Builder imageAccelerateMode(String imageAccelerateMode) {
            this.putQueryParameter("ImageAccelerateMode", imageAccelerateMode);
            this.imageAccelerateMode = imageAccelerateMode;
            return this;
        }

        /**
         * The information about the image repository.
         */
        public Builder imageRegistryCredential(java.util.List < ImageRegistryCredential> imageRegistryCredential) {
            this.putQueryParameter("ImageRegistryCredential", imageRegistryCredential);
            this.imageRegistryCredential = imageRegistryCredential;
            return this;
        }

        /**
         * The ID of the image cache. For more information, see [Use image caches to accelerate the creation of instances](~~141281~~).
         */
        public Builder imageSnapshotId(String imageSnapshotId) {
            this.putQueryParameter("ImageSnapshotId", imageSnapshotId);
            this.imageSnapshotId = imageSnapshotId;
            return this;
        }

        /**
         * The maximum inbound bandwidth. Unit: bytes.
         */
        public Builder ingressBandwidth(Long ingressBandwidth) {
            this.putQueryParameter("IngressBandwidth", ingressBandwidth);
            this.ingressBandwidth = ingressBandwidth;
            return this;
        }

        /**
         * The information about the init containers.
         */
        public Builder initContainer(java.util.List < InitContainer> initContainer) {
            this.putQueryParameter("InitContainer", initContainer);
            this.initContainer = initContainer;
            return this;
        }

        /**
         * The address of the self-managed image repository. When you create an elastic container instance by using an image in a self-managed image repository that uses a self-signed certificate, you must specify this parameter to skip the certificate authentication. This prevents image pull failures caused by certificate authentication failures.
         */
        public Builder insecureRegistry(String insecureRegistry) {
            this.putQueryParameter("InsecureRegistry", insecureRegistry);
            this.insecureRegistry = insecureRegistry;
            return this;
        }

        /**
         * The ECS instance type. Different instance types are supported. For more information, see [Specify an ECS instance type to create an elastic container instance](~~114664~~).
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The number of IPv6 addresses. Set the value to 1. You can assign only one IPv6 address to an elastic container instance.
         */
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * The peak Internet bandwidth of the IPv6 address when the Ipv6GatewayBandwidthEnable parameter is set to true. Valid values:
         * <p>
         * 
         * *   If the billing method for the Internet bandwidth of the IPv6 gateway is pay-by-bandwidth, the Internet bandwidth of the IPv6 address ranges from 1 to 2,000 Mbit/s.
         * 
         * *   If the billing method for the Internet bandwidth of the IPv6 gateway is pay-by-traffic, the Internet bandwidth range of the IPv6 address is based on the edition of the IPv6 gateway.
         * 
         *     *   If the IPv6 gateway is of Free Edition, the Internet bandwidth of the IPv6 address ranges from 1 to 200 Mbit/s.
         *     *   If the IPv6 gateway is of Enterprise Edition, the Internet bandwidth of the IPv6 address ranges from 1 to 500 Mbit/s.
         *     *   If the IPv6 gateway is of Enhanced Enterprise Edition, the Internet bandwidth of the IPv6 address ranges from 1 to 1,000 Mbit/s.
         * 
         * The default value is the maximum value in the Internet bandwidth range of the IPv6 gateway.
         */
        public Builder ipv6GatewayBandwidth(String ipv6GatewayBandwidth) {
            this.putQueryParameter("Ipv6GatewayBandwidth", ipv6GatewayBandwidth);
            this.ipv6GatewayBandwidth = ipv6GatewayBandwidth;
            return this;
        }

        /**
         * Specifies whether to enable IPv6 Internet access for the elastic container instance.
         */
        public Builder ipv6GatewayBandwidthEnable(Boolean ipv6GatewayBandwidthEnable) {
            this.putQueryParameter("Ipv6GatewayBandwidthEnable", ipv6GatewayBandwidthEnable);
            this.ipv6GatewayBandwidthEnable = ipv6GatewayBandwidthEnable;
            return this;
        }

        /**
         * The memory size that you want to allocate to the elastic container instance. Unit: GiB.
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * The domain names of the NTP server.
         */
        public Builder ntpServer(java.util.List < String > ntpServer) {
            this.putQueryParameter("NtpServer", ntpServer);
            this.ntpServer = ntpServer;
            return this;
        }

        /**
         * The operating system of the elastic container instance. Default value: Linux. Valid values:
         * <p>
         * 
         * *   Linux
         * *   Windows
         * 
         * >  Windows instances are in invitational preview. To use the operating system, submit a ticket.
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * The options that you can configure when you enable the overhead reservation feature.
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
         * The address of the self-managed image repository. When you create an elastic container instance by using an image in a self-managed image repository that uses the HTTP protocol, you must specify this parameter. This allows Elastic Container Instance to pull the image over the HTTP protocol instead over the default HTTPS protocol. This prevents image pull failures caused by different protocols.
         */
        public Builder plainHttpRegistry(String plainHttpRegistry) {
            this.putQueryParameter("PlainHttpRegistry", plainHttpRegistry);
            this.plainHttpRegistry = plainHttpRegistry;
            return this;
        }

        /**
         * The private IP address of the elastic container instance. Only IPv4 addresses are supported. Make sure that the IP address is idle.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The name of the RAM role that you want to associate with the elastic container instance. You can use the RAM role to access elastic container instances and ECS instances. For more information, see [Use an instance RAM role by calling API operations](~~61178~~).
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The restart policy of the elastic container instance. Valid values:
         * <p>
         * 
         * *   Always: Always restarts the instance.
         * *   Never: Never restarts the instance.
         * *   OnFailure: Restarts the instance when the last start failed.
         * 
         * Default value: Always.
         */
        public Builder restartPolicy(String restartPolicy) {
            this.putQueryParameter("RestartPolicy", restartPolicy);
            this.restartPolicy = restartPolicy;
            return this;
        }

        /**
         * The resource scheduling policy when you specify multiple zones to create an elastic container instance. To specify multiple zones, you can use the VSwitchId to specify multiple vSwitches. Valid values:
         * <p>
         * 
         * *   VSwitchOrdered: The system schedules resources in the sequence of the vSwitches.
         * *   VSwitchRandom: The system schedules resources at random.
         * 
         * For more information, see [Specify multiple zones to create an elastic container instance](~~157290~~).
         */
        public Builder scheduleStrategy(String scheduleStrategy) {
            this.putQueryParameter("ScheduleStrategy", scheduleStrategy);
            this.scheduleStrategy = scheduleStrategy;
            return this;
        }

        /**
         * The ID of the security group to which the instance is assigned. Instances within the same security group can access each other.
         * <p>
         * 
         * If you do not specify a security group, the system automatically uses the default security group in the region that you selected. Make sure that the inbound rules of the security group contain the container protocols and port numbers that you want to expose. If you do not have a default security group in the region, the system creates a default security group, and then adds the container protocols and port numbers that you specified to the inbound rules of the security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Specifies whether to use a shared namespace. Default value: false.
         */
        public Builder shareProcessNamespace(Boolean shareProcessNamespace) {
            this.putQueryParameter("ShareProcessNamespace", shareProcessNamespace);
            this.shareProcessNamespace = shareProcessNamespace;
            return this;
        }

        /**
         * The protection period of the preemptible instance. Unit: hours. Default value: 1. A value of 0 indicates no protection period.
         */
        public Builder spotDuration(Long spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * The maximum hourly price of the preemptible elastic container instance. The value can contain up to three decimal places.
         * <p>
         * 
         * If you set SpotStrategy to SpotWithPriceLimit, you must specify SpotPriceLimit.
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * The bidding policy for the instance. Valid values:
         * <p>
         * 
         * *   NoSpot: The instance is created as a regular pay-as-you-go instance.
         * *   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.
         * *   SpotAsPriceGo: The instance is created as a preemptible instance whose bidding price is based on the market price at the time of purchase.
         * 
         * Default value: NoSpot.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * Specifies whether to enable periodical execution.
         * <p>
         * 
         * *   true: enables periodical execution.
         * *   false: disables periodical execution.
         */
        public Builder strictSpot(Boolean strictSpot) {
            this.putQueryParameter("StrictSpot", strictSpot);
            this.strictSpot = strictSpot;
            return this;
        }

        /**
         * The tags that you want to bind with the instance. You can bind a maximum of 20 tags. For more information, see [Use tags to manage elastic container instances](~~146608~~).
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The buffer time during which the program handles operations before the program stops. Unit: seconds.
         */
        public Builder terminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
            this.putQueryParameter("TerminationGracePeriodSeconds", terminationGracePeriodSeconds);
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        /**
         * The ID of the vSwitch to which the instance is connected. You can specify up to 10 vSwitch IDs. Separate multiple vSwitch IDs with commas (,). Example: `vsw-***,vsw-***`.
         * <p>
         * 
         * If no vSwitch is specified, the system automatically uses the default vSwitch in the default VPC in the region that you selected. If you do not have a default VPC or a default vSwitch in the region, the system automatically creates a default VPC and a default vSwitch.
         * 
         * > The number of IP addresses in the vSwitch CIDR block determines the maximum number of elastic container instances that can be created for the vSwitch. Before you create elastic container instances, plan the CIDR block of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * Information about volumes.
         */
        public Builder volume(java.util.List < Volume> volume) {
            this.putQueryParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        /**
         * The ID of the zone in which the elastic container instance is deployed. If you do not specify this parameter, the system selects a zone.
         * <p>
         * 
         * This parameter is empty by default.
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

    public static class Option extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
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
             * The name of the option.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the option.
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
    public static class DnsConfig extends TeaModel {
        @NameInMap("NameServer")
        private java.util.List < String > nameServer;

        @NameInMap("Option")
        private java.util.List < Option> option;

        @NameInMap("Search")
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
             * The IP addresses of the DNS servers.
             */
            public Builder nameServer(java.util.List < String > nameServer) {
                this.nameServer = nameServer;
                return this;
            }

            /**
             * Configuration options of the DNS server.
             */
            public Builder option(java.util.List < Option> option) {
                this.option = option;
                return this;
            }

            /**
             * The search domains of the DNS server.
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
    public static class Sysctl extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
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
             * The key of the unsafe sysctl when you modify sysctls by configuring a security context. Valid values:
             * <p>
             * 
             * *   kernel.shm \* (except kernel.shm_rmid_forced)
             * *   kernel.msg\*kernel.sem
             * *   fs.mqueue.\*
             * *   net.\*(except net.ipv4.tcp_syncookies, net.ipv4.ping_group_range, and net.ipv4.ip_unprivileged_port_start)
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the unsafe sysctl when you modify sysctls by configuring a security context.
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
    public static class HostSecurityContext extends TeaModel {
        @NameInMap("Sysctl")
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
             * Configure a security context to modify unsafe sysctls. For more information, see [Configure a security context](~~462313~~).
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
    public static class SecurityContextSysctl extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
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
             * The name of the safe sysctl when you configure a security context to modify sysctls. Valid values:
             * <p>
             * 
             * *   net.ipv4.ping_group_range
             * *   net.ipv4.ip_unprivileged_port_start
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the safe sysctl when you configure a security context to modify sysctls.
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
    public static class SecurityContext extends TeaModel {
        @NameInMap("Sysctl")
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
             * Configure a security context to modify sysctls. For more information, see [Configure a security context](~~462313~~)
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
    public static class AcrRegistryInfo extends TeaModel {
        @NameInMap("ArnService")
        private String arnService;

        @NameInMap("ArnUser")
        private String arnUser;

        @NameInMap("Domain")
        private java.util.List < String > domain;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("RegionId")
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
             * The Alibaba Cloud Resource Name (ARN) of the RAM roles in the Alibaba Cloud account to which the elastic container instance belongs.
             */
            public Builder arnService(String arnService) {
                this.arnService = arnService;
                return this;
            }

            /**
             * The ARN of the RAM roles in the Alibaba Cloud account to which the Container Registry instance belongs.
             */
            public Builder arnUser(String arnUser) {
                this.arnUser = arnUser;
                return this;
            }

            /**
             * The domain names of the Container Registry Enterprise Edition instance. By default, all domain names of the instance are displayed. You can specify multiple domain names. Separate multiple domain names with commas (,).
             */
            public Builder domain(java.util.List < String > domain) {
                this.domain = domain;
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

            public AcrRegistryInfo build() {
                return new AcrRegistryInfo(this);
            } 

        } 

    }
    public static class Exec extends TeaModel {
        @NameInMap("Command")
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
        @NameInMap("Command")
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
    public static class ContainerSecurityContext extends TeaModel {
        @NameInMap("Capability")
        @Validation(required = true)
        private Capability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        private Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
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
    public static class FieldRef extends TeaModel {
        @NameInMap("FieldPath")
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
    public static class EnvironmentVar extends TeaModel {
        @NameInMap("FieldRef")
        @Validation(required = true)
        private FieldRef fieldRef;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The name of the environment variable. The name must be 1 to 128 bits in length and can contain letters, digits, and underscores (\_). It cannot start with a digit.``
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the environment variable. The value must be 0 to 256 bits in length.
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
    public static class LifecyclePostStartHandlerHttpGetHttpHeader extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
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
             * The name of the custom field in the HTTP GET request header when you use HTTP requests to specify the postStart callback function.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the custom field in the HTTP GET request header when you use HTTP requests to specify the postStart callback function.
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
    public static class LifecyclePreStopHandlerHttpGetHttpHeader extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
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
             * The key of the custom field in the HTTP GET request header when you use HTTP requests to specify the preStop callback function.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the custom field in the HTTP GET request header when you use HTTP requests to specify the preStop callback function.
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
    public static class Port extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
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
             * The port number. Valid values: 1 to 65535.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol type. Valid values:
             * <p>
             * 
             * *   TCP
             * *   UDP
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
    public static class VolumeMount extends TeaModel {
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
             * The directory to which the volume is mounted.
             * <p>
             * 
             * >  The data stored in this directory is overwritten by the data on the volume. Specify this parameter with caution.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * The mount propagation settings of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:
             * <p>
             * 
             * *   None: The volume mount does not receive subsequent mounts that are performed on this volume or subdirectories of this volume.
             * *   HostToCotainer: The volume mount receives subsequent mounts that are performed on this volume or the subdirectories of this volume.
             * *   Bidirectional: This value is similar to HostToContainer. The volume mount receives subsequent mounts that are performed on this volume or the subdirectories of this volume. In addition, all volume mounts that are mounted on the container are propagated back to the host and all containers of all pods that use the same volume.
             * 
             * Default value: None.
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * The name of the volume. The name of this parameter is the same as the name of the volume that is mounted to the containers.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Specifies whether the volume is read-only. Default value: false.
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

            public VolumeMount build() {
                return new VolumeMount(this);
            } 

        } 

    }
    public static class Container extends TeaModel {
        @NameInMap("LivenessProbe")
        @Validation(required = true)
        private LivenessProbe livenessProbe;

        @NameInMap("ReadinessProbe")
        @Validation(required = true)
        private ReadinessProbe readinessProbe;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        private ContainerSecurityContext securityContext;

        @NameInMap("Arg")
        @Validation(maximum = 65535)
        private java.util.List < String > arg;

        @NameInMap("Command")
        private java.util.List < String > command;

        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("EnvironmentVar")
        private java.util.List < EnvironmentVar> environmentVar;

        @NameInMap("EnvironmentVarHide")
        private Boolean environmentVarHide;

        @NameInMap("Gpu")
        private Integer gpu;

        @NameInMap("Image")
        @Validation(required = true, maximum = 255, minimum = 1)
        private String image;

        @NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @NameInMap("LifecyclePostStartHandlerExec")
        private java.util.List < String > lifecyclePostStartHandlerExec;

        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        private String lifecyclePostStartHandlerHttpGetHost;

        @NameInMap("LifecyclePostStartHandlerHttpGetHttpHeader")
        private java.util.List < LifecyclePostStartHandlerHttpGetHttpHeader> lifecyclePostStartHandlerHttpGetHttpHeader;

        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        private String lifecyclePostStartHandlerHttpGetPath;

        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        private Integer lifecyclePostStartHandlerHttpGetPort;

        @NameInMap("LifecyclePostStartHandlerHttpGetScheme")
        private String lifecyclePostStartHandlerHttpGetScheme;

        @NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        private String lifecyclePostStartHandlerTcpSocketHost;

        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        private Integer lifecyclePostStartHandlerTcpSocketPort;

        @NameInMap("LifecyclePreStopHandlerExec")
        private java.util.List < String > lifecyclePreStopHandlerExec;

        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        private String lifecyclePreStopHandlerHttpGetHost;

        @NameInMap("LifecyclePreStopHandlerHttpGetHttpHeader")
        private java.util.List < LifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader;

        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        private String lifecyclePreStopHandlerHttpGetPath;

        @NameInMap("LifecyclePreStopHandlerHttpGetPort")
        private Integer lifecyclePreStopHandlerHttpGetPort;

        @NameInMap("LifecyclePreStopHandlerHttpGetScheme")
        private String lifecyclePreStopHandlerHttpGetScheme;

        @NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        private String lifecyclePreStopHandlerTcpSocketHost;

        @NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        private Integer lifecyclePreStopHandlerTcpSocketPort;

        @NameInMap("Memory")
        private Float memory;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("Port")
        private java.util.List < Port> port;

        @NameInMap("SecurityContextRunAsGroup")
        private Long securityContextRunAsGroup;

        @NameInMap("SecurityContextRunAsNonRoot")
        private Boolean securityContextRunAsNonRoot;

        @NameInMap("Stdin")
        private Boolean stdin;

        @NameInMap("StdinOnce")
        private Boolean stdinOnce;

        @NameInMap("TerminationMessagePath")
        private String terminationMessagePath;

        @NameInMap("TerminationMessagePolicy")
        private String terminationMessagePolicy;

        @NameInMap("Tty")
        private Boolean tty;

        @NameInMap("VolumeMount")
        private java.util.List < VolumeMount> volumeMount;

        @NameInMap("WorkingDir")
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
             * The arguments that are passed to the startup command of the container. You can specify up to 10 arguments.
             */
            public Builder arg(java.util.List < String > arg) {
                this.arg = arg;
                return this;
            }

            /**
             * The commands that you want to run to perform health checks on containers.
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
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
             * The value of the environment variable for the container.
             */
            public Builder environmentVar(java.util.List < EnvironmentVar> environmentVar) {
                this.environmentVar = environmentVar;
                return this;
            }

            /**
             * Specifies whether to hide the information about environment variables when you query the details of an elastic container instance. Default value: false. Valid values:
             * <p>
             * 
             * *   false
             * *   true If environment variables contain sensitive information, you can set this parameter to true to improve security of the information.
             */
            public Builder environmentVarHide(Boolean environmentVarHide) {
                this.environmentVarHide = environmentVarHide;
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
             * The policy that you want to use to pull an image. Valid values:
             * <p>
             * 
             * *   Always: Each time instances are created, image pulling is performed.
             * *   IfNotPresent: On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.
             * *   Never: On-premises images are always used. Image pulling is not performed.
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * The commands to be executed in containers when you use a CLI to specify the postStart callback function.
             */
            public Builder lifecyclePostStartHandlerExec(java.util.List < String > lifecyclePostStartHandlerExec) {
                this.lifecyclePostStartHandlerExec = lifecyclePostStartHandlerExec;
                return this;
            }

            /**
             * The IP address of the host that receives the HTTP GET request when you use an HTTP request to specify the postStart callback function.
             */
            public Builder lifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
                this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
                return this;
            }

            /**
             * The HTTP GET request header.
             */
            public Builder lifecyclePostStartHandlerHttpGetHttpHeader(java.util.List < LifecyclePostStartHandlerHttpGetHttpHeader> lifecyclePostStartHandlerHttpGetHttpHeader) {
                this.lifecyclePostStartHandlerHttpGetHttpHeader = lifecyclePostStartHandlerHttpGetHttpHeader;
                return this;
            }

            /**
             * The path to which the system sends an HTTP GET request for a health check when you use an HTTP request to specify the postStart callback function.
             */
            public Builder lifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
                this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
                return this;
            }

            /**
             * The port to which the system sends an HTTP GET request when you use an HTTP request to specify the postStart callback function.
             */
            public Builder lifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
                this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
                return this;
            }

            /**
             * The protocol type of HTTP GET requests when you use HTTP requests to specify the postStart callback function. Valid values:
             * <p>
             * 
             * *   HTTP
             * *   HTTPS
             */
            public Builder lifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
                this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
                return this;
            }

            /**
             * The port to which the system sends a TCP socket request for a health check when you use TCP sockets to specify the postStart callback function.
             */
            public Builder lifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
                this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
                return this;
            }

            /**
             * The port to which the system sends a TCP socket request for a health check when you use TCP sockets to specify the postStart callback function.
             */
            public Builder lifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
                this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
                return this;
            }

            /**
             * The commands to be executed in containers when you use a CLI to specify the preStop callback function.
             */
            public Builder lifecyclePreStopHandlerExec(java.util.List < String > lifecyclePreStopHandlerExec) {
                this.lifecyclePreStopHandlerExec = lifecyclePreStopHandlerExec;
                return this;
            }

            /**
             * The IP address of the host that receives the HTTP GET request when you use an HTTP request to specify the preStop callback function.
             */
            public Builder lifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
                this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
                return this;
            }

            /**
             * The HTTP GET request header.
             */
            public Builder lifecyclePreStopHandlerHttpGetHttpHeader(java.util.List < LifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader) {
                this.lifecyclePreStopHandlerHttpGetHttpHeader = lifecyclePreStopHandlerHttpGetHttpHeader;
                return this;
            }

            /**
             * The path to which the system sends an HTTP GET request for a health check when you use an HTTP request to specify the preSop callback function.
             */
            public Builder lifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
                this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
                return this;
            }

            /**
             * The port to which the system sends an HTTP GET request for a health check when you use HTTP requests to specify the preStop callback function.
             */
            public Builder lifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
                this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
                return this;
            }

            /**
             * The protocol type of the HTTP GET request when you use an HTTP request to specify the preStop callback function. Valid values:
             * <p>
             * 
             * *   HTTP
             * *   HTTPS
             */
            public Builder lifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
                this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
                return this;
            }

            /**
             * The IP address of the host that receives the TCP socket request when you use a TCP socket request to specify the preStop callback function.
             */
            public Builder lifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
                this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
                return this;
            }

            /**
             * The port to which the system sends a TCP socket request for a health check when you use TCP sockets to specify the preStop callback function.
             */
            public Builder lifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
                this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
                return this;
            }

            /**
             * The memory size that you want to allocate to the container. Unit: GiB
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
             * The port to which the system sends an HTTP GET request for a health check when you use HTTP requests to perform health checks.
             */
            public Builder port(java.util.List < Port> port) {
                this.port = port;
                return this;
            }

            /**
             * The user group that runs the container.
             */
            public Builder securityContextRunAsGroup(Long securityContextRunAsGroup) {
                this.securityContextRunAsGroup = securityContextRunAsGroup;
                return this;
            }

            /**
             * Specifies whether to run the container as a non-root user.
             */
            public Builder securityContextRunAsNonRoot(Boolean securityContextRunAsNonRoot) {
                this.securityContextRunAsNonRoot = securityContextRunAsNonRoot;
                return this;
            }

            /**
             * Specifies whether the container allocates buffer resources to standard input streams when the container is running. If you do not specify this parameter, an end-of-file (EOF) error may occur when standard input streams in the container are read. Default value: false.
             */
            public Builder stdin(Boolean stdin) {
                this.stdin = stdin;
                return this;
            }

            /**
             * Specifies whether standard input streams are disconnected from multiple sessions after a client is disconnected.\
             * <p>
             * If StdinOnce is set to true, standard input streams are connected after the container is started, and remain idle until a client is connected to receive data. After the client is disconnected, standard input streams are also disconnected, and remain disconnected until the container restarts.
             */
            public Builder stdinOnce(Boolean stdinOnce) {
                this.stdinOnce = stdinOnce;
                return this;
            }

            /**
             * The path of the file from which the system retrieves termination messages of the container when the container exits.
             */
            public Builder terminationMessagePath(String terminationMessagePath) {
                this.terminationMessagePath = terminationMessagePath;
                return this;
            }

            /**
             * The message notification policy. This parameter is empty by default. Only Message Service (MNS) queue message notifications can be sent.
             */
            public Builder terminationMessagePolicy(String terminationMessagePolicy) {
                this.terminationMessagePolicy = terminationMessagePolicy;
                return this;
            }

            /**
             * Specifies whether to enable interaction. Default value: false.
             * <p>
             * 
             * If the command is a /bin/bash command, set the value to true.
             */
            public Builder tty(Boolean tty) {
                this.tty = tty;
                return this;
            }

            /**
             * The information about the volume that you want to mount to the container.
             */
            public Builder volumeMount(java.util.List < VolumeMount> volumeMount) {
                this.volumeMount = volumeMount;
                return this;
            }

            /**
             * The working directory of the container.
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
    public static class HostAliase extends TeaModel {
        @NameInMap("Hostname")
        private java.util.List < String > hostname;

        @NameInMap("Ip")
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
             * The hostname of the elastic container instance.
             */
            public Builder hostname(java.util.List < String > hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * The IP address of the host.
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
    public static class ImageRegistryCredential extends TeaModel {
        @NameInMap("Password")
        private String password;

        @NameInMap("Server")
        private String server;

        @NameInMap("UserName")
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
             * The password that you use to access the image repository.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The address of the image repository.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * The username that you use to access the image repository.
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
    public static class SecurityContextCapability extends TeaModel {
        @NameInMap("Add")
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
    public static class InitContainerSecurityContext extends TeaModel {
        @NameInMap("Capability")
        @Validation(required = true)
        private SecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        private Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
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
    public static class EnvironmentVarFieldRef extends TeaModel {
        @NameInMap("FieldPath")
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
    public static class InitContainerEnvironmentVar extends TeaModel {
        @NameInMap("FieldRef")
        @Validation(required = true)
        private EnvironmentVarFieldRef fieldRef;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The name of the environment variable. The name must be 1 to 128 characters in length, and can contain letters, digits, and underscores (\_). It cannot start with a digit.``
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the environment variable. The value can be up to 256 characters in length.
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
    public static class InitContainerPort extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
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
             * The port number. Valid values: 1 to 65535.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol type. Valid values:
             * <p>
             * 
             * *   TCP
             * *   UDP
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
    public static class InitContainerVolumeMount extends TeaModel {
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
             * The directory to which the volume is mounted. The data stored in this directory is overwritten by the data on the volume. Specify this parameter with caution.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * The mount propagation settings of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:
             * <p>
             * 
             * *   None: The volume mount does not receive subsequent mounts that are mounted to the volume or to the subdirectories of the volume.
             * *   HostToCotainer: The volume mount receives subsequent mounts that are mounted to the volume or to the subdirectories of the volume.
             * *   Bidirectional: The volume mount behaves the same as the HostToCotainer mount. The volume mount receives subsequent mounts that are mounted to the volume or to the subdirectories of the volume. In addition, all volume mounts created by the container are propagated back to the host and to all containers of all pods that use the same volume.
             * 
             * Default value: None.
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * The volume name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Specifies whether the mount path is read-only. Default value: false.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * The subdirectory of the volume. The pod can mount different directories of the same volume to different directories of the init container.
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
    public static class InitContainer extends TeaModel {
        @NameInMap("SecurityContext")
        @Validation(required = true)
        private InitContainerSecurityContext securityContext;

        @NameInMap("Arg")
        @Validation(maximum = 65535)
        private java.util.List < String > arg;

        @NameInMap("Command")
        private java.util.List < String > command;

        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("EnvironmentVar")
        private java.util.List < InitContainerEnvironmentVar> environmentVar;

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

        @NameInMap("Port")
        private java.util.List < InitContainerPort> port;

        @NameInMap("TerminationMessagePath")
        private String terminationMessagePath;

        @NameInMap("TerminationMessagePolicy")
        private String terminationMessagePolicy;

        @NameInMap("VolumeMount")
        private java.util.List < InitContainerVolumeMount> volumeMount;

        @NameInMap("WorkingDir")
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
             * The arguments that are passed to the startup command of the init container.
             */
            public Builder arg(java.util.List < String > arg) {
                this.arg = arg;
                return this;
            }

            /**
             * The startup commands of the init container.
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            /**
             * The number of vCPUs that you want to allocate to the init container. Unit: cores.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The environment variable of the init container.
             */
            public Builder environmentVar(java.util.List < InitContainerEnvironmentVar> environmentVar) {
                this.environmentVar = environmentVar;
                return this;
            }

            /**
             * The number of GPUs that you want to allocate to the init container.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * The image of the init container.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The policy for image pulling. Valid values:
             * <p>
             * 
             * *   Always: Each time instances are created, image pulling is performed.
             * *   IfNotPresent: On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.
             * *   Never: On-premises images are always used. Image pulling is not performed.
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * The memory size of the init container. Unit: GiB.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The container name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The port number of the init container.
             */
            public Builder port(java.util.List < InitContainerPort> port) {
                this.port = port;
                return this;
            }

            /**
             * The path of the file from which the system retrieves termination messages of the init container when the init container exits.
             */
            public Builder terminationMessagePath(String terminationMessagePath) {
                this.terminationMessagePath = terminationMessagePath;
                return this;
            }

            /**
             * The message notification policy. This parameter is empty by default.
             */
            public Builder terminationMessagePolicy(String terminationMessagePolicy) {
                this.terminationMessagePolicy = terminationMessagePolicy;
                return this;
            }

            /**
             * The information about the volume that you want to mount on the init container.
             */
            public Builder volumeMount(java.util.List < InitContainerVolumeMount> volumeMount) {
                this.volumeMount = volumeMount;
                return this;
            }

            /**
             * The working directory of the init container.
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
    public static class OverheadReservationOption extends TeaModel {
        @NameInMap("EnableOverheadReservation")
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
             * Specify whether to enable the overhead reservation feature. Default: false. Valid values: true and false. After you enable the overhead reservation feature, the system automatically adds the overhead to the specification of the elastic container instance, and then adjusts the specification of the instance upward to the most approximate specification. You are charged based on the new specification after the adjustment.
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
             * The key of a tag. The tag key cannot be an empty string and must be unique. The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of a tag. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `acs:`.
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
    public static class ConfigFileToPath extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Mode")
        private Integer mode;

        @NameInMap("Path")
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
    public static class ConfigFileVolume extends TeaModel {
        @NameInMap("ConfigFileToPath")
        private java.util.List < ConfigFileToPath> configFileToPath;

        @NameInMap("DefaultMode")
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
             * Specifies whether the mount path is read-only. Default value: false.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * The address of the image repository.
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
    public static class Volume extends TeaModel {
        @NameInMap("ConfigFileVolume")
        @Validation(required = true)
        private ConfigFileVolume configFileVolume;

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

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
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
             * The name of the volume.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the volume when you set the Type parameter to HostPathVolume. Valid values:
             * <p>
             * 
             * *   Directory
             * *   File
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
