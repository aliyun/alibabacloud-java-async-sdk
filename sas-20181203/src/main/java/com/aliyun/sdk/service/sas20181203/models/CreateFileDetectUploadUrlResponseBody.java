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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UploadUrlList.
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
             * AccessId.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * OssKey.
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * Signature.
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Context.
             */
            public Builder context(Context context) {
                this.context = context;
                return this;
            }

            /**
             * Expire.
             */
            public Builder expire(String expire) {
                this.expire = expire;
                return this;
            }

            /**
             * FileExist.
             */
            public Builder fileExist(Boolean fileExist) {
                this.fileExist = fileExist;
                return this;
            }

            /**
             * HashKey.
             */
            public Builder hashKey(String hashKey) {
                this.hashKey = hashKey;
                return this;
            }

            /**
             * InternalUrl.
             */
            public Builder internalUrl(String internalUrl) {
                this.internalUrl = internalUrl;
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
             * PublicUrl.
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
