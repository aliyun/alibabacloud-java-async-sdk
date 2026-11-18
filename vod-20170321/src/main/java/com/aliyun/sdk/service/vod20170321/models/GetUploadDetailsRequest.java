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
 * {@link GetUploadDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetUploadDetailsRequest</p>
 */
public class GetUploadDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    private GetUploadDetailsRequest(Builder builder) {
        super(builder);
        this.mediaIds = builder.mediaIds;
        this.mediaType = builder.mediaType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadDetailsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    public static final class Builder extends Request.Builder<GetUploadDetailsRequest, Builder> {
        private String mediaIds; 
        private String mediaType; 

        private Builder() {
            super();
        } 

        private Builder(GetUploadDetailsRequest request) {
            super(request);
            this.mediaIds = request.mediaIds;
            this.mediaType = request.mediaType;
        } 

        /**
         * <p>The media IDs, which are the audio or video IDs (VideoId). Separate multiple IDs with commas (,). You can specify up to 20 IDs. You can obtain the IDs by using one of the following methods:</p>
         * <ul>
         * <li>For audio or video files uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Library</strong> &gt; <strong>Audio and Video</strong> to view the audio or video IDs.</li>
         * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">Create upload URLs and credentials for audio and video files</a> operation to obtain the upload URL and credential, the value of the VideoId response parameter is the media ID.</li>
         * <li>After an audio or video file is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">Search for media information</a> operation to query the media ID. The value of the VideoId response parameter is the media ID.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>61ccbdb06fa83012be4d8083f6****,7d2fbc380b0e08e55f****</p>
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        /**
         * <p>The media type. Set the value to <strong>video</strong>, which indicates audio and video files.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        @Override
        public GetUploadDetailsRequest build() {
            return new GetUploadDetailsRequest(this);
        } 

    } 

}
