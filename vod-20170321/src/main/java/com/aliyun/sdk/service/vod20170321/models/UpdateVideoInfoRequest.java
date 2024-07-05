// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVideoInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateVideoInfoRequest</p>
 */
public class UpdateVideoInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    private Long cateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverURL")
    private String coverURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    private UpdateVideoInfoRequest(Builder builder) {
        super(builder);
        this.cateId = builder.cateId;
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.tags = builder.tags;
        this.title = builder.title;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVideoInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    /**
     * @return coverURL
     */
    public String getCoverURL() {
        return this.coverURL;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<UpdateVideoInfoRequest, Builder> {
        private Long cateId; 
        private String coverURL; 
        private String description; 
        private String tags; 
        private String title; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVideoInfoRequest request) {
            super(request);
            this.cateId = request.cateId;
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.tags = request.tags;
            this.title = request.title;
            this.videoId = request.videoId;
        } 

        /**
         * The ID of the video category.
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * The URL of the video thumbnail.
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * The description of the video.
         * <p>
         * 
         * *   The value can be up to 1,024 bytes in length.
         * *   The string must be encoded in the UTF-8 format.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The tags of the video.
         * <p>
         * 
         * *   Each tag can be up to 32 bytes in length. A maximum of 16 tags can be specified.
         * *   Separate multiple tags with commas (,).
         * *   The string must be encoded in the UTF-8 format.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The title of the video.
         * <p>
         * 
         * *   The value can be up to 128 bytes in length.
         * *   The string must be encoded in the UTF-8 format.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * The ID of the video.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public UpdateVideoInfoRequest build() {
            return new UpdateVideoInfoRequest(this);
        } 

    } 

}
