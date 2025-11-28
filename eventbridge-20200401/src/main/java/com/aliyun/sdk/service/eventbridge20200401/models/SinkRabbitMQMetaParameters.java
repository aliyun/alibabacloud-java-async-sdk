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
 * {@link SinkRabbitMQMetaParameters} extends {@link TeaModel}
 *
 * <p>SinkRabbitMQMetaParameters</p>
 */
public class SinkRabbitMQMetaParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

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

    private SinkRabbitMQMetaParameters(Builder builder) {
        this.endpoint = builder.endpoint;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.networkType = builder.networkType;
        this.password = builder.password;
        this.securityGroupId = builder.securityGroupId;
        this.username = builder.username;
        this.vSwitchIds = builder.vSwitchIds;
        this.virtualHostName = builder.virtualHostName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SinkRabbitMQMetaParameters create() {
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
     * @return password
     */
    public String getPassword() {
        return this.password;
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
        private String instanceId; 
        private String instanceType; 
        private String networkType; 
        private String password; 
        private String securityGroupId; 
        private String username; 
        private String vSwitchIds; 
        private String virtualHostName; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(SinkRabbitMQMetaParameters model) {
            this.endpoint = model.endpoint;
            this.instanceId = model.instanceId;
            this.instanceType = model.instanceType;
            this.networkType = model.networkType;
            this.password = model.password;
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
         * Password.
         */
        public Builder password(String password) {
            this.password = password;
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

        public SinkRabbitMQMetaParameters build() {
            return new SinkRabbitMQMetaParameters(this);
        } 

    } 

}
