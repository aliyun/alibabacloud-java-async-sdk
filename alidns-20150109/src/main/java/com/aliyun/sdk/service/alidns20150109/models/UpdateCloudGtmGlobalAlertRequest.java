// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link UpdateCloudGtmGlobalAlertRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudGtmGlobalAlertRequest</p>
 */
public class UpdateCloudGtmGlobalAlertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertConfig")
    private java.util.List<AlertConfig> alertConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertGroup")
    private java.util.List<String> alertGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    private UpdateCloudGtmGlobalAlertRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.alertConfig = builder.alertConfig;
        this.alertGroup = builder.alertGroup;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudGtmGlobalAlertRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return alertConfig
     */
    public java.util.List<AlertConfig> getAlertConfig() {
        return this.alertConfig;
    }

    /**
     * @return alertGroup
     */
    public java.util.List<String> getAlertGroup() {
        return this.alertGroup;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateCloudGtmGlobalAlertRequest, Builder> {
        private String acceptLanguage; 
        private java.util.List<AlertConfig> alertConfig; 
        private java.util.List<String> alertGroup; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudGtmGlobalAlertRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.alertConfig = request.alertConfig;
            this.alertGroup = request.alertGroup;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The alert configurations.</p>
         */
        public Builder alertConfig(java.util.List<AlertConfig> alertConfig) {
            String alertConfigShrink = shrink(alertConfig, "AlertConfig", "json");
            this.putQueryParameter("AlertConfig", alertConfigShrink);
            this.alertConfig = alertConfig;
            return this;
        }

        /**
         * <p>The alert contact groups.</p>
         */
        public Builder alertGroup(java.util.List<String> alertGroup) {
            String alertGroupShrink = shrink(alertGroup, "AlertGroup", "json");
            this.putQueryParameter("AlertGroup", alertGroupShrink);
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can specify a custom value for this parameter, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateCloudGtmGlobalAlertRequest build() {
            return new UpdateCloudGtmGlobalAlertRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCloudGtmGlobalAlertRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudGtmGlobalAlertRequest</p>
     */
    public static class AlertConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DingtalkNotice")
        private Boolean dingtalkNotice;

        @com.aliyun.core.annotation.NameInMap("EmailNotice")
        private Boolean emailNotice;

        @com.aliyun.core.annotation.NameInMap("NoticeType")
        private String noticeType;

        @com.aliyun.core.annotation.NameInMap("SmsNotice")
        private Boolean smsNotice;

        private AlertConfig(Builder builder) {
            this.dingtalkNotice = builder.dingtalkNotice;
            this.emailNotice = builder.emailNotice;
            this.noticeType = builder.noticeType;
            this.smsNotice = builder.smsNotice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertConfig create() {
            return builder().build();
        }

        /**
         * @return dingtalkNotice
         */
        public Boolean getDingtalkNotice() {
            return this.dingtalkNotice;
        }

        /**
         * @return emailNotice
         */
        public Boolean getEmailNotice() {
            return this.emailNotice;
        }

        /**
         * @return noticeType
         */
        public String getNoticeType() {
            return this.noticeType;
        }

        /**
         * @return smsNotice
         */
        public Boolean getSmsNotice() {
            return this.smsNotice;
        }

        public static final class Builder {
            private Boolean dingtalkNotice; 
            private Boolean emailNotice; 
            private String noticeType; 
            private Boolean smsNotice; 

            /**
             * <p>Specifies whether to configure DingTalk notifications. Valid values:</p>
             * <ul>
             * <li>true: configures DingTalk notifications. DingTalk notifications are sent when alerts are triggered.</li>
             * <li>false: does not configure DingTalk notifications.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dingtalkNotice(Boolean dingtalkNotice) {
                this.dingtalkNotice = dingtalkNotice;
                return this;
            }

            /**
             * <p>Specifies whether to configure email notifications. Valid values:</p>
             * <ul>
             * <li>true: configures email notifications. Emails are sent when alerts are triggered.</li>
             * <li>false｜null: does not configure email notifications.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder emailNotice(Boolean emailNotice) {
                this.emailNotice = emailNotice;
                return this;
            }

            /**
             * <p>The type of the alert event. Valid values:</p>
             * <ul>
             * <li>addr_alert: The address is unavailable.</li>
             * <li>addr_resume: The address becomes available.</li>
             * <li>addr_pool_unavailable: The address pool is unavailable.</li>
             * <li>addr_pool_available: The address pool becomes available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>addr_alert</p>
             */
            public Builder noticeType(String noticeType) {
                this.noticeType = noticeType;
                return this;
            }

            /**
             * <p>Specifies whether to configure text message notifications. Valid values:</p>
             * <ul>
             * <li>true: configures text message notifications. Text messages are sent when alerts are triggered.</li>
             * <li>false｜null: does not configure text message notifications.</li>
             * </ul>
             * <p>Only the China site (aliyun.com) supports text message notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder smsNotice(Boolean smsNotice) {
                this.smsNotice = smsNotice;
                return this;
            }

            public AlertConfig build() {
                return new AlertConfig(this);
            } 

        } 

    }
}
