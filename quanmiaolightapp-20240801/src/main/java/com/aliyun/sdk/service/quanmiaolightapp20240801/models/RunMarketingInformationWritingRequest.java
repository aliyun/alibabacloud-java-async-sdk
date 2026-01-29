// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link RunMarketingInformationWritingRequest} extends {@link RequestModel}
 *
 * <p>RunMarketingInformationWritingRequest</p>
 */
public class RunMarketingInformationWritingRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customLimitation")
    private String customLimitation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customPrompt")
    private String customPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extParameters")
    private java.util.Map<String, String> extParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("generateCount")
    private String generateCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("inputExample")
    private String inputExample;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keywords")
    private String keywords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("otherRequirements")
    private String otherRequirements;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputExample")
    private String outputExample;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceMaterial")
    private String sourceMaterial;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wordCountRange")
    private String wordCountRange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("writingType")
    private String writingType;

    private RunMarketingInformationWritingRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.apiKey = builder.apiKey;
        this.customLimitation = builder.customLimitation;
        this.customPrompt = builder.customPrompt;
        this.extParameters = builder.extParameters;
        this.generateCount = builder.generateCount;
        this.inputExample = builder.inputExample;
        this.keywords = builder.keywords;
        this.language = builder.language;
        this.modelId = builder.modelId;
        this.otherRequirements = builder.otherRequirements;
        this.outputExample = builder.outputExample;
        this.prompt = builder.prompt;
        this.sourceMaterial = builder.sourceMaterial;
        this.wordCountRange = builder.wordCountRange;
        this.writingType = builder.writingType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunMarketingInformationWritingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return customLimitation
     */
    public String getCustomLimitation() {
        return this.customLimitation;
    }

    /**
     * @return customPrompt
     */
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    /**
     * @return extParameters
     */
    public java.util.Map<String, String> getExtParameters() {
        return this.extParameters;
    }

    /**
     * @return generateCount
     */
    public String getGenerateCount() {
        return this.generateCount;
    }

    /**
     * @return inputExample
     */
    public String getInputExample() {
        return this.inputExample;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return otherRequirements
     */
    public String getOtherRequirements() {
        return this.otherRequirements;
    }

    /**
     * @return outputExample
     */
    public String getOutputExample() {
        return this.outputExample;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return sourceMaterial
     */
    public String getSourceMaterial() {
        return this.sourceMaterial;
    }

    /**
     * @return wordCountRange
     */
    public String getWordCountRange() {
        return this.wordCountRange;
    }

    /**
     * @return writingType
     */
    public String getWritingType() {
        return this.writingType;
    }

    public static final class Builder extends Request.Builder<RunMarketingInformationWritingRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private String apiKey; 
        private String customLimitation; 
        private String customPrompt; 
        private java.util.Map<String, String> extParameters; 
        private String generateCount; 
        private String inputExample; 
        private String keywords; 
        private String language; 
        private String modelId; 
        private String otherRequirements; 
        private String outputExample; 
        private String prompt; 
        private String sourceMaterial; 
        private String wordCountRange; 
        private String writingType; 

        private Builder() {
            super();
        } 

        private Builder(RunMarketingInformationWritingRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.apiKey = request.apiKey;
            this.customLimitation = request.customLimitation;
            this.customPrompt = request.customPrompt;
            this.extParameters = request.extParameters;
            this.generateCount = request.generateCount;
            this.inputExample = request.inputExample;
            this.keywords = request.keywords;
            this.language = request.language;
            this.modelId = request.modelId;
            this.otherRequirements = request.otherRequirements;
            this.outputExample = request.outputExample;
            this.prompt = request.prompt;
            this.sourceMaterial = request.sourceMaterial;
            this.wordCountRange = request.wordCountRange;
            this.writingType = request.writingType;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * apiKey.
         */
        public Builder apiKey(String apiKey) {
            this.putBodyParameter("apiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * customLimitation.
         */
        public Builder customLimitation(String customLimitation) {
            this.putBodyParameter("customLimitation", customLimitation);
            this.customLimitation = customLimitation;
            return this;
        }

        /**
         * customPrompt.
         */
        public Builder customPrompt(String customPrompt) {
            this.putBodyParameter("customPrompt", customPrompt);
            this.customPrompt = customPrompt;
            return this;
        }

        /**
         * extParameters.
         */
        public Builder extParameters(java.util.Map<String, String> extParameters) {
            String extParametersShrink = shrink(extParameters, "extParameters", "json");
            this.putBodyParameter("extParameters", extParametersShrink);
            this.extParameters = extParameters;
            return this;
        }

        /**
         * generateCount.
         */
        public Builder generateCount(String generateCount) {
            this.putBodyParameter("generateCount", generateCount);
            this.generateCount = generateCount;
            return this;
        }

        /**
         * inputExample.
         */
        public Builder inputExample(String inputExample) {
            this.putBodyParameter("inputExample", inputExample);
            this.inputExample = inputExample;
            return this;
        }

        /**
         * keywords.
         */
        public Builder keywords(String keywords) {
            this.putBodyParameter("keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * language.
         */
        public Builder language(String language) {
            this.putBodyParameter("language", language);
            this.language = language;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * otherRequirements.
         */
        public Builder otherRequirements(String otherRequirements) {
            this.putBodyParameter("otherRequirements", otherRequirements);
            this.otherRequirements = otherRequirements;
            return this;
        }

        /**
         * outputExample.
         */
        public Builder outputExample(String outputExample) {
            this.putBodyParameter("outputExample", outputExample);
            this.outputExample = outputExample;
            return this;
        }

        /**
         * prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * sourceMaterial.
         */
        public Builder sourceMaterial(String sourceMaterial) {
            this.putBodyParameter("sourceMaterial", sourceMaterial);
            this.sourceMaterial = sourceMaterial;
            return this;
        }

        /**
         * wordCountRange.
         */
        public Builder wordCountRange(String wordCountRange) {
            this.putBodyParameter("wordCountRange", wordCountRange);
            this.wordCountRange = wordCountRange;
            return this;
        }

        /**
         * writingType.
         */
        public Builder writingType(String writingType) {
            this.putBodyParameter("writingType", writingType);
            this.writingType = writingType;
            return this;
        }

        @Override
        public RunMarketingInformationWritingRequest build() {
            return new RunMarketingInformationWritingRequest(this);
        } 

    } 

}
