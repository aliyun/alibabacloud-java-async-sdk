// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVideoTaskInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryVideoTaskInfoResponse</p>
 */
public class QueryVideoTaskInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryVideoTaskInfoResponseBody body;

    private QueryVideoTaskInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryVideoTaskInfoResponse create() {
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
    public QueryVideoTaskInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryVideoTaskInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryVideoTaskInfoResponseBody body);

        @Override
        QueryVideoTaskInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryVideoTaskInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryVideoTaskInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryVideoTaskInfoResponse response) {
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
        public Builder body(QueryVideoTaskInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryVideoTaskInfoResponse build() {
            return new QueryVideoTaskInfoResponse(this);
        } 

    } 

}
