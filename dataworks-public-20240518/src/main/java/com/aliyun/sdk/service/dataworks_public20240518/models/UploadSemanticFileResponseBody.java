// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UploadSemanticFileResponseBody} extends {@link TeaModel}
 *
 * <p>UploadSemanticFileResponseBody</p>
 */
public class UploadSemanticFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UploadSemanticFileResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadSemanticFileResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UploadSemanticFileResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The attachment upload slot information. PUT the file to Data.UploadUrl before Data.ExpiresAt, then use Data.FileId to create a single-file semantic task.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
         * 
         * <strong>example:</strong>
         * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UploadSemanticFileResponseBody build() {
            return new UploadSemanticFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UploadSemanticFileResponseBody} extends {@link TeaModel}
     *
     * <p>UploadSemanticFileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiresAt")
        private Long expiresAt;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("UploadUrl")
        private String uploadUrl;

        private Data(Builder builder) {
            this.expiresAt = builder.expiresAt;
            this.fileId = builder.fileId;
            this.uploadUrl = builder.uploadUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return expiresAt
         */
        public Long getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return uploadUrl
         */
        public String getUploadUrl() {
            return this.uploadUrl;
        }

        public static final class Builder {
            private Long expiresAt; 
            private String fileId; 
            private String uploadUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.expiresAt = model.expiresAt;
                this.fileId = model.fileId;
                this.uploadUrl = model.uploadUrl;
            } 

            /**
             * <p>The expiration time of UploadUrl, expressed as a Unix timestamp in milliseconds. After this time, call UploadSemanticFile again to request a new URL.</p>
             * 
             * <strong>example:</strong>
             * <p>1700001800000</p>
             */
            public Builder expiresAt(Long expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>The unique identifier of the attachment. After completing the PUT upload to UploadUrl, pass this value to the ReferenceFileIds parameter of CreateSemanticJob.</p>
             * 
             * <strong>example:</strong>
             * <p>FID1</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The temporary OSS PUT upload URL. Valid for 30 minutes. Only the specified object can be uploaded. Use the ContentType from the request when performing the PUT request. Do not log or distribute the full URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/temporary-upload-url">https://example.com/temporary-upload-url</a></p>
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
