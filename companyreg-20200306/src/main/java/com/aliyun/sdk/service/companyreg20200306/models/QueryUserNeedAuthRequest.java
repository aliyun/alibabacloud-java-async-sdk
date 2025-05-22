// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link QueryUserNeedAuthRequest} extends {@link RequestModel}
 *
 * <p>QueryUserNeedAuthRequest</p>
 */
public class QueryUserNeedAuthRequest extends Request {
    private QueryUserNeedAuthRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserNeedAuthRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryUserNeedAuthRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryUserNeedAuthRequest request) {
            super(request);
        } 

        @Override
        public QueryUserNeedAuthRequest build() {
            return new QueryUserNeedAuthRequest(this);
        } 

    } 

}
