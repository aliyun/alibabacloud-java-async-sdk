// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

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
 * {@link QueryRestaurantsRequest} extends {@link RequestModel}
 *
 * <p>QueryRestaurantsRequest</p>
 */
public class QueryRestaurantsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private AgentBaseQuery body;

    private QueryRestaurantsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRestaurantsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public AgentBaseQuery getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<QueryRestaurantsRequest, Builder> {
        private AgentBaseQuery body; 

        private Builder() {
            super();
        } 

        private Builder(QueryRestaurantsRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(AgentBaseQuery body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public QueryRestaurantsRequest build() {
            return new QueryRestaurantsRequest(this);
        } 

    } 

}
