// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectorySAMLServiceProviderInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDirectorySAMLServiceProviderInfoResponseBody</p>
 */
public class GetDirectorySAMLServiceProviderInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SAMLServiceProvider")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SAMLServiceProvider.
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
        @NameInMap("AcsUrl")
        private String acsUrl;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("EncodedMetadataDocument")
        private String encodedMetadataDocument;

        @NameInMap("EntityId")
        private String entityId;

        private SAMLServiceProvider(Builder builder) {
            this.acsUrl = builder.acsUrl;
            this.directoryId = builder.directoryId;
            this.encodedMetadataDocument = builder.encodedMetadataDocument;
            this.entityId = builder.entityId;
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

        public static final class Builder {
            private String acsUrl; 
            private String directoryId; 
            private String encodedMetadataDocument; 
            private String entityId; 

            /**
             * AcsUrl.
             */
            public Builder acsUrl(String acsUrl) {
                this.acsUrl = acsUrl;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * EncodedMetadataDocument.
             */
            public Builder encodedMetadataDocument(String encodedMetadataDocument) {
                this.encodedMetadataDocument = encodedMetadataDocument;
                return this;
            }

            /**
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            public SAMLServiceProvider build() {
                return new SAMLServiceProvider(this);
            } 

        } 

    }
}
