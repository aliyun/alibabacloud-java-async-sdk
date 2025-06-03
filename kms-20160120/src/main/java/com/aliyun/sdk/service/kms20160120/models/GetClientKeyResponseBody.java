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
 * {@link GetClientKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetClientKeyResponseBody</p>
 */
public class GetClientKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AapName")
    private String aapName;

    @com.aliyun.core.annotation.NameInMap("ClientKeyId")
    private String clientKeyId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("KeyAlgorithm")
    private String keyAlgorithm;

    @com.aliyun.core.annotation.NameInMap("KeyOrigin")
    private String keyOrigin;

    @com.aliyun.core.annotation.NameInMap("NotAfter")
    private String notAfter;

    @com.aliyun.core.annotation.NameInMap("NotBefore")
    private String notBefore;

    @com.aliyun.core.annotation.NameInMap("PublicKeyData")
    private String publicKeyData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetClientKeyResponseBody(Builder builder) {
        this.aapName = builder.aapName;
        this.clientKeyId = builder.clientKeyId;
        this.createTime = builder.createTime;
        this.keyAlgorithm = builder.keyAlgorithm;
        this.keyOrigin = builder.keyOrigin;
        this.notAfter = builder.notAfter;
        this.notBefore = builder.notBefore;
        this.publicKeyData = builder.publicKeyData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aapName
     */
    public String getAapName() {
        return this.aapName;
    }

    /**
     * @return clientKeyId
     */
    public String getClientKeyId() {
        return this.clientKeyId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return keyAlgorithm
     */
    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * @return keyOrigin
     */
    public String getKeyOrigin() {
        return this.keyOrigin;
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
     * @return publicKeyData
     */
    public String getPublicKeyData() {
        return this.publicKeyData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String aapName; 
        private String clientKeyId; 
        private String createTime; 
        private String keyAlgorithm; 
        private String keyOrigin; 
        private String notAfter; 
        private String notBefore; 
        private String publicKeyData; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetClientKeyResponseBody model) {
            this.aapName = model.aapName;
            this.clientKeyId = model.clientKeyId;
            this.createTime = model.createTime;
            this.keyAlgorithm = model.keyAlgorithm;
            this.keyOrigin = model.keyOrigin;
            this.notAfter = model.notAfter;
            this.notBefore = model.notBefore;
            this.publicKeyData = model.publicKeyData;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The name of the application access point (AAP).</p>
         * 
         * <strong>example:</strong>
         * <p>aap_test</p>
         */
        public Builder aapName(String aapName) {
            this.aapName = aapName;
            return this;
        }

        /**
         * <p>The ID of the client key.</p>
         * 
         * <strong>example:</strong>
         * <p>KAAP.66abf237-63f6-4625-b8cf-47e1086e****</p>
         */
        public Builder clientKeyId(String clientKeyId) {
            this.clientKeyId = clientKeyId;
            return this;
        }

        /**
         * <p>The time when the client key was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-31T09:14:38Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The private key algorithm of the client key.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA_2048</p>
         */
        public Builder keyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            return this;
        }

        /**
         * <p>The provider of the client key.</p>
         * <p>Currently, only Key Management Service (KMS) is supported. The value is fixed as KMS_PROVIDED.</p>
         * 
         * <strong>example:</strong>
         * <p>KMS_PROVIDED</p>
         */
        public Builder keyOrigin(String keyOrigin) {
            this.keyOrigin = keyOrigin;
            return this;
        }

        /**
         * <p>The end of the validity period of the client key.</p>
         * 
         * <strong>example:</strong>
         * <p>2028-08-31T17:14:33Z</p>
         */
        public Builder notAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * <p>The beginning of the validity period of the client key.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-31T17:14:33Z</p>
         */
        public Builder notBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * <p>The content of the public key of the client key.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\nMIIDcjCCAlqgAwIBAgIQT/sAVRxwYp54mrw****-----END CERTIFICATE-----</p>
         */
        public Builder publicKeyData(String publicKeyData) {
            this.publicKeyData = publicKeyData;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>63d849a6-045b-4a57-ad9f-c5f756cea9e9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClientKeyResponseBody build() {
            return new GetClientKeyResponseBody(this);
        } 

    } 

}
