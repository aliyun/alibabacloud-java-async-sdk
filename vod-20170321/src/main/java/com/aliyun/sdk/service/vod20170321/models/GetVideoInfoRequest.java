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
 * {@link GetVideoInfoRequest} extends {@link RequestModel}
 *
 * <p>GetVideoInfoRequest</p>
 */
public class GetVideoInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferenceId")
    private String referenceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    private String videoId;

    private GetVideoInfoRequest(Builder builder) {
        super(builder);
        this.referenceId = builder.referenceId;
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

    public static final class Builder extends Request.Builder<GetVideoInfoRequest, Builder> {
        private String referenceId; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoInfoRequest request) {
            super(request);
            this.referenceId = request.referenceId;
            this.videoId = request.videoId;
        } 

        /**
         * <p>The custom ID. The ID must be 6 to 64 characters in length and can contain only lowercase letters, uppercase letters, digits, hyphens, and underscores. The ID must be unique per user.</p>
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
         * <p>The audio or video ID. Only one audio or video ID is supported. You can obtain the ID by using one of the following methods:</p>
         * <ul>
         * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Assets</strong> &gt; <strong>Audio/Video</strong> to view the audio or video ID.</li>
         * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to obtain the upload URL and credential, the audio or video ID is the value of the VideoId response parameter.</li>
         * <li>After the audio or video file is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the audio or video ID, which is the value of the VideoId response parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>9b73864d75f1d231e9001cd5f8****</p>
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
