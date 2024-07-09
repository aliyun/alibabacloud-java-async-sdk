// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRevokeClientCertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateRevokeClientCertificateRequest</p>
 */
public class CreateRevokeClientCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    private CreateRevokeClientCertificateRequest(Builder builder) {
        super(builder);
        this.identifier = builder.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRevokeClientCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<CreateRevokeClientCertificateRequest, Builder> {
        private String identifier; 

        private Builder() {
            super();
        } 

        private Builder(CreateRevokeClientCertificateRequest request) {
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
        public CreateRevokeClientCertificateRequest build() {
            return new CreateRevokeClientCertificateRequest(this);
        } 

    } 

}
