// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomRoutingEndpointGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomRoutingEndpointGroupResponseBody</p>
 */
public class DescribeCustomRoutingEndpointGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("AccessLogSwitch")
    private String accessLogSwitch;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EnableAccessLog")
    private Boolean enableAccessLog;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @com.aliyun.core.annotation.NameInMap("ServiceManagedInfos")
    private java.util.List < ServiceManagedInfos> serviceManagedInfos;

    @com.aliyun.core.annotation.NameInMap("SlsLogStoreName")
    private String slsLogStoreName;

    @com.aliyun.core.annotation.NameInMap("SlsProjectName")
    private String slsProjectName;

    @com.aliyun.core.annotation.NameInMap("SlsRegion")
    private String slsRegion;

    @com.aliyun.core.annotation.NameInMap("State")
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
         * The GA instance ID.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * Indicates the status of the binding between the Log Service project and the endpoint group. Valid values:
         * <p>
         * 
         * *   **on:** The endpoint group is bound to the Log Service project.
         * *   **off:** The endpoint group is not bound to the Log Service project.
         * *   **binding:** The endpoint group is being bound to the Log Service project.
         * *   **unbinding:** The endpoint group is being unbound from the Log Service project.
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
         * Indicates whether the access log feature is enabled. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder enableAccessLog(Boolean enableAccessLog) {
            this.enableAccessLog = enableAccessLog;
            return this;
        }

        /**
         * The endpoint group ID.
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
         * The region ID of the endpoint group.
         */
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        /**
         * The endpoint group IP addresses that need to be confirmed after the GA instance is upgraded.
         */
        public Builder endpointGroupUnconfirmedIpList(java.util.List < String > endpointGroupUnconfirmedIpList) {
            this.endpointGroupUnconfirmedIpList = endpointGroupUnconfirmedIpList;
            return this;
        }

        /**
         * The custom routing listener ID.
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the service that manages the GA instance.
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
         * >  This parameter takes effect only if **ServiceManaged** is set to **True**.
         * 
         * *   Users can perform only specific actions on a managed instance.
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
         * The status of the endpoint group. Valid values:
         * <p>
         * 
         * *   **init:** The endpoint group is being initialized.
         * *   **active:** The endpoint group is running normally.
         * *   **updating:** The endpoint group is being updated.
         * *   **deleting:** The ACL is being deleted.
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
             * Indicates whether the specified actions are managed. Valid values:
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
