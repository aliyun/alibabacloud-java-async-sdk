// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVideoPlayAuthRequest} extends {@link RequestModel}
 *
 * <p>GetVideoPlayAuthRequest</p>
 */
public class GetVideoPlayAuthRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiVersion")
    private String apiVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthInfoTimeout")
    private Long authInfoTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The API version. Set the value to <strong>1.0.0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * <p>The validity period of the playback credential. Unit: <strong>seconds</strong>. You cannot obtain the playback URL of a video by using a credential that has expired. A new credential is required.</p>
         * <ul>
         * <li>Default value: <strong>100</strong>.</li>
         * <li>Valid values: <code>[100,3000]</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder authInfoTimeout(Long authInfoTimeout) {
            this.putQueryParameter("AuthInfoTimeout", authInfoTimeout);
            this.authInfoTimeout = authInfoTimeout;
            return this;
        }

        /**
         * <p>The ID of the media file. You can specify only one ID. You can use one of the following methods to obtain the ID of the file:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD</a> console. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, view the ID of the media file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
         * <li>Obtain the value of the VideoId parameter from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation.</li>
         * <li>Obtain the value of the VideoId parameter from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation. This method is applicable to files that have been uploaded.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dfde02284a5c46622a097adaf44a****</p>
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
