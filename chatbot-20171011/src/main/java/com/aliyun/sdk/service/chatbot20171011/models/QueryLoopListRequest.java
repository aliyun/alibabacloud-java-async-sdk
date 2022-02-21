// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLoopListRequest} extends {@link RequestModel}
 *
 * <p>QueryLoopListRequest</p>
 */
public class QueryLoopListRequest extends Request {
    private QueryLoopListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLoopListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryLoopListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryLoopListRequest response) {
            super(response);
        } 

        @Override
        public QueryLoopListRequest build() {
            return new QueryLoopListRequest(this);
        } 

    } 

}
