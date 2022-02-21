// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogstashPluginsResponse} extends {@link TeaModel}
 *
 * <p>ListLogstashPluginsResponse</p>
 */
public class ListLogstashPluginsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLogstashPluginsResponseBody body;

    private ListLogstashPluginsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLogstashPluginsResponse create() {
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
    public ListLogstashPluginsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLogstashPluginsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLogstashPluginsResponseBody body);

        @Override
        ListLogstashPluginsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLogstashPluginsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLogstashPluginsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLogstashPluginsResponse response) {
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
        public Builder body(ListLogstashPluginsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLogstashPluginsResponse build() {
            return new ListLogstashPluginsResponse(this);
        } 

    } 

}
