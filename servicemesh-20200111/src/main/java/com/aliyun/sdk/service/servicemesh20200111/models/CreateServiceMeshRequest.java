// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceMeshRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceMeshRequest</p>
 */
public class CreateServiceMeshRequest extends Request {
    @Body
    @NameInMap("AccessLogEnabled")
    private Boolean accessLogEnabled;

    @Body
    @NameInMap("AccessLogFile")
    private String accessLogFile;

    @Body
    @NameInMap("AccessLogFormat")
    private String accessLogFormat;

    @Body
    @NameInMap("AccessLogProject")
    private String accessLogProject;

    @Body
    @NameInMap("AccessLogServiceEnabled")
    private Boolean accessLogServiceEnabled;

    @Body
    @NameInMap("AccessLogServiceHost")
    private String accessLogServiceHost;

    @Body
    @NameInMap("AccessLogServicePort")
    private Integer accessLogServicePort;

    @Body
    @NameInMap("ApiServerLoadBalancerSpec")
    private String apiServerLoadBalancerSpec;

    @Body
    @NameInMap("ApiServerPublicEip")
    private Boolean apiServerPublicEip;

    @Body
    @NameInMap("AuditProject")
    private String auditProject;

    @Body
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Body
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Body
    @NameInMap("CRAggregationEnabled")
    private Boolean CRAggregationEnabled;

    @Body
    @NameInMap("ChargeType")
    private String chargeType;

    @Body
    @NameInMap("ClusterSpec")
    private String clusterSpec;

    @Body
    @NameInMap("ConfigSourceEnabled")
    private Boolean configSourceEnabled;

    @Body
    @NameInMap("ConfigSourceNacosID")
    private String configSourceNacosID;

    @Body
    @NameInMap("ControlPlaneLogEnabled")
    private Boolean controlPlaneLogEnabled;

    @Body
    @NameInMap("ControlPlaneLogProject")
    private String controlPlaneLogProject;

    @Body
    @NameInMap("CustomizedPrometheus")
    private Boolean customizedPrometheus;

    @Body
    @NameInMap("CustomizedZipkin")
    private Boolean customizedZipkin;

    @Body
    @NameInMap("DNSProxyingEnabled")
    private Boolean DNSProxyingEnabled;

    @Body
    @NameInMap("DubboFilterEnabled")
    private Boolean dubboFilterEnabled;

    @Body
    @NameInMap("Edition")
    private String edition;

    @Body
    @NameInMap("EnableAmbient")
    private Boolean enableAmbient;

    @Body
    @NameInMap("EnableAudit")
    private Boolean enableAudit;

    @Body
    @NameInMap("EnableCRHistory")
    private Boolean enableCRHistory;

    @Body
    @NameInMap("EnableSDSServer")
    private Boolean enableSDSServer;

    @Body
    @NameInMap("ExcludeIPRanges")
    private String excludeIPRanges;

    @Body
    @NameInMap("ExcludeInboundPorts")
    private String excludeInboundPorts;

    @Body
    @NameInMap("ExcludeOutboundPorts")
    private String excludeOutboundPorts;

    @Body
    @NameInMap("ExistingCaCert")
    private String existingCaCert;

    @Body
    @NameInMap("ExistingCaKey")
    private String existingCaKey;

    @Body
    @NameInMap("ExistingCaType")
    private String existingCaType;

    @Body
    @NameInMap("ExistingRootCaCert")
    private String existingRootCaCert;

    @Body
    @NameInMap("ExistingRootCaKey")
    private String existingRootCaKey;

    @Body
    @NameInMap("FilterGatewayClusterConfig")
    private Boolean filterGatewayClusterConfig;

    @Body
    @NameInMap("GatewayAPIEnabled")
    private Boolean gatewayAPIEnabled;

    @Body
    @NameInMap("GuestCluster")
    private String guestCluster;

    @Body
    @NameInMap("IncludeIPRanges")
    private String includeIPRanges;

    @Body
    @NameInMap("IstioVersion")
    private String istioVersion;

    @Body
    @NameInMap("KialiEnabled")
    private Boolean kialiEnabled;

    @Body
    @NameInMap("LocalityLBConf")
    private String localityLBConf;

    @Body
    @NameInMap("LocalityLoadBalancing")
    private Boolean localityLoadBalancing;

    @Body
    @NameInMap("MSEEnabled")
    private Boolean MSEEnabled;

    @Body
    @NameInMap("MultiBufferEnabled")
    private Boolean multiBufferEnabled;

    @Body
    @NameInMap("MultiBufferPollDelay")
    private String multiBufferPollDelay;

    @Body
    @NameInMap("MysqlFilterEnabled")
    private Boolean mysqlFilterEnabled;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("OPALimitCPU")
    private String OPALimitCPU;

    @Body
    @NameInMap("OPALimitMemory")
    private String OPALimitMemory;

    @Body
    @NameInMap("OPALogLevel")
    private String OPALogLevel;

    @Body
    @NameInMap("OPARequestCPU")
    private String OPARequestCPU;

    @Body
    @NameInMap("OPARequestMemory")
    private String OPARequestMemory;

    @Body
    @NameInMap("OpaEnabled")
    private Boolean opaEnabled;

    @Body
    @NameInMap("OpenAgentPolicy")
    private Boolean openAgentPolicy;

    @Body
    @NameInMap("Period")
    private Integer period;

    @Body
    @NameInMap("PilotLoadBalancerSpec")
    private String pilotLoadBalancerSpec;

    @Body
    @NameInMap("PrometheusUrl")
    private String prometheusUrl;

    @Body
    @NameInMap("ProxyLimitCPU")
    private String proxyLimitCPU;

    @Body
    @NameInMap("ProxyLimitMemory")
    private String proxyLimitMemory;

    @Body
    @NameInMap("ProxyRequestCPU")
    private String proxyRequestCPU;

    @Body
    @NameInMap("ProxyRequestMemory")
    private String proxyRequestMemory;

    @Body
    @NameInMap("RedisFilterEnabled")
    private Boolean redisFilterEnabled;

    @Body
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("Telemetry")
    private Boolean telemetry;

    @Body
    @NameInMap("ThriftFilterEnabled")
    private Boolean thriftFilterEnabled;

    @Body
    @NameInMap("TraceSampling")
    private Float traceSampling;

