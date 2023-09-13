// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link CreateEventSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateEventSourceRequest</p>
 */
public class CreateEventSourceRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("EventBusName")
    @Validation(required = true)
    private String eventBusName;

    @Body
    @NameInMap("EventSourceName")
    @Validation(required = true)
    private String eventSourceName;

    @Body
    @NameInMap("SourceHttpEventParameters")
    private SourceHttpEventParameters sourceHttpEventParameters;

    @Body
    @NameInMap("SourceKafkaParameters")
    private SourceKafkaParameters sourceKafkaParameters;

    @Body
    @NameInMap("SourceMNSParameters")
    private SourceMNSParameters sourceMNSParameters;

    @Body
    @NameInMap("SourceRabbitMQParameters")
    private SourceRabbitMQParameters sourceRabbitMQParameters;

    @Body
    @NameInMap("SourceRocketMQParameters")
    private SourceRocketMQParameters sourceRocketMQParameters;

    @Body
    @NameInMap("SourceSLSParameters")
    private SourceSLSParameters sourceSLSParameters;

    @Body
    @NameInMap("SourceScheduledEventParameters")
    private SourceScheduledEventParameters sourceScheduledEventParameters;

    private CreateEventSourceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.eventBusName = builder.eventBusName;
        this.eventSourceName = builder.eventSourceName;
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
            this.sourceHttpEventParameters = request.sourceHttpEventParameters;
            this.sourceKafkaParameters = request.sourceKafkaParameters;
            this.sourceMNSParameters = request.sourceMNSParameters;
            this.sourceRabbitMQParameters = request.sourceRabbitMQParameters;
            this.sourceRocketMQParameters = request.sourceRocketMQParameters;
            this.sourceSLSParameters = request.sourceSLSParameters;
            this.sourceScheduledEventParameters = request.sourceScheduledEventParameters;
        } 

        /**
         * The description of the event source.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the event bus with which the event source is associated.
         */
        public Builder eventBusName(String eventBusName) {
            this.putBodyParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * Then name of the event source.
         */
        public Builder eventSourceName(String eventSourceName) {
            this.putBodyParameter("EventSourceName", eventSourceName);
            this.eventSourceName = eventSourceName;
            return this;
        }

        /**
         * The parameters that are configured if the event source is HTTP events.
         */
        public Builder sourceHttpEventParameters(SourceHttpEventParameters sourceHttpEventParameters) {
            String sourceHttpEventParametersShrink = shrink(sourceHttpEventParameters, "SourceHttpEventParameters", "json");
            this.putBodyParameter("SourceHttpEventParameters", sourceHttpEventParametersShrink);
            this.sourceHttpEventParameters = sourceHttpEventParameters;
            return this;
        }

        /**
         * The parameters that are configured if the event source is Message Queue for Apache Kafka.
         */
        public Builder sourceKafkaParameters(SourceKafkaParameters sourceKafkaParameters) {
            String sourceKafkaParametersShrink = shrink(sourceKafkaParameters, "SourceKafkaParameters", "json");
            this.putBodyParameter("SourceKafkaParameters", sourceKafkaParametersShrink);
            this.sourceKafkaParameters = sourceKafkaParameters;
            return this;
        }

        /**
         * The parameters that are configured if the event source is Message Service (MNS).
         */
        public Builder sourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
            String sourceMNSParametersShrink = shrink(sourceMNSParameters, "SourceMNSParameters", "json");
            this.putBodyParameter("SourceMNSParameters", sourceMNSParametersShrink);
            this.sourceMNSParameters = sourceMNSParameters;
            return this;
        }

        /**
         * The parameters that are configured if the event source is Message Queue for RabbitMQ.
         */
        public Builder sourceRabbitMQParameters(SourceRabbitMQParameters sourceRabbitMQParameters) {
            String sourceRabbitMQParametersShrink = shrink(sourceRabbitMQParameters, "SourceRabbitMQParameters", "json");
            this.putBodyParameter("SourceRabbitMQParameters", sourceRabbitMQParametersShrink);
            this.sourceRabbitMQParameters = sourceRabbitMQParameters;
            return this;
        }

        /**
         * The parameters that are configured if the event source is Message Queue for Apache RocketMQ.
         */
        public Builder sourceRocketMQParameters(SourceRocketMQParameters sourceRocketMQParameters) {
            String sourceRocketMQParametersShrink = shrink(sourceRocketMQParameters, "SourceRocketMQParameters", "json");
            this.putBodyParameter("SourceRocketMQParameters", sourceRocketMQParametersShrink);
            this.sourceRocketMQParameters = sourceRocketMQParameters;
            return this;
        }

        /**
         * The parameters that are configured if the event source is Log Service.
         */
        public Builder sourceSLSParameters(SourceSLSParameters sourceSLSParameters) {
            String sourceSLSParametersShrink = shrink(sourceSLSParameters, "SourceSLSParameters", "json");
            this.putBodyParameter("SourceSLSParameters", sourceSLSParametersShrink);
            this.sourceSLSParameters = sourceSLSParameters;
            return this;
        }

        /**
         * The parameters that are configured if the event source is scheduled events.
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

    public static class SourceHttpEventParameters extends TeaModel {
        @NameInMap("Ip")
        private java.util.List < String > ip;

        @NameInMap("Method")
        private java.util.List < String > method;

        @NameInMap("Referer")
        private java.util.List < String > referer;

        @NameInMap("SecurityConfig")
        private String securityConfig;

        @NameInMap("Type")
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
        public java.util.List < String > getIp() {
            return this.ip;
        }

        /**
         * @return method
         */
        public java.util.List < String > getMethod() {
            return this.method;
        }

        /**
         * @return referer
         */
        public java.util.List < String > getReferer() {
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
            private java.util.List < String > ip; 
            private java.util.List < String > method; 
            private java.util.List < String > referer; 
            private String securityConfig; 
            private String type; 

            /**
             * The CIDR blocks that are used for security settings. This parameter is required only if you set SecurityConfig to ip. You can enter CIDR blocks or IP addresses.
             */
            public Builder ip(java.util.List < String > ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The HTTP request method that is supported by the generated webhook URL. You can select multiple values. Valid values: GET GET, POST, PUT, PATCH, DELETE, HEAD, OPTIONS, TRACE, and CONNECT.
             */
            public Builder method(java.util.List < String > method) {
                this.method = method;
                return this;
            }

            /**
             * The security domain names. This parameter is required only if you set SecurityConfig to referer. You can enter domain names.
             */
            public Builder referer(java.util.List < String > referer) {
                this.referer = referer;
                return this;
            }

            /**
             * The security settings. Valid values: none: No configuration is required. ip: CIDR blocks. referer: security domain names.
             */
            public Builder securityConfig(String securityConfig) {
                this.securityConfig = securityConfig;
                return this;
            }

            /**
             * The protocol type that is supported by the generated webhook URL. Valid values: HTTP, HTTPS, and HTTP\&HTTPS.
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
    public static class SourceKafkaParameters extends TeaModel {
        @NameInMap("ConsumerGroup")
        private String consumerGroup;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MaximumTasks")
        private Integer maximumTasks;

        @NameInMap("Network")
        private String network;

        @NameInMap("OffsetReset")
        private String offsetReset;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("Topic")
        private String topic;

        @NameInMap("VSwitchIds")
        private String vSwitchIds;

        @NameInMap("VpcId")
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

            /**
             * The ID of the consumer group that subscribes to the topic.
             */
            public Builder consumerGroup(String consumerGroup) {
                this.consumerGroup = consumerGroup;
                return this;
            }

            /**
             * The ID of the Message Queue for Apache Kafka instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The maximum number of consumers.
             */
            public Builder maximumTasks(Integer maximumTasks) {
                this.maximumTasks = maximumTasks;
                return this;
            }

            /**
             * The network. Valid values: Default and PublicNetwork.
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * The consumer offset.
             */
            public Builder offsetReset(String offsetReset) {
                this.offsetReset = offsetReset;
                return this;
            }

            /**
             * The ID of the region where the Message Queue for Apache Kafka instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the security group to which the Message Queue for Apache Kafka instance belongs. This parameter is required if you set Network to PublicNetwork.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The name of the topic in the Message Queue for Apache Kafka instance.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * The ID of the vSwitch with which the Message Queue for Apache Kafka instance is associated. This parameter is required if you set Network to PublicNetwork.
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * The ID of the VPC in which the Message Queue for Apache Kafka instance resides. This parameter is required if you set Network to PublicNetwork.
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
    public static class SourceMNSParameters extends TeaModel {
        @NameInMap("IsBase64Decode")
        private Boolean isBase64Decode;

        @NameInMap("QueueName")
        private String queueName;

        @NameInMap("RegionId")
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

            /**
             * Specifies whether to enable Base64 decoding. Default value: true.
             */
            public Builder isBase64Decode(Boolean isBase64Decode) {
                this.isBase64Decode = isBase64Decode;
                return this;
            }

            /**
             * The name of the MNS queue.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * The region where the MNS queue resides.
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
    public static class SourceRabbitMQParameters extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("QueueName")
        private String queueName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VirtualHostName")
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

            /**
             * The ID of the Message Queue for RabbitMQ instance. For more information, see Limits.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the queue in the Message Queue for RabbitMQ instance. For more information, see Limits.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * The ID of the region where the Message Queue for RabbitMQ instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The vhost name of the Message Queue for RabbitMQ instance. For more information, see Limits.
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
    public static class SourceRocketMQParameters extends TeaModel {
        @NameInMap("AuthType")
        private String authType;

        @NameInMap("GroupID")
        private String groupID;

        @NameInMap("InstanceEndpoint")
        private String instanceEndpoint;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceNetwork")
        private String instanceNetwork;

        @NameInMap("InstancePassword")
        private String instancePassword;

        @NameInMap("InstanceSecurityGroupId")
        private String instanceSecurityGroupId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceUsername")
        private String instanceUsername;

        @NameInMap("InstanceVSwitchIds")
        private String instanceVSwitchIds;

        @NameInMap("InstanceVpcId")
        private String instanceVpcId;

        @NameInMap("Offset")
        private String offset;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("Topic")
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

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * The ID of the consumer group in the Message Queue for Apache RocketMQ instance.
             */
            public Builder groupID(String groupID) {
                this.groupID = groupID;
                return this;
            }

            /**
             * InstanceEndpoint.
             */
            public Builder instanceEndpoint(String instanceEndpoint) {
                this.instanceEndpoint = instanceEndpoint;
                return this;
            }

            /**
             * The ID of the Message Queue for Apache RocketMQ instance. For more information, see Limits.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * None.
             */
            public Builder instanceNetwork(String instanceNetwork) {
                this.instanceNetwork = instanceNetwork;
                return this;
            }

            /**
             * InstancePassword.
             */
            public Builder instancePassword(String instancePassword) {
                this.instancePassword = instancePassword;
                return this;
            }

            /**
             * The ID of the security group to which the Message Queue for Apache RocketMQ instance belongs.
             */
            public Builder instanceSecurityGroupId(String instanceSecurityGroupId) {
                this.instanceSecurityGroupId = instanceSecurityGroupId;
                return this;
            }

            /**
             * The type of the Message Queue for Apache RocketMQ instance. Valid values:
             * <p>
             * 
             * 
             * - Cloud\_4: Message Queue for Apache RocketMQ 4.0 instances.
             * 
             *  - Cloud\_5: Message Queue for Apache RocketMQ 5.0 instances.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InstanceUsername.
             */
            public Builder instanceUsername(String instanceUsername) {
                this.instanceUsername = instanceUsername;
                return this;
            }

            /**
             * The ID of the vSwitch with which the Message Queue for Apache RocketMQ instance is associated.
             */
            public Builder instanceVSwitchIds(String instanceVSwitchIds) {
                this.instanceVSwitchIds = instanceVSwitchIds;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) in which the Message Queue for Apache RocketMQ instance resides.
             */
            public Builder instanceVpcId(String instanceVpcId) {
                this.instanceVpcId = instanceVpcId;
                return this;
            }

            /**
             * The offset from which messages are consumed. Valid values: CONSUME_FROM_LAST_OFFSET: Messages are consumed from the latest offset. CONSUME_FROM_FIRST_OFFSET: Messages are consumed from the earliest offset. CONSUME_FROM_TIMESTAMP: Messages are consumed from the offset at the specified point in time. Default value: CONSUME_FROM_LAST_OFFSET.
             */
            public Builder offset(String offset) {
                this.offset = offset;
                return this;
            }

            /**
             * The region in which the Message Queue for Apache RocketMQ instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The tags that are used to filter messages.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The timestamp that specifies the time from which messages are consumed. This parameter is valid only if you set Offset to CONSUME_FROM_TIMESTAMP.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The name of the topic in the Message Queue for Apache RocketMQ instance. For more information, see Limits.
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
    public static class SourceSLSParameters extends TeaModel {
        @NameInMap("ConsumePosition")
        private String consumePosition;

        @NameInMap("LogStore")
        private String logStore;

        @NameInMap("Project")
        private String project;

        @NameInMap("RoleName")
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

            /**
             * The starting consumer offset. The value begin specifies the earliest offset, and the value end specifies the latest offset. You can also specify a time in seconds to start consumption.
             */
            public Builder consumePosition(String consumePosition) {
                this.consumePosition = consumePosition;
                return this;
            }

            /**
             * The Log Service Logstore.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * The Log Service project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console. For information about the permission policy of this role, see Create a custom event source of the Log Service type.
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
    public static class SourceScheduledEventParameters extends TeaModel {
        @NameInMap("Schedule")
        private String schedule;

        @NameInMap("TimeZone")
        private String timeZone;

        @NameInMap("UserData")
        private java.util.Map < String, ? > userData;

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
        public java.util.Map < String, ? > getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String schedule; 
            private String timeZone; 
            private java.util.Map < String, ? > userData; 

            /**
             * The Cron expression.
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * The time zone in which the Cron expression is executed.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(java.util.Map < String, ? > userData) {
                this.userData = userData;
                return this;
            }

            public SourceScheduledEventParameters build() {
                return new SourceScheduledEventParameters(this);
            } 

        } 

    }
}
