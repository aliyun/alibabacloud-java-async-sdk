// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterServiceComponentResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterServiceComponentResponseBody</p>
 */
public class ListClusterServiceComponentResponseBody extends TeaModel {
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

    private ListClusterServiceComponentResponseBody(Builder builder) {
        this.componentList = builder.componentList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterServiceComponentResponseBody create() {
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

        public ListClusterServiceComponentResponseBody build() {
            return new ListClusterServiceComponentResponseBody(this);
        } 

    } 

    public static class Component extends TeaModel {
        @NameInMap("CommissionStatus")
        private String commissionStatus;

        @NameInMap("ComponentDisplayName")
        private String componentDisplayName;

        @NameInMap("ComponentName")
        private String componentName;

        @NameInMap("DesiredCount")
        private Integer desiredCount;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("NeedRestart")
        private Boolean needRestart;

        @NameInMap("PodName")
        private String podName;

        @NameInMap("PrivateIp")
        private String privateIp;

        @NameInMap("PublicIp")
        private String publicIp;

        @NameInMap("Role")
        private String role;

        @NameInMap("ServerStatus")
        private String serverStatus;

        @NameInMap("ServiceDisplayName")
        private String serviceDisplayName;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("Status")
        private String status;

        @NameInMap("WorkloadName")
        private String workloadName;

        @NameInMap("WorkloadType")
        private String workloadType;

        private Component(Builder builder) {
            this.commissionStatus = builder.commissionStatus;
            this.componentDisplayName = builder.componentDisplayName;
            this.componentName = builder.componentName;
            this.desiredCount = builder.desiredCount;
            this.namespace = builder.namespace;
            this.needRestart = builder.needRestart;
            this.podName = builder.podName;
            this.privateIp = builder.privateIp;
            this.publicIp = builder.publicIp;
            this.role = builder.role;
            this.serverStatus = builder.serverStatus;
            this.serviceDisplayName = builder.serviceDisplayName;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
            this.workloadName = builder.workloadName;
            this.workloadType = builder.workloadType;
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
         * @return desiredCount
         */
        public Integer getDesiredCount() {
            return this.desiredCount;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return needRestart
         */
        public Boolean getNeedRestart() {
            return this.needRestart;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return workloadName
         */
        public String getWorkloadName() {
            return this.workloadName;
        }

        /**
         * @return workloadType
         */
        public String getWorkloadType() {
            return this.workloadType;
        }

        public static final class Builder {
            private String commissionStatus; 
            private String componentDisplayName; 
            private String componentName; 
            private Integer desiredCount; 
            private String namespace; 
            private Boolean needRestart; 
            private String podName; 
            private String privateIp; 
            private String publicIp; 
            private String role; 
            private String serverStatus; 
            private String serviceDisplayName; 
            private String serviceName; 
            private String status; 
            private String workloadName; 
            private String workloadType; 

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
             * DesiredCount.
             */
            public Builder desiredCount(Integer desiredCount) {
                this.desiredCount = desiredCount;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
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
             * PodName.
             */
            public Builder podName(String podName) {
                this.podName = podName;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * WorkloadName.
             */
            public Builder workloadName(String workloadName) {
                this.workloadName = workloadName;
                return this;
            }

            /**
             * WorkloadType.
             */
            public Builder workloadType(String workloadType) {
                this.workloadType = workloadType;
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
