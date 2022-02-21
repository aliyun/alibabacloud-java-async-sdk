// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPluginsResponse} extends {@link TeaModel}
 *
 * <p>ListPluginsResponse</p>
 */
public class ListPluginsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPluginsResponseBody body;

    private ListPluginsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPluginsResponse create() {
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
    public ListPluginsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPluginsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPluginsResponseBody body);

        @Override
        ListPluginsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPluginsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPluginsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPluginsResponse response) {
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
        public Builder body(ListPluginsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPluginsResponse build() {
            return new ListPluginsResponse(this);
        } 

    } 

}
