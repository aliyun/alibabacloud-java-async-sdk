// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoPreviewPlayInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoPreviewPlayInfoResponseBody</p>
 */
public class GetVideoPreviewPlayInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("master_url")
    private String masterUrl;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    @com.aliyun.core.annotation.NameInMap("video_preview_play_info")
    private VideoPreviewPlayInfo videoPreviewPlayInfo;

    private GetVideoPreviewPlayInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.masterUrl = builder.masterUrl;
        this.message = builder.message;
        this.shareId = builder.shareId;
        this.videoPreviewPlayInfo = builder.videoPreviewPlayInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoPreviewPlayInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return masterUrl
     */
    public String getMasterUrl() {
        return this.masterUrl;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private String masterUrl; 
        private String message; 
        private String shareId; 
        private VideoPreviewPlayInfo videoPreviewPlayInfo; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

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
         * master_url.
         */
        public Builder masterUrl(String masterUrl) {
            this.masterUrl = masterUrl;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * The information about video playback.
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
