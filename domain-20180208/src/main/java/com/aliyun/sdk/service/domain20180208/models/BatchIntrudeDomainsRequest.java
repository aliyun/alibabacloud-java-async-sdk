// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link BatchIntrudeDomainsRequest} extends {@link RequestModel}
 *
 * <p>BatchIntrudeDomainsRequest</p>
 */
public class BatchIntrudeDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    private java.util.List<String> domainNames;

    private BatchIntrudeDomainsRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchIntrudeDomainsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public java.util.List<String> getDomainNames() {
        return this.domainNames;
    }

    public static final class Builder extends Request.Builder<BatchIntrudeDomainsRequest, Builder> {
        private java.util.List<String> domainNames; 

        private Builder() {
            super();
        } 

        private Builder(BatchIntrudeDomainsRequest request) {
            super(request);
            this.domainNames = request.domainNames;
        } 

        /**
         * DomainNames.
         */
        public Builder domainNames(java.util.List<String> domainNames) {
            String domainNamesShrink = shrink(domainNames, "DomainNames", "json");
            this.putQueryParameter("DomainNames", domainNamesShrink);
            this.domainNames = domainNames;
            return this;
        }

        @Override
        public BatchIntrudeDomainsRequest build() {
            return new BatchIntrudeDomainsRequest(this);
        } 

    } 

}
