// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClientCertificateRequest} extends {@link RequestModel}
 *
 * <p>DeleteClientCertificateRequest</p>
 */
public class DeleteClientCertificateRequest extends Request {
    @Query
    @NameInMap("Identifier")
    @Validation(required = true)
    private String identifier;

    private DeleteClientCertificateRequest(Builder builder) {
        super(builder);
        this.identifier = builder.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClientCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteClientCertificateRequest, Builder> {
        private String identifier; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClientCertificateRequest request) {
            super(request);
            this.identifier = request.identifier;
        } 

        /**
         * Identifier.
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        @Override
        public DeleteClientCertificateRequest build() {
            return new DeleteClientCertificateRequest(this);
        } 

    } 

}
