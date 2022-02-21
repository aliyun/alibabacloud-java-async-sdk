// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteImageRequest} extends {@link RequestModel}
 *
 * <p>DeleteImageRequest</p>
 */
public class DeleteImageRequest extends Request {
    @Query
    @NameInMap("DeleteImageType")
    @Validation(required = true)
    private String deleteImageType;

    @Query
    @NameInMap("ImageIds")
    private String imageIds;

    @Query
    @NameInMap("ImageType")
    private String imageType;

    @Query
    @NameInMap("ImageURLs")
    private String imageURLs;

    @Query
    @NameInMap("VideoId")
    private String videoId;

    private DeleteImageRequest(Builder builder) {
        super(builder);
        this.deleteImageType = builder.deleteImageType;
        this.imageIds = builder.imageIds;
        this.imageType = builder.imageType;
        this.imageURLs = builder.imageURLs;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteImageType
     */
    public String getDeleteImageType() {
        return this.deleteImageType;
    }

    /**
     * @return imageIds
     */
    public String getImageIds() {
        return this.imageIds;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return imageURLs
     */
    public String getImageURLs() {
        return this.imageURLs;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<DeleteImageRequest, Builder> {
        private String deleteImageType; 
        private String imageIds; 
        private String imageType; 
        private String imageURLs; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteImageRequest response) {
            super(response);
            this.deleteImageType = response.deleteImageType;
            this.imageIds = response.imageIds;
            this.imageType = response.imageType;
            this.imageURLs = response.imageURLs;
            this.videoId = response.videoId;
        } 

        /**
         * DeleteImageType.
         */
        public Builder deleteImageType(String deleteImageType) {
            this.putQueryParameter("DeleteImageType", deleteImageType);
            this.deleteImageType = deleteImageType;
            return this;
        }

        /**
         * ImageIds.
         */
        public Builder imageIds(String imageIds) {
            this.putQueryParameter("ImageIds", imageIds);
            this.imageIds = imageIds;
            return this;
        }

        /**
         * ImageType.
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * ImageURLs.
         */
        public Builder imageURLs(String imageURLs) {
            this.putQueryParameter("ImageURLs", imageURLs);
            this.imageURLs = imageURLs;
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
        public DeleteImageRequest build() {
            return new DeleteImageRequest(this);
        } 

    } 

}
