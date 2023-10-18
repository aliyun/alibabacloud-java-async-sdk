// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitPreprocessJobsRequest} extends {@link RequestModel}
 *
 * <p>SubmitPreprocessJobsRequest</p>
 */
public class SubmitPreprocessJobsRequest extends Request {
    @Query
    @NameInMap("PreprocessType")
    @Validation(required = true)
    private String preprocessType;

    @Query
    @NameInMap("VideoId")
    @Validation(required = true)
    private String videoId;

    private SubmitPreprocessJobsRequest(Builder builder) {
        super(builder);
        this.preprocessType = builder.preprocessType;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitPreprocessJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return preprocessType
     */
    public String getPreprocessType() {
        return this.preprocessType;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<SubmitPreprocessJobsRequest, Builder> {
        private String preprocessType; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitPreprocessJobsRequest request) {
            super(request);
            this.preprocessType = request.preprocessType;
            this.videoId = request.videoId;
        } 

        /**
         * The preprocessing type. Set the value to **LivePreprocess**, which indicates that the video is preprocessed in the production studio.
         */
        public Builder preprocessType(String preprocessType) {
            this.putQueryParameter("PreprocessType", preprocessType);
            this.preprocessType = preprocessType;
            return this;
        }

        /**
         * The ID of the video.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public SubmitPreprocessJobsRequest build() {
            return new SubmitPreprocessJobsRequest(this);
        } 

    } 

}
