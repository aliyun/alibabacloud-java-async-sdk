// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSoarTaskAndActionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSoarTaskAndActionsResponseBody</p>
 */
public class DescribeSoarTaskAndActionsResponseBody extends TeaModel {
    @NameInMap("Details")
    private Details details;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSoarTaskAndActionsResponseBody(Builder builder) {
        this.details = builder.details;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarTaskAndActionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return details
     */
    public Details getDetails() {
        return this.details;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Details details; 
        private String requestId; 

        /**
         * Details.
         */
        public Builder details(Details details) {
            this.details = details;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSoarTaskAndActionsResponseBody build() {
            return new DescribeSoarTaskAndActionsResponseBody(this);
        } 

    } 

    public static class Actions extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ActionUuid")
        private String actionUuid;

        @NameInMap("AssetName")
        private String assetName;

        @NameInMap("Component")
        private String component;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("RequestUuid")
        private String requestUuid;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("TriggerUser")
        private String triggerUser;

        private Actions(Builder builder) {
            this.action = builder.action;
            this.actionUuid = builder.actionUuid;
            this.assetName = builder.assetName;
            this.component = builder.component;
            this.endTime = builder.endTime;
            this.nodeName = builder.nodeName;
            this.requestUuid = builder.requestUuid;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskName = builder.taskName;
            this.taskStatus = builder.taskStatus;
            this.triggerUser = builder.triggerUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return actionUuid
         */
        public String getActionUuid() {
            return this.actionUuid;
        }

        /**
         * @return assetName
         */
        public String getAssetName() {
            return this.assetName;
        }

        /**
         * @return component
         */
        public String getComponent() {
            return this.component;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return requestUuid
         */
        public String getRequestUuid() {
            return this.requestUuid;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return triggerUser
         */
        public String getTriggerUser() {
            return this.triggerUser;
        }

        public static final class Builder {
            private String action; 
            private String actionUuid; 
            private String assetName; 
            private String component; 
            private Long endTime; 
            private String nodeName; 
            private String requestUuid; 
            private Long startTime; 
            private String status; 
            private String taskName; 
            private String taskStatus; 
            private String triggerUser; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ActionUuid.
             */
            public Builder actionUuid(String actionUuid) {
                this.actionUuid = actionUuid;
                return this;
            }

            /**
             * AssetName.
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * Component.
             */
            public Builder component(String component) {
                this.component = component;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * RequestUuid.
             */
            public Builder requestUuid(String requestUuid) {
                this.requestUuid = requestUuid;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
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
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TriggerUser.
             */
            public Builder triggerUser(String triggerUser) {
                this.triggerUser = triggerUser;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
    public static class Details extends TeaModel {
        @NameInMap("Actions")
        private java.util.List < Actions> actions;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("RawEventReq")
        private String rawEventReq;

        @NameInMap("RequestUuid")
        private String requestUuid;

        @NameInMap("ResultLevel")
        private String resultLevel;

        @NameInMap("ResultMessage")
        private String resultMessage;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskFlowMd5")
        private String taskFlowMd5;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskTenantId")
        private String taskTenantId;

        @NameInMap("TriggerType")
        private String triggerType;

        @NameInMap("TriggerUser")
        private String triggerUser;

        private Details(Builder builder) {
            this.actions = builder.actions;
            this.endTime = builder.endTime;
            this.errorMsg = builder.errorMsg;
            this.rawEventReq = builder.rawEventReq;
            this.requestUuid = builder.requestUuid;
            this.resultLevel = builder.resultLevel;
            this.resultMessage = builder.resultMessage;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskFlowMd5 = builder.taskFlowMd5;
            this.taskName = builder.taskName;
            this.taskTenantId = builder.taskTenantId;
            this.triggerType = builder.triggerType;
            this.triggerUser = builder.triggerUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List < Actions> getActions() {
            return this.actions;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return rawEventReq
         */
        public String getRawEventReq() {
            return this.rawEventReq;
        }

        /**
         * @return requestUuid
         */
        public String getRequestUuid() {
            return this.requestUuid;
        }

        /**
         * @return resultLevel
         */
        public String getResultLevel() {
            return this.resultLevel;
        }

        /**
         * @return resultMessage
         */
        public String getResultMessage() {
            return this.resultMessage;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskFlowMd5
         */
        public String getTaskFlowMd5() {
            return this.taskFlowMd5;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskTenantId
         */
        public String getTaskTenantId() {
            return this.taskTenantId;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return triggerUser
         */
        public String getTriggerUser() {
            return this.triggerUser;
        }

        public static final class Builder {
            private java.util.List < Actions> actions; 
            private Long endTime; 
            private String errorMsg; 
            private String rawEventReq; 
            private String requestUuid; 
            private String resultLevel; 
            private String resultMessage; 
            private Long startTime; 
            private String status; 
            private String taskFlowMd5; 
            private String taskName; 
            private String taskTenantId; 
            private String triggerType; 
            private String triggerUser; 

            /**
             * Actions.
             */
            public Builder actions(java.util.List < Actions> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * RawEventReq.
             */
            public Builder rawEventReq(String rawEventReq) {
                this.rawEventReq = rawEventReq;
                return this;
            }

            /**
             * RequestUuid.
             */
            public Builder requestUuid(String requestUuid) {
                this.requestUuid = requestUuid;
                return this;
            }

            /**
             * ResultLevel.
             */
            public Builder resultLevel(String resultLevel) {
                this.resultLevel = resultLevel;
                return this;
            }

            /**
             * ResultMessage.
             */
            public Builder resultMessage(String resultMessage) {
                this.resultMessage = resultMessage;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
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
             * TaskFlowMd5.
             */
            public Builder taskFlowMd5(String taskFlowMd5) {
                this.taskFlowMd5 = taskFlowMd5;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TaskTenantId.
             */
            public Builder taskTenantId(String taskTenantId) {
                this.taskTenantId = taskTenantId;
                return this;
            }

            /**
             * TriggerType.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * TriggerUser.
             */
            public Builder triggerUser(String triggerUser) {
                this.triggerUser = triggerUser;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
}
