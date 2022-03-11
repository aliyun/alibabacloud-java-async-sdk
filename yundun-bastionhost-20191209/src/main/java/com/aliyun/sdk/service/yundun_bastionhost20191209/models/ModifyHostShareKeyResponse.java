// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHostShareKeyResponse} extends {@link TeaModel}
 *
 * <p>ModifyHostShareKeyResponse</p>
 */
public class ModifyHostShareKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHostShareKeyResponseBody body;

    private ModifyHostShareKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHostShareKeyResponse create() {
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
    public ModifyHostShareKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHostShareKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHostShareKeyResponseBody body);

        @Override
        ModifyHostShareKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHostShareKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHostShareKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHostShareKeyResponse response) {
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
        public Builder body(ModifyHostShareKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHostShareKeyResponse build() {
            return new ModifyHostShareKeyResponse(this);
        } 

    } 

}
