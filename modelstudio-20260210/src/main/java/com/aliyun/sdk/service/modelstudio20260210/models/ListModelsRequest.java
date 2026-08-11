// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link ListModelsRequest} extends {@link RequestModel}
 *
 * <p>ListModelsRequest</p>
 */
public class ListModelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("capabilities")
    private java.util.List<String> capabilities;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contextWindow")
    private Long contextWindow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("features")
    private java.util.List<String> features;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("providers")
    private java.util.List<String> providers;

    private ListModelsRequest(Builder builder) {
        super(builder);
        this.capabilities = builder.capabilities;
        this.contextWindow = builder.contextWindow;
        this.features = builder.features;
        this.language = builder.language;
        this.maxResults = builder.maxResults;
        this.model = builder.model;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.providers = builder.providers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capabilities
     */
    public java.util.List<String> getCapabilities() {
        return this.capabilities;
    }

    /**
     * @return contextWindow
     */
    public Long getContextWindow() {
        return this.contextWindow;
    }

    /**
     * @return features
     */
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return providers
     */
    public java.util.List<String> getProviders() {
        return this.providers;
    }

    public static final class Builder extends Request.Builder<ListModelsRequest, Builder> {
        private java.util.List<String> capabilities; 
        private Long contextWindow; 
        private java.util.List<String> features; 
        private String language; 
        private Long maxResults; 
        private String model; 
        private String name; 
        private String nextToken; 
        private java.util.List<String> providers; 

        private Builder() {
            super();
        } 

        private Builder(ListModelsRequest request) {
            super(request);
            this.capabilities = request.capabilities;
            this.contextWindow = request.contextWindow;
            this.features = request.features;
            this.language = request.language;
            this.maxResults = request.maxResults;
            this.model = request.model;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.providers = request.providers;
        } 

        /**
         * capabilities.
         */
        public Builder capabilities(java.util.List<String> capabilities) {
            String capabilitiesShrink = shrink(capabilities, "capabilities", "json");
            this.putQueryParameter("capabilities", capabilitiesShrink);
            this.capabilities = capabilities;
            return this;
        }

        /**
         * contextWindow.
         */
        public Builder contextWindow(Long contextWindow) {
            this.putQueryParameter("contextWindow", contextWindow);
            this.contextWindow = contextWindow;
            return this;
        }

        /**
         * features.
         */
        public Builder features(java.util.List<String> features) {
            String featuresShrink = shrink(features, "features", "json");
            this.putQueryParameter("features", featuresShrink);
            this.features = features;
            return this;
        }

        /**
         * language.
         */
        public Builder language(String language) {
            this.putQueryParameter("language", language);
            this.language = language;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * model.
         */
        public Builder model(String model) {
            this.putQueryParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * providers.
         */
        public Builder providers(java.util.List<String> providers) {
            String providersShrink = shrink(providers, "providers", "json");
            this.putQueryParameter("providers", providersShrink);
            this.providers = providers;
            return this;
        }

        @Override
        public ListModelsRequest build() {
            return new ListModelsRequest(this);
        } 

    } 

}
