// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link UploadChatFileByBase64Request} extends {@link RequestModel}
 *
 * <p>UploadChatFileByBase64Request</p>
 */
public class UploadChatFileByBase64Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contentType")
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileContentBase64")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileContentBase64;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private UploadChatFileByBase64Request(Builder builder) {
        super(builder);
        this.contentType = builder.contentType;
        this.fileContentBase64 = builder.fileContentBase64;
        this.fileName = builder.fileName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadChatFileByBase64Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return fileContentBase64
     */
    public String getFileContentBase64() {
        return this.fileContentBase64;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<UploadChatFileByBase64Request, Builder> {
        private String contentType; 
        private String fileContentBase64; 
        private String fileName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UploadChatFileByBase64Request request) {
            super(request);
            this.contentType = request.contentType;
            this.fileContentBase64 = request.fileContentBase64;
            this.fileName = request.fileName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The MIME type of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>application/pdf</p>
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("contentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The Base64-encoded string of the file content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>YWJj</p>
         */
        public Builder fileContentBase64(String fileContentBase64) {
            this.putBodyParameter("fileContentBase64", fileContentBase64);
            this.fileContentBase64 = fileContentBase64;
            return this;
        }

        /**
         * <p>The file name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>report.pdf</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public UploadChatFileByBase64Request build() {
            return new UploadChatFileByBase64Request(this);
        } 

    } 

}
