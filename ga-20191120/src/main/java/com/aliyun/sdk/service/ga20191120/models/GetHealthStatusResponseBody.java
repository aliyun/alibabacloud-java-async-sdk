// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link GetHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetHealthStatusResponseBody</p>
 */
public class GetHealthStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndpointGroups")
    private java.util.List<EndpointGroups> endpointGroups;

    @com.aliyun.core.annotation.NameInMap("HealthStatus")
    private String healthStatus;

    @com.aliyun.core.annotation.NameInMap("ListenerId")
    private String listenerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetHealthStatusResponseBody(Builder builder) {
        this.endpointGroups = builder.endpointGroups;
        this.healthStatus = builder.healthStatus;
        this.listenerId = builder.listenerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHealthStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointGroups
     */
    public java.util.List<EndpointGroups> getEndpointGroups() {
        return this.endpointGroups;
    }

    /**
     * @return healthStatus
     */
    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<EndpointGroups> endpointGroups; 
        private String healthStatus; 
        private String listenerId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetHealthStatusResponseBody model) {
            this.endpointGroups = model.endpointGroups;
            this.healthStatus = model.healthStatus;
            this.listenerId = model.listenerId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the endpoint groups.</p>
         */
        public Builder endpointGroups(java.util.List<EndpointGroups> endpointGroups) {
            this.endpointGroups = endpointGroups;
            return this;
        }

        /**
         * <p>The health status of endpoints and endpoint groups. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong></li>
         * <li><strong>abnormal</strong></li>
         * <li><strong>partiallyAbnormal</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder healthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * <p>The ID of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>64ADAB1E-0B7F-4FD8-A404-3BECC0E9CCFF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHealthStatusResponseBody build() {
            return new GetHealthStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetHealthStatusResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("HealthDetail")
        private String healthDetail;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Endpoints(Builder builder) {
            this.address = builder.address;
            this.endpointId = builder.endpointId;
            this.healthDetail = builder.healthDetail;
            this.healthStatus = builder.healthStatus;
            this.port = builder.port;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return healthDetail
         */
        public String getHealthDetail() {
            return this.healthDetail;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String address; 
            private String endpointId; 
            private String healthDetail; 
            private String healthStatus; 
            private Long port; 
            private String type; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.address = model.address;
                this.endpointId = model.endpointId;
                this.healthDetail = model.healthDetail;
                this.healthStatus = model.healthStatus;
                this.port = model.port;
                this.type = model.type;
            } 

            /**
             * <p>The IP address of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>47.0.XX.XX</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The ID of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-hp33b2e43fays7s8****</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The health check details of the endpoint.</p>
             * <blockquote>
             * <p> This parameter is unavailable.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder healthDetail(String healthDetail) {
                this.healthDetail = healthDetail;
                return this;
            }

            /**
             * <p>The health status of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>init:</strong> The endpoint is being initialized.</li>
             * <li><strong>normal:</strong> The endpoint is normal.</li>
             * <li><strong>abnormal:</strong> The endpoint is abnormal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * <p>The port that is used to connect to the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The type of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>Domain:</strong> a custom domain name.</li>
             * <li><strong>Ip:</strong> a custom IP address.</li>
             * <li><strong>PublicIp:</strong> a public IP address provided by Alibaba Cloud.</li>
             * <li><strong>ECS:</strong> an Elastic Compute Service (ECS) instance.</li>
             * <li><strong>SLB:</strong> a Classic Load Balancer (CLB) instance.</li>
             * <li><strong>ALB:</strong> an Application Load Balancer (ALB) instance.</li>
             * <li><strong>OSS:</strong> an Object Storage Service (OSS) bucket.</li>
             * <li><strong>ENI:</strong> an elastic network interface (ENI).</li>
             * <li><strong>NLB:</strong> a Network Load Balancer (NLB) instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ip</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetHealthStatusResponseBody</p>
     */
    public static class EndpointGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
        private String endpointGroupId;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupType")
        private String endpointGroupType;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private java.util.List<Endpoints> endpoints;

        @com.aliyun.core.annotation.NameInMap("ForwardingRuleIds")
        private java.util.List<String> forwardingRuleIds;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        private EndpointGroups(Builder builder) {
            this.endpointGroupId = builder.endpointGroupId;
            this.endpointGroupType = builder.endpointGroupType;
            this.endpoints = builder.endpoints;
            this.forwardingRuleIds = builder.forwardingRuleIds;
            this.healthStatus = builder.healthStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointGroups create() {
            return builder().build();
        }

        /**
         * @return endpointGroupId
         */
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        /**
         * @return endpointGroupType
         */
        public String getEndpointGroupType() {
            return this.endpointGroupType;
        }

        /**
         * @return endpoints
         */
        public java.util.List<Endpoints> getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return forwardingRuleIds
         */
        public java.util.List<String> getForwardingRuleIds() {
            return this.forwardingRuleIds;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public static final class Builder {
            private String endpointGroupId; 
            private String endpointGroupType; 
            private java.util.List<Endpoints> endpoints; 
            private java.util.List<String> forwardingRuleIds; 
            private String healthStatus; 

            private Builder() {
            } 

            private Builder(EndpointGroups model) {
                this.endpointGroupId = model.endpointGroupId;
                this.endpointGroupType = model.endpointGroupType;
                this.endpoints = model.endpoints;
                this.forwardingRuleIds = model.forwardingRuleIds;
                this.healthStatus = model.healthStatus;
            } 

            /**
             * <p>The ID of the endpoint group.</p>
             * 
             * <strong>example:</strong>
             * <p>epg-bp14sz7ftcwwjgrdm****</p>
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * <p>The type of the endpoint group. Valid values:</p>
             * <ul>
             * <li><strong>default:</strong> the default endpoint group.</li>
             * <li><strong>virtual:</strong> a virtual endpoint group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder endpointGroupType(String endpointGroupType) {
                this.endpointGroupType = endpointGroupType;
                return this;
            }

            /**
             * <p>The information about the endpoints.</p>
             */
            public Builder endpoints(java.util.List<Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * <p>The IDs of the forwarding rules.</p>
             */
            public Builder forwardingRuleIds(java.util.List<String> forwardingRuleIds) {
                this.forwardingRuleIds = forwardingRuleIds;
                return this;
            }

            /**
             * <p>The health status of the endpoint group. Valid values:</p>
             * <ul>
             * <li><strong>init:</strong> The endpoint group is being initialized.</li>
             * <li><strong>normal:</strong> The endpoint group is normal.</li>
             * <li><strong>abnormal:</strong> The endpoint group is abnormal.</li>
             * <li><strong>partiallyAbnormal:</strong> The endpoint group is partially abnormal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            public EndpointGroups build() {
                return new EndpointGroups(this);
            } 

        } 

    }
}
