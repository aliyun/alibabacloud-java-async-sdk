// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryResourceResponse} extends {@link TeaModel}
 *
 * <p>QueryResourceResponse</p>
 */
public class QueryResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryResourceResponseBody body;

    private QueryResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryResourceResponse create() {
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
    public QueryResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryResourceResponseBody body);

        @Override
        QueryResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryResourceResponse response) {
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
        public Builder body(QueryResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryResourceResponse build() {
            return new QueryResourceResponse(this);
        } 

    } 

}
