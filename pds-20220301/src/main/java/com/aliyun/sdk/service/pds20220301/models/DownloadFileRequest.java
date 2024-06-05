// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadFileRequest} extends {@link RequestModel}
 *
 * <p>DownloadFileRequest</p>
 */
public class DownloadFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("image_thumbnail_process")
    private String imageThumbnailProcess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("office_thumbnail_process")
    private String officeThumbnailProcess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("video_thumbnail_process")
    private String videoThumbnailProcess;

    private DownloadFileRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.imageThumbnailProcess = builder.imageThumbnailProcess;
        this.officeThumbnailProcess = builder.officeThumbnailProcess;
        this.shareId = builder.shareId;
        this.videoThumbnailProcess = builder.videoThumbnailProcess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadFileRequest create() {
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
     * @return imageThumbnailProcess
     */
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

    /**
     * @return officeThumbnailProcess
     */
    public String getOfficeThumbnailProcess() {
        return this.officeThumbnailProcess;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    /**
     * @return videoThumbnailProcess
     */
    public String getVideoThumbnailProcess() {
        return this.videoThumbnailProcess;
    }

    public static final class Builder extends Request.Builder<DownloadFileRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private String imageThumbnailProcess; 
        private String officeThumbnailProcess; 
        private String shareId; 
        private String videoThumbnailProcess; 

        private Builder() {
            super();
        } 

        private Builder(DownloadFileRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.imageThumbnailProcess = request.imageThumbnailProcess;
            this.officeThumbnailProcess = request.officeThumbnailProcess;
            this.shareId = request.shareId;
            this.videoThumbnailProcess = request.videoThumbnailProcess;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The drive ID.
         */
        public Builder driveId(String driveId) {
            this.putQueryParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * The file ID.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The method used to generate the thumbnail of an image. If this parameter is specified, you are redirected to the URL of the generated thumbnail.
         */
        public Builder imageThumbnailProcess(String imageThumbnailProcess) {
            this.putQueryParameter("image_thumbnail_process", imageThumbnailProcess);
            this.imageThumbnailProcess = imageThumbnailProcess;
            return this;
        }

        /**
         * The method used to generate the thumbnail of a document. If this parameter is specified, you are redirected to the URL of the generated thumbnail.
         */
        public Builder officeThumbnailProcess(String officeThumbnailProcess) {
            this.putQueryParameter("office_thumbnail_process", officeThumbnailProcess);
            this.officeThumbnailProcess = officeThumbnailProcess;
            return this;
        }

        /**
         * The share ID. If you want to manage a file by using a share link, carry the `x-share-token` header for authentication in the request and specify share_id. In this case, `drive_id` is invalid. Otherwise, use an `AccessKey pair` or `access token` for authentication and specify `drive_id`. You must specify one of `share_id` and `drive_id`.
         */
        public Builder shareId(String shareId) {
            this.putQueryParameter("share_id", shareId);
            this.shareId = shareId;
            return this;
        }

        /**
         * The method used to generate the thumbnail of a video. If this parameter is specified, you are redirected to the URL of the generated thumbnail.
         */
        public Builder videoThumbnailProcess(String videoThumbnailProcess) {
            this.putQueryParameter("video_thumbnail_process", videoThumbnailProcess);
            this.videoThumbnailProcess = videoThumbnailProcess;
            return this;
        }

        @Override
        public DownloadFileRequest build() {
            return new DownloadFileRequest(this);
        } 

    } 

}
