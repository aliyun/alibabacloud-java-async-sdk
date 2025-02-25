// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
         * <p>The content of the encrypted private key.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN ENCRYPTED PRIVATE KEY----- …… -----END ENCRYPTED PRIVATE KEY-----</p>
         */
        public Builder encryptedData(String encryptedData) {
            this.encryptedData = encryptedData;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>09470F19-CEE8-5C63-BF2C-02B5E3F07A17</p>
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
