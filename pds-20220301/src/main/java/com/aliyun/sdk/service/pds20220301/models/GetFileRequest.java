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
 * {@link GetFileRequest} extends {@link RequestModel}
 *
 * <p>GetFileRequest</p>
 */
public class GetFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fields")
    private String fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("thumbnail_processes")
    private java.util.Map<String, ImageProcess> thumbnailProcesses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("url_expire_sec")
    @com.aliyun.core.annotation.Validation(maximum = 14400, minimum = 10)
    private Integer urlExpireSec;

    private GetFileRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fields = builder.fields;
        this.fileId = builder.fileId;
        this.shareId = builder.shareId;
        this.thumbnailProcesses = builder.thumbnailProcesses;
        this.urlExpireSec = builder.urlExpireSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileRequest create() {
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
     * @return fields
     */
    public String getFields() {
        return this.fields;
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
     * @return thumbnailProcesses
     */
    public java.util.Map<String, ImageProcess> getThumbnailProcesses() {
        return this.thumbnailProcesses;
    }

    /**
     * @return urlExpireSec
     */
    public Integer getUrlExpireSec() {
        return this.urlExpireSec;
    }

    public static final class Builder extends Request.Builder<GetFileRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fields; 
        private String fileId; 
        private String shareId; 
        private java.util.Map<String, ImageProcess> thumbnailProcesses; 
        private Integer urlExpireSec; 

        private Builder() {
            super();
        } 

        private Builder(GetFileRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.fields = request.fields;
            this.fileId = request.fileId;
            this.shareId = request.shareId;
            this.thumbnailProcesses = request.thumbnailProcesses;
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
         * <p>The fields to return.</p>
         * <ol>
         * <li>If this parameter is set to *, all fields of the file except the fields that must be specified are returned.</li>
         * <li>If only specific fields are required, you can specify the following fields: url, thumbnail, exif, cropping_suggestion, characteristic_hash, video_metadata, and video_preview_metadata. If multiple fields are required, separate them with commas (,). Example: url,thumbnail.</li>
         * <li>The investigation_info field is returned only if you specify this field.</li>
         * </ol>
         * <p>By default, all fields except the fields that must be specified are returned.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder fields(String fields) {
            this.putBodyParameter("fields", fields);
            this.fields = fields;
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
         * <p>The share ID. If you want to manage a file by using a share link, carry the <code>x-share-token</code> header for authentication in the request and specify share_id. In this case, <code>drive_id</code> is invalid. Otherwise, use an <code>AccessKey pair</code> or <code>access token</code> for authentication and specify <code>drive_id</code>. You must specify one of <code>share_id</code> and <code>drive_id</code>.</p>
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
         * <p>缩略图配置，可一次性返回最多5个缩略图，map的key可以自定义，返回时按key返回对应的缩略图链接</p>
         */
        public Builder thumbnailProcesses(java.util.Map<String, ImageProcess> thumbnailProcesses) {
            this.putBodyParameter("thumbnail_processes", thumbnailProcesses);
            this.thumbnailProcesses = thumbnailProcesses;
            return this;
        }

        /**
         * <p>The time when the file expires. Unit: seconds. Valid values: 10 to 14400.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder urlExpireSec(Integer urlExpireSec) {
            this.putBodyParameter("url_expire_sec", urlExpireSec);
            this.urlExpireSec = urlExpireSec;
            return this;
        }

        @Override
        public GetFileRequest build() {
            return new GetFileRequest(this);
        } 

    } 

}
