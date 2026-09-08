// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DescribeFileUploadSignatureResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFileUploadSignatureResponseBody</p>
 */
public class DescribeFileUploadSignatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeFileUploadSignatureResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileUploadSignatureResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeFileUploadSignatureResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter Tid is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0FEE5834-C55A-5995-A6A3-B443304965BD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeFileUploadSignatureResponseBody build() {
            return new DescribeFileUploadSignatureResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFileUploadSignatureResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileUploadSignatureResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OssCredential")
        private String ossCredential;

        @com.aliyun.core.annotation.NameInMap("OssDate")
        private String ossDate;

        @com.aliyun.core.annotation.NameInMap("OssSecurityToken")
        private String ossSecurityToken;

        @com.aliyun.core.annotation.NameInMap("OssSignature")
        private String ossSignature;

        @com.aliyun.core.annotation.NameInMap("OssSignatureVersion")
        private String ossSignatureVersion;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("UploadDir")
        private String uploadDir;

        @com.aliyun.core.annotation.NameInMap("UploadHost")
        private String uploadHost;

        private Data(Builder builder) {
            this.ossCredential = builder.ossCredential;
            this.ossDate = builder.ossDate;
            this.ossSecurityToken = builder.ossSecurityToken;
            this.ossSignature = builder.ossSignature;
            this.ossSignatureVersion = builder.ossSignatureVersion;
            this.policy = builder.policy;
            this.uploadDir = builder.uploadDir;
            this.uploadHost = builder.uploadHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ossCredential
         */
        public String getOssCredential() {
            return this.ossCredential;
        }

        /**
         * @return ossDate
         */
        public String getOssDate() {
            return this.ossDate;
        }

        /**
         * @return ossSecurityToken
         */
        public String getOssSecurityToken() {
            return this.ossSecurityToken;
        }

        /**
         * @return ossSignature
         */
        public String getOssSignature() {
            return this.ossSignature;
        }

        /**
         * @return ossSignatureVersion
         */
        public String getOssSignatureVersion() {
            return this.ossSignatureVersion;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return uploadDir
         */
        public String getUploadDir() {
            return this.uploadDir;
        }

        /**
         * @return uploadHost
         */
        public String getUploadHost() {
            return this.uploadHost;
        }

        public static final class Builder {
            private String ossCredential; 
            private String ossDate; 
            private String ossSecurityToken; 
            private String ossSignature; 
            private String ossSignatureVersion; 
            private String policy; 
            private String uploadDir; 
            private String uploadHost; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ossCredential = model.ossCredential;
                this.ossDate = model.ossDate;
                this.ossSecurityToken = model.ossSecurityToken;
                this.ossSignature = model.ossSignature;
                this.ossSignatureVersion = model.ossSignatureVersion;
                this.policy = model.policy;
                this.uploadDir = model.uploadDir;
                this.uploadHost = model.uploadHost;
            } 

            /**
             * <p>The parameter set that specifies the derived key.</p>
             */
            public Builder ossCredential(String ossCredential) {
                this.ossCredential = ossCredential;
                return this;
            }

            /**
             * <p>The time of the request. The format follows the ISO 8601 date and time standard.</p>
             * 
             * <strong>example:</strong>
             * <p>20260101T135341Z</p>
             */
            public Builder ossDate(String ossDate) {
                this.ossDate = ossDate;
                return this;
            }

            /**
             * <p>The STS token used to upload files to OSS. The token is valid for 1 hour.</p>
             * 
             * <strong>example:</strong>
             * <p>CAIS4gJ1q6Ft5B2yfSjIr5vPHMj4p+lHx/utUUjg13ptZ+5u3oDzkzz2IHhMdXlrCOgYt/8xnG1V6f8flrJ/ToQAX0HfatZq5ZkS9AqnaoXM/te496IFg5D9y7dIs8GgjqHoeOzcYI73WJXEMiLp9EJaxb/9ak/RPTiMOoGIjphKd8keWhLCAxNNGNZRIHkJyqZYTwyzU8ygKRn3mGHdIVN1sw5n8wNF5L+439eX52i17jS46JdM/9ysesH5NpQxbMwkDYnk5oEsKPqdihw3wgNR6aJ7gJZD/Tr6pdyHCzFTmU7ea7uEqYw3clYiOPBnRvEd8eKPnPl5q/HVm4Hs0wxKNuxOSCXZS4yp3MLeH+ekJgOGwWFHz9qnOLmtQXqV22tMCRpzXIj6Zlmz+/reI6iNW+Ory74mxSFbrz3ZP4yv+o+Yv3QbMVumcySkKVbBbVvnv0R8GNsIC2lMUbp+rfShhfFuG2QagAECCyigwAlSAryrFmteD+EVuvxvi0NE7zDJLbUkhek6dcY+/u5V5jcmvL67CQ7bTNk+9lV8WDCvtoCD9ucqTaHweJEd8fS2DaFedAMDf8BfZa2C1CTLhVXdSgE2WORYbMqidelRm7dH3fTbZVvryWKDaveDRLt5J/Qfs**********</p>
             */
            public Builder ossSecurityToken(String ossSecurityToken) {
                this.ossSecurityToken = ossSecurityToken;
                return this;
            }

            /**
             * <p>The description information used for signature authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>9bebe0900716bdefaab899781c7bdfd614ec6ed711e0de5ddf6f5a**********</p>
             */
            public Builder ossSignature(String ossSignature) {
                this.ossSignature = ossSignature;
                return this;
            }

            /**
             * <p>The version and algorithm of the signature.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS4-HMAC-SHA256</p>
             */
            public Builder ossSignatureVersion(String ossSignatureVersion) {
                this.ossSignatureVersion = ossSignatureVersion;
                return this;
            }

            /**
             * <p>The permission restrictions and constraints for file uploads.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJjb25kaXRpb25zIjpbeyJ4LW9zcy1jcmVkZW50aWFsIjoiU1RTLk5YeldyTEo2ZnA5RlNuUTN6OGthQjFFWH**********</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The path for file uploads.</p>
             */
            public Builder uploadDir(String uploadDir) {
                this.uploadDir = uploadDir;
                return this;
            }

            /**
             * <p>The destination address for file uploads.</p>
             * 
             * <strong>example:</strong>
             * <p>https://**********.oss-cn-hangzhou.aliyuncs.com</p>
             */
            public Builder uploadHost(String uploadHost) {
                this.uploadHost = uploadHost;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
