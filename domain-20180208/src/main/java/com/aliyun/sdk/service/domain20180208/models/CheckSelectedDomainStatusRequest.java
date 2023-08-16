// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckSelectedDomainStatusRequest} extends {@link RequestModel}
 *
 * <p>CheckSelectedDomainStatusRequest</p>
 */
public class CheckSelectedDomainStatusRequest extends Request {
    @Query
    @NameInMap("Domain")
    private String domain;

    private CheckSelectedDomainStatusRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSelectedDomainStatusRequest create() {
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

    public static final class Builder extends Request.Builder<CheckSelectedDomainStatusRequest, Builder> {
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(CheckSelectedDomainStatusRequest request) {
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
        public CheckSelectedDomainStatusRequest build() {
            return new CheckSelectedDomainStatusRequest(this);
        } 

    } 

}
