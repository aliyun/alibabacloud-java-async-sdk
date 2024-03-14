// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link GetRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetRuleResponseBody</p>
 */
public class GetRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The response code. The value Success indicates that the request is successful. Other values indicate that the request failed. For a list of error codes, see Error codes.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the operation is successful. If the operation is successful, the value true is returned.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRuleResponseBody build() {
            return new GetRuleResponseBody(this);
        } 

    } 

    public static class DeadLetterQueue extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        private DeadLetterQueue(Builder builder) {
            this.arn = builder.arn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeadLetterQueue create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        public static final class Builder {
            private String arn; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the dead-letter queue.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            public DeadLetterQueue build() {
                return new DeadLetterQueue(this);
            } 

        } 

    }
    public static class ParamList extends TeaModel {
        @NameInMap("Form")
        private String form;

        @NameInMap("ResourceKey")
        private String resourceKey;

        @NameInMap("Template")
        private String template;

        @NameInMap("Value")
        private String value;

        private ParamList(Builder builder) {
            this.form = builder.form;
            this.resourceKey = builder.resourceKey;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamList create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return resourceKey
         */
        public String getResourceKey() {
            return this.resourceKey;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String resourceKey; 
            private String template; 
            private String value; 

            /**
             * The method that is used to deliver events to the event target. For more information, see [Limits](~~163289~~).
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The resource key of the event target. For more information, see [Limits](~~163289~~).
             */
            public Builder resourceKey(String resourceKey) {
                this.resourceKey = resourceKey;
                return this;
            }

            /**
             * The template based on which events are delivered to the event target.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The event target.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ParamList build() {
                return new ParamList(this);
            } 

        } 

    }
    public static class Targets extends TeaModel {
        @NameInMap("DeadLetterQueue")
        private DeadLetterQueue deadLetterQueue;

        @NameInMap("DetailMap")
        private java.util.Map < String, ? > detailMap;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("ErrorsTolerance")
        private String errorsTolerance;

        @NameInMap("Id")
        private String id;

        @NameInMap("ParamList")
        private java.util.List < ParamList> paramList;

        @NameInMap("PushRetryStrategy")
        private String pushRetryStrategy;

        @NameInMap("PushSelector")
        private String pushSelector;

        @NameInMap("Type")
        private String type;

        private Targets(Builder builder) {
            this.deadLetterQueue = builder.deadLetterQueue;
            this.detailMap = builder.detailMap;
            this.endpoint = builder.endpoint;
            this.errorsTolerance = builder.errorsTolerance;
            this.id = builder.id;
            this.paramList = builder.paramList;
            this.pushRetryStrategy = builder.pushRetryStrategy;
            this.pushSelector = builder.pushSelector;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return deadLetterQueue
         */
        public DeadLetterQueue getDeadLetterQueue() {
            return this.deadLetterQueue;
        }

        /**
         * @return detailMap
         */
        public java.util.Map < String, ? > getDetailMap() {
            return this.detailMap;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return errorsTolerance
         */
        public String getErrorsTolerance() {
            return this.errorsTolerance;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return paramList
         */
        public java.util.List < ParamList> getParamList() {
            return this.paramList;
        }

        /**
         * @return pushRetryStrategy
         */
        public String getPushRetryStrategy() {
            return this.pushRetryStrategy;
        }

        /**
         * @return pushSelector
         */
        public String getPushSelector() {
            return this.pushSelector;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private DeadLetterQueue deadLetterQueue; 
            private java.util.Map < String, ? > detailMap; 
            private String endpoint; 
            private String errorsTolerance; 
            private String id; 
            private java.util.List < ParamList> paramList; 
            private String pushRetryStrategy; 
            private String pushSelector; 
            private String type; 

            /**
             * The dead-letter queue.
             */
            public Builder deadLetterQueue(DeadLetterQueue deadLetterQueue) {
                this.deadLetterQueue = deadLetterQueue;
                return this;
            }

            /**
             * The information about the event target.
             */
            public Builder detailMap(java.util.Map < String, ? > detailMap) {
                this.detailMap = detailMap;
                return this;
            }

            /**
             * The endpoint of the event target.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The fault tolerance policy. Valid values: ALL: Fault tolerance is allowed. If an error occurs in an event, event processing is not blocked. If the event fails to be sent after the maximum number of retries specified by the retry policy is reached, the event is delivered to the dead-letter queue or discarded based on your configurations. NONE: Fault tolerance is not allowed. If an error occurs in an event and the event fails to be sent after the maximum number of retries specified by the retry policy is reached, event processing is blocked.
             */
            public Builder errorsTolerance(String errorsTolerance) {
                this.errorsTolerance = errorsTolerance;
                return this;
            }

            /**
             * The ID of the event target.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The parameters that are configured for the event target.
             */
            public Builder paramList(java.util.List < ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * The retry policy that is used to push failed events. Valid values: BACKOFF_RETRY: backoff retry. A failed event can be retried up to three times. The interval between two consecutive retries is a random value between 10 seconds and 20 seconds. EXPONENTIAL_DECAY_RETRY: exponential decay retry. A failed event can be retried up to 176 times. The interval between two consecutive retries exponentially increases to a maximum of 512 seconds. The total retry time is 1 day. The specific retry intervals are 1, 2, 4, 8, 16, 32, 64, 128, 256, and 512 seconds. The interval of 512 seconds is used for 167 retries.
             */
            public Builder pushRetryStrategy(String pushRetryStrategy) {
                this.pushRetryStrategy = pushRetryStrategy;
                return this;
            }

            /**
             * The transformer that is used to push events.
             */
            public Builder pushSelector(String pushSelector) {
                this.pushSelector = pushSelector;
                return this;
            }

            /**
             * The type of the event target. For more information, see [Event target parameters](~~185887~~).
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CreatedTimestamp")
        private Long createdTimestamp;

        @NameInMap("Description")
        private String description;

        @NameInMap("EventBusName")
        private String eventBusName;

        @NameInMap("FilterPattern")
        private String filterPattern;

        @NameInMap("RuleARN")
        private String ruleARN;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Status")
        private String status;

        @NameInMap("Targets")
        private java.util.List < Targets> targets;

        private Data(Builder builder) {
            this.createdTimestamp = builder.createdTimestamp;
            this.description = builder.description;
            this.eventBusName = builder.eventBusName;
            this.filterPattern = builder.filterPattern;
            this.ruleARN = builder.ruleARN;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
            this.targets = builder.targets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdTimestamp
         */
        public Long getCreatedTimestamp() {
            return this.createdTimestamp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eventBusName
         */
        public String getEventBusName() {
            return this.eventBusName;
        }

        /**
         * @return filterPattern
         */
        public String getFilterPattern() {
            return this.filterPattern;
        }

        /**
         * @return ruleARN
         */
        public String getRuleARN() {
            return this.ruleARN;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targets
         */
        public java.util.List < Targets> getTargets() {
            return this.targets;
        }

        public static final class Builder {
            private Long createdTimestamp; 
            private String description; 
            private String eventBusName; 
            private String filterPattern; 
            private String ruleARN; 
            private String ruleName; 
            private String status; 
            private java.util.List < Targets> targets; 

            /**
             * The timestamp that indicates when the event rule was created.
             */
            public Builder createdTimestamp(Long createdTimestamp) {
                this.createdTimestamp = createdTimestamp;
                return this;
            }

            /**
             * The description of the event rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the event bus.
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * The event pattern, in JSON format. Valid values: stringEqual and stringExpression. You can specify up to five expressions in the map data structure in each field.
             * <p>
             * 
             * You can specify up to five expressions in the map data structure in each field.
             */
            public Builder filterPattern(String filterPattern) {
                this.filterPattern = filterPattern;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the event rule.
             */
            public Builder ruleARN(String ruleARN) {
                this.ruleARN = ruleARN;
                return this;
            }

            /**
             * The name of the event rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The status of the event rule. Valid values: ENABLE (default): The event rule is enabled. DISABLE: The event rule is disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The event targets.
             */
            public Builder targets(java.util.List < Targets> targets) {
                this.targets = targets;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
