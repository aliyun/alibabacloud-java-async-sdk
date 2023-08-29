// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCACertificateStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateCACertificateStatusRequest</p>
 */
public class UpdateCACertificateStatusRequest extends Request {
    @Query
    @NameInMap("Identifier")
    @Validation(required = true)
    private String identifier;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private UpdateCACertificateStatusRequest(Builder builder) {
        super(builder);
        this.identifier = builder.identifier;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCACertificateStatusRequest create() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateCACertificateStatusRequest, Builder> {
        private String identifier; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCACertificateStatusRequest request) {
            super(request);
            this.identifier = request.identifier;
            this.status = request.status;
        } 

        /**
         * Identifier.
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateCACertificateStatusRequest build() {
            return new UpdateCACertificateStatusRequest(this);
        } 

    } 

}
