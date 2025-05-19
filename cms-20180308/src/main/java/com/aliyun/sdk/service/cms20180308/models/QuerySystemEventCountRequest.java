// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link QuerySystemEventCountRequest} extends {@link RequestModel}
 *
 * <p>QuerySystemEventCountRequest</p>
 */
public class QuerySystemEventCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryJson")
    private String queryJson;

    private QuerySystemEventCountRequest(Builder builder) {
        super(builder);
        this.queryJson = builder.queryJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySystemEventCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryJson
     */
    public String getQueryJson() {
        return this.queryJson;
    }

    public static final class Builder extends Request.Builder<QuerySystemEventCountRequest, Builder> {
        private String queryJson; 

        private Builder() {
            super();
        } 

        private Builder(QuerySystemEventCountRequest request) {
            super(request);
            this.queryJson = request.queryJson;
        } 

        /**
         * QueryJson.
         */
        public Builder queryJson(String queryJson) {
            this.putQueryParameter("QueryJson", queryJson);
            this.queryJson = queryJson;
            return this;
        }

        @Override
        public QuerySystemEventCountRequest build() {
            return new QuerySystemEventCountRequest(this);
        } 

    } 

}
