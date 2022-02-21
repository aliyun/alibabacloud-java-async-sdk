// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowNodeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowNodeInstanceResponseBody</p>
 */
public class ListFlowNodeInstanceResponseBody extends TeaModel {
    @NameInMap("FlowNodeInstances")
    private FlowNodeInstances flowNodeInstances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListFlowNodeInstanceResponseBody(Builder builder) {
        this.flowNodeInstances = builder.flowNodeInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowNodeInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowNodeInstances
     */
    public FlowNodeInstances getFlowNodeInstances() {
        return this.flowNodeInstances;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private FlowNodeInstances flowNodeInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * FlowNodeInstances.
         */
        public Builder flowNodeInstances(FlowNodeInstances flowNodeInstances) {
            this.flowNodeInstances = flowNodeInstances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListFlowNodeInstanceResponseBody build() {
            return new ListFlowNodeInstanceResponseBody(this);
        } 

    } 

    public static class FlowNodeInstance extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ExternalChildIds")
        private String externalChildIds;

        @NameInMap("ExternalId")
        private String externalId;

        @NameInMap("ExternalInfo")
        private String externalInfo;

        @NameInMap("ExternalStatus")
        private String externalStatus;

        @NameInMap("ExternalSubId")
        private String externalSubId;

        @NameInMap("FailAct")
        private String failAct;

        @NameInMap("FlowId")
        private String flowId;

        @NameInMap("FlowInstanceId")
        private String flowInstanceId;

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

        @NameInMap("JobParams")
        private String jobParams;

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

        private FlowNodeInstance(Builder builder) {
            this.clusterId = builder.clusterId;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.externalChildIds = builder.externalChildIds;
            this.externalId = builder.externalId;
            this.externalInfo = builder.externalInfo;
            this.externalStatus = builder.externalStatus;
            this.externalSubId = builder.externalSubId;
            this.failAct = builder.failAct;
            this.flowId = builder.flowId;
            this.flowInstanceId = builder.flowInstanceId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hostName = builder.hostName;
            this.id = builder.id;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.jobParams = builder.jobParams;
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

        public static FlowNodeInstance create() {
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
         * @return externalChildIds
         */
        public String getExternalChildIds() {
            return this.externalChildIds;
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
         * @return externalSubId
         */
        public String getExternalSubId() {
            return this.externalSubId;
        }

        /**
         * @return failAct
         */
        public String getFailAct() {
            return this.failAct;
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
         * @return jobParams
         */
        public String getJobParams() {
            return this.jobParams;
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
            private String externalChildIds; 
            private String externalId; 
            private String externalInfo; 
            private String externalStatus; 
            private String externalSubId; 
            private String failAct; 
            private String flowId; 
            private String flowInstanceId; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String hostName; 
            private String id; 
            private String jobId; 
            private String jobName; 
            private String jobParams; 
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
             * ExternalChildIds.
             */
            public Builder externalChildIds(String externalChildIds) {
                this.externalChildIds = externalChildIds;
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
             * ExternalSubId.
             */
            public Builder externalSubId(String externalSubId) {
                this.externalSubId = externalSubId;
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
             * JobParams.
             */
            public Builder jobParams(String jobParams) {
                this.jobParams = jobParams;
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

            public FlowNodeInstance build() {
                return new FlowNodeInstance(this);
            } 

        } 

    }
    public static class FlowNodeInstances extends TeaModel {
        @NameInMap("FlowNodeInstance")
        private java.util.List < FlowNodeInstance> flowNodeInstance;

        private FlowNodeInstances(Builder builder) {
            this.flowNodeInstance = builder.flowNodeInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowNodeInstances create() {
            return builder().build();
        }

        /**
         * @return flowNodeInstance
         */
        public java.util.List < FlowNodeInstance> getFlowNodeInstance() {
            return this.flowNodeInstance;
        }

        public static final class Builder {
            private java.util.List < FlowNodeInstance> flowNodeInstance; 

            /**
             * FlowNodeInstance.
             */
            public Builder flowNodeInstance(java.util.List < FlowNodeInstance> flowNodeInstance) {
                this.flowNodeInstance = flowNodeInstance;
                return this;
            }

            public FlowNodeInstances build() {
                return new FlowNodeInstances(this);
            } 

        } 

    }
}
