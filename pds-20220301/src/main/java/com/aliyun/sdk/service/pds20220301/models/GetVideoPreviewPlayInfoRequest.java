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
 * {@link GetVideoPreviewPlayInfoRequest} extends {@link RequestModel}
 *
 * <p>GetVideoPreviewPlayInfoRequest</p>
 */
public class GetVideoPreviewPlayInfoRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("get_master_url")
    private Boolean getMasterUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("get_without_url")
    private Boolean getWithoutUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("re_transcode")
    private Boolean reTranscode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("template_id")
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("url_expire_sec")
    private Long urlExpireSec;

    private GetVideoPreviewPlayInfoRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.category = builder.category;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.getMasterUrl = builder.getMasterUrl;
        this.getWithoutUrl = builder.getWithoutUrl;
        this.reTranscode = builder.reTranscode;
        this.shareId = builder.shareId;
        this.templateId = builder.templateId;
        this.urlExpireSec = builder.urlExpireSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoPreviewPlayInfoRequest create() {
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
     * @return getMasterUrl
     */
    public Boolean getGetMasterUrl() {
        return this.getMasterUrl;
    }

    /**
     * @return getWithoutUrl
     */
    public Boolean getGetWithoutUrl() {
        return this.getWithoutUrl;
    }

    /**
     * @return reTranscode
     */
    public Boolean getReTranscode() {
        return this.reTranscode;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return urlExpireSec
     */
    public Long getUrlExpireSec() {
        return this.urlExpireSec;
    }

    public static final class Builder extends Request.Builder<GetVideoPreviewPlayInfoRequest, Builder> {
        private String domainId; 
        private String category; 
        private String driveId; 
        private String fileId; 
        private Boolean getMasterUrl; 
        private Boolean getWithoutUrl; 
        private Boolean reTranscode; 
        private String shareId; 
        private String templateId; 
        private Long urlExpireSec; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoPreviewPlayInfoRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.category = request.category;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.getMasterUrl = request.getMasterUrl;
            this.getWithoutUrl = request.getWithoutUrl;
            this.reTranscode = request.reTranscode;
            this.shareId = request.shareId;
            this.templateId = request.templateId;
            this.urlExpireSec = request.urlExpireSec;
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
         * get_master_url.
         */
        public Builder getMasterUrl(Boolean getMasterUrl) {
            this.putBodyParameter("get_master_url", getMasterUrl);
            this.getMasterUrl = getMasterUrl;
            return this;
        }

        /**
         * <p>Specifies whether not to query the playback URL. If you set this parameter to true, only transcoding metadata is returned. The video is not transcoded in the TS format, and the playback URL is not returned. If you set this parameter to false, the playback URL is returned. If the video has not been transcoded by using the template specified by template_id, the transcoding process is triggered. You are charged for the value-added service fees generated for transcoding.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder getWithoutUrl(Boolean getWithoutUrl) {
            this.putBodyParameter("get_without_url", getWithoutUrl);
            this.getWithoutUrl = getWithoutUrl;
            return this;
        }

        /**
         * re_transcode.
         */
        public Builder reTranscode(Boolean reTranscode) {
            this.putBodyParameter("re_transcode", reTranscode);
            this.reTranscode = reTranscode;
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

        /**
         * <p>The ID of the definition template. If you leave this parameter empty, all definition templates are available.</p>
         * 
         * <strong>example:</strong>
         * <p>264_480p</p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("template_id", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The validity period of the video preview. Unit: seconds. Default value: 900. Maximum value: 14400.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder urlExpireSec(Long urlExpireSec) {
            this.putBodyParameter("url_expire_sec", urlExpireSec);
            this.urlExpireSec = urlExpireSec;
            return this;
        }

        @Override
        public GetVideoPreviewPlayInfoRequest build() {
            return new GetVideoPreviewPlayInfoRequest(this);
        } 

    } 

}
