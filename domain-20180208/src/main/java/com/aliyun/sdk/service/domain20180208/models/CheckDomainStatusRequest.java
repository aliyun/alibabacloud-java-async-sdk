// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDomainStatusRequest} extends {@link RequestModel}
 *
 * <p>CheckDomainStatusRequest</p>
 */
public class CheckDomainStatusRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    private CheckDomainStatusRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDomainStatusRequest create() {
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

    public static final class Builder extends Request.Builder<CheckDomainStatusRequest, Builder> {
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(CheckDomainStatusRequest request) {
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
        public CheckDomainStatusRequest build() {
            return new CheckDomainStatusRequest(this);
        } 

    } 

}
