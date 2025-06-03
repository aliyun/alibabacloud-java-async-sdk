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
 * {@link CreateClientKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClientKeyResponseBody</p>
 */
public class CreateClientKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientKeyId")
    private String clientKeyId;

    @com.aliyun.core.annotation.NameInMap("KeyAlgorithm")
    private String keyAlgorithm;

    @com.aliyun.core.annotation.NameInMap("NotAfter")
    private String notAfter;

    @com.aliyun.core.annotation.NameInMap("NotBefore")
    private String notBefore;

    @com.aliyun.core.annotation.NameInMap("PrivateKeyData")
    private String privateKeyData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateClientKeyResponseBody(Builder builder) {
        this.clientKeyId = builder.clientKeyId;
        this.keyAlgorithm = builder.keyAlgorithm;
        this.notAfter = builder.notAfter;
        this.notBefore = builder.notBefore;
        this.privateKeyData = builder.privateKeyData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientKeyId
     */
    public String getClientKeyId() {
        return this.clientKeyId;
    }

    /**
     * @return keyAlgorithm
     */
    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * @return notAfter
     */
    public String getNotAfter() {
        return this.notAfter;
    }

    /**
     * @return notBefore
     */
    public String getNotBefore() {
        return this.notBefore;
    }

    /**
     * @return privateKeyData
     */
    public String getPrivateKeyData() {
        return this.privateKeyData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clientKeyId; 
        private String keyAlgorithm; 
        private String notAfter; 
        private String notBefore; 
        private String privateKeyData; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateClientKeyResponseBody model) {
            this.clientKeyId = model.clientKeyId;
            this.keyAlgorithm = model.keyAlgorithm;
            this.notAfter = model.notAfter;
            this.notBefore = model.notBefore;
            this.privateKeyData = model.privateKeyData;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>KAAP.66abf237-63f6-4625-b8cf-47e1086e****</p>
         */
        public Builder clientKeyId(String clientKeyId) {
            this.clientKeyId = clientKeyId;
            return this;
        }

        /**
         * <p>The ID of the client key.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA_2048</p>
         */
        public Builder keyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            return this;
        }

        /**
         * <p>The beginning of the validity period of the client key.</p>
         * 
         * <strong>example:</strong>
         * <p>2028-08-31T17:14:33Z</p>
         */
        public Builder notAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * <p>The private key of the client key.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-31T17:14:33Z</p>
         */
        public Builder notBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * <p>The algorithm that is used to encrypt the private key of the client key. Currently, only RSA_2048 is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>MIIJqwIBAzCCCXcGCSqGSIb3DQEHAaCCCWgEgglkMIIJYDCCBBcGCSqGSIb3DQEHBqCCBAgwgg******</p>
         */
        public Builder privateKeyData(String privateKeyData) {
            this.privateKeyData = privateKeyData;
            return this;
        }

        /**
         * <p>The beginning of the validity period of the client key.</p>
         * <p>Specify the time in the ISO 8601 standard. The time must be in UTC. The time must be in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>If you do not configure NotBefore, the default value is the time when the client key was created.</li>
         * <li>If you configure NotBefore, you must configure NotAfter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2312e45f-b2fa-4c34-ad94-3eca50932916</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateClientKeyResponseBody build() {
            return new CreateClientKeyResponseBody(this);
        } 

    } 

}
