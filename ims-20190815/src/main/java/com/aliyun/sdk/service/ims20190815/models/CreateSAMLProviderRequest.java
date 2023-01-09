// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSAMLProviderRequest} extends {@link RequestModel}
 *
 * <p>CreateSAMLProviderRequest</p>
 */
public class CreateSAMLProviderRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EncodedSAMLMetadataDocument")
    private String encodedSAMLMetadataDocument;

    @Query
    @NameInMap("SAMLProviderName")
    @Validation(required = true)
    private String SAMLProviderName;

    private CreateSAMLProviderRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.encodedSAMLMetadataDocument = builder.encodedSAMLMetadataDocument;
        this.SAMLProviderName = builder.SAMLProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSAMLProviderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateSAMLProviderRequest, Builder> {
        private String description; 
        private String encodedSAMLMetadataDocument; 
        private String SAMLProviderName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSAMLProviderRequest request) {
            super(request);
            this.description = request.description;
            this.encodedSAMLMetadataDocument = request.encodedSAMLMetadataDocument;
            this.SAMLProviderName = request.SAMLProviderName;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EncodedSAMLMetadataDocument.
         */
        public Builder encodedSAMLMetadataDocument(String encodedSAMLMetadataDocument) {
            this.putQueryParameter("EncodedSAMLMetadataDocument", encodedSAMLMetadataDocument);
            this.encodedSAMLMetadataDocument = encodedSAMLMetadataDocument;
            return this;
        }

        /**
         * SAMLProviderName.
         */
        public Builder SAMLProviderName(String SAMLProviderName) {
            this.putQueryParameter("SAMLProviderName", SAMLProviderName);
            this.SAMLProviderName = SAMLProviderName;
            return this;
        }

        @Override
        public CreateSAMLProviderRequest build() {
            return new CreateSAMLProviderRequest(this);
        } 

    } 

}
