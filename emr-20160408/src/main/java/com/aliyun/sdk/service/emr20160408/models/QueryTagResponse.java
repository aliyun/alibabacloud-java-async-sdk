// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTagResponse} extends {@link TeaModel}
 *
 * <p>QueryTagResponse</p>
 */
public class QueryTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTagResponseBody body;

    private QueryTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTagResponse create() {
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
    public QueryTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTagResponseBody body);

        @Override
        QueryTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTagResponse response) {
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
        public Builder body(QueryTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTagResponse build() {
            return new QueryTagResponse(this);
        } 

    } 

}
