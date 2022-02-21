// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListLogStoresResponse} extends {@link TeaModel}
 *
 * <p>ListLogStoresResponse</p>
 */
public class ListLogStoresResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLogStoresResponseBody body;

    private ListLogStoresResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLogStoresResponse create() {
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
    public ListLogStoresResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLogStoresResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLogStoresResponseBody body);

        @Override
        ListLogStoresResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLogStoresResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLogStoresResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLogStoresResponse response) {
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
        public Builder body(ListLogStoresResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLogStoresResponse build() {
            return new ListLogStoresResponse(this);
        } 

    } 

}
