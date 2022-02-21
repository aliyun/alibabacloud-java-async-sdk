// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPrivatePoolResponse} extends {@link TeaModel}
 *
 * <p>ModifyPrivatePoolResponse</p>
 */
public class ModifyPrivatePoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPrivatePoolResponseBody body;

    private ModifyPrivatePoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPrivatePoolResponse create() {
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
    public ModifyPrivatePoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPrivatePoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPrivatePoolResponseBody body);

        @Override
        ModifyPrivatePoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPrivatePoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPrivatePoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPrivatePoolResponse response) {
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
        public Builder body(ModifyPrivatePoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPrivatePoolResponse build() {
            return new ModifyPrivatePoolResponse(this);
        } 

    } 

}
