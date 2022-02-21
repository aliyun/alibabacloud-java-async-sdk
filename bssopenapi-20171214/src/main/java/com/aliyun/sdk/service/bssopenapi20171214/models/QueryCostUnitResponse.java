// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCostUnitResponse} extends {@link TeaModel}
 *
 * <p>QueryCostUnitResponse</p>
 */
public class QueryCostUnitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCostUnitResponseBody body;

    private QueryCostUnitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCostUnitResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public QueryCostUnitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCostUnitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCostUnitResponseBody body);

        @Override
        QueryCostUnitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCostUnitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCostUnitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCostUnitResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(QueryCostUnitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCostUnitResponse build() {
            return new QueryCostUnitResponse(this);
        } 

    } 

}
