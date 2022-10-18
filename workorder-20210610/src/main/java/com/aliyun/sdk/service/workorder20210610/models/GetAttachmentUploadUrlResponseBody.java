// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAttachmentUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetAttachmentUploadUrlResponseBody</p>
 */
public class GetAttachmentUploadUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetAttachmentUploadUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttachmentUploadUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAttachmentUploadUrlResponseBody build() {
            return new GetAttachmentUploadUrlResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("GetSignedUrl")
        private String getSignedUrl;

        @NameInMap("ObjectKey")
        private String objectKey;

        @NameInMap("PutSignedUrl")
        private String putSignedUrl;

        private Data(Builder builder) {
            this.getSignedUrl = builder.getSignedUrl;
            this.objectKey = builder.objectKey;
            this.putSignedUrl = builder.putSignedUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return getSignedUrl
         */
        public String getGetSignedUrl() {
            return this.getSignedUrl;
        }

        /**
         * @return objectKey
         */
        public String getObjectKey() {
            return this.objectKey;
        }

        /**
         * @return putSignedUrl
         */
        public String getPutSignedUrl() {
            return this.putSignedUrl;
        }

        public static final class Builder {
            private String getSignedUrl; 
            private String objectKey; 
            private String putSignedUrl; 

            /**
             * GetSignedUrl.
             */
            public Builder getSignedUrl(String getSignedUrl) {
                this.getSignedUrl = getSignedUrl;
                return this;
            }

            /**
             * ObjectKey.
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
                return this;
            }

            /**
             * PutSignedUrl.
             */
            public Builder putSignedUrl(String putSignedUrl) {
                this.putSignedUrl = putSignedUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
