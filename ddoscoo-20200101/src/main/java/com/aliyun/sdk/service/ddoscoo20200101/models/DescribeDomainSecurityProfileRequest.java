// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainSecurityProfileRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainSecurityProfileRequest</p>
 */
public class DescribeDomainSecurityProfileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The domain name of the website.</p>
         * <blockquote>
         * <p>A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
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
