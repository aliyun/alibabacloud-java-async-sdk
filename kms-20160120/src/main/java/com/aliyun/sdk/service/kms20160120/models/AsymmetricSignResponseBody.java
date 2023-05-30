// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsymmetricSignResponseBody} extends {@link TeaModel}
 *
 * <p>AsymmetricSignResponseBody</p>
 */
public class AsymmetricSignResponseBody extends TeaModel {
    @NameInMap("KeyId")
    private String keyId;

    @NameInMap("KeyVersionId")
    private String keyVersionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Value")
    private String value;

    private AsymmetricSignResponseBody(Builder builder) {
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsymmetricSignResponseBody create() {
        return builder().build();
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String keyId; 
        private String keyVersionId; 
        private String requestId; 
        private String value; 

        /**
         * The version ID of the CMK. The ID must be globally unique.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * The digest that is generated for the original message by using a hash algorithm. The hash algorithm is specified by the Algorithm parameter.
         * <p>
         * 
         * > * The value is encoded in Base64.
         * > * For more information about how to calculate message digests, see the **Preprocess signature: compute a message digest** section of the [Generate and verify a signature by using an asymmetric CMK](~~148146~~) topic.
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * The calculated signature.
         * <p>
         * 
         * >  The value is encoded in Base64.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the CMK. The ID must be globally unique.
         * <p>
         * 
         * >  If you set the KeyId parameter in the request to an alias, the ID of the CMK to which the alias is bound is returned.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public AsymmetricSignResponseBody build() {
            return new AsymmetricSignResponseBody(this);
        } 

    } 

}
