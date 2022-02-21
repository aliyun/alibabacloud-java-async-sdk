// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySubscribeRelationResponse} extends {@link TeaModel}
 *
 * <p>QuerySubscribeRelationResponse</p>
 */
public class QuerySubscribeRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySubscribeRelationResponseBody body;

    private QuerySubscribeRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySubscribeRelationResponse create() {
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
    public QuerySubscribeRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySubscribeRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySubscribeRelationResponseBody body);

        @Override
        QuerySubscribeRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySubscribeRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySubscribeRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySubscribeRelationResponse response) {
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
        public Builder body(QuerySubscribeRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySubscribeRelationResponse build() {
            return new QuerySubscribeRelationResponse(this);
        } 

    } 

}
