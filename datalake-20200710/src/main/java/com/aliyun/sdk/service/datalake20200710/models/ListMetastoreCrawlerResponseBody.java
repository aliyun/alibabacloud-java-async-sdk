// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMetastoreCrawlerResponseBody} extends {@link TeaModel}
 *
 * <p>ListMetastoreCrawlerResponseBody</p>
 */
public class ListMetastoreCrawlerResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListMetastoreCrawlerResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetastoreCrawlerResponseBody create() {
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

        public ListMetastoreCrawlerResponseBody build() {
            return new ListMetastoreCrawlerResponseBody(this);
        } 

    } 

    public static class WorkflowLastRunInstance extends TeaModel {
        @NameInMap("BatchProgress")
        private Integer batchProgress;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Duration")
        private Integer duration;

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

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        private WorkflowLastRunInstance(Builder builder) {
            this.batchProgress = builder.batchProgress;
            this.clusterId = builder.clusterId;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.failureInfo = builder.failureInfo;
            this.flowExtendResult = builder.flowExtendResult;
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
        public Integer getDuration() {
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
            private String clusterId; 
            private Integer duration; 
            private Long endTime; 
            private String failureInfo; 
            private String flowExtendResult; 
            private String flowId; 
            private String flowInstanceId; 
            private String flowName; 
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
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
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

            public WorkflowLastRunInstance build() {
                return new WorkflowLastRunInstance(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Creator")
        private String creator;

        @NameInMap("CreatorLoginName")
        private String creatorLoginName;

        @NameInMap("DatasourceExcludePath")
        private String datasourceExcludePath;

        @NameInMap("DatasourcePath")
        private String datasourcePath;

        @NameInMap("DatasourceType")
        private String datasourceType;

        @NameInMap("ExecuteMode")
        private String executeMode;

        @NameInMap("ExecuteType")
        private String executeType;

        @NameInMap("FileFormat")
        private String fileFormat;

        @NameInMap("FileFormatConfig")
        private String fileFormatConfig;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("Status")
        private String status;

        @NameInMap("Success")
        private Boolean success;

        @NameInMap("TargetDatabase")
        private String targetDatabase;

        @NameInMap("TargetTablePrefix")
        private String targetTablePrefix;

        @NameInMap("TargetUpdateStrategy")
        private String targetUpdateStrategy;

        @NameInMap("WorkflowLastRunInstance")
        private WorkflowLastRunInstance workflowLastRunInstance;

        private Data(Builder builder) {
            this.creator = builder.creator;
            this.creatorLoginName = builder.creatorLoginName;
            this.datasourceExcludePath = builder.datasourceExcludePath;
            this.datasourcePath = builder.datasourcePath;
            this.datasourceType = builder.datasourceType;
            this.executeMode = builder.executeMode;
            this.executeType = builder.executeType;
            this.fileFormat = builder.fileFormat;
            this.fileFormatConfig = builder.fileFormatConfig;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.owner = builder.owner;
            this.regionId = builder.regionId;
            this.roleName = builder.roleName;
            this.status = builder.status;
            this.success = builder.success;
            this.targetDatabase = builder.targetDatabase;
            this.targetTablePrefix = builder.targetTablePrefix;
            this.targetUpdateStrategy = builder.targetUpdateStrategy;
            this.workflowLastRunInstance = builder.workflowLastRunInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorLoginName
         */
        public String getCreatorLoginName() {
            return this.creatorLoginName;
        }

        /**
         * @return datasourceExcludePath
         */
        public String getDatasourceExcludePath() {
            return this.datasourceExcludePath;
        }

        /**
         * @return datasourcePath
         */
        public String getDatasourcePath() {
            return this.datasourcePath;
        }

        /**
         * @return datasourceType
         */
        public String getDatasourceType() {
            return this.datasourceType;
        }

        /**
         * @return executeMode
         */
        public String getExecuteMode() {
            return this.executeMode;
        }

        /**
         * @return executeType
         */
        public String getExecuteType() {
            return this.executeType;
        }

        /**
         * @return fileFormat
         */
        public String getFileFormat() {
            return this.fileFormat;
        }

        /**
         * @return fileFormatConfig
         */
        public String getFileFormatConfig() {
            return this.fileFormatConfig;
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
         * @return id
         */
        public String getId() {
            return this.id;
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
        public String getStatus() {
            return this.status;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return targetDatabase
         */
        public String getTargetDatabase() {
            return this.targetDatabase;
        }

        /**
         * @return targetTablePrefix
         */
        public String getTargetTablePrefix() {
            return this.targetTablePrefix;
        }

        /**
         * @return targetUpdateStrategy
         */
        public String getTargetUpdateStrategy() {
            return this.targetUpdateStrategy;
        }

        /**
         * @return workflowLastRunInstance
         */
        public WorkflowLastRunInstance getWorkflowLastRunInstance() {
            return this.workflowLastRunInstance;
        }

        public static final class Builder {
            private String creator; 
            private String creatorLoginName; 
            private String datasourceExcludePath; 
            private String datasourcePath; 
            private String datasourceType; 
            private String executeMode; 
            private String executeType; 
            private String fileFormat; 
            private String fileFormatConfig; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private String name; 
            private String owner; 
            private String regionId; 
            private String roleName; 
            private String status; 
            private Boolean success; 
            private String targetDatabase; 
            private String targetTablePrefix; 
            private String targetUpdateStrategy; 
            private WorkflowLastRunInstance workflowLastRunInstance; 

            /**
             * Creator.
             */
            public Builder creator(String creator) {
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
             * DatasourceExcludePath.
             */
            public Builder datasourceExcludePath(String datasourceExcludePath) {
                this.datasourceExcludePath = datasourceExcludePath;
                return this;
            }

            /**
             * DatasourcePath.
             */
            public Builder datasourcePath(String datasourcePath) {
                this.datasourcePath = datasourcePath;
                return this;
            }

            /**
             * DatasourceType.
             */
            public Builder datasourceType(String datasourceType) {
                this.datasourceType = datasourceType;
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
             * ExecuteType.
             */
            public Builder executeType(String executeType) {
                this.executeType = executeType;
                return this;
            }

            /**
             * FileFormat.
             */
            public Builder fileFormat(String fileFormat) {
                this.fileFormat = fileFormat;
                return this;
            }

            /**
             * FileFormatConfig.
             */
            public Builder fileFormatConfig(String fileFormatConfig) {
                this.fileFormatConfig = fileFormatConfig;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
            public Builder status(String status) {
                this.status = status;
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
             * TargetDatabase.
             */
            public Builder targetDatabase(String targetDatabase) {
                this.targetDatabase = targetDatabase;
                return this;
            }

            /**
             * TargetTablePrefix.
             */
            public Builder targetTablePrefix(String targetTablePrefix) {
                this.targetTablePrefix = targetTablePrefix;
                return this;
            }

            /**
             * TargetUpdateStrategy.
             */
            public Builder targetUpdateStrategy(String targetUpdateStrategy) {
                this.targetUpdateStrategy = targetUpdateStrategy;
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
