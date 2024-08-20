// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainCnameRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainCnameRequest</p>
 */
public class DescribeDcdnDomainCnameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    private DescribeDcdnDomainCnameRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainCnameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnDomainCnameRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDomainCnameRequest request) {
            super(request);
            this.domainName = request.domainName;
        } 

        /**
         * The accelerated domain name. Separate multiple domain names with commas (,).
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public DescribeDcdnDomainCnameRequest build() {
            return new DescribeDcdnDomainCnameRequest(this);
        } 

    } 

}
