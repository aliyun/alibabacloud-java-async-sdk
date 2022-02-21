// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShadowSchemasResponse} extends {@link TeaModel}
 *
 * <p>ListShadowSchemasResponse</p>
 */
public class ListShadowSchemasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListShadowSchemasResponseBody body;

    private ListShadowSchemasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListShadowSchemasResponse create() {
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
    public ListShadowSchemasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListShadowSchemasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListShadowSchemasResponseBody body);

        @Override
        ListShadowSchemasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListShadowSchemasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListShadowSchemasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListShadowSchemasResponse response) {
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
        public Builder body(ListShadowSchemasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListShadowSchemasResponse build() {
            return new ListShadowSchemasResponse(this);
        } 

    } 

}
