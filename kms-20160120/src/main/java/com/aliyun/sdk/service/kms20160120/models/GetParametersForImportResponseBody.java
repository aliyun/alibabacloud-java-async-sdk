// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetParametersForImportResponseBody} extends {@link TeaModel}
 *
 * <p>GetParametersForImportResponseBody</p>
 */
public class GetParametersForImportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImportToken")
    private String importToken;

    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("PublicKey")
    private String publicKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TokenExpireTime")
    private String tokenExpireTime;

    private GetParametersForImportResponseBody(Builder builder) {
        this.importToken = builder.importToken;
        this.keyId = builder.keyId;
        this.publicKey = builder.publicKey;
        this.requestId = builder.requestId;
        this.tokenExpireTime = builder.tokenExpireTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParametersForImportResponseBody create() {
        return builder().build();
    }

    /**
     * @return importToken
     */
    public String getImportToken() {
        return this.importToken;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return publicKey
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tokenExpireTime
     */
    public String getTokenExpireTime() {
        return this.tokenExpireTime;
    }

    public static final class Builder {
        private String importToken; 
        private String keyId; 
        private String publicKey; 
        private String requestId; 
        private String tokenExpireTime; 

        /**
         * The token that is used to import key material.
         * <p>
         * 
         * The token is valid for 24 hours. The value of this parameter is required when you call the [ImportKeyMaterial](~~68622~~) operation.
         */
        public Builder importToken(String importToken) {
            this.importToken = importToken;
            return this;
        }

        /**
         * The globally unique ID of the CMK.
         * <p>
         * 
         * The value of this parameter is required when you call the [ImportKeyMaterial](~~68622~~) operation.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * The public key that is used to encrypt key material.
         * <p>
         * 
         * The public key is Base64-encoded.
         */
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
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
         * The time when the token expires.
         */
        public Builder tokenExpireTime(String tokenExpireTime) {
            this.tokenExpireTime = tokenExpireTime;
            return this;
        }

        public GetParametersForImportResponseBody build() {
            return new GetParametersForImportResponseBody(this);
        } 

    } 

}
