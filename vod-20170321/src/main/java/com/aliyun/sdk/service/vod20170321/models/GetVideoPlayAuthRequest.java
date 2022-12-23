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
         * The API version number. Set the value to **1.0.0**.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * The time when the playback credential expires. Unit: **seconds**. You cannot obtain the playback URL of a video by using a credential that has expired. A new credential is required.
         * <p>
         * *   Default value: **100**.
         * *   Valid values: `100 to 3000`.
         */
        public Builder authInfoTimeout(Long authInfoTimeout) {
            this.putQueryParameter("AuthInfoTimeout", authInfoTimeout);
            this.authInfoTimeout = authInfoTimeout;
            return this;
        }

        /**
         * The ID of the audio or video file. You can use one of the following methods to obtain the ID of the file:
         * <p>
         * *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
         * *   Obtain the value of the VideoId parameter when you call the [CreateUploadVideo](~~55407~~) operation to upload files.
         * *   Obtain the value of the VideoId parameter by calling the [SearchMedia](~~86044~~) operation. This method is applicable to files that have been uploaded.
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
