// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateSilencePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateSilencePolicyResponseBody</p>
 */
public class CreateOrUpdateSilencePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SilencePolicy")
    private SilencePolicy silencePolicy;

    private CreateOrUpdateSilencePolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.silencePolicy = builder.silencePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateSilencePolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return silencePolicy
     */
    public SilencePolicy getSilencePolicy() {
        return this.silencePolicy;
    }

    public static final class Builder {
        private String requestId; 
        private SilencePolicy silencePolicy; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A list of silence policies.
         */
        public Builder silencePolicy(SilencePolicy silencePolicy) {
            this.silencePolicy = silencePolicy;
            return this;
        }

        public CreateOrUpdateSilencePolicyResponseBody build() {
            return new CreateOrUpdateSilencePolicyResponseBody(this);
        } 

    } 

    public static class MatchingConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private MatchingConditions(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchingConditions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private String value; 

            /**
             * The key of the matching condition.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The logical operator of the matching condition. Valid values:
             * <p>
             * 
             * *   `eq`: equal to
             * *   `neq`: not equal to
             * *   `in`: contains
             * *   `nin`: does not contain
             * *   `re`: regular expression match
             * *   `nre`: regular expression mismatch
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The value of the matching condition.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MatchingConditions build() {
                return new MatchingConditions(this);
            } 

        } 

    }
    public static class MatchingRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchingConditions")
        private java.util.List < MatchingConditions> matchingConditions;

        private MatchingRules(Builder builder) {
            this.matchingConditions = builder.matchingConditions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchingRules create() {
            return builder().build();
        }

        /**
         * @return matchingConditions
         */
        public java.util.List < MatchingConditions> getMatchingConditions() {
            return this.matchingConditions;
        }

        public static final class Builder {
            private java.util.List < MatchingConditions> matchingConditions; 

            /**
             * A list of matching conditions.
             */
            public Builder matchingConditions(java.util.List < MatchingConditions> matchingConditions) {
                this.matchingConditions = matchingConditions;
                return this;
            }

            public MatchingRules build() {
                return new MatchingRules(this);
            } 

        } 

    }
    public static class SilencePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectiveTimeType")
        private String effectiveTimeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MatchingRules")
        private java.util.List < MatchingRules> matchingRules;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TimePeriod")
        private String timePeriod;

        @com.aliyun.core.annotation.NameInMap("TimeSlots")
        private String timeSlots;

        private SilencePolicy(Builder builder) {
            this.effectiveTimeType = builder.effectiveTimeType;
            this.id = builder.id;
            this.matchingRules = builder.matchingRules;
            this.name = builder.name;
            this.state = builder.state;
            this.timePeriod = builder.timePeriod;
            this.timeSlots = builder.timeSlots;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SilencePolicy create() {
            return builder().build();
        }

        /**
         * @return effectiveTimeType
         */
        public String getEffectiveTimeType() {
            return this.effectiveTimeType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return matchingRules
         */
        public java.util.List < MatchingRules> getMatchingRules() {
            return this.matchingRules;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return timePeriod
         */
        public String getTimePeriod() {
            return this.timePeriod;
        }

        /**
         * @return timeSlots
         */
        public String getTimeSlots() {
            return this.timeSlots;
        }

        public static final class Builder {
            private String effectiveTimeType; 
            private Long id; 
            private java.util.List < MatchingRules> matchingRules; 
            private String name; 
            private String state; 
            private String timePeriod; 
            private String timeSlots; 

            /**
             * EffectiveTimeType.
             */
            public Builder effectiveTimeType(String effectiveTimeType) {
                this.effectiveTimeType = effectiveTimeType;
                return this;
            }

            /**
             * The ID of the silence policy.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * A list of matching rules.
             */
            public Builder matchingRules(java.util.List < MatchingRules> matchingRules) {
                this.matchingRules = matchingRules;
                return this;
            }

            /**
             * The name of the silence policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Specifies whether to enable the silence policy. Valid values: enable and disable.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TimePeriod.
             */
            public Builder timePeriod(String timePeriod) {
                this.timePeriod = timePeriod;
                return this;
            }

            /**
             * TimeSlots.
             */
            public Builder timeSlots(String timeSlots) {
                this.timeSlots = timeSlots;
                return this;
            }

            public SilencePolicy build() {
                return new SilencePolicy(this);
            } 

        } 

    }
}
