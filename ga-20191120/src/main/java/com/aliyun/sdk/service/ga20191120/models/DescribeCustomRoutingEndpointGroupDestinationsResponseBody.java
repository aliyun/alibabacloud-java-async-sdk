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
 * {@link DescribeCustomRoutingEndpointGroupDestinationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomRoutingEndpointGroupDestinationsResponseBody</p>
 */
public class DescribeCustomRoutingEndpointGroupDestinationsResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("ToPort")
    private Integer toPort;

    private DescribeCustomRoutingEndpointGroupDestinationsResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.destinationId = builder.destinationId;
        this.endpointGroupId = builder.endpointGroupId;
        this.fromPort = builder.fromPort;
        this.listenerId = builder.listenerId;
        this.protocols = builder.protocols;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
        this.serviceManaged = builder.serviceManaged;
        this.serviceManagedInfos = builder.serviceManagedInfos;
        this.state = builder.state;
        this.toPort = builder.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomRoutingEndpointGroupDestinationsResponseBody create() {
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
        private String requestId; 
        private String serviceId; 
        private Boolean serviceManaged; 
        private java.util.List<ServiceManagedInfos> serviceManagedInfos; 
        private String state; 
        private Integer toPort; 

        private Builder() {
        } 

        private Builder(DescribeCustomRoutingEndpointGroupDestinationsResponseBody model) {
            this.acceleratorId = model.acceleratorId;
            this.destinationId = model.destinationId;
            this.endpointGroupId = model.endpointGroupId;
            this.fromPort = model.fromPort;
            this.listenerId = model.listenerId;
            this.protocols = model.protocols;
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
            this.serviceManaged = model.serviceManaged;
            this.serviceManagedInfos = model.serviceManagedInfos;
            this.state = model.state;
            this.toPort = model.toPort;
        } 

        /**
         * <p>The ID of the Global Accelerator (GA) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * <p>The ID of the endpoint group mapping configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>dst-123abc****</p>
         */
        public Builder destinationId(String destinationId) {
            this.destinationId = destinationId;
            return this;
        }

        /**
         * <p>The ID of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-bp14sz7ftcwwjgrdm****</p>
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * <p>The start port of the backend service port range of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder fromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }

        /**
         * <p>The ID of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The backend service protocol of the endpoint group.</p>
         * <ul>
         * <li><strong>TCP</strong>: TCP</li>
         * <li><strong>UDP</strong>: UDP</li>
         * <li><strong>TCP,UDP</strong>: TCP and UDP</li>
         * </ul>
         */
        public Builder protocols(java.util.List<String> protocols) {
            this.protocols = protocols;
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
         * <p>The status of the endpoint group mapping configuration.</p>
         * <ul>
         * <li><strong>init</strong>: being initialized.</li>
         * <li><strong>active</strong>: normal.</li>
         * <li><strong>updating</strong>: being updated.</li>
         * <li><strong>deleting</strong>: being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The end port of the backend service port range of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder toPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }

        public DescribeCustomRoutingEndpointGroupDestinationsResponseBody build() {
            return new DescribeCustomRoutingEndpointGroupDestinationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomRoutingEndpointGroupDestinationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomRoutingEndpointGroupDestinationsResponseBody</p>
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
