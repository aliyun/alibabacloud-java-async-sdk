// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDistributedProductResponse} extends {@link TeaModel}
 *
 * <p>ListDistributedProductResponse</p>
 */
public class ListDistributedProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDistributedProductResponseBody body;

    private ListDistributedProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDistributedProductResponse create() {
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
    public ListDistributedProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDistributedProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDistributedProductResponseBody body);

        @Override
        ListDistributedProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDistributedProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDistributedProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDistributedProductResponse response) {
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
        public Builder body(ListDistributedProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDistributedProductResponse build() {
            return new ListDistributedProductResponse(this);
        } 

    } 

}
