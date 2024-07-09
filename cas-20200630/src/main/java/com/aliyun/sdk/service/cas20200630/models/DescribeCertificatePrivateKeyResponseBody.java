// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificatePrivateKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertificatePrivateKeyResponseBody</p>
 */
public class DescribeCertificatePrivateKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EncryptedData")
    private String encryptedData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCertificatePrivateKeyResponseBody(Builder builder) {
        this.encryptedData = builder.encryptedData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertificatePrivateKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return encryptedData
     */
    public String getEncryptedData() {
        return this.encryptedData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String encryptedData; 
        private String requestId; 

        /**
         * The content of the encrypted private key.
         */
        public Builder encryptedData(String encryptedData) {
            this.encryptedData = encryptedData;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCertificatePrivateKeyResponseBody build() {
            return new DescribeCertificatePrivateKeyResponseBody(this);
        } 

    } 

}
