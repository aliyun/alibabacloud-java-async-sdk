// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    private GetDownloadUrlRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.expireSec = builder.expireSec;
        this.fileId = builder.fileId;
        this.fileName = builder.fileName;
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
         * The drive ID.
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * The validity period of the download URL. Maximum value: 115200. Default value: 900. Unit: seconds.
         */
        public Builder expireSec(Integer expireSec) {
            this.putBodyParameter("expire_sec", expireSec);
            this.expireSec = expireSec;
            return this;
        }

        /**
         * The file ID.
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The name of the file. The name can be up to 1,024 characters in length.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("file_name", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * The share ID. If you want to manage a file by using a sharing link, carry the `x-share-token` header in the request and specify share_id. In this case, `drive_id` is invalid. Otherwise, use an `AccessKey pair` or `access token` for authentication and specify `drive_id`. You must specify at least either `share_id` or `drive_id`.
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
