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
         * 托管实例所属的服务方ID。
         * <p>
         * > 仅在**ServiceManaged**参数为**True**时有效。
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * 是否为托管实例。取值：
         * <p>
         * 
         * - **true**：是托管实例。
         * 
         * - **false**：不是托管实例。
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * 用户在此托管实例下可执行的动作策略列表。
         * <p>
         * 
         * > 仅在**ServiceManaged**参数为**True**时有效。
         * > - 当实例处于托管状态时，用户对实例的操作会受到限制，某些操作行为会被禁止。
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
             * 托管策略动作名称，取值：
             * <p>
             * - **Create**：创建实例。
             * - **Update**：更新当前实例。
             * - **Delete**：删除当前实例。
             * - **Associate**：引用/被引用当前实例。
             * - **UserUnmanaged**：用户解托管实例。
             * - **CreateChild**：在当前实例下创建子资源。
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * 子资源类型，取值：
             * <p>
             * - **Listener**：监听资源。
             * - **IpSet**：加速地域资源。
             * - **EndpointGroup**：终端节点组资源。
             * - **ForwardingRule**：转发策略资源。
             * - **Endpoint**：终端节点资源。
             * - **EndpointGroupDestination**：自定义路由监听下的终端节点组协议映射资源。
             * - **EndpointPolicy**：自定义路由监听下的终端节点通行策略资源。
             * > 仅在**Action**参数为**CreateChild**时有效
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * 托管策略动作是否被托管，取值：
             * <p>
             * - **true**：托管策略动作被托管，用户无权在托管实例下执行Action指定的操作。
             * - **false**：托管策略动作未被托管，用户可在托管实例下执行Action指定的操作。
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
