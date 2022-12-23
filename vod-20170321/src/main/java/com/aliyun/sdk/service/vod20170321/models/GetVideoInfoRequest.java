// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoInfoRequest} extends {@link RequestModel}
 *
 * <p>GetVideoInfoRequest</p>
 */
public class GetVideoInfoRequest extends Request {
    @Query
    @NameInMap("VideoId")
    @Validation(required = true)
    private String videoId;

    private GetVideoInfoRequest(Builder builder) {
        super(builder);
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<GetVideoInfoRequest, Builder> {
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoInfoRequest request) {
            super(request);
            this.videoId = request.videoId;
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
        public GetVideoInfoRequest build() {
            return new GetVideoInfoRequest(this);
        } 

    } 

}
