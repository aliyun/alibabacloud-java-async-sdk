// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateAccessApplicationsForDynamicRouteResponse} extends {@link TeaModel}
 *
 * <p>ListPrivateAccessApplicationsForDynamicRouteResponse</p>
 */
public class ListPrivateAccessApplicationsForDynamicRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPrivateAccessApplicationsForDynamicRouteResponseBody body;

    private ListPrivateAccessApplicationsForDynamicRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPrivateAccessApplicationsForDynamicRouteResponse create() {
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
    public ListPrivateAccessApplicationsForDynamicRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPrivateAccessApplicationsForDynamicRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPrivateAccessApplicationsForDynamicRouteResponseBody body);

        @Override
        ListPrivateAccessApplicationsForDynamicRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPrivateAccessApplicationsForDynamicRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPrivateAccessApplicationsForDynamicRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPrivateAccessApplicationsForDynamicRouteResponse response) {
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
        public Builder body(ListPrivateAccessApplicationsForDynamicRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPrivateAccessApplicationsForDynamicRouteResponse build() {
            return new ListPrivateAccessApplicationsForDynamicRouteResponse(this);
        } 

    } 

}
