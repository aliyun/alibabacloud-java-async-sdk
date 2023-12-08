// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserDocumentResponse} extends {@link TeaModel}
 *
 * <p>QueryUserDocumentResponse</p>
 */
public class QueryUserDocumentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryUserDocumentResponseBody body;

    private QueryUserDocumentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryUserDocumentResponse create() {
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
    public QueryUserDocumentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryUserDocumentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryUserDocumentResponseBody body);

        @Override
        QueryUserDocumentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryUserDocumentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryUserDocumentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryUserDocumentResponse response) {
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
        public Builder body(QueryUserDocumentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryUserDocumentResponse build() {
            return new QueryUserDocumentResponse(this);
        } 

    } 

}
