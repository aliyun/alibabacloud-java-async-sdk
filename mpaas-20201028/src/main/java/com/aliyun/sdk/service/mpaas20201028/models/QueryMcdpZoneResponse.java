// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMcdpZoneResponse} extends {@link TeaModel}
 *
 * <p>QueryMcdpZoneResponse</p>
 */
public class QueryMcdpZoneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMcdpZoneResponseBody body;

    private QueryMcdpZoneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMcdpZoneResponse create() {
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
    public QueryMcdpZoneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMcdpZoneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMcdpZoneResponseBody body);

        @Override
        QueryMcdpZoneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMcdpZoneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMcdpZoneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMcdpZoneResponse response) {
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
        public Builder body(QueryMcdpZoneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMcdpZoneResponse build() {
            return new QueryMcdpZoneResponse(this);
        } 

    } 

}
