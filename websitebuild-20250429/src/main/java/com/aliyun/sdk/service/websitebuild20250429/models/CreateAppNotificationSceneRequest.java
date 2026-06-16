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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ChannelsJson.
         */
        public Builder channelsJson(String channelsJson) {
            this.putQueryParameter("ChannelsJson", channelsJson);
            this.channelsJson = channelsJson;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EmailFieldsJson.
         */
        public Builder emailFieldsJson(String emailFieldsJson) {
            this.putQueryParameter("EmailFieldsJson", emailFieldsJson);
            this.emailFieldsJson = emailFieldsJson;
            return this;
        }

        /**
         * EmailLimitJson.
         */
        public Builder emailLimitJson(String emailLimitJson) {
            this.putQueryParameter("EmailLimitJson", emailLimitJson);
            this.emailLimitJson = emailLimitJson;
            return this;
        }

        /**
         * EmailRecipientIdsJson.
         */
        public Builder emailRecipientIdsJson(String emailRecipientIdsJson) {
            this.putQueryParameter("EmailRecipientIdsJson", emailRecipientIdsJson);
            this.emailRecipientIdsJson = emailRecipientIdsJson;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PhoneRecipientIdsJson.
         */
        public Builder phoneRecipientIdsJson(String phoneRecipientIdsJson) {
            this.putQueryParameter("PhoneRecipientIdsJson", phoneRecipientIdsJson);
            this.phoneRecipientIdsJson = phoneRecipientIdsJson;
            return this;
        }

        /**
         * SmsFieldsJson.
         */
        public Builder smsFieldsJson(String smsFieldsJson) {
            this.putQueryParameter("SmsFieldsJson", smsFieldsJson);
            this.smsFieldsJson = smsFieldsJson;
            return this;
        }

        /**
         * SmsLimitJson.
         */
        public Builder smsLimitJson(String smsLimitJson) {
            this.putQueryParameter("SmsLimitJson", smsLimitJson);
            this.smsLimitJson = smsLimitJson;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * TriggerEventsJson.
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
