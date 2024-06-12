// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConfigDeliveryChannelRequest} extends {@link RequestModel}
 *
 * <p>UpdateConfigDeliveryChannelRequest</p>
 */
public class UpdateConfigDeliveryChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigurationItemChangeNotification")
    private Boolean configurationItemChangeNotification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigurationSnapshot")
    private Boolean configurationSnapshot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelCondition")
    private String deliveryChannelCondition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryChannelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelName")
    private String deliveryChannelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelTargetArn")
    private String deliveryChannelTargetArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliverySnapshotTime")
    private String deliverySnapshotTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NonCompliantNotification")
    private Boolean nonCompliantNotification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversizedDataOSSTargetArn")
    private String oversizedDataOSSTargetArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    private UpdateConfigDeliveryChannelRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.configurationItemChangeNotification = builder.configurationItemChangeNotification;
        this.configurationSnapshot = builder.configurationSnapshot;
        this.deliveryChannelCondition = builder.deliveryChannelCondition;
        this.deliveryChannelId = builder.deliveryChannelId;
        this.deliveryChannelName = builder.deliveryChannelName;
        this.deliveryChannelTargetArn = builder.deliveryChannelTargetArn;
        this.deliverySnapshotTime = builder.deliverySnapshotTime;
        this.description = builder.description;
        this.nonCompliantNotification = builder.nonCompliantNotification;
        this.oversizedDataOSSTargetArn = builder.oversizedDataOSSTargetArn;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConfigDeliveryChannelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
    public Long getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateConfigDeliveryChannelRequest, Builder> {
        private String clientToken; 
        private Boolean configurationItemChangeNotification; 
        private Boolean configurationSnapshot; 
        private String deliveryChannelCondition; 
        private String deliveryChannelId; 
        private String deliveryChannelName; 
        private String deliveryChannelTargetArn; 
        private String deliverySnapshotTime; 
        private String description; 
        private Boolean nonCompliantNotification; 
        private String oversizedDataOSSTargetArn; 
        private Long status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConfigDeliveryChannelRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.configurationItemChangeNotification = request.configurationItemChangeNotification;
            this.configurationSnapshot = request.configurationSnapshot;
            this.deliveryChannelCondition = request.deliveryChannelCondition;
            this.deliveryChannelId = request.deliveryChannelId;
            this.deliveryChannelName = request.deliveryChannelName;
            this.deliveryChannelTargetArn = request.deliveryChannelTargetArn;
            this.deliverySnapshotTime = request.deliverySnapshotTime;
            this.description = request.description;
            this.nonCompliantNotification = request.nonCompliantNotification;
            this.oversizedDataOSSTargetArn = request.oversizedDataOSSTargetArn;
            this.status = request.status;
        } 

        /**
         * The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must ensure that the token is unique among different requests.
         * <p>
         * 
         * The `token` can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to deliver resource change logs. If you set this parameter to true, Cloud Config delivers resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:
         * <p>
         * 
         * *   true: Cloud Config delivers resource change logs.
         * *   false (default): Cloud Config does not deliver resource change logs.
         * 
         * > This parameter is available for delivery channels of the OSS, SLS, and MNS types.
         */
        public Builder configurationItemChangeNotification(Boolean configurationItemChangeNotification) {
            this.putQueryParameter("ConfigurationItemChangeNotification", configurationItemChangeNotification);
            this.configurationItemChangeNotification = configurationItemChangeNotification;
            return this;
        }

        /**
         * Specifies whether to deliver scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at `04:00Z` and `16:00Z` to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:
         * <p>
         * 
         * *   true: Cloud Config delivers scheduled resource snapshots.
         * *   false (default): Cloud Config does not deliver scheduled resource snapshots.
         */
        public Builder configurationSnapshot(Boolean configurationSnapshot) {
            this.putQueryParameter("ConfigurationSnapshot", configurationSnapshot);
            this.configurationSnapshot = configurationSnapshot;
            return this;
        }

        /**
         * The rule that you want to attach to the delivery channel. This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.
         * <p>
         * 
         * *   If the value of the DeliveryChannelType parameter is MNS, take note of the following settings of the lowest risk level and resource types of the events to which you subscribed:
         * 
         *     *   The setting of the lowest risk level for the events to which you want to subscribe is in the following format: `{"filterType":"RuleRiskLevel","value":"1","multiple":false}`.
         * 
         *         The `value` field indicates the lowest risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.
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
            this.putQueryParameter("DeliveryChannelCondition", deliveryChannelCondition);
            this.deliveryChannelCondition = deliveryChannelCondition;
            return this;
        }

        /**
         * The ID of the delivery channel.
         * <p>
         * 
         * For more information about how to obtain the ID of a delivery channel, see [DescribeDeliveryChannels](~~429841~~).
         */
        public Builder deliveryChannelId(String deliveryChannelId) {
            this.putQueryParameter("DeliveryChannelId", deliveryChannelId);
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }

        /**
         * The name of the delivery channel.
         */
        public Builder deliveryChannelName(String deliveryChannelName) {
            this.putQueryParameter("DeliveryChannelName", deliveryChannelName);
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the delivery destination. Valid values:
         * <p>
         * 
         * *   `acs:oss:{RegionId}:{accountId}:{bucketName}` if your delivery destination is an OSS bucket. Example: `acs:oss:cn-shanghai:100931896542****:new-bucket`.
         * *   `acs:mns:{RegionId}:{accountId}:/topics/{topicName}` if your delivery destination is an MNS topic. Example: `acs:mns:cn-shanghai:100931896542****:/topics/topic1`.
         * *   `acs:log:{RegionId}:{accountId}:project/{projectName}/logstore/{logstoreName}` if your delivery destination is a Log Service Logstore. Example: `acs:log:cn-shanghai:100931896542****:project/project1/logstore/logstore1`.
         */
        public Builder deliveryChannelTargetArn(String deliveryChannelTargetArn) {
            this.putQueryParameter("DeliveryChannelTargetArn", deliveryChannelTargetArn);
            this.deliveryChannelTargetArn = deliveryChannelTargetArn;
            return this;
        }

        /**
         * The time when you want Cloud Config to deliver scheduled resource snapshots every day.
         * <p>
         * 
         * Format: `HH:mmZ`. This time is displayed in UTC.
         * 
         * > When you enable the scheduled resource delivery feature, you can configure this parameter to specify a custom delivery time. If you do not configure this parameter, Cloud Config automatically delivers scheduled resource snapshots at `04:00Z` and `16:00Z` every day.
         */
        public Builder deliverySnapshotTime(String deliverySnapshotTime) {
            this.putQueryParameter("DeliverySnapshotTime", deliverySnapshotTime);
            this.deliverySnapshotTime = deliverySnapshotTime;
            return this;
        }

        /**
         * The description of the delivery channel.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to deliver resource non-compliance events. If you set this parameter to true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are considered non-compliant. Valid values:
         * <p>
         * 
         * *   true: Cloud Config delivers resource non-compliance events.
         * *   false (default): Cloud Config does not deliver resource non-compliance events.
         * 
         * > This parameter is available only for delivery channels of the SLS or MNS type.
         */
        public Builder nonCompliantNotification(Boolean nonCompliantNotification) {
            this.putQueryParameter("NonCompliantNotification", nonCompliantNotification);
            this.nonCompliantNotification = nonCompliantNotification;
            return this;
        }

        /**
         * The ARN of the OSS bucket to which you want to transfer the delivery data when the size of the data exceeds the specified upper limit of the delivery channel. Format: `acs:oss:{RegionId}:{accountId}:{bucketName}`.
         * <p>
         * 
         * If you do not configure this parameter, Cloud Config delivers only summary data.
         * 
         * > This parameter is available only for delivery channels of the SLS or MNS type. The maximum storage size of delivery channels of the SLS type is 1 MB, and the maximum storage size of delivery channels of the MNS type is 64 KB.
         */
        public Builder oversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
            this.putQueryParameter("OversizedDataOSSTargetArn", oversizedDataOSSTargetArn);
            this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
            return this;
        }

        /**
         * Specifies whether to enable the delivery channel. Valid values:
         * <p>
         * 
         * *   0: Cloud Config disables the delivery channel. Cloud Config retains the most recent delivery configuration and stops resource data delivery.
         * *   1 (default): Cloud Config enables the delivery channel.
         */
        public Builder status(Long status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateConfigDeliveryChannelRequest build() {
            return new UpdateConfigDeliveryChannelRequest(this);
        } 

    } 

}
