// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCallDetailByCallIdResponse} extends {@link TeaModel}
 *
 * <p>QueryCallDetailByCallIdResponse</p>
 */
public class QueryCallDetailByCallIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCallDetailByCallIdResponseBody body;

    private QueryCallDetailByCallIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCallDetailByCallIdResponse create() {
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
    public QueryCallDetailByCallIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCallDetailByCallIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCallDetailByCallIdResponseBody body);

        @Override
        QueryCallDetailByCallIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCallDetailByCallIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCallDetailByCallIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCallDetailByCallIdResponse response) {
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
        public Builder body(QueryCallDetailByCallIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCallDetailByCallIdResponse build() {
            return new QueryCallDetailByCallIdResponse(this);
        } 

    } 

}
