// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDynamicRouteRegionsResponse} extends {@link TeaModel}
 *
 * <p>ListDynamicRouteRegionsResponse</p>
 */
public class ListDynamicRouteRegionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDynamicRouteRegionsResponseBody body;

    private ListDynamicRouteRegionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDynamicRouteRegionsResponse create() {
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
    public ListDynamicRouteRegionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDynamicRouteRegionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDynamicRouteRegionsResponseBody body);

        @Override
        ListDynamicRouteRegionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDynamicRouteRegionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDynamicRouteRegionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDynamicRouteRegionsResponse response) {
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
        public Builder body(ListDynamicRouteRegionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDynamicRouteRegionsResponse build() {
            return new ListDynamicRouteRegionsResponse(this);
        } 

    } 

}
