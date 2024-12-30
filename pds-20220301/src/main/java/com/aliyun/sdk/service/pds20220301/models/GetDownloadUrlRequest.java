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
 * {@link GetDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetDownloadUrlRequest</p>
 */
public class GetDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expire_sec")
    @com.aliyun.core.annotation.Validation(maximum = 115200, minimum = 1)
    private Integer expireSec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_name")
    @com.aliyun.core.annotation.Validation(maxLength = 1024, minLength = 1)
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("response_content_type")
    private String responseContentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    private GetDownloadUrlRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.expireSec = builder.expireSec;
        this.fileId = builder.fileId;
        this.fileName = builder.fileName;
        this.responseContentType = builder.responseContentType;
        this.shareId = builder.shareId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDownloadUrlRequest create() {
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
     * @return expireSec
     */
    public Integer getExpireSec() {
        return this.expireSec;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return responseContentType
     */
    public String getResponseContentType() {
        return this.responseContentType;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    public static final class Builder extends Request.Builder<GetDownloadUrlRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private Integer expireSec; 
        private String fileId; 
        private String fileName; 
        private String responseContentType; 
        private String shareId; 

        private Builder() {
            super();
        } 

        private Builder(GetDownloadUrlRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.expireSec = request.expireSec;
            this.fileId = request.fileId;
            this.fileName = request.fileName;
            this.responseContentType = request.responseContentType;
            this.shareId = request.shareId;
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
         * <p>The validity period of the download URL. Maximum value: 115200. Default value: 900. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder expireSec(Integer expireSec) {
            this.putBodyParameter("expire_sec", expireSec);
            this.expireSec = expireSec;
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
         * <p>The name of the file. The name can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1.txt</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("file_name", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * response_content_type.
         */
        public Builder responseContentType(String responseContentType) {
            this.putBodyParameter("response_content_type", responseContentType);
            this.responseContentType = responseContentType;
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
        public GetDownloadUrlRequest build() {
            return new GetDownloadUrlRequest(this);
        } 

    } 

}
