// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateJobGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateJobGroupResponseBody</p>
 */
public class CreateJobGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("JobGroup")
    private JobGroup jobGroup;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateJobGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.jobGroup = builder.jobGroup;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return jobGroup
     */
    public JobGroup getJobGroup() {
        return this.jobGroup;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Integer httpStatusCode; 
        private JobGroup jobGroup; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateJobGroupResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.jobGroup = model.jobGroup;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * JobGroup.
         */
        public Builder jobGroup(JobGroup jobGroup) {
            this.jobGroup = jobGroup;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public CreateJobGroupResponseBody build() {
            return new CreateJobGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateJobGroupResponseBody</p>
     */
    public static class ExportProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileHttpUrl")
        private String fileHttpUrl;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ExportProgress(Builder builder) {
            this.fileHttpUrl = builder.fileHttpUrl;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExportProgress create() {
            return builder().build();
        }

        /**
         * @return fileHttpUrl
         */
        public String getFileHttpUrl() {
            return this.fileHttpUrl;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String fileHttpUrl; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(ExportProgress model) {
                this.fileHttpUrl = model.fileHttpUrl;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * FileHttpUrl.
             */
            public Builder fileHttpUrl(String fileHttpUrl) {
                this.fileHttpUrl = fileHttpUrl;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ExportProgress build() {
                return new ExportProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateJobGroupResponseBody</p>
     */
    public static class RecallStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EmptyNumberIgnore")
        private Boolean emptyNumberIgnore;

        @com.aliyun.core.annotation.NameInMap("InArrearsIgnore")
        private Boolean inArrearsIgnore;

        @com.aliyun.core.annotation.NameInMap("OutOfServiceIgnore")
        private Boolean outOfServiceIgnore;

        private RecallStrategy(Builder builder) {
            this.emptyNumberIgnore = builder.emptyNumberIgnore;
            this.inArrearsIgnore = builder.inArrearsIgnore;
            this.outOfServiceIgnore = builder.outOfServiceIgnore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallStrategy create() {
            return builder().build();
        }

        /**
         * @return emptyNumberIgnore
         */
        public Boolean getEmptyNumberIgnore() {
            return this.emptyNumberIgnore;
        }

        /**
         * @return inArrearsIgnore
         */
        public Boolean getInArrearsIgnore() {
            return this.inArrearsIgnore;
        }

        /**
         * @return outOfServiceIgnore
         */
        public Boolean getOutOfServiceIgnore() {
            return this.outOfServiceIgnore;
        }

        public static final class Builder {
            private Boolean emptyNumberIgnore; 
            private Boolean inArrearsIgnore; 
            private Boolean outOfServiceIgnore; 

            private Builder() {
            } 

            private Builder(RecallStrategy model) {
                this.emptyNumberIgnore = model.emptyNumberIgnore;
                this.inArrearsIgnore = model.inArrearsIgnore;
                this.outOfServiceIgnore = model.outOfServiceIgnore;
            } 

            /**
             * EmptyNumberIgnore.
             */
            public Builder emptyNumberIgnore(Boolean emptyNumberIgnore) {
                this.emptyNumberIgnore = emptyNumberIgnore;
                return this;
            }

            /**
             * InArrearsIgnore.
             */
            public Builder inArrearsIgnore(Boolean inArrearsIgnore) {
                this.inArrearsIgnore = inArrearsIgnore;
                return this;
            }

            /**
             * OutOfServiceIgnore.
             */
            public Builder outOfServiceIgnore(Boolean outOfServiceIgnore) {
                this.outOfServiceIgnore = outOfServiceIgnore;
                return this;
            }

            public RecallStrategy build() {
                return new RecallStrategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateJobGroupResponseBody</p>
     */
    public static class WorkingTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        private WorkingTime(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkingTime create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        public static final class Builder {
            private String beginTime; 
            private String endTime; 

            private Builder() {
            } 

            private Builder(WorkingTime model) {
                this.beginTime = model.beginTime;
                this.endTime = model.endTime;
            } 

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            public WorkingTime build() {
                return new WorkingTime(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateJobGroupResponseBody</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Customized")
        private String customized;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("FollowUpStrategy")
        private String followUpStrategy;

        @com.aliyun.core.annotation.NameInMap("IsTemplate")
        private Boolean isTemplate;

        @com.aliyun.core.annotation.NameInMap("MaxAttemptsPerDay")
        private Integer maxAttemptsPerDay;

        @com.aliyun.core.annotation.NameInMap("MinAttemptInterval")
        private Integer minAttemptInterval;

        @com.aliyun.core.annotation.NameInMap("RepeatBy")
        private String repeatBy;

        @com.aliyun.core.annotation.NameInMap("RepeatDays")
        private java.util.List<String> repeatDays;

        @com.aliyun.core.annotation.NameInMap("RoutingStrategy")
        private String routingStrategy;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("StrategyDescription")
        private String strategyDescription;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
        private String strategyName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WorkingTime")
        private java.util.List<WorkingTime> workingTime;

        private Strategy(Builder builder) {
            this.customized = builder.customized;
            this.endTime = builder.endTime;
            this.followUpStrategy = builder.followUpStrategy;
            this.isTemplate = builder.isTemplate;
            this.maxAttemptsPerDay = builder.maxAttemptsPerDay;
            this.minAttemptInterval = builder.minAttemptInterval;
            this.repeatBy = builder.repeatBy;
            this.repeatDays = builder.repeatDays;
            this.routingStrategy = builder.routingStrategy;
            this.startTime = builder.startTime;
            this.strategyDescription = builder.strategyDescription;
            this.strategyId = builder.strategyId;
            this.strategyName = builder.strategyName;
            this.type = builder.type;
            this.workingTime = builder.workingTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return customized
         */
        public String getCustomized() {
            return this.customized;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return followUpStrategy
         */
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        /**
         * @return isTemplate
         */
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        /**
         * @return maxAttemptsPerDay
         */
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        /**
         * @return minAttemptInterval
         */
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        /**
         * @return repeatBy
         */
        public String getRepeatBy() {
            return this.repeatBy;
        }

        /**
         * @return repeatDays
         */
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        /**
         * @return routingStrategy
         */
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return strategyDescription
         */
        public String getStrategyDescription() {
            return this.strategyDescription;
        }

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return strategyName
         */
        public String getStrategyName() {
            return this.strategyName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workingTime
         */
        public java.util.List<WorkingTime> getWorkingTime() {
            return this.workingTime;
        }

        public static final class Builder {
            private String customized; 
            private Long endTime; 
            private String followUpStrategy; 
            private Boolean isTemplate; 
            private Integer maxAttemptsPerDay; 
            private Integer minAttemptInterval; 
            private String repeatBy; 
            private java.util.List<String> repeatDays; 
            private String routingStrategy; 
            private Long startTime; 
            private String strategyDescription; 
            private String strategyId; 
            private String strategyName; 
            private String type; 
            private java.util.List<WorkingTime> workingTime; 

            private Builder() {
            } 

            private Builder(Strategy model) {
                this.customized = model.customized;
                this.endTime = model.endTime;
                this.followUpStrategy = model.followUpStrategy;
                this.isTemplate = model.isTemplate;
                this.maxAttemptsPerDay = model.maxAttemptsPerDay;
                this.minAttemptInterval = model.minAttemptInterval;
                this.repeatBy = model.repeatBy;
                this.repeatDays = model.repeatDays;
                this.routingStrategy = model.routingStrategy;
                this.startTime = model.startTime;
                this.strategyDescription = model.strategyDescription;
                this.strategyId = model.strategyId;
                this.strategyName = model.strategyName;
                this.type = model.type;
                this.workingTime = model.workingTime;
            } 

            /**
             * Customized.
             */
            public Builder customized(String customized) {
                this.customized = customized;
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
             * FollowUpStrategy.
             */
            public Builder followUpStrategy(String followUpStrategy) {
                this.followUpStrategy = followUpStrategy;
                return this;
            }

            /**
             * IsTemplate.
             */
            public Builder isTemplate(Boolean isTemplate) {
                this.isTemplate = isTemplate;
                return this;
            }

            /**
             * MaxAttemptsPerDay.
             */
            public Builder maxAttemptsPerDay(Integer maxAttemptsPerDay) {
                this.maxAttemptsPerDay = maxAttemptsPerDay;
                return this;
            }

            /**
             * MinAttemptInterval.
             */
            public Builder minAttemptInterval(Integer minAttemptInterval) {
                this.minAttemptInterval = minAttemptInterval;
                return this;
            }

            /**
             * RepeatBy.
             */
            public Builder repeatBy(String repeatBy) {
                this.repeatBy = repeatBy;
                return this;
            }

            /**
             * RepeatDays.
             */
            public Builder repeatDays(java.util.List<String> repeatDays) {
                this.repeatDays = repeatDays;
                return this;
            }

            /**
             * RoutingStrategy.
             */
            public Builder routingStrategy(String routingStrategy) {
                this.routingStrategy = routingStrategy;
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
             * StrategyDescription.
             */
            public Builder strategyDescription(String strategyDescription) {
                this.strategyDescription = strategyDescription;
                return this;
            }

            /**
             * StrategyId.
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * StrategyName.
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * WorkingTime.
             */
            public Builder workingTime(java.util.List<WorkingTime> workingTime) {
                this.workingTime = workingTime;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateJobGroupResponseBody</p>
     */
    public static class JobGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallingNumbers")
        private java.util.List<String> callingNumbers;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("ExportProgress")
        private ExportProgress exportProgress;

        @com.aliyun.core.annotation.NameInMap("JobDataParsingTaskId")
        private String jobDataParsingTaskId;

        @com.aliyun.core.annotation.NameInMap("JobFilePath")
        private String jobFilePath;

        @com.aliyun.core.annotation.NameInMap("JobGroupDescription")
        private String jobGroupDescription;

        @com.aliyun.core.annotation.NameInMap("JobGroupId")
        private String jobGroupId;

        @com.aliyun.core.annotation.NameInMap("JobGroupName")
        private String jobGroupName;

        @com.aliyun.core.annotation.NameInMap("MinConcurrency")
        private Long minConcurrency;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("RecallCallingNumbers")
        private java.util.List<String> recallCallingNumbers;

        @com.aliyun.core.annotation.NameInMap("RecallStrategy")
        private RecallStrategy recallStrategy;

        @com.aliyun.core.annotation.NameInMap("RingingDuration")
        private Long ringingDuration;

        @com.aliyun.core.annotation.NameInMap("ScenarioId")
        private String scenarioId;

        @com.aliyun.core.annotation.NameInMap("ScriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("ScriptVersion")
        private String scriptVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Strategy strategy;

        private JobGroup(Builder builder) {
            this.callingNumbers = builder.callingNumbers;
            this.creationTime = builder.creationTime;
            this.exportProgress = builder.exportProgress;
            this.jobDataParsingTaskId = builder.jobDataParsingTaskId;
            this.jobFilePath = builder.jobFilePath;
            this.jobGroupDescription = builder.jobGroupDescription;
            this.jobGroupId = builder.jobGroupId;
            this.jobGroupName = builder.jobGroupName;
            this.minConcurrency = builder.minConcurrency;
            this.modifyTime = builder.modifyTime;
            this.priority = builder.priority;
            this.recallCallingNumbers = builder.recallCallingNumbers;
            this.recallStrategy = builder.recallStrategy;
            this.ringingDuration = builder.ringingDuration;
            this.scenarioId = builder.scenarioId;
            this.scriptName = builder.scriptName;
            this.scriptVersion = builder.scriptVersion;
            this.status = builder.status;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobGroup create() {
            return builder().build();
        }

        /**
         * @return callingNumbers
         */
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return exportProgress
         */
        public ExportProgress getExportProgress() {
            return this.exportProgress;
        }

        /**
         * @return jobDataParsingTaskId
         */
        public String getJobDataParsingTaskId() {
            return this.jobDataParsingTaskId;
        }

        /**
         * @return jobFilePath
         */
        public String getJobFilePath() {
            return this.jobFilePath;
        }

        /**
         * @return jobGroupDescription
         */
        public String getJobGroupDescription() {
            return this.jobGroupDescription;
        }

        /**
         * @return jobGroupId
         */
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        /**
         * @return jobGroupName
         */
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        /**
         * @return minConcurrency
         */
        public Long getMinConcurrency() {
            return this.minConcurrency;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return recallCallingNumbers
         */
        public java.util.List<String> getRecallCallingNumbers() {
            return this.recallCallingNumbers;
        }

        /**
         * @return recallStrategy
         */
        public RecallStrategy getRecallStrategy() {
            return this.recallStrategy;
        }

        /**
         * @return ringingDuration
         */
        public Long getRingingDuration() {
            return this.ringingDuration;
        }

        /**
         * @return scenarioId
         */
        public String getScenarioId() {
            return this.scenarioId;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        /**
         * @return scriptVersion
         */
        public String getScriptVersion() {
            return this.scriptVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategy
         */
        public Strategy getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private java.util.List<String> callingNumbers; 
            private Long creationTime; 
            private ExportProgress exportProgress; 
            private String jobDataParsingTaskId; 
            private String jobFilePath; 
            private String jobGroupDescription; 
            private String jobGroupId; 
            private String jobGroupName; 
            private Long minConcurrency; 
            private String modifyTime; 
            private String priority; 
            private java.util.List<String> recallCallingNumbers; 
            private RecallStrategy recallStrategy; 
            private Long ringingDuration; 
            private String scenarioId; 
            private String scriptName; 
            private String scriptVersion; 
            private String status; 
            private Strategy strategy; 

            private Builder() {
            } 

            private Builder(JobGroup model) {
                this.callingNumbers = model.callingNumbers;
                this.creationTime = model.creationTime;
                this.exportProgress = model.exportProgress;
                this.jobDataParsingTaskId = model.jobDataParsingTaskId;
                this.jobFilePath = model.jobFilePath;
                this.jobGroupDescription = model.jobGroupDescription;
                this.jobGroupId = model.jobGroupId;
                this.jobGroupName = model.jobGroupName;
                this.minConcurrency = model.minConcurrency;
                this.modifyTime = model.modifyTime;
                this.priority = model.priority;
                this.recallCallingNumbers = model.recallCallingNumbers;
                this.recallStrategy = model.recallStrategy;
                this.ringingDuration = model.ringingDuration;
                this.scenarioId = model.scenarioId;
                this.scriptName = model.scriptName;
                this.scriptVersion = model.scriptVersion;
                this.status = model.status;
                this.strategy = model.strategy;
            } 

            /**
             * CallingNumbers.
             */
            public Builder callingNumbers(java.util.List<String> callingNumbers) {
                this.callingNumbers = callingNumbers;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * ExportProgress.
             */
            public Builder exportProgress(ExportProgress exportProgress) {
                this.exportProgress = exportProgress;
                return this;
            }

            /**
             * JobDataParsingTaskId.
             */
            public Builder jobDataParsingTaskId(String jobDataParsingTaskId) {
                this.jobDataParsingTaskId = jobDataParsingTaskId;
                return this;
            }

            /**
             * JobFilePath.
             */
            public Builder jobFilePath(String jobFilePath) {
                this.jobFilePath = jobFilePath;
                return this;
            }

            /**
             * JobGroupDescription.
             */
            public Builder jobGroupDescription(String jobGroupDescription) {
                this.jobGroupDescription = jobGroupDescription;
                return this;
            }

            /**
             * JobGroupId.
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * JobGroupName.
             */
            public Builder jobGroupName(String jobGroupName) {
                this.jobGroupName = jobGroupName;
                return this;
            }

            /**
             * MinConcurrency.
             */
            public Builder minConcurrency(Long minConcurrency) {
                this.minConcurrency = minConcurrency;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * RecallCallingNumbers.
             */
            public Builder recallCallingNumbers(java.util.List<String> recallCallingNumbers) {
                this.recallCallingNumbers = recallCallingNumbers;
                return this;
            }

            /**
             * RecallStrategy.
             */
            public Builder recallStrategy(RecallStrategy recallStrategy) {
                this.recallStrategy = recallStrategy;
                return this;
            }

            /**
             * RingingDuration.
             */
            public Builder ringingDuration(Long ringingDuration) {
                this.ringingDuration = ringingDuration;
                return this;
            }

            /**
             * ScenarioId.
             */
            public Builder scenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * ScriptName.
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * ScriptVersion.
             */
            public Builder scriptVersion(String scriptVersion) {
                this.scriptVersion = scriptVersion;
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
             * Strategy.
             */
            public Builder strategy(Strategy strategy) {
                this.strategy = strategy;
                return this;
            }

            public JobGroup build() {
                return new JobGroup(this);
            } 

        } 

    }
}
