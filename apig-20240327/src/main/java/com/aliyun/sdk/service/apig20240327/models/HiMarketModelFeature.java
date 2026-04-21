// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HiMarketModelFeature} extends {@link TeaModel}
 *
 * <p>HiMarketModelFeature</p>
 */
public class HiMarketModelFeature extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enableMultiModal")
    private Boolean enableMultiModal;

    @com.aliyun.core.annotation.NameInMap("enableThinking")
    private Boolean enableThinking;

    @com.aliyun.core.annotation.NameInMap("maxTokens")
    private Integer maxTokens;

    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.NameInMap("streaming")
    private Boolean streaming;

    @com.aliyun.core.annotation.NameInMap("temperature")
    private Float temperature;

    @com.aliyun.core.annotation.NameInMap("webSearch")
    private Boolean webSearch;

    private HiMarketModelFeature(Builder builder) {
        this.enableMultiModal = builder.enableMultiModal;
        this.enableThinking = builder.enableThinking;
        this.maxTokens = builder.maxTokens;
        this.model = builder.model;
        this.streaming = builder.streaming;
        this.temperature = builder.temperature;
        this.webSearch = builder.webSearch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketModelFeature create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableMultiModal
     */
    public Boolean getEnableMultiModal() {
        return this.enableMultiModal;
    }

    /**
     * @return enableThinking
     */
    public Boolean getEnableThinking() {
        return this.enableThinking;
    }

    /**
     * @return maxTokens
     */
    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return streaming
     */
    public Boolean getStreaming() {
        return this.streaming;
    }

    /**
     * @return temperature
     */
    public Float getTemperature() {
        return this.temperature;
    }

    /**
     * @return webSearch
     */
    public Boolean getWebSearch() {
        return this.webSearch;
    }

    public static final class Builder {
        private Boolean enableMultiModal; 
        private Boolean enableThinking; 
        private Integer maxTokens; 
        private String model; 
        private Boolean streaming; 
        private Float temperature; 
        private Boolean webSearch; 

        private Builder() {
        } 

        private Builder(HiMarketModelFeature model) {
            this.enableMultiModal = model.enableMultiModal;
            this.enableThinking = model.enableThinking;
            this.maxTokens = model.maxTokens;
            this.model = model.model;
            this.streaming = model.streaming;
            this.temperature = model.temperature;
            this.webSearch = model.webSearch;
        } 

        /**
         * enableMultiModal.
         */
        public Builder enableMultiModal(Boolean enableMultiModal) {
            this.enableMultiModal = enableMultiModal;
            return this;
        }

        /**
         * enableThinking.
         */
        public Builder enableThinking(Boolean enableThinking) {
            this.enableThinking = enableThinking;
            return this;
        }

        /**
         * maxTokens.
         */
        public Builder maxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }

        /**
         * model.
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * streaming.
         */
        public Builder streaming(Boolean streaming) {
            this.streaming = streaming;
            return this;
        }

        /**
         * temperature.
         */
        public Builder temperature(Float temperature) {
            this.temperature = temperature;
            return this;
        }

        /**
         * webSearch.
         */
        public Builder webSearch(Boolean webSearch) {
            this.webSearch = webSearch;
            return this;
        }

        public HiMarketModelFeature build() {
            return new HiMarketModelFeature(this);
        } 

    } 

}
