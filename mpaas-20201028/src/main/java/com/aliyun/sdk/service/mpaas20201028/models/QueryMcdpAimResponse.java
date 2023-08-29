// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMcdpAimResponse} extends {@link TeaModel}
 *
 * <p>QueryMcdpAimResponse</p>
 */
public class QueryMcdpAimResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMcdpAimResponseBody body;

    private QueryMcdpAimResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMcdpAimResponse create() {
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
    public QueryMcdpAimResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMcdpAimResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMcdpAimResponseBody body);

        @Override
        QueryMcdpAimResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMcdpAimResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMcdpAimResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMcdpAimResponse response) {
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
        public Builder body(QueryMcdpAimResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMcdpAimResponse build() {
            return new QueryMcdpAimResponse(this);
        } 

    } 

}
