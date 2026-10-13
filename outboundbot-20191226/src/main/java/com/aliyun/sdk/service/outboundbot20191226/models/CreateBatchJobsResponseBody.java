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
 * {@link CreateBatchJobsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBatchJobsResponseBody</p>
 */
public class CreateBatchJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BatchJob")
    private BatchJob batchJob;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateBatchJobsResponseBody model) {
            this.batchJob = model.batchJob;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The job group information.</p>
         */
        public Builder batchJob(BatchJob batchJob) {
            this.batchJob = batchJob;
            return this;
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
         * <p>The message.</p>
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

        public CreateBatchJobsResponseBody build() {
            return new CreateBatchJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateBatchJobsResponseBody} extends {@link TeaModel}
     *
     * <p>CreateBatchJobsResponseBody</p>
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
     * {@link CreateBatchJobsResponseBody} extends {@link TeaModel}
     *
     * <p>CreateBatchJobsResponseBody</p>
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
             * <p>The custom information of the strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder customized(String customized) {
                this.customized = customized;
                return this;
            }

            /**
             * <p>The end time of the scheduling strategy. The time is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2209702074000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The follow-up strategy for outbound calls that are not completed in the previous cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>CONTINUE</p>
             */
            public Builder followUpStrategy(String followUpStrategy) {
                this.followUpStrategy = followUpStrategy;
                return this;
            }

            /**
             * <p>Indicates whether the strategy is a template.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isTemplate(Boolean isTemplate) {
                this.isTemplate = isTemplate;
                return this;
            }

            /**
             * <p>The maximum number of retries per day after a call fails.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxAttemptsPerDay(Integer maxAttemptsPerDay) {
                this.maxAttemptsPerDay = maxAttemptsPerDay;
                return this;
            }

            /**
             * <p>The minimum interval between retries.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder minAttemptInterval(Integer minAttemptInterval) {
                this.minAttemptInterval = minAttemptInterval;
                return this;
            }

            /**
             * <p>The repetition mode. Valid values:</p>
             * <ul>
             * <li>Once: The job is not repeated.</li>
             * <li>Day: The job is repeated every day.</li>
             * <li>Week: The job is repeated every week.</li>
             * <li>Month: The job is repeated every month.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Once</p>
             */
            public Builder repeatBy(String repeatBy) {
                this.repeatBy = repeatBy;
                return this;
            }

            /**
             * <p>The list of days on which the job is repeated.</p>
             */
            public Builder repeatDays(java.util.List<String> repeatDays) {
                this.repeatDays = repeatDays;
                return this;
            }

            /**
             * <p>The recording strategy for the calling number.</p>
             * 
             * <strong>example:</strong>
             * <p>LocalFirst</p>
             */
            public Builder routingStrategy(String routingStrategy) {
                this.routingStrategy = routingStrategy;
                return this;
            }

            /**
             * <p>The time when the job group starts to be executed. The time is a UNIX timestamp in milliseconds.</p>
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
             * <p>Job execution strategy</p>
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
             * <p>The strategy name.</p>
             * 
             * <strong>example:</strong>
             * <p>Strategy</p>
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
             * <p>The time periods during which the job is executed in a day.</p>
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
     * {@link CreateBatchJobsResponseBody} extends {@link TeaModel}
     *
     * <p>CreateBatchJobsResponseBody</p>
     */
    public static class BatchJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchJobId")
        private String batchJobId;

        @com.aliyun.core.annotation.NameInMap("CallingNumbers")
        private java.util.List<String> callingNumbers;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("JobFilePath")
        private String jobFilePath;

        @com.aliyun.core.annotation.NameInMap("JobGroupDescription")
        private String jobGroupDescription;

        @com.aliyun.core.annotation.NameInMap("JobGroupName")
        private String jobGroupName;

        @com.aliyun.core.annotation.NameInMap("ScenarioId")
        private String scenarioId;

        @com.aliyun.core.annotation.NameInMap("Strategy")
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
            private java.util.List<String> callingNumbers; 
            private Long creationTime; 
            private String jobFilePath; 
            private String jobGroupDescription; 
            private String jobGroupName; 
            private String scenarioId; 
            private Strategy strategy; 

            private Builder() {
            } 

            private Builder(BatchJob model) {
                this.batchJobId = model.batchJobId;
                this.callingNumbers = model.callingNumbers;
                this.creationTime = model.creationTime;
                this.jobFilePath = model.jobFilePath;
                this.jobGroupDescription = model.jobGroupDescription;
                this.jobGroupName = model.jobGroupName;
                this.scenarioId = model.scenarioId;
                this.strategy = model.strategy;
            } 

            /**
             * <p>The job group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5a7e8b09-baf9-4cab-b540-c971f47a7146</p>
             */
            public Builder batchJobId(String batchJobId) {
                this.batchJobId = batchJobId;
                return this;
            }

            /**
             * <p>The list of calling numbers.</p>
             */
            public Builder callingNumbers(java.util.List<String> callingNumbers) {
                this.callingNumbers = callingNumbers;
                return this;
            }

            /**
             * <p>The time when the job group was created. The time is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579068424000</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The key of the uploaded Excel file.</p>
             * 
             * <strong>example:</strong>
             * <p>52e80b02-0126-4556-a1e6-ef5b3747ed53/a9a3ddc7-d7d7-48cd-82b5-b31bb5510e71_2a66f8ad-dfbb-4980-9b84-439171295a11.xlsx</p>
             */
            public Builder jobFilePath(String jobFilePath) {
                this.jobFilePath = jobFilePath;
                return this;
            }

            /**
             * <p>The description of the job group.</p>
             * 
             * <strong>example:</strong>
             * <p>First batch job</p>
             */
            public Builder jobGroupDescription(String jobGroupDescription) {
                this.jobGroupDescription = jobGroupDescription;
                return this;
            }

            /**
             * <p>The name of the job group.</p>
             * 
             * <strong>example:</strong>
             * <p>Batch job 01</p>
             */
            public Builder jobGroupName(String jobGroupName) {
                this.jobGroupName = jobGroupName;
                return this;
            }

            /**
             * <p>The scenario ID of the job group.</p>
             * 
             * <strong>example:</strong>
             * <p>6cea9bed-63e6-439e-ae4c-b3333efff53d</p>
             */
            public Builder scenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * <p>The job execution strategy.</p>
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
