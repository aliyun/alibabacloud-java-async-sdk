// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNamespaceResponse} extends {@link TeaModel}
 *
 * <p>ListNamespaceResponse</p>
 */
public class ListNamespaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNamespaceResponseBody body;

    private ListNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNamespaceResponse create() {
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
    public ListNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNamespaceResponseBody body);

        @Override
        ListNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNamespaceResponse response) {
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
        public Builder body(ListNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNamespaceResponse build() {
            return new ListNamespaceResponse(this);
        } 

    } 

}
