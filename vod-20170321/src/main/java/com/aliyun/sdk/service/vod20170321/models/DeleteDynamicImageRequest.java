// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDynamicImageRequest} extends {@link RequestModel}
 *
 * <p>DeleteDynamicImageRequest</p>
 */
public class DeleteDynamicImageRequest extends Request {
    @Query
    @NameInMap("DynamicImageIds")
    private String dynamicImageIds;

    @Query
    @NameInMap("VideoId")
    @Validation(required = true)
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
         * DynamicImageIds.
         */
        public Builder dynamicImageIds(String dynamicImageIds) {
            this.putQueryParameter("DynamicImageIds", dynamicImageIds);
            this.dynamicImageIds = dynamicImageIds;
            return this;
        }

        /**
         * VideoId.
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
