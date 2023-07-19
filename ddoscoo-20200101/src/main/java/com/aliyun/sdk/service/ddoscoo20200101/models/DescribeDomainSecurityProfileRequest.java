// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainSecurityProfileRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainSecurityProfileRequest</p>
 */
public class DescribeDomainSecurityProfileRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    private DescribeDomainSecurityProfileRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainSecurityProfileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    public static final class Builder extends Request.Builder<DescribeDomainSecurityProfileRequest, Builder> {
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainSecurityProfileRequest request) {
            super(request);
            this.domain = request.domain;
        } 

        /**
         * The domain name of the website.
         * <p>
         * 
         * > A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public DescribeDomainSecurityProfileRequest build() {
            return new DescribeDomainSecurityProfileRequest(this);
        } 

    } 

}
