// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryEmbeddedInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryEmbeddedInfoRequest</p>
 */
public class QueryEmbeddedInfoRequest extends Request {
    private QueryEmbeddedInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEmbeddedInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryEmbeddedInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryEmbeddedInfoRequest request) {
            super(request);
        } 

        @Override
        public QueryEmbeddedInfoRequest build() {
            return new QueryEmbeddedInfoRequest(this);
        } 

    } 

}
