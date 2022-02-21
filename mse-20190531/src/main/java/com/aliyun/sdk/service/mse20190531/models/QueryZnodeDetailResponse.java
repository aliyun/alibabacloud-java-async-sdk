// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryZnodeDetailResponse} extends {@link TeaModel}
 *
 * <p>QueryZnodeDetailResponse</p>
 */
public class QueryZnodeDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryZnodeDetailResponseBody body;

    private QueryZnodeDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryZnodeDetailResponse create() {
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
    public QueryZnodeDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryZnodeDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryZnodeDetailResponseBody body);

        @Override
        QueryZnodeDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryZnodeDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryZnodeDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryZnodeDetailResponse response) {
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
        public Builder body(QueryZnodeDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryZnodeDetailResponse build() {
            return new QueryZnodeDetailResponse(this);
        } 

    } 

}
