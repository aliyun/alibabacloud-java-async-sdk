// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link App} extends {@link TeaModel}
 *
 * <p>App</p>
 */
public class App extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("app_id")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("app_name")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("app_secret")
    private String appSecret;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("logo")
    private String logo;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("redirect_uri")
    private String redirectUri;

    @com.aliyun.core.annotation.NameInMap("scope")
    private java.util.List<String> scope;

    @com.aliyun.core.annotation.NameInMap("stage")
    private String stage;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    private App(Builder builder) {
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.appSecret = builder.appSecret;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.logo = builder.logo;
        this.provider = builder.provider;
        this.redirectUri = builder.redirectUri;
        this.scope = builder.scope;
        this.stage = builder.stage;
        this.type = builder.type;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static App create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appSecret
     */
    public String getAppSecret() {
        return this.appSecret;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return logo
     */
    public String getLogo() {
        return this.logo;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return redirectUri
     */
    public String getRedirectUri() {
        return this.redirectUri;
    }

    /**
     * @return scope
     */
    public java.util.List<String> getScope() {
        return this.scope;
    }

    /**
     * @return stage
     */
    public String getStage() {
        return this.stage;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String appId; 
        private String appName; 
        private String appSecret; 
        private String createdAt; 
        private String description; 
        private String logo; 
        private String provider; 
        private String redirectUri; 
        private java.util.List<String> scope; 
        private String stage; 
        private String type; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(App model) {
            this.appId = model.appId;
            this.appName = model.appName;
            this.appSecret = model.appSecret;
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.logo = model.logo;
            this.provider = model.provider;
            this.redirectUri = model.redirectUri;
            this.scope = model.scope;
            this.stage = model.stage;
            this.type = model.type;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * app_id.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * app_name.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * app_secret.
         */
        public Builder appSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * logo.
         */
        public Builder logo(String logo) {
            this.logo = logo;
            return this;
        }

        /**
         * provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * redirect_uri.
         */
        public Builder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(java.util.List<String> scope) {
            this.scope = scope;
            return this;
        }

        /**
         * stage.
         */
        public Builder stage(String stage) {
            this.stage = stage;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public App build() {
            return new App(this);
        } 

    } 

}
