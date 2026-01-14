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
 * {@link DescribeCustomRoutingEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomRoutingEndpointResponseBody</p>
 */
public class DescribeCustomRoutingEndpointResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @com.aliyun.core.annotation.NameInMap("ServiceManagedInfos")
    private java.util.List<ServiceManagedInfos> serviceManagedInfos;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("TrafficToEndpointPolicy")
    private String trafficToEndpointPolicy;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeCustomRoutingEndpointResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.endpoint = builder.endpoint;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointId = builder.endpointId;
        this.listenerId = builder.listenerId;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
        this.serviceManaged = builder.serviceManaged;
        this.serviceManagedInfos = builder.serviceManagedInfos;
        this.state = builder.state;
        this.trafficToEndpointPolicy = builder.trafficToEndpointPolicy;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomRoutingEndpointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return state
     */
    public String getState() {
        return this.state;
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
        private String requestId; 
        private String serviceId; 
        private Boolean serviceManaged; 
        private java.util.List<ServiceManagedInfos> serviceManagedInfos; 
        private String state; 
        private String trafficToEndpointPolicy; 
        private String type; 

        private Builder() {
        } 

        private Builder(DescribeCustomRoutingEndpointResponseBody model) {
            this.acceleratorId = model.acceleratorId;
            this.endpoint = model.endpoint;
            this.endpointGroupId = model.endpointGroupId;
            this.endpointId = model.endpointId;
            this.listenerId = model.listenerId;
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
            this.serviceManaged = model.serviceManaged;
            this.serviceManagedInfos = model.serviceManagedInfos;
            this.state = model.state;
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
         * <p>The name of the endpoint (vSwitch).</p>
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
         * <p>epg-bp14sz7ftcwwjgrdm****</p>
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * <p>The ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-bp1dmlohjjz4kqaun****</p>
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>The ID of the listener with which the endpoint is associated.</p>
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
         * <p>String	04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service ID to which the managed instance belongs.</p>
         * <blockquote>
         * <p> Valid only when the ServiceManaged parameter is True.</p>
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
         * <p>Is it a managed instance. Valid values:</p>
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
         * <p>A list of action policies that users can execute on this managed instance.</p>
         */
        public Builder serviceManagedInfos(java.util.List<ServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }

        /**
         * <p>The status of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The access policy of traffic for the specified endpoint. Valid values:</p>
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
         * <p>Set the value to <strong>PrivateSubNet</strong>, which indicates private CIDR blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivateSubNet</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeCustomRoutingEndpointResponseBody build() {
            return new DescribeCustomRoutingEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomRoutingEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomRoutingEndpointResponseBody</p>
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
             * <p>Managed policy action name, Valid values:</p>
             * <ul>
             * <li>Create</li>
             * <li>Update</li>
             * <li>Delete</li>
             * <li>Associate</li>
             * <li>UserUnmanaged</li>
             * <li>CreateChild</li>
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
             * <p>Sub resource type, Valid values:</p>
             * <ul>
             * <li>Listener</li>
             * <li>IpSet</li>
             * <li>EndpointGroup</li>
             * <li>ForwardingRule</li>
             * <li>Endpoint</li>
             * <li>EndpointGroupDestination</li>
             * <li>EndpointPolicy</li>
             * </ul>
             * <blockquote>
             * <p>Only valid when the Action parameter is CreateChild.</p>
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
             * <p>Is the managed policy action managed, Valid values:</p>
             * <ul>
             * <li><p>true: The managed policy action is managed, and users do not have permission to perform the operation specified in the Action on the managed instance.</p>
             * </li>
             * <li><p>false: The managed policy action is not managed, and users have permission to perform the operation specified in the Action on the managed instance.</p>
             * </li>
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
}
