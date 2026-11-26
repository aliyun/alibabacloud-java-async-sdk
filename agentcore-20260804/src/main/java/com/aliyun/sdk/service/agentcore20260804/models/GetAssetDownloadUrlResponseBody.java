// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetAssetDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetAssetDownloadUrlResponseBody</p>
 */
public class GetAssetDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetAssetDownloadUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetDownloadUrlResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAssetDownloadUrlResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The stable result code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The time-limited presigned GET URL and file information for the published original file. A status conflict is returned if no published result is available.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The actual HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The description of the data masking result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01A00000-0000-0000-0000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAssetDownloadUrlResponseBody build() {
            return new GetAssetDownloadUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAssetDownloadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssetDownloadUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assetId")
        private String assetId;

        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("downloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("expiresAt")
        private String expiresAt;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        private Data(Builder builder) {
            this.assetId = builder.assetId;
            this.contentType = builder.contentType;
            this.downloadUrl = builder.downloadUrl;
            this.expiresAt = builder.expiresAt;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assetId
         */
        public String getAssetId() {
            return this.assetId;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return expiresAt
         */
        public String getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String assetId; 
            private String contentType; 
            private String downloadUrl; 
            private String expiresAt; 
            private String fileName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.assetId = model.assetId;
                this.contentType = model.contentType;
                this.downloadUrl = model.downloadUrl;
                this.expiresAt = model.expiresAt;
                this.fileName = model.fileName;
            } 

            /**
             * <p>The ID of the target asset to download.</p>
             * 
             * <strong>example:</strong>
             * <p>asset-001</p>
             */
            public Builder assetId(String assetId) {
                this.assetId = assetId;
                return this;
            }

            /**
             * <p>The MIME type of the published original file.</p>
             * 
             * <strong>example:</strong>
             * <p>application/pdf</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The short-term presigned GET URL authorized only for downloading the published original object, using a unified OSS public endpoint. Long-term credentials are not returned, and the URL is not recorded in common logs.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/tenants/1234567890123456/workspaces/ws-001/kb/kb-001/assets/asset-001/original/upload-001/source?signature=REDACTED">https://example.com/tenants/1234567890123456/workspaces/ws-001/kb/kb-001/assets/asset-001/original/upload-001/source?signature=REDACTED</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The expiration time in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-27T02:15:00Z</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>The file name of the published original file.</p>
             * 
             * <strong>example:</strong>
             * <p>guide.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
