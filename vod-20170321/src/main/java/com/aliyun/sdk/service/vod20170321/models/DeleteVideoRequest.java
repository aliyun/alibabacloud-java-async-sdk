// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVideoRequest} extends {@link RequestModel}
 *
 * <p>DeleteVideoRequest</p>
 */
public class DeleteVideoRequest extends Request {
    @Query
    @NameInMap("VideoIds")
    @Validation(required = true)
    private String videoIds;

    private DeleteVideoRequest(Builder builder) {
        super(builder);
        this.videoIds = builder.videoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVideoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return videoIds
     */
    public String getVideoIds() {
        return this.videoIds;
    }

    public static final class Builder extends Request.Builder<DeleteVideoRequest, Builder> {
        private String videoIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVideoRequest request) {
            super(request);
            this.videoIds = request.videoIds;
        } 

        /**
         * The list of video IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs can be specified. You can obtain a video ID in one of the following ways:
         * <p>
         * 
         * *   If the video is uploaded by using the [ApsaraVideo VOD console](https://vod.console.aliyun.com), log on to the console and choose **Media Files** > **Audio/Video** to view the ID of the video.
         * *   If the video is uploaded by calling the [CreateUploadVideo](~~55407~~) operation, the video ID is the VideoId value in the response.
         * *   You can also call the [SearchMedia](~~86044~~) operation to obtain the video ID, which is the VideoId value in the response.
         */
        public Builder videoIds(String videoIds) {
            this.putQueryParameter("VideoIds", videoIds);
            this.videoIds = videoIds;
            return this;
        }

        @Override
        public DeleteVideoRequest build() {
            return new DeleteVideoRequest(this);
        } 

    } 

}
