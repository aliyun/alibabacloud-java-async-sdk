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
 * {@link UpdateSAMLProviderRequest} extends {@link RequestModel}
 *
 * <p>UpdateSAMLProviderRequest</p>
 */
public class UpdateSAMLProviderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDescription")
    private String newDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewEncodedSAMLMetadataDocument")
    private String newEncodedSAMLMetadataDocument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SAMLProviderName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The new description.</p>
         * <blockquote>
         * <p> You must specify at least one of the <code>NewDescription</code> and <code>NewEncodedSAMLMetadataDocument</code> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>This is a new provider.</p>
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * <p>The new metadata file.</p>
         * <blockquote>
         * <p> You must specify at least one of the <code>NewDescription</code> and <code>NewEncodedSAMLMetadataDocument</code> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PD94bWwgdmVy****</p>
         */
        public Builder newEncodedSAMLMetadataDocument(String newEncodedSAMLMetadataDocument) {
            this.putQueryParameter("NewEncodedSAMLMetadataDocument", newEncodedSAMLMetadataDocument);
            this.newEncodedSAMLMetadataDocument = newEncodedSAMLMetadataDocument;
            return this;
        }

        /**
         * <p>The name of the IdP whose information you want to modify.</p>
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
        public UpdateSAMLProviderRequest build() {
            return new UpdateSAMLProviderRequest(this);
        } 

    } 

}
