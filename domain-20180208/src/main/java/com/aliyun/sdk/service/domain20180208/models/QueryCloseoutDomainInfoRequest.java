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
 * {@link QueryCloseoutDomainInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryCloseoutDomainInfoRequest</p>
 */
public class QueryCloseoutDomainInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    private QueryCloseoutDomainInfoRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCloseoutDomainInfoRequest create() {
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

    public static final class Builder extends Request.Builder<QueryCloseoutDomainInfoRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(QueryCloseoutDomainInfoRequest request) {
            super(request);
            this.domainName = request.domainName;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public QueryCloseoutDomainInfoRequest build() {
            return new QueryCloseoutDomainInfoRequest(this);
        } 

    } 

}
