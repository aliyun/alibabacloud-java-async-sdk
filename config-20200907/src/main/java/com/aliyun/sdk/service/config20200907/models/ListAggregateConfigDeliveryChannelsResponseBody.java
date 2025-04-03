// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListAggregateConfigDeliveryChannelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregateConfigDeliveryChannelsResponseBody</p>
 */
public class ListAggregateConfigDeliveryChannelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryChannels")
    private java.util.List<DeliveryChannels> deliveryChannels;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryChannels
     */
    public java.util.List<DeliveryChannels> getDeliveryChannels() {
        return this.deliveryChannels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DeliveryChannels> deliveryChannels; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAggregateConfigDeliveryChannelsResponseBody model) {
            this.deliveryChannels = model.deliveryChannels;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the delivery channels.</p>
         */
        public Builder deliveryChannels(java.util.List<DeliveryChannels> deliveryChannels) {
            this.deliveryChannels = deliveryChannels;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DC300244-FCE3-5061-8214-C27ECB668487</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAggregateConfigDeliveryChannelsResponseBody build() {
            return new ListAggregateConfigDeliveryChannelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAggregateConfigDeliveryChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateConfigDeliveryChannelsResponseBody</p>
     */
    public static class DeliveryChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AggregatorId")
        private String aggregatorId;

        @com.aliyun.core.annotation.NameInMap("CompliantSnapshot")
        private Boolean compliantSnapshot;

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
            this.compliantSnapshot = builder.compliantSnapshot;
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
         * @return compliantSnapshot
         */
        public Boolean getCompliantSnapshot() {
            return this.compliantSnapshot;
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
            private Boolean compliantSnapshot; 
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

            private Builder() {
            } 

            private Builder(DeliveryChannels model) {
                this.accountId = model.accountId;
                this.aggregatorId = model.aggregatorId;
                this.compliantSnapshot = model.compliantSnapshot;
                this.configurationItemChangeNotification = model.configurationItemChangeNotification;
                this.configurationSnapshot = model.configurationSnapshot;
                this.deliveryChannelAssumeRoleArn = model.deliveryChannelAssumeRoleArn;
                this.deliveryChannelCondition = model.deliveryChannelCondition;
                this.deliveryChannelId = model.deliveryChannelId;
                this.deliveryChannelName = model.deliveryChannelName;
                this.deliveryChannelTargetArn = model.deliveryChannelTargetArn;
                this.deliveryChannelType = model.deliveryChannelType;
                this.deliverySnapshotTime = model.deliverySnapshotTime;
                this.description = model.description;
                this.nonCompliantNotification = model.nonCompliantNotification;
                this.oversizedDataOSSTargetArn = model.oversizedDataOSSTargetArn;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the member in the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>120886317861****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-a4e5626622af0079****</p>
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
                return this;
            }

            /**
             * <p>Indicates whether the specified destination receives scheduled compliant snapshots. Cloud Config delivers scheduled compliant snapshots at <code>04:00Z</code> and <code>16:00Z</code> to Log Service every day. The time is displayed in UTC. Valid values:</p>
             * <ul>
             * <li>true: The specified destination receives scheduled compliant snapshots.</li>
             * <li>false: The specified destination does not receive scheduled compliant snapshots.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder compliantSnapshot(Boolean compliantSnapshot) {
                this.compliantSnapshot = compliantSnapshot;
                return this;
            }

            /**
             * <p>Indicates whether the specified destination receives resource change logs. If the value of this parameter is true, Cloud Config delivers the resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:</p>
             * <ul>
             * <li>true: The specified destination receives resource change logs.</li>
             * <li>false: The specified destination does not receive resource change logs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder configurationItemChangeNotification(Boolean configurationItemChangeNotification) {
                this.configurationItemChangeNotification = configurationItemChangeNotification;
                return this;
            }

            /**
             * <p>Indicates whether the specified destination receives scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at <code>04:00Z</code> and <code>16:00Z</code> to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:</p>
             * <ul>
             * <li>true: The specified destination receives scheduled resource snapshots.</li>
             * <li>false: The specified destination does not receive scheduled resource snapshots.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder configurationSnapshot(Boolean configurationSnapshot) {
                this.configurationSnapshot = configurationSnapshot;
                return this;
            }

            /**
             * <p>The ARN of the role that is assigned to the delivery channel.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::120886317861****:role/aliyunserviceroleforconfig</p>
             */
            public Builder deliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
                this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
                return this;
            }

            /**
             * <p>The rule that is attached to the delivery channel. This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.</p>
             * <ul>
             * <li><p>If the value of the DeliveryChannelType parameter is MNS, take note of the following settings of the lowest risk level and resource types of the events to which you subscribed:</p>
             * <ul>
             * <li><p>The lowest risk level of the events to which you want to subscribe is in the following format: <code>{&quot;filterType&quot;:&quot;RuleRiskLevel&quot;,&quot;value&quot;:&quot;1&quot;,&quot;multiple&quot;:false}</code>.</p>
             * <p>The <code>value</code> field indicates the risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.</p>
             * </li>
             * <li><p>The setting of the resource types of the events to which you want to subscribe is in the following format: <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
             * <p>The <code>values</code> field indicates the resource types of the events to which you want to subscribe. The value of the field is a JSON array. Examples:</p>
             * </li>
             * </ul>
             * </li>
             * </ul>
             * <p><code>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</code></p>
             * <ul>
             * <li><p>If you set the DeliveryChannelType parameter to SLS, the setting of the resource types of the snapshots to which you want to deliver is in the following format: <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
             * <p>The <code>values</code> field specifies the resource types of the snapshots to which you want to deliver. The value of the field is a JSON array. Examples:</p>
             * </li>
             * </ul>
             * <p><code>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</code></p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</p>
             */
            public Builder deliveryChannelCondition(String deliveryChannelCondition) {
                this.deliveryChannelCondition = deliveryChannelCondition;
                return this;
            }

            /**
             * <p>The ID of the delivery channel.</p>
             * 
             * <strong>example:</strong>
             * <p>cdc-d9106457e0d900b1****</p>
             */
            public Builder deliveryChannelId(String deliveryChannelId) {
                this.deliveryChannelId = deliveryChannelId;
                return this;
            }

            /**
             * <p>The name of the delivery channel.</p>
             * 
             * <strong>example:</strong>
             * <p>myDeliveryChannel</p>
             */
            public Builder deliveryChannelName(String deliveryChannelName) {
                this.deliveryChannelName = deliveryChannelName;
                return this;
            }

            /**
             * <p>The ARN of the delivery destination.</p>
             * <ul>
             * <li>If the value of the DeliveryChannelType parameter is OSS, the value of this parameter is the ARN of the destination OSS bucket.</li>
             * <li>If the value of the DeliveryChannelType parameter is MNS, the value of this parameter is the ARN of the destination MNS topic.</li>
             * <li>If the value of the DeliveryChannelType parameter is SLS, the value of this parameter is the ARN of the destination Log Service Logstore.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>acs:oss:cn-shanghai:120886317861****:new-bucket</p>
             */
            public Builder deliveryChannelTargetArn(String deliveryChannelTargetArn) {
                this.deliveryChannelTargetArn = deliveryChannelTargetArn;
                return this;
            }

            /**
             * <p>The type of the delivery channel. Valid values:</p>
             * <ul>
             * <li>OSS: Object Storage Service (OSS)</li>
             * <li>MNS: Message Service (MNS)</li>
             * <li>SLS: Log Service</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder deliveryChannelType(String deliveryChannelType) {
                this.deliveryChannelType = deliveryChannelType;
                return this;
            }

            /**
             * <p>The time when Cloud Config delivers scheduled resources snapshots every day.</p>
             * <p>Format: <code>HH:mmZ</code>. This time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>09:10Z</p>
             */
            public Builder deliverySnapshotTime(String deliverySnapshotTime) {
                this.deliverySnapshotTime = deliverySnapshotTime;
                return this;
            }

            /**
             * <p>The description of the delivery channel.</p>
             * 
             * <strong>example:</strong>
             * <p>My OSS delivery.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the specified destination receives resource non-compliance events. If the value of this parameter is true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are evaluated as non-compliant. Valid values:</p>
             * <ul>
             * <li>true: The specified destination receives resource non-compliance events.</li>
             * <li>false: The specified destination does not receive resource non-compliance events.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder nonCompliantNotification(Boolean nonCompliantNotification) {
                this.nonCompliantNotification = nonCompliantNotification;
                return this;
            }

            /**
             * <p>The ARN of the OSS bucket to which the delivered data is transferred when the size of the data exceeds the specified upper limit of the delivery channel.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:oss:cn-shanghai:100931896542****:new-bucket</p>
             */
            public Builder oversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
                this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
                return this;
            }

            /**
             * <p>The status of the delivery channel. Valid values:</p>
             * <ul>
             * <li>0: The delivery channel is disabled.</li>
             * <li>1: The delivery channel is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
