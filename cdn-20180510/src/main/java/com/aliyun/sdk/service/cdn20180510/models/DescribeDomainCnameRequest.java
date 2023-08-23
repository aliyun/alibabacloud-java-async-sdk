// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainCnameRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainCnameRequest</p>
 */
public class DescribeDomainCnameRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    private DescribeDomainCnameRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainCnameRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDomainCnameRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainCnameRequest request) {
            super(request);
            this.domainName = request.domainName;
        } 

        /**
         * The accelerated domain name that you want to query. Separate multiple domain names with commas (,). This parameter cannot be left empty.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public DescribeDomainCnameRequest build() {
            return new DescribeDomainCnameRequest(this);
        } 

    } 

}
