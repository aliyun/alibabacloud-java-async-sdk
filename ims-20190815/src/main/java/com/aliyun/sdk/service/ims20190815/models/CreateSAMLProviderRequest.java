// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link CreateSAMLProviderRequest} extends {@link RequestModel}
 *
 * <p>CreateSAMLProviderRequest</p>
 */
public class CreateSAMLProviderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncodedSAMLMetadataDocument")
    private String encodedSAMLMetadataDocument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SAMLProviderName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a provider.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The metadata file which is Base64-encoded.</p>
         * <p>The file is provided by an IdP that supports Security Assertion Markup Language (SAML) 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>PD94bWwgdmVy****</p>
         */
        public Builder encodedSAMLMetadataDocument(String encodedSAMLMetadataDocument) {
            this.putQueryParameter("EncodedSAMLMetadataDocument", encodedSAMLMetadataDocument);
            this.encodedSAMLMetadataDocument = encodedSAMLMetadataDocument;
            return this;
        }

        /**
         * <p>The name of the IdP.</p>
         * <p>The name can be up to 128 characters in length. The name can contain letters, digits, <code>periods (.), hyphens (-), and underscores (_)</code>. The name cannot start or end with <code>periods (.), hyphens (-), or underscores (_)</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-provider</p>
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
