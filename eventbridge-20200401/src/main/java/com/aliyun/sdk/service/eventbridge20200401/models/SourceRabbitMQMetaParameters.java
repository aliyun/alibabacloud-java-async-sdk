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
 * {@link SourceRabbitMQMetaParameters} extends {@link TeaModel}
 *
 * <p>SourceRabbitMQMetaParameters</p>
 */
public class SourceRabbitMQMetaParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("InnerNameSuffix")
    private String innerNameSuffix;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("MaxHops")
    private String maxHops;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("OrderConsume")
    private String orderConsume;

    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("Regex")
    private String regex;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("SyncMetaType")
    private String syncMetaType;

    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private String vSwitchIds;

    @com.aliyun.core.annotation.NameInMap("VirtualHostName")
    private String virtualHostName;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private SourceRabbitMQMetaParameters(Builder builder) {
        this.endpoint = builder.endpoint;
        this.innerNameSuffix = builder.innerNameSuffix;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.maxHops = builder.maxHops;
        this.networkType = builder.networkType;
        this.orderConsume = builder.orderConsume;
        this.password = builder.password;
        this.regex = builder.regex;
        this.securityGroupId = builder.securityGroupId;
        this.syncMetaType = builder.syncMetaType;
        this.username = builder.username;
        this.vSwitchIds = builder.vSwitchIds;
        this.virtualHostName = builder.virtualHostName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceRabbitMQMetaParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return innerNameSuffix
     */
    public String getInnerNameSuffix() {
        return this.innerNameSuffix;
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
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return orderConsume
     */
    public String getOrderConsume() {
        return this.orderConsume;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regex
     */
    public String getRegex() {
        return this.regex;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return syncMetaType
     */
    public String getSyncMetaType() {
        return this.syncMetaType;
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
        private String endpoint; 
        private String innerNameSuffix; 
        private String instanceId; 
        private String instanceType; 
        private String maxHops; 
        private String networkType; 
        private String orderConsume; 
        private String password; 
        private String regex; 
        private String securityGroupId; 
        private String syncMetaType; 
        private String username; 
        private String vSwitchIds; 
        private String virtualHostName; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(SourceRabbitMQMetaParameters model) {
            this.endpoint = model.endpoint;
            this.innerNameSuffix = model.innerNameSuffix;
            this.instanceId = model.instanceId;
            this.instanceType = model.instanceType;
            this.maxHops = model.maxHops;
            this.networkType = model.networkType;
            this.orderConsume = model.orderConsume;
            this.password = model.password;
            this.regex = model.regex;
            this.securityGroupId = model.securityGroupId;
            this.syncMetaType = model.syncMetaType;
            this.username = model.username;
            this.vSwitchIds = model.vSwitchIds;
            this.virtualHostName = model.virtualHostName;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>The access endpoint of the RabbitMQ cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>rabbitmq-cn-a1b2c3d4e5f-cn-hangzhou-vpc.amqp.aliyuncs.com</p>
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The added suffix.</p>
         * 
         * <strong>example:</strong>
         * <p>rabbitmq-cn-a1b2c3d4e5f_example_123e4567-e89b-42d3-a456-426614174000</p>
         */
        public Builder innerNameSuffix(String innerNameSuffix) {
            this.innerNameSuffix = innerNameSuffix;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ (MSMQ message queue) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rabbitmq-cn-a1b2c3d4e5f</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the source RabbitMQ instance.</p>
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
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>Specifies whether to consume messages in order.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder orderConsume(String orderConsume) {
            this.orderConsume = orderConsume;
            return this;
        }

        /**
         * <p>The password used to connect to the RabbitMQ cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>yourPassword</p>
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * <p>The regular expression used to filter exchanges.</p>
         * 
         * <strong>example:</strong>
         * <p>^example_.*</p>
         */
        public Builder regex(String regex) {
            this.regex = regex;
            return this;
        }

        /**
         * <p>The ID of the security group to which the machines of the RabbitMQ cluster belong.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The type of synchronized metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>queue</p>
         */
        public Builder syncMetaType(String syncMetaType) {
            this.syncMetaType = syncMetaType;
            return this;
        }

        /**
         * <p>The username used to connect to the RabbitMQ cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        /**
         * <p>The ID of the vSwitch in the VPC where the RabbitMQ cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1****</p>
         */
        public Builder vSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The name of the virtual host (vhost) in the RabbitMQ cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test-001</p>
         */
        public Builder virtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }

        /**
         * <p>The ID of the VPC where the RabbitMQ cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vb****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public SourceRabbitMQMetaParameters build() {
            return new SourceRabbitMQMetaParameters(this);
        } 

    } 

}
