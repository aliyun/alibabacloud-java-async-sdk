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
 * {@link CreateServiceMeshRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceMeshRequest</p>
 */
public class CreateServiceMeshRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessLogEnabled")
    private Boolean accessLogEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessLogFile")
    private String accessLogFile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessLogFormat")
    private String accessLogFormat;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiServerLoadBalancerSpec")
    private String apiServerLoadBalancerSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiServerPublicEip")
    private Boolean apiServerPublicEip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuditProject")
    private String auditProject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CRAggregationEnabled")
    private Boolean CRAggregationEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CertChain")
    private String certChain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterDomain")
    private String clusterDomain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterSpec")
    private String clusterSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigSourceEnabled")
    private Boolean configSourceEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigSourceNacosID")
    private String configSourceNacosID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ControlPlaneLogEnabled")
    private Boolean controlPlaneLogEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ControlPlaneLogProject")
    private String controlPlaneLogProject;

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
    @com.aliyun.core.annotation.NameInMap("DubboFilterEnabled")
    private Boolean dubboFilterEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableACMG")
    private Boolean enableACMG;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableAmbient")
    private Boolean enableAmbient;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableAudit")
    private Boolean enableAudit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableCRHistory")
    private Boolean enableCRHistory;

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
    @com.aliyun.core.annotation.NameInMap("ExistingCaType")
    @Deprecated
    private String existingCaType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExistingRootCaCert")
    private String existingRootCaCert;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExistingRootCaKey")
    @Deprecated
    private String existingRootCaKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilterGatewayClusterConfig")
    private Boolean filterGatewayClusterConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayAPIEnabled")
    private Boolean gatewayAPIEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GuestCluster")
    private String guestCluster;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeIPRanges")
    private String includeIPRanges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IstioVersion")
    private String istioVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KialiEnabled")
    private Boolean kialiEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LocalityLBConf")
    private String localityLBConf;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LocalityLoadBalancing")
    private Boolean localityLoadBalancing;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MSEEnabled")
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
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

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
    @com.aliyun.core.annotation.NameInMap("OpaEnabled")
    private Boolean opaEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenAgentPolicy")
    private Boolean openAgentPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PilotLoadBalancerSpec")
    private String pilotLoadBalancerSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaygroundScene")
    private String playgroundScene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrometheusUrl")
    private String prometheusUrl;

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
    @com.aliyun.core.annotation.NameInMap("RedisFilterEnabled")
    private Boolean redisFilterEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Telemetry")
    private Boolean telemetry;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThriftFilterEnabled")
    private Boolean thriftFilterEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TraceSampling")
    private Float traceSampling;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tracing")
    private Boolean tracing;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseExistingCA")
    private Boolean useExistingCA;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VSwitches")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitches;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WebAssemblyFilterEnabled")
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
        this.certChain = builder.certChain;
        this.chargeType = builder.chargeType;
        this.clusterDomain = builder.clusterDomain;
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
        this.enableACMG = builder.enableACMG;
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
        this.playgroundScene = builder.playgroundScene;
        this.prometheusUrl = builder.prometheusUrl;
        this.proxyLimitCPU = builder.proxyLimitCPU;
        this.proxyLimitMemory = builder.proxyLimitMemory;
        this.proxyRequestCPU = builder.proxyRequestCPU;
        this.proxyRequestMemory = builder.proxyRequestMemory;
        this.redisFilterEnabled = builder.redisFilterEnabled;
        this.regionId = builder.regionId;
        this.tag = builder.tag;
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
     * @return certChain
     */
    public String getCertChain() {
        return this.certChain;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clusterDomain
     */
    public String getClusterDomain() {
        return this.clusterDomain;
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
     * @return enableACMG
     */
    public Boolean getEnableACMG() {
        return this.enableACMG;
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
     * @return playgroundScene
     */
    public String getPlaygroundScene() {
        return this.playgroundScene;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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
        private String certChain; 
        private String chargeType; 
        private String clusterDomain; 
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
        private Boolean enableACMG; 
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
        private String playgroundScene; 
        private String prometheusUrl; 
        private String proxyLimitCPU; 
        private String proxyLimitMemory; 
        private String proxyRequestCPU; 
        private String proxyRequestMemory; 
        private Boolean redisFilterEnabled; 
        private String regionId; 
        private java.util.List<Tag> tag; 
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
            this.certChain = request.certChain;
            this.chargeType = request.chargeType;
            this.clusterDomain = request.clusterDomain;
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
            this.enableACMG = request.enableACMG;
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
            this.playgroundScene = request.playgroundScene;
            this.prometheusUrl = request.prometheusUrl;
            this.proxyLimitCPU = request.proxyLimitCPU;
            this.proxyLimitMemory = request.proxyLimitMemory;
            this.proxyRequestCPU = request.proxyRequestCPU;
            this.proxyRequestMemory = request.proxyRequestMemory;
            this.redisFilterEnabled = request.redisFilterEnabled;
            this.regionId = request.regionId;
            this.tag = request.tag;
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
         * <p>Specifies whether to enable access log collection. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <p>Specifies whether to enable access log collection. Valid values:</p>
         * <ul>
         * <li>&quot;&quot;: disables access log collection.</li>
         * <li><code>/dev/stdout</code>: enables access log collection. Access logs are written to /dev/stdout.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/dev/stdout</p>
         */
        public Builder accessLogFile(String accessLogFile) {
            this.putBodyParameter("AccessLogFile", accessLogFile);
            this.accessLogFile = accessLogFile;
            return this;
        }

        /**
         * <p>Custom fields of access logs. To set this parameter, you must enable access log collection. Otherwise, you cannot set this parameter. The value must be a JSON string. The following key values must be contained: authority_for, bytes_received, bytes_sent, downstream_local_address, downstream_remote_address, duration, istio_policy_status, method, path, protocol, requested_server_name, response_code, response_flags, route_name, start_time, trace_id, upstream_cluster, upstream_host, upstream_local_address, upstream_service_time, upstream_transport_failure_reason, user_agent, and x_forwarded_for.</p>
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
         * <p>The SLS project from which access logs are collected.</p>
         * 
         * <strong>example:</strong>
         * <p>mesh-log-cf245a429b6ff4b6e97f20797758*****</p>
         */
        public Builder accessLogProject(String accessLogProject) {
            this.putBodyParameter("AccessLogProject", accessLogProject);
            this.accessLogProject = accessLogProject;
            return this;
        }

        /**
         * <p>Specifies whether to enable gRPC Access Log Service (ALS) of Envoy. gRPC is short for Google Remote Procedure Call. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <p>The endpoint of Envoy&quot;s gRPC ALS.</p>
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
         * <p>The port of Envoy&quot;s gRPC ALS.</p>
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
         * <p>The type of the Classic Load Balancer (CLB) instance that is bound to the API server. Valid values: <code>slb.s1.small</code>, <code>slb.s2.small</code>, <code>slb.s2.medium</code>, <code>slb.s3.small</code>, <code>slb.s3.medium</code>, and <code>slb.s3.large</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>slb.s1.small</p>
         */
        public Builder apiServerLoadBalancerSpec(String apiServerLoadBalancerSpec) {
            this.putBodyParameter("ApiServerLoadBalancerSpec", apiServerLoadBalancerSpec);
            this.apiServerLoadBalancerSpec = apiServerLoadBalancerSpec;
            return this;
        }

        /**
         * <p>Specifies whether to expose the API server to the Internet. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * <blockquote>
         * <p>If you set this parameter to <code>false</code>, the API server cannot be accessed over the Internet.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder apiServerPublicEip(Boolean apiServerPublicEip) {
            this.putBodyParameter("ApiServerPublicEip", apiServerPublicEip);
            this.apiServerPublicEip = apiServerPublicEip;
            return this;
        }

        /**
         * <p>The name of the Log Service project that is used for mesh audit.</p>
         * <p>Default value: mesh-log-{ASM instance ID}.</p>
         * 
         * <strong>example:</strong>
         * <p>mesh-log-xxxx</p>
         */
        public Builder auditProject(String auditProject) {
            this.putBodyParameter("AuditProject", auditProject);
            this.auditProject = auditProject;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal for the CLB instance if the CLB instance uses the subscription billing method. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The auto-renewal period of the subscription CLB instance. This parameter is valid only if <code>ChargeType</code> is set to <code>PrePay</code>. If the original subscription period of the CLB instance is less than one year, the value of this parameter indicates the number of months for auto-renewal. If the original subscription period of the CLB instance is more than one year, the value of this parameter indicates the number of years for auto-renewal.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putBodyParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>Specifies whether to allow the Kubernetes API of clusters on the data plane to access Istio resources. The version of the ASM instance must be V1.9.7.93 or later. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
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
         * <p>Base64 encoded PEM certificate chain.</p>
         */
        public Builder certChain(String certChain) {
            this.putBodyParameter("CertChain", certChain);
            this.certChain = certChain;
            return this;
        }

        /**
         * <p>The billing method of the CLB instance. Valid values:</p>
         * <ul>
         * <li><code>PayOnDemand</code>: pay-as-you-go</li>
         * <li><code>PrePay</code>: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePay</p>
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>ASM cluster domain.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster.local</p>
         */
        public Builder clusterDomain(String clusterDomain) {
            this.putBodyParameter("ClusterDomain", clusterDomain);
            this.clusterDomain = clusterDomain;
            return this;
        }

        /**
         * <p>The edition of the ASM instance. Valid values:</p>
         * <ul>
         * <li><p><code>standard</code>: Standard Edition</p>
         * </li>
         * <li><p><code>enterprise</code>: Enterprise Edition</p>
         * </li>
         * <li><p><code>ultimate</code>: Ultimate Edition</p>
         * </li>
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
         * <p>Specifies whether to enable the external service registry. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <p>Specifies whether to enable the collection of control plane logs. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder controlPlaneLogEnabled(Boolean controlPlaneLogEnabled) {
            this.putBodyParameter("ControlPlaneLogEnabled", controlPlaneLogEnabled);
            this.controlPlaneLogEnabled = controlPlaneLogEnabled;
            return this;
        }

        /**
         * <p>The name of the Log Service project that is used to collect the logs of the control plane.</p>
         * 
         * <strong>example:</strong>
         * <p>mesh-log-cf245a429b6ff4b6e97f20797758*****</p>
         */
        public Builder controlPlaneLogProject(String controlPlaneLogProject) {
            this.putBodyParameter("ControlPlaneLogProject", controlPlaneLogProject);
            this.controlPlaneLogProject = controlPlaneLogProject;
            return this;
        }

        /**
         * <p>Specifies whether to use a custom Prometheus instance. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <li><code>true</code>: uses a self-managed Zipkin system to collect tracing data.</li>
         * <li><code>false</code>: uses Alibaba Cloud Tracing Analysis to collect tracing data.</li>
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
         * <p>Specifies whether to enable the DNS proxy feature. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <p>Specifies whether to enable Dubbo Filter. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <p>The edition of the ASM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Pro</p>
         */
        public Builder edition(String edition) {
            this.putBodyParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * <p>Specifies whether to enable the ACMG mode for the ASM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableACMG(Boolean enableACMG) {
            this.putBodyParameter("EnableACMG", enableACMG);
            this.enableACMG = enableACMG;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Ambient Mesh mode for the ASM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableAmbient(Boolean enableAmbient) {
            this.putBodyParameter("EnableAmbient", enableAmbient);
            this.enableAmbient = enableAmbient;
            return this;
        }

        /**
         * <p>Specifies whether to enable the mesh audit feature. To enable this feature, make sure that you have activated <a href="https://sls.console.aliyun.com/">Log Service</a>. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <p>Specifies whether to enable the rollback feature for Istio resources. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
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
         * <p>Specifies whether to enable Secret Discovery Service (SDS). Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <p>The IP ranges in CIDR form to be excluded from redirection to the sidecar proxy in the ASM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100.100.10*.***</p>
         */
        public Builder excludeIPRanges(String excludeIPRanges) {
            this.putBodyParameter("ExcludeIPRanges", excludeIPRanges);
            this.excludeIPRanges = excludeIPRanges;
            return this;
        }

        /**
         * <p>The inbound ports to be excluded from redirection to the sidecar proxy in the ASM instance. Separate multiple port numbers with commas (,).</p>
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
         * <p>The outbound ports to be excluded from redirection to the sidecar proxy in the ASM instance. Separate multiple port numbers with commas (,).</p>
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
         * <p>The existing CA certificate, which is encoded in Base64. This parameter is used in scenarios where you migrate open source Istio to ASM. It specifies the content of the ca-cert.pem file in the istio-ca-secret secret. The secret is in the istio-system namespace of the Kubernetes cluster where the open source Istio is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>CA cert content, base64 encoded format.</p>
         */
        public Builder existingCaCert(String existingCaCert) {
            this.putBodyParameter("ExistingCaCert", existingCaCert);
            this.existingCaCert = existingCaCert;
            return this;
        }

        /**
         * <p>The existing CA key, which is encoded in Base64. This parameter is used in scenarios where you migrate open source Istio to ASM. It specifies the content of the ca-key.pem file in the istio-ca-secret secret. The secret is in the istio-system namespace of the Kubernetes cluster where the open source Istio is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>CA key content, base64 encoded format.</p>
         */
        public Builder existingCaKey(String existingCaKey) {
            this.putBodyParameter("ExistingCaKey", existingCaKey);
            this.existingCaKey = existingCaKey;
            return this;
        }

        /**
         * <p>The type of the existing CA certificate. Valid values:</p>
         * <ul>
         * <li>1: Self-signed certificate generated by istiod. The certificate corresponds to the secret named istio-ca-secret in the istio-system namespace. If you use this type of certificate, you must set the <code>ExistingCaCert</code> and <code>ExistingCaKey</code> parameters.</li>
         * <li>2: Administrator-specified certificate. For more information, see <a href="https://istio.io/latest/docs/tasks/security/cert-management/plugin-ca-cert/">plugin ca cert</a>. In most cases, the certificate corresponds to the secret named cacerts in the istio-system namespace. If you use this type of certificate, you must set the <code>ExisingRootCaCert</code> and <code>ExisingRootCaKey</code> parameters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder existingCaType(String existingCaType) {
            this.putBodyParameter("ExistingCaType", existingCaType);
            this.existingCaType = existingCaType;
            return this;
        }

        /**
         * <p>The existing root certificate, which is encoded in Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>Existing CA cert content, base64 encoded format.</p>
         */
        public Builder existingRootCaCert(String existingRootCaCert) {
            this.putBodyParameter("ExistingRootCaCert", existingRootCaCert);
            this.existingRootCaCert = existingRootCaCert;
            return this;
        }

        /**
         * <p>The private key that corresponds to the root certificate, which is encoded in Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>Existing CA key content, base64 encoded format.</p>
         */
        public Builder existingRootCaKey(String existingRootCaKey) {
            this.putBodyParameter("ExistingRootCaKey", existingRootCaKey);
            this.existingRootCaKey = existingRootCaKey;
            return this;
        }

        /**
         * <p>Specifies whether to enable gateway configuration filtering. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <p>When you create an ASM instance, you can add a cluster to the ASM instance. If you do not specify this parameter, no cluster is added to the ASM instance. The cluster and the ASM instance must be in the same vSwitch of the same VPC and have the same domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>ACK cluster id</p>
         */
        public Builder guestCluster(String guestCluster) {
            this.putBodyParameter("GuestCluster", guestCluster);
            this.guestCluster = guestCluster;
            return this;
        }

        /**
         * <p>The IP ranges in CIDR form for which traffic is to be redirected to the sidecar proxy in the ASM instance.</p>
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
         * <p>The Istio version of the ASM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.5.4.1-g5960ec40-aliyun</p>
         */
        public Builder istioVersion(String istioVersion) {
            this.putBodyParameter("IstioVersion", istioVersion);
            this.istioVersion = istioVersion;
            return this;
        }

        /**
         * <p>Specifies whether to enable the mesh topology feature. To enable this feature, make sure that you have enabled Prometheus monitoring. If Prometheus monitoring is disabled, you must set this parameter to <code>false</code>.`` Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <p>The configurations for the access to the nearest instance.</p>
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
         * <p>Specifies whether to route traffic to the nearest instance. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder localityLoadBalancing(Boolean localityLoadBalancing) {
            this.putBodyParameter("LocalityLoadBalancing", localityLoadBalancing);
            this.localityLoadBalancing = localityLoadBalancing;
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
         * <p>Specifies whether to enable MultiBuffer-based Transport Layer Security (TLS) acceleration. Valid values:</p>
         * <ul>
         * <li><p><code>true</code></p>
         * </li>
         * <li><p><code>false</code></p>
         * </li>
         * </ul>
         * <p>Default value: <code>true</code></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder multiBufferEnabled(Boolean multiBufferEnabled) {
            this.putBodyParameter("MultiBufferEnabled", multiBufferEnabled);
            this.multiBufferEnabled = multiBufferEnabled;
            return this;
        }

        /**
         * <p>The pull-request latency. Default value: 30. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30s</p>
         */
        public Builder multiBufferPollDelay(String multiBufferPollDelay) {
            this.putBodyParameter("MultiBufferPollDelay", multiBufferPollDelay);
            this.multiBufferPollDelay = multiBufferPollDelay;
            return this;
        }

        /**
         * <p>Specifies whether to enable MySQL Filter. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <p>The name of the ASM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mesh1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores that are available to the OPA container.</p>
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
         * <p>The maximum size of the memory that is available to the OPA container. You can specify the parameter value in the standard quantity representation form used by Kubernetes. 1 Mi equals 1,024 KB.</p>
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
         * <p>The log level of the OPA container.</p>
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
         * <p>The minimum number of CPU cores that are required by the OPA container. You can specify the parameter value in the standard representation form of CPUs in Kubernetes. For example, if you set the value to 1, one CPU core is required.</p>
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
         * <p>The minimum size of the memory that is required by the OPA container. You can specify the parameter value in the standard quantity representation form used by Kubernetes. 1 Mi equals 1,024 KB.</p>
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
         * <p>Specifies whether to enable the OPA plug-in. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <p>The subscription period of the CLB instance. This parameter is valid only if <code>ChargeType</code> is set to <code>PrePay</code>. The value of this parameter indicates the subscription period of the CLB instance. Unit: month. For example, if the subscription period is one year, set this parameter to 12.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The type of the CLB instance that is bound to Istio Pilot. Valid values: <code>slb.s1.small</code>, <code>slb.s2.small</code>, <code>slb.s2.medium</code>, <code>slb.s3.small</code>, <code>slb.s3.medium</code>, and <code>slb.s3.large</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>slb.s1.small</p>
         */
        public Builder pilotLoadBalancerSpec(String pilotLoadBalancerSpec) {
            this.putBodyParameter("PilotLoadBalancerSpec", pilotLoadBalancerSpec);
            this.pilotLoadBalancerSpec = pilotLoadBalancerSpec;
            return this;
        }

        /**
         * <p>The playground scenario. If you specify this parameter, an ASM playground instance is created. Valid values:</p>
         * <ul>
         * <li>ewmaLb: the exponentially weighted moving average (EWMA) load balancing algorithm.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ewmaLb</p>
         */
        public Builder playgroundScene(String playgroundScene) {
            this.putBodyParameter("PlaygroundScene", playgroundScene);
            this.playgroundScene = playgroundScene;
            return this;
        }

        /**
         * <p>The endpoint of the custom Prometheus instance.</p>
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
         * <p>The maximum number of CPU cores that are available to the proxy container.</p>
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
         * <p>The maximum size of the memory that is available to the proxy container.</p>
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
         * <p>The minimum number of CPU cores that are required by the proxy container.</p>
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
         * <p>The minimum size of the memory that is required by the proxy container.</p>
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
         * <p>Specifies whether to enable Redis Filter. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder redisFilterEnabled(Boolean redisFilterEnabled) {
            this.putBodyParameter("RedisFilterEnabled", redisFilterEnabled);
            this.redisFilterEnabled = redisFilterEnabled;
            return this;
        }

        /**
         * <p>The ID of the region in which the ASM instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Tag of the ASM instance. A tag contains the following information:</p>
         * <ul>
         * <li>key: the name of the tag</li>
         * <li>value: the value of the tag</li>
         * </ul>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Specifies whether to enable Prometheus monitoring. We recommend that you use Prometheus Service of <a href="https://arms.console.aliyun.com/">Application Real-Time Monitoring Service (ARMS)</a>. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <p>Specifies whether to enable Thrift Filter. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <p>Specifies whether to enable the Tracing Analysis feature. Valid values:</p>
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
         * <p>Specifies whether to use an existing CA certificate and private key.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useExistingCA(Boolean useExistingCA) {
            this.putBodyParameter("UseExistingCA", useExistingCA);
            this.useExistingCA = useExistingCA;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the ASM instance is connected.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;vsw-xzegf5dndkbf4m6eg****&quot;]</p>
         */
        public Builder vSwitches(String vSwitches) {
            this.putBodyParameter("VSwitches", vSwitches);
            this.vSwitches = vSwitches;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the ASM instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xzelac2tw4ic7wz31****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>Specifies whether to enable WebAssembly Filter. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
        public CreateServiceMeshRequest build() {
            return new CreateServiceMeshRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateServiceMeshRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceMeshRequest</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>prod</p>
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
}
