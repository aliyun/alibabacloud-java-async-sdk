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
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
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
            this.putQueryParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>The file ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9520943DC264</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The method used to generate the thumbnail of an image. If this parameter is specified, you are redirected to the URL of the generated thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p>image/resize,m_fill,h_128,w_128,limit_0</p>
         */
        public Builder imageThumbnailProcess(String imageThumbnailProcess) {
            this.putQueryParameter("image_thumbnail_process", imageThumbnailProcess);
            this.imageThumbnailProcess = imageThumbnailProcess;
            return this;
        }

        /**
         * <p>The method used to generate the thumbnail of a document. If this parameter is specified, you are redirected to the URL of the generated thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p>image/resize,w_200</p>
         */
        public Builder officeThumbnailProcess(String officeThumbnailProcess) {
            this.putQueryParameter("office_thumbnail_process", officeThumbnailProcess);
            this.officeThumbnailProcess = officeThumbnailProcess;
            return this;
        }

        /**
         * <p>The share ID. If you want to manage a file by using a share link, carry the <code>x-share-token</code> header for authentication in the request and specify share_id. In this case, <code>drive_id</code> is invalid. Otherwise, use an <code>AccessKey pair</code> or <code>access token</code> for authentication and specify <code>drive_id</code>. You must specify one of <code>share_id</code> and <code>drive_id</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>7JQX1FswpQ8</p>
         */
        public Builder shareId(String shareId) {
            this.putQueryParameter("share_id", shareId);
            this.shareId = shareId;
            return this;
        }

        /**
         * <p>The method used to generate the thumbnail of a video. If this parameter is specified, you are redirected to the URL of the generated thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p>video/snapshot,t_7000,f_jpg,w_800,h_600,m_fast</p>
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
