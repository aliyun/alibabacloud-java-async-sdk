// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAIImageInfoRequest} extends {@link RequestModel}
 *
 * <p>ListAIImageInfoRequest</p>
 */
public class ListAIImageInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    private ListAIImageInfoRequest(Builder builder) {
        super(builder);
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIImageInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<ListAIImageInfoRequest, Builder> {
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(ListAIImageInfoRequest request) {
            super(request);
            this.videoId = request.videoId;
        } 

        /**
         * The ID of the video. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
         * *   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to upload media files.
         * *   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation after you upload media files.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public ListAIImageInfoRequest build() {
            return new ListAIImageInfoRequest(this);
        } 

    } 

}
