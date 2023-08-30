// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAppMetadataResponse} extends {@link TeaModel}
 *
 * <p>QueryAppMetadataResponse</p>
 */
public class QueryAppMetadataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAppMetadataResponseBody body;

    private QueryAppMetadataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAppMetadataResponse create() {
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
    public QueryAppMetadataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAppMetadataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAppMetadataResponseBody body);

        @Override
        QueryAppMetadataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAppMetadataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAppMetadataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAppMetadataResponse response) {
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
        public Builder body(QueryAppMetadataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAppMetadataResponse build() {
            return new QueryAppMetadataResponse(this);
        } 

    } 

}
