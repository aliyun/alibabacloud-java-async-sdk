// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnL2VipsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnL2VipsRequest</p>
 */
public class DescribeDcdnL2VipsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    private DescribeDcdnL2VipsRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnL2VipsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnL2VipsRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnL2VipsRequest request) {
            super(request);
            this.domainName = request.domainName;
        } 

        /**
         * The domain name. You can specify only one domain name in each request. If you do not specify this parameter, the origin CIDR blocks of all domain names in your account in the whitelist are returned.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public DescribeDcdnL2VipsRequest build() {
            return new DescribeDcdnL2VipsRequest(this);
        } 

    } 

}
