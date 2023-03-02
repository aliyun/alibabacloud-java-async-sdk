// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceHistoryResponseBody</p>
 */
public class ListInstanceHistoryResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String requestId; 
        private Boolean success; 

        /**
         * The instance list.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request is successful.
         * *   false: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListInstanceHistoryResponseBody build() {
            return new ListInstanceHistoryResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("BeginRunningTime")
        private Long beginRunningTime;

        @NameInMap("BeginWaitResTime")
        private Long beginWaitResTime;

        @NameInMap("BeginWaitTimeTime")
        private Long beginWaitTimeTime;

        @NameInMap("Bizdate")
        private Long bizdate;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CycTime")
        private Long cycTime;

        @NameInMap("DagId")
        private Long dagId;

        @NameInMap("DagType")
        private String dagType;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("FinishTime")
        private Long finishTime;

        @NameInMap("InstanceHistoryId")
        private Long instanceHistoryId;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskType")
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

            /**
             * The time when the instance started to be run. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
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
             * The time when the instance was generated.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the node started to be run. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder cycTime(Long cycTime) {
                this.cycTime = cycTime;
                return this;
            }

            /**
             * The ID of the workflow.
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * Indicates whether the instance is associated with a monitoring rule in Data Quality (DQC). Valid values:
             * <p>
             * 
             * *   0: The instance is associated with a monitoring rule in Data Quality.
             * *   1: The instance is not associated with a monitoring rule in Data Quality.
             */
            public Builder dagType(String dagType) {
                this.dagType = dagType;
                return this;
            }

            /**
             * The error message that is returned for the instance. This parameter is deprecated. You can call the GetInstanceLog operation to query the error information related to the node.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The time when the running of the node was complete. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The historical record number of the instance.
             */
            public Builder instanceHistoryId(Long instanceHistoryId) {
                this.instanceHistoryId = instanceHistoryId;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The time when the node was last modified.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The ID of the node that generates the instance.
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
             * The status of the node that generates the instance. Valid values:
             * <p>
             * 
             * *   NOT_RUN: The node is not run.
             * *   WAIT_TIME: The node is waiting for the scheduling time to arrive.
             * *   WAIT_RESOURCE: The node is waiting for resources.
             * *   RUNNING: The node is running.
             * *   CHECKING: Data quality is being checked for the node.
             * *   CHECKING_CONDITION: Branch conditions are being checked for the node.
             * *   FAILURE: The node fails to be run.
             * *   SUCCESS: The node is successfully run.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the node. Valid values:
             * <p>
             * 
             * *   NORMAL(0): The node is an auto triggered node. The scheduling system regularly runs the node.
             * *   MANUAL(1): The node is a manually triggered node. The scheduling system does not regularly run the node.
             * *   PAUSE(2): The node is a frozen node. The scheduling system regularly runs the node but sets the status of the node to failed when the scheduling system starts to run the node.
             * *   SKIP(3): The node is a dry-run node. The scheduling system regularly runs the node but sets the status of the node to succeeded when the scheduling system starts to run the node.
             * *   SKIP_UNCHOOSE(4): The node is an unselected node in a temporary workflow. This type of node exists only in temporary workflows. The scheduling system sets the status of the node to succeeded when the scheduling system starts to run the node.
             * *   SKIP_CYCLE(5): The node is a node that is scheduled by week or month and is waiting for the scheduling time to arrive. The scheduling system regularly runs the node but sets the status of the node to succeeded when the scheduling system starts to run the node.
             * *   CONDITION_UNCHOOSE(6): The node is not selected by its ancestor branch node and is run as a dry-run node.
             * *   REALTIME_DEPRECATED(7): The node has instances that are generated in real time but deprecated. The scheduling system sets the status of the node to succeeded.
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
