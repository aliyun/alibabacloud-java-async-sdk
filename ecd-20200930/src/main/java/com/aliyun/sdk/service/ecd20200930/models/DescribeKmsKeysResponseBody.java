// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKmsKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKmsKeysResponseBody</p>
 */
public class DescribeKmsKeysResponseBody extends TeaModel {
    @NameInMap("AuthorizeStatus")
    private String authorizeStatus;

    @NameInMap("Keys")
    private java.util.List < Keys> keys;

    @NameInMap("KmsServiceStatus")
    private String kmsServiceStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeKmsKeysResponseBody(Builder builder) {
        this.authorizeStatus = builder.authorizeStatus;
        this.keys = builder.keys;
        this.kmsServiceStatus = builder.kmsServiceStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKmsKeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizeStatus
     */
    public String getAuthorizeStatus() {
        return this.authorizeStatus;
    }

    /**
     * @return keys
     */
    public java.util.List < Keys> getKeys() {
        return this.keys;
    }

    /**
     * @return kmsServiceStatus
     */
    public String getKmsServiceStatus() {
        return this.kmsServiceStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String authorizeStatus; 
        private java.util.List < Keys> keys; 
        private String kmsServiceStatus; 
        private String requestId; 

        /**
         * The authorization status.
         */
        public Builder authorizeStatus(String authorizeStatus) {
            this.authorizeStatus = authorizeStatus;
            return this;
        }

        /**
         * Details about the customer master keys (CMKs).
         */
        public Builder keys(java.util.List < Keys> keys) {
            this.keys = keys;
            return this;
        }

        /**
         * Indicates whether KMS is activated.
         */
        public Builder kmsServiceStatus(String kmsServiceStatus) {
            this.kmsServiceStatus = kmsServiceStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeKmsKeysResponseBody build() {
            return new DescribeKmsKeysResponseBody(this);
        } 

    } 

    public static class Keys extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("Arn")
        private String arn;

        @NameInMap("KeyId")
        private String keyId;

        @NameInMap("Type")
        private String type;

        private Keys(Builder builder) {
            this.alias = builder.alias;
            this.arn = builder.arn;
            this.keyId = builder.keyId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Keys create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String alias; 
            private String arn; 
            private String keyId; 
            private String type; 

            /**
             * The alias of the key.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the key in KMS.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The ID of the key.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * The type of the key.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Keys build() {
                return new Keys(this);
            } 

        } 

    }
}
