// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Identifier.
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
