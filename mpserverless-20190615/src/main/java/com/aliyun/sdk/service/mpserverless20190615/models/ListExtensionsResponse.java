// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExtensionsResponse} extends {@link TeaModel}
 *
 * <p>ListExtensionsResponse</p>
 */
public class ListExtensionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListExtensionsResponseBody body;

    private ListExtensionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListExtensionsResponse create() {
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
    public ListExtensionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListExtensionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListExtensionsResponseBody body);

        @Override
        ListExtensionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListExtensionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListExtensionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListExtensionsResponse response) {
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
        public Builder body(ListExtensionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListExtensionsResponse build() {
            return new ListExtensionsResponse(this);
        } 

    } 

}
