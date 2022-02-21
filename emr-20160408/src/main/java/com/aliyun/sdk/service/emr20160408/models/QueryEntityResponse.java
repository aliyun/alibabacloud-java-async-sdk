// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEntityResponse} extends {@link TeaModel}
 *
 * <p>QueryEntityResponse</p>
 */
public class QueryEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEntityResponseBody body;

    private QueryEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEntityResponse create() {
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
    public QueryEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEntityResponseBody body);

        @Override
        QueryEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEntityResponse response) {
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
        public Builder body(QueryEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEntityResponse build() {
            return new QueryEntityResponse(this);
        } 

    } 

}
