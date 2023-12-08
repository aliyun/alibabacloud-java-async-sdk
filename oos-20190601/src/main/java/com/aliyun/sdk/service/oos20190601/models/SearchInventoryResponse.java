// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchInventoryResponse} extends {@link TeaModel}
 *
 * <p>SearchInventoryResponse</p>
 */
public class SearchInventoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchInventoryResponseBody body;

    private SearchInventoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchInventoryResponse create() {
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
    public SearchInventoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchInventoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchInventoryResponseBody body);

        @Override
        SearchInventoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchInventoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchInventoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchInventoryResponse response) {
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
        public Builder body(SearchInventoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchInventoryResponse build() {
            return new SearchInventoryResponse(this);
        } 

    } 

}
