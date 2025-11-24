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
 * {@link UpdateNamespaceScopeSidecarConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateNamespaceScopeSidecarConfigRequest</p>
 */
public class UpdateNamespaceScopeSidecarConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Concurrency")
    private Integer concurrency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableCoreDump")
    private Boolean enableCoreDump;

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
    @com.aliyun.core.annotation.NameInMap("HoldApplicationUntilProxyStarts")
    private Boolean holdApplicationUntilProxyStarts;

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
    @com.aliyun.core.annotation.NameInMap("InterceptionMode")
    private String interceptionMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IstioDNSProxyEnabled")
    private Boolean istioDNSProxyEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lifecycle")
    private String lifecycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogLevel")
    private String logLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PostStart")
    private String postStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PreStop")
    private String preStop;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Privileged")
    private Boolean privileged;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyInitAckSloCPUResourceLimit")
    private String proxyInitAckSloCPUResourceLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyInitAckSloCPUResourceRequest")
    private String proxyInitAckSloCPUResourceRequest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyInitAckSloMemoryResourceLimit")
    private String proxyInitAckSloMemoryResourceLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyInitAckSloMemoryResourceRequest")
    private String proxyInitAckSloMemoryResourceRequest;

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
    @com.aliyun.core.annotation.NameInMap("ProxyMetadata")
    private String proxyMetadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyStatsMatcher")
    private String proxyStatsMatcher;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReadinessFailureThreshold")
    private Integer readinessFailureThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReadinessInitialDelaySeconds")
    private Integer readinessInitialDelaySeconds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReadinessPeriodSeconds")
    private Integer readinessPeriodSeconds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeValues")
    private String runtimeValues;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SMCEnabled")
    private Boolean SMCEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScaledSidecarResource")
    private ScaledSidecarResource scaledSidecarResource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SidecarProxyAckSloCPUResourceLimit")
    private String sidecarProxyAckSloCPUResourceLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SidecarProxyAckSloCPUResourceRequest")
    private String sidecarProxyAckSloCPUResourceRequest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SidecarProxyAckSloMemoryResourceLimit")
    private String sidecarProxyAckSloMemoryResourceLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SidecarProxyAckSloMemoryResourceRequest")
    private String sidecarProxyAckSloMemoryResourceRequest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SidecarProxyCPUResourceLimit")
    private String sidecarProxyCPUResourceLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SidecarProxyCPUResourceRequest")
    private String sidecarProxyCPUResourceRequest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SidecarProxyMemoryResourceLimit")
    private String sidecarProxyMemoryResourceLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SidecarProxyMemoryResourceRequest")
    private String sidecarProxyMemoryResourceRequest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminationDrainDuration")
    private String terminationDrainDuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tracing")
    private String tracing;

    private UpdateNamespaceScopeSidecarConfigRequest(Builder builder) {
        super(builder);
        this.concurrency = builder.concurrency;
        this.enableCoreDump = builder.enableCoreDump;
        this.excludeIPRanges = builder.excludeIPRanges;
        this.excludeInboundPorts = builder.excludeInboundPorts;
        this.excludeOutboundPorts = builder.excludeOutboundPorts;
        this.holdApplicationUntilProxyStarts = builder.holdApplicationUntilProxyStarts;
        this.includeIPRanges = builder.includeIPRanges;
        this.includeInboundPorts = builder.includeInboundPorts;
        this.includeOutboundPorts = builder.includeOutboundPorts;
        this.interceptionMode = builder.interceptionMode;
        this.istioDNSProxyEnabled = builder.istioDNSProxyEnabled;
        this.lifecycle = builder.lifecycle;
        this.logLevel = builder.logLevel;
        this.namespace = builder.namespace;
        this.postStart = builder.postStart;
        this.preStop = builder.preStop;
        this.privileged = builder.privileged;
        this.proxyInitAckSloCPUResourceLimit = builder.proxyInitAckSloCPUResourceLimit;
        this.proxyInitAckSloCPUResourceRequest = builder.proxyInitAckSloCPUResourceRequest;
        this.proxyInitAckSloMemoryResourceLimit = builder.proxyInitAckSloMemoryResourceLimit;
        this.proxyInitAckSloMemoryResourceRequest = builder.proxyInitAckSloMemoryResourceRequest;
        this.proxyInitCPUResourceLimit = builder.proxyInitCPUResourceLimit;
        this.proxyInitCPUResourceRequest = builder.proxyInitCPUResourceRequest;
        this.proxyInitMemoryResourceLimit = builder.proxyInitMemoryResourceLimit;
        this.proxyInitMemoryResourceRequest = builder.proxyInitMemoryResourceRequest;
        this.proxyMetadata = builder.proxyMetadata;
        this.proxyStatsMatcher = builder.proxyStatsMatcher;
        this.readinessFailureThreshold = builder.readinessFailureThreshold;
        this.readinessInitialDelaySeconds = builder.readinessInitialDelaySeconds;
        this.readinessPeriodSeconds = builder.readinessPeriodSeconds;
        this.runtimeValues = builder.runtimeValues;
        this.SMCEnabled = builder.SMCEnabled;
        this.scaledSidecarResource = builder.scaledSidecarResource;
        this.serviceMeshId = builder.serviceMeshId;
        this.sidecarProxyAckSloCPUResourceLimit = builder.sidecarProxyAckSloCPUResourceLimit;
        this.sidecarProxyAckSloCPUResourceRequest = builder.sidecarProxyAckSloCPUResourceRequest;
        this.sidecarProxyAckSloMemoryResourceLimit = builder.sidecarProxyAckSloMemoryResourceLimit;
        this.sidecarProxyAckSloMemoryResourceRequest = builder.sidecarProxyAckSloMemoryResourceRequest;
        this.sidecarProxyCPUResourceLimit = builder.sidecarProxyCPUResourceLimit;
        this.sidecarProxyCPUResourceRequest = builder.sidecarProxyCPUResourceRequest;
        this.sidecarProxyMemoryResourceLimit = builder.sidecarProxyMemoryResourceLimit;
        this.sidecarProxyMemoryResourceRequest = builder.sidecarProxyMemoryResourceRequest;
        this.terminationDrainDuration = builder.terminationDrainDuration;
        this.tracing = builder.tracing;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNamespaceScopeSidecarConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concurrency
     */
    public Integer getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return enableCoreDump
     */
    public Boolean getEnableCoreDump() {
        return this.enableCoreDump;
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
     * @return holdApplicationUntilProxyStarts
     */
    public Boolean getHoldApplicationUntilProxyStarts() {
        return this.holdApplicationUntilProxyStarts;
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
     * @return interceptionMode
     */
    public String getInterceptionMode() {
        return this.interceptionMode;
    }

    /**
     * @return istioDNSProxyEnabled
     */
    public Boolean getIstioDNSProxyEnabled() {
        return this.istioDNSProxyEnabled;
    }

    /**
     * @return lifecycle
     */
    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * @return logLevel
     */
    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return postStart
     */
    public String getPostStart() {
        return this.postStart;
    }

    /**
     * @return preStop
     */
    public String getPreStop() {
        return this.preStop;
    }

    /**
     * @return privileged
     */
    public Boolean getPrivileged() {
        return this.privileged;
    }

    /**
     * @return proxyInitAckSloCPUResourceLimit
     */
    public String getProxyInitAckSloCPUResourceLimit() {
        return this.proxyInitAckSloCPUResourceLimit;
    }

    /**
     * @return proxyInitAckSloCPUResourceRequest
     */
    public String getProxyInitAckSloCPUResourceRequest() {
        return this.proxyInitAckSloCPUResourceRequest;
    }

    /**
     * @return proxyInitAckSloMemoryResourceLimit
     */
    public String getProxyInitAckSloMemoryResourceLimit() {
        return this.proxyInitAckSloMemoryResourceLimit;
    }

    /**
     * @return proxyInitAckSloMemoryResourceRequest
     */
    public String getProxyInitAckSloMemoryResourceRequest() {
        return this.proxyInitAckSloMemoryResourceRequest;
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
     * @return proxyMetadata
     */
    public String getProxyMetadata() {
        return this.proxyMetadata;
    }

    /**
     * @return proxyStatsMatcher
     */
    public String getProxyStatsMatcher() {
        return this.proxyStatsMatcher;
    }

    /**
     * @return readinessFailureThreshold
     */
    public Integer getReadinessFailureThreshold() {
        return this.readinessFailureThreshold;
    }

    /**
     * @return readinessInitialDelaySeconds
     */
    public Integer getReadinessInitialDelaySeconds() {
        return this.readinessInitialDelaySeconds;
    }

    /**
     * @return readinessPeriodSeconds
     */
    public Integer getReadinessPeriodSeconds() {
        return this.readinessPeriodSeconds;
    }

    /**
     * @return runtimeValues
     */
    public String getRuntimeValues() {
        return this.runtimeValues;
    }

    /**
     * @return SMCEnabled
     */
    public Boolean getSMCEnabled() {
        return this.SMCEnabled;
    }

    /**
     * @return scaledSidecarResource
     */
    public ScaledSidecarResource getScaledSidecarResource() {
        return this.scaledSidecarResource;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return sidecarProxyAckSloCPUResourceLimit
     */
    public String getSidecarProxyAckSloCPUResourceLimit() {
        return this.sidecarProxyAckSloCPUResourceLimit;
    }

    /**
     * @return sidecarProxyAckSloCPUResourceRequest
     */
    public String getSidecarProxyAckSloCPUResourceRequest() {
        return this.sidecarProxyAckSloCPUResourceRequest;
    }

    /**
     * @return sidecarProxyAckSloMemoryResourceLimit
     */
    public String getSidecarProxyAckSloMemoryResourceLimit() {
        return this.sidecarProxyAckSloMemoryResourceLimit;
    }

    /**
     * @return sidecarProxyAckSloMemoryResourceRequest
     */
    public String getSidecarProxyAckSloMemoryResourceRequest() {
        return this.sidecarProxyAckSloMemoryResourceRequest;
    }

    /**
     * @return sidecarProxyCPUResourceLimit
     */
    public String getSidecarProxyCPUResourceLimit() {
        return this.sidecarProxyCPUResourceLimit;
    }

    /**
     * @return sidecarProxyCPUResourceRequest
     */
    public String getSidecarProxyCPUResourceRequest() {
        return this.sidecarProxyCPUResourceRequest;
    }

    /**
     * @return sidecarProxyMemoryResourceLimit
     */
    public String getSidecarProxyMemoryResourceLimit() {
        return this.sidecarProxyMemoryResourceLimit;
    }

    /**
     * @return sidecarProxyMemoryResourceRequest
     */
    public String getSidecarProxyMemoryResourceRequest() {
        return this.sidecarProxyMemoryResourceRequest;
    }

    /**
     * @return terminationDrainDuration
     */
    public String getTerminationDrainDuration() {
        return this.terminationDrainDuration;
    }

    /**
     * @return tracing
     */
    public String getTracing() {
        return this.tracing;
    }

    public static final class Builder extends Request.Builder<UpdateNamespaceScopeSidecarConfigRequest, Builder> {
        private Integer concurrency; 
        private Boolean enableCoreDump; 
        private String excludeIPRanges; 
        private String excludeInboundPorts; 
        private String excludeOutboundPorts; 
        private Boolean holdApplicationUntilProxyStarts; 
        private String includeIPRanges; 
        private String includeInboundPorts; 
        private String includeOutboundPorts; 
        private String interceptionMode; 
        private Boolean istioDNSProxyEnabled; 
        private String lifecycle; 
        private String logLevel; 
        private String namespace; 
        private String postStart; 
        private String preStop; 
        private Boolean privileged; 
        private String proxyInitAckSloCPUResourceLimit; 
        private String proxyInitAckSloCPUResourceRequest; 
        private String proxyInitAckSloMemoryResourceLimit; 
        private String proxyInitAckSloMemoryResourceRequest; 
        private String proxyInitCPUResourceLimit; 
        private String proxyInitCPUResourceRequest; 
        private String proxyInitMemoryResourceLimit; 
        private String proxyInitMemoryResourceRequest; 
        private String proxyMetadata; 
        private String proxyStatsMatcher; 
        private Integer readinessFailureThreshold; 
        private Integer readinessInitialDelaySeconds; 
        private Integer readinessPeriodSeconds; 
        private String runtimeValues; 
        private Boolean SMCEnabled; 
        private ScaledSidecarResource scaledSidecarResource; 
        private String serviceMeshId; 
        private String sidecarProxyAckSloCPUResourceLimit; 
        private String sidecarProxyAckSloCPUResourceRequest; 
        private String sidecarProxyAckSloMemoryResourceLimit; 
        private String sidecarProxyAckSloMemoryResourceRequest; 
        private String sidecarProxyCPUResourceLimit; 
        private String sidecarProxyCPUResourceRequest; 
        private String sidecarProxyMemoryResourceLimit; 
        private String sidecarProxyMemoryResourceRequest; 
        private String terminationDrainDuration; 
        private String tracing; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNamespaceScopeSidecarConfigRequest request) {
            super(request);
            this.concurrency = request.concurrency;
            this.enableCoreDump = request.enableCoreDump;
            this.excludeIPRanges = request.excludeIPRanges;
            this.excludeInboundPorts = request.excludeInboundPorts;
            this.excludeOutboundPorts = request.excludeOutboundPorts;
            this.holdApplicationUntilProxyStarts = request.holdApplicationUntilProxyStarts;
            this.includeIPRanges = request.includeIPRanges;
            this.includeInboundPorts = request.includeInboundPorts;
            this.includeOutboundPorts = request.includeOutboundPorts;
            this.interceptionMode = request.interceptionMode;
            this.istioDNSProxyEnabled = request.istioDNSProxyEnabled;
            this.lifecycle = request.lifecycle;
            this.logLevel = request.logLevel;
            this.namespace = request.namespace;
            this.postStart = request.postStart;
            this.preStop = request.preStop;
            this.privileged = request.privileged;
            this.proxyInitAckSloCPUResourceLimit = request.proxyInitAckSloCPUResourceLimit;
            this.proxyInitAckSloCPUResourceRequest = request.proxyInitAckSloCPUResourceRequest;
            this.proxyInitAckSloMemoryResourceLimit = request.proxyInitAckSloMemoryResourceLimit;
            this.proxyInitAckSloMemoryResourceRequest = request.proxyInitAckSloMemoryResourceRequest;
            this.proxyInitCPUResourceLimit = request.proxyInitCPUResourceLimit;
            this.proxyInitCPUResourceRequest = request.proxyInitCPUResourceRequest;
            this.proxyInitMemoryResourceLimit = request.proxyInitMemoryResourceLimit;
            this.proxyInitMemoryResourceRequest = request.proxyInitMemoryResourceRequest;
            this.proxyMetadata = request.proxyMetadata;
            this.proxyStatsMatcher = request.proxyStatsMatcher;
            this.readinessFailureThreshold = request.readinessFailureThreshold;
            this.readinessInitialDelaySeconds = request.readinessInitialDelaySeconds;
            this.readinessPeriodSeconds = request.readinessPeriodSeconds;
            this.runtimeValues = request.runtimeValues;
            this.SMCEnabled = request.SMCEnabled;
            this.scaledSidecarResource = request.scaledSidecarResource;
            this.serviceMeshId = request.serviceMeshId;
            this.sidecarProxyAckSloCPUResourceLimit = request.sidecarProxyAckSloCPUResourceLimit;
            this.sidecarProxyAckSloCPUResourceRequest = request.sidecarProxyAckSloCPUResourceRequest;
            this.sidecarProxyAckSloMemoryResourceLimit = request.sidecarProxyAckSloMemoryResourceLimit;
            this.sidecarProxyAckSloMemoryResourceRequest = request.sidecarProxyAckSloMemoryResourceRequest;
            this.sidecarProxyCPUResourceLimit = request.sidecarProxyCPUResourceLimit;
            this.sidecarProxyCPUResourceRequest = request.sidecarProxyCPUResourceRequest;
            this.sidecarProxyMemoryResourceLimit = request.sidecarProxyMemoryResourceLimit;
            this.sidecarProxyMemoryResourceRequest = request.sidecarProxyMemoryResourceRequest;
            this.terminationDrainDuration = request.terminationDrainDuration;
            this.tracing = request.tracing;
        } 

        /**
         * <p>The number of worker threads to run in Istio Proxy.</p>
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
         * <p>Specifies whether to enable the core dump feature for the sidecar proxy containers. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableCoreDump(Boolean enableCoreDump) {
            this.putBodyParameter("EnableCoreDump", enableCoreDump);
            this.enableCoreDump = enableCoreDump;
            return this;
        }

        /**
         * <p>The range of IP addresses that are allowed to access external services. (<code>global.proxy.excludelPRanges</code>)</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/12</p>
         */
        public Builder excludeIPRanges(String excludeIPRanges) {
            this.putBodyParameter("ExcludeIPRanges", excludeIPRanges);
            this.excludeIPRanges = excludeIPRanges;
            return this;
        }

        /**
         * <p>The port that the inbound traffic of the sidecar proxy does not pass through.</p>
         * 
         * <strong>example:</strong>
         * <p>82</p>
         */
        public Builder excludeInboundPorts(String excludeInboundPorts) {
            this.putBodyParameter("ExcludeInboundPorts", excludeInboundPorts);
            this.excludeInboundPorts = excludeInboundPorts;
            return this;
        }

        /**
         * <p>The port that the outbound traffic of the sidecar proxy does not pass through.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        public Builder excludeOutboundPorts(String excludeOutboundPorts) {
            this.putBodyParameter("ExcludeOutboundPorts", excludeOutboundPorts);
            this.excludeOutboundPorts = excludeOutboundPorts;
            return this;
        }

        /**
         * <p>Specifies whether applications can be started only after Istio Proxy starts. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Applications can be started only after Istio Proxy starts.</li>
         * <li><code>false</code>: Applications can be started before Istio Proxy starts.</li>
         * </ul>
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
         * <p>The range of IP addresses that are denied to access external services. (<code>global.proxy.includelPRanges</code>)</p>
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
         * <p>The port that the inbound traffic of the sidecar proxy passes through.</p>
         * 
         * <strong>example:</strong>
         * <p>83</p>
         */
        public Builder includeInboundPorts(String includeInboundPorts) {
            this.putBodyParameter("IncludeInboundPorts", includeInboundPorts);
            this.includeInboundPorts = includeInboundPorts;
            return this;
        }

        /**
         * <p>The port that the outbound traffic of the sidecar proxy passes through.</p>
         * 
         * <strong>example:</strong>
         * <p>84</p>
         */
        public Builder includeOutboundPorts(String includeOutboundPorts) {
            this.putBodyParameter("IncludeOutboundPorts", includeOutboundPorts);
            this.includeOutboundPorts = includeOutboundPorts;
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
         * <p>TPROXY</p>
         */
        public Builder interceptionMode(String interceptionMode) {
            this.putBodyParameter("InterceptionMode", interceptionMode);
            this.interceptionMode = interceptionMode;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Domain Name System (DNS) proxy feature. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The DNS proxy feature is enabled.</li>
         * <li><code>false</code>: The DNS proxy feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder istioDNSProxyEnabled(Boolean istioDNSProxyEnabled) {
            this.putBodyParameter("IstioDNSProxyEnabled", istioDNSProxyEnabled);
            this.istioDNSProxyEnabled = istioDNSProxyEnabled;
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
         * <p>The log level. Valid values: <code>info</code>, <code>debug</code>, <code>tracing</code>, and <code>error</code>.</p>
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
         * <p>The namespace for which you want to update the sidecar proxy configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The post-start parameters of Istio Proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;pilot-agent&quot;,&quot;wait&quot;]}}</p>
         */
        public Builder postStart(String postStart) {
            this.putBodyParameter("PostStart", postStart);
            this.postStart = postStart;
            return this;
        }

        /**
         * <p>The pre-close parameters of Istio Proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;/bin/sh&quot;,&quot;-c&quot;,&quot;sleep 15&quot;]}}</p>
         */
        public Builder preStop(String preStop) {
            this.putBodyParameter("PreStop", preStop);
            this.preStop = preStop;
            return this;
        }

        /**
         * <p>Specifies whether to enable the privileged mode in the security context of the sidecar proxy containers. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables the privileged mode. This means that the sidecar proxy containers run in privileged mode.</li>
         * <li><code>false</code>: does not enable the privileged mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder privileged(Boolean privileged) {
            this.putBodyParameter("Privileged", privileged);
            this.privileged = privileged;
            return this;
        }

        /**
         * <p>The maximum number of reclaimed CPU cores provided by Container Service for Kubernetes (ACK) that are available to the istio-init container. Reclaimed resources, including CPU cores and memory, are resources that can be dynamically overcommitted. This configuration item is used to set the maximum number of CPU cores that are available to the istio-init container in a pod labeled with <code>koordinator.sh/qosClass</code>. Unit: millicore.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder proxyInitAckSloCPUResourceLimit(String proxyInitAckSloCPUResourceLimit) {
            this.putBodyParameter("ProxyInitAckSloCPUResourceLimit", proxyInitAckSloCPUResourceLimit);
            this.proxyInitAckSloCPUResourceLimit = proxyInitAckSloCPUResourceLimit;
            return this;
        }

        /**
         * <p>The minimum number of reclaimed CPU cores provided by ACK that the istio-init container requires at runtime. This configuration item is used to set the minimum number of reclaimed CPU cores for the istio-init container in a pod labeled with <code>koordinator.sh/qosClass</code>. Unit: millicore.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder proxyInitAckSloCPUResourceRequest(String proxyInitAckSloCPUResourceRequest) {
            this.putBodyParameter("ProxyInitAckSloCPUResourceRequest", proxyInitAckSloCPUResourceRequest);
            this.proxyInitAckSloCPUResourceRequest = proxyInitAckSloCPUResourceRequest;
            return this;
        }

        /**
         * <p>The maximum size of reclaimed memory resources provided by ACK that are available to the istio-init container. This configuration item is used to set the maximum size of memory that is available to the istio-init container in a pod labeled with <code>koordinator.sh/qosClass</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2048Mi</p>
         */
        public Builder proxyInitAckSloMemoryResourceLimit(String proxyInitAckSloMemoryResourceLimit) {
            this.putBodyParameter("ProxyInitAckSloMemoryResourceLimit", proxyInitAckSloMemoryResourceLimit);
            this.proxyInitAckSloMemoryResourceLimit = proxyInitAckSloMemoryResourceLimit;
            return this;
        }

        /**
         * <p>The minimum size of reclaimed memory provided by ACK that the istio-init container requires at runtime. This configuration item is used to set the minimum size of reclaimed memory for the istio-init container in a pod labeled with <code>koordinator.sh/qosClass</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>128Mi</p>
         */
        public Builder proxyInitAckSloMemoryResourceRequest(String proxyInitAckSloMemoryResourceRequest) {
            this.putBodyParameter("ProxyInitAckSloMemoryResourceRequest", proxyInitAckSloMemoryResourceRequest);
            this.proxyInitAckSloMemoryResourceRequest = proxyInitAckSloMemoryResourceRequest;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores that are available to the sidecar proxy init container.</p>
         * 
         * <strong>example:</strong>
         * <p>2000 m</p>
         */
        public Builder proxyInitCPUResourceLimit(String proxyInitCPUResourceLimit) {
            this.putBodyParameter("ProxyInitCPUResourceLimit", proxyInitCPUResourceLimit);
            this.proxyInitCPUResourceLimit = proxyInitCPUResourceLimit;
            return this;
        }

        /**
         * <p>The minimum number of CPU cores that are requested by the sidecar proxy init container.</p>
         * 
         * <strong>example:</strong>
         * <p>60 m</p>
         */
        public Builder proxyInitCPUResourceRequest(String proxyInitCPUResourceRequest) {
            this.putBodyParameter("ProxyInitCPUResourceRequest", proxyInitCPUResourceRequest);
            this.proxyInitCPUResourceRequest = proxyInitCPUResourceRequest;
            return this;
        }

        /**
         * <p>The maximum size of memory that is available to the sidecar proxy init container.</p>
         * 
         * <strong>example:</strong>
         * <p>50 Mi</p>
         */
        public Builder proxyInitMemoryResourceLimit(String proxyInitMemoryResourceLimit) {
            this.putBodyParameter("ProxyInitMemoryResourceLimit", proxyInitMemoryResourceLimit);
            this.proxyInitMemoryResourceLimit = proxyInitMemoryResourceLimit;
            return this;
        }

        /**
         * <p>The minimum size of memory that is requested by the sidecar proxy init container.</p>
         * 
         * <strong>example:</strong>
         * <p>30 Mi</p>
         */
        public Builder proxyInitMemoryResourceRequest(String proxyInitMemoryResourceRequest) {
            this.putBodyParameter("ProxyInitMemoryResourceRequest", proxyInitMemoryResourceRequest);
            this.proxyInitMemoryResourceRequest = proxyInitMemoryResourceRequest;
            return this;
        }

        /**
         * <p>The environment variables that are added to a sidecar proxy. The environment variables are represented as JSON objects. The keys and values in the JSON objects represent the keys and values added to the environment variables of the sidecar proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EXIT_ON_ZERO_ACTIVE_CONNECTIONS&quot;:&quot;true&quot;}</p>
         */
        public Builder proxyMetadata(String proxyMetadata) {
            this.putBodyParameter("ProxyMetadata", proxyMetadata);
            this.proxyMetadata = proxyMetadata;
            return this;
        }

        /**
         * <p>The monitoring metrics for data collected by Envoy proxies. The value is in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;inclusionPrefixes&quot;: [ &quot;cluster.outbound&quot;, &quot;cluster_manager&quot;, &quot;listener_manager&quot;, &quot;server&quot;, &quot;cluster.xds-grpc&quot; ], &quot;inclusionRegexps&quot;: [ &quot;listener.<em>.downstream_cx_total&quot;, &quot;listener.</em>.downstream_cx_active&quot; ] }</p>
         */
        public Builder proxyStatsMatcher(String proxyStatsMatcher) {
            this.putBodyParameter("ProxyStatsMatcher", proxyStatsMatcher);
            this.proxyStatsMatcher = proxyStatsMatcher;
            return this;
        }

        /**
         * <p>The number of readiness check failures required before marking a sidecar proxy container as not ready.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder readinessFailureThreshold(Integer readinessFailureThreshold) {
            this.putBodyParameter("ReadinessFailureThreshold", readinessFailureThreshold);
            this.readinessFailureThreshold = readinessFailureThreshold;
            return this;
        }

        /**
         * <p>The amount of time to wait before the first readiness check of a sidecar proxy container is performed. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder readinessInitialDelaySeconds(Integer readinessInitialDelaySeconds) {
            this.putBodyParameter("ReadinessInitialDelaySeconds", readinessInitialDelaySeconds);
            this.readinessInitialDelaySeconds = readinessInitialDelaySeconds;
            return this;
        }

        /**
         * <p>The interval between two readiness checks of a sidecar proxy container. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder readinessPeriodSeconds(Integer readinessPeriodSeconds) {
            this.putBodyParameter("ReadinessPeriodSeconds", readinessPeriodSeconds);
            this.readinessPeriodSeconds = readinessPeriodSeconds;
            return this;
        }

        /**
         * <p>Indicates the runtime parameters of Envoy proxy processes in the sidecar proxy container. This parameter is a serialized JSON string. The keys and values of a JSON object are the keys and the values of a Envoy Runtime Parameter respectively.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>global_downstream_max_connections: indicates that the limits on the number of connections from downstream to Envoy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;overload.global_downstream_max_connections&quot;:&quot;65536&quot;}</p>
         */
        public Builder runtimeValues(String runtimeValues) {
            this.putBodyParameter("RuntimeValues", runtimeValues);
            this.runtimeValues = runtimeValues;
            return this;
        }

        /**
         * <p>Specifies whether to enable Shared Memory Communications over Remote Direct Memory Access (SMC-R) optimization. The SMC-R optimization feature uses Alibaba Cloud Linux 3 and elastic remote direct memory access (eRDMA) network devices, which optimizes cross-node communication.</p>
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
         * ScaledSidecarResource.
         */
        public Builder scaledSidecarResource(ScaledSidecarResource scaledSidecarResource) {
            String scaledSidecarResourceShrink = shrink(scaledSidecarResource, "ScaledSidecarResource", "json");
            this.putBodyParameter("ScaledSidecarResource", scaledSidecarResourceShrink);
            this.scaledSidecarResource = scaledSidecarResource;
            return this;
        }

        /**
         * <p>The ID of the ASM instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca04bc38979214bf2882be79d39b4****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * <p>The maximum number of reclaimed CPU cores provided by ACK that are available to the sidecar proxy container. This configuration item is used to set the maximum number of CPU cores that are available to the sidecar proxy container in a pod labeled with <code>koordinator.sh/qosClass</code>. Unit: millicore.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder sidecarProxyAckSloCPUResourceLimit(String sidecarProxyAckSloCPUResourceLimit) {
            this.putBodyParameter("SidecarProxyAckSloCPUResourceLimit", sidecarProxyAckSloCPUResourceLimit);
            this.sidecarProxyAckSloCPUResourceLimit = sidecarProxyAckSloCPUResourceLimit;
            return this;
        }

        /**
         * <p>The minimum number of reclaimed CPU cores provided by ACK that the sidecar proxy container requires at runtime. This configuration item is used to set the minimum number of reclaimed CPU cores for the sidecar proxy container in a pod labeled with <code>koordinator.sh/qosClass</code>. Unit: millicore.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder sidecarProxyAckSloCPUResourceRequest(String sidecarProxyAckSloCPUResourceRequest) {
            this.putBodyParameter("SidecarProxyAckSloCPUResourceRequest", sidecarProxyAckSloCPUResourceRequest);
            this.sidecarProxyAckSloCPUResourceRequest = sidecarProxyAckSloCPUResourceRequest;
            return this;
        }

        /**
         * <p>The maximum size of reclaimed memory resources provided by ACK that are available to the sidecar proxy container. This configuration item is used to set the maximum size of memory that is available to the sidecar proxy container in a pod labeled with <code>koordinator.sh/qosClass</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2048Mi</p>
         */
        public Builder sidecarProxyAckSloMemoryResourceLimit(String sidecarProxyAckSloMemoryResourceLimit) {
            this.putBodyParameter("SidecarProxyAckSloMemoryResourceLimit", sidecarProxyAckSloMemoryResourceLimit);
            this.sidecarProxyAckSloMemoryResourceLimit = sidecarProxyAckSloMemoryResourceLimit;
            return this;
        }

        /**
         * <p>The minimum size of reclaimed memory provided by ACK that the sidecar proxy container requires at runtime. This configuration item is used to set the minimum size of reclaimed memory for the sidecar proxy container in a pod labeled with <code>koordinator.sh/qosClass</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>128Mi</p>
         */
        public Builder sidecarProxyAckSloMemoryResourceRequest(String sidecarProxyAckSloMemoryResourceRequest) {
            this.putBodyParameter("SidecarProxyAckSloMemoryResourceRequest", sidecarProxyAckSloMemoryResourceRequest);
            this.sidecarProxyAckSloMemoryResourceRequest = sidecarProxyAckSloMemoryResourceRequest;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores that are available to the sidecar proxy container.</p>
         * 
         * <strong>example:</strong>
         * <p>2000 m</p>
         */
        public Builder sidecarProxyCPUResourceLimit(String sidecarProxyCPUResourceLimit) {
            this.putBodyParameter("SidecarProxyCPUResourceLimit", sidecarProxyCPUResourceLimit);
            this.sidecarProxyCPUResourceLimit = sidecarProxyCPUResourceLimit;
            return this;
        }

        /**
         * <p>The minimum number of CPU cores that are requested by the sidecar proxy container.</p>
         * 
         * <strong>example:</strong>
         * <p>60 m</p>
         */
        public Builder sidecarProxyCPUResourceRequest(String sidecarProxyCPUResourceRequest) {
            this.putBodyParameter("SidecarProxyCPUResourceRequest", sidecarProxyCPUResourceRequest);
            this.sidecarProxyCPUResourceRequest = sidecarProxyCPUResourceRequest;
            return this;
        }

        /**
         * <p>The maximum size of memory that is available to the sidecar proxy container.</p>
         * 
         * <strong>example:</strong>
         * <p>50 Mi</p>
         */
        public Builder sidecarProxyMemoryResourceLimit(String sidecarProxyMemoryResourceLimit) {
            this.putBodyParameter("SidecarProxyMemoryResourceLimit", sidecarProxyMemoryResourceLimit);
            this.sidecarProxyMemoryResourceLimit = sidecarProxyMemoryResourceLimit;
            return this;
        }

        /**
         * <p>The minimum size of memory that is requested by the sidecar proxy container.</p>
         * 
         * <strong>example:</strong>
         * <p>30 Mi</p>
         */
        public Builder sidecarProxyMemoryResourceRequest(String sidecarProxyMemoryResourceRequest) {
            this.putBodyParameter("SidecarProxyMemoryResourceRequest", sidecarProxyMemoryResourceRequest);
            this.sidecarProxyMemoryResourceRequest = sidecarProxyMemoryResourceRequest;
            return this;
        }

        /**
         * <p>The maximum period of time that the sidecar proxy waits for a request to end.</p>
         * 
         * <strong>example:</strong>
         * <p>6s</p>
         */
        public Builder terminationDrainDuration(String terminationDrainDuration) {
            this.putBodyParameter("TerminationDrainDuration", terminationDrainDuration);
            this.terminationDrainDuration = terminationDrainDuration;
            return this;
        }

        /**
         * <p>The custom configurations of Tracing Analysis. The configurations must be serialized into JSON strings. The configurations contain the following parameters:</p>
         * <ul>
         * <li><p><code>sampling</code>: The sampling rate, which is of the DOUBLE type.</p>
         * </li>
         * <li><p><code>custom_tags</code>: The custom tags added to reported spans, which are of the MAP type. The key of a tag is of the string type. The value of a tag is in the JSON format. A custom tag can belong to one of the following types:</p>
         * <ul>
         * <li><code>literal</code>: The tag value is a fixed value in the JSON format. This tag must contain the <code>value</code> field that specifies a literal. Example: <code>{&quot;value&quot;:&quot;test&quot;}</code>.</li>
         * <li><code>header</code>: The tag value is a request header in the JSON format. This tag must contain the <code>name</code> field and <code>defaultValue</code> field.The name field indicates the name of the request header. The defaultValue field indicates the default value that is used when no request header is available. Example: <code>{&quot;name&quot;:&quot;test&quot;,&quot;defaultValue&quot;:&quot;test&quot;}</code>.</li>
         * <li><code>environment</code>: The tag value is an environment variable in the JSON format. This tag must contain the <code>name</code> field and <code>defaultValue</code> field. The name field indicates the name of the environment variable. The defaultValue field indicates the environment variable that is used when no environment variable is available. Example: <code>{&quot;name&quot;:&quot;test&quot;,&quot;defaultValue&quot;:&quot;test&quot;}</code>.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sampling&quot;:99.8,&quot;custom_tags&quot;:{&quot;test&quot;:{&quot;literal&quot;:{&quot;value&quot;:&quot;testnamespace&quot;}}}}</p>
         */
        public Builder tracing(String tracing) {
            this.putBodyParameter("Tracing", tracing);
            this.tracing = tracing;
            return this;
        }

        @Override
        public UpdateNamespaceScopeSidecarConfigRequest build() {
            return new UpdateNamespaceScopeSidecarConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateNamespaceScopeSidecarConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateNamespaceScopeSidecarConfigRequest</p>
     */
    public static class ScaledSidecarResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerRef")
        private String containerRef;

        @com.aliyun.core.annotation.NameInMap("ResourceCalculationStrategy")
        private String resourceCalculationStrategy;

        @com.aliyun.core.annotation.NameInMap("ResourcePercentage")
        private Integer resourcePercentage;

        private ScaledSidecarResource(Builder builder) {
            this.containerRef = builder.containerRef;
            this.resourceCalculationStrategy = builder.resourceCalculationStrategy;
            this.resourcePercentage = builder.resourcePercentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaledSidecarResource create() {
            return builder().build();
        }

        /**
         * @return containerRef
         */
        public String getContainerRef() {
            return this.containerRef;
        }

        /**
         * @return resourceCalculationStrategy
         */
        public String getResourceCalculationStrategy() {
            return this.resourceCalculationStrategy;
        }

        /**
         * @return resourcePercentage
         */
        public Integer getResourcePercentage() {
            return this.resourcePercentage;
        }

        public static final class Builder {
            private String containerRef; 
            private String resourceCalculationStrategy; 
            private Integer resourcePercentage; 

            private Builder() {
            } 

            private Builder(ScaledSidecarResource model) {
                this.containerRef = model.containerRef;
                this.resourceCalculationStrategy = model.resourceCalculationStrategy;
                this.resourcePercentage = model.resourcePercentage;
            } 

            /**
             * ContainerRef.
             */
            public Builder containerRef(String containerRef) {
                this.containerRef = containerRef;
                return this;
            }

            /**
             * ResourceCalculationStrategy.
             */
            public Builder resourceCalculationStrategy(String resourceCalculationStrategy) {
                this.resourceCalculationStrategy = resourceCalculationStrategy;
                return this;
            }

            /**
             * ResourcePercentage.
             */
            public Builder resourcePercentage(Integer resourcePercentage) {
                this.resourcePercentage = resourcePercentage;
                return this;
            }

            public ScaledSidecarResource build() {
                return new ScaledSidecarResource(this);
            } 

        } 

    }
}
