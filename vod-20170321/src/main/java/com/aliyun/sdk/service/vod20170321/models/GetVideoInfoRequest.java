// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoInfoRequest} extends {@link RequestModel}
 *
 * <p>GetVideoInfoRequest</p>
 */
public class GetVideoInfoRequest extends Request {
    @Query
    @NameInMap("VideoId")
    @Validation(required = true)
    private String videoId;

    private GetVideoInfoRequest(Builder builder) {
        super(builder);
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
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<GetVideoInfoRequest, Builder> {
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoInfoRequest request) {
            super(request);
            this.videoId = request.videoId;
        } 

        /**
         * The ID of the media file. You can use one of the following methods to obtain the ID of the file:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
         * *   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you called to obtain an upload URL and credential.
         * *   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation that you called to query the media ID after the media file is uploaded.
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
