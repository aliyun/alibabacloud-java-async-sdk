// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductsResponse} extends {@link TeaModel}
 *
 * <p>ListProductsResponse</p>
 */
public class ListProductsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProductsResponseBody body;

    private ListProductsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProductsResponse create() {
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
    public ListProductsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProductsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProductsResponseBody body);

        @Override
        ListProductsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProductsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProductsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProductsResponse response) {
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
        public Builder body(ListProductsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProductsResponse build() {
            return new ListProductsResponse(this);
        } 

    } 

}
