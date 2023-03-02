// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInstanceResponse} extends {@link TeaModel}
 *
 * <p>QueryInstanceResponse</p>
 */
public class QueryInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryInstanceResponseBody body;

    private QueryInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryInstanceResponse create() {
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
    public QueryInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryInstanceResponseBody body);

        @Override
        QueryInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryInstanceResponse response) {
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
        public Builder body(QueryInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryInstanceResponse build() {
            return new QueryInstanceResponse(this);
        } 

    } 

}
