// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetAudioNoteUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetAudioNoteUploadUrlResponseBody</p>
 */
public class GetAudioNoteUploadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

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

    private GetAudioNoteUploadUrlResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAudioNoteUploadUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAudioNoteUploadUrlResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The detailed reason why access is denied.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The status code description.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE339D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAudioNoteUploadUrlResponseBody build() {
            return new GetAudioNoteUploadUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAudioNoteUploadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetAudioNoteUploadUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("Expire")
        private String expire;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MaxFileSize")
        private Long maxFileSize;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("UploadUrl")
        private String uploadUrl;

        private Data(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.expire = builder.expire;
            this.filePath = builder.filePath;
            this.host = builder.host;
            this.key = builder.key;
            this.maxFileSize = builder.maxFileSize;
            this.method = builder.method;
            this.policy = builder.policy;
            this.securityToken = builder.securityToken;
            this.signature = builder.signature;
            this.uploadUrl = builder.uploadUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return expire
         */
        public String getExpire() {
            return this.expire;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return maxFileSize
         */
        public Long getMaxFileSize() {
            return this.maxFileSize;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return uploadUrl
         */
        public String getUploadUrl() {
            return this.uploadUrl;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String expire; 
            private String filePath; 
            private String host; 
            private String key; 
            private Long maxFileSize; 
            private String method; 
            private String policy; 
            private String securityToken; 
            private String signature; 
            private String uploadUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessKeyId = model.accessKeyId;
                this.expire = model.expire;
                this.filePath = model.filePath;
                this.host = model.host;
                this.key = model.key;
                this.maxFileSize = model.maxFileSize;
                this.method = model.method;
                this.policy = model.policy;
                this.securityToken = model.securityToken;
                this.signature = model.signature;
                this.uploadUrl = model.uploadUrl;
            } 

            /**
             * <p>The AccessKey ID used for signing.</p>
             * 
             * <strong>example:</strong>
             * <p>STS.NYMxfDw3GkXfvEmZHXXXXXX</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The expiration time of the authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-13T12:19:13Z</p>
             */
            public Builder expire(String expire) {
                this.expire = expire;
                return this;
            }

            /**
             * <p>The storage path of the OSS file.</p>
             * 
             * <strong>example:</strong>
             * <p>audio/file/sample1</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The host address.</p>
             * 
             * <strong>example:</strong>
             * <p>//alicom-voice-ai-agent-xxxx.oss-cn-xxxx.aliyuncs.com</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The key of the OSS file.</p>
             * 
             * <strong>example:</strong>
             * <p>audio/file/sample1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The maximum file size.</p>
             * 
             * <strong>example:</strong>
             * <p>2560000</p>
             */
            public Builder maxFileSize(Long maxFileSize) {
                this.maxFileSize = maxFileSize;
                return this;
            }

            /**
             * <p>The HTTP method used for upload.</p>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The upload policy.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The authorization licensing key.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * <p>The signature of the temporary upload credential, used to verify legitimacy during upload.</p>
             * 
             * <strong>example:</strong>
             * <p>oss sig text</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>The upload URL.</p>
             * 
             * <strong>example:</strong>
             * <p>//alicom-voice-ai-agent-xxxx.oss-cn-xxxx.aliyuncs.com</p>
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
