// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGroupIdByGroupNameResponse} extends {@link TeaModel}
 *
 * <p>QueryGroupIdByGroupNameResponse</p>
 */
public class QueryGroupIdByGroupNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryGroupIdByGroupNameResponseBody body;

    private QueryGroupIdByGroupNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryGroupIdByGroupNameResponse create() {
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
    public QueryGroupIdByGroupNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryGroupIdByGroupNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryGroupIdByGroupNameResponseBody body);

        @Override
        QueryGroupIdByGroupNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryGroupIdByGroupNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryGroupIdByGroupNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryGroupIdByGroupNameResponse response) {
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
        public Builder body(QueryGroupIdByGroupNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryGroupIdByGroupNameResponse build() {
            return new QueryGroupIdByGroupNameResponse(this);
        } 

    } 

}
