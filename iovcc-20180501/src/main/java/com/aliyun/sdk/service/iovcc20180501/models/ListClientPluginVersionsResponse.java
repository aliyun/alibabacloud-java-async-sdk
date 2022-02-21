// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientPluginVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListClientPluginVersionsResponse</p>
 */
public class ListClientPluginVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClientPluginVersionsResponseBody body;

    private ListClientPluginVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClientPluginVersionsResponse create() {
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
    public ListClientPluginVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClientPluginVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClientPluginVersionsResponseBody body);

        @Override
        ListClientPluginVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClientPluginVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClientPluginVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClientPluginVersionsResponse response) {
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
        public Builder body(ListClientPluginVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClientPluginVersionsResponse build() {
            return new ListClientPluginVersionsResponse(this);
        } 

    } 

}
