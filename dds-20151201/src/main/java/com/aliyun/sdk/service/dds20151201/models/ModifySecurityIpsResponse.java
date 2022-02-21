// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityIpsResponse} extends {@link TeaModel}
 *
 * <p>ModifySecurityIpsResponse</p>
 */
public class ModifySecurityIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySecurityIpsResponseBody body;

    private ModifySecurityIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySecurityIpsResponse create() {
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
    public ModifySecurityIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySecurityIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySecurityIpsResponseBody body);

        @Override
        ModifySecurityIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySecurityIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySecurityIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySecurityIpsResponse response) {
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
        public Builder body(ModifySecurityIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySecurityIpsResponse build() {
            return new ModifySecurityIpsResponse(this);
        } 

    } 

}
