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
 * {@link UpdateDeliveryChannelRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeliveryChannelRequest</p>
 */
public class UpdateDeliveryChannelRequest extends Request {
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
    private String deliveryChannelAssumeRoleArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelCondition")
    private String deliveryChannelCondition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryChannelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelName")
    private String deliveryChannelName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelTargetArn")
    private String deliveryChannelTargetArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NonCompliantNotification")
    private Boolean nonCompliantNotification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OversizedDataOSSTargetArn")
    private String oversizedDataOSSTargetArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    private UpdateDeliveryChannelRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.configurationItemChangeNotification = builder.configurationItemChangeNotification;
        this.configurationSnapshot = builder.configurationSnapshot;
        this.deliveryChannelAssumeRoleArn = builder.deliveryChannelAssumeRoleArn;
        this.deliveryChannelCondition = builder.deliveryChannelCondition;
        this.deliveryChannelId = builder.deliveryChannelId;
        this.deliveryChannelName = builder.deliveryChannelName;
        this.deliveryChannelTargetArn = builder.deliveryChannelTargetArn;
        this.description = builder.description;
        this.nonCompliantNotification = builder.nonCompliantNotification;
        this.oversizedDataOSSTargetArn = builder.oversizedDataOSSTargetArn;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeliveryChannelRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateDeliveryChannelRequest, Builder> {
        private String clientToken; 
        private Boolean configurationItemChangeNotification; 
        private Boolean configurationSnapshot; 
        private String deliveryChannelAssumeRoleArn; 
        private String deliveryChannelCondition; 
        private String deliveryChannelId; 
        private String deliveryChannelName; 
        private String deliveryChannelTargetArn; 
        private String description; 
        private Boolean nonCompliantNotification; 
        private String oversizedDataOSSTargetArn; 
        private Long status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeliveryChannelRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.configurationItemChangeNotification = request.configurationItemChangeNotification;
            this.configurationSnapshot = request.configurationSnapshot;
            this.deliveryChannelAssumeRoleArn = request.deliveryChannelAssumeRoleArn;
            this.deliveryChannelCondition = request.deliveryChannelCondition;
            this.deliveryChannelId = request.deliveryChannelId;
            this.deliveryChannelName = request.deliveryChannelName;
            this.deliveryChannelTargetArn = request.deliveryChannelTargetArn;
            this.description = request.description;
            this.nonCompliantNotification = request.nonCompliantNotification;
            this.oversizedDataOSSTargetArn = request.oversizedDataOSSTargetArn;
            this.status = request.status;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * <p>The <code>token</code> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a></p>
         * 
         * <strong>example:</strong>
         * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to deliver resource change logs. If the value of this parameter is true, Cloud Config delivers the resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available for delivery channels of the OSS, Log Service, and MNS types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder configurationItemChangeNotification(Boolean configurationItemChangeNotification) {
            this.putBodyParameter("ConfigurationItemChangeNotification", configurationItemChangeNotification);
            this.configurationItemChangeNotification = configurationItemChangeNotification;
            return this;
        }

        /**
         * <p>Specifies whether to deliver scheduled resource snapshots to the OSS bucket. If the value of this parameter is true, the scheduled resource snapshots are delivered to the specified OSS bucket at 00:00:00 and 12:00:00 on a daily basis. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is applicable only to delivery channels of the OSS type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder configurationSnapshot(Boolean configurationSnapshot) {
            this.putBodyParameter("ConfigurationSnapshot", configurationSnapshot);
            this.configurationSnapshot = configurationSnapshot;
            return this;
        }

        /**
         * <p>The ARN of the role that you want to assign to the delivery channel. Specify the ARN in the following format: <code>acs:ram::{accountId}:role/aliyunserviceroleforconfig</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::100931896542****:role/aliyunserviceroleforconfig</p>
         */
        public Builder deliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
            this.putBodyParameter("DeliveryChannelAssumeRoleArn", deliveryChannelAssumeRoleArn);
            this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
            return this;
        }

        /**
         * <p>The rule that is attached to the delivery channel. This parameter is available only for delivery channels of the MNS type.</p>
         * <p>This parameter specifies the lowest risk level and the resource types for the events to which you want to subscribe.</p>
         * <ul>
         * <li><p>The setting of the lowest risk level for the events to which you want to subscribe is in the following format: <code>{&quot;filterType&quot;:&quot;RuleRiskLevel&quot;,&quot;value&quot;:&quot;1&quot;,&quot;multiple&quot;:false}</code>.</p>
         * <p>The <code>value</code> field specifies the lowest risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level. The value 2 indicates the medium risk level. The value 3 indicates the low risk level.</p>
         * </li>
         * <li><p>The setting of the resource types of the events to which you want to subscribe is in the following format: <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
         * <p>The <code>values</code> field specifies the resource types of the events to which you want to subscribe. The value of the field is a JSON array. Examples:</p>
         * </li>
         * </ul>
         * <p><code>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</code></p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</p>
         */
        public Builder deliveryChannelCondition(String deliveryChannelCondition) {
            this.putBodyParameter("DeliveryChannelCondition", deliveryChannelCondition);
            this.deliveryChannelCondition = deliveryChannelCondition;
            return this;
        }

        /**
         * <p>The ID of the delivery channel.</p>
         * <p>For more information about how to obtain the ID of the delivery channel, see <a href="https://help.aliyun.com/document_detail/174466.html">DescribeDeliveryChannels</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cdc-8e45ff4e06a3a8****</p>
         */
        public Builder deliveryChannelId(String deliveryChannelId) {
            this.putBodyParameter("DeliveryChannelId", deliveryChannelId);
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }

        /**
         * <p>The name of the delivery channel.</p>
         * <blockquote>
         * <p>If you do not configure this parameter, this parameter is left empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testoss</p>
         */
        public Builder deliveryChannelName(String deliveryChannelName) {
            this.putBodyParameter("DeliveryChannelName", deliveryChannelName);
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }

        /**
         * <p>The ARN of the delivery destination. Valid values:</p>
         * <ul>
         * <li><code>acs:oss:{RegionId}:{accountId}:{bucketName}</code> if your delivery destination is an OSS bucket. Example: <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>.</li>
         * <li><code>acs:mns:{RegionId}:{accountId}:/topics/{topicName}</code> if your delivery destination is an MNS topic. Example: <code>acs:mns:cn-shanghai:100931896542****:/topics/topic1</code>.</li>
         * <li><code>acs:log:{RegionId}:{accountId}:project/{projectName}/logstore/{logstoreName}</code> if your delivery destination is a Log Service Logstore. Example: <code>acs:log:cn-shanghai:100931896542****:project/project1/logstore/logstore1</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-shanghai:100931896542****:new-bucket</p>
         */
        public Builder deliveryChannelTargetArn(String deliveryChannelTargetArn) {
            this.putBodyParameter("DeliveryChannelTargetArn", deliveryChannelTargetArn);
            this.deliveryChannelTargetArn = deliveryChannelTargetArn;
            return this;
        }

        /**
         * <p>The description of the delivery channel.</p>
         * 
         * <strong>example:</strong>
         * <p>My OSS delivery.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to deliver resource non-compliance events. If the value of this parameter is true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are evaluated as non-compliant. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only for delivery channels of the Log Service or MNS type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder nonCompliantNotification(Boolean nonCompliantNotification) {
            this.putBodyParameter("NonCompliantNotification", nonCompliantNotification);
            this.nonCompliantNotification = nonCompliantNotification;
            return this;
        }

        /**
         * <p>The ARN of the OSS bucket to which you want to transfer the delivery data when the size of the data exceeds the specified upper limit of the delivery channel. Format: <code>acs:oss:{RegionId}:{accountId}:{bucketName}</code>.</p>
         * <p>If you do not configure this parameter, Cloud Config delivers only summary data.</p>
         * <blockquote>
         * <p>This parameter is available only for delivery channels of the Log Service or MNS type. The maximum storage size of delivery channels of the Log Service type is 1 MB, and the maximum storage size of delivery channels of the MNS type is 64 KB.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-shanghai:100931896542****:new-bucket</p>
         */
        public Builder oversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
            this.putBodyParameter("OversizedDataOSSTargetArn", oversizedDataOSSTargetArn);
            this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
            return this;
        }

        /**
         * <p>Specifies whether to enable the delivery channel. Valid values:</p>
         * <ul>
         * <li>0: The delivery channel is disabled for Cloud Config. Cloud Config retains the most recent delivery configuration and stops resource data delivery.</li>
         * <li>1 (default): The delivery channel is enabled for Cloud Config.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Long status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateDeliveryChannelRequest build() {
            return new UpdateDeliveryChannelRequest(this);
        } 

    } 

}
