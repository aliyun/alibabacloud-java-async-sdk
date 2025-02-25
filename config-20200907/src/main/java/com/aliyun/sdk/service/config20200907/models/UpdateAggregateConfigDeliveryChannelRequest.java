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
 * {@link UpdateAggregateConfigDeliveryChannelRequest} extends {@link RequestModel}
 *
 * <p>UpdateAggregateConfigDeliveryChannelRequest</p>
 */
public class UpdateAggregateConfigDeliveryChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompliantSnapshot")
    private Boolean compliantSnapshot;

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

    private UpdateAggregateConfigDeliveryChannelRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.clientToken = builder.clientToken;
        this.compliantSnapshot = builder.compliantSnapshot;
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

    public static UpdateAggregateConfigDeliveryChannelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<UpdateAggregateConfigDeliveryChannelRequest, Builder> {
        private String aggregatorId; 
        private String clientToken; 
        private Boolean compliantSnapshot; 
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

        private Builder(UpdateAggregateConfigDeliveryChannelRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.clientToken = request.clientToken;
            this.compliantSnapshot = request.compliantSnapshot;
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
         * <p>The ID of the account group.</p>
         * <p>For more information about how to obtain the ID of the account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-a4e5626622af0079****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * <p>The <code>token</code> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a></p>
         * 
         * <strong>example:</strong>
         * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to deliver scheduled compliant snapshots. Cloud Config delivers scheduled compliant snapshots at <code>04:00Z</code> and <code>16:00Z</code> to Log Service every day. The time is displayed in UTC. Valid values:</p>
         * <ul>
         * <li>true: Cloud Config delivers scheduled compliant snapshots.</li>
         * <li>false (default): Cloud Config does not deliver scheduled compliant snapshots.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder compliantSnapshot(Boolean compliantSnapshot) {
            this.putQueryParameter("CompliantSnapshot", compliantSnapshot);
            this.compliantSnapshot = compliantSnapshot;
            return this;
        }

        /**
         * <p>Specifies whether to deliver resource change logs. If you set this parameter to true, Cloud Config delivers resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:</p>
         * <ul>
         * <li>true: Cloud Config delivers resource change logs.</li>
         * <li>false (default): Cloud Config does not deliver resource change logs.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available for delivery channels of the OSS, SLS, and MNS types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder configurationItemChangeNotification(Boolean configurationItemChangeNotification) {
            this.putQueryParameter("ConfigurationItemChangeNotification", configurationItemChangeNotification);
            this.configurationItemChangeNotification = configurationItemChangeNotification;
            return this;
        }

        /**
         * <p>Specifies whether to deliver scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at <code>04:00Z</code> and <code>16:00Z</code> to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:</p>
         * <ul>
         * <li>true: Cloud Config delivers scheduled resource snapshots.</li>
         * <li>false (default): Cloud Config does not deliver scheduled resource snapshots.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder configurationSnapshot(Boolean configurationSnapshot) {
            this.putQueryParameter("ConfigurationSnapshot", configurationSnapshot);
            this.configurationSnapshot = configurationSnapshot;
            return this;
        }

        /**
         * <p>The rule that is attached to the delivery channel. This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.</p>
         * <ul>
         * <li><p>If the value of the DeliveryChannelType parameter is MNS, take note of the following settings of the lowest risk level and resource types of the events to which you subscribed:</p>
         * <ul>
         * <li><p>The lowest risk level of the events to which you want to subscribe is in the following format: <code>{&quot;filterType&quot;:&quot;RuleRiskLevel&quot;,&quot;value&quot;:&quot;1&quot;,&quot;multiple&quot;:false}</code>.</p>
         * <p>The <code>value</code> field indicates the lowest risk level of the events to which you subscribed. Valid values: 1, 2, and 3, where 1 indicates the high risk level, 2 indicates the medium risk level, and 3 indicates the low risk level.</p>
         * </li>
         * <li><p>The setting of the resource types of the events to which you want to subscribe is in the following format: <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
         * <p>The <code>values</code> field indicates the resource types of the events to which you subscribed. The value of the field is a JSON array. Examples:</p>
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
            this.putQueryParameter("DeliveryChannelCondition", deliveryChannelCondition);
            this.deliveryChannelCondition = deliveryChannelCondition;
            return this;
        }

        /**
         * <p>The ID of the delivery channel.</p>
         * <p>For more information about how to obtain the ID of a delivery channel, see <a href="https://help.aliyun.com/document_detail/429842.html">ListAggregateConfigDeliveryChannels</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cdc-8e45ff4e06a3a8****</p>
         */
        public Builder deliveryChannelId(String deliveryChannelId) {
            this.putQueryParameter("DeliveryChannelId", deliveryChannelId);
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }

        /**
         * <p>The name of the delivery channel.</p>
         * 
         * <strong>example:</strong>
         * <p>testoss</p>
         */
        public Builder deliveryChannelName(String deliveryChannelName) {
            this.putQueryParameter("DeliveryChannelName", deliveryChannelName);
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
            this.putQueryParameter("DeliveryChannelTargetArn", deliveryChannelTargetArn);
            this.deliveryChannelTargetArn = deliveryChannelTargetArn;
            return this;
        }

        /**
         * <p>The time when Cloud Config delivers scheduled resources snapshots every day.</p>
         * <p>Format: <code>HH:mmZ</code>. This time is displayed in UTC.</p>
         * <blockquote>
         * <p>When you enable the scheduled resource delivery feature, you can specify a custom delivery time for this parameter. If you do not configure this parameter, Cloud Config automatically delivers scheduled resource snapshots at <code>04:00Z</code> and <code>16:00Z</code> every day.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>09:10Z</p>
         */
        public Builder deliverySnapshotTime(String deliverySnapshotTime) {
            this.putQueryParameter("DeliverySnapshotTime", deliverySnapshotTime);
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
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to deliver resource non-compliance events. If you set this parameter to true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are considered non-compliant. Valid values:</p>
         * <ul>
         * <li>true: Cloud Config delivers resource non-compliance events.</li>
         * <li>false (default): Cloud Config does not deliver resource non-compliance events.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only for delivery channels of the SLS or MNS type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder nonCompliantNotification(Boolean nonCompliantNotification) {
            this.putQueryParameter("NonCompliantNotification", nonCompliantNotification);
            this.nonCompliantNotification = nonCompliantNotification;
            return this;
        }

        /**
         * <p>The ARN of the OSS bucket to which the delivered data is transferred when the size of the data exceeds the specified upper limit of the delivery channel. Format: <code>acs:oss:{RegionId}:{accountId}:{bucketName}</code>.</p>
         * <p>If you do not configure this parameter, Cloud Config delivers only summary data.</p>
         * <blockquote>
         * <p>This parameter is available only for delivery channels of the SLS or MNS type. The upper limit on the storage size of delivery channels of the SLS type is 1 MB, and the upper limit on the storage size of delivery channels of the MNS type is 64 KB.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-shanghai:100931896542****:new-bucket</p>
         */
        public Builder oversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
            this.putQueryParameter("OversizedDataOSSTargetArn", oversizedDataOSSTargetArn);
            this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
            return this;
        }

        /**
         * <p>Specifies whether to enable the delivery channel. Valid values:</p>
         * <ul>
         * <li>0: The delivery channel is disabled. Cloud Config retains the most recent delivery configuration and stops resource data delivery.</li>
         * <li>1 (default): The delivery channel is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Long status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateAggregateConfigDeliveryChannelRequest build() {
            return new UpdateAggregateConfigDeliveryChannelRequest(this);
        } 

    } 

}
