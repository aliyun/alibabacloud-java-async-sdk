// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link IdpDingtalkSubConfig} extends {@link TeaModel}
 *
 * <p>IdpDingtalkSubConfig</p>
 */
public class IdpDingtalkSubConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.NameInMap("AppSecret")
    private String appSecret;

    @com.aliyun.core.annotation.NameInMap("CorpId")
    private String corpId;

    @com.aliyun.core.annotation.NameInMap("EventAesKey")
    private String eventAesKey;

    @com.aliyun.core.annotation.NameInMap("EventLabel")
    private String eventLabel;

    @com.aliyun.core.annotation.NameInMap("EventVerifyToken")
    private String eventVerifyToken;

    @com.aliyun.core.annotation.NameInMap("Exclusive")
    private Boolean exclusive;

    @com.aliyun.core.annotation.NameInMap("Oauth")
    private Boolean oauth;

    @com.aliyun.core.annotation.NameInMap("RedirectUri")
    private String redirectUri;

    private IdpDingtalkSubConfig(Builder builder) {
        this.appKey = builder.appKey;
        this.appSecret = builder.appSecret;
        this.corpId = builder.corpId;
        this.eventAesKey = builder.eventAesKey;
        this.eventLabel = builder.eventLabel;
        this.eventVerifyToken = builder.eventVerifyToken;
        this.exclusive = builder.exclusive;
        this.oauth = builder.oauth;
        this.redirectUri = builder.redirectUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IdpDingtalkSubConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return appSecret
     */
    public String getAppSecret() {
        return this.appSecret;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return eventAesKey
     */
    public String getEventAesKey() {
        return this.eventAesKey;
    }

    /**
     * @return eventLabel
     */
    public String getEventLabel() {
        return this.eventLabel;
    }

    /**
     * @return eventVerifyToken
     */
    public String getEventVerifyToken() {
        return this.eventVerifyToken;
    }

    /**
     * @return exclusive
     */
    public Boolean getExclusive() {
        return this.exclusive;
    }

    /**
     * @return oauth
     */
    public Boolean getOauth() {
        return this.oauth;
    }

    /**
     * @return redirectUri
     */
    public String getRedirectUri() {
        return this.redirectUri;
    }

    public static final class Builder {
        private String appKey; 
        private String appSecret; 
        private String corpId; 
        private String eventAesKey; 
        private String eventLabel; 
        private String eventVerifyToken; 
        private Boolean exclusive; 
        private Boolean oauth; 
        private String redirectUri; 

        private Builder() {
        } 

        private Builder(IdpDingtalkSubConfig model) {
            this.appKey = model.appKey;
            this.appSecret = model.appSecret;
            this.corpId = model.corpId;
            this.eventAesKey = model.eventAesKey;
            this.eventLabel = model.eventLabel;
            this.eventVerifyToken = model.eventVerifyToken;
            this.exclusive = model.exclusive;
            this.oauth = model.oauth;
            this.redirectUri = model.redirectUri;
        } 

        /**
         * <p>Your application\&quot;s unique identifier. You can get this identifier from the DingTalk Open Platform.</p>
         */
        public Builder appKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>Your application\&quot;s secret key. You can get this key from the DingTalk Open Platform.</p>
         */
        public Builder appSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        /**
         * <p>Your enterprise\&quot;s unique ID in DingTalk.</p>
         */
        public Builder corpId(String corpId) {
            this.corpId = corpId;
            return this;
        }

        /**
         * <p>The AES key used to decrypt the content of event callbacks. This ensures the confidentiality of the event data.</p>
         */
        public Builder eventAesKey(String eventAesKey) {
            this.eventAesKey = eventAesKey;
            return this;
        }

        /**
         * <p>A custom label for event subscriptions. This field is reserved for future use.</p>
         */
        public Builder eventLabel(String eventLabel) {
            this.eventLabel = eventLabel;
            return this;
        }

        /**
         * <p>The token used to verify the authenticity of event callback requests from DingTalk.</p>
         */
        public Builder eventVerifyToken(String eventVerifyToken) {
            this.eventVerifyToken = eventVerifyToken;
            return this;
        }

        /**
         * <p>Specifies whether this identity provider is the exclusive login method. If set to <code>true</code>, other login methods are disabled.</p>
         */
        public Builder exclusive(Boolean exclusive) {
            this.exclusive = exclusive;
            return this;
        }

        /**
         * <p>Specifies whether to enable the OAuth authentication flow.</p>
         */
        public Builder oauth(Boolean oauth) {
            this.oauth = oauth;
            return this;
        }

        /**
         * <p>The URL where the user is redirected after successful authorization. You must register this URL on the DingTalk Open Platform.</p>
         */
        public Builder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        public IdpDingtalkSubConfig build() {
            return new IdpDingtalkSubConfig(this);
        } 

    } 

}
