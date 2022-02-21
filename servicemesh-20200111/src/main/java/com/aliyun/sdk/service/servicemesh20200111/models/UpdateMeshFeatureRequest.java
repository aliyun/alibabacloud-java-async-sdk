// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMeshFeatureRequest} extends {@link RequestModel}
 *
 * <p>UpdateMeshFeatureRequest</p>
 */
public class UpdateMeshFeatureRequest extends Request {
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
    @NameInMap("AuditProject")
    private String auditProject;

    @Body
    @NameInMap("AutoInjectionPolicyEnabled")
    private Boolean autoInjectionPolicyEnabled;

    @Body
    @NameInMap("CRAggregationEnabled")
    private Boolean CRAggregationEnabled;

    @Body
    @NameInMap("CniEnabled")
    private Boolean cniEnabled;

    @Body
    @NameInMap("CniExcludeNamespaces")
    private String cniExcludeNamespaces;

    @Body
    @NameInMap("ConfigSourceEnabled")
    private Boolean configSourceEnabled;

    @Body
    @NameInMap("ConfigSourceNacosID")
    private String configSourceNacosID;

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
    @NameInMap("DiscoverySelectors")
    private String discoverySelectors;

    @Body
    @NameInMap("DubboFilterEnabled")
    private Boolean dubboFilterEnabled;

    @Body
    @NameInMap("EnableAudit")
    private Boolean enableAudit;

    @Body
    @NameInMap("EnableCRHistory")
    private Boolean enableCRHistory;

    @Body
    @NameInMap("EnableNamespacesByDefault")
    private Boolean enableNamespacesByDefault;

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
    @NameInMap("FilterGatewayClusterConfig")
    private Boolean filterGatewayClusterConfig;

    @Body
    @NameInMap("GatewayAPIEnabled")
    private Boolean gatewayAPIEnabled;

    @Body
    @NameInMap("Http10Enabled")
    private Boolean http10Enabled;

    @Body
    @NameInMap("IncludeIPRanges")
    private String includeIPRanges;

    @Body
    @NameInMap("IncludeInboundPorts")
    private String includeInboundPorts;

    @Body
    @NameInMap("KialiEnabled")
    private Boolean kialiEnabled;

    @Body
    @NameInMap("Lifecycle")
    private String lifecycle;

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
    @NameInMap("OutboundTrafficPolicy")
    private String outboundTrafficPolicy;

    @Body
    @NameInMap("PrometheusUrl")
    private String prometheusUrl;

    @Body
    @NameInMap("ProxyInitCPUResourceLimit")
    private String proxyInitCPUResourceLimit;

    @Body
    @NameInMap("ProxyInitCPUResourceRequest")
    private String proxyInitCPUResourceRequest;

    @Body
    @NameInMap("ProxyInitMemoryResourceLimit")
    private String proxyInitMemoryResourceLimit;

    @Body
    @NameInMap("ProxyInitMemoryResourceRequest")
    private String proxyInitMemoryResourceRequest;

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
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("SidecarInjectorLimitCPU")
    private String sidecarInjectorLimitCPU;

    @Body
    @NameInMap("SidecarInjectorLimitMemory")
    private String sidecarInjectorLimitMemory;

    @Body
    @NameInMap("SidecarInjectorRequestCPU")
    private String sidecarInjectorRequestCPU;

    @Body
    @NameInMap("SidecarInjectorRequestMemory")
    private String sidecarInjectorRequestMemory;

    @Body
    @NameInMap("SidecarInjectorWebhookAsYaml")
    private String sidecarInjectorWebhookAsYaml;

    @Body
    @NameInMap("Telemetry")
    private Boolean telemetry;

    @Body
    @NameInMap("TerminationDrainDuration")
    private String terminationDrainDuration;

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
    @NameInMap("WebAssemblyFilterEnabled")
    private Boolean webAssemblyFilterEnabled;

