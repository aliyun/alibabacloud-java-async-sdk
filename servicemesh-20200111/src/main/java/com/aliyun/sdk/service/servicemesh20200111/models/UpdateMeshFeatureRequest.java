// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link UpdateMeshFeatureRequest} extends {@link RequestModel}
 *
 * <p>UpdateMeshFeatureRequest</p>
 */
public class UpdateMeshFeatureRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessLogEnabled")
    private Boolean accessLogEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessLogFile")
    private String accessLogFile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessLogFormat")
    private String accessLogFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessLogGatewayEnabled")
    private Boolean accessLogGatewayEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessLogGatewayLifecycle")
    private Integer accessLogGatewayLifecycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessLogProject")
    private String accessLogProject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessLogServiceEnabled")
    private Boolean accessLogServiceEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessLogServiceHost")
    private String accessLogServiceHost;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessLogServicePort")
    private Integer accessLogServicePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessLogSidecarEnabled")
    private Boolean accessLogSidecarEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessLogSidecarLifecycle")
    private Integer accessLogSidecarLifecycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuditProject")
    private String auditProject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoInjectionPolicyEnabled")
    private Boolean autoInjectionPolicyEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CRAggregationEnabled")
    private Boolean CRAggregationEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CertChain")
    private String certChain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterSpec")
    private String clusterSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CniEnabled")
    private Boolean cniEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CniExcludeNamespaces")
    private String cniExcludeNamespaces;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Concurrency")
    private Integer concurrency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigSourceEnabled")
    private Boolean configSourceEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigSourceNacosID")
    private String configSourceNacosID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomizedPrometheus")
    private Boolean customizedPrometheus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomizedZipkin")
    private Boolean customizedZipkin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DNSProxyingEnabled")
    private Boolean DNSProxyingEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefaultComponentsScheduleConfig")
    private String defaultComponentsScheduleConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiscoverySelectors")
    private String discoverySelectors;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DubboFilterEnabled")
    private Boolean dubboFilterEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableAudit")
    private Boolean enableAudit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableAutoDiagnosis")
    private Boolean enableAutoDiagnosis;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableBootstrapXdsAgent")
    private Boolean enableBootstrapXdsAgent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableCRHistory")
    private Boolean enableCRHistory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableNamespacesByDefault")
    private Boolean enableNamespacesByDefault;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableSDSServer")
    private Boolean enableSDSServer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeIPRanges")
    private String excludeIPRanges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeInboundPorts")
    private String excludeInboundPorts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeOutboundPorts")
    private String excludeOutboundPorts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExistingCaCert")
    private String existingCaCert;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExistingCaKey")
    private String existingCaKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExistingRootCaCert")
    private String existingRootCaCert;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilterGatewayClusterConfig")
    private Boolean filterGatewayClusterConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayAPIEnabled")
    private Boolean gatewayAPIEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HoldApplicationUntilProxyStarts")
    private Boolean holdApplicationUntilProxyStarts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Http10Enabled")
    private Boolean http10Enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeIPRanges")
    private String includeIPRanges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeInboundPorts")
    private String includeInboundPorts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeOutboundPorts")
    private String includeOutboundPorts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntegrateKiali")
    private Boolean integrateKiali;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InterceptionMode")
    private String interceptionMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KialiArmsAuthTokens")
    private String kialiArmsAuthTokens;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KialiEnabled")
    private Boolean kialiEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KialiServiceAnnotations")
    private String kialiServiceAnnotations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelsForOffloadedWorkloads")
    private String labelsForOffloadedWorkloads;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lifecycle")
    private String lifecycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LocalityLBConf")
    private String localityLBConf;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LocalityLoadBalancing")
    private Boolean localityLoadBalancing;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogLevel")
    private String logLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MSEEnabled")
    @Deprecated
    private Boolean MSEEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MultiBufferEnabled")
    private Boolean multiBufferEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MultiBufferPollDelay")
    private String multiBufferPollDelay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MysqlFilterEnabled")
    private Boolean mysqlFilterEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NFDEnabled")
    private Boolean NFDEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NFDLabelPruned")
    private Boolean NFDLabelPruned;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OPAInjectorCPULimit")
    private String OPAInjectorCPULimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OPAInjectorCPURequirement")
    private String OPAInjectorCPURequirement;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OPAInjectorMemoryLimit")
    private String OPAInjectorMemoryLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OPAInjectorMemoryRequirement")
    private String OPAInjectorMemoryRequirement;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OPALimitCPU")
    private String OPALimitCPU;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OPALimitMemory")
    private String OPALimitMemory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OPALogLevel")
    private String OPALogLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OPARequestCPU")
    private String OPARequestCPU;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OPARequestMemory")
    private String OPARequestMemory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OPAScopeInjected")
    private Boolean OPAScopeInjected;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpaEnabled")
    private Boolean opaEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenAgentPolicy")
    private Boolean openAgentPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutboundTrafficPolicy")
    private String outboundTrafficPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PilotEnableQuicListeners")
    private Boolean pilotEnableQuicListeners;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrometheusUrl")
    private String prometheusUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyInitCPUResourceLimit")
    private String proxyInitCPUResourceLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyInitCPUResourceRequest")
    private String proxyInitCPUResourceRequest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyInitMemoryResourceLimit")
    private String proxyInitMemoryResourceLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyInitMemoryResourceRequest")
    private String proxyInitMemoryResourceRequest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyLimitCPU")
    private String proxyLimitCPU;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyLimitMemory")
    private String proxyLimitMemory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyRequestCPU")
    private String proxyRequestCPU;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyRequestMemory")
    private String proxyRequestMemory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyStatsMatcher")
    private String proxyStatsMatcher;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RedisFilterEnabled")
    private Boolean redisFilterEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SMCEnabled")
    private Boolean SMCEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SidecarInjectorLimitCPU")
    private String sidecarInjectorLimitCPU;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SidecarInjectorLimitMemory")
    private String sidecarInjectorLimitMemory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SidecarInjectorRequestCPU")
    private String sidecarInjectorRequestCPU;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SidecarInjectorRequestMemory")
    private String sidecarInjectorRequestMemory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SidecarInjectorWebhookAsYaml")
    private String sidecarInjectorWebhookAsYaml;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Telemetry")
    private Boolean telemetry;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminationDrainDuration")
    private String terminationDrainDuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThriftFilterEnabled")
    private Boolean thriftFilterEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TraceCustomTags")
    private String traceCustomTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TraceMaxPathTagLength")
    private String traceMaxPathTagLength;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TraceSampling")
    private Float traceSampling;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tracing")
    private Boolean tracing;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TracingOnExtZipkinLimitCPU")
    private String tracingOnExtZipkinLimitCPU;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TracingOnExtZipkinLimitMemory")
    private String tracingOnExtZipkinLimitMemory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TracingOnExtZipkinReplicaCount")
    private String tracingOnExtZipkinReplicaCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TracingOnExtZipkinRequestCPU")
    private String tracingOnExtZipkinRequestCPU;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TracingOnExtZipkinRequestMemory")
    private String tracingOnExtZipkinRequestMemory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WebAssemblyFilterEnabled")
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
        this.certChain = builder.certChain;
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
        this.existingCaCert = builder.existingCaCert;
        this.existingCaKey = builder.existingCaKey;
        this.existingRootCaCert = builder.existingRootCaCert;
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
        this.labelsForOffloadedWorkloads = builder.labelsForOffloadedWorkloads;
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
        this.pilotEnableQuicListeners = builder.pilotEnableQuicListeners;
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
        this.SMCEnabled = builder.SMCEnabled;
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
        this.tracingOnExtZipkinReplicaCount = builder.tracingOnExtZipkinReplicaCount;
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
     * @return certChain
     */
    public String getCertChain() {
        return this.certChain;
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
     * @return existingRootCaCert
     */
    public String getExistingRootCaCert() {
        return this.existingRootCaCert;
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
     * @return labelsForOffloadedWorkloads
     */
    public String getLabelsForOffloadedWorkloads() {
        return this.labelsForOffloadedWorkloads;
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
     * @return pilotEnableQuicListeners
     */
    public Boolean getPilotEnableQuicListeners() {
        return this.pilotEnableQuicListeners;
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
     * @return SMCEnabled
     */
    public Boolean getSMCEnabled() {
        return this.SMCEnabled;
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
     * @return tracingOnExtZipkinReplicaCount
     */
    public String getTracingOnExtZipkinReplicaCount() {
        return this.tracingOnExtZipkinReplicaCount;
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
        private String certChain; 
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
        private String existingCaCert; 
        private String existingCaKey; 
        private String existingRootCaCert; 
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
        private String labelsForOffloadedWorkloads; 
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
        private Boolean pilotEnableQuicListeners; 
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
        private Boolean SMCEnabled; 
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
        private String tracingOnExtZipkinReplicaCount; 
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
            this.certChain = request.certChain;
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
            this.existingCaCert = request.existingCaCert;
            this.existingCaKey = request.existingCaKey;
            this.existingRootCaCert = request.existingRootCaCert;
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
            this.labelsForOffloadedWorkloads = request.labelsForOffloadedWorkloads;
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
            this.pilotEnableQuicListeners = request.pilotEnableQuicListeners;
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
            this.SMCEnabled = request.SMCEnabled;
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
            this.tracingOnExtZipkinReplicaCount = request.tracingOnExtZipkinReplicaCount;
            this.tracingOnExtZipkinRequestCPU = request.tracingOnExtZipkinRequestCPU;
            this.tracingOnExtZipkinRequestMemory = request.tracingOnExtZipkinRequestMemory;
            this.webAssemblyFilterEnabled = request.webAssemblyFilterEnabled;
        } 

        /**
         * <p>Specifies whether to enable access log collection. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables access log collection.</li>
         * <li><code>false</code>: disables access log collection.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder accessLogEnabled(Boolean accessLogEnabled) {
            this.putBodyParameter("AccessLogEnabled", accessLogEnabled);
            this.accessLogEnabled = accessLogEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable access logging. Valid values:</p>
         * <ul>
         * <li><code>&quot;&quot;</code>: disables access logging.</li>
         * <li><code>/dev/stdout</code>: enables access logging. Access logs are written to /dev/stdout.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        public Builder accessLogFile(String accessLogFile) {
            this.putBodyParameter("AccessLogFile", accessLogFile);
            this.accessLogFile = accessLogFile;
            return this;
        }

        /**
         * <p>The custom format of access logs. To set this parameter, make sure that you have enabled access log collection. The value must be a JSON string. The following key names must be contained: authority_for, bytes_received, bytes_sent, downstream_local_address, downstream_remote_address, duration, istio_policy_status, method, path, protocol, requested_server_name, response_code, response_flags, route_name, start_time, trace_id, upstream_cluster, upstream_host, upstream_local_address, upstream_service_time, upstream_transport_failure_reason, user_agent, and x_forwarded_for.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;authority_for&quot;:&quot;%REQ(:AUTHORITY)%&quot;,&quot;bytes_received&quot;:&quot;%BYTES_RECEIVED%&quot;,&quot;bytes_sent&quot;:&quot;%BYTES_SENT%&quot;,&quot;downstream_local_address&quot;:&quot;%DOWNSTREAM_LOCAL_ADDRESS%&quot;,&quot;downstream_remote_address&quot;:&quot;%DOWNSTREAM_REMOTE_ADDRESS%&quot;,&quot;duration&quot;:&quot;%DURATION%&quot;,&quot;istio_policy_status&quot;:&quot;%DYNAMIC_METADATA(istio.mixer:status)%&quot;,&quot;method&quot;:&quot;%REQ(:METHOD)%&quot;,&quot;path&quot;:&quot;%REQ(X-ENVOY-ORIGINAL-PATH?:PATH)%&quot;,&quot;protocol&quot;:&quot;%PROTOCOL%&quot;,&quot;request_id&quot;:&quot;%REQ(X-REQUEST-ID)%&quot;,&quot;requested_server_name&quot;:&quot;%REQUESTED_SERVER_NAME%&quot;,&quot;response_code&quot;:&quot;%RESPONSE_CODE%&quot;,&quot;response_flags&quot;:&quot;%RESPONSE_FLAGS%&quot;,&quot;route_name&quot;:&quot;%ROUTE_NAME%&quot;,&quot;start_time&quot;:&quot;%START_TIME%&quot;,&quot;trace_id&quot;:&quot;%REQ(X-B3-TRACEID)%&quot;,&quot;upstream_cluster&quot;:&quot;%UPSTREAM_CLUSTER%&quot;,&quot;upstream_host&quot;:&quot;%UPSTREAM_HOST%&quot;,&quot;upstream_local_address&quot;:&quot;%UPSTREAM_LOCAL_ADDRESS%&quot;,&quot;upstream_service_time&quot;:&quot;%RESP(X-ENVOY-UPSTREAM-SERVICE-TIME)%&quot;,&quot;upstream_transport_failure_reason&quot;:&quot;%UPSTREAM_TRANSPORT_FAILURE_REASON%&quot;,&quot;user_agent&quot;:&quot;%REQ(USER-AGENT)%&quot;,&quot;x_forwarded_for&quot;:&quot;%REQ(X-FORWARDED-FOR)%&quot;}</p>
         */
        public Builder accessLogFormat(String accessLogFormat) {
            this.putBodyParameter("AccessLogFormat", accessLogFormat);
            this.accessLogFormat = accessLogFormat;
            return this;
        }

        /**
         * <p>Specifies whether to enable the collection of access logs of ASM gateways to Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder accessLogGatewayEnabled(Boolean accessLogGatewayEnabled) {
            this.putQueryParameter("AccessLogGatewayEnabled", accessLogGatewayEnabled);
            this.accessLogGatewayEnabled = accessLogGatewayEnabled;
            return this;
        }

        /**
         * <p>The retention period for the access logs of the sidecar proxy. Unit: day. The logs are collected by using Log Service. For example, <code>30</code> indicates 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder accessLogGatewayLifecycle(Integer accessLogGatewayLifecycle) {
            this.putBodyParameter("AccessLogGatewayLifecycle", accessLogGatewayLifecycle);
            this.accessLogGatewayLifecycle = accessLogGatewayLifecycle;
            return this;
        }

        /**
         * <p>The custom project on which the Log Service collects logs.</p>
         * 
         * <strong>example:</strong>
         * <p>mesh-log-cf245a429b6ff4b6e97f20797758e****</p>
         */
        public Builder accessLogProject(String accessLogProject) {
            this.putBodyParameter("AccessLogProject", accessLogProject);
            this.accessLogProject = accessLogProject;
            return this;
        }

        /**
         * <p>Specifies whether to enable gRPC Access Log Service (ALS) for Envoy. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables gRPC ALS for Envoy.</li>
         * <li><code>false</code>: disables gRPC ALS for Envoy.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder accessLogServiceEnabled(Boolean accessLogServiceEnabled) {
            this.putBodyParameter("AccessLogServiceEnabled", accessLogServiceEnabled);
            this.accessLogServiceEnabled = accessLogServiceEnabled;
            return this;
        }

        /**
         * <p>The endpoint of gRPC ALS for Envoy.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0</p>
         */
        public Builder accessLogServiceHost(String accessLogServiceHost) {
            this.putBodyParameter("AccessLogServiceHost", accessLogServiceHost);
            this.accessLogServiceHost = accessLogServiceHost;
            return this;
        }

        /**
         * <p>The port of gRPC ALS for Envoy.</p>
         * 
         * <strong>example:</strong>
         * <p>9999</p>
         */
        public Builder accessLogServicePort(Integer accessLogServicePort) {
            this.putBodyParameter("AccessLogServicePort", accessLogServicePort);
            this.accessLogServicePort = accessLogServicePort;
            return this;
        }

        /**
         * <p>Specifies whether to enable the collection of access logs of sidecar proxies to Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder accessLogSidecarEnabled(Boolean accessLogSidecarEnabled) {
            this.putQueryParameter("AccessLogSidecarEnabled", accessLogSidecarEnabled);
            this.accessLogSidecarEnabled = accessLogSidecarEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic diagnostics for the ASM instance. If you enable this feature, the ASM instance is automatically diagnosed when you modify Istio resources in the ASM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder accessLogSidecarLifecycle(Integer accessLogSidecarLifecycle) {
            this.putBodyParameter("AccessLogSidecarLifecycle", accessLogSidecarLifecycle);
            this.accessLogSidecarLifecycle = accessLogSidecarLifecycle;
            return this;
        }

        /**
         * <p>The name of the Log Service project that is used for mesh audit.</p>
         * <p>Default value: <code>mesh-log-{ASM instance ID}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>mesh-log-c08ba3fd1e64xxb0f8cc1ad8****</p>
         */
        public Builder auditProject(String auditProject) {
            this.putBodyParameter("AuditProject", auditProject);
            this.auditProject = auditProject;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic sidecar proxy injection by using pod annotations. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables automatic sidecar proxy injection by using pod annotations.</li>
         * <li><code>false</code>: disables automatic sidecar proxy injection by using pod annotations.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoInjectionPolicyEnabled(Boolean autoInjectionPolicyEnabled) {
            this.putBodyParameter("AutoInjectionPolicyEnabled", autoInjectionPolicyEnabled);
            this.autoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to use the Kubernetes API of clusters on the data plane to access Istio resources. To use this feature, the version of the ASM instance must be V1.9.7.93 or later.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder CRAggregationEnabled(Boolean CRAggregationEnabled) {
            this.putBodyParameter("CRAggregationEnabled", CRAggregationEnabled);
            this.CRAggregationEnabled = CRAggregationEnabled;
            return this;
        }

        /**
         * <p>The certificate chain from the CA certificate to the root certificate. At least two certificates are included in the chain.</p>
         * 
         * <strong>example:</strong>
         * <p>Base64 encoded PEM cert chain.</p>
         */
        public Builder certChain(String certChain) {
            this.putBodyParameter("CertChain", certChain);
            this.certChain = certChain;
            return this;
        }

        /**
         * <p>Specifies whether to enable the feature of controlling the OPA injection scope. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables the feature.</li>
         * <li><code>false</code>: disables the feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putBodyParameter("ClusterSpec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Container Network Interface (CNI) plug-in. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables the CNI plug-in.</li>
         * <li><code>false</code>: disables the CNI plug-in.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder cniEnabled(Boolean cniEnabled) {
            this.putBodyParameter("CniEnabled", cniEnabled);
            this.cniEnabled = cniEnabled;
            return this;
        }

        /**
         * <p>The namespaces to be excluded for the CNI plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>kube-system</p>
         */
        public Builder cniExcludeNamespaces(String cniExcludeNamespaces) {
            this.putBodyParameter("CniExcludeNamespaces", cniExcludeNamespaces);
            this.cniExcludeNamespaces = cniExcludeNamespaces;
            return this;
        }

        /**
         * <p>Specifies whether to delay application container startup until the sidecar proxy container is started in a pod.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder concurrency(Integer concurrency) {
            this.putBodyParameter("Concurrency", concurrency);
            this.concurrency = concurrency;
            return this;
        }

        /**
         * <p>Specifies whether to enable the external service registry. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables the external service registry.</li>
         * <li><code>false</code>: disables the external service registry.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder configSourceEnabled(Boolean configSourceEnabled) {
            this.putBodyParameter("ConfigSourceEnabled", configSourceEnabled);
            this.configSourceEnabled = configSourceEnabled;
            return this;
        }

        /**
         * <p>The instance ID of the Nacos registry.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-tl326******</p>
         */
        public Builder configSourceNacosID(String configSourceNacosID) {
            this.putBodyParameter("ConfigSourceNacosID", configSourceNacosID);
            this.configSourceNacosID = configSourceNacosID;
            return this;
        }

        /**
         * <p>Specifies whether to use a custom Prometheus instance. Valid values:</p>
         * <ul>
         * <li><code>true</code>: uses a custom Prometheus instance.</li>
         * <li><code>false</code>: does not use a custom Prometheus instance.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder customizedPrometheus(Boolean customizedPrometheus) {
            this.putBodyParameter("CustomizedPrometheus", customizedPrometheus);
            this.customizedPrometheus = customizedPrometheus;
            return this;
        }

        /**
         * <p>Specifies whether to use a self-managed Zipkin system to collect tracing data. Valid values:</p>
         * <ul>
         * <li><code>true</code>: uses a self-managed Zipkin system.</li>
         * <li><code>false</code>: does not use a self-managed Zipkin system.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder customizedZipkin(Boolean customizedZipkin) {
            this.putBodyParameter("CustomizedZipkin", customizedZipkin);
            this.customizedZipkin = customizedZipkin;
            return this;
        }

        /**
         * <p>Specifies whether to enable DNS proxy. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables the DNS proxy feature.</li>
         * <li><code>false</code>: disables the DNS proxy feature.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder DNSProxyingEnabled(Boolean DNSProxyingEnabled) {
            this.putBodyParameter("DNSProxyingEnabled", DNSProxyingEnabled);
            this.DNSProxyingEnabled = DNSProxyingEnabled;
            return this;
        }

        /**
         * <p>Specifies the default scheduling configurations that ASM delivers to components on the data plane. You can configure <code>nodeSelector</code> and <code>tolerations</code> in the JSON format.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Modifying the value of this parameter is a high-risk operation. The modification will cause all components on the data plane of ASM to restart. Exercise caution before modifying the value of this parameter.</p>
         * </li>
         * <li><p>The configurations specified by this parameter do not apply to ASM gateways. You can configure gateway-specific scheduling on ASM gateways.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tolerations&quot;:[{&quot;key&quot;:&quot;test-taints&quot;, &quot;operator&quot;:&quot;Exists&quot;, &quot;effect&quot;:&quot;NoSchedule&quot;}], &quot;nodeSelector&quot;:{&quot;kubernetes.io/hostname&quot;:&quot;test-nodes&quot;}}</p>
         */
        public Builder defaultComponentsScheduleConfig(String defaultComponentsScheduleConfig) {
            this.putBodyParameter("DefaultComponentsScheduleConfig", defaultComponentsScheduleConfig);
            this.defaultComponentsScheduleConfig = defaultComponentsScheduleConfig;
            return this;
        }

        /**
         * <p>The label selectors used to specify the namespaces of the clusters on the data plane for selective service discovery.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;asm-discovery&quot;,&quot;operator&quot;:&quot;Exists&quot;}]}]</p>
         */
        public Builder discoverySelectors(String discoverySelectors) {
            this.putBodyParameter("DiscoverySelectors", discoverySelectors);
            this.discoverySelectors = discoverySelectors;
            return this;
        }

        /**
         * <p>Specifies whether to enable Dubbo Filter. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables Dubbo Filter.</li>
         * <li><code>false</code>: disables Dubbo Filter.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dubboFilterEnabled(Boolean dubboFilterEnabled) {
            this.putBodyParameter("DubboFilterEnabled", dubboFilterEnabled);
            this.dubboFilterEnabled = dubboFilterEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable the mesh audit feature. To enable this feature, make sure that you have activated <a href="https://sls.console.aliyun.com/">Log Service</a>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables the mesh audit feature.</li>
         * <li><code>false</code>: disables the mesh audit feature.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableAudit(Boolean enableAudit) {
            this.putBodyParameter("EnableAudit", enableAudit);
            this.enableAudit = enableAudit;
            return this;
        }

        /**
         * <p>The ports for which outbound traffic is redirected to the sidecar proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAutoDiagnosis(Boolean enableAutoDiagnosis) {
            this.putBodyParameter("EnableAutoDiagnosis", enableAutoDiagnosis);
            this.enableAutoDiagnosis = enableAutoDiagnosis;
            return this;
        }

        /**
         * <p>Specifies the authentication token of an ARMS Prometheus instance when the Mesh Topology feature is enabled and ARMS Prometheus is used to collect monitoring metrics. The token is used to allow Mesh Topology to access the ARMS Prometheus instance. The token is in the JSON format. The key in the JSON object is the ID of the cluster on the data plane, and the value is the authentication token of the ARMS Prometheus instance deployed in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableBootstrapXdsAgent(Boolean enableBootstrapXdsAgent) {
            this.putBodyParameter("EnableBootstrapXdsAgent", enableBootstrapXdsAgent);
            this.enableBootstrapXdsAgent = enableBootstrapXdsAgent;
            return this;
        }

        /**
         * <p>Specifies whether to enable the rollback feature for Istio resources.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableCRHistory(Boolean enableCRHistory) {
            this.putBodyParameter("EnableCRHistory", enableCRHistory);
            this.enableCRHistory = enableCRHistory;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic sidecar proxy injection for all namespaces. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables automatic sidecar proxy injection for all namespaces.</li>
         * <li><code>false</code>: disables automatic sidecar proxy injection for all namespaces.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableNamespacesByDefault(Boolean enableNamespacesByDefault) {
            this.putBodyParameter("EnableNamespacesByDefault", enableNamespacesByDefault);
            this.enableNamespacesByDefault = enableNamespacesByDefault;
            return this;
        }

        /**
         * <p>Specifies whether to enable Secret Discovery Service (SDS). Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables SDS.</li>
         * <li><code>false</code>: disables SDS.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableSDSServer(Boolean enableSDSServer) {
            this.putBodyParameter("EnableSDSServer", enableSDSServer);
            this.enableSDSServer = enableSDSServer;
            return this;
        }

        /**
         * <p>The IP addresses of external services to which traffic is not intercepted.</p>
         * 
         * <strong>example:</strong>
         * <p>100.100.XXX.XXX</p>
         */
        public Builder excludeIPRanges(String excludeIPRanges) {
            this.putBodyParameter("ExcludeIPRanges", excludeIPRanges);
            this.excludeIPRanges = excludeIPRanges;
            return this;
        }

        /**
         * <p>The ports for which inbound traffic is not redirected to the sidecar proxy. Separate multiple ports with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>80,81</p>
         */
        public Builder excludeInboundPorts(String excludeInboundPorts) {
            this.putBodyParameter("ExcludeInboundPorts", excludeInboundPorts);
            this.excludeInboundPorts = excludeInboundPorts;
            return this;
        }

        /**
         * <p>The ports for which outbound traffic is not redirected to the sidecar proxy. Separate multiple ports with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>80,81</p>
         */
        public Builder excludeOutboundPorts(String excludeOutboundPorts) {
            this.putBodyParameter("ExcludeOutboundPorts", excludeOutboundPorts);
            this.excludeOutboundPorts = excludeOutboundPorts;
            return this;
        }

        /**
         * <p>The updated certificate authority (CA) certificate. You can modify this parameter only if you use a custom certificate when you create an ASM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Base64 encoded PEM certificate.</p>
         */
        public Builder existingCaCert(String existingCaCert) {
            this.putBodyParameter("ExistingCaCert", existingCaCert);
            this.existingCaCert = existingCaCert;
            return this;
        }

        /**
         * <p>The updated CA certificate key. You can modify this parameter only if you use a custom certificate when you create an ASM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Base64 encoded PEM
         *  private key.</p>
         */
        public Builder existingCaKey(String existingCaKey) {
            this.putBodyParameter("ExistingCaKey", existingCaKey);
            this.existingCaKey = existingCaKey;
            return this;
        }

        /**
         * <p>The updated root certificate. You can modify this parameter only if you use a custom certificate when you create a Service Mesh (ASM) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Base64 encoded PEM certificate.</p>
         */
        public Builder existingRootCaCert(String existingRootCaCert) {
            this.putBodyParameter("ExistingRootCaCert", existingRootCaCert);
            this.existingRootCaCert = existingRootCaCert;
            return this;
        }

        /**
         * <p>Specifies whether to enable gateway configuration filtering. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables gateway configuration filtering.</li>
         * <li><code>false</code>: disables gateway configuration filtering.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder filterGatewayClusterConfig(Boolean filterGatewayClusterConfig) {
            this.putBodyParameter("FilterGatewayClusterConfig", filterGatewayClusterConfig);
            this.filterGatewayClusterConfig = filterGatewayClusterConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable Gateway API. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables Gateway API.</li>
         * <li><code>false</code>: disables Gateway API.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder gatewayAPIEnabled(Boolean gatewayAPIEnabled) {
            this.putBodyParameter("GatewayAPIEnabled", gatewayAPIEnabled);
            this.gatewayAPIEnabled = gatewayAPIEnabled;
            return this;
        }

        /**
         * <p>Other metrics of the sidecar proxy on the data plane.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder holdApplicationUntilProxyStarts(Boolean holdApplicationUntilProxyStarts) {
            this.putBodyParameter("HoldApplicationUntilProxyStarts", holdApplicationUntilProxyStarts);
            this.holdApplicationUntilProxyStarts = holdApplicationUntilProxyStarts;
            return this;
        }

        /**
         * <p>Specifies whether to support HTTP 1.0. Valid values:</p>
         * <ul>
         * <li><code>true</code>: supports HTTP 1.0.</li>
         * <li><code>false</code>: does not support HTTP 1.0.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder http10Enabled(Boolean http10Enabled) {
            this.putBodyParameter("Http10Enabled", http10Enabled);
            this.http10Enabled = http10Enabled;
            return this;
        }

        /**
         * <p>The IP addresses of external services to which traffic is intercepted.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder includeIPRanges(String includeIPRanges) {
            this.putBodyParameter("IncludeIPRanges", includeIPRanges);
            this.includeIPRanges = includeIPRanges;
            return this;
        }

        /**
         * <p>The ports for which inbound traffic is redirected to the sidecar proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>80,81</p>
         */
        public Builder includeInboundPorts(String includeInboundPorts) {
            this.putBodyParameter("IncludeInboundPorts", includeInboundPorts);
            this.includeInboundPorts = includeInboundPorts;
            return this;
        }

        /**
         * <p>The log level of the sidecar proxy on the data plane. Log levels include <code>none</code>, <code>error</code>, <code>warn</code>, <code>info</code>, and <code>debug</code>. The levels correspond to different amounts of information reported by the logs. For example, none-level logs report the least information, while debug-level logs report the most information.</p>
         * 
         * <strong>example:</strong>
         * <p>8000,8001</p>
         */
        public Builder includeOutboundPorts(String includeOutboundPorts) {
            this.putBodyParameter("IncludeOutboundPorts", includeOutboundPorts);
            this.includeOutboundPorts = includeOutboundPorts;
            return this;
        }

        /**
         * <p>Specifies whether to create a Classic Load Balancer (CLB) instance for accessing Mesh Topology of Service Mesh (ASM).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder integrateKiali(Boolean integrateKiali) {
            this.putBodyParameter("IntegrateKiali", integrateKiali);
            this.integrateKiali = integrateKiali;
            return this;
        }

        /**
         * <p>Specifies whether to load the bootstrap configuration before the sidecar proxy is started.</p>
         * 
         * <strong>example:</strong>
         * <p>TPROXY</p>
         */
        public Builder interceptionMode(String interceptionMode) {
            this.putBodyParameter("InterceptionMode", interceptionMode);
            this.interceptionMode = interceptionMode;
            return this;
        }

        /**
         * <p>Specifies the default scheduling configurations that ASM delivers to components on the data plane. You can configure <code>nodeSelector</code> and tolerations in the JSON format.</p>
         * <blockquote>
         * <ul>
         * <li>Modifying the value of this parameter is a high-risk operation. The modification will cause all components on the data plane of ASM to restart. Exercise caution before modifying the value of this parameter.</li>
         * <li>The configurations specified by this parameter do not apply to the ASM gateway. You can configure gateway-specific scheduling on the ASM gateway.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;c31e3b******5634b&quot;:&quot;token_example&quot;}</p>
         */
        public Builder kialiArmsAuthTokens(String kialiArmsAuthTokens) {
            this.putBodyParameter("KialiArmsAuthTokens", kialiArmsAuthTokens);
            this.kialiArmsAuthTokens = kialiArmsAuthTokens;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Mesh Topology feature. To enable this feature, make sure that you have enabled Prometheus monitoring. If Prometheus monitoring is disabled, the Mesh Topology feature must be disabled. Valid values:````</p>
         * <ul>
         * <li><code>true</code>: enables the Mesh Topology feature.</li>
         * <li><code>false</code>: disables the Mesh Topology feature.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder kialiEnabled(Boolean kialiEnabled) {
            this.putBodyParameter("KialiEnabled", kialiEnabled);
            this.kialiEnabled = kialiEnabled;
            return this;
        }

        /**
         * <p>Specifies Classic Load Balancer (CLB) instances by using annotations when the Mesh Topology feature is enabled. These CLB instances are used to access the Mesh Topology feature in different clusters.</p>
         * <p>This parameter is a JSON-encoded string. The key in the JSON object is the ID of a cluster on the data plane, and the value is the annotation content of the Mesh Topology service in the cluster.</p>
         * <p>For more information about how to configure CLB instances by using annotations, see <a href="https://www.alibabacloud.com/help/container-service-for-kubernetes/latest/use-annotations-to-configure-load-balancing-1">Add annotations to the YAML file of a Service to configure CLB instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;c31e3b******5634b&quot;:{&quot;service.beta.kubernetes.io/alibaba-cloud-loadbalancer-address-type&quot;:&quot;intranet&quot;}}</p>
         */
        public Builder kialiServiceAnnotations(String kialiServiceAnnotations) {
            this.putBodyParameter("KialiServiceAnnotations", kialiServiceAnnotations);
            this.kialiServiceAnnotations = kialiServiceAnnotations;
            return this;
        }

        /**
         * <p>The labels for isolated workloads.</p>
         * 
         * <strong>example:</strong>
         * <p>name=xx,region=xx</p>
         */
        public Builder labelsForOffloadedWorkloads(String labelsForOffloadedWorkloads) {
            this.putQueryParameter("LabelsForOffloadedWorkloads", labelsForOffloadedWorkloads);
            this.labelsForOffloadedWorkloads = labelsForOffloadedWorkloads;
            return this;
        }

        /**
         * <p>The lifecycle of the sidecar proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;postStart&quot;:{&quot;exec&quot;:{&quot;command&quot;:[&quot;pilot-agent&quot;,&quot;wait&quot;]}},&quot;preStop&quot;:{&quot;exec&quot;:{&quot;command&quot;:[&quot;/bin/sh&quot;,&quot;-c&quot;,&quot;sleep 15&quot;]}}}</p>
         */
        public Builder lifecycle(String lifecycle) {
            this.putBodyParameter("Lifecycle", lifecycle);
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * <p>The configurations of cross-region load balancing. Valid values:</p>
         * <ul>
         * <li><code>failover</code>: the configurations of cross-region failover. Example:</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>failover: [// Cross-region failover configurations of the struct type. 
         *         {
         *             // If a service fails in the China (Beijing) region, the traffic is redirected to the same service in the China (Hangzhou) region. 
         *             from: &quot;cn-beijing&quot;, 
         *             to: &quot;cn-hangzhou&quot;,
         *         }
         *     ]
         * </code></pre>
         * <ul>
         * <li><code>distribute</code>: the configurations of cross-region traffic distribution. Example:</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>distribute: [// Cross-region traffic distribution configurations of the struct type. 
         *         {
         *             // For traffic that is routed to the China (Beijing) region, 70% of the traffic is allocated to the China (Beijing) region and the rest of the traffic is redirected to the China (Hangzhou) region. 
         *             &quot;from&quot;: &quot;cn-beijing&quot;,
         *             &quot;to&quot;: {
         *                 &quot;cn-beijing&quot;: 70,
         *                 &quot;cn-hangzhou&quot;: 30,
         *             }
         *         }
         *     ]
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{&quot;failover&quot;:[{&quot;from&quot;:&quot;cn-hangzhou&quot;,&quot;to&quot;:&quot;cn-shanghai&quot;}]}</p>
         */
        public Builder localityLBConf(String localityLBConf) {
            this.putBodyParameter("LocalityLBConf", localityLBConf);
            this.localityLBConf = localityLBConf;
            return this;
        }

        /**
         * <p>Specifies whether to enable cross-region load balancing. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables cross-region load balancing.</li>
         * <li><code>false</code>: disables cross-region load balancing.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder localityLoadBalancing(Boolean localityLoadBalancing) {
            this.putBodyParameter("LocalityLoadBalancing", localityLoadBalancing);
            this.localityLoadBalancing = localityLoadBalancing;
            return this;
        }

        /**
         * <p>The number of worker threads used by the sidecar proxy on the data plane.</p>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        public Builder logLevel(String logLevel) {
            this.putBodyParameter("LogLevel", logLevel);
            this.logLevel = logLevel;
            return this;
        }

        /**
         * <p>Specifies whether to enable Microservices Engine (MSE). Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder MSEEnabled(Boolean MSEEnabled) {
            this.putBodyParameter("MSEEnabled", MSEEnabled);
            this.MSEEnabled = MSEEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable Transport Layer Security (TLS) acceleration based on MultiBuffer.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder multiBufferEnabled(Boolean multiBufferEnabled) {
            this.putBodyParameter("MultiBufferEnabled", multiBufferEnabled);
            this.multiBufferEnabled = multiBufferEnabled;
            return this;
        }

        /**
         * <p>The pull-request latency. By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>0.02s</p>
         */
        public Builder multiBufferPollDelay(String multiBufferPollDelay) {
            this.putBodyParameter("MultiBufferPollDelay", multiBufferPollDelay);
            this.multiBufferPollDelay = multiBufferPollDelay;
            return this;
        }

        /**
         * <p>Specifies whether to enable MySQL Filter. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables MySQL Filter.</li>
         * <li><code>false</code>: disables MySQL Filter.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder mysqlFilterEnabled(Boolean mysqlFilterEnabled) {
            this.putBodyParameter("MysqlFilterEnabled", mysqlFilterEnabled);
            this.mysqlFilterEnabled = mysqlFilterEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to clear feature labels on nodes when NFD is disabled.</p>
         * <p>This parameter is valid only when the <code>NFDEnabled</code> parameter is set to <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder NFDEnabled(Boolean NFDEnabled) {
            this.putBodyParameter("NFDEnabled", NFDEnabled);
            this.NFDEnabled = NFDEnabled;
            return this;
        }

        /**
         * <p>The minimum number of CPU cores requested by the proxy service that exports Tracing Analysis data. For example, <code>1000m</code> indicates one CPU core.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder NFDLabelPruned(Boolean NFDLabelPruned) {
            this.putBodyParameter("NFDLabelPruned", NFDLabelPruned);
            this.NFDLabelPruned = NFDLabelPruned;
            return this;
        }

        /**
         * <p>The maximum size of the memory that is available to the pod that injects OPA proxies into application pods. For example, <code>1024Mi</code> indicates 1024 MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1000m</p>
         */
        public Builder OPAInjectorCPULimit(String OPAInjectorCPULimit) {
            this.putBodyParameter("OPAInjectorCPULimit", OPAInjectorCPULimit);
            this.OPAInjectorCPULimit = OPAInjectorCPULimit;
            return this;
        }

        /**
         * <p>The minimum size of the memory requested by the pod that injects OPA proxies into application pods. For example, <code>50 Mi</code> indicates 50 MB.</p>
         * 
         * <strong>example:</strong>
         * <p>80m</p>
         */
        public Builder OPAInjectorCPURequirement(String OPAInjectorCPURequirement) {
            this.putBodyParameter("OPAInjectorCPURequirement", OPAInjectorCPURequirement);
            this.OPAInjectorCPURequirement = OPAInjectorCPURequirement;
            return this;
        }

        /**
         * <p>Specifies whether to create a CLB instance for accessing the ASM mesh topology.</p>
         * 
         * <strong>example:</strong>
         * <p>1024Mi</p>
         */
        public Builder OPAInjectorMemoryLimit(String OPAInjectorMemoryLimit) {
            this.putBodyParameter("OPAInjectorMemoryLimit", OPAInjectorMemoryLimit);
            this.OPAInjectorMemoryLimit = OPAInjectorMemoryLimit;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores that are available to the pod that injects OPA proxies into application pods. For example, <code>1000m</code> indicates one CPU core.</p>
         * 
         * <strong>example:</strong>
         * <p>50Mi</p>
         */
        public Builder OPAInjectorMemoryRequirement(String OPAInjectorMemoryRequirement) {
            this.putBodyParameter("OPAInjectorMemoryRequirement", OPAInjectorMemoryRequirement);
            this.OPAInjectorMemoryRequirement = OPAInjectorMemoryRequirement;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores that are available to the OPA proxy container.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder OPALimitCPU(String OPALimitCPU) {
            this.putBodyParameter("OPALimitCPU", OPALimitCPU);
            this.OPALimitCPU = OPALimitCPU;
            return this;
        }

        /**
         * <p>The maximum size of the memory that is available to the OPA proxy container.</p>
         * 
         * <strong>example:</strong>
         * <p>1024Mi</p>
         */
        public Builder OPALimitMemory(String OPALimitMemory) {
            this.putBodyParameter("OPALimitMemory", OPALimitMemory);
            this.OPALimitMemory = OPALimitMemory;
            return this;
        }

        /**
         * <p>The log level of the OPA proxy container.</p>
         * <ul>
         * <li><code>info</code>: outputs all information.</li>
         * <li><code>debug</code>: outputs debugging and error information.</li>
         * <li><code>error</code>: outputs only error information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        public Builder OPALogLevel(String OPALogLevel) {
            this.putBodyParameter("OPALogLevel", OPALogLevel);
            this.OPALogLevel = OPALogLevel;
            return this;
        }

        /**
         * <p>The number of CPU cores that are requested by the OPA proxy container.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder OPARequestCPU(String OPARequestCPU) {
            this.putBodyParameter("OPARequestCPU", OPARequestCPU);
            this.OPARequestCPU = OPARequestCPU;
            return this;
        }

        /**
         * <p>The size of the memory that is requested by the OPA proxy container.</p>
         * 
         * <strong>example:</strong>
         * <p>512Mi</p>
         */
        public Builder OPARequestMemory(String OPARequestMemory) {
            this.putBodyParameter("OPARequestMemory", OPARequestMemory);
            this.OPARequestMemory = OPARequestMemory;
            return this;
        }

        /**
         * <p>The minimum number of CPU cores requested by the pod that injects OPA proxies into application pods. For example, <code>1000m</code> indicates one CPU core.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder OPAScopeInjected(Boolean OPAScopeInjected) {
            this.putBodyParameter("OPAScopeInjected", OPAScopeInjected);
            this.OPAScopeInjected = OPAScopeInjected;
            return this;
        }

        /**
         * <p>Specifies whether to enable the OPA plug-in. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables the OPA plug-in.</li>
         * <li><code>false</code>: disables the OPA plug-in.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder opaEnabled(Boolean opaEnabled) {
            this.putBodyParameter("OpaEnabled", opaEnabled);
            this.opaEnabled = opaEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to install the Open Policy Agent (OPA) plug-in. Valid values:</p>
         * <ul>
         * <li><code>true</code>: installs the OPA plug-in.</li>
         * <li><code>false</code>: does not install the OPA plug-in.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder openAgentPolicy(Boolean openAgentPolicy) {
            this.putBodyParameter("OpenAgentPolicy", openAgentPolicy);
            this.openAgentPolicy = openAgentPolicy;
            return this;
        }

        /**
         * <p>The policy for accessing external services. Valid values:</p>
         * <ul>
         * <li><code>ALLOW_ANY</code>: allows access to all external services.</li>
         * <li><code>REGISTRY_ONLY</code>: allows access to only the external services that are defined in the ServiceEntry of the ASM instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALLOW_ANY</p>
         */
        public Builder outboundTrafficPolicy(String outboundTrafficPolicy) {
            this.putBodyParameter("OutboundTrafficPolicy", outboundTrafficPolicy);
            this.outboundTrafficPolicy = outboundTrafficPolicy;
            return this;
        }

        /**
         * <p>Specifies whether to support HTTP/3.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder pilotEnableQuicListeners(Boolean pilotEnableQuicListeners) {
            this.putBodyParameter("PilotEnableQuicListeners", pilotEnableQuicListeners);
            this.pilotEnableQuicListeners = pilotEnableQuicListeners;
            return this;
        }

        /**
         * <p>The endpoint of Prometheus monitoring. If you use ARMS Prometheus, set this parameter to the endpoint of Prometheus provided by ARMS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://prometheus:9090">http://prometheus:9090</a></p>
         */
        public Builder prometheusUrl(String prometheusUrl) {
            this.putBodyParameter("PrometheusUrl", prometheusUrl);
            this.prometheusUrl = prometheusUrl;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores that are available to the istio-init container.</p>
         * 
         * <strong>example:</strong>
         * <p>2000m</p>
         */
        public Builder proxyInitCPUResourceLimit(String proxyInitCPUResourceLimit) {
            this.putBodyParameter("ProxyInitCPUResourceLimit", proxyInitCPUResourceLimit);
            this.proxyInitCPUResourceLimit = proxyInitCPUResourceLimit;
            return this;
        }

        /**
         * <p>The number of CPU cores that are requested by the istio-init container.</p>
         * 
         * <strong>example:</strong>
         * <p>10m</p>
         */
        public Builder proxyInitCPUResourceRequest(String proxyInitCPUResourceRequest) {
            this.putBodyParameter("ProxyInitCPUResourceRequest", proxyInitCPUResourceRequest);
            this.proxyInitCPUResourceRequest = proxyInitCPUResourceRequest;
            return this;
        }

        /**
         * <p>The maximum size of the memory that is available to the istio-init container.</p>
         * 
         * <strong>example:</strong>
         * <p>1024Mi</p>
         */
        public Builder proxyInitMemoryResourceLimit(String proxyInitMemoryResourceLimit) {
            this.putBodyParameter("ProxyInitMemoryResourceLimit", proxyInitMemoryResourceLimit);
            this.proxyInitMemoryResourceLimit = proxyInitMemoryResourceLimit;
            return this;
        }

        /**
         * <p>The size of the memory that is requested by the istio-init container.</p>
         * 
         * <strong>example:</strong>
         * <p>10Mi</p>
         */
        public Builder proxyInitMemoryResourceRequest(String proxyInitMemoryResourceRequest) {
            this.putBodyParameter("ProxyInitMemoryResourceRequest", proxyInitMemoryResourceRequest);
            this.proxyInitMemoryResourceRequest = proxyInitMemoryResourceRequest;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores that are available to the sidecar proxy container.</p>
         * 
         * <strong>example:</strong>
         * <p>2000m</p>
         */
        public Builder proxyLimitCPU(String proxyLimitCPU) {
            this.putBodyParameter("ProxyLimitCPU", proxyLimitCPU);
            this.proxyLimitCPU = proxyLimitCPU;
            return this;
        }

        /**
         * <p>The maximum size of the memory that is available to the sidecar proxy container.</p>
         * 
         * <strong>example:</strong>
         * <p>1024Mi</p>
         */
        public Builder proxyLimitMemory(String proxyLimitMemory) {
            this.putBodyParameter("ProxyLimitMemory", proxyLimitMemory);
            this.proxyLimitMemory = proxyLimitMemory;
            return this;
        }

        /**
         * <p>The number of CPU cores that are requested by the sidecar proxy container.</p>
         * 
         * <strong>example:</strong>
         * <p>100m</p>
         */
        public Builder proxyRequestCPU(String proxyRequestCPU) {
            this.putBodyParameter("ProxyRequestCPU", proxyRequestCPU);
            this.proxyRequestCPU = proxyRequestCPU;
            return this;
        }

        /**
         * <p>The size of the memory that is requested by the sidecar proxy container.</p>
         * 
         * <strong>example:</strong>
         * <p>128Mi</p>
         */
        public Builder proxyRequestMemory(String proxyRequestMemory) {
            this.putBodyParameter("ProxyRequestMemory", proxyRequestMemory);
            this.proxyRequestMemory = proxyRequestMemory;
            return this;
        }

        /**
         * <p>The mode in which the sidecar proxy intercepts inbound traffic. Valid values:</p>
         * <ul>
         * <li><code>REDIRECT</code>: The sidecar proxy intercepts inbound traffic in the REDIRECT mode.</li>
         * <li><code>TPROXY</code>: The sidecar proxy intercepts inbound traffic in the TPROXY mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;inclusionRegexps&quot;:&quot;.<em>adaptive_concurrency.</em>&quot;}</p>
         */
        public Builder proxyStatsMatcher(String proxyStatsMatcher) {
            this.putBodyParameter("ProxyStatsMatcher", proxyStatsMatcher);
            this.proxyStatsMatcher = proxyStatsMatcher;
            return this;
        }

        /**
         * <p>Specifies whether to enable Redis Filter. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables Redis Filter.</li>
         * <li><code>false</code>: disables Redis Filter.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder redisFilterEnabled(Boolean redisFilterEnabled) {
            this.putBodyParameter("RedisFilterEnabled", redisFilterEnabled);
            this.redisFilterEnabled = redisFilterEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable SMC optimization.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder SMCEnabled(Boolean SMCEnabled) {
            this.putBodyParameter("SMCEnabled", SMCEnabled);
            this.SMCEnabled = SMCEnabled;
            return this;
        }

        /**
         * <p>The ID of the ASM instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cb8963379255149cb98c8686f274x****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores that are available to the pod where a sidecar proxy injector resides.</p>
         * 
         * <strong>example:</strong>
         * <p>4000m</p>
         */
        public Builder sidecarInjectorLimitCPU(String sidecarInjectorLimitCPU) {
            this.putBodyParameter("SidecarInjectorLimitCPU", sidecarInjectorLimitCPU);
            this.sidecarInjectorLimitCPU = sidecarInjectorLimitCPU;
            return this;
        }

        /**
         * <p>The maximum size of the memory that is available to the pod where a sidecar proxy injector resides.</p>
         * 
         * <strong>example:</strong>
         * <p>2048Mi</p>
         */
        public Builder sidecarInjectorLimitMemory(String sidecarInjectorLimitMemory) {
            this.putBodyParameter("SidecarInjectorLimitMemory", sidecarInjectorLimitMemory);
            this.sidecarInjectorLimitMemory = sidecarInjectorLimitMemory;
            return this;
        }

        /**
         * <p>The number of CPU cores that are requested by the pod where a sidecar proxy injector resides.</p>
         * 
         * <strong>example:</strong>
         * <p>1000m</p>
         */
        public Builder sidecarInjectorRequestCPU(String sidecarInjectorRequestCPU) {
            this.putBodyParameter("SidecarInjectorRequestCPU", sidecarInjectorRequestCPU);
            this.sidecarInjectorRequestCPU = sidecarInjectorRequestCPU;
            return this;
        }

        /**
         * <p>The size of the memory that is requested by the pod where a sidecar proxy injector resides.</p>
         * 
         * <strong>example:</strong>
         * <p>512Mi</p>
         */
        public Builder sidecarInjectorRequestMemory(String sidecarInjectorRequestMemory) {
            this.putBodyParameter("SidecarInjectorRequestMemory", sidecarInjectorRequestMemory);
            this.sidecarInjectorRequestMemory = sidecarInjectorRequestMemory;
            return this;
        }

        /**
         * <p>Other configurations of automatic sidecar proxy injection, in the YAML format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;injectedAnnotations&quot;:{&quot;test/istio-init&quot;:&quot;runtime/default2&quot;,&quot;test/istio-proxy&quot;:&quot;runtime/default&quot;},&quot;replicaCount&quot;:2,&quot;nodeSelector&quot;:{&quot;beta.kubernetes.io/os&quot;:&quot;linux&quot;}}</p>
         */
        public Builder sidecarInjectorWebhookAsYaml(String sidecarInjectorWebhookAsYaml) {
            this.putBodyParameter("SidecarInjectorWebhookAsYaml", sidecarInjectorWebhookAsYaml);
            this.sidecarInjectorWebhookAsYaml = sidecarInjectorWebhookAsYaml;
            return this;
        }

        /**
         * <p>Specifies whether to enable Prometheus monitoring. We recommend that you enable <a href="https://arms.console.aliyun.com/">ARMS Prometheus</a>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables Prometheus monitoring.</li>
         * <li><code>false</code>: disables Prometheus monitoring.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder telemetry(Boolean telemetry) {
            this.putBodyParameter("Telemetry", telemetry);
            this.telemetry = telemetry;
            return this;
        }

        /**
         * <p>The maximum period of time that the sidecar proxy waits for requests to be processed before the proxy is stopped. For example, if you want to specify a period of 5 seconds, set this parameter to 5s.</p>
         * 
         * <strong>example:</strong>
         * <p>5s</p>
         */
        public Builder terminationDrainDuration(String terminationDrainDuration) {
            this.putBodyParameter("TerminationDrainDuration", terminationDrainDuration);
            this.terminationDrainDuration = terminationDrainDuration;
            return this;
        }

        /**
         * <p>Specifies whether to enable Thrift Filter. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables Thrift Filter.</li>
         * <li><code>false</code>: disables Thrift Filter.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder thriftFilterEnabled(Boolean thriftFilterEnabled) {
            this.putBodyParameter("ThriftFilterEnabled", thriftFilterEnabled);
            this.thriftFilterEnabled = thriftFilterEnabled;
            return this;
        }

        /**
         * <p>The custom tag of Tracing Analysis. Specify this parameter in the JSON format.</p>
         * <pre><code>{
         *     &quot;name1&quot;: CustomTag,
         *     &quot;name2&quot;: CustomTag
         * }
         * </code></pre>
         * <p>Tag key: literal, header, or environment.</p>
         * <pre><code>{
         *     &quot;literal&quot;: {
         *         &quot;value&quot;: &quot;Fixed value&quot;
         *     }
         *     &quot;header&quot;: {
         *         &quot;name&quot;: &quot;Header name&quot;
         *         &quot;defaultValue&quot;: &quot;Default value that is used if the specified header does not exist&quot;
         *     }
         *     &quot;environment&quot;: {
         *         &quot;name&quot;: &quot;Environment variable name&quot;
         *         &quot;defaultValue&quot;: &quot;Default value that is used if the specified environment variable does not exist&quot;
         *     }
         * }
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mytag&quot;: {&quot;literal&quot;:{&quot;value&quot;:&quot;test&quot;}}}</p>
         */
        public Builder traceCustomTags(String traceCustomTags) {
            this.putBodyParameter("TraceCustomTags", traceCustomTags);
            this.traceCustomTags = traceCustomTags;
            return this;
        }

        /**
         * <p>The maximum length of the request path contained in the HttpUrl span tag. Default value: <code>256</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        public Builder traceMaxPathTagLength(String traceMaxPathTagLength) {
            this.putBodyParameter("TraceMaxPathTagLength", traceMaxPathTagLength);
            this.traceMaxPathTagLength = traceMaxPathTagLength;
            return this;
        }

        /**
         * <p>The sampling percentage of Tracing Analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder traceSampling(Float traceSampling) {
            this.putBodyParameter("TraceSampling", traceSampling);
            this.traceSampling = traceSampling;
            return this;
        }

        /**
         * <p>Specifies whether to enable Managed Service for OpenTelemetry. (Before you enable <a href="https://tracing-analysis.console.aliyun.com/">Managed Service for OpenTelemetry</a>, make sure that you have activated it.) Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder tracing(Boolean tracing) {
            this.putBodyParameter("Tracing", tracing);
            this.tracing = tracing;
            return this;
        }

        /**
         * <p>The maximum size of the memory that is available to the proxy service that exports Tracing Analysis data. For example, <code>1Mi</code> indicates 1 MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1000Mi</p>
         */
        public Builder tracingOnExtZipkinLimitCPU(String tracingOnExtZipkinLimitCPU) {
            this.putBodyParameter("TracingOnExtZipkinLimitCPU", tracingOnExtZipkinLimitCPU);
            this.tracingOnExtZipkinLimitCPU = tracingOnExtZipkinLimitCPU;
            return this;
        }

        /**
         * <p>The retention period for the access logs of the ingress gateway. Unit: day. The logs are collected by using Log Service. For example, <code>30</code> indicates 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>1024Mi</p>
         */
        public Builder tracingOnExtZipkinLimitMemory(String tracingOnExtZipkinLimitMemory) {
            this.putBodyParameter("TracingOnExtZipkinLimitMemory", tracingOnExtZipkinLimitMemory);
            this.tracingOnExtZipkinLimitMemory = tracingOnExtZipkinLimitMemory;
            return this;
        }

        /**
         * <p>The number of replicas that are available to the proxy service that exports Managed Service for OpenTelemetry data.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder tracingOnExtZipkinReplicaCount(String tracingOnExtZipkinReplicaCount) {
            this.putBodyParameter("TracingOnExtZipkinReplicaCount", tracingOnExtZipkinReplicaCount);
            this.tracingOnExtZipkinReplicaCount = tracingOnExtZipkinReplicaCount;
            return this;
        }

        /**
         * <p>The minimum size of the memory requested by the proxy service that exports Tracing Analysis data. For example, <code>1Mi</code> indicates 1 MB.</p>
         * 
         * <strong>example:</strong>
         * <p>200m</p>
         */
        public Builder tracingOnExtZipkinRequestCPU(String tracingOnExtZipkinRequestCPU) {
            this.putBodyParameter("TracingOnExtZipkinRequestCPU", tracingOnExtZipkinRequestCPU);
            this.tracingOnExtZipkinRequestCPU = tracingOnExtZipkinRequestCPU;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores that are available to the proxy service that exports Tracing Analysis data. For example, <code>1000m</code> indicates one CPU core.</p>
         * 
         * <strong>example:</strong>
         * <p>200Mi</p>
         */
        public Builder tracingOnExtZipkinRequestMemory(String tracingOnExtZipkinRequestMemory) {
            this.putBodyParameter("TracingOnExtZipkinRequestMemory", tracingOnExtZipkinRequestMemory);
            this.tracingOnExtZipkinRequestMemory = tracingOnExtZipkinRequestMemory;
            return this;
        }

        /**
         * <p>Specifies whether to enable WebAssembly Filter. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables WebAssembly Filter.</li>
         * <li><code>false</code>: disables WebAssembly Filter.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
