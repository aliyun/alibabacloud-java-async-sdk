// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SourceRocketMQParameters} extends {@link TeaModel}
 *
 * <p>SourceRocketMQParameters</p>
 */
public class SourceRocketMQParameters extends TeaModel {
    @NameInMap("AuthType")
    private String authType;

    @NameInMap("FilterSql")
    private String filterSql;

    @NameInMap("FilterType")
    private String filterType;

    @NameInMap("GroupID")
    @Validation(required = true)
    private String groupID;

    @NameInMap("InstanceEndpoint")
    private String instanceEndpoint;

    @NameInMap("InstanceId")
    @Validation(required = true)
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
    private Long timestamp;

    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private SourceRocketMQParameters(Builder builder) {
        this.authType = builder.authType;
        this.filterSql = builder.filterSql;
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

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return filterSql
     */
    public String getFilterSql() {
        return this.filterSql;
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
    public Long getTimestamp() {
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
        private String filterSql; 
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
        private Long timestamp; 
        private String topic; 

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * FilterSql.
         */
        public Builder filterSql(String filterSql) {
            this.filterSql = filterSql;
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
        public Builder timestamp(Long timestamp) {
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
