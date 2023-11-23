// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link ListUserDefinedEventSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserDefinedEventSourcesResponseBody</p>
 */
public class ListUserDefinedEventSourcesResponseBody extends TeaModel {
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

    private ListUserDefinedEventSourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserDefinedEventSourcesResponseBody create() {
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
         * The returned response code. Valid values:
         * <p>
         * 
         * *   Success: The request is successful.
         * *   Other codes: The request failed. For more information about error codes, see Error codes.
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
         * Indicates whether the operation is successful. The value true indicates that the operation is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListUserDefinedEventSourcesResponseBody build() {
            return new ListUserDefinedEventSourcesResponseBody(this);
        } 

    } 

    public static class SourceHttpEventParameters extends TeaModel {
        @NameInMap("Ip")
        private java.util.List < String > ip;

        @NameInMap("Method")
        private java.util.List < String > method;

        @NameInMap("PublicWebHookUrl")
        private java.util.List < String > publicWebHookUrl;

        @NameInMap("Referer")
        private java.util.List < String > referer;

        @NameInMap("SecurityConfig")
        private String securityConfig;

        @NameInMap("Type")
        private String type;

        @NameInMap("VpcWebHookUrl")
        private java.util.List < String > vpcWebHookUrl;

        private SourceHttpEventParameters(Builder builder) {
            this.ip = builder.ip;
            this.method = builder.method;
            this.publicWebHookUrl = builder.publicWebHookUrl;
            this.referer = builder.referer;
            this.securityConfig = builder.securityConfig;
            this.type = builder.type;
            this.vpcWebHookUrl = builder.vpcWebHookUrl;
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
         * @return publicWebHookUrl
         */
        public java.util.List < String > getPublicWebHookUrl() {
            return this.publicWebHookUrl;
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

        /**
         * @return vpcWebHookUrl
         */
        public java.util.List < String > getVpcWebHookUrl() {
            return this.vpcWebHookUrl;
        }

        public static final class Builder {
            private java.util.List < String > ip; 
            private java.util.List < String > method; 
            private java.util.List < String > publicWebHookUrl; 
            private java.util.List < String > referer; 
            private String securityConfig; 
            private String type; 
            private java.util.List < String > vpcWebHookUrl; 

            /**
             * The CIDR block that is used for security settings. This parameter is required only if SecurityConfig is set to ip. You can enter a CIDR block or an IP address.
             */
            public Builder ip(java.util.List < String > ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The HTTP request method that is supported by the generated webhook URL. You can select multiple values. Valid values:
             * <p>
             * 
             * *   GET
             * *   POST
             * *   PUT
             * *   PATCH
             * *   DELETE
             * *   HEAD
             * *   OPTIONS
             * *   TRACE
             * *   CONNECT
             */
            public Builder method(java.util.List < String > method) {
                this.method = method;
                return this;
            }

            /**
             * The Internet request URL.
             */
            public Builder publicWebHookUrl(java.util.List < String > publicWebHookUrl) {
                this.publicWebHookUrl = publicWebHookUrl;
                return this;
            }

            /**
             * The security domain name. This parameter is required only if SecurityConfig is set to referer. You can enter a domain name.
             */
            public Builder referer(java.util.List < String > referer) {
                this.referer = referer;
                return this;
            }

            /**
             * The type of security settings. Valid values:
             * <p>
             * 
             * *   none: No configuration is required.
             * *   ip: CIDR block.
             * *   referer: security domain name.
             */
            public Builder securityConfig(String securityConfig) {
                this.securityConfig = securityConfig;
                return this;
            }

            /**
             * The protocol type that is supported by the generated webhook URL. Valid values:
             * <p>
             * 
             * *   HTTP
             * *   HTTPS
             * *   HTTP\&HTTPS
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The internal request URL.
             */
            public Builder vpcWebHookUrl(java.util.List < String > vpcWebHookUrl) {
                this.vpcWebHookUrl = vpcWebHookUrl;
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
             * The network. Valid values: Default and PublicNetwork. Default value: Default. The value PublicNetwork indicates a self-managed network.
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
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The security group ID.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The topic name.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * The VPC ID.
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
             * Indicates whether Base64 decoding is enabled. By default, Base64 decoding is enabled.
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
             * The ID of the Message Queue for RabbitMQ instance. For more information, see [Limits](~~163289~~).
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the queue on the Message Queue for RabbitMQ instance. For more information, see [Limits](~~163289~~).
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
             * The name of the vhost of the Message Queue for RabbitMQ instance. For more information, see [Limits](~~163289~~).
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

        @NameInMap("GroupId")
        private String groupId;

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
        private Float timestamp;

        @NameInMap("Topic")
        private String topic;

        private SourceRocketMQParameters(Builder builder) {
            this.authType = builder.authType;
            this.groupId = builder.groupId;
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
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
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
        public Float getTimestamp() {
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
            private String groupId; 
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
            private Float timestamp; 
            private String topic; 

            /**
             * The authentication type. This parameter can be set to ACL or left empty.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * The ID of the consumer group on the Message Queue for Apache RocketMQ instance.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The instance endpoint.
             */
            public Builder instanceEndpoint(String instanceEndpoint) {
                this.instanceEndpoint = instanceEndpoint;
                return this;
            }

            /**
             * The ID of the Message Queue for Apache RocketMQ instance. For more information, see [Limits](~~163289~~).
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The network that is used by the Message Queue for Apache RocketMQ instance.
             */
            public Builder instanceNetwork(String instanceNetwork) {
                this.instanceNetwork = instanceNetwork;
                return this;
            }

            /**
             * The instance password.
             */
            public Builder instancePassword(String instancePassword) {
                this.instancePassword = instancePassword;
                return this;
            }

            /**
             * The security group ID.
             */
            public Builder instanceSecurityGroupId(String instanceSecurityGroupId) {
                this.instanceSecurityGroupId = instanceSecurityGroupId;
                return this;
            }

            /**
             * The instance type. Valid values: CLOUD\_4, CLOUD\_5, and SELF_BUILT. The value CLOUD\_4 indicates that the instance is a Message Queue for Apache RocketMQ 4.0 instance. The value CLOUD\_5 indicates that the instance is a Message Queue for Apache RocketMQ 5.0 instance. The value SELF_BUILT indicates that the instance is a self-managed RocketMQ instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The instance username.
             */
            public Builder instanceUsername(String instanceUsername) {
                this.instanceUsername = instanceUsername;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder instanceVSwitchIds(String instanceVSwitchIds) {
                this.instanceVSwitchIds = instanceVSwitchIds;
                return this;
            }

            /**
             * The virtual private cloud (VPC) ID.
             */
            public Builder instanceVpcId(String instanceVpcId) {
                this.instanceVpcId = instanceVpcId;
                return this;
            }

            /**
             * The offset from which messages are consumed. Valid values:
             * <p>
             * 
             * *   CONSUME_FROM_LAST_OFFSET: Messages are consumed from the latest offset.
             * *   CONSUME_FROM_FIRST_OFFSET: Messages are consumed from the earliest offset.
             * *   CONSUME_FROM_TIMESTAMP: Messages are consumed from the offset at the specified point in time.
             * 
             * Default value: CONSUME_FROM_LAST_OFFSET.
             */
            public Builder offset(String offset) {
                this.offset = offset;
                return this;
            }

            /**
             * The region where the Message Queue for Apache RocketMQ instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The tag that is used to filter messages.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The timestamp that indicates the time from which messages are consumed. This parameter is valid only if Offset is set to CONSUME_FROM_TIMESTAMP.
             */
            public Builder timestamp(Float timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The name of the topic on the Message Queue for Apache RocketMQ instance. For more information, see [Limits](~~163289~~).
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
             * The consumer offset. The value begin indicates the earliest offset, and the value end indicates the latest offset. You can also specify a time in seconds to start message consumption.
             */
            public Builder consumePosition(String consumePosition) {
                this.consumePosition = consumePosition;
                return this;
            }

            /**
             * The Simple Log Service Logstore.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * The Simple Log Service project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * The role name. If you want to authorize EventBridge to use this role to read logs in Simple Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console. For information about the permission policy of this role, see Create a custom event source of the Log Service type.
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

            /**
             * The cron expression.
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * The time zone in which the cron expression is executed.
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
    public static class EventSourceList extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("Ctime")
        private Float ctime;

        @NameInMap("EventBusName")
        private String eventBusName;

        @NameInMap("ExternalSourceType")
        private String externalSourceType;

        @NameInMap("Name")
        private String name;

        @NameInMap("SourceHttpEventParameters")
        private SourceHttpEventParameters sourceHttpEventParameters;

        @NameInMap("SourceKafkaParameters")
        private SourceKafkaParameters sourceKafkaParameters;

        @NameInMap("SourceMNSParameters")
        private SourceMNSParameters sourceMNSParameters;

        @NameInMap("SourceRabbitMQParameters")
        private SourceRabbitMQParameters sourceRabbitMQParameters;

        @NameInMap("SourceRocketMQParameters")
        private SourceRocketMQParameters sourceRocketMQParameters;

        @NameInMap("SourceSLSParameters")
        private SourceSLSParameters sourceSLSParameters;

        @NameInMap("SourceScheduledEventParameters")
        private SourceScheduledEventParameters sourceScheduledEventParameters;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private EventSourceList(Builder builder) {
            this.arn = builder.arn;
            this.ctime = builder.ctime;
            this.eventBusName = builder.eventBusName;
            this.externalSourceType = builder.externalSourceType;
            this.name = builder.name;
            this.sourceHttpEventParameters = builder.sourceHttpEventParameters;
            this.sourceKafkaParameters = builder.sourceKafkaParameters;
            this.sourceMNSParameters = builder.sourceMNSParameters;
            this.sourceRabbitMQParameters = builder.sourceRabbitMQParameters;
            this.sourceRocketMQParameters = builder.sourceRocketMQParameters;
            this.sourceSLSParameters = builder.sourceSLSParameters;
            this.sourceScheduledEventParameters = builder.sourceScheduledEventParameters;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventSourceList create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return ctime
         */
        public Float getCtime() {
            return this.ctime;
        }

        /**
         * @return eventBusName
         */
        public String getEventBusName() {
            return this.eventBusName;
        }

        /**
         * @return externalSourceType
         */
        public String getExternalSourceType() {
            return this.externalSourceType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String arn; 
            private Float ctime; 
            private String eventBusName; 
            private String externalSourceType; 
            private String name; 
            private SourceHttpEventParameters sourceHttpEventParameters; 
            private SourceKafkaParameters sourceKafkaParameters; 
            private SourceMNSParameters sourceMNSParameters; 
            private SourceRabbitMQParameters sourceRabbitMQParameters; 
            private SourceRocketMQParameters sourceRocketMQParameters; 
            private SourceSLSParameters sourceSLSParameters; 
            private SourceScheduledEventParameters sourceScheduledEventParameters; 
            private String status; 
            private String type; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the queried event source.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The timestamp that indicates when the event source was created.
             */
            public Builder ctime(Float ctime) {
                this.ctime = ctime;
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
             * The type of the event source.
             */
            public Builder externalSourceType(String externalSourceType) {
                this.externalSourceType = externalSourceType;
                return this;
            }

            /**
             * The name of the queried event source.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The parameters that are returned if HTTP events are specified as the event source.
             */
            public Builder sourceHttpEventParameters(SourceHttpEventParameters sourceHttpEventParameters) {
                this.sourceHttpEventParameters = sourceHttpEventParameters;
                return this;
            }

            /**
             * The parameters that are returned if Message Queue for Apache Kafka is specified as the event source.
             */
            public Builder sourceKafkaParameters(SourceKafkaParameters sourceKafkaParameters) {
                this.sourceKafkaParameters = sourceKafkaParameters;
                return this;
            }

            /**
             * The parameters that are returned if Message Service (MNS) is specified as the event source.
             */
            public Builder sourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
                this.sourceMNSParameters = sourceMNSParameters;
                return this;
            }

            /**
             * The parameters that are returned if Message Queue for RabbitMQ is specified as the event source.
             */
            public Builder sourceRabbitMQParameters(SourceRabbitMQParameters sourceRabbitMQParameters) {
                this.sourceRabbitMQParameters = sourceRabbitMQParameters;
                return this;
            }

            /**
             * The parameters that are returned if Message Queue for Apache RocketMQ is specified as the event source.
             */
            public Builder sourceRocketMQParameters(SourceRocketMQParameters sourceRocketMQParameters) {
                this.sourceRocketMQParameters = sourceRocketMQParameters;
                return this;
            }

            /**
             * The parameters that are returned if Simple Log Service is specified as the event source.
             */
            public Builder sourceSLSParameters(SourceSLSParameters sourceSLSParameters) {
                this.sourceSLSParameters = sourceSLSParameters;
                return this;
            }

            /**
             * The parameters that are returned if scheduled events are specified as the event source.
             */
            public Builder sourceScheduledEventParameters(SourceScheduledEventParameters sourceScheduledEventParameters) {
                this.sourceScheduledEventParameters = sourceScheduledEventParameters;
                return this;
            }

            /**
             * The status of the queried event source. The returned value Activated indicates that the event source is activated.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the queried event source. The returned value UserDefined indicates that the event source is a custom event source.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EventSourceList build() {
                return new EventSourceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("EventSourceList")
        private java.util.List < EventSourceList> eventSourceList;

        private Data(Builder builder) {
            this.eventSourceList = builder.eventSourceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventSourceList
         */
        public java.util.List < EventSourceList> getEventSourceList() {
            return this.eventSourceList;
        }

        public static final class Builder {
            private java.util.List < EventSourceList> eventSourceList; 

            /**
             * The event sources.
             */
            public Builder eventSourceList(java.util.List < EventSourceList> eventSourceList) {
                this.eventSourceList = eventSourceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
