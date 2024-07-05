// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the media file, namely, the audio or video ID. You can specify a maximum of 20 IDs. Separate multiple IDs with commas (,). You can use one of the following methods to obtain the audio or video ID:
         * <p>
         * *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, you can view the audio or video ID. Use this method if the audio or video file is uploaded by using the ApsaraVideo VOD console.
         * *   View the value of the VideoId parameter returned by the [CreateUploadVideo](~~55407~~) operation that you called to obtain an upload URL and credential.
         * *   View the value of the VideoId parameter returned by the [SearchMedia](~~86044~~) operation that you called to query media information after the audio or video file is uploaded.
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        /**
         * The type of the media file. Set the value to **video**, which indicates audio and video files.
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
