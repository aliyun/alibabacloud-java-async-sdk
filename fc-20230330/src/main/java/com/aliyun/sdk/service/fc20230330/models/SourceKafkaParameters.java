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
 * {@link SourceKafkaParameters} extends {@link TeaModel}
 *
 * <p>SourceKafkaParameters</p>
 */
public class SourceKafkaParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConsumerGroup")
    private String consumerGroup;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

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

    public Builder toBuilder() {
        return new Builder(this);
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
        private String network; 
        private String offsetReset; 
        private String regionId; 
        private String securityGroupId; 
        private String topic; 
        private String vSwitchIds; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(SourceKafkaParameters model) {
            this.consumerGroup = model.consumerGroup;
            this.instanceId = model.instanceId;
            this.network = model.network;
            this.offsetReset = model.offsetReset;
            this.regionId = model.regionId;
            this.securityGroupId = model.securityGroupId;
            this.topic = model.topic;
            this.vSwitchIds = model.vSwitchIds;
            this.vpcId = model.vpcId;
        } 

        /**
         * ConsumerGroup.
         */
        public Builder consumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
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
         * Network.
         */
        public Builder network(String network) {
            this.network = network;
            return this;
        }

        /**
         * OffsetReset.
         */
        public Builder offsetReset(String offsetReset) {
            this.offsetReset = offsetReset;
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
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.topic = topic;
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
         * VpcId.
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
