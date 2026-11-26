// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ExecuteScheduledTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteScheduledTaskResponseBody</p>
 */
public class ExecuteScheduledTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("executionId")
    private String executionId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("taskExecution")
    private TaskExecution taskExecution;

    private ExecuteScheduledTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.executionId = builder.executionId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.taskExecution = builder.taskExecution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteScheduledTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskExecution
     */
    public TaskExecution getTaskExecution() {
        return this.taskExecution;
    }

    public static final class Builder {
        private String code; 
        private String executionId; 
        private String message; 
        private String requestId; 
        private TaskExecution taskExecution; 

        private Builder() {
        } 

        private Builder(ExecuteScheduledTaskResponseBody model) {
            this.code = model.code;
            this.executionId = model.executionId;
            this.message = model.message;
            this.requestId = model.requestId;
            this.taskExecution = model.taskExecution;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>执行记录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleExecutionId</p>
         */
        public Builder executionId(String executionId) {
            this.executionId = executionId;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * taskExecution.
         */
        public Builder taskExecution(TaskExecution taskExecution) {
            this.taskExecution = taskExecution;
            return this;
        }

        public ExecuteScheduledTaskResponseBody build() {
            return new ExecuteScheduledTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteScheduledTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteScheduledTaskResponseBody</p>
     */
    public static class TaskExecution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoPreference")
        private String autoPreference;

        @com.aliyun.core.annotation.NameInMap("billingId")
        private String billingId;

        @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
        private String collaborationGroupId;

        @com.aliyun.core.annotation.NameInMap("enableWebSearch")
        private Boolean enableWebSearch;

        @com.aliyun.core.annotation.NameInMap("executionId")
        private String executionId;

        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("operatingObjectName")
        private java.util.List<String> operatingObjectName;

        @com.aliyun.core.annotation.NameInMap("skillCodes")
        private java.util.List<String> skillCodes;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("taskUnderstand")
        private String taskUnderstand;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private TaskExecution(Builder builder) {
            this.autoPreference = builder.autoPreference;
            this.billingId = builder.billingId;
            this.collaborationGroupId = builder.collaborationGroupId;
            this.enableWebSearch = builder.enableWebSearch;
            this.executionId = builder.executionId;
            this.model = builder.model;
            this.operatingObjectName = builder.operatingObjectName;
            this.skillCodes = builder.skillCodes;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskUnderstand = builder.taskUnderstand;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskExecution create() {
            return builder().build();
        }

        /**
         * @return autoPreference
         */
        public String getAutoPreference() {
            return this.autoPreference;
        }

        /**
         * @return billingId
         */
        public String getBillingId() {
            return this.billingId;
        }

        /**
         * @return collaborationGroupId
         */
        public String getCollaborationGroupId() {
            return this.collaborationGroupId;
        }

        /**
         * @return enableWebSearch
         */
        public Boolean getEnableWebSearch() {
            return this.enableWebSearch;
        }

        /**
         * @return executionId
         */
        public String getExecutionId() {
            return this.executionId;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return operatingObjectName
         */
        public java.util.List<String> getOperatingObjectName() {
            return this.operatingObjectName;
        }

        /**
         * @return skillCodes
         */
        public java.util.List<String> getSkillCodes() {
            return this.skillCodes;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskUnderstand
         */
        public String getTaskUnderstand() {
            return this.taskUnderstand;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String autoPreference; 
            private String billingId; 
            private String collaborationGroupId; 
            private Boolean enableWebSearch; 
            private String executionId; 
            private String model; 
            private java.util.List<String> operatingObjectName; 
            private java.util.List<String> skillCodes; 
            private String taskId; 
            private String taskName; 
            private String taskUnderstand; 
            private String tenantId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(TaskExecution model) {
                this.autoPreference = model.autoPreference;
                this.billingId = model.billingId;
                this.collaborationGroupId = model.collaborationGroupId;
                this.enableWebSearch = model.enableWebSearch;
                this.executionId = model.executionId;
                this.model = model.model;
                this.operatingObjectName = model.operatingObjectName;
                this.skillCodes = model.skillCodes;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskUnderstand = model.taskUnderstand;
                this.tenantId = model.tenantId;
                this.userId = model.userId;
            } 

            /**
             * <p>任务 AUTO 偏好：none=默认、performance=效果优先、credit=成本优先</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder autoPreference(String autoPreference) {
                this.autoPreference = autoPreference;
                return this;
            }

            /**
             * billingId.
             */
            public Builder billingId(String billingId) {
                this.billingId = billingId;
                return this;
            }

            /**
             * collaborationGroupId.
             */
            public Builder collaborationGroupId(String collaborationGroupId) {
                this.collaborationGroupId = collaborationGroupId;
                return this;
            }

            /**
             * enableWebSearch.
             */
            public Builder enableWebSearch(Boolean enableWebSearch) {
                this.enableWebSearch = enableWebSearch;
                return this;
            }

            /**
             * <p>执行记录 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleExecutionId</p>
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * <p>执行模型档位</p>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * operatingObjectName.
             */
            public Builder operatingObjectName(java.util.List<String> operatingObjectName) {
                this.operatingObjectName = operatingObjectName;
                return this;
            }

            /**
             * skillCodes.
             */
            public Builder skillCodes(java.util.List<String> skillCodes) {
                this.skillCodes = skillCodes;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * taskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * taskUnderstand.
             */
            public Builder taskUnderstand(String taskUnderstand) {
                this.taskUnderstand = taskUnderstand;
                return this;
            }

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TaskExecution build() {
                return new TaskExecution(this);
            } 

        } 

    }
}
