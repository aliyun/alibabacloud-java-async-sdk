// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBProxyInstanceResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBProxyInstanceResponse</p>
 */
public class ModifyDBProxyInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBProxyInstanceResponseBody body;

    private ModifyDBProxyInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBProxyInstanceResponse create() {
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
    public ModifyDBProxyInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBProxyInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBProxyInstanceResponseBody body);

        @Override
        ModifyDBProxyInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBProxyInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBProxyInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBProxyInstanceResponse response) {
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
        public Builder body(ModifyDBProxyInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBProxyInstanceResponse build() {
            return new ModifyDBProxyInstanceResponse(this);
        } 

    } 

}
