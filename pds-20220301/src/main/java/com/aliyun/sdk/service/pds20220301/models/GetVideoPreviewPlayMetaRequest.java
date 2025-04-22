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
 * {@link GetVideoPreviewPlayMetaRequest} extends {@link RequestModel}
 *
 * <p>GetVideoPreviewPlayMetaRequest</p>
 */
public class GetVideoPreviewPlayMetaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    private GetVideoPreviewPlayMetaRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.category = builder.category;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.shareId = builder.shareId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoPreviewPlayMetaRequest create() {
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
     * @return category
     */
    public String getCategory() {
        return this.category;
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

    public static final class Builder extends Request.Builder<GetVideoPreviewPlayMetaRequest, Builder> {
        private String domainId; 
        private String category; 
        private String driveId; 
        private String fileId; 
        private String shareId; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoPreviewPlayMetaRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.category = request.category;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.shareId = request.shareId;
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
         * <p>The preview type. You must enable the corresponding video transcoding feature. Valid values:</p>
         * <ul>
         * <li>live_transcoding: previews a live stream while transcoding is in progress.</li>
         * <li>quick_video: previews a video while transcoding is in progress.</li>
         * <li>offline_audio: previews a piece of audio after the audio is transcoded offline.</li>
         * <li>offline_video: previews a video after the video is transcoded offline.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>live_transcoding</p>
         */
        public Builder category(String category) {
            this.putBodyParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The drive ID.</p>
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
         * <p>The file ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9520943DC264</p>
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The share ID. If you want to manage a file by using a sharing link, carry the <code>x-share-token</code> header in the request and specify share_id. In this case, <code>drive_id</code> is invalid. Otherwise, use an <code>AccessKey pair</code> or <code>access token</code> for authentication and specify <code>drive_id</code>. You must specify at least either <code>share_id</code> or <code>drive_id</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>7JQX1FswpQ8</p>
         */
        public Builder shareId(String shareId) {
            this.putBodyParameter("share_id", shareId);
            this.shareId = shareId;
            return this;
        }

        @Override
        public GetVideoPreviewPlayMetaRequest build() {
            return new GetVideoPreviewPlayMetaRequest(this);
        } 

    } 

}
