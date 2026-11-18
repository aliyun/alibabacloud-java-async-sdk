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
 * {@link DeleteDynamicImageRequest} extends {@link RequestModel}
 *
 * <p>DeleteDynamicImageRequest</p>
 */
public class DeleteDynamicImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicImageIds")
    private String dynamicImageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    private DeleteDynamicImageRequest(Builder builder) {
        super(builder);
        this.dynamicImageIds = builder.dynamicImageIds;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDynamicImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicImageIds
     */
    public String getDynamicImageIds() {
        return this.dynamicImageIds;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<DeleteDynamicImageRequest, Builder> {
        private String dynamicImageIds; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDynamicImageRequest request) {
            super(request);
            this.dynamicImageIds = request.dynamicImageIds;
            this.videoId = request.videoId;
        } 

        /**
         * <p>The list of animated sticker IDs. The animated sticker ID is the value of the DynamicImageId response parameter returned by the <a href="https://help.aliyun.com/document_detail/180958.html">ListDynamicImage</a> operation.</p>
         * <ul>
         * <li>Separate multiple IDs with commas (,). You can specify a maximum of 10 IDs.</li>
         * <li><strong>If you do not specify this parameter, all animated stickers associated with the specified VideoId are deleted. However, if the video has more than 10 animated stickers, the deletion request is rejected.</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>beafec3834a4e52ea52042a4****,8281c8519847fd8970e79e80b6****</p>
         */
        public Builder dynamicImageIds(String dynamicImageIds) {
            this.putQueryParameter("DynamicImageIds", dynamicImageIds);
            this.dynamicImageIds = dynamicImageIds;
            return this;
        }

        /**
         * <p>The ID of the video associated with the animated stickers that you want to delete. You can obtain the video ID by using one of the following methods:</p>
         * <ul>
         * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
         * <li>Obtain the video ID from the value of the VideoId response parameter when you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to obtain the upload URL and credential.</li>
         * <li>After the video is uploaded, call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the video ID, which is the value of the VideoId response parameter.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2321077d460b028700ef6c2f4d****</p>
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public DeleteDynamicImageRequest build() {
            return new DeleteDynamicImageRequest(this);
        } 

    } 

}
