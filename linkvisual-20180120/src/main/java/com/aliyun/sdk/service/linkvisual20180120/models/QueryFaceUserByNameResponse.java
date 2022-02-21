// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceUserByNameResponse} extends {@link TeaModel}
 *
 * <p>QueryFaceUserByNameResponse</p>
 */
public class QueryFaceUserByNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryFaceUserByNameResponseBody body;

    private QueryFaceUserByNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryFaceUserByNameResponse create() {
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
    public QueryFaceUserByNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryFaceUserByNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryFaceUserByNameResponseBody body);

        @Override
        QueryFaceUserByNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryFaceUserByNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryFaceUserByNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryFaceUserByNameResponse response) {
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
        public Builder body(QueryFaceUserByNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryFaceUserByNameResponse build() {
            return new QueryFaceUserByNameResponse(this);
        } 

    } 

}
