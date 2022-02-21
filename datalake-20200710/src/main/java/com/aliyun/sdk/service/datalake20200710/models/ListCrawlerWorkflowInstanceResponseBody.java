// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCrawlerWorkflowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListCrawlerWorkflowInstanceResponseBody</p>
 */
public class ListCrawlerWorkflowInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListCrawlerWorkflowInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCrawlerWorkflowInstanceResponseBody create() {
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

        public ListCrawlerWorkflowInstanceResponseBody build() {
            return new ListCrawlerWorkflowInstanceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BatchProgress")
        private Integer batchProgress;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CrawlerId")
        private String crawlerId;

        @NameInMap("CrawlerIsDelete")
        private Boolean crawlerIsDelete;

        @NameInMap("Creator")
        private Long creator;

        @NameInMap("DatasourceExcludePath")
        private String datasourceExcludePath;

        @NameInMap("DatasourcePath")
        private String datasourcePath;

        @NameInMap("DatasourceType")
        private String datasourceType;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ExecuteCron")
        private String executeCron;

        @NameInMap("ExecuteMode")
        private String executeMode;

        @NameInMap("ExecuteType")
        private String executeType;

        @NameInMap("FailureInfo")
        private String failureInfo;

        @NameInMap("FileFormat")
        private String fileFormat;

        @NameInMap("FileFormatConfig")
        private String fileFormatConfig;

        @NameInMap("FlowExtendResult")
        private String flowExtendResult;

        @NameInMap("FlowId")
        private String flowId;

        @NameInMap("FlowInstanceId")
        private String flowInstanceId;

        @NameInMap("FlowName")
        private String flowName;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
        private Long owner;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TargetDatabase")
        private String targetDatabase;

        @NameInMap("TargetTablePrefix")
        private String targetTablePrefix;

        @NameInMap("TargetUpdateStrategy")
        private String targetUpdateStrategy;

        private Data(Builder builder) {
            this.batchProgress = builder.batchProgress;
            this.clusterId = builder.clusterId;
            this.crawlerId = builder.crawlerId;
            this.crawlerIsDelete = builder.crawlerIsDelete;
            this.creator = builder.creator;
            this.datasourceExcludePath = builder.datasourceExcludePath;
            this.datasourcePath = builder.datasourcePath;
            this.datasourceType = builder.datasourceType;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.executeCron = builder.executeCron;
            this.executeMode = builder.executeMode;
            this.executeType = builder.executeType;
            this.failureInfo = builder.failureInfo;
            this.fileFormat = builder.fileFormat;
            this.fileFormatConfig = builder.fileFormatConfig;
            this.flowExtendResult = builder.flowExtendResult;
            this.flowId = builder.flowId;
            this.flowInstanceId = builder.flowInstanceId;
            this.flowName = builder.flowName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.regionId = builder.regionId;
            this.roleName = builder.roleName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.targetDatabase = builder.targetDatabase;
            this.targetTablePrefix = builder.targetTablePrefix;
            this.targetUpdateStrategy = builder.targetUpdateStrategy;
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
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return crawlerId
         */
        public String getCrawlerId() {
            return this.crawlerId;
        }

        /**
         * @return crawlerIsDelete
         */
        public Boolean getCrawlerIsDelete() {
            return this.crawlerIsDelete;
        }

        /**
         * @return creator
         */
        public Long getCreator() {
            return this.creator;
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
         * @return executeCron
         */
        public String getExecuteCron() {
            return this.executeCron;
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
         * @return failureInfo
         */
        public String getFailureInfo() {
            return this.failureInfo;
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
        public Long getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
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

        public static final class Builder {
            private Integer batchProgress; 
            private String clusterId; 
            private String crawlerId; 
            private Boolean crawlerIsDelete; 
            private Long creator; 
            private String datasourceExcludePath; 
            private String datasourcePath; 
            private String datasourceType; 
            private Integer duration; 
            private Long endTime; 
            private String executeCron; 
            private String executeMode; 
            private String executeType; 
            private String failureInfo; 
            private String fileFormat; 
            private String fileFormatConfig; 
            private String flowExtendResult; 
            private String flowId; 
            private String flowInstanceId; 
            private String flowName; 
            private String gmtCreate; 
            private String gmtModified; 
            private String name; 
            private Long owner; 
            private String projectId; 
            private String regionId; 
            private String roleName; 
            private Long startTime; 
            private String status; 
            private String targetDatabase; 
            private String targetTablePrefix; 
            private String targetUpdateStrategy; 

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
             * CrawlerId.
             */
            public Builder crawlerId(String crawlerId) {
                this.crawlerId = crawlerId;
                return this;
            }

            /**
             * CrawlerIsDelete.
             */
            public Builder crawlerIsDelete(Boolean crawlerIsDelete) {
                this.crawlerIsDelete = crawlerIsDelete;
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
             * ExecuteCron.
             */
            public Builder executeCron(String executeCron) {
                this.executeCron = executeCron;
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
             * FailureInfo.
             */
            public Builder failureInfo(String failureInfo) {
                this.failureInfo = failureInfo;
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
            public Builder owner(Long owner) {
                this.owner = owner;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
