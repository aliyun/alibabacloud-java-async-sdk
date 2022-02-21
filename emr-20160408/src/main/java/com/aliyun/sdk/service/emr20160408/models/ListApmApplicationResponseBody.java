// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApmApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>ListApmApplicationResponseBody</p>
 */
public class ListApmApplicationResponseBody extends TeaModel {
    @NameInMap("ApmAppInfoList")
    private ApmAppInfoList apmAppInfoList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListApmApplicationResponseBody(Builder builder) {
        this.apmAppInfoList = builder.apmAppInfoList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApmApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return apmAppInfoList
     */
    public ApmAppInfoList getApmAppInfoList() {
        return this.apmAppInfoList;
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
        private ApmAppInfoList apmAppInfoList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * ApmAppInfoList.
         */
        public Builder apmAppInfoList(ApmAppInfoList apmAppInfoList) {
            this.apmAppInfoList = apmAppInfoList;
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

        public ListApmApplicationResponseBody build() {
            return new ListApmApplicationResponseBody(this);
        } 

    } 

    public static class ApmAppInfo extends TeaModel {
        @NameInMap("AllocatedMemory")
        private Long allocatedMemory;

        @NameInMap("AllocatedVcore")
        private Long allocatedVcore;

        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("ApplicationType")
        private String applicationType;

        @NameInMap("ClusterBizId")
        private String clusterBizId;

        @NameInMap("ClusterUsagePercent")
        private Float clusterUsagePercent;

        @NameInMap("DiagnoseCode")
        private String diagnoseCode;

        @NameInMap("DiagnoseResult")
        private String diagnoseResult;

        @NameInMap("Diagnostics")
        private String diagnostics;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("FinalStatus")
        private String finalStatus;

        @NameInMap("FinishedTime")
        private Long finishedTime;

        @NameInMap("MemorySeconds")
        private Long memorySeconds;

        @NameInMap("Name")
        private String name;

        @NameInMap("Progress")
        private Float progress;

        @NameInMap("Queue")
        private String queue;

        @NameInMap("QueueUsagePercent")
        private Float queueUsagePercent;

        @NameInMap("ResourceRequests")
        private String resourceRequests;

        @NameInMap("RunningContainers")
        private Integer runningContainers;

        @NameInMap("RunningDuration")
        private Integer runningDuration;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("SubmitTime")
        private Long submitTime;

        @NameInMap("User")
        private String user;

        @NameInMap("VcoreSeconds")
        private Long vcoreSeconds;

        private ApmAppInfo(Builder builder) {
            this.allocatedMemory = builder.allocatedMemory;
            this.allocatedVcore = builder.allocatedVcore;
            this.applicationId = builder.applicationId;
            this.applicationType = builder.applicationType;
            this.clusterBizId = builder.clusterBizId;
            this.clusterUsagePercent = builder.clusterUsagePercent;
            this.diagnoseCode = builder.diagnoseCode;
            this.diagnoseResult = builder.diagnoseResult;
            this.diagnostics = builder.diagnostics;
            this.duration = builder.duration;
            this.finalStatus = builder.finalStatus;
            this.finishedTime = builder.finishedTime;
            this.memorySeconds = builder.memorySeconds;
            this.name = builder.name;
            this.progress = builder.progress;
            this.queue = builder.queue;
            this.queueUsagePercent = builder.queueUsagePercent;
            this.resourceRequests = builder.resourceRequests;
            this.runningContainers = builder.runningContainers;
            this.runningDuration = builder.runningDuration;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.submitTime = builder.submitTime;
            this.user = builder.user;
            this.vcoreSeconds = builder.vcoreSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApmAppInfo create() {
            return builder().build();
        }

        /**
         * @return allocatedMemory
         */
        public Long getAllocatedMemory() {
            return this.allocatedMemory;
        }

        /**
         * @return allocatedVcore
         */
        public Long getAllocatedVcore() {
            return this.allocatedVcore;
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationType
         */
        public String getApplicationType() {
            return this.applicationType;
        }

        /**
         * @return clusterBizId
         */
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        /**
         * @return clusterUsagePercent
         */
        public Float getClusterUsagePercent() {
            return this.clusterUsagePercent;
        }

        /**
         * @return diagnoseCode
         */
        public String getDiagnoseCode() {
            return this.diagnoseCode;
        }

        /**
         * @return diagnoseResult
         */
        public String getDiagnoseResult() {
            return this.diagnoseResult;
        }

        /**
         * @return diagnostics
         */
        public String getDiagnostics() {
            return this.diagnostics;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return finalStatus
         */
        public String getFinalStatus() {
            return this.finalStatus;
        }

        /**
         * @return finishedTime
         */
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return memorySeconds
         */
        public Long getMemorySeconds() {
            return this.memorySeconds;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return progress
         */
        public Float getProgress() {
            return this.progress;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return queueUsagePercent
         */
        public Float getQueueUsagePercent() {
            return this.queueUsagePercent;
        }

        /**
         * @return resourceRequests
         */
        public String getResourceRequests() {
            return this.resourceRequests;
        }

        /**
         * @return runningContainers
         */
        public Integer getRunningContainers() {
            return this.runningContainers;
        }

        /**
         * @return runningDuration
         */
        public Integer getRunningDuration() {
            return this.runningDuration;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return submitTime
         */
        public Long getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        /**
         * @return vcoreSeconds
         */
        public Long getVcoreSeconds() {
            return this.vcoreSeconds;
        }

        public static final class Builder {
            private Long allocatedMemory; 
            private Long allocatedVcore; 
            private String applicationId; 
            private String applicationType; 
            private String clusterBizId; 
            private Float clusterUsagePercent; 
            private String diagnoseCode; 
            private String diagnoseResult; 
            private String diagnostics; 
            private Integer duration; 
            private String finalStatus; 
            private Long finishedTime; 
            private Long memorySeconds; 
            private String name; 
            private Float progress; 
            private String queue; 
            private Float queueUsagePercent; 
            private String resourceRequests; 
            private Integer runningContainers; 
            private Integer runningDuration; 
            private Long startTime; 
            private String state; 
            private Long submitTime; 
            private String user; 
            private Long vcoreSeconds; 

            /**
             * AllocatedMemory.
             */
            public Builder allocatedMemory(Long allocatedMemory) {
                this.allocatedMemory = allocatedMemory;
                return this;
            }

            /**
             * AllocatedVcore.
             */
            public Builder allocatedVcore(Long allocatedVcore) {
                this.allocatedVcore = allocatedVcore;
                return this;
            }

            /**
             * ApplicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * ApplicationType.
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * ClusterBizId.
             */
            public Builder clusterBizId(String clusterBizId) {
                this.clusterBizId = clusterBizId;
                return this;
            }

            /**
             * ClusterUsagePercent.
             */
            public Builder clusterUsagePercent(Float clusterUsagePercent) {
                this.clusterUsagePercent = clusterUsagePercent;
                return this;
            }

            /**
             * DiagnoseCode.
             */
            public Builder diagnoseCode(String diagnoseCode) {
                this.diagnoseCode = diagnoseCode;
                return this;
            }

            /**
             * DiagnoseResult.
             */
            public Builder diagnoseResult(String diagnoseResult) {
                this.diagnoseResult = diagnoseResult;
                return this;
            }

            /**
             * Diagnostics.
             */
            public Builder diagnostics(String diagnostics) {
                this.diagnostics = diagnostics;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FinalStatus.
             */
            public Builder finalStatus(String finalStatus) {
                this.finalStatus = finalStatus;
                return this;
            }

            /**
             * FinishedTime.
             */
            public Builder finishedTime(Long finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * MemorySeconds.
             */
            public Builder memorySeconds(Long memorySeconds) {
                this.memorySeconds = memorySeconds;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * QueueUsagePercent.
             */
            public Builder queueUsagePercent(Float queueUsagePercent) {
                this.queueUsagePercent = queueUsagePercent;
                return this;
            }

            /**
             * ResourceRequests.
             */
            public Builder resourceRequests(String resourceRequests) {
                this.resourceRequests = resourceRequests;
                return this;
            }

            /**
             * RunningContainers.
             */
            public Builder runningContainers(Integer runningContainers) {
                this.runningContainers = runningContainers;
                return this;
            }

            /**
             * RunningDuration.
             */
            public Builder runningDuration(Integer runningDuration) {
                this.runningDuration = runningDuration;
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
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * SubmitTime.
             */
            public Builder submitTime(Long submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * VcoreSeconds.
             */
            public Builder vcoreSeconds(Long vcoreSeconds) {
                this.vcoreSeconds = vcoreSeconds;
                return this;
            }

            public ApmAppInfo build() {
                return new ApmAppInfo(this);
            } 

        } 

    }
    public static class ApmAppInfoList extends TeaModel {
        @NameInMap("ApmAppInfo")
        private java.util.List < ApmAppInfo> apmAppInfo;

        private ApmAppInfoList(Builder builder) {
            this.apmAppInfo = builder.apmAppInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApmAppInfoList create() {
            return builder().build();
        }

        /**
         * @return apmAppInfo
         */
        public java.util.List < ApmAppInfo> getApmAppInfo() {
            return this.apmAppInfo;
        }

        public static final class Builder {
            private java.util.List < ApmAppInfo> apmAppInfo; 

            /**
             * ApmAppInfo.
             */
            public Builder apmAppInfo(java.util.List < ApmAppInfo> apmAppInfo) {
                this.apmAppInfo = apmAppInfo;
                return this;
            }

            public ApmAppInfoList build() {
                return new ApmAppInfoList(this);
            } 

        } 

    }
}
