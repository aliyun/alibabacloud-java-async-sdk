// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link PutTargetsRequest} extends {@link RequestModel}
 *
 * <p>PutTargetsRequest</p>
 */
public class PutTargetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventBusName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Targets> targets;

    private PutTargetsRequest(Builder builder) {
        super(builder);
        this.eventBusName = builder.eventBusName;
        this.ruleName = builder.ruleName;
        this.targets = builder.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutTargetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventBusName
     */
    public String getEventBusName() {
        return this.eventBusName;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return targets
     */
    public java.util.List < Targets> getTargets() {
        return this.targets;
    }

    public static final class Builder extends Request.Builder<PutTargetsRequest, Builder> {
        private String eventBusName; 
        private String ruleName; 
        private java.util.List < Targets> targets; 

        private Builder() {
            super();
        } 

        private Builder(PutTargetsRequest request) {
            super(request);
            this.eventBusName = request.eventBusName;
            this.ruleName = request.ruleName;
            this.targets = request.targets;
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
         * The name of the event rule.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The event targets to be created or updated. For more information, see [Limits.](https://www.alibabacloud.com/help/en/eventbridge/latest/limits)
         */
        public Builder targets(java.util.List < Targets> targets) {
            String targetsShrink = shrink(targets, "Targets", "json");
            this.putQueryParameter("Targets", targetsShrink);
            this.targets = targets;
            return this;
        }

        @Override
        public PutTargetsRequest build() {
            return new PutTargetsRequest(this);
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
             * The Alibaba Cloud Resource Name (ARN) of the dead-letter queue. Events that are not processed or whose maximum retries have been exceeded are written to the dead-letter queue.
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
             * The method that is used to deliver events to the event target. For more information,see [Event target parameters.](https://www.alibabacloud.com/help/en/eventbridge/latest/event-target-parameters)
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The resource parameter of the event target. For more information,see [Event target parameters.](https://www.alibabacloud.com/help/en/eventbridge/latest/event-target-parameters)
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
    public static class Targets extends TeaModel {
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

        private Targets(Builder builder) {
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
             * The dead-letter queue. Events that are not processed or whose maximum retries have been exceeded are written to the dead-letter queue. The dead-letter queue feature supports the following queue types: Message Queue for Apache RocketMQ, Message Service, Message Queue for Apache Kafka, and event bus.
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
             * The fault tolerance policy. Valid values:
             * <p>
             * 
             * * **ALL**: ignores the error. Fault tolerance is allowed. If an error occurs, event processing is not blocked. If the message exceeds the number of retries specified by the retry policy, the message is delivered to a dead-letter queue or discarded based on your configurations.
             * 
             * * **NONE**: does not ignore the error. Fault tolerance is prohibited. If an error occurs and the message exceeds the number of retries specified by the retry policy, event processing is blocked.
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
             * The retry policy for pushing the event. Valid values:
             * <p>
             * 
             * * **BACKOFF_RETRY**: backoff retry. A failed event can be retried up to three times. The interval between two consecutive retries is a random value from 10 to 20. Unit: seconds.
             * 
             * * **EXPONENTIAL_DECAY_RETRY**: exponential decay retry. The request can be retried up to 176 times. The interval between two consecutive retries exponentially increases to 512 seconds, and the total retry time is one day. The specific retry intervals are 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512, ..., and 512 seconds. The interval of 512 seconds can be used up to one hundred and sixty-seven times in total.
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

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
}
