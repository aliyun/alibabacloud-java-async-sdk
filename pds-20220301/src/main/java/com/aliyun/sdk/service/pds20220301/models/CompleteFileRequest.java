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
 * {@link CompleteFileRequest} extends {@link RequestModel}
 *
 * <p>CompleteFileRequest</p>
 */
public class CompleteFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("crc64_hash")
    private String crc64Hash;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("upload_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadId;

    private CompleteFileRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.crc64Hash = builder.crc64Hash;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteFileRequest create() {
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
     * @return crc64Hash
     */
    public String getCrc64Hash() {
        return this.crc64Hash;
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
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    public static final class Builder extends Request.Builder<CompleteFileRequest, Builder> {
        private String domainId; 
        private String crc64Hash; 
        private String driveId; 
        private String fileId; 
        private String uploadId; 

        private Builder() {
            super();
        } 

        private Builder(CompleteFileRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.crc64Hash = request.crc64Hash;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.uploadId = request.uploadId;
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
         * crc64_hash.
         */
        public Builder crc64Hash(String crc64Hash) {
            this.putBodyParameter("crc64_hash", crc64Hash);
            this.crc64Hash = crc64Hash;
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
         * <p>The upload ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C9DCFE5A82644AC7A02DB74C30C934A6</p>
         */
        public Builder uploadId(String uploadId) {
            this.putBodyParameter("upload_id", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        @Override
        public CompleteFileRequest build() {
            return new CompleteFileRequest(this);
        } 

    } 

}
