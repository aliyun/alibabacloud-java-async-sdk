// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobInfosResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobInfosResponseBody</p>
 */
public class ListJobInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListJobInfosResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Integer httpCode; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListJobInfosResponseBody build() {
            return new ListJobInfosResponseBody(this);
        } 

    } 

    public static class JobInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("cuSnapshot")
        private Double cuSnapshot;

        @com.aliyun.core.annotation.NameInMap("cuUsage")
        private Long cuUsage;

        @com.aliyun.core.annotation.NameInMap("endAtTime")
        private Long endAtTime;

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

        @com.aliyun.core.annotation.NameInMap("memorySnapshot")
        private Double memorySnapshot;

        @com.aliyun.core.annotation.NameInMap("memoryUsage")
        private Long memoryUsage;

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

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusSnapshot")
        private String statusSnapshot;

        @com.aliyun.core.annotation.NameInMap("submittedAtTime")
        private Long submittedAtTime;

        @com.aliyun.core.annotation.NameInMap("tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("totalTime")
        private Long totalTime;

        @com.aliyun.core.annotation.NameInMap("waitingTime")
        private Long waitingTime;

        private JobInfoList(Builder builder) {
            this.cluster = builder.cluster;
            this.cuSnapshot = builder.cuSnapshot;
            this.cuUsage = builder.cuUsage;
            this.endAtTime = builder.endAtTime;
            this.extNodeId = builder.extNodeId;
            this.extNodeOnDuty = builder.extNodeOnDuty;
            this.extPlantFrom = builder.extPlantFrom;
            this.instanceId = builder.instanceId;
            this.jobOwner = builder.jobOwner;
            this.jobType = builder.jobType;
            this.memorySnapshot = builder.memorySnapshot;
            this.memoryUsage = builder.memoryUsage;
            this.priority = builder.priority;
            this.project = builder.project;
            this.quotaNickname = builder.quotaNickname;
            this.quotaType = builder.quotaType;
            this.region = builder.region;
            this.runningAtTime = builder.runningAtTime;
            this.runningTime = builder.runningTime;
            this.signature = builder.signature;
            this.status = builder.status;
            this.statusSnapshot = builder.statusSnapshot;
            this.submittedAtTime = builder.submittedAtTime;
            this.tags = builder.tags;
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
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return cuSnapshot
         */
        public Double getCuSnapshot() {
            return this.cuSnapshot;
        }

        /**
         * @return cuUsage
         */
        public Long getCuUsage() {
            return this.cuUsage;
        }

        /**
         * @return endAtTime
         */
        public Long getEndAtTime() {
            return this.endAtTime;
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
         * @return memorySnapshot
         */
        public Double getMemorySnapshot() {
            return this.memorySnapshot;
        }

        /**
         * @return memoryUsage
         */
        public Long getMemoryUsage() {
            return this.memoryUsage;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusSnapshot
         */
        public String getStatusSnapshot() {
            return this.statusSnapshot;
        }

        /**
         * @return submittedAtTime
         */
        public Long getSubmittedAtTime() {
            return this.submittedAtTime;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
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
            private String cluster; 
            private Double cuSnapshot; 
            private Long cuUsage; 
            private Long endAtTime; 
            private String extNodeId; 
            private String extNodeOnDuty; 
            private String extPlantFrom; 
            private String instanceId; 
            private String jobOwner; 
            private String jobType; 
            private Double memorySnapshot; 
            private Long memoryUsage; 
            private Long priority; 
            private String project; 
            private String quotaNickname; 
            private String quotaType; 
            private String region; 
            private Long runningAtTime; 
            private Long runningTime; 
            private String signature; 
            private String status; 
            private String statusSnapshot; 
            private Long submittedAtTime; 
            private String tags; 
            private String tenantId; 
            private Long totalTime; 
            private Long waitingTime; 

            /**
             * The cluster ID.
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * The CU snapshot proportion of the job.
             */
            public Builder cuSnapshot(Double cuSnapshot) {
                this.cuSnapshot = cuSnapshot;
                return this;
            }

            /**
             * The total number of used compute units (CUs).
             */
            public Builder cuUsage(Long cuUsage) {
                this.cuUsage = cuUsage;
                return this;
            }

            /**
             * The time when the job stops running.
             */
            public Builder endAtTime(Long endAtTime) {
                this.endAtTime = endAtTime;
                return this;
            }

            /**
             * The node ID of DataWorks.
             */
            public Builder extNodeId(String extNodeId) {
                this.extNodeId = extNodeId;
                return this;
            }

            /**
             * The account of the node owner.
             */
            public Builder extNodeOnDuty(String extNodeOnDuty) {
                this.extNodeOnDuty = extNodeOnDuty;
                return this;
            }

            /**
             * The upstream platform.
             */
            public Builder extPlantFrom(String extPlantFrom) {
                this.extPlantFrom = extPlantFrom;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The account that commits the job.
             */
            public Builder jobOwner(String jobOwner) {
                this.jobOwner = jobOwner;
                return this;
            }

            /**
             * The type of the job.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * The memory snapshot proportion of the job.
             */
            public Builder memorySnapshot(Double memorySnapshot) {
                this.memorySnapshot = memorySnapshot;
                return this;
            }

            /**
             * The total memory usage.
             */
            public Builder memoryUsage(Long memoryUsage) {
                this.memoryUsage = memoryUsage;
                return this;
            }

            /**
             * The priority of the job.
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The name of the MaxCompute project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * The nickname of the quota that is used by the job.
             */
            public Builder quotaNickname(String quotaNickname) {
                this.quotaNickname = quotaNickname;
                return this;
            }

            /**
             * The type of the quota.
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The time when the job starts to run.
             */
            public Builder runningAtTime(Long runningAtTime) {
                this.runningAtTime = runningAtTime;
                return this;
            }

            /**
             * The period for which the job runs.
             */
            public Builder runningTime(Long runningTime) {
                this.runningTime = runningTime;
                return this;
            }

            /**
             * The signature of the SQL job.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * The status of the job.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The status of the snapshot.
             */
            public Builder statusSnapshot(String statusSnapshot) {
                this.statusSnapshot = statusSnapshot;
                return this;
            }

            /**
             * The time when the job was committed.
             */
            public Builder submittedAtTime(Long submittedAtTime) {
                this.submittedAtTime = submittedAtTime;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The tenant ID.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The total period for which the job runs.
             */
            public Builder totalTime(Long totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * The duration for which the job waits to start.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("jobInfoList")
        private java.util.List < JobInfoList> jobInfoList;

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
        public java.util.List < JobInfoList> getJobInfoList() {
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
            private java.util.List < JobInfoList> jobInfoList; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * The list of the information about the jobs.
             */
            public Builder jobInfoList(java.util.List < JobInfoList> jobInfoList) {
                this.jobInfoList = jobInfoList;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of returned entries.
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
