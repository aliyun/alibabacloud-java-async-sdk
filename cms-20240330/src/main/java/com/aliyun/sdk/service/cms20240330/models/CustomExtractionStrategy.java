// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CustomExtractionStrategy} extends {@link TeaModel}
 *
 * <p>CustomExtractionStrategy</p>
 */
public class CustomExtractionStrategy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("extractionPrompt")
    private String extractionPrompt;

    @com.aliyun.core.annotation.NameInMap("strategyName")
    private String strategyName;

    @com.aliyun.core.annotation.NameInMap("strategyType")
    private String strategyType;

    @com.aliyun.core.annotation.NameInMap("updatePrompt")
    private String updatePrompt;

    private CustomExtractionStrategy(Builder builder) {
        this.description = builder.description;
        this.extractionPrompt = builder.extractionPrompt;
        this.strategyName = builder.strategyName;
        this.strategyType = builder.strategyType;
        this.updatePrompt = builder.updatePrompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomExtractionStrategy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return extractionPrompt
     */
    public String getExtractionPrompt() {
        return this.extractionPrompt;
    }

    /**
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    /**
     * @return strategyType
     */
    public String getStrategyType() {
        return this.strategyType;
    }

    /**
     * @return updatePrompt
     */
    public String getUpdatePrompt() {
        return this.updatePrompt;
    }

    public static final class Builder {
        private String description; 
        private String extractionPrompt; 
        private String strategyName; 
        private String strategyType; 
        private String updatePrompt; 

        private Builder() {
        } 

        private Builder(CustomExtractionStrategy model) {
            this.description = model.description;
            this.extractionPrompt = model.extractionPrompt;
            this.strategyName = model.strategyName;
            this.strategyType = model.strategyType;
            this.updatePrompt = model.updatePrompt;
        } 

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Extraction prompt</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder extractionPrompt(String extractionPrompt) {
            this.extractionPrompt = extractionPrompt;
            return this;
        }

        /**
         * <p>Policy Name</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder strategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }

        /**
         * <p>Policy type. Supports &quot;Episodic&quot;, &quot;Summary&quot;, and &quot;Fact&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>Fact</p>
         */
        public Builder strategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }

        /**
         * <p>Update prompt</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder updatePrompt(String updatePrompt) {
            this.updatePrompt = updatePrompt;
            return this;
        }

        public CustomExtractionStrategy build() {
            return new CustomExtractionStrategy(this);
        } 

    } 

}
