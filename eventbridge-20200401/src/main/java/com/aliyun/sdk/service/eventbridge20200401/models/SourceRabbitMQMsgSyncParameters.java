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
 * {@link SourceRabbitMQMsgSyncParameters} extends {@link TeaModel}
 *
 * <p>SourceRabbitMQMsgSyncParameters</p>
 */
public class SourceRabbitMQMsgSyncParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BodyDataType")
    private String bodyDataType;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("OrderConsume")
    private String orderConsume;

    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("PrefetchCount")
    private String prefetchCount;

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

    private SourceRabbitMQMsgSyncParameters(Builder builder) {
        this.bodyDataType = builder.bodyDataType;
        this.endpoint = builder.endpoint;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.networkType = builder.networkType;
        this.orderConsume = builder.orderConsume;
        this.password = builder.password;
        this.prefetchCount = builder.prefetchCount;
        this.securityGroupId = builder.securityGroupId;
        this.username = builder.username;
        this.vSwitchIds = builder.vSwitchIds;
        this.virtualHostName = builder.virtualHostName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceRabbitMQMsgSyncParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bodyDataType
     */
    public String getBodyDataType() {
        return this.bodyDataType;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
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
     * @return prefetchCount
     */
    public String getPrefetchCount() {
        return this.prefetchCount;
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
        private String bodyDataType; 
        private String endpoint; 
        private String instanceId; 
        private String instanceType; 
        private String networkType; 
        private String orderConsume; 
        private String password; 
        private String prefetchCount; 
        private String securityGroupId; 
        private String username; 
        private String vSwitchIds; 
        private String virtualHostName; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(SourceRabbitMQMsgSyncParameters model) {
            this.bodyDataType = model.bodyDataType;
            this.endpoint = model.endpoint;
            this.instanceId = model.instanceId;
            this.instanceType = model.instanceType;
            this.networkType = model.networkType;
            this.orderConsume = model.orderConsume;
            this.password = model.password;
            this.prefetchCount = model.prefetchCount;
            this.securityGroupId = model.securityGroupId;
            this.username = model.username;
            this.vSwitchIds = model.vSwitchIds;
            this.virtualHostName = model.virtualHostName;
            this.vpcId = model.vpcId;
        } 

        /**
         * BodyDataType.
         */
        public Builder bodyDataType(String bodyDataType) {
            this.bodyDataType = bodyDataType;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
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
         * PrefetchCount.
         */
        public Builder prefetchCount(String prefetchCount) {
            this.prefetchCount = prefetchCount;
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

        public SourceRabbitMQMsgSyncParameters build() {
            return new SourceRabbitMQMsgSyncParameters(this);
        } 

    } 

}
