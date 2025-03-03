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
 * {@link ListUserDefinedEventSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserDefinedEventSourcesResponseBody</p>
 */
public class ListUserDefinedEventSourcesResponseBody extends TeaModel {
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
         * <p>The returned response code. Valid values:</p>
         * <ul>
         * <li>Success: The request is successful.</li>
         * <li>Other codes: The request failed. For more information about error codes, see Error codes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned error message.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidArgument</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5169654A-7059-57E3-BFD9-33C7E012EA1B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. The value true indicates that the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListUserDefinedEventSourcesResponseBody build() {
            return new ListUserDefinedEventSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserDefinedEventSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserDefinedEventSourcesResponseBody</p>
     */
    public static class SourceHttpEventParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private java.util.List<String> ip;

        @com.aliyun.core.annotation.NameInMap("Method")
        private java.util.List<String> method;

        @com.aliyun.core.annotation.NameInMap("PublicWebHookUrl")
        private java.util.List<String> publicWebHookUrl;

        @com.aliyun.core.annotation.NameInMap("Referer")
        private java.util.List<String> referer;

        @com.aliyun.core.annotation.NameInMap("SecurityConfig")
        private String securityConfig;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VpcWebHookUrl")
        private java.util.List<String> vpcWebHookUrl;

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
         * @return publicWebHookUrl
         */
        public java.util.List<String> getPublicWebHookUrl() {
            return this.publicWebHookUrl;
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

        /**
         * @return vpcWebHookUrl
         */
        public java.util.List<String> getVpcWebHookUrl() {
            return this.vpcWebHookUrl;
        }

        public static final class Builder {
            private java.util.List<String> ip; 
            private java.util.List<String> method; 
            private java.util.List<String> publicWebHookUrl; 
            private java.util.List<String> referer; 
            private String securityConfig; 
            private String type; 
            private java.util.List<String> vpcWebHookUrl; 

            /**
             * <p>The CIDR block that is used for security settings. This parameter is required only if SecurityConfig is set to ip. You can enter a CIDR block or an IP address.</p>
             */
            public Builder ip(java.util.List<String> ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The HTTP request method that is supported by the generated webhook URL. You can select multiple values. Valid values:</p>
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
             * <p>The Internet request URL.</p>
             */
            public Builder publicWebHookUrl(java.util.List<String> publicWebHookUrl) {
                this.publicWebHookUrl = publicWebHookUrl;
                return this;
            }

            /**
             * <p>The security domain name. This parameter is required only if SecurityConfig is set to referer. You can enter a domain name.</p>
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

            /**
             * <p>The internal request URL.</p>
             */
            public Builder vpcWebHookUrl(java.util.List<String> vpcWebHookUrl) {
                this.vpcWebHookUrl = vpcWebHookUrl;
                return this;
            }

            public SourceHttpEventParameters build() {
                return new SourceHttpEventParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserDefinedEventSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserDefinedEventSourcesResponseBody</p>
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

            /**
             * <p>The ID of the consumer group that subscribes to the topic on the Message Queue for Apache Kafka instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test-gid</p>
             */
            public Builder consumerGroup(String consumerGroup) {
                this.consumerGroup = consumerGroup;
                return this;
            }

            /**
             * <p>The ID of the Message Queue for Apache Kafka instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze6kiwzkebf04s5h8ds</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The maximum number of consumers.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maximumTasks(Integer maximumTasks) {
                this.maximumTasks = maximumTasks;
                return this;
            }

            /**
             * <p>The network type. Valid values: Default and PublicNetwork. Default value: Default. The value PublicNetwork indicates a self-managed network.</p>
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
             * <p>earliest</p>
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
             * <p>The ID of the security group to which the Message Queue for Apache Kafka instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-f8zatts5g97x0j***</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>topic_api_1674441611897</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The ID of the vSwitch with which the Message Queue for Apache Kafka instance is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1hcrxq3mkcik***e</p>
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The ID of the VPC in which the Message Queue for Apache Kafka instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1kz3ohhzgrau2***</p>
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
     * {@link ListUserDefinedEventSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserDefinedEventSourcesResponseBody</p>
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

            /**
             * <p>Indicates whether Base64 decoding is enabled. By default, Base64 decoding is enabled.</p>
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
             * <p>queue.openapi-sign-callback</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The ID of the region where the MNS queue resides.</p>
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
     * {@link ListUserDefinedEventSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserDefinedEventSourcesResponseBody</p>
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

            /**
             * <p>The ID of the Message Queue for RabbitMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>bastionhost-cn-0ju2x28fj07</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the queue on the Message Queue for RabbitMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>file-upload-queue</p>
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
     * {@link ListUserDefinedEventSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserDefinedEventSourcesResponseBody</p>
     */
    public static class SourceRocketMQParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

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
        private Float timestamp;

        @com.aliyun.core.annotation.NameInMap("Topic")
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
             * <p>The authentication type. This parameter can be set to ACL or left empty.</p>
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
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The endpoint that is used to access the Message Queue for Apache RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com</p>
             */
            public Builder instanceEndpoint(String instanceEndpoint) {
                this.instanceEndpoint = instanceEndpoint;
                return this;
            }

            /**
             * <p>The ID of the Message Queue for Apache RocketMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>bastionhost-cn-7mz293s9d1p</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of network over which the Message Queue for Apache RocketMQ instance is accessed.</p>
             * 
             * <strong>example:</strong>
             * <p>PublicNetwork</p>
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
             * <p>eb-167adad548***</p>
             */
            public Builder instanceSecurityGroupId(String instanceSecurityGroupId) {
                this.instanceSecurityGroupId = instanceSecurityGroupId;
                return this;
            }

            /**
             * <p>The instance type. Valid values: CLOUD_4, CLOUD_5, and SELF_BUILT. The value CLOUD_4 indicates that the instance is a Message Queue for Apache RocketMQ 4.0 instance. The value CLOUD_5 indicates that the instance is a Message Queue for Apache RocketMQ 5.0 instance. The value SELF_BUILT indicates that the instance is a self-managed RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>CLOUD_5</p>
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
             * <p>vsw-bp1iu***</p>
             */
            public Builder instanceVSwitchIds(String instanceVSwitchIds) {
                this.instanceVSwitchIds = instanceVSwitchIds;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) in which the Message Queue for Apache RocketMQ instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-***</p>
             */
            public Builder instanceVpcId(String instanceVpcId) {
                this.instanceVpcId = instanceVpcId;
                return this;
            }

            /**
             * <p>The offset from which messages are consumed. Valid values:</p>
             * <ul>
             * <li>CONSUME_FROM_LAST_OFFSET: Messages are consumed from the latest offset.</li>
             * <li>CONSUME_FROM_FIRST_OFFSET: Messages are consumed from the earliest offset.</li>
             * <li>CONSUME_FROM_TIMESTAMP: Messages are consumed from the offset at the specified point in time.</li>
             * </ul>
             * <p>Default value: CONSUME_FROM_LAST_OFFSET.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSUMEFROMLASTOFFSET</p>
             */
            public Builder offset(String offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>The ID of the region where the Message Queue for Apache RocketMQ instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The tag that is used to filter messages.</p>
             * 
             * <strong>example:</strong>
             * <p>dataact</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The timestamp that indicates the time from which messages are consumed. This parameter is valid only if Offset is set to CONSUME_FROM_TIMESTAMP.</p>
             * 
             * <strong>example:</strong>
             * <p>1664591760</p>
             */
            public Builder timestamp(Float timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The name of the topic on the Message Queue for Apache RocketMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>migration_instance</p>
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
     * {@link ListUserDefinedEventSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserDefinedEventSourcesResponseBody</p>
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

            /**
             * <p>The consumer offset. The value begin indicates the earliest offset, and the value end indicates the latest offset. You can also specify a time in seconds to start consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>end</p>
             */
            public Builder consumePosition(String consumePosition) {
                this.consumePosition = consumePosition;
                return this;
            }

            /**
             * <p>The Simple Log Service Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>cloudfirewall-logstore</p>
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * <p>The Simple Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>VideoTestProject</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Simple Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console. For information about the permission policy of this role, see Create a custom event source of the Log Service type.</p>
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
     * {@link ListUserDefinedEventSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserDefinedEventSourcesResponseBody</p>
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

            /**
             * <p>The cron expression.</p>
             * 
             * <strong>example:</strong>
             * <p>0 1 * * * *</p>
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
             * <p>The JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;a&quot;: &quot;b&quot;}</p>
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
    /**
     * 
     * {@link ListUserDefinedEventSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserDefinedEventSourcesResponseBody</p>
     */
    public static class EventSourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Ctime")
        private Float ctime;

        @com.aliyun.core.annotation.NameInMap("EventBusName")
        private String eventBusName;

        @com.aliyun.core.annotation.NameInMap("ExternalSourceType")
        private String externalSourceType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SourceHttpEventParameters")
        private SourceHttpEventParameters sourceHttpEventParameters;

        @com.aliyun.core.annotation.NameInMap("SourceKafkaParameters")
        private SourceKafkaParameters sourceKafkaParameters;

        @com.aliyun.core.annotation.NameInMap("SourceMNSParameters")
        private SourceMNSParameters sourceMNSParameters;

        @com.aliyun.core.annotation.NameInMap("SourceRabbitMQParameters")
        private SourceRabbitMQParameters sourceRabbitMQParameters;

        @com.aliyun.core.annotation.NameInMap("SourceRocketMQParameters")
        private SourceRocketMQParameters sourceRocketMQParameters;

        @com.aliyun.core.annotation.NameInMap("SourceSLSParameters")
        private SourceSLSParameters sourceSLSParameters;

        @com.aliyun.core.annotation.NameInMap("SourceScheduledEventParameters")
        private SourceScheduledEventParameters sourceScheduledEventParameters;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The Alibaba Cloud Resource Name (ARN) of the queried event source.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:eventbridge:cn-hangzhou:164901546557****:eventbus/my-event-bus/eventsource/myRocketMQ.source</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the event source was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1607071602000</p>
             */
            public Builder ctime(Float ctime) {
                this.ctime = ctime;
                return this;
            }

            /**
             * <p>The name of the event bus.</p>
             * 
             * <strong>example:</strong>
             * <p>test-custom-bus</p>
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * <p>The type of the event source.</p>
             * 
             * <strong>example:</strong>
             * <p>RabbitMQ</p>
             */
            public Builder externalSourceType(String externalSourceType) {
                this.externalSourceType = externalSourceType;
                return this;
            }

            /**
             * <p>The name of the queried event source.</p>
             * 
             * <strong>example:</strong>
             * <p>rocketmq.source</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parameters that are returned if HTTP events are specified as the event source.</p>
             */
            public Builder sourceHttpEventParameters(SourceHttpEventParameters sourceHttpEventParameters) {
                this.sourceHttpEventParameters = sourceHttpEventParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if Message Queue for Apache Kafka is specified as the event source.</p>
             */
            public Builder sourceKafkaParameters(SourceKafkaParameters sourceKafkaParameters) {
                this.sourceKafkaParameters = sourceKafkaParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if Message Service (MNS) is specified as the event source.</p>
             */
            public Builder sourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
                this.sourceMNSParameters = sourceMNSParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if Message Queue for RabbitMQ is specified as the event source.</p>
             */
            public Builder sourceRabbitMQParameters(SourceRabbitMQParameters sourceRabbitMQParameters) {
                this.sourceRabbitMQParameters = sourceRabbitMQParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if Message Queue for Apache RocketMQ is specified as the event source.</p>
             */
            public Builder sourceRocketMQParameters(SourceRocketMQParameters sourceRocketMQParameters) {
                this.sourceRocketMQParameters = sourceRocketMQParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if Simple Log Service is specified as the event source.</p>
             */
            public Builder sourceSLSParameters(SourceSLSParameters sourceSLSParameters) {
                this.sourceSLSParameters = sourceSLSParameters;
                return this;
            }

            /**
             * <p>The parameters that are returned if scheduled events are specified as the event source.</p>
             */
            public Builder sourceScheduledEventParameters(SourceScheduledEventParameters sourceScheduledEventParameters) {
                this.sourceScheduledEventParameters = sourceScheduledEventParameters;
                return this;
            }

            /**
             * <p>The status of the queried event source. The returned value Activated indicates that the event source is activated.</p>
             * 
             * <strong>example:</strong>
             * <p>Activated</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the queried event source. The returned value UserDefined indicates that the event source is a custom event source.</p>
             * 
             * <strong>example:</strong>
             * <p>UserDefined</p>
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
    /**
     * 
     * {@link ListUserDefinedEventSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserDefinedEventSourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventSourceList")
        private java.util.List<EventSourceList> eventSourceList;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.eventSourceList = builder.eventSourceList;
            this.nextToken = builder.nextToken;
            this.total = builder.total;
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
        public java.util.List<EventSourceList> getEventSourceList() {
            return this.eventSourceList;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<EventSourceList> eventSourceList; 
            private String nextToken; 
            private Integer total; 

            /**
             * <p>The event sources.</p>
             */
            public Builder eventSourceList(java.util.List<EventSourceList> eventSourceList) {
                this.eventSourceList = eventSourceList;
                return this;
            }

            /**
             * <p>If excess return values exist when you configure Limit, this parameter is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
