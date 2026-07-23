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

    @com.aliyun.core.annotation.NameInMap("CloudMigrationTaskId")
    private String cloudMigrationTaskId;

    @com.aliyun.core.annotation.NameInMap("DstClusterHost")
    private String dstClusterHost;

    @com.aliyun.core.annotation.NameInMap("DstClusterType")
    private String dstClusterType;

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

    @com.aliyun.core.annotation.NameInMap("Regex")
    private String regex;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("SrcClusterHost")
    private String srcClusterHost;

    @com.aliyun.core.annotation.NameInMap("SrcClusterType")
    private String srcClusterType;

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

    private SourceRabbitMQMsgSyncParameters(Builder builder) {
        this.bodyDataType = builder.bodyDataType;
        this.cloudMigrationTaskId = builder.cloudMigrationTaskId;
        this.dstClusterHost = builder.dstClusterHost;
        this.dstClusterType = builder.dstClusterType;
        this.endpoint = builder.endpoint;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.networkType = builder.networkType;
        this.orderConsume = builder.orderConsume;
        this.password = builder.password;
        this.prefetchCount = builder.prefetchCount;
        this.regex = builder.regex;
        this.securityGroupId = builder.securityGroupId;
        this.srcClusterHost = builder.srcClusterHost;
        this.srcClusterType = builder.srcClusterType;
        this.syncMetaType = builder.syncMetaType;
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
     * @return cloudMigrationTaskId
     */
    public String getCloudMigrationTaskId() {
        return this.cloudMigrationTaskId;
    }

    /**
     * @return dstClusterHost
     */
    public String getDstClusterHost() {
        return this.dstClusterHost;
    }

    /**
     * @return dstClusterType
     */
    public String getDstClusterType() {
        return this.dstClusterType;
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
     * @return srcClusterHost
     */
    public String getSrcClusterHost() {
        return this.srcClusterHost;
    }

    /**
     * @return srcClusterType
     */
    public String getSrcClusterType() {
        return this.srcClusterType;
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
        private String bodyDataType; 
        private String cloudMigrationTaskId; 
        private String dstClusterHost; 
        private String dstClusterType; 
        private String endpoint; 
        private String instanceId; 
        private String instanceType; 
        private String networkType; 
        private String orderConsume; 
        private String password; 
        private String prefetchCount; 
        private String regex; 
        private String securityGroupId; 
        private String srcClusterHost; 
        private String srcClusterType; 
        private String syncMetaType; 
        private String username; 
        private String vSwitchIds; 
        private String virtualHostName; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(SourceRabbitMQMsgSyncParameters model) {
            this.bodyDataType = model.bodyDataType;
            this.cloudMigrationTaskId = model.cloudMigrationTaskId;
            this.dstClusterHost = model.dstClusterHost;
            this.dstClusterType = model.dstClusterType;
            this.endpoint = model.endpoint;
            this.instanceId = model.instanceId;
            this.instanceType = model.instanceType;
            this.networkType = model.networkType;
            this.orderConsume = model.orderConsume;
            this.password = model.password;
            this.prefetchCount = model.prefetchCount;
            this.regex = model.regex;
            this.securityGroupId = model.securityGroupId;
            this.srcClusterHost = model.srcClusterHost;
            this.srcClusterType = model.srcClusterType;
            this.syncMetaType = model.syncMetaType;
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
         * CloudMigrationTaskId.
         */
        public Builder cloudMigrationTaskId(String cloudMigrationTaskId) {
            this.cloudMigrationTaskId = cloudMigrationTaskId;
            return this;
        }

        /**
         * DstClusterHost.
         */
        public Builder dstClusterHost(String dstClusterHost) {
            this.dstClusterHost = dstClusterHost;
            return this;
        }

        /**
         * DstClusterType.
         */
        public Builder dstClusterType(String dstClusterType) {
            this.dstClusterType = dstClusterType;
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
         * SrcClusterHost.
         */
        public Builder srcClusterHost(String srcClusterHost) {
            this.srcClusterHost = srcClusterHost;
            return this;
        }

        /**
         * SrcClusterType.
         */
        public Builder srcClusterType(String srcClusterType) {
            this.srcClusterType = srcClusterType;
            return this;
        }

        /**
         * SyncMetaType.
         */
        public Builder syncMetaType(String syncMetaType) {
            this.syncMetaType = syncMetaType;
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
