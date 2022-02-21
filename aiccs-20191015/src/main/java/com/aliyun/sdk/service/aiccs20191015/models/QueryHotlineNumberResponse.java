// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryHotlineNumberResponse} extends {@link TeaModel}
 *
 * <p>QueryHotlineNumberResponse</p>
 */
public class QueryHotlineNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryHotlineNumberResponseBody body;

    private QueryHotlineNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryHotlineNumberResponse create() {
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
    public QueryHotlineNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryHotlineNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryHotlineNumberResponseBody body);

        @Override
        QueryHotlineNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryHotlineNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryHotlineNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryHotlineNumberResponse response) {
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
        public Builder body(QueryHotlineNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryHotlineNumberResponse build() {
            return new QueryHotlineNumberResponse(this);
        } 

    } 

}
