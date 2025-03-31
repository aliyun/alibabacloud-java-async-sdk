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
         * AuthType.
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * FilterType.
         */
        public Builder filterType(String filterType) {
            this.filterType = filterType;
            return this;
        }

        /**
         * GroupID.
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceNetwork.
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
         * InstanceSecurityGroupId.
         */
        public Builder instanceSecurityGroupId(String instanceSecurityGroupId) {
            this.instanceSecurityGroupId = instanceSecurityGroupId;
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
         * InstanceUsername.
         */
        public Builder instanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }

        /**
         * InstanceVSwitchIds.
         */
        public Builder instanceVSwitchIds(String instanceVSwitchIds) {
            this.instanceVSwitchIds = instanceVSwitchIds;
            return this;
        }

        /**
         * InstanceVpcId.
         */
        public Builder instanceVpcId(String instanceVpcId) {
            this.instanceVpcId = instanceVpcId;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(String offset) {
            this.offset = offset;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Topic.
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
