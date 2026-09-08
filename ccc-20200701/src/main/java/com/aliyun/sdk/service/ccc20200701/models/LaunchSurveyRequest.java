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
 * {@link LaunchSurveyRequest} extends {@link RequestModel}
 *
 * <p>LaunchSurveyRequest</p>
 */
public class LaunchSurveyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactFlowId")
    private String contactFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactFlowVariables")
    private String contactFlowVariables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsMetadataId")
    private String smsMetadataId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SurveyChannel")
    private String surveyChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SurveyTemplateId")
    private String surveyTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SurveyTemplateVariables")
    private String surveyTemplateVariables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private LaunchSurveyRequest(Builder builder) {
        super(builder);
        this.contactFlowId = builder.contactFlowId;
        this.contactFlowVariables = builder.contactFlowVariables;
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.smsMetadataId = builder.smsMetadataId;
        this.surveyChannel = builder.surveyChannel;
        this.surveyTemplateId = builder.surveyTemplateId;
        this.surveyTemplateVariables = builder.surveyTemplateVariables;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LaunchSurveyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactFlowId
     */
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * @return contactFlowVariables
     */
    public String getContactFlowVariables() {
        return this.contactFlowVariables;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return smsMetadataId
     */
    public String getSmsMetadataId() {
        return this.smsMetadataId;
    }

    /**
     * @return surveyChannel
     */
    public String getSurveyChannel() {
        return this.surveyChannel;
    }

    /**
     * @return surveyTemplateId
     */
    public String getSurveyTemplateId() {
        return this.surveyTemplateId;
    }

    /**
     * @return surveyTemplateVariables
     */
    public String getSurveyTemplateVariables() {
        return this.surveyTemplateVariables;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<LaunchSurveyRequest, Builder> {
        private String contactFlowId; 
        private String contactFlowVariables; 
        private String deviceId; 
        private String instanceId; 
        private String jobId; 
        private String smsMetadataId; 
        private String surveyChannel; 
        private String surveyTemplateId; 
        private String surveyTemplateVariables; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(LaunchSurveyRequest request) {
            super(request);
            this.contactFlowId = request.contactFlowId;
            this.contactFlowVariables = request.contactFlowVariables;
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.smsMetadataId = request.smsMetadataId;
            this.surveyChannel = request.surveyChannel;
            this.surveyTemplateId = request.surveyTemplateId;
            this.surveyTemplateVariables = request.surveyTemplateVariables;
            this.userId = request.userId;
        } 

        /**
         * <p>The contact flow ID of the IVR satisfaction survey flow. Ensure that the specified contact flow ID corresponds to an active satisfaction survey flow.</p>
         * 
         * <strong>example:</strong>
         * <p>4685b65a-eb8f-11ec-8ea0-0242ac120002</p>
         */
        public Builder contactFlowId(String contactFlowId) {
            this.putQueryParameter("ContactFlowId", contactFlowId);
            this.contactFlowId = contactFlowId;
            return this;
        }

        /**
         * <p>Variables passed to the contact flow. The variables configured here can be retrieved and used in the IVR flow. The format is a JSON string containing a collection of key-value pairs. This parameter is optional and defaults to empty.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;customerID&quot;: &quot;208880281831****&quot;,
         *       &quot;operateType&quot;: &quot;cipherCode&quot;,
         *       &quot;taskId&quot;: &quot;1234567890&quot;,
         *       &quot;crmOther&quot;: &quot;123&quot;
         * }</p>
         */
        public Builder contactFlowVariables(String contactFlowVariables) {
            this.putQueryParameter("ContactFlowVariables", contactFlowVariables);
            this.contactFlowVariables = contactFlowVariables;
            return this;
        }

        /**
         * <p>Device ID. This parameter has no effect and can be filled with any value.</p>
         * 
         * <strong>example:</strong>
         * <p>device</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>Instance ID.</p>
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
         * <p>The call ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job-6580466654649****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The configuration ID for text message satisfaction. This parameter is required only when the collection channel is SMS. It is optional and defaults to empty.</p>
         * 
         * <strong>example:</strong>
         * <p>4685b65a-eb8f-11ec-8ea0-0242ac120002</p>
         */
        public Builder smsMetadataId(String smsMetadataId) {
            this.putQueryParameter("SmsMetadataId", smsMetadataId);
            this.smsMetadataId = smsMetadataId;
            return this;
        }

        /**
         * <p>The channel for collecting satisfaction feedback. This parameter is optional and defaults to Voice Satisfaction.</p>
         * 
         * <strong>example:</strong>
         * <p>IVR</p>
         */
        public Builder surveyChannel(String surveyChannel) {
            this.putQueryParameter("SurveyChannel", surveyChannel);
            this.surveyChannel = surveyChannel;
            return this;
        }

        /**
         * <p>The ID of the satisfaction survey template.</p>
         * 
         * <strong>example:</strong>
         * <p>19dc793c-9a01-4cb0-b7d5-fcb5431bab6b</p>
         */
        public Builder surveyTemplateId(String surveyTemplateId) {
            this.putQueryParameter("SurveyTemplateId", surveyTemplateId);
            this.surveyTemplateId = surveyTemplateId;
            return this;
        }

        /**
         * <p>Satisfaction survey configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder surveyTemplateVariables(String surveyTemplateVariables) {
            this.putQueryParameter("SurveyTemplateVariables", surveyTemplateVariables);
            this.surveyTemplateVariables = surveyTemplateVariables;
            return this;
        }

        /**
         * <p>The agent ID that initiates the satisfaction survey.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public LaunchSurveyRequest build() {
            return new LaunchSurveyRequest(this);
        } 

    } 

}
