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
 * {@link QueryAttractionsRequest} extends {@link RequestModel}
 *
 * <p>QueryAttractionsRequest</p>
 */
public class QueryAttractionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private AgentBaseQuery body;

    private QueryAttractionsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAttractionsRequest create() {
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

    public static final class Builder extends Request.Builder<QueryAttractionsRequest, Builder> {
        private AgentBaseQuery body; 

        private Builder() {
            super();
        } 

        private Builder(QueryAttractionsRequest request) {
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
        public QueryAttractionsRequest build() {
            return new QueryAttractionsRequest(this);
        } 

    } 

}
