// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link UpdateModelProviderTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelProviderTemplateRequest</p>
 */
public class UpdateModelProviderTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private Config config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableWuyingProxy")
    private Boolean enableWuyingProxy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String providerTemplateId;

    private UpdateModelProviderTemplateRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.description = builder.description;
        this.enableWuyingProxy = builder.enableWuyingProxy;
        this.name = builder.name;
        this.providerTemplateId = builder.providerTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelProviderTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableWuyingProxy
     */
    public Boolean getEnableWuyingProxy() {
        return this.enableWuyingProxy;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return providerTemplateId
     */
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

    public static final class Builder extends Request.Builder<UpdateModelProviderTemplateRequest, Builder> {
        private Config config; 
        private String description; 
        private Boolean enableWuyingProxy; 
        private String name; 
        private String providerTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelProviderTemplateRequest request) {
            super(request);
            this.config = request.config;
            this.description = request.description;
            this.enableWuyingProxy = request.enableWuyingProxy;
            this.name = request.name;
            this.providerTemplateId = request.providerTemplateId;
        } 

        /**
         * Config.
         */
        public Builder config(Config config) {
            String configShrink = shrink(config, "Config", "json");
            this.putQueryParameter("Config", configShrink);
            this.config = config;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnableWuyingProxy.
         */
        public Builder enableWuyingProxy(Boolean enableWuyingProxy) {
            this.putBodyParameter("EnableWuyingProxy", enableWuyingProxy);
            this.enableWuyingProxy = enableWuyingProxy;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mpt-xxxx</p>
         */
        public Builder providerTemplateId(String providerTemplateId) {
            this.putBodyParameter("ProviderTemplateId", providerTemplateId);
            this.providerTemplateId = providerTemplateId;
            return this;
        }

        @Override
        public UpdateModelProviderTemplateRequest build() {
            return new UpdateModelProviderTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateModelProviderTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelProviderTemplateRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("ApiType")
        private String apiType;

        @com.aliyun.core.annotation.NameInMap("BaseUrl")
        private String baseUrl;

        private Config(Builder builder) {
            this.apiKey = builder.apiKey;
            this.apiType = builder.apiType;
            this.baseUrl = builder.baseUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return apiType
         */
        public String getApiType() {
            return this.apiType;
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public static final class Builder {
            private String apiKey; 
            private String apiType; 
            private String baseUrl; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.apiKey = model.apiKey;
                this.apiType = model.apiType;
                this.baseUrl = model.baseUrl;
            } 

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * ApiType.
             */
            public Builder apiType(String apiType) {
                this.apiType = apiType;
                return this;
            }

            /**
             * BaseUrl.
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
