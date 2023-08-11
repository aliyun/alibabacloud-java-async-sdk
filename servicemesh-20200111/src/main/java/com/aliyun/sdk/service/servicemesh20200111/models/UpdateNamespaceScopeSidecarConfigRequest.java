// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNamespaceScopeSidecarConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateNamespaceScopeSidecarConfigRequest</p>
 */
public class UpdateNamespaceScopeSidecarConfigRequest extends Request {
    @Body
    @NameInMap("Concurrency")
    private Integer concurrency;

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
    @NameInMap("HoldApplicationUntilProxyStarts")
    private Boolean holdApplicationUntilProxyStarts;

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
    @NameInMap("InterceptionMode")
    private String interceptionMode;

    @Body
    @NameInMap("IstioDNSProxyEnabled")
    private Boolean istioDNSProxyEnabled;

    @Body
    @NameInMap("Lifecycle")
    private String lifecycle;

    @Body
    @NameInMap("LogLevel")
    private String logLevel;

    @Body
    @NameInMap("Namespace")
    private String namespace;

    @Body
    @NameInMap("PostStart")
    private String postStart;

    @Body
    @NameInMap("PreStop")
    private String preStop;

    @Body
    @NameInMap("ProxyInitAckSloCPUResourceLimit")
    private String proxyInitAckSloCPUResourceLimit;

    @Body
    @NameInMap("ProxyInitAckSloCPUResourceRequest")
    private String proxyInitAckSloCPUResourceRequest;

    @Body
    @NameInMap("ProxyInitAckSloMemoryResourceLimit")
    private String proxyInitAckSloMemoryResourceLimit;

    @Body
    @NameInMap("ProxyInitAckSloMemoryResourceRequest")
    private String proxyInitAckSloMemoryResourceRequest;

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
    @NameInMap("ProxyMetadata")
    private String proxyMetadata;

    @Body
    @NameInMap("ProxyStatsMatcher")
    private String proxyStatsMatcher;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("SidecarProxyAckSloCPUResourceLimit")
    private String sidecarProxyAckSloCPUResourceLimit;

    @Body
    @NameInMap("SidecarProxyAckSloCPUResourceRequest")
    private String sidecarProxyAckSloCPUResourceRequest;

    @Body
    @NameInMap("SidecarProxyAckSloMemoryResourceLimit")
    private String sidecarProxyAckSloMemoryResourceLimit;

    @Body
    @NameInMap("SidecarProxyAckSloMemoryResourceRequest")
    private String sidecarProxyAckSloMemoryResourceRequest;

    @Body
    @NameInMap("SidecarProxyCPUResourceLimit")
    private String sidecarProxyCPUResourceLimit;

    @Body
    @NameInMap("SidecarProxyCPUResourceRequest")
    private String sidecarProxyCPUResourceRequest;

    @Body
    @NameInMap("SidecarProxyMemoryResourceLimit")
    private String sidecarProxyMemoryResourceLimit;

    @Body
    @NameInMap("SidecarProxyMemoryResourceRequest")
    private String sidecarProxyMemoryResourceRequest;

    @Body
    @NameInMap("TerminationDrainDuration")
    private String terminationDrainDuration;

    @Body
    @NameInMap("Tracing")
    private String tracing;

