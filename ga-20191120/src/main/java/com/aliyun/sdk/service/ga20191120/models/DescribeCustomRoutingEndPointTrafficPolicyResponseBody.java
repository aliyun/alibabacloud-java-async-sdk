// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomRoutingEndPointTrafficPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomRoutingEndPointTrafficPolicyResponseBody</p>
 */
public class DescribeCustomRoutingEndPointTrafficPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.NameInMap("ListenerId")
    private String listenerId;

    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.NameInMap("PortRanges")
    private java.util.List < PortRanges> portRanges;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @com.aliyun.core.annotation.NameInMap("ServiceManagedInfos")
    private java.util.List < ServiceManagedInfos> serviceManagedInfos;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private DescribeCustomRoutingEndPointTrafficPolicyResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.address = builder.address;
        this.endpoint = builder.endpoint;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointId = builder.endpointId;
        this.listenerId = builder.listenerId;
        this.policyId = builder.policyId;
        this.portRanges = builder.portRanges;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
        this.serviceManaged = builder.serviceManaged;
        this.serviceManagedInfos = builder.serviceManagedInfos;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomRoutingEndPointTrafficPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
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
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return portRanges
     */
    public java.util.List < PortRanges> getPortRanges() {
        return this.portRanges;
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
        private String address; 
        private String endpoint; 
        private String endpointGroupId; 
        private String endpointId; 
        private String listenerId; 
        private String policyId; 
        private java.util.List < PortRanges> portRanges; 
        private String requestId; 
        private String serviceId; 
        private Boolean serviceManaged; 
        private java.util.List < ServiceManagedInfos> serviceManagedInfos; 
        private String state; 

        /**
         * The ID of the request.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The ID of the traffic policy.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * The ID of the endpoint to which the traffic policy belongs.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * The ID of the listener to which the endpoint belongs.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The ID of the endpoint group to which the endpoint belongs.
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The ID of the GA instance to which the endpoint belongs.
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The name of the vSwitch to which the traffic policy belongs.
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * The IP address of the traffic policy.
         */
        public Builder portRanges(java.util.List < PortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }

        /**
         * The ID of the endpoint to which the traffic destination belongs.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the service that manages the instance.
         * <p>
         * 
         * >  This parameter is returned only if the value of **ServiceManaged** is **true**.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Indicates whether the instance is managed. Valid values:
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
         * > *   This parameter is returned only if the value of **ServiceManaged** is **true**.
         * > *   Users can perform only specific actions on a managed instance.
         */
        public Builder serviceManagedInfos(java.util.List < ServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }

        /**
         * The status of the traffic destination.
         * <p>
         * 
         * - init: being initialized.
         * - active: running as expected.
         * - updating: being updated.
         * - deleting: being deleted.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public DescribeCustomRoutingEndPointTrafficPolicyResponseBody build() {
            return new DescribeCustomRoutingEndPointTrafficPolicyResponseBody(this);
        } 

    } 

    public static class PortRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromPort")
        private Integer fromPort;

        @com.aliyun.core.annotation.NameInMap("ToPort")
        private Integer toPort;

        private PortRanges(Builder builder) {
            this.fromPort = builder.fromPort;
            this.toPort = builder.toPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortRanges create() {
            return builder().build();
        }

        /**
         * @return fromPort
         */
        public Integer getFromPort() {
            return this.fromPort;
        }

        /**
         * @return toPort
         */
        public Integer getToPort() {
            return this.toPort;
        }

        public static final class Builder {
            private Integer fromPort; 
            private Integer toPort; 

            /**
             * The first port of the port range used by the traffic destination to process requests.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The last port of the port range used by the traffic destination to process requests.
             */
            public Builder toPort(Integer toPort) {
                this.toPort = toPort;
                return this;
            }

            public PortRanges build() {
                return new PortRanges(this);
            } 

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
             * *   **Listener**: listener.
             * *   **IpSet**: acceleration region.
             * *   **EndpointGroup**: endpoint group.
             * *   **ForwardingRule**: forwarding rule.
             * *   **Endpoint**: endpoint.
             * *   **EndpointGroupDestination**: protocol mapping of an endpoint group that is associated with a custom routing listener.
             * *   **EndpointPolicy**: traffic policy of an endpoint that is associated with a custom routing listener.
             * 
             * >  This parameter takes effect only if the value of **Action** is **CreateChild**.
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * Indicates whether the specified actions are managed.
             * <p>
             * 
             * *   **true**: The specified actions are managed, and users cannot perform the specified actions on the managed instance.
             * *   **false**: The specified actions are not managed, and users can perform the specified actions on the managed instance.
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
