// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetHealthStatusResponseBody</p>
 */
public class GetHealthStatusResponseBody extends TeaModel {
    @NameInMap("EndpointGroups")
    private java.util.List < EndpointGroups> endpointGroups;

    @NameInMap("HealthStatus")
    private String healthStatus;

    @NameInMap("ListenerId")
    private String listenerId;

    @NameInMap("RequestId")
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
         * EndpointGroups.
         */
        public Builder endpointGroups(java.util.List < EndpointGroups> endpointGroups) {
            this.endpointGroups = endpointGroups;
            return this;
        }

        /**
         * HealthStatus.
         */
        public Builder healthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * ListenerId.
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * Id of the request
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
        @NameInMap("Address")
        private String address;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("HealthDetail")
        private String healthDetail;

        @NameInMap("HealthStatus")
        private String healthStatus;

        @NameInMap("Port")
        private Long port;

        @NameInMap("Type")
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
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * EndpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * HealthDetail.
             */
            public Builder healthDetail(String healthDetail) {
                this.healthDetail = healthDetail;
                return this;
            }

            /**
             * HealthStatus.
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * Type.
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
        @NameInMap("EndpointGroupId")
        private String endpointGroupId;

        @NameInMap("EndpointGroupType")
        private String endpointGroupType;

        @NameInMap("Endpoints")
        private java.util.List < Endpoints> endpoints;

        @NameInMap("ForwardingRuleIds")
        private java.util.List < String > forwardingRuleIds;

        @NameInMap("HealthStatus")
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
             * EndpointGroupId.
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * EndpointGroupType.
             */
            public Builder endpointGroupType(String endpointGroupType) {
                this.endpointGroupType = endpointGroupType;
                return this;
            }

            /**
             * Endpoints.
             */
            public Builder endpoints(java.util.List < Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * ForwardingRuleIds.
             */
            public Builder forwardingRuleIds(java.util.List < String > forwardingRuleIds) {
                this.forwardingRuleIds = forwardingRuleIds;
                return this;
            }

            /**
             * HealthStatus.
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
