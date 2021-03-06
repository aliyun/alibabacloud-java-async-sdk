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
    @NameInMap("CanaryUpgradeEnabled")
    private Boolean canaryUpgradeEnabled;

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
    @NameInMap("FilterGatewayClusterConfig")
    private Boolean filterGatewayClusterConfig;

    @Body
    @NameInMap("GatewayAPIEnabled")
    private Boolean gatewayAPIEnabled;

    @Body
    @NameInMap("GlobalRateLimitEnabled")
    private Boolean globalRateLimitEnabled;

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
        this.canaryUpgradeEnabled = builder.canaryUpgradeEnabled;
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
        this.enableAudit = builder.enableAudit;
        this.enableCRHistory = builder.enableCRHistory;
        this.enableSDSServer = builder.enableSDSServer;
        this.excludeIPRanges = builder.excludeIPRanges;
        this.excludeInboundPorts = builder.excludeInboundPorts;
        this.excludeOutboundPorts = builder.excludeOutboundPorts;
        this.filterGatewayClusterConfig = builder.filterGatewayClusterConfig;
        this.gatewayAPIEnabled = builder.gatewayAPIEnabled;
        this.globalRateLimitEnabled = builder.globalRateLimitEnabled;
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
     * @return canaryUpgradeEnabled
     */
    public Boolean getCanaryUpgradeEnabled() {
        return this.canaryUpgradeEnabled;
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
     * @return globalRateLimitEnabled
     */
    public Boolean getGlobalRateLimitEnabled() {
        return this.globalRateLimitEnabled;
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
        private Boolean canaryUpgradeEnabled; 
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
        private Boolean enableAudit; 
        private Boolean enableCRHistory; 
        private Boolean enableSDSServer; 
        private String excludeIPRanges; 
        private String excludeInboundPorts; 
        private String excludeOutboundPorts; 
        private Boolean filterGatewayClusterConfig; 
        private Boolean gatewayAPIEnabled; 
        private Boolean globalRateLimitEnabled; 
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
            this.canaryUpgradeEnabled = request.canaryUpgradeEnabled;
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
            this.enableAudit = request.enableAudit;
            this.enableCRHistory = request.enableCRHistory;
            this.enableSDSServer = request.enableSDSServer;
            this.excludeIPRanges = request.excludeIPRanges;
            this.excludeInboundPorts = request.excludeInboundPorts;
            this.excludeOutboundPorts = request.excludeOutboundPorts;
            this.filterGatewayClusterConfig = request.filterGatewayClusterConfig;
            this.gatewayAPIEnabled = request.gatewayAPIEnabled;
            this.globalRateLimitEnabled = request.globalRateLimitEnabled;
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
            this.vSwitches = request.vSwitches;
            this.vpcId = request.vpcId;
            this.webAssemblyFilterEnabled = request.webAssemblyFilterEnabled;
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
         * ApiServerLoadBalancerSpec.
         */
        public Builder apiServerLoadBalancerSpec(String apiServerLoadBalancerSpec) {
            this.putBodyParameter("ApiServerLoadBalancerSpec", apiServerLoadBalancerSpec);
            this.apiServerLoadBalancerSpec = apiServerLoadBalancerSpec;
            return this;
        }

        /**
         * ApiServerPublicEip.
         */
        public Builder apiServerPublicEip(Boolean apiServerPublicEip) {
            this.putBodyParameter("ApiServerPublicEip", apiServerPublicEip);
            this.apiServerPublicEip = apiServerPublicEip;
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
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * AutoRenewPeriod.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putBodyParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
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
         * CanaryUpgradeEnabled.
         */
        public Builder canaryUpgradeEnabled(Boolean canaryUpgradeEnabled) {
            this.putBodyParameter("CanaryUpgradeEnabled", canaryUpgradeEnabled);
            this.canaryUpgradeEnabled = canaryUpgradeEnabled;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * ClusterSpec.
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putBodyParameter("ClusterSpec", clusterSpec);
            this.clusterSpec = clusterSpec;
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
         * ControlPlaneLogEnabled.
         */
        public Builder controlPlaneLogEnabled(Boolean controlPlaneLogEnabled) {
            this.putBodyParameter("ControlPlaneLogEnabled", controlPlaneLogEnabled);
            this.controlPlaneLogEnabled = controlPlaneLogEnabled;
            return this;
        }

        /**
         * ControlPlaneLogProject.
         */
        public Builder controlPlaneLogProject(String controlPlaneLogProject) {
            this.putBodyParameter("ControlPlaneLogProject", controlPlaneLogProject);
            this.controlPlaneLogProject = controlPlaneLogProject;
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
         * DubboFilterEnabled.
         */
        public Builder dubboFilterEnabled(Boolean dubboFilterEnabled) {
            this.putBodyParameter("DubboFilterEnabled", dubboFilterEnabled);
            this.dubboFilterEnabled = dubboFilterEnabled;
            return this;
        }

        /**
         * Edition.
         */
        public Builder edition(String edition) {
            this.putBodyParameter("Edition", edition);
            this.edition = edition;
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
         * GlobalRateLimitEnabled.
         */
        public Builder globalRateLimitEnabled(Boolean globalRateLimitEnabled) {
            this.putBodyParameter("GlobalRateLimitEnabled", globalRateLimitEnabled);
            this.globalRateLimitEnabled = globalRateLimitEnabled;
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
         * IstioVersion.
         */
        public Builder istioVersion(String istioVersion) {
            this.putBodyParameter("IstioVersion", istioVersion);
            this.istioVersion = istioVersion;
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
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
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
         * Period.
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PilotLoadBalancerSpec.
         */
        public Builder pilotLoadBalancerSpec(String pilotLoadBalancerSpec) {
            this.putBodyParameter("PilotLoadBalancerSpec", pilotLoadBalancerSpec);
            this.pilotLoadBalancerSpec = pilotLoadBalancerSpec;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * VSwitches.
         */
        public Builder vSwitches(String vSwitches) {
            this.putBodyParameter("VSwitches", vSwitches);
            this.vSwitches = vSwitches;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
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
        public CreateServiceMeshRequest build() {
            return new CreateServiceMeshRequest(this);
        } 

    } 

}
