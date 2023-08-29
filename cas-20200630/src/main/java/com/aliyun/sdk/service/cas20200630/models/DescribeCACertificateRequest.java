// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCACertificateRequest} extends {@link RequestModel}
 *
 * <p>DescribeCACertificateRequest</p>
 */
public class DescribeCACertificateRequest extends Request {
    @Query
    @NameInMap("Identifier")
    private String identifier;

    private DescribeCACertificateRequest(Builder builder) {
        super(builder);
        this.identifier = builder.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCACertificateRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCACertificateRequest, Builder> {
        private String identifier; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCACertificateRequest request) {
            super(request);
            this.identifier = request.identifier;
        } 

        /**
         * The unique identifier of the CA certificate that you want to query.
         * <p>
         * 
         * >  You can call the [DescribeCACertificateList](~~328095~~) operation to query the unique identifiers of all CA certificates.
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        @Override
        public DescribeCACertificateRequest build() {
            return new DescribeCACertificateRequest(this);
        } 

    } 

}
