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
 * {@link CreateEventSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateEventSourceRequest</p>
 */
public class CreateEventSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventBusName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventSourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventSourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalSourceConfig")
    private java.util.Map<String, ?> externalSourceConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalSourceType")
    private byte[] externalSourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LinkedExternalSource")
    private Boolean linkedExternalSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceHttpEventParameters")
    private SourceHttpEventParameters sourceHttpEventParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceKafkaParameters")
    private SourceKafkaParameters sourceKafkaParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceMNSParameters")
    private SourceMNSParameters sourceMNSParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceRabbitMQParameters")
    private SourceRabbitMQParameters sourceRabbitMQParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceRocketMQParameters")
    private SourceRocketMQParameters sourceRocketMQParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceSLSParameters")
    private SourceSLSParameters sourceSLSParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceScheduledEventParameters")
    private SourceScheduledEventParameters sourceScheduledEventParameters;

    private CreateEventSourceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.eventBusName = builder.eventBusName;
        this.eventSourceName = builder.eventSourceName;
        this.externalSourceConfig = builder.externalSourceConfig;
        this.externalSourceType = builder.externalSourceType;
        this.linkedExternalSource = builder.linkedExternalSource;
        this.sourceHttpEventParameters = builder.sourceHttpEventParameters;
        this.sourceKafkaParameters = builder.sourceKafkaParameters;
        this.sourceMNSParameters = builder.sourceMNSParameters;
        this.sourceRabbitMQParameters = builder.sourceRabbitMQParameters;
        this.sourceRocketMQParameters = builder.sourceRocketMQParameters;
        this.sourceSLSParameters = builder.sourceSLSParameters;
        this.sourceScheduledEventParameters = builder.sourceScheduledEventParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventSourceRequest create() {
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
     * @return eventSourceName
     */
    public String getEventSourceName() {
        return this.eventSourceName;
    }

    /**
     * @return externalSourceConfig
     */
    public java.util.Map<String, ?> getExternalSourceConfig() {
        return this.externalSourceConfig;
    }

    /**
     * @return externalSourceType
     */
    public byte[] getExternalSourceType() {
        return this.externalSourceType;
    }

    /**
     * @return linkedExternalSource
     */
    public Boolean getLinkedExternalSource() {
        return this.linkedExternalSource;
    }

    /**
     * @return sourceHttpEventParameters
     */
    public SourceHttpEventParameters getSourceHttpEventParameters() {
        return this.sourceHttpEventParameters;
    }

    /**
     * @return sourceKafkaParameters
     */
    public SourceKafkaParameters getSourceKafkaParameters() {
        return this.sourceKafkaParameters;
    }

    /**
     * @return sourceMNSParameters
     */
    public SourceMNSParameters getSourceMNSParameters() {
        return this.sourceMNSParameters;
    }

    /**
     * @return sourceRabbitMQParameters
     */
    public SourceRabbitMQParameters getSourceRabbitMQParameters() {
        return this.sourceRabbitMQParameters;
    }

    /**
     * @return sourceRocketMQParameters
     */
    public SourceRocketMQParameters getSourceRocketMQParameters() {
        return this.sourceRocketMQParameters;
    }

    /**
     * @return sourceSLSParameters
     */
    public SourceSLSParameters getSourceSLSParameters() {
        return this.sourceSLSParameters;
    }

    /**
     * @return sourceScheduledEventParameters
     */
    public SourceScheduledEventParameters getSourceScheduledEventParameters() {
        return this.sourceScheduledEventParameters;
    }

    public static final class Builder extends Request.Builder<CreateEventSourceRequest, Builder> {
        private String description; 
        private String eventBusName; 
        private String eventSourceName; 
        private java.util.Map<String, ?> externalSourceConfig; 
        private byte[] externalSourceType; 
        private Boolean linkedExternalSource; 
        private SourceHttpEventParameters sourceHttpEventParameters; 
        private SourceKafkaParameters sourceKafkaParameters; 
        private SourceMNSParameters sourceMNSParameters; 
        private SourceRabbitMQParameters sourceRabbitMQParameters; 
        private SourceRocketMQParameters sourceRocketMQParameters; 
        private SourceSLSParameters sourceSLSParameters; 
        private SourceScheduledEventParameters sourceScheduledEventParameters; 

        private Builder() {
            super();
        } 

        private Builder(CreateEventSourceRequest request) {
            super(request);
            this.description = request.description;
            this.eventBusName = request.eventBusName;
            this.eventSourceName = request.eventSourceName;
            this.externalSourceConfig = request.externalSourceConfig;
            this.externalSourceType = request.externalSourceType;
            this.linkedExternalSource = request.linkedExternalSource;
            this.sourceHttpEventParameters = request.sourceHttpEventParameters;
            this.sourceKafkaParameters = request.sourceKafkaParameters;
            this.sourceMNSParameters = request.sourceMNSParameters;
            this.sourceRabbitMQParameters = request.sourceRabbitMQParameters;
            this.sourceRocketMQParameters = request.sourceRocketMQParameters;
            this.sourceSLSParameters = request.sourceSLSParameters;
            this.sourceScheduledEventParameters = request.sourceScheduledEventParameters;
        } 

        /**
         * <p>The description of the event source.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the event bus with which the event source is associated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-event-bus</p>
         */
        public Builder eventBusName(String eventBusName) {
            this.putBodyParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * <p>The name of the event source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myrabbitmq.sourc</p>
         */
        public Builder eventSourceName(String eventSourceName) {
            this.putBodyParameter("EventSourceName", eventSourceName);
            this.eventSourceName = eventSourceName;
            return this;
        }

        /**
         * <p>The configurations of the external data source.</p>
         */
        public Builder externalSourceConfig(java.util.Map<String, ?> externalSourceConfig) {
            String externalSourceConfigShrink = shrink(externalSourceConfig, "ExternalSourceConfig", "json");
            this.putBodyParameter("ExternalSourceConfig", externalSourceConfigShrink);
            this.externalSourceConfig = externalSourceConfig;
            return this;
        }

        /**
         * <p>The type of the external data source.</p>
         */
        public Builder externalSourceType(byte[] externalSourceType) {
            this.putBodyParameter("ExternalSourceType", externalSourceType);
            this.externalSourceType = externalSourceType;
            return this;
        }

        /**
         * <p>Specifies whether to connect to an external data source.</p>
         */
        public Builder linkedExternalSource(Boolean linkedExternalSource) {
            this.putBodyParameter("LinkedExternalSource", linkedExternalSource);
            this.linkedExternalSource = linkedExternalSource;
            return this;
        }

        /**
         * <p>The parameters that are configured if the event source is HTTP events.</p>
         */
        public Builder sourceHttpEventParameters(SourceHttpEventParameters sourceHttpEventParameters) {
            String sourceHttpEventParametersShrink = shrink(sourceHttpEventParameters, "SourceHttpEventParameters", "json");
            this.putBodyParameter("SourceHttpEventParameters", sourceHttpEventParametersShrink);
            this.sourceHttpEventParameters = sourceHttpEventParameters;
            return this;
        }

        /**
         * <p>The parameters that are configured if the event source is Message Queue for Apache Kafka.</p>
         */
        public Builder sourceKafkaParameters(SourceKafkaParameters sourceKafkaParameters) {
            String sourceKafkaParametersShrink = shrink(sourceKafkaParameters, "SourceKafkaParameters", "json");
            this.putBodyParameter("SourceKafkaParameters", sourceKafkaParametersShrink);
            this.sourceKafkaParameters = sourceKafkaParameters;
            return this;
        }

        /**
         * <p>The parameters that are configured if the event source is Message Service (MNS). If you specify MNS as the event source, you must configure RegionId, IsBase64Decode, and QueueName.</p>
         */
        public Builder sourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
            String sourceMNSParametersShrink = shrink(sourceMNSParameters, "SourceMNSParameters", "json");
            this.putBodyParameter("SourceMNSParameters", sourceMNSParametersShrink);
            this.sourceMNSParameters = sourceMNSParameters;
            return this;
        }

        /**
         * <p>The parameters that are configured if the event source is Message Queue for RabbitMQ.</p>
         */
        public Builder sourceRabbitMQParameters(SourceRabbitMQParameters sourceRabbitMQParameters) {
            String sourceRabbitMQParametersShrink = shrink(sourceRabbitMQParameters, "SourceRabbitMQParameters", "json");
            this.putBodyParameter("SourceRabbitMQParameters", sourceRabbitMQParametersShrink);
            this.sourceRabbitMQParameters = sourceRabbitMQParameters;
            return this;
        }

        /**
         * <p>The parameters that are configured if the event source is Message Queue for Apache RocketMQ.</p>
         */
        public Builder sourceRocketMQParameters(SourceRocketMQParameters sourceRocketMQParameters) {
            String sourceRocketMQParametersShrink = shrink(sourceRocketMQParameters, "SourceRocketMQParameters", "json");
            this.putBodyParameter("SourceRocketMQParameters", sourceRocketMQParametersShrink);
            this.sourceRocketMQParameters = sourceRocketMQParameters;
            return this;
        }

        /**
         * <p>The parameters that are configured if the event source is Log Service.</p>
         */
        public Builder sourceSLSParameters(SourceSLSParameters sourceSLSParameters) {
            String sourceSLSParametersShrink = shrink(sourceSLSParameters, "SourceSLSParameters", "json");
            this.putBodyParameter("SourceSLSParameters", sourceSLSParametersShrink);
            this.sourceSLSParameters = sourceSLSParameters;
            return this;
        }

        /**
         * <p>The parameters that are configured if you specify scheduled events as the event source.</p>
         */
        public Builder sourceScheduledEventParameters(SourceScheduledEventParameters sourceScheduledEventParameters) {
            String sourceScheduledEventParametersShrink = shrink(sourceScheduledEventParameters, "SourceScheduledEventParameters", "json");
            this.putBodyParameter("SourceScheduledEventParameters", sourceScheduledEventParametersShrink);
            this.sourceScheduledEventParameters = sourceScheduledEventParameters;
            return this;
        }

        @Override
        public CreateEventSourceRequest build() {
            return new CreateEventSourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEventSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateEventSourceRequest</p>
     */
    public static class SourceHttpEventParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private java.util.List<String> ip;

        @com.aliyun.core.annotation.NameInMap("Method")
        private java.util.List<String> method;

        @com.aliyun.core.annotation.NameInMap("Referer")
        private java.util.List<String> referer;

        @com.aliyun.core.annotation.NameInMap("SecurityConfig")
        private String securityConfig;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SourceHttpEventParameters(Builder builder) {
            this.ip = builder.ip;
            this.method = builder.method;
            this.referer = builder.referer;
            this.securityConfig = builder.securityConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceHttpEventParameters create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public java.util.List<String> getIp() {
            return this.ip;
        }

        /**
         * @return method
         */
        public java.util.List<String> getMethod() {
            return this.method;
        }

        /**
         * @return referer
         */
        public java.util.List<String> getReferer() {
            return this.referer;
        }

        /**
         * @return securityConfig
         */
        public String getSecurityConfig() {
            return this.securityConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> ip; 
            private java.util.List<String> method; 
            private java.util.List<String> referer; 
            private String securityConfig; 
            private String type; 

            private Builder() {
            } 

            private Builder(SourceHttpEventParameters model) {
                this.ip = model.ip;
                this.method = model.method;
                this.referer = model.referer;
                this.securityConfig = model.securityConfig;
                this.type = model.type;
            } 

            /**
             * <p>The CIDR block that is used for security settings. This parameter is required only if you set SecurityConfig to ip. You can enter a CIDR block or an IP address.</p>
             */
            public Builder ip(java.util.List<String> ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The HTTP request method supported by the generated webhook URL. You can select multiple values. Valid values:</p>
             * <ul>
             * <li>GET</li>
             * <li>POST</li>
             * <li>PUT</li>
             * <li>PATCH</li>
             * <li>DELETE</li>
             * <li>HEAD</li>
             * <li>OPTIONS</li>
             * <li>TRACE</li>
             * <li>CONNECT</li>
             * </ul>
             */
            public Builder method(java.util.List<String> method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The security domain name. This parameter is required only if you set SecurityConfig to referer. You can enter a domain name.</p>
             */
            public Builder referer(java.util.List<String> referer) {
                this.referer = referer;
                return this;
            }

            /**
             * <p>The type of security settings. Valid values:</p>
             * <ul>
             * <li>none: No configuration is required.</li>
             * <li>ip: CIDR block.</li>
             * <li>referer: security domain name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder securityConfig(String securityConfig) {
                this.securityConfig = securityConfig;
                return this;
            }

            /**
             * <p>The protocol type that is supported by the generated webhook URL. Valid values:</p>
             * <ul>
             * <li>HTTP</li>
             * <li>HTTPS</li>
             * <li>HTTP&amp;HTTPS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTPS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SourceHttpEventParameters build() {
                return new SourceHttpEventParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateEventSourceRequest</p>
     */
    public static class SourceKafkaParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerGroup")
        private String consumerGroup;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MaximumTasks")
        private Integer maximumTasks;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("OffsetReset")
        private String offsetReset;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private String vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private SourceKafkaParameters(Builder builder) {
            this.consumerGroup = builder.consumerGroup;
            this.instanceId = builder.instanceId;
            this.maximumTasks = builder.maximumTasks;
            this.network = builder.network;
            this.offsetReset = builder.offsetReset;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.topic = builder.topic;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceKafkaParameters create() {
            return builder().build();
        }

        /**
         * @return consumerGroup
         */
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maximumTasks
         */
        public Integer getMaximumTasks() {
            return this.maximumTasks;
        }

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
        }

        /**
         * @return offsetReset
         */
        public String getOffsetReset() {
            return this.offsetReset;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
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
            private String consumerGroup; 
            private String instanceId; 
            private Integer maximumTasks; 
            private String network; 
            private String offsetReset; 
            private String regionId; 
            private String securityGroupId; 
            private String topic; 
            private String vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(SourceKafkaParameters model) {
                this.consumerGroup = model.consumerGroup;
                this.instanceId = model.instanceId;
                this.maximumTasks = model.maximumTasks;
                this.network = model.network;
                this.offsetReset = model.offsetReset;
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.topic = model.topic;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of the consumer group that subscribes to the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>wechat_peer_prod</p>
             */
            public Builder consumerGroup(String consumerGroup) {
                this.consumerGroup = consumerGroup;
                return this;
            }

            /**
             * <p>The ID of the Message Queue for Apache Kafka instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-2zehmg67txzuyuuwlxv4f</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The maximum number of consumers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maximumTasks(Integer maximumTasks) {
                this.maximumTasks = maximumTasks;
                return this;
            }

            /**
             * <p>The network. Valid values: Default and PublicNetwork. Default value: Default. The value PublicNetwork indicates a self-managed network.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The consumer offset.</p>
             * 
             * <strong>example:</strong>
             * <p>latest</p>
             */
            public Builder offsetReset(String offsetReset) {
                this.offsetReset = offsetReset;
                return this;
            }

            /**
             * <p>The ID of the region where the Message Queue for Apache Kafka instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the security group to which the Message Queue for Apache Kafka instance belongs. This parameter is required only if you set Network to PublicNetwork.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-8vbf66aoyp0wfzrzxlmy</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The name of the topic on the Message Queue for Apache Kafka instance.</p>
             * 
             * <strong>example:</strong>
             * <p>prod_ma_dispatch_center_call_record</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The ID of the vSwitch with which the Message Queue for Apache Kafka instance is associated. This parameter is required only if you set Network to PublicNetwork.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp127azpeirmwu4q9ttqi</p>
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The ID of the VPC in which the Message Queue for Apache Kafka instance resides. This parameter is required only if you set Network to PublicNetwork.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze5ejm986a73qq3vshlk</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SourceKafkaParameters build() {
                return new SourceKafkaParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateEventSourceRequest</p>
     */
    public static class SourceMNSParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsBase64Decode")
        private Boolean isBase64Decode;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private SourceMNSParameters(Builder builder) {
            this.isBase64Decode = builder.isBase64Decode;
            this.queueName = builder.queueName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceMNSParameters create() {
            return builder().build();
        }

        /**
         * @return isBase64Decode
         */
        public Boolean getIsBase64Decode() {
            return this.isBase64Decode;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private Boolean isBase64Decode; 
            private String queueName; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(SourceMNSParameters model) {
                this.isBase64Decode = model.isBase64Decode;
                this.queueName = model.queueName;
                this.regionId = model.regionId;
            } 

            /**
             * <p>Specifies whether to enable Base64 decoding. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isBase64Decode(Boolean isBase64Decode) {
                this.isBase64Decode = isBase64Decode;
                return this;
            }

            /**
             * <p>The name of the MNS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>MyQueue</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The region where the MNS queue resides. Valid values: cn-qingdao, cn-beijing, cn-zhangjiakou, cn-huhehaote, cn-wulanchabu, cn-hangzhou, cn-shanghai, cn-shenzhen, cn-guangzhou, cn-chengdu, cn-hongkong, ap-southeast-1, ap-southeast-2, ap-southeast-3, ap-southeast-5, ap-northeast-1, eu-central-1, us-west-1, us-east-1, ap-south-1, me-east-1, and cn-north-2-gov-1.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public SourceMNSParameters build() {
                return new SourceMNSParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateEventSourceRequest</p>
     */
    public static class SourceRabbitMQParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VirtualHostName")
        private String virtualHostName;

        private SourceRabbitMQParameters(Builder builder) {
            this.instanceId = builder.instanceId;
            this.queueName = builder.queueName;
            this.regionId = builder.regionId;
            this.virtualHostName = builder.virtualHostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceRabbitMQParameters create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return virtualHostName
         */
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

        public static final class Builder {
            private String instanceId; 
            private String queueName; 
            private String regionId; 
            private String virtualHostName; 

            private Builder() {
            } 

            private Builder(SourceRabbitMQParameters model) {
                this.instanceId = model.instanceId;
                this.queueName = model.queueName;
                this.regionId = model.regionId;
                this.virtualHostName = model.virtualHostName;
            } 

            /**
             * <p>The ID of the Message Queue for RabbitMQ instance. For more information, see Limits.</p>
             * 
             * <strong>example:</strong>
             * <p>amqp-cn-nif22u74****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the queue on the Message Queue for RabbitMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The ID of the region where the Message Queue for RabbitMQ instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the vhost of the Message Queue for RabbitMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>eb-connect</p>
             */
            public Builder virtualHostName(String virtualHostName) {
                this.virtualHostName = virtualHostName;
                return this;
            }

            public SourceRabbitMQParameters build() {
                return new SourceRabbitMQParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateEventSourceRequest</p>
     */
    public static class SourceRocketMQParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("GroupID")
        private String groupID;

        @com.aliyun.core.annotation.NameInMap("InstanceEndpoint")
        private String instanceEndpoint;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceNetwork")
        private String instanceNetwork;

        @com.aliyun.core.annotation.NameInMap("InstancePassword")
        private String instancePassword;

        @com.aliyun.core.annotation.NameInMap("InstanceSecurityGroupId")
        private String instanceSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceUsername")
        private String instanceUsername;

        @com.aliyun.core.annotation.NameInMap("InstanceVSwitchIds")
        private String instanceVSwitchIds;

        @com.aliyun.core.annotation.NameInMap("InstanceVpcId")
        private String instanceVpcId;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private String offset;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private SourceRocketMQParameters(Builder builder) {
            this.authType = builder.authType;
            this.groupID = builder.groupID;
            this.instanceEndpoint = builder.instanceEndpoint;
            this.instanceId = builder.instanceId;
            this.instanceNetwork = builder.instanceNetwork;
            this.instancePassword = builder.instancePassword;
            this.instanceSecurityGroupId = builder.instanceSecurityGroupId;
            this.instanceType = builder.instanceType;
            this.instanceUsername = builder.instanceUsername;
            this.instanceVSwitchIds = builder.instanceVSwitchIds;
            this.instanceVpcId = builder.instanceVpcId;
            this.offset = builder.offset;
            this.regionId = builder.regionId;
            this.tag = builder.tag;
            this.timestamp = builder.timestamp;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceRocketMQParameters create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return groupID
         */
        public String getGroupID() {
            return this.groupID;
        }

        /**
         * @return instanceEndpoint
         */
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceNetwork
         */
        public String getInstanceNetwork() {
            return this.instanceNetwork;
        }

        /**
         * @return instancePassword
         */
        public String getInstancePassword() {
            return this.instancePassword;
        }

        /**
         * @return instanceSecurityGroupId
         */
        public String getInstanceSecurityGroupId() {
            return this.instanceSecurityGroupId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceUsername
         */
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        /**
         * @return instanceVSwitchIds
         */
        public String getInstanceVSwitchIds() {
            return this.instanceVSwitchIds;
        }

        /**
         * @return instanceVpcId
         */
        public String getInstanceVpcId() {
            return this.instanceVpcId;
        }

        /**
         * @return offset
         */
        public String getOffset() {
            return this.offset;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String authType; 
            private String groupID; 
            private String instanceEndpoint; 
            private String instanceId; 
            private String instanceNetwork; 
            private String instancePassword; 
            private String instanceSecurityGroupId; 
            private String instanceType; 
            private String instanceUsername; 
            private String instanceVSwitchIds; 
            private String instanceVpcId; 
            private String offset; 
            private String regionId; 
            private String tag; 
            private Long timestamp; 
            private String topic; 

            private Builder() {
            } 

            private Builder(SourceRocketMQParameters model) {
                this.authType = model.authType;
                this.groupID = model.groupID;
                this.instanceEndpoint = model.instanceEndpoint;
                this.instanceId = model.instanceId;
                this.instanceNetwork = model.instanceNetwork;
                this.instancePassword = model.instancePassword;
                this.instanceSecurityGroupId = model.instanceSecurityGroupId;
                this.instanceType = model.instanceType;
                this.instanceUsername = model.instanceUsername;
                this.instanceVSwitchIds = model.instanceVSwitchIds;
                this.instanceVpcId = model.instanceVpcId;
                this.offset = model.offset;
                this.regionId = model.regionId;
                this.tag = model.tag;
                this.timestamp = model.timestamp;
                this.topic = model.topic;
            } 

            /**
             * <p>The authentication type. You can set this parameter to ACL or leave this parameter empty.</p>
             * 
             * <strong>example:</strong>
             * <p>ACL</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>The ID of the consumer group on the Message Queue for Apache RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>GID-test</p>
             */
            public Builder groupID(String groupID) {
                this.groupID = groupID;
                return this;
            }

            /**
             * <p>The endpoint that is used to access the Message Queue for Apache RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc****.aliyuncs.com</p>
             */
            public Builder instanceEndpoint(String instanceEndpoint) {
                this.instanceEndpoint = instanceEndpoint;
                return this;
            }

            /**
             * <p>The ID of the Message Queue for Apache RocketMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_164901546557****_BAAN****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>None.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder instanceNetwork(String instanceNetwork) {
                this.instanceNetwork = instanceNetwork;
                return this;
            }

            /**
             * <p>The password that is used to access the Message Queue for Apache RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder instancePassword(String instancePassword) {
                this.instancePassword = instancePassword;
                return this;
            }

            /**
             * <p>The ID of the security group to which the Message Queue for Apache RocketMQ instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-catalog-eventlistener</p>
             */
            public Builder instanceSecurityGroupId(String instanceSecurityGroupId) {
                this.instanceSecurityGroupId = instanceSecurityGroupId;
                return this;
            }

            /**
             * <p>The type of the Message Queue for Apache RocketMQ instance. Valid values:</p>
             * <ul>
             * <li>Cloud_4: Message Queue for Apache RocketMQ 4.0 instance.</li>
             * <li>Cloud_5: Message Queue for Apache RocketMQ 5.0 instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Cloud_4</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The username that is used to access the Message Queue for Apache RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder instanceUsername(String instanceUsername) {
                this.instanceUsername = instanceUsername;
                return this;
            }

            /**
             * <p>The ID of the vSwitch with which the Message Queue for Apache RocketMQ instance is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp10rbrt6rb6vrd89****</p>
             */
            public Builder instanceVSwitchIds(String instanceVSwitchIds) {
                this.instanceVSwitchIds = instanceVSwitchIds;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) in which the Message Queue for Apache RocketMQ instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1a4gmlk31hyg6ptl3ss</p>
             */
            public Builder instanceVpcId(String instanceVpcId) {
                this.instanceVpcId = instanceVpcId;
                return this;
            }

            /**
             * <p>The offset from which message consumption starts. Valid values: CONSUME_FROM_LAST_OFFSET: Start message consumption from the latest offset. CONSUME_FROM_FIRST_OFFSET: Start message consumption from the earliest offset. CONSUME_FROM_TIMESTAMP: Start message consumption from the offset at the specified point in time. Default value: CONSUME_FROM_LAST_OFFSET.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSUME_FROM_LAST_OFFSET</p>
             */
            public Builder offset(String offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>The region where the Message Queue for Apache RocketMQ instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The tag that is used to filter messages.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The timestamp that specifies the time from which messages are consumed. This parameter is valid only if you set Offset to CONSUME_FROM_TIMESTAMP.</p>
             * 
             * <strong>example:</strong>
             * <p>1636597951964</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The name of the topic on the Message Queue for Apache RocketMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>mytopic</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public SourceRocketMQParameters build() {
                return new SourceRocketMQParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateEventSourceRequest</p>
     */
    public static class SourceSLSParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumePosition")
        private String consumePosition;

        @com.aliyun.core.annotation.NameInMap("LogStore")
        private String logStore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private SourceSLSParameters(Builder builder) {
            this.consumePosition = builder.consumePosition;
            this.logStore = builder.logStore;
            this.project = builder.project;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceSLSParameters create() {
            return builder().build();
        }

        /**
         * @return consumePosition
         */
        public String getConsumePosition() {
            return this.consumePosition;
        }

        /**
         * @return logStore
         */
        public String getLogStore() {
            return this.logStore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private String consumePosition; 
            private String logStore; 
            private String project; 
            private String roleName; 

            private Builder() {
            } 

            private Builder(SourceSLSParameters model) {
                this.consumePosition = model.consumePosition;
                this.logStore = model.logStore;
                this.project = model.project;
                this.roleName = model.roleName;
            } 

            /**
             * <p>The starting consumer offset. The value begin specifies the earliest offset, and the value end specifies the latest offset. You can also specify a time in seconds to start consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>end</p>
             */
            public Builder consumePosition(String consumePosition) {
                this.consumePosition = consumePosition;
                return this;
            }

            /**
             * <p>The Log Service Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>test-logstore</p>
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * <p>The Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>test-project</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console. For information about the permission policy of this role, see Create a custom event source of the Log Service type.</p>
             * 
             * <strong>example:</strong>
             * <p>testRole</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public SourceSLSParameters build() {
                return new SourceSLSParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateEventSourceRequest</p>
     */
    public static class SourceScheduledEventParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Schedule")
        private String schedule;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private SourceScheduledEventParameters(Builder builder) {
            this.schedule = builder.schedule;
            this.timeZone = builder.timeZone;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceScheduledEventParameters create() {
            return builder().build();
        }

        /**
         * @return schedule
         */
        public String getSchedule() {
            return this.schedule;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String schedule; 
            private String timeZone; 
            private String userData; 

            private Builder() {
            } 

            private Builder(SourceScheduledEventParameters model) {
                this.schedule = model.schedule;
                this.timeZone = model.timeZone;
                this.userData = model.userData;
            } 

            /**
             * <p>The cron expression.</p>
             * 
             * <strong>example:</strong>
             * <p>10 * * * * *</p>
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * <p>The time zone in which the cron expression is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>GMT+0:00</p>
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public SourceScheduledEventParameters build() {
                return new SourceScheduledEventParameters(this);
            } 

        } 

    }
}
