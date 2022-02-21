// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDbProxyInstanceSslResponse} extends {@link TeaModel}
 *
 * <p>ModifyDbProxyInstanceSslResponse</p>
 */
public class ModifyDbProxyInstanceSslResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDbProxyInstanceSslResponseBody body;

    private ModifyDbProxyInstanceSslResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDbProxyInstanceSslResponse create() {
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
    public ModifyDbProxyInstanceSslResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDbProxyInstanceSslResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDbProxyInstanceSslResponseBody body);

        @Override
        ModifyDbProxyInstanceSslResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDbProxyInstanceSslResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDbProxyInstanceSslResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDbProxyInstanceSslResponse response) {
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
        public Builder body(ModifyDbProxyInstanceSslResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDbProxyInstanceSslResponse build() {
            return new ModifyDbProxyInstanceSslResponse(this);
        } 

    } 

}
