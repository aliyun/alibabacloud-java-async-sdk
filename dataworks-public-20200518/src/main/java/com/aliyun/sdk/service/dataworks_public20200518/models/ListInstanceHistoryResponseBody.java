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
 * {@link ListInstanceHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceHistoryResponseBody</p>
 */
public class ListInstanceHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListInstanceHistoryResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceHistoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
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
        private java.util.List<Instances> instances; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListInstanceHistoryResponseBody model) {
            this.instances = model.instances;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The list of instances.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The request ID. Used to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>E6F0DBDD-5AD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListInstanceHistoryResponseBody build() {
            return new ListInstanceHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceHistoryResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginRunningTime")
        private Long beginRunningTime;

        @com.aliyun.core.annotation.NameInMap("BeginWaitResTime")
        private Long beginWaitResTime;

        @com.aliyun.core.annotation.NameInMap("BeginWaitTimeTime")
        private Long beginWaitTimeTime;

        @com.aliyun.core.annotation.NameInMap("Bizdate")
        private Long bizdate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CycTime")
        private Long cycTime;

        @com.aliyun.core.annotation.NameInMap("DagId")
        private Long dagId;

        @com.aliyun.core.annotation.NameInMap("DagType")
        private String dagType;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("InstanceHistoryId")
        private Long instanceHistoryId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private Instances(Builder builder) {
            this.beginRunningTime = builder.beginRunningTime;
            this.beginWaitResTime = builder.beginWaitResTime;
            this.beginWaitTimeTime = builder.beginWaitTimeTime;
            this.bizdate = builder.bizdate;
            this.createTime = builder.createTime;
            this.cycTime = builder.cycTime;
            this.dagId = builder.dagId;
            this.dagType = builder.dagType;
            this.errorMessage = builder.errorMessage;
            this.finishTime = builder.finishTime;
            this.instanceHistoryId = builder.instanceHistoryId;
            this.instanceId = builder.instanceId;
            this.modifyTime = builder.modifyTime;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.status = builder.status;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
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
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return instanceHistoryId
         */
        public Long getInstanceHistoryId() {
            return this.instanceHistoryId;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private Long beginRunningTime; 
            private Long beginWaitResTime; 
            private Long beginWaitTimeTime; 
            private Long bizdate; 
            private Long createTime; 
            private Long cycTime; 
            private Long dagId; 
            private String dagType; 
            private String errorMessage; 
            private Long finishTime; 
            private Long instanceHistoryId; 
            private Long instanceId; 
            private Long modifyTime; 
            private Long nodeId; 
            private String nodeName; 
            private String status; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.beginRunningTime = model.beginRunningTime;
                this.beginWaitResTime = model.beginWaitResTime;
                this.beginWaitTimeTime = model.beginWaitTimeTime;
                this.bizdate = model.bizdate;
                this.createTime = model.createTime;
                this.cycTime = model.cycTime;
                this.dagId = model.dagId;
                this.dagType = model.dagType;
                this.errorMessage = model.errorMessage;
                this.finishTime = model.finishTime;
                this.instanceHistoryId = model.instanceHistoryId;
                this.instanceId = model.instanceId;
                this.modifyTime = model.modifyTime;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.status = model.status;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The time when the instance started running, in timestamp format.</p>
             * 
             * <strong>example:</strong>
             * <p>1590416703313</p>
             */
            public Builder beginRunningTime(Long beginRunningTime) {
                this.beginRunningTime = beginRunningTime;
                return this;
            }

            /**
             * <p>The time when the instance started waiting for resources.</p>
             * <p>The value is a 13-digit number, such as <code>1590416703313</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1590416703313</p>
             */
            public Builder beginWaitResTime(Long beginWaitResTime) {
                this.beginWaitResTime = beginWaitResTime;
                return this;
            }

            /**
             * <p>The time when the instance started waiting for scheduling.</p>
             * <p>The value is a 13-digit number, such as <code>1590416703313</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1590416703313</p>
             */
            public Builder beginWaitTimeTime(Long beginWaitTimeTime) {
                this.beginWaitTimeTime = beginWaitTimeTime;
                return this;
            }

            /**
             * <p>The business date on which the scheduled node was run. This value is typically one day before the run time of the node.</p>
             * <p>The value is a 13-digit number, such as <code>1590336000000</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1590336000000</p>
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * <p>The value is a 13-digit number, such as <code>1590416703313</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1590416703313</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The scheduled run time of the node, in timestamp format.</p>
             * 
             * <strong>example:</strong>
             * <p>1590422400000</p>
             */
            public Builder cycTime(Long cycTime) {
                this.cycTime = cycTime;
                return this;
            }

            /**
             * <p>The ID of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>33845</p>
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * <p>The Data Quality Check (DQC) type. Valid values:</p>
             * <ul>
             * <li>0: associated with DQC.</li>
             * <li>1: not associated with DQC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dagType(String dagType) {
                this.dagType = dagType;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The error message returned when the instance failed to run. This field is deprecated. You can call the GetInstanceLog operation to obtain the error information of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>error message</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The time when the scheduled node finished running, in timestamp format.</p>
             * 
             * <strong>example:</strong>
             * <p>1590416703313</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The history archive ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceHistoryId(Long instanceHistoryId) {
                this.instanceHistoryId = instanceHistoryId;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time when the scheduled node was last modified.</p>
             * <p>The value is a 13-digit number, such as <code>1590416703313</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1590416703313</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
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
             * <p>The status of the node. Valid values:</p>
             * <ul>
             * <li>NOT_RUN: The node is not run.</li>
             * <li>WAIT_TIME: The node is waiting for the scheduled time (DueTime or CycTime) to arrive.</li>
             * <li>WAIT_RESOURCE: The node is waiting for resources.</li>
             * <li>RUNNING: The node is running.</li>
             * <li>CHECKING: The node is sent to Data Quality for data verification.</li>
             * <li>CHECKING_CONDITION: The node is undergoing branch condition verification.</li>
             * <li>FAILURE: The node failed to run.</li>
             * <li>SUCCESS: The node ran successfully.</li>
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
             * <p>The scheduling type of the node instance. Valid values:</p>
             * <ul>
             * <li>NORMAL(0): A normal scheduling node. The node is scheduled on a daily basis.</li>
             * <li>MANUAL(1): A manual node. The node is not scheduled on a daily basis.</li>
             * <li>PAUSE(2): A frozen node. The node is scheduled on a daily basis, but is set to failed when scheduling starts.</li>
             * <li>SKIP(3): A dry-run node. The node is scheduled on a daily basis, but is set to successful when scheduling starts.</li>
             * <li>SKIP_UNCHOOSE(4): A node that is not selected in a temporary workflow. This type of node exists only in temporary workflows and is set to successful when scheduling starts.</li>
             * <li>SKIP_CYCLE(5): A weekly or monthly node that has not reached its run cycle. The node is scheduled on a daily basis, but is set to successful when scheduling starts.</li>
             * <li>CONDITION_UNCHOOSE(6): A downstream node that is not selected by an upstream branch (IF) node. The node is directly set to dry-run.</li>
             * <li>REALTIME_DEPRECATED(7): An expired periodic instance generated in real time. This type of node is directly set to successful.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL(0)</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
