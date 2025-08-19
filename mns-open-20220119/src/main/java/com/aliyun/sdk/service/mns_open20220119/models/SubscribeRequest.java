// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

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
 * {@link SubscribeRequest} extends {@link RequestModel}
 *
 * <p>SubscribeRequest</p>
 */
public class SubscribeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DlqPolicy")
    private DlqPolicy dlqPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DmAttributes")
    private DmAttributes dmAttributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DysmsAttributes")
    private DysmsAttributes dysmsAttributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KafkaAttributes")
    private KafkaAttributes kafkaAttributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageTag")
    private String messageTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyContentFormat")
    private String notifyContentFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyStrategy")
    private String notifyStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pushType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StsRoleArn")
    private String stsRoleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantRateLimitPolicy")
    private TenantRateLimitPolicy tenantRateLimitPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicName;

    private SubscribeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dlqPolicy = builder.dlqPolicy;
        this.dmAttributes = builder.dmAttributes;
        this.dysmsAttributes = builder.dysmsAttributes;
        this.endpoint = builder.endpoint;
        this.kafkaAttributes = builder.kafkaAttributes;
        this.messageTag = builder.messageTag;
        this.notifyContentFormat = builder.notifyContentFormat;
        this.notifyStrategy = builder.notifyStrategy;
        this.pushType = builder.pushType;
        this.stsRoleArn = builder.stsRoleArn;
        this.subscriptionName = builder.subscriptionName;
        this.tenantRateLimitPolicy = builder.tenantRateLimitPolicy;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscribeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dlqPolicy
     */
    public DlqPolicy getDlqPolicy() {
        return this.dlqPolicy;
    }

    /**
     * @return dmAttributes
     */
    public DmAttributes getDmAttributes() {
        return this.dmAttributes;
    }

    /**
     * @return dysmsAttributes
     */
    public DysmsAttributes getDysmsAttributes() {
        return this.dysmsAttributes;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return kafkaAttributes
     */
    public KafkaAttributes getKafkaAttributes() {
        return this.kafkaAttributes;
    }

    /**
     * @return messageTag
     */
    public String getMessageTag() {
        return this.messageTag;
    }

    /**
     * @return notifyContentFormat
     */
    public String getNotifyContentFormat() {
        return this.notifyContentFormat;
    }

    /**
     * @return notifyStrategy
     */
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    /**
     * @return pushType
     */
    public String getPushType() {
        return this.pushType;
    }

    /**
     * @return stsRoleArn
     */
    public String getStsRoleArn() {
        return this.stsRoleArn;
    }

    /**
     * @return subscriptionName
     */
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * @return tenantRateLimitPolicy
     */
    public TenantRateLimitPolicy getTenantRateLimitPolicy() {
        return this.tenantRateLimitPolicy;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder extends Request.Builder<SubscribeRequest, Builder> {
        private String regionId; 
        private DlqPolicy dlqPolicy; 
        private DmAttributes dmAttributes; 
        private DysmsAttributes dysmsAttributes; 
        private String endpoint; 
        private KafkaAttributes kafkaAttributes; 
        private String messageTag; 
        private String notifyContentFormat; 
        private String notifyStrategy; 
        private String pushType; 
        private String stsRoleArn; 
        private String subscriptionName; 
        private TenantRateLimitPolicy tenantRateLimitPolicy; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(SubscribeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dlqPolicy = request.dlqPolicy;
            this.dmAttributes = request.dmAttributes;
            this.dysmsAttributes = request.dysmsAttributes;
            this.endpoint = request.endpoint;
            this.kafkaAttributes = request.kafkaAttributes;
            this.messageTag = request.messageTag;
            this.notifyContentFormat = request.notifyContentFormat;
            this.notifyStrategy = request.notifyStrategy;
            this.pushType = request.pushType;
            this.stsRoleArn = request.stsRoleArn;
            this.subscriptionName = request.subscriptionName;
            this.tenantRateLimitPolicy = request.tenantRateLimitPolicy;
            this.topicName = request.topicName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The dead-letter queue policy.</p>
         */
        public Builder dlqPolicy(DlqPolicy dlqPolicy) {
            String dlqPolicyShrink = shrink(dlqPolicy, "DlqPolicy", "json");
            this.putQueryParameter("DlqPolicy", dlqPolicyShrink);
            this.dlqPolicy = dlqPolicy;
            return this;
        }

        /**
         * DmAttributes.
         */
        public Builder dmAttributes(DmAttributes dmAttributes) {
            String dmAttributesShrink = shrink(dmAttributes, "DmAttributes", "json");
            this.putQueryParameter("DmAttributes", dmAttributesShrink);
            this.dmAttributes = dmAttributes;
            return this;
        }

        /**
         * DysmsAttributes.
         */
        public Builder dysmsAttributes(DysmsAttributes dysmsAttributes) {
            String dysmsAttributesShrink = shrink(dysmsAttributes, "DysmsAttributes", "json");
            this.putQueryParameter("DysmsAttributes", dysmsAttributesShrink);
            this.dysmsAttributes = dysmsAttributes;
            return this;
        }

        /**
         * <p>The receiver endpoint. The format of the endpoint varies based on the terminal type.</p>
         * <ul>
         * <li>If you set PushType to http, set Endpoint to an <code>HTTP URL that starts with http:// or https://</code>.</li>
         * <li>If you set PushType to queue, set Endpoint to a <code>queue name</code>.</li>
         * <li>If you set PushType to mpush, set Endpoint to an <code>AppKey</code>.</li>
         * <li>If you set PushType to alisms, set Endpoint to a <code>mobile number</code>.</li>
         * <li>If you set PushType to email, set Endpoint to an <code>email address</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * KafkaAttributes.
         */
        public Builder kafkaAttributes(KafkaAttributes kafkaAttributes) {
            String kafkaAttributesShrink = shrink(kafkaAttributes, "KafkaAttributes", "json");
            this.putQueryParameter("KafkaAttributes", kafkaAttributesShrink);
            this.kafkaAttributes = kafkaAttributes;
            return this;
        }

        /**
         * <p>The tag that is used to filter messages. Only messages that have the same tag can be pushed. Set the value to a string of no more than 16 characters.</p>
         * <p>By default, no tag is specified to filter messages.</p>
         * 
         * <strong>example:</strong>
         * <p>important</p>
         */
        public Builder messageTag(String messageTag) {
            this.putQueryParameter("MessageTag", messageTag);
            this.messageTag = messageTag;
            return this;
        }

        /**
         * <p>The content format of the messages that are pushed to the endpoint. Valid values:</p>
         * <ul>
         * <li>XML</li>
         * <li>JSON</li>
         * <li>SIMPLIFIED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>XML</p>
         */
        public Builder notifyContentFormat(String notifyContentFormat) {
            this.putQueryParameter("NotifyContentFormat", notifyContentFormat);
            this.notifyContentFormat = notifyContentFormat;
            return this;
        }

        /**
         * <p>The retry policy that is applied if an error occurs when Message Service (MNS) pushes messages to the endpoint. Valid values:</p>
         * <ul>
         * <li>BACKOFF_RETRY</li>
         * <li>EXPONENTIAL_DECAY_RETRY</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BACKOFF_RETRY</p>
         */
        public Builder notifyStrategy(String notifyStrategy) {
            this.putQueryParameter("NotifyStrategy", notifyStrategy);
            this.notifyStrategy = notifyStrategy;
            return this;
        }

        /**
         * <p>The terminal type. Valid values:</p>
         * <ul>
         * <li>http: HTTP services</li>
         * <li>queue: queues</li>
         * <li>mpush: mobile devices</li>
         * <li>alisms: Alibaba Cloud Short Message Service (SMS)</li>
         * <li>email: emails</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>queue</p>
         */
        public Builder pushType(String pushType) {
            this.putQueryParameter("PushType", pushType);
            this.pushType = pushType;
            return this;
        }

        /**
         * StsRoleArn.
         */
        public Builder stsRoleArn(String stsRoleArn) {
            this.putQueryParameter("StsRoleArn", stsRoleArn);
            this.stsRoleArn = stsRoleArn;
            return this;
        }

        /**
         * <p>The name of the subscription.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testSubscription</p>
         */
        public Builder subscriptionName(String subscriptionName) {
            this.putQueryParameter("SubscriptionName", subscriptionName);
            this.subscriptionName = subscriptionName;
            return this;
        }

        /**
         * TenantRateLimitPolicy.
         */
        public Builder tenantRateLimitPolicy(TenantRateLimitPolicy tenantRateLimitPolicy) {
            String tenantRateLimitPolicyShrink = shrink(tenantRateLimitPolicy, "TenantRateLimitPolicy", "json");
            this.putQueryParameter("TenantRateLimitPolicy", tenantRateLimitPolicyShrink);
            this.tenantRateLimitPolicy = tenantRateLimitPolicy;
            return this;
        }

        /**
         * <p>The name of the topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder topicName(String topicName) {
            this.putQueryParameter("TopicName", topicName);
            this.topicName = topicName;
            return this;
        }

        @Override
        public SubscribeRequest build() {
            return new SubscribeRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubscribeRequest} extends {@link TeaModel}
     *
     * <p>SubscribeRequest</p>
     */
    public static class DlqPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeadLetterTargetQueue")
        private String deadLetterTargetQueue;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private DlqPolicy(Builder builder) {
            this.deadLetterTargetQueue = builder.deadLetterTargetQueue;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DlqPolicy create() {
            return builder().build();
        }

        /**
         * @return deadLetterTargetQueue
         */
        public String getDeadLetterTargetQueue() {
            return this.deadLetterTargetQueue;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private String deadLetterTargetQueue; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(DlqPolicy model) {
                this.deadLetterTargetQueue = model.deadLetterTargetQueue;
                this.enabled = model.enabled;
            } 

            /**
             * <p>The queue to which dead-letter messages are delivered.</p>
             * 
             * <strong>example:</strong>
             * <p>deadLetterTargetQueue</p>
             */
            public Builder deadLetterTargetQueue(String deadLetterTargetQueue) {
                this.deadLetterTargetQueue = deadLetterTargetQueue;
                return this;
            }

            /**
             * <p>Specifies whether to enable the dead-letter message delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public DlqPolicy build() {
                return new DlqPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubscribeRequest} extends {@link TeaModel}
     *
     * <p>SubscribeRequest</p>
     */
    public static class DmAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        private DmAttributes(Builder builder) {
            this.accountName = builder.accountName;
            this.subject = builder.subject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DmAttributes create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        public static final class Builder {
            private String accountName; 
            private String subject; 

            private Builder() {
            } 

            private Builder(DmAttributes model) {
                this.accountName = model.accountName;
                this.subject = model.subject;
            } 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            public DmAttributes build() {
                return new DmAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubscribeRequest} extends {@link TeaModel}
     *
     * <p>SubscribeRequest</p>
     */
    public static class DysmsAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SignName")
        private String signName;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        private DysmsAttributes(Builder builder) {
            this.signName = builder.signName;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DysmsAttributes create() {
            return builder().build();
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private String signName; 
            private String templateCode; 

            private Builder() {
            } 

            private Builder(DysmsAttributes model) {
                this.signName = model.signName;
                this.templateCode = model.templateCode;
            } 

            /**
             * SignName.
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * TemplateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public DysmsAttributes build() {
                return new DysmsAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubscribeRequest} extends {@link TeaModel}
     *
     * <p>SubscribeRequest</p>
     */
    public static class KafkaAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessMode")
        private String businessMode;

        private KafkaAttributes(Builder builder) {
            this.businessMode = builder.businessMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KafkaAttributes create() {
            return builder().build();
        }

        /**
         * @return businessMode
         */
        public String getBusinessMode() {
            return this.businessMode;
        }

        public static final class Builder {
            private String businessMode; 

            private Builder() {
            } 

            private Builder(KafkaAttributes model) {
                this.businessMode = model.businessMode;
            } 

            /**
             * BusinessMode.
             */
            public Builder businessMode(String businessMode) {
                this.businessMode = businessMode;
                return this;
            }

            public KafkaAttributes build() {
                return new KafkaAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubscribeRequest} extends {@link TeaModel}
     *
     * <p>SubscribeRequest</p>
     */
    public static class TenantRateLimitPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("MaxReceivesPerSecond")
        private Integer maxReceivesPerSecond;

        private TenantRateLimitPolicy(Builder builder) {
            this.enabled = builder.enabled;
            this.maxReceivesPerSecond = builder.maxReceivesPerSecond;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantRateLimitPolicy create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return maxReceivesPerSecond
         */
        public Integer getMaxReceivesPerSecond() {
            return this.maxReceivesPerSecond;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Integer maxReceivesPerSecond; 

            private Builder() {
            } 

            private Builder(TenantRateLimitPolicy model) {
                this.enabled = model.enabled;
                this.maxReceivesPerSecond = model.maxReceivesPerSecond;
            } 

            /**
             * <p>Specifies whether to enable the dead-letter message delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * MaxReceivesPerSecond.
             */
            public Builder maxReceivesPerSecond(Integer maxReceivesPerSecond) {
                this.maxReceivesPerSecond = maxReceivesPerSecond;
                return this;
            }

            public TenantRateLimitPolicy build() {
                return new TenantRateLimitPolicy(this);
            } 

        } 

    }
}
