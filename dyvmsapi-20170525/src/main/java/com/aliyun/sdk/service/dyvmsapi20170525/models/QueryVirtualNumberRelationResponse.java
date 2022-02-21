// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVirtualNumberRelationResponse} extends {@link TeaModel}
 *
 * <p>QueryVirtualNumberRelationResponse</p>
 */
public class QueryVirtualNumberRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryVirtualNumberRelationResponseBody body;

    private QueryVirtualNumberRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryVirtualNumberRelationResponse create() {
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
    public QueryVirtualNumberRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryVirtualNumberRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryVirtualNumberRelationResponseBody body);

        @Override
        QueryVirtualNumberRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryVirtualNumberRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryVirtualNumberRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryVirtualNumberRelationResponse response) {
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
        public Builder body(QueryVirtualNumberRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryVirtualNumberRelationResponse build() {
            return new QueryVirtualNumberRelationResponse(this);
        } 

    } 

}
