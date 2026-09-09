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
 * {@link GetSkillImportFileUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetSkillImportFileUrlResponseBody</p>
 */
public class GetSkillImportFileUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetSkillImportFileUrlResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillImportFileUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSkillImportFileUrlResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSkillImportFileUrlResponseBody build() {
            return new GetSkillImportFileUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSkillImportFileUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetSkillImportFileUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("maxSize")
        private String maxSize;

        @com.aliyun.core.annotation.NameInMap("ossObjectName")
        private String ossObjectName;

        @com.aliyun.core.annotation.NameInMap("uploadUrl")
        private String uploadUrl;

        private Data(Builder builder) {
            this.contentType = builder.contentType;
            this.maxSize = builder.maxSize;
            this.ossObjectName = builder.ossObjectName;
            this.uploadUrl = builder.uploadUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return maxSize
         */
        public String getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return ossObjectName
         */
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        /**
         * @return uploadUrl
         */
        public String getUploadUrl() {
            return this.uploadUrl;
        }

        public static final class Builder {
            private String contentType; 
            private String maxSize; 
            private String ossObjectName; 
            private String uploadUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contentType = model.contentType;
                this.maxSize = model.maxSize;
                this.ossObjectName = model.ossObjectName;
                this.uploadUrl = model.uploadUrl;
            } 

            /**
             * <p>The Content-Type of the upload file.</p>
             * 
             * <strong>example:</strong>
             * <p>application/zip</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The maximum file size allowed for upload, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10485760</p>
             */
            public Builder maxSize(String maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * <p>The OSS object name.</p>
             * 
             * <strong>example:</strong>
             * <p>imports/example.zip</p>
             */
            public Builder ossObjectName(String ossObjectName) {
                this.ossObjectName = ossObjectName;
                return this;
            }

            /**
             * <p>The OSS pre-signed upload URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/artifacts/example.zip">https://example.com/artifacts/example.zip</a></p>
             */
            public Builder uploadUrl(String uploadUrl) {
                this.uploadUrl = uploadUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
