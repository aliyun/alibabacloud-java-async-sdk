// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SourceRocketMQParameters} extends {@link TeaModel}
 *
 * <p>SourceRocketMQParameters</p>
 */
public class SourceRocketMQParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.NameInMap("FilterType")
    private String filterType;

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
    private Integer timestamp;

    @com.aliyun.core.annotation.NameInMap("Topic")
    private String topic;

    private SourceRocketMQParameters(Builder builder) {
        this.authType = builder.authType;
        this.filterType = builder.filterType;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return filterType
     */
    public String getFilterType() {
        return this.filterType;
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
    public Integer getTimestamp() {
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
        private String filterType; 
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
        private Integer timestamp; 
        private String topic; 

        private Builder() {
        } 

        private Builder(SourceRocketMQParameters model) {
            this.authType = model.authType;
            this.filterType = model.filterType;
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
         * <p>The authentication type. Set the value to ACL or leave the value empty. The value ACL indicates that authentication is enabled. In this case, you must specify InstanceUsername and InstancePassword.</p>
         * 
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * <p>The message filter type.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag</p>
         */
        public Builder filterType(String filterType) {
            this.filterType = filterType;
            return this;
        }

        /**
         * <p>The ID of the consumer group of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_group1</p>
         */
        public Builder groupID(String groupID) {
            this.groupID = groupID;
            return this;
        }

        /**
         * <p>The information about the endpoint of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com</p>
         */
        public Builder instanceEndpoint(String instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_164901546557****_BAAN****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        public Builder instanceNetwork(String instanceNetwork) {
            this.instanceNetwork = instanceNetwork;
            return this;
        }

        /**
         * <p>The password of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder instancePassword(String instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-hp35r2hc3a3sv8q2****</p>
         */
        public Builder instanceSecurityGroupId(String instanceSecurityGroupId) {
            this.instanceSecurityGroupId = instanceSecurityGroupId;
            return this;
        }

        /**
         * <p>The type of ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud_5</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The username of the ApsaraMQ for RocketMQ instance. If you use the Internet, you must configure the username and password of the instance in the SDK code for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>6W0xz2uPfiwp****</p>
         */
        public Builder instanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }

        /**
         * <p>The ID of the vSwitch associated with the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6gwtbn6etadpvz7****</p>
         */
        public Builder instanceVSwitchIds(String instanceVSwitchIds) {
            this.instanceVSwitchIds = instanceVSwitchIds;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) associated with the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6of9452b2pba82c****</p>
         */
        public Builder instanceVpcId(String instanceVpcId) {
            this.instanceVpcId = instanceVpcId;
            return this;
        }

        /**
         * <p>The consumer offset of the message. CONSUME_FROM_LAST_OFFSET: consumes messages from the latest offset. This is the default value. CONSUME_FROM_FIRST_OFFSET: consumes messages from the earliest offset. CONSUME_FROM_TIMESTAMP: consumes messages from the offset at the specified point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSUME_FROM_TIMESTAMP</p>
         */
        public Builder offset(String offset) {
            this.offset = offset;
            return this;
        }

        /**
         * <p>The region to which the ApsaraMQ for RocketMQ queue belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The tags that are used to filter messages.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * <p>The timestamp. This parameter is valid only when you set Offset to CONSUME_FROM_TIMESTAMP.</p>
         * 
         * <strong>example:</strong>
         * <p>1636597951964</p>
         */
        public Builder timestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>The name of the topic in the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>myTopic</p>
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
