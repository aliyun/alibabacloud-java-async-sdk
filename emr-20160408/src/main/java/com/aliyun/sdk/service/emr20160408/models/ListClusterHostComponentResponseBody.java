// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterHostComponentResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterHostComponentResponseBody</p>
 */
public class ListClusterHostComponentResponseBody extends TeaModel {
    @NameInMap("ComponentList")
    private ComponentList componentList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListClusterHostComponentResponseBody(Builder builder) {
        this.componentList = builder.componentList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterHostComponentResponseBody create() {
        return builder().build();
    }

    /**
     * @return componentList
     */
    public ComponentList getComponentList() {
        return this.componentList;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private ComponentList componentList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * ComponentList.
         */
        public Builder componentList(ComponentList componentList) {
            this.componentList = componentList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListClusterHostComponentResponseBody build() {
            return new ListClusterHostComponentResponseBody(this);
        } 

    } 

    public static class Component extends TeaModel {
        @NameInMap("CommissionStatus")
        private String commissionStatus;

        @NameInMap("ComponentDisplayName")
        private String componentDisplayName;

        @NameInMap("ComponentName")
        private String componentName;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("HealthReportTime")
        private Long healthReportTime;

        @NameInMap("HealthStatus")
        private String healthStatus;

        @NameInMap("HostId")
        private String hostId;

        @NameInMap("HostInstanceId")
        private String hostInstanceId;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("NeedRestart")
        private Boolean needRestart;

        @NameInMap("PrivateIp")
        private String privateIp;

        @NameInMap("PublicIp")
        private String publicIp;

        @NameInMap("Role")
        private String role;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("ServerStatus")
        private String serverStatus;

        @NameInMap("ServiceDisplayName")
        private String serviceDisplayName;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("State")
        private String state;

        @NameInMap("Status")
        private String status;

        private Component(Builder builder) {
            this.commissionStatus = builder.commissionStatus;
            this.componentDisplayName = builder.componentDisplayName;
            this.componentName = builder.componentName;
            this.cpu = builder.cpu;
            this.healthReportTime = builder.healthReportTime;
            this.healthStatus = builder.healthStatus;
            this.hostId = builder.hostId;
            this.hostInstanceId = builder.hostInstanceId;
            this.hostName = builder.hostName;
            this.instanceType = builder.instanceType;
            this.memory = builder.memory;
            this.needRestart = builder.needRestart;
            this.privateIp = builder.privateIp;
            this.publicIp = builder.publicIp;
            this.role = builder.role;
            this.serialNumber = builder.serialNumber;
            this.serverStatus = builder.serverStatus;
            this.serviceDisplayName = builder.serviceDisplayName;
            this.serviceName = builder.serviceName;
            this.state = builder.state;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Component create() {
            return builder().build();
        }

        /**
         * @return commissionStatus
         */
        public String getCommissionStatus() {
            return this.commissionStatus;
        }

        /**
         * @return componentDisplayName
         */
        public String getComponentDisplayName() {
            return this.componentDisplayName;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return healthReportTime
         */
        public Long getHealthReportTime() {
            return this.healthReportTime;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return hostInstanceId
         */
        public String getHostInstanceId() {
            return this.hostInstanceId;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return needRestart
         */
        public Boolean getNeedRestart() {
            return this.needRestart;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return serverStatus
         */
        public String getServerStatus() {
            return this.serverStatus;
        }

        /**
         * @return serviceDisplayName
         */
        public String getServiceDisplayName() {
            return this.serviceDisplayName;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String commissionStatus; 
            private String componentDisplayName; 
            private String componentName; 
            private Integer cpu; 
            private Long healthReportTime; 
            private String healthStatus; 
            private String hostId; 
            private String hostInstanceId; 
            private String hostName; 
            private String instanceType; 
            private Integer memory; 
            private Boolean needRestart; 
            private String privateIp; 
            private String publicIp; 
            private String role; 
            private String serialNumber; 
            private String serverStatus; 
            private String serviceDisplayName; 
            private String serviceName; 
            private String state; 
            private String status; 

            /**
             * CommissionStatus.
             */
            public Builder commissionStatus(String commissionStatus) {
                this.commissionStatus = commissionStatus;
                return this;
            }

            /**
             * ComponentDisplayName.
             */
            public Builder componentDisplayName(String componentDisplayName) {
                this.componentDisplayName = componentDisplayName;
                return this;
            }

            /**
             * ComponentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * HealthReportTime.
             */
            public Builder healthReportTime(Long healthReportTime) {
                this.healthReportTime = healthReportTime;
                return this;
            }

            /**
             * HealthStatus.
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * HostId.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * HostInstanceId.
             */
            public Builder hostInstanceId(String hostInstanceId) {
                this.hostInstanceId = hostInstanceId;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * NeedRestart.
             */
            public Builder needRestart(Boolean needRestart) {
                this.needRestart = needRestart;
                return this;
            }

            /**
             * PrivateIp.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * PublicIp.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * ServerStatus.
             */
            public Builder serverStatus(String serverStatus) {
                this.serverStatus = serverStatus;
                return this;
            }

            /**
             * ServiceDisplayName.
             */
            public Builder serviceDisplayName(String serviceDisplayName) {
                this.serviceDisplayName = serviceDisplayName;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Component build() {
                return new Component(this);
            } 

        } 

    }
    public static class ComponentList extends TeaModel {
        @NameInMap("Component")
        private java.util.List < Component> component;

        private ComponentList(Builder builder) {
            this.component = builder.component;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentList create() {
            return builder().build();
        }

        /**
         * @return component
         */
        public java.util.List < Component> getComponent() {
            return this.component;
        }

        public static final class Builder {
            private java.util.List < Component> component; 

            /**
             * Component.
             */
            public Builder component(java.util.List < Component> component) {
                this.component = component;
                return this;
            }

            public ComponentList build() {
                return new ComponentList(this);
            } 

        } 

    }
}
