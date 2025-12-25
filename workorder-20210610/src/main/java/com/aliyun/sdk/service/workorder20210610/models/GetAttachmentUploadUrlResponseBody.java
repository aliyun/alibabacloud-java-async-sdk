// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

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
 * {@link GetAttachmentUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetAttachmentUploadUrlResponseBody</p>
 */
public class GetAttachmentUploadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAttachmentUploadUrlResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned after the call succeeds.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message. If success is set to false, the message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ED195C2C-787F-511C-8204-714456781861</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. A value of true indicates that the call is normal.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAttachmentUploadUrlResponseBody build() {
            return new GetAttachmentUploadUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAttachmentUploadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetAttachmentUploadUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GetSignedUrl")
        private String getSignedUrl;

        @com.aliyun.core.annotation.NameInMap("ObjectKey")
        private String objectKey;

        @com.aliyun.core.annotation.NameInMap("PutSignedUrl")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.getSignedUrl = model.getSignedUrl;
                this.objectKey = model.objectKey;
                this.putSignedUrl = model.putSignedUrl;
            } 

            /**
             * <p>Query the signed URL of an OSS object</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://gts-workorder-pre.oss-cn-beijing.aliyuncs.com">https://gts-workorder-pre.oss-cn-beijing.aliyuncs.com</a>
             * /20220314/cabb80c3-430b-4079-a9f2-d2a0d1c2a587.png?Expires=1647328689&amp;OSSAccessKeyId=LTAI****************&amp;Signature=AbSEh26G3oYrJ8ivr4B0xzF89zk%3D</p>
             */
            public Builder getSignedUrl(String getSignedUrl) {
                this.getSignedUrl = getSignedUrl;
                return this;
            }

            /**
             * <p>Uploaded file identifier</p>
             * 
             * <strong>example:</strong>
             * <p>cdb5d174-c282-4b2d-9048-e74ea2223127.jpg</p>
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
                return this;
            }

            /**
             * <p>The signed URL used to upload the object to OSS.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://gts-workorder-pre.oss-cn-beijing.aliyuncs.com">https://gts-workorder-pre.oss-cn-beijing.aliyuncs.com</a>
             * /20220314/cabb80c3-430b-4079-a9f2-d2a0d1c2a587.png?Expires=1647328689&amp;OSSAccessKeyId=LTAI****************&amp;Signature=AbSEh26G3oYrJ8ivr4B0xzF89zk%3D</p>
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
