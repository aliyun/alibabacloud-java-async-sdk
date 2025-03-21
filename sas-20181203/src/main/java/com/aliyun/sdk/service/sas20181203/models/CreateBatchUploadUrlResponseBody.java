// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateBatchUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBatchUploadUrlResponseBody</p>
 */
public class CreateBatchUploadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadUrlList")
    private java.util.List<UploadUrlList> uploadUrlList;

    private CreateBatchUploadUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uploadUrlList = builder.uploadUrlList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBatchUploadUrlResponseBody create() {
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
    public java.util.List<UploadUrlList> getUploadUrlList() {
        return this.uploadUrlList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<UploadUrlList> uploadUrlList; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>DA62490B-7883-5EB4-8601-F2D1D9******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array consisting of the parameters that are required to upload a file.</p>
         */
        public Builder uploadUrlList(java.util.List<UploadUrlList> uploadUrlList) {
            this.uploadUrlList = uploadUrlList;
            return this;
        }

        public CreateBatchUploadUrlResponseBody build() {
            return new CreateBatchUploadUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateBatchUploadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>CreateBatchUploadUrlResponseBody</p>
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
             * <p>eyJleHBpcmF0aW9uIjoiMjAyMi0wNy0yM1QxMDo1ODoxMC****</p>
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
     * {@link CreateBatchUploadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>CreateBatchUploadUrlResponseBody</p>
     */
    public static class UploadUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Context")
        private Context context;

        @com.aliyun.core.annotation.NameInMap("Expire")
        private String expire;

        @com.aliyun.core.annotation.NameInMap("FileExist")
        private Boolean fileExist;

        @com.aliyun.core.annotation.NameInMap("InternalUrl")
        private String internalUrl;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("PublicUrl")
        private String publicUrl;

        private UploadUrlList(Builder builder) {
            this.context = builder.context;
            this.expire = builder.expire;
            this.fileExist = builder.fileExist;
            this.internalUrl = builder.internalUrl;
            this.md5 = builder.md5;
            this.publicUrl = builder.publicUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadUrlList create() {
            return builder().build();
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
         * @return internalUrl
         */
        public String getInternalUrl() {
            return this.internalUrl;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return publicUrl
         */
        public String getPublicUrl() {
            return this.publicUrl;
        }

        public static final class Builder {
            private Context context; 
            private String expire; 
            private Boolean fileExist; 
            private String internalUrl; 
            private String md5; 
            private String publicUrl; 

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
             * <p>The identifier of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>2f8dc248a0fbb96c69e45acad2******</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
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
