// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateUploadTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateUploadTokenResponseBody</p>
 */
public class GenerateUploadTokenResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GenerateUploadTokenResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUploadTokenResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateUploadTokenResponseBody build() {
            return new GenerateUploadTokenResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("OssAccessKeyId")
        private String ossAccessKeyId;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("ServerURL")
        private String serverURL;

        @NameInMap("Signature")
        private String signature;

        @NameInMap("X-Amz-Algorithm")
        private String xAmzAlgorithm;

        @NameInMap("X-Amz-Credential")
        private String xAmzCredential;

        @NameInMap("X-Amz-Date")
        private String xAmzDate;

        @NameInMap("X-Amz-Signature")
        private String xAmzSignature;

        private Data(Builder builder) {
            this.key = builder.key;
            this.ossAccessKeyId = builder.ossAccessKeyId;
            this.policy = builder.policy;
            this.serverURL = builder.serverURL;
            this.signature = builder.signature;
            this.xAmzAlgorithm = builder.xAmzAlgorithm;
            this.xAmzCredential = builder.xAmzCredential;
            this.xAmzDate = builder.xAmzDate;
            this.xAmzSignature = builder.xAmzSignature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return ossAccessKeyId
         */
        public String getOssAccessKeyId() {
            return this.ossAccessKeyId;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return serverURL
         */
        public String getServerURL() {
            return this.serverURL;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return xAmzAlgorithm
         */
        public String getXAmzAlgorithm() {
            return this.xAmzAlgorithm;
        }

        /**
         * @return xAmzCredential
         */
        public String getXAmzCredential() {
            return this.xAmzCredential;
        }

        /**
         * @return xAmzDate
         */
        public String getXAmzDate() {
            return this.xAmzDate;
        }

        /**
         * @return xAmzSignature
         */
        public String getXAmzSignature() {
            return this.xAmzSignature;
        }

        public static final class Builder {
            private String key; 
            private String ossAccessKeyId; 
            private String policy; 
            private String serverURL; 
            private String signature; 
            private String xAmzAlgorithm; 
            private String xAmzCredential; 
            private String xAmzDate; 
            private String xAmzSignature; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * OssAccessKeyId.
             */
            public Builder ossAccessKeyId(String ossAccessKeyId) {
                this.ossAccessKeyId = ossAccessKeyId;
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
             * ServerURL.
             */
            public Builder serverURL(String serverURL) {
                this.serverURL = serverURL;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * X-Amz-Algorithm.
             */
            public Builder xAmzAlgorithm(String xAmzAlgorithm) {
                this.xAmzAlgorithm = xAmzAlgorithm;
                return this;
            }

            /**
             * X-Amz-Credential.
             */
            public Builder xAmzCredential(String xAmzCredential) {
                this.xAmzCredential = xAmzCredential;
                return this;
            }

            /**
             * X-Amz-Date.
             */
            public Builder xAmzDate(String xAmzDate) {
                this.xAmzDate = xAmzDate;
                return this;
            }

            /**
             * X-Amz-Signature.
             */
            public Builder xAmzSignature(String xAmzSignature) {
                this.xAmzSignature = xAmzSignature;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
