// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVideoInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateVideoInfoRequest</p>
 */
public class UpdateVideoInfoRequest extends Request {
    @Query
    @NameInMap("CateId")
    private Long cateId;

    @Query
    @NameInMap("CoverURL")
    private String coverURL;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("Title")
    private String title;

    @Query
    @NameInMap("VideoId")
    @Validation(required = true)
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

        private Builder(UpdateVideoInfoRequest response) {
            super(response);
            this.cateId = response.cateId;
            this.coverURL = response.coverURL;
            this.description = response.description;
            this.tags = response.tags;
            this.title = response.title;
            this.videoId = response.videoId;
        } 

        /**
         * CateId.
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * CoverURL.
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
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
        public UpdateVideoInfoRequest build() {
            return new UpdateVideoInfoRequest(this);
        } 

    } 

}
