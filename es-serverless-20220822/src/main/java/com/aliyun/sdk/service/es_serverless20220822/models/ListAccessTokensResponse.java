// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessTokensResponse} extends {@link TeaModel}
 *
 * <p>ListAccessTokensResponse</p>
 */
public class ListAccessTokensResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAccessTokensResponseBody body;

    private ListAccessTokensResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAccessTokensResponse create() {
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
    public ListAccessTokensResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAccessTokensResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAccessTokensResponseBody body);

        @Override
        ListAccessTokensResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAccessTokensResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAccessTokensResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAccessTokensResponse response) {
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
        public Builder body(ListAccessTokensResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAccessTokensResponse build() {
            return new ListAccessTokensResponse(this);
        } 

    } 

}
