// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomRoutingEndpointGroupDestinationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomRoutingEndpointGroupDestinationsResponseBody</p>
 */
public class ListCustomRoutingEndpointGroupDestinationsResponseBody extends TeaModel {
    @NameInMap("Destinations")
    private java.util.List < Destinations> destinations;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListCustomRoutingEndpointGroupDestinationsResponseBody(Builder builder) {
        this.destinations = builder.destinations;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomRoutingEndpointGroupDestinationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return destinations
     */
    public java.util.List < Destinations> getDestinations() {
        return this.destinations;
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
        private java.util.List < Destinations> destinations; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details about the endpoint group mapping configurations.
         */
        public Builder destinations(java.util.List < Destinations> destinations) {
            this.destinations = destinations;
            return this;
        }

        /**
         * The number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomRoutingEndpointGroupDestinationsResponseBody build() {
            return new ListCustomRoutingEndpointGroupDestinationsResponseBody(this);
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
             * Managed policy action name, Valid values:
             * <p>
             * 
             * Create
             * Update
             * Delete
             * Associate
             * UserUnmanaged
             * CreateChild
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Sub resource type, Valid values:
             * <p>
             * 
             * Listener
             * IpSet
             * EndpointGroup
             * ForwardingRule
             * Endpoint
             * EndpointGroupDestination
             * EndpointPolicy
             * 
             * > Only valid when the Action parameter is CreateChild.
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * Is the managed policy action managed, Valid values:
             * <p>
             * 
             * - **true**: The managed policy action is managed, and users do not have permission to perform the operation specified in the Action on the managed instance.
             * 
             * - **false**: The managed policy action is not managed, and users have permission to perform the operation specified in the Action on the managed instance.
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
    public static class Destinations extends TeaModel {
        @NameInMap("AcceleratorId")
        private String acceleratorId;

        @NameInMap("DestinationId")
        private String destinationId;

        @NameInMap("EndpointGroupId")
        private String endpointGroupId;

        @NameInMap("FromPort")
        private Integer fromPort;

        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("Protocols")
        private java.util.List < String > protocols;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @NameInMap("ServiceManagedInfos")
        private java.util.List < ServiceManagedInfos> serviceManagedInfos;

        @NameInMap("ToPort")
        private Integer toPort;

        private Destinations(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.destinationId = builder.destinationId;
            this.endpointGroupId = builder.endpointGroupId;
            this.fromPort = builder.fromPort;
            this.listenerId = builder.listenerId;
            this.protocols = builder.protocols;
            this.serviceId = builder.serviceId;
            this.serviceManaged = builder.serviceManaged;
            this.serviceManagedInfos = builder.serviceManagedInfos;
            this.toPort = builder.toPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Destinations create() {
            return builder().build();
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return destinationId
         */
        public String getDestinationId() {
            return this.destinationId;
        }

        /**
         * @return endpointGroupId
         */
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        /**
         * @return fromPort
         */
        public Integer getFromPort() {
            return this.fromPort;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return protocols
         */
        public java.util.List < String > getProtocols() {
            return this.protocols;
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
         * @return toPort
         */
        public Integer getToPort() {
            return this.toPort;
        }

        public static final class Builder {
            private String acceleratorId; 
            private String destinationId; 
            private String endpointGroupId; 
            private Integer fromPort; 
            private String listenerId; 
            private java.util.List < String > protocols; 
            private String serviceId; 
            private Boolean serviceManaged; 
            private java.util.List < ServiceManagedInfos> serviceManagedInfos; 
            private Integer toPort; 

            /**
             * The ID of the GA instance.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * The ID of the endpoint group mapping configuration.
             */
            public Builder destinationId(String destinationId) {
                this.destinationId = destinationId;
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
             * The start port of the backend service port range of the endpoint group.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
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
             * The backend service protocol of the endpoint group.
             * <p>
             * 
             * *   **TCP**: TCP
             * *   **UDP**: UDP
             * *   **TCP,UDP**: TCP and UDP
             */
            public Builder protocols(java.util.List < String > protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * The service ID to which the managed instance belongs.
             * <p>
             * 
             * >  Valid only when the ServiceManaged parameter is True.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * Is it a managed instance. Valid values:
             * <p>
             * 
             * - **true**
             * 
             * - **false**
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * A list of action policies that users can execute on this managed instance.
             */
            public Builder serviceManagedInfos(java.util.List < ServiceManagedInfos> serviceManagedInfos) {
                this.serviceManagedInfos = serviceManagedInfos;
                return this;
            }

            /**
             * The end port of the backend service port range of the endpoint group.
             */
            public Builder toPort(Integer toPort) {
                this.toPort = toPort;
                return this;
            }

            public Destinations build() {
                return new Destinations(this);
            } 

        } 

    }
}
