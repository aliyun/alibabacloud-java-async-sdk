// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SubmitAICaptionExtractionJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitAICaptionExtractionJobRequest</p>
 */
public class SubmitAICaptionExtractionJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIPipelineId")
    private String AIPipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    private SubmitAICaptionExtractionJobRequest(Builder builder) {
        super(builder);
        this.AIPipelineId = builder.AIPipelineId;
        this.jobConfig = builder.jobConfig;
        this.userData = builder.userData;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAICaptionExtractionJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIPipelineId
     */
    public String getAIPipelineId() {
        return this.AIPipelineId;
    }

    /**
     * @return jobConfig
     */
    public String getJobConfig() {
        return this.jobConfig;
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

    public static final class Builder extends Request.Builder<SubmitAICaptionExtractionJobRequest, Builder> {
        private String AIPipelineId; 
        private String jobConfig; 
        private String userData; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAICaptionExtractionJobRequest request) {
            super(request);
            this.AIPipelineId = request.AIPipelineId;
            this.jobConfig = request.jobConfig;
            this.userData = request.userData;
            this.videoId = request.videoId;
        } 

        /**
         * AIPipelineId.
         */
        public Builder AIPipelineId(String AIPipelineId) {
            this.putQueryParameter("AIPipelineId", AIPipelineId);
            this.AIPipelineId = AIPipelineId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder jobConfig(String jobConfig) {
            this.putQueryParameter("JobConfig", jobConfig);
            this.jobConfig = jobConfig;
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
         * <p>This parameter is required.</p>
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public SubmitAICaptionExtractionJobRequest build() {
            return new SubmitAICaptionExtractionJobRequest(this);
        } 

    } 

}
