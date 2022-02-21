// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySubsIdResponse} extends {@link TeaModel}
 *
 * <p>QuerySubsIdResponse</p>
 */
public class QuerySubsIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySubsIdResponseBody body;

    private QuerySubsIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySubsIdResponse create() {
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
    public QuerySubsIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySubsIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySubsIdResponseBody body);

        @Override
        QuerySubsIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySubsIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySubsIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySubsIdResponse response) {
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
        public Builder body(QuerySubsIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySubsIdResponse build() {
            return new QuerySubsIdResponse(this);
        } 

    } 

}
