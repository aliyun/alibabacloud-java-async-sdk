// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecryptKMSDataKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DecryptKMSDataKeyResponseBody</p>
 */
public class DecryptKMSDataKeyResponseBody extends TeaModel {
    @NameInMap("KeyId")
    private String keyId;

    @NameInMap("Plaintext")
    private String plaintext;

    @NameInMap("RequestId")
    private String requestId;

    private DecryptKMSDataKeyResponseBody(Builder builder) {
        this.keyId = builder.keyId;
        this.plaintext = builder.plaintext;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecryptKMSDataKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return plaintext
     */
    public String getPlaintext() {
        return this.plaintext;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String keyId; 
        private String plaintext; 
        private String requestId; 

        /**
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * Plaintext.
         */
        public Builder plaintext(String plaintext) {
            this.plaintext = plaintext;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DecryptKMSDataKeyResponseBody build() {
            return new DecryptKMSDataKeyResponseBody(this);
        } 

    } 

}
