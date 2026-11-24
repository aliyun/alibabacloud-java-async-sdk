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
         * <p>The agent ID of the WeCom application.</p>
         * 
         * <strong>example:</strong>
         * <p>1000002</p>
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The schema used to launch the application from the WeCom Android client.</p>
         * 
         * <strong>example:</strong>
         * <p>wwautha1b2c3****</p>
         */
        public Builder appSchema(String appSchema) {
            this.appSchema = appSchema;
            return this;
        }

        /**
         * <p>The secret of the WeCom application.</p>
         * 
         * <strong>example:</strong>
         * <p>s1e2c3r4e5****</p>
         */
        public Builder appSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        /**
         * <p>The WeCom enterprise ID (CorpId).</p>
         * 
         * <strong>example:</strong>
         * <p>wwa1b2c3d4****</p>
         */
        public Builder corpId(String corpId) {
            this.corpId = corpId;
            return this;
        }

        /**
         * <p>The AES encryption key for WeCom event callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p>a1e2s3k4e5****</p>
         */
        public Builder eventAesKey(String eventAesKey) {
            this.eventAesKey = eventAesKey;
            return this;
        }

        /**
         * <p>The label (callback URL) for WeCom event callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://auth.example.com/callback/wework/a1b2">https://auth.example.com/callback/wework/a1b2</a>****</p>
         */
        public Builder eventLabel(String eventLabel) {
            this.eventLabel = eventLabel;
            return this;
        }

        /**
         * <p>The verification token for WeCom event callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p>v1t2o3k4e5****</p>
         */
        public Builder eventVerifyToken(String eventVerifyToken) {
            this.eventVerifyToken = eventVerifyToken;
            return this;
        }

        /**
         * <p>The callback URL for WeCom logon authorization.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://auth.example.com/callback">https://auth.example.com/callback</a></p>
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
