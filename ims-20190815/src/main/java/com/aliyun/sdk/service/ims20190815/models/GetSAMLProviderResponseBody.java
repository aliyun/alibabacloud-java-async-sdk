// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSAMLProviderResponseBody} extends {@link TeaModel}
 *
 * <p>GetSAMLProviderResponseBody</p>
 */
public class GetSAMLProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SAMLProvider")
    private SAMLProvider SAMLProvider;

    private GetSAMLProviderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SAMLProvider = builder.SAMLProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSAMLProviderResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SAMLProvider
     */
    public SAMLProvider getSAMLProvider() {
        return this.SAMLProvider;
    }

    public static final class Builder {
        private String requestId; 
        private SAMLProvider SAMLProvider; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the IdP.
         */
        public Builder SAMLProvider(SAMLProvider SAMLProvider) {
            this.SAMLProvider = SAMLProvider;
            return this;
        }

        public GetSAMLProviderResponseBody build() {
            return new GetSAMLProviderResponseBody(this);
        } 

    } 

    public static class SAMLProvider extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EncodedSAMLMetadataDocument")
        private String encodedSAMLMetadataDocument;

        @com.aliyun.core.annotation.NameInMap("SAMLProviderName")
        private String SAMLProviderName;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private SAMLProvider(Builder builder) {
            this.arn = builder.arn;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.encodedSAMLMetadataDocument = builder.encodedSAMLMetadataDocument;
            this.SAMLProviderName = builder.SAMLProviderName;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SAMLProvider create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encodedSAMLMetadataDocument
         */
        public String getEncodedSAMLMetadataDocument() {
            return this.encodedSAMLMetadataDocument;
        }

        /**
         * @return SAMLProviderName
         */
        public String getSAMLProviderName() {
            return this.SAMLProviderName;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String arn; 
            private String createDate; 
            private String description; 
            private String encodedSAMLMetadataDocument; 
            private String SAMLProviderName; 
            private String updateDate; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the IdP.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The metadata file, which is Base64 encoded.
             */
            public Builder encodedSAMLMetadataDocument(String encodedSAMLMetadataDocument) {
                this.encodedSAMLMetadataDocument = encodedSAMLMetadataDocument;
                return this;
            }

            /**
             * The name of the IdP.
             */
            public Builder SAMLProviderName(String SAMLProviderName) {
                this.SAMLProviderName = SAMLProviderName;
                return this;
            }

            /**
             * The update time.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public SAMLProvider build() {
                return new SAMLProvider(this);
            } 

        } 

    }
}
