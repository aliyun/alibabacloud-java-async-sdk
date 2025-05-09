// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetInstanceResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the instance.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when the instance fails to be scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E6F0DBDD-5AD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ParamValues")
        private String paramValues;

        @com.aliyun.core.annotation.NameInMap("PeriodNumber")
        private Integer periodNumber;

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
            this.owner = builder.owner;
            this.paramValues = builder.paramValues;
            this.periodNumber = builder.periodNumber;
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
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return paramValues
         */
        public String getParamValues() {
            return this.paramValues;
        }

        /**
         * @return periodNumber
         */
        public Integer getPeriodNumber() {
            return this.periodNumber;
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
            private String owner; 
            private String paramValues; 
            private Integer periodNumber; 
            private Integer priority; 
            private Long relatedFlowId; 
            private Long repeatInterval; 
            private Boolean repeatability; 
            private String status; 
            private Integer taskRerunTime; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baselineId = model.baselineId;
                this.beginRunningTime = model.beginRunningTime;
                this.beginWaitResTime = model.beginWaitResTime;
                this.beginWaitTimeTime = model.beginWaitTimeTime;
                this.bizdate = model.bizdate;
                this.businessId = model.businessId;
                this.connection = model.connection;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.cycTime = model.cycTime;
                this.dagId = model.dagId;
                this.dagType = model.dagType;
                this.dqcDescription = model.dqcDescription;
                this.dqcType = model.dqcType;
                this.finishTime = model.finishTime;
                this.instanceId = model.instanceId;
                this.modifyTime = model.modifyTime;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.owner = model.owner;
                this.paramValues = model.paramValues;
                this.periodNumber = model.periodNumber;
                this.priority = model.priority;
                this.relatedFlowId = model.relatedFlowId;
                this.repeatInterval = model.repeatInterval;
                this.repeatability = model.repeatability;
                this.status = model.status;
                this.taskRerunTime = model.taskRerunTime;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The baseline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123123</p>
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * <p>The time when the instance started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>1590416703313</p>
             */
            public Builder beginRunningTime(Long beginRunningTime) {
                this.beginRunningTime = beginRunningTime;
                return this;
            }

            /**
             * <p>The time when the instance started to wait for resources.</p>
             * 
             * <strong>example:</strong>
             * <p>1590416703313</p>
             */
            public Builder beginWaitResTime(Long beginWaitResTime) {
                this.beginWaitResTime = beginWaitResTime;
                return this;
            }

            /**
             * <p>The time when the instance started to wait to be scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>1590416703313</p>
             */
            public Builder beginWaitTimeTime(Long beginWaitTimeTime) {
                this.beginWaitTimeTime = beginWaitTimeTime;
                return this;
            }

            /**
             * <p>The data timestamp of the instance. In most cases, the value is one day before the time when the instance was run.</p>
             * 
             * <strong>example:</strong>
             * <p>1590336000000</p>
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * <p>The workflow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * <p>The connection string.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_first</p>
             */
            public Builder connection(String connection) {
                this.connection = connection;
                return this;
            }

            /**
             * <p>The time when the instance was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>1590416703313</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The scheduling time of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1590422400000</p>
             */
            public Builder cycTime(Long cycTime) {
                this.cycTime = cycTime;
                return this;
            }

            /**
             * <p>The workflow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>338450167</p>
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * <p>The type of the workflow. Valid values:</p>
             * <ul>
             * <li>DAILY: The workflow is used to run auto triggered nodes.</li>
             * <li>MANUAL: The workflow is used to run manually triggered nodes.</li>
             * <li>SMOKE_TEST: The workflow is used to perform smoke testing.</li>
             * <li>SUPPLY_DATA: The workflow is used to backfill data.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DAILY</p>
             */
            public Builder dagType(String dagType) {
                this.dagType = dagType;
                return this;
            }

            /**
             * <p>The table and partition filter expression in Data Quality that are associated with the node.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;projectName&quot;:&quot;ztjy_dim&quot;,&quot;tableName&quot;:&quot;dim_user_agent_manage_area_a&quot;,&quot;partition&quot;:&quot;ds\u003d$[yyyy-mm-dd-1]&quot;}]</p>
             */
            public Builder dqcDescription(String dqcDescription) {
                this.dqcDescription = dqcDescription;
                return this;
            }

            /**
             * <p>Indicates whether the instance is associated with a monitoring rule in Data Quality. Valid values:</p>
             * <ul>
             * <li>0: The instance is associated with a monitoring rule in Data Quality.</li>
             * <li>1: The instance is not associated with a monitoring rule in Data Quality.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dqcType(Integer dqcType) {
                this.dqcType = dqcType;
                return this;
            }

            /**
             * <p>The time when the running of the instance was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>1590416703313</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>11713307578</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time when the instance was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1590416703313</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>33115</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>kzh</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The owner of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The parameters related to the node.</p>
             * 
             * <strong>example:</strong>
             * <p>bizdate=$bizdate tbods=$tbods tbdw=$tbdw tbpmic=$tbpmic tbpidx=$tbpidx tbptcif=$tbptcif</p>
             */
            public Builder paramValues(String paramValues) {
                this.paramValues = paramValues;
                return this;
            }

            /**
             * <p>The sequence number of the cycle. This parameter indicates the sequence number of the cycle of the instance on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodNumber(Integer periodNumber) {
                this.periodNumber = periodNumber;
                return this;
            }

            /**
             * <p>The priority of the instance. Valid values: 1, 3, 5, 7, and 8. A greater value indicates a higher priority. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the workflow to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123123</p>
             */
            public Builder relatedFlowId(Long relatedFlowId) {
                this.relatedFlowId = relatedFlowId;
                return this;
            }

            /**
             * <p>The interval at which the node is rerun after the node fails to run. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60000</p>
             */
            public Builder repeatInterval(Long repeatInterval) {
                this.repeatInterval = repeatInterval;
                return this;
            }

            /**
             * <p>Indicates whether the node that generates the instance can be rerun.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder repeatability(Boolean repeatability) {
                this.repeatability = repeatability;
                return this;
            }

            /**
             * <p>The status of the node that generates the instance. Valid values:</p>
             * <ul>
             * <li>NOT_RUN: The node is not run.</li>
             * <li>WAIT_TIME: The node is waiting for its scheduling time to arrive.</li>
             * <li>WAIT_RESOURCE: The node is waiting for resources.</li>
             * <li>RUNNING: The node is running.</li>
             * <li>CHECKING: Data quality is being checked for the node.</li>
             * <li>CHECKING_CONDITION: Branch conditions are being checked for the node.</li>
             * <li>FAILURE: The node fails to run.</li>
             * <li>SUCCESS: The node is successfully run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NOT_RUN</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of times the node can be rerun. The value of this parameter can be empty or an integer that is greater than or equal to 0.</p>
             * <ul>
             * <li>If the value of this parameter is empty, the number of times that the node can be rerun is not specified.</li>
             * <li>If the value of this parameter is 0, the node cannot be rerun.</li>
             * <li>If the value of this parameter is a positive integer such as n, the node can still be rerun n times. For example, if the value of this parameter is 1, the node can still be rerun once. If the value of this parameter is 2, the node can still be rerun twice.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder taskRerunTime(Integer taskRerunTime) {
                this.taskRerunTime = taskRerunTime;
                return this;
            }

            /**
             * <p>The scheduling type of the node that generates the instance. Valid values:</p>
             * <ul>
             * <li>NORMAL(0): The node is an auto triggered node. The scheduling system regularly runs the node.</li>
             * <li>MANUAL(1): The node is a manually triggered node. The scheduling system does not regularly run the node.</li>
             * <li>PAUSE(2): The node is a frozen node. The scheduling system regularly runs the node but sets the status of the node to failed when the scheduling system starts to run the node.</li>
             * <li>SKIP(3): The node is a dry-run node. The scheduling system regularly runs the node but sets the status of the node to successful when the scheduling system starts to run the node.</li>
             * <li>SKIP_UNCHOOSE(4): The node is an unselected node in a temporary workflow. This type of node exists only in temporary workflows. The scheduling system sets the status of the node to successful when the scheduling system starts to run the node.</li>
             * <li>SKIP_CYCLE(5): The node is a node that is scheduled by the week or month and is waiting for the scheduling time to arrive. The scheduling system regularly runs the node but sets the status of the node to successful when the scheduling system starts to run the node.</li>
             * <li>CONDITION_UNCHOOSE(6): The node is not selected by its ancestor branch node and is run as a dry-run node.</li>
             * <li>REALTIME_DEPRECATED(7): The node has instances that are generated in real time but deprecated. The scheduling system sets the status of the node to successful.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL(0)</p>
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
