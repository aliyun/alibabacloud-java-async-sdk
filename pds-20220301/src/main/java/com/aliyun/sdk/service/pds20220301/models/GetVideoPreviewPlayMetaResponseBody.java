// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoPreviewPlayMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoPreviewPlayMetaResponseBody</p>
 */
public class GetVideoPreviewPlayMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    @com.aliyun.core.annotation.NameInMap("video_preview_play_meta")
    private VideoPreviewPlayMeta videoPreviewPlayMeta;

    private GetVideoPreviewPlayMetaResponseBody(Builder builder) {
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.shareId = builder.shareId;
        this.videoPreviewPlayMeta = builder.videoPreviewPlayMeta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoPreviewPlayMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    /**
     * @return videoPreviewPlayMeta
     */
    public VideoPreviewPlayMeta getVideoPreviewPlayMeta() {
        return this.videoPreviewPlayMeta;
    }

    public static final class Builder {
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private String shareId; 
        private VideoPreviewPlayMeta videoPreviewPlayMeta; 

        /**
         * The domain ID.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * The drive ID.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * The file ID.
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * The share ID.
         */
        public Builder shareId(String shareId) {
            this.shareId = shareId;
            return this;
        }

        /**
         * The preview metadata of the video.
         */
        public Builder videoPreviewPlayMeta(VideoPreviewPlayMeta videoPreviewPlayMeta) {
            this.videoPreviewPlayMeta = videoPreviewPlayMeta;
            return this;
        }

        public GetVideoPreviewPlayMetaResponseBody build() {
            return new GetVideoPreviewPlayMetaResponseBody(this);
        } 

    } 

}
