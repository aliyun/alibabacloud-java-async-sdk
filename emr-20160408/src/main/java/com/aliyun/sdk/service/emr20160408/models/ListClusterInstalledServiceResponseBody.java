// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterInstalledServiceResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterInstalledServiceResponseBody</p>
 */
public class ListClusterInstalledServiceResponseBody extends TeaModel {
    @NameInMap("ClusterInstalledServiceList")
    private ClusterInstalledServiceList clusterInstalledServiceList;

    @NameInMap("RequestId")
    private String requestId;

    private ListClusterInstalledServiceResponseBody(Builder builder) {
        this.clusterInstalledServiceList = builder.clusterInstalledServiceList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterInstalledServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterInstalledServiceList
     */
    public ClusterInstalledServiceList getClusterInstalledServiceList() {
        return this.clusterInstalledServiceList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterInstalledServiceList clusterInstalledServiceList; 
        private String requestId; 

        /**
         * ClusterInstalledServiceList.
         */
        public Builder clusterInstalledServiceList(ClusterInstalledServiceList clusterInstalledServiceList) {
            this.clusterInstalledServiceList = clusterInstalledServiceList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterInstalledServiceResponseBody build() {
            return new ListClusterInstalledServiceResponseBody(this);
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
    public static class ClusterInstalledService extends TeaModel {
        @NameInMap("ServiceActionList")
        private ServiceActionList serviceActionList;

        @NameInMap("ServiceDisplayName")
        private String serviceDisplayName;

        @NameInMap("ServiceEcmVersion")
        private String serviceEcmVersion;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("ServiceVersion")
        private String serviceVersion;

        @NameInMap("State")
        private String state;

        @NameInMap("abnormalNum")
        private Integer abnormalNum;

        @NameInMap("comment")
        private String comment;

        @NameInMap("needRestartNum")
        private Integer needRestartNum;

        @NameInMap("notStartedNum")
        private Integer notStartedNum;

        @NameInMap("onlyClient")
        private Boolean onlyClient;

        @NameInMap("serviceStatus")
        private String serviceStatus;

        private ClusterInstalledService(Builder builder) {
            this.serviceActionList = builder.serviceActionList;
            this.serviceDisplayName = builder.serviceDisplayName;
            this.serviceEcmVersion = builder.serviceEcmVersion;
            this.serviceName = builder.serviceName;
            this.serviceVersion = builder.serviceVersion;
            this.state = builder.state;
            this.abnormalNum = builder.abnormalNum;
            this.comment = builder.comment;
            this.needRestartNum = builder.needRestartNum;
            this.notStartedNum = builder.notStartedNum;
            this.onlyClient = builder.onlyClient;
            this.serviceStatus = builder.serviceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInstalledService create() {
            return builder().build();
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
         * @return serviceEcmVersion
         */
        public String getServiceEcmVersion() {
            return this.serviceEcmVersion;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
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
         * @return abnormalNum
         */
        public Integer getAbnormalNum() {
            return this.abnormalNum;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return needRestartNum
         */
        public Integer getNeedRestartNum() {
            return this.needRestartNum;
        }

        /**
         * @return notStartedNum
         */
        public Integer getNotStartedNum() {
            return this.notStartedNum;
        }

        /**
         * @return onlyClient
         */
        public Boolean getOnlyClient() {
            return this.onlyClient;
        }

        /**
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public static final class Builder {
            private ServiceActionList serviceActionList; 
            private String serviceDisplayName; 
            private String serviceEcmVersion; 
            private String serviceName; 
            private String serviceVersion; 
            private String state; 
            private Integer abnormalNum; 
            private String comment; 
            private Integer needRestartNum; 
            private Integer notStartedNum; 
            private Boolean onlyClient; 
            private String serviceStatus; 

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
             * ServiceEcmVersion.
             */
            public Builder serviceEcmVersion(String serviceEcmVersion) {
                this.serviceEcmVersion = serviceEcmVersion;
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
             * abnormalNum.
             */
            public Builder abnormalNum(Integer abnormalNum) {
                this.abnormalNum = abnormalNum;
                return this;
            }

            /**
             * comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * needRestartNum.
             */
            public Builder needRestartNum(Integer needRestartNum) {
                this.needRestartNum = needRestartNum;
                return this;
            }

            /**
             * notStartedNum.
             */
            public Builder notStartedNum(Integer notStartedNum) {
                this.notStartedNum = notStartedNum;
                return this;
            }

            /**
             * onlyClient.
             */
            public Builder onlyClient(Boolean onlyClient) {
                this.onlyClient = onlyClient;
                return this;
            }

            /**
             * serviceStatus.
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            public ClusterInstalledService build() {
                return new ClusterInstalledService(this);
            } 

        } 

    }
    public static class ClusterInstalledServiceList extends TeaModel {
        @NameInMap("ClusterInstalledService")
        private java.util.List < ClusterInstalledService> clusterInstalledService;

        private ClusterInstalledServiceList(Builder builder) {
            this.clusterInstalledService = builder.clusterInstalledService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInstalledServiceList create() {
            return builder().build();
        }

        /**
         * @return clusterInstalledService
         */
        public java.util.List < ClusterInstalledService> getClusterInstalledService() {
            return this.clusterInstalledService;
        }

        public static final class Builder {
            private java.util.List < ClusterInstalledService> clusterInstalledService; 

            /**
             * ClusterInstalledService.
             */
            public Builder clusterInstalledService(java.util.List < ClusterInstalledService> clusterInstalledService) {
                this.clusterInstalledService = clusterInstalledService;
                return this;
            }

            public ClusterInstalledServiceList build() {
                return new ClusterInstalledServiceList(this);
            } 

        } 

    }
}
