// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link PutContactRequest} extends {@link RequestModel}
 *
 * <p>PutContactRequest</p>
 */
public class PutContactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channels")
    private Channels channels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Describe")
    @com.aliyun.core.annotation.Validation(required = true)
    private String describe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
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
         * <p>The name of the alert contact.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * <p>The description of the alert contact.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Instance</p>
         */
        public Builder describe(String describe) {
            this.putQueryParameter("Describe", describe);
            this.describe = describe;
            return this;
        }

        /**
         * <p>The language in which the alert information is displayed. Valid values:</p>
         * <ul>
         * <li>zh-cn: simplified Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, CloudMonitor identifies the language of the alert information based on the region of your Alibaba Cloud account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zh-cn</p>
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

    /**
     * 
     * {@link PutContactRequest} extends {@link TeaModel}
     *
     * <p>PutContactRequest</p>
     */
    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliIM")
        private String aliIM;

        @com.aliyun.core.annotation.NameInMap("DingWebHook")
        private String dingWebHook;

        @com.aliyun.core.annotation.NameInMap("Mail")
        private String mail;

        @com.aliyun.core.annotation.NameInMap("SMS")
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

            private Builder() {
            } 

            private Builder(Channels model) {
                this.aliIM = model.aliIM;
                this.dingWebHook = model.dingWebHook;
                this.mail = model.mail;
                this.SMS = model.SMS;
            } 

            /**
             * <p>The TradeManager ID of the alert contact.</p>
             * <p>Specify at least one of the following alert notification methods: email address and DingTalk chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p>Jim</p>
             */
            public Builder aliIM(String aliIM) {
                this.aliIM = aliIM;
                return this;
            }

            /**
             * <p>The webhook URL of the DingTalk chatbot.</p>
             * <p>Specify at least one of the following alert notification methods: email address and DingTalk chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=7d49515e8ebf21106a80a9cc4bb3d247771305d52fb15d6201234565">https://oapi.dingtalk.com/robot/send?access_token=7d49515e8ebf21106a80a9cc4bb3d247771305d52fb15d6201234565</a>****</p>
             */
            public Builder dingWebHook(String dingWebHook) {
                this.dingWebHook = dingWebHook;
                return this;
            }

            /**
             * <p>The email address. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alert contacts only after the recipient activates the email address.</p>
             * <p>Specify at least one of the following alert notification methods: email address and DingTalk chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
             */
            public Builder mail(String mail) {
                this.mail = mail;
                return this;
            }

            /**
             * <p>The phone number of the alert contact. After you add or modify a phone number, the recipient receives a text message that contains an activation link. The system adds the recipient to the list of alert contacts only after the recipient activates the phone number.</p>
             * <p>Specify at least one of the following alert notification methods: email address and DingTalk chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p>1333333****</p>
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
