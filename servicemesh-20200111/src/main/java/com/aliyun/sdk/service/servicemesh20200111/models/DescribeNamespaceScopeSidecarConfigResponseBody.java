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
         * ConfigPatches.
         */
        public Builder configPatches(ConfigPatches configPatches) {
            this.configPatches = configPatches;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNamespaceScopeSidecarConfigResponseBody build() {
            return new DescribeNamespaceScopeSidecarConfigResponseBody(this);
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
             * ResourceCPULimit.
             */
            public Builder resourceCPULimit(String resourceCPULimit) {
                this.resourceCPULimit = resourceCPULimit;
                return this;
            }

            /**
             * ResourceMemoryLimit.
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
             * ResourceCPURequest.
             */
            public Builder resourceCPURequest(String resourceCPURequest) {
                this.resourceCPURequest = resourceCPURequest;
                return this;
            }

            /**
             * ResourceMemoryRequest.
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
             * ResourceCPULimit.
             */
            public Builder resourceCPULimit(String resourceCPULimit) {
                this.resourceCPULimit = resourceCPULimit;
                return this;
            }

            /**
             * ResourceMemoryLimit.
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
             * ResourceCPURequest.
             */
            public Builder resourceCPURequest(String resourceCPURequest) {
                this.resourceCPURequest = resourceCPURequest;
                return this;
            }

            /**
             * ResourceMemoryRequest.
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
    public static class ConfigPatches extends TeaModel {
        @NameInMap("ExcludeInboundPorts")
        private String excludeInboundPorts;

        @NameInMap("ExcludeOutboundIPRanges")
        private String excludeOutboundIPRanges;

        @NameInMap("ExcludeOutboundPorts")
        private String excludeOutboundPorts;

        @NameInMap("IncludeInboundPorts")
        private String includeInboundPorts;

        @NameInMap("IncludeOutboundIPRanges")
        private String includeOutboundIPRanges;

        @NameInMap("IncludeOutboundPorts")
        private String includeOutboundPorts;

        @NameInMap("IstioDNSProxyEnabled")
        private Boolean istioDNSProxyEnabled;

        @NameInMap("LifecycleStr")
        private String lifecycleStr;

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

        private ConfigPatches(Builder builder) {
            this.excludeInboundPorts = builder.excludeInboundPorts;
            this.excludeOutboundIPRanges = builder.excludeOutboundIPRanges;
            this.excludeOutboundPorts = builder.excludeOutboundPorts;
            this.includeInboundPorts = builder.includeInboundPorts;
            this.includeOutboundIPRanges = builder.includeOutboundIPRanges;
            this.includeOutboundPorts = builder.includeOutboundPorts;
            this.istioDNSProxyEnabled = builder.istioDNSProxyEnabled;
            this.lifecycleStr = builder.lifecycleStr;
            this.sidecarProxyInitResourceLimit = builder.sidecarProxyInitResourceLimit;
            this.sidecarProxyInitResourceRequest = builder.sidecarProxyInitResourceRequest;
            this.sidecarProxyResourceLimit = builder.sidecarProxyResourceLimit;
            this.sidecarProxyResourceRequest = builder.sidecarProxyResourceRequest;
            this.terminationDrainDuration = builder.terminationDrainDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigPatches create() {
            return builder().build();
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

        public static final class Builder {
            private String excludeInboundPorts; 
            private String excludeOutboundIPRanges; 
            private String excludeOutboundPorts; 
            private String includeInboundPorts; 
            private String includeOutboundIPRanges; 
            private String includeOutboundPorts; 
            private Boolean istioDNSProxyEnabled; 
            private String lifecycleStr; 
            private SidecarProxyInitResourceLimit sidecarProxyInitResourceLimit; 
            private SidecarProxyInitResourceRequest sidecarProxyInitResourceRequest; 
            private SidecarProxyResourceLimit sidecarProxyResourceLimit; 
            private SidecarProxyResourceRequest sidecarProxyResourceRequest; 
            private String terminationDrainDuration; 

            /**
             * ExcludeInboundPorts.
             */
            public Builder excludeInboundPorts(String excludeInboundPorts) {
                this.excludeInboundPorts = excludeInboundPorts;
                return this;
            }

            /**
             * ExcludeOutboundIPRanges.
             */
            public Builder excludeOutboundIPRanges(String excludeOutboundIPRanges) {
                this.excludeOutboundIPRanges = excludeOutboundIPRanges;
                return this;
            }

            /**
             * ExcludeOutboundPorts.
             */
            public Builder excludeOutboundPorts(String excludeOutboundPorts) {
                this.excludeOutboundPorts = excludeOutboundPorts;
                return this;
            }

            /**
             * IncludeInboundPorts.
             */
            public Builder includeInboundPorts(String includeInboundPorts) {
                this.includeInboundPorts = includeInboundPorts;
                return this;
            }

            /**
             * IncludeOutboundIPRanges.
             */
            public Builder includeOutboundIPRanges(String includeOutboundIPRanges) {
                this.includeOutboundIPRanges = includeOutboundIPRanges;
                return this;
            }

            /**
             * IncludeOutboundPorts.
             */
            public Builder includeOutboundPorts(String includeOutboundPorts) {
                this.includeOutboundPorts = includeOutboundPorts;
                return this;
            }

            /**
             * IstioDNSProxyEnabled.
             */
            public Builder istioDNSProxyEnabled(Boolean istioDNSProxyEnabled) {
                this.istioDNSProxyEnabled = istioDNSProxyEnabled;
                return this;
            }

            /**
             * LifecycleStr.
             */
            public Builder lifecycleStr(String lifecycleStr) {
                this.lifecycleStr = lifecycleStr;
                return this;
            }

            /**
             * SidecarProxyInitResourceLimit.
             */
            public Builder sidecarProxyInitResourceLimit(SidecarProxyInitResourceLimit sidecarProxyInitResourceLimit) {
                this.sidecarProxyInitResourceLimit = sidecarProxyInitResourceLimit;
                return this;
            }

            /**
             * SidecarProxyInitResourceRequest.
             */
            public Builder sidecarProxyInitResourceRequest(SidecarProxyInitResourceRequest sidecarProxyInitResourceRequest) {
                this.sidecarProxyInitResourceRequest = sidecarProxyInitResourceRequest;
                return this;
            }

            /**
             * SidecarProxyResourceLimit.
             */
            public Builder sidecarProxyResourceLimit(SidecarProxyResourceLimit sidecarProxyResourceLimit) {
                this.sidecarProxyResourceLimit = sidecarProxyResourceLimit;
                return this;
            }

            /**
             * SidecarProxyResourceRequest.
             */
            public Builder sidecarProxyResourceRequest(SidecarProxyResourceRequest sidecarProxyResourceRequest) {
                this.sidecarProxyResourceRequest = sidecarProxyResourceRequest;
                return this;
            }

            /**
             * TerminationDrainDuration.
             */
            public Builder terminationDrainDuration(String terminationDrainDuration) {
                this.terminationDrainDuration = terminationDrainDuration;
                return this;
            }

            public ConfigPatches build() {
                return new ConfigPatches(this);
            } 

        } 

    }
}
