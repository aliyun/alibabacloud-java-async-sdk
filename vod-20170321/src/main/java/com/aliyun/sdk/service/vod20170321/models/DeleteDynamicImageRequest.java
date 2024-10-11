// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
         * <p>The IDs of the animated stickers.</p>
         * <ul>
         * <li>Separate multiple IDs with commas (,). You can specify a maximum of 10 IDs.</li>
         * <li>If you do not set this parameter, the system finds the video specified by the VideoId parameter and deletes the information about the animated stickers associated with the video. If more than 10 animated stickers are associated with the video specified by the VideoId parameter, the deletion request is denied.</li>
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
         * <p>The ID of the video associated with the animated stickers whose information you want to delete.</p>
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
