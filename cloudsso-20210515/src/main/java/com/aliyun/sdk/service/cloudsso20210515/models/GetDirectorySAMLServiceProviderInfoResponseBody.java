// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectorySAMLServiceProviderInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDirectorySAMLServiceProviderInfoResponseBody</p>
 */
public class GetDirectorySAMLServiceProviderInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SAMLServiceProvider")
    private SAMLServiceProvider SAMLServiceProvider;

    private GetDirectorySAMLServiceProviderInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SAMLServiceProvider = builder.SAMLServiceProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDirectorySAMLServiceProviderInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SAMLServiceProvider
     */
    public SAMLServiceProvider getSAMLServiceProvider() {
        return this.SAMLServiceProvider;
    }

    public static final class Builder {
        private String requestId; 
        private SAMLServiceProvider SAMLServiceProvider; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the SP.
         */
        public Builder SAMLServiceProvider(SAMLServiceProvider SAMLServiceProvider) {
            this.SAMLServiceProvider = SAMLServiceProvider;
            return this;
        }

        public GetDirectorySAMLServiceProviderInfoResponseBody build() {
            return new GetDirectorySAMLServiceProviderInfoResponseBody(this);
        } 

    } 

    public static class SAMLServiceProvider extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcsUrl")
        private String acsUrl;

        @com.aliyun.core.annotation.NameInMap("AuthnSignAlgo")
        private String authnSignAlgo;

        @com.aliyun.core.annotation.NameInMap("CertificateType")
        private String certificateType;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("EncodedMetadataDocument")
        private String encodedMetadataDocument;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("SupportEncryptedAssertion")
        private Boolean supportEncryptedAssertion;

        private SAMLServiceProvider(Builder builder) {
            this.acsUrl = builder.acsUrl;
            this.authnSignAlgo = builder.authnSignAlgo;
            this.certificateType = builder.certificateType;
            this.directoryId = builder.directoryId;
            this.encodedMetadataDocument = builder.encodedMetadataDocument;
            this.entityId = builder.entityId;
            this.supportEncryptedAssertion = builder.supportEncryptedAssertion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SAMLServiceProvider create() {
            return builder().build();
        }

        /**
         * @return acsUrl
         */
        public String getAcsUrl() {
            return this.acsUrl;
        }

        /**
         * @return authnSignAlgo
         */
        public String getAuthnSignAlgo() {
            return this.authnSignAlgo;
        }

        /**
         * @return certificateType
         */
        public String getCertificateType() {
            return this.certificateType;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return encodedMetadataDocument
         */
        public String getEncodedMetadataDocument() {
            return this.encodedMetadataDocument;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return supportEncryptedAssertion
         */
        public Boolean getSupportEncryptedAssertion() {
            return this.supportEncryptedAssertion;
        }

        public static final class Builder {
            private String acsUrl; 
            private String authnSignAlgo; 
            private String certificateType; 
            private String directoryId; 
            private String encodedMetadataDocument; 
            private String entityId; 
            private Boolean supportEncryptedAssertion; 

            /**
             * The Assertion Consumer Service (ACS) URL of the SP.
             */
            public Builder acsUrl(String acsUrl) {
                this.acsUrl = acsUrl;
                return this;
            }

            /**
             * AuthnSignAlgo.
             */
            public Builder authnSignAlgo(String authnSignAlgo) {
                this.authnSignAlgo = authnSignAlgo;
                return this;
            }

            /**
             * CertificateType.
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * The ID of the directory.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The metadata file of the SP. The value of this parameter is Base64-encoded.
             */
            public Builder encodedMetadataDocument(String encodedMetadataDocument) {
                this.encodedMetadataDocument = encodedMetadataDocument;
                return this;
            }

            /**
             * The entity ID of the SP.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * SupportEncryptedAssertion.
             */
            public Builder supportEncryptedAssertion(Boolean supportEncryptedAssertion) {
                this.supportEncryptedAssertion = supportEncryptedAssertion;
                return this;
            }

            public SAMLServiceProvider build() {
                return new SAMLServiceProvider(this);
            } 

        } 

    }
}
