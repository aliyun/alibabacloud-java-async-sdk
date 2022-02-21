// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetParametersForImportResponseBody} extends {@link TeaModel}
 *
 * <p>GetParametersForImportResponseBody</p>
 */
public class GetParametersForImportResponseBody extends TeaModel {
    @NameInMap("ImportToken")
    private String importToken;

    @NameInMap("KeyId")
    private String keyId;

    @NameInMap("PublicKey")
    private String publicKey;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TokenExpireTime")
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
         * ImportToken.
         */
        public Builder importToken(String importToken) {
            this.importToken = importToken;
            return this;
        }

        /**
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * PublicKey.
         */
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
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
         * TokenExpireTime.
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
