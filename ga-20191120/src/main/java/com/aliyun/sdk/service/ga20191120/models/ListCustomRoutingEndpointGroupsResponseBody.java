// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomRoutingEndpointGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomRoutingEndpointGroupsResponseBody</p>
 */
public class ListCustomRoutingEndpointGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndpointGroups")
    private java.util.List < EndpointGroups> endpointGroups;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListCustomRoutingEndpointGroupsResponseBody(Builder builder) {
        this.endpointGroups = builder.endpointGroups;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomRoutingEndpointGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpointGroups
     */
    public java.util.List < EndpointGroups> getEndpointGroups() {
        return this.endpointGroups;
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
        private java.util.List < EndpointGroups> endpointGroups; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The configuration information about the endpoint group.
         */
        public Builder endpointGroups(java.util.List < EndpointGroups> endpointGroups) {
            this.endpointGroups = endpointGroups;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomRoutingEndpointGroupsResponseBody build() {
            return new ListCustomRoutingEndpointGroupsResponseBody(this);
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
             * The name of the action on the managed instance. Valid values:
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
             * >  This parameter takes effect only if **Action** is set to **CreateChild**.
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * Indicates whether the specified actions are managed.
             * <p>
             * 
             * *   **true**: Users cannot perform the specified actions on the managed instance.
             * *   **false**: Users can perform the specified actions on the managed instance.
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
    public static class EndpointGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceleratorId")
        private String acceleratorId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
        private String endpointGroupId;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupIpList")
        private java.util.List < String > endpointGroupIpList;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupRegion")
        private String endpointGroupRegion;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupUnconfirmedIpList")
        private java.util.List < String > endpointGroupUnconfirmedIpList;

        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @com.aliyun.core.annotation.NameInMap("ServiceManagedInfos")
        private java.util.List < ServiceManagedInfos> serviceManagedInfos;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private EndpointGroups(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.description = builder.description;
            this.endpointGroupId = builder.endpointGroupId;
            this.endpointGroupIpList = builder.endpointGroupIpList;
            this.endpointGroupRegion = builder.endpointGroupRegion;
            this.endpointGroupUnconfirmedIpList = builder.endpointGroupUnconfirmedIpList;
            this.listenerId = builder.listenerId;
            this.name = builder.name;
            this.serviceId = builder.serviceId;
            this.serviceManaged = builder.serviceManaged;
            this.serviceManagedInfos = builder.serviceManagedInfos;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointGroups create() {
            return builder().build();
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endpointGroupId
         */
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        /**
         * @return endpointGroupIpList
         */
        public java.util.List < String > getEndpointGroupIpList() {
            return this.endpointGroupIpList;
        }

        /**
         * @return endpointGroupRegion
         */
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        /**
         * @return endpointGroupUnconfirmedIpList
         */
        public java.util.List < String > getEndpointGroupUnconfirmedIpList() {
            return this.endpointGroupUnconfirmedIpList;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String acceleratorId; 
            private String description; 
            private String endpointGroupId; 
            private java.util.List < String > endpointGroupIpList; 
            private String endpointGroupRegion; 
            private java.util.List < String > endpointGroupUnconfirmedIpList; 
            private String listenerId; 
            private String name; 
            private String serviceId; 
            private Boolean serviceManaged; 
            private java.util.List < ServiceManagedInfos> serviceManagedInfos; 
            private String state; 

            /**
             * The ID of the GA instance.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * The description of the endpoint group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the endpoint group.
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * The endpoint group IP addresses.
             */
            public Builder endpointGroupIpList(java.util.List < String > endpointGroupIpList) {
                this.endpointGroupIpList = endpointGroupIpList;
                return this;
            }

            /**
             * The ID of the region where the endpoint group is created.
             */
            public Builder endpointGroupRegion(String endpointGroupRegion) {
                this.endpointGroupRegion = endpointGroupRegion;
                return this;
            }

            /**
             * The endpoint group IP addresses to be confirmed after the GA instance is upgraded.
             */
            public Builder endpointGroupUnconfirmedIpList(java.util.List < String > endpointGroupUnconfirmedIpList) {
                this.endpointGroupUnconfirmedIpList = endpointGroupUnconfirmedIpList;
                return this;
            }

            /**
             * The ID of the custom routing listener.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The name of the endpoint group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the service that manages the instance.
             * <p>
             * 
             * >  This parameter takes effect only if **ServiceManaged** is set to **True**.
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
             * > 
             * 
             * *   This parameter takes effect only if **ServiceManaged** is set to **True**.
             * 
             * *   Users can perform only specific actions on a managed instance.
             */
            public Builder serviceManagedInfos(java.util.List < ServiceManagedInfos> serviceManagedInfos) {
                this.serviceManagedInfos = serviceManagedInfos;
                return this;
            }

            /**
             * The status of the endpoint group. Valid values:
             * <p>
             * 
             * *   **init**
             * *   **active**
             * *   **updating**
             * *   **deleting**
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public EndpointGroups build() {
                return new EndpointGroups(this);
            } 

        } 

    }
}
