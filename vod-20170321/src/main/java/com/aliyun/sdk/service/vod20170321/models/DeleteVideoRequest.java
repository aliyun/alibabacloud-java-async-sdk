// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteVideoRequest} extends {@link RequestModel}
 *
 * <p>DeleteVideoRequest</p>
 */
public class DeleteVideoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoIds")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The list of video IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs can be specified. You can obtain a video ID in one of the following ways:</p>
         * <ul>
         * <li>If the video is uploaded by using the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>, log on to the console and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the ID of the video.</li>
         * <li>If the video is uploaded by calling the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation, the video ID is the VideoId value in the response.</li>
         * <li>You can also call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to obtain the video ID, which is the VideoId value in the response.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e44ebf1147hdsa2d2adbea8b****,e44ebf11oj984adbea8****,73ab850b4f6f4b6e91d24d81d54****</p>
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
