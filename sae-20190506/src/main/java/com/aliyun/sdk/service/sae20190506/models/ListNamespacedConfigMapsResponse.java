// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNamespacedConfigMapsResponse} extends {@link TeaModel}
 *
 * <p>ListNamespacedConfigMapsResponse</p>
 */
public class ListNamespacedConfigMapsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNamespacedConfigMapsResponseBody body;

    private ListNamespacedConfigMapsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNamespacedConfigMapsResponse create() {
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
    public ListNamespacedConfigMapsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNamespacedConfigMapsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNamespacedConfigMapsResponseBody body);

        @Override
        ListNamespacedConfigMapsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNamespacedConfigMapsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNamespacedConfigMapsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNamespacedConfigMapsResponse response) {
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
        public Builder body(ListNamespacedConfigMapsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNamespacedConfigMapsResponse build() {
            return new ListNamespacedConfigMapsResponse(this);
        } 

    } 

}
