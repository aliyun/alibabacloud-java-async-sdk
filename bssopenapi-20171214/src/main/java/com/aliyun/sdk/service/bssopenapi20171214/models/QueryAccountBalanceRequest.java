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
 * {@link QueryAccountBalanceRequest} extends {@link RequestModel}
 *
 * <p>QueryAccountBalanceRequest</p>
 */
public class QueryAccountBalanceRequest extends Request {
    private QueryAccountBalanceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountBalanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryAccountBalanceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryAccountBalanceRequest request) {
            super(request);
        } 

        @Override
        public QueryAccountBalanceRequest build() {
            return new QueryAccountBalanceRequest(this);
        } 

    } 

}
