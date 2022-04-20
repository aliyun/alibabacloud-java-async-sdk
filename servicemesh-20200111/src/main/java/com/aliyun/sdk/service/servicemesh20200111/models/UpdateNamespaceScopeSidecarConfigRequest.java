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
    @NameInMap("ProxyStatsMatcher")
    private String proxyStatsMatcher;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

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
        this.istioDNSProxyEnabled = builder.istioDNSProxyEnabled;
        this.lifecycle = builder.lifecycle;
        this.logLevel = builder.logLevel;
        this.namespace = builder.namespace;
        this.postStart = builder.postStart;
        this.preStop = builder.preStop;
        this.proxyInitCPUResourceLimit = builder.proxyInitCPUResourceLimit;
        this.proxyInitCPUResourceRequest = builder.proxyInitCPUResourceRequest;
        this.proxyInitMemoryResourceLimit = builder.proxyInitMemoryResourceLimit;
        this.proxyInitMemoryResourceRequest = builder.proxyInitMemoryResourceRequest;
        this.proxyStatsMatcher = builder.proxyStatsMatcher;
        this.serviceMeshId = builder.serviceMeshId;
        this.sidecarProxyCPUResourceLimit = builder.sidecarProxyCPUResourceLimit;
        this.sidecarProxyCPUResourceRequest = builder.sidecarProxyCPUResourceRequest;
        this.sidecarProxyMemoryResourceLimit = builder.sidecarProxyMemoryResourceLimit;
        this.sidecarProxyMemoryResourceRequest = builder.sidecarProxyMemoryResourceRequest;
        this.terminationDrainDuration = builder.terminationDrainDuration;
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

    public static final class Builder extends Request.Builder<UpdateNamespaceScopeSidecarConfigRequest, Builder> {
        private Integer concurrency; 
        private String excludeIPRanges; 
        private String excludeInboundPorts; 
        private String excludeOutboundPorts; 
        private Boolean holdApplicationUntilProxyStarts; 
        private String includeIPRanges; 
        private String includeInboundPorts; 
        private String includeOutboundPorts; 
        private Boolean istioDNSProxyEnabled; 
        private String lifecycle; 
        private String logLevel; 
        private String namespace; 
        private String postStart; 
        private String preStop; 
        private String proxyInitCPUResourceLimit; 
        private String proxyInitCPUResourceRequest; 
        private String proxyInitMemoryResourceLimit; 
        private String proxyInitMemoryResourceRequest; 
        private String proxyStatsMatcher; 
        private String serviceMeshId; 
        private String sidecarProxyCPUResourceLimit; 
        private String sidecarProxyCPUResourceRequest; 
        private String sidecarProxyMemoryResourceLimit; 
        private String sidecarProxyMemoryResourceRequest; 
        private String terminationDrainDuration; 

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
            this.istioDNSProxyEnabled = request.istioDNSProxyEnabled;
            this.lifecycle = request.lifecycle;
            this.logLevel = request.logLevel;
            this.namespace = request.namespace;
            this.postStart = request.postStart;
            this.preStop = request.preStop;
            this.proxyInitCPUResourceLimit = request.proxyInitCPUResourceLimit;
            this.proxyInitCPUResourceRequest = request.proxyInitCPUResourceRequest;
            this.proxyInitMemoryResourceLimit = request.proxyInitMemoryResourceLimit;
            this.proxyInitMemoryResourceRequest = request.proxyInitMemoryResourceRequest;
            this.proxyStatsMatcher = request.proxyStatsMatcher;
            this.serviceMeshId = request.serviceMeshId;
            this.sidecarProxyCPUResourceLimit = request.sidecarProxyCPUResourceLimit;
            this.sidecarProxyCPUResourceRequest = request.sidecarProxyCPUResourceRequest;
            this.sidecarProxyMemoryResourceLimit = request.sidecarProxyMemoryResourceLimit;
            this.sidecarProxyMemoryResourceRequest = request.sidecarProxyMemoryResourceRequest;
            this.terminationDrainDuration = request.terminationDrainDuration;
        } 

        /**
         * Concurrency.
         */
        public Builder concurrency(Integer concurrency) {
            this.putBodyParameter("Concurrency", concurrency);
            this.concurrency = concurrency;
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
         * HoldApplicationUntilProxyStarts.
         */
        public Builder holdApplicationUntilProxyStarts(Boolean holdApplicationUntilProxyStarts) {
            this.putBodyParameter("HoldApplicationUntilProxyStarts", holdApplicationUntilProxyStarts);
            this.holdApplicationUntilProxyStarts = holdApplicationUntilProxyStarts;
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
         * IncludeOutboundPorts.
         */
        public Builder includeOutboundPorts(String includeOutboundPorts) {
            this.putBodyParameter("IncludeOutboundPorts", includeOutboundPorts);
            this.includeOutboundPorts = includeOutboundPorts;
            return this;
        }

        /**
         * IstioDNSProxyEnabled.
         */
        public Builder istioDNSProxyEnabled(Boolean istioDNSProxyEnabled) {
            this.putBodyParameter("IstioDNSProxyEnabled", istioDNSProxyEnabled);
            this.istioDNSProxyEnabled = istioDNSProxyEnabled;
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
         * LogLevel.
         */
        public Builder logLevel(String logLevel) {
            this.putBodyParameter("LogLevel", logLevel);
            this.logLevel = logLevel;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * PostStart.
         */
        public Builder postStart(String postStart) {
            this.putBodyParameter("PostStart", postStart);
            this.postStart = postStart;
            return this;
        }

        /**
         * PreStop.
         */
        public Builder preStop(String preStop) {
            this.putBodyParameter("PreStop", preStop);
            this.preStop = preStop;
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
         * ProxyStatsMatcher.
         */
        public Builder proxyStatsMatcher(String proxyStatsMatcher) {
            this.putBodyParameter("ProxyStatsMatcher", proxyStatsMatcher);
            this.proxyStatsMatcher = proxyStatsMatcher;
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
         * SidecarProxyCPUResourceLimit.
         */
        public Builder sidecarProxyCPUResourceLimit(String sidecarProxyCPUResourceLimit) {
            this.putBodyParameter("SidecarProxyCPUResourceLimit", sidecarProxyCPUResourceLimit);
            this.sidecarProxyCPUResourceLimit = sidecarProxyCPUResourceLimit;
            return this;
        }

        /**
         * SidecarProxyCPUResourceRequest.
         */
        public Builder sidecarProxyCPUResourceRequest(String sidecarProxyCPUResourceRequest) {
            this.putBodyParameter("SidecarProxyCPUResourceRequest", sidecarProxyCPUResourceRequest);
            this.sidecarProxyCPUResourceRequest = sidecarProxyCPUResourceRequest;
            return this;
        }

        /**
         * SidecarProxyMemoryResourceLimit.
         */
        public Builder sidecarProxyMemoryResourceLimit(String sidecarProxyMemoryResourceLimit) {
            this.putBodyParameter("SidecarProxyMemoryResourceLimit", sidecarProxyMemoryResourceLimit);
            this.sidecarProxyMemoryResourceLimit = sidecarProxyMemoryResourceLimit;
            return this;
        }

        /**
         * SidecarProxyMemoryResourceRequest.
         */
        public Builder sidecarProxyMemoryResourceRequest(String sidecarProxyMemoryResourceRequest) {
            this.putBodyParameter("SidecarProxyMemoryResourceRequest", sidecarProxyMemoryResourceRequest);
            this.sidecarProxyMemoryResourceRequest = sidecarProxyMemoryResourceRequest;
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

        @Override
        public UpdateNamespaceScopeSidecarConfigRequest build() {
            return new UpdateNamespaceScopeSidecarConfigRequest(this);
        } 

    } 

}
