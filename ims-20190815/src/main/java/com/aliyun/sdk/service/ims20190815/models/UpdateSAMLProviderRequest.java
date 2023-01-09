// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSAMLProviderRequest} extends {@link RequestModel}
 *
 * <p>UpdateSAMLProviderRequest</p>
 */
public class UpdateSAMLProviderRequest extends Request {
    @Query
    @NameInMap("NewDescription")
    private String newDescription;

    @Query
    @NameInMap("NewEncodedSAMLMetadataDocument")
    private String newEncodedSAMLMetadataDocument;

    @Query
    @NameInMap("SAMLProviderName")
    @Validation(required = true)
    private String SAMLProviderName;

    private UpdateSAMLProviderRequest(Builder builder) {
        super(builder);
        this.newDescription = builder.newDescription;
        this.newEncodedSAMLMetadataDocument = builder.newEncodedSAMLMetadataDocument;
        this.SAMLProviderName = builder.SAMLProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSAMLProviderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newDescription
     */
    public String getNewDescription() {
        return this.newDescription;
    }

    /**
     * @return newEncodedSAMLMetadataDocument
     */
    public String getNewEncodedSAMLMetadataDocument() {
        return this.newEncodedSAMLMetadataDocument;
    }

    /**
     * @return SAMLProviderName
     */
    public String getSAMLProviderName() {
        return this.SAMLProviderName;
    }

    public static final class Builder extends Request.Builder<UpdateSAMLProviderRequest, Builder> {
        private String newDescription; 
        private String newEncodedSAMLMetadataDocument; 
        private String SAMLProviderName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSAMLProviderRequest request) {
            super(request);
            this.newDescription = request.newDescription;
            this.newEncodedSAMLMetadataDocument = request.newEncodedSAMLMetadataDocument;
            this.SAMLProviderName = request.SAMLProviderName;
        } 

        /**
         * NewDescription.
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * NewEncodedSAMLMetadataDocument.
         */
        public Builder newEncodedSAMLMetadataDocument(String newEncodedSAMLMetadataDocument) {
            this.putQueryParameter("NewEncodedSAMLMetadataDocument", newEncodedSAMLMetadataDocument);
            this.newEncodedSAMLMetadataDocument = newEncodedSAMLMetadataDocument;
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
        public UpdateSAMLProviderRequest build() {
            return new UpdateSAMLProviderRequest(this);
        } 

    } 

}
