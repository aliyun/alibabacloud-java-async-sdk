// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBlueprintInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetBlueprintInstanceResponseBody</p>
 */
public class GetBlueprintInstanceResponseBody extends TeaModel {
    @NameInMap("BlueprintInstance")
    private BlueprintInstance blueprintInstance;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private GetBlueprintInstanceResponseBody(Builder builder) {
        this.blueprintInstance = builder.blueprintInstance;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBlueprintInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return blueprintInstance
     */
    public BlueprintInstance getBlueprintInstance() {
        return this.blueprintInstance;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private BlueprintInstance blueprintInstance; 
        private String requestId; 
        private String success; 

        /**
         * BlueprintInstance.
         */
        public Builder blueprintInstance(BlueprintInstance blueprintInstance) {
            this.blueprintInstance = blueprintInstance;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetBlueprintInstanceResponseBody build() {
            return new GetBlueprintInstanceResponseBody(this);
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

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        private WorkflowLastRunInstance(Builder builder) {
            this.clusterId = builder.clusterId;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.failureInfo = builder.failureInfo;
            this.flowId = builder.flowId;
            this.flowInstanceId = builder.flowInstanceId;
            this.flowName = builder.flowName;
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
            private String clusterId; 
            private Long duration; 
            private String endTime; 
            private String failureInfo; 
            private String flowId; 
            private String flowInstanceId; 
            private String flowName; 
            private String projectId; 
            private String startTime; 
            private String status; 

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
    public static class BlueprintInstance extends TeaModel {
        @NameInMap("BlueprintInstanceId")
        private String blueprintInstanceId;

        @NameInMap("BlueprintType")
        private String blueprintType;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("DataSourceConfig")
        private String dataSourceConfig;

        @NameInMap("ExecuteCapacity")
        private Long executeCapacity;

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

        @NameInMap("Owner")
        private String owner;

        @NameInMap("PreProcessingConfig")
        private String preProcessingConfig;

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

        private BlueprintInstance(Builder builder) {
            this.blueprintInstanceId = builder.blueprintInstanceId;
            this.blueprintType = builder.blueprintType;
            this.creator = builder.creator;
            this.dataSourceConfig = builder.dataSourceConfig;
            this.executeCapacity = builder.executeCapacity;
            this.executeParameters = builder.executeParameters;
            this.executeType = builder.executeType;
            this.failureInfo = builder.failureInfo;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.name = builder.name;
            this.owner = builder.owner;
            this.preProcessingConfig = builder.preProcessingConfig;
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

        public static BlueprintInstance create() {
            return builder().build();
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
        public String getCreator() {
            return this.creator;
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
        public Long getExecuteCapacity() {
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
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return preProcessingConfig
         */
        public String getPreProcessingConfig() {
            return this.preProcessingConfig;
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
            private String blueprintInstanceId; 
            private String blueprintType; 
            private String creator; 
            private String dataSourceConfig; 
            private Long executeCapacity; 
            private String executeParameters; 
            private String executeType; 
            private String failureInfo; 
            private String gmtCreate; 
            private String gmtModified; 
            private String name; 
            private String owner; 
            private String preProcessingConfig; 
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
            public Builder creator(String creator) {
                this.creator = creator;
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
            public Builder executeCapacity(Long executeCapacity) {
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
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * PreProcessingConfig.
             */
            public Builder preProcessingConfig(String preProcessingConfig) {
                this.preProcessingConfig = preProcessingConfig;
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

            public BlueprintInstance build() {
                return new BlueprintInstance(this);
            } 

        } 

    }
}
