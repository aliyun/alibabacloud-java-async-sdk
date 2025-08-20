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
 * {@link IdpFeishuSubConfig} extends {@link TeaModel}
 *
 * <p>IdpFeishuSubConfig</p>
 */
public class IdpFeishuSubConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

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

    @com.aliyun.core.annotation.NameInMap("RedirectUri")
    private String redirectUri;

    private IdpFeishuSubConfig(Builder builder) {
        this.appId = builder.appId;
        this.appSecret = builder.appSecret;
        this.corpId = builder.corpId;
        this.eventAesKey = builder.eventAesKey;
        this.eventLabel = builder.eventLabel;
        this.eventVerifyToken = builder.eventVerifyToken;
        this.redirectUri = builder.redirectUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IdpFeishuSubConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
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
     * @return redirectUri
     */
    public String getRedirectUri() {
        return this.redirectUri;
    }

    public static final class Builder {
        private String appId; 
        private String appSecret; 
        private String corpId; 
        private String eventAesKey; 
        private String eventLabel; 
        private String eventVerifyToken; 
        private String redirectUri; 

        private Builder() {
        } 

        private Builder(IdpFeishuSubConfig model) {
            this.appId = model.appId;
            this.appSecret = model.appSecret;
            this.corpId = model.corpId;
            this.eventAesKey = model.eventAesKey;
            this.eventLabel = model.eventLabel;
            this.eventVerifyToken = model.eventVerifyToken;
            this.redirectUri = model.redirectUri;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AppSecret.
         */
        public Builder appSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.corpId = corpId;
            return this;
        }

        /**
         * EventAesKey.
         */
        public Builder eventAesKey(String eventAesKey) {
            this.eventAesKey = eventAesKey;
            return this;
        }

        /**
         * EventLabel.
         */
        public Builder eventLabel(String eventLabel) {
            this.eventLabel = eventLabel;
            return this;
        }

        /**
         * EventVerifyToken.
         */
        public Builder eventVerifyToken(String eventVerifyToken) {
            this.eventVerifyToken = eventVerifyToken;
            return this;
        }

        /**
         * RedirectUri.
         */
        public Builder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        public IdpFeishuSubConfig build() {
            return new IdpFeishuSubConfig(this);
        } 

    } 

}
