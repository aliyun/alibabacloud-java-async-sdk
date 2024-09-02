// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunVideoAnalysisRequest} extends {@link RequestModel}
 *
 * <p>RunVideoAnalysisRequest</p>
 */
public class RunVideoAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("generateOptions")
    private java.util.List < String > generateOptions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelCustomPromptTemplate")
    private String modelCustomPromptTemplate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelCustomPromptTemplateId")
    private String modelCustomPromptTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("originalSessionId")
    private String originalSessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("videoModelCustomPromptTemplate")
    private String videoModelCustomPromptTemplate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("videoModelId")
    private String videoModelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("videoUrl")
    private String videoUrl;

    private RunVideoAnalysisRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.generateOptions = builder.generateOptions;
        this.modelCustomPromptTemplate = builder.modelCustomPromptTemplate;
        this.modelCustomPromptTemplateId = builder.modelCustomPromptTemplateId;
        this.modelId = builder.modelId;
        this.originalSessionId = builder.originalSessionId;
        this.taskId = builder.taskId;
        this.videoModelCustomPromptTemplate = builder.videoModelCustomPromptTemplate;
        this.videoModelId = builder.videoModelId;
        this.videoUrl = builder.videoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunVideoAnalysisRequest create() {
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
     * @return generateOptions
     */
    public java.util.List < String > getGenerateOptions() {
        return this.generateOptions;
    }

    /**
     * @return modelCustomPromptTemplate
     */
    public String getModelCustomPromptTemplate() {
        return this.modelCustomPromptTemplate;
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
     * @return originalSessionId
     */
    public String getOriginalSessionId() {
        return this.originalSessionId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return videoModelCustomPromptTemplate
     */
    public String getVideoModelCustomPromptTemplate() {
        return this.videoModelCustomPromptTemplate;
    }

    /**
     * @return videoModelId
     */
    public String getVideoModelId() {
        return this.videoModelId;
    }

    /**
     * @return videoUrl
     */
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public static final class Builder extends Request.Builder<RunVideoAnalysisRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private java.util.List < String > generateOptions; 
        private String modelCustomPromptTemplate; 
        private String modelCustomPromptTemplateId; 
        private String modelId; 
        private String originalSessionId; 
        private String taskId; 
        private String videoModelCustomPromptTemplate; 
        private String videoModelId; 
        private String videoUrl; 

        private Builder() {
            super();
        } 

        private Builder(RunVideoAnalysisRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.generateOptions = request.generateOptions;
            this.modelCustomPromptTemplate = request.modelCustomPromptTemplate;
            this.modelCustomPromptTemplateId = request.modelCustomPromptTemplateId;
            this.modelId = request.modelId;
            this.originalSessionId = request.originalSessionId;
            this.taskId = request.taskId;
            this.videoModelCustomPromptTemplate = request.videoModelCustomPromptTemplate;
            this.videoModelId = request.videoModelId;
            this.videoUrl = request.videoUrl;
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
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * generateOptions.
         */
        public Builder generateOptions(java.util.List < String > generateOptions) {
            String generateOptionsShrink = shrink(generateOptions, "generateOptions", "json");
            this.putBodyParameter("generateOptions", generateOptionsShrink);
            this.generateOptions = generateOptions;
            return this;
        }

        /**
         * modelCustomPromptTemplate.
         */
        public Builder modelCustomPromptTemplate(String modelCustomPromptTemplate) {
            this.putBodyParameter("modelCustomPromptTemplate", modelCustomPromptTemplate);
            this.modelCustomPromptTemplate = modelCustomPromptTemplate;
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
         * originalSessionId.
         */
        public Builder originalSessionId(String originalSessionId) {
            this.putBodyParameter("originalSessionId", originalSessionId);
            this.originalSessionId = originalSessionId;
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
         * videoModelCustomPromptTemplate.
         */
        public Builder videoModelCustomPromptTemplate(String videoModelCustomPromptTemplate) {
            this.putBodyParameter("videoModelCustomPromptTemplate", videoModelCustomPromptTemplate);
            this.videoModelCustomPromptTemplate = videoModelCustomPromptTemplate;
            return this;
        }

        /**
         * videoModelId.
         */
        public Builder videoModelId(String videoModelId) {
            this.putBodyParameter("videoModelId", videoModelId);
            this.videoModelId = videoModelId;
            return this;
        }

        /**
         * videoUrl.
         */
        public Builder videoUrl(String videoUrl) {
            this.putBodyParameter("videoUrl", videoUrl);
            this.videoUrl = videoUrl;
            return this;
        }

        @Override
        public RunVideoAnalysisRequest build() {
            return new RunVideoAnalysisRequest(this);
        } 

    } 

}
