// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSoarTaskAndActionsResponseBody model) {
            this.details = model.details;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The execution details of each task.</p>
         */
        public Builder details(Details details) {
            this.details = details;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18017A93-3D5D-503A-8308-914543F1CBA3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSoarTaskAndActionsResponseBody build() {
            return new DescribeSoarTaskAndActionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSoarTaskAndActionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSoarTaskAndActionsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Actions model) {
                this.action = model.action;
                this.actionUuid = model.actionUuid;
                this.assetName = model.assetName;
                this.component = model.component;
                this.endTime = model.endTime;
                this.nodeName = model.nodeName;
                this.requestUuid = model.requestUuid;
                this.startTime = model.startTime;
                this.status = model.status;
                this.taskName = model.taskName;
                this.taskStatus = model.taskStatus;
                this.triggerUser = model.triggerUser;
            } 

            /**
             * <p>The action name of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>formatdata</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The UUID of the component execution record.</p>
             * 
             * <strong>example:</strong>
             * <p>091be399-a937-4276-af78-xxxxxxxx</p>
             */
            public Builder actionUuid(String actionUuid) {
                this.actionUuid = actionUuid;
                return this;
            }

            /**
             * <p>The name of the asset that is used by the component.</p>
             * 
             * <strong>example:</strong>
             * <p>SLS Asset</p>
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * <p>The component name.</p>
             * 
             * <strong>example:</strong>
             * <p>DataFormat</p>
             */
            public Builder component(String component) {
                this.component = component;
                return this;
            }

            /**
             * <p>The end of the time range during which the component is run. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1699868848766</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The custom name of the node in the component.</p>
             * 
             * <strong>example:</strong>
             * <p>DataFormat_1</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The request ID of the task. The value is unique.</p>
             * 
             * <strong>example:</strong>
             * <p>8dac16c6-7411-4116-8d70-xxxxxxx</p>
             */
            public Builder requestUuid(String requestUuid) {
                this.requestUuid = requestUuid;
                return this;
            }

            /**
             * <p>The beginning of the time range during which the component is run. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1699868848731</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The running result of the component. Valid values:</p>
             * <ul>
             * <li><strong>success</strong></li>
             * <li><strong>fail</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the task. The value is the same as the playbook UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>ed127287-6699-4e4d-b986-xxxxxxx</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The status of the triggered component action.</p>
             * <blockquote>
             * <p> This parameter is disabled and left empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>NULL</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to execute the task.</p>
             * 
             * <strong>example:</strong>
             * <p>127xxxx4392</p>
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
    /**
     * 
     * {@link DescribeSoarTaskAndActionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSoarTaskAndActionsResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Actions")
        private java.util.List<Actions> actions;

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
        public java.util.List<Actions> getActions() {
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
            private java.util.List<Actions> actions; 
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

            private Builder() {
            } 

            private Builder(Details model) {
                this.actions = model.actions;
                this.endTime = model.endTime;
                this.errorMsg = model.errorMsg;
                this.rawEventReq = model.rawEventReq;
                this.requestUuid = model.requestUuid;
                this.resultLevel = model.resultLevel;
                this.resultMessage = model.resultMessage;
                this.startTime = model.startTime;
                this.status = model.status;
                this.taskFlowMd5 = model.taskFlowMd5;
                this.taskName = model.taskName;
                this.taskTenantId = model.taskTenantId;
                this.triggerType = model.triggerType;
                this.triggerUser = model.triggerUser;
            } 

            /**
             * <p>The list of component actions during the running of the playbook.</p>
             */
            public Builder actions(java.util.List<Actions> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>The end of the time range during which the playbook is run. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1699868848767</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The error message of the task. If the task is successful, this field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>stime not match</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The request parameters of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;input1&quot;: &quot;xx.xx.xx.xx&quot;,
             *     &quot;input2&quot;: &quot;7d&quot;
             * }</p>
             */
            public Builder rawEventReq(String rawEventReq) {
                this.rawEventReq = rawEventReq;
                return this;
            }

            /**
             * <p>The request ID of the task. The value is unique.</p>
             * 
             * <strong>example:</strong>
             * <p>17f75844-75cc-4174-86da-cec07a690142</p>
             */
            public Builder requestUuid(String requestUuid) {
                this.requestUuid = requestUuid;
                return this;
            }

            /**
             * <p>The flag of the task. For debugging tasks, the value is <strong>DEBUG</strong>. For other tasks, the parameter is left empty.</p>
             * 
             * <strong>example:</strong>
             * <p>DEBUG</p>
             */
            public Builder resultLevel(String resultLevel) {
                this.resultLevel = resultLevel;
                return this;
            }

            /**
             * <p>The returned information about the playbook. You can define the value in the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>deubug playbook finished</p>
             */
            public Builder resultMessage(String resultMessage) {
                this.resultMessage = resultMessage;
                return this;
            }

            /**
             * <p>The beginning of the time range during which the playbook is run. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1699868848645</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>success</strong></li>
             * <li><strong>fail</strong></li>
             * <li><strong>running</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The MD5 value of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>ed127287-6699-4e4d-b986-9f770879xxx</p>
             */
            public Builder taskFlowMd5(String taskFlowMd5) {
                this.taskFlowMd5 = taskFlowMd5;
                return this;
            }

            /**
             * <p>The name of the task. The value is the same as the playbook UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>92af3c79-1754-4646-9366-9ddbd1e45536</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>127xxxx4392</p>
             */
            public Builder taskTenantId(String taskTenantId) {
                this.taskTenantId = taskTenantId;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li><strong>debug</strong>: a debugging task</li>
             * <li><strong>manual</strong>: a manual task</li>
             * <li><strong>siem</strong>: an event-triggered task</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>siem</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that triggers the task.</p>
             * 
             * <strong>example:</strong>
             * <p>127xxxx4392</p>
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
