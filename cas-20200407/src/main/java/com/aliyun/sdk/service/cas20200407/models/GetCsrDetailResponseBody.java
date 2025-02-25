// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link GetCsrDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCsrDetailResponseBody</p>
 */
public class GetCsrDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Csr")
    private String csr;

    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    private String privateKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCsrDetailResponseBody(Builder builder) {
        this.csr = builder.csr;
        this.privateKey = builder.privateKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCsrDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String csr; 
        private String privateKey; 
        private String requestId; 

        /**
         * <p>The content of the CSR.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE REQUEST-----   ...... -----END CERTIFICATE REQUEST-----</p>
         */
        public Builder csr(String csr) {
            this.csr = csr;
            return this;
        }

        /**
         * <p>The private key. Specify a Base64-encoded string.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN RSA PRIVATE KEY-----…… -----END RSA PRIVATE KEY-----</p>
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>08F45EA0-66A7-4504-9B31-3589F5CE308D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCsrDetailResponseBody build() {
            return new GetCsrDetailResponseBody(this);
        } 

    } 

}
