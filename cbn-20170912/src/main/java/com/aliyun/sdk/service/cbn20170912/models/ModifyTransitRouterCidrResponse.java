// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTransitRouterCidrResponse} extends {@link TeaModel}
 *
 * <p>ModifyTransitRouterCidrResponse</p>
 */
public class ModifyTransitRouterCidrResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyTransitRouterCidrResponseBody body;

    private ModifyTransitRouterCidrResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyTransitRouterCidrResponse create() {
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
    public ModifyTransitRouterCidrResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyTransitRouterCidrResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyTransitRouterCidrResponseBody body);

        @Override
        ModifyTransitRouterCidrResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyTransitRouterCidrResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyTransitRouterCidrResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyTransitRouterCidrResponse response) {
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
        public Builder body(ModifyTransitRouterCidrResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyTransitRouterCidrResponse build() {
            return new ModifyTransitRouterCidrResponse(this);
        } 

    } 

}