    private UpdateMeshFeatureRequest(Builder builder) {
        super(builder);
        this.accessLogEnabled = builder.accessLogEnabled;
        this.accessLogFile = builder.accessLogFile;
        this.accessLogFormat = builder.accessLogFormat;
        this.accessLogProject = builder.accessLogProject;
        this.accessLogServiceEnabled = builder.accessLogServiceEnabled;
        this.accessLogServiceHost = builder.accessLogServiceHost;
        this.accessLogServicePort = builder.accessLogServicePort;
        this.auditProject = builder.auditProject;
        this.autoInjectionPolicyEnabled = builder.autoInjectionPolicyEnabled;
        this.CRAggregationEnabled = builder.CRAggregationEnabled;
        this.cniEnabled = builder.cniEnabled;
        this.cniExcludeNamespaces = builder.cniExcludeNamespaces;
        this.configSourceEnabled = builder.configSourceEnabled;
        this.configSourceNacosID = builder.configSourceNacosID;
        this.customizedPrometheus = builder.customizedPrometheus;
        this.customizedZipkin = builder.customizedZipkin;
        this.DNSProxyingEnabled = builder.DNSProxyingEnabled;
        this.discoverySelectors = builder.discoverySelectors;
        this.dubboFilterEnabled = builder.dubboFilterEnabled;
        this.enableAudit = builder.enableAudit;
        this.enableCRHistory = builder.enableCRHistory;
        this.enableNamespacesByDefault = builder.enableNamespacesByDefault;
        this.enableSDSServer = builder.enableSDSServer;
        this.excludeIPRanges = builder.excludeIPRanges;
        this.excludeInboundPorts = builder.excludeInboundPorts;
        this.excludeOutboundPorts = builder.excludeOutboundPorts;
        this.filterGatewayClusterConfig = builder.filterGatewayClusterConfig;
        this.gatewayAPIEnabled = builder.gatewayAPIEnabled;
        this.http10Enabled = builder.http10Enabled;
        this.includeIPRanges = builder.includeIPRanges;
        this.includeInboundPorts = builder.includeInboundPorts;
        this.kialiEnabled = builder.kialiEnabled;
        this.lifecycle = builder.lifecycle;
        this.localityLBConf = builder.localityLBConf;
        this.localityLoadBalancing = builder.localityLoadBalancing;
        this.MSEEnabled = builder.MSEEnabled;
        this.multiBufferEnabled = builder.multiBufferEnabled;
        this.multiBufferPollDelay = builder.multiBufferPollDelay;
        this.mysqlFilterEnabled = builder.mysqlFilterEnabled;
        this.OPALimitCPU = builder.OPALimitCPU;
        this.OPALimitMemory = builder.OPALimitMemory;
        this.OPALogLevel = builder.OPALogLevel;
        this.OPARequestCPU = builder.OPARequestCPU;
        this.OPARequestMemory = builder.OPARequestMemory;
        this.opaEnabled = builder.opaEnabled;
        this.openAgentPolicy = builder.openAgentPolicy;
        this.outboundTrafficPolicy = builder.outboundTrafficPolicy;
        this.prometheusUrl = builder.prometheusUrl;
        this.proxyInitCPUResourceLimit = builder.proxyInitCPUResourceLimit;
        this.proxyInitCPUResourceRequest = builder.proxyInitCPUResourceRequest;
        this.proxyInitMemoryResourceLimit = builder.proxyInitMemoryResourceLimit;
        this.proxyInitMemoryResourceRequest = builder.proxyInitMemoryResourceRequest;
        this.proxyLimitCPU = builder.proxyLimitCPU;
        this.proxyLimitMemory = builder.proxyLimitMemory;
        this.proxyRequestCPU = builder.proxyRequestCPU;
        this.proxyRequestMemory = builder.proxyRequestMemory;
        this.redisFilterEnabled = builder.redisFilterEnabled;
        this.serviceMeshId = builder.serviceMeshId;
        this.sidecarInjectorLimitCPU = builder.sidecarInjectorLimitCPU;
        this.sidecarInjectorLimitMemory = builder.sidecarInjectorLimitMemory;
        this.sidecarInjectorRequestCPU = builder.sidecarInjectorRequestCPU;
        this.sidecarInjectorRequestMemory = builder.sidecarInjectorRequestMemory;
        this.sidecarInjectorWebhookAsYaml = builder.sidecarInjectorWebhookAsYaml;
        this.telemetry = builder.telemetry;
        this.terminationDrainDuration = builder.terminationDrainDuration;
        this.thriftFilterEnabled = builder.thriftFilterEnabled;
        this.traceSampling = builder.traceSampling;
        this.tracing = builder.tracing;
        this.webAssemblyFilterEnabled = builder.webAssemblyFilterEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMeshFeatureRequest create() {
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
     * @return auditProject
     */
    public String getAuditProject() {
        return this.auditProject;
    }

    /**
     * @return autoInjectionPolicyEnabled
     */
    public Boolean getAutoInjectionPolicyEnabled() {
        return this.autoInjectionPolicyEnabled;
    }

    /**
     * @return CRAggregationEnabled
     */
    public Boolean getCRAggregationEnabled() {
        return this.CRAggregationEnabled;
    }

    /**
     * @return cniEnabled
     */
    public Boolean getCniEnabled() {
        return this.cniEnabled;
    }

    /**
     * @return cniExcludeNamespaces
     */
    public String getCniExcludeNamespaces() {
        return this.cniExcludeNamespaces;
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
     * @return discoverySelectors
     */
    public String getDiscoverySelectors() {
        return this.discoverySelectors;
    }

    /**
     * @return dubboFilterEnabled
     */
    public Boolean getDubboFilterEnabled() {
        return this.dubboFilterEnabled;
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
     * @return enableNamespacesByDefault
     */
    public Boolean getEnableNamespacesByDefault() {
        return this.enableNamespacesByDefault;
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
     * @return http10Enabled
     */
    public Boolean getHttp10Enabled() {
        return this.http10Enabled;
    }

    /**
     * @return includeIPRanges
     */
    public String getIncludeIPRanges() {
        return this.includeIPRanges;
    }

    /**
     * @return includeInboundPorts
     */
    public String getIncludeInboundPorts() {
        return this.includeInboundPorts;
    }

    /**
     * @return kialiEnabled
     */
    public Boolean getKialiEnabled() {
        return this.kialiEnabled;
    }

    /**
     * @return lifecycle
     */
    public String getLifecycle() {
        return this.lifecycle;
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
     * @return outboundTrafficPolicy
     */
    public String getOutboundTrafficPolicy() {
        return this.outboundTrafficPolicy;
    }

    /**
     * @return prometheusUrl
     */
    public String getPrometheusUrl() {
        return this.prometheusUrl;
    }

    /**
     * @return proxyInitCPUResourceLimit
     */
    public String getProxyInitCPUResourceLimit() {
        return this.proxyInitCPUResourceLimit;
    }

    /**
     * @return proxyInitCPUResourceRequest
     */
    public String getProxyInitCPUResourceRequest() {
        return this.proxyInitCPUResourceRequest;
    }

    /**
     * @return proxyInitMemoryResourceLimit
     */
    public String getProxyInitMemoryResourceLimit() {
        return this.proxyInitMemoryResourceLimit;
    }

    /**
     * @return proxyInitMemoryResourceRequest
     */
    public String getProxyInitMemoryResourceRequest() {
        return this.proxyInitMemoryResourceRequest;
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
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return sidecarInjectorLimitCPU
     */
    public String getSidecarInjectorLimitCPU() {
        return this.sidecarInjectorLimitCPU;
    }

    /**
     * @return sidecarInjectorLimitMemory
     */
    public String getSidecarInjectorLimitMemory() {
        return this.sidecarInjectorLimitMemory;
    }

    /**
     * @return sidecarInjectorRequestCPU
     */
    public String getSidecarInjectorRequestCPU() {
        return this.sidecarInjectorRequestCPU;
    }

    /**
     * @return sidecarInjectorRequestMemory
     */
    public String getSidecarInjectorRequestMemory() {
        return this.sidecarInjectorRequestMemory;
    }

    /**
     * @return sidecarInjectorWebhookAsYaml
     */
    public String getSidecarInjectorWebhookAsYaml() {
        return this.sidecarInjectorWebhookAsYaml;
    }

    /**
     * @return telemetry
     */
    public Boolean getTelemetry() {
        return this.telemetry;
    }

    /**
     * @return terminationDrainDuration
     */
    public String getTerminationDrainDuration() {
        return this.terminationDrainDuration;
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
     * @return webAssemblyFilterEnabled
     */
    public Boolean getWebAssemblyFilterEnabled() {
        return this.webAssemblyFilterEnabled;
    }

    public static final class Builder extends Request.Builder<UpdateMeshFeatureRequest, Builder> {
        private Boolean accessLogEnabled; 
        private String accessLogFile; 
        private String accessLogFormat; 
        private String accessLogProject; 
        private Boolean accessLogServiceEnabled; 
        private String accessLogServiceHost; 
        private Integer accessLogServicePort; 
        private String auditProject; 
        private Boolean autoInjectionPolicyEnabled; 
        private Boolean CRAggregationEnabled; 
        private Boolean cniEnabled; 
        private String cniExcludeNamespaces; 
        private Boolean configSourceEnabled; 
        private String configSourceNacosID; 
        private Boolean customizedPrometheus; 
        private Boolean customizedZipkin; 
        private Boolean DNSProxyingEnabled; 
        private String discoverySelectors; 
        private Boolean dubboFilterEnabled; 
        private Boolean enableAudit; 
        private Boolean enableCRHistory; 
        private Boolean enableNamespacesByDefault; 
        private Boolean enableSDSServer; 
        private String excludeIPRanges; 
        private String excludeInboundPorts; 
        private String excludeOutboundPorts; 
        private Boolean filterGatewayClusterConfig; 
        private Boolean gatewayAPIEnabled; 
        private Boolean http10Enabled; 
        private String includeIPRanges; 
        private String includeInboundPorts; 
        private Boolean kialiEnabled; 
        private String lifecycle; 
        private String localityLBConf; 
        private Boolean localityLoadBalancing; 
        private Boolean MSEEnabled; 
        private Boolean multiBufferEnabled; 
        private String multiBufferPollDelay; 
        private Boolean mysqlFilterEnabled; 
        private String OPALimitCPU; 
        private String OPALimitMemory; 
        private String OPALogLevel; 
        private String OPARequestCPU; 
        private String OPARequestMemory; 
        private Boolean opaEnabled; 
        private Boolean openAgentPolicy; 
        private String outboundTrafficPolicy; 
        private String prometheusUrl; 
        private String proxyInitCPUResourceLimit; 
        private String proxyInitCPUResourceRequest; 
        private String proxyInitMemoryResourceLimit; 
        private String proxyInitMemoryResourceRequest; 
        private String proxyLimitCPU; 
        private String proxyLimitMemory; 
        private String proxyRequestCPU; 
        private String proxyRequestMemory; 
        private Boolean redisFilterEnabled; 
        private String serviceMeshId; 
        private String sidecarInjectorLimitCPU; 
        private String sidecarInjectorLimitMemory; 
        private String sidecarInjectorRequestCPU; 
        private String sidecarInjectorRequestMemory; 
        private String sidecarInjectorWebhookAsYaml; 
        private Boolean telemetry; 
        private String terminationDrainDuration; 
        private Boolean thriftFilterEnabled; 
        private Float traceSampling; 
        private Boolean tracing; 
        private Boolean webAssemblyFilterEnabled; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMeshFeatureRequest response) {
            super(response);
            this.accessLogEnabled = response.accessLogEnabled;
            this.accessLogFile = response.accessLogFile;
            this.accessLogFormat = response.accessLogFormat;
            this.accessLogProject = response.accessLogProject;
            this.accessLogServiceEnabled = response.accessLogServiceEnabled;
            this.accessLogServiceHost = response.accessLogServiceHost;
            this.accessLogServicePort = response.accessLogServicePort;
            this.auditProject = response.auditProject;
            this.autoInjectionPolicyEnabled = response.autoInjectionPolicyEnabled;
            this.CRAggregationEnabled = response.CRAggregationEnabled;
            this.cniEnabled = response.cniEnabled;
            this.cniExcludeNamespaces = response.cniExcludeNamespaces;
            this.configSourceEnabled = response.configSourceEnabled;
            this.configSourceNacosID = response.configSourceNacosID;
            this.customizedPrometheus = response.customizedPrometheus;
            this.customizedZipkin = response.customizedZipkin;
            this.DNSProxyingEnabled = response.DNSProxyingEnabled;
            this.discoverySelectors = response.discoverySelectors;
            this.dubboFilterEnabled = response.dubboFilterEnabled;
            this.enableAudit = response.enableAudit;
            this.enableCRHistory = response.enableCRHistory;
            this.enableNamespacesByDefault = response.enableNamespacesByDefault;
            this.enableSDSServer = response.enableSDSServer;
            this.excludeIPRanges = response.excludeIPRanges;
            this.excludeInboundPorts = response.excludeInboundPorts;
            this.excludeOutboundPorts = response.excludeOutboundPorts;
            this.filterGatewayClusterConfig = response.filterGatewayClusterConfig;
            this.gatewayAPIEnabled = response.gatewayAPIEnabled;
            this.http10Enabled = response.http10Enabled;
            this.includeIPRanges = response.includeIPRanges;
            this.includeInboundPorts = response.includeInboundPorts;
            this.kialiEnabled = response.kialiEnabled;
            this.lifecycle = response.lifecycle;
            this.localityLBConf = response.localityLBConf;
            this.localityLoadBalancing = response.localityLoadBalancing;
            this.MSEEnabled = response.MSEEnabled;
            this.multiBufferEnabled = response.multiBufferEnabled;
            this.multiBufferPollDelay = response.multiBufferPollDelay;
            this.mysqlFilterEnabled = response.mysqlFilterEnabled;
            this.OPALimitCPU = response.OPALimitCPU;
            this.OPALimitMemory = response.OPALimitMemory;
            this.OPALogLevel = response.OPALogLevel;
            this.OPARequestCPU = response.OPARequestCPU;
            this.OPARequestMemory = response.OPARequestMemory;
            this.opaEnabled = response.opaEnabled;
            this.openAgentPolicy = response.openAgentPolicy;
            this.outboundTrafficPolicy = response.outboundTrafficPolicy;
            this.prometheusUrl = response.prometheusUrl;
            this.proxyInitCPUResourceLimit = response.proxyInitCPUResourceLimit;
            this.proxyInitCPUResourceRequest = response.proxyInitCPUResourceRequest;
            this.proxyInitMemoryResourceLimit = response.proxyInitMemoryResourceLimit;
            this.proxyInitMemoryResourceRequest = response.proxyInitMemoryResourceRequest;
            this.proxyLimitCPU = response.proxyLimitCPU;
            this.proxyLimitMemory = response.proxyLimitMemory;
            this.proxyRequestCPU = response.proxyRequestCPU;
            this.proxyRequestMemory = response.proxyRequestMemory;
            this.redisFilterEnabled = response.redisFilterEnabled;
            this.serviceMeshId = response.serviceMeshId;
            this.sidecarInjectorLimitCPU = response.sidecarInjectorLimitCPU;
            this.sidecarInjectorLimitMemory = response.sidecarInjectorLimitMemory;
            this.sidecarInjectorRequestCPU = response.sidecarInjectorRequestCPU;
            this.sidecarInjectorRequestMemory = response.sidecarInjectorRequestMemory;
            this.sidecarInjectorWebhookAsYaml = response.sidecarInjectorWebhookAsYaml;
            this.telemetry = response.telemetry;
            this.terminationDrainDuration = response.terminationDrainDuration;
            this.thriftFilterEnabled = response.thriftFilterEnabled;
            this.traceSampling = response.traceSampling;
            this.tracing = response.tracing;
            this.webAssemblyFilterEnabled = response.webAssemblyFilterEnabled;
        } 

        /**
         * AccessLogEnabled.
         */
        public Builder accessLogEnabled(Boolean accessLogEnabled) {
            this.putBodyParameter("AccessLogEnabled", accessLogEnabled);
            this.accessLogEnabled = accessLogEnabled;
            return this;
        }

        /**
         * AccessLogFile.
         */
        public Builder accessLogFile(String accessLogFile) {
            this.putBodyParameter("AccessLogFile", accessLogFile);
            this.accessLogFile = accessLogFile;
            return this;
        }

        /**
         * AccessLogFormat.
         */
        public Builder accessLogFormat(String accessLogFormat) {
            this.putBodyParameter("AccessLogFormat", accessLogFormat);
            this.accessLogFormat = accessLogFormat;
            return this;
        }

        /**
         * AccessLogProject.
         */
        public Builder accessLogProject(String accessLogProject) {
            this.putBodyParameter("AccessLogProject", accessLogProject);
            this.accessLogProject = accessLogProject;
            return this;
        }

        /**
         * AccessLogServiceEnabled.
         */
        public Builder accessLogServiceEnabled(Boolean accessLogServiceEnabled) {
            this.putBodyParameter("AccessLogServiceEnabled", accessLogServiceEnabled);
            this.accessLogServiceEnabled = accessLogServiceEnabled;
            return this;
        }

        /**
         * AccessLogServiceHost.
         */
        public Builder accessLogServiceHost(String accessLogServiceHost) {
            this.putBodyParameter("AccessLogServiceHost", accessLogServiceHost);
            this.accessLogServiceHost = accessLogServiceHost;
            return this;
        }

        /**
         * AccessLogServicePort.
         */
        public Builder accessLogServicePort(Integer accessLogServicePort) {
            this.putBodyParameter("AccessLogServicePort", accessLogServicePort);
            this.accessLogServicePort = accessLogServicePort;
            return this;
        }

        /**
         * AuditProject.
         */
        public Builder auditProject(String auditProject) {
            this.putBodyParameter("AuditProject", auditProject);
            this.auditProject = auditProject;
            return this;
        }

        /**
         * AutoInjectionPolicyEnabled.
         */
        public Builder autoInjectionPolicyEnabled(Boolean autoInjectionPolicyEnabled) {
            this.putBodyParameter("AutoInjectionPolicyEnabled", autoInjectionPolicyEnabled);
            this.autoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
            return this;
        }

        /**
         * CRAggregationEnabled.
         */
        public Builder CRAggregationEnabled(Boolean CRAggregationEnabled) {
            this.putBodyParameter("CRAggregationEnabled", CRAggregationEnabled);
            this.CRAggregationEnabled = CRAggregationEnabled;
            return this;
        }

        /**
         * CniEnabled.
         */
        public Builder cniEnabled(Boolean cniEnabled) {
            this.putBodyParameter("CniEnabled", cniEnabled);
            this.cniEnabled = cniEnabled;
            return this;
        }

        /**
         * CniExcludeNamespaces.
         */
        public Builder cniExcludeNamespaces(String cniExcludeNamespaces) {
            this.putBodyParameter("CniExcludeNamespaces", cniExcludeNamespaces);
            this.cniExcludeNamespaces = cniExcludeNamespaces;
            return this;
        }

        /**
         * ConfigSourceEnabled.
         */
        public Builder configSourceEnabled(Boolean configSourceEnabled) {
            this.putBodyParameter("ConfigSourceEnabled", configSourceEnabled);
            this.configSourceEnabled = configSourceEnabled;
            return this;
        }

        /**
         * ConfigSourceNacosID.
         */
        public Builder configSourceNacosID(String configSourceNacosID) {
            this.putBodyParameter("ConfigSourceNacosID", configSourceNacosID);
            this.configSourceNacosID = configSourceNacosID;
            return this;
        }

        /**
         * CustomizedPrometheus.
         */
        public Builder customizedPrometheus(Boolean customizedPrometheus) {
            this.putBodyParameter("CustomizedPrometheus", customizedPrometheus);
            this.customizedPrometheus = customizedPrometheus;
            return this;
        }

        /**
         * CustomizedZipkin.
         */
        public Builder customizedZipkin(Boolean customizedZipkin) {
            this.putBodyParameter("CustomizedZipkin", customizedZipkin);
            this.customizedZipkin = customizedZipkin;
            return this;
        }

        /**
         * DNSProxyingEnabled.
         */
        public Builder DNSProxyingEnabled(Boolean DNSProxyingEnabled) {
            this.putBodyParameter("DNSProxyingEnabled", DNSProxyingEnabled);
            this.DNSProxyingEnabled = DNSProxyingEnabled;
            return this;
        }

        /**
         * DiscoverySelectors.
         */
        public Builder discoverySelectors(String discoverySelectors) {
            this.putBodyParameter("DiscoverySelectors", discoverySelectors);
            this.discoverySelectors = discoverySelectors;
            return this;
        }

        /**
         * DubboFilterEnabled.
         */
        public Builder dubboFilterEnabled(Boolean dubboFilterEnabled) {
            this.putBodyParameter("DubboFilterEnabled", dubboFilterEnabled);
            this.dubboFilterEnabled = dubboFilterEnabled;
            return this;
        }

        /**
         * EnableAudit.
         */
        public Builder enableAudit(Boolean enableAudit) {
            this.putBodyParameter("EnableAudit", enableAudit);
            this.enableAudit = enableAudit;
            return this;
        }

        /**
         * EnableCRHistory.
         */
        public Builder enableCRHistory(Boolean enableCRHistory) {
            this.putBodyParameter("EnableCRHistory", enableCRHistory);
            this.enableCRHistory = enableCRHistory;
            return this;
        }

        /**
         * EnableNamespacesByDefault.
         */
        public Builder enableNamespacesByDefault(Boolean enableNamespacesByDefault) {
            this.putBodyParameter("EnableNamespacesByDefault", enableNamespacesByDefault);
            this.enableNamespacesByDefault = enableNamespacesByDefault;
            return this;
        }

        /**
         * EnableSDSServer.
         */
        public Builder enableSDSServer(Boolean enableSDSServer) {
            this.putBodyParameter("EnableSDSServer", enableSDSServer);
            this.enableSDSServer = enableSDSServer;
            return this;
        }

        /**
         * ExcludeIPRanges.
         */
        public Builder excludeIPRanges(String excludeIPRanges) {
            this.putBodyParameter("ExcludeIPRanges", excludeIPRanges);
            this.excludeIPRanges = excludeIPRanges;
            return this;
        }

        /**
         * ExcludeInboundPorts.
         */
        public Builder excludeInboundPorts(String excludeInboundPorts) {
            this.putBodyParameter("ExcludeInboundPorts", excludeInboundPorts);
            this.excludeInboundPorts = excludeInboundPorts;
            return this;
        }

        /**
         * ExcludeOutboundPorts.
         */
        public Builder excludeOutboundPorts(String excludeOutboundPorts) {
            this.putBodyParameter("ExcludeOutboundPorts", excludeOutboundPorts);
            this.excludeOutboundPorts = excludeOutboundPorts;
            return this;
        }

        /**
         * FilterGatewayClusterConfig.
         */
        public Builder filterGatewayClusterConfig(Boolean filterGatewayClusterConfig) {
            this.putBodyParameter("FilterGatewayClusterConfig", filterGatewayClusterConfig);
            this.filterGatewayClusterConfig = filterGatewayClusterConfig;
            return this;
        }

        /**
         * GatewayAPIEnabled.
         */
        public Builder gatewayAPIEnabled(Boolean gatewayAPIEnabled) {
            this.putBodyParameter("GatewayAPIEnabled", gatewayAPIEnabled);
            this.gatewayAPIEnabled = gatewayAPIEnabled;
            return this;
        }

        /**
         * Http10Enabled.
         */
        public Builder http10Enabled(Boolean http10Enabled) {
            this.putBodyParameter("Http10Enabled", http10Enabled);
            this.http10Enabled = http10Enabled;
            return this;
        }

        /**
         * IncludeIPRanges.
         */
        public Builder includeIPRanges(String includeIPRanges) {
            this.putBodyParameter("IncludeIPRanges", includeIPRanges);
            this.includeIPRanges = includeIPRanges;
            return this;
        }

        /**
         * IncludeInboundPorts.
         */
        public Builder includeInboundPorts(String includeInboundPorts) {
            this.putBodyParameter("IncludeInboundPorts", includeInboundPorts);
            this.includeInboundPorts = includeInboundPorts;
            return this;
        }

        /**
         * KialiEnabled.
         */
        public Builder kialiEnabled(Boolean kialiEnabled) {
            this.putBodyParameter("KialiEnabled", kialiEnabled);
            this.kialiEnabled = kialiEnabled;
            return this;
        }

        /**
         * Lifecycle.
         */
        public Builder lifecycle(String lifecycle) {
            this.putBodyParameter("Lifecycle", lifecycle);
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * LocalityLBConf.
         */
        public Builder localityLBConf(String localityLBConf) {
            this.putBodyParameter("LocalityLBConf", localityLBConf);
            this.localityLBConf = localityLBConf;
            return this;
        }

        /**
         * LocalityLoadBalancing.
         */
        public Builder localityLoadBalancing(Boolean localityLoadBalancing) {
            this.putBodyParameter("LocalityLoadBalancing", localityLoadBalancing);
            this.localityLoadBalancing = localityLoadBalancing;
            return this;
        }

        /**
         * MSEEnabled.
         */
        public Builder MSEEnabled(Boolean MSEEnabled) {
            this.putBodyParameter("MSEEnabled", MSEEnabled);
            this.MSEEnabled = MSEEnabled;
            return this;
        }

        /**
         * MultiBufferEnabled.
         */
        public Builder multiBufferEnabled(Boolean multiBufferEnabled) {
            this.putBodyParameter("MultiBufferEnabled", multiBufferEnabled);
            this.multiBufferEnabled = multiBufferEnabled;
            return this;
        }

        /**
         * MultiBufferPollDelay.
         */
        public Builder multiBufferPollDelay(String multiBufferPollDelay) {
            this.putBodyParameter("MultiBufferPollDelay", multiBufferPollDelay);
            this.multiBufferPollDelay = multiBufferPollDelay;
            return this;
        }

        /**
         * MysqlFilterEnabled.
         */
        public Builder mysqlFilterEnabled(Boolean mysqlFilterEnabled) {
            this.putBodyParameter("MysqlFilterEnabled", mysqlFilterEnabled);
            this.mysqlFilterEnabled = mysqlFilterEnabled;
            return this;
        }

        /**
         * OPALimitCPU.
         */
        public Builder OPALimitCPU(String OPALimitCPU) {
            this.putBodyParameter("OPALimitCPU", OPALimitCPU);
            this.OPALimitCPU = OPALimitCPU;
            return this;
        }

        /**
         * OPALimitMemory.
         */
        public Builder OPALimitMemory(String OPALimitMemory) {
            this.putBodyParameter("OPALimitMemory", OPALimitMemory);
            this.OPALimitMemory = OPALimitMemory;
            return this;
        }

        /**
         * OPALogLevel.
         */
        public Builder OPALogLevel(String OPALogLevel) {
            this.putBodyParameter("OPALogLevel", OPALogLevel);
            this.OPALogLevel = OPALogLevel;
            return this;
        }

        /**
         * OPARequestCPU.
         */
        public Builder OPARequestCPU(String OPARequestCPU) {
            this.putBodyParameter("OPARequestCPU", OPARequestCPU);
            this.OPARequestCPU = OPARequestCPU;
            return this;
        }

        /**
         * OPARequestMemory.
         */
        public Builder OPARequestMemory(String OPARequestMemory) {
            this.putBodyParameter("OPARequestMemory", OPARequestMemory);
            this.OPARequestMemory = OPARequestMemory;
            return this;
        }

        /**
         * OpaEnabled.
         */
        public Builder opaEnabled(Boolean opaEnabled) {
            this.putBodyParameter("OpaEnabled", opaEnabled);
            this.opaEnabled = opaEnabled;
            return this;
        }

        /**
         * OpenAgentPolicy.
         */
        public Builder openAgentPolicy(Boolean openAgentPolicy) {
            this.putBodyParameter("OpenAgentPolicy", openAgentPolicy);
            this.openAgentPolicy = openAgentPolicy;
            return this;
        }

        /**
         * OutboundTrafficPolicy.
         */
        public Builder outboundTrafficPolicy(String outboundTrafficPolicy) {
            this.putBodyParameter("OutboundTrafficPolicy", outboundTrafficPolicy);
            this.outboundTrafficPolicy = outboundTrafficPolicy;
            return this;
        }

        /**
         * PrometheusUrl.
         */
        public Builder prometheusUrl(String prometheusUrl) {
            this.putBodyParameter("PrometheusUrl", prometheusUrl);
            this.prometheusUrl = prometheusUrl;
            return this;
        }

        /**
         * ProxyInitCPUResourceLimit.
         */
        public Builder proxyInitCPUResourceLimit(String proxyInitCPUResourceLimit) {
            this.putBodyParameter("ProxyInitCPUResourceLimit", proxyInitCPUResourceLimit);
            this.proxyInitCPUResourceLimit = proxyInitCPUResourceLimit;
            return this;
        }

        /**
         * ProxyInitCPUResourceRequest.
         */
        public Builder proxyInitCPUResourceRequest(String proxyInitCPUResourceRequest) {
            this.putBodyParameter("ProxyInitCPUResourceRequest", proxyInitCPUResourceRequest);
            this.proxyInitCPUResourceRequest = proxyInitCPUResourceRequest;
            return this;
        }

        /**
         * ProxyInitMemoryResourceLimit.
         */
        public Builder proxyInitMemoryResourceLimit(String proxyInitMemoryResourceLimit) {
            this.putBodyParameter("ProxyInitMemoryResourceLimit", proxyInitMemoryResourceLimit);
            this.proxyInitMemoryResourceLimit = proxyInitMemoryResourceLimit;
            return this;
        }

        /**
         * ProxyInitMemoryResourceRequest.
         */
        public Builder proxyInitMemoryResourceRequest(String proxyInitMemoryResourceRequest) {
            this.putBodyParameter("ProxyInitMemoryResourceRequest", proxyInitMemoryResourceRequest);
            this.proxyInitMemoryResourceRequest = proxyInitMemoryResourceRequest;
            return this;
        }

        /**
         * ProxyLimitCPU.
         */
        public Builder proxyLimitCPU(String proxyLimitCPU) {
            this.putBodyParameter("ProxyLimitCPU", proxyLimitCPU);
            this.proxyLimitCPU = proxyLimitCPU;
            return this;
        }

        /**
         * ProxyLimitMemory.
         */
        public Builder proxyLimitMemory(String proxyLimitMemory) {
            this.putBodyParameter("ProxyLimitMemory", proxyLimitMemory);
            this.proxyLimitMemory = proxyLimitMemory;
            return this;
        }

        /**
         * ProxyRequestCPU.
         */
        public Builder proxyRequestCPU(String proxyRequestCPU) {
            this.putBodyParameter("ProxyRequestCPU", proxyRequestCPU);
            this.proxyRequestCPU = proxyRequestCPU;
            return this;
        }

        /**
         * ProxyRequestMemory.
         */
        public Builder proxyRequestMemory(String proxyRequestMemory) {
            this.putBodyParameter("ProxyRequestMemory", proxyRequestMemory);
            this.proxyRequestMemory = proxyRequestMemory;
            return this;
        }

        /**
         * RedisFilterEnabled.
         */
        public Builder redisFilterEnabled(Boolean redisFilterEnabled) {
            this.putBodyParameter("RedisFilterEnabled", redisFilterEnabled);
            this.redisFilterEnabled = redisFilterEnabled;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * SidecarInjectorLimitCPU.
         */
        public Builder sidecarInjectorLimitCPU(String sidecarInjectorLimitCPU) {
            this.putBodyParameter("SidecarInjectorLimitCPU", sidecarInjectorLimitCPU);
            this.sidecarInjectorLimitCPU = sidecarInjectorLimitCPU;
            return this;
        }

        /**
         * SidecarInjectorLimitMemory.
         */
        public Builder sidecarInjectorLimitMemory(String sidecarInjectorLimitMemory) {
            this.putBodyParameter("SidecarInjectorLimitMemory", sidecarInjectorLimitMemory);
            this.sidecarInjectorLimitMemory = sidecarInjectorLimitMemory;
            return this;
        }

        /**
         * SidecarInjectorRequestCPU.
         */
        public Builder sidecarInjectorRequestCPU(String sidecarInjectorRequestCPU) {
            this.putBodyParameter("SidecarInjectorRequestCPU", sidecarInjectorRequestCPU);
            this.sidecarInjectorRequestCPU = sidecarInjectorRequestCPU;
            return this;
        }

        /**
         * SidecarInjectorRequestMemory.
         */
        public Builder sidecarInjectorRequestMemory(String sidecarInjectorRequestMemory) {
            this.putBodyParameter("SidecarInjectorRequestMemory", sidecarInjectorRequestMemory);
            this.sidecarInjectorRequestMemory = sidecarInjectorRequestMemory;
            return this;
        }

        /**
         * SidecarInjectorWebhookAsYaml.
         */
        public Builder sidecarInjectorWebhookAsYaml(String sidecarInjectorWebhookAsYaml) {
            this.putBodyParameter("SidecarInjectorWebhookAsYaml", sidecarInjectorWebhookAsYaml);
            this.sidecarInjectorWebhookAsYaml = sidecarInjectorWebhookAsYaml;
            return this;
        }

        /**
         * Telemetry.
         */
        public Builder telemetry(Boolean telemetry) {
            this.putBodyParameter("Telemetry", telemetry);
            this.telemetry = telemetry;
            return this;
        }

        /**
         * TerminationDrainDuration.
         */
        public Builder terminationDrainDuration(String terminationDrainDuration) {
            this.putBodyParameter("TerminationDrainDuration", terminationDrainDuration);
            this.terminationDrainDuration = terminationDrainDuration;
            return this;
        }

        /**
         * ThriftFilterEnabled.
         */
        public Builder thriftFilterEnabled(Boolean thriftFilterEnabled) {
            this.putBodyParameter("ThriftFilterEnabled", thriftFilterEnabled);
            this.thriftFilterEnabled = thriftFilterEnabled;
            return this;
        }

        /**
         * TraceSampling.
         */
        public Builder traceSampling(Float traceSampling) {
            this.putBodyParameter("TraceSampling", traceSampling);
            this.traceSampling = traceSampling;
            return this;
        }

        /**
         * Tracing.
         */
        public Builder tracing(Boolean tracing) {
            this.putBodyParameter("Tracing", tracing);
            this.tracing = tracing;
            return this;
        }

        /**
         * WebAssemblyFilterEnabled.
         */
        public Builder webAssemblyFilterEnabled(Boolean webAssemblyFilterEnabled) {
            this.putBodyParameter("WebAssemblyFilterEnabled", webAssemblyFilterEnabled);
            this.webAssemblyFilterEnabled = webAssemblyFilterEnabled;
            return this;
        }

        @Override
        public UpdateMeshFeatureRequest build() {
            return new UpdateMeshFeatureRequest(this);
        } 

    } 

}
