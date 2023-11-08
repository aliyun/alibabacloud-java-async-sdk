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

    @Query
    @NameInMap("AccessLogGatewayEnabled")
    private Boolean accessLogGatewayEnabled;

    @Body
    @NameInMap("AccessLogGatewayLifecycle")
    private Integer accessLogGatewayLifecycle;

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

    @Query
    @NameInMap("AccessLogSidecarEnabled")
    private Boolean accessLogSidecarEnabled;

    @Body
    @NameInMap("AccessLogSidecarLifecycle")
    private Integer accessLogSidecarLifecycle;

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
    @NameInMap("ClusterSpec")
    private String clusterSpec;

    @Body
    @NameInMap("CniEnabled")
    private Boolean cniEnabled;

    @Body
    @NameInMap("CniExcludeNamespaces")
    private String cniExcludeNamespaces;

    @Body
    @NameInMap("Concurrency")
    private Integer concurrency;

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
    @NameInMap("DefaultComponentsScheduleConfig")
    private String defaultComponentsScheduleConfig;

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
    @NameInMap("EnableAutoDiagnosis")
    private Boolean enableAutoDiagnosis;

    @Body
    @NameInMap("EnableBootstrapXdsAgent")
    private Boolean enableBootstrapXdsAgent;

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
    @NameInMap("HoldApplicationUntilProxyStarts")
    private Boolean holdApplicationUntilProxyStarts;

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
    @NameInMap("IncludeOutboundPorts")
    private String includeOutboundPorts;

    @Body
    @NameInMap("IntegrateKiali")
    private Boolean integrateKiali;

    @Body
    @NameInMap("InterceptionMode")
    private String interceptionMode;

    @Body
    @NameInMap("KialiArmsAuthTokens")
    private String kialiArmsAuthTokens;

    @Body
    @NameInMap("KialiEnabled")
    private Boolean kialiEnabled;

    @Body
    @NameInMap("KialiServiceAnnotations")
    private String kialiServiceAnnotations;

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
    @NameInMap("LogLevel")
    private String logLevel;

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
    @NameInMap("NFDEnabled")
    private Boolean NFDEnabled;

    @Body
    @NameInMap("NFDLabelPruned")
    private Boolean NFDLabelPruned;

    @Body
    @NameInMap("OPAInjectorCPULimit")
    private String OPAInjectorCPULimit;

    @Body
    @NameInMap("OPAInjectorCPURequirement")
    private String OPAInjectorCPURequirement;

    @Body
    @NameInMap("OPAInjectorMemoryLimit")
    private String OPAInjectorMemoryLimit;

    @Body
    @NameInMap("OPAInjectorMemoryRequirement")
    private String OPAInjectorMemoryRequirement;

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
    @NameInMap("OPAScopeInjected")
    private Boolean OPAScopeInjected;

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
    @NameInMap("ProxyStatsMatcher")
    private String proxyStatsMatcher;

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
    @NameInMap("TraceCustomTags")
    private String traceCustomTags;

    @Body
    @NameInMap("TraceMaxPathTagLength")
    private String traceMaxPathTagLength;

    @Body
    @NameInMap("TraceSampling")
    private Float traceSampling;

    @Body
    @NameInMap("Tracing")
    private Boolean tracing;

    @Body
    @NameInMap("TracingOnExtZipkinLimitCPU")
    private String tracingOnExtZipkinLimitCPU;

    @Body
    @NameInMap("TracingOnExtZipkinLimitMemory")
    private String tracingOnExtZipkinLimitMemory;

    @Body
    @NameInMap("TracingOnExtZipkinRequestCPU")
    private String tracingOnExtZipkinRequestCPU;

    @Body
    @NameInMap("TracingOnExtZipkinRequestMemory")
    private String tracingOnExtZipkinRequestMemory;

    @Body
    @NameInMap("WebAssemblyFilterEnabled")
    private Boolean webAssemblyFilterEnabled;

    private UpdateMeshFeatureRequest(Builder builder) {
        super(builder);
        this.accessLogEnabled = builder.accessLogEnabled;
        this.accessLogFile = builder.accessLogFile;
        this.accessLogFormat = builder.accessLogFormat;
        this.accessLogGatewayEnabled = builder.accessLogGatewayEnabled;
        this.accessLogGatewayLifecycle = builder.accessLogGatewayLifecycle;
        this.accessLogProject = builder.accessLogProject;
        this.accessLogServiceEnabled = builder.accessLogServiceEnabled;
        this.accessLogServiceHost = builder.accessLogServiceHost;
        this.accessLogServicePort = builder.accessLogServicePort;
        this.accessLogSidecarEnabled = builder.accessLogSidecarEnabled;
        this.accessLogSidecarLifecycle = builder.accessLogSidecarLifecycle;
        this.auditProject = builder.auditProject;
        this.autoInjectionPolicyEnabled = builder.autoInjectionPolicyEnabled;
        this.CRAggregationEnabled = builder.CRAggregationEnabled;
        this.clusterSpec = builder.clusterSpec;
        this.cniEnabled = builder.cniEnabled;
        this.cniExcludeNamespaces = builder.cniExcludeNamespaces;
        this.concurrency = builder.concurrency;
        this.configSourceEnabled = builder.configSourceEnabled;
        this.configSourceNacosID = builder.configSourceNacosID;
        this.customizedPrometheus = builder.customizedPrometheus;
        this.customizedZipkin = builder.customizedZipkin;
        this.DNSProxyingEnabled = builder.DNSProxyingEnabled;
        this.defaultComponentsScheduleConfig = builder.defaultComponentsScheduleConfig;
        this.discoverySelectors = builder.discoverySelectors;
        this.dubboFilterEnabled = builder.dubboFilterEnabled;
        this.enableAudit = builder.enableAudit;
        this.enableAutoDiagnosis = builder.enableAutoDiagnosis;
        this.enableBootstrapXdsAgent = builder.enableBootstrapXdsAgent;
        this.enableCRHistory = builder.enableCRHistory;
        this.enableNamespacesByDefault = builder.enableNamespacesByDefault;
        this.enableSDSServer = builder.enableSDSServer;
        this.excludeIPRanges = builder.excludeIPRanges;
        this.excludeInboundPorts = builder.excludeInboundPorts;
        this.excludeOutboundPorts = builder.excludeOutboundPorts;
        this.filterGatewayClusterConfig = builder.filterGatewayClusterConfig;
        this.gatewayAPIEnabled = builder.gatewayAPIEnabled;
        this.holdApplicationUntilProxyStarts = builder.holdApplicationUntilProxyStarts;
        this.http10Enabled = builder.http10Enabled;
        this.includeIPRanges = builder.includeIPRanges;
        this.includeInboundPorts = builder.includeInboundPorts;
        this.includeOutboundPorts = builder.includeOutboundPorts;
        this.integrateKiali = builder.integrateKiali;
        this.interceptionMode = builder.interceptionMode;
        this.kialiArmsAuthTokens = builder.kialiArmsAuthTokens;
        this.kialiEnabled = builder.kialiEnabled;
        this.kialiServiceAnnotations = builder.kialiServiceAnnotations;
        this.lifecycle = builder.lifecycle;
        this.localityLBConf = builder.localityLBConf;
        this.localityLoadBalancing = builder.localityLoadBalancing;
        this.logLevel = builder.logLevel;
        this.MSEEnabled = builder.MSEEnabled;
        this.multiBufferEnabled = builder.multiBufferEnabled;
        this.multiBufferPollDelay = builder.multiBufferPollDelay;
        this.mysqlFilterEnabled = builder.mysqlFilterEnabled;
        this.NFDEnabled = builder.NFDEnabled;
        this.NFDLabelPruned = builder.NFDLabelPruned;
        this.OPAInjectorCPULimit = builder.OPAInjectorCPULimit;
        this.OPAInjectorCPURequirement = builder.OPAInjectorCPURequirement;
        this.OPAInjectorMemoryLimit = builder.OPAInjectorMemoryLimit;
        this.OPAInjectorMemoryRequirement = builder.OPAInjectorMemoryRequirement;
        this.OPALimitCPU = builder.OPALimitCPU;
        this.OPALimitMemory = builder.OPALimitMemory;
        this.OPALogLevel = builder.OPALogLevel;
        this.OPARequestCPU = builder.OPARequestCPU;
        this.OPARequestMemory = builder.OPARequestMemory;
        this.OPAScopeInjected = builder.OPAScopeInjected;
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
        this.proxyStatsMatcher = builder.proxyStatsMatcher;
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
        this.traceCustomTags = builder.traceCustomTags;
        this.traceMaxPathTagLength = builder.traceMaxPathTagLength;
        this.traceSampling = builder.traceSampling;
        this.tracing = builder.tracing;
        this.tracingOnExtZipkinLimitCPU = builder.tracingOnExtZipkinLimitCPU;
        this.tracingOnExtZipkinLimitMemory = builder.tracingOnExtZipkinLimitMemory;
        this.tracingOnExtZipkinRequestCPU = builder.tracingOnExtZipkinRequestCPU;
        this.tracingOnExtZipkinRequestMemory = builder.tracingOnExtZipkinRequestMemory;
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
     * @return accessLogGatewayEnabled
     */
    public Boolean getAccessLogGatewayEnabled() {
        return this.accessLogGatewayEnabled;
    }

    /**
     * @return accessLogGatewayLifecycle
     */
    public Integer getAccessLogGatewayLifecycle() {
        return this.accessLogGatewayLifecycle;
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
     * @return accessLogSidecarEnabled
     */
    public Boolean getAccessLogSidecarEnabled() {
        return this.accessLogSidecarEnabled;
    }

    /**
     * @return accessLogSidecarLifecycle
     */
    public Integer getAccessLogSidecarLifecycle() {
        return this.accessLogSidecarLifecycle;
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
     * @return clusterSpec
     */
    public String getClusterSpec() {
        return this.clusterSpec;
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
     * @return concurrency
     */
    public Integer getConcurrency() {
        return this.concurrency;
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
     * @return defaultComponentsScheduleConfig
     */
    public String getDefaultComponentsScheduleConfig() {
        return this.defaultComponentsScheduleConfig;
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
     * @return enableAutoDiagnosis
     */
    public Boolean getEnableAutoDiagnosis() {
        return this.enableAutoDiagnosis;
    }

    /**
     * @return enableBootstrapXdsAgent
     */
    public Boolean getEnableBootstrapXdsAgent() {
        return this.enableBootstrapXdsAgent;
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
     * @return holdApplicationUntilProxyStarts
     */
    public Boolean getHoldApplicationUntilProxyStarts() {
        return this.holdApplicationUntilProxyStarts;
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
     * @return includeOutboundPorts
     */
    public String getIncludeOutboundPorts() {
        return this.includeOutboundPorts;
    }

    /**
     * @return integrateKiali
     */
    public Boolean getIntegrateKiali() {
        return this.integrateKiali;
    }

    /**
     * @return interceptionMode
     */
    public String getInterceptionMode() {
        return this.interceptionMode;
    }

    /**
     * @return kialiArmsAuthTokens
     */
    public String getKialiArmsAuthTokens() {
        return this.kialiArmsAuthTokens;
    }

    /**
     * @return kialiEnabled
     */
    public Boolean getKialiEnabled() {
        return this.kialiEnabled;
    }

    /**
     * @return kialiServiceAnnotations
     */
    public String getKialiServiceAnnotations() {
        return this.kialiServiceAnnotations;
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
     * @return logLevel
     */
    public String getLogLevel() {
        return this.logLevel;
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
     * @return NFDEnabled
     */
    public Boolean getNFDEnabled() {
        return this.NFDEnabled;
    }

    /**
     * @return NFDLabelPruned
     */
    public Boolean getNFDLabelPruned() {
        return this.NFDLabelPruned;
    }

    /**
     * @return OPAInjectorCPULimit
     */
    public String getOPAInjectorCPULimit() {
        return this.OPAInjectorCPULimit;
    }

    /**
     * @return OPAInjectorCPURequirement
     */
    public String getOPAInjectorCPURequirement() {
        return this.OPAInjectorCPURequirement;
    }

    /**
     * @return OPAInjectorMemoryLimit
     */
    public String getOPAInjectorMemoryLimit() {
        return this.OPAInjectorMemoryLimit;
    }

    /**
     * @return OPAInjectorMemoryRequirement
     */
    public String getOPAInjectorMemoryRequirement() {
        return this.OPAInjectorMemoryRequirement;
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
     * @return OPAScopeInjected
     */
    public Boolean getOPAScopeInjected() {
        return this.OPAScopeInjected;
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
     * @return proxyStatsMatcher
     */
    public String getProxyStatsMatcher() {
        return this.proxyStatsMatcher;
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
     * @return traceCustomTags
     */
    public String getTraceCustomTags() {
        return this.traceCustomTags;
    }

    /**
     * @return traceMaxPathTagLength
     */
    public String getTraceMaxPathTagLength() {
        return this.traceMaxPathTagLength;
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
     * @return tracingOnExtZipkinLimitCPU
     */
    public String getTracingOnExtZipkinLimitCPU() {
        return this.tracingOnExtZipkinLimitCPU;
    }

    /**
     * @return tracingOnExtZipkinLimitMemory
     */
    public String getTracingOnExtZipkinLimitMemory() {
        return this.tracingOnExtZipkinLimitMemory;
    }

    /**
     * @return tracingOnExtZipkinRequestCPU
     */
    public String getTracingOnExtZipkinRequestCPU() {
        return this.tracingOnExtZipkinRequestCPU;
    }

    /**
     * @return tracingOnExtZipkinRequestMemory
     */
    public String getTracingOnExtZipkinRequestMemory() {
        return this.tracingOnExtZipkinRequestMemory;
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
        private Boolean accessLogGatewayEnabled; 
        private Integer accessLogGatewayLifecycle; 
        private String accessLogProject; 
        private Boolean accessLogServiceEnabled; 
        private String accessLogServiceHost; 
        private Integer accessLogServicePort; 
        private Boolean accessLogSidecarEnabled; 
        private Integer accessLogSidecarLifecycle; 
        private String auditProject; 
        private Boolean autoInjectionPolicyEnabled; 
        private Boolean CRAggregationEnabled; 
        private String clusterSpec; 
        private Boolean cniEnabled; 
        private String cniExcludeNamespaces; 
        private Integer concurrency; 
        private Boolean configSourceEnabled; 
        private String configSourceNacosID; 
        private Boolean customizedPrometheus; 
        private Boolean customizedZipkin; 
        private Boolean DNSProxyingEnabled; 
        private String defaultComponentsScheduleConfig; 
        private String discoverySelectors; 
        private Boolean dubboFilterEnabled; 
        private Boolean enableAudit; 
        private Boolean enableAutoDiagnosis; 
        private Boolean enableBootstrapXdsAgent; 
        private Boolean enableCRHistory; 
        private Boolean enableNamespacesByDefault; 
        private Boolean enableSDSServer; 
        private String excludeIPRanges; 
        private String excludeInboundPorts; 
        private String excludeOutboundPorts; 
        private Boolean filterGatewayClusterConfig; 
        private Boolean gatewayAPIEnabled; 
        private Boolean holdApplicationUntilProxyStarts; 
        private Boolean http10Enabled; 
        private String includeIPRanges; 
        private String includeInboundPorts; 
        private String includeOutboundPorts; 
        private Boolean integrateKiali; 
        private String interceptionMode; 
        private String kialiArmsAuthTokens; 
        private Boolean kialiEnabled; 
        private String kialiServiceAnnotations; 
        private String lifecycle; 
        private String localityLBConf; 
        private Boolean localityLoadBalancing; 
        private String logLevel; 
        private Boolean MSEEnabled; 
        private Boolean multiBufferEnabled; 
        private String multiBufferPollDelay; 
        private Boolean mysqlFilterEnabled; 
        private Boolean NFDEnabled; 
        private Boolean NFDLabelPruned; 
        private String OPAInjectorCPULimit; 
        private String OPAInjectorCPURequirement; 
        private String OPAInjectorMemoryLimit; 
        private String OPAInjectorMemoryRequirement; 
        private String OPALimitCPU; 
        private String OPALimitMemory; 
        private String OPALogLevel; 
        private String OPARequestCPU; 
        private String OPARequestMemory; 
        private Boolean OPAScopeInjected; 
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
        private String proxyStatsMatcher; 
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
        private String traceCustomTags; 
        private String traceMaxPathTagLength; 
        private Float traceSampling; 
        private Boolean tracing; 
        private String tracingOnExtZipkinLimitCPU; 
        private String tracingOnExtZipkinLimitMemory; 
        private String tracingOnExtZipkinRequestCPU; 
        private String tracingOnExtZipkinRequestMemory; 
        private Boolean webAssemblyFilterEnabled; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMeshFeatureRequest request) {
            super(request);
            this.accessLogEnabled = request.accessLogEnabled;
            this.accessLogFile = request.accessLogFile;
            this.accessLogFormat = request.accessLogFormat;
            this.accessLogGatewayEnabled = request.accessLogGatewayEnabled;
            this.accessLogGatewayLifecycle = request.accessLogGatewayLifecycle;
            this.accessLogProject = request.accessLogProject;
            this.accessLogServiceEnabled = request.accessLogServiceEnabled;
            this.accessLogServiceHost = request.accessLogServiceHost;
            this.accessLogServicePort = request.accessLogServicePort;
            this.accessLogSidecarEnabled = request.accessLogSidecarEnabled;
            this.accessLogSidecarLifecycle = request.accessLogSidecarLifecycle;
            this.auditProject = request.auditProject;
            this.autoInjectionPolicyEnabled = request.autoInjectionPolicyEnabled;
            this.CRAggregationEnabled = request.CRAggregationEnabled;
            this.clusterSpec = request.clusterSpec;
            this.cniEnabled = request.cniEnabled;
            this.cniExcludeNamespaces = request.cniExcludeNamespaces;
            this.concurrency = request.concurrency;
            this.configSourceEnabled = request.configSourceEnabled;
            this.configSourceNacosID = request.configSourceNacosID;
            this.customizedPrometheus = request.customizedPrometheus;
            this.customizedZipkin = request.customizedZipkin;
            this.DNSProxyingEnabled = request.DNSProxyingEnabled;
            this.defaultComponentsScheduleConfig = request.defaultComponentsScheduleConfig;
            this.discoverySelectors = request.discoverySelectors;
            this.dubboFilterEnabled = request.dubboFilterEnabled;
            this.enableAudit = request.enableAudit;
            this.enableAutoDiagnosis = request.enableAutoDiagnosis;
            this.enableBootstrapXdsAgent = request.enableBootstrapXdsAgent;
            this.enableCRHistory = request.enableCRHistory;
            this.enableNamespacesByDefault = request.enableNamespacesByDefault;
            this.enableSDSServer = request.enableSDSServer;
            this.excludeIPRanges = request.excludeIPRanges;
            this.excludeInboundPorts = request.excludeInboundPorts;
            this.excludeOutboundPorts = request.excludeOutboundPorts;
            this.filterGatewayClusterConfig = request.filterGatewayClusterConfig;
            this.gatewayAPIEnabled = request.gatewayAPIEnabled;
            this.holdApplicationUntilProxyStarts = request.holdApplicationUntilProxyStarts;
            this.http10Enabled = request.http10Enabled;
            this.includeIPRanges = request.includeIPRanges;
            this.includeInboundPorts = request.includeInboundPorts;
            this.includeOutboundPorts = request.includeOutboundPorts;
            this.integrateKiali = request.integrateKiali;
            this.interceptionMode = request.interceptionMode;
            this.kialiArmsAuthTokens = request.kialiArmsAuthTokens;
            this.kialiEnabled = request.kialiEnabled;
            this.kialiServiceAnnotations = request.kialiServiceAnnotations;
            this.lifecycle = request.lifecycle;
            this.localityLBConf = request.localityLBConf;
            this.localityLoadBalancing = request.localityLoadBalancing;
            this.logLevel = request.logLevel;
            this.MSEEnabled = request.MSEEnabled;
            this.multiBufferEnabled = request.multiBufferEnabled;
            this.multiBufferPollDelay = request.multiBufferPollDelay;
            this.mysqlFilterEnabled = request.mysqlFilterEnabled;
            this.NFDEnabled = request.NFDEnabled;
            this.NFDLabelPruned = request.NFDLabelPruned;
            this.OPAInjectorCPULimit = request.OPAInjectorCPULimit;
            this.OPAInjectorCPURequirement = request.OPAInjectorCPURequirement;
            this.OPAInjectorMemoryLimit = request.OPAInjectorMemoryLimit;
            this.OPAInjectorMemoryRequirement = request.OPAInjectorMemoryRequirement;
            this.OPALimitCPU = request.OPALimitCPU;
            this.OPALimitMemory = request.OPALimitMemory;
            this.OPALogLevel = request.OPALogLevel;
            this.OPARequestCPU = request.OPARequestCPU;
            this.OPARequestMemory = request.OPARequestMemory;
            this.OPAScopeInjected = request.OPAScopeInjected;
            this.opaEnabled = request.opaEnabled;
            this.openAgentPolicy = request.openAgentPolicy;
            this.outboundTrafficPolicy = request.outboundTrafficPolicy;
            this.prometheusUrl = request.prometheusUrl;
            this.proxyInitCPUResourceLimit = request.proxyInitCPUResourceLimit;
            this.proxyInitCPUResourceRequest = request.proxyInitCPUResourceRequest;
            this.proxyInitMemoryResourceLimit = request.proxyInitMemoryResourceLimit;
            this.proxyInitMemoryResourceRequest = request.proxyInitMemoryResourceRequest;
            this.proxyLimitCPU = request.proxyLimitCPU;
            this.proxyLimitMemory = request.proxyLimitMemory;
            this.proxyRequestCPU = request.proxyRequestCPU;
            this.proxyRequestMemory = request.proxyRequestMemory;
            this.proxyStatsMatcher = request.proxyStatsMatcher;
            this.redisFilterEnabled = request.redisFilterEnabled;
            this.serviceMeshId = request.serviceMeshId;
            this.sidecarInjectorLimitCPU = request.sidecarInjectorLimitCPU;
            this.sidecarInjectorLimitMemory = request.sidecarInjectorLimitMemory;
            this.sidecarInjectorRequestCPU = request.sidecarInjectorRequestCPU;
            this.sidecarInjectorRequestMemory = request.sidecarInjectorRequestMemory;
            this.sidecarInjectorWebhookAsYaml = request.sidecarInjectorWebhookAsYaml;
            this.telemetry = request.telemetry;
            this.terminationDrainDuration = request.terminationDrainDuration;
            this.thriftFilterEnabled = request.thriftFilterEnabled;
            this.traceCustomTags = request.traceCustomTags;
            this.traceMaxPathTagLength = request.traceMaxPathTagLength;
            this.traceSampling = request.traceSampling;
            this.tracing = request.tracing;
            this.tracingOnExtZipkinLimitCPU = request.tracingOnExtZipkinLimitCPU;
            this.tracingOnExtZipkinLimitMemory = request.tracingOnExtZipkinLimitMemory;
            this.tracingOnExtZipkinRequestCPU = request.tracingOnExtZipkinRequestCPU;
            this.tracingOnExtZipkinRequestMemory = request.tracingOnExtZipkinRequestMemory;
            this.webAssemblyFilterEnabled = request.webAssemblyFilterEnabled;
        } 

        /**
         * Specifies whether to enable access log collection. Valid values:
         * <p>
         * 
         * *   `true`: enables access log collection.
         * *   `false`: disables access log collection.
         * 
         * Default value: `false`.
         */
        public Builder accessLogEnabled(Boolean accessLogEnabled) {
            this.putBodyParameter("AccessLogEnabled", accessLogEnabled);
            this.accessLogEnabled = accessLogEnabled;
            return this;
        }

        /**
         * Specifies whether to enable access logging. Valid values:
         * <p>
         * 
         * *   `""`: disables access logging.
         * *   `/dev/stdout`: enables access logging. Access logs are written to /dev/stdout.
         */
        public Builder accessLogFile(String accessLogFile) {
            this.putBodyParameter("AccessLogFile", accessLogFile);
            this.accessLogFile = accessLogFile;
            return this;
        }

        /**
         * The custom format of access logs. To set this parameter, make sure that you have enabled access log collection. The value must be a JSON string. The following key names must be contained: authority_for, bytes_received, bytes_sent, downstream_local_address, downstream_remote_address, duration, istio_policy_status, method, path, protocol, requested_server_name, response_code, response_flags, route_name, start_time, trace_id, upstream_cluster, upstream_host, upstream_local_address, upstream_service_time, upstream_transport_failure_reason, user_agent, and x_forwarded_for.
         */
        public Builder accessLogFormat(String accessLogFormat) {
            this.putBodyParameter("AccessLogFormat", accessLogFormat);
            this.accessLogFormat = accessLogFormat;
            return this;
        }

        /**
         * AccessLogGatewayEnabled.
         */
        public Builder accessLogGatewayEnabled(Boolean accessLogGatewayEnabled) {
            this.putQueryParameter("AccessLogGatewayEnabled", accessLogGatewayEnabled);
            this.accessLogGatewayEnabled = accessLogGatewayEnabled;
            return this;
        }

        /**
         * The retention period for the access logs of the sidecar proxy. Unit: day. The logs are collected by using Log Service. For example, `30` indicates 30 days.
         */
        public Builder accessLogGatewayLifecycle(Integer accessLogGatewayLifecycle) {
            this.putBodyParameter("AccessLogGatewayLifecycle", accessLogGatewayLifecycle);
            this.accessLogGatewayLifecycle = accessLogGatewayLifecycle;
            return this;
        }

        /**
         * The custom project on which the Log Service collects logs.
         */
        public Builder accessLogProject(String accessLogProject) {
            this.putBodyParameter("AccessLogProject", accessLogProject);
            this.accessLogProject = accessLogProject;
            return this;
        }

        /**
         * Specifies whether to enable gRPC Access Log Service (ALS) for Envoy. Valid values:
         * <p>
         * 
         * *   `true`: enables gRPC ALS for Envoy.
         * *   `false`: disables gRPC ALS for Envoy.
         * 
         * Default value: `false`.
         */
        public Builder accessLogServiceEnabled(Boolean accessLogServiceEnabled) {
            this.putBodyParameter("AccessLogServiceEnabled", accessLogServiceEnabled);
            this.accessLogServiceEnabled = accessLogServiceEnabled;
            return this;
        }

        /**
         * The endpoint of gRPC ALS for Envoy.
         */
        public Builder accessLogServiceHost(String accessLogServiceHost) {
            this.putBodyParameter("AccessLogServiceHost", accessLogServiceHost);
            this.accessLogServiceHost = accessLogServiceHost;
            return this;
        }

        /**
         * The port of gRPC ALS for Envoy.
         */
        public Builder accessLogServicePort(Integer accessLogServicePort) {
            this.putBodyParameter("AccessLogServicePort", accessLogServicePort);
            this.accessLogServicePort = accessLogServicePort;
            return this;
        }

        /**
         * AccessLogSidecarEnabled.
         */
        public Builder accessLogSidecarEnabled(Boolean accessLogSidecarEnabled) {
            this.putQueryParameter("AccessLogSidecarEnabled", accessLogSidecarEnabled);
            this.accessLogSidecarEnabled = accessLogSidecarEnabled;
            return this;
        }

        /**
         * Specifies whether to enable automatic diagnostics for the ASM instance. If you enable this feature, the ASM instance is automatically diagnosed when you modify Istio resources in the ASM instance.
         */
        public Builder accessLogSidecarLifecycle(Integer accessLogSidecarLifecycle) {
            this.putBodyParameter("AccessLogSidecarLifecycle", accessLogSidecarLifecycle);
            this.accessLogSidecarLifecycle = accessLogSidecarLifecycle;
            return this;
        }

        /**
         * The name of the Log Service project that is used for mesh audit.
         * <p>
         * 
         * Default value: `mesh-log-{ASM instance ID}`.
         */
        public Builder auditProject(String auditProject) {
            this.putBodyParameter("AuditProject", auditProject);
            this.auditProject = auditProject;
            return this;
        }

        /**
         * Specifies whether to enable automatic sidecar proxy injection by using pod annotations. Valid values:
         * <p>
         * 
         * *   `true`: enables automatic sidecar proxy injection by using pod annotations.
         * *   `false`: disables automatic sidecar proxy injection by using pod annotations.
         * 
         * Default value: `false`.
         */
        public Builder autoInjectionPolicyEnabled(Boolean autoInjectionPolicyEnabled) {
            this.putBodyParameter("AutoInjectionPolicyEnabled", autoInjectionPolicyEnabled);
            this.autoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
            return this;
        }

        /**
         * Specifies whether to use the Kubernetes API of clusters on the data plane to access Istio resources. To use this feature, the version of the ASM instance must be V1.9.7.93 or later.
         */
        public Builder CRAggregationEnabled(Boolean CRAggregationEnabled) {
            this.putBodyParameter("CRAggregationEnabled", CRAggregationEnabled);
            this.CRAggregationEnabled = CRAggregationEnabled;
            return this;
        }

        /**
         * Specifies whether to enable the feature of controlling the OPA injection scope. Valid values:
         * <p>
         * 
         * *   `true`: enables the feature.
         * *   `false`: disables the feature.
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putBodyParameter("ClusterSpec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * Specifies whether to enable the Container Network Interface (CNI) plug-in. Valid values:
         * <p>
         * 
         * *   `true`: enables the CNI plug-in.
         * *   `false`: disables the CNI plug-in.
         * 
         * Default value: `false`.
         */
        public Builder cniEnabled(Boolean cniEnabled) {
            this.putBodyParameter("CniEnabled", cniEnabled);
            this.cniEnabled = cniEnabled;
            return this;
        }

        /**
         * The namespaces to be excluded for the CNI plug-in.
         */
        public Builder cniExcludeNamespaces(String cniExcludeNamespaces) {
            this.putBodyParameter("CniExcludeNamespaces", cniExcludeNamespaces);
            this.cniExcludeNamespaces = cniExcludeNamespaces;
            return this;
        }

        /**
         * Specifies whether to delay application container startup until the sidecar proxy container is started in a pod.
         */
        public Builder concurrency(Integer concurrency) {
            this.putBodyParameter("Concurrency", concurrency);
            this.concurrency = concurrency;
            return this;
        }

        /**
         * Specifies whether to enable the external service registry. Valid values:
         * <p>
         * 
         * *   `true`: enables the external service registry.
         * *   `false`: disables the external service registry.
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
         * Specifies whether to use a custom Prometheus instance. Valid values:
         * <p>
         * 
         * *   `true`: uses a custom Prometheus instance.
         * *   `false`: does not use a custom Prometheus instance.
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
         * *   `true`: uses a self-managed Zipkin system.
         * *   `false`: does not use a self-managed Zipkin system.
         * 
         * Default value: `false`.
         */
        public Builder customizedZipkin(Boolean customizedZipkin) {
            this.putBodyParameter("CustomizedZipkin", customizedZipkin);
            this.customizedZipkin = customizedZipkin;
            return this;
        }

        /**
         * Specifies whether to enable DNS proxy. Valid values:
         * <p>
         * 
         * *   `true`: enables the DNS proxy feature.
         * *   `false`: disables the DNS proxy feature.
         * 
         * Default value: `false`.
         */
        public Builder DNSProxyingEnabled(Boolean DNSProxyingEnabled) {
            this.putBodyParameter("DNSProxyingEnabled", DNSProxyingEnabled);
            this.DNSProxyingEnabled = DNSProxyingEnabled;
            return this;
        }

        /**
         * Specifies the default scheduling configurations that ASM delivers to components on the data plane. You can configure `nodeSelector` and `tolerations` in the JSON format.
         * <p>
         * 
         * > 
         * 
         * *   Modifying the value of this parameter is a high-risk operation. The modification will cause all components on the data plane of ASM to restart. Exercise caution before modifying the value of this parameter.
         * 
         * *   The configurations specified by this parameter do not apply to the ASM gateway. You can configure gateway-specific scheduling on the ASM gateway.
         */
        public Builder defaultComponentsScheduleConfig(String defaultComponentsScheduleConfig) {
            this.putBodyParameter("DefaultComponentsScheduleConfig", defaultComponentsScheduleConfig);
            this.defaultComponentsScheduleConfig = defaultComponentsScheduleConfig;
            return this;
        }

        /**
         * The label selectors used to specify the namespaces of the clusters on the data plane for selective service discovery.
         */
        public Builder discoverySelectors(String discoverySelectors) {
            this.putBodyParameter("DiscoverySelectors", discoverySelectors);
            this.discoverySelectors = discoverySelectors;
            return this;
        }

        /**
         * Specifies whether to enable Dubbo Filter. Valid values:
         * <p>
         * 
         * *   `true`: enables Dubbo Filter.
         * *   `false`: disables Dubbo Filter.
         * 
         * Default value: `false`.
         */
        public Builder dubboFilterEnabled(Boolean dubboFilterEnabled) {
            this.putBodyParameter("DubboFilterEnabled", dubboFilterEnabled);
            this.dubboFilterEnabled = dubboFilterEnabled;
            return this;
        }

        /**
         * Specifies whether to enable the mesh audit feature. To enable this feature, make sure that you have activated [Log Service](https://sls.console.aliyun.com/). Valid values:
         * <p>
         * 
         * *   `true`: enables the mesh audit feature.
         * *   `false`: disables the mesh audit feature.
         * 
         * Default value: `false`.
         */
        public Builder enableAudit(Boolean enableAudit) {
            this.putBodyParameter("EnableAudit", enableAudit);
            this.enableAudit = enableAudit;
            return this;
        }

        /**
         * The ports for which outbound traffic is redirected to the sidecar proxy.
         */
        public Builder enableAutoDiagnosis(Boolean enableAutoDiagnosis) {
            this.putBodyParameter("EnableAutoDiagnosis", enableAutoDiagnosis);
            this.enableAutoDiagnosis = enableAutoDiagnosis;
            return this;
        }

        /**
         * Specifies the authentication token of an ARMS Prometheus instance when the Mesh Topology feature is enabled and ARMS Prometheus is used to collect monitoring metrics. The token is used to allow Mesh Topology to access the ARMS Prometheus instance. The token is in the JSON format. The key in the JSON object is the ID of the cluster on the data plane, and the value is the authentication token of the ARMS Prometheus instance deployed in the cluster.
         */
        public Builder enableBootstrapXdsAgent(Boolean enableBootstrapXdsAgent) {
            this.putBodyParameter("EnableBootstrapXdsAgent", enableBootstrapXdsAgent);
            this.enableBootstrapXdsAgent = enableBootstrapXdsAgent;
            return this;
        }

        /**
         * Specifies whether to enable the rollback feature for Istio resources.
         */
        public Builder enableCRHistory(Boolean enableCRHistory) {
            this.putBodyParameter("EnableCRHistory", enableCRHistory);
            this.enableCRHistory = enableCRHistory;
            return this;
        }

        /**
         * Specifies whether to enable automatic sidecar proxy injection for all namespaces. Valid values:
         * <p>
         * 
         * *   `true`: enables automatic sidecar proxy injection for all namespaces.
         * *   `false`: disables automatic sidecar proxy injection for all namespaces.
         * 
         * Default value: `false`.
         */
        public Builder enableNamespacesByDefault(Boolean enableNamespacesByDefault) {
            this.putBodyParameter("EnableNamespacesByDefault", enableNamespacesByDefault);
            this.enableNamespacesByDefault = enableNamespacesByDefault;
            return this;
        }

        /**
         * Specifies whether to enable Secret Discovery Service (SDS). Valid values:
         * <p>
         * 
         * *   `true`: enables SDS.
         * *   `false`: disables SDS.
         * 
         * Default value: `false`.
         */
        public Builder enableSDSServer(Boolean enableSDSServer) {
            this.putBodyParameter("EnableSDSServer", enableSDSServer);
            this.enableSDSServer = enableSDSServer;
            return this;
        }

        /**
         * The IP addresses of external services to which traffic is not intercepted.
         */
        public Builder excludeIPRanges(String excludeIPRanges) {
            this.putBodyParameter("ExcludeIPRanges", excludeIPRanges);
            this.excludeIPRanges = excludeIPRanges;
            return this;
        }

        /**
         * The ports for which inbound traffic is not redirected to the sidecar proxy. Separate multiple ports with commas (,).
         */
        public Builder excludeInboundPorts(String excludeInboundPorts) {
            this.putBodyParameter("ExcludeInboundPorts", excludeInboundPorts);
            this.excludeInboundPorts = excludeInboundPorts;
            return this;
        }

        /**
         * The ports for which outbound traffic is not redirected to the sidecar proxy. Separate multiple ports with commas (,).
         */
        public Builder excludeOutboundPorts(String excludeOutboundPorts) {
            this.putBodyParameter("ExcludeOutboundPorts", excludeOutboundPorts);
            this.excludeOutboundPorts = excludeOutboundPorts;
            return this;
        }

        /**
         * Specifies whether to enable gateway configuration filtering. Valid values:
         * <p>
         * 
         * *   `true`: enables gateway configuration filtering.
         * *   `false`: disables gateway configuration filtering.
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
         * *   `true`: enables Gateway API.
         * *   `false`: disables Gateway API.
         * 
         * Default value: `false`.
         */
        public Builder gatewayAPIEnabled(Boolean gatewayAPIEnabled) {
            this.putBodyParameter("GatewayAPIEnabled", gatewayAPIEnabled);
            this.gatewayAPIEnabled = gatewayAPIEnabled;
            return this;
        }

        /**
         * Other metrics of the sidecar proxy on the data plane.
         */
        public Builder holdApplicationUntilProxyStarts(Boolean holdApplicationUntilProxyStarts) {
            this.putBodyParameter("HoldApplicationUntilProxyStarts", holdApplicationUntilProxyStarts);
            this.holdApplicationUntilProxyStarts = holdApplicationUntilProxyStarts;
            return this;
        }

        /**
         * Specifies whether to support HTTP 1.0. Valid values:
         * <p>
         * 
         * *   `true`: supports HTTP 1.0.
         * *   `false`: does not support HTTP 1.0.
         * 
         * Default value: `false`.
         */
        public Builder http10Enabled(Boolean http10Enabled) {
            this.putBodyParameter("Http10Enabled", http10Enabled);
            this.http10Enabled = http10Enabled;
            return this;
        }

        /**
         * The IP addresses of external services to which traffic is intercepted.
         */
        public Builder includeIPRanges(String includeIPRanges) {
            this.putBodyParameter("IncludeIPRanges", includeIPRanges);
            this.includeIPRanges = includeIPRanges;
            return this;
        }

        /**
         * The ports for which inbound traffic is redirected to the sidecar proxy.
         */
        public Builder includeInboundPorts(String includeInboundPorts) {
            this.putBodyParameter("IncludeInboundPorts", includeInboundPorts);
            this.includeInboundPorts = includeInboundPorts;
            return this;
        }

        /**
         * The log level of the sidecar proxy on the data plane. Log levels include `none`, `error`, `warn`, `info`, and `debug`. The levels correspond to different amounts of information reported by the logs. For example, none-level logs report the least information, while debug-level logs report the most information.
         */
        public Builder includeOutboundPorts(String includeOutboundPorts) {
            this.putBodyParameter("IncludeOutboundPorts", includeOutboundPorts);
            this.includeOutboundPorts = includeOutboundPorts;
            return this;
        }

        /**
         * Specifies whether to enable Node Feature Discovery (NFD).
         */
        public Builder integrateKiali(Boolean integrateKiali) {
            this.putBodyParameter("IntegrateKiali", integrateKiali);
            this.integrateKiali = integrateKiali;
            return this;
        }

        /**
         * Specifies whether to load the bootstrap configuration before the sidecar proxy is started.
         */
        public Builder interceptionMode(String interceptionMode) {
            this.putBodyParameter("InterceptionMode", interceptionMode);
            this.interceptionMode = interceptionMode;
            return this;
        }

        /**
         * Specifies the default scheduling configurations that ASM delivers to components on the data plane. You can configure `nodeSelector` and tolerations in the JSON format.
         * <p>
         * 
         * > *   Modifying the value of this parameter is a high-risk operation. The modification will cause all components on the data plane of ASM to restart. Exercise caution before modifying the value of this parameter.
         * >*   The configurations specified by this parameter do not apply to the ASM gateway. You can configure gateway-specific scheduling on the ASM gateway.
         */
        public Builder kialiArmsAuthTokens(String kialiArmsAuthTokens) {
            this.putBodyParameter("KialiArmsAuthTokens", kialiArmsAuthTokens);
            this.kialiArmsAuthTokens = kialiArmsAuthTokens;
            return this;
        }

        /**
         * Specifies whether to enable the Mesh Topology feature. To enable this feature, make sure that you have enabled Prometheus monitoring. If Prometheus monitoring is disabled, the Mesh Topology feature must be disabled. Valid values:````
         * <p>
         * 
         * *   `true`: enables the Mesh Topology feature.
         * *   `false`: disables the Mesh Topology feature.
         * 
         * Default value: `false`.
         */
        public Builder kialiEnabled(Boolean kialiEnabled) {
            this.putBodyParameter("KialiEnabled", kialiEnabled);
            this.kialiEnabled = kialiEnabled;
            return this;
        }

        /**
         * Specifies Classic Load Balancer (CLB) instances by using annotations when the Mesh Topology feature is enabled. These CLB instances are used to access the Mesh Topology feature in different clusters.
         * <p>
         * 
         * This parameter is a JSON-encoded string. The key in the JSON object is the ID of a cluster on the data plane, and the value is the annotation content of the Mesh Topology service in the cluster.
         * 
         * For more information about how to configure CLB instances by using annotations, see [Add annotations to the YAML file of a Service to configure CLB instances](https://www.alibabacloud.com/help/container-service-for-kubernetes/latest/use-annotations-to-configure-load-balancing-1).
         */
        public Builder kialiServiceAnnotations(String kialiServiceAnnotations) {
            this.putBodyParameter("KialiServiceAnnotations", kialiServiceAnnotations);
            this.kialiServiceAnnotations = kialiServiceAnnotations;
            return this;
        }

        /**
         * The lifecycle of the sidecar proxy.
         */
        public Builder lifecycle(String lifecycle) {
            this.putBodyParameter("Lifecycle", lifecycle);
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * The configurations of cross-region load balancing. Valid values:
         * <p>
         * 
         * *   `failover`: the configurations of cross-region failover. Example:
         * 
         * <!---->
         * 
         *     failover: [// Cross-region failover configurations of the struct type. 
         *             {
         *                 // If a service fails in the China (Beijing) region, the traffic is redirected to the same service in the China (Hangzhou) region. 
         *                 from: "cn-beijing", 
         *                 to: "cn-hangzhou",
         *             }
         *         ]
         * 
         * *   `distribute`: the configurations of cross-region traffic distribution. Example:
         * 
         * <!---->
         * 
         *     distribute: [// Cross-region traffic distribution configurations of the struct type. 
         *             {
         *                 // For traffic that is routed to the China (Beijing) region, 70% of the traffic is allocated to the China (Beijing) region and the rest of the traffic is redirected to the China (Hangzhou) region. 
         *                 "from": "cn-beijing",
         *                 "to": {
         *                     "cn-beijing": 70,
         *                     "cn-hangzhou": 30,
         *                 }
         *             }
         *         ]
         */
        public Builder localityLBConf(String localityLBConf) {
            this.putBodyParameter("LocalityLBConf", localityLBConf);
            this.localityLBConf = localityLBConf;
            return this;
        }

        /**
         * Specifies whether to enable cross-region load balancing. Valid values:
         * <p>
         * 
         * *   `true`: enables cross-region load balancing.
         * *   `false`: disables cross-region load balancing.
         * 
         * Default value: `false`.
         */
        public Builder localityLoadBalancing(Boolean localityLoadBalancing) {
            this.putBodyParameter("LocalityLoadBalancing", localityLoadBalancing);
            this.localityLoadBalancing = localityLoadBalancing;
            return this;
        }

        /**
         * The number of worker threads used by the sidecar proxy on the data plane.
         */
        public Builder logLevel(String logLevel) {
            this.putBodyParameter("LogLevel", logLevel);
            this.logLevel = logLevel;
            return this;
        }

        /**
         * Specifies whether to enable Microservice Engine (MSE). Valid values:
         * <p>
         * 
         * *   `true`: enables MSE.
         * *   `false`: disables MSE.
         * 
         * Default value: `false`.
         */
        public Builder MSEEnabled(Boolean MSEEnabled) {
            this.putBodyParameter("MSEEnabled", MSEEnabled);
            this.MSEEnabled = MSEEnabled;
            return this;
        }

        /**
         * Specifies whether to enable Transport Layer Security (TLS) acceleration based on MultiBuffer.
         */
        public Builder multiBufferEnabled(Boolean multiBufferEnabled) {
            this.putBodyParameter("MultiBufferEnabled", multiBufferEnabled);
            this.multiBufferEnabled = multiBufferEnabled;
            return this;
        }

        /**
         * The pull-request latency. By default, this parameter is left empty.
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
         * *   `true`: enables MySQL Filter.
         * *   `false`: disables MySQL Filter.
         * 
         * Default value: `false`.
         */
        public Builder mysqlFilterEnabled(Boolean mysqlFilterEnabled) {
            this.putBodyParameter("MysqlFilterEnabled", mysqlFilterEnabled);
            this.mysqlFilterEnabled = mysqlFilterEnabled;
            return this;
        }

        /**
         * Specifies whether to clear feature labels on nodes when NFD is disabled.
         * <p>
         * 
         * This parameter is valid only when the `NFDEnabled` parameter is set to `false`.
         */
        public Builder NFDEnabled(Boolean NFDEnabled) {
            this.putBodyParameter("NFDEnabled", NFDEnabled);
            this.NFDEnabled = NFDEnabled;
            return this;
        }

        /**
         * The minimum number of CPU cores requested by the proxy service that exports Tracing Analysis data. For example, `1000m` indicates one CPU core.
         */
        public Builder NFDLabelPruned(Boolean NFDLabelPruned) {
            this.putBodyParameter("NFDLabelPruned", NFDLabelPruned);
            this.NFDLabelPruned = NFDLabelPruned;
            return this;
        }

        /**
         * The maximum size of the memory that is available to the pod that injects OPA proxies into application pods. For example, `1024Mi` indicates 1024 MB.
         */
        public Builder OPAInjectorCPULimit(String OPAInjectorCPULimit) {
            this.putBodyParameter("OPAInjectorCPULimit", OPAInjectorCPULimit);
            this.OPAInjectorCPULimit = OPAInjectorCPULimit;
            return this;
        }

        /**
         * The minimum size of the memory requested by the pod that injects OPA proxies into application pods. For example, `50 Mi` indicates 50 MB.
         */
        public Builder OPAInjectorCPURequirement(String OPAInjectorCPURequirement) {
            this.putBodyParameter("OPAInjectorCPURequirement", OPAInjectorCPURequirement);
            this.OPAInjectorCPURequirement = OPAInjectorCPURequirement;
            return this;
        }

        /**
         * Specifies whether to create a CLB instance for accessing the ASM mesh topology.
         */
        public Builder OPAInjectorMemoryLimit(String OPAInjectorMemoryLimit) {
            this.putBodyParameter("OPAInjectorMemoryLimit", OPAInjectorMemoryLimit);
            this.OPAInjectorMemoryLimit = OPAInjectorMemoryLimit;
            return this;
        }

        /**
         * The maximum number of CPU cores that are available to the pod that injects OPA proxies into application pods. For example, `1000m` indicates one CPU core.
         */
        public Builder OPAInjectorMemoryRequirement(String OPAInjectorMemoryRequirement) {
            this.putBodyParameter("OPAInjectorMemoryRequirement", OPAInjectorMemoryRequirement);
            this.OPAInjectorMemoryRequirement = OPAInjectorMemoryRequirement;
            return this;
        }

        /**
         * The maximum number of CPU cores that are available to the OPA proxy container.
         */
        public Builder OPALimitCPU(String OPALimitCPU) {
            this.putBodyParameter("OPALimitCPU", OPALimitCPU);
            this.OPALimitCPU = OPALimitCPU;
            return this;
        }

        /**
         * The maximum size of the memory that is available to the OPA proxy container.
         */
        public Builder OPALimitMemory(String OPALimitMemory) {
            this.putBodyParameter("OPALimitMemory", OPALimitMemory);
            this.OPALimitMemory = OPALimitMemory;
            return this;
        }

        /**
         * The log level of the OPA proxy container.
         * <p>
         * 
         * *   `info`: outputs all information.
         * *   `debug`: outputs debugging and error information.
         * *   `error`: outputs only error information.
         */
        public Builder OPALogLevel(String OPALogLevel) {
            this.putBodyParameter("OPALogLevel", OPALogLevel);
            this.OPALogLevel = OPALogLevel;
            return this;
        }

        /**
         * The number of CPU cores that are requested by the OPA proxy container.
         */
        public Builder OPARequestCPU(String OPARequestCPU) {
            this.putBodyParameter("OPARequestCPU", OPARequestCPU);
            this.OPARequestCPU = OPARequestCPU;
            return this;
        }

        /**
         * The size of the memory that is requested by the OPA proxy container.
         */
        public Builder OPARequestMemory(String OPARequestMemory) {
            this.putBodyParameter("OPARequestMemory", OPARequestMemory);
            this.OPARequestMemory = OPARequestMemory;
            return this;
        }

        /**
         * The minimum number of CPU cores requested by the pod that injects OPA proxies into application pods. For example, `1000m` indicates one CPU core.
         */
        public Builder OPAScopeInjected(Boolean OPAScopeInjected) {
            this.putBodyParameter("OPAScopeInjected", OPAScopeInjected);
            this.OPAScopeInjected = OPAScopeInjected;
            return this;
        }

        /**
         * Specifies whether to enable the OPA plug-in. Valid values:
         * <p>
         * 
         * *   `true`: enables the OPA plug-in.
         * *   `false`: disables the OPA plug-in.
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
         * *   `true`: installs the OPA plug-in.
         * *   `false`: does not install the OPA plug-in.
         * 
         * Default value: `false`.
         */
        public Builder openAgentPolicy(Boolean openAgentPolicy) {
            this.putBodyParameter("OpenAgentPolicy", openAgentPolicy);
            this.openAgentPolicy = openAgentPolicy;
            return this;
        }

        /**
         * The policy for accessing external services. Valid values:
         * <p>
         * 
         * *   `ALLOW_ANY`: allows access to all external services.
         * *   `REGISTRY_ONLY`: allows access to only the external services that are defined in the ServiceEntry of the ASM instance.
         */
        public Builder outboundTrafficPolicy(String outboundTrafficPolicy) {
            this.putBodyParameter("OutboundTrafficPolicy", outboundTrafficPolicy);
            this.outboundTrafficPolicy = outboundTrafficPolicy;
            return this;
        }

        /**
         * The endpoint of Prometheus monitoring. If you use ARMS Prometheus, set this parameter to the endpoint of Prometheus provided by ARMS.
         */
        public Builder prometheusUrl(String prometheusUrl) {
            this.putBodyParameter("PrometheusUrl", prometheusUrl);
            this.prometheusUrl = prometheusUrl;
            return this;
        }

        /**
         * The maximum number of CPU cores that are available to the istio-init container.
         */
        public Builder proxyInitCPUResourceLimit(String proxyInitCPUResourceLimit) {
            this.putBodyParameter("ProxyInitCPUResourceLimit", proxyInitCPUResourceLimit);
            this.proxyInitCPUResourceLimit = proxyInitCPUResourceLimit;
            return this;
        }

        /**
         * The number of CPU cores that are requested by the istio-init container.
         */
        public Builder proxyInitCPUResourceRequest(String proxyInitCPUResourceRequest) {
            this.putBodyParameter("ProxyInitCPUResourceRequest", proxyInitCPUResourceRequest);
            this.proxyInitCPUResourceRequest = proxyInitCPUResourceRequest;
            return this;
        }

        /**
         * The maximum size of the memory that is available to the istio-init container.
         */
        public Builder proxyInitMemoryResourceLimit(String proxyInitMemoryResourceLimit) {
            this.putBodyParameter("ProxyInitMemoryResourceLimit", proxyInitMemoryResourceLimit);
            this.proxyInitMemoryResourceLimit = proxyInitMemoryResourceLimit;
            return this;
        }

        /**
         * The size of the memory that is requested by the istio-init container.
         */
        public Builder proxyInitMemoryResourceRequest(String proxyInitMemoryResourceRequest) {
            this.putBodyParameter("ProxyInitMemoryResourceRequest", proxyInitMemoryResourceRequest);
            this.proxyInitMemoryResourceRequest = proxyInitMemoryResourceRequest;
            return this;
        }

        /**
         * The maximum number of CPU cores that are available to the sidecar proxy container.
         */
        public Builder proxyLimitCPU(String proxyLimitCPU) {
            this.putBodyParameter("ProxyLimitCPU", proxyLimitCPU);
            this.proxyLimitCPU = proxyLimitCPU;
            return this;
        }

        /**
         * The maximum size of the memory that is available to the sidecar proxy container.
         */
        public Builder proxyLimitMemory(String proxyLimitMemory) {
            this.putBodyParameter("ProxyLimitMemory", proxyLimitMemory);
            this.proxyLimitMemory = proxyLimitMemory;
            return this;
        }

        /**
         * The number of CPU cores that are requested by the sidecar proxy container.
         */
        public Builder proxyRequestCPU(String proxyRequestCPU) {
            this.putBodyParameter("ProxyRequestCPU", proxyRequestCPU);
            this.proxyRequestCPU = proxyRequestCPU;
            return this;
        }

        /**
         * The size of the memory that is requested by the sidecar proxy container.
         */
        public Builder proxyRequestMemory(String proxyRequestMemory) {
            this.putBodyParameter("ProxyRequestMemory", proxyRequestMemory);
            this.proxyRequestMemory = proxyRequestMemory;
            return this;
        }

        /**
         * The mode in which the sidecar proxy intercepts inbound traffic. Valid values:
         * <p>
         * 
         * *   `REDIRECT`: The sidecar proxy intercepts inbound traffic in the REDIRECT mode.
         * *   `TPROXY`: The sidecar proxy intercepts inbound traffic in the TPROXY mode.
         */
        public Builder proxyStatsMatcher(String proxyStatsMatcher) {
            this.putBodyParameter("ProxyStatsMatcher", proxyStatsMatcher);
            this.proxyStatsMatcher = proxyStatsMatcher;
            return this;
        }

        /**
         * Specifies whether to enable Redis Filter. Valid values:
         * <p>
         * 
         * *   `true`: enables Redis Filter.
         * *   `false`: disables Redis Filter.
         * 
         * Default value: `false`.
         */
        public Builder redisFilterEnabled(Boolean redisFilterEnabled) {
            this.putBodyParameter("RedisFilterEnabled", redisFilterEnabled);
            this.redisFilterEnabled = redisFilterEnabled;
            return this;
        }

        /**
         * The ID of the ASM instance.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * The maximum number of CPU cores that are available to the pod where a sidecar proxy injector resides.
         */
        public Builder sidecarInjectorLimitCPU(String sidecarInjectorLimitCPU) {
            this.putBodyParameter("SidecarInjectorLimitCPU", sidecarInjectorLimitCPU);
            this.sidecarInjectorLimitCPU = sidecarInjectorLimitCPU;
            return this;
        }

        /**
         * The maximum size of the memory that is available to the pod where a sidecar proxy injector resides.
         */
        public Builder sidecarInjectorLimitMemory(String sidecarInjectorLimitMemory) {
            this.putBodyParameter("SidecarInjectorLimitMemory", sidecarInjectorLimitMemory);
            this.sidecarInjectorLimitMemory = sidecarInjectorLimitMemory;
            return this;
        }

        /**
         * The number of CPU cores that are requested by the pod where a sidecar proxy injector resides.
         */
        public Builder sidecarInjectorRequestCPU(String sidecarInjectorRequestCPU) {
            this.putBodyParameter("SidecarInjectorRequestCPU", sidecarInjectorRequestCPU);
            this.sidecarInjectorRequestCPU = sidecarInjectorRequestCPU;
            return this;
        }

        /**
         * The size of the memory that is requested by the pod where a sidecar proxy injector resides.
         */
        public Builder sidecarInjectorRequestMemory(String sidecarInjectorRequestMemory) {
            this.putBodyParameter("SidecarInjectorRequestMemory", sidecarInjectorRequestMemory);
            this.sidecarInjectorRequestMemory = sidecarInjectorRequestMemory;
            return this;
        }

        /**
         * Other configurations of automatic sidecar proxy injection, in the YAML format.
         */
        public Builder sidecarInjectorWebhookAsYaml(String sidecarInjectorWebhookAsYaml) {
            this.putBodyParameter("SidecarInjectorWebhookAsYaml", sidecarInjectorWebhookAsYaml);
            this.sidecarInjectorWebhookAsYaml = sidecarInjectorWebhookAsYaml;
            return this;
        }

        /**
         * Specifies whether to enable Prometheus monitoring. We recommend that you enable [ARMS Prometheus](https://arms.console.aliyun.com/). Valid values:
         * <p>
         * 
         * *   `true`: enables Prometheus monitoring.
         * *   `false`: disables Prometheus monitoring.
         * 
         * Default value: `false`.
         */
        public Builder telemetry(Boolean telemetry) {
            this.putBodyParameter("Telemetry", telemetry);
            this.telemetry = telemetry;
            return this;
        }

        /**
         * The maximum period of time that the sidecar proxy waits for requests to be processed before the proxy is stopped. For example, if you want to specify a period of 5 seconds, set this parameter to 5s.
         */
        public Builder terminationDrainDuration(String terminationDrainDuration) {
            this.putBodyParameter("TerminationDrainDuration", terminationDrainDuration);
            this.terminationDrainDuration = terminationDrainDuration;
            return this;
        }

        /**
         * Specifies whether to enable Thrift Filter. Valid values:
         * <p>
         * 
         * *   `true`: enables Thrift Filter.
         * *   `false`: disables Thrift Filter.
         * 
         * Default value: `false`.
         */
        public Builder thriftFilterEnabled(Boolean thriftFilterEnabled) {
            this.putBodyParameter("ThriftFilterEnabled", thriftFilterEnabled);
            this.thriftFilterEnabled = thriftFilterEnabled;
            return this;
        }

        /**
         * The custom tag of Tracing Analysis. Specify this parameter in the JSON format.
         * <p>
         * 
         *     {
         *         "name1": CustomTag,
         *         "name2": CustomTag
         *     }
         * 
         * Tag key: literal, header, or environment.
         * 
         *     {
         *         "literal": {
         *             "value": "Fixed value"
         *         }
         *         "header": {
         *             "name": "Header name"
         *             "defaultValue": "Default value that is used if the specified header does not exist"
         *         }
         *         "environment": {
         *             "name": "Environment variable name"
         *             "defaultValue": "Default value that is used if the specified environment variable does not exist"
         *         }
         *     }
         */
        public Builder traceCustomTags(String traceCustomTags) {
            this.putBodyParameter("TraceCustomTags", traceCustomTags);
            this.traceCustomTags = traceCustomTags;
            return this;
        }

        /**
         * The maximum length of the request path contained in the HttpUrl span tag. Default value: `256`.
         */
        public Builder traceMaxPathTagLength(String traceMaxPathTagLength) {
            this.putBodyParameter("TraceMaxPathTagLength", traceMaxPathTagLength);
            this.traceMaxPathTagLength = traceMaxPathTagLength;
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
         * Specifies whether to enable the Tracing Analysis feature. To enable this feature, make sure that you have activated [Tracing Analysis](https://tracing-analysis.console.aliyun.com/). Valid values:
         * <p>
         * 
         * *   `true`: enables the Tracing Analysis feature.
         * *   `false`: disables the Tracing Analysis feature.
         * 
         * Default value: `false`.
         */
        public Builder tracing(Boolean tracing) {
            this.putBodyParameter("Tracing", tracing);
            this.tracing = tracing;
            return this;
        }

        /**
         * The maximum size of the memory that is available to the proxy service that exports Tracing Analysis data. For example, `1Mi` indicates 1 MB.
         */
        public Builder tracingOnExtZipkinLimitCPU(String tracingOnExtZipkinLimitCPU) {
            this.putBodyParameter("TracingOnExtZipkinLimitCPU", tracingOnExtZipkinLimitCPU);
            this.tracingOnExtZipkinLimitCPU = tracingOnExtZipkinLimitCPU;
            return this;
        }

        /**
         * The retention period for the access logs of the ingress gateway. Unit: day. The logs are collected by using Log Service. For example, `30` indicates 30 days.
         */
        public Builder tracingOnExtZipkinLimitMemory(String tracingOnExtZipkinLimitMemory) {
            this.putBodyParameter("TracingOnExtZipkinLimitMemory", tracingOnExtZipkinLimitMemory);
            this.tracingOnExtZipkinLimitMemory = tracingOnExtZipkinLimitMemory;
            return this;
        }

        /**
         * The minimum size of the memory requested by the proxy service that exports Tracing Analysis data. For example, `1Mi` indicates 1 MB.
         */
        public Builder tracingOnExtZipkinRequestCPU(String tracingOnExtZipkinRequestCPU) {
            this.putBodyParameter("TracingOnExtZipkinRequestCPU", tracingOnExtZipkinRequestCPU);
            this.tracingOnExtZipkinRequestCPU = tracingOnExtZipkinRequestCPU;
            return this;
        }

        /**
         * The maximum number of CPU cores that are available to the proxy service that exports Tracing Analysis data. For example, `1000m` indicates one CPU core.
         */
        public Builder tracingOnExtZipkinRequestMemory(String tracingOnExtZipkinRequestMemory) {
            this.putBodyParameter("TracingOnExtZipkinRequestMemory", tracingOnExtZipkinRequestMemory);
            this.tracingOnExtZipkinRequestMemory = tracingOnExtZipkinRequestMemory;
            return this;
        }

        /**
         * Specifies whether to enable WebAssembly Filter. Valid values:
         * <p>
         * 
         * *   `true`: enables WebAssembly Filter.
         * *   `false`: disables WebAssembly Filter.
         * 
         * Default value: `false`.
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
