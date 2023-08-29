// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMgsApipageResponse} extends {@link TeaModel}
 *
 * <p>QueryMgsApipageResponse</p>
 */
public class QueryMgsApipageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMgsApipageResponseBody body;

    private QueryMgsApipageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMgsApipageResponse create() {
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
    public QueryMgsApipageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMgsApipageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMgsApipageResponseBody body);

        @Override
        QueryMgsApipageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMgsApipageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMgsApipageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMgsApipageResponse response) {
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
        public Builder body(QueryMgsApipageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMgsApipageResponse build() {
            return new QueryMgsApipageResponse(this);
        } 

    } 

}
