// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.et_industry_openapi20200824.models;

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
 * {@link QueryFieldLatestBySourcePointRequest} extends {@link RequestModel}
 *
 * <p>QueryFieldLatestBySourcePointRequest</p>
 */
public class QueryFieldLatestBySourcePointRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Request")
    private String request;

    private QueryFieldLatestBySourcePointRequest(Builder builder) {
        super(builder);
        this.request = builder.request;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFieldLatestBySourcePointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return request
     */
    public String getRequest() {
        return this.request;
    }

    public static final class Builder extends Request.Builder<QueryFieldLatestBySourcePointRequest, Builder> {
        private String request; 

        private Builder() {
            super();
        } 

        private Builder(QueryFieldLatestBySourcePointRequest request) {
            super(request);
            this.request = request.request;
        } 

        /**
         * Request.
         */
        public Builder request(String request) {
            this.putBodyParameter("Request", request);
            this.request = request;
            return this;
        }

        @Override
        public QueryFieldLatestBySourcePointRequest build() {
            return new QueryFieldLatestBySourcePointRequest(this);
        } 

    } 

}
