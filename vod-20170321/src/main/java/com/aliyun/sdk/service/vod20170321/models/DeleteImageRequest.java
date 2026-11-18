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
         * <p>The type of image deletion operation. Valid values:</p>
         * <ul>
         * <li><strong>ImageURL</strong>: deletes images based on image URLs.</li>
         * <li><strong>ImageId</strong>: deletes images based on image IDs.</li>
         * <li><strong>VideoId</strong>: deletes images associated with a video based on the video ID.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VideoId</p>
         */
        public Builder deleteImageType(String deleteImageType) {
            this.putQueryParameter("DeleteImageType", deleteImageType);
            this.deleteImageType = deleteImageType;
            return this;
        }

        /**
         * <p>The image IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs are supported. You can obtain image IDs by using the following methods:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Image</strong> to view the IDs.</li>
         * <li>Obtain the IDs from the response of the <a href="~~CreateUploadImage~~">CreateUploadImage</a> operation that is called to obtain the upload URL and credential.</li>
         * <li>Obtain the IDs from the response of the <a href="~~SearchMedia~~">SearchMedia</a> operation that is called to query images.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available and required only when <strong>DeleteImageType</strong> is set to <strong>ImageId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bbc65bba53fed90de118a7849****,594228cdd14b4d069fc17a8c4a****</p>
         */
        public Builder imageIds(String imageIds) {
            this.putQueryParameter("ImageIds", imageIds);
            this.imageIds = imageIds;
            return this;
        }

        /**
         * <p>The type of images associated with the video that you want to delete. Valid values:</p>
         * <ul>
         * <li><strong>CoverSnapshot</strong>: thumbnail snapshot.</li>
         * <li><strong>NormalSnapshot</strong>: regular snapshot.</li>
         * <li><strong>SpriteSnapshot</strong>: sprite snapshot.</li>
         * <li><strong>SpriteOriginSnapshot</strong>: sprite source image.</li>
         * <li><strong>All</strong>: all of the preceding image types. If the value is not <code>All</code>, you can specify multiple image types. Separate multiple values with commas (,).</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available and required only when <strong>DeleteImageType</strong> is set to <strong>VideoId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * <p>The image URLs. The value is the <code>ImageURL</code> parameter returned by the <a href="~~CreateUploadImage~~">CreateUploadImage</a> operation. Separate multiple URLs with commas (,). A maximum of 20 URLs are supported.</p>
         * <blockquote>
         * <p>This parameter is available and required only when <strong>DeleteImageType</strong> is set to <strong>ImageURL</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.aliyundoc.com/image/default/41AE7ADABBE*****.png">https://example.aliyundoc.com/image/default/41AE7ADABBE*****.png</a></p>
         */
        public Builder imageURLs(String imageURLs) {
            this.putQueryParameter("ImageURLs", imageURLs);
            this.imageURLs = imageURLs;
            return this;
        }

        /**
         * <p>The video ID. Only a single video ID is supported. You can obtain the video ID by using the following methods:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
         * <li>Obtain the ID from the response of the <a href="~~CreateUploadVideo~~">CreateUploadVideo</a> operation that is called to obtain the upload URL and credential.</li>
         * <li>Obtain the ID from the response of the <a href="~~SearchMedia~~">SearchMedia</a> operation that is called to query videos.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available and required only when <strong>DeleteImageType</strong> is set to <strong>VideoId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eb1861d2c9a8842340e989dd56****</p>
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
