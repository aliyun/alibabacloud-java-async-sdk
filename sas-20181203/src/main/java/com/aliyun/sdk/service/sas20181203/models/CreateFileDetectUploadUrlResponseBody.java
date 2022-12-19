// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileDetectUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFileDetectUploadUrlResponseBody</p>
 */
public class CreateFileDetectUploadUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UploadUrlList")
    private java.util.List < UploadUrlList> uploadUrlList;

    private CreateFileDetectUploadUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uploadUrlList = builder.uploadUrlList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileDetectUploadUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadUrlList
     */
    public java.util.List < UploadUrlList> getUploadUrlList() {
        return this.uploadUrlList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < UploadUrlList> uploadUrlList; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array consisting of the parameters that are required to upload a file.
         */
        public Builder uploadUrlList(java.util.List < UploadUrlList> uploadUrlList) {
            this.uploadUrlList = uploadUrlList;
            return this;
        }

        public CreateFileDetectUploadUrlResponseBody build() {
            return new CreateFileDetectUploadUrlResponseBody(this);
        } 

    } 

    public static class Context extends TeaModel {
        @NameInMap("AccessId")
        private String accessId;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Signature")
        private String signature;

        private Context(Builder builder) {
            this.accessId = builder.accessId;
            this.ossKey = builder.ossKey;
            this.policy = builder.policy;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Context create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        public static final class Builder {
            private String accessId; 
            private String ossKey; 
            private String policy; 
            private String signature; 

            /**
             * The AccessKey ID that is used to access the OSS bucket.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * The key of the file that is used after the file is uploaded to the OSS bucket.
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * The policy that poses limits on file upload. For example, the policy limits the size of the file.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The signature that is used to upload the file.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public Context build() {
                return new Context(this);
            } 

        } 

    }
    public static class UploadUrlList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Context")
        private Context context;

        @NameInMap("Expire")
        private String expire;

        @NameInMap("FileExist")
        private Boolean fileExist;

        @NameInMap("HashKey")
        private String hashKey;

        @NameInMap("InternalUrl")
        private String internalUrl;

        @NameInMap("Message")
        private String message;

        @NameInMap("PublicUrl")
        private String publicUrl;

        private UploadUrlList(Builder builder) {
            this.code = builder.code;
            this.context = builder.context;
            this.expire = builder.expire;
            this.fileExist = builder.fileExist;
            this.hashKey = builder.hashKey;
            this.internalUrl = builder.internalUrl;
            this.message = builder.message;
            this.publicUrl = builder.publicUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadUrlList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return context
         */
        public Context getContext() {
            return this.context;
        }

        /**
         * @return expire
         */
        public String getExpire() {
            return this.expire;
        }

        /**
         * @return fileExist
         */
        public Boolean getFileExist() {
            return this.fileExist;
        }

        /**
         * @return hashKey
         */
        public String getHashKey() {
            return this.hashKey;
        }

        /**
         * @return internalUrl
         */
        public String getInternalUrl() {
            return this.internalUrl;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return publicUrl
         */
        public String getPublicUrl() {
            return this.publicUrl;
        }

        public static final class Builder {
            private String code; 
            private Context context; 
            private String expire; 
            private Boolean fileExist; 
            private String hashKey; 
            private String internalUrl; 
            private String message; 
            private String publicUrl; 

            /**
             * The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The signature information.
             */
            public Builder context(Context context) {
                this.context = context;
                return this;
            }

            /**
             * The timestamp when the values of the parameters expire. Unit: milliseconds.
             */
            public Builder expire(String expire) {
                this.expire = expire;
                return this;
            }

            /**
             * Indicates whether the file exists in the cloud. Valid values:
             * <p>
             * 
             * *   **true**: The file exists in the cloud. You do not need to upload the file.
             * *   **false**: The file does not exist in the cloud. You must upload the file.
             */
            public Builder fileExist(Boolean fileExist) {
                this.fileExist = fileExist;
                return this;
            }

            /**
             * The identifier of the file.
             */
            public Builder hashKey(String hashKey) {
                this.hashKey = hashKey;
                return this;
            }

            /**
             * The internal endpoint of the URL to which the file is uploaded.
             */
            public Builder internalUrl(String internalUrl) {
                this.internalUrl = internalUrl;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The public endpoint of the URL to which the file is uploaded.
             */
            public Builder publicUrl(String publicUrl) {
                this.publicUrl = publicUrl;
                return this;
            }

            public UploadUrlList build() {
                return new UploadUrlList(this);
            } 

        } 

    }
}
