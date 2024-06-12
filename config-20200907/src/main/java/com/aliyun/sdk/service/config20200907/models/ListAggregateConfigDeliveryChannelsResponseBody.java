// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAggregateConfigDeliveryChannelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregateConfigDeliveryChannelsResponseBody</p>
 */
public class ListAggregateConfigDeliveryChannelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryChannels")
    private java.util.List < DeliveryChannels> deliveryChannels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAggregateConfigDeliveryChannelsResponseBody(Builder builder) {
        this.deliveryChannels = builder.deliveryChannels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateConfigDeliveryChannelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return deliveryChannels
     */
    public java.util.List < DeliveryChannels> getDeliveryChannels() {
        return this.deliveryChannels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DeliveryChannels> deliveryChannels; 
        private String requestId; 

        /**
         * The information about the delivery channels.
         */
        public Builder deliveryChannels(java.util.List < DeliveryChannels> deliveryChannels) {
            this.deliveryChannels = deliveryChannels;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAggregateConfigDeliveryChannelsResponseBody build() {
            return new ListAggregateConfigDeliveryChannelsResponseBody(this);
        } 

    } 

    public static class DeliveryChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AggregatorId")
        private String aggregatorId;

        @com.aliyun.core.annotation.NameInMap("ConfigurationItemChangeNotification")
        private Boolean configurationItemChangeNotification;

        @com.aliyun.core.annotation.NameInMap("ConfigurationSnapshot")
        private Boolean configurationSnapshot;

        @com.aliyun.core.annotation.NameInMap("DeliveryChannelAssumeRoleArn")
        private String deliveryChannelAssumeRoleArn;

        @com.aliyun.core.annotation.NameInMap("DeliveryChannelCondition")
        private String deliveryChannelCondition;

        @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
        private String deliveryChannelId;

        @com.aliyun.core.annotation.NameInMap("DeliveryChannelName")
        private String deliveryChannelName;

        @com.aliyun.core.annotation.NameInMap("DeliveryChannelTargetArn")
        private String deliveryChannelTargetArn;

        @com.aliyun.core.annotation.NameInMap("DeliveryChannelType")
        private String deliveryChannelType;

        @com.aliyun.core.annotation.NameInMap("DeliverySnapshotTime")
        private String deliverySnapshotTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("NonCompliantNotification")
        private Boolean nonCompliantNotification;

        @com.aliyun.core.annotation.NameInMap("OversizedDataOSSTargetArn")
        private String oversizedDataOSSTargetArn;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private DeliveryChannels(Builder builder) {
            this.accountId = builder.accountId;
            this.aggregatorId = builder.aggregatorId;
            this.configurationItemChangeNotification = builder.configurationItemChangeNotification;
            this.configurationSnapshot = builder.configurationSnapshot;
            this.deliveryChannelAssumeRoleArn = builder.deliveryChannelAssumeRoleArn;
            this.deliveryChannelCondition = builder.deliveryChannelCondition;
            this.deliveryChannelId = builder.deliveryChannelId;
            this.deliveryChannelName = builder.deliveryChannelName;
            this.deliveryChannelTargetArn = builder.deliveryChannelTargetArn;
            this.deliveryChannelType = builder.deliveryChannelType;
            this.deliverySnapshotTime = builder.deliverySnapshotTime;
            this.description = builder.description;
            this.nonCompliantNotification = builder.nonCompliantNotification;
            this.oversizedDataOSSTargetArn = builder.oversizedDataOSSTargetArn;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryChannels create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return aggregatorId
         */
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        /**
         * @return configurationItemChangeNotification
         */
        public Boolean getConfigurationItemChangeNotification() {
            return this.configurationItemChangeNotification;
        }

        /**
         * @return configurationSnapshot
         */
        public Boolean getConfigurationSnapshot() {
            return this.configurationSnapshot;
        }

        /**
         * @return deliveryChannelAssumeRoleArn
         */
        public String getDeliveryChannelAssumeRoleArn() {
            return this.deliveryChannelAssumeRoleArn;
        }

        /**
         * @return deliveryChannelCondition
         */
        public String getDeliveryChannelCondition() {
            return this.deliveryChannelCondition;
        }

        /**
         * @return deliveryChannelId
         */
        public String getDeliveryChannelId() {
            return this.deliveryChannelId;
        }

        /**
         * @return deliveryChannelName
         */
        public String getDeliveryChannelName() {
            return this.deliveryChannelName;
        }

        /**
         * @return deliveryChannelTargetArn
         */
        public String getDeliveryChannelTargetArn() {
            return this.deliveryChannelTargetArn;
        }

        /**
         * @return deliveryChannelType
         */
        public String getDeliveryChannelType() {
            return this.deliveryChannelType;
        }

        /**
         * @return deliverySnapshotTime
         */
        public String getDeliverySnapshotTime() {
            return this.deliverySnapshotTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return nonCompliantNotification
         */
        public Boolean getNonCompliantNotification() {
            return this.nonCompliantNotification;
        }

        /**
         * @return oversizedDataOSSTargetArn
         */
        public String getOversizedDataOSSTargetArn() {
            return this.oversizedDataOSSTargetArn;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long accountId; 
            private String aggregatorId; 
            private Boolean configurationItemChangeNotification; 
            private Boolean configurationSnapshot; 
            private String deliveryChannelAssumeRoleArn; 
            private String deliveryChannelCondition; 
            private String deliveryChannelId; 
            private String deliveryChannelName; 
            private String deliveryChannelTargetArn; 
            private String deliveryChannelType; 
            private String deliverySnapshotTime; 
            private String description; 
            private Boolean nonCompliantNotification; 
            private String oversizedDataOSSTargetArn; 
            private Integer status; 

            /**
             * The ID of the member in the account group.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The ID of the account group.
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
                return this;
            }

            /**
             * Indicates whether the specified destination receives resource change logs. If the value of this parameter is true, Cloud Config delivers the resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:
             * <p>
             * 
             * *   true: The specified destination receives resource change logs.
             * *   false: The specified destination does not receive resource change logs.
             */
            public Builder configurationItemChangeNotification(Boolean configurationItemChangeNotification) {
                this.configurationItemChangeNotification = configurationItemChangeNotification;
                return this;
            }

            /**
             * Indicates whether the specified destination receives scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at `04:00Z` and `16:00Z` to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:
             * <p>
             * 
             * *   true: The specified destination receives scheduled resource snapshots.
             * *   false: The specified destination does not receive scheduled resource snapshots.
             */
            public Builder configurationSnapshot(Boolean configurationSnapshot) {
                this.configurationSnapshot = configurationSnapshot;
                return this;
            }

            /**
             * The ARN of the role that is assigned to the delivery channel.
             */
            public Builder deliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
                this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
                return this;
            }

            /**
             * The rule that is attached to the delivery channel. This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.
             * <p>
             * 
             * *   If the value of the DeliveryChannelType parameter is MNS, take note of the following settings of the lowest risk level and resource types of the events to which you subscribed:
             * 
             *     *   The lowest risk level of the events to which you want to subscribe is in the following format: `{"filterType":"RuleRiskLevel","value":"1","multiple":false}`.
             * 
             *         The `value` field indicates the risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.
             * 
             *     *   The setting of the resource types of the events to which you want to subscribe is in the following format: `{"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}`.
             * 
             *         The `values` field indicates the resource types of the events to which you want to subscribe. The value of the field is a JSON array. Examples:
             * 
             * `[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}]`
             * 
             * *   If you set the DeliveryChannelType parameter to SLS, the setting of the resource types of the snapshots to which you want to deliver is in the following format: `{"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}`.
             * 
             *     The `values` field specifies the resource types of the snapshots to which you want to deliver. The value of the field is a JSON array. Examples:
             * 
             * `[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}]`
             */
            public Builder deliveryChannelCondition(String deliveryChannelCondition) {
                this.deliveryChannelCondition = deliveryChannelCondition;
                return this;
            }

            /**
             * The ID of the delivery channel.
             */
            public Builder deliveryChannelId(String deliveryChannelId) {
                this.deliveryChannelId = deliveryChannelId;
                return this;
            }

            /**
             * The name of the delivery channel.
             */
            public Builder deliveryChannelName(String deliveryChannelName) {
                this.deliveryChannelName = deliveryChannelName;
                return this;
            }

            /**
             * The ARN of the delivery destination.
             * <p>
             * 
             * *   If the value of the DeliveryChannelType parameter is OSS, the value of this parameter is the ARN of the destination OSS bucket.
             * *   If the value of the DeliveryChannelType parameter is MNS, the value of this parameter is the ARN of the destination MNS topic.
             * *   If the value of the DeliveryChannelType parameter is SLS, the value of this parameter is the ARN of the destination Log Service Logstore.
             */
            public Builder deliveryChannelTargetArn(String deliveryChannelTargetArn) {
                this.deliveryChannelTargetArn = deliveryChannelTargetArn;
                return this;
            }

            /**
             * The type of the delivery channel. Valid values:
             * <p>
             * 
             * *   OSS: Object Storage Service (OSS)
             * *   MNS: Message Service (MNS)
             * *   SLS: Log Service
             */
            public Builder deliveryChannelType(String deliveryChannelType) {
                this.deliveryChannelType = deliveryChannelType;
                return this;
            }

            /**
             * The time when Cloud Config delivers scheduled resources snapshots every day.
             * <p>
             * 
             * Format: `HH:mmZ`. This time is displayed in UTC.
             */
            public Builder deliverySnapshotTime(String deliverySnapshotTime) {
                this.deliverySnapshotTime = deliverySnapshotTime;
                return this;
            }

            /**
             * The description of the delivery channel.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether the specified destination receives resource non-compliance events. If the value of this parameter is true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are evaluated as non-compliant. Valid values:
             * <p>
             * 
             * *   true: The specified destination receives resource non-compliance events.
             * *   false: The specified destination does not receive resource non-compliance events.
             */
            public Builder nonCompliantNotification(Boolean nonCompliantNotification) {
                this.nonCompliantNotification = nonCompliantNotification;
                return this;
            }

            /**
             * The ARN of the OSS bucket to which the delivered data is transferred when the size of the data exceeds the specified upper limit of the delivery channel.
             */
            public Builder oversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
                this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
                return this;
            }

            /**
             * The status of the delivery channel. Valid values:
             * <p>
             * 
             * *   0: The delivery channel is disabled.
             * *   1: The delivery channel is enabled.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public DeliveryChannels build() {
                return new DeliveryChannels(this);
            } 

        } 

    }
}
