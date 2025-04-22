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
 * {@link ListTagsRequest} extends {@link RequestModel}
 *
 * <p>ListTagsRequest</p>
 */
public class ListTagsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image_thumbnail_process")
    private String imageThumbnailProcess;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("video_thumbnail_process")
    private String videoThumbnailProcess;

    private ListTagsRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.imageThumbnailProcess = builder.imageThumbnailProcess;
        this.videoThumbnailProcess = builder.videoThumbnailProcess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagsRequest create() {
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
     * @return imageThumbnailProcess
     */
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

    /**
     * @return videoThumbnailProcess
     */
    public String getVideoThumbnailProcess() {
        return this.videoThumbnailProcess;
    }

    public static final class Builder extends Request.Builder<ListTagsRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String imageThumbnailProcess; 
        private String videoThumbnailProcess; 

        private Builder() {
            super();
        } 

        private Builder(ListTagsRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.imageThumbnailProcess = request.imageThumbnailProcess;
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
         * <p>The method that is used to generate the thumbnail of an image.</p>
         * 
         * <strong>example:</strong>
         * <p>image/resize,w_200</p>
         */
        public Builder imageThumbnailProcess(String imageThumbnailProcess) {
            this.putBodyParameter("image_thumbnail_process", imageThumbnailProcess);
            this.imageThumbnailProcess = imageThumbnailProcess;
            return this;
        }

        /**
         * <p>The method that is used to generate the thumbnail of a video.</p>
         * 
         * <strong>example:</strong>
         * <p>video/snapshot,t_7000,f_jpg,w_800,h_600,m_fast</p>
         */
        public Builder videoThumbnailProcess(String videoThumbnailProcess) {
            this.putBodyParameter("video_thumbnail_process", videoThumbnailProcess);
            this.videoThumbnailProcess = videoThumbnailProcess;
            return this;
        }

        @Override
        public ListTagsRequest build() {
            return new ListTagsRequest(this);
        } 

    } 

}
