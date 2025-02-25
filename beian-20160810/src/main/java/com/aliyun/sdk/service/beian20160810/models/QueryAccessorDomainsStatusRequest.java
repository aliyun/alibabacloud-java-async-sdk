// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.beian20160810.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccessorDomainsStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryAccessorDomainsStatusRequest</p>
 */
public class QueryAccessorDomainsStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domains")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > domains;

    private QueryAccessorDomainsStatusRequest(Builder builder) {
        super(builder);
        this.caller = builder.caller;
        this.domains = builder.domains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccessorDomainsStatusRequest create() {
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
     * @return domains
     */
    public java.util.List < String > getDomains() {
        return this.domains;
    }

    public static final class Builder extends Request.Builder<QueryAccessorDomainsStatusRequest, Builder> {
        private String caller; 
        private java.util.List < String > domains; 

        private Builder() {
            super();
        } 

        private Builder(QueryAccessorDomainsStatusRequest request) {
            super(request);
            this.caller = request.caller;
            this.domains = request.domains;
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
         * Domains.
         */
        public Builder domains(java.util.List < String > domains) {
            this.putQueryParameter("Domains", domains);
            this.domains = domains;
            return this;
        }

        @Override
        public QueryAccessorDomainsStatusRequest build() {
            return new QueryAccessorDomainsStatusRequest(this);
        } 

    } 

}
