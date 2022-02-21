// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineInstHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetPipelineInstHistoryResponseBody</p>
 */
public class GetPipelineInstHistoryResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetPipelineInstHistoryResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineInstHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorCode; 
        private String errorMessage; 
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public GetPipelineInstHistoryResponseBody build() {
            return new GetPipelineInstHistoryResponseBody(this);
        } 

    } 

    public static class Groups extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("DeleteStatus")
        private String deleteStatus;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("FlowInstId")
        private Integer flowInstId;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("IdExtent")
        private Integer idExtent;

        @NameInMap("Modifier")
        private String modifier;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("ResultStatus")
        private String resultStatus;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        private Groups(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.deleteStatus = builder.deleteStatus;
            this.endTime = builder.endTime;
            this.flowInstId = builder.flowInstId;
            this.id = builder.id;
            this.idExtent = builder.idExtent;
            this.modifier = builder.modifier;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.resultStatus = builder.resultStatus;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return deleteStatus
         */
        public String getDeleteStatus() {
            return this.deleteStatus;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return flowInstId
         */
        public Integer getFlowInstId() {
            return this.flowInstId;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return idExtent
         */
        public Integer getIdExtent() {
            return this.idExtent;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resultStatus
         */
        public String getResultStatus() {
            return this.resultStatus;
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
            private Long createTime; 
            private String creator; 
            private String deleteStatus; 
            private Long endTime; 
            private Integer flowInstId; 
            private Integer id; 
            private Integer idExtent; 
            private String modifier; 
            private Long modifyTime; 
            private String name; 
            private String resultStatus; 
            private Long startTime; 
            private String status; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * DeleteStatus.
             */
            public Builder deleteStatus(String deleteStatus) {
                this.deleteStatus = deleteStatus;
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
             * FlowInstId.
             */
            public Builder flowInstId(Integer flowInstId) {
                this.flowInstId = flowInstId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * IdExtent.
             */
            public Builder idExtent(Integer idExtent) {
                this.idExtent = idExtent;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
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
             * ResultStatus.
             */
            public Builder resultStatus(String resultStatus) {
                this.resultStatus = resultStatus;
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

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Caches")
        private String caches;

        @NameInMap("DateTime")
        private String dateTime;

        @NameInMap("EnginePipelineId")
        private Integer enginePipelineId;

        @NameInMap("EnginePipelineInstId")
        private Integer enginePipelineInstId;

        @NameInMap("EnginePipelineName")
        private String enginePipelineName;

        @NameInMap("EnginePipelineNumber")
        private Integer enginePipelineNumber;

        @NameInMap("MixFlowInstId")
        private String mixFlowInstId;

        @NameInMap("Sources")
        private String sources;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("TriggerMode")
        private String triggerMode;

        private Result(Builder builder) {
            this.caches = builder.caches;
            this.dateTime = builder.dateTime;
            this.enginePipelineId = builder.enginePipelineId;
            this.enginePipelineInstId = builder.enginePipelineInstId;
            this.enginePipelineName = builder.enginePipelineName;
            this.enginePipelineNumber = builder.enginePipelineNumber;
            this.mixFlowInstId = builder.mixFlowInstId;
            this.sources = builder.sources;
            this.timeStamp = builder.timeStamp;
            this.triggerMode = builder.triggerMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return caches
         */
        public String getCaches() {
            return this.caches;
        }

        /**
         * @return dateTime
         */
        public String getDateTime() {
            return this.dateTime;
        }

        /**
         * @return enginePipelineId
         */
        public Integer getEnginePipelineId() {
            return this.enginePipelineId;
        }

        /**
         * @return enginePipelineInstId
         */
        public Integer getEnginePipelineInstId() {
            return this.enginePipelineInstId;
        }

        /**
         * @return enginePipelineName
         */
        public String getEnginePipelineName() {
            return this.enginePipelineName;
        }

        /**
         * @return enginePipelineNumber
         */
        public Integer getEnginePipelineNumber() {
            return this.enginePipelineNumber;
        }

        /**
         * @return mixFlowInstId
         */
        public String getMixFlowInstId() {
            return this.mixFlowInstId;
        }

        /**
         * @return sources
         */
        public String getSources() {
            return this.sources;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return triggerMode
         */
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public static final class Builder {
            private String caches; 
            private String dateTime; 
            private Integer enginePipelineId; 
            private Integer enginePipelineInstId; 
            private String enginePipelineName; 
            private Integer enginePipelineNumber; 
            private String mixFlowInstId; 
            private String sources; 
            private String timeStamp; 
            private String triggerMode; 

            /**
             * Caches.
             */
            public Builder caches(String caches) {
                this.caches = caches;
                return this;
            }

            /**
             * DateTime.
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * EnginePipelineId.
             */
            public Builder enginePipelineId(Integer enginePipelineId) {
                this.enginePipelineId = enginePipelineId;
                return this;
            }

            /**
             * EnginePipelineInstId.
             */
            public Builder enginePipelineInstId(Integer enginePipelineInstId) {
                this.enginePipelineInstId = enginePipelineInstId;
                return this;
            }

            /**
             * EnginePipelineName.
             */
            public Builder enginePipelineName(String enginePipelineName) {
                this.enginePipelineName = enginePipelineName;
                return this;
            }

            /**
             * EnginePipelineNumber.
             */
            public Builder enginePipelineNumber(Integer enginePipelineNumber) {
                this.enginePipelineNumber = enginePipelineNumber;
                return this;
            }

            /**
             * MixFlowInstId.
             */
            public Builder mixFlowInstId(String mixFlowInstId) {
                this.mixFlowInstId = mixFlowInstId;
                return this;
            }

            /**
             * Sources.
             */
            public Builder sources(String sources) {
                this.sources = sources;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * TriggerMode.
             */
            public Builder triggerMode(String triggerMode) {
                this.triggerMode = triggerMode;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class FlowInstance extends TeaModel {
        @NameInMap("AutoDrivenStatus")
        private Boolean autoDrivenStatus;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("Groups")
        private java.util.List < Groups> groups;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Modifier")
        private String modifier;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("Result")
        private Result result;

        @NameInMap("ResultStatus")
        private String resultStatus;

        @NameInMap("RunningStatus")
        private String runningStatus;

        @NameInMap("StageTopo")
        private String stageTopo;

        @NameInMap("Stages")
        private java.util.Map < String, ? > stages;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusName")
        private String statusName;

        @NameInMap("SystemCode")
        private String systemCode;

        @NameInMap("SystemId")
        private String systemId;

        private FlowInstance(Builder builder) {
            this.autoDrivenStatus = builder.autoDrivenStatus;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.groups = builder.groups;
            this.id = builder.id;
            this.modifier = builder.modifier;
            this.modifyTime = builder.modifyTime;
            this.result = builder.result;
            this.resultStatus = builder.resultStatus;
            this.runningStatus = builder.runningStatus;
            this.stageTopo = builder.stageTopo;
            this.stages = builder.stages;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.systemCode = builder.systemCode;
            this.systemId = builder.systemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowInstance create() {
            return builder().build();
        }

        /**
         * @return autoDrivenStatus
         */
        public Boolean getAutoDrivenStatus() {
            return this.autoDrivenStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return groups
         */
        public java.util.List < Groups> getGroups() {
            return this.groups;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return resultStatus
         */
        public String getResultStatus() {
            return this.resultStatus;
        }

        /**
         * @return runningStatus
         */
        public String getRunningStatus() {
            return this.runningStatus;
        }

        /**
         * @return stageTopo
         */
        public String getStageTopo() {
            return this.stageTopo;
        }

        /**
         * @return stages
         */
        public java.util.Map < String, ? > getStages() {
            return this.stages;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
        }

        /**
         * @return systemCode
         */
        public String getSystemCode() {
            return this.systemCode;
        }

        /**
         * @return systemId
         */
        public String getSystemId() {
            return this.systemId;
        }

        public static final class Builder {
            private Boolean autoDrivenStatus; 
            private Long createTime; 
            private String creator; 
            private java.util.List < Groups> groups; 
            private Integer id; 
            private String modifier; 
            private Long modifyTime; 
            private Result result; 
            private String resultStatus; 
            private String runningStatus; 
            private String stageTopo; 
            private java.util.Map < String, ? > stages; 
            private String status; 
            private String statusName; 
            private String systemCode; 
            private String systemId; 

            /**
             * AutoDrivenStatus.
             */
            public Builder autoDrivenStatus(Boolean autoDrivenStatus) {
                this.autoDrivenStatus = autoDrivenStatus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * Groups.
             */
            public Builder groups(java.util.List < Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * ResultStatus.
             */
            public Builder resultStatus(String resultStatus) {
                this.resultStatus = resultStatus;
                return this;
            }

            /**
             * RunningStatus.
             */
            public Builder runningStatus(String runningStatus) {
                this.runningStatus = runningStatus;
                return this;
            }

            /**
             * StageTopo.
             */
            public Builder stageTopo(String stageTopo) {
                this.stageTopo = stageTopo;
                return this;
            }

            /**
             * Stages.
             */
            public Builder stages(java.util.Map < String, ? > stages) {
                this.stages = stages;
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
             * StatusName.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * SystemCode.
             */
            public Builder systemCode(String systemCode) {
                this.systemCode = systemCode;
                return this;
            }

            /**
             * SystemId.
             */
            public Builder systemId(String systemId) {
                this.systemId = systemId;
                return this;
            }

            public FlowInstance build() {
                return new FlowInstance(this);
            } 

        } 

    }
    public static class DataList extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("Deletion")
        private String deletion;

        @NameInMap("FlowInstId")
        private Integer flowInstId;

        @NameInMap("FlowInstance")
        private FlowInstance flowInstance;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("InstNumber")
        private Integer instNumber;

        @NameInMap("Modifier")
        private String modifier;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("Packages")
        private String packages;

        @NameInMap("PipelineConfigId")
        private Integer pipelineConfigId;

        @NameInMap("PipelineId")
        private Integer pipelineId;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusName")
        private String statusName;

        @NameInMap("TriggerMode")
        private Integer triggerMode;

        private DataList(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.deletion = builder.deletion;
            this.flowInstId = builder.flowInstId;
            this.flowInstance = builder.flowInstance;
            this.id = builder.id;
            this.instNumber = builder.instNumber;
            this.modifier = builder.modifier;
            this.modifyTime = builder.modifyTime;
            this.packages = builder.packages;
            this.pipelineConfigId = builder.pipelineConfigId;
            this.pipelineId = builder.pipelineId;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.triggerMode = builder.triggerMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return deletion
         */
        public String getDeletion() {
            return this.deletion;
        }

        /**
         * @return flowInstId
         */
        public Integer getFlowInstId() {
            return this.flowInstId;
        }

        /**
         * @return flowInstance
         */
        public FlowInstance getFlowInstance() {
            return this.flowInstance;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return instNumber
         */
        public Integer getInstNumber() {
            return this.instNumber;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return packages
         */
        public String getPackages() {
            return this.packages;
        }

        /**
         * @return pipelineConfigId
         */
        public Integer getPipelineConfigId() {
            return this.pipelineConfigId;
        }

        /**
         * @return pipelineId
         */
        public Integer getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
        }

        /**
         * @return triggerMode
         */
        public Integer getTriggerMode() {
            return this.triggerMode;
        }

        public static final class Builder {
            private Long createTime; 
            private String creator; 
            private String deletion; 
            private Integer flowInstId; 
            private FlowInstance flowInstance; 
            private Integer id; 
            private Integer instNumber; 
            private String modifier; 
            private Long modifyTime; 
            private String packages; 
            private Integer pipelineConfigId; 
            private Integer pipelineId; 
            private String status; 
            private String statusName; 
            private Integer triggerMode; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * Deletion.
             */
            public Builder deletion(String deletion) {
                this.deletion = deletion;
                return this;
            }

            /**
             * FlowInstId.
             */
            public Builder flowInstId(Integer flowInstId) {
                this.flowInstId = flowInstId;
                return this;
            }

            /**
             * FlowInstance.
             */
            public Builder flowInstance(FlowInstance flowInstance) {
                this.flowInstance = flowInstance;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * InstNumber.
             */
            public Builder instNumber(Integer instNumber) {
                this.instNumber = instNumber;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Packages.
             */
            public Builder packages(String packages) {
                this.packages = packages;
                return this;
            }

            /**
             * PipelineConfigId.
             */
            public Builder pipelineConfigId(Integer pipelineConfigId) {
                this.pipelineConfigId = pipelineConfigId;
                return this;
            }

            /**
             * PipelineId.
             */
            public Builder pipelineId(Integer pipelineId) {
                this.pipelineId = pipelineId;
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
             * StatusName.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * TriggerMode.
             */
            public Builder triggerMode(Integer triggerMode) {
                this.triggerMode = triggerMode;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DataList")
        private java.util.List < DataList> dataList;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.dataList = builder.dataList;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataList
         */
        public java.util.List < DataList> getDataList() {
            return this.dataList;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < DataList> dataList; 
            private Integer total; 

            /**
             * DataList.
             */
            public Builder dataList(java.util.List < DataList> dataList) {
                this.dataList = dataList;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
