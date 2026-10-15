// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link CreateAppNotificationSceneRequest} extends {@link RequestModel}
 *
 * <p>CreateAppNotificationSceneRequest</p>
 */
public class CreateAppNotificationSceneRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ButlerChannelTypesJson")
    private String butlerChannelTypesJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ButlerFieldsJson")
    private String butlerFieldsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelsJson")
    private String channelsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmailFieldsJson")
    private String emailFieldsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmailLimitJson")
    private String emailLimitJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmailRecipientIdsJson")
    private String emailRecipientIdsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneRecipientIdsJson")
    private String phoneRecipientIdsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsFieldsJson")
    private String smsFieldsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsLimitJson")
    private String smsLimitJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerEventsJson")
    private String triggerEventsJson;

    private CreateAppNotificationSceneRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.butlerChannelTypesJson = builder.butlerChannelTypesJson;
        this.butlerFieldsJson = builder.butlerFieldsJson;
        this.channelsJson = builder.channelsJson;
        this.description = builder.description;
        this.emailFieldsJson = builder.emailFieldsJson;
        this.emailLimitJson = builder.emailLimitJson;
        this.emailRecipientIdsJson = builder.emailRecipientIdsJson;
        this.name = builder.name;
        this.phoneRecipientIdsJson = builder.phoneRecipientIdsJson;
        this.smsFieldsJson = builder.smsFieldsJson;
        this.smsLimitJson = builder.smsLimitJson;
        this.tableName = builder.tableName;
        this.triggerEventsJson = builder.triggerEventsJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppNotificationSceneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return butlerChannelTypesJson
     */
    public String getButlerChannelTypesJson() {
        return this.butlerChannelTypesJson;
    }

    /**
     * @return butlerFieldsJson
     */
    public String getButlerFieldsJson() {
        return this.butlerFieldsJson;
    }

    /**
     * @return channelsJson
     */
    public String getChannelsJson() {
        return this.channelsJson;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return emailFieldsJson
     */
    public String getEmailFieldsJson() {
        return this.emailFieldsJson;
    }

    /**
     * @return emailLimitJson
     */
    public String getEmailLimitJson() {
        return this.emailLimitJson;
    }

    /**
     * @return emailRecipientIdsJson
     */
    public String getEmailRecipientIdsJson() {
        return this.emailRecipientIdsJson;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phoneRecipientIdsJson
     */
    public String getPhoneRecipientIdsJson() {
        return this.phoneRecipientIdsJson;
    }

    /**
     * @return smsFieldsJson
     */
    public String getSmsFieldsJson() {
        return this.smsFieldsJson;
    }

    /**
     * @return smsLimitJson
     */
    public String getSmsLimitJson() {
        return this.smsLimitJson;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return triggerEventsJson
     */
    public String getTriggerEventsJson() {
        return this.triggerEventsJson;
    }

    public static final class Builder extends Request.Builder<CreateAppNotificationSceneRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String butlerChannelTypesJson; 
        private String butlerFieldsJson; 
        private String channelsJson; 
        private String description; 
        private String emailFieldsJson; 
        private String emailLimitJson; 
        private String emailRecipientIdsJson; 
        private String name; 
        private String phoneRecipientIdsJson; 
        private String smsFieldsJson; 
        private String smsLimitJson; 
        private String tableName; 
        private String triggerEventsJson; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppNotificationSceneRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.butlerChannelTypesJson = request.butlerChannelTypesJson;
            this.butlerFieldsJson = request.butlerFieldsJson;
            this.channelsJson = request.channelsJson;
            this.description = request.description;
            this.emailFieldsJson = request.emailFieldsJson;
            this.emailLimitJson = request.emailLimitJson;
            this.emailRecipientIdsJson = request.emailRecipientIdsJson;
            this.name = request.name;
            this.phoneRecipientIdsJson = request.phoneRecipientIdsJson;
            this.smsFieldsJson = request.smsFieldsJson;
            this.smsLimitJson = request.smsLimitJson;
            this.tableName = request.tableName;
            this.triggerEventsJson = request.triggerEventsJson;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The list of mobile butler delivery platform types in a JSON string array. Valid values: wechat, dingtalk, wecom, and feishu.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;feishu&quot;]</p>
         */
        public Builder butlerChannelTypesJson(String butlerChannelTypesJson) {
            this.putQueryParameter("ButlerChannelTypesJson", butlerChannelTypesJson);
            this.butlerChannelTypesJson = butlerChannelTypesJson;
            return this;
        }

        /**
         * <p>The list of mobile butler notification fields in a JSON string array. This parameter is required when the butler channel is selected. A maximum of 10 fields are supported. The butler fields in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;id&quot;,&quot;phone&quot;,&quot;name&quot;,&quot;city&quot;,&quot;message&quot;,&quot;is_deleted&quot;,&quot;updated_at&quot;,&quot;created_at&quot;,&quot;status&quot;,&quot;budget&quot;]</p>
         */
        public Builder butlerFieldsJson(String butlerFieldsJson) {
            this.putQueryParameter("ButlerFieldsJson", butlerFieldsJson);
            this.butlerFieldsJson = butlerFieldsJson;
            return this;
        }

        /**
         * <p>The notification channels in a JSON array string, such as [&quot;sms&quot;,&quot;email&quot;].</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sms&quot;,&quot;email&quot;]</p>
         */
        public Builder channelsJson(String channelsJson) {
            this.putQueryParameter("ChannelsJson", channelsJson);
            this.channelsJson = channelsJson;
            return this;
        }

        /**
         * <p>The description of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>cn_graph_prod</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The email notification fields in a JSON array string. A maximum of 10 fields are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder emailFieldsJson(String emailFieldsJson) {
            this.putQueryParameter("EmailFieldsJson", emailFieldsJson);
            this.emailFieldsJson = emailFieldsJson;
            return this;
        }

        /**
         * <p>The email sending limit in a JSON string, including the minInterval and dailyLimit fields.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder emailLimitJson(String emailLimitJson) {
            this.putQueryParameter("EmailLimitJson", emailLimitJson);
            this.emailLimitJson = emailLimitJson;
            return this;
        }

        /**
         * <p>The list of email recipient IDs in a JSON array string.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder emailRecipientIdsJson(String emailRecipientIdsJson) {
            this.putQueryParameter("EmailRecipientIdsJson", emailRecipientIdsJson);
            this.emailRecipientIdsJson = emailRecipientIdsJson;
            return this;
        }

        /**
         * <p>The name of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>Device Capability Manual</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of SMS recipient IDs in a JSON array string.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder phoneRecipientIdsJson(String phoneRecipientIdsJson) {
            this.putQueryParameter("PhoneRecipientIdsJson", phoneRecipientIdsJson);
            this.phoneRecipientIdsJson = phoneRecipientIdsJson;
            return this;
        }

        /**
         * <p>The SMS notification fields in a JSON array string. A maximum of 3 fields are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder smsFieldsJson(String smsFieldsJson) {
            this.putQueryParameter("SmsFieldsJson", smsFieldsJson);
            this.smsFieldsJson = smsFieldsJson;
            return this;
        }

        /**
         * <p>The SMS sending limit in a JSON string, including the minInterval and dailyLimit fields.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder smsLimitJson(String smsLimitJson) {
            this.putQueryParameter("SmsLimitJson", smsLimitJson);
            this.smsLimitJson = smsLimitJson;
            return this;
        }

        /**
         * <p>The name of the monitored data table.</p>
         * 
         * <strong>example:</strong>
         * <p>default.ai_advertising_material_rec_train_v1103</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The trigger events in a JSON array string, such as [&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;].</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;]</p>
         */
        public Builder triggerEventsJson(String triggerEventsJson) {
            this.putQueryParameter("TriggerEventsJson", triggerEventsJson);
            this.triggerEventsJson = triggerEventsJson;
            return this;
        }

        @Override
        public CreateAppNotificationSceneRequest build() {
            return new CreateAppNotificationSceneRequest(this);
        } 

    } 

}
