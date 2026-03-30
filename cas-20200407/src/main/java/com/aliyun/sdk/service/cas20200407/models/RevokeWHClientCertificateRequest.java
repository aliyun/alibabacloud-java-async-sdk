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
 * {@link RevokeWHClientCertificateRequest} extends {@link RequestModel}
 *
 * <p>RevokeWHClientCertificateRequest</p>
 */
public class RevokeWHClientCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    private RevokeWHClientCertificateRequest(Builder builder) {
        super(builder);
        this.identifier = builder.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeWHClientCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<RevokeWHClientCertificateRequest, Builder> {
        private String identifier; 

        private Builder() {
            super();
        } 

        private Builder(RevokeWHClientCertificateRequest request) {
            super(request);
            this.identifier = request.identifier;
        } 

        /**
         * <p>The unique identifier of the client certificate or server certificate that you want to revoke.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>160ae6bb538d538c70c01f81dcf2****</p>
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        @Override
        public RevokeWHClientCertificateRequest build() {
            return new RevokeWHClientCertificateRequest(this);
        } 

    } 

}
