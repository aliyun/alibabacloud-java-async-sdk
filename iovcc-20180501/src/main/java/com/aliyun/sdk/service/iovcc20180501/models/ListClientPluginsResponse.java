// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientPluginsResponse} extends {@link TeaModel}
 *
 * <p>ListClientPluginsResponse</p>
 */
public class ListClientPluginsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClientPluginsResponseBody body;

    private ListClientPluginsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClientPluginsResponse create() {
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
    public ListClientPluginsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClientPluginsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClientPluginsResponseBody body);

        @Override
        ListClientPluginsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClientPluginsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClientPluginsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClientPluginsResponse response) {
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
        public Builder body(ListClientPluginsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClientPluginsResponse build() {
            return new ListClientPluginsResponse(this);
        } 

    } 

}
