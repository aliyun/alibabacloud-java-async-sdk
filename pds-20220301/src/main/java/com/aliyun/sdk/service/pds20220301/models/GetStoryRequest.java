// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link GetStoryRequest} extends {@link RequestModel}
 *
 * <p>GetStoryRequest</p>
 */
public class GetStoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cover_image_thumbnail_process")
    @Deprecated
    private String coverImageThumbnailProcess;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cover_video_thumbnail_process")
    @Deprecated
    private String coverVideoThumbnailProcess;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image_thumbnail_process")
    @Deprecated
    private String imageThumbnailProcess;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image_url_process")
    @Deprecated
    private String imageUrlProcess;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("url_expire_sec")
    @Deprecated
    @com.aliyun.core.annotation.Validation(maximum = 86400, minimum = 10)
    private Long urlExpireSec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("video_thumbnail_process")
    @Deprecated
    private String videoThumbnailProcess;

    private GetStoryRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.coverImageThumbnailProcess = builder.coverImageThumbnailProcess;
        this.coverVideoThumbnailProcess = builder.coverVideoThumbnailProcess;
        this.driveId = builder.driveId;
        this.imageThumbnailProcess = builder.imageThumbnailProcess;
        this.imageUrlProcess = builder.imageUrlProcess;
        this.storyId = builder.storyId;
        this.urlExpireSec = builder.urlExpireSec;
        this.videoThumbnailProcess = builder.videoThumbnailProcess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return coverImageThumbnailProcess
     */
    public String getCoverImageThumbnailProcess() {
        return this.coverImageThumbnailProcess;
    }

    /**
     * @return coverVideoThumbnailProcess
     */
    public String getCoverVideoThumbnailProcess() {
        return this.coverVideoThumbnailProcess;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return imageThumbnailProcess
     */
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

    /**
     * @return imageUrlProcess
     */
    public String getImageUrlProcess() {
        return this.imageUrlProcess;
    }

    /**
     * @return storyId
     */
    public String getStoryId() {
        return this.storyId;
    }

    /**
     * @return urlExpireSec
     */
    public Long getUrlExpireSec() {
        return this.urlExpireSec;
    }

    /**
     * @return videoThumbnailProcess
     */
    public String getVideoThumbnailProcess() {
        return this.videoThumbnailProcess;
    }

    public static final class Builder extends Request.Builder<GetStoryRequest, Builder> {
        private String domainId; 
        private String coverImageThumbnailProcess; 
        private String coverVideoThumbnailProcess; 
        private String driveId; 
        private String imageThumbnailProcess; 
        private String imageUrlProcess; 
        private String storyId; 
        private Long urlExpireSec; 
        private String videoThumbnailProcess; 

        private Builder() {
            super();
        } 

        private Builder(GetStoryRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.coverImageThumbnailProcess = request.coverImageThumbnailProcess;
            this.coverVideoThumbnailProcess = request.coverVideoThumbnailProcess;
            this.driveId = request.driveId;
            this.imageThumbnailProcess = request.imageThumbnailProcess;
            this.imageUrlProcess = request.imageUrlProcess;
            this.storyId = request.storyId;
            this.urlExpireSec = request.urlExpireSec;
            this.videoThumbnailProcess = request.videoThumbnailProcess;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * cover_image_thumbnail_process.
         */
        public Builder coverImageThumbnailProcess(String coverImageThumbnailProcess) {
            this.putBodyParameter("cover_image_thumbnail_process", coverImageThumbnailProcess);
            this.coverImageThumbnailProcess = coverImageThumbnailProcess;
            return this;
        }

        /**
         * cover_video_thumbnail_process.
         */
        public Builder coverVideoThumbnailProcess(String coverVideoThumbnailProcess) {
            this.putBodyParameter("cover_video_thumbnail_process", coverVideoThumbnailProcess);
            this.coverVideoThumbnailProcess = coverVideoThumbnailProcess;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * image_thumbnail_process.
         */
        public Builder imageThumbnailProcess(String imageThumbnailProcess) {
            this.putBodyParameter("image_thumbnail_process", imageThumbnailProcess);
            this.imageThumbnailProcess = imageThumbnailProcess;
            return this;
        }

        /**
         * image_url_process.
         */
        public Builder imageUrlProcess(String imageUrlProcess) {
            this.putBodyParameter("image_url_process", imageUrlProcess);
            this.imageUrlProcess = imageUrlProcess;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9132e0d8-fe92-4e56-86c3-f5f112308003</p>
         */
        public Builder storyId(String storyId) {
            this.putBodyParameter("story_id", storyId);
            this.storyId = storyId;
            return this;
        }

        /**
         * url_expire_sec.
         */
        public Builder urlExpireSec(Long urlExpireSec) {
            this.putBodyParameter("url_expire_sec", urlExpireSec);
            this.urlExpireSec = urlExpireSec;
            return this;
        }

        /**
         * video_thumbnail_process.
         */
        public Builder videoThumbnailProcess(String videoThumbnailProcess) {
            this.putBodyParameter("video_thumbnail_process", videoThumbnailProcess);
            this.videoThumbnailProcess = videoThumbnailProcess;
            return this;
        }

        @Override
        public GetStoryRequest build() {
            return new GetStoryRequest(this);
        } 

    } 

}
