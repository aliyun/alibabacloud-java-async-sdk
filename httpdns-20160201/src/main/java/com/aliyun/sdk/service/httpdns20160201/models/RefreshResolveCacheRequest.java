// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefreshResolveCacheRequest} extends {@link RequestModel}
 *
 * <p>RefreshResolveCacheRequest</p>
 */
public class RefreshResolveCacheRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domains")
    private java.util.List<String> domains;

    private RefreshResolveCacheRequest(Builder builder) {
        super(builder);
        this.domains = builder.domains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshResolveCacheRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domains
     */
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public static final class Builder extends Request.Builder<RefreshResolveCacheRequest, Builder> {
        private java.util.List<String> domains; 

        private Builder() {
            super();
        } 

        private Builder(RefreshResolveCacheRequest request) {
            super(request);
            this.domains = request.domains;
        } 

        /**
         * Domains.
         */
        public Builder domains(java.util.List<String> domains) {
            String domainsShrink = shrink(domains, "Domains", "json");
            this.putQueryParameter("Domains", domainsShrink);
            this.domains = domains;
            return this;
        }

        @Override
        public RefreshResolveCacheRequest build() {
            return new RefreshResolveCacheRequest(this);
        } 

    } 

}
