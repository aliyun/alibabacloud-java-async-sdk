// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitMediaProducingJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitMediaProducingJobRequest</p>
 */
public class SubmitMediaProducingJobRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClipsParam")
    private String clipsParam;

    @Query
    @NameInMap("EditingProduceConfig")
    private String editingProduceConfig;

    @Query
    @NameInMap("MediaMetadata")
    private String mediaMetadata;

    @Query
    @NameInMap("OutputMediaConfig")
    @Validation(required = true)
    private String outputMediaConfig;

    @Query
    @NameInMap("OutputMediaTarget")
    private String outputMediaTarget;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Query
    @NameInMap("ProjectMetadata")
    private String projectMetadata;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("Timeline")
    private String timeline;

    @Query
    @NameInMap("UserData")
    private String userData;

    private SubmitMediaProducingJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.clipsParam = builder.clipsParam;
        this.editingProduceConfig = builder.editingProduceConfig;
        this.mediaMetadata = builder.mediaMetadata;
        this.outputMediaConfig = builder.outputMediaConfig;
        this.outputMediaTarget = builder.outputMediaTarget;
        this.projectId = builder.projectId;
        this.projectMetadata = builder.projectMetadata;
        this.source = builder.source;
        this.templateId = builder.templateId;
        this.timeline = builder.timeline;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitMediaProducingJobRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clipsParam
     */
    public String getClipsParam() {
        return this.clipsParam;
    }

    /**
     * @return editingProduceConfig
     */
    public String getEditingProduceConfig() {
        return this.editingProduceConfig;
    }

    /**
     * @return mediaMetadata
     */
    public String getMediaMetadata() {
        return this.mediaMetadata;
    }

    /**
     * @return outputMediaConfig
     */
    public String getOutputMediaConfig() {
        return this.outputMediaConfig;
    }

    /**
     * @return outputMediaTarget
     */
    public String getOutputMediaTarget() {
        return this.outputMediaTarget;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectMetadata
     */
    public String getProjectMetadata() {
        return this.projectMetadata;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return timeline
     */
    public String getTimeline() {
        return this.timeline;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitMediaProducingJobRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String clipsParam; 
        private String editingProduceConfig; 
        private String mediaMetadata; 
        private String outputMediaConfig; 
        private String outputMediaTarget; 
        private String projectId; 
        private String projectMetadata; 
        private String source; 
        private String templateId; 
        private String timeline; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitMediaProducingJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.clipsParam = request.clipsParam;
            this.editingProduceConfig = request.editingProduceConfig;
            this.mediaMetadata = request.mediaMetadata;
            this.outputMediaConfig = request.outputMediaConfig;
            this.outputMediaTarget = request.outputMediaTarget;
            this.projectId = request.projectId;
            this.projectMetadata = request.projectMetadata;
            this.source = request.source;
            this.templateId = request.templateId;
            this.timeline = request.timeline;
            this.userData = request.userData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ClipsParam.
         */
        public Builder clipsParam(String clipsParam) {
            this.putQueryParameter("ClipsParam", clipsParam);
            this.clipsParam = clipsParam;
            return this;
        }

        /**
         * EditingProduceConfig.
         */
        public Builder editingProduceConfig(String editingProduceConfig) {
            this.putQueryParameter("EditingProduceConfig", editingProduceConfig);
            this.editingProduceConfig = editingProduceConfig;
            return this;
        }

        /**
         * MediaMetadata.
         */
        public Builder mediaMetadata(String mediaMetadata) {
            this.putQueryParameter("MediaMetadata", mediaMetadata);
            this.mediaMetadata = mediaMetadata;
            return this;
        }

        /**
         * OutputMediaConfig.
         */
        public Builder outputMediaConfig(String outputMediaConfig) {
            this.putQueryParameter("OutputMediaConfig", outputMediaConfig);
            this.outputMediaConfig = outputMediaConfig;
            return this;
        }

        /**
         * OutputMediaTarget.
         */
        public Builder outputMediaTarget(String outputMediaTarget) {
            this.putQueryParameter("OutputMediaTarget", outputMediaTarget);
            this.outputMediaTarget = outputMediaTarget;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectMetadata.
         */
        public Builder projectMetadata(String projectMetadata) {
            this.putQueryParameter("ProjectMetadata", projectMetadata);
            this.projectMetadata = projectMetadata;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * Timeline.
         */
        public Builder timeline(String timeline) {
            this.putQueryParameter("Timeline", timeline);
            this.timeline = timeline;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitMediaProducingJobRequest build() {
            return new SubmitMediaProducingJobRequest(this);
        } 

    } 

}
