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
 * {@link ListClientKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListClientKeysResponseBody</p>
 */
public class ListClientKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientKeys")
    private java.util.List<ClientKeys> clientKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListClientKeysResponseBody(Builder builder) {
        this.clientKeys = builder.clientKeys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientKeys
     */
    public java.util.List<ClientKeys> getClientKeys() {
        return this.clientKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ClientKeys> clientKeys; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListClientKeysResponseBody model) {
            this.clientKeys = model.clientKeys;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A list of client keys.</p>
         */
        public Builder clientKeys(java.util.List<ClientKeys> clientKeys) {
            this.clientKeys = clientKeys;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>2312e45f-b2fa-4c34-ad94-3eca50932916</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClientKeysResponseBody build() {
            return new ListClientKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClientKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListClientKeysResponseBody</p>
     */
    public static class ClientKeys extends TeaModel {
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

        private ClientKeys(Builder builder) {
            this.aapName = builder.aapName;
            this.clientKeyId = builder.clientKeyId;
            this.createTime = builder.createTime;
            this.keyAlgorithm = builder.keyAlgorithm;
            this.keyOrigin = builder.keyOrigin;
            this.notAfter = builder.notAfter;
            this.notBefore = builder.notBefore;
            this.publicKeyData = builder.publicKeyData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientKeys create() {
            return builder().build();
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

        public static final class Builder {
            private String aapName; 
            private String clientKeyId; 
            private String createTime; 
            private String keyAlgorithm; 
            private String keyOrigin; 
            private String notAfter; 
            private String notBefore; 
            private String publicKeyData; 

            private Builder() {
            } 

            private Builder(ClientKeys model) {
                this.aapName = model.aapName;
                this.clientKeyId = model.clientKeyId;
                this.createTime = model.createTime;
                this.keyAlgorithm = model.keyAlgorithm;
                this.keyOrigin = model.keyOrigin;
                this.notAfter = model.notAfter;
                this.notBefore = model.notBefore;
                this.publicKeyData = model.publicKeyData;
            } 

            /**
             * <p>The name of the AAP.</p>
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
             * <p>Currently, only KMS is supported. The value is fixed as KMS_PROVIDED.</p>
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
             * <p>The public key of the client key.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE-----\nMIIDcjCCAlqgAwIBAgIQT/sAVRxwYp54mrw****-----END CERTIFICATE-----</p>
             */
            public Builder publicKeyData(String publicKeyData) {
                this.publicKeyData = publicKeyData;
                return this;
            }

            public ClientKeys build() {
                return new ClientKeys(this);
            } 

        } 

    }
}
