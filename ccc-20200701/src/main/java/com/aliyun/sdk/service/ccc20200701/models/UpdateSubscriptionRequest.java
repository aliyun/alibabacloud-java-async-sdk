// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link UpdateSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateSubscriptionRequest</p>
 */
public class UpdateSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessPoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunUid")
    private Long aliyunUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultTopic")
    private String defaultTopic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventSubscriptionsJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventSubscriptionsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MqInstanceId")
    private String mqInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MqType")
    private String mqType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProducerId")
    private String producerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private UpdateSubscriptionRequest(Builder builder) {
        super(builder);
        this.accessPoint = builder.accessPoint;
        this.aliyunUid = builder.aliyunUid;
        this.defaultTopic = builder.defaultTopic;
        this.eventSubscriptionsJson = builder.eventSubscriptionsJson;
        this.instanceId = builder.instanceId;
        this.mqInstanceId = builder.mqInstanceId;
        this.mqType = builder.mqType;
        this.password = builder.password;
        this.producerId = builder.producerId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubscriptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPoint
     */
    public String getAccessPoint() {
        return this.accessPoint;
    }

    /**
     * @return aliyunUid
     */
    public Long getAliyunUid() {
        return this.aliyunUid;
    }

    /**
     * @return defaultTopic
     */
    public String getDefaultTopic() {
        return this.defaultTopic;
    }

    /**
     * @return eventSubscriptionsJson
     */
    public String getEventSubscriptionsJson() {
        return this.eventSubscriptionsJson;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mqInstanceId
     */
    public String getMqInstanceId() {
        return this.mqInstanceId;
    }

    /**
     * @return mqType
     */
    public String getMqType() {
        return this.mqType;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return producerId
     */
    public String getProducerId() {
        return this.producerId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<UpdateSubscriptionRequest, Builder> {
        private String accessPoint; 
        private Long aliyunUid; 
        private String defaultTopic; 
        private String eventSubscriptionsJson; 
        private String instanceId; 
        private String mqInstanceId; 
        private String mqType; 
        private String password; 
        private String producerId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSubscriptionRequest request) {
            super(request);
            this.accessPoint = request.accessPoint;
            this.aliyunUid = request.aliyunUid;
            this.defaultTopic = request.defaultTopic;
            this.eventSubscriptionsJson = request.eventSubscriptionsJson;
            this.instanceId = request.instanceId;
            this.mqInstanceId = request.mqInstanceId;
            this.mqType = request.mqType;
            this.password = request.password;
            this.producerId = request.producerId;
            this.username = request.username;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-****.cn-shanghai.rmq.aliyuncs.com:8080</p>
         */
        public Builder accessPoint(String accessPoint) {
            this.putQueryParameter("AccessPoint", accessPoint);
            this.accessPoint = accessPoint;
            return this;
        }

        /**
         * AliyunUid.
         */
        public Builder aliyunUid(Long aliyunUid) {
            this.putQueryParameter("AliyunUid", aliyunUid);
            this.aliyunUid = aliyunUid;
            return this;
        }

        /**
         * DefaultTopic.
         */
        public Builder defaultTopic(String defaultTopic) {
            this.putQueryParameter("DefaultTopic", defaultTopic);
            this.defaultTopic = defaultTopic;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name &quot;:&quot;StopConsultant &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;QueueingRerouted &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;IvrTracking &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;DualTrackRecordingReady &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;SatisfactionSurveyResponse &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Dialing &quot;,&quot;Disabled &quot;:false},{&quot;Name &quot;:&quot;Abandoned &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;QueueingCancelled &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;RecordingReady &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;StopCoach &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Established &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;InitiateConsultant &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Route2IVR &quot;,&quot;Disabled &quot;:false},{&quot;Name &quot;:&quot;Retrieved &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;CampaignPaused &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;TextStream &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentRelease &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;VoicemailReady &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Released &quot;,&quot;Disabled &quot;:false},{&quot;Name &quot;:&quot;CDRReady &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;CaseAttempted &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentBreak &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentRingingTimeout &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentReady &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;CampaignResumed &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentDialing &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Ringing &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;StartConsultant &quot;,&quot;Disabled &quot;:false},{&quot;Name &quot;:&quot;QueueingTimeout &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentTalk &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentRinging &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;StartMonitor &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;BlindTransfer &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Intercept &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;RingingTimeout &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;StartConference &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;QueueingOverflow &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;BargeIn &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;StopConference &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentCheckOut &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;CampaignSubmitted &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentCheckIn &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Enqueue &quot;,&quot;Disabled &quot;:false},{&quot;Name &quot;:&quot;AttendedTransfer &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;StopMonitor &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;DispatchingFailure &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;SatisfactionSurveyOffer &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;CampaignCompleted &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;CampaignAborted &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AssignAgent &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Held &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;StartCoach &quot;,&quot;Disabled &quot;:true}]</p>
         */
        public Builder eventSubscriptionsJson(String eventSubscriptionsJson) {
            this.putQueryParameter("EventSubscriptionsJson", eventSubscriptionsJson);
            this.eventSubscriptionsJson = eventSubscriptionsJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MqInstanceId.
         */
        public Builder mqInstanceId(String mqInstanceId) {
            this.putQueryParameter("MqInstanceId", mqInstanceId);
            this.mqInstanceId = mqInstanceId;
            return this;
        }

        /**
         * MqType.
         */
        public Builder mqType(String mqType) {
            this.putQueryParameter("MqType", mqType);
            this.mqType = mqType;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * ProducerId.
         */
        public Builder producerId(String producerId) {
            this.putQueryParameter("ProducerId", producerId);
            this.producerId = producerId;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public UpdateSubscriptionRequest build() {
            return new UpdateSubscriptionRequest(this);
        } 

    } 

}
