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
 * {@link DescribeNamespaceScopeSidecarConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNamespaceScopeSidecarConfigResponseBody</p>
 */
public class DescribeNamespaceScopeSidecarConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigPatches")
    private ConfigPatches configPatches;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeNamespaceScopeSidecarConfigResponseBody model) {
            this.configPatches = model.configPatches;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The namespace-level sidecar configurations.</p>
         */
        public Builder configPatches(ConfigPatches configPatches) {
            this.configPatches = configPatches;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBody build() {
            return new DescribeNamespaceScopeSidecarConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNamespaceScopeSidecarConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespaceScopeSidecarConfigResponseBody</p>
     */
    public static class ProxyStatsMatcher extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InclusionPrefixes")
        private java.util.List<String> inclusionPrefixes;

        @com.aliyun.core.annotation.NameInMap("InclusionRegexps")
        private java.util.List<String> inclusionRegexps;

        @com.aliyun.core.annotation.NameInMap("InclusionSuffixes")
        private java.util.List<String> inclusionSuffixes;

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
        public java.util.List<String> getInclusionPrefixes() {
            return this.inclusionPrefixes;
        }

        /**
         * @return inclusionRegexps
         */
        public java.util.List<String> getInclusionRegexps() {
            return this.inclusionRegexps;
        }

        /**
         * @return inclusionSuffixes
         */
        public java.util.List<String> getInclusionSuffixes() {
            return this.inclusionSuffixes;
        }

        public static final class Builder {
            private java.util.List<String> inclusionPrefixes; 
            private java.util.List<String> inclusionRegexps; 
            private java.util.List<String> inclusionSuffixes; 

            private Builder() {
            } 

            private Builder(ProxyStatsMatcher model) {
                this.inclusionPrefixes = model.inclusionPrefixes;
                this.inclusionRegexps = model.inclusionRegexps;
                this.inclusionSuffixes = model.inclusionSuffixes;
            } 

            /**
             * <p>The prefixes of the custom Envoy statistics that are reported by the sidecar proxy.</p>
             */
            public Builder inclusionPrefixes(java.util.List<String> inclusionPrefixes) {
                this.inclusionPrefixes = inclusionPrefixes;
                return this;
            }

            /**
             * <p>The regular expressions for specifying the custom Envoy statistics that are reported by the sidecar proxy.</p>
             */
            public Builder inclusionRegexps(java.util.List<String> inclusionRegexps) {
                this.inclusionRegexps = inclusionRegexps;
                return this;
            }

            /**
             * <p>The suffixes of the custom Envoy statistics that are reported by the sidecar proxy.</p>
             */
            public Builder inclusionSuffixes(java.util.List<String> inclusionSuffixes) {
                this.inclusionSuffixes = inclusionSuffixes;
                return this;
            }

            public ProxyStatsMatcher build() {
                return new ProxyStatsMatcher(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNamespaceScopeSidecarConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespaceScopeSidecarConfigResponseBody</p>
     */
    public static class SMCConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private SMCConfiguration(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SMCConfiguration create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(SMCConfiguration model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Indicates whether the SMC-R optimization feature is enabled. The SMC-R optimization feature uses Alibaba Cloud Linux 3 and elastic remote direct memory access (eRDMA) network devices, which optimizes cross-node communication.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public SMCConfiguration build() {
                return new SMCConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNamespaceScopeSidecarConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespaceScopeSidecarConfigResponseBody</p>
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
    /**
     * 
     * {@link DescribeNamespaceScopeSidecarConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespaceScopeSidecarConfigResponseBody</p>
     */
    public static class SidecarProxyAckSloResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limits")
        private java.util.Map<String, String> limits;

        @com.aliyun.core.annotation.NameInMap("Requests")
        private java.util.Map<String, String> requests;

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
        public java.util.Map<String, String> getLimits() {
            return this.limits;
        }

        /**
         * @return requests
         */
        public java.util.Map<String, String> getRequests() {
            return this.requests;
        }

        public static final class Builder {
            private java.util.Map<String, String> limits; 
            private java.util.Map<String, String> requests; 

            private Builder() {
            } 

            private Builder(SidecarProxyAckSloResource model) {
                this.limits = model.limits;
                this.requests = model.requests;
            } 

            /**
             * <p>The maximum size of reclaimed ACK resources that are available to the sidecar proxy container. This configuration item indicates the maximum size of resources that are available to the sidecar proxy container in a pod labeled with <code>koordinator.sh/qosClass</code>. The object can contain the following two types of keys, which indicate two types of resources:</p>
             * <ul>
             * <li><code>kubernetes.io/batch-cpu</code>: CPU resources that can be dynamically overcommitted. Unit: millicore.</li>
             * <li><code>kubernetes.io/batch-memory</code>: memory resources that can be dynamically overcommitted.</li>
             * </ul>
             */
            public Builder limits(java.util.Map<String, String> limits) {
                this.limits = limits;
                return this;
            }

            /**
             * <p>The minimum size of reclaimed ACK resources that the sidecar proxy container needs to use at runtime. This configuration item indicates the minimum size of reclaimed ACK resources for the sidecar proxy container in a pod labeled with <code>koordinator.sh/qosClass</code>. The object can contain the following two types of keys, which indicate two types of resources:</p>
             * <ul>
             * <li><code>kubernetes.io/batch-cpu</code>: CPU resources that can be dynamically overcommitted. Unit: millicore.</li>
             * <li><code>kubernetes.io/batch-memory</code>: memory resources that can be dynamically overcommitted.</li>
             * </ul>
             */
            public Builder requests(java.util.Map<String, String> requests) {
                this.requests = requests;
                return this;
            }

            public SidecarProxyAckSloResource build() {
                return new SidecarProxyAckSloResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNamespaceScopeSidecarConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespaceScopeSidecarConfigResponseBody</p>
     */
    public static class SidecarProxyInitAckSloResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limits")
        private java.util.Map<String, String> limits;

        @com.aliyun.core.annotation.NameInMap("Requests")
        private java.util.Map<String, String> requests;

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
        public java.util.Map<String, String> getLimits() {
            return this.limits;
        }

        /**
         * @return requests
         */
        public java.util.Map<String, String> getRequests() {
            return this.requests;
        }

        public static final class Builder {
            private java.util.Map<String, String> limits; 
            private java.util.Map<String, String> requests; 

            private Builder() {
            } 

            private Builder(SidecarProxyInitAckSloResource model) {
                this.limits = model.limits;
                this.requests = model.requests;
            } 

            /**
             * <p>The maximum size of reclaimed ACK resources that are available to the istio-init container. This configuration item indicates the maximum size of resources that are available to the istio-init container in a pod labeled with <code>koordinator.sh/qosClass</code>. The object can contain the following two types of keys, which indicate two types of resources:</p>
             * <ul>
             * <li><code>kubernetes.io/batch-cpu</code>: CPU resources that can be dynamically overcommitted. Unit: millicore.</li>
             * <li><code>kubernetes.io/batch-memory</code>: memory resources that can be dynamically overcommitted.</li>
             * </ul>
             */
            public Builder limits(java.util.Map<String, String> limits) {
                this.limits = limits;
                return this;
            }

            /**
             * <p>The minimum size of reclaimed ACK resources that the istio-init container needs to use at runtime. This configuration item indicates the minimum size of reclaimed ACK resources for the istio-init container in a pod labeled with <code>koordinator.sh/qosClass</code>. The object can contain the following two types of keys, which indicate two types of resources:</p>
             * <ul>
             * <li><code>kubernetes.io/batch-cpu</code>: CPU resources that can be dynamically overcommitted. Unit: millicore.</li>
             * <li><code>kubernetes.io/batch-memory</code>: memory resources that can be dynamically overcommitted.</li>
             * </ul>
             */
            public Builder requests(java.util.Map<String, String> requests) {
                this.requests = requests;
                return this;
            }

            public SidecarProxyInitAckSloResource build() {
                return new SidecarProxyInitAckSloResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNamespaceScopeSidecarConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespaceScopeSidecarConfigResponseBody</p>
     */
    public static class SidecarProxyInitResourceLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceCPULimit")
        private String resourceCPULimit;

        @com.aliyun.core.annotation.NameInMap("ResourceMemoryLimit")
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

            private Builder() {
            } 

            private Builder(SidecarProxyInitResourceLimit model) {
                this.resourceCPULimit = model.resourceCPULimit;
                this.resourceMemoryLimit = model.resourceMemoryLimit;
            } 

            /**
             * <p>The maximum number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2000 m</p>
             */
            public Builder resourceCPULimit(String resourceCPULimit) {
                this.resourceCPULimit = resourceCPULimit;
                return this;
            }

            /**
             * <p>The maximum size of the memory.</p>
             * 
             * <strong>example:</strong>
             * <p>50 Mi</p>
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
    /**
     * 
     * {@link DescribeNamespaceScopeSidecarConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespaceScopeSidecarConfigResponseBody</p>
     */
    public static class SidecarProxyInitResourceRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceCPURequest")
        private String resourceCPURequest;

        @com.aliyun.core.annotation.NameInMap("ResourceMemoryRequest")
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

            private Builder() {
            } 

            private Builder(SidecarProxyInitResourceRequest model) {
                this.resourceCPURequest = model.resourceCPURequest;
                this.resourceMemoryRequest = model.resourceMemoryRequest;
            } 

            /**
             * <p>The minimum number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>60 m</p>
             */
            public Builder resourceCPURequest(String resourceCPURequest) {
                this.resourceCPURequest = resourceCPURequest;
                return this;
            }

            /**
             * <p>The minimum size of the memory.</p>
             * 
             * <strong>example:</strong>
             * <p>30 Mi</p>
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
    /**
     * 
     * {@link DescribeNamespaceScopeSidecarConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespaceScopeSidecarConfigResponseBody</p>
     */
    public static class SidecarProxyResourceLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceCPULimit")
        private String resourceCPULimit;

        @com.aliyun.core.annotation.NameInMap("ResourceMemoryLimit")
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

            private Builder() {
            } 

            private Builder(SidecarProxyResourceLimit model) {
                this.resourceCPULimit = model.resourceCPULimit;
                this.resourceMemoryLimit = model.resourceMemoryLimit;
            } 

            /**
             * <p>The maximum number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2000 m</p>
             */
            public Builder resourceCPULimit(String resourceCPULimit) {
                this.resourceCPULimit = resourceCPULimit;
                return this;
            }

            /**
             * <p>The maximum size of the memory.</p>
             * 
             * <strong>example:</strong>
             * <p>50 Mi</p>
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
    /**
     * 
     * {@link DescribeNamespaceScopeSidecarConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespaceScopeSidecarConfigResponseBody</p>
     */
    public static class SidecarProxyResourceRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceCPURequest")
        private String resourceCPURequest;

        @com.aliyun.core.annotation.NameInMap("ResourceMemoryRequest")
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

            private Builder() {
            } 

            private Builder(SidecarProxyResourceRequest model) {
                this.resourceCPURequest = model.resourceCPURequest;
                this.resourceMemoryRequest = model.resourceMemoryRequest;
            } 

            /**
             * <p>The minimum number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>60 m</p>
             */
            public Builder resourceCPURequest(String resourceCPURequest) {
                this.resourceCPURequest = resourceCPURequest;
                return this;
            }

            /**
             * <p>The minimum size of the memory.</p>
             * 
             * <strong>example:</strong>
             * <p>30 Mi</p>
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
    /**
     * 
     * {@link DescribeNamespaceScopeSidecarConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespaceScopeSidecarConfigResponseBody</p>
     */
    public static class Tracing extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomTags")
        private java.util.Map<String, ?> customTags;

        @com.aliyun.core.annotation.NameInMap("MaxPathTagLength")
        private Integer maxPathTagLength;

        @com.aliyun.core.annotation.NameInMap("Sampling")
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
        public java.util.Map<String, ?> getCustomTags() {
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
            private java.util.Map<String, ?> customTags; 
            private Integer maxPathTagLength; 
            private Double sampling; 

            private Builder() {
            } 

            private Builder(Tracing model) {
                this.customTags = model.customTags;
                this.maxPathTagLength = model.maxPathTagLength;
                this.sampling = model.sampling;
            } 

            /**
             * <p>The custom tags added to reported spans. The key of a tag is of the string type. The value of a tag is in the JSON format. A custom tag can belong to one of the following types:</p>
             * <ul>
             * <li><code>literal</code>: The tag value is a fixed value in the JSON format. This tag must contain the <code>value</code> field that specifies a literal. Example: <code>{&quot;value&quot;:&quot;test&quot;}</code>.</li>
             * <li><code>header</code>: The tag value is a request header in the JSON format. This tag must contain the <code>name</code> field and the <code>defaultValue</code> field. The name field indicates the name of the request header. The defaultValue field indicates the default value that is used when no request header is available. Example: <code>{&quot;name&quot;:&quot;test&quot;,&quot;defaultValue&quot;:&quot;test&quot;}</code>.</li>
             * <li><code>environment</code>: The tag value is an environment variable in the JSON format. This tag must contain the <code>name</code> field and the <code>defaultValue</code> field. The name field indicates the name of the environment variable. The defaultValue field indicates the environment variable that is used when no environment variable is available. Example: <code>{&quot;name&quot;:&quot;test&quot;,&quot;defaultValue&quot;:&quot;test&quot;}</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;test&quot;:{&quot;literal&quot;:{&quot;value&quot;:&quot;test&quot;}}}</p>
             */
            public Builder customTags(java.util.Map<String, ?> customTags) {
                this.customTags = customTags;
                return this;
            }

            /**
             * <p>The maximum tag length.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxPathTagLength(Integer maxPathTagLength) {
                this.maxPathTagLength = maxPathTagLength;
                return this;
            }

            /**
             * <p>The sampling rate.</p>
             * 
             * <strong>example:</strong>
             * <p>99.8</p>
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
    /**
     * 
     * {@link DescribeNamespaceScopeSidecarConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespaceScopeSidecarConfigResponseBody</p>
     */
    public static class ConfigPatches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private Integer concurrency;

        @com.aliyun.core.annotation.NameInMap("EnableCoreDump")
        private Boolean enableCoreDump;

        @com.aliyun.core.annotation.NameInMap("ExcludeInboundPorts")
        private String excludeInboundPorts;

        @com.aliyun.core.annotation.NameInMap("ExcludeOutboundIPRanges")
        private String excludeOutboundIPRanges;

        @com.aliyun.core.annotation.NameInMap("ExcludeOutboundPorts")
        private String excludeOutboundPorts;

        @com.aliyun.core.annotation.NameInMap("HoldApplicationUntilProxyStarts")
        private Boolean holdApplicationUntilProxyStarts;

        @com.aliyun.core.annotation.NameInMap("IncludeInboundPorts")
        private String includeInboundPorts;

        @com.aliyun.core.annotation.NameInMap("IncludeOutboundIPRanges")
        private String includeOutboundIPRanges;

        @com.aliyun.core.annotation.NameInMap("IncludeOutboundPorts")
        private String includeOutboundPorts;

        @com.aliyun.core.annotation.NameInMap("InterceptionMode")
        private String interceptionMode;

        @com.aliyun.core.annotation.NameInMap("IstioDNSProxyEnabled")
        private Boolean istioDNSProxyEnabled;

        @com.aliyun.core.annotation.NameInMap("LifecycleStr")
        private String lifecycleStr;

        @com.aliyun.core.annotation.NameInMap("LogLevel")
        private String logLevel;

        @com.aliyun.core.annotation.NameInMap("Privileged")
        private Boolean privileged;

        @com.aliyun.core.annotation.NameInMap("ProxyMetadata")
        private java.util.Map<String, String> proxyMetadata;

        @com.aliyun.core.annotation.NameInMap("ProxyStatsMatcher")
        private ProxyStatsMatcher proxyStatsMatcher;

        @com.aliyun.core.annotation.NameInMap("ReadinessFailureThreshold")
        private Integer readinessFailureThreshold;

        @com.aliyun.core.annotation.NameInMap("ReadinessInitialDelaySeconds")
        private Integer readinessInitialDelaySeconds;

        @com.aliyun.core.annotation.NameInMap("ReadinessPeriodSeconds")
        private Integer readinessPeriodSeconds;

        @com.aliyun.core.annotation.NameInMap("RuntimeValues")
        private java.util.Map<String, String> runtimeValues;

        @com.aliyun.core.annotation.NameInMap("SMCConfiguration")
        private SMCConfiguration SMCConfiguration;

        @com.aliyun.core.annotation.NameInMap("ScaledSidecarResource")
        private ScaledSidecarResource scaledSidecarResource;

        @com.aliyun.core.annotation.NameInMap("SidecarProxyAckSloResource")
        private SidecarProxyAckSloResource sidecarProxyAckSloResource;

        @com.aliyun.core.annotation.NameInMap("SidecarProxyInitAckSloResource")
        private SidecarProxyInitAckSloResource sidecarProxyInitAckSloResource;

        @com.aliyun.core.annotation.NameInMap("SidecarProxyInitResourceLimit")
        private SidecarProxyInitResourceLimit sidecarProxyInitResourceLimit;

        @com.aliyun.core.annotation.NameInMap("SidecarProxyInitResourceRequest")
        private SidecarProxyInitResourceRequest sidecarProxyInitResourceRequest;

        @com.aliyun.core.annotation.NameInMap("SidecarProxyResourceLimit")
        private SidecarProxyResourceLimit sidecarProxyResourceLimit;

        @com.aliyun.core.annotation.NameInMap("SidecarProxyResourceRequest")
        private SidecarProxyResourceRequest sidecarProxyResourceRequest;

        @com.aliyun.core.annotation.NameInMap("TerminationDrainDuration")
        private String terminationDrainDuration;

        @com.aliyun.core.annotation.NameInMap("Tracing")
        private Tracing tracing;

        private ConfigPatches(Builder builder) {
            this.concurrency = builder.concurrency;
            this.enableCoreDump = builder.enableCoreDump;
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
            this.privileged = builder.privileged;
            this.proxyMetadata = builder.proxyMetadata;
            this.proxyStatsMatcher = builder.proxyStatsMatcher;
            this.readinessFailureThreshold = builder.readinessFailureThreshold;
            this.readinessInitialDelaySeconds = builder.readinessInitialDelaySeconds;
            this.readinessPeriodSeconds = builder.readinessPeriodSeconds;
            this.runtimeValues = builder.runtimeValues;
            this.SMCConfiguration = builder.SMCConfiguration;
            this.scaledSidecarResource = builder.scaledSidecarResource;
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
         * @return enableCoreDump
         */
        public Boolean getEnableCoreDump() {
            return this.enableCoreDump;
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
         * @return privileged
         */
        public Boolean getPrivileged() {
            return this.privileged;
        }

        /**
         * @return proxyMetadata
         */
        public java.util.Map<String, String> getProxyMetadata() {
            return this.proxyMetadata;
        }

        /**
         * @return proxyStatsMatcher
         */
        public ProxyStatsMatcher getProxyStatsMatcher() {
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
        public java.util.Map<String, String> getRuntimeValues() {
            return this.runtimeValues;
        }

        /**
         * @return SMCConfiguration
         */
        public SMCConfiguration getSMCConfiguration() {
            return this.SMCConfiguration;
        }

        /**
         * @return scaledSidecarResource
         */
        public ScaledSidecarResource getScaledSidecarResource() {
            return this.scaledSidecarResource;
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
            private Boolean enableCoreDump; 
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
            private Boolean privileged; 
            private java.util.Map<String, String> proxyMetadata; 
            private ProxyStatsMatcher proxyStatsMatcher; 
            private Integer readinessFailureThreshold; 
            private Integer readinessInitialDelaySeconds; 
            private Integer readinessPeriodSeconds; 
            private java.util.Map<String, String> runtimeValues; 
            private SMCConfiguration SMCConfiguration; 
            private ScaledSidecarResource scaledSidecarResource; 
            private SidecarProxyAckSloResource sidecarProxyAckSloResource; 
            private SidecarProxyInitAckSloResource sidecarProxyInitAckSloResource; 
            private SidecarProxyInitResourceLimit sidecarProxyInitResourceLimit; 
            private SidecarProxyInitResourceRequest sidecarProxyInitResourceRequest; 
            private SidecarProxyResourceLimit sidecarProxyResourceLimit; 
            private SidecarProxyResourceRequest sidecarProxyResourceRequest; 
            private String terminationDrainDuration; 
            private Tracing tracing; 

            private Builder() {
            } 

            private Builder(ConfigPatches model) {
                this.concurrency = model.concurrency;
                this.enableCoreDump = model.enableCoreDump;
                this.excludeInboundPorts = model.excludeInboundPorts;
                this.excludeOutboundIPRanges = model.excludeOutboundIPRanges;
                this.excludeOutboundPorts = model.excludeOutboundPorts;
                this.holdApplicationUntilProxyStarts = model.holdApplicationUntilProxyStarts;
                this.includeInboundPorts = model.includeInboundPorts;
                this.includeOutboundIPRanges = model.includeOutboundIPRanges;
                this.includeOutboundPorts = model.includeOutboundPorts;
                this.interceptionMode = model.interceptionMode;
                this.istioDNSProxyEnabled = model.istioDNSProxyEnabled;
                this.lifecycleStr = model.lifecycleStr;
                this.logLevel = model.logLevel;
                this.privileged = model.privileged;
                this.proxyMetadata = model.proxyMetadata;
                this.proxyStatsMatcher = model.proxyStatsMatcher;
                this.readinessFailureThreshold = model.readinessFailureThreshold;
                this.readinessInitialDelaySeconds = model.readinessInitialDelaySeconds;
                this.readinessPeriodSeconds = model.readinessPeriodSeconds;
                this.runtimeValues = model.runtimeValues;
                this.SMCConfiguration = model.SMCConfiguration;
                this.scaledSidecarResource = model.scaledSidecarResource;
                this.sidecarProxyAckSloResource = model.sidecarProxyAckSloResource;
                this.sidecarProxyInitAckSloResource = model.sidecarProxyInitAckSloResource;
                this.sidecarProxyInitResourceLimit = model.sidecarProxyInitResourceLimit;
                this.sidecarProxyInitResourceRequest = model.sidecarProxyInitResourceRequest;
                this.sidecarProxyResourceLimit = model.sidecarProxyResourceLimit;
                this.sidecarProxyResourceRequest = model.sidecarProxyResourceRequest;
                this.terminationDrainDuration = model.terminationDrainDuration;
                this.tracing = model.tracing;
            } 

            /**
             * <p>The number of worker threads to run in the istio-proxy container.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * <p>Indicates whether the core dump feature is enabled for the sidecar proxy containers. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableCoreDump(Boolean enableCoreDump) {
                this.enableCoreDump = enableCoreDump;
                return this;
            }

            /**
             * <p>The inbound ports to be excluded from redirection to the sidecar proxy in the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>82</p>
             */
            public Builder excludeInboundPorts(String excludeInboundPorts) {
                this.excludeInboundPorts = excludeInboundPorts;
                return this;
            }

            /**
             * <p>The outbound IP ranges in CIDR form to be excluded from redirection to the sidecar proxy in the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.3/31</p>
             */
            public Builder excludeOutboundIPRanges(String excludeOutboundIPRanges) {
                this.excludeOutboundIPRanges = excludeOutboundIPRanges;
                return this;
            }

            /**
             * <p>The outbound ports to be excluded from redirection to the sidecar proxy in the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
             */
            public Builder excludeOutboundPorts(String excludeOutboundPorts) {
                this.excludeOutboundPorts = excludeOutboundPorts;
                return this;
            }

            /**
             * <p>Indicates whether applications can be started only after the istio-proxy container starts. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Applications can be started only after the istio-proxy container starts.</li>
             * <li><code>false</code>: Applications can be started before the istio-proxy container starts.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder holdApplicationUntilProxyStarts(Boolean holdApplicationUntilProxyStarts) {
                this.holdApplicationUntilProxyStarts = holdApplicationUntilProxyStarts;
                return this;
            }

            /**
             * <p>The inbound ports for which traffic is to be redirected to the sidecar proxy in the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>83</p>
             */
            public Builder includeInboundPorts(String includeInboundPorts) {
                this.includeInboundPorts = includeInboundPorts;
                return this;
            }

            /**
             * <p>The outbound IP ranges in CIDR form for which traffic is to be redirected to the sidecar proxy in the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.4/31</p>
             */
            public Builder includeOutboundIPRanges(String includeOutboundIPRanges) {
                this.includeOutboundIPRanges = includeOutboundIPRanges;
                return this;
            }

            /**
             * <p>The outbound ports for which traffic is to be redirected to the sidecar proxy in the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>84</p>
             */
            public Builder includeOutboundPorts(String includeOutboundPorts) {
                this.includeOutboundPorts = includeOutboundPorts;
                return this;
            }

            /**
             * <p>The mode in which the sidecar proxy intercepts inbound traffic. Valid values:</p>
             * <ul>
             * <li><code>REDIRECT</code> (default): In this mode, source IP addresses are lost during traffic redirection to the sidecar proxy.</li>
             * <li><code>TPROXY</code>: In this mode, both the source and destination IP addresses and ports are preserved.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TPROXY</p>
             */
            public Builder interceptionMode(String interceptionMode) {
                this.interceptionMode = interceptionMode;
                return this;
            }

            /**
             * <p>Indicates whether the Domain Name System (DNS) proxy feature is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder istioDNSProxyEnabled(Boolean istioDNSProxyEnabled) {
                this.istioDNSProxyEnabled = istioDNSProxyEnabled;
                return this;
            }

            /**
             * <p>The JSON string that describes the lifecycle of the sidecar proxy.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;postStart&quot;:{&quot;exec&quot;:{&quot;command&quot;:[&quot;pilot-agent&quot;,&quot;wait&quot;]}},&quot;preStop&quot;:{&quot;exec&quot;:{&quot;command&quot;:[&quot;/bin/sh&quot;,&quot;-c&quot;,&quot;sleep 15&quot;]}}}</p>
             */
            public Builder lifecycleStr(String lifecycleStr) {
                this.lifecycleStr = lifecycleStr;
                return this;
            }

            /**
             * <p>The log level. Valid values: <code>info</code>, <code>debug</code>, <code>trace</code>, and <code>error</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>info</p>
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
                return this;
            }

            /**
             * <p>Indicates whether the privileged mode is enabled in the security context of the sidecar proxy containers. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The privileged mode is enabled, that is, the sidecar proxy containers run in privileged mode.</li>
             * <li><code>false</code>: The privileged mode is not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder privileged(Boolean privileged) {
                this.privileged = privileged;
                return this;
            }

            /**
             * ProxyMetadata.
             */
            public Builder proxyMetadata(java.util.Map<String, String> proxyMetadata) {
                this.proxyMetadata = proxyMetadata;
                return this;
            }

            /**
             * <p>The custom Envoy statistics that are reported by the sidecar proxy.</p>
             */
            public Builder proxyStatsMatcher(ProxyStatsMatcher proxyStatsMatcher) {
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
                this.readinessFailureThreshold = readinessFailureThreshold;
                return this;
            }

            /**
             * <p>The amount of time to wait before the first readiness check of a sidecar proxy container is performed. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder readinessInitialDelaySeconds(Integer readinessInitialDelaySeconds) {
                this.readinessInitialDelaySeconds = readinessInitialDelaySeconds;
                return this;
            }

            /**
             * <p>The interval between two readiness checks of a sidecar proxy container. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder readinessPeriodSeconds(Integer readinessPeriodSeconds) {
                this.readinessPeriodSeconds = readinessPeriodSeconds;
                return this;
            }

            /**
             * <p>Indicates the runtime parameters of Envoy proxy processes in the sidecar proxy container.</p>
             */
            public Builder runtimeValues(java.util.Map<String, String> runtimeValues) {
                this.runtimeValues = runtimeValues;
                return this;
            }

            /**
             * <p>The configurations of the Shared Memory Communications over Remote Direct Memory Access (SMC-R) optimization feature.</p>
             */
            public Builder SMCConfiguration(SMCConfiguration SMCConfiguration) {
                this.SMCConfiguration = SMCConfiguration;
                return this;
            }

            /**
             * ScaledSidecarResource.
             */
            public Builder scaledSidecarResource(ScaledSidecarResource scaledSidecarResource) {
                this.scaledSidecarResource = scaledSidecarResource;
                return this;
            }

            /**
             * <p>The maximum size of reclaimed ACK resources that are available to the sidecar proxy container. This configuration item indicates the maximum size of resources that are available to the sidecar proxy container in a pod labeled with <code>koordinator.sh/qosClass</code>.</p>
             */
            public Builder sidecarProxyAckSloResource(SidecarProxyAckSloResource sidecarProxyAckSloResource) {
                this.sidecarProxyAckSloResource = sidecarProxyAckSloResource;
                return this;
            }

            /**
             * <p>The reclaimed Container Service for Kubernetes (ACK) resources for the istio-init container. This configuration item indicates the resources of the istio-init container in a pod labeled with <code>koordinator.sh/qosClass</code>. Reclaimed ACK resources are resources that can be dynamically overcommitted.</p>
             */
            public Builder sidecarProxyInitAckSloResource(SidecarProxyInitAckSloResource sidecarProxyInitAckSloResource) {
                this.sidecarProxyInitAckSloResource = sidecarProxyInitAckSloResource;
                return this;
            }

            /**
             * <p>The maximum size of resources that are available to the istio-init container in the pod into which the sidecar proxy is injected. The istio-init container is used in this topic.</p>
             */
            public Builder sidecarProxyInitResourceLimit(SidecarProxyInitResourceLimit sidecarProxyInitResourceLimit) {
                this.sidecarProxyInitResourceLimit = sidecarProxyInitResourceLimit;
                return this;
            }

            /**
             * <p>The minimum size of resources that are required by the istio-init container.</p>
             */
            public Builder sidecarProxyInitResourceRequest(SidecarProxyInitResourceRequest sidecarProxyInitResourceRequest) {
                this.sidecarProxyInitResourceRequest = sidecarProxyInitResourceRequest;
                return this;
            }

            /**
             * <p>The maximum size of resources that are available to the sidecar proxy container.</p>
             */
            public Builder sidecarProxyResourceLimit(SidecarProxyResourceLimit sidecarProxyResourceLimit) {
                this.sidecarProxyResourceLimit = sidecarProxyResourceLimit;
                return this;
            }

            /**
             * <p>The minimum size of resources that are required by the sidecar proxy container.</p>
             */
            public Builder sidecarProxyResourceRequest(SidecarProxyResourceRequest sidecarProxyResourceRequest) {
                this.sidecarProxyResourceRequest = sidecarProxyResourceRequest;
                return this;
            }

            /**
             * <p>The maximum period of time allowed for connections to complete on sidecar proxy shutdown.</p>
             * 
             * <strong>example:</strong>
             * <p>6s</p>
             */
            public Builder terminationDrainDuration(String terminationDrainDuration) {
                this.terminationDrainDuration = terminationDrainDuration;
                return this;
            }

            /**
             * <p>The custom configurations of Tracing Analysis.</p>
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