    @Body
    @NameInMap("Tracing")
    private Boolean tracing;

    @Body
    @NameInMap("UseExistingCA")
    private Boolean useExistingCA;

    @Body
    @NameInMap("VSwitches")
    @Validation(required = true)
    private String vSwitches;

    @Body
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Body
    @NameInMap("WebAssemblyFilterEnabled")
    private Boolean webAssemblyFilterEnabled;

    private CreateServiceMeshRequest(Builder builder) {
        super(builder);
        this.accessLogEnabled = builder.accessLogEnabled;
        this.accessLogFile = builder.accessLogFile;
        this.accessLogFormat = builder.accessLogFormat;
        this.accessLogProject = builder.accessLogProject;
        this.accessLogServiceEnabled = builder.accessLogServiceEnabled;
        this.accessLogServiceHost = builder.accessLogServiceHost;
        this.accessLogServicePort = builder.accessLogServicePort;
        this.apiServerLoadBalancerSpec = builder.apiServerLoadBalancerSpec;
        this.apiServerPublicEip = builder.apiServerPublicEip;
        this.auditProject = builder.auditProject;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.CRAggregationEnabled = builder.CRAggregationEnabled;
        this.chargeType = builder.chargeType;
        this.clusterSpec = builder.clusterSpec;
        this.configSourceEnabled = builder.configSourceEnabled;
        this.configSourceNacosID = builder.configSourceNacosID;
        this.controlPlaneLogEnabled = builder.controlPlaneLogEnabled;
        this.controlPlaneLogProject = builder.controlPlaneLogProject;
        this.customizedPrometheus = builder.customizedPrometheus;
        this.customizedZipkin = builder.customizedZipkin;
        this.DNSProxyingEnabled = builder.DNSProxyingEnabled;
        this.dubboFilterEnabled = builder.dubboFilterEnabled;
        this.edition = builder.edition;
        this.enableAmbient = builder.enableAmbient;
        this.enableAudit = builder.enableAudit;
        this.enableCRHistory = builder.enableCRHistory;
        this.enableSDSServer = builder.enableSDSServer;
        this.excludeIPRanges = builder.excludeIPRanges;
        this.excludeInboundPorts = builder.excludeInboundPorts;
        this.excludeOutboundPorts = builder.excludeOutboundPorts;
        this.existingCaCert = builder.existingCaCert;
        this.existingCaKey = builder.existingCaKey;
        this.existingCaType = builder.existingCaType;
        this.existingRootCaCert = builder.existingRootCaCert;
        this.existingRootCaKey = builder.existingRootCaKey;
        this.filterGatewayClusterConfig = builder.filterGatewayClusterConfig;
        this.gatewayAPIEnabled = builder.gatewayAPIEnabled;
        this.guestCluster = builder.guestCluster;
        this.includeIPRanges = builder.includeIPRanges;
        this.istioVersion = builder.istioVersion;
        this.kialiEnabled = builder.kialiEnabled;
        this.localityLBConf = builder.localityLBConf;
        this.localityLoadBalancing = builder.localityLoadBalancing;
        this.MSEEnabled = builder.MSEEnabled;
        this.multiBufferEnabled = builder.multiBufferEnabled;
        this.multiBufferPollDelay = builder.multiBufferPollDelay;
        this.mysqlFilterEnabled = builder.mysqlFilterEnabled;
        this.name = builder.name;
        this.OPALimitCPU = builder.OPALimitCPU;
        this.OPALimitMemory = builder.OPALimitMemory;
        this.OPALogLevel = builder.OPALogLevel;
        this.OPARequestCPU = builder.OPARequestCPU;
        this.OPARequestMemory = builder.OPARequestMemory;
        this.opaEnabled = builder.opaEnabled;
        this.openAgentPolicy = builder.openAgentPolicy;
        this.period = builder.period;
        this.pilotLoadBalancerSpec = builder.pilotLoadBalancerSpec;
        this.prometheusUrl = builder.prometheusUrl;
        this.proxyLimitCPU = builder.proxyLimitCPU;
        this.proxyLimitMemory = builder.proxyLimitMemory;
        this.proxyRequestCPU = builder.proxyRequestCPU;
        this.proxyRequestMemory = builder.proxyRequestMemory;
        this.redisFilterEnabled = builder.redisFilterEnabled;
        this.regionId = builder.regionId;
        this.telemetry = builder.telemetry;
        this.thriftFilterEnabled = builder.thriftFilterEnabled;
        this.traceSampling = builder.traceSampling;
        this.tracing = builder.tracing;
        this.useExistingCA = builder.useExistingCA;
        this.vSwitches = builder.vSwitches;
        this.vpcId = builder.vpcId;
        this.webAssemblyFilterEnabled = builder.webAssemblyFilterEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceMeshRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessLogEnabled
     */
    public Boolean getAccessLogEnabled() {
        return this.accessLogEnabled;
    }

    /**
     * @return accessLogFile
     */
    public String getAccessLogFile() {
        return this.accessLogFile;
    }

    /**
     * @return accessLogFormat
     */
    public String getAccessLogFormat() {
        return this.accessLogFormat;
    }

    /**
     * @return accessLogProject
     */
    public String getAccessLogProject() {
        return this.accessLogProject;
    }

    /**
     * @return accessLogServiceEnabled
     */
    public Boolean getAccessLogServiceEnabled() {
        return this.accessLogServiceEnabled;
    }

    /**
     * @return accessLogServiceHost
     */
    public String getAccessLogServiceHost() {
        return this.accessLogServiceHost;
    }

    /**
     * @return accessLogServicePort
     */
    public Integer getAccessLogServicePort() {
        return this.accessLogServicePort;
    }

    /**
     * @return apiServerLoadBalancerSpec
     */
    public String getApiServerLoadBalancerSpec() {
        return this.apiServerLoadBalancerSpec;
    }

    /**
     * @return apiServerPublicEip
     */
    public Boolean getApiServerPublicEip() {
        return this.apiServerPublicEip;
    }

    /**
     * @return auditProject
     */
    public String getAuditProject() {
        return this.auditProject;
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
     * @return CRAggregationEnabled
     */
    public Boolean getCRAggregationEnabled() {
        return this.CRAggregationEnabled;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clusterSpec
     */
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    /**
     * @return configSourceEnabled
     */
    public Boolean getConfigSourceEnabled() {
        return this.configSourceEnabled;
    }

    /**
     * @return configSourceNacosID
     */
    public String getConfigSourceNacosID() {
        return this.configSourceNacosID;
    }

    /**
     * @return controlPlaneLogEnabled
     */
    public Boolean getControlPlaneLogEnabled() {
        return this.controlPlaneLogEnabled;
    }

    /**
     * @return controlPlaneLogProject
     */
    public String getControlPlaneLogProject() {
        return this.controlPlaneLogProject;
    }

    /**
     * @return customizedPrometheus
     */
    public Boolean getCustomizedPrometheus() {
        return this.customizedPrometheus;
    }

    /**
     * @return customizedZipkin
     */
    public Boolean getCustomizedZipkin() {
        return this.customizedZipkin;
    }

    /**
     * @return DNSProxyingEnabled
     */
    public Boolean getDNSProxyingEnabled() {
        return this.DNSProxyingEnabled;
    }

    /**
     * @return dubboFilterEnabled
     */
    public Boolean getDubboFilterEnabled() {
        return this.dubboFilterEnabled;
    }

    /**
     * @return edition
     */
    public String getEdition() {
        return this.edition;
    }

    /**
     * @return enableAmbient
     */
    public Boolean getEnableAmbient() {
        return this.enableAmbient;
    }

    /**
     * @return enableAudit
     */
    public Boolean getEnableAudit() {
        return this.enableAudit;
    }

    /**
     * @return enableCRHistory
     */
    public Boolean getEnableCRHistory() {
        return this.enableCRHistory;
    }

    /**
     * @return enableSDSServer
     */
    public Boolean getEnableSDSServer() {
        return this.enableSDSServer;
    }

    /**
     * @return excludeIPRanges
     */
    public String getExcludeIPRanges() {
        return this.excludeIPRanges;
    }

    /**
     * @return excludeInboundPorts
     */
    public String getExcludeInboundPorts() {
        return this.excludeInboundPorts;
    }

    /**
     * @return excludeOutboundPorts
     */
    public String getExcludeOutboundPorts() {
        return this.excludeOutboundPorts;
    }

    /**
     * @return existingCaCert
     */
    public String getExistingCaCert() {
        return this.existingCaCert;
    }

    /**
     * @return existingCaKey
     */
    public String getExistingCaKey() {
        return this.existingCaKey;
    }

    /**
     * @return existingCaType
     */
    public String getExistingCaType() {
        return this.existingCaType;
    }

    /**
     * @return existingRootCaCert
     */
    public String getExistingRootCaCert() {
        return this.existingRootCaCert;
    }

    /**
     * @return existingRootCaKey
     */
    public String getExistingRootCaKey() {
        return this.existingRootCaKey;
    }

    /**
     * @return filterGatewayClusterConfig
     */
    public Boolean getFilterGatewayClusterConfig() {
        return this.filterGatewayClusterConfig;
    }

    /**
     * @return gatewayAPIEnabled
     */
    public Boolean getGatewayAPIEnabled() {
        return this.gatewayAPIEnabled;
    }

    /**
     * @return guestCluster
     */
    public String getGuestCluster() {
        return this.guestCluster;
    }

    /**
     * @return includeIPRanges
     */
    public String getIncludeIPRanges() {
        return this.includeIPRanges;
    }

    /**
     * @return istioVersion
     */
    public String getIstioVersion() {
        return this.istioVersion;
    }

    /**
     * @return kialiEnabled
     */
    public Boolean getKialiEnabled() {
        return this.kialiEnabled;
    }

    /**
     * @return localityLBConf
     */
    public String getLocalityLBConf() {
        return this.localityLBConf;
    }

    /**
     * @return localityLoadBalancing
     */
    public Boolean getLocalityLoadBalancing() {
        return this.localityLoadBalancing;
    }

    /**
     * @return MSEEnabled
     */
    public Boolean getMSEEnabled() {
        return this.MSEEnabled;
    }

    /**
     * @return multiBufferEnabled
     */
    public Boolean getMultiBufferEnabled() {
        return this.multiBufferEnabled;
    }

    /**
     * @return multiBufferPollDelay
     */
    public String getMultiBufferPollDelay() {
        return this.multiBufferPollDelay;
    }

    /**
     * @return mysqlFilterEnabled
     */
    public Boolean getMysqlFilterEnabled() {
        return this.mysqlFilterEnabled;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return OPALimitCPU
     */
    public String getOPALimitCPU() {
        return this.OPALimitCPU;
    }

    /**
     * @return OPALimitMemory
     */
    public String getOPALimitMemory() {
        return this.OPALimitMemory;
    }

    /**
     * @return OPALogLevel
     */
    public String getOPALogLevel() {
        return this.OPALogLevel;
    }

    /**
     * @return OPARequestCPU
     */
    public String getOPARequestCPU() {
        return this.OPARequestCPU;
    }

    /**
     * @return OPARequestMemory
     */
    public String getOPARequestMemory() {
        return this.OPARequestMemory;
    }

    /**
     * @return opaEnabled
     */
    public Boolean getOpaEnabled() {
        return this.opaEnabled;
    }

    /**
     * @return openAgentPolicy
     */
    public Boolean getOpenAgentPolicy() {
        return this.openAgentPolicy;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return pilotLoadBalancerSpec
     */
    public String getPilotLoadBalancerSpec() {
        return this.pilotLoadBalancerSpec;
    }

    /**
     * @return prometheusUrl
     */
    public String getPrometheusUrl() {
        return this.prometheusUrl;
    }

    /**
     * @return proxyLimitCPU
     */
    public String getProxyLimitCPU() {
        return this.proxyLimitCPU;
    }

    /**
     * @return proxyLimitMemory
     */
    public String getProxyLimitMemory() {
        return this.proxyLimitMemory;
    }

    /**
     * @return proxyRequestCPU
     */
    public String getProxyRequestCPU() {
        return this.proxyRequestCPU;
    }

    /**
     * @return proxyRequestMemory
     */
    public String getProxyRequestMemory() {
        return this.proxyRequestMemory;
    }

    /**
     * @return redisFilterEnabled
     */
    public Boolean getRedisFilterEnabled() {
        return this.redisFilterEnabled;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return telemetry
     */
    public Boolean getTelemetry() {
        return this.telemetry;
    }

    /**
     * @return thriftFilterEnabled
     */
    public Boolean getThriftFilterEnabled() {
        return this.thriftFilterEnabled;
    }

    /**
     * @return traceSampling
     */
    public Float getTraceSampling() {
        return this.traceSampling;
    }

    /**
     * @return tracing
     */
    public Boolean getTracing() {
        return this.tracing;
    }

    /**
     * @return useExistingCA
     */
    public Boolean getUseExistingCA() {
        return this.useExistingCA;
    }

    /**
     * @return vSwitches
     */
    public String getVSwitches() {
        return this.vSwitches;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return webAssemblyFilterEnabled
     */
    public Boolean getWebAssemblyFilterEnabled() {
        return this.webAssemblyFilterEnabled;
    }

    public static final class Builder extends Request.Builder<CreateServiceMeshRequest, Builder> {
        private Boolean accessLogEnabled; 
        private String accessLogFile; 
        private String accessLogFormat; 
        private String accessLogProject; 
        private Boolean accessLogServiceEnabled; 
        private String accessLogServiceHost; 
        private Integer accessLogServicePort; 
        private String apiServerLoadBalancerSpec; 
        private Boolean apiServerPublicEip; 
        private String auditProject; 
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private Boolean CRAggregationEnabled; 
        private String chargeType; 
        private String clusterSpec; 
        private Boolean configSourceEnabled; 
        private String configSourceNacosID; 
        private Boolean controlPlaneLogEnabled; 
        private String controlPlaneLogProject; 
        private Boolean customizedPrometheus; 
        private Boolean customizedZipkin; 
        private Boolean DNSProxyingEnabled; 
        private Boolean dubboFilterEnabled; 
        private String edition; 
        private Boolean enableAmbient; 
        private Boolean enableAudit; 
        private Boolean enableCRHistory; 
        private Boolean enableSDSServer; 
        private String excludeIPRanges; 
        private String excludeInboundPorts; 
        private String excludeOutboundPorts; 
        private String existingCaCert; 
        private String existingCaKey; 
        private String existingCaType; 
        private String existingRootCaCert; 
        private String existingRootCaKey; 
        private Boolean filterGatewayClusterConfig; 
        private Boolean gatewayAPIEnabled; 
        private String guestCluster; 
        private String includeIPRanges; 
        private String istioVersion; 
        private Boolean kialiEnabled; 
        private String localityLBConf; 
        private Boolean localityLoadBalancing; 
        private Boolean MSEEnabled; 
        private Boolean multiBufferEnabled; 
        private String multiBufferPollDelay; 
        private Boolean mysqlFilterEnabled; 
        private String name; 
        private String OPALimitCPU; 
        private String OPALimitMemory; 
        private String OPALogLevel; 
        private String OPARequestCPU; 
        private String OPARequestMemory; 
        private Boolean opaEnabled; 
        private Boolean openAgentPolicy; 
        private Integer period; 
        private String pilotLoadBalancerSpec; 
        private String prometheusUrl; 
        private String proxyLimitCPU; 
        private String proxyLimitMemory; 
        private String proxyRequestCPU; 
        private String proxyRequestMemory; 
        private Boolean redisFilterEnabled; 
        private String regionId; 
        private Boolean telemetry; 
        private Boolean thriftFilterEnabled; 
        private Float traceSampling; 
        private Boolean tracing; 
        private Boolean useExistingCA; 
        private String vSwitches; 
        private String vpcId; 
        private Boolean webAssemblyFilterEnabled; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceMeshRequest request) {
            super(request);
            this.accessLogEnabled = request.accessLogEnabled;
            this.accessLogFile = request.accessLogFile;
            this.accessLogFormat = request.accessLogFormat;
            this.accessLogProject = request.accessLogProject;
            this.accessLogServiceEnabled = request.accessLogServiceEnabled;
            this.accessLogServiceHost = request.accessLogServiceHost;
            this.accessLogServicePort = request.accessLogServicePort;
            this.apiServerLoadBalancerSpec = request.apiServerLoadBalancerSpec;
            this.apiServerPublicEip = request.apiServerPublicEip;
            this.auditProject = request.auditProject;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.CRAggregationEnabled = request.CRAggregationEnabled;
            this.chargeType = request.chargeType;
            this.clusterSpec = request.clusterSpec;
            this.configSourceEnabled = request.configSourceEnabled;
            this.configSourceNacosID = request.configSourceNacosID;
            this.controlPlaneLogEnabled = request.controlPlaneLogEnabled;
            this.controlPlaneLogProject = request.controlPlaneLogProject;
            this.customizedPrometheus = request.customizedPrometheus;
            this.customizedZipkin = request.customizedZipkin;
            this.DNSProxyingEnabled = request.DNSProxyingEnabled;
            this.dubboFilterEnabled = request.dubboFilterEnabled;
            this.edition = request.edition;
            this.enableAmbient = request.enableAmbient;
            this.enableAudit = request.enableAudit;
            this.enableCRHistory = request.enableCRHistory;
            this.enableSDSServer = request.enableSDSServer;
            this.excludeIPRanges = request.excludeIPRanges;
            this.excludeInboundPorts = request.excludeInboundPorts;
            this.excludeOutboundPorts = request.excludeOutboundPorts;
            this.existingCaCert = request.existingCaCert;
            this.existingCaKey = request.existingCaKey;
            this.existingCaType = request.existingCaType;
            this.existingRootCaCert = request.existingRootCaCert;
            this.existingRootCaKey = request.existingRootCaKey;
            this.filterGatewayClusterConfig = request.filterGatewayClusterConfig;
            this.gatewayAPIEnabled = request.gatewayAPIEnabled;
            this.guestCluster = request.guestCluster;
            this.includeIPRanges = request.includeIPRanges;
            this.istioVersion = request.istioVersion;
            this.kialiEnabled = request.kialiEnabled;
            this.localityLBConf = request.localityLBConf;
            this.localityLoadBalancing = request.localityLoadBalancing;
            this.MSEEnabled = request.MSEEnabled;
            this.multiBufferEnabled = request.multiBufferEnabled;
            this.multiBufferPollDelay = request.multiBufferPollDelay;
            this.mysqlFilterEnabled = request.mysqlFilterEnabled;
            this.name = request.name;
            this.OPALimitCPU = request.OPALimitCPU;
            this.OPALimitMemory = request.OPALimitMemory;
            this.OPALogLevel = request.OPALogLevel;
            this.OPARequestCPU = request.OPARequestCPU;
            this.OPARequestMemory = request.OPARequestMemory;
            this.opaEnabled = request.opaEnabled;
            this.openAgentPolicy = request.openAgentPolicy;
            this.period = request.period;
            this.pilotLoadBalancerSpec = request.pilotLoadBalancerSpec;
            this.prometheusUrl = request.prometheusUrl;
            this.proxyLimitCPU = request.proxyLimitCPU;
            this.proxyLimitMemory = request.proxyLimitMemory;
            this.proxyRequestCPU = request.proxyRequestCPU;
            this.proxyRequestMemory = request.proxyRequestMemory;
            this.redisFilterEnabled = request.redisFilterEnabled;
            this.regionId = request.regionId;
            this.telemetry = request.telemetry;
            this.thriftFilterEnabled = request.thriftFilterEnabled;
            this.traceSampling = request.traceSampling;
            this.tracing = request.tracing;
            this.useExistingCA = request.useExistingCA;
            this.vSwitches = request.vSwitches;
            this.vpcId = request.vpcId;
            this.webAssemblyFilterEnabled = request.webAssemblyFilterEnabled;
        } 

        /**
         * Specifies whether to enable access log collection. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder accessLogEnabled(Boolean accessLogEnabled) {
            this.putBodyParameter("AccessLogEnabled", accessLogEnabled);
            this.accessLogEnabled = accessLogEnabled;
            return this;
        }

        /**
         * Specifies whether to enable access log collection. Valid values:
         * <p>
         * 
         * *   "": disables access log collection.
         * *   `/dev/stdout`: enables access log collection. Access logs are written to /dev/stdout.
         */
        public Builder accessLogFile(String accessLogFile) {
            this.putBodyParameter("AccessLogFile", accessLogFile);
            this.accessLogFile = accessLogFile;
            return this;
        }

        /**
         * Custom fields of access logs. To set this parameter, you must enable access log collection. Otherwise, you cannot set this parameter. The value must be a JSON string. The following key values must be contained: authority_for, bytes_received, bytes_sent, downstream_local_address, downstream_remote_address, duration, istio_policy_status, method, path, protocol, requested_server_name, response_code, response_flags, route_name, start_time, trace_id, upstream_cluster, upstream_host, upstream_local_address, upstream_service_time, upstream_transport_failure_reason, user_agent, and x_forwarded_for.
         */
        public Builder accessLogFormat(String accessLogFormat) {
            this.putBodyParameter("AccessLogFormat", accessLogFormat);
            this.accessLogFormat = accessLogFormat;
            return this;
        }

        /**
         * The SLS project from which access logs are collected.
         */
        public Builder accessLogProject(String accessLogProject) {
            this.putBodyParameter("AccessLogProject", accessLogProject);
            this.accessLogProject = accessLogProject;
            return this;
        }

        /**
         * Specifies whether to enable gRPC Access Log Service (ALS) of Envoy. gRPC is short for Google Remote Procedure Call. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder accessLogServiceEnabled(Boolean accessLogServiceEnabled) {
            this.putBodyParameter("AccessLogServiceEnabled", accessLogServiceEnabled);
            this.accessLogServiceEnabled = accessLogServiceEnabled;
            return this;
        }

        /**
         * The endpoint of Envoy\"s gRPC ALS.
         */
        public Builder accessLogServiceHost(String accessLogServiceHost) {
            this.putBodyParameter("AccessLogServiceHost", accessLogServiceHost);
            this.accessLogServiceHost = accessLogServiceHost;
            return this;
        }

        /**
         * The port of Envoy\"s gRPC ALS.
         */
        public Builder accessLogServicePort(Integer accessLogServicePort) {
            this.putBodyParameter("AccessLogServicePort", accessLogServicePort);
            this.accessLogServicePort = accessLogServicePort;
            return this;
        }

        /**
         * The type of the SLB instance that is bound to Istio Pilot. Valid values: `slb.s1.small`, `slb.s2.small`, `slb.s2.medium`, `slb.s3.small`, `slb.s3.medium`, and `slb.s3.large`.
         */
        public Builder apiServerLoadBalancerSpec(String apiServerLoadBalancerSpec) {
            this.putBodyParameter("ApiServerLoadBalancerSpec", apiServerLoadBalancerSpec);
            this.apiServerLoadBalancerSpec = apiServerLoadBalancerSpec;
            return this;
        }

        /**
         * Specifies whether to expose the API server to the Internet. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         * 
         * > If you set this parameter to `false`, the API server cannot be accessed over the Internet.
         */
        public Builder apiServerPublicEip(Boolean apiServerPublicEip) {
            this.putBodyParameter("ApiServerPublicEip", apiServerPublicEip);
            this.apiServerPublicEip = apiServerPublicEip;
            return this;
        }

        /**
         * The name of the Log Service project that is used for mesh audit.
         * <p>
         * 
         * Default value: mesh-log-{ASM instance ID}.
         */
        public Builder auditProject(String auditProject) {
            this.putBodyParameter("AuditProject", auditProject);
            this.auditProject = auditProject;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for the SLB instance if the SLB instance uses the subscription billing method. Valid values:
         * <p>
         * 
         * - true
         * 
         * - false
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal period of the SLB instance. This parameter is valid only if the `ChargeType` parameter is set to `PrePay`. If the original subscription period of the SLB instance is less than one year, the value of this parameter indicates the number of months for auto-renewal. If the original subscription period of the SLB instance is more than one year, the value of this parameter indicates the number of years for auto-renewal.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putBodyParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * Specifies whether to allow the Kubernetes API of clusters on the data plane to access Istio resources. The version of the ASM instance must be V1.9.7.93 or later. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder CRAggregationEnabled(Boolean CRAggregationEnabled) {
            this.putBodyParameter("CRAggregationEnabled", CRAggregationEnabled);
            this.CRAggregationEnabled = CRAggregationEnabled;
            return this;
        }

        /**
         * The billing method of the SLB instance. Valid values:
         * <p>
         * *   `PayOnDemand`: pay-as-you-go.
         * *   `PrePay`: subscription.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The edition of the ASM instance. Valid values:
         * <p>
         * 
         * - `standard`: Standard Edition
         * 
         * - `enterprise`: Enterprise Edition
         * 
         * - `ultimate`: Ultimate Edition
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putBodyParameter("ClusterSpec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * Specifies whether to enable the external service registry. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder configSourceEnabled(Boolean configSourceEnabled) {
            this.putBodyParameter("ConfigSourceEnabled", configSourceEnabled);
            this.configSourceEnabled = configSourceEnabled;
            return this;
        }

        /**
         * The instance ID of the Nacos registry.
         */
        public Builder configSourceNacosID(String configSourceNacosID) {
            this.putBodyParameter("ConfigSourceNacosID", configSourceNacosID);
            this.configSourceNacosID = configSourceNacosID;
            return this;
        }

        /**
         * Specifies whether to enable the collection of control plane logs. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder controlPlaneLogEnabled(Boolean controlPlaneLogEnabled) {
            this.putBodyParameter("ControlPlaneLogEnabled", controlPlaneLogEnabled);
            this.controlPlaneLogEnabled = controlPlaneLogEnabled;
            return this;
        }

        /**
         * The name of the Log Service project that is used to collect the logs of the control plane.
         */
        public Builder controlPlaneLogProject(String controlPlaneLogProject) {
            this.putBodyParameter("ControlPlaneLogProject", controlPlaneLogProject);
            this.controlPlaneLogProject = controlPlaneLogProject;
            return this;
        }

        /**
         * Specifies whether to use a custom Prometheus instance. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder customizedPrometheus(Boolean customizedPrometheus) {
            this.putBodyParameter("CustomizedPrometheus", customizedPrometheus);
            this.customizedPrometheus = customizedPrometheus;
            return this;
        }

        /**
         * Specifies whether to use a self-managed Zipkin system to collect tracing data. Valid values:
         * <p>
         * 
         * *   `true`: uses a self-managed Zipkin system to collect tracing data.
         * *   `false`: uses Alibaba Cloud Tracing Analysis to collect tracing data.
         * 
         * Default value: `false`.
         */
        public Builder customizedZipkin(Boolean customizedZipkin) {
            this.putBodyParameter("CustomizedZipkin", customizedZipkin);
            this.customizedZipkin = customizedZipkin;
            return this;
        }

        /**
         * Specifies whether to enable the DNS proxy feature. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder DNSProxyingEnabled(Boolean DNSProxyingEnabled) {
            this.putBodyParameter("DNSProxyingEnabled", DNSProxyingEnabled);
            this.DNSProxyingEnabled = DNSProxyingEnabled;
            return this;
        }

        /**
         * Specifies whether to enable Dubbo Filter. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder dubboFilterEnabled(Boolean dubboFilterEnabled) {
            this.putBodyParameter("DubboFilterEnabled", dubboFilterEnabled);
            this.dubboFilterEnabled = dubboFilterEnabled;
            return this;
        }

        /**
         * The edition of the ASM instance.
         */
        public Builder edition(String edition) {
            this.putBodyParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * EnableAmbient.
         */
        public Builder enableAmbient(Boolean enableAmbient) {
            this.putBodyParameter("EnableAmbient", enableAmbient);
            this.enableAmbient = enableAmbient;
            return this;
        }

        /**
         * Specifies whether to enable the mesh audit feature. To enable this feature, make sure that you have activated [Log Service](https://sls.console.aliyun.com/). Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder enableAudit(Boolean enableAudit) {
            this.putBodyParameter("EnableAudit", enableAudit);
            this.enableAudit = enableAudit;
            return this;
        }

        /**
         * Specifies whether to enable the rollback feature for Istio resources. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder enableCRHistory(Boolean enableCRHistory) {
            this.putBodyParameter("EnableCRHistory", enableCRHistory);
            this.enableCRHistory = enableCRHistory;
            return this;
        }

        /**
         * Specifies whether to enable Secret Discovery Service (SDS). Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder enableSDSServer(Boolean enableSDSServer) {
            this.putBodyParameter("EnableSDSServer", enableSDSServer);
            this.enableSDSServer = enableSDSServer;
            return this;
        }

        /**
         * The IP ranges in CIDR form to be excluded from redirection to the sidecar proxy in the ASM instance.
         */
        public Builder excludeIPRanges(String excludeIPRanges) {
            this.putBodyParameter("ExcludeIPRanges", excludeIPRanges);
            this.excludeIPRanges = excludeIPRanges;
            return this;
        }

        /**
         * The inbound ports to be excluded from redirection to the sidecar proxy in the ASM instance. Separate multiple port numbers with commas (,).
         */
        public Builder excludeInboundPorts(String excludeInboundPorts) {
            this.putBodyParameter("ExcludeInboundPorts", excludeInboundPorts);
            this.excludeInboundPorts = excludeInboundPorts;
            return this;
        }

        /**
         * The outbound ports to be excluded from redirection to the sidecar proxy in the ASM instance. Separate multiple port numbers with commas (,).
         */
        public Builder excludeOutboundPorts(String excludeOutboundPorts) {
            this.putBodyParameter("ExcludeOutboundPorts", excludeOutboundPorts);
            this.excludeOutboundPorts = excludeOutboundPorts;
            return this;
        }

        /**
         * The existing CA certificate, which is encoded in Base64. This parameter is used in scenarios where you migrate open source Istio to ASM. It specifies the content of the ca-cert.pem file in the istio-ca-secret secret. The secret is in the istio-system namespace of the Kubernetes cluster where the open source Istio is installed.
         */
        public Builder existingCaCert(String existingCaCert) {
            this.putBodyParameter("ExistingCaCert", existingCaCert);
            this.existingCaCert = existingCaCert;
            return this;
        }

        /**
         * The existing CA key, which is encoded in Base64. This parameter is used in scenarios where you migrate open source Istio to ASM. It specifies the content of the ca-key.pem file in the istio-ca-secret secret. The secret is in the istio-system namespace of the Kubernetes cluster where the open source Istio is installed.
         */
        public Builder existingCaKey(String existingCaKey) {
            this.putBodyParameter("ExistingCaKey", existingCaKey);
            this.existingCaKey = existingCaKey;
            return this;
        }

        /**
         * The type of the existing CA certificate. Valid values:
         * <p>
         * 
         * *   1: Self-signed certificate generated by istiod. The certificate corresponds to the secret named istio-ca-secret in the istio-system namespace. If you use this type of certificate, you must set the `ExistingCaCert` and `ExsitingCaKey` parameters.
         * *   2: Administrator-specified certificate. For more information, see [plugin ca cert](https://istio.io/latest/docs/tasks/security/cert-management/plugin-ca-cert/). In most cases, the certificate corresponds to the secret named cacerts in the istio-system namespace. If you use this type of certificate, you must set the `ExisingRootCaCert` and `ExisingRootCaKey` parameters.
         */
        public Builder existingCaType(String existingCaType) {
            this.putBodyParameter("ExistingCaType", existingCaType);
            this.existingCaType = existingCaType;
            return this;
        }

        /**
         * The existing root certificate, which is encoded in Base64.
         */
        public Builder existingRootCaCert(String existingRootCaCert) {
            this.putBodyParameter("ExistingRootCaCert", existingRootCaCert);
            this.existingRootCaCert = existingRootCaCert;
            return this;
        }

        /**
         * The private key that corresponds to the root certificate, which is encoded in Base64.
         */
        public Builder existingRootCaKey(String existingRootCaKey) {
            this.putBodyParameter("ExistingRootCaKey", existingRootCaKey);
            this.existingRootCaKey = existingRootCaKey;
            return this;
        }

        /**
         * Specifies whether to enable gateway configuration filtering. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder filterGatewayClusterConfig(Boolean filterGatewayClusterConfig) {
            this.putBodyParameter("FilterGatewayClusterConfig", filterGatewayClusterConfig);
            this.filterGatewayClusterConfig = filterGatewayClusterConfig;
            return this;
        }

        /**
         * Specifies whether to enable Gateway API. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder gatewayAPIEnabled(Boolean gatewayAPIEnabled) {
            this.putBodyParameter("GatewayAPIEnabled", gatewayAPIEnabled);
            this.gatewayAPIEnabled = gatewayAPIEnabled;
            return this;
        }

        /**
         * After this ASM instance is successfully created, automatically add an ACK cluster to it. 
         * <p>
         * Make sure this ASM instance and ACK cluster have same VPC, VSwitch, cluster domain.
         */
        public Builder guestCluster(String guestCluster) {
            this.putBodyParameter("GuestCluster", guestCluster);
            this.guestCluster = guestCluster;
            return this;
        }

        /**
         * The IP ranges in CIDR form for which traffic is to be redirected to the sidecar proxy in the ASM instance.
         */
        public Builder includeIPRanges(String includeIPRanges) {
            this.putBodyParameter("IncludeIPRanges", includeIPRanges);
            this.includeIPRanges = includeIPRanges;
            return this;
        }

        /**
         * The Istio version of the ASM instance.
         */
        public Builder istioVersion(String istioVersion) {
            this.putBodyParameter("IstioVersion", istioVersion);
            this.istioVersion = istioVersion;
            return this;
        }

        /**
         * Specifies whether to enable the mesh topology feature. To enable this feature, make sure that you have enabled Prometheus monitoring. If Prometheus monitoring is disabled, you must set this parameter to `false`.`` Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder kialiEnabled(Boolean kialiEnabled) {
            this.putBodyParameter("KialiEnabled", kialiEnabled);
            this.kialiEnabled = kialiEnabled;
            return this;
        }

        /**
         * The configurations for the access to the nearest instance.
         */
        public Builder localityLBConf(String localityLBConf) {
            this.putBodyParameter("LocalityLBConf", localityLBConf);
            this.localityLBConf = localityLBConf;
            return this;
        }

        /**
         * Specifies whether to route traffic to the nearest instance. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder localityLoadBalancing(Boolean localityLoadBalancing) {
            this.putBodyParameter("LocalityLoadBalancing", localityLoadBalancing);
            this.localityLoadBalancing = localityLoadBalancing;
            return this;
        }

        /**
         * Specifies whether to enable Microservices Engine (MSE). Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder MSEEnabled(Boolean MSEEnabled) {
            this.putBodyParameter("MSEEnabled", MSEEnabled);
            this.MSEEnabled = MSEEnabled;
            return this;
        }

        /**
         * Specifies whether to enable MultiBuffer-based Transport Layer Security (TLS) acceleration. Valid values:
         * <p>
         * 
         * - `true`
         * 
         * - `false`
         * 
         * 
         * Default value: `true`
         */
        public Builder multiBufferEnabled(Boolean multiBufferEnabled) {
            this.putBodyParameter("MultiBufferEnabled", multiBufferEnabled);
            this.multiBufferEnabled = multiBufferEnabled;
            return this;
        }

        /**
         * The pull-request latency. Default value: 30. Unit: seconds.
         */
        public Builder multiBufferPollDelay(String multiBufferPollDelay) {
            this.putBodyParameter("MultiBufferPollDelay", multiBufferPollDelay);
            this.multiBufferPollDelay = multiBufferPollDelay;
            return this;
        }

        /**
         * Specifies whether to enable MySQL Filter. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder mysqlFilterEnabled(Boolean mysqlFilterEnabled) {
            this.putBodyParameter("MysqlFilterEnabled", mysqlFilterEnabled);
            this.mysqlFilterEnabled = mysqlFilterEnabled;
            return this;
        }

        /**
         * The name of the ASM instance.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The maximum number of CPU cores that are available to the OPA container.
         */
        public Builder OPALimitCPU(String OPALimitCPU) {
            this.putBodyParameter("OPALimitCPU", OPALimitCPU);
            this.OPALimitCPU = OPALimitCPU;
            return this;
        }

        /**
         * The maximum size of the memory that is available to the OPA container. You can specify the parameter value in the standard quantity representation form used by Kubernetes. 1 Mi equals 1,024 KB.
         */
        public Builder OPALimitMemory(String OPALimitMemory) {
            this.putBodyParameter("OPALimitMemory", OPALimitMemory);
            this.OPALimitMemory = OPALimitMemory;
            return this;
        }

        /**
         * The log level of the OPA container.
         */
        public Builder OPALogLevel(String OPALogLevel) {
            this.putBodyParameter("OPALogLevel", OPALogLevel);
            this.OPALogLevel = OPALogLevel;
            return this;
        }

        /**
         * The minimum number of CPU cores that are required by the OPA container. You can specify the parameter value in the standard representation form of CPUs in Kubernetes. For example, if you set the value to 1, one CPU core is required.
         */
        public Builder OPARequestCPU(String OPARequestCPU) {
            this.putBodyParameter("OPARequestCPU", OPARequestCPU);
            this.OPARequestCPU = OPARequestCPU;
            return this;
        }

        /**
         * The minimum size of the memory that is required by the OPA container. You can specify the parameter value in the standard quantity representation form used by Kubernetes. 1 Mi equals 1,024 KB.
         */
        public Builder OPARequestMemory(String OPARequestMemory) {
            this.putBodyParameter("OPARequestMemory", OPARequestMemory);
            this.OPARequestMemory = OPARequestMemory;
            return this;
        }

        /**
         * Specifies whether to enable the OPA plug-in. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder opaEnabled(Boolean opaEnabled) {
            this.putBodyParameter("OpaEnabled", opaEnabled);
            this.opaEnabled = opaEnabled;
            return this;
        }

        /**
         * Specifies whether to install the Open Policy Agent (OPA) plug-in. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder openAgentPolicy(Boolean openAgentPolicy) {
            this.putBodyParameter("OpenAgentPolicy", openAgentPolicy);
            this.openAgentPolicy = openAgentPolicy;
            return this;
        }

        /**
         * The subscription period of the SLB instance. Unit: month. This parameter is valid only if the ChargeType parameter is set to PrePay. For example, if the subscription period is one year, set this parameter to 12.
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The type of the SLB instance that is bound to Istio Pilot. Valid values: `slb.s1.small`, `slb.s2.small`, `slb.s2.medium`, `slb.s3.small`, `slb.s3.medium`, and `slb.s3.large`.
         */
        public Builder pilotLoadBalancerSpec(String pilotLoadBalancerSpec) {
            this.putBodyParameter("PilotLoadBalancerSpec", pilotLoadBalancerSpec);
            this.pilotLoadBalancerSpec = pilotLoadBalancerSpec;
            return this;
        }

        /**
         * The endpoint of the custom Prometheus instance.
         */
        public Builder prometheusUrl(String prometheusUrl) {
            this.putBodyParameter("PrometheusUrl", prometheusUrl);
            this.prometheusUrl = prometheusUrl;
            return this;
        }

        /**
         * The maximum number of CPU cores that are available to the proxy container.
         */
        public Builder proxyLimitCPU(String proxyLimitCPU) {
            this.putBodyParameter("ProxyLimitCPU", proxyLimitCPU);
            this.proxyLimitCPU = proxyLimitCPU;
            return this;
        }

        /**
         * The maximum size of the memory that is available to the proxy container.
         */
        public Builder proxyLimitMemory(String proxyLimitMemory) {
            this.putBodyParameter("ProxyLimitMemory", proxyLimitMemory);
            this.proxyLimitMemory = proxyLimitMemory;
            return this;
        }

        /**
         * The minimum number of CPU cores that are required by the proxy container.
         */
        public Builder proxyRequestCPU(String proxyRequestCPU) {
            this.putBodyParameter("ProxyRequestCPU", proxyRequestCPU);
            this.proxyRequestCPU = proxyRequestCPU;
            return this;
        }

        /**
         * The minimum size of the memory that is required by the proxy container.
         */
        public Builder proxyRequestMemory(String proxyRequestMemory) {
            this.putBodyParameter("ProxyRequestMemory", proxyRequestMemory);
            this.proxyRequestMemory = proxyRequestMemory;
            return this;
        }

        /**
         * Specifies whether to enable Redis Filter. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder redisFilterEnabled(Boolean redisFilterEnabled) {
            this.putBodyParameter("RedisFilterEnabled", redisFilterEnabled);
            this.redisFilterEnabled = redisFilterEnabled;
            return this;
        }

        /**
         * The ID of the region in which the ASM instance resides.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to enable Prometheus monitoring. We recommend that you use Prometheus Service of [Application Real-Time Monitoring Service (ARMS)](https://arms.console.aliyun.com/). Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder telemetry(Boolean telemetry) {
            this.putBodyParameter("Telemetry", telemetry);
            this.telemetry = telemetry;
            return this;
        }

        /**
         * Specifies whether to enable Thrift Filter. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder thriftFilterEnabled(Boolean thriftFilterEnabled) {
            this.putBodyParameter("ThriftFilterEnabled", thriftFilterEnabled);
            this.thriftFilterEnabled = thriftFilterEnabled;
            return this;
        }

        /**
         * The sampling percentage of Tracing Analysis.
         */
        public Builder traceSampling(Float traceSampling) {
            this.putBodyParameter("TraceSampling", traceSampling);
            this.traceSampling = traceSampling;
            return this;
        }

        /**
         * Specifies whether to enable the Tracing Analysis feature. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder tracing(Boolean tracing) {
            this.putBodyParameter("Tracing", tracing);
            this.tracing = tracing;
            return this;
        }

        /**
         * Specifies whether to use an existing CA certificate and private key.
         */
        public Builder useExistingCA(Boolean useExistingCA) {
            this.putBodyParameter("UseExistingCA", useExistingCA);
            this.useExistingCA = useExistingCA;
            return this;
        }

        /**
         * The ID of the vSwitch to which the ASM instance is connected.
         */
        public Builder vSwitches(String vSwitches) {
            this.putBodyParameter("VSwitches", vSwitches);
            this.vSwitches = vSwitches;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) in which the ASM instance resides.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * Specifies whether to enable WebAssembly Filter. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         * 
         * Default value: `false`.
         */
        public Builder webAssemblyFilterEnabled(Boolean webAssemblyFilterEnabled) {
            this.putBodyParameter("WebAssemblyFilterEnabled", webAssemblyFilterEnabled);
            this.webAssemblyFilterEnabled = webAssemblyFilterEnabled;
            return this;
        }

        @Override
        public CreateServiceMeshRequest build() {
            return new CreateServiceMeshRequest(this);
        } 

    } 

}
