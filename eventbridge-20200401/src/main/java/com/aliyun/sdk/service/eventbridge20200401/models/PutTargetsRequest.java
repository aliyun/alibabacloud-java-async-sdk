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
    private java.util.List<Targets> targets;

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
    public java.util.List<Targets> getTargets() {
        return this.targets;
    }

    public static final class Builder extends Request.Builder<PutTargetsRequest, Builder> {
        private String eventBusName; 
        private String ruleName; 
        private java.util.List<Targets> targets; 

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
         * <p>The name of the event bus.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eventTest</p>
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * <p>The name of the event rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ssr-send-to-vendor-test01</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The event targets to be created or updated. For more information, see <a href="https://www.alibabacloud.com/help/en/eventbridge/latest/limits">Limits.</a></p>
         * <p>This parameter is required.</p>
         */
        public Builder targets(java.util.List<Targets> targets) {
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

    /**
     * 
     * {@link PutTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutTargetsRequest</p>
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
     * {@link PutTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutTargetsRequest</p>
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
             * <p>The Alibaba Cloud Resource Name (ARN) of the dead-letter queue. Events that are not processed or whose maximum retries have been exceeded are written to the dead-letter queue.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:mns:cn-hangzhou:123456789098****:/queues/deadletterqueue or acs:mq:cn-hangzhou:123456789098****:/instances/MQ_INST_123456789098****_BX8QbBPL/topic/deadlettertopic or acs:alikafka:cn-hangzhou:123456789098****:instance/alikafka_post-cn-123456/topic/deadlettertopic or acs:eventbridge:cn-hangzhou:123456789098****:eventbus/deadletterbus</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * Network.
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * VpcId.
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
     * {@link PutTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutTargetsRequest</p>
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
             * <p>The method that is used to deliver events to the event target. For more information,see <a href="https://www.alibabacloud.com/help/en/eventbridge/latest/event-target-parameters">Event target parameters.</a></p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The resource parameter of the event target. For more information,see <a href="https://www.alibabacloud.com/help/en/eventbridge/latest/event-target-parameters">Event target parameters.</a></p>
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
     * {@link PutTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutTargetsRequest</p>
     */
    public static class Targets extends TeaModel {
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

        private Targets(Builder builder) {
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

            private Builder(Targets model) {
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
             * ConcurrentConfig.
             */
            public Builder concurrentConfig(ConcurrentConfig concurrentConfig) {
                this.concurrentConfig = concurrentConfig;
                return this;
            }

            /**
             * <p>The dead-letter queue. Events that are not processed or whose maximum retries have been exceeded are written to the dead-letter queue. The dead-letter queue feature supports the following queue types: Message Queue for Apache RocketMQ, Message Service, Message Queue for Apache Kafka, and event bus.</p>
             */
            public Builder deadLetterQueue(DeadLetterQueue deadLetterQueue) {
                this.deadLetterQueue = deadLetterQueue;
                return this;
            }

            /**
             * <p>The endpoint of the event target.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:fc:cn-hangzhou:123456789098****:services/guide.LATEST/functions/HelloFC</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The fault tolerance policy. Valid values:</p>
             * <ul>
             * <li><p><strong>ALL</strong>: ignores the error. Fault tolerance is allowed. If an error occurs, event processing is not blocked. If the message exceeds the number of retries specified by the retry policy, the message is delivered to a dead-letter queue or discarded based on your configurations.</p>
             * </li>
             * <li><p><strong>NONE</strong>: does not ignore the error. Fault tolerance is prohibited. If an error occurs and the message exceeds the number of retries specified by the retry policy, event processing is blocked.</p>
             * </li>
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
             * <p>The ID of the custom event target.</p>
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
             * <p>The parameters that are configured for the event target.</p>
             */
            public Builder paramList(java.util.List<ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * <p>The retry policy for pushing the event. Valid values:</p>
             * <ul>
             * <li><p><strong>BACKOFF_RETRY</strong>: backoff retry. A failed event can be retried up to three times. The interval between two consecutive retries is a random value from 10 to 20. Unit: seconds.</p>
             * </li>
             * <li><p><strong>EXPONENTIAL_DECAY_RETRY</strong>: exponential decay retry. The request can be retried up to 176 times. The interval between two consecutive retries exponentially increases to 512 seconds, and the total retry time is one day. The specific retry intervals are 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512, ..., and 512 seconds. The interval of 512 seconds can be used up to one hundred and sixty-seven times in total.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BACKOFFRETRY</p>
             */
            public Builder pushRetryStrategy(String pushRetryStrategy) {
                this.pushRetryStrategy = pushRetryStrategy;
                return this;
            }

            /**
             * <p>The type of the event target. For more information, see <a href="https://www.alibabacloud.com/help/en/eventbridge/latest/event-target-parameters">Event target parameters.</a></p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>acs.fc.function</p>
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
