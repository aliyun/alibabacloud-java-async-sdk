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
 * {@link GetManualDagInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>GetManualDagInstancesResponseBody</p>
 */
public class GetManualDagInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetManualDagInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetManualDagInstancesResponseBody create() {
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

    public static final class Builder {
        private java.util.List<Instances> instances; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetManualDagInstancesResponseBody model) {
            this.instances = model.instances;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of internal instances of the manual workflow.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>SDFSDFSDF-SDFSDF-SDFDSF-SDFSDF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetManualDagInstancesResponseBody build() {
            return new GetManualDagInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetManualDagInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>GetManualDagInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginRunningTime")
        private Long beginRunningTime;

        @com.aliyun.core.annotation.NameInMap("BeginWaitResTime")
        private Long beginWaitResTime;

        @com.aliyun.core.annotation.NameInMap("BeginWaitTimeTime")
        private Long beginWaitTimeTime;

        @com.aliyun.core.annotation.NameInMap("BizDate")
        private Long bizDate;

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

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private Instances(Builder builder) {
            this.beginRunningTime = builder.beginRunningTime;
            this.beginWaitResTime = builder.beginWaitResTime;
            this.beginWaitTimeTime = builder.beginWaitTimeTime;
            this.bizDate = builder.bizDate;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.cycTime = builder.cycTime;
            this.dagId = builder.dagId;
            this.dagType = builder.dagType;
            this.finishTime = builder.finishTime;
            this.instanceId = builder.instanceId;
            this.modifyTime = builder.modifyTime;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.paramValues = builder.paramValues;
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
         * @return bizDate
         */
        public Long getBizDate() {
            return this.bizDate;
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
            private Long bizDate; 
            private Long createTime; 
            private String createUser; 
            private Long cycTime; 
            private Long dagId; 
            private String dagType; 
            private Long finishTime; 
            private Long instanceId; 
            private Long modifyTime; 
            private Long nodeId; 
            private String nodeName; 
            private String paramValues; 
            private String status; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.beginRunningTime = model.beginRunningTime;
                this.beginWaitResTime = model.beginWaitResTime;
                this.beginWaitTimeTime = model.beginWaitTimeTime;
                this.bizDate = model.bizDate;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.cycTime = model.cycTime;
                this.dagId = model.dagId;
                this.dagType = model.dagType;
                this.finishTime = model.finishTime;
                this.instanceId = model.instanceId;
                this.modifyTime = model.modifyTime;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.paramValues = model.paramValues;
                this.status = model.status;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The time when the instance node started to run.</p>
             * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1605178414676</p>
             */
            public Builder beginRunningTime(Long beginRunningTime) {
                this.beginRunningTime = beginRunningTime;
                return this;
            }

            /**
             * <p>The time when the instance node started to wait for resources.</p>
             * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1605178414676</p>
             */
            public Builder beginWaitResTime(Long beginWaitResTime) {
                this.beginWaitResTime = beginWaitResTime;
                return this;
            }

            /**
             * <p>The time when the instance node started to wait for scheduling.</p>
             * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1605178414676</p>
             */
            public Builder beginWaitTimeTime(Long beginWaitTimeTime) {
                this.beginWaitTimeTime = beginWaitTimeTime;
                return this;
            }

            /**
             * <p>The business date. This is typically the day before the node runs.</p>
             * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1605178414676</p>
             */
            public Builder bizDate(Long bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The time when the instance node was created.</p>
             * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1605178414676</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The scheduled time of the instance node.</p>
             * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1605178414676</p>
             */
            public Builder cycTime(Long cycTime) {
                this.cycTime = cycTime;
                return this;
            }

            /**
             * <p>The DAG ID of the manual workflow instance.</p>
             * 
             * <strong>example:</strong>
             * <p>350850491</p>
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * <p>The type of the manual workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder dagType(String dagType) {
                this.dagType = dagType;
                return this;
            }

            /**
             * <p>The time when the instance node finished running.</p>
             * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1605178414676</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The internal instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>11726873619</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The most recent modification time of the instance node.</p>
             * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1605178414676</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The internal node ID of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>37851</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>test2</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The parameter information of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder paramValues(String paramValues) {
                this.paramValues = paramValues;
                return this;
            }

            /**
             * <p>The status of the instance node. Valid values:</p>
             * <ul>
             * <li>NOT_RUN: The instance is not run.</li>
             * <li>WAIT_TIME: The instance is waiting for the scheduled dueTime or cycleTime.</li>
             * <li>WAIT_RESOURCE: The instance is waiting for resources.</li>
             * <li>RUNNING: The instance is running.</li>
             * <li>CHECKING: The instance is submitted to Data Quality for data verification.</li>
             * <li>CHECKING_CONDITION: The instance is performing branch condition verification.</li>
             * <li>FAILURE: The instance failed to run.</li>
             * <li>SUCCESS: The instance is run successfully.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WAIT_TIME</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The scheduling type of the instance node. Valid values:</p>
             * <ul>
             * <li>NORMAL(0): a normal scheduling node. The node is scheduled on a daily basis.</li>
             * <li>MANUAL(1): a manual node. The node is not scheduled on a daily basis.</li>
             * <li>PAUSE(2): a paused node. The node is scheduled on a daily basis, but is set to failed when scheduling starts.</li>
             * <li>SKIP(3): a dry-run node. The node is scheduled on a daily basis, but is set to successful when scheduling starts.</li>
             * <li>SKIP_UNCHOOSE(4): a node that is not selected in a temporary workflow. This type of node exists only in temporary workflows and is set to successful when scheduling starts.</li>
             * <li>SKIP_CYCLE(5): a weekly or monthly node that has not reached its run cycle. The node is scheduled on a daily basis, but is set to successful when scheduling starts.</li>
             * <li>CONDITION_UNCHOOSE(6): a downstream node that is not selected by an upstream branch (IF) node. The node is directly set to dry-run.</li>
             * <li>REALTIME_DEPRECATED(7): an expired periodic instance generated in real time. This type of node is directly set to successful.</li>
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
