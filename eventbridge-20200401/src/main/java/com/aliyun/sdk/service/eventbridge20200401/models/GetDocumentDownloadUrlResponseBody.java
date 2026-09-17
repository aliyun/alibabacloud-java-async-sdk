// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link GetDocumentDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetDocumentDownloadUrlResponseBody</p>
 */
public class GetDocumentDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDocumentDownloadUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentDownloadUrlResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDocumentDownloadUrlResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. A value of Success indicates a successful call. If the call fails, a specific error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The document download URL information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned by the operation. A value of Operation success indicates a successful call. If the call fails, a specific error description is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Operation success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. A value of true indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDocumentDownloadUrlResponseBody build() {
            return new GetDocumentDownloadUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDocumentDownloadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocumentDownloadUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ExpireAt")
        private String expireAt;

        private Data(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.expireAt = builder.expireAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return expireAt
         */
        public String getExpireAt() {
            return this.expireAt;
        }

        public static final class Builder {
            private String downloadUrl; 
            private String expireAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.downloadUrl = model.downloadUrl;
                this.expireAt = model.expireAt;
            } 

            /**
             * <p>A short-lived GET pre-signed URL that the client uses to download the original file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://my-bucket.oss-cn-hangzhou.aliyuncs.com/kb/doc-bp1xxxxxxxxxxxx?Expires=1788000000&Signature=xxxx">https://my-bucket.oss-cn-hangzhou.aliyuncs.com/kb/doc-bp1xxxxxxxxxxxx?Expires=1788000000&amp;Signature=xxxx</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The expiration time of the pre-signed download URL, in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>1756022400000</p>
             */
            public Builder expireAt(String expireAt) {
                this.expireAt = expireAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
