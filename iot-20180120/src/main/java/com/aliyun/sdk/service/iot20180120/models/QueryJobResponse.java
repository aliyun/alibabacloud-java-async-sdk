// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryJobResponse} extends {@link TeaModel}
 *
 * <p>QueryJobResponse</p>
 */
public class QueryJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryJobResponseBody body;

    private QueryJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryJobResponse create() {
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
    public QueryJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryJobResponseBody body);

        @Override
        QueryJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryJobResponse response) {
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
        public Builder body(QueryJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryJobResponse build() {
            return new QueryJobResponse(this);
        } 

    } 

}
