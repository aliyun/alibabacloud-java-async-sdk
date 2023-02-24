// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsymmetricVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>AsymmetricVerifyResponseBody</p>
 */
public class AsymmetricVerifyResponseBody extends TeaModel {
    @NameInMap("KeyId")
    private String keyId;

    @NameInMap("KeyVersionId")
    private String keyVersionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Value")
    private Boolean value;

    private AsymmetricVerifyResponseBody(Builder builder) {
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsymmetricVerifyResponseBody create() {
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
    public Boolean getValue() {
        return this.value;
    }

    public static final class Builder {
        private String keyId; 
        private String keyVersionId; 
        private String requestId; 
        private Boolean value; 

        /**
         * The ID of the CMK. The ID must be globally unique.
         * <p>
         * 
         * >  If you set the KeyId parameter in the request to an alias, the ID of the CMK to which the alias is bound is returned.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * The version ID of the CMK that is used to encrypt the plaintext.
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the signature passed the verification.
         */
        public Builder value(Boolean value) {
            this.value = value;
            return this;
        }

        public AsymmetricVerifyResponseBody build() {
            return new AsymmetricVerifyResponseBody(this);
        } 

    } 

}
