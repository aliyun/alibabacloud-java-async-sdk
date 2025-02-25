// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
         * <p>The unique identifier of the client certificate or the server certificate that you want to query.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/330884.html">ListClientCertificate</a> operation to query the unique identifiers of all client certificates and server certificates.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d3b95700998e47afc4d95f886579****</p>
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
