// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetastoreMigrationResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetastoreMigrationResponseBody</p>
 */
public class GetMetastoreMigrationResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetMetastoreMigrationResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetastoreMigrationResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
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

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public GetMetastoreMigrationResponseBody build() {
            return new GetMetastoreMigrationResponseBody(this);
        } 

    } 

    public static class WorkflowLastRunInstance extends TeaModel {
        @NameInMap("BatchProgress")
        private Integer batchProgress;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ExecuteMode")
        private String executeMode;

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

        @NameInMap("OffsetTime")
        private Integer offsetTime;

        @NameInMap("OpsUrl")
        private String opsUrl;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalCuUsage")
        private Float totalCuUsage;

        private WorkflowLastRunInstance(Builder builder) {
            this.batchProgress = builder.batchProgress;
            this.clusterId = builder.clusterId;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.executeMode = builder.executeMode;
            this.failureInfo = builder.failureInfo;
            this.flowExtendResult = builder.flowExtendResult;
            this.flowId = builder.flowId;
            this.flowInstanceId = builder.flowInstanceId;
            this.flowName = builder.flowName;
            this.offsetTime = builder.offsetTime;
            this.opsUrl = builder.opsUrl;
            this.projectId = builder.projectId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.totalCuUsage = builder.totalCuUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowLastRunInstance create() {
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
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return executeMode
         */
        public String getExecuteMode() {
            return this.executeMode;
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
         * @return offsetTime
         */
        public Integer getOffsetTime() {
            return this.offsetTime;
        }

        /**
         * @return opsUrl
         */
        public String getOpsUrl() {
            return this.opsUrl;
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
            private Long endTime; 
            private String executeMode; 
            private String failureInfo; 
            private String flowExtendResult; 
            private String flowId; 
            private String flowInstanceId; 
            private String flowName; 
            private Integer offsetTime; 
            private String opsUrl; 
            private String projectId; 
            private Long startTime; 
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
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExecuteMode.
             */
            public Builder executeMode(String executeMode) {
                this.executeMode = executeMode;
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
             * OffsetTime.
             */
            public Builder offsetTime(Integer offsetTime) {
                this.offsetTime = offsetTime;
                return this;
            }

            /**
             * OpsUrl.
             */
            public Builder opsUrl(String opsUrl) {
                this.opsUrl = opsUrl;
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

            /**
             * TotalCuUsage.
             */
            public Builder totalCuUsage(Float totalCuUsage) {
                this.totalCuUsage = totalCuUsage;
                return this;
            }

            public WorkflowLastRunInstance build() {
                return new WorkflowLastRunInstance(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MetastoreInfo")
        private String metastoreInfo;

        @NameInMap("MetastoreType")
        private String metastoreType;

        @NameInMap("Name")
        private String name;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("RunOptions")
        private String runOptions;

        @NameInMap("Status")
        private String status;

        @NameInMap("WorkflowLastRunInstance")
        private WorkflowLastRunInstance workflowLastRunInstance;

        private Data(Builder builder) {
            this.desc = builder.desc;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.instanceId = builder.instanceId;
            this.metastoreInfo = builder.metastoreInfo;
            this.metastoreType = builder.metastoreType;
            this.name = builder.name;
            this.roleName = builder.roleName;
            this.runOptions = builder.runOptions;
            this.status = builder.status;
            this.workflowLastRunInstance = builder.workflowLastRunInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return metastoreInfo
         */
        public String getMetastoreInfo() {
            return this.metastoreInfo;
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
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return runOptions
         */
        public String getRunOptions() {
            return this.runOptions;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return workflowLastRunInstance
         */
        public WorkflowLastRunInstance getWorkflowLastRunInstance() {
            return this.workflowLastRunInstance;
        }

        public static final class Builder {
            private String desc; 
            private String gmtCreate; 
            private String gmtModified; 
            private String instanceId; 
            private String metastoreInfo; 
            private String metastoreType; 
            private String name; 
            private String roleName; 
            private String runOptions; 
            private String status; 
            private WorkflowLastRunInstance workflowLastRunInstance; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * MetastoreInfo.
             */
            public Builder metastoreInfo(String metastoreInfo) {
                this.metastoreInfo = metastoreInfo;
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
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * RunOptions.
             */
            public Builder runOptions(String runOptions) {
                this.runOptions = runOptions;
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
             * WorkflowLastRunInstance.
             */
            public Builder workflowLastRunInstance(WorkflowLastRunInstance workflowLastRunInstance) {
                this.workflowLastRunInstance = workflowLastRunInstance;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