    private UpdateNamespaceScopeSidecarConfigRequest(Builder builder) {
        super(builder);
        this.concurrency = builder.concurrency;
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
         * The number of worker threads to run in Istio Proxy.
         */
        public Builder concurrency(Integer concurrency) {
            this.putBodyParameter("Concurrency", concurrency);
            this.concurrency = concurrency;
            return this;
        }

        /**
         * The range of IP addresses that are allowed to access external services. (`global.proxy.excludelPRanges`)
         */
        public Builder excludeIPRanges(String excludeIPRanges) {
            this.putBodyParameter("ExcludeIPRanges", excludeIPRanges);
            this.excludeIPRanges = excludeIPRanges;
            return this;
        }

        /**
         * The port that the inbound traffic of the sidecar proxy does not pass through.
         */
        public Builder excludeInboundPorts(String excludeInboundPorts) {
            this.putBodyParameter("ExcludeInboundPorts", excludeInboundPorts);
            this.excludeInboundPorts = excludeInboundPorts;
            return this;
        }

        /**
         * The port that the outbound traffic of the sidecar proxy does not pass through.
         */
        public Builder excludeOutboundPorts(String excludeOutboundPorts) {
            this.putBodyParameter("ExcludeOutboundPorts", excludeOutboundPorts);
            this.excludeOutboundPorts = excludeOutboundPorts;
            return this;
        }

        /**
         * Specifies whether applications can be started only after Istio Proxy starts. Valid values:
         * <p>
         * 
         * *   `true`: Applications can be started only after Istio Proxy starts.
         * *   `false`: Applications can be started before Istio Proxy starts.
         */
        public Builder holdApplicationUntilProxyStarts(Boolean holdApplicationUntilProxyStarts) {
            this.putBodyParameter("HoldApplicationUntilProxyStarts", holdApplicationUntilProxyStarts);
            this.holdApplicationUntilProxyStarts = holdApplicationUntilProxyStarts;
            return this;
        }

        /**
         * The range of IP addresses that are denied to access external services. (`global.proxy.includelPRanges`)
         */
        public Builder includeIPRanges(String includeIPRanges) {
            this.putBodyParameter("IncludeIPRanges", includeIPRanges);
            this.includeIPRanges = includeIPRanges;
            return this;
        }

        /**
         * The port that the inbound traffic of the sidecar proxy passes through.
         */
        public Builder includeInboundPorts(String includeInboundPorts) {
            this.putBodyParameter("IncludeInboundPorts", includeInboundPorts);
            this.includeInboundPorts = includeInboundPorts;
            return this;
        }

        /**
         * The port that the outbound traffic of the sidecar proxy passes through.
         */
        public Builder includeOutboundPorts(String includeOutboundPorts) {
            this.putBodyParameter("IncludeOutboundPorts", includeOutboundPorts);
            this.includeOutboundPorts = includeOutboundPorts;
            return this;
        }

        /**
         * The mode in which the sidecar proxy intercepts inbound traffic. Valid values:
         * <p>
         * 
         * *   `REDIRECT`: The sidecar proxy intercepts inbound traffic in the REDIRECT mode.
         * *   `TPROXY`: The sidecar proxy intercepts inbound traffic in the TPROXY mode.
         */
        public Builder interceptionMode(String interceptionMode) {
            this.putBodyParameter("InterceptionMode", interceptionMode);
            this.interceptionMode = interceptionMode;
            return this;
        }

        /**
         * Specifies whether to enable the Domain Name System (DNS) proxy feature. Valid values:
         * <p>
         * 
         * *   `true`: The DNS proxy feature is enabled.
         * *   `false`: The DNS proxy feature is disabled.
         */
        public Builder istioDNSProxyEnabled(Boolean istioDNSProxyEnabled) {
            this.putBodyParameter("IstioDNSProxyEnabled", istioDNSProxyEnabled);
            this.istioDNSProxyEnabled = istioDNSProxyEnabled;
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
         * The log level. Valid values: `info`, `debug`, `tracing`, and `error`.
         */
        public Builder logLevel(String logLevel) {
            this.putBodyParameter("LogLevel", logLevel);
            this.logLevel = logLevel;
            return this;
        }

        /**
         * The namespace for which you want to update the sidecar proxy configurations.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The post-start parameters of Istio Proxy.
         */
        public Builder postStart(String postStart) {
            this.putBodyParameter("PostStart", postStart);
            this.postStart = postStart;
            return this;
        }

        /**
         * The pre-close parameters of Istio Proxy.
         */
        public Builder preStop(String preStop) {
            this.putBodyParameter("PreStop", preStop);
            this.preStop = preStop;
            return this;
        }

        /**
         * ProxyInitAckSloCPUResourceLimit.
         */
        public Builder proxyInitAckSloCPUResourceLimit(String proxyInitAckSloCPUResourceLimit) {
            this.putBodyParameter("ProxyInitAckSloCPUResourceLimit", proxyInitAckSloCPUResourceLimit);
            this.proxyInitAckSloCPUResourceLimit = proxyInitAckSloCPUResourceLimit;
            return this;
        }

        /**
         * ProxyInitAckSloCPUResourceRequest.
         */
        public Builder proxyInitAckSloCPUResourceRequest(String proxyInitAckSloCPUResourceRequest) {
            this.putBodyParameter("ProxyInitAckSloCPUResourceRequest", proxyInitAckSloCPUResourceRequest);
            this.proxyInitAckSloCPUResourceRequest = proxyInitAckSloCPUResourceRequest;
            return this;
        }

        /**
         * ProxyInitAckSloMemoryResourceLimit.
         */
        public Builder proxyInitAckSloMemoryResourceLimit(String proxyInitAckSloMemoryResourceLimit) {
            this.putBodyParameter("ProxyInitAckSloMemoryResourceLimit", proxyInitAckSloMemoryResourceLimit);
            this.proxyInitAckSloMemoryResourceLimit = proxyInitAckSloMemoryResourceLimit;
            return this;
        }

        /**
         * ProxyInitAckSloMemoryResourceRequest.
         */
        public Builder proxyInitAckSloMemoryResourceRequest(String proxyInitAckSloMemoryResourceRequest) {
            this.putBodyParameter("ProxyInitAckSloMemoryResourceRequest", proxyInitAckSloMemoryResourceRequest);
            this.proxyInitAckSloMemoryResourceRequest = proxyInitAckSloMemoryResourceRequest;
            return this;
        }

        /**
         * The maximum number of CPU cores that are available to the sidecar proxy init container.
         */
        public Builder proxyInitCPUResourceLimit(String proxyInitCPUResourceLimit) {
            this.putBodyParameter("ProxyInitCPUResourceLimit", proxyInitCPUResourceLimit);
            this.proxyInitCPUResourceLimit = proxyInitCPUResourceLimit;
            return this;
        }

        /**
         * The minimum number of CPU cores that are requested by the sidecar proxy init container.
         */
        public Builder proxyInitCPUResourceRequest(String proxyInitCPUResourceRequest) {
            this.putBodyParameter("ProxyInitCPUResourceRequest", proxyInitCPUResourceRequest);
            this.proxyInitCPUResourceRequest = proxyInitCPUResourceRequest;
            return this;
        }

        /**
         * The maximum size of memory that is available to the sidecar proxy init container.
         */
        public Builder proxyInitMemoryResourceLimit(String proxyInitMemoryResourceLimit) {
            this.putBodyParameter("ProxyInitMemoryResourceLimit", proxyInitMemoryResourceLimit);
            this.proxyInitMemoryResourceLimit = proxyInitMemoryResourceLimit;
            return this;
        }

        /**
         * The minimum size of memory that is requested by the sidecar proxy init container.
         */
        public Builder proxyInitMemoryResourceRequest(String proxyInitMemoryResourceRequest) {
            this.putBodyParameter("ProxyInitMemoryResourceRequest", proxyInitMemoryResourceRequest);
            this.proxyInitMemoryResourceRequest = proxyInitMemoryResourceRequest;
            return this;
        }

        /**
         * ProxyMetadata.
         */
        public Builder proxyMetadata(String proxyMetadata) {
            this.putBodyParameter("ProxyMetadata", proxyMetadata);
            this.proxyMetadata = proxyMetadata;
            return this;
        }

        /**
         * The monitoring metrics for data collected by Envoy proxies. The value is in the JSON format.
         */
        public Builder proxyStatsMatcher(String proxyStatsMatcher) {
            this.putBodyParameter("ProxyStatsMatcher", proxyStatsMatcher);
            this.proxyStatsMatcher = proxyStatsMatcher;
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
         * SidecarProxyAckSloCPUResourceLimit.
         */
        public Builder sidecarProxyAckSloCPUResourceLimit(String sidecarProxyAckSloCPUResourceLimit) {
            this.putBodyParameter("SidecarProxyAckSloCPUResourceLimit", sidecarProxyAckSloCPUResourceLimit);
            this.sidecarProxyAckSloCPUResourceLimit = sidecarProxyAckSloCPUResourceLimit;
            return this;
        }

        /**
         * SidecarProxyAckSloCPUResourceRequest.
         */
        public Builder sidecarProxyAckSloCPUResourceRequest(String sidecarProxyAckSloCPUResourceRequest) {
            this.putBodyParameter("SidecarProxyAckSloCPUResourceRequest", sidecarProxyAckSloCPUResourceRequest);
            this.sidecarProxyAckSloCPUResourceRequest = sidecarProxyAckSloCPUResourceRequest;
            return this;
        }

        /**
         * SidecarProxyAckSloMemoryResourceLimit.
         */
        public Builder sidecarProxyAckSloMemoryResourceLimit(String sidecarProxyAckSloMemoryResourceLimit) {
            this.putBodyParameter("SidecarProxyAckSloMemoryResourceLimit", sidecarProxyAckSloMemoryResourceLimit);
            this.sidecarProxyAckSloMemoryResourceLimit = sidecarProxyAckSloMemoryResourceLimit;
            return this;
        }

        /**
         * SidecarProxyAckSloMemoryResourceRequest.
         */
        public Builder sidecarProxyAckSloMemoryResourceRequest(String sidecarProxyAckSloMemoryResourceRequest) {
            this.putBodyParameter("SidecarProxyAckSloMemoryResourceRequest", sidecarProxyAckSloMemoryResourceRequest);
            this.sidecarProxyAckSloMemoryResourceRequest = sidecarProxyAckSloMemoryResourceRequest;
            return this;
        }

        /**
         * The maximum number of CPU cores that are available to the sidecar proxy container.
         */
        public Builder sidecarProxyCPUResourceLimit(String sidecarProxyCPUResourceLimit) {
            this.putBodyParameter("SidecarProxyCPUResourceLimit", sidecarProxyCPUResourceLimit);
            this.sidecarProxyCPUResourceLimit = sidecarProxyCPUResourceLimit;
            return this;
        }

        /**
         * The minimum number of CPU cores that are requested by the sidecar proxy container.
         */
        public Builder sidecarProxyCPUResourceRequest(String sidecarProxyCPUResourceRequest) {
            this.putBodyParameter("SidecarProxyCPUResourceRequest", sidecarProxyCPUResourceRequest);
            this.sidecarProxyCPUResourceRequest = sidecarProxyCPUResourceRequest;
            return this;
        }

        /**
         * The maximum size of memory that is available to the sidecar proxy container.
         */
        public Builder sidecarProxyMemoryResourceLimit(String sidecarProxyMemoryResourceLimit) {
            this.putBodyParameter("SidecarProxyMemoryResourceLimit", sidecarProxyMemoryResourceLimit);
            this.sidecarProxyMemoryResourceLimit = sidecarProxyMemoryResourceLimit;
            return this;
        }

        /**
         * The minimum size of memory that is requested by the sidecar proxy container.
         */
        public Builder sidecarProxyMemoryResourceRequest(String sidecarProxyMemoryResourceRequest) {
            this.putBodyParameter("SidecarProxyMemoryResourceRequest", sidecarProxyMemoryResourceRequest);
            this.sidecarProxyMemoryResourceRequest = sidecarProxyMemoryResourceRequest;
            return this;
        }

        /**
         * The maximum period of time that the sidecar proxy waits for a request to end.
         */
        public Builder terminationDrainDuration(String terminationDrainDuration) {
            this.putBodyParameter("TerminationDrainDuration", terminationDrainDuration);
            this.terminationDrainDuration = terminationDrainDuration;
            return this;
        }

        /**
         * The custom configurations of Tracing Analysis. The configurations must be serialized into JSON strings. The configurations contain the following parameters:
         * <p>
         * 
         * *   `sampling`: The sampling rate, which is of the DOUBLE type.
         * 
         * *   `custom_tags`: The custom tags added to reported spans, which are of the MAP type. The key of a tag is of the string type. The value of a tag is in the JSON format. A custom tag can belong to one of the following types:
         * 
         *     *   `literal`: The tag value is a fixed value in the JSON format. This tag must contain the `value` field that specifies a literal. Example: `{"value":"test"}`.
         *     *   `header`: The tag value is a request header in the JSON format. This tag must contain the `name` field and `defaultValue` field.The name field indicates the name of the request header. The defaultValue field indicates the default value that is used when no request header is available. Example: `{"name":"test","defaultValue":"test"}`.
         *     *   `environment`: The tag value is an environment variable in the JSON format. This tag must contain the `name` field and `defaultValue` field. The name field indicates the name of the environment variable. The defaultValue field indicates the environment variable that is used when no environment variable is available. Example: `{"name":"test","defaultValue":"test"}`.
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

}
