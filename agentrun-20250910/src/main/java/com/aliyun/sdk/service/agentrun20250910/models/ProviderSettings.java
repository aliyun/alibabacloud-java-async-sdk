// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ProviderSettings} extends {@link TeaModel}
 *
 * <p>ProviderSettings</p>
 */
public class ProviderSettings extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("baseUrl")
    private String baseUrl;

    @com.aliyun.core.annotation.NameInMap("modelNames")
    private java.util.List<String> modelNames;

    private ProviderSettings(Builder builder) {
        this.apiKey = builder.apiKey;
        this.baseUrl = builder.baseUrl;
        this.modelNames = builder.modelNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProviderSettings create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return baseUrl
     */
    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * @return modelNames
     */
    public java.util.List<String> getModelNames() {
        return this.modelNames;
    }

    public static final class Builder {
        private String apiKey; 
        private String baseUrl; 
        private java.util.List<String> modelNames; 

        private Builder() {
        } 

        private Builder(ProviderSettings model) {
            this.apiKey = model.apiKey;
            this.baseUrl = model.baseUrl;
            this.modelNames = model.modelNames;
        } 

        /**
         * apiKey.
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * baseUrl.
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * modelNames.
         */
        public Builder modelNames(java.util.List<String> modelNames) {
            this.modelNames = modelNames;
            return this;
        }

        public ProviderSettings build() {
            return new ProviderSettings(this);
        } 

    } 

}
