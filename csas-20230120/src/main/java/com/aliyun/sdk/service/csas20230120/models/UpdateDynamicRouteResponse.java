// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDynamicRouteResponse} extends {@link TeaModel}
 *
 * <p>UpdateDynamicRouteResponse</p>
 */
public class UpdateDynamicRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDynamicRouteResponseBody body;

    private UpdateDynamicRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDynamicRouteResponse create() {
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
    public UpdateDynamicRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDynamicRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDynamicRouteResponseBody body);

        @Override
        UpdateDynamicRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDynamicRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDynamicRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDynamicRouteResponse response) {
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
        public Builder body(UpdateDynamicRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDynamicRouteResponse build() {
            return new UpdateDynamicRouteResponse(this);
        } 

    } 

}
