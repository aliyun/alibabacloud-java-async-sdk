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
 * {@link IdpWeixin2SubConfig} extends {@link TeaModel}
 *
 * <p>IdpWeixin2SubConfig</p>
 */
public class IdpWeixin2SubConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("AppSchema")
    private String appSchema;

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

    private IdpWeixin2SubConfig(Builder builder) {
        this.agentId = builder.agentId;
        this.appSchema = builder.appSchema;
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

    public static IdpWeixin2SubConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return appSchema
     */
    public String getAppSchema() {
        return this.appSchema;
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
        private String agentId; 
        private String appSchema; 
        private String appSecret; 
        private String corpId; 
        private String eventAesKey; 
        private String eventLabel; 
        private String eventVerifyToken; 
        private String redirectUri; 

        private Builder() {
        } 

        private Builder(IdpWeixin2SubConfig model) {
            this.agentId = model.agentId;
            this.appSchema = model.appSchema;
            this.appSecret = model.appSecret;
            this.corpId = model.corpId;
            this.eventAesKey = model.eventAesKey;
            this.eventLabel = model.eventLabel;
            this.eventVerifyToken = model.eventVerifyToken;
            this.redirectUri = model.redirectUri;
        } 

        /**
         * AgentId.
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * AppSchema.
         */
        public Builder appSchema(String appSchema) {
            this.appSchema = appSchema;
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

        public IdpWeixin2SubConfig build() {
            return new IdpWeixin2SubConfig(this);
        } 

    } 

}
