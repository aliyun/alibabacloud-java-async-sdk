// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link QueryPurchasedServiceRequest} extends {@link RequestModel}
 *
 * <p>QueryPurchasedServiceRequest</p>
 */
public class QueryPurchasedServiceRequest extends Request {
    private QueryPurchasedServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPurchasedServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryPurchasedServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryPurchasedServiceRequest request) {
            super(request);
        } 

        @Override
        public QueryPurchasedServiceRequest build() {
            return new QueryPurchasedServiceRequest(this);
        } 

    } 

}
