// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetSecretResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecretResponseBody</p>
 */
public class GetSecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetSecretResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecretResponseBody create() {
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
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSecretResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The key information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CE857A85-251D-5018-8103-A38957D71E20</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSecretResponseBody build() {
            return new GetSecretResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecretResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecretResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("gatewayType")
        private String gatewayType;

        @com.aliyun.core.annotation.NameInMap("kmsConfig")
        private KMSConfig kmsConfig;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("referenceCount")
        private Integer referenceCount;

        @com.aliyun.core.annotation.NameInMap("secretId")
        private String secretId;

        @com.aliyun.core.annotation.NameInMap("secretSource")
        private String secretSource;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updateTimestamp")
        private Long updateTimestamp;

        private Data(Builder builder) {
            this.createTimestamp = builder.createTimestamp;
            this.gatewayType = builder.gatewayType;
            this.kmsConfig = builder.kmsConfig;
            this.name = builder.name;
            this.referenceCount = builder.referenceCount;
            this.secretId = builder.secretId;
            this.secretSource = builder.secretSource;
            this.status = builder.status;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return gatewayType
         */
        public String getGatewayType() {
            return this.gatewayType;
        }

        /**
         * @return kmsConfig
         */
        public KMSConfig getKmsConfig() {
            return this.kmsConfig;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return referenceCount
         */
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        /**
         * @return secretId
         */
        public String getSecretId() {
            return this.secretId;
        }

        /**
         * @return secretSource
         */
        public String getSecretSource() {
            return this.secretSource;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private Long createTimestamp; 
            private String gatewayType; 
            private KMSConfig kmsConfig; 
            private String name; 
            private Integer referenceCount; 
            private String secretId; 
            private String secretSource; 
            private String status; 
            private Long updateTimestamp; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTimestamp = model.createTimestamp;
                this.gatewayType = model.gatewayType;
                this.kmsConfig = model.kmsConfig;
                this.name = model.name;
                this.referenceCount = model.referenceCount;
                this.secretId = model.secretId;
                this.secretSource = model.secretSource;
                this.status = model.status;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * <p>The creation timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The type of the gateway. Valid values:</p>
             * <ul>
             * <li>API</li>
             * <li>AI</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>API</p>
             */
            public Builder gatewayType(String gatewayType) {
                this.gatewayType = gatewayType;
                return this;
            }

            /**
             * <p>The KMS configuration information.</p>
             */
            public Builder kmsConfig(KMSConfig kmsConfig) {
                this.kmsConfig = kmsConfig;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>mysecret</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of resources that reference the current key.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder referenceCount(Integer referenceCount) {
                this.referenceCount = referenceCount;
                return this;
            }

            /**
             * <p>The ID of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>sec-d5e6shmm1hkoxxxxxxxx</p>
             */
            public Builder secretId(String secretId) {
                this.secretId = secretId;
                return this;
            }

            /**
             * <p>The source of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>KMS</p>
             */
            public Builder secretSource(String secretSource) {
                this.secretSource = secretSource;
                return this;
            }

            /**
             * <p>The state of the key. Valid values:</p>
             * <ul>
             * <li>ENALBE</li>
             * <li>DISABLE</li>
             * <li>DELETED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ENALBE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The update timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1725868548440</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
