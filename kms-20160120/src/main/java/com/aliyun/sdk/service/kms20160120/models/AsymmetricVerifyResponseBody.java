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
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * KeyVersionId.
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Value.
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
