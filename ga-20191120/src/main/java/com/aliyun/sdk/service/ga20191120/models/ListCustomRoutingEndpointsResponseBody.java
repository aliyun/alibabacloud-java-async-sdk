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
 * {@link ListCustomRoutingEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomRoutingEndpointsResponseBody</p>
 */
public class ListCustomRoutingEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.List<Endpoints> endpoints;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpoints
     */
    public java.util.List<Endpoints> getEndpoints() {
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
        private java.util.List<Endpoints> endpoints; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListCustomRoutingEndpointsResponseBody model) {
            this.endpoints = model.endpoints;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the endpoints.</p>
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomRoutingEndpointsResponseBody build() {
            return new ListCustomRoutingEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomRoutingEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomRoutingEndpointsResponseBody</p>
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
             * <p>The name of the action performed on the managed instance. Valid values:</p>
             * <ul>
             * <li><strong>Create</strong></li>
             * <li><strong>Update</strong></li>
             * <li><strong>Delete</strong></li>
             * <li><strong>Associate</strong></li>
             * <li><strong>UserUnmanaged</strong></li>
             * <li><strong>CreateChild</strong></li>
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
             * <li><strong>Listener</strong>: listener</li>
             * <li><strong>IpSet</strong>: acceleration region</li>
             * <li><strong>EndpointGroup</strong>: endpoint group</li>
             * <li><strong>ForwardingRule</strong>: forwarding rule</li>
             * <li><strong>Endpoint</strong>: endpoint</li>
             * <li><strong>EndpointGroupDestination</strong>: protocol mapping of an endpoint group associated with a custom routing listener</li>
             * <li><strong>EndpointPolicy</strong>: traffic policy of an endpoint associated with a custom routing listener</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is valid only if <strong>Action</strong> is set to <strong>CreateChild</strong>.</p>
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
             * <li><strong>true</strong>: The specified actions are managed, and users cannot perform the specified actions on the managed resource.</li>
             * <li><strong>false</strong>: The specified actions are not managed, and users can perform the specified actions on the managed resource.</li>
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
     * {@link ListCustomRoutingEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomRoutingEndpointsResponseBody</p>
     */
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
        private java.util.List<ServiceManagedInfos> serviceManagedInfos;

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
        public java.util.List<ServiceManagedInfos> getServiceManagedInfos() {
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
            private java.util.List<ServiceManagedInfos> serviceManagedInfos; 
            private String trafficToEndpointPolicy; 
            private String type; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.acceleratorId = model.acceleratorId;
                this.endpoint = model.endpoint;
                this.endpointGroupId = model.endpointGroupId;
                this.endpointId = model.endpointId;
                this.listenerId = model.listenerId;
                this.serviceId = model.serviceId;
                this.serviceManaged = model.serviceManaged;
                this.serviceManagedInfos = model.serviceManagedInfos;
                this.trafficToEndpointPolicy = model.trafficToEndpointPolicy;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the GA instance with which the endpoint is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>ga-bp1odcab8tmno0hdq****</p>
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * <p>The name of the vSwitch that is specified as an endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-test01</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The ID of the endpoint group to which the endpoint belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>epg-bp16jdc00bhe97sr5****</p>
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * <p>The endpoint ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-bp14sz7ftcwwjgrdm****</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The ID of the listener to which the endpoint belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>lsr-bp1bpn0kn908w4nbw****</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The ID of the service that manages the GA instance.</p>
             * <blockquote>
             * <p> This parameter is valid only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
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
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The actions that users can perform on the managed instance.</p>
             * <blockquote>
             * <p> This parameter is valid only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
             * </blockquote>
             * <ul>
             * <li>Users can perform only specific actions on a managed instance.</li>
             * </ul>
             */
            public Builder serviceManagedInfos(java.util.List<ServiceManagedInfos> serviceManagedInfos) {
                this.serviceManagedInfos = serviceManagedInfos;
                return this;
            }

            /**
             * <p>The access policy of traffic that is destined for the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>AllowAll</strong>: allows all traffic to the endpoint.</li>
             * <li><strong>DenyAll</strong>: denies all traffic to the endpoint.</li>
             * <li><strong>AllowCustom</strong>: allows traffic only to specified destinations.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DenyAll</p>
             */
            public Builder trafficToEndpointPolicy(String trafficToEndpointPolicy) {
                this.trafficToEndpointPolicy = trafficToEndpointPolicy;
                return this;
            }

            /**
             * <p>The backend service type of the endpoint.</p>
             * <p>Only <strong>PrivateSubNet</strong> may be returned, which indicates a private CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>PrivateSubNet</p>
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
