// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCallDetailByTaskIdResponse} extends {@link TeaModel}
 *
 * <p>QueryCallDetailByTaskIdResponse</p>
 */
public class QueryCallDetailByTaskIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCallDetailByTaskIdResponseBody body;

    private QueryCallDetailByTaskIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCallDetailByTaskIdResponse create() {
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
    public QueryCallDetailByTaskIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCallDetailByTaskIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCallDetailByTaskIdResponseBody body);

        @Override
        QueryCallDetailByTaskIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCallDetailByTaskIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCallDetailByTaskIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCallDetailByTaskIdResponse response) {
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
        public Builder body(QueryCallDetailByTaskIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCallDetailByTaskIdResponse build() {
            return new QueryCallDetailByTaskIdResponse(this);
        } 

    } 

}
