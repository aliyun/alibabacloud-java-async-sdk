// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateFileDetectUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFileDetectUploadUrlResponseBody</p>
 */
public class CreateFileDetectUploadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadUrlList")
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8BF6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array consisting of the parameters that are required to upload a file.</p>
         */
        public Builder uploadUrlList(java.util.List < UploadUrlList> uploadUrlList) {
            this.uploadUrlList = uploadUrlList;
            return this;
        }

        public CreateFileDetectUploadUrlResponseBody build() {
            return new CreateFileDetectUploadUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateFileDetectUploadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>CreateFileDetectUploadUrlResponseBody</p>
     */
    public static class Context extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessId")
        private String accessId;

        @com.aliyun.core.annotation.NameInMap("OssKey")
        private String ossKey;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Signature")
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
             * <p>The AccessKey ID that is used to access the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>LTAI4G1mgPbjvGQuiV1X****</p>
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * <p>The key of the file that is used after the file is uploaded to the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>1/2022/06/23/15/41/16559701077444693a0c6-33b2-4cc2-a99f-9f38b8b8****</p>
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * <p>The policy that poses limits on file upload. For example, the policy can limit the size of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJleHBpcmF0aW9uIjoiMjAyMi0wNy0yM1QxMDo1ODoxMC43NTNaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMjA5NzE1MjBdLFsiZXEiLCIka2V5IiwiMS8yMDIyLzA2LzIzLzE4LzU4LzE2NTU5ODE4OTA3NTM4NTc2MjFkNS1kN2E1LTQ5YzAtOGJjZi0yMTMyY2JiYTdmYzMi****</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The signature that is used to upload the file.</p>
             * 
             * <strong>example:</strong>
             * <p>wDhPgVdnY/bkKFYcYFl+4crl****</p>
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
    /**
     * 
     * {@link CreateFileDetectUploadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>CreateFileDetectUploadUrlResponseBody</p>
     */
    public static class UploadUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Context")
        private Context context;

        @com.aliyun.core.annotation.NameInMap("Expire")
        private String expire;

        @com.aliyun.core.annotation.NameInMap("FileExist")
        private Boolean fileExist;

        @com.aliyun.core.annotation.NameInMap("HashKey")
        private String hashKey;

        @com.aliyun.core.annotation.NameInMap("InternalUrl")
        private String internalUrl;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PublicUrl")
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
             * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The signature information.</p>
             */
            public Builder context(Context context) {
                this.context = context;
                return this;
            }

            /**
             * <p>The timestamp when the values of the parameters expire. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1658562101370</p>
             */
            public Builder expire(String expire) {
                this.expire = expire;
                return this;
            }

            /**
             * <p>Indicates whether the file exists in the cloud. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The file exists in the cloud. You do not need to upload the file.</li>
             * <li><strong>false</strong>: The file does not exist in the cloud. You must upload the file.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder fileExist(Boolean fileExist) {
                this.fileExist = fileExist;
                return this;
            }

            /**
             * <p>The identifier of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>0a212417e65c26ff133cfff28f6c****</p>
             */
            public Builder hashKey(String hashKey) {
                this.hashKey = hashKey;
                return this;
            }

            /**
             * <p>The internal endpoint of the URL to which the file is uploaded.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com">http://example.com</a></p>
             */
            public Builder internalUrl(String internalUrl) {
                this.internalUrl = internalUrl;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The public endpoint of the URL to which the file is uploaded.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com">http://example.com</a></p>
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
