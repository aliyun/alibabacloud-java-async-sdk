// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckIntlFixPriceDomainStatusRequest} extends {@link RequestModel}
 *
 * <p>CheckIntlFixPriceDomainStatusRequest</p>
 */
public class CheckIntlFixPriceDomainStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    private CheckIntlFixPriceDomainStatusRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckIntlFixPriceDomainStatusRequest create() {
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

    public static final class Builder extends Request.Builder<CheckIntlFixPriceDomainStatusRequest, Builder> {
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(CheckIntlFixPriceDomainStatusRequest request) {
            super(request);
            this.domain = request.domain;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public CheckIntlFixPriceDomainStatusRequest build() {
            return new CheckIntlFixPriceDomainStatusRequest(this);
        } 

    } 

}
