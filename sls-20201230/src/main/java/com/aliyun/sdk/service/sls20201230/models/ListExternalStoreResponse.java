// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListExternalStoreResponse} extends {@link TeaModel}
 *
 * <p>ListExternalStoreResponse</p>
 */
public class ListExternalStoreResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListExternalStoreResponseBody body;

    private ListExternalStoreResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListExternalStoreResponse create() {
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
    public ListExternalStoreResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListExternalStoreResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListExternalStoreResponseBody body);

        @Override
        ListExternalStoreResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListExternalStoreResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListExternalStoreResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListExternalStoreResponse response) {
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
        public Builder body(ListExternalStoreResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListExternalStoreResponse build() {
            return new ListExternalStoreResponse(this);
        } 

    } 

}
