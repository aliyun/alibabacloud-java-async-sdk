// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link DeletePCACertRequest} extends {@link RequestModel}
 *
 * <p>DeletePCACertRequest</p>
 */
public class DeletePCACertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    private DeletePCACertRequest(Builder builder) {
        super(builder);
        this.identifier = builder.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePCACertRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    public static final class Builder extends Request.Builder<DeletePCACertRequest, Builder> {
        private String identifier; 

        private Builder() {
            super();
        } 

        private Builder(DeletePCACertRequest request) {
            super(request);
            this.identifier = request.identifier;
        } 

        /**
         * <p>The unique identifier of the certificate. You can call the <a href="https://help.aliyun.com/document_detail/452331.html">ListCert</a> operation to query the unique identifiers of certificates.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccaf0c629c2be1e2ab</p>
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        @Override
        public DeletePCACertRequest build() {
            return new DeletePCACertRequest(this);
        } 

    } 

}
