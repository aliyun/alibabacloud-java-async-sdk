// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomRoutingEndPointTrafficPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomRoutingEndPointTrafficPolicyResponseBody</p>
 */
public class DescribeCustomRoutingEndPointTrafficPolicyResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("Address")
    private String address;

    @NameInMap("Endpoint")
    private String endpoint;

    @NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @NameInMap("EndpointId")
    private String endpointId;

    @NameInMap("ListenerId")
    private String listenerId;

    @NameInMap("PolicyId")
    private String policyId;

    @NameInMap("PortRanges")
    private java.util.List < PortRanges> portRanges;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceId")
    private String serviceId;

    @NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @NameInMap("ServiceManagedInfos")
    private java.util.List < ServiceManagedInfos> serviceManagedInfos;

    @NameInMap("State")
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
         * - true
         * - false
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
        @NameInMap("FromPort")
        private Integer fromPort;

        @NameInMap("ToPort")
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
             * The port range of the traffic destination.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The first port of the port range.
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
             * - Create
             * - Update
             * - Delete
             * - Associate
             * - UserUnmanaged
             * - CreateChild
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Sub resource type, Valid values:
             * <p>
             * 
             * - Listener
             * - IpSet
             * - EndpointGroup
             * - ForwardingRule
             * - Endpoint
             * - EndpointGroupDestination
             * - EndpointPolicy
             * 
             * >Only valid when the Action parameter is CreateChild.
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * Is the managed policy action managed, Valid values:
             * <p>
             * 
             * - true: The managed policy action is managed, and users do not have permission to perform the operation specified in the Action on the managed instance.
             * 
             * - false: The managed policy action is not managed, and users have permission to perform the operation specified in the Action on the managed instance.
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
