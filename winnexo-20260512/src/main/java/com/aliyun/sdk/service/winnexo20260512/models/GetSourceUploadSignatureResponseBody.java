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
 * {@link GetSourceUploadSignatureResponseBody} extends {@link TeaModel}
 *
 * <p>GetSourceUploadSignatureResponseBody</p>
 */
public class GetSourceUploadSignatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("contentType")
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("expiresIn")
    private Long expiresIn;

    @com.aliyun.core.annotation.NameInMap("filePublicUrl")
    private String filePublicUrl;

    @com.aliyun.core.annotation.NameInMap("fileRecordId")
    private String fileRecordId;

    @com.aliyun.core.annotation.NameInMap("fileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    @com.aliyun.core.annotation.NameInMap("objectName")
    private String objectName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("uploadSignatureUrl")
    private String uploadSignatureUrl;

    private GetSourceUploadSignatureResponseBody(Builder builder) {
        this.code = builder.code;
        this.contentType = builder.contentType;
        this.expiresIn = builder.expiresIn;
        this.filePublicUrl = builder.filePublicUrl;
        this.fileRecordId = builder.fileRecordId;
        this.fileUrl = builder.fileUrl;
        this.message = builder.message;
        this.method = builder.method;
        this.objectName = builder.objectName;
        this.requestId = builder.requestId;
        this.uploadSignatureUrl = builder.uploadSignatureUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSourceUploadSignatureResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return expiresIn
     */
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    /**
     * @return filePublicUrl
     */
    public String getFilePublicUrl() {
        return this.filePublicUrl;
    }

    /**
     * @return fileRecordId
     */
    public String getFileRecordId() {
        return this.fileRecordId;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return objectName
     */
    public String getObjectName() {
        return this.objectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadSignatureUrl
     */
    public String getUploadSignatureUrl() {
        return this.uploadSignatureUrl;
    }

    public static final class Builder {
        private String code; 
        private String contentType; 
        private Long expiresIn; 
        private String filePublicUrl; 
        private String fileRecordId; 
        private String fileUrl; 
        private String message; 
        private String method; 
        private String objectName; 
        private String requestId; 
        private String uploadSignatureUrl; 

        private Builder() {
        } 

        private Builder(GetSourceUploadSignatureResponseBody model) {
            this.code = model.code;
            this.contentType = model.contentType;
            this.expiresIn = model.expiresIn;
            this.filePublicUrl = model.filePublicUrl;
            this.fileRecordId = model.fileRecordId;
            this.fileUrl = model.fileUrl;
            this.message = model.message;
            this.method = model.method;
            this.objectName = model.objectName;
            this.requestId = model.requestId;
            this.uploadSignatureUrl = model.uploadSignatureUrl;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The content type. Valid values: Text and Markdown.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The validity period of the task, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder expiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * <p>The publicly accessible URL of the DingTalk online document.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        public Builder filePublicUrl(String filePublicUrl) {
            this.filePublicUrl = filePublicUrl;
            return this;
        }

        /**
         * <p>The file record ID. This parameter is optional and corresponds to settings.file_record_id.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleFileRecordId</p>
         */
        public Builder fileRecordId(String fileRecordId) {
            this.fileRecordId = fileRecordId;
            return this;
        }

        /**
         * <p>The Yida attachment URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        public Builder fileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * <p>The prompt message.</p>
         * 
         * <strong>example:</strong>
         * <p>The current zone list is illegal.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The method.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * <p>The object name.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The signed URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        public Builder uploadSignatureUrl(String uploadSignatureUrl) {
            this.uploadSignatureUrl = uploadSignatureUrl;
            return this;
        }

        public GetSourceUploadSignatureResponseBody build() {
            return new GetSourceUploadSignatureResponseBody(this);
        } 

    } 

}
