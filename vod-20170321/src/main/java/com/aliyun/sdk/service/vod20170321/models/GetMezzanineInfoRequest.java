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
 * {@link GetMezzanineInfoRequest} extends {@link RequestModel}
 *
 * <p>GetMezzanineInfoRequest</p>
 */
public class GetMezzanineInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionType")
    private String additionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthTimeout")
    private Long authTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputType")
    private String outputType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferenceId")
    private String referenceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    private String videoId;

    private GetMezzanineInfoRequest(Builder builder) {
        super(builder);
        this.additionType = builder.additionType;
        this.authTimeout = builder.authTimeout;
        this.outputType = builder.outputType;
        this.referenceId = builder.referenceId;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMezzanineInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionType
     */
    public String getAdditionType() {
        return this.additionType;
    }

    /**
     * @return authTimeout
     */
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    /**
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
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

    public static final class Builder extends Request.Builder<GetMezzanineInfoRequest, Builder> {
        private String additionType; 
        private Long authTimeout; 
        private String outputType; 
        private String referenceId; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(GetMezzanineInfoRequest request) {
            super(request);
            this.additionType = request.additionType;
            this.authTimeout = request.authTimeout;
            this.outputType = request.outputType;
            this.referenceId = request.referenceId;
            this.videoId = request.videoId;
        } 

        /**
         * <p>The type of additional information. Separate multiple values with commas (,). By default, only basic information is returned. Valid values:</p>
         * <ul>
         * <li><strong>video</strong>: the video stream information.</li>
         * <li><strong>audio</strong>: the audio stream information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder additionType(String additionType) {
            this.putQueryParameter("AdditionType", additionType);
            this.additionType = additionType;
            return this;
        }

        /**
         * <p>The expiration time of the signature for the FileURL (source file URL). Unit: seconds. Default value: <strong>3600</strong>. Minimum value: <strong>1</strong>.</p>
         * <ul>
         * <li>If OutputType is set to <strong>cdn</strong>:<ul>
         * <li>The FileURL expires periodically only if URL authentication is enabled. Otherwise, the FileURL is permanently valid.</li>
         * <li>Minimum value: <strong>1</strong>.</li>
         * <li>Maximum value: unlimited.</li>
         * <li>Default value: <strong>3600</strong> if not specified.</li>
         * </ul>
         * </li>
         * <li>If OutputType is set to <strong>oss</strong>:<ul>
         * <li>The FileURL expires periodically only if the storage permission is set to private. Otherwise, the FileURL is permanently valid.</li>
         * <li>Minimum value: <strong>1</strong>.</li>
         * <li>Maximum value: To reduce security risks of the origin server, the maximum value is <strong>2592000</strong> (30 days) when the audio or video file is stored in an ApsaraVideo VOD bucket, and <strong>129600</strong> (36 hours) when the audio or video file is stored in a user-owned OSS bucket.</li>
         * <li>Default value: <strong>3600</strong> if not specified.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * <p>The output URL type. Valid values:</p>
         * <ul>
         * <li><strong>oss</strong>: the back-to-origin URL.</li>
         * <li><strong>cdn</strong> (default): the accelerated URL.</li>
         * </ul>
         * <blockquote>
         * <p>If the bucket where the source file is stored is of the in type, only the OSS URL is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder outputType(String outputType) {
            this.putQueryParameter("OutputType", outputType);
            this.outputType = outputType;
            return this;
        }

        /**
         * <p>The custom ID. The ID must be 6 to 64 characters in length and can contain only lowercase letters, uppercase letters, digits, hyphens (-), and underscores (_). The ID must be unique per user.</p>
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
         * <p>The audio or video ID. You can obtain the ID by using one of the following methods:</p>
         * <ul>
         * <li>For an audio or video file uploaded in the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Assets</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
         * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">Obtain the upload URL and credential for a video</a> operation to obtain the upload URL and credential, the audio or video ID is the value of the VideoId response parameter.</li>
         * <li>After a video is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">Search media information</a> operation to query the audio or video ID, which is the value of the VideoId response parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1f1a6fc03ca04814031b8a6559e****</p>
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public GetMezzanineInfoRequest build() {
            return new GetMezzanineInfoRequest(this);
        } 

    } 

}
