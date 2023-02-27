// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigItemsResponse} extends {@link TeaModel}
 *
 * <p>ListConfigItemsResponse</p>
 */
public class ListConfigItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConfigItemsResponseBody body;

    private ListConfigItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConfigItemsResponse create() {
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
    public ListConfigItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConfigItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConfigItemsResponseBody body);

        @Override
        ListConfigItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConfigItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConfigItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConfigItemsResponse response) {
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
        public Builder body(ListConfigItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConfigItemsResponse build() {
            return new ListConfigItemsResponse(this);
        } 

    } 

}
