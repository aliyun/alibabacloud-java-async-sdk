// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMigrationWorkflowInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMigrationWorkflowInstancesResponseBody</p>
 */
public class ListMigrationWorkflowInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListMigrationWorkflowInstancesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMigrationWorkflowInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMigrationWorkflowInstancesResponseBody build() {
            return new ListMigrationWorkflowInstancesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BatchProgress")
        private Integer batchProgress;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("FailureInfo")
        private String failureInfo;

        @NameInMap("FlowExtendResult")
        private String flowExtendResult;

        @NameInMap("FlowId")
        private String flowId;

        @NameInMap("FlowInstanceId")
        private String flowInstanceId;

        @NameInMap("FlowName")
        private String flowName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MetastoreType")
        private String metastoreType;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.batchProgress = builder.batchProgress;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.failureInfo = builder.failureInfo;
            this.flowExtendResult = builder.flowExtendResult;
            this.flowId = builder.flowId;
            this.flowInstanceId = builder.flowInstanceId;
            this.flowName = builder.flowName;
            this.instanceId = builder.instanceId;
            this.metastoreType = builder.metastoreType;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return batchProgress
         */
        public Integer getBatchProgress() {
            return this.batchProgress;
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
         * @return failureInfo
         */
        public String getFailureInfo() {
            return this.failureInfo;
        }

        /**
         * @return flowExtendResult
         */
        public String getFlowExtendResult() {
            return this.flowExtendResult;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return metastoreType
         */
        public String getMetastoreType() {
            return this.metastoreType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
            private Integer batchProgress; 
            private Long duration; 
            private Long endTime; 
            private String failureInfo; 
            private String flowExtendResult; 
            private String flowId; 
            private String flowInstanceId; 
            private String flowName; 
            private String instanceId; 
            private String metastoreType; 
            private String name; 
            private String projectId; 
            private Long startTime; 
            private String status; 

            /**
             * BatchProgress.
             */
            public Builder batchProgress(Integer batchProgress) {
                this.batchProgress = batchProgress;
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
             * FailureInfo.
             */
            public Builder failureInfo(String failureInfo) {
                this.failureInfo = failureInfo;
                return this;
            }

            /**
             * FlowExtendResult.
             */
            public Builder flowExtendResult(String flowExtendResult) {
                this.flowExtendResult = flowExtendResult;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MetastoreType.
             */
            public Builder metastoreType(String metastoreType) {
                this.metastoreType = metastoreType;
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
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
