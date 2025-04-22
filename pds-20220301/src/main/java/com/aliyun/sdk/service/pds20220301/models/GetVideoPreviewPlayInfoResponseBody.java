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
 * {@link GetVideoPreviewPlayInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoPreviewPlayInfoResponseBody</p>
 */
public class GetVideoPreviewPlayInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    @com.aliyun.core.annotation.NameInMap("video_preview_play_info")
    private VideoPreviewPlayInfo videoPreviewPlayInfo;

    private GetVideoPreviewPlayInfoResponseBody(Builder builder) {
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.shareId = builder.shareId;
        this.videoPreviewPlayInfo = builder.videoPreviewPlayInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoPreviewPlayInfoResponseBody create() {
        return builder().build();
    }

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
     * @return videoPreviewPlayInfo
     */
    public VideoPreviewPlayInfo getVideoPreviewPlayInfo() {
        return this.videoPreviewPlayInfo;
    }

    public static final class Builder {
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private String shareId; 
        private VideoPreviewPlayInfo videoPreviewPlayInfo; 

        private Builder() {
        } 

        private Builder(GetVideoPreviewPlayInfoResponseBody model) {
            this.domainId = model.domainId;
            this.driveId = model.driveId;
            this.fileId = model.fileId;
            this.shareId = model.shareId;
            this.videoPreviewPlayInfo = model.videoPreviewPlayInfo;
        } 

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
         * <p>The information about video playback.</p>
         */
        public Builder videoPreviewPlayInfo(VideoPreviewPlayInfo videoPreviewPlayInfo) {
            this.videoPreviewPlayInfo = videoPreviewPlayInfo;
            return this;
        }

        public GetVideoPreviewPlayInfoResponseBody build() {
            return new GetVideoPreviewPlayInfoResponseBody(this);
        } 

    } 

}
