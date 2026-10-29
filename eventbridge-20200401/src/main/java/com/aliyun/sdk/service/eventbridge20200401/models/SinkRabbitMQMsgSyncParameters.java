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
 * {@link SinkRabbitMQMsgSyncParameters} extends {@link TeaModel}
 *
 * <p>SinkRabbitMQMsgSyncParameters</p>
 */
public class SinkRabbitMQMsgSyncParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Body")
    private SinkRabbitMQMsgSyncParametersBody body;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("Exchange")
    private Exchange exchange;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("MaxHops")
    private String maxHops;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private MessageId messageId;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private Properties properties;

    @com.aliyun.core.annotation.NameInMap("RoutingKey")
    private RoutingKey routingKey;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private String vSwitchIds;

    @com.aliyun.core.annotation.NameInMap("VirtualHostName")
    private String virtualHostName;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private SinkRabbitMQMsgSyncParameters(Builder builder) {
        this.body = builder.body;
        this.endpoint = builder.endpoint;
        this.exchange = builder.exchange;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.maxHops = builder.maxHops;
        this.messageId = builder.messageId;
        this.networkType = builder.networkType;
        this.password = builder.password;
        this.properties = builder.properties;
        this.routingKey = builder.routingKey;
        this.securityGroupId = builder.securityGroupId;
        this.username = builder.username;
        this.vSwitchIds = builder.vSwitchIds;
        this.virtualHostName = builder.virtualHostName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SinkRabbitMQMsgSyncParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public SinkRabbitMQMsgSyncParametersBody getBody() {
        return this.body;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return exchange
     */
    public Exchange getExchange() {
        return this.exchange;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return maxHops
     */
    public String getMaxHops() {
        return this.maxHops;
    }

    /**
     * @return messageId
     */
    public MessageId getMessageId() {
        return this.messageId;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return properties
     */
    public Properties getProperties() {
        return this.properties;
    }

    /**
     * @return routingKey
     */
    public RoutingKey getRoutingKey() {
        return this.routingKey;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return vSwitchIds
     */
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return virtualHostName
     */
    public String getVirtualHostName() {
        return this.virtualHostName;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private SinkRabbitMQMsgSyncParametersBody body; 
        private String endpoint; 
        private Exchange exchange; 
        private String instanceId; 
        private String instanceType; 
        private String maxHops; 
        private MessageId messageId; 
        private String networkType; 
        private String password; 
        private Properties properties; 
        private RoutingKey routingKey; 
        private String securityGroupId; 
        private String username; 
        private String vSwitchIds; 
        private String virtualHostName; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(SinkRabbitMQMsgSyncParameters model) {
            this.body = model.body;
            this.endpoint = model.endpoint;
            this.exchange = model.exchange;
            this.instanceId = model.instanceId;
            this.instanceType = model.instanceType;
            this.maxHops = model.maxHops;
            this.messageId = model.messageId;
            this.networkType = model.networkType;
            this.password = model.password;
            this.properties = model.properties;
            this.routingKey = model.routingKey;
            this.securityGroupId = model.securityGroupId;
            this.username = model.username;
            this.vSwitchIds = model.vSwitchIds;
            this.virtualHostName = model.virtualHostName;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>The message body.</p>
         */
        public Builder body(SinkRabbitMQMsgSyncParametersBody body) {
            this.body = body;
            return this;
        }

        /**
         * <p>The endpoint of the ApsaraMQ for RabbitMQ cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>rabbitmq-cn-hangzhou-2x***.com</p>
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The exchange. This parameter is required only when the TargetType parameter is set to Exchange.</p>
         */
        public Builder exchange(Exchange exchange) {
            this.exchange = exchange;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rabbitmq-cn-a1b2c3d4e5f</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The maximum number of hops allowed for message forwarding in a federation task. Messages that exceed this limit are dropped.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxHops(String maxHops) {
            this.maxHops = maxHops;
            return this;
        }

        /**
         * <p>The message ID.</p>
         */
        public Builder messageId(MessageId messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The network type used to connect to the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The password used to connect to the ApsaraMQ for RabbitMQ cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>yourPassword</p>
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * <p>The message properties.</p>
         */
        public Builder properties(Properties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * <p>The routing key of the message. This parameter is required only when the TargetType parameter is set to Exchange.</p>
         */
        public Builder routingKey(RoutingKey routingKey) {
            this.routingKey = routingKey;
            return this;
        }

        /**
         * <p>The ID of the security group to which the nodes of the ApsaraMQ for RabbitMQ cluster belong.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-a1b2c3d4e5f6g7h8i9j0</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The username used to connect to the ApsaraMQ for RabbitMQ cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        /**
         * <p>The IDs of the vSwitches in the VPC where the ApsaraMQ for RabbitMQ cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-a1b2c3d4e5f6g7h8i9j0k</p>
         */
        public Builder vSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The name of the virtual host (vhost) in the ApsaraMQ for RabbitMQ cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test-001</p>
         */
        public Builder virtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }

        /**
         * <p>The ID of the VPC where the ApsaraMQ for RabbitMQ cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-a1b2c3d4e5f6g7h8i9j0k</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public SinkRabbitMQMsgSyncParameters build() {
            return new SinkRabbitMQMsgSyncParameters(this);
        } 

    } 

    /**
     * 
     * {@link SinkRabbitMQMsgSyncParameters} extends {@link TeaModel}
     *
     * <p>SinkRabbitMQMsgSyncParameters</p>
     */
    public static class SinkRabbitMQMsgSyncParametersBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkRabbitMQMsgSyncParametersBody(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkRabbitMQMsgSyncParametersBody create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
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
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(SinkRabbitMQMsgSyncParametersBody model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The method used to generate the message body.</p>
             * 
             * <strong>example:</strong>
             * <p>JSONPATH</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template string used to format parameter values. This parameter is used only when Form is set to TEMPLATE.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value expression of the message body.</p>
             * 
             * <strong>example:</strong>
             * <p>$.data.body</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkRabbitMQMsgSyncParametersBody build() {
                return new SinkRabbitMQMsgSyncParametersBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link SinkRabbitMQMsgSyncParameters} extends {@link TeaModel}
     *
     * <p>SinkRabbitMQMsgSyncParameters</p>
     */
    public static class Exchange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Exchange(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Exchange create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
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
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(Exchange model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The method used to generate the target exchange.</p>
             * 
             * <strong>example:</strong>
             * <p>JSONPATH</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template string used to format parameter values. This parameter is used only when Form is set to TEMPLATE.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value expression of the target exchange.</p>
             * 
             * <strong>example:</strong>
             * <p>$.data.exchange</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Exchange build() {
                return new Exchange(this);
            } 

        } 

    }
    /**
     * 
     * {@link SinkRabbitMQMsgSyncParameters} extends {@link TeaModel}
     *
     * <p>SinkRabbitMQMsgSyncParameters</p>
     */
    public static class MessageId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private MessageId(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageId create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
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
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(MessageId model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The method used to generate the message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>JSONPATH</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template string used to format parameter values. This parameter is used only when Form is set to TEMPLATE.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value expression of the message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>$.data.messageId</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MessageId build() {
                return new MessageId(this);
            } 

        } 

    }
    /**
     * 
     * {@link SinkRabbitMQMsgSyncParameters} extends {@link TeaModel}
     *
     * <p>SinkRabbitMQMsgSyncParameters</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Properties(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
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
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(Properties model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The method used to generate the message properties.</p>
             * 
             * <strong>example:</strong>
             * <p>JSONPATH</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template string used to format parameter values. This parameter is used only when Form is set to TEMPLATE.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value expression of the message properties.</p>
             * 
             * <strong>example:</strong>
             * <p>$.data.properties</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    /**
     * 
     * {@link SinkRabbitMQMsgSyncParameters} extends {@link TeaModel}
     *
     * <p>SinkRabbitMQMsgSyncParameters</p>
     */
    public static class RoutingKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RoutingKey(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoutingKey create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
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
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(RoutingKey model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>The method used to generate the routing key.</p>
             * 
             * <strong>example:</strong>
             * <p>JSONPATH</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>The template string used to format parameter values. This parameter is used only when Form is set to TEMPLATE.</p>
             * 
             * <strong>example:</strong>
             * <p>The value of ${key} is ${value}!</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The value expression of the routing key.</p>
             * 
             * <strong>example:</strong>
             * <p>$.data.routingKey</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RoutingKey build() {
                return new RoutingKey(this);
            } 

        } 

    }
}
