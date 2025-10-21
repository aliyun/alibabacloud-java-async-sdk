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
 * {@link RunVideoDetectShotRequest} extends {@link RequestModel}
 *
 * <p>RunVideoDetectShotRequest</p>
 */
public class RunVideoDetectShotRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("intelliSimpPrompt")
    private String intelliSimpPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("intelliSimpPromptTemplateId")
    private String intelliSimpPromptTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelCustomPromptTemplateId")
    private String modelCustomPromptTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelVlCustomPromptTemplateId")
    private String modelVlCustomPromptTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("options")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("originalSessionId")
    private String originalSessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("preModelId")
    private String preModelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recognitionOptions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> recognitionOptions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("videoUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vlPrompt")
    private String vlPrompt;

    private RunVideoDetectShotRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.intelliSimpPrompt = builder.intelliSimpPrompt;
        this.intelliSimpPromptTemplateId = builder.intelliSimpPromptTemplateId;
        this.language = builder.language;
        this.modelCustomPromptTemplateId = builder.modelCustomPromptTemplateId;
        this.modelId = builder.modelId;
        this.modelVlCustomPromptTemplateId = builder.modelVlCustomPromptTemplateId;
        this.options = builder.options;
        this.originalSessionId = builder.originalSessionId;
        this.preModelId = builder.preModelId;
        this.prompt = builder.prompt;
        this.recognitionOptions = builder.recognitionOptions;
        this.taskId = builder.taskId;
        this.videoUrl = builder.videoUrl;
        this.vlPrompt = builder.vlPrompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunVideoDetectShotRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return intelliSimpPrompt
     */
    public String getIntelliSimpPrompt() {
        return this.intelliSimpPrompt;
    }

    /**
     * @return intelliSimpPromptTemplateId
     */
    public String getIntelliSimpPromptTemplateId() {
        return this.intelliSimpPromptTemplateId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return modelCustomPromptTemplateId
     */
    public String getModelCustomPromptTemplateId() {
        return this.modelCustomPromptTemplateId;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return modelVlCustomPromptTemplateId
     */
    public String getModelVlCustomPromptTemplateId() {
        return this.modelVlCustomPromptTemplateId;
    }

    /**
     * @return options
     */
    public java.util.List<String> getOptions() {
        return this.options;
    }

    /**
     * @return originalSessionId
     */
    public String getOriginalSessionId() {
        return this.originalSessionId;
    }

    /**
     * @return preModelId
     */
    public String getPreModelId() {
        return this.preModelId;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return recognitionOptions
     */
    public java.util.List<String> getRecognitionOptions() {
        return this.recognitionOptions;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return videoUrl
     */
    public String getVideoUrl() {
        return this.videoUrl;
    }

    /**
     * @return vlPrompt
     */
    public String getVlPrompt() {
        return this.vlPrompt;
    }

    public static final class Builder extends Request.Builder<RunVideoDetectShotRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String intelliSimpPrompt; 
        private String intelliSimpPromptTemplateId; 
        private String language; 
        private String modelCustomPromptTemplateId; 
        private String modelId; 
        private String modelVlCustomPromptTemplateId; 
        private java.util.List<String> options; 
        private String originalSessionId; 
        private String preModelId; 
        private String prompt; 
        private java.util.List<String> recognitionOptions; 
        private String taskId; 
        private String videoUrl; 
        private String vlPrompt; 

        private Builder() {
            super();
        } 

        private Builder(RunVideoDetectShotRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.intelliSimpPrompt = request.intelliSimpPrompt;
            this.intelliSimpPromptTemplateId = request.intelliSimpPromptTemplateId;
            this.language = request.language;
            this.modelCustomPromptTemplateId = request.modelCustomPromptTemplateId;
            this.modelId = request.modelId;
            this.modelVlCustomPromptTemplateId = request.modelVlCustomPromptTemplateId;
            this.options = request.options;
            this.originalSessionId = request.originalSessionId;
            this.preModelId = request.preModelId;
            this.prompt = request.prompt;
            this.recognitionOptions = request.recognitionOptions;
            this.taskId = request.taskId;
            this.videoUrl = request.videoUrl;
            this.vlPrompt = request.vlPrompt;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * intelliSimpPrompt.
         */
        public Builder intelliSimpPrompt(String intelliSimpPrompt) {
            this.putBodyParameter("intelliSimpPrompt", intelliSimpPrompt);
            this.intelliSimpPrompt = intelliSimpPrompt;
            return this;
        }

        /**
         * intelliSimpPromptTemplateId.
         */
        public Builder intelliSimpPromptTemplateId(String intelliSimpPromptTemplateId) {
            this.putBodyParameter("intelliSimpPromptTemplateId", intelliSimpPromptTemplateId);
            this.intelliSimpPromptTemplateId = intelliSimpPromptTemplateId;
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
         * modelCustomPromptTemplateId.
         */
        public Builder modelCustomPromptTemplateId(String modelCustomPromptTemplateId) {
            this.putBodyParameter("modelCustomPromptTemplateId", modelCustomPromptTemplateId);
            this.modelCustomPromptTemplateId = modelCustomPromptTemplateId;
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
         * modelVlCustomPromptTemplateId.
         */
        public Builder modelVlCustomPromptTemplateId(String modelVlCustomPromptTemplateId) {
            this.putBodyParameter("modelVlCustomPromptTemplateId", modelVlCustomPromptTemplateId);
            this.modelVlCustomPromptTemplateId = modelVlCustomPromptTemplateId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder options(java.util.List<String> options) {
            String optionsShrink = shrink(options, "options", "json");
            this.putBodyParameter("options", optionsShrink);
            this.options = options;
            return this;
        }

        /**
         * originalSessionId.
         */
        public Builder originalSessionId(String originalSessionId) {
            this.putBodyParameter("originalSessionId", originalSessionId);
            this.originalSessionId = originalSessionId;
            return this;
        }

        /**
         * preModelId.
         */
        public Builder preModelId(String preModelId) {
            this.putBodyParameter("preModelId", preModelId);
            this.preModelId = preModelId;
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
         * <p>This parameter is required.</p>
         */
        public Builder recognitionOptions(java.util.List<String> recognitionOptions) {
            String recognitionOptionsShrink = shrink(recognitionOptions, "recognitionOptions", "json");
            this.putBodyParameter("recognitionOptions", recognitionOptionsShrink);
            this.recognitionOptions = recognitionOptions;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.mp4">https://xxx.mp4</a></p>
         */
        public Builder videoUrl(String videoUrl) {
            this.putBodyParameter("videoUrl", videoUrl);
            this.videoUrl = videoUrl;
            return this;
        }

        /**
         * vlPrompt.
         */
        public Builder vlPrompt(String vlPrompt) {
            this.putBodyParameter("vlPrompt", vlPrompt);
            this.vlPrompt = vlPrompt;
            return this;
        }

        @Override
        public RunVideoDetectShotRequest build() {
            return new RunVideoDetectShotRequest(this);
        } 

    } 

}
