// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomRoutingEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomRoutingEndpointsResponseBody</p>
 */
public class ListCustomRoutingEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.List < Endpoints> endpoints;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListCustomRoutingEndpointsResponseBody(Builder builder) {
        this.endpoints = builder.endpoints;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomRoutingEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpoints
     */
    public java.util.List < Endpoints> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Endpoints> endpoints; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the endpoints.
         */
        public Builder endpoints(java.util.List < Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomRoutingEndpointsResponseBody build() {
            return new ListCustomRoutingEndpointsResponseBody(this);
        } 

    } 

    public static class ServiceManagedInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ChildType")
        private String childType;

        @com.aliyun.core.annotation.NameInMap("IsManaged")
        private Boolean isManaged;

        private ServiceManagedInfos(Builder builder) {
            this.action = builder.action;
            this.childType = builder.childType;
            this.isManaged = builder.isManaged;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceManagedInfos create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return childType
         */
        public String getChildType() {
            return this.childType;
        }

        /**
         * @return isManaged
         */
        public Boolean getIsManaged() {
            return this.isManaged;
        }

        public static final class Builder {
            private String action; 
            private String childType; 
            private Boolean isManaged; 

            /**
             * The name of the action performed on the managed instance. Valid values:
             * <p>
             * 
             * *   **Create**
             * *   **Update**
             * *   **Delete**
             * *   **Associate**
             * *   **UserUnmanaged**
             * *   **CreateChild**
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The type of the child resource. Valid values:
             * <p>
             * 
             * *   **Listener**: listener
             * *   **IpSet**: acceleration region
             * *   **EndpointGroup**: endpoint group
             * *   **ForwardingRule**: forwarding rule
             * *   **Endpoint**: endpoint
             * *   **EndpointGroupDestination**: protocol mapping of an endpoint group associated with a custom routing listener
             * *   **EndpointPolicy**: traffic policy of an endpoint associated with a custom routing listener
             * 
             * >  This parameter is valid only if **Action** is set to **CreateChild**.
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * Indicates whether the specified actions are managed. Valid values:
             * <p>
             * 
             * *   **true**: The specified actions are managed, and users cannot perform the specified actions on the managed resource.
             * *   **false**: The specified actions are not managed, and users can perform the specified actions on the managed resource.
             */
            public Builder isManaged(Boolean isManaged) {
                this.isManaged = isManaged;
                return this;
            }

            public ServiceManagedInfos build() {
                return new ServiceManagedInfos(this);
            } 

        } 

    }
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceleratorId")
        private String acceleratorId;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
        private String endpointGroupId;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @com.aliyun.core.annotation.NameInMap("ServiceManagedInfos")
        private java.util.List < ServiceManagedInfos> serviceManagedInfos;

        @com.aliyun.core.annotation.NameInMap("TrafficToEndpointPolicy")
        private String trafficToEndpointPolicy;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Endpoints(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.endpoint = builder.endpoint;
            this.endpointGroupId = builder.endpointGroupId;
            this.endpointId = builder.endpointId;
            this.listenerId = builder.listenerId;
            this.serviceId = builder.serviceId;
            this.serviceManaged = builder.serviceManaged;
            this.serviceManagedInfos = builder.serviceManagedInfos;
            this.trafficToEndpointPolicy = builder.trafficToEndpointPolicy;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return endpointGroupId
         */
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceManaged
         */
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        /**
         * @return serviceManagedInfos
         */
        public java.util.List < ServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

        /**
         * @return trafficToEndpointPolicy
         */
        public String getTrafficToEndpointPolicy() {
            return this.trafficToEndpointPolicy;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String acceleratorId; 
            private String endpoint; 
            private String endpointGroupId; 
            private String endpointId; 
            private String listenerId; 
            private String serviceId; 
            private Boolean serviceManaged; 
            private java.util.List < ServiceManagedInfos> serviceManagedInfos; 
            private String trafficToEndpointPolicy; 
            private String type; 

            /**
             * The ID of the GA instance with which the endpoint is associated.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * The name of the vSwitch that is specified as an endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The ID of the endpoint group to which the endpoint belongs.
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * The endpoint ID.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The ID of the listener to which the endpoint belongs.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The ID of the service that manages the GA instance.
             * <p>
             * 
             * >  This parameter is valid only if **ServiceManaged** is set to **True**.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * Indicates whether the GA instance is managed. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * The actions that users can perform on the managed instance.
             * <p>
             * 
             * >  This parameter is valid only if **ServiceManaged** is set to **True**.
             * 
             * *   Users can perform only specific actions on a managed instance.
             */
            public Builder serviceManagedInfos(java.util.List < ServiceManagedInfos> serviceManagedInfos) {
                this.serviceManagedInfos = serviceManagedInfos;
                return this;
            }

            /**
             * The access policy of traffic that is destined for the endpoint. Valid values:
             * <p>
             * 
             * *   **AllowAll**: allows all traffic to the endpoint.
             * *   **DenyAll**: denies all traffic to the endpoint.
             * *   **AllowCustom**: allows traffic only to specified destinations.
             */
            public Builder trafficToEndpointPolicy(String trafficToEndpointPolicy) {
                this.trafficToEndpointPolicy = trafficToEndpointPolicy;
                return this;
            }

            /**
             * The backend service type of the endpoint.
             * <p>
             * 
             * Only **PrivateSubNet** may be returned, which indicates a private CIDR block.
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
}
