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
         * <p>The domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bj1</p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The drive ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fileid1</p>
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The share ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7JQX1FswpQ8</p>
         */
        public Builder shareId(String shareId) {
            this.shareId = shareId;
            return this;
        }

        /**
         * <p>The preview metadata of the video.</p>
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
