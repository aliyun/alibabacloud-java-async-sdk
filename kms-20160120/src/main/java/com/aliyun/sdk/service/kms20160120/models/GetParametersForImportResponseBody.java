// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetParametersForImportResponseBody model) {
            this.importToken = model.importToken;
            this.keyId = model.keyId;
            this.publicKey = model.publicKey;
            this.requestId = model.requestId;
            this.tokenExpireTime = model.tokenExpireTime;
        } 

        /**
         * <p>The token that is used to import key material.</p>
         * <p>The token is valid for 24 hours. The value of this parameter is required when you call the <a href="https://help.aliyun.com/document_detail/68622.html">ImportKeyMaterial</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Base64String</p>
         */
        public Builder importToken(String importToken) {
            this.importToken = importToken;
            return this;
        }

        /**
         * <p>The globally unique ID of the CMK.</p>
         * <p>The value of this parameter is required when you call the <a href="https://help.aliyun.com/document_detail/68622.html">ImportKeyMaterial</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>202b9877-5a25-46e3-a763-e20791b5****</p>
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The public key that is used to encrypt key material.</p>
         * <p>The public key is Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlls4uIBxD0GG84C+lGBO6Dhpf1J3XimC6cPmPNaKKJMOzoX4tD+C+r7aZv8lZ3vnPfxuxvy/YwG+whUxTEEFUdqJTOIzhPfYucupqKM92crVHIuG+xtMVeHKjyTr+UrtKCsQikqHT+19yDRN/RMoo2HUx0gmEnRyXd8t3JyUXun9FdoxKA08GrsV7nodb9ZsoBLhnev7tTLcXvLyKW6XG1ZQCQm6dPnbnwLeDXR7uK0Lqn9PM28mBIdaiQUQxj2XbM1CoJA+JiyVX3Ptdb+4rqukb4Rb05B80Bs9xV/cf7FIku08l7xGhrGiQFq+DFXwQWtwihXHZxz3LhldU+4ZPwID****</p>
         */
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>8cdf51fd-bcd6-d79a-0ef4-e52c9b5466dc</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the token expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-25T00:01:02Z</p>
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
