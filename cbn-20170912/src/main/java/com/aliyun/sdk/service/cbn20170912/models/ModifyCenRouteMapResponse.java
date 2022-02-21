// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCenRouteMapResponse} extends {@link TeaModel}
 *
 * <p>ModifyCenRouteMapResponse</p>
 */
public class ModifyCenRouteMapResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCenRouteMapResponseBody body;

    private ModifyCenRouteMapResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCenRouteMapResponse create() {
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
    public ModifyCenRouteMapResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCenRouteMapResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCenRouteMapResponseBody body);

        @Override
        ModifyCenRouteMapResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCenRouteMapResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCenRouteMapResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCenRouteMapResponse response) {
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
        public Builder body(ModifyCenRouteMapResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCenRouteMapResponse build() {
            return new ModifyCenRouteMapResponse(this);
        } 

    } 

}
