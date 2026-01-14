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
 * {@link ListCustomRoutingEndpointGroupDestinationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomRoutingEndpointGroupDestinationsResponseBody</p>
 */
public class ListCustomRoutingEndpointGroupDestinationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Destinations")
    private java.util.List<Destinations> destinations;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinations
     */
    public java.util.List<Destinations> getDestinations() {
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
        private java.util.List<Destinations> destinations; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListCustomRoutingEndpointGroupDestinationsResponseBody model) {
            this.destinations = model.destinations;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details about the endpoint group mappings.</p>
         */
        public Builder destinations(java.util.List<Destinations> destinations) {
            this.destinations = destinations;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomRoutingEndpointGroupDestinationsResponseBody build() {
            return new ListCustomRoutingEndpointGroupDestinationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomRoutingEndpointGroupDestinationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomRoutingEndpointGroupDestinationsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ServiceManagedInfos model) {
                this.action = model.action;
                this.childType = model.childType;
                this.isManaged = model.isManaged;
            } 

            /**
             * <p>The name of the action that you can perform on the managed instance. Valid values:</p>
             * <ul>
             * <li><strong>Create</strong>: Create an instance.</li>
             * <li><strong>Update</strong>: Update the current instance.</li>
             * <li><strong>Delete</strong>: Delete the current instance.</li>
             * <li><strong>Associate</strong>: Reference the current instance.</li>
             * <li><strong>UserUnmanaged</strong>: Unmanage the instance.</li>
             * <li><strong>CreateChild</strong>: Create a child resource in the current instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Update</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The type of the child resource. Valid values:</p>
             * <ul>
             * <li><strong>Listener</strong>: listener.</li>
             * <li><strong>IpSet</strong>: acceleration region.</li>
             * <li><strong>EndpointGroup</strong>: endpoint group.</li>
             * <li><strong>ForwardingRule</strong>: forwarding rule.</li>
             * <li><strong>Endpoint</strong>: endpoint.</li>
             * <li><strong>EndpointGroupDestination</strong>: protocol mapping of an endpoint group associated with a custom routing listener.</li>
             * <li><strong>EndpointPolicy</strong>: traffic policy of an endpoint associated with a custom routing listener.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter takes effect only if <strong>Action</strong> is set to <strong>CreateChild</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Listener</p>
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * <p>Indicates whether the specified actions are managed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The specified actions are managed, and you cannot perform the specified actions on the managed instance.</li>
             * <li><strong>false</strong>: The specified actions are not managed, and you can perform the specified actions on the managed instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link ListCustomRoutingEndpointGroupDestinationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomRoutingEndpointGroupDestinationsResponseBody</p>
     */
    public static class Destinations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceleratorId")
        private String acceleratorId;

        @com.aliyun.core.annotation.NameInMap("DestinationId")
        private String destinationId;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
        private String endpointGroupId;

        @com.aliyun.core.annotation.NameInMap("FromPort")
        private Integer fromPort;

        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("Protocols")
        private java.util.List<String> protocols;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @com.aliyun.core.annotation.NameInMap("ServiceManagedInfos")
        private java.util.List<ServiceManagedInfos> serviceManagedInfos;

        @com.aliyun.core.annotation.NameInMap("ToPort")
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
        public java.util.List<String> getProtocols() {
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
        public java.util.List<ServiceManagedInfos> getServiceManagedInfos() {
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
            private java.util.List<String> protocols; 
            private String serviceId; 
            private Boolean serviceManaged; 
            private java.util.List<ServiceManagedInfos> serviceManagedInfos; 
            private Integer toPort; 

            private Builder() {
            } 

            private Builder(Destinations model) {
                this.acceleratorId = model.acceleratorId;
                this.destinationId = model.destinationId;
                this.endpointGroupId = model.endpointGroupId;
                this.fromPort = model.fromPort;
                this.listenerId = model.listenerId;
                this.protocols = model.protocols;
                this.serviceId = model.serviceId;
                this.serviceManaged = model.serviceManaged;
                this.serviceManagedInfos = model.serviceManagedInfos;
                this.toPort = model.toPort;
            } 

            /**
             * <p>The GA instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ga-bp1odcab8tmno0hdq****</p>
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * <p>The ID of the endpoint group mapping.</p>
             * 
             * <strong>example:</strong>
             * <p>dst-123abc****</p>
             */
            public Builder destinationId(String destinationId) {
                this.destinationId = destinationId;
                return this;
            }

            /**
             * <p>The endpoint group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>epg-bp14sz7ftcwwjgrdm****</p>
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * <p>The first port of the backend service port range.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * <p>The listener ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lsr-bp1bpn0kn908w4nbw****</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The backend service protocols of the endpoint group. Valid values:</p>
             * <ul>
             * <li><strong>TCP</strong></li>
             * <li><strong>UDP</strong></li>
             * <li><strong>TCP,UDP</strong></li>
             * </ul>
             */
            public Builder protocols(java.util.List<String> protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * <p>The ID of the service that manages the GA instance.</p>
             * <blockquote>
             * <p> This parameter takes effect only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ALB</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>Indicates whether the GA instance is managed. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * <p>The actions that you can perform on the managed instance.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter takes effect only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</li>
             * <li>You can perform only specific actions on the managed instance.</li>
             * </ul>
             * </blockquote>
             */
            public Builder serviceManagedInfos(java.util.List<ServiceManagedInfos> serviceManagedInfos) {
                this.serviceManagedInfos = serviceManagedInfos;
                return this;
            }

            /**
             * <p>The last port of the backend service port range.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
