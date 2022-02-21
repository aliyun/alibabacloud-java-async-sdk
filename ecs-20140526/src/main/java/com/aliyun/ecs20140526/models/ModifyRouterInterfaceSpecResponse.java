// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRouterInterfaceSpecResponse} extends {@link TeaModel}
 *
 * <p>ModifyRouterInterfaceSpecResponse</p>
 */
public class ModifyRouterInterfaceSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyRouterInterfaceSpecResponseBody body;

    private ModifyRouterInterfaceSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyRouterInterfaceSpecResponse create() {
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
    public ModifyRouterInterfaceSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyRouterInterfaceSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyRouterInterfaceSpecResponseBody body);

        @Override
        ModifyRouterInterfaceSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyRouterInterfaceSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyRouterInterfaceSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyRouterInterfaceSpecResponse response) {
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
        public Builder body(ModifyRouterInterfaceSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyRouterInterfaceSpecResponse build() {
            return new ModifyRouterInterfaceSpecResponse(this);
        } 

    } 

}
