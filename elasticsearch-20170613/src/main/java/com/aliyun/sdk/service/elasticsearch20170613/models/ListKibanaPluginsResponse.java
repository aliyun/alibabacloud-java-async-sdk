// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListKibanaPluginsResponse} extends {@link TeaModel}
 *
 * <p>ListKibanaPluginsResponse</p>
 */
public class ListKibanaPluginsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListKibanaPluginsResponseBody body;

    private ListKibanaPluginsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListKibanaPluginsResponse create() {
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
    public ListKibanaPluginsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListKibanaPluginsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListKibanaPluginsResponseBody body);

        @Override
        ListKibanaPluginsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListKibanaPluginsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListKibanaPluginsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListKibanaPluginsResponse response) {
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
        public Builder body(ListKibanaPluginsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListKibanaPluginsResponse build() {
            return new ListKibanaPluginsResponse(this);
        } 

    } 

}
