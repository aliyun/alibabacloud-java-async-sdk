// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMailAddressResponse} extends {@link TeaModel}
 *
 * <p>ModifyMailAddressResponse</p>
 */
public class ModifyMailAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMailAddressResponseBody body;

    private ModifyMailAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMailAddressResponse create() {
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
    public ModifyMailAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMailAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMailAddressResponseBody body);

        @Override
        ModifyMailAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMailAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMailAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMailAddressResponse response) {
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
        public Builder body(ModifyMailAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMailAddressResponse build() {
            return new ModifyMailAddressResponse(this);
        } 

    } 

}
