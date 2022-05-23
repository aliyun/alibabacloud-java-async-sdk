// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amp20220221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryByIdResponse} extends {@link TeaModel}
 *
 * <p>QueryByIdResponse</p>
 */
public class QueryByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryByIdResponseBody body;

    private QueryByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryByIdResponse create() {
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
    public QueryByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryByIdResponseBody body);

        @Override
        QueryByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryByIdResponse response) {
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
        public Builder body(QueryByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryByIdResponse build() {
            return new QueryByIdResponse(this);
        } 

    } 

}
