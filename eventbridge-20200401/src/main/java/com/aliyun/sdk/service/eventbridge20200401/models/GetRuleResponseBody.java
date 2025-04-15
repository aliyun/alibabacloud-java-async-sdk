// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link GetRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetRuleResponseBody</p>
 */
public class GetRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(GetRuleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. The value Success indicates that the request is successful. Other values indicate that the request failed. For a list of error codes, see Error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The event rule not existed!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2BC1857D-E633-5E79-B2C2-43EF5F7730D8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. If the operation is successful, the value true is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRuleResponseBody build() {
            return new GetRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class ConcurrentConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private Long concurrency;

        private ConcurrentConfig(Builder builder) {
            this.concurrency = builder.concurrency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConcurrentConfig create() {
            return builder().build();
        }

        /**
         * @return concurrency
         */
        public Long getConcurrency() {
            return this.concurrency;
        }

        public static final class Builder {
            private Long concurrency; 

            private Builder() {
            } 

            private Builder(ConcurrentConfig model) {
                this.concurrency = model.concurrency;
            } 

            /**
             * Concurrency.
             */
            public Builder concurrency(Long concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            public ConcurrentConfig build() {
                return new ConcurrentConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DeadLetterQueue model) {
                this.arn = model.arn;
            } 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the dead-letter queue.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:eventbridge:cn-hangzhou:164901546557****:eventbus/my-event-bus/eventsource/myRocketMQ.source</p>
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
    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ParamList model) {
                this.form = model.form;
                this.resourceKey = model.resourceKey;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The format that is used by the event target parameter. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The resource key of the event target. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>body</p>
             */
            public Builder resourceKey(String resourceKey) {
                this.resourceKey = resourceKey;
                return this;
            }

            /**
             * <p>The template based on which events are delivered to the event target.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The event target.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key&quot;=&quot;value&quot;}</p>
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
    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConcurrentConfig")
        private ConcurrentConfig concurrentConfig;

        @com.aliyun.core.annotation.NameInMap("DeadLetterQueue")
        private DeadLetterQueue deadLetterQueue;

        @com.aliyun.core.annotation.NameInMap("DetailMap")
        private java.util.Map<String, ?> detailMap;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("ErrorsTolerance")
        private String errorsTolerance;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List<ParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("PushRetryStrategy")
        private String pushRetryStrategy;

        @com.aliyun.core.annotation.NameInMap("PushSelector")
        private String pushSelector;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Targets(Builder builder) {
            this.concurrentConfig = builder.concurrentConfig;
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
         * @return concurrentConfig
         */
        public ConcurrentConfig getConcurrentConfig() {
            return this.concurrentConfig;
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
        public java.util.Map<String, ?> getDetailMap() {
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
        public java.util.List<ParamList> getParamList() {
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
            private ConcurrentConfig concurrentConfig; 
            private DeadLetterQueue deadLetterQueue; 
            private java.util.Map<String, ?> detailMap; 
            private String endpoint; 
            private String errorsTolerance; 
            private String id; 
            private java.util.List<ParamList> paramList; 
            private String pushRetryStrategy; 
            private String pushSelector; 
            private String type; 

            private Builder() {
            } 

            private Builder(Targets model) {
                this.concurrentConfig = model.concurrentConfig;
                this.deadLetterQueue = model.deadLetterQueue;
                this.detailMap = model.detailMap;
                this.endpoint = model.endpoint;
                this.errorsTolerance = model.errorsTolerance;
                this.id = model.id;
                this.paramList = model.paramList;
                this.pushRetryStrategy = model.pushRetryStrategy;
                this.pushSelector = model.pushSelector;
                this.type = model.type;
            } 

            /**
             * ConcurrentConfig.
             */
            public Builder concurrentConfig(ConcurrentConfig concurrentConfig) {
                this.concurrentConfig = concurrentConfig;
                return this;
            }

            /**
             * <p>The dead-letter queue.</p>
             */
            public Builder deadLetterQueue(DeadLetterQueue deadLetterQueue) {
                this.deadLetterQueue = deadLetterQueue;
                return this;
            }

            /**
             * <p>The information about the event target.</p>
             */
            public Builder detailMap(java.util.Map<String, ?> detailMap) {
                this.detailMap = detailMap;
                return this;
            }

            /**
             * <p>The endpoint of the event target.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:mns:cn-hangzhou:123456789098****:queues/myqueue</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The fault tolerance policy. Valid values: ALL and NONE. ALL: Fault tolerance is allowed. If an error occurs in an event, event processing is not blocked. If the event fails to be sent after the maximum number of retries specified by the retry policy is reached, the event is delivered to the dead-letter queue or discarded based on your configurations. NONE: Fault tolerance is not allowed. If an error occurs in an event and the event fails to be sent after the maximum number of retries specified by the retry policy is reached, event processing is blocked.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder errorsTolerance(String errorsTolerance) {
                this.errorsTolerance = errorsTolerance;
                return this;
            }

            /**
             * <p>The ID of the event target.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The parameters that are configured for the event target.</p>
             */
            public Builder paramList(java.util.List<ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * <p>The retry policy that is used to push failed events. Valid values: BACKOFF_RETRY and EXPONENTIAL_DECAY_RETRY. BACKOFF_RETRY: backoff retry. A failed event can be retried up to three times. The interval between two consecutive retries is a random value between 10 seconds and 20 seconds. EXPONENTIAL_DECAY_RETRY: exponential decay retry. A failed event can be retried up to 176 times. The interval between two consecutive retries exponentially increases to a maximum of 512 seconds. The total retry time is 1 day. The specific retry intervals are 1, 2, 4, 8, 16, 32, 64, 128, 256, and 512 seconds. The interval of 512 seconds is used for 167 retries.</p>
             * 
             * <strong>example:</strong>
             * <p>BACKOFF_RETRY</p>
             */
            public Builder pushRetryStrategy(String pushRetryStrategy) {
                this.pushRetryStrategy = pushRetryStrategy;
                return this;
            }

            /**
             * <p>The transformer that is used to push events.</p>
             * 
             * <strong>example:</strong>
             * <p>MATCHED_EVENT</p>
             */
            public Builder pushSelector(String pushSelector) {
                this.pushSelector = pushSelector;
                return this;
            }

            /**
             * <p>The type of the event target. For more information, see <a href="https://help.aliyun.com/document_detail/185887.html">Event target parameters</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>acs.mns.queue</p>
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
    /**
     * 
     * {@link GetRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTimestamp")
        private Long createdTimestamp;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EventBusName")
        private String eventBusName;

        @com.aliyun.core.annotation.NameInMap("FilterPattern")
        private String filterPattern;

        @com.aliyun.core.annotation.NameInMap("RuleARN")
        private String ruleARN;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Targets")
        private java.util.List<Targets> targets;

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
        public java.util.List<Targets> getTargets() {
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
            private java.util.List<Targets> targets; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdTimestamp = model.createdTimestamp;
                this.description = model.description;
                this.eventBusName = model.eventBusName;
                this.filterPattern = model.filterPattern;
                this.ruleARN = model.ruleARN;
                this.ruleName = model.ruleName;
                this.status = model.status;
                this.targets = model.targets;
            } 

            /**
             * <p>The timestamp that indicates when the event rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1607071602000</p>
             */
            public Builder createdTimestamp(Long createdTimestamp) {
                this.createdTimestamp = createdTimestamp;
                return this;
            }

            /**
             * <p>The description of the event rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the event bus.</p>
             * 
             * <strong>example:</strong>
             * <p>Housekeeping-Bus</p>
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * <p>The event pattern, in JSON format. Valid values: stringEqual and stringExpression. You can specify up to five expressions in the map data structure in each field.</p>
             * <p>You can specify up to five expressions in the map data structure in each field.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;source&quot;:[&quot;acs.oss&quot;],&quot;type&quot;:[&quot;oss:BucketQueried:GetBucketStat&quot;]}</p>
             */
            public Builder filterPattern(String filterPattern) {
                this.filterPattern = filterPattern;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the event rule.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:eventbridge:cn-hangzhou:123456789098****:eventbus/default/rule/myRule3</p>
             */
            public Builder ruleARN(String ruleARN) {
                this.ruleARN = ruleARN;
                return this;
            }

            /**
             * <p>The name of the event rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ramrolechange-fc</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The status of the event rule. Valid values: ENABLE (default): The event rule is enabled. DISABLE: The event rule is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The event targets.</p>
             */
            public Builder targets(java.util.List<Targets> targets) {
                this.targets = targets;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
