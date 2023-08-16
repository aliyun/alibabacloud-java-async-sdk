// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBookingDomainInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryBookingDomainInfoRequest</p>
 */
public class QueryBookingDomainInfoRequest extends Request {
    @Body
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    private QueryBookingDomainInfoRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBookingDomainInfoRequest create() {
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

    public static final class Builder extends Request.Builder<QueryBookingDomainInfoRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(QueryBookingDomainInfoRequest request) {
            super(request);
            this.domainName = request.domainName;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public QueryBookingDomainInfoRequest build() {
            return new QueryBookingDomainInfoRequest(this);
        } 

    } 

}
