// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The content of the CSR.
         */
        public Builder csr(String csr) {
            this.csr = csr;
            return this;
        }

        /**
         * The private key. Specify a Base64-encoded string.
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * The request ID.
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
