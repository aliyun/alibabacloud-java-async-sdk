// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskFlowResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskFlowResponseBody</p>
 */
public class ListTaskFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskFlowList")
    private TaskFlowList taskFlowList;

    private ListTaskFlowResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskFlowList = builder.taskFlowList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskFlowList
     */
    public TaskFlowList getTaskFlowList() {
        return this.taskFlowList;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private TaskFlowList taskFlowList; 

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The information about the task flows returned.
         */
        public Builder taskFlowList(TaskFlowList taskFlowList) {
            this.taskFlowList = taskFlowList;
            return this;
        }

        public ListTaskFlowResponseBody build() {
            return new ListTaskFlowResponseBody(this);
        } 

    } 

    public static class TaskFlow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorNickName")
        private String creatorNickName;

        @com.aliyun.core.annotation.NameInMap("DagOwnerNickName")
        private String dagOwnerNickName;

        @com.aliyun.core.annotation.NameInMap("DeployId")
        private Long deployId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LatestInstanceStatus")
        private Integer latestInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("LatestInstanceTime")
        private String latestInstanceTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private TaskFlow(Builder builder) {
            this.creatorId = builder.creatorId;
            this.creatorNickName = builder.creatorNickName;
            this.dagOwnerNickName = builder.dagOwnerNickName;
            this.deployId = builder.deployId;
            this.id = builder.id;
            this.latestInstanceStatus = builder.latestInstanceStatus;
            this.latestInstanceTime = builder.latestInstanceTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskFlow create() {
            return builder().build();
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorNickName
         */
        public String getCreatorNickName() {
            return this.creatorNickName;
        }

        /**
         * @return dagOwnerNickName
         */
        public String getDagOwnerNickName() {
            return this.dagOwnerNickName;
        }

        /**
         * @return deployId
         */
        public Long getDeployId() {
            return this.deployId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return latestInstanceStatus
         */
        public Integer getLatestInstanceStatus() {
            return this.latestInstanceStatus;
        }

        /**
         * @return latestInstanceTime
         */
        public String getLatestInstanceTime() {
            return this.latestInstanceTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creatorId; 
            private String creatorNickName; 
            private String dagOwnerNickName; 
            private Long deployId; 
            private Long id; 
            private Integer latestInstanceStatus; 
            private String latestInstanceTime; 
            private Integer status; 

            /**
             * The ID of the user who creates the task flow.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The name of the user who creates the task flow.
             */
            public Builder creatorNickName(String creatorNickName) {
                this.creatorNickName = creatorNickName;
                return this;
            }

            /**
             * The name of the task flow owner.
             */
            public Builder dagOwnerNickName(String dagOwnerNickName) {
                this.dagOwnerNickName = dagOwnerNickName;
                return this;
            }

            /**
             * The ID of the latest deployment record.
             */
            public Builder deployId(Long deployId) {
                this.deployId = deployId;
                return this;
            }

            /**
             * The ID of the task flow.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The status of the latest execution. Valid values:
             * <p>
             * 
             * *   **0**: invalid.
             * *   **1**: scheduling disabled.
             * *   **2**: waiting to be scheduled.
             */
            public Builder latestInstanceStatus(Integer latestInstanceStatus) {
                this.latestInstanceStatus = latestInstanceStatus;
                return this;
            }

            /**
             * The time when the latest execution record was generated.
             */
            public Builder latestInstanceTime(String latestInstanceTime) {
                this.latestInstanceTime = latestInstanceTime;
                return this;
            }

            /**
             * The status of the task flow. Valid values:
             * <p>
             * 
             * *   **0**: The task flow is invalid.
             * *   **1**: Scheduling is disabled for the task flow.
             * *   **2**: The task flow is waiting to be scheduled.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public TaskFlow build() {
                return new TaskFlow(this);
            } 

        } 

    }
    public static class TaskFlowList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskFlow")
        private java.util.List < TaskFlow> taskFlow;

        private TaskFlowList(Builder builder) {
            this.taskFlow = builder.taskFlow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskFlowList create() {
            return builder().build();
        }

        /**
         * @return taskFlow
         */
        public java.util.List < TaskFlow> getTaskFlow() {
            return this.taskFlow;
        }

        public static final class Builder {
            private java.util.List < TaskFlow> taskFlow; 

            /**
             * TaskFlow.
             */
            public Builder taskFlow(java.util.List < TaskFlow> taskFlow) {
                this.taskFlow = taskFlow;
                return this;
            }

            public TaskFlowList build() {
                return new TaskFlowList(this);
            } 

        } 

    }
}
