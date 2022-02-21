// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowInstanceResponseBody</p>
 */
public class DescribeFlowInstanceResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("CronExpression")
    private String cronExpression;

    @NameInMap("DependencyFlowList")
    private DependencyFlowList dependencyFlowList;

    @NameInMap("Duration")
    private Long duration;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("FlowId")
    private String flowId;

    @NameInMap("FlowName")
    private String flowName;

    @NameInMap("GmtCreate")
    private Long gmtCreate;

    @NameInMap("GmtModified")
    private Long gmtModified;

    @NameInMap("Graph")
    private String graph;

    @NameInMap("HasNodeFailed")
    private Boolean hasNodeFailed;

    @NameInMap("Id")
    private String id;

    @NameInMap("Lifecycle")
    private String lifecycle;

    @NameInMap("LogArchiveLocation")
    private String logArchiveLocation;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("NodeInstance")
    private NodeInstance nodeInstance;

    @NameInMap("ProjectId")
    private String projectId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScheduleTime")
    private Long scheduleTime;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("Status")
    private String status;

    private DescribeFlowInstanceResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.cronExpression = builder.cronExpression;
        this.dependencyFlowList = builder.dependencyFlowList;
        this.duration = builder.duration;
        this.endTime = builder.endTime;
        this.flowId = builder.flowId;
        this.flowName = builder.flowName;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.graph = builder.graph;
        this.hasNodeFailed = builder.hasNodeFailed;
        this.id = builder.id;
        this.lifecycle = builder.lifecycle;
        this.logArchiveLocation = builder.logArchiveLocation;
        this.namespace = builder.namespace;
        this.nodeInstance = builder.nodeInstance;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
        this.scheduleTime = builder.scheduleTime;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return dependencyFlowList
     */
    public DependencyFlowList getDependencyFlowList() {
        return this.dependencyFlowList;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return graph
     */
    public String getGraph() {
        return this.graph;
    }

    /**
     * @return hasNodeFailed
     */
    public Boolean getHasNodeFailed() {
        return this.hasNodeFailed;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return lifecycle
     */
    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * @return logArchiveLocation
     */
    public String getLogArchiveLocation() {
        return this.logArchiveLocation;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return nodeInstance
     */
    public NodeInstance getNodeInstance() {
        return this.nodeInstance;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduleTime
     */
    public Long getScheduleTime() {
        return this.scheduleTime;
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

    public static final class Builder {
        private String clusterId; 
        private String cronExpression; 
        private DependencyFlowList dependencyFlowList; 
        private Long duration; 
        private Long endTime; 
        private String flowId; 
        private String flowName; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private String graph; 
        private Boolean hasNodeFailed; 
        private String id; 
        private String lifecycle; 
        private String logArchiveLocation; 
        private String namespace; 
        private NodeInstance nodeInstance; 
        private String projectId; 
        private String requestId; 
        private Long scheduleTime; 
        private Long startTime; 
        private String status; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CronExpression.
         */
        public Builder cronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * DependencyFlowList.
         */
        public Builder dependencyFlowList(DependencyFlowList dependencyFlowList) {
            this.dependencyFlowList = dependencyFlowList;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * FlowId.
         */
        public Builder flowId(String flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.flowName = flowName;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Graph.
         */
        public Builder graph(String graph) {
            this.graph = graph;
            return this;
        }

        /**
         * HasNodeFailed.
         */
        public Builder hasNodeFailed(Boolean hasNodeFailed) {
            this.hasNodeFailed = hasNodeFailed;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Lifecycle.
         */
        public Builder lifecycle(String lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * LogArchiveLocation.
         */
        public Builder logArchiveLocation(String logArchiveLocation) {
            this.logArchiveLocation = logArchiveLocation;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * NodeInstance.
         */
        public Builder nodeInstance(NodeInstance nodeInstance) {
            this.nodeInstance = nodeInstance;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScheduleTime.
         */
        public Builder scheduleTime(Long scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeFlowInstanceResponseBody build() {
            return new DescribeFlowInstanceResponseBody(this);
        } 

    } 

    public static class ParentFlow extends TeaModel {
        @NameInMap("BizDate")
        private Long bizDate;

        @NameInMap("DependencyFlowId")
        private String dependencyFlowId;

        @NameInMap("DependencyInstanceId")
        private String dependencyInstanceId;

        @NameInMap("FlowId")
        private String flowId;

        @NameInMap("FlowInstanceId")
        private String flowInstanceId;

        @NameInMap("Meet")
        private Boolean meet;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("ScheduleKey")
        private String scheduleKey;

        private ParentFlow(Builder builder) {
            this.bizDate = builder.bizDate;
            this.dependencyFlowId = builder.dependencyFlowId;
            this.dependencyInstanceId = builder.dependencyInstanceId;
            this.flowId = builder.flowId;
            this.flowInstanceId = builder.flowInstanceId;
            this.meet = builder.meet;
            this.projectId = builder.projectId;
            this.scheduleKey = builder.scheduleKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParentFlow create() {
            return builder().build();
        }

        /**
         * @return bizDate
         */
        public Long getBizDate() {
            return this.bizDate;
        }

        /**
         * @return dependencyFlowId
         */
        public String getDependencyFlowId() {
            return this.dependencyFlowId;
        }

        /**
         * @return dependencyInstanceId
         */
        public String getDependencyInstanceId() {
            return this.dependencyInstanceId;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowInstanceId
         */
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        /**
         * @return meet
         */
        public Boolean getMeet() {
            return this.meet;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return scheduleKey
         */
        public String getScheduleKey() {
            return this.scheduleKey;
        }

        public static final class Builder {
            private Long bizDate; 
            private String dependencyFlowId; 
            private String dependencyInstanceId; 
            private String flowId; 
            private String flowInstanceId; 
            private Boolean meet; 
            private String projectId; 
            private String scheduleKey; 

            /**
             * BizDate.
             */
            public Builder bizDate(Long bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * DependencyFlowId.
             */
            public Builder dependencyFlowId(String dependencyFlowId) {
                this.dependencyFlowId = dependencyFlowId;
                return this;
            }

            /**
             * DependencyInstanceId.
             */
            public Builder dependencyInstanceId(String dependencyInstanceId) {
                this.dependencyInstanceId = dependencyInstanceId;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
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
             * Meet.
             */
            public Builder meet(Boolean meet) {
                this.meet = meet;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ScheduleKey.
             */
            public Builder scheduleKey(String scheduleKey) {
                this.scheduleKey = scheduleKey;
                return this;
            }

            public ParentFlow build() {
                return new ParentFlow(this);
            } 

        } 

    }
    public static class DependencyFlowList extends TeaModel {
        @NameInMap("ParentFlow")
        private java.util.List < ParentFlow> parentFlow;

        private DependencyFlowList(Builder builder) {
            this.parentFlow = builder.parentFlow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DependencyFlowList create() {
            return builder().build();
        }

        /**
         * @return parentFlow
         */
        public java.util.List < ParentFlow> getParentFlow() {
            return this.parentFlow;
        }

        public static final class Builder {
            private java.util.List < ParentFlow> parentFlow; 

            /**
             * ParentFlow.
             */
            public Builder parentFlow(java.util.List < ParentFlow> parentFlow) {
                this.parentFlow = parentFlow;
                return this;
            }

            public DependencyFlowList build() {
                return new DependencyFlowList(this);
            } 

        } 

    }
    public static class NodeInstanceNodeInstance extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ExternalId")
        private String externalId;

        @NameInMap("ExternalInfo")
        private String externalInfo;

        @NameInMap("ExternalStatus")
        private String externalStatus;

        @NameInMap("FailAct")
        private String failAct;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("Id")
        private String id;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobName")
        private String jobName;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("MaxRetry")
        private String maxRetry;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("Pending")
        private Boolean pending;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("Retries")
        private Integer retries;

        @NameInMap("RetryInterval")
        private String retryInterval;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private NodeInstanceNodeInstance(Builder builder) {
            this.clusterId = builder.clusterId;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.externalId = builder.externalId;
            this.externalInfo = builder.externalInfo;
            this.externalStatus = builder.externalStatus;
            this.failAct = builder.failAct;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hostName = builder.hostName;
            this.id = builder.id;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.jobType = builder.jobType;
            this.maxRetry = builder.maxRetry;
            this.nodeName = builder.nodeName;
            this.pending = builder.pending;
            this.projectId = builder.projectId;
            this.retries = builder.retries;
            this.retryInterval = builder.retryInterval;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInstanceNodeInstance create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
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
         * @return externalStatus
         */
        public String getExternalStatus() {
            return this.externalStatus;
        }

        /**
         * @return failAct
         */
        public String getFailAct() {
            return this.failAct;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
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
         * @return maxRetry
         */
        public String getMaxRetry() {
            return this.maxRetry;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return pending
         */
        public Boolean getPending() {
            return this.pending;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return retries
         */
        public Integer getRetries() {
            return this.retries;
        }

        /**
         * @return retryInterval
         */
        public String getRetryInterval() {
            return this.retryInterval;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String clusterId; 
            private Long duration; 
            private Long endTime; 
            private String externalId; 
            private String externalInfo; 
            private String externalStatus; 
            private String failAct; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String hostName; 
            private String id; 
            private String jobId; 
            private String jobName; 
            private String jobType; 
            private String maxRetry; 
            private String nodeName; 
            private Boolean pending; 
            private String projectId; 
            private Integer retries; 
            private String retryInterval; 
            private Long startTime; 
            private String status; 
            private String type; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

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
             * ExternalStatus.
             */
            public Builder externalStatus(String externalStatus) {
                this.externalStatus = externalStatus;
                return this;
            }

            /**
             * FailAct.
             */
            public Builder failAct(String failAct) {
                this.failAct = failAct;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
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
             * MaxRetry.
             */
            public Builder maxRetry(String maxRetry) {
                this.maxRetry = maxRetry;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * Pending.
             */
            public Builder pending(Boolean pending) {
                this.pending = pending;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Retries.
             */
            public Builder retries(Integer retries) {
                this.retries = retries;
                return this;
            }

            /**
             * RetryInterval.
             */
            public Builder retryInterval(String retryInterval) {
                this.retryInterval = retryInterval;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NodeInstanceNodeInstance build() {
                return new NodeInstanceNodeInstance(this);
            } 

        } 

    }
    public static class NodeInstance extends TeaModel {
        @NameInMap("NodeInstance")
        private java.util.List < NodeInstanceNodeInstance> nodeInstance;

        private NodeInstance(Builder builder) {
            this.nodeInstance = builder.nodeInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInstance create() {
            return builder().build();
        }

        /**
         * @return nodeInstance
         */
        public java.util.List < NodeInstanceNodeInstance> getNodeInstance() {
            return this.nodeInstance;
        }

        public static final class Builder {
            private java.util.List < NodeInstanceNodeInstance> nodeInstance; 

            /**
             * NodeInstance.
             */
            public Builder nodeInstance(java.util.List < NodeInstanceNodeInstance> nodeInstance) {
                this.nodeInstance = nodeInstance;
                return this;
            }

            public NodeInstance build() {
                return new NodeInstance(this);
            } 

        } 

    }
}
