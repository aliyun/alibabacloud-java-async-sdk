// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details of the instance.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned when the instance fails to be scheduled.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("BeginRunningTime")
        private Long beginRunningTime;

        @com.aliyun.core.annotation.NameInMap("BeginWaitResTime")
        private Long beginWaitResTime;

        @com.aliyun.core.annotation.NameInMap("BeginWaitTimeTime")
        private Long beginWaitTimeTime;

        @com.aliyun.core.annotation.NameInMap("Bizdate")
        private Long bizdate;

        @com.aliyun.core.annotation.NameInMap("BusinessId")
        private Long businessId;

        @com.aliyun.core.annotation.NameInMap("Connection")
        private String connection;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("CycTime")
        private Long cycTime;

        @com.aliyun.core.annotation.NameInMap("DagId")
        private Long dagId;

        @com.aliyun.core.annotation.NameInMap("DagType")
        private String dagType;

        @com.aliyun.core.annotation.NameInMap("DqcDescription")
        private String dqcDescription;

        @com.aliyun.core.annotation.NameInMap("DqcType")
        private Integer dqcType;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("ParamValues")
        private String paramValues;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RelatedFlowId")
        private Long relatedFlowId;

        @com.aliyun.core.annotation.NameInMap("RepeatInterval")
        private Long repeatInterval;

        @com.aliyun.core.annotation.NameInMap("Repeatability")
        private Boolean repeatability;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskRerunTime")
        private Integer taskRerunTime;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private Data(Builder builder) {
            this.baselineId = builder.baselineId;
            this.beginRunningTime = builder.beginRunningTime;
            this.beginWaitResTime = builder.beginWaitResTime;
            this.beginWaitTimeTime = builder.beginWaitTimeTime;
            this.bizdate = builder.bizdate;
            this.businessId = builder.businessId;
            this.connection = builder.connection;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.cycTime = builder.cycTime;
            this.dagId = builder.dagId;
            this.dagType = builder.dagType;
            this.dqcDescription = builder.dqcDescription;
            this.dqcType = builder.dqcType;
            this.finishTime = builder.finishTime;
            this.instanceId = builder.instanceId;
            this.modifyTime = builder.modifyTime;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.paramValues = builder.paramValues;
            this.priority = builder.priority;
            this.relatedFlowId = builder.relatedFlowId;
            this.repeatInterval = builder.repeatInterval;
            this.repeatability = builder.repeatability;
            this.status = builder.status;
            this.taskRerunTime = builder.taskRerunTime;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return beginRunningTime
         */
        public Long getBeginRunningTime() {
            return this.beginRunningTime;
        }

        /**
         * @return beginWaitResTime
         */
        public Long getBeginWaitResTime() {
            return this.beginWaitResTime;
        }

        /**
         * @return beginWaitTimeTime
         */
        public Long getBeginWaitTimeTime() {
            return this.beginWaitTimeTime;
        }

        /**
         * @return bizdate
         */
        public Long getBizdate() {
            return this.bizdate;
        }

        /**
         * @return businessId
         */
        public Long getBusinessId() {
            return this.businessId;
        }

        /**
         * @return connection
         */
        public String getConnection() {
            return this.connection;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return cycTime
         */
        public Long getCycTime() {
            return this.cycTime;
        }

        /**
         * @return dagId
         */
        public Long getDagId() {
            return this.dagId;
        }

        /**
         * @return dagType
         */
        public String getDagType() {
            return this.dagType;
        }

        /**
         * @return dqcDescription
         */
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        /**
         * @return dqcType
         */
        public Integer getDqcType() {
            return this.dqcType;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return paramValues
         */
        public String getParamValues() {
            return this.paramValues;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return relatedFlowId
         */
        public Long getRelatedFlowId() {
            return this.relatedFlowId;
        }

        /**
         * @return repeatInterval
         */
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        /**
         * @return repeatability
         */
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskRerunTime
         */
        public Integer getTaskRerunTime() {
            return this.taskRerunTime;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private Long baselineId; 
            private Long beginRunningTime; 
            private Long beginWaitResTime; 
            private Long beginWaitTimeTime; 
            private Long bizdate; 
            private Long businessId; 
            private String connection; 
            private Long createTime; 
            private String createUser; 
            private Long cycTime; 
            private Long dagId; 
            private String dagType; 
            private String dqcDescription; 
            private Integer dqcType; 
            private Long finishTime; 
            private Long instanceId; 
            private Long modifyTime; 
            private Long nodeId; 
            private String nodeName; 
            private String paramValues; 
            private Integer priority; 
            private Long relatedFlowId; 
            private Long repeatInterval; 
            private Boolean repeatability; 
            private String status; 
            private Integer taskRerunTime; 
            private String taskType; 

            /**
             * The baseline ID.
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * The time when the instance started to run.
             */
            public Builder beginRunningTime(Long beginRunningTime) {
                this.beginRunningTime = beginRunningTime;
                return this;
            }

            /**
             * The time when the instance started to wait for resources.
             */
            public Builder beginWaitResTime(Long beginWaitResTime) {
                this.beginWaitResTime = beginWaitResTime;
                return this;
            }

            /**
             * The time when the instance started to wait to be scheduled.
             */
            public Builder beginWaitTimeTime(Long beginWaitTimeTime) {
                this.beginWaitTimeTime = beginWaitTimeTime;
                return this;
            }

            /**
             * The data timestamp of the instance. In most cases, the value is one day before the time when the instance was run.
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * The workflow ID.
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * The connection string.
             */
            public Builder connection(String connection) {
                this.connection = connection;
                return this;
            }

            /**
             * The time when the instance was generated.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The creator of the instance.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * The scheduling time of the instance.
             */
            public Builder cycTime(Long cycTime) {
                this.cycTime = cycTime;
                return this;
            }

            /**
             * The workflow ID.
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * The type of the workflow. Valid values:
             * <p>
             * 
             * *   DAILY: The workflow is used to run auto triggered nodes.
             * *   MANUAL: The workflow is used to run manually triggered nodes.
             * *   SMOKE_TEST: The workflow is used to perform smoke testing.
             * *   SUPPLY_DATA: The workflow is used to backfill data.
             */
            public Builder dagType(String dagType) {
                this.dagType = dagType;
                return this;
            }

            /**
             * The table and partition filter expression in Data Quality that are associated with the node.
             */
            public Builder dqcDescription(String dqcDescription) {
                this.dqcDescription = dqcDescription;
                return this;
            }

            /**
             * Indicates whether the instance is associated with a monitoring rule in Data Quality. Valid values:
             * <p>
             * 
             * *   0: The instance is associated with a monitoring rule in Data Quality.
             * *   1: The instance is not associated with a monitoring rule in Data Quality.
             */
            public Builder dqcType(Integer dqcType) {
                this.dqcType = dqcType;
                return this;
            }

            /**
             * The time when the running of the instance was complete.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The time when the instance was last modified.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The parameters related to the node.
             */
            public Builder paramValues(String paramValues) {
                this.paramValues = paramValues;
                return this;
            }

            /**
             * The priority of the instance. Valid values: 1, 3, 5, 7, and 8. A greater value indicates a higher priority. Default value: 1.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The ID of the workflow to which the node belongs.
             */
            public Builder relatedFlowId(Long relatedFlowId) {
                this.relatedFlowId = relatedFlowId;
                return this;
            }

            /**
             * The interval at which the node is rerun after the node fails to run. Unit: milliseconds.
             */
            public Builder repeatInterval(Long repeatInterval) {
                this.repeatInterval = repeatInterval;
                return this;
            }

            /**
             * Indicates whether the node that generates the instance can be rerun.
             */
            public Builder repeatability(Boolean repeatability) {
                this.repeatability = repeatability;
                return this;
            }

            /**
             * The status of the node that generates the instance. Valid values:
             * <p>
             * 
             * *   NOT_RUN: The node is not run.
             * *   WAIT_TIME: The node is waiting for its scheduling time to arrive.
             * *   WAIT_RESOURCE: The node is waiting for resources.
             * *   RUNNING: The node is running.
             * *   CHECKING: Data quality is being checked for the node.
             * *   CHECKING_CONDITION: Branch conditions are being checked for the node.
             * *   FAILURE: The node fails to run.
             * *   SUCCESS: The node is successfully run.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The number of times the node can be rerun. The value of this parameter can be empty or an integer that is greater than or equal to 0.
             * <p>
             * 
             * *   If the value of this parameter is empty, the number of times that the node can be rerun is not specified.
             * *   If the value of this parameter is 0, the node cannot be rerun.
             * *   If the value of this parameter is a positive integer such as n, the node can still be rerun n times. For example, if the value of this parameter is 1, the node can still be rerun once. If the value of this parameter is 2, the node can still be rerun twice.
             */
            public Builder taskRerunTime(Integer taskRerunTime) {
                this.taskRerunTime = taskRerunTime;
                return this;
            }

            /**
             * The scheduling type of the node that generates the instance. Valid values:
             * <p>
             * 
             * *   NORMAL(0): The node is an auto triggered node. The scheduling system regularly runs the node.
             * *   MANUAL(1): The node is a manually triggered node. The scheduling system does not regularly run the node.
             * *   PAUSE(2): The node is a frozen node. The scheduling system regularly runs the node but sets the status of the node to failed when the scheduling system starts to run the node.
             * *   SKIP(3): The node is a dry-run node. The scheduling system regularly runs the node but sets the status of the node to successful when the scheduling system starts to run the node.
             * *   SKIP_UNCHOOSE(4): The node is an unselected node in a temporary workflow. This type of node exists only in temporary workflows. The scheduling system sets the status of the node to successful when the scheduling system starts to run the node.
             * *   SKIP_CYCLE(5): The node is a node that is scheduled by the week or month and is waiting for the scheduling time to arrive. The scheduling system regularly runs the node but sets the status of the node to successful when the scheduling system starts to run the node.
             * *   CONDITION_UNCHOOSE(6): The node is not selected by its ancestor branch node and is run as a dry-run node.
             * *   REALTIME_DEPRECATED(7): The node has instances that are generated in real time but deprecated. The scheduling system sets the status of the node to successful.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
