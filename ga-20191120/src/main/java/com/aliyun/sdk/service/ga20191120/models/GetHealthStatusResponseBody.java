// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetHealthStatusResponseBody</p>
 */
public class GetHealthStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndpointGroups")
    private java.util.List < EndpointGroups> endpointGroups;

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

    /**
     * @return endpointGroups
     */
    public java.util.List < EndpointGroups> getEndpointGroups() {
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
        private java.util.List < EndpointGroups> endpointGroups; 
        private String healthStatus; 
        private String listenerId; 
        private String requestId; 

        /**
         * The information about the endpoint groups.
         */
        public Builder endpointGroups(java.util.List < EndpointGroups> endpointGroups) {
            this.endpointGroups = endpointGroups;
            return this;
        }

        /**
         * The health status of endpoints and endpoint groups. Valid values:
         * <p>
         * 
         * *   **normal**
         * *   **abnormal**
         * *   **partiallyAbnormal**
         */
        public Builder healthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * The ID of the listener.
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHealthStatusResponseBody build() {
            return new GetHealthStatusResponseBody(this);
        } 

    } 

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

            /**
             * The IP address of the endpoint.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The ID of the endpoint.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The health check details of the endpoint.
             * <p>
             * 
             * >  This parameter is unavailable.
             */
            public Builder healthDetail(String healthDetail) {
                this.healthDetail = healthDetail;
                return this;
            }

            /**
             * The health status of the endpoint. Valid values:
             * <p>
             * 
             * *   **init:** The endpoint is being initialized.
             * *   **normal:** The endpoint is normal.
             * *   **abnormal:** The endpoint is abnormal.
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * The port that is used to connect to the endpoint.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the endpoint. Valid values:
             * <p>
             * 
             * *   **Domain:** a custom domain name.
             * *   **Ip:** a custom IP address.
             * *   **PublicIp:** a public IP address provided by Alibaba Cloud.
             * *   **ECS:** an Elastic Compute Service (ECS) instance.
             * *   **SLB:** a Classic Load Balancer (CLB) instance.
             * *   **ALB:** an Application Load Balancer (ALB) instance.
             * *   **OSS:** an Object Storage Service (OSS) bucket.
             * *   **ENI:** an elastic network interface (ENI).
             * *   **NLB:** a Network Load Balancer (NLB) instance.
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
    public static class EndpointGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
        private String endpointGroupId;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupType")
        private String endpointGroupType;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private java.util.List < Endpoints> endpoints;

        @com.aliyun.core.annotation.NameInMap("ForwardingRuleIds")
        private java.util.List < String > forwardingRuleIds;

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
        public java.util.List < Endpoints> getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return forwardingRuleIds
         */
        public java.util.List < String > getForwardingRuleIds() {
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
            private java.util.List < Endpoints> endpoints; 
            private java.util.List < String > forwardingRuleIds; 
            private String healthStatus; 

            /**
             * The ID of the endpoint group.
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * The type of the endpoint group. Valid values:
             * <p>
             * 
             * *   **default:** the default endpoint group.
             * *   **virtual:** a virtual endpoint group.
             */
            public Builder endpointGroupType(String endpointGroupType) {
                this.endpointGroupType = endpointGroupType;
                return this;
            }

            /**
             * The information about the endpoints.
             */
            public Builder endpoints(java.util.List < Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * The IDs of the forwarding rules.
             */
            public Builder forwardingRuleIds(java.util.List < String > forwardingRuleIds) {
                this.forwardingRuleIds = forwardingRuleIds;
                return this;
            }

            /**
             * The health status of the endpoint group. Valid values:
             * <p>
             * 
             * *   **init:** The endpoint group is being initialized.
             * *   **normal:** The endpoint group is normal.
             * *   **abnormal:** The endpoint group is abnormal.
             * *   **partiallyAbnormal:** The endpoint group is partially abnormal.
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
