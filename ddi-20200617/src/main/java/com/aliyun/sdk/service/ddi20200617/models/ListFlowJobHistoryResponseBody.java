// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowJobHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowJobHistoryResponseBody</p>
 */
public class ListFlowJobHistoryResponseBody extends TeaModel {
    @NameInMap("NodeInstances")
    private NodeInstances nodeInstances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListFlowJobHistoryResponseBody(Builder builder) {
        this.nodeInstances = builder.nodeInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowJobHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodeInstances
     */
    public NodeInstances getNodeInstances() {
        return this.nodeInstances;
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
        private NodeInstances nodeInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * 作业实例列表。
         */
        public Builder nodeInstances(NodeInstances nodeInstances) {
            this.nodeInstances = nodeInstances;
            return this;
        }

        /**
         * 当前页码。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 分页查询时设置的每页行数。
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 记录总数。
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListFlowJobHistoryResponseBody build() {
            return new ListFlowJobHistoryResponseBody(this);
        } 

    } 

    public static class NodeInstance extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("EnvConf")
        private String envConf;

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

        @NameInMap("JobParams")
        private String jobParams;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("MaxRetry")
        private Integer maxRetry;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("ParamConf")
        private String paramConf;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("Retries")
        private Integer retries;

        @NameInMap("RetryInterval")
        private Long retryInterval;

        @NameInMap("RunConf")
        private String runConf;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("pending")
        private Boolean pending;

        private NodeInstance(Builder builder) {
            this.clusterId = builder.clusterId;
            this.endTime = builder.endTime;
            this.envConf = builder.envConf;
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
            this.jobParams = builder.jobParams;
            this.jobType = builder.jobType;
            this.maxRetry = builder.maxRetry;
            this.nodeName = builder.nodeName;
            this.paramConf = builder.paramConf;
            this.projectId = builder.projectId;
            this.retries = builder.retries;
            this.retryInterval = builder.retryInterval;
            this.runConf = builder.runConf;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.type = builder.type;
            this.pending = builder.pending;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInstance create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
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
        public Integer getMaxRetry() {
            return this.maxRetry;
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
        public Long getRetryInterval() {
            return this.retryInterval;
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

        /**
         * @return pending
         */
        public Boolean getPending() {
            return this.pending;
        }

        public static final class Builder {
            private String clusterId; 
            private Long endTime; 
            private String envConf; 
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
            private String jobParams; 
            private String jobType; 
            private Integer maxRetry; 
            private String nodeName; 
            private String paramConf; 
            private String projectId; 
            private Integer retries; 
            private Long retryInterval; 
            private String runConf; 
            private Long startTime; 
            private String status; 
            private String type; 
            private Boolean pending; 

            /**
             * 集群ID。
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * 运行结束时间。
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 环境变量设置。
             */
            public Builder envConf(String envConf) {
                this.envConf = envConf;
                return this;
            }

            /**
             * 启动器的application的ID。
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

            /**
             * 外部信息。例如，运行作业的错误诊断信息。
             */
            public Builder externalInfo(String externalInfo) {
                this.externalInfo = externalInfo;
                return this;
            }

            /**
             * 实例对应的Container的状态：SUBMITTED, RUNNING, SUCCESS, FAIL, KILL_FAIL, KILL_SUCCESS
             */
            public Builder externalStatus(String externalStatus) {
                this.externalStatus = externalStatus;
                return this;
            }

            /**
             * 失败策略，可能的取值：CONTINUE（提过本次作业），STOP（停止作业）
             */
            public Builder failAct(String failAct) {
                this.failAct = failAct;
                return this;
            }

            /**
             * 创建时间。
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 创建时间。
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * 保留参数。
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * 作业实例ID。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 作业ID。
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * 作业名称。
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * 作业内容。
             */
            public Builder jobParams(String jobParams) {
                this.jobParams = jobParams;
                return this;
            }

            /**
             * 作业类型。
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * 最大重试次数。
             */
            public Builder maxRetry(Integer maxRetry) {
                this.maxRetry = maxRetry;
                return this;
            }

            /**
             * 保留参数。
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * 参数设置。
             */
            public Builder paramConf(String paramConf) {
                this.paramConf = paramConf;
                return this;
            }

            /**
             * 项目ID。
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * 重试次数。
             */
            public Builder retries(Integer retries) {
                this.retries = retries;
                return this;
            }

            /**
             * 重试间隔 0-300（秒）。
             */
            public Builder retryInterval(Long retryInterval) {
                this.retryInterval = retryInterval;
                return this;
            }

            /**
             * 运行配置，取值如下：priority（优先级），userName（任务的Linux提交用户），memory（内存，单位为MB），cores（核数）
             */
            public Builder runConf(String runConf) {
                this.runConf = runConf;
                return this;
            }

            /**
             * 运行开始时间。
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 实例的执行状态：PREP：准备启动，SUBMITTING：提交中，RUNNING：运行中DONE：已完成，OK：执行成功，FAILED：执行失败，KILLED：已终止，KILL_FAILED：终止失败，START_RETRY：开始重试
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 节点类型：JOB：作业，CLUSTER：集群，START：开始，END：结束
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * 是否结束。
             */
            public Builder pending(Boolean pending) {
                this.pending = pending;
                return this;
            }

            public NodeInstance build() {
                return new NodeInstance(this);
            } 

        } 

    }
    public static class NodeInstances extends TeaModel {
        @NameInMap("NodeInstance")
        private java.util.List < NodeInstance> nodeInstance;

        private NodeInstances(Builder builder) {
            this.nodeInstance = builder.nodeInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInstances create() {
            return builder().build();
        }

        /**
         * @return nodeInstance
         */
        public java.util.List < NodeInstance> getNodeInstance() {
            return this.nodeInstance;
        }

        public static final class Builder {
            private java.util.List < NodeInstance> nodeInstance; 

            /**
             * NodeInstance.
             */
            public Builder nodeInstance(java.util.List < NodeInstance> nodeInstance) {
                this.nodeInstance = nodeInstance;
                return this;
            }

            public NodeInstances build() {
                return new NodeInstances(this);
            } 

        } 

    }
}
