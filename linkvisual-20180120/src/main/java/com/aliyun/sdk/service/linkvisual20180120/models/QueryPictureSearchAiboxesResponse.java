// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPictureSearchAiboxesResponse} extends {@link TeaModel}
 *
 * <p>QueryPictureSearchAiboxesResponse</p>
 */
public class QueryPictureSearchAiboxesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPictureSearchAiboxesResponseBody body;

    private QueryPictureSearchAiboxesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPictureSearchAiboxesResponse create() {
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
    public QueryPictureSearchAiboxesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPictureSearchAiboxesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPictureSearchAiboxesResponseBody body);

        @Override
        QueryPictureSearchAiboxesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPictureSearchAiboxesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPictureSearchAiboxesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPictureSearchAiboxesResponse response) {
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
        public Builder body(QueryPictureSearchAiboxesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPictureSearchAiboxesResponse build() {
            return new QueryPictureSearchAiboxesResponse(this);
        } 

    } 

}
