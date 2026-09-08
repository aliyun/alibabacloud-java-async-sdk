// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetAudioFileUploadParametersResponseBody} extends {@link TeaModel}
 *
 * <p>GetAudioFileUploadParametersResponseBody</p>
 */
public class GetAudioFileUploadParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAudioFileUploadParametersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAudioFileUploadParametersResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAudioFileUploadParametersResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C81FD1A5-4B99-470A-A527-D80150228784</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAudioFileUploadParametersResponseBody build() {
            return new GetAudioFileUploadParametersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAudioFileUploadParametersResponseBody} extends {@link TeaModel}
     *
     * <p>GetAudioFileUploadParametersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Integer expireTime;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        private Data(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.expireTime = builder.expireTime;
            this.filePath = builder.filePath;
            this.host = builder.host;
            this.policy = builder.policy;
            this.signature = builder.signature;
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
         * @return expireTime
         */
        public Integer getExpireTime() {
            return this.expireTime;
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
            private String accessKeyId; 
            private Integer expireTime; 
            private String filePath; 
            private String host; 
            private String policy; 
            private String signature; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessKeyId = model.accessKeyId;
                this.expireTime = model.expireTime;
                this.filePath = model.filePath;
                this.host = model.host;
                this.policy = model.policy;
                this.signature = model.signature;
            } 

            /**
             * <p>AccessKey ID used for signing.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>Expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>1647313420</p>
             */
            public Builder expireTime(Integer expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Key of the OSS file.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test/test-file.wav</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>Endpoint domain name of OSS.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com">https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com</a></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>Signature policy.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJleHBpcmF0aW9uIjoiMjAyMi0wNi0yOVQwMDoyOTowMC42NTRaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjBdLFsic3RhcnRzLXdpdGgiLCIka2V5IiwiYXVkaW8vMTU3NzI0NzExNTQ5MDQwMS9seS1vbmxpbmUvMjAyMjA2MjkwNzI5MDAvIl1d****</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>Signature information of the temporary credential for file upload, used to authenticate the upload request.</p>
             * 
             * <strong>example:</strong>
             * <p>HIyClras8IcVlbTV7RIJWJbU****</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
