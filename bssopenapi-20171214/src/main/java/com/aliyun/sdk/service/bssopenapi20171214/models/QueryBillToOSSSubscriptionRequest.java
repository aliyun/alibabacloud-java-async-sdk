// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QueryBillToOSSSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>QueryBillToOSSSubscriptionRequest</p>
 */
public class QueryBillToOSSSubscriptionRequest extends Request {
    private QueryBillToOSSSubscriptionRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBillToOSSSubscriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryBillToOSSSubscriptionRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryBillToOSSSubscriptionRequest request) {
            super(request);
        } 

        @Override
        public QueryBillToOSSSubscriptionRequest build() {
            return new QueryBillToOSSSubscriptionRequest(this);
        } 

    } 

}
