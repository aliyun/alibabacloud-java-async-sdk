// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutContactRequest} extends {@link RequestModel}
 *
 * <p>PutContactRequest</p>
 */
public class PutContactRequest extends Request {
    @Query
    @NameInMap("Channels")
    private Channels channels;

    @Query
    @NameInMap("ContactName")
    @Validation(required = true)
    private String contactName;

    @Query
    @NameInMap("Describe")
    @Validation(required = true)
    private String describe;

    @Query
    @NameInMap("Lang")
    private String lang;

    private PutContactRequest(Builder builder) {
        super(builder);
        this.channels = builder.channels;
        this.contactName = builder.contactName;
        this.describe = builder.describe;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutContactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channels
     */
    public Channels getChannels() {
        return this.channels;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return describe
     */
    public String getDescribe() {
        return this.describe;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<PutContactRequest, Builder> {
        private Channels channels; 
        private String contactName; 
        private String describe; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(PutContactRequest request) {
            super(request);
            this.channels = request.channels;
            this.contactName = request.contactName;
            this.describe = request.describe;
            this.lang = request.lang;
        } 

        /**
         * Channels.
         */
        public Builder channels(Channels channels) {
            this.putQueryParameter("Channels", channels);
            this.channels = channels;
            return this;
        }

        /**
         * The name of the alert contact.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * The description of the alert contact.
         */
        public Builder describe(String describe) {
            this.putQueryParameter("Describe", describe);
            this.describe = describe;
            return this;
        }

        /**
         * The language in which the alert information is displayed. Valid values:
         * <p>
         * 
         * *   zh-cn: simplified Chinese
         * *   en: English
         * 
         * >  If you do not specify a value for this parameter, Cloud Monitor identifies the language of the alert information based on the region of your Alibaba Cloud account.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public PutContactRequest build() {
            return new PutContactRequest(this);
        } 

    } 

    public static class Channels extends TeaModel {
        @NameInMap("AliIM")
        private String aliIM;

        @NameInMap("DingWebHook")
        private String dingWebHook;

        @NameInMap("Mail")
        private String mail;

        @NameInMap("SMS")
        private String SMS;

        private Channels(Builder builder) {
            this.aliIM = builder.aliIM;
            this.dingWebHook = builder.dingWebHook;
            this.mail = builder.mail;
            this.SMS = builder.SMS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return aliIM
         */
        public String getAliIM() {
            return this.aliIM;
        }

        /**
         * @return dingWebHook
         */
        public String getDingWebHook() {
            return this.dingWebHook;
        }

        /**
         * @return mail
         */
        public String getMail() {
            return this.mail;
        }

        /**
         * @return SMS
         */
        public String getSMS() {
            return this.SMS;
        }

        public static final class Builder {
            private String aliIM; 
            private String dingWebHook; 
            private String mail; 
            private String SMS; 

            /**
             * The TradeManager ID of the alert contact.
             * <p>
             * 
             * Specify at least one of the following alert notification targets: email address or webhook URL of the DingTalk chatbot.
             */
            public Builder aliIM(String aliIM) {
                this.aliIM = aliIM;
                return this;
            }

            /**
             * The webhook URL of the DingTalk chatbot.
             * <p>
             * 
             * Specify at least one of the following alert notification targets: email address or webhook URL of the DingTalk chatbot.
             */
            public Builder dingWebHook(String dingWebHook) {
                this.dingWebHook = dingWebHook;
                return this;
            }

            /**
             * The email address of the alert contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alert contacts only after the recipient activates the email address.
             * <p>
             * 
             * Specify at least one of the following alert notification targets: email address or webhook URL of the DingTalk chatbot.
             */
            public Builder mail(String mail) {
                this.mail = mail;
                return this;
            }

            /**
             * The phone number of the alert contact. After you add or modify a phone number, the recipient receives a text message that contains an activation link. The system adds the recipient to the list of alert contacts only after the recipient activates the phone number.
             * <p>
             * 
             * Specify at least one of the following alert notification targets: email address or webhook URL of the DingTalk chatbot.
             */
            public Builder SMS(String SMS) {
                this.SMS = SMS;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
}
