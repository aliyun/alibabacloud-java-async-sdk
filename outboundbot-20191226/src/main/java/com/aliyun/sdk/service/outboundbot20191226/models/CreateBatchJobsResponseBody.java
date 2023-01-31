// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBatchJobsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBatchJobsResponseBody</p>
 */
public class CreateBatchJobsResponseBody extends TeaModel {
    @NameInMap("BatchJob")
    private BatchJob batchJob;

    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateBatchJobsResponseBody(Builder builder) {
        this.batchJob = builder.batchJob;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBatchJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return batchJob
     */
    public BatchJob getBatchJob() {
        return this.batchJob;
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
        private BatchJob batchJob; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * BatchJob.
         */
        public Builder batchJob(BatchJob batchJob) {
            this.batchJob = batchJob;
            return this;
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

        public CreateBatchJobsResponseBody build() {
            return new CreateBatchJobsResponseBody(this);
        } 

    } 

    public static class WorkingTime extends TeaModel {
        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("EndTime")
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
    public static class Strategy extends TeaModel {
        @NameInMap("Customized")
        private String customized;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("FollowUpStrategy")
        private String followUpStrategy;

        @NameInMap("IsTemplate")
        private Boolean isTemplate;

        @NameInMap("MaxAttemptsPerDay")
        private Integer maxAttemptsPerDay;

        @NameInMap("MinAttemptInterval")
        private Integer minAttemptInterval;

        @NameInMap("RepeatBy")
        private String repeatBy;

        @NameInMap("RepeatDays")
        private java.util.List < String > repeatDays;

        @NameInMap("RoutingStrategy")
        private String routingStrategy;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("StrategyDescription")
        private String strategyDescription;

        @NameInMap("StrategyId")
        private String strategyId;

        @NameInMap("StrategyName")
        private String strategyName;

        @NameInMap("Type")
        private String type;

        @NameInMap("WorkingTime")
        private java.util.List < WorkingTime> workingTime;

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
        public java.util.List < String > getRepeatDays() {
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
        public java.util.List < WorkingTime> getWorkingTime() {
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
            private java.util.List < String > repeatDays; 
            private String routingStrategy; 
            private Long startTime; 
            private String strategyDescription; 
            private String strategyId; 
            private String strategyName; 
            private String type; 
            private java.util.List < WorkingTime> workingTime; 

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
            public Builder repeatDays(java.util.List < String > repeatDays) {
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
            public Builder workingTime(java.util.List < WorkingTime> workingTime) {
                this.workingTime = workingTime;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
    public static class BatchJob extends TeaModel {
        @NameInMap("BatchJobId")
        private String batchJobId;

        @NameInMap("CallingNumbers")
        private java.util.List < String > callingNumbers;

        @NameInMap("CreationTime")
        private Long creationTime;

        @NameInMap("JobFilePath")
        private String jobFilePath;

        @NameInMap("JobGroupDescription")
        private String jobGroupDescription;

        @NameInMap("JobGroupName")
        private String jobGroupName;

        @NameInMap("ScenarioId")
        private String scenarioId;

        @NameInMap("Strategy")
        private Strategy strategy;

        private BatchJob(Builder builder) {
            this.batchJobId = builder.batchJobId;
            this.callingNumbers = builder.callingNumbers;
            this.creationTime = builder.creationTime;
            this.jobFilePath = builder.jobFilePath;
            this.jobGroupDescription = builder.jobGroupDescription;
            this.jobGroupName = builder.jobGroupName;
            this.scenarioId = builder.scenarioId;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BatchJob create() {
            return builder().build();
        }

        /**
         * @return batchJobId
         */
        public String getBatchJobId() {
            return this.batchJobId;
        }

        /**
         * @return callingNumbers
         */
        public java.util.List < String > getCallingNumbers() {
            return this.callingNumbers;
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
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
         * @return jobGroupName
         */
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        /**
         * @return scenarioId
         */
        public String getScenarioId() {
            return this.scenarioId;
        }

        /**
         * @return strategy
         */
        public Strategy getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private String batchJobId; 
            private java.util.List < String > callingNumbers; 
            private Long creationTime; 
            private String jobFilePath; 
            private String jobGroupDescription; 
            private String jobGroupName; 
            private String scenarioId; 
            private Strategy strategy; 

            /**
             * BatchJobId.
             */
            public Builder batchJobId(String batchJobId) {
                this.batchJobId = batchJobId;
                return this;
            }

            /**
             * CallingNumbers.
             */
            public Builder callingNumbers(java.util.List < String > callingNumbers) {
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
             * JobGroupName.
             */
            public Builder jobGroupName(String jobGroupName) {
                this.jobGroupName = jobGroupName;
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
             * Strategy.
             */
            public Builder strategy(Strategy strategy) {
                this.strategy = strategy;
                return this;
            }

            public BatchJob build() {
                return new BatchJob(this);
            } 

        } 

    }
}
