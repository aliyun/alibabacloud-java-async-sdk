// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoPlayAuthRequest} extends {@link RequestModel}
 *
 * <p>GetVideoPlayAuthRequest</p>
 */
public class GetVideoPlayAuthRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    private String apiVersion;

    @Query
    @NameInMap("AuthInfoTimeout")
    private Long authInfoTimeout;

    @Query
    @NameInMap("VideoId")
    @Validation(required = true)
    private String videoId;

    private GetVideoPlayAuthRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.authInfoTimeout = builder.authInfoTimeout;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoPlayAuthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return authInfoTimeout
     */
    public Long getAuthInfoTimeout() {
        return this.authInfoTimeout;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<GetVideoPlayAuthRequest, Builder> {
        private String apiVersion; 
        private Long authInfoTimeout; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoPlayAuthRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.authInfoTimeout = request.authInfoTimeout;
            this.videoId = request.videoId;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * AuthInfoTimeout.
         */
        public Builder authInfoTimeout(Long authInfoTimeout) {
            this.putQueryParameter("AuthInfoTimeout", authInfoTimeout);
            this.authInfoTimeout = authInfoTimeout;
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
        public GetVideoPlayAuthRequest build() {
            return new GetVideoPlayAuthRequest(this);
        } 

    } 

}
