// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterServiceResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterServiceResponseBody</p>
 */
public class ListClusterServiceResponseBody extends TeaModel {
    @NameInMap("ClusterServiceList")
    private ClusterServiceList clusterServiceList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListClusterServiceResponseBody(Builder builder) {
        this.clusterServiceList = builder.clusterServiceList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterServiceList
     */
    public ClusterServiceList getClusterServiceList() {
        return this.clusterServiceList;
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
        private ClusterServiceList clusterServiceList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ClusterServiceList.
         */
        public Builder clusterServiceList(ClusterServiceList clusterServiceList) {
            this.clusterServiceList = clusterServiceList;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClusterServiceResponseBody build() {
            return new ListClusterServiceResponseBody(this);
        } 

    } 

    public static class ServiceAction extends TeaModel {
        @NameInMap("ActionName")
        private String actionName;

        @NameInMap("Command")
        private String command;

        @NameInMap("ComponentName")
        private String componentName;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("ServiceName")
        private String serviceName;

        private ServiceAction(Builder builder) {
            this.actionName = builder.actionName;
            this.command = builder.command;
            this.componentName = builder.componentName;
            this.displayName = builder.displayName;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceAction create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String actionName; 
            private String command; 
            private String componentName; 
            private String displayName; 
            private String serviceName; 

            /**
             * ActionName.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
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
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public ServiceAction build() {
                return new ServiceAction(this);
            } 

        } 

    }
    public static class ServiceActionList extends TeaModel {
        @NameInMap("ServiceAction")
        private java.util.List < ServiceAction> serviceAction;

        private ServiceActionList(Builder builder) {
            this.serviceAction = builder.serviceAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceActionList create() {
            return builder().build();
        }

        /**
         * @return serviceAction
         */
        public java.util.List < ServiceAction> getServiceAction() {
            return this.serviceAction;
        }

        public static final class Builder {
            private java.util.List < ServiceAction> serviceAction; 

            /**
             * ServiceAction.
             */
            public Builder serviceAction(java.util.List < ServiceAction> serviceAction) {
                this.serviceAction = serviceAction;
                return this;
            }

            public ServiceActionList build() {
                return new ServiceActionList(this);
            } 

        } 

    }
    public static class ClusterService extends TeaModel {
        @NameInMap("AbnormalNum")
        private Integer abnormalNum;

        @NameInMap("ClientType")
        private Boolean clientType;

        @NameInMap("HealthStatus")
        private String healthStatus;

        @NameInMap("InstallStatus")
        private Boolean installStatus;

        @NameInMap("NeedRestartInfo")
        private String needRestartInfo;

        @NameInMap("NeedRestartNum")
        private Integer needRestartNum;

        @NameInMap("NotStartInfo")
        private String notStartInfo;

        @NameInMap("ServiceActionList")
        private ServiceActionList serviceActionList;

        @NameInMap("ServiceDisplayName")
        private String serviceDisplayName;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("ServiceStatus")
        private String serviceStatus;

        @NameInMap("ServiceVersion")
        private String serviceVersion;

        @NameInMap("State")
        private String state;

        @NameInMap("StoppedNum")
        private Integer stoppedNum;

        private ClusterService(Builder builder) {
            this.abnormalNum = builder.abnormalNum;
            this.clientType = builder.clientType;
            this.healthStatus = builder.healthStatus;
            this.installStatus = builder.installStatus;
            this.needRestartInfo = builder.needRestartInfo;
            this.needRestartNum = builder.needRestartNum;
            this.notStartInfo = builder.notStartInfo;
            this.serviceActionList = builder.serviceActionList;
            this.serviceDisplayName = builder.serviceDisplayName;
            this.serviceName = builder.serviceName;
            this.serviceStatus = builder.serviceStatus;
            this.serviceVersion = builder.serviceVersion;
            this.state = builder.state;
            this.stoppedNum = builder.stoppedNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterService create() {
            return builder().build();
        }

        /**
         * @return abnormalNum
         */
        public Integer getAbnormalNum() {
            return this.abnormalNum;
        }

        /**
         * @return clientType
         */
        public Boolean getClientType() {
            return this.clientType;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return installStatus
         */
        public Boolean getInstallStatus() {
            return this.installStatus;
        }

        /**
         * @return needRestartInfo
         */
        public String getNeedRestartInfo() {
            return this.needRestartInfo;
        }

        /**
         * @return needRestartNum
         */
        public Integer getNeedRestartNum() {
            return this.needRestartNum;
        }

        /**
         * @return notStartInfo
         */
        public String getNotStartInfo() {
            return this.notStartInfo;
        }

        /**
         * @return serviceActionList
         */
        public ServiceActionList getServiceActionList() {
            return this.serviceActionList;
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
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return serviceVersion
         */
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return stoppedNum
         */
        public Integer getStoppedNum() {
            return this.stoppedNum;
        }

        public static final class Builder {
            private Integer abnormalNum; 
            private Boolean clientType; 
            private String healthStatus; 
            private Boolean installStatus; 
            private String needRestartInfo; 
            private Integer needRestartNum; 
            private String notStartInfo; 
            private ServiceActionList serviceActionList; 
            private String serviceDisplayName; 
            private String serviceName; 
            private String serviceStatus; 
            private String serviceVersion; 
            private String state; 
            private Integer stoppedNum; 

            /**
             * AbnormalNum.
             */
            public Builder abnormalNum(Integer abnormalNum) {
                this.abnormalNum = abnormalNum;
                return this;
            }

            /**
             * ClientType.
             */
            public Builder clientType(Boolean clientType) {
                this.clientType = clientType;
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
             * InstallStatus.
             */
            public Builder installStatus(Boolean installStatus) {
                this.installStatus = installStatus;
                return this;
            }

            /**
             * NeedRestartInfo.
             */
            public Builder needRestartInfo(String needRestartInfo) {
                this.needRestartInfo = needRestartInfo;
                return this;
            }

            /**
             * NeedRestartNum.
             */
            public Builder needRestartNum(Integer needRestartNum) {
                this.needRestartNum = needRestartNum;
                return this;
            }

            /**
             * NotStartInfo.
             */
            public Builder notStartInfo(String notStartInfo) {
                this.notStartInfo = notStartInfo;
                return this;
            }

            /**
             * ServiceActionList.
             */
            public Builder serviceActionList(ServiceActionList serviceActionList) {
                this.serviceActionList = serviceActionList;
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
             * ServiceStatus.
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * ServiceVersion.
             */
            public Builder serviceVersion(String serviceVersion) {
                this.serviceVersion = serviceVersion;
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
             * StoppedNum.
             */
            public Builder stoppedNum(Integer stoppedNum) {
                this.stoppedNum = stoppedNum;
                return this;
            }

            public ClusterService build() {
                return new ClusterService(this);
            } 

        } 

    }
    public static class ClusterServiceList extends TeaModel {
        @NameInMap("ClusterService")
        private java.util.List < ClusterService> clusterService;

        private ClusterServiceList(Builder builder) {
            this.clusterService = builder.clusterService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterServiceList create() {
            return builder().build();
        }

        /**
         * @return clusterService
         */
        public java.util.List < ClusterService> getClusterService() {
            return this.clusterService;
        }

        public static final class Builder {
            private java.util.List < ClusterService> clusterService; 

            /**
             * ClusterService.
             */
            public Builder clusterService(java.util.List < ClusterService> clusterService) {
                this.clusterService = clusterService;
                return this;
            }

            public ClusterServiceList build() {
                return new ClusterServiceList(this);
            } 

        } 

    }
}
