// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKeyVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKeyVersionResponseBody</p>
 */
public class DescribeKeyVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyVersion")
    private KeyVersion keyVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeKeyVersionResponseBody(Builder builder) {
        this.keyVersion = builder.keyVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKeyVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return keyVersion
     */
    public KeyVersion getKeyVersion() {
        return this.keyVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private KeyVersion keyVersion; 
        private String requestId; 

        /**
         * The metadata of the CMK version.
         */
        public Builder keyVersion(KeyVersion keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeKeyVersionResponseBody build() {
            return new DescribeKeyVersionResponseBody(this);
        } 

    } 

    public static class KeyVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationDate")
        private String creationDate;

        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        @com.aliyun.core.annotation.NameInMap("KeyVersionId")
        private String keyVersionId;

        private KeyVersion(Builder builder) {
            this.creationDate = builder.creationDate;
            this.keyId = builder.keyId;
            this.keyVersionId = builder.keyVersionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyVersion create() {
            return builder().build();
        }

        /**
         * @return creationDate
         */
        public String getCreationDate() {
            return this.creationDate;
        }

        /**
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        /**
         * @return keyVersionId
         */
        public String getKeyVersionId() {
            return this.keyVersionId;
        }

        public static final class Builder {
            private String creationDate; 
            private String keyId; 
            private String keyVersionId; 

            /**
             * The date and time when the CMK version was created. The time is displayed in UTC.
             */
            public Builder creationDate(String creationDate) {
                this.creationDate = creationDate;
                return this;
            }

            /**
             * The globally unique ID of the CMK.
             * <p>
             * 
             * >  If you set the KeyId parameter in the request to an alias of the CMK, the ID of the CMK to which the alias is bound is returned.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * The globally unique ID of the CMK version.
             */
            public Builder keyVersionId(String keyVersionId) {
                this.keyVersionId = keyVersionId;
                return this;
            }

            public KeyVersion build() {
                return new KeyVersion(this);
            } 

        } 

    }
}
