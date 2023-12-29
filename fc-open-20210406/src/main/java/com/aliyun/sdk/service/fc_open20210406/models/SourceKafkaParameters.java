// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SourceKafkaParameters} extends {@link TeaModel}
 *
 * <p>SourceKafkaParameters</p>
 */
public class SourceKafkaParameters extends TeaModel {
    @NameInMap("ConsumerGroup")
    @Validation(required = true)
    private String consumerGroup;

    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @NameInMap("Network")
    private String network;

    @NameInMap("OffsetReset")
    private String offsetReset;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    @NameInMap("VSwitchIds")
    private String vSwitchIds;

    @NameInMap("VpcId")
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
