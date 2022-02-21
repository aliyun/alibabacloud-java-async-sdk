// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkflowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkflowInstanceResponseBody</p>
 */
public class GetWorkflowInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("WorkflowInstanceDetail")
    private WorkflowInstanceDetail workflowInstanceDetail;

    private GetWorkflowInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workflowInstanceDetail = builder.workflowInstanceDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowInstanceResponseBody create() {
        return builder().build();
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return workflowInstanceDetail
     */
    public WorkflowInstanceDetail getWorkflowInstanceDetail() {
        return this.workflowInstanceDetail;
    }

    public static final class Builder {
        private String requestId; 
        private String success; 
        private WorkflowInstanceDetail workflowInstanceDetail; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * WorkflowInstanceDetail.
         */
        public Builder workflowInstanceDetail(WorkflowInstanceDetail workflowInstanceDetail) {
            this.workflowInstanceDetail = workflowInstanceDetail;
            return this;
        }

        public GetWorkflowInstanceResponseBody build() {
            return new GetWorkflowInstanceResponseBody(this);
        } 

    } 

    public static class FailedNodeInstance extends TeaModel {
        @NameInMap("ExternalId")
        private String externalId;

        @NameInMap("ExternalInfo")
        private String externalInfo;

        @NameInMap("JobName")
        private String jobName;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("NodeInstanceId")
        private String nodeInstanceId;

        @NameInMap("Status")
        private String status;

        private FailedNodeInstance(Builder builder) {
            this.externalId = builder.externalId;
            this.externalInfo = builder.externalInfo;
            this.jobName = builder.jobName;
            this.jobType = builder.jobType;
            this.nodeInstanceId = builder.nodeInstanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedNodeInstance create() {
            return builder().build();
        }

        /**
         * @return externalId
         */
        public String getExternalId() {
            return this.externalId;
        }

        /**
         * @return externalInfo
         */
        public String getExternalInfo() {
            return this.externalInfo;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return nodeInstanceId
         */
        public String getNodeInstanceId() {
            return this.nodeInstanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String externalId; 
            private String externalInfo; 
            private String jobName; 
            private String jobType; 
            private String nodeInstanceId; 
            private String status; 

            /**
             * ExternalId.
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

            /**
             * ExternalInfo.
             */
            public Builder externalInfo(String externalInfo) {
                this.externalInfo = externalInfo;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * NodeInstanceId.
             */
            public Builder nodeInstanceId(String nodeInstanceId) {
                this.nodeInstanceId = nodeInstanceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public FailedNodeInstance build() {
                return new FailedNodeInstance(this);
            } 

        } 

    }
    public static class RuntimeLogs extends TeaModel {
        @NameInMap("BizTime")
        private String bizTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LogContent")
        private String logContent;

        @NameInMap("LogId")
        private String logId;

        @NameInMap("LogSummary")
        private String logSummary;

        @NameInMap("LogType")
        private String logType;

        @NameInMap("Trigger")
        private String trigger;

        private RuntimeLogs(Builder builder) {
            this.bizTime = builder.bizTime;
            this.instanceId = builder.instanceId;
            this.logContent = builder.logContent;
            this.logId = builder.logId;
            this.logSummary = builder.logSummary;
            this.logType = builder.logType;
            this.trigger = builder.trigger;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeLogs create() {
            return builder().build();
        }

        /**
         * @return bizTime
         */
        public String getBizTime() {
            return this.bizTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return logContent
         */
        public String getLogContent() {
            return this.logContent;
        }

        /**
         * @return logId
         */
        public String getLogId() {
            return this.logId;
        }

        /**
         * @return logSummary
         */
        public String getLogSummary() {
            return this.logSummary;
        }

        /**
         * @return logType
         */
        public String getLogType() {
            return this.logType;
        }

        /**
         * @return trigger
         */
        public String getTrigger() {
            return this.trigger;
        }

        public static final class Builder {
            private String bizTime; 
            private String instanceId; 
            private String logContent; 
            private String logId; 
            private String logSummary; 
            private String logType; 
            private String trigger; 

            /**
             * BizTime.
             */
            public Builder bizTime(String bizTime) {
                this.bizTime = bizTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LogContent.
             */
            public Builder logContent(String logContent) {
                this.logContent = logContent;
                return this;
            }

            /**
             * LogId.
             */
            public Builder logId(String logId) {
                this.logId = logId;
                return this;
            }

            /**
             * LogSummary.
             */
            public Builder logSummary(String logSummary) {
                this.logSummary = logSummary;
                return this;
            }

            /**
             * LogType.
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * Trigger.
             */
            public Builder trigger(String trigger) {
                this.trigger = trigger;
                return this;
            }

            public RuntimeLogs build() {
                return new RuntimeLogs(this);
            } 

        } 

    }
    public static class WorkflowInstanceDetail extends TeaModel {
        @NameInMap("FailedNodeInstance")
        private FailedNodeInstance failedNodeInstance;

        @NameInMap("FlowInstanceId")
        private String flowInstanceId;

        @NameInMap("FlowNodeSize")
        private String flowNodeSize;

        @NameInMap("HasFailedNode")
        private String hasFailedNode;

        @NameInMap("RuntimeLogs")
        private java.util.List < RuntimeLogs> runtimeLogs;

        private WorkflowInstanceDetail(Builder builder) {
            this.failedNodeInstance = builder.failedNodeInstance;
            this.flowInstanceId = builder.flowInstanceId;
            this.flowNodeSize = builder.flowNodeSize;
            this.hasFailedNode = builder.hasFailedNode;
            this.runtimeLogs = builder.runtimeLogs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowInstanceDetail create() {
            return builder().build();
        }

        /**
         * @return failedNodeInstance
         */
        public FailedNodeInstance getFailedNodeInstance() {
            return this.failedNodeInstance;
        }

        /**
         * @return flowInstanceId
         */
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        /**
         * @return flowNodeSize
         */
        public String getFlowNodeSize() {
            return this.flowNodeSize;
        }

        /**
         * @return hasFailedNode
         */
        public String getHasFailedNode() {
            return this.hasFailedNode;
        }

        /**
         * @return runtimeLogs
         */
        public java.util.List < RuntimeLogs> getRuntimeLogs() {
            return this.runtimeLogs;
        }

        public static final class Builder {
            private FailedNodeInstance failedNodeInstance; 
            private String flowInstanceId; 
            private String flowNodeSize; 
            private String hasFailedNode; 
            private java.util.List < RuntimeLogs> runtimeLogs; 

            /**
             * FailedNodeInstance.
             */
            public Builder failedNodeInstance(FailedNodeInstance failedNodeInstance) {
                this.failedNodeInstance = failedNodeInstance;
                return this;
            }

            /**
             * FlowInstanceId.
             */
            public Builder flowInstanceId(String flowInstanceId) {
                this.flowInstanceId = flowInstanceId;
                return this;
            }

            /**
             * FlowNodeSize.
             */
            public Builder flowNodeSize(String flowNodeSize) {
                this.flowNodeSize = flowNodeSize;
                return this;
            }

            /**
             * HasFailedNode.
             */
            public Builder hasFailedNode(String hasFailedNode) {
                this.hasFailedNode = hasFailedNode;
                return this;
            }

            /**
             * RuntimeLogs.
             */
            public Builder runtimeLogs(java.util.List < RuntimeLogs> runtimeLogs) {
                this.runtimeLogs = runtimeLogs;
                return this;
            }

            public WorkflowInstanceDetail build() {
                return new WorkflowInstanceDetail(this);
            } 

        } 

    }
}
