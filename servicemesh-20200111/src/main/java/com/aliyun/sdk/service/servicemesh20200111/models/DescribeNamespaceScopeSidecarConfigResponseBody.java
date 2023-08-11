// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespaceScopeSidecarConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNamespaceScopeSidecarConfigResponseBody</p>
 */
public class DescribeNamespaceScopeSidecarConfigResponseBody extends TeaModel {
    @NameInMap("ConfigPatches")
    private ConfigPatches configPatches;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeNamespaceScopeSidecarConfigResponseBody(Builder builder) {
        this.configPatches = builder.configPatches;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNamespaceScopeSidecarConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return configPatches
     */
    public ConfigPatches getConfigPatches() {
        return this.configPatches;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ConfigPatches configPatches; 
        private String requestId; 

        /**
         * The namespace-level sidecar proxy configurations.
         */
        public Builder configPatches(ConfigPatches configPatches) {
            this.configPatches = configPatches;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBody build() {
            return new DescribeNamespaceScopeSidecarConfigResponseBody(this);
        } 

    } 

    public static class ProxyStatsMatcher extends TeaModel {
        @NameInMap("InclusionPrefixes")
        private java.util.List < String > inclusionPrefixes;

        @NameInMap("InclusionRegexps")
        private java.util.List < String > inclusionRegexps;

        @NameInMap("InclusionSuffixes")
        private java.util.List < String > inclusionSuffixes;

        private ProxyStatsMatcher(Builder builder) {
            this.inclusionPrefixes = builder.inclusionPrefixes;
            this.inclusionRegexps = builder.inclusionRegexps;
            this.inclusionSuffixes = builder.inclusionSuffixes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyStatsMatcher create() {
            return builder().build();
        }

        /**
         * @return inclusionPrefixes
         */
        public java.util.List < String > getInclusionPrefixes() {
            return this.inclusionPrefixes;
        }

        /**
         * @return inclusionRegexps
         */
        public java.util.List < String > getInclusionRegexps() {
            return this.inclusionRegexps;
        }

        /**
         * @return inclusionSuffixes
         */
        public java.util.List < String > getInclusionSuffixes() {
            return this.inclusionSuffixes;
        }

        public static final class Builder {
            private java.util.List < String > inclusionPrefixes; 
            private java.util.List < String > inclusionRegexps; 
            private java.util.List < String > inclusionSuffixes; 

            /**
             * The prefixes of the custom Envoy statistics that are reported by the sidecar proxy.
             */
            public Builder inclusionPrefixes(java.util.List < String > inclusionPrefixes) {
                this.inclusionPrefixes = inclusionPrefixes;
                return this;
            }

            /**
             * The regular expressions for specifying the custom Envoy statistics that are reported by the sidecar proxy.
             */
            public Builder inclusionRegexps(java.util.List < String > inclusionRegexps) {
                this.inclusionRegexps = inclusionRegexps;
                return this;
            }

            /**
             * The suffixes of the custom Envoy statistics that are reported by the sidecar proxy.
             */
            public Builder inclusionSuffixes(java.util.List < String > inclusionSuffixes) {
                this.inclusionSuffixes = inclusionSuffixes;
                return this;
            }

            public ProxyStatsMatcher build() {
                return new ProxyStatsMatcher(this);
            } 

        } 

    }
    public static class SidecarProxyAckSloResource extends TeaModel {
        @NameInMap("Limits")
        private java.util.Map < String, String > limits;

        @NameInMap("Requests")
        private java.util.Map < String, String > requests;

        private SidecarProxyAckSloResource(Builder builder) {
            this.limits = builder.limits;
            this.requests = builder.requests;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarProxyAckSloResource create() {
            return builder().build();
        }

        /**
         * @return limits
         */
        public java.util.Map < String, String > getLimits() {
            return this.limits;
        }

        /**
         * @return requests
         */
        public java.util.Map < String, String > getRequests() {
            return this.requests;
        }

        public static final class Builder {
            private java.util.Map < String, String > limits; 
            private java.util.Map < String, String > requests; 

            /**
             * Limits.
             */
            public Builder limits(java.util.Map < String, String > limits) {
                this.limits = limits;
                return this;
            }

            /**
             * Requests.
             */
            public Builder requests(java.util.Map < String, String > requests) {
                this.requests = requests;
                return this;
            }

            public SidecarProxyAckSloResource build() {
                return new SidecarProxyAckSloResource(this);
            } 

        } 

    }
    public static class SidecarProxyInitAckSloResource extends TeaModel {
        @NameInMap("Limits")
        private java.util.Map < String, String > limits;

        @NameInMap("Requests")
        private java.util.Map < String, String > requests;

        private SidecarProxyInitAckSloResource(Builder builder) {
            this.limits = builder.limits;
            this.requests = builder.requests;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarProxyInitAckSloResource create() {
            return builder().build();
        }

        /**
         * @return limits
         */
        public java.util.Map < String, String > getLimits() {
            return this.limits;
        }

        /**
         * @return requests
         */
        public java.util.Map < String, String > getRequests() {
            return this.requests;
        }

        public static final class Builder {
            private java.util.Map < String, String > limits; 
            private java.util.Map < String, String > requests; 

            /**
             * Limits.
             */
            public Builder limits(java.util.Map < String, String > limits) {
                this.limits = limits;
                return this;
            }

            /**
             * Requests.
             */
            public Builder requests(java.util.Map < String, String > requests) {
                this.requests = requests;
                return this;
            }

            public SidecarProxyInitAckSloResource build() {
                return new SidecarProxyInitAckSloResource(this);
            } 

        } 

    }
    public static class SidecarProxyInitResourceLimit extends TeaModel {
        @NameInMap("ResourceCPULimit")
        private String resourceCPULimit;

        @NameInMap("ResourceMemoryLimit")
        private String resourceMemoryLimit;

        private SidecarProxyInitResourceLimit(Builder builder) {
            this.resourceCPULimit = builder.resourceCPULimit;
            this.resourceMemoryLimit = builder.resourceMemoryLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarProxyInitResourceLimit create() {
            return builder().build();
        }

        /**
         * @return resourceCPULimit
         */
        public String getResourceCPULimit() {
            return this.resourceCPULimit;
        }

        /**
         * @return resourceMemoryLimit
         */
        public String getResourceMemoryLimit() {
            return this.resourceMemoryLimit;
        }

        public static final class Builder {
            private String resourceCPULimit; 
            private String resourceMemoryLimit; 

            /**
             * The maximum number of CPU cores.
             */
            public Builder resourceCPULimit(String resourceCPULimit) {
                this.resourceCPULimit = resourceCPULimit;
                return this;
            }

            /**
             * The maximum size of the memory.
             */
            public Builder resourceMemoryLimit(String resourceMemoryLimit) {
                this.resourceMemoryLimit = resourceMemoryLimit;
                return this;
            }

            public SidecarProxyInitResourceLimit build() {
                return new SidecarProxyInitResourceLimit(this);
            } 

        } 

    }
    public static class SidecarProxyInitResourceRequest extends TeaModel {
        @NameInMap("ResourceCPURequest")
        private String resourceCPURequest;

        @NameInMap("ResourceMemoryRequest")
        private String resourceMemoryRequest;

        private SidecarProxyInitResourceRequest(Builder builder) {
            this.resourceCPURequest = builder.resourceCPURequest;
            this.resourceMemoryRequest = builder.resourceMemoryRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarProxyInitResourceRequest create() {
            return builder().build();
        }

        /**
         * @return resourceCPURequest
         */
        public String getResourceCPURequest() {
            return this.resourceCPURequest;
        }

        /**
         * @return resourceMemoryRequest
         */
        public String getResourceMemoryRequest() {
            return this.resourceMemoryRequest;
        }

        public static final class Builder {
            private String resourceCPURequest; 
            private String resourceMemoryRequest; 

            /**
             * The minimum number of CPU cores.
             */
            public Builder resourceCPURequest(String resourceCPURequest) {
                this.resourceCPURequest = resourceCPURequest;
                return this;
            }

            /**
             * The minimum size of the memory.
             */
            public Builder resourceMemoryRequest(String resourceMemoryRequest) {
                this.resourceMemoryRequest = resourceMemoryRequest;
                return this;
            }

            public SidecarProxyInitResourceRequest build() {
                return new SidecarProxyInitResourceRequest(this);
            } 

        } 

    }
    public static class SidecarProxyResourceLimit extends TeaModel {
        @NameInMap("ResourceCPULimit")
        private String resourceCPULimit;

        @NameInMap("ResourceMemoryLimit")
        private String resourceMemoryLimit;

        private SidecarProxyResourceLimit(Builder builder) {
            this.resourceCPULimit = builder.resourceCPULimit;
            this.resourceMemoryLimit = builder.resourceMemoryLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarProxyResourceLimit create() {
            return builder().build();
        }

        /**
         * @return resourceCPULimit
         */
        public String getResourceCPULimit() {
            return this.resourceCPULimit;
        }

        /**
         * @return resourceMemoryLimit
         */
        public String getResourceMemoryLimit() {
            return this.resourceMemoryLimit;
        }

        public static final class Builder {
            private String resourceCPULimit; 
            private String resourceMemoryLimit; 

            /**
             * The maximum number of CPU cores.
             */
            public Builder resourceCPULimit(String resourceCPULimit) {
                this.resourceCPULimit = resourceCPULimit;
                return this;
            }

            /**
             * The maximum size of the memory.
             */
            public Builder resourceMemoryLimit(String resourceMemoryLimit) {
                this.resourceMemoryLimit = resourceMemoryLimit;
                return this;
            }

            public SidecarProxyResourceLimit build() {
                return new SidecarProxyResourceLimit(this);
            } 

        } 

    }
    public static class SidecarProxyResourceRequest extends TeaModel {
        @NameInMap("ResourceCPURequest")
        private String resourceCPURequest;

        @NameInMap("ResourceMemoryRequest")
        private String resourceMemoryRequest;

        private SidecarProxyResourceRequest(Builder builder) {
            this.resourceCPURequest = builder.resourceCPURequest;
            this.resourceMemoryRequest = builder.resourceMemoryRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarProxyResourceRequest create() {
            return builder().build();
        }

        /**
         * @return resourceCPURequest
         */
        public String getResourceCPURequest() {
            return this.resourceCPURequest;
        }

        /**
         * @return resourceMemoryRequest
         */
        public String getResourceMemoryRequest() {
            return this.resourceMemoryRequest;
        }

        public static final class Builder {
            private String resourceCPURequest; 
            private String resourceMemoryRequest; 

            /**
             * The minimum number of CPU cores.
             */
            public Builder resourceCPURequest(String resourceCPURequest) {
                this.resourceCPURequest = resourceCPURequest;
                return this;
            }

            /**
             * The minimum size of the memory.
             */
            public Builder resourceMemoryRequest(String resourceMemoryRequest) {
                this.resourceMemoryRequest = resourceMemoryRequest;
                return this;
            }

            public SidecarProxyResourceRequest build() {
                return new SidecarProxyResourceRequest(this);
            } 

        } 

    }
    public static class Tracing extends TeaModel {
        @NameInMap("CustomTags")
        private java.util.Map < String, ? > customTags;

        @NameInMap("MaxPathTagLength")
        private Integer maxPathTagLength;

        @NameInMap("Sampling")
        private Double sampling;

        private Tracing(Builder builder) {
            this.customTags = builder.customTags;
            this.maxPathTagLength = builder.maxPathTagLength;
            this.sampling = builder.sampling;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tracing create() {
            return builder().build();
        }

        /**
         * @return customTags
         */
        public java.util.Map < String, ? > getCustomTags() {
            return this.customTags;
        }

        /**
         * @return maxPathTagLength
         */
        public Integer getMaxPathTagLength() {
            return this.maxPathTagLength;
        }

        /**
         * @return sampling
         */
        public Double getSampling() {
            return this.sampling;
        }

        public static final class Builder {
            private java.util.Map < String, ? > customTags; 
            private Integer maxPathTagLength; 
            private Double sampling; 

            /**
             * The custom tags added to reported spans. The key of a tag is of the string type. The value of a tag is in the JSON format. A custom tag can belong to one of the following types:
             * <p>
             * 
             * *   `literal`: The tag value is a fixed value in the JSON format. This tag must contain the `value` field that specifies a literal. Example: `{"value":"test"}`.
             * *   `header`: The tag value is a request header in the JSON format. This tag must contain the `name` field and the `defaultValue` field. The name field indicates the name of the request header. The defaultValue field indicates the default value that is used when no request header is available. Example: `{"name":"test","defaultValue":"test"}`.
             * *   `environment`: The tag value is an environment variable in the JSON format. This tag must contain the `name` field and the `defaultValue` field. The name field indicates the name of the environment variable. The defaultValue field indicates the environment variable that is used when no environment variable is available. Example: `{"name":"test","defaultValue":"test"}`.
             */
            public Builder customTags(java.util.Map < String, ? > customTags) {
                this.customTags = customTags;
                return this;
            }

            /**
             * The maximum tag length.
             */
            public Builder maxPathTagLength(Integer maxPathTagLength) {
                this.maxPathTagLength = maxPathTagLength;
                return this;
            }

            /**
             * The sampling rate.
             */
            public Builder sampling(Double sampling) {
                this.sampling = sampling;
                return this;
            }

            public Tracing build() {
                return new Tracing(this);
            } 

        } 

    }
    public static class ConfigPatches extends TeaModel {
        @NameInMap("Concurrency")
        private Integer concurrency;

        @NameInMap("ExcludeInboundPorts")
        private String excludeInboundPorts;

        @NameInMap("ExcludeOutboundIPRanges")
        private String excludeOutboundIPRanges;

        @NameInMap("ExcludeOutboundPorts")
        private String excludeOutboundPorts;

        @NameInMap("HoldApplicationUntilProxyStarts")
        private Boolean holdApplicationUntilProxyStarts;

        @NameInMap("IncludeInboundPorts")
        private String includeInboundPorts;

        @NameInMap("IncludeOutboundIPRanges")
        private String includeOutboundIPRanges;

        @NameInMap("IncludeOutboundPorts")
        private String includeOutboundPorts;

        @NameInMap("InterceptionMode")
        private String interceptionMode;

        @NameInMap("IstioDNSProxyEnabled")
        private Boolean istioDNSProxyEnabled;

        @NameInMap("LifecycleStr")
        private String lifecycleStr;

        @NameInMap("LogLevel")
        private String logLevel;

        @NameInMap("ProxyMetadata")
        private java.util.Map < String, String > proxyMetadata;

        @NameInMap("ProxyStatsMatcher")
        private ProxyStatsMatcher proxyStatsMatcher;

        @NameInMap("SidecarProxyAckSloResource")
        private SidecarProxyAckSloResource sidecarProxyAckSloResource;

        @NameInMap("SidecarProxyInitAckSloResource")
        private SidecarProxyInitAckSloResource sidecarProxyInitAckSloResource;

        @NameInMap("SidecarProxyInitResourceLimit")
        private SidecarProxyInitResourceLimit sidecarProxyInitResourceLimit;

        @NameInMap("SidecarProxyInitResourceRequest")
        private SidecarProxyInitResourceRequest sidecarProxyInitResourceRequest;

        @NameInMap("SidecarProxyResourceLimit")
        private SidecarProxyResourceLimit sidecarProxyResourceLimit;

        @NameInMap("SidecarProxyResourceRequest")
        private SidecarProxyResourceRequest sidecarProxyResourceRequest;

        @NameInMap("TerminationDrainDuration")
        private String terminationDrainDuration;

        @NameInMap("Tracing")
        private Tracing tracing;

        private ConfigPatches(Builder builder) {
            this.concurrency = builder.concurrency;
            this.excludeInboundPorts = builder.excludeInboundPorts;
            this.excludeOutboundIPRanges = builder.excludeOutboundIPRanges;
            this.excludeOutboundPorts = builder.excludeOutboundPorts;
            this.holdApplicationUntilProxyStarts = builder.holdApplicationUntilProxyStarts;
            this.includeInboundPorts = builder.includeInboundPorts;
            this.includeOutboundIPRanges = builder.includeOutboundIPRanges;
            this.includeOutboundPorts = builder.includeOutboundPorts;
            this.interceptionMode = builder.interceptionMode;
            this.istioDNSProxyEnabled = builder.istioDNSProxyEnabled;
            this.lifecycleStr = builder.lifecycleStr;
            this.logLevel = builder.logLevel;
            this.proxyMetadata = builder.proxyMetadata;
            this.proxyStatsMatcher = builder.proxyStatsMatcher;
            this.sidecarProxyAckSloResource = builder.sidecarProxyAckSloResource;
            this.sidecarProxyInitAckSloResource = builder.sidecarProxyInitAckSloResource;
            this.sidecarProxyInitResourceLimit = builder.sidecarProxyInitResourceLimit;
            this.sidecarProxyInitResourceRequest = builder.sidecarProxyInitResourceRequest;
            this.sidecarProxyResourceLimit = builder.sidecarProxyResourceLimit;
            this.sidecarProxyResourceRequest = builder.sidecarProxyResourceRequest;
            this.terminationDrainDuration = builder.terminationDrainDuration;
            this.tracing = builder.tracing;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigPatches create() {
            return builder().build();
        }

        /**
         * @return concurrency
         */
        public Integer getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return excludeInboundPorts
         */
        public String getExcludeInboundPorts() {
            return this.excludeInboundPorts;
        }

        /**
         * @return excludeOutboundIPRanges
         */
        public String getExcludeOutboundIPRanges() {
            return this.excludeOutboundIPRanges;
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
         * @return includeInboundPorts
         */
        public String getIncludeInboundPorts() {
            return this.includeInboundPorts;
        }

        /**
         * @return includeOutboundIPRanges
         */
        public String getIncludeOutboundIPRanges() {
            return this.includeOutboundIPRanges;
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
         * @return lifecycleStr
         */
        public String getLifecycleStr() {
            return this.lifecycleStr;
        }

        /**
         * @return logLevel
         */
        public String getLogLevel() {
            return this.logLevel;
        }

        /**
         * @return proxyMetadata
         */
        public java.util.Map < String, String > getProxyMetadata() {
            return this.proxyMetadata;
        }

        /**
         * @return proxyStatsMatcher
         */
        public ProxyStatsMatcher getProxyStatsMatcher() {
            return this.proxyStatsMatcher;
        }

        /**
         * @return sidecarProxyAckSloResource
         */
        public SidecarProxyAckSloResource getSidecarProxyAckSloResource() {
            return this.sidecarProxyAckSloResource;
        }

        /**
         * @return sidecarProxyInitAckSloResource
         */
        public SidecarProxyInitAckSloResource getSidecarProxyInitAckSloResource() {
            return this.sidecarProxyInitAckSloResource;
        }

        /**
         * @return sidecarProxyInitResourceLimit
         */
        public SidecarProxyInitResourceLimit getSidecarProxyInitResourceLimit() {
            return this.sidecarProxyInitResourceLimit;
        }

        /**
         * @return sidecarProxyInitResourceRequest
         */
        public SidecarProxyInitResourceRequest getSidecarProxyInitResourceRequest() {
            return this.sidecarProxyInitResourceRequest;
        }

        /**
         * @return sidecarProxyResourceLimit
         */
        public SidecarProxyResourceLimit getSidecarProxyResourceLimit() {
            return this.sidecarProxyResourceLimit;
        }

        /**
         * @return sidecarProxyResourceRequest
         */
        public SidecarProxyResourceRequest getSidecarProxyResourceRequest() {
            return this.sidecarProxyResourceRequest;
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
        public Tracing getTracing() {
            return this.tracing;
        }

        public static final class Builder {
            private Integer concurrency; 
            private String excludeInboundPorts; 
            private String excludeOutboundIPRanges; 
            private String excludeOutboundPorts; 
            private Boolean holdApplicationUntilProxyStarts; 
            private String includeInboundPorts; 
            private String includeOutboundIPRanges; 
            private String includeOutboundPorts; 
            private String interceptionMode; 
            private Boolean istioDNSProxyEnabled; 
            private String lifecycleStr; 
            private String logLevel; 
            private java.util.Map < String, String > proxyMetadata; 
            private ProxyStatsMatcher proxyStatsMatcher; 
            private SidecarProxyAckSloResource sidecarProxyAckSloResource; 
            private SidecarProxyInitAckSloResource sidecarProxyInitAckSloResource; 
            private SidecarProxyInitResourceLimit sidecarProxyInitResourceLimit; 
            private SidecarProxyInitResourceRequest sidecarProxyInitResourceRequest; 
            private SidecarProxyResourceLimit sidecarProxyResourceLimit; 
            private SidecarProxyResourceRequest sidecarProxyResourceRequest; 
            private String terminationDrainDuration; 
            private Tracing tracing; 

            /**
             * The number of worker threads to run in the istio-proxy container.
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * The inbound ports to be excluded from redirection to the sidecar proxy in the ASM instance.
             */
            public Builder excludeInboundPorts(String excludeInboundPorts) {
                this.excludeInboundPorts = excludeInboundPorts;
                return this;
            }

            /**
             * The outbound IP ranges in CIDR form to be excluded from redirection to the sidecar proxy in the ASM instance.
             */
            public Builder excludeOutboundIPRanges(String excludeOutboundIPRanges) {
                this.excludeOutboundIPRanges = excludeOutboundIPRanges;
                return this;
            }

            /**
             * The outbound ports to be excluded from redirection to the sidecar proxy in the ASM instance.
             */
            public Builder excludeOutboundPorts(String excludeOutboundPorts) {
                this.excludeOutboundPorts = excludeOutboundPorts;
                return this;
            }

            /**
             * Indicates whether applications can be started only after the istio-proxy container starts. Valid values:
             * <p>
             * 
             * *   `true`
             * *   false
             */
            public Builder holdApplicationUntilProxyStarts(Boolean holdApplicationUntilProxyStarts) {
                this.holdApplicationUntilProxyStarts = holdApplicationUntilProxyStarts;
                return this;
            }

            /**
             * The inbound ports for which traffic is to be redirected to the sidecar proxy in the ASM instance.
             */
            public Builder includeInboundPorts(String includeInboundPorts) {
                this.includeInboundPorts = includeInboundPorts;
                return this;
            }

            /**
             * The outbound IP ranges in CIDR form for which traffic is to be redirected to the sidecar proxy in the ASM instance.
             */
            public Builder includeOutboundIPRanges(String includeOutboundIPRanges) {
                this.includeOutboundIPRanges = includeOutboundIPRanges;
                return this;
            }

            /**
             * The outbound ports for which traffic is to be redirected to the sidecar proxy in the ASM instance.
             */
            public Builder includeOutboundPorts(String includeOutboundPorts) {
                this.includeOutboundPorts = includeOutboundPorts;
                return this;
            }

            /**
             * The mode in which the sidecar proxy intercepts inbound traffic. Valid values:
             * <p>
             * 
             * *   `REDIRECT` (default): In this mode, source IP addresses are lost during traffic redirection to the sidecar proxy.
             * *   `TPROXY`: In this mode, both the source and destination IP addresses and ports are preserved.
             */
            public Builder interceptionMode(String interceptionMode) {
                this.interceptionMode = interceptionMode;
                return this;
            }

            /**
             * Indicates whether the Domain Name System (DNS) proxy feature is enabled. Valid values:
             * <p>
             * 
             * *   `true`
             * *   `false`
             */
            public Builder istioDNSProxyEnabled(Boolean istioDNSProxyEnabled) {
                this.istioDNSProxyEnabled = istioDNSProxyEnabled;
                return this;
            }

            /**
             * The JSON string that describes the lifecycle of the sidecar proxy.
             */
            public Builder lifecycleStr(String lifecycleStr) {
                this.lifecycleStr = lifecycleStr;
                return this;
            }

            /**
             * The log level. Valid values: `info`, `debug`, `trace`, and `error`.
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
                return this;
            }

            /**
             * ProxyMetadata.
             */
            public Builder proxyMetadata(java.util.Map < String, String > proxyMetadata) {
                this.proxyMetadata = proxyMetadata;
                return this;
            }

            /**
             * The custom Envoy statistics that are reported by the sidecar proxy.
             */
            public Builder proxyStatsMatcher(ProxyStatsMatcher proxyStatsMatcher) {
                this.proxyStatsMatcher = proxyStatsMatcher;
                return this;
            }

            /**
             * SidecarProxyAckSloResource.
             */
            public Builder sidecarProxyAckSloResource(SidecarProxyAckSloResource sidecarProxyAckSloResource) {
                this.sidecarProxyAckSloResource = sidecarProxyAckSloResource;
                return this;
            }

            /**
             * SidecarProxyInitAckSloResource.
             */
            public Builder sidecarProxyInitAckSloResource(SidecarProxyInitAckSloResource sidecarProxyInitAckSloResource) {
                this.sidecarProxyInitAckSloResource = sidecarProxyInitAckSloResource;
                return this;
            }

            /**
             * The maximum size of resources that are available to the istio-init container in the pod into which the sidecar proxy is injected. The istio-init container is used in this topic.
             */
            public Builder sidecarProxyInitResourceLimit(SidecarProxyInitResourceLimit sidecarProxyInitResourceLimit) {
                this.sidecarProxyInitResourceLimit = sidecarProxyInitResourceLimit;
                return this;
            }

            /**
             * The minimum size of resources that are required by the istio-init container.
             */
            public Builder sidecarProxyInitResourceRequest(SidecarProxyInitResourceRequest sidecarProxyInitResourceRequest) {
                this.sidecarProxyInitResourceRequest = sidecarProxyInitResourceRequest;
                return this;
            }

            /**
             * The maximum size of resources that are available to the sidecar proxy container.
             */
            public Builder sidecarProxyResourceLimit(SidecarProxyResourceLimit sidecarProxyResourceLimit) {
                this.sidecarProxyResourceLimit = sidecarProxyResourceLimit;
                return this;
            }

            /**
             * The minimum size of resources that are required by the sidecar proxy container.
             */
            public Builder sidecarProxyResourceRequest(SidecarProxyResourceRequest sidecarProxyResourceRequest) {
                this.sidecarProxyResourceRequest = sidecarProxyResourceRequest;
                return this;
            }

            /**
             * The maximum period of time allowed for connections to complete on sidecar proxy shutdown.
             */
            public Builder terminationDrainDuration(String terminationDrainDuration) {
                this.terminationDrainDuration = terminationDrainDuration;
                return this;
            }

            /**
             * The custom configurations of Tracing Analysis.
             */
            public Builder tracing(Tracing tracing) {
                this.tracing = tracing;
                return this;
            }

            public ConfigPatches build() {
                return new ConfigPatches(this);
            } 

        } 

    }
}
