// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
         * <p>The ID of the media file, namely, the audio or video ID. You can specify a maximum of 20 IDs. Separate multiple IDs with commas (,). You can use one of the following methods to obtain the audio or video ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD</a> console. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, you can view the audio or video ID. Use this method if the audio or video file is uploaded by using the ApsaraVideo VOD console.</li>
         * <li>View the value of the VideoId parameter returned by the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you called to obtain an upload URL and credential.</li>
         * <li>View the value of the VideoId parameter returned by the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation that you called to query media information after the audio or video file is uploaded.</li>
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
         * <p>The type of the media file. Set the value to <strong>video</strong>, which indicates audio and video files.</p>
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
