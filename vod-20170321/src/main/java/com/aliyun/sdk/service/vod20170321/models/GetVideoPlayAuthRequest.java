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
    @com.aliyun.core.annotation.NameInMap("ReferenceId")
    private String referenceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    private String videoId;

    private GetVideoPlayAuthRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.authInfoTimeout = builder.authInfoTimeout;
        this.referenceId = builder.referenceId;
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
     * @return referenceId
     */
    public String getReferenceId() {
        return this.referenceId;
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
        private String referenceId; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoPlayAuthRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.authInfoTimeout = request.authInfoTimeout;
            this.referenceId = request.referenceId;
            this.videoId = request.videoId;
        } 

        /**
         * <p>The API version number. Set the value to <strong>1.0.0</strong>.</p>
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
         * <p>The expiration time of the playback credential. Unit: <strong>seconds</strong>. If the credential expires, the playback URL cannot be obtained. You must obtain a new credential.</p>
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
         * <p>The custom ID. Only lowercase letters, uppercase letters, digits, hyphens, and underscores are supported. Length: 6 to 64 characters. The ID is unique per user.</p>
         * 
         * <strong>example:</strong>
         * <p>123-123</p>
         */
        public Builder referenceId(String referenceId) {
            this.putQueryParameter("ReferenceId", referenceId);
            this.referenceId = referenceId;
            return this;
        }

        /**
         * <p>The audio or video ID. Only a single audio or video ID is supported. You can obtain the ID by using the following methods:</p>
         * <ul>
         * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the audio or video ID.</li>
         * <li>When uploading audio or video files by calling the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation, the audio or video ID is the value of the VideoId response parameter.</li>
         * <li>After the audio or video file is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the audio or video ID, which is the value of the VideoId response parameter.</li>
         * </ul>
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
