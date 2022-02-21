// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlueprintInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBlueprintInstanceResponseBody</p>
 */
public class DescribeBlueprintInstanceResponseBody extends TeaModel {
    @NameInMap("BlueprintInstance")
    private BlueprintInstance blueprintInstance;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private DescribeBlueprintInstanceResponseBody(Builder builder) {
        this.blueprintInstance = builder.blueprintInstance;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlueprintInstanceResponseBody create() {
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

        public DescribeBlueprintInstanceResponseBody build() {
            return new DescribeBlueprintInstanceResponseBody(this);
        } 

    } 

    public static class LastRunFlowInstance extends TeaModel {
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

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        private LastRunFlowInstance(Builder builder) {
            this.clusterId = builder.clusterId;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.flowId = builder.flowId;
            this.flowInstanceId = builder.flowInstanceId;
            this.flowName = builder.flowName;
            this.projectId = builder.projectId;
            this.reason = builder.reason;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastRunFlowInstance create() {
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
         * @return reason
         */
        public String getReason() {
            return this.reason;
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
            private String flowId; 
            private String flowInstanceId; 
            private String flowName; 
            private String projectId; 
            private String reason; 
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
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
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

            public LastRunFlowInstance build() {
                return new LastRunFlowInstance(this);
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

        @NameInMap("EmrFlowId")
        private String emrFlowId;

        @NameInMap("EmrFlowProjectId")
        private String emrFlowProjectId;

        @NameInMap("EmrFlowScheduleStatus")
        private String emrFlowScheduleStatus;

        @NameInMap("ExecuteCapacity")
        private Long executeCapacity;

        @NameInMap("ExecuteParameters")
        private String executeParameters;

        @NameInMap("ExecuteType")
        private String executeType;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("LastRunFlowInstance")
        private LastRunFlowInstance lastRunFlowInstance;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("PreProcessingConfig")
        private String preProcessingConfig;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RoleName")
        private Long roleName;

        @NameInMap("SourceChannelId")
        private String sourceChannelId;

        @NameInMap("SourceChannelName")
        private String sourceChannelName;

        @NameInMap("SourceChannelType")
        private String sourceChannelType;

        @NameInMap("SourceDataSourceId")
        private String sourceDataSourceId;

        @NameInMap("SourceDataSourceName")
        private String sourceDataSourceName;

        @NameInMap("SourceFormat")
        private String sourceFormat;

        @NameInMap("SourceInclude")
        private String sourceInclude;

        @NameInMap("SourceLocationUri")
        private String sourceLocationUri;

        @NameInMap("SourcePrimaryColumn")
        private String sourcePrimaryColumn;

        @NameInMap("SourceSchema")
        private String sourceSchema;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TargetDatabase")
        private String targetDatabase;

        @NameInMap("TargetFormat")
        private String targetFormat;

        @NameInMap("TargetLocationUri")
        private String targetLocationUri;

        @NameInMap("TargetTablePrefix")
        private String targetTablePrefix;

        private BlueprintInstance(Builder builder) {
            this.blueprintInstanceId = builder.blueprintInstanceId;
            this.blueprintType = builder.blueprintType;
            this.creator = builder.creator;
            this.dataSourceConfig = builder.dataSourceConfig;
            this.emrFlowId = builder.emrFlowId;
            this.emrFlowProjectId = builder.emrFlowProjectId;
            this.emrFlowScheduleStatus = builder.emrFlowScheduleStatus;
            this.executeCapacity = builder.executeCapacity;
            this.executeParameters = builder.executeParameters;
            this.executeType = builder.executeType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.lastRunFlowInstance = builder.lastRunFlowInstance;
            this.name = builder.name;
            this.owner = builder.owner;
            this.preProcessingConfig = builder.preProcessingConfig;
            this.reason = builder.reason;
            this.regionId = builder.regionId;
            this.roleName = builder.roleName;
            this.sourceChannelId = builder.sourceChannelId;
            this.sourceChannelName = builder.sourceChannelName;
            this.sourceChannelType = builder.sourceChannelType;
            this.sourceDataSourceId = builder.sourceDataSourceId;
            this.sourceDataSourceName = builder.sourceDataSourceName;
            this.sourceFormat = builder.sourceFormat;
            this.sourceInclude = builder.sourceInclude;
            this.sourceLocationUri = builder.sourceLocationUri;
            this.sourcePrimaryColumn = builder.sourcePrimaryColumn;
            this.sourceSchema = builder.sourceSchema;
            this.status = builder.status;
            this.targetDatabase = builder.targetDatabase;
            this.targetFormat = builder.targetFormat;
            this.targetLocationUri = builder.targetLocationUri;
            this.targetTablePrefix = builder.targetTablePrefix;
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
         * @return emrFlowId
         */
        public String getEmrFlowId() {
            return this.emrFlowId;
        }

        /**
         * @return emrFlowProjectId
         */
        public String getEmrFlowProjectId() {
            return this.emrFlowProjectId;
        }

        /**
         * @return emrFlowScheduleStatus
         */
        public String getEmrFlowScheduleStatus() {
            return this.emrFlowScheduleStatus;
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
         * @return lastRunFlowInstance
         */
        public LastRunFlowInstance getLastRunFlowInstance() {
            return this.lastRunFlowInstance;
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
         * @return reason
         */
        public String getReason() {
            return this.reason;
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
        public Long getRoleName() {
            return this.roleName;
        }

        /**
         * @return sourceChannelId
         */
        public String getSourceChannelId() {
            return this.sourceChannelId;
        }

        /**
         * @return sourceChannelName
         */
        public String getSourceChannelName() {
            return this.sourceChannelName;
        }

        /**
         * @return sourceChannelType
         */
        public String getSourceChannelType() {
            return this.sourceChannelType;
        }

        /**
         * @return sourceDataSourceId
         */
        public String getSourceDataSourceId() {
            return this.sourceDataSourceId;
        }

        /**
         * @return sourceDataSourceName
         */
        public String getSourceDataSourceName() {
            return this.sourceDataSourceName;
        }

        /**
         * @return sourceFormat
         */
        public String getSourceFormat() {
            return this.sourceFormat;
        }

        /**
         * @return sourceInclude
         */
        public String getSourceInclude() {
            return this.sourceInclude;
        }

        /**
         * @return sourceLocationUri
         */
        public String getSourceLocationUri() {
            return this.sourceLocationUri;
        }

        /**
         * @return sourcePrimaryColumn
         */
        public String getSourcePrimaryColumn() {
            return this.sourcePrimaryColumn;
        }

        /**
         * @return sourceSchema
         */
        public String getSourceSchema() {
            return this.sourceSchema;
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
         * @return targetTablePrefix
         */
        public String getTargetTablePrefix() {
            return this.targetTablePrefix;
        }

        public static final class Builder {
            private String blueprintInstanceId; 
            private String blueprintType; 
            private String creator; 
            private String dataSourceConfig; 
            private String emrFlowId; 
            private String emrFlowProjectId; 
            private String emrFlowScheduleStatus; 
            private Long executeCapacity; 
            private String executeParameters; 
            private String executeType; 
            private String gmtCreate; 
            private String gmtModified; 
            private LastRunFlowInstance lastRunFlowInstance; 
            private String name; 
            private String owner; 
            private String preProcessingConfig; 
            private String reason; 
            private String regionId; 
            private Long roleName; 
            private String sourceChannelId; 
            private String sourceChannelName; 
            private String sourceChannelType; 
            private String sourceDataSourceId; 
            private String sourceDataSourceName; 
            private String sourceFormat; 
            private String sourceInclude; 
            private String sourceLocationUri; 
            private String sourcePrimaryColumn; 
            private String sourceSchema; 
            private Integer status; 
            private String targetDatabase; 
            private String targetFormat; 
            private String targetLocationUri; 
            private String targetTablePrefix; 

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
             * EmrFlowId.
             */
            public Builder emrFlowId(String emrFlowId) {
                this.emrFlowId = emrFlowId;
                return this;
            }

            /**
             * EmrFlowProjectId.
             */
            public Builder emrFlowProjectId(String emrFlowProjectId) {
                this.emrFlowProjectId = emrFlowProjectId;
                return this;
            }

            /**
             * EmrFlowScheduleStatus.
             */
            public Builder emrFlowScheduleStatus(String emrFlowScheduleStatus) {
                this.emrFlowScheduleStatus = emrFlowScheduleStatus;
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
             * LastRunFlowInstance.
             */
            public Builder lastRunFlowInstance(LastRunFlowInstance lastRunFlowInstance) {
                this.lastRunFlowInstance = lastRunFlowInstance;
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
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
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
            public Builder roleName(Long roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * SourceChannelId.
             */
            public Builder sourceChannelId(String sourceChannelId) {
                this.sourceChannelId = sourceChannelId;
                return this;
            }

            /**
             * SourceChannelName.
             */
            public Builder sourceChannelName(String sourceChannelName) {
                this.sourceChannelName = sourceChannelName;
                return this;
            }

            /**
             * SourceChannelType.
             */
            public Builder sourceChannelType(String sourceChannelType) {
                this.sourceChannelType = sourceChannelType;
                return this;
            }

            /**
             * SourceDataSourceId.
             */
            public Builder sourceDataSourceId(String sourceDataSourceId) {
                this.sourceDataSourceId = sourceDataSourceId;
                return this;
            }

            /**
             * SourceDataSourceName.
             */
            public Builder sourceDataSourceName(String sourceDataSourceName) {
                this.sourceDataSourceName = sourceDataSourceName;
                return this;
            }

            /**
             * SourceFormat.
             */
            public Builder sourceFormat(String sourceFormat) {
                this.sourceFormat = sourceFormat;
                return this;
            }

            /**
             * SourceInclude.
             */
            public Builder sourceInclude(String sourceInclude) {
                this.sourceInclude = sourceInclude;
                return this;
            }

            /**
             * SourceLocationUri.
             */
            public Builder sourceLocationUri(String sourceLocationUri) {
                this.sourceLocationUri = sourceLocationUri;
                return this;
            }

            /**
             * SourcePrimaryColumn.
             */
            public Builder sourcePrimaryColumn(String sourcePrimaryColumn) {
                this.sourcePrimaryColumn = sourcePrimaryColumn;
                return this;
            }

            /**
             * SourceSchema.
             */
            public Builder sourceSchema(String sourceSchema) {
                this.sourceSchema = sourceSchema;
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
             * TargetTablePrefix.
             */
            public Builder targetTablePrefix(String targetTablePrefix) {
                this.targetTablePrefix = targetTablePrefix;
                return this;
            }

            public BlueprintInstance build() {
                return new BlueprintInstance(this);
            } 

        } 

    }
}
