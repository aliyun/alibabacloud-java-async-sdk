// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientCertificateRequest} extends {@link RequestModel}
 *
 * <p>DescribeClientCertificateRequest</p>
 */
public class DescribeClientCertificateRequest extends Request {
    @Query
    @NameInMap("Identifier")
    @Validation(required = true)
    private String identifier;

    private DescribeClientCertificateRequest(Builder builder) {
        super(builder);
        this.identifier = builder.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeClientCertificateRequest, Builder> {
        private String identifier; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClientCertificateRequest request) {
            super(request);
            this.identifier = request.identifier;
        } 

        /**
         * The SHA-256 fingerprint of the certificate.
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        @Override
        public DescribeClientCertificateRequest build() {
            return new DescribeClientCertificateRequest(this);
        } 

    } 

}
