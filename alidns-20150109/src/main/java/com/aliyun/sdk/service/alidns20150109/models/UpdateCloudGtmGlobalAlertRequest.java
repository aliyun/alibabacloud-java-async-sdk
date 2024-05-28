// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < AlertConfig> alertConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertGroup")
    private java.util.List < String > alertGroup;

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
    public java.util.List < AlertConfig> getAlertConfig() {
        return this.alertConfig;
    }

    /**
     * @return alertGroup
     */
    public java.util.List < String > getAlertGroup() {
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
        private java.util.List < AlertConfig> alertConfig; 
        private java.util.List < String > alertGroup; 
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
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AlertConfig.
         */
        public Builder alertConfig(java.util.List < AlertConfig> alertConfig) {
            String alertConfigShrink = shrink(alertConfig, "AlertConfig", "json");
            this.putQueryParameter("AlertConfig", alertConfigShrink);
            this.alertConfig = alertConfig;
            return this;
        }

        /**
         * AlertGroup.
         */
        public Builder alertGroup(java.util.List < String > alertGroup) {
            String alertGroupShrink = shrink(alertGroup, "AlertGroup", "json");
            this.putQueryParameter("AlertGroup", alertGroupShrink);
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * ClientToken.
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
             * DingtalkNotice.
             */
            public Builder dingtalkNotice(Boolean dingtalkNotice) {
                this.dingtalkNotice = dingtalkNotice;
                return this;
            }

            /**
             * EmailNotice.
             */
            public Builder emailNotice(Boolean emailNotice) {
                this.emailNotice = emailNotice;
                return this;
            }

            /**
             * NoticeType.
             */
            public Builder noticeType(String noticeType) {
                this.noticeType = noticeType;
                return this;
            }

            /**
             * SmsNotice.
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
