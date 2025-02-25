// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link CreateRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRuleRequest</p>
 */
public class CreateRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventBusName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventTargets")
    private java.util.List < EventTargets> eventTargets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterPattern")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filterPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateRuleRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.eventBusName = builder.eventBusName;
        this.eventTargets = builder.eventTargets;
        this.filterPattern = builder.filterPattern;
        this.ruleName = builder.ruleName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return eventTargets
     */
    public java.util.List < EventTargets> getEventTargets() {
        return this.eventTargets;
    }

    /**
     * @return filterPattern
     */
    public String getFilterPattern() {
        return this.filterPattern;
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

    public static final class Builder extends Request.Builder<CreateRuleRequest, Builder> {
        private String description; 
        private String eventBusName; 
        private java.util.List < EventTargets> eventTargets; 
        private String filterPattern; 
        private String ruleName; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(CreateRuleRequest request) {
            super(request);
            this.description = request.description;
            this.eventBusName = request.eventBusName;
            this.eventTargets = request.eventTargets;
            this.filterPattern = request.filterPattern;
            this.ruleName = request.ruleName;
            this.status = request.status;
        } 

        /**
         * The description of the event bus.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the event bus.
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * The event targets.
         */
        public Builder eventTargets(java.util.List < EventTargets> eventTargets) {
            String eventTargetsShrink = shrink(eventTargets, "EventTargets", "json");
            this.putQueryParameter("EventTargets", eventTargetsShrink);
            this.eventTargets = eventTargets;
            return this;
        }

        /**
         * The event pattern, in JSON format. Valid values: stringEqual and stringExpression. You can specify up to five expressions in the map data structure in each field.
         * <p>
         * 
         * You can specify up to five expressions in the map data structure in each field.
         */
        public Builder filterPattern(String filterPattern) {
            this.putQueryParameter("FilterPattern", filterPattern);
            this.filterPattern = filterPattern;
            return this;
        }

        /**
         * The name of the event rule.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The status of the event rule. Valid values: ENABLE: enables the event rule. It is the default status of the event rule. DISABLE: disables the event rule.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public CreateRuleRequest build() {
            return new CreateRuleRequest(this);
        } 

    } 

    public static class DeadLetterQueue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
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
             * The Alibaba Cloud Resource Name (ARN) of the dead-letter queue. Events that are not processed or whose maximum retries are exceeded are written to the dead-letter queue. The ARN feature is supported by the following queue types: MNS and Message Queue for Apache RocketMQ.
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
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("ResourceKey")
        private String resourceKey;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The format that is used by the event target parameter. For more information, see [Limits.](https://www.alibabacloud.com/help/en/eventbridge/latest/limits)
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The resource parameter of the event target. For more information, see [Limits](https://www.alibabacloud.com/help/en/eventbridge/latest/limits)
             */
            public Builder resourceKey(String resourceKey) {
                this.resourceKey = resourceKey;
                return this;
            }

            /**
             * The template that is used by the event target parameter.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The value of the event target parameter.
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
    public static class EventTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeadLetterQueue")
        private DeadLetterQueue deadLetterQueue;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("ErrorsTolerance")
        private String errorsTolerance;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List < ParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("PushRetryStrategy")
        private String pushRetryStrategy;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private EventTargets(Builder builder) {
            this.deadLetterQueue = builder.deadLetterQueue;
            this.endpoint = builder.endpoint;
            this.errorsTolerance = builder.errorsTolerance;
            this.id = builder.id;
            this.paramList = builder.paramList;
            this.pushRetryStrategy = builder.pushRetryStrategy;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventTargets create() {
            return builder().build();
        }

        /**
         * @return deadLetterQueue
         */
        public DeadLetterQueue getDeadLetterQueue() {
            return this.deadLetterQueue;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private DeadLetterQueue deadLetterQueue; 
            private String endpoint; 
            private String errorsTolerance; 
            private String id; 
            private java.util.List < ParamList> paramList; 
            private String pushRetryStrategy; 
            private String type; 

            /**
             * The dead-letter queue. Events that are not processed or whose maximum retries are exceeded are written to the dead-letter queue. The dead-letter queue feature is supported by the following queue types: Message Queue for Apache RocketMQ, Message Service (MNS), Message Queue for Apache Kafka, and EventBridge.
             */
            public Builder deadLetterQueue(DeadLetterQueue deadLetterQueue) {
                this.deadLetterQueue = deadLetterQueue;
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
             * The fault tolerance policy. Valid values: ALL: allows fault tolerance. If an error occurs, the event processing is not blocked. If the message fails to be sent after the maximum number of retries specified by the retry policy is reached, the message is delivered to the dead-letter queue or discarded based on your configurations. NONE: does not allow fault tolerance. If an error occurs and the message fails to be sent after the maximum number of retries specified by the retry policy is reached, the event processing is blocked.
             */
            public Builder errorsTolerance(String errorsTolerance) {
                this.errorsTolerance = errorsTolerance;
                return this;
            }

            /**
             * The ID of the custom event target.
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
             * The retry policy that is used to push events. Valid values: BACKOFF_RETRY: backoff retry. If an event failed to be pushed, it can be retried up to three times. The interval between two consecutive retries is a random value between 10 and 20 seconds. EXPONENTIAL_DECAY_RETRY: exponential decay retry. If an event failed to be pushed, it can be retried up to 176 times. The interval between two consecutive retries exponentially increases to 512 seconds, and the total retry time is one day. The specific retry intervals are 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512, ..., and 512 seconds. The interval of 512 seconds is used for 167 retries.
             */
            public Builder pushRetryStrategy(String pushRetryStrategy) {
                this.pushRetryStrategy = pushRetryStrategy;
                return this;
            }

            /**
             * The type of the event target. For more information, see [Event target parameters.](https://www.alibabacloud.com/help/en/eventbridge/latest/event-target-parameters)
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EventTargets build() {
                return new EventTargets(this);
            } 

        } 

    }
}
