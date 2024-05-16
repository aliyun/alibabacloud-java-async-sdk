// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListManualDagInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListManualDagInstancesResponseBody</p>
 */
public class ListManualDagInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListManualDagInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListManualDagInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String requestId; 

        /**
         * The instances in the manually triggered workflow.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to search for logs and troubleshoot issues based on the logs.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListManualDagInstancesResponseBody build() {
            return new ListManualDagInstancesResponseBody(this);
        } 

    } 

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

            /**
             * The time when the node started to run. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder beginRunningTime(Long beginRunningTime) {
                this.beginRunningTime = beginRunningTime;
                return this;
            }

            /**
             * The time when the node started to wait for resources. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder beginWaitResTime(Long beginWaitResTime) {
                this.beginWaitResTime = beginWaitResTime;
                return this;
            }

            /**
             * The time when the node started to wait to be scheduled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder beginWaitTimeTime(Long beginWaitTimeTime) {
                this.beginWaitTimeTime = beginWaitTimeTime;
                return this;
            }

            /**
             * The data timestamp of the instance. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. In most cases, the value indicates one day before the time when the node was run.
             */
            public Builder bizDate(Long bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * The time when the node was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The name of the account used to run the instance. For example, if an account named Test was used to run the instance to backfill data, the value of this parameter is Test.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * The time when the node was scheduled to run. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder cycTime(Long cycTime) {
                this.cycTime = cycTime;
                return this;
            }

            /**
             * The ID of the DAG for the manually triggered workflow.
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * The identifier of the manually triggered workflow.
             */
            public Builder dagType(String dagType) {
                this.dagType = dagType;
                return this;
            }

            /**
             * The time when the node stopped running. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The ID of the instance in the manually triggered workflow.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The time when the node was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The ID of the node in the manually triggered workflow.
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
             * The parameters related to the instance.
             */
            public Builder paramValues(String paramValues) {
                this.paramValues = paramValues;
                return this;
            }

            /**
             * The status of the node. Valid values:
             * <p>
             * 
             * *   NOT_RUN: The node is not run.
             * *   WAIT_TIME: The node is waiting for its scheduled time to arrive.
             * *   WAIT_RESOURCE: The node is waiting for resources.
             * *   RUNNING: The node is running.
             * *   CHECKING: Data quality is being checked for the node.
             * *   CHECKING_CONDITION: Branch conditions are being checked for the node.
             * *   FAILURE: The node fails to run.
             * *   SUCCESS: The node is run as expected.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The scheduling type of the node. Valid values:
             * <p>
             * 
             * *   NORMAL(0): The node is an auto triggered node. It is run on a regular basis.
             * *   MANUAL(1): The node is a manually triggered node. It is not run on a regular basis.
             * *   PAUSE(2): The node is a frozen node. The scheduling system still runs the node on a regular basis but sets it to Failed when the scheduling system starts to run the node.
             * *   SKIP(3): The node is a dry-run node. The scheduling system still runs the node on a regular basis but sets it to Succeeded when the scheduling system starts to run the node.
             * *   SKIP_UNCHOOSE(4): The node is an unselected node in a temporary workflow. This type of node exists only in temporary workflows. The scheduling system sets the node to Succeeded when the scheduling system starts to run the node.
             * *   SKIP_CYCLE(5): The node is a node that is scheduled by week or month and is waiting for its scheduled time. The scheduling system still runs the node on a regular basis but sets it to Succeeded when the scheduling system starts to run the node.
             * *   CONDITION_UNCHOOSE(6): The node is not selected by its ancestor branch node and is run as a dry-run node.
             * *   REALTIME_DEPRECATED(7): The node has instances generated in real time but deprecated. The scheduling system directly sets the node to Succeeded.
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
