// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTraceMuResponse} extends {@link TeaModel}
 *
 * <p>QueryTraceMuResponse</p>
 */
public class QueryTraceMuResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTraceMuResponseBody body;

    private QueryTraceMuResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTraceMuResponse create() {
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
    public QueryTraceMuResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTraceMuResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTraceMuResponseBody body);

        @Override
        QueryTraceMuResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTraceMuResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTraceMuResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTraceMuResponse response) {
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
        public Builder body(QueryTraceMuResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTraceMuResponse build() {
            return new QueryTraceMuResponse(this);
        } 

    } 

}
