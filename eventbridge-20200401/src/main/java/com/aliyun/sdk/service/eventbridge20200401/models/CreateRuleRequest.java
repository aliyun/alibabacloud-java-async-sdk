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
    private java.util.List<EventTargets> eventTargets;

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
    public java.util.List<EventTargets> getEventTargets() {
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
        private java.util.List<EventTargets> eventTargets; 
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
         * <p>The description of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>Filter rule for Simple Message Queue (formerly MNS) (SMQ)</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the event bus.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyEventBus</p>
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * <p>The list of event targets.</p>
         */
        public Builder eventTargets(java.util.List<EventTargets> eventTargets) {
            String eventTargetsShrink = shrink(eventTargets, "EventTargets", "json");
            this.putQueryParameter("EventTargets", eventTargetsShrink);
            this.eventTargets = eventTargets;
            return this;
        }

        /**
         * <p>The event pattern in JSON format. The following patterns are supported:</p>
         * <ul>
         * <li>stringEqual pattern</li>
         * <li>stringExpression pattern
         * Each field supports up to five expressions in a map structure.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;source&quot;: [
         *     {
         *       &quot;prefix&quot;: &quot;acs.&quot;
         *     }
         *   ],
         *   &quot;type&quot;: [
         *     {
         *       &quot;prefix&quot;: &quot;oss:ObjectReplication&quot;
         *     }
         *   ],
         *   &quot;subject&quot;: [
         *     {
         *       &quot;prefix&quot;: &quot;acs:oss:cn-hangzhou:123456789098****:my-movie-bucket/&quot;,
         *       &quot;suffix&quot;: &quot;.txt&quot;
         *     }
         *   ]
         * }</p>
         */
        public Builder filterPattern(String filterPattern) {
            this.putQueryParameter("FilterPattern", filterPattern);
            this.filterPattern = filterPattern;
            return this;
        }

        /**
         * <p>The name of the event rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SMQRule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li>ENABLE: The rule is enabled. This is the default status.</li>
         * <li>DISABLE: The rule is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
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

    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
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
             * <p>The number of concurrent executions.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class DeadLetterQueue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private String vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private DeadLetterQueue(Builder builder) {
            this.arn = builder.arn;
            this.network = builder.network;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
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

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchIds
         */
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String arn; 
            private String network; 
            private String securityGroupId; 
            private String vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(DeadLetterQueue model) {
                this.arn = model.arn;
                this.network = model.network;
                this.securityGroupId = model.securityGroupId;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ARN of the dead-letter queue. Unprocessed events or events that exceed the retry count are written to the dead-letter queue. Simple Message Queue (formerly MNS) and ApsaraMQ for RocketMQ are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:mns:cn-hangzhou:123456789098****:/queues/deadletterqueue</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The network type.</p>
             * 
             * <strong>example:</strong>
             * <p>PrivateNetwork</p>
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2d****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-m12345****</p>
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The ID of the VPC where the dead-letter queue resides.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2z****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public DeadLetterQueue build() {
                return new DeadLetterQueue(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
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
             * <p>The format of the event target parameter. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The resource parameter of the event target. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>body</p>
             */
            public Builder resourceKey(String resourceKey) {
                this.resourceKey = resourceKey;
                return this;
            }

            /**
             * <p>The parameter template style of the event target.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value of the event target parameter.</p>
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
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class EventTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConcurrentConfig")
        private ConcurrentConfig concurrentConfig;

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
        private java.util.List<ParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("PushRetryStrategy")
        private String pushRetryStrategy;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private EventTargets(Builder builder) {
            this.concurrentConfig = builder.concurrentConfig;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ConcurrentConfig concurrentConfig; 
            private DeadLetterQueue deadLetterQueue; 
            private String endpoint; 
            private String errorsTolerance; 
            private String id; 
            private java.util.List<ParamList> paramList; 
            private String pushRetryStrategy; 
            private String type; 

            private Builder() {
            } 

            private Builder(EventTargets model) {
                this.concurrentConfig = model.concurrentConfig;
                this.deadLetterQueue = model.deadLetterQueue;
                this.endpoint = model.endpoint;
                this.errorsTolerance = model.errorsTolerance;
                this.id = model.id;
                this.paramList = model.paramList;
                this.pushRetryStrategy = model.pushRetryStrategy;
                this.type = model.type;
            } 

            /**
             * <p>The concurrency control configuration.</p>
             */
            public Builder concurrentConfig(ConcurrentConfig concurrentConfig) {
                this.concurrentConfig = concurrentConfig;
                return this;
            }

            /**
             * <p>The dead-letter queue. Unprocessed events or events that exceed the retry count are written to the dead-letter queue. Supported queue types include ApsaraMQ for RocketMQ, Simple Message Queue (formerly MNS), ApsaraMQ for Kafka, and EventBridge event buses.</p>
             */
            public Builder deadLetterQueue(DeadLetterQueue deadLetterQueue) {
                this.deadLetterQueue = deadLetterQueue;
                return this;
            }

            /**
             * <p>The endpoint URL for delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:mns:cn-hangzhou:123456789098****:queues/myqueue</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The fault tolerance strategy. Valid values:</p>
             * <ul>
             * <li>ALL: allows fault tolerance. Exceptions do not block execution. If the retry strategy is exhausted, messages are delivered to the dead-letter queue or discarded based on the configuration.</li>
             * <li>NONE: disables fault tolerance. Exceptions block execution when the retry strategy is exhausted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder errorsTolerance(String errorsTolerance) {
                this.errorsTolerance = errorsTolerance;
                return this;
            }

            /**
             * <p>The custom ID of the event target.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Mlm123456JHd2RsRoKw</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The parameters of the event target.</p>
             */
            public Builder paramList(java.util.List<ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * <p>The retry policy for pushing events. Valid values:</p>
             * <ul>
             * <li>BACKOFF_RETRY: backoff retry policy. The system retries 3 times, with a random interval of 10 to 20 seconds between each retry.</li>
             * <li>EXPONENTIAL_DECAY_RETRY: exponential decay retry. The system retries 176 times, with the interval exponentially incrementing to 512 seconds. The total retry time is 1 day. The specific intervals are 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, and then 512 seconds for the remaining 167 retries.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BACKOFF_RETRY</p>
             */
            public Builder pushRetryStrategy(String pushRetryStrategy) {
                this.pushRetryStrategy = pushRetryStrategy;
                return this;
            }

            /**
             * <p>The type of the event target. For more information, see <a href="https://help.aliyun.com/document_detail/185887.html">Event target parameters</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>acs.mns.queue</p>
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
