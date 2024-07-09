// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientCertificateRequest} extends {@link RequestModel}
 *
 * <p>DescribeClientCertificateRequest</p>
 */
public class DescribeClientCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The unique identifier of the client certificate or the server certificate that you want to query.
         * <p>
         * 
         * >  You can call the [ListClientCertificate](~~330884~~) operation to query the unique identifiers of all client certificates and server certificates.
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
