// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomRoutingEndpointGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomRoutingEndpointGroupResponseBody</p>
 */
public class DescribeCustomRoutingEndpointGroupResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("AccessLogSwitch")
    private String accessLogSwitch;

    @NameInMap("Description")
    private String description;

    @NameInMap("EnableAccessLog")
    private Boolean enableAccessLog;

    @NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @NameInMap("EndpointGroupIpList")
    private java.util.List < String > endpointGroupIpList;

    @NameInMap("EndpointGroupRegion")
    private String endpointGroupRegion;

    @NameInMap("EndpointGroupUnconfirmedIpList")
    private java.util.List < String > endpointGroupUnconfirmedIpList;

    @NameInMap("ListenerId")
    private String listenerId;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceId")
    private String serviceId;

    @NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @NameInMap("ServiceManagedInfos")
    private java.util.List < ServiceManagedInfos> serviceManagedInfos;

    @NameInMap("SlsLogStoreName")
    private String slsLogStoreName;

    @NameInMap("SlsProjectName")
    private String slsProjectName;

    @NameInMap("SlsRegion")
    private String slsRegion;

    @NameInMap("State")
    private String state;

    private DescribeCustomRoutingEndpointGroupResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.accessLogSwitch = builder.accessLogSwitch;
        this.description = builder.description;
        this.enableAccessLog = builder.enableAccessLog;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointGroupIpList = builder.endpointGroupIpList;
        this.endpointGroupRegion = builder.endpointGroupRegion;
        this.endpointGroupUnconfirmedIpList = builder.endpointGroupUnconfirmedIpList;
        this.listenerId = builder.listenerId;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
        this.serviceManaged = builder.serviceManaged;
        this.serviceManagedInfos = builder.serviceManagedInfos;
        this.slsLogStoreName = builder.slsLogStoreName;
        this.slsProjectName = builder.slsProjectName;
        this.slsRegion = builder.slsRegion;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomRoutingEndpointGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return accessLogSwitch
     */
    public String getAccessLogSwitch() {
        return this.accessLogSwitch;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableAccessLog
     */
    public Boolean getEnableAccessLog() {
        return this.enableAccessLog;
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
     * @return slsLogStoreName
     */
    public String getSlsLogStoreName() {
        return this.slsLogStoreName;
    }

    /**
     * @return slsProjectName
     */
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

    /**
     * @return slsRegion
     */
    public String getSlsRegion() {
        return this.slsRegion;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String acceleratorId; 
        private String accessLogSwitch; 
        private String description; 
        private Boolean enableAccessLog; 
        private String endpointGroupId; 
        private java.util.List < String > endpointGroupIpList; 
        private String endpointGroupRegion; 
        private java.util.List < String > endpointGroupUnconfirmedIpList; 
        private String listenerId; 
        private String name; 
        private String requestId; 
        private String serviceId; 
        private Boolean serviceManaged; 
        private java.util.List < ServiceManagedInfos> serviceManagedInfos; 
        private String slsLogStoreName; 
        private String slsProjectName; 
        private String slsRegion; 
        private String state; 

        /**
         * The ID of the GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The status of the logs.
         * <p>
         * 
         * *   **on**: associated
         * *   **off**: not associated
         * *   **binding**: being associated
         * *   **unbinding**: being disassociated
         */
        public Builder accessLogSwitch(String accessLogSwitch) {
            this.accessLogSwitch = accessLogSwitch;
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
         * Indicates whether access logging is enabled.
         * <p>
         * 
         * *   **on**: enabled
         * *   **off**: disabled
         */
        public Builder enableAccessLog(Boolean enableAccessLog) {
            this.enableAccessLog = enableAccessLog;
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
         * The list of endpoint group IP addresses.
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
         * The ID of the request.
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
         * Is it a managed instance. Value:
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
         * The name of the Logstore.
         */
        public Builder slsLogStoreName(String slsLogStoreName) {
            this.slsLogStoreName = slsLogStoreName;
            return this;
        }

        /**
         * The name of the Log Service project.
         */
        public Builder slsProjectName(String slsProjectName) {
            this.slsProjectName = slsProjectName;
            return this;
        }

        /**
         * The region of the logs that are created in Log Service.
         */
        public Builder slsRegion(String slsRegion) {
            this.slsRegion = slsRegion;
            return this;
        }

        /**
         * The status of the endpoint group.
         * <p>
         * 
         * *   **init**: being initialized
         * *   **active**: running as expected
         * *   **updating**: being updated
         * *   **deleting**: being deleted
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public DescribeCustomRoutingEndpointGroupResponseBody build() {
            return new DescribeCustomRoutingEndpointGroupResponseBody(this);
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
