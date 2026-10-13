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
 * {@link ModifyJobGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyJobGroupResponseBody</p>
 */
public class ModifyJobGroupResponseBody extends TeaModel {
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

    private ModifyJobGroupResponseBody(Builder builder) {
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

    public static ModifyJobGroupResponseBody create() {
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

        private Builder(ModifyJobGroupResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.jobGroup = model.jobGroup;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The API status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The job information.</p>
         */
        public Builder jobGroup(JobGroup jobGroup) {
            this.jobGroup = jobGroup;
            return this;
        }

        /**
         * <p>The API message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ModifyJobGroupResponseBody build() {
            return new ModifyJobGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyJobGroupResponseBody</p>
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
             * <p>The file URL.</p>
             * 
             * <strong>example:</strong>
             * <p>https://***.oss-cn-shanghai.aliyuncs.com/sample</p>
             */
            public Builder fileHttpUrl(String fileHttpUrl) {
                this.fileHttpUrl = fileHttpUrl;
                return this;
            }

            /**
             * <p>The progress.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
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
     * {@link ModifyJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyJobGroupResponseBody</p>
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
             * <p>Specifies whether to ignore nonexistent numbers for outbound calls.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder emptyNumberIgnore(Boolean emptyNumberIgnore) {
                this.emptyNumberIgnore = emptyNumberIgnore;
                return this;
            }

            /**
             * <p>Specifies whether to ignore numbers with overdue payments for outbound calls.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder inArrearsIgnore(Boolean inArrearsIgnore) {
                this.inArrearsIgnore = inArrearsIgnore;
                return this;
            }

            /**
             * <p>Specifies whether to ignore out-of-service numbers for outbound calls.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
     * {@link ModifyJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyJobGroupResponseBody</p>
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
             * <p>The start time. The format is HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>09:00:00</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The end time. The format is HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>12:00:00</p>
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
     * {@link ModifyJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyJobGroupResponseBody</p>
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
             * <p>The custom strategy data. This is a legacy parameter and is no longer used.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder customized(String customized) {
                this.customized = customized;
                return this;
            }

            /**
             * <p>The end time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2209702074000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The processing method after the execution cycle ends. This is a legacy parameter and is no longer used.</p>
             * 
             * <strong>example:</strong>
             * <p>CONTINUE</p>
             */
            public Builder followUpStrategy(String followUpStrategy) {
                this.followUpStrategy = followUpStrategy;
                return this;
            }

            /**
             * <p>Indicates whether it is a template. This is a legacy parameter and is no longer used.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isTemplate(Boolean isTemplate) {
                this.isTemplate = isTemplate;
                return this;
            }

            /**
             * <p>The maximum number of attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxAttemptsPerDay(Integer maxAttemptsPerDay) {
                this.maxAttemptsPerDay = maxAttemptsPerDay;
                return this;
            }

            /**
             * <p>The retry interval after a failure.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder minAttemptInterval(Integer minAttemptInterval) {
                this.minAttemptInterval = minAttemptInterval;
                return this;
            }

            /**
             * <p>The recurrence type. Valid values: Once (no recurrence), Day (daily), Week (weekly), and Month (monthly).</p>
             * 
             * <strong>example:</strong>
             * <p>Once</p>
             */
            public Builder repeatBy(String repeatBy) {
                this.repeatBy = repeatBy;
                return this;
            }

            /**
             * <p>The execution days for recurrence.</p>
             * <p>If the recurrence type RepeatBy is Week, 0 indicates Sunday, and 1 to 6 indicate Monday to Saturday.
             * If the recurrence type RepeatBy is Month, 1 to 31 indicate the 1st to the 31st day of the month. If a month does not have the specified day, the job is not executed in that month. For example, if the 30th is selected, the job is not executed in February.</p>
             */
            public Builder repeatDays(java.util.List<String> repeatDays) {
                this.repeatDays = repeatDays;
                return this;
            }

            /**
             * <p>The phone number routing strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>LocalFirst</p>
             */
            public Builder routingStrategy(String routingStrategy) {
                this.routingStrategy = routingStrategy;
                return this;
            }

            /**
             * <p>The start time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1578550074000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The strategy description.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection job execution strategy</p>
             */
            public Builder strategyDescription(String strategyDescription) {
                this.strategyDescription = strategyDescription;
                return this;
            }

            /**
             * <p>The strategy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f718798d-96be-40e4-bef6-317b54855708</p>
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection strategy</p>
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * <p>The strategy type.</p>
             * 
             * <strong>example:</strong>
             * <p>Repeatable</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time period during which outbound calls are allowed.</p>
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
     * {@link ModifyJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyJobGroupResponseBody</p>
     */
    public static class JobGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallingNumbers")
        private java.util.List<String> callingNumbers;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("ExportProgress")
        private ExportProgress exportProgress;

        @com.aliyun.core.annotation.NameInMap("FlashSmsExtras")
        private String flashSmsExtras;

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
            this.flashSmsExtras = builder.flashSmsExtras;
            this.jobDataParsingTaskId = builder.jobDataParsingTaskId;
            this.jobFilePath = builder.jobFilePath;
            this.jobGroupDescription = builder.jobGroupDescription;
            this.jobGroupId = builder.jobGroupId;
            this.jobGroupName = builder.jobGroupName;
            this.minConcurrency = builder.minConcurrency;
            this.modifyTime = builder.modifyTime;
            this.priority = builder.priority;
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
         * @return flashSmsExtras
         */
        public String getFlashSmsExtras() {
            return this.flashSmsExtras;
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
            private String flashSmsExtras; 
            private String jobDataParsingTaskId; 
            private String jobFilePath; 
            private String jobGroupDescription; 
            private String jobGroupId; 
            private String jobGroupName; 
            private Long minConcurrency; 
            private String modifyTime; 
            private String priority; 
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
                this.flashSmsExtras = model.flashSmsExtras;
                this.jobDataParsingTaskId = model.jobDataParsingTaskId;
                this.jobFilePath = model.jobFilePath;
                this.jobGroupDescription = model.jobGroupDescription;
                this.jobGroupId = model.jobGroupId;
                this.jobGroupName = model.jobGroupName;
                this.minConcurrency = model.minConcurrency;
                this.modifyTime = model.modifyTime;
                this.priority = model.priority;
                this.recallStrategy = model.recallStrategy;
                this.ringingDuration = model.ringingDuration;
                this.scenarioId = model.scenarioId;
                this.scriptName = model.scriptName;
                this.scriptVersion = model.scriptVersion;
                this.status = model.status;
                this.strategy = model.strategy;
            } 

            /**
             * <p>The list of caller numbers.</p>
             */
            public Builder callingNumbers(java.util.List<String> callingNumbers) {
                this.callingNumbers = callingNumbers;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * <blockquote>
             * <p>You can obtain this value from the response of the DescribeJobGroup operation. The value is a UNIX timestamp in milliseconds.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1578550074361</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The export information. This is a legacy parameter and is no longer used.</p>
             */
            public Builder exportProgress(ExportProgress exportProgress) {
                this.exportProgress = exportProgress;
                return this;
            }

            /**
             * <p>The configuration parameters for flash message push in JSON format, including the configuration information of third-party flash messages.</p>
             * <p>templateId: the flash message template ID.
             * configId: the flash message configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;configId&quot;:&quot;3157b3c8-3a3e-4ea9-894b-9c8a6&quot;, &quot;templateId&quot;:&quot;1234&quot;}</p>
             */
            public Builder flashSmsExtras(String flashSmsExtras) {
                this.flashSmsExtras = flashSmsExtras;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The ID of the parsing task corresponding to the outbound job file.</p>
             * 
             * <strong>example:</strong>
             * <p>e37d28cb-0413-4816-85ed-fd354d025ea3</p>
             */
            public Builder jobDataParsingTaskId(String jobDataParsingTaskId) {
                this.jobDataParsingTaskId = jobDataParsingTaskId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The OSS storage path of the job file.</p>
             * 
             * <strong>example:</strong>
             * <p>UPLOADED/JOB/d481cebe-0bb6-4d13-9649-42ce5074fb75/6c7d9132-98e1-4f08-8a76-8a266c7532fd_job_template - Copy.xlsx</p>
             */
            public Builder jobFilePath(String jobFilePath) {
                this.jobFilePath = jobFilePath;
                return this;
            }

            /**
             * <p>The job description.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection job group</p>
             */
            public Builder jobGroupDescription(String jobGroupDescription) {
                this.jobGroupDescription = jobGroupDescription;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c62e6789-28a8-41db-941e-171a01d3b3b9</p>
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * <p>The job name.</p>
             * 
             * <strong>example:</strong>
             * <p>First collection</p>
             */
            public Builder jobGroupName(String jobGroupName) {
                this.jobGroupName = jobGroupName;
                return this;
            }

            /**
             * <p>The guaranteed concurrency.
             * When a job starts, a minimum of N concurrent calls are guaranteed.
             * The sum of guaranteed concurrency values for jobs of the same priority cannot exceed the instance concurrency.
             * If the guaranteed concurrency is set to 0, the system intelligently allocates idle concurrency.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minConcurrency(Long minConcurrency) {
                this.minConcurrency = minConcurrency;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * <blockquote>
             * <p>You can obtain this value from the response of the DescribeJobGroup operation. The value is a UNIX timestamp in milliseconds.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1628425608429</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The job group priority. Valid values:</p>
             * <p>Urgent: urgent job.
             * Daily: daily job.</p>
             * 
             * <strong>example:</strong>
             * <p>Daily</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The recall strategy.</p>
             */
            public Builder recallStrategy(RecallStrategy recallStrategy) {
                this.recallStrategy = recallStrategy;
                return this;
            }

            /**
             * <p>The ringing duration.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder ringingDuration(Long ringingDuration) {
                this.ringingDuration = ringingDuration;
                return this;
            }

            /**
             * <p>The scenario ID.</p>
             * <blockquote>
             * <p>This parameter returns a legacy value. You can obtain the specific ScriptId from the response of the DescribeJobGroup operation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>6cea9bed-63e6-439e-ae4c-b3333efff53d</p>
             */
            public Builder scenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * <p>The script name.</p>
             * 
             * <strong>example:</strong>
             * <p>Script</p>
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * <p>The script version.</p>
             * 
             * <strong>example:</strong>
             * <p>1628425608429</p>
             */
            public Builder scriptVersion(String scriptVersion) {
                this.scriptVersion = scriptVersion;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>Scheduling</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The outbound call strategy.</p>
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
