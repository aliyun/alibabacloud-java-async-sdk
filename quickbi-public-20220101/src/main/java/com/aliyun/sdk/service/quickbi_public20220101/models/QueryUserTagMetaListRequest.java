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
 * {@link QueryUserTagMetaListRequest} extends {@link RequestModel}
 *
 * <p>QueryUserTagMetaListRequest</p>
 */
public class QueryUserTagMetaListRequest extends Request {
    private QueryUserTagMetaListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserTagMetaListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryUserTagMetaListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryUserTagMetaListRequest request) {
            super(request);
        } 

        @Override
        public QueryUserTagMetaListRequest build() {
            return new QueryUserTagMetaListRequest(this);
        } 

    } 

}
