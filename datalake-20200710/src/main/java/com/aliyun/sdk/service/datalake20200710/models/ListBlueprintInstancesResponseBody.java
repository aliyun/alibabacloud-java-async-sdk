// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBlueprintInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListBlueprintInstancesResponseBody</p>
 */
public class ListBlueprintInstancesResponseBody extends TeaModel {
    @NameInMap("BlueprintInstances")
    private java.util.List < BlueprintInstances> blueprintInstances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListBlueprintInstancesResponseBody(Builder builder) {
        this.blueprintInstances = builder.blueprintInstances;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBlueprintInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return blueprintInstances
     */
    public java.util.List < BlueprintInstances> getBlueprintInstances() {
        return this.blueprintInstances;
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
        private java.util.List < BlueprintInstances> blueprintInstances; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * BlueprintInstances.
         */
        public Builder blueprintInstances(java.util.List < BlueprintInstances> blueprintInstances) {
            this.blueprintInstances = blueprintInstances;
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

        public ListBlueprintInstancesResponseBody build() {
            return new ListBlueprintInstancesResponseBody(this);
        } 

    } 

    public static class Workflow extends TeaModel {
        @NameInMap("LatestEndTime")
        private String latestEndTime;

        @NameInMap("LatestInstanceStatus")
        private String latestInstanceStatus;

        @NameInMap("LatestStartTime")
        private String latestStartTime;

        @NameInMap("WorkflowId")
        private String workflowId;

        private Workflow(Builder builder) {
            this.latestEndTime = builder.latestEndTime;
            this.latestInstanceStatus = builder.latestInstanceStatus;
            this.latestStartTime = builder.latestStartTime;
            this.workflowId = builder.workflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workflow create() {
            return builder().build();
        }

        /**
         * @return latestEndTime
         */
        public String getLatestEndTime() {
            return this.latestEndTime;
        }

        /**
         * @return latestInstanceStatus
         */
        public String getLatestInstanceStatus() {
            return this.latestInstanceStatus;
        }

        /**
         * @return latestStartTime
         */
        public String getLatestStartTime() {
            return this.latestStartTime;
        }

        /**
         * @return workflowId
         */
        public String getWorkflowId() {
            return this.workflowId;
        }

        public static final class Builder {
            private String latestEndTime; 
            private String latestInstanceStatus; 
            private String latestStartTime; 
            private String workflowId; 

            /**
             * LatestEndTime.
             */
            public Builder latestEndTime(String latestEndTime) {
                this.latestEndTime = latestEndTime;
                return this;
            }

            /**
             * LatestInstanceStatus.
             */
            public Builder latestInstanceStatus(String latestInstanceStatus) {
                this.latestInstanceStatus = latestInstanceStatus;
                return this;
            }

            /**
             * LatestStartTime.
             */
            public Builder latestStartTime(String latestStartTime) {
                this.latestStartTime = latestStartTime;
                return this;
            }

            /**
             * WorkflowId.
             */
            public Builder workflowId(String workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            public Workflow build() {
                return new Workflow(this);
            } 

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
        private String endTime;

        @NameInMap("FailureInfo")
        private String failureInfo;

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

        private WorkflowLastRunInstance(Builder builder) {
            this.batchProgress = builder.batchProgress;
            this.clusterId = builder.clusterId;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.failureInfo = builder.failureInfo;
            this.flowId = builder.flowId;
            this.flowInstanceId = builder.flowInstanceId;
            this.flowName = builder.flowName;
            this.offsetTime = builder.offsetTime;
            this.projectId = builder.projectId;
            this.startTime = builder.startTime;
            this.status = builder.status;
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
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return failureInfo
         */
        public String getFailureInfo() {
            return this.failureInfo;
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

        public static final class Builder {
            private Integer batchProgress; 
            private String clusterId; 
            private Long duration; 
            private String endTime; 
            private String failureInfo; 
            private String flowId; 
            private String flowInstanceId; 
            private String flowName; 
            private Integer offsetTime; 
            private String projectId; 
            private String startTime; 
            private String status; 

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
             * FailureInfo.
             */
            public Builder failureInfo(String failureInfo) {
                this.failureInfo = failureInfo;
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

            public WorkflowLastRunInstance build() {
                return new WorkflowLastRunInstance(this);
            } 

        } 

    }
    public static class BlueprintInstances extends TeaModel {
        @NameInMap("BatchProgress")
        private Integer batchProgress;

        @NameInMap("BlueprintInstanceId")
        private String blueprintInstanceId;

        @NameInMap("BlueprintType")
        private String blueprintType;

        @NameInMap("Creator")
        private Long creator;

        @NameInMap("CreatorLoginName")
        private String creatorLoginName;

        @NameInMap("DataSourceConfig")
        private String dataSourceConfig;

        @NameInMap("ExecuteCapacity")
        private String executeCapacity;

        @NameInMap("ExecuteParameters")
        private String executeParameters;

        @NameInMap("ExecuteType")
        private String executeType;

        @NameInMap("FailureInfo")
        private String failureInfo;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Name")
        private String name;

        @NameInMap("OffsetTime")
        private Integer offsetTime;

        @NameInMap("Owner")
        private Long owner;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TargetDatabase")
        private String targetDatabase;

        @NameInMap("TargetFormat")
        private String targetFormat;

        @NameInMap("TargetLocationUri")
        private String targetLocationUri;

        @NameInMap("TargetPartitions")
        private String targetPartitions;

        @NameInMap("TargetTable")
        private String targetTable;

        @NameInMap("Workflow")
        private Workflow workflow;

        @NameInMap("WorkflowId")
        private String workflowId;

        @NameInMap("WorkflowLastRunInstance")
        private WorkflowLastRunInstance workflowLastRunInstance;

        @NameInMap("WorkflowProjectId")
        private String workflowProjectId;

        private BlueprintInstances(Builder builder) {
            this.batchProgress = builder.batchProgress;
            this.blueprintInstanceId = builder.blueprintInstanceId;
            this.blueprintType = builder.blueprintType;
            this.creator = builder.creator;
            this.creatorLoginName = builder.creatorLoginName;
            this.dataSourceConfig = builder.dataSourceConfig;
            this.executeCapacity = builder.executeCapacity;
            this.executeParameters = builder.executeParameters;
            this.executeType = builder.executeType;
            this.failureInfo = builder.failureInfo;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.name = builder.name;
            this.offsetTime = builder.offsetTime;
            this.owner = builder.owner;
            this.regionId = builder.regionId;
            this.roleName = builder.roleName;
            this.status = builder.status;
            this.targetDatabase = builder.targetDatabase;
            this.targetFormat = builder.targetFormat;
            this.targetLocationUri = builder.targetLocationUri;
            this.targetPartitions = builder.targetPartitions;
            this.targetTable = builder.targetTable;
            this.workflow = builder.workflow;
            this.workflowId = builder.workflowId;
            this.workflowLastRunInstance = builder.workflowLastRunInstance;
            this.workflowProjectId = builder.workflowProjectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlueprintInstances create() {
            return builder().build();
        }

        /**
         * @return batchProgress
         */
        public Integer getBatchProgress() {
            return this.batchProgress;
        }

        /**
         * @return blueprintInstanceId
         */
        public String getBlueprintInstanceId() {
            return this.blueprintInstanceId;
        }

        /**
         * @return blueprintType
         */
        public String getBlueprintType() {
            return this.blueprintType;
        }

        /**
         * @return creator
         */
        public Long getCreator() {
            return this.creator;
        }

        /**
         * @return creatorLoginName
         */
        public String getCreatorLoginName() {
            return this.creatorLoginName;
        }

        /**
         * @return dataSourceConfig
         */
        public String getDataSourceConfig() {
            return this.dataSourceConfig;
        }

        /**
         * @return executeCapacity
         */
        public String getExecuteCapacity() {
            return this.executeCapacity;
        }

        /**
         * @return executeParameters
         */
        public String getExecuteParameters() {
            return this.executeParameters;
        }

        /**
         * @return executeType
         */
        public String getExecuteType() {
            return this.executeType;
        }

        /**
         * @return failureInfo
         */
        public String getFailureInfo() {
            return this.failureInfo;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return offsetTime
         */
        public Integer getOffsetTime() {
            return this.offsetTime;
        }

        /**
         * @return owner
         */
        public Long getOwner() {
            return this.owner;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return targetDatabase
         */
        public String getTargetDatabase() {
            return this.targetDatabase;
        }

        /**
         * @return targetFormat
         */
        public String getTargetFormat() {
            return this.targetFormat;
        }

        /**
         * @return targetLocationUri
         */
        public String getTargetLocationUri() {
            return this.targetLocationUri;
        }

        /**
         * @return targetPartitions
         */
        public String getTargetPartitions() {
            return this.targetPartitions;
        }

        /**
         * @return targetTable
         */
        public String getTargetTable() {
            return this.targetTable;
        }

        /**
         * @return workflow
         */
        public Workflow getWorkflow() {
            return this.workflow;
        }

        /**
         * @return workflowId
         */
        public String getWorkflowId() {
            return this.workflowId;
        }

        /**
         * @return workflowLastRunInstance
         */
        public WorkflowLastRunInstance getWorkflowLastRunInstance() {
            return this.workflowLastRunInstance;
        }

        /**
         * @return workflowProjectId
         */
        public String getWorkflowProjectId() {
            return this.workflowProjectId;
        }

        public static final class Builder {
            private Integer batchProgress; 
            private String blueprintInstanceId; 
            private String blueprintType; 
            private Long creator; 
            private String creatorLoginName; 
            private String dataSourceConfig; 
            private String executeCapacity; 
            private String executeParameters; 
            private String executeType; 
            private String failureInfo; 
            private String gmtCreate; 
            private String gmtModified; 
            private String name; 
            private Integer offsetTime; 
            private Long owner; 
            private String regionId; 
            private String roleName; 
            private Integer status; 
            private String targetDatabase; 
            private String targetFormat; 
            private String targetLocationUri; 
            private String targetPartitions; 
            private String targetTable; 
            private Workflow workflow; 
            private String workflowId; 
            private WorkflowLastRunInstance workflowLastRunInstance; 
            private String workflowProjectId; 

            /**
             * BatchProgress.
             */
            public Builder batchProgress(Integer batchProgress) {
                this.batchProgress = batchProgress;
                return this;
            }

            /**
             * BlueprintInstanceId.
             */
            public Builder blueprintInstanceId(String blueprintInstanceId) {
                this.blueprintInstanceId = blueprintInstanceId;
                return this;
            }

            /**
             * BlueprintType.
             */
            public Builder blueprintType(String blueprintType) {
                this.blueprintType = blueprintType;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(Long creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CreatorLoginName.
             */
            public Builder creatorLoginName(String creatorLoginName) {
                this.creatorLoginName = creatorLoginName;
                return this;
            }

            /**
             * DataSourceConfig.
             */
            public Builder dataSourceConfig(String dataSourceConfig) {
                this.dataSourceConfig = dataSourceConfig;
                return this;
            }

            /**
             * ExecuteCapacity.
             */
            public Builder executeCapacity(String executeCapacity) {
                this.executeCapacity = executeCapacity;
                return this;
            }

            /**
             * ExecuteParameters.
             */
            public Builder executeParameters(String executeParameters) {
                this.executeParameters = executeParameters;
                return this;
            }

            /**
             * ExecuteType.
             */
            public Builder executeType(String executeType) {
                this.executeType = executeType;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Owner.
             */
            public Builder owner(Long owner) {
                this.owner = owner;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TargetDatabase.
             */
            public Builder targetDatabase(String targetDatabase) {
                this.targetDatabase = targetDatabase;
                return this;
            }

            /**
             * TargetFormat.
             */
            public Builder targetFormat(String targetFormat) {
                this.targetFormat = targetFormat;
                return this;
            }

            /**
             * TargetLocationUri.
             */
            public Builder targetLocationUri(String targetLocationUri) {
                this.targetLocationUri = targetLocationUri;
                return this;
            }

            /**
             * TargetPartitions.
             */
            public Builder targetPartitions(String targetPartitions) {
                this.targetPartitions = targetPartitions;
                return this;
            }

            /**
             * TargetTable.
             */
            public Builder targetTable(String targetTable) {
                this.targetTable = targetTable;
                return this;
            }

            /**
             * Workflow.
             */
            public Builder workflow(Workflow workflow) {
                this.workflow = workflow;
                return this;
            }

            /**
             * WorkflowId.
             */
            public Builder workflowId(String workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            /**
             * WorkflowLastRunInstance.
             */
            public Builder workflowLastRunInstance(WorkflowLastRunInstance workflowLastRunInstance) {
                this.workflowLastRunInstance = workflowLastRunInstance;
                return this;
            }

            /**
             * WorkflowProjectId.
             */
            public Builder workflowProjectId(String workflowProjectId) {
                this.workflowProjectId = workflowProjectId;
                return this;
            }

            public BlueprintInstances build() {
                return new BlueprintInstances(this);
            } 

        } 

    }
}
