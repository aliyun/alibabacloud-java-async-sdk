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
            this.username = model.username;
            this.vSwitchIds = model.vSwitchIds;
            this.virtualHostName = model.virtualHostName;
            this.vpcId = model.vpcId;
        } 

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * InnerNameSuffix.
         */
        public Builder innerNameSuffix(String innerNameSuffix) {
            this.innerNameSuffix = innerNameSuffix;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * MaxHops.
         */
        public Builder maxHops(String maxHops) {
            this.maxHops = maxHops;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * OrderConsume.
         */
        public Builder orderConsume(String orderConsume) {
            this.orderConsume = orderConsume;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Regex.
         */
        public Builder regex(String regex) {
            this.regex = regex;
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
         * Username.
         */
        public Builder username(String username) {
            this.username = username;
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
         * VirtualHostName.
         */
        public Builder virtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }

        /**
         * VpcId.
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
