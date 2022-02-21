// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryArtExtensionResponse} extends {@link TeaModel}
 *
 * <p>QueryArtExtensionResponse</p>
 */
public class QueryArtExtensionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryArtExtensionResponseBody body;

    private QueryArtExtensionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryArtExtensionResponse create() {
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
    public QueryArtExtensionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryArtExtensionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryArtExtensionResponseBody body);

        @Override
        QueryArtExtensionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryArtExtensionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryArtExtensionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryArtExtensionResponse response) {
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
        public Builder body(QueryArtExtensionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryArtExtensionResponse build() {
            return new QueryArtExtensionResponse(this);
        } 

    } 

}
