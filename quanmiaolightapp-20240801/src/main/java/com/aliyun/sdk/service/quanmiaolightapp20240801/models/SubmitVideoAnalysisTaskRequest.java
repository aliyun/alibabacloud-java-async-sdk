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
 * {@link SubmitVideoAnalysisTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitVideoAnalysisTaskRequest</p>
 */
public class SubmitVideoAnalysisTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("frameSampleMethod")
    private FrameSampleMethod frameSampleMethod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("generateOptions")
    private java.util.List<String> generateOptions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

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
    @com.aliyun.core.annotation.NameInMap("snapshotInterval")
    private Double snapshotInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("videoExtraInfo")
    private String videoExtraInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("videoModelCustomPromptTemplate")
    private String videoModelCustomPromptTemplate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("videoModelId")
    private String videoModelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("videoRoles")
    private java.util.List<VideoRoles> videoRoles;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("videoUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoUrl;

    private SubmitVideoAnalysisTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.frameSampleMethod = builder.frameSampleMethod;
        this.generateOptions = builder.generateOptions;
        this.language = builder.language;
        this.modelCustomPromptTemplate = builder.modelCustomPromptTemplate;
        this.modelCustomPromptTemplateId = builder.modelCustomPromptTemplateId;
        this.modelId = builder.modelId;
        this.snapshotInterval = builder.snapshotInterval;
        this.videoExtraInfo = builder.videoExtraInfo;
        this.videoModelCustomPromptTemplate = builder.videoModelCustomPromptTemplate;
        this.videoModelId = builder.videoModelId;
        this.videoRoles = builder.videoRoles;
        this.videoUrl = builder.videoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoAnalysisTaskRequest create() {
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
     * @return frameSampleMethod
     */
    public FrameSampleMethod getFrameSampleMethod() {
        return this.frameSampleMethod;
    }

    /**
     * @return generateOptions
     */
    public java.util.List<String> getGenerateOptions() {
        return this.generateOptions;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
     * @return snapshotInterval
     */
    public Double getSnapshotInterval() {
        return this.snapshotInterval;
    }

    /**
     * @return videoExtraInfo
     */
    public String getVideoExtraInfo() {
        return this.videoExtraInfo;
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
     * @return videoRoles
     */
    public java.util.List<VideoRoles> getVideoRoles() {
        return this.videoRoles;
    }

    /**
     * @return videoUrl
     */
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public static final class Builder extends Request.Builder<SubmitVideoAnalysisTaskRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private FrameSampleMethod frameSampleMethod; 
        private java.util.List<String> generateOptions; 
        private String language; 
        private String modelCustomPromptTemplate; 
        private String modelCustomPromptTemplateId; 
        private String modelId; 
        private Double snapshotInterval; 
        private String videoExtraInfo; 
        private String videoModelCustomPromptTemplate; 
        private String videoModelId; 
        private java.util.List<VideoRoles> videoRoles; 
        private String videoUrl; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVideoAnalysisTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.frameSampleMethod = request.frameSampleMethod;
            this.generateOptions = request.generateOptions;
            this.language = request.language;
            this.modelCustomPromptTemplate = request.modelCustomPromptTemplate;
            this.modelCustomPromptTemplateId = request.modelCustomPromptTemplateId;
            this.modelId = request.modelId;
            this.snapshotInterval = request.snapshotInterval;
            this.videoExtraInfo = request.videoExtraInfo;
            this.videoModelCustomPromptTemplate = request.videoModelCustomPromptTemplate;
            this.videoModelId = request.videoModelId;
            this.videoRoles = request.videoRoles;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * frameSampleMethod.
         */
        public Builder frameSampleMethod(FrameSampleMethod frameSampleMethod) {
            String frameSampleMethodShrink = shrink(frameSampleMethod, "frameSampleMethod", "json");
            this.putBodyParameter("frameSampleMethod", frameSampleMethodShrink);
            this.frameSampleMethod = frameSampleMethod;
            return this;
        }

        /**
         * generateOptions.
         */
        public Builder generateOptions(java.util.List<String> generateOptions) {
            String generateOptionsShrink = shrink(generateOptions, "generateOptions", "json");
            this.putBodyParameter("generateOptions", generateOptionsShrink);
            this.generateOptions = generateOptions;
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
         * snapshotInterval.
         */
        public Builder snapshotInterval(Double snapshotInterval) {
            this.putBodyParameter("snapshotInterval", snapshotInterval);
            this.snapshotInterval = snapshotInterval;
            return this;
        }

        /**
         * videoExtraInfo.
         */
        public Builder videoExtraInfo(String videoExtraInfo) {
            this.putBodyParameter("videoExtraInfo", videoExtraInfo);
            this.videoExtraInfo = videoExtraInfo;
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
         * videoRoles.
         */
        public Builder videoRoles(java.util.List<VideoRoles> videoRoles) {
            String videoRolesShrink = shrink(videoRoles, "videoRoles", "json");
            this.putBodyParameter("videoRoles", videoRolesShrink);
            this.videoRoles = videoRoles;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.mp4">http://xxxx.mp4</a></p>
         */
        public Builder videoUrl(String videoUrl) {
            this.putBodyParameter("videoUrl", videoUrl);
            this.videoUrl = videoUrl;
            return this;
        }

        @Override
        public SubmitVideoAnalysisTaskRequest build() {
            return new SubmitVideoAnalysisTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitVideoAnalysisTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitVideoAnalysisTaskRequest</p>
     */
    public static class FrameSampleMethod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("interval")
        private Double interval;

        @com.aliyun.core.annotation.NameInMap("methodName")
        private String methodName;

        @com.aliyun.core.annotation.NameInMap("pixel")
        private Integer pixel;

        private FrameSampleMethod(Builder builder) {
            this.interval = builder.interval;
            this.methodName = builder.methodName;
            this.pixel = builder.pixel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrameSampleMethod create() {
            return builder().build();
        }

        /**
         * @return interval
         */
        public Double getInterval() {
            return this.interval;
        }

        /**
         * @return methodName
         */
        public String getMethodName() {
            return this.methodName;
        }

        /**
         * @return pixel
         */
        public Integer getPixel() {
            return this.pixel;
        }

        public static final class Builder {
            private Double interval; 
            private String methodName; 
            private Integer pixel; 

            /**
             * interval.
             */
            public Builder interval(Double interval) {
                this.interval = interval;
                return this;
            }

            /**
             * methodName.
             */
            public Builder methodName(String methodName) {
                this.methodName = methodName;
                return this;
            }

            /**
             * pixel.
             */
            public Builder pixel(Integer pixel) {
                this.pixel = pixel;
                return this;
            }

            public FrameSampleMethod build() {
                return new FrameSampleMethod(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitVideoAnalysisTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitVideoAnalysisTaskRequest</p>
     */
    public static class VideoRoles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("roleInfo")
        private String roleInfo;

        @com.aliyun.core.annotation.NameInMap("roleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("urls")
        private java.util.List<String> urls;

        private VideoRoles(Builder builder) {
            this.roleInfo = builder.roleInfo;
            this.roleName = builder.roleName;
            this.urls = builder.urls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoRoles create() {
            return builder().build();
        }

        /**
         * @return roleInfo
         */
        public String getRoleInfo() {
            return this.roleInfo;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return urls
         */
        public java.util.List<String> getUrls() {
            return this.urls;
        }

        public static final class Builder {
            private String roleInfo; 
            private String roleName; 
            private java.util.List<String> urls; 

            /**
             * roleInfo.
             */
            public Builder roleInfo(String roleInfo) {
                this.roleInfo = roleInfo;
                return this;
            }

            /**
             * roleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * urls.
             */
            public Builder urls(java.util.List<String> urls) {
                this.urls = urls;
                return this;
            }

            public VideoRoles build() {
                return new VideoRoles(this);
            } 

        } 

    }
}
