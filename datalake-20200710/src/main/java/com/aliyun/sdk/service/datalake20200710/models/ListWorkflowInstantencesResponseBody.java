// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkflowInstantencesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowInstantencesResponseBody</p>
 */
public class ListWorkflowInstantencesResponseBody extends TeaModel {
    @NameInMap("FlowInstances")
    private java.util.List < FlowInstances> flowInstances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Long success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListWorkflowInstantencesResponseBody(Builder builder) {
        this.flowInstances = builder.flowInstances;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowInstantencesResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowInstances
     */
    public java.util.List < FlowInstances> getFlowInstances() {
        return this.flowInstances;
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
    public Long getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < FlowInstances> flowInstances; 
        private String requestId; 
        private Long success; 
        private Long totalCount; 

        /**
         * FlowInstances.
         */
        public Builder flowInstances(java.util.List < FlowInstances> flowInstances) {
            this.flowInstances = flowInstances;
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
         * Success.
         */
        public Builder success(Long success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListWorkflowInstantencesResponseBody build() {
            return new ListWorkflowInstantencesResponseBody(this);
        } 

    } 

    public static class FlowInstances extends TeaModel {
        @NameInMap("BatchProgress")
        private Integer batchProgress;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("FlowId")
        private String flowId;

        @NameInMap("FlowInstanceId")
        private String flowInstanceId;

        @NameInMap("FlowName")
        private String flowName;

        @NameInMap("OffsetTime")
        private Integer offsetTime;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalCuUsage")
        private Float totalCuUsage;

        private FlowInstances(Builder builder) {
            this.batchProgress = builder.batchProgress;
            this.clusterId = builder.clusterId;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.flowId = builder.flowId;
            this.flowInstanceId = builder.flowInstanceId;
            this.flowName = builder.flowName;
            this.offsetTime = builder.offsetTime;
            this.projectId = builder.projectId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.totalCuUsage = builder.totalCuUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowInstances create() {
            return builder().build();
        }

        /**
         * @return batchProgress
         */
        public Integer getBatchProgress() {
            return this.batchProgress;
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
        public String getEndTime() {
            return this.endTime;
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
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        /**
         * @return offsetTime
         */
        public Integer getOffsetTime() {
            return this.offsetTime;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalCuUsage
         */
        public Float getTotalCuUsage() {
            return this.totalCuUsage;
        }

        public static final class Builder {
            private Integer batchProgress; 
            private String clusterId; 
            private Long duration; 
            private String endTime; 
            private String flowId; 
            private String flowInstanceId; 
            private String flowName; 
            private Integer offsetTime; 
            private String projectId; 
            private String startTime; 
            private String status; 
            private Float totalCuUsage; 

            /**
             * BatchProgress.
             */
            public Builder batchProgress(Integer batchProgress) {
                this.batchProgress = batchProgress;
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
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
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
             * FlowInstanceId.
             */
            public Builder flowInstanceId(String flowInstanceId) {
                this.flowInstanceId = flowInstanceId;
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
             * OffsetTime.
             */
            public Builder offsetTime(Integer offsetTime) {
                this.offsetTime = offsetTime;
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
             * StartTime.
             */
            public Builder startTime(String startTime) {
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
             * TotalCuUsage.
             */
            public Builder totalCuUsage(Float totalCuUsage) {
                this.totalCuUsage = totalCuUsage;
                return this;
            }

            public FlowInstances build() {
                return new FlowInstances(this);
            } 

        } 

    }
}
