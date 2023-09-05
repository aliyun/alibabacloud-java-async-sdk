// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomRoutingEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomRoutingEndpointsResponseBody</p>
 */
public class ListCustomRoutingEndpointsResponseBody extends TeaModel {
    @NameInMap("Endpoints")
    private java.util.List < Endpoints> endpoints;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * Information about the endpoints.
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
        @NameInMap("Action")
        private String action;

        @NameInMap("ChildType")
        private String childType;

        @NameInMap("IsManaged")
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
             * 托管策略动作名称，取值：
             * <p>
             * - **Create**：创建实例。
             * - **Update**：更新当前实例。
             * - **Delete**：删除当前实例。
             * - **Associate**：引用/被引用当前实例。
             * - **UserUnmanaged**：用户解托管实例。
             * - **CreateChild**：在当前实例下创建子资源。
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * 子资源类型，取值：
             * <p>
             * 
             * - **Listener**：监听资源。
             * 
             * - **IpSet**：加速地域资源。
             * 
             * - **EndpointGroup**：终端节点组资源。
             * 
             * - **ForwardingRule**：转发策略资源。
             * 
             * - **Endpoint**：终端节点资源。
             * 
             * - **EndpointGroupDestination**：自定义路由监听下的终端节点组协议映射资源。
             * 
             * - **EndpointPolicy**：自定义路由监听下的终端节点通行策略资源。
             * 
             * > 仅在**Action**参数为**CreateChild**时有效。
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * 托管策略动作是否被托管，取值：
             * <p>
             * - **true**：托管策略动作被托管，用户无权在托管实例下执行Action指定的操作。
             * - **false**：托管策略动作未被托管，用户可在托管实例下执行Action指定的操作。
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
        @NameInMap("AcceleratorId")
        private String acceleratorId;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("EndpointGroupId")
        private String endpointGroupId;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @NameInMap("ServiceManagedInfos")
        private java.util.List < ServiceManagedInfos> serviceManagedInfos;

        @NameInMap("TrafficToEndpointPolicy")
        private String trafficToEndpointPolicy;

        @NameInMap("Type")
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
             * 托管实例所属的服务方ID。
             * <p>
             * 
             * > 仅在**ServiceManaged**参数为**True**时有效。
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * 是否为托管实例。取值：
             * <p>
             * 
             * - **true**：是托管资实例。
             * 
             * - **false**：不是托管实例。
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * 用户在此托管实例下可执行的动作策略列表。
             * <p>
             * 
             * > 仅在**ServiceManaged**参数为**True**时有效。
             * > - 当实例处于托管状态时，用户对实例的操作会受到限制，某些操作行为会被禁止。
             */
            public Builder serviceManagedInfos(java.util.List < ServiceManagedInfos> serviceManagedInfos) {
                this.serviceManagedInfos = serviceManagedInfos;
                return this;
            }

            /**
             * The access policy of traffic that is destinated for the endpoint. Valid values:
             * <p>
             * 
             * *   **AllowAll:** allows all traffic to the endpoint.
             * *   **DenyAll:** denies all traffic to the endpoint.
             * *   **AllowCustom:** allows traffic only to specified destinations.
             */
            public Builder trafficToEndpointPolicy(String trafficToEndpointPolicy) {
                this.trafficToEndpointPolicy = trafficToEndpointPolicy;
                return this;
            }

            /**
             * The backend service type of the endpoint.
             * <p>
             * 
             * **PrivateSubNet** is returned, which indicates a private CIDR block.
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
