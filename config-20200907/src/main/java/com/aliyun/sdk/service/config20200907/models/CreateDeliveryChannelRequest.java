// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeliveryChannelRequest} extends {@link RequestModel}
 *
 * <p>CreateDeliveryChannelRequest</p>
 */
public class CreateDeliveryChannelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigurationItemChangeNotification")
    private Boolean configurationItemChangeNotification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigurationSnapshot")
    private Boolean configurationSnapshot;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelAssumeRoleArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryChannelAssumeRoleArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelCondition")
    private String deliveryChannelCondition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelName")
    private String deliveryChannelName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelTargetArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryChannelTargetArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryChannelType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NonCompliantNotification")
    private Boolean nonCompliantNotification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OversizedDataOSSTargetArn")
    private String oversizedDataOSSTargetArn;

    private CreateDeliveryChannelRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.configurationItemChangeNotification = builder.configurationItemChangeNotification;
        this.configurationSnapshot = builder.configurationSnapshot;
        this.deliveryChannelAssumeRoleArn = builder.deliveryChannelAssumeRoleArn;
        this.deliveryChannelCondition = builder.deliveryChannelCondition;
        this.deliveryChannelName = builder.deliveryChannelName;
        this.deliveryChannelTargetArn = builder.deliveryChannelTargetArn;
        this.deliveryChannelType = builder.deliveryChannelType;
        this.description = builder.description;
        this.nonCompliantNotification = builder.nonCompliantNotification;
        this.oversizedDataOSSTargetArn = builder.oversizedDataOSSTargetArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeliveryChannelRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDeliveryChannelRequest, Builder> {
        private String clientToken; 
        private Boolean configurationItemChangeNotification; 
        private Boolean configurationSnapshot; 
        private String deliveryChannelAssumeRoleArn; 
        private String deliveryChannelCondition; 
        private String deliveryChannelName; 
        private String deliveryChannelTargetArn; 
        private String deliveryChannelType; 
        private String description; 
        private Boolean nonCompliantNotification; 
        private String oversizedDataOSSTargetArn; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeliveryChannelRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.configurationItemChangeNotification = request.configurationItemChangeNotification;
            this.configurationSnapshot = request.configurationSnapshot;
            this.deliveryChannelAssumeRoleArn = request.deliveryChannelAssumeRoleArn;
            this.deliveryChannelCondition = request.deliveryChannelCondition;
            this.deliveryChannelName = request.deliveryChannelName;
            this.deliveryChannelTargetArn = request.deliveryChannelTargetArn;
            this.deliveryChannelType = request.deliveryChannelType;
            this.description = request.description;
            this.nonCompliantNotification = request.nonCompliantNotification;
            this.oversizedDataOSSTargetArn = request.oversizedDataOSSTargetArn;
        } 

        /**
         * The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must ensure that the token is unique among different requests.
         * <p>
         * 
         * The `token` can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to deliver resource change logs to the specified destination. If you set this parameter to true, Cloud Config delivers resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:
         * <p>
         * 
         * *   true
         * *   false (default)
         * 
         * > This parameter is available for delivery channels of the OSS, SLS, and MNS types.
         */
        public Builder configurationItemChangeNotification(Boolean configurationItemChangeNotification) {
            this.putBodyParameter("ConfigurationItemChangeNotification", configurationItemChangeNotification);
            this.configurationItemChangeNotification = configurationItemChangeNotification;
            return this;
        }

        /**
         * Specifies whether to deliver scheduled resource snapshots to the OSS bucket. If the value of this parameter is true, the scheduled resource snapshots are delivered to the specified OSS bucket at 00:00:00 and 12:00:00 on a daily basis. Valid values:
         * <p>
         * 
         * *   true
         * *   false (default)
         * 
         * > This parameter is applicable only to delivery channels of the OSS type.
         */
        public Builder configurationSnapshot(Boolean configurationSnapshot) {
            this.putBodyParameter("ConfigurationSnapshot", configurationSnapshot);
            this.configurationSnapshot = configurationSnapshot;
            return this;
        }

        /**
         * The ARN of the role that you want to assign to the delivery channel. Specify the ARN in the following format: `acs:ram::{accountId}:role/aliyunserviceroleforconfig`.
         */
        public Builder deliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
            this.putBodyParameter("DeliveryChannelAssumeRoleArn", deliveryChannelAssumeRoleArn);
            this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
            return this;
        }

        /**
         * The rule that you want to attach to the delivery channel. This parameter is available only for delivery channels of the MNS type.
         * <p>
         * 
         * This parameter specifies the lowest risk level and the resource types for the events to which you want to subscribe.
         * 
         * *   The setting of the lowest risk level for the events to which you want to subscribe is in the following format: `{"filterType":"RuleRiskLevel","value":"1","multiple":false}`.
         * 
         *     The `value` field indicates the lowest risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.
         * 
         * *   The setting of the resource types of the events to which you want to subscribe is in the following format: `{"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}`.
         * 
         *     The `values` field indicates the resource types of the events to which you want to subscribe. The value of the field is a JSON array. Examples:
         * 
         * `[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}]`
         */
        public Builder deliveryChannelCondition(String deliveryChannelCondition) {
            this.putBodyParameter("DeliveryChannelCondition", deliveryChannelCondition);
            this.deliveryChannelCondition = deliveryChannelCondition;
            return this;
        }

        /**
         * The name of the delivery channel.
         * <p>
         * 
         * > If you do not configure this parameter, this parameter is left empty.
         */
        public Builder deliveryChannelName(String deliveryChannelName) {
            this.putBodyParameter("DeliveryChannelName", deliveryChannelName);
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
            this.putBodyParameter("DeliveryChannelTargetArn", deliveryChannelTargetArn);
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
            this.putBodyParameter("DeliveryChannelType", deliveryChannelType);
            this.deliveryChannelType = deliveryChannelType;
            return this;
        }

        /**
         * The description of the delivery channel.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to deliver resource non-compliance events. If you set this parameter to true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are considered non-compliant. Valid values:
         * <p>
         * 
         * *   true
         * *   false (default)
         * 
         * > This parameter is available only for delivery channels of the SLS or MNS type.
         */
        public Builder nonCompliantNotification(Boolean nonCompliantNotification) {
            this.putBodyParameter("NonCompliantNotification", nonCompliantNotification);
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
            this.putBodyParameter("OversizedDataOSSTargetArn", oversizedDataOSSTargetArn);
            this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
            return this;
        }

        @Override
        public CreateDeliveryChannelRequest build() {
            return new CreateDeliveryChannelRequest(this);
        } 

    } 

}
