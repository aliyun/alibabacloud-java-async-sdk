// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMezzaninesRequest} extends {@link RequestModel}
 *
 * <p>DeleteMezzaninesRequest</p>
 */
public class DeleteMezzaninesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoIds;

    private DeleteMezzaninesRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.videoIds = builder.videoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMezzaninesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return videoIds
     */
    public String getVideoIds() {
        return this.videoIds;
    }

    public static final class Builder extends Request.Builder<DeleteMezzaninesRequest, Builder> {
        private Boolean force; 
        private String videoIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMezzaninesRequest request) {
            super(request);
            this.force = request.force;
            this.videoIds = request.videoIds;
        } 

        /**
         * Specifies whether to forcibly delete the source file. Valid values:
         * <p>
         * 
         * *   **false** (default)
         * *   **true**
         * 
         * >  If a video is uploaded without transcoding or is asynchronously transcoded, the source file of the video is used for original-quality playback. By default, the source file of the video cannot be deleted. To forcibly delete the mezzanine file, set this parameter to **true**.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * The IDs of audio or video files whose source files that you want to delete. You can specify up to 20 IDs. Separate multiple IDs with commas (,). You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   After you upload a video in the [ApsaraVideo VOD console](https://vod.console.aliyun.com), you can log on to the ApsaraVideo VOD console and choose **Media Files** > **Audio/Video** to view the ID of the video.
         * *   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you called to obtain the upload URL and credential.
         * *   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation that you called to query media information after the audio or video file is uploaded.
         */
        public Builder videoIds(String videoIds) {
            this.putQueryParameter("VideoIds", videoIds);
            this.videoIds = videoIds;
            return this;
        }

        @Override
        public DeleteMezzaninesRequest build() {
            return new DeleteMezzaninesRequest(this);
        } 

    } 

}
