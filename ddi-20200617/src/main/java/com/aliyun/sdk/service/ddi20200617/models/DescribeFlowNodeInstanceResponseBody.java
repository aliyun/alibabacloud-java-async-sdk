// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowNodeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowNodeInstanceResponseBody</p>
 */
public class DescribeFlowNodeInstanceResponseBody extends TeaModel {
    @NameInMap("Adhoc")
    private Boolean adhoc;

    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("ClusterName")
    private String clusterName;

    @NameInMap("Duration")
    private Long duration;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("EnvConf")
    private String envConf;

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

    @NameInMap("Mode")
    private String mode;

    @NameInMap("MonitorConf")
    private String monitorConf;

    @NameInMap("NodeName")
    private String nodeName;

    @NameInMap("ParamConf")
    private String paramConf;

    @NameInMap("Pending")
    private Boolean pending;

    @NameInMap("ProjectId")
    private String projectId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Retries")
    private Integer retries;

    @NameInMap("RetryInterval")
    private String retryInterval;

    @NameInMap("RetryPolicy")
    private String retryPolicy;

    @NameInMap("RunConf")
    private String runConf;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("Status")
    private String status;

    @NameInMap("Type")
    private String type;

    private DescribeFlowNodeInstanceResponseBody(Builder builder) {
        this.adhoc = builder.adhoc;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.duration = builder.duration;
        this.endTime = builder.endTime;
        this.envConf = builder.envConf;
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
        this.mode = builder.mode;
        this.monitorConf = builder.monitorConf;
        this.nodeName = builder.nodeName;
        this.paramConf = builder.paramConf;
        this.pending = builder.pending;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
        this.retries = builder.retries;
        this.retryInterval = builder.retryInterval;
        this.retryPolicy = builder.retryPolicy;
        this.runConf = builder.runConf;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowNodeInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return adhoc
     */
    public Boolean getAdhoc() {
        return this.adhoc;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
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
     * @return envConf
     */
    public String getEnvConf() {
        return this.envConf;
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
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return monitorConf
     */
    public String getMonitorConf() {
        return this.monitorConf;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return paramConf
     */
    public String getParamConf() {
        return this.paramConf;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return retryPolicy
     */
    public String getRetryPolicy() {
        return this.retryPolicy;
    }

    /**
     * @return runConf
     */
    public String getRunConf() {
        return this.runConf;
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
        private Boolean adhoc; 
        private String clusterId; 
        private String clusterName; 
        private Long duration; 
        private Long endTime; 
        private String envConf; 
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
        private String mode; 
        private String monitorConf; 
        private String nodeName; 
        private String paramConf; 
        private Boolean pending; 
        private String projectId; 
        private String requestId; 
        private Integer retries; 
        private String retryInterval; 
        private String retryPolicy; 
        private String runConf; 
        private Long startTime; 
        private String status; 
        private String type; 

        /**
         * Adhoc.
         */
        public Builder adhoc(Boolean adhoc) {
            this.adhoc = adhoc;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
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
         * EnvConf.
         */
        public Builder envConf(String envConf) {
            this.envConf = envConf;
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
         * Mode.
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * MonitorConf.
         */
        public Builder monitorConf(String monitorConf) {
            this.monitorConf = monitorConf;
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
         * ParamConf.
         */
        public Builder paramConf(String paramConf) {
            this.paramConf = paramConf;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * RetryPolicy.
         */
        public Builder retryPolicy(String retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * RunConf.
         */
        public Builder runConf(String runConf) {
            this.runConf = runConf;
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

        public DescribeFlowNodeInstanceResponseBody build() {
            return new DescribeFlowNodeInstanceResponseBody(this);
        } 

    } 

}
