// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link GetAutoScalingConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoScalingConfigurationResponseBody</p>
 */
public class GetAutoScalingConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAutoScalingConfigurationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoScalingConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAutoScalingConfigurationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B7A39AE5-0B36-4442-A304-E0885265***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAutoScalingConfigurationResponseBody build() {
            return new GetAutoScalingConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAutoScalingConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScalingConfigurationResponseBody</p>
     */
    public static class WeeklyTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WeeklyTypes")
        private java.util.List<String> weeklyTypes;

        private WeeklyTypes(Builder builder) {
            this.weeklyTypes = builder.weeklyTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WeeklyTypes create() {
            return builder().build();
        }

        /**
         * @return weeklyTypes
         */
        public java.util.List<String> getWeeklyTypes() {
            return this.weeklyTypes;
        }

        public static final class Builder {
            private java.util.List<String> weeklyTypes; 

            private Builder() {
            } 

            private Builder(WeeklyTypes model) {
                this.weeklyTypes = model.weeklyTypes;
            } 

            /**
             * WeeklyTypes.
             */
            public Builder weeklyTypes(java.util.List<String> weeklyTypes) {
                this.weeklyTypes = weeklyTypes;
                return this;
            }

            public WeeklyTypes build() {
                return new WeeklyTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoScalingConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScalingConfigurationResponseBody</p>
     */
    public static class ScheduledScalingRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DurationMinutes")
        private Long durationMinutes;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("EstimatedElasticScalingDownTimeSecs")
        private Long estimatedElasticScalingDownTimeSecs;

        @com.aliyun.core.annotation.NameInMap("EstimatedElasticScalingUpTimeSecs")
        private Long estimatedElasticScalingUpTimeSecs;

        @com.aliyun.core.annotation.NameInMap("FirstScheduledTime")
        private Long firstScheduledTime;

        @com.aliyun.core.annotation.NameInMap("RepeatType")
        private String repeatType;

        @com.aliyun.core.annotation.NameInMap("ReservedPubFlow")
        private Long reservedPubFlow;

        @com.aliyun.core.annotation.NameInMap("ReservedSubFlow")
        private Long reservedSubFlow;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        @com.aliyun.core.annotation.NameInMap("WeeklyTypes")
        private WeeklyTypes weeklyTypes;

        private ScheduledScalingRules(Builder builder) {
            this.durationMinutes = builder.durationMinutes;
            this.enable = builder.enable;
            this.estimatedElasticScalingDownTimeSecs = builder.estimatedElasticScalingDownTimeSecs;
            this.estimatedElasticScalingUpTimeSecs = builder.estimatedElasticScalingUpTimeSecs;
            this.firstScheduledTime = builder.firstScheduledTime;
            this.repeatType = builder.repeatType;
            this.reservedPubFlow = builder.reservedPubFlow;
            this.reservedSubFlow = builder.reservedSubFlow;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.scheduleType = builder.scheduleType;
            this.timeZone = builder.timeZone;
            this.weeklyTypes = builder.weeklyTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduledScalingRules create() {
            return builder().build();
        }

        /**
         * @return durationMinutes
         */
        public Long getDurationMinutes() {
            return this.durationMinutes;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return estimatedElasticScalingDownTimeSecs
         */
        public Long getEstimatedElasticScalingDownTimeSecs() {
            return this.estimatedElasticScalingDownTimeSecs;
        }

        /**
         * @return estimatedElasticScalingUpTimeSecs
         */
        public Long getEstimatedElasticScalingUpTimeSecs() {
            return this.estimatedElasticScalingUpTimeSecs;
        }

        /**
         * @return firstScheduledTime
         */
        public Long getFirstScheduledTime() {
            return this.firstScheduledTime;
        }

        /**
         * @return repeatType
         */
        public String getRepeatType() {
            return this.repeatType;
        }

        /**
         * @return reservedPubFlow
         */
        public Long getReservedPubFlow() {
            return this.reservedPubFlow;
        }

        /**
         * @return reservedSubFlow
         */
        public Long getReservedSubFlow() {
            return this.reservedSubFlow;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        /**
         * @return weeklyTypes
         */
        public WeeklyTypes getWeeklyTypes() {
            return this.weeklyTypes;
        }

        public static final class Builder {
            private Long durationMinutes; 
            private Boolean enable; 
            private Long estimatedElasticScalingDownTimeSecs; 
            private Long estimatedElasticScalingUpTimeSecs; 
            private Long firstScheduledTime; 
            private String repeatType; 
            private Long reservedPubFlow; 
            private Long reservedSubFlow; 
            private Long ruleId; 
            private String ruleName; 
            private String scheduleType; 
            private String timeZone; 
            private WeeklyTypes weeklyTypes; 

            private Builder() {
            } 

            private Builder(ScheduledScalingRules model) {
                this.durationMinutes = model.durationMinutes;
                this.enable = model.enable;
                this.estimatedElasticScalingDownTimeSecs = model.estimatedElasticScalingDownTimeSecs;
                this.estimatedElasticScalingUpTimeSecs = model.estimatedElasticScalingUpTimeSecs;
                this.firstScheduledTime = model.firstScheduledTime;
                this.repeatType = model.repeatType;
                this.reservedPubFlow = model.reservedPubFlow;
                this.reservedSubFlow = model.reservedSubFlow;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.scheduleType = model.scheduleType;
                this.timeZone = model.timeZone;
                this.weeklyTypes = model.weeklyTypes;
            } 

            /**
             * DurationMinutes.
             */
            public Builder durationMinutes(Long durationMinutes) {
                this.durationMinutes = durationMinutes;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * EstimatedElasticScalingDownTimeSecs.
             */
            public Builder estimatedElasticScalingDownTimeSecs(Long estimatedElasticScalingDownTimeSecs) {
                this.estimatedElasticScalingDownTimeSecs = estimatedElasticScalingDownTimeSecs;
                return this;
            }

            /**
             * EstimatedElasticScalingUpTimeSecs.
             */
            public Builder estimatedElasticScalingUpTimeSecs(Long estimatedElasticScalingUpTimeSecs) {
                this.estimatedElasticScalingUpTimeSecs = estimatedElasticScalingUpTimeSecs;
                return this;
            }

            /**
             * FirstScheduledTime.
             */
            public Builder firstScheduledTime(Long firstScheduledTime) {
                this.firstScheduledTime = firstScheduledTime;
                return this;
            }

            /**
             * RepeatType.
             */
            public Builder repeatType(String repeatType) {
                this.repeatType = repeatType;
                return this;
            }

            /**
             * ReservedPubFlow.
             */
            public Builder reservedPubFlow(Long reservedPubFlow) {
                this.reservedPubFlow = reservedPubFlow;
                return this;
            }

            /**
             * ReservedSubFlow.
             */
            public Builder reservedSubFlow(Long reservedSubFlow) {
                this.reservedSubFlow = reservedSubFlow;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * ScheduleType.
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * TimeZone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * WeeklyTypes.
             */
            public Builder weeklyTypes(WeeklyTypes weeklyTypes) {
                this.weeklyTypes = weeklyTypes;
                return this;
            }

            public ScheduledScalingRules build() {
                return new ScheduledScalingRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoScalingConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScalingConfigurationResponseBody</p>
     */
    public static class DataScheduledScalingRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScheduledScalingRules")
        private java.util.List<ScheduledScalingRules> scheduledScalingRules;

        private DataScheduledScalingRules(Builder builder) {
            this.scheduledScalingRules = builder.scheduledScalingRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataScheduledScalingRules create() {
            return builder().build();
        }

        /**
         * @return scheduledScalingRules
         */
        public java.util.List<ScheduledScalingRules> getScheduledScalingRules() {
            return this.scheduledScalingRules;
        }

        public static final class Builder {
            private java.util.List<ScheduledScalingRules> scheduledScalingRules; 

            private Builder() {
            } 

            private Builder(DataScheduledScalingRules model) {
                this.scheduledScalingRules = model.scheduledScalingRules;
            } 

            /**
             * ScheduledScalingRules.
             */
            public Builder scheduledScalingRules(java.util.List<ScheduledScalingRules> scheduledScalingRules) {
                this.scheduledScalingRules = scheduledScalingRules;
                return this;
            }

            public DataScheduledScalingRules build() {
                return new DataScheduledScalingRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoScalingConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScalingConfigurationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScheduledScalingRules")
        private DataScheduledScalingRules scheduledScalingRules;

        private Data(Builder builder) {
            this.scheduledScalingRules = builder.scheduledScalingRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return scheduledScalingRules
         */
        public DataScheduledScalingRules getScheduledScalingRules() {
            return this.scheduledScalingRules;
        }

        public static final class Builder {
            private DataScheduledScalingRules scheduledScalingRules; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.scheduledScalingRules = model.scheduledScalingRules;
            } 

            /**
             * ScheduledScalingRules.
             */
            public Builder scheduledScalingRules(DataScheduledScalingRules scheduledScalingRules) {
                this.scheduledScalingRules = scheduledScalingRules;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
