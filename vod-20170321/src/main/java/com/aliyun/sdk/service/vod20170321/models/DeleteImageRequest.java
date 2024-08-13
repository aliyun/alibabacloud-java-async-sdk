// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteImageRequest} extends {@link RequestModel}
 *
 * <p>DeleteImageRequest</p>
 */
public class DeleteImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteImageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deleteImageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageIds")
    private String imageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageType")
    private String imageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageURLs")
    private String imageURLs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
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

        private Builder(DeleteImageRequest request) {
            super(request);
            this.deleteImageType = request.deleteImageType;
            this.imageIds = request.imageIds;
            this.imageType = request.imageType;
            this.imageURLs = request.imageURLs;
            this.videoId = request.videoId;
        } 

        /**
         * The method that is used to delete images. Valid values:
         * <p>
         * 
         * *   **ImageURL**: deletes images based on URLs.
         * *   **ImageId**: deletes images based on image IDs.
         * *   **VideoId**: deletes images associated with a video based on the video ID.
         */
        public Builder deleteImageType(String deleteImageType) {
            this.putQueryParameter("DeleteImageType", deleteImageType);
            this.deleteImageType = deleteImageType;
            return this;
        }

        /**
         * The ID of the image. You can specify up to 20 image IDs and separate them with commas (,). You can use one of the following methods to obtain the image ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Media Files** > **Image** to view the image ID.
         * *   Obtain the image ID from the response to the [CreateUploadImage](~~CreateUploadImage~~) operation that you call to obtain the upload credential and URL.
         * *   Obtain the image ID from the response to the [SearchMedia](~~SearchMedia~~) operation that you call to query images.
         * 
         * >  This parameter takes effect and is required only if you set **DeleteImageType** to **ImageId**.
         */
        public Builder imageIds(String imageIds) {
            this.putQueryParameter("ImageIds", imageIds);
            this.imageIds = imageIds;
            return this;
        }

        /**
         * The type of images that you want to delete. The images are associated with the video. Valid values:
         * <p>
         * 
         * *   **CoverSnapshot**: thumbnail snapshot.
         * *   **NormalSnapshot**: regular snapshot.
         * *   **SpriteSnapshot**: sprite snapshot.
         * *   **SpriteOriginSnapshot**: sprite source snapshot.
         * *   **All**: images of all the preceding types. You can specify multiple types other than `All` for this parameter. Separate multiple types with commas (,).
         * 
         * >  This parameter takes effect and is required only if you set **DeleteImageType** to **VideoId**.
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * The URL of the image. You can obtain the value of `ImageURL` from the response to the [CreateUploadImage](~~CreateUploadImage~~) operation. You can specify up to 20 URLs and separate them with commas (,).
         * <p>
         * 
         * >  This parameter takes effect and is required only if you set **DeleteImageType** to **ImageURL**.
         */
        public Builder imageURLs(String imageURLs) {
            this.putQueryParameter("ImageURLs", imageURLs);
            this.imageURLs = imageURLs;
            return this;
        }

        /**
         * The ID of the video. You can specify only one ID. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the media file.
         * *   Obtain the video ID from the response to the [CreateUploadVideo](~~CreateUploadVideo~~) operation that you call to obtain the upload credential and URL.
         * *   Obtain the video ID from the response to the [SearchMedia](~~SearchMedia~~) operation that you call to query videos.
         * 
         * >  This parameter takes effect and is required only if you set **DeleteImageType** to **VideoId**.
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
