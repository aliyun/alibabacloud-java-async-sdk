// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListJobSnapshotInfosResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobSnapshotInfosResponseBody</p>
 */
public class ListJobSnapshotInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListJobSnapshotInfosResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobSnapshotInfosResponseBody create() {
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
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListJobSnapshotInfosResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OBJECT_NOT_EXIST</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>this quota is not exist.</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li>1xx: informational response. The request is received and is being processed.</li>
         * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
         * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
         * <li>4xx: client error. The request contains invalid request parameters or syntaxes, or specific request conditions cannot be met.</li>
         * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0b87b7e716665825896565060e87a4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListJobSnapshotInfosResponseBody build() {
            return new ListJobSnapshotInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobSnapshotInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobSnapshotInfosResponseBody</p>
     */
    public static class JobInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpuRequest")
        private Long cpuRequest;

        @com.aliyun.core.annotation.NameInMap("cpuUsage")
        private Long cpuUsage;

        @com.aliyun.core.annotation.NameInMap("cpuUsageToRequestRatio")
        private Double cpuUsageToRequestRatio;

        @com.aliyun.core.annotation.NameInMap("extNodeId")
        private String extNodeId;

        @com.aliyun.core.annotation.NameInMap("extNodeOnDuty")
        private String extNodeOnDuty;

        @com.aliyun.core.annotation.NameInMap("extPlantFrom")
        private String extPlantFrom;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("jobOwner")
        private String jobOwner;

        @com.aliyun.core.annotation.NameInMap("jobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("maxCpuPct")
        private Double maxCpuPct;

        @com.aliyun.core.annotation.NameInMap("maxMemoryPct")
        private Double maxMemoryPct;

        @com.aliyun.core.annotation.NameInMap("memoryRequest")
        private Long memoryRequest;

        @com.aliyun.core.annotation.NameInMap("memoryUsage")
        private Long memoryUsage;

        @com.aliyun.core.annotation.NameInMap("memoryUsageToRequestRatio")
        private Double memoryUsageToRequestRatio;

        @com.aliyun.core.annotation.NameInMap("minCpuPct")
        private Double minCpuPct;

        @com.aliyun.core.annotation.NameInMap("minMemoryPct")
        private Double minMemoryPct;

        @com.aliyun.core.annotation.NameInMap("priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("quotaNickname")
        private String quotaNickname;

        @com.aliyun.core.annotation.NameInMap("quotaType")
        private String quotaType;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("runningAtTime")
        private Long runningAtTime;

        @com.aliyun.core.annotation.NameInMap("runningTime")
        private Long runningTime;

        @com.aliyun.core.annotation.NameInMap("signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("snapshotTime")
        private Long snapshotTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("submittedAtTime")
        private Long submittedAtTime;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("totalTime")
        private Long totalTime;

        @com.aliyun.core.annotation.NameInMap("waitingTime")
        private Long waitingTime;

        private JobInfoList(Builder builder) {
            this.cpuRequest = builder.cpuRequest;
            this.cpuUsage = builder.cpuUsage;
            this.cpuUsageToRequestRatio = builder.cpuUsageToRequestRatio;
            this.extNodeId = builder.extNodeId;
            this.extNodeOnDuty = builder.extNodeOnDuty;
            this.extPlantFrom = builder.extPlantFrom;
            this.instanceId = builder.instanceId;
            this.jobOwner = builder.jobOwner;
            this.jobType = builder.jobType;
            this.maxCpuPct = builder.maxCpuPct;
            this.maxMemoryPct = builder.maxMemoryPct;
            this.memoryRequest = builder.memoryRequest;
            this.memoryUsage = builder.memoryUsage;
            this.memoryUsageToRequestRatio = builder.memoryUsageToRequestRatio;
            this.minCpuPct = builder.minCpuPct;
            this.minMemoryPct = builder.minMemoryPct;
            this.priority = builder.priority;
            this.project = builder.project;
            this.quotaNickname = builder.quotaNickname;
            this.quotaType = builder.quotaType;
            this.region = builder.region;
            this.runningAtTime = builder.runningAtTime;
            this.runningTime = builder.runningTime;
            this.signature = builder.signature;
            this.snapshotTime = builder.snapshotTime;
            this.status = builder.status;
            this.submittedAtTime = builder.submittedAtTime;
            this.tenantId = builder.tenantId;
            this.totalTime = builder.totalTime;
            this.waitingTime = builder.waitingTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfoList create() {
            return builder().build();
        }

        /**
         * @return cpuRequest
         */
        public Long getCpuRequest() {
            return this.cpuRequest;
        }

        /**
         * @return cpuUsage
         */
        public Long getCpuUsage() {
            return this.cpuUsage;
        }

        /**
         * @return cpuUsageToRequestRatio
         */
        public Double getCpuUsageToRequestRatio() {
            return this.cpuUsageToRequestRatio;
        }

        /**
         * @return extNodeId
         */
        public String getExtNodeId() {
            return this.extNodeId;
        }

        /**
         * @return extNodeOnDuty
         */
        public String getExtNodeOnDuty() {
            return this.extNodeOnDuty;
        }

        /**
         * @return extPlantFrom
         */
        public String getExtPlantFrom() {
            return this.extPlantFrom;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobOwner
         */
        public String getJobOwner() {
            return this.jobOwner;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return maxCpuPct
         */
        public Double getMaxCpuPct() {
            return this.maxCpuPct;
        }

        /**
         * @return maxMemoryPct
         */
        public Double getMaxMemoryPct() {
            return this.maxMemoryPct;
        }

        /**
         * @return memoryRequest
         */
        public Long getMemoryRequest() {
            return this.memoryRequest;
        }

        /**
         * @return memoryUsage
         */
        public Long getMemoryUsage() {
            return this.memoryUsage;
        }

        /**
         * @return memoryUsageToRequestRatio
         */
        public Double getMemoryUsageToRequestRatio() {
            return this.memoryUsageToRequestRatio;
        }

        /**
         * @return minCpuPct
         */
        public Double getMinCpuPct() {
            return this.minCpuPct;
        }

        /**
         * @return minMemoryPct
         */
        public Double getMinMemoryPct() {
            return this.minMemoryPct;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return quotaNickname
         */
        public String getQuotaNickname() {
            return this.quotaNickname;
        }

        /**
         * @return quotaType
         */
        public String getQuotaType() {
            return this.quotaType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return runningAtTime
         */
        public Long getRunningAtTime() {
            return this.runningAtTime;
        }

        /**
         * @return runningTime
         */
        public Long getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return snapshotTime
         */
        public Long getSnapshotTime() {
            return this.snapshotTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submittedAtTime
         */
        public Long getSubmittedAtTime() {
            return this.submittedAtTime;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return totalTime
         */
        public Long getTotalTime() {
            return this.totalTime;
        }

        /**
         * @return waitingTime
         */
        public Long getWaitingTime() {
            return this.waitingTime;
        }

        public static final class Builder {
            private Long cpuRequest; 
            private Long cpuUsage; 
            private Double cpuUsageToRequestRatio; 
            private String extNodeId; 
            private String extNodeOnDuty; 
            private String extPlantFrom; 
            private String instanceId; 
            private String jobOwner; 
            private String jobType; 
            private Double maxCpuPct; 
            private Double maxMemoryPct; 
            private Long memoryRequest; 
            private Long memoryUsage; 
            private Double memoryUsageToRequestRatio; 
            private Double minCpuPct; 
            private Double minMemoryPct; 
            private Long priority; 
            private String project; 
            private String quotaNickname; 
            private String quotaType; 
            private String region; 
            private Long runningAtTime; 
            private Long runningTime; 
            private String signature; 
            private Long snapshotTime; 
            private String status; 
            private Long submittedAtTime; 
            private String tenantId; 
            private Long totalTime; 
            private Long waitingTime; 

            private Builder() {
            } 

            private Builder(JobInfoList model) {
                this.cpuRequest = model.cpuRequest;
                this.cpuUsage = model.cpuUsage;
                this.cpuUsageToRequestRatio = model.cpuUsageToRequestRatio;
                this.extNodeId = model.extNodeId;
                this.extNodeOnDuty = model.extNodeOnDuty;
                this.extPlantFrom = model.extPlantFrom;
                this.instanceId = model.instanceId;
                this.jobOwner = model.jobOwner;
                this.jobType = model.jobType;
                this.maxCpuPct = model.maxCpuPct;
                this.maxMemoryPct = model.maxMemoryPct;
                this.memoryRequest = model.memoryRequest;
                this.memoryUsage = model.memoryUsage;
                this.memoryUsageToRequestRatio = model.memoryUsageToRequestRatio;
                this.minCpuPct = model.minCpuPct;
                this.minMemoryPct = model.minMemoryPct;
                this.priority = model.priority;
                this.project = model.project;
                this.quotaNickname = model.quotaNickname;
                this.quotaType = model.quotaType;
                this.region = model.region;
                this.runningAtTime = model.runningAtTime;
                this.runningTime = model.runningTime;
                this.signature = model.signature;
                this.snapshotTime = model.snapshotTime;
                this.status = model.status;
                this.submittedAtTime = model.submittedAtTime;
                this.tenantId = model.tenantId;
                this.totalTime = model.totalTime;
                this.waitingTime = model.waitingTime;
            } 

            /**
             * <p>The CPU request amount of the job at the snapshot time point. Unit: Core.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder cpuRequest(Long cpuRequest) {
                this.cpuRequest = cpuRequest;
                return this;
            }

            /**
             * <p>CPU usage of the job at the snapshot time. Unit: Core.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder cpuUsage(Long cpuUsage) {
                this.cpuUsage = cpuUsage;
                return this;
            }

            /**
             * <p>The CPU satisfaction ratio of the job at the snapshot time point (cpuUsage/cpuRequest).</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder cpuUsageToRequestRatio(Double cpuUsageToRequestRatio) {
                this.cpuUsageToRequestRatio = cpuUsageToRequestRatio;
                return this;
            }

            /**
             * <p>The ID of the upstream node.</p>
             * 
             * <strong>example:</strong>
             * <p>76358164</p>
             */
            public Builder extNodeId(String extNodeId) {
                this.extNodeId = extNodeId;
                return this;
            }

            /**
             * <p>The account ID of the task owner.</p>
             * 
             * <strong>example:</strong>
             * <p>duty_2</p>
             */
            public Builder extNodeOnDuty(String extNodeOnDuty) {
                this.extNodeOnDuty = extNodeOnDuty;
                return this;
            }

            /**
             * <p>The upstream platform.</p>
             * 
             * <strong>example:</strong>
             * <p>Dataworks</p>
             */
            public Builder extPlantFrom(String extPlantFrom) {
                this.extPlantFrom = extPlantFrom;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20241028****jkl</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The account that commits the job.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN$7632***@aliyun.com</p>
             */
            public Builder jobOwner(String jobOwner) {
                this.jobOwner = jobOwner;
                return this;
            }

            /**
             * <p>The type of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>Not applicable.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder maxCpuPct(Double maxCpuPct) {
                this.maxCpuPct = maxCpuPct;
                return this;
            }

            /**
             * <p>Not applicable.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder maxMemoryPct(Double maxMemoryPct) {
                this.maxMemoryPct = maxMemoryPct;
                return this;
            }

            /**
             * <p>The Memory request amount of the job at the snapshot time point. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>409600</p>
             */
            public Builder memoryRequest(Long memoryRequest) {
                this.memoryRequest = memoryRequest;
                return this;
            }

            /**
             * <p>Memory usage of the job at the snapshot time. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>409600</p>
             */
            public Builder memoryUsage(Long memoryUsage) {
                this.memoryUsage = memoryUsage;
                return this;
            }

            /**
             * <p>The Memory satisfaction ratio of the job at the snapshot time point (memoryUsage/memoryRequest).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder memoryUsageToRequestRatio(Double memoryUsageToRequestRatio) {
                this.memoryUsageToRequestRatio = memoryUsageToRequestRatio;
                return this;
            }

            /**
             * <p>The CPU usage ratio of the annual or monthly subscription job at the snapshot time (CPU usage / (reserved CPU guarantee + elastic reserved CPU)). This parameter is not available for pay-as-you-go jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder minCpuPct(Double minCpuPct) {
                this.minCpuPct = minCpuPct;
                return this;
            }

            /**
             * <p>The memory usage ratio of the annual or monthly subscription job at the observation time (memory usage / (reserved memory guarantee + elastic reserved memory)). This parameter is not available for pay-as-you-go jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder minMemoryPct(Double minMemoryPct) {
                this.minMemoryPct = minMemoryPct;
                return this;
            }

            /**
             * <p>The priority of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The name of the MaxCompute project.</p>
             * 
             * <strong>example:</strong>
             * <p>projectA</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The nickname of the computing Quota used by the job.</p>
             * 
             * <strong>example:</strong>
             * <p>quota_A</p>
             */
            public Builder quotaNickname(String quotaNickname) {
                this.quotaNickname = quotaNickname;
                return this;
            }

            /**
             * <p>The type of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>subscription</p>
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chengdu</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The start time of the job.</p>
             * <blockquote>
             * <p>The time when the job received the first batch of computing resources.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1736821805</p>
             */
            public Builder runningAtTime(Long runningAtTime) {
                this.runningAtTime = runningAtTime;
                return this;
            }

            /**
             * <p>The running duration, which is the duration from the runningAtTime to the snapshotTime of the job.  Unit: seconds (s).</p>
             * 
             * <strong>example:</strong>
             * <p>43</p>
             */
            public Builder runningTime(Long runningTime) {
                this.runningTime = runningTime;
                return this;
            }

            /**
             * <p>The signature of the SQL job.</p>
             * 
             * <strong>example:</strong>
             * <p>signatureabc</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>The snapshot time.</p>
             * 
             * <strong>example:</strong>
             * <p>1736821848</p>
             */
            public Builder snapshotTime(Long snapshotTime) {
                this.snapshotTime = snapshotTime;
                return this;
            }

            /**
             * <p>The snapshot status of the job.</p>
             * <blockquote>
             * <p>The snapshot status is only running.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the job was committed.</p>
             * 
             * <strong>example:</strong>
             * <p>1736821785</p>
             */
            public Builder submittedAtTime(Long submittedAtTime) {
                this.submittedAtTime = submittedAtTime;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>213065738244354</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The interval from the time when the job was submitted to the snapshotTime .Unit: seconds (s).</p>
             * 
             * <strong>example:</strong>
             * <p>63</p>
             */
            public Builder totalTime(Long totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * <p>The duration from the time the job is submitted to the time the job starts to run. Unit: seconds (s).</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder waitingTime(Long waitingTime) {
                this.waitingTime = waitingTime;
                return this;
            }

            public JobInfoList build() {
                return new JobInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobSnapshotInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobSnapshotInfosResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("jobInfoList")
        private java.util.List<JobInfoList> jobInfoList;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.jobInfoList = builder.jobInfoList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobInfoList
         */
        public java.util.List<JobInfoList> getJobInfoList() {
            return this.jobInfoList;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<JobInfoList> jobInfoList; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.jobInfoList = model.jobInfoList;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The job snapshots.</p>
             */
            public Builder jobInfoList(java.util.List<JobInfoList> jobInfoList) {
                this.jobInfoList = jobInfoList;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of returned results.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
