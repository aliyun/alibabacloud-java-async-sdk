// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrdersRequest} extends {@link RequestModel}
 *
 * <p>QueryOrdersRequest</p>
 */
public class QueryOrdersRequest extends Request {
    @Body
    @NameInMap("body")
    @Validation(required = true)
    private OrderPageQuery body;

    private QueryOrdersRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrdersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public OrderPageQuery getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<QueryOrdersRequest, Builder> {
        private OrderPageQuery body; 

        private Builder() {
            super();
        } 

        private Builder(QueryOrdersRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(OrderPageQuery body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public QueryOrdersRequest build() {
            return new QueryOrdersRequest(this);
        } 

    } 

}
