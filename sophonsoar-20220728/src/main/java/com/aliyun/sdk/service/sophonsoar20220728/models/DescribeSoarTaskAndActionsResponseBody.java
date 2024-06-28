// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSoarTaskAndActionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSoarTaskAndActionsResponseBody</p>
 */
public class DescribeSoarTaskAndActionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Details")
    private Details details;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The execution details of each task.
         */
        public Builder details(Details details) {
            this.details = details;
            return this;
        }

        /**
         * The request ID.
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
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ActionUuid")
        private String actionUuid;

        @com.aliyun.core.annotation.NameInMap("AssetName")
        private String assetName;

        @com.aliyun.core.annotation.NameInMap("Component")
        private String component;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("RequestUuid")
        private String requestUuid;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TriggerUser")
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
             * The action name of the component.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The UUID of the component execution record.
             */
            public Builder actionUuid(String actionUuid) {
                this.actionUuid = actionUuid;
                return this;
            }

            /**
             * The name of the asset that is used by the component.
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * The component name.
             */
            public Builder component(String component) {
                this.component = component;
                return this;
            }

            /**
             * The end of the time range during which the component is run. The value is a 13-digit timestamp.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The custom name of the node in the component.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The request ID of the task. The value is unique.
             */
            public Builder requestUuid(String requestUuid) {
                this.requestUuid = requestUuid;
                return this;
            }

            /**
             * The beginning of the time range during which the component is run. The value is a 13-digit timestamp.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The running result of the component. Valid values:
             * <p>
             * 
             * *   **success**
             * *   **fail**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the task. The value is the same as the playbook UUID.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The status of the triggered component action.
             * <p>
             * 
             * >  This parameter is disabled and left empty.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to execute the task.
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
        @com.aliyun.core.annotation.NameInMap("Actions")
        private java.util.List < Actions> actions;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("RawEventReq")
        private String rawEventReq;

        @com.aliyun.core.annotation.NameInMap("RequestUuid")
        private String requestUuid;

        @com.aliyun.core.annotation.NameInMap("ResultLevel")
        private String resultLevel;

        @com.aliyun.core.annotation.NameInMap("ResultMessage")
        private String resultMessage;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskFlowMd5")
        private String taskFlowMd5;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskTenantId")
        private String taskTenantId;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("TriggerUser")
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
             * The list of component actions during the running of the playbook.
             */
            public Builder actions(java.util.List < Actions> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * The end of the time range during which the playbook is run. The value is a 13-digit timestamp.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The error message of the task. If the task is successful, this field is empty.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The request parameters of the task.
             */
            public Builder rawEventReq(String rawEventReq) {
                this.rawEventReq = rawEventReq;
                return this;
            }

            /**
             * The request ID of the task. The value is unique.
             */
            public Builder requestUuid(String requestUuid) {
                this.requestUuid = requestUuid;
                return this;
            }

            /**
             * The flag of the task. For debugging tasks, the value is **DEBUG**. For other tasks, the parameter is left empty.
             */
            public Builder resultLevel(String resultLevel) {
                this.resultLevel = resultLevel;
                return this;
            }

            /**
             * The returned information about the playbook. You can define the value in the playbook.
             */
            public Builder resultMessage(String resultMessage) {
                this.resultMessage = resultMessage;
                return this;
            }

            /**
             * The beginning of the time range during which the playbook is run. The value is a 13-digit timestamp.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The task status. Valid values:
             * <p>
             * 
             * *   **success**
             * *   **fail**
             * *   **running**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The MD5 value of the playbook.
             */
            public Builder taskFlowMd5(String taskFlowMd5) {
                this.taskFlowMd5 = taskFlowMd5;
                return this;
            }

            /**
             * The name of the task. The value is the same as the playbook UUID.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the task belongs.
             */
            public Builder taskTenantId(String taskTenantId) {
                this.taskTenantId = taskTenantId;
                return this;
            }

            /**
             * The task type. Valid values:
             * <p>
             * 
             * *   **debug**: a debugging task
             * *   **manual**: a manual task
             * *   **siem**: an event-triggered task
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that triggers the task.
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
