// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.beian20160810.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccessorDomainStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryAccessorDomainStatusRequest</p>
 */
public class QueryAccessorDomainStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    private QueryAccessorDomainStatusRequest(Builder builder) {
        super(builder);
        this.caller = builder.caller;
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccessorDomainStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    public static final class Builder extends Request.Builder<QueryAccessorDomainStatusRequest, Builder> {
        private String caller; 
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(QueryAccessorDomainStatusRequest request) {
            super(request);
            this.caller = request.caller;
            this.domain = request.domain;
        } 

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
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
        public QueryAccessorDomainStatusRequest build() {
            return new QueryAccessorDomainStatusRequest(this);
        } 

    } 

}
