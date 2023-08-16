// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateAccessTagsForDynamicRouteResponse} extends {@link TeaModel}
 *
 * <p>ListPrivateAccessTagsForDynamicRouteResponse</p>
 */
public class ListPrivateAccessTagsForDynamicRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPrivateAccessTagsForDynamicRouteResponseBody body;

    private ListPrivateAccessTagsForDynamicRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPrivateAccessTagsForDynamicRouteResponse create() {
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
    public ListPrivateAccessTagsForDynamicRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPrivateAccessTagsForDynamicRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPrivateAccessTagsForDynamicRouteResponseBody body);

        @Override
        ListPrivateAccessTagsForDynamicRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPrivateAccessTagsForDynamicRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPrivateAccessTagsForDynamicRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPrivateAccessTagsForDynamicRouteResponse response) {
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
        public Builder body(ListPrivateAccessTagsForDynamicRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPrivateAccessTagsForDynamicRouteResponse build() {
            return new ListPrivateAccessTagsForDynamicRouteResponse(this);
        } 

    } 

}
