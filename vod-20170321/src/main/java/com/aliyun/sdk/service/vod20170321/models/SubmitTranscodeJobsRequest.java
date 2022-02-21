// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTranscodeJobsRequest} extends {@link RequestModel}
 *
 * <p>SubmitTranscodeJobsRequest</p>
 */
public class SubmitTranscodeJobsRequest extends Request {
    @Query
    @NameInMap("EncryptConfig")
    private String encryptConfig;

    @Query
    @NameInMap("OverrideParams")
    private String overrideParams;

    @Query
    @NameInMap("PipelineId")
    private String pipelineId;

    @Query
    @NameInMap("Priority")
    private String priority;

    @Query
    @NameInMap("TemplateGroupId")
    @Validation(required = true)
    private String templateGroupId;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("VideoId")
    private String videoId;

    private SubmitTranscodeJobsRequest(Builder builder) {
        super(builder);
        this.encryptConfig = builder.encryptConfig;
        this.overrideParams = builder.overrideParams;
        this.pipelineId = builder.pipelineId;
        this.priority = builder.priority;
        this.templateGroupId = builder.templateGroupId;
        this.userData = builder.userData;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTranscodeJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptConfig
     */
    public String getEncryptConfig() {
        return this.encryptConfig;
    }

    /**
     * @return overrideParams
     */
    public String getOverrideParams() {
        return this.overrideParams;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return templateGroupId
     */
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<SubmitTranscodeJobsRequest, Builder> {
        private String encryptConfig; 
        private String overrideParams; 
        private String pipelineId; 
        private String priority; 
        private String templateGroupId; 
        private String userData; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTranscodeJobsRequest response) {
            super(response);
            this.encryptConfig = response.encryptConfig;
            this.overrideParams = response.overrideParams;
            this.pipelineId = response.pipelineId;
            this.priority = response.priority;
            this.templateGroupId = response.templateGroupId;
            this.userData = response.userData;
            this.videoId = response.videoId;
        } 

        /**
         * EncryptConfig.
         */
        public Builder encryptConfig(String encryptConfig) {
            this.putQueryParameter("EncryptConfig", encryptConfig);
            this.encryptConfig = encryptConfig;
            return this;
        }

        /**
         * OverrideParams.
         */
        public Builder overrideParams(String overrideParams) {
            this.putQueryParameter("OverrideParams", overrideParams);
            this.overrideParams = overrideParams;
            return this;
        }

        /**
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * TemplateGroupId.
         */
        public Builder templateGroupId(String templateGroupId) {
            this.putQueryParameter("TemplateGroupId", templateGroupId);
            this.templateGroupId = templateGroupId;
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

        /**
         * VideoId.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public SubmitTranscodeJobsRequest build() {
            return new SubmitTranscodeJobsRequest(this);
        } 

    } 

}
